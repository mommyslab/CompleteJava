 package com.nt.cntrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.entity.Employee;

public class SelectServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();

		 Employee e=new EmpDao().select(id);
		 if(e==null)
				pw.write("<h2 style='color:red'>unable to  fetch record ");
		 else
		 {		pw.write("<h3>employee details");
				pw.write("id:" + e.getId());
				pw.write("name:"+e.getName());
				pw.write("sal:"+e.getSal());
			}
				
		
		}
	
	
	
	
	
	}


