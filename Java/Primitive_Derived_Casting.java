package basics;

class parentone{
	
	void parent1()
	{
		
		System.out.println("this is parent");
	}
	
}



class childone extends parentone{

void child1()
{

System.out.println("this is child");
}

}


public class Primitive_Derived_Casting {

	public static void main(String[] args) {
		
		int a=10;
		float b=a; //assigning a value to float type (higher memory size) -->primitive casting --- auto widening		
		System.out.println(b);
		
		
		int c=-127;
		byte d= (byte)c; 	//casting and forcing to down size c of int type to byte (lower size)--> explicit narrowing
		System.out.println(d);
		
		
		
		
		//up casting -- assigning child method to parent object
		
		//child c1=new child();
		
		
		
		
		
		childone c1=new childone();
				
				c1.child1();  // child object can call only child method
				c1.parent1(); //child object can call parent method also as we extended super class
			
		parentone p1=new parentone(); 	//assigning child behaviour to parent
			p1.parent1(); 		//parent p1 calling its own method and cannot access child method
			
			
		parentone p2=new childone();  //child object is assigned to parent p2
		p2.parent1();
		
				
				//down casting
		//type 1
		
		childone c2 = (childone)new parentone();   // converting parent class by downgrading  using new object creation
		
		//type 2
		
		//using up casted p2 object to use and downcast as child object
		
		childone c3= (childone)p2;
		
		c3.child1();			// parent p2 is down casted to c3 and c3 variable can be used to call 
		c3.parent1();
		
		
		
		
		
		
		//dont's
			
		
	//	childone c4=new parentone();  // parent class cannot be assigned to child class childone
				
			
		
		
		
		
		
		
		
		 

	}
	
	
	
	

}
