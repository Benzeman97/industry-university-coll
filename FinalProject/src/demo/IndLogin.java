package com.benz.demo;
import java.io.IOException;

import javax.servlet.http.*;

public class IndLogin extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try {
		res.sendRedirect("IndustryLogin.jsp");
		}catch(IOException ix)
		{
			ix.printStackTrace();
		}
	}

}
