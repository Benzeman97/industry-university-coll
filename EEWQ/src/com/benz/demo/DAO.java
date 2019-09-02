package com.benz.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO{

	 public static Connection con=null;
	                               
	 public static String conString= "jdbc:sqlserver://localhost:1433;databaseName=LKR;IntegratedSecurity=true;";
	 static {
		 try {
			 
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			  con = DriverManager.getConnection(conString);
		 }catch(ClassNotFoundException nx)
		 {
			nx.printStackTrace();
		 } catch (SQLException e) {
			
			e.printStackTrace();
		}
	 }
	 public static Connection dbCon()
	 {
		 return con;
	 }
}
