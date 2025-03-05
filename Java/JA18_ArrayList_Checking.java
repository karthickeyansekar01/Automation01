package seleniumbasicsay2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Checking {

	public static void main(String[] args) {
	/*
		ArrayList<Integer> al = new ArrayList<>();
		al.add(200);
		al.add(180);
		al.add(60);
		al.add(350);
		al.add(955);
		System.out.println("Print the orginal array :" + al);
		Collections.sort(al);
		System.out.println("Sorted ArrayList with Ascending Order" + al);
	*/	
	
		//Creating new object and calling class outside main block to execute
		
		ArrayList_Checking al1=new ArrayList_Checking();
		
		al1.list();
		
		
		

	}
	
	
	
	
	public void list() {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(200);
		al.add(180);
		al.add(60);
		al.add(350);
		al.add(955);
		System.out.println("Print the orginal array :" + al);
		Collections.sort(al);
		System.out.println("Sorted ArrayList with Ascending Order" + al);
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
