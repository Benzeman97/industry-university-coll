package com.benz.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.benz.rest.database.Database;
import com.benz.rest.entity.Comment;
import com.benz.rest.entity.Message;
import com.benz.rest.exceptions.ExplicitException;

public class CommentService {

	private Map<Long,Message> messages = null;
	
	public CommentService()
	{
		messages = Database.getDatabaseMessages();
		messages.get(1002L).getComments().put(51L,new Comment(51L,"Raz Fuck You","Benz"));
		messages.get(1002L).getComments().put(52L,new Comment(52L,"Kelly Fuck You","Benz"));
		messages.get(1001L).getComments().put(51L,new Comment(51L,"Raz I love You","Benz"));
	}
	public List<Comment> getAllComments(long msgId)
	{
		 Map<Long,Comment> com =messages.get(msgId).getComments();
		   return new ArrayList<Comment>(com.values());
	}
	public Comment getComment(long msgId,long comId) throws ExplicitException
	{
	   
               Message msg = messages.get(msgId);
               Map<Long,Comment> comments = messages.get(msgId).getComments();
               Comment com=comments.get(comId);
               if(msg==null || com==null)
     		  {
     			  throw new ExplicitException("Not Found Fuck");
     		  }
        	  
		  return com;
	}
	
	public Comment addComment(long msgId,Comment com)
	{

		 return messages.get(msgId).getComments().put(com.getId(),new Comment(com.getId(),com.getMessage(),com.getAuthor()));
	}
	
	public Comment updateComment(long msgId,Comment com)
	{
		
		if(com.getId()>0)
		 return messages.get(msgId).getComments().put(com.getId(),com);
		else
			return null;
	}
	public Comment deleteComment(long msgId,long comId)
	{

		 if(comId>0)
			 return messages.get(msgId).getComments().remove(comId);
		 else
			 return null;
	}
}
