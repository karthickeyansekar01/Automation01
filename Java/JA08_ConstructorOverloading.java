package basics;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a)
	{
		System.out.println("a value is:"+a);
		
	}
	
	ConstructorOverloading(int a,int b)
	{
		System.out.println("a and b value is:"+a+b);
		
	}
	

	public static void main(String[] args) {
		
		//initializing first constructor with one argument
		ConstructorOverloading cns1=new ConstructorOverloading(20);
		
		//initializing second constructor with second argument
		
		ConstructorOverloading cns2=new ConstructorOverloading(20,30);
		
		
		
		
		
		
		
		
	}

}
