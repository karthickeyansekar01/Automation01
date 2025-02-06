package basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the switch case value:");
		String str=scn.nextLine();

		switch(str)
		{
		case "nokia": 
		{
			System.out.println("nokia products are listed");
			break; 												//to end the case use break or all following cases will also execute and print
		}
		
		
		case "samsung":
		{
			System.out.println("Samsung products are listed");
			break;
		}
		
		case "apple" :
			
		{
			System.out.println("apple products are listed");
			break;
			
		}
			
		
		default : 
		{
			System.out.println("products is not listed");
			
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
