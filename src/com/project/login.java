package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
	
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("username");  
    String p=request.getParameter("password");  
          
    if(log.validate(n, p)){  
        RequestDispatcher rd=request.getRequestDispatcher("NewFile.html");  
        rd.forward(request,response);  
    }  
    else{  
        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("login.html");  
        rd.include(request,response);  
    }  
          
    out.close();  
    }  
}  