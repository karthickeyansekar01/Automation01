package seleniumbasicsay2;

public class CoreJavaBasics_Class_Methods {

	public static void main(String[] args) {
		
		//creating objects for class
		
		
		CoreJavaBasics_Class_Methods clsmethods= new CoreJavaBasics_Class_Methods();
		clsmethods.method1();
		
		
		//Creating object for arraylist_checking from sep above java file
		//calling first file class here in CoreJavaBasics_Class_Methods 2nd file
		
		
		ArrayList_Checking methodofanotherfile=new ArrayList_Checking();
		methodofanotherfile.list();
		
		//calling a static method2 from outside main function without using objects
		//for static methods objects reference are not needed
		
		method2();
		
		
		
		
	}
	
	//Create class outside main block,why class--for reuse
	
	public void method1()
	{
		System.out.println("printing first class");
		
		
	}
	
	//static? -- if we use static we dont want to create object to call them
	//this class will pin to CoreJavaBasics_Class_Methods class level
	

	public static void method2()
	{
		System.out.println("printing second class static ");
		
		
	}
	
	
	
	
	

}
