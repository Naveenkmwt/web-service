/**
 * 
 */
package com.yqueue.scube.webcontroller.endpoints;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yqueue.scube.model.ContactInfo;
import com.yqueue.scube.model.DoctorsAddress;
import com.yqueue.scube.model.DoctorsDetails;
import com.yqueue.scube.model.User;
import com.yqueue.scube.service.UserDbService;

/**
 * @author Naveen Kumawat
 *
 */
@Component
@Path("/doctor/api")
public class DoctorsEndpoints {

	@Autowired
	private UserDbService userDbService;

	@GET
	@Path("/")
	@Produces("application/json")
	public List<DoctorsDetails> getAllDoctors() {

		return userDbService.getAllDoctors();
	}

	@GET
	@Path("/getDoctorsaddress")
	@Produces("application/json")
	public List<DoctorsAddress> getAllDoctorAddress() {

		return userDbService.getAllDoctorsAddress();
	}

	@GET
	@Path("/hello")
	public String hello() {

		return "hello world";
	}

	@POST
	@Path("/saveDoctor")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveDoctor(DoctorsDetails doctorsDetails) {

		ContactInfo contact = userDbService.findByPhoneNo("9657254");
		if (contact != null) {
			doctorsDetails.setContactInfo(contact);
			userDbService.saveDoctor(doctorsDetails);
			return Response.status(200).entity("entity saved").build();
		}
		else {
			userDbService.saveDoctor(doctorsDetails);
			return Response.status(Response.Status.ACCEPTED).entity("User has been registered").build();
		}

	}

	@GET
	@Path("/city")
	@Produces("application/json")
	public List<DoctorsAddress> findDoctorByCity(@QueryParam("city") String city) {
		List<DoctorsAddress> listOfDoctors = userDbService.findDoctorByCity(city);
		return listOfDoctors;
	}

	@GET
	@Path("/state")
	@Produces("application/json")
	public List<DoctorsAddress> findDoctorByState(@QueryParam("state") String state) {
		List<DoctorsAddress> listOfDoctors = userDbService.findDoctorByState(state);
		return listOfDoctors;
	}

	@GET
	@Path("/phone")
	@Produces("application/json")
	public DoctorsDetails findDoctorByPhone(@QueryParam("phoneNo") String phoneNo) {
		DoctorsDetails doctors = userDbService.findDoctorByPhone(phoneNo);
		return doctors;
	}

	@GET
	@Path("/pin")
	@Produces("application/json")
	public List<DoctorsAddress> findDoctorByPinCode(@QueryParam("pincode") String pincode) {
		List<DoctorsAddress> listOfDoctors = userDbService.findDoctorByPinCode(pincode);
		return listOfDoctors;
	}

	@Path("/saveUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveUser(User user) {
		userDbService.saveUser(user);

		return Response.status(200).entity("user registered with this " + user.getPhone() + " number").build();
	}

	@Path("/contactInfo")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveContact(ContactInfo user) {
		userDbService.saveContact(user);

		return Response.status(200).entity("user registered").build();
	}

}
