package com.benz.demo;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.servlet.http.*;

public class Ulogin extends HttpServlet{
	
	public void init()
	{
		
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		try {
		UDetails ud = new UDetails();
		ud.setUcode(Integer.parseInt(req.getParameter("txtcode")));
		ud.setUname(req.getParameter("txtuname"));
		ud.setEmail(req.getParameter("txtemail"));
		ud.setPawd(req.getParameter("pawd"));
		if(insert(ud))
		{
			res.sendRedirect("UniversityLogin.jsp");
		}else
		{
			res.sendRedirect("SignUp.jsp");
			
		}
		}catch(NumberFormatException nx)
		{
			nx.printStackTrace();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public boolean insert(UDetails ud)
	{
		
		try {
			String que ="{call U_Insert(?,?,?,?)}";
			CallableStatement cst = DAO.dbCon().prepareCall(que);
			cst.setInt(1,ud.getUcode());
			cst.setString(2,ud.getUname());
			cst.setString(3, ud.getEmail());
			cst.setString(4,ud.getPawd());
		    cst.execute();
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		

	}
	
	public void destroy()
	{
		
	}
}
