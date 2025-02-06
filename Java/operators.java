package basics;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		
		//relational operator returns true or false as boolean value --unary operator
		
		boolean r1= a>b;
		System.out.println(r1);
				
		// combining relational and logical values
		
		boolean r2= b>a&c<a;
		System.out.println(r2);
	
		

		
		bool();
		
		// conditional operators
		//operand 1 ? operand2 : operand 3
		//condition ? true     :false
		
		
		
		boolean res= a<b? true:false;
		
		String res1= a<b? "a is lesser":"b is lesser";
		
		System.out.println(res1);
		
		
		
		int d=2;
		int e=5;
		
		int result= ++d + d++ + ++e + --d + d-- + e-- ;
		System.out.println(result);
		
		//a = 2/3/4/3/2
		//b = 5/6/5
		//			3   + 3   + 6   + (4)->3  + 3 + 6
		//          3+3+6+3+3+5 = 23
		
		//f =10/11
		//g=11/12
	
		int f=10;
		int g=f++;
		System.out.println(g); //10
		g=++f; //11->12
		System.out.println(g); //12
		
		
		//Implementing scanner class
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter some string to print back ");
		String s=scn.nextLine();
		System.out.println(s);
		
		
		
		
		
		
		
		
	}
	
	//adding java documentation comments and verifying the description when  hovering called method
	// adding descriptions for methods which we are calling
	/**
	 * This method used for understanding relational and logical operators
	 */
	
	static void bool()
	{
		int a=10;
		int b=20;
		boolean r1= a>b;
		System.out.println(r1);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
