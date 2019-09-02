package com.benz.demo;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/xyz8")
public class StudentIdea extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		Sidea si = new Sidea();
		si.setId(100);
		si.setuName(req.getParameter("txtUniversity"));
		si.setsName(req.getParameter("txtName"));
		si.setTitle(req.getParameter("txtCourse"));
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		try {
			si.setDate(format.parse(req.getParameter("txtDate")));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		si.setIdea(req.getParameter("txtIdea"));
		si.setMail(req.getParameter("txtMail"));
		si.setGen(req.getParameter("txtGender"));
		
		
		if(insert(si))
		{
			res.sendRedirect("Test.jsp?id="+si.getId()+"&uname="+si.getuName());	
		}else {
			res.sendRedirect("StudeantIdea.jsp");
		}
	}
	public boolean insert(Sidea si) 
	{
		try {
		CallableStatement cal = DAO.dbCon().prepareCall("{call Idea_Insert(?,?,?,?,?,?,?,?) }");
		cal.setInt(1,si.getId());
		cal.setString(2, si.getuName());
		cal.setString(3, si.getsName());
		cal.setString(4,si.getTitle());
		java.sql.Date date = new java.sql.Date(si.getDate().getTime());
		cal.setDate(5, date);
		cal.setString(6,si.getIdea());
		cal.setString(7, si.getMail());
		cal.setString(8, si.getGen());
		return true;
		}catch(SQLException sx)
		{
			sx.printStackTrace();
			return false;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		
	}

}
