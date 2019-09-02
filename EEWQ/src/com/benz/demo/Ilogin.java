package com.benz.demo;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.servlet.http.*;

public class Ilogin extends HttpServlet{
	public void init()
	{
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		try {
		IDetails id = new IDetails();
		id.setReg_no(Integer.parseInt(req.getParameter("txtRno")));
		id.setCname(req.getParameter("txtcname"));
		id.setMail(req.getParameter("txtemail2"));
		id.setPawd(req.getParameter("pawd2"));
		if(insert(id))
		{
			res.sendRedirect("IndustryLogin.jsp");
		}else
		{
			res.sendRedirect("SignUp.jsp");
		}
		}catch(NumberFormatException nx)
		{
			nx.printStackTrace();
		}
	}
	
	public boolean insert(IDetails id)
	{
		try {
			String que = "{call I_insert(?,?,?,?)}";
			CallableStatement cst = DAO.dbCon().prepareCall(que);
			cst.setInt(1,id.getReg_no());
			cst.setString(2, id.getCname());
			cst.setString(3,id.getMail());
			cst.setString(4,id.getPawd());
			cst.execute();
			return true;
			
		}catch(SQLException sx)
		{
			sx.printStackTrace();
			return false;
		}
	}
	
	public void destroy()
	{
		
	}

}
