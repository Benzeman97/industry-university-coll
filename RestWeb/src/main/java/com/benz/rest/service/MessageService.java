package com.benz.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.benz.rest.database.Database;
import com.benz.rest.entity.Message;
import com.benz.rest.exceptions.DataNotFoundException;

public class MessageService {

	  public List<Message> getFuck()
	  {
		  
		    List<Message> li =Arrays.asList(
		    		  new Message(1002L,"Hello Fuck","Kelly Brook"),
		  		    new Message(1004L,"Kelly Fuck","Nafaz Benzema")
		  		    
		    		);
		    
		    return li;
		    		
	  }
	  
	  
	  
	  private Map<Long,Message> messages = Database.getDatabaseMessages();
	  
	  public MessageService()
	  {
		  messages.put(1001L,new Message(1001L,"Hello World","Benzema"));
		  messages.put(1002L,new Message(1002L,"Kelly Brook","Nafaz"));
	  }
	  public List<Message> getMessages()
	  {
		  return new ArrayList<Message>(messages.values());
	  }
	  
	  public Message getMessage(long id)
	  {
		     Message msg = messages.get(id);
		     if(msg==null)
		     {
		    	 throw new DataNotFoundException("Message with Id "+id+" not found");
		     }
		     return msg;
	  }
	  
	  public Message addMessage(Message msg)
	  {
		    
		    messages.put(msg.getId(),msg);
		    return msg;
	  }
	  
	  public Message updateMessage(Message msg)
	  {
		  if(msg.getId()<=0)
		  {
			  return null;
		  }
		   messages.put(msg.getId(),msg);
		   return msg;
	  }
	  
	  public Message removeMessage(long id)
	  {
		      return messages.remove(id);
	  }
	  
	  public List<Message> getMsgByYear(int year)
	  { 
		  
		  List<Message> li=new ArrayList<Message>();
		  
		   for(Message m:messages.values())
		   {
			   int y = m.getCreated().getYear();
			    y +=1900;
			    if(y==year)
			    {
			    	li.add(m);
			    }
		   }
		  return li;
	  }
	  public List<Message> getAllMessgesPaginated(int start,int size)
	  {
		 List<Message> li = new ArrayList<Message>(messages.values());
		 
		 if((start+size)>messages.size())
		 {
			 return new ArrayList<Message>();
		 }else
		   return li.subList(start,(start+size));
	  }
}
