package basics;


class Super
{
	
	int a=10;
	
	void test1()
	{
		
	}
	
}


class Sub extends Super
{
	
	int b=20;
	
	void test1()
	{
		
	}
	
}





public class SimpleInheritance {
	
	//Simple inheritance
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		
		//Simple Inheritance
		
		Super s1=new Super();
		System.out.println("printing parent class:"+s1.a); //value should be 10 
		
		Sub s2=new Sub();
		System.out.println("printing parent class using object of sub class:"+s2.a); //child inerits value from parent -->value should be 10 
		
		System.out.println("printing child class:"+s2.b); //value should be 20
		
		
		
		
	}

}
