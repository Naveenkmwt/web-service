/**
 * 
 */
package com.yqueue.scube.webcontroller.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yqueue.scube.model.User;
import com.yqueue.scube.service.UserDbService;

/**
 * @author Naveen Kumawat
 *
 */
@Path("v1/user")
@Component
public class UsersEndpoints {

	@Autowired
	private UserDbService userDbService;

	
	@Path("/saveUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveUser(User user) {
		userDbService.saveUser(user);

		return Response.status(200).entity("user registered with this " + user.getPhone() + " number").build();
	}
}
