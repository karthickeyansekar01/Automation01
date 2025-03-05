package basics;

public class static_nonStatic {
	
	static int i=10;
	int j=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling static variable into static method
		System.out.println(static_nonStatic.i);
		
	//  System.out.println(j);   //cannot declare static to non static reference
		
		// Create a object and call static& non static variable of class member
		
		// to call a non static variable into a static method we can use objects to call them inside methods
		static_nonStatic sns=new static_nonStatic();
		System.out.println(sns.j);
		System.out.println(sns.i);
		
		
		
		//non static creates different values for different objects
		//created 2 different values 20,30 . 2 different values for 2 different objects inside same method--
		//2 different memory allocation ,2 values for same non static variable
		
		
		System.out.println("*************");
		static_nonStatic sns1=new static_nonStatic();
		sns1.j=30;
		
		System.out.println(sns1.j);
		
		
		
		
	}

	
	void print()
	{
		
		System.out.println(static_nonStatic.i);  //static variable can be called in both static and non static methods
		
		System.out.println(j); //non static variable can be used in non static method
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
