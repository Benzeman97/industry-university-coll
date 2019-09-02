package com.benz.demo;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.*;

public class Auth2Login extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("txtname");
		String pawd= req.getParameter("pawd");
		try {
			if(check(name,pawd))
			{
				res.sendRedirect("Indindex.jsp");
			}else {
				res.sendRedirect("IndustryLogin.jsp");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public boolean check(String name,String pawd) throws SQLException
	{
		ResultSet set = null;
		Statement stmt = DAO.dbCon().createStatement();
		String que="select Company_Name,C_password from Company";
		  set = stmt.executeQuery(que);
		
		  while(set.next())
		  {
			  String na = set.getString("Company_Name");
			  String pa = set.getString("C_password");
			  
			   if(na.equals(name) && pa.equals(pawd))
			   {
				   return true;
			   }
		  }
		  return false;
	}
}
