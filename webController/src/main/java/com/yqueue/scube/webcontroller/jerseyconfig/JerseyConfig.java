/**
 * 
 */
package com.yqueue.scube.webcontroller.jerseyconfig;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.yqueue.scube.webcontroller.endpoints.DoctorsEndpoints;
import com.yqueue.scube.webcontroller.endpoints.UsersEndpoints;

/**
 * @author Naveen Kumawat
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		System.out.println("----------------HELLO WORLD----------------");
		//register("com.yqueue.webcontroller.endpoints");
		register(DoctorsEndpoints.class);
		register(UsersEndpoints.class);
		
	//	 register(new ObjectMapperContextResolver(objectMapper));
		packages("com.yqueue.webcontroller.endpoints");
	
	}
	/*@Provider
	  public static class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {
	 
	    private final ObjectMapper mapper;
	 
	    public ObjectMapperContextResolver(ObjectMapper mapper) {
	      this.mapper = mapper;
	    }
	 
	    @Override
	    public ObjectMapper getContext(Class<?> type) {
	      return mapper;
	    }
	  }*/
	
}
