package learning.package2_AccessSpecifiers;

import learning.package1_AccessSpecifiers.demo1;

public class demo3 extends demo1 {

	public static void main(String[] args) {
						//Public AccessSpecifiers usage in different class of different java file in different package
		
		//Calling demo1 class from package1 to another package2 and using the members by creating the object
		
		
		/*
		
		demo1 d1=new demo1();
		
		System.out.println(d1.a);
		d1.test();
		
		
		
		*/
		
		
		
		
						//2.PrivateAccessSpecifiers
		
		/*
		
		demo1 d1=new demo1();
		System.out.println(d1.b);
		d1.test1();
		
		
		*/
		
		
		
						//3.Protected-- remove import demo1 if using public private specifiers
		
		
		
		
		demo3 d3=new demo3();
		System.out.println(d3.c);
		d3.test2();
		
		
		
	
		
		
		
	}

}
