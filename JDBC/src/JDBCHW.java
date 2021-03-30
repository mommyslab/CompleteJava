import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCHW {
public static void main(String args []) throws Exception{
	 
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","rootuser");
	 Statement st=con.createStatement();

	 ResultSet rs=st.executeQuery("select * from EMPLOYEES");

	  List<Employee> list=new ArrayList<Employee>();
	 while(rs.next())
	 {
		 Employee e=new Employee(rs.getInt("id"),rs.getString("name"),rs.getInt("sal"));
		 list.add(e);
		 
	 }

	 display(list);//6

}
public static void display(List<Employee> l)
{
	for(Employee e:l)
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());}
}
