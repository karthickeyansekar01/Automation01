package basics;



class parent2
{
	int c=30;
	void test1()
	{
		
	}
}



class child1 extends parent2
{
	
	int a=10;
	
	void test1()
	{
		
	}
	
}


class child2 extends parent2
{
	
	int b=20;
	
	void test1()
	{
		
	}
	
}







public class Hierarchical {
	
	
	
		
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		child1 c1=new child1();
		System.out.println("calling own member"+c1.a); // value is 10
		System.out.println("calling parent member"+c1.c);  // value is 30
		
		
		child2 c2=new child2();
		System.out.println("calling own member"+c2.b);    // value is 20
		System.out.println("calling parent member"+c2.c);  // value is 30
		
		
		
		

	}

}
