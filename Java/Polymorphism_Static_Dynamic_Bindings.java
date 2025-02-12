package basics;

class testparent
{
	
	//1.Polymorphism - Static Binding - method overloading
	void add()
	{
		System.out.println("Super");
		
		
		
	}
	
	
	//2.Polymorphism - Dynamic Binding - method overridding(same method,argument -calling using objects)
	
	void sub()
	{
		
		System.out.println("Super");
	}
	
	
	
	
	
}

class testchild extends testparent

{
	//Polymorphism - Static Binding - method overloading
	void add(int a)
	{
		System.out.println("Sub");
		
		
		
	}
	
	
	//Polymorphism - Dynamic Binding - method overridding -
	void sub()
	{
	
		System.out.println("Sub");
		
	}
	
}



public class Polymorphism_Static_Dynamic_Bindings {

	public static void main(String[] args) {


		//Static binding
		//calling child method and accessing both parent and child methods inside it without confusion to compiler
		
		
		testchild ts=new testchild();
		ts.add(10);  //calling child
		ts.add();    //calling parent 
		
		System.out.println("***************************");
		
		
		//Dynamic binding
		//Calling add method but compiler only picks parent or child based on JVM order of execution
		
		ts.sub(); //method overriding - dynamic binding -calls newly implemented method 
		
		
		
		
		
		
		
		
		
		
		
	}

}
