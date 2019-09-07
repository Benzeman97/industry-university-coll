package com.benz.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.benz.rest.entity.Profile;
import com.benz.rest.service.ProfileService;

@Path("/prof")
public class ProfileRest {

	 ProfileService ps = new ProfileService();
	 
	  @GET
	  @Path("/profiles")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<Profile> getProfile()
	  {
		 
		   return ps.getProfiles();
	  }
	  
	  @GET
	  @Path("/profiles/{id}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Profile getProfile(@PathParam("id") long id)
	  {
		  return ps.getProfileById(id);
	  }
	  
	  @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Path("/profiles")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Profile addProfile(Profile p)
	  {
		  return ps.addProfile(p);
	  }
	  
	  @PUT
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Path("/profiles")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Profile updateProfile(Profile p)
	  {
		 return ps.updateProfile(p);
	  }
	  
	  @DELETE
	  @Path("/profiles/{id}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Profile deleteProfile(@PathParam("id") long id)
	  {
		  return ps.deleteProfile(id); 
	  }
}
