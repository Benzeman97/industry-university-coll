package com.benz.demo;
import java.io.IOException;
import java.sql.CallableStatement;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/xyz2")
public class ResearchProblem extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		try {
			insert(req,res);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	public void insert(HttpServletRequest req,HttpServletResponse res) throws SQLException, IOException, ParseException
	{
		Research resa = new Research();
		resa.setcName(req.getParameter("txtCname"));
		resa.setMail(req.getParameter("txtMail"));
		resa.setTitle(req.getParameter("txtTitle"));
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		resa.setDate(format.parse(req.getParameter("txtDate")));
		resa.setUniver(req.getParameter("txtSubject"));
		resa.setProblem(req.getParameter("txtProblem"));
		if(intoTable(resa))
		{
			res.sendRedirect("ResearchProblem.jsp");
			
		}
	}
	public boolean intoTable(Research rs) throws SQLException
	{
		try {
		CallableStatement stmt = DAO.dbCon().prepareCall("{call Problem_Insert(?,?,?,?,?,?)}");
		stmt.setString(1, rs.getTitle());
		java.sql.Date date = new java.sql.Date(rs.getDate().getTime());
		stmt.setDate(2, date);
		stmt.setString(3, rs.getProblem());
		stmt.setString(4, rs.getUniver());
		stmt.setString(5, rs.getcName());
		stmt.setString(6, rs.getMail());
		stmt.execute();
		return true;
		}catch(NumberFormatException nx)
		{
			nx.printStackTrace();
			return false;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

}
