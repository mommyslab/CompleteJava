package p2;

import P1.Employee;
import java.util.ArrayList;
import java.util.Vector;
public class Test {
public static void main(String args[])
{
	Employee emp1=new Employee(1,"Pragathi",70000);
	
	Employee emp2=new Employee(2,"Chitra",70000);
	Employee emp3=new Employee(3,"Nayema", 60000);
	Employee emp4=new Employee(4,"Angad",70000);
	Employee emp5=new Employee(5,"Mohit",70000);
	
	Vector<Employee> v = new Vector<Employee>(5);
	v.add(emp5);
	v.add(emp1);
	v.add(emp2);
	v.add(emp3);
	v.add(emp4);
	
	
	
	
}
}
