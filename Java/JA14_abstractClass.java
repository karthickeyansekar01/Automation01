package basics;



abstract class test1{			//abstract is basically one general notation implements by different class for doing different purpose
	
	abstract void add();		//  abstract method and class is in super class
	
	
}


class test2 extends test1{
	
	
	void add()					//  2nd add method implements first class test1 add method ?how! --> it implements abstract add method and making it as concrete method with body inside it
	{
		
	System.out.println("Test2 is DSA");
	
				
		
	}
	
	
	
}


class test3 extends test1
{

	void add()					//implementing test1 abstract method and using them to do different implementation
	{
		
		System.out.println("Test3 is Java");
	
	}

	
	
	
}










public class abstractClass {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	test2 t2=new test2();
	t2.add(); 								//test2 is also a kind of test prints dsa || same abstract implements different output
		
	test3  t3=new test3();
	t3.add();								//test3 is also a kind of test prints java || same abstract implements different output

		
		
		
		
		
		
		

	}

}
