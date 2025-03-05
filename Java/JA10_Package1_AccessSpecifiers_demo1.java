package learning.package1_AccessSpecifiers;


//




class a{
	
	
	
 public static void main(String args[]) {
						//Public AccessSpecifiers usage in different class of same java file
	
	// Creating a main method inside class a and calling class demo1 members inside here
	//can access inside same java file
	
	/*
	demo1 d1=new demo1();
	
	System.out.println(d1.a);
	d1.test();
	
	*/
	
	
	
						//2.PrivateAccessSpecifiers
	
	
	/*
	demo1 d1=new demo1();
	
	System.out.println(d1.b);      //*** Calling private members from different class is not visible ,when private AccessSpecifiers is used in same java file itself
	d1.test1();
	
	*/
	
	
	
	
						//3.Protected 
	
demo1 d1=new demo1();
	
	System.out.println(d1.c);      //*** Calling private members from different class is not visible ,when private AccessSpecifiers is used in same java file itself
	d1.test2();
	

	

}
	
	
}





public class demo1 {
	
	/* public int a=10;					//Public Access Specifiers usage
	public void test()					//accessing demo1 class members into different classes and package
	{
		
	}  */
	
	
	
						//2.PrivateAccessSpecifiers
	
	
	/*
	
	 private int b=20;
	 private void test1()					//accessing demo1 class members into different classes and package
		{
			
		}  
		
	
	*/
	
	
	
						//3.ProtectedAccessSpecifiers
	
	
	
	
	protected int c=30;
	protected void test2()
	{
		
	}
	
	
	
	
	
	 
	
	
	
	

	public static void main(String[] args) {
	
	/*	
	 * 						//Public AccessSpecifiers usage in same class
	 * 
	 * 
		//creating a object and calling demo1 class members
		//can
		
		demo1 d1=new demo1();
				
		System.out.println(d1.a);
		d1.test();
		
		
	*/	
	
		
							//2.Private access specifiers can be used inside
	
		
		
		
		/*
	
		demo1 d1=new demo1(); 
		
		System.out.println(d1.b);
		d1.test1();
		
		

		*/
		
		
							//3.protected specifiers
		
		
		/*
		
		demo1 d1=new demo1(); 
		
		System.out.println(d1.c);
		d1.test2();
		
		
		*/
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
