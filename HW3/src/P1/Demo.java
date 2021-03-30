package P1;
import java.util.ArrayList;

import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();//64
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		Collections.sort(al);//64
		System.out.println(al);//output [5, 7, 9, 10]//64
		
		Collections.reverse(al);//66
		System.out.println(al);//output [10, 9, 7, 5]

}

}
