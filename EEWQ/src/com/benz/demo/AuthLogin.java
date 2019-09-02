package com.benz.demo;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.*;

public class AuthLogin extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("txtname");
		String pawd= req.getParameter("pawd");
		try {
			if(check(name,pawd))
			{
				res.sendRedirect("UniIndex.jsp");
			}else {
				res.sendRedirect("UniversityLogin.jsp");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public boolean check(String name,String pawd) throws SQLException
	{
		ResultSet set = null;
		Statement stmt = DAO.dbCon().createStatement();
		String que="select University_Name,U_Password from University";
		  set = stmt.executeQuery(que);
		
		  while(set.next())
		  {
			  String na = set.getString("University_Name");
			  String pa = set.getString("U_Password");
			  
			   if(na.equals(name) && pa.equals(pawd))
			   {
				   return true;
			   }
		  }
		  return false;
	}
}
