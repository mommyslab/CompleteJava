package com.nt.cntrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nt.entity.Employee;
import com.nt.utility.ConnectionFactory;


public class EmpDao {
	
	public boolean register (Employee emp) {
		try {
			Connection con=ConnectionFactory.getCon();
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?) ");
			

			ps.setInt(1, emp.getId());
			ps.setInt(3, emp.getSal());
			ps.setString(2,emp.getName());
			
			int result=ps.executeUpdate();
			if(result==1)
			{return true;}
				
		} catch (Exception e) {
			e.printStackTrace();// returnning false here gave no return error 
			}
		return false;
	}
	
	
	public boolean delete(int id) {
		try {
			Connection con=ConnectionFactory.getCon();

			PreparedStatement ps=con.prepareStatement("delete from emp where id=?");

			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i==1)
			{return true;}
		}
		catch (Exception e) {
			e.printStackTrace();// returnning false here gave no return error 
			}
		return false;
	}
	
	public Employee select(int id) {
		try {
			Connection con=ConnectionFactory.getCon();
			PreparedStatement ps=con.prepareStatement(" select* from  emp where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Employee emp=new Employee(rs.getInt("id"),rs.getString("name"),rs.getInt("sal") );
				return emp;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
public boolean update (int id, int sal) {
	try {
		Connection con=ConnectionFactory.getCon();
		PreparedStatement ps=con.prepareStatement(" update emp set sal=? where id=?");
		ps.setInt(1, sal);
		ps.setInt(2, id);
		int i=ps.executeUpdate();
		if (i==1)
			return true;
	} 
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return false;
	


	}
}
