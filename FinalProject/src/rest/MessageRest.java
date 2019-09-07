package com.benz.uni.rest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.benz.rest.entity.Message;
import com.benz.rest.service.BeanDemo;
import com.benz.rest.service.MessageService;


@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(value="application/json")
public class MessageRest {
	
	MessageService ms = new MessageService();
	
	
	@GET
      public List<Message> getMessages()
      {
    	 return ms.getMessages();
      }
	
	 
		@GET
		 @Path("/{id}")
		 public Message getMessage(@PathParam("id") long id,@Context UriInfo uriInfo)
		 {
			  String uri = uriInfo.getBaseUriBuilder().path(MessageRest.class).path(Long.toString(id)).build().toString();
			  Message msg = ms.getMessage(id);
			  String uri2 = uriInfo.getBaseUriBuilder().path(ProfileRest.class).path("profiles").path(msg.getAuthor()).build().toString();
			 String uri3 = uriInfo.getBaseUriBuilder().path(MessageRest.class).path(MessageRest.class,"rest").resolveTemplate("msgId",id).toString();
			  msg.addLink(uri,"self");
			   msg.addAuthors(uri2,"profile");
			   msg.addComments(uri3,"comments");
			   return msg;
		 }
		 
		@POST
		public Message addMessage(Message msg)
		{
			return ms.addMessage(msg);
		}
		 
		@PUT
		public Message updateMessage(Message msg)
		{
			return  ms.updateMessage(msg);
		}

		@DELETE
		@Path("/{id}")
		public Message deleteMessage(@PathParam("id") long id)
		{
			return ms.removeMessage(id);
		}
		
		/*@GET
		@Path("/{year}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Message> getMessagesByYear(@PathParam("year") int year)
		{
			if(year>0)
			return ms.getMsgByYear(year);
			
			  return ms.getMessages();
		
		}*/
		@GET
		@Path("/{start}/{size}")
		public List<Message> getAllMesgPaginated(@PathParam("start")int start,@PathParam("size")int size)
		{
			if(start>=0 && size>0)
			return ms.getAllMessgesPaginated(start,size);
			else
				return null;
		}
	
		
		@GET
		@Path("/{year}/{start}/{size}")
		public List<Message> getContext(@BeanParam BeanDemo bean)
		{
		    if(bean.getYear()>0)
		    	return ms.getMsgByYear(bean.getYear());
		    else if(bean.getStart()>=0 && bean.getSize()>0)
		    	return ms.getAllMessgesPaginated(bean.getStart(),bean.getSize());
		    else
		    	return new ArrayList<Message>();
		}
		
		@Path("/{msgId}/comments")
		public CommentRest rest()
		{
			return new CommentRest();
		}
		
		@POST
		@Path("/add")
		public Response addMessage(Message msg,@Context UriInfo uri)
		{
			 Message msg2 = ms.addMessage(msg);
			    
			  String id = String.valueOf(msg2.getId());
			  
			 URI url = uri.getAbsolutePathBuilder().path(id).build();
			 
			 return Response.created(url).entity(msg2).build();
			// return Response.status(Status.CREATED).entity(msg2).build();
			 
		}
		
}
