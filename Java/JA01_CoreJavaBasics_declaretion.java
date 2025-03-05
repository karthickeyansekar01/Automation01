package seleniumbasicsay2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaBasics_declaretion {

	public static void main(String[] args) {
	
		
		
	//Declaring variable
		int num;
		num=10;
		System.out.println("Printed number is: \n"+ num);
		
		
		String str="Started coding Java";
		System.out.println("String value is: \n"+ str);
		
		
		double flt=10.342;
		System.out.println("Float value is: \n"+ flt);
		
		char c='a';
		System.out.println("Character value is: \n" +c);
		
		boolean b=true;
		System.out.println("Boolean value is: \n" +b);
		
		System.out.println("----------------------------------");
		
	//Arrays
		
		//different type to declare 1.declaring one by one 2. declaring total string
		int i;
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Array of arr "+i+" is :\n"+arr[i]);
			
			
			
		}
		
		
		int arr1[]= {10,11,12,13,14};
		
		for(i=0;i<arr1.length;i++)
		{
			System.out.println("Array of arr1 "+i+" is :\n"+arr1[i]);
			
			
			
		}
		
		
		//String array
		
		
		
		
		
		String[] strArr ={"asraf","magesh","karthi","kanimozhi","kiruthika"};
		for(int ii=0;ii<strArr.length;ii++)
		{
			System.out.println("String array value is:" + strArr[ii]);
			
		}
		
		System.out.println("----------------------------------");
		
		
		//enhanced for loop
		
		String[] strArr1 ={"asraf","magesh","karthi","kanimozhi","kiruthika"};
		for(String s:strArr1)
		{
			System.out.println(s);
		}
		
		//enhanced for loop with if condition

		int[] strArr2={1,2,3,4,5,6,7,8,9,10};
		for(int s:strArr2)
		{
			
			if(s%2==0) 
			{
				System.out.println("Even numbers are:" + s);	
			}
			
			else
			{
		
			System.out.println("Odd numbers are:" + s);
			
			}
			 
		}
		
		
		System.out.println("----------------------------------");
		
		
		//ArrayList
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("karthi");
		al.add("vidya");
		al.add("nyla");
		
		for (int d=0;d<al.size();d++) {
			
			System.out.println("array list values:"+ al.get(d));
			
			
		}
		
		
		System.out.println("array contains nyla -- true or false:"+ al.contains("nyla"));
		
		
		
		
		
		System.out.println("----------------------------------");
		
	
		
		//Converting normal arrays into array list
		
		String[] al2= {"apple","ball","cat","dog"};
		List al3= Arrays.asList(al2);
		
		System.out.println(al3);
		
		System.out.println("---------------------------------");
		System.out.println(al3.get(0));
		System.out.println(al3.get(1));
		System.out.println(al3.get(2));
		System.out.println(al3.get(3));
		
		System.out.println(al3.contains("ball"));
		
		
		
		System.out.println("----------------------------------");
		
		
		
		
		//Strings- is an object that represents sequence of characters
		
			//method 1-String Literal--uses same previous value and only points to other objects
		
		String s= "Karthick";
		System.out.println(s);
		
		
		
		//if we use same value for different objects s1,s2 
		//Java checks if any other has the same value and uses same value of s and point it for s1,s2
		
		
		String s1="Karthick";
		System.out.println(s1);
		
		String s2="Karthick";
		System.out.println(s1);
		
		
			//method 2- new object
		String s3=new String("White Black Red");
		System.out.println(s3);
		System.out.println("-----------------------");
		
			//Splitting string  s3 and storing into array s4
		
		String[] s4 = s3.split(" ");
		
		for(String splitstr:s4)
		{
			System.out.println(splitstr);
			
			
		}
		
		
		String s5="Karthickeyan";
	
			//String Reverse
		
		
		for (int s5size=s5.length()-1 ;s5size>=
				0;s5size--)
		{
			
			System.out.println(s5.charAt(s5size));
			
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
