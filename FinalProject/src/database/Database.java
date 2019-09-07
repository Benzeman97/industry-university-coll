package com.benz.uni.rest.database;

import java.util.HashMap;
import java.util.Map;

import com.benz.rest.entity.Message;
import com.benz.rest.entity.Profile;

public class Database {
	
	private static Map<Long,Message> messages = new HashMap<Long,Message>();

	private static Map<Long,Profile> profiles = new HashMap<Long,Profile>();
	
	public static Map<Long,Message> getDatabaseMessages()
	{
		return messages;
	}
	
	public static Map<Long,Profile> getDatabaseProfiles()
	{
		return profiles;
	}
}
