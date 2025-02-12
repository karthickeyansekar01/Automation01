package basics;





class grandparent 
{
	int c=30;
	void test1()
	{
		
	}
}



class parent extends grandparent
{
	
	int a=10;
	
	void test1()
	{
		
	}
	
}


class child extends parent
{
	
	int b=20;
	
	void test1()
	{
		
	}
	
}







public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		
		
	//Multilevel inheritance
		
		//grandparent --> inherits to parent -->inherits to child
		//we can access members from grandparent to parents and parent to child
		
		
		
				//Accessing own members 
		
		
		parent p1=new parent();
	System.out.println("Accessing own member:"+p1.a); //value is 10
	
	
				//Accessing grandparent value to parent
		
	System.out.println("Accessing grandparent member inside parent:"+p1.c); //value is 30
	
	
	
				//using child class to create a object and call both parent and grandparent members
	
		child c1=new child();
		
		System.out.println("Accessing own member:"+c1.b); //value is 20
		
		
		System.out.println("Accessing parent member inside child:"+c1.a); //value is 10
		
		
		System.out.println("Accessing grandparent member inside child:"+c1.c); //value is 30
		
		
		
		

	}

}
