package seleniumbasicsay2;

import java.util.Scanner;

public class StringReverse {
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		String nametemp;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter name of string to reverse below:");
		nametemp
		= scnr.nextLine();
		// String name = "Malayalam";
		String reverse = "";
		for (int i = nametemp.length() - 1; i >= 0; i--) {
		reverse = reverse + nametemp.charAt(i);
		}
		System.out.println("with-out reverse() function :" + " " + reverse);
		StringBuffer y = new StringBuffer(nametemp);// with reverse()
		y.reverse();
		System.out.println("with reverse() function by using String bufferclass :"
		+ " " + y);
		scnr.close();
	}
	
	

}
