package p1;

import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCHW {
private static final String PreparedStatement = null;
public static void main(String args []) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEES","root","rootuser");
	 Statement st=con.createStatement();
	 int r= st.executeUpdate("intsert into EMPLOYEE values (5,'Sam',50000)");//1
	 System.out.println(r);
	 
	 
	 
	 Scanner sc=new Scanner(System.in);//5
	 System.out.println("Please enter the id of the employee you want to get info of");
	 int i=sc.nextInt();
	 int j=sc.nextInt();
	 
			 

	 PreparedStatement ps=con.prepareStatement("select * from EMPLOYEES where id=? ");
	 ps.setInt(1, i);
	 ResultSet rs=ps.executeQuery();
	 Employee emp=new Employee(rs.getInt("id"),rs.getString("name"),rs.getInt("sal"));//5
	 System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	 
	 
	 
	 ps=con.prepareStatement("Delete from EMPLOYEE where id=?");
	 ps.setInt(1, i);
	 ps.executeQuery();
	 
	 st.executeQuery("Delete * from EMPLOYEE ");//
	 
	 
	

}
public static void display(List<Employee> l)
{
	for(Employee e:l)
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());}
}
