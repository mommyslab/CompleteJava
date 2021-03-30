package com.nt.cntrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.entity.Employee;

public class ResgisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int sal=Integer.parseInt(req.getParameter("sal"));
		Employee e=new Employee(id,name,sal);
		
		boolean isAdded = new EmpDao().register(e );
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		if(isAdded)
		{
			pw.write("<h2 >record added successfuly </h2>");
		}
		else
		{
			pw.write("<h2 style='color:red' >unable to add record </h2>");

		}

	}

}
