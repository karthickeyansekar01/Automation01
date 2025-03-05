package basics;


interface intf1
{
	abstract public void testintf1();  //methods are always type of abstract and public by default it should be
	
	final static int a=10;				// variables should be initialized also given final static specifiers
	
	

}



class intf2 implements intf1
{
	public void testintf1()
	{
	System.out.println("value is 10: from interface class:"+a);
	System.out.println("**************");
	}
	
	
	public static void test5()
	{
	
		 System.out.println("printing method of class intf1");
		 
	}

	
	
}


public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	
		
										//accessing interface members- interfacename.membername
		int temp=intf1.a; 				//getting the value of interface 1 into main class and using their values
		System.out.println(temp);
		System.out.println(intf1.a);	// accessing value of interface inside class without extending them as we can access interface using interfacename.variablename
		
		
		
		
	}

}
