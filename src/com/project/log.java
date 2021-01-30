package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class log {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","hr","admin");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from boys where username=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}

