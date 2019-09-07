package com.benz.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.benz.rest.database.Database;
import com.benz.rest.entity.Profile;

public class ProfileService {

	private Map<Long,Profile> profile = Database.getDatabaseProfiles();
	
	public ProfileService()
	{
		profile.put(1001L,new Profile(1001L,"Kelly","Benz"));
		profile.put(1002L,new Profile(1002L,"Raz","Naw"));
	}
	
	public List<Profile> getProfiles()
	{
		 List<Profile> profiles = null;
		           profiles = new ArrayList<Profile>(profile.values());
		           return profiles;
	}
	public Profile getProfileById(long id)
	{
	
		  return profile.get(id);
	}
	
	public Profile updateProfile(Profile pro)
	{
		  if(pro.getId()<=0)
		  {
			  return null;
		  }else
		  {
		  profile.put(pro.getId(),pro);
		  return pro;
		  }
	}
	public Profile addProfile(Profile pro)
	{
		pro.setId(profile.size()+1001);
		profile.put(pro.getId(),pro);
		return pro;
	}
	public Profile deleteProfile(long id)
	{
		  Profile p=profile.get(id);
		   profile.remove(id);
		   return p;
	}
}
