package com.benz.uni.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.multipart.FormDataParam;


@Path("/image")
public class UploadRest {

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Path("/upload")
	@Produces(MediaType.TEXT_PLAIN)
	public String getUpload(@FormDataParam("file") InputStream uploadInputStream)
	{
		
		
		saveFile(uploadInputStream);
		return "File has been uploaded";
	}
	
	public void saveFile(InputStream uploadImage)
	{
		String location ="D://Software Engineering//Upload/"+"Benz";
	
		
		try {
			OutputStream out = new FileOutputStream(new File(location));
			
			int read=0;
			byte[] bytes =new byte[1024];
			
			out = new FileOutputStream(new File(location));
			
			while((read=uploadImage.read(bytes))!=-1)
			{
				out.write(bytes,0,read);
			}
			out.flush();
			out.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
