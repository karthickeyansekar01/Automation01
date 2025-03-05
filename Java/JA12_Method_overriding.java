package basics;


class Superr
{
	
	
	static void test4(int a)
	{
		System.out.println("Super");
	}
	
}


class Subb extends Superr
{
	
			// if you comment sub class method and try running it will print super from parent class test4 method using inheritance
	
			//Super class method override using sub class test4 method
	
	
			//*** to break method overriding - add STATIC to methods and can call individual class-methods using CLASSNAME.METHODNAME***
	
	static void test4(int i)
	{
		System.out.println("Sub");
	}
	
	
	
	
	
}




public class Method_overriding {

	public static void main(String[] args) {
		
		//METHOD OVERIDDING
		
		Subb s1=new Subb();
		s1.test4(10);
		
		
		//***Reversing method overriding using static *****
		
		//USING OBJECTS TO CALL METHODS using static, as static members belongs to class called using **classname.methodname**
		
		Superr.test4(10);
		Subb.test4(10);
		
		

	}

}
