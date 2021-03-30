package com.nt.cntrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter pw=resp.getWriter();
		int id=Integer.parseInt(req.getParameter("id"));
		int sal=Integer.parseInt(req.getParameter("sal"));
		

			
			
			boolean result= new EmpDao().update(id,sal);
			if(result==true)
				pw.write("<h1> "+result+" salary updted successfully");
			else
			pw.write("<h2 style='color:red'>unable to update salary");
		}
	}


