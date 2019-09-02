package com.benz.demo;
import java.io.IOException;

import javax.servlet.http.*;

public class UniLogin extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			res.sendRedirect("UniversityLogin.jsp");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
