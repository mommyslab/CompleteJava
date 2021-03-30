package P1;

import java.util.ArrayList;

public class Test {
	
	public void display(ArrayList<Employee> arr)
	{
		for (int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
	public static void main(String args[])
	{
		Employee emp1=new Employee(1,"Pragathi",700000);//1,2
		Employee emp2=new Employee(2,"Chitra",70000);
		Employee emp3=new Employee(3,"Nayema", 60000);
		Employee emp4=new Employee(4,"Angad",70000);
		Employee emp5=new Employee(5,"Mohit",70000);
		
		
		ArrayList<Employee> arr=new ArrayList<Employee> (5);
		
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		arr.add(emp4);
		arr.add(emp5);
		for (int i=0;i<arr.size();i++)//1,2
		{
			System.out.println(arr.get(i));
		}
		
		
		Test t=new Test();
		t.display(arr);//63
		
	}
}
