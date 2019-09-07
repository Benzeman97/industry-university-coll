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
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.benz.rest.entity.Comment;
import com.benz.rest.entity.ErrorMessage;
import com.benz.rest.exceptions.ExplicitException;
import com.benz.rest.service.CommentService;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentRest {
	
	private CommentService cs= new CommentService();
	
	
	@GET
	public List<Comment> getAllComments(@PathParam("msgId") long msgId)
	{
		 return cs.getAllComments(msgId);
	}
	
	@GET
	@Path("/{comId}")
	public Comment getComment(@PathParam("msgId") long msgId,@PathParam("comId") long comId) throws ExplicitException
	{
		  return cs.getComment(msgId, comId);
	}
	
	@POST
	public Comment addComment(@PathParam("msgId") long msgId,Comment com)
	{
         return cs.addComment(msgId, com);
	}
	
	@PUT
	public Comment updateComment(@PathParam("msgId")int msgId,Comment com)
	{
		return cs.updateComment(msgId, com);
	}
	
	@DELETE
	@Path("/{comId}")
	public Comment deleteComment(@PathParam("msgId")long msgId,@PathParam("comId")long comId)
	{
		return cs.deleteComment(msgId, comId);
	}
}
