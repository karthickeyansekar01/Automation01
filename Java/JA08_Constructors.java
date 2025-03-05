package basics;

public class Constructors {

	
	Constructors(){
		System.out.println("this is a constructor");
		String str="hey string";
	}
	
	//Creating parameterized constructors
	
	
	
	
	//even commenting constructor block - compiling time creates a default block when declaring a object for constructors
	
	
	public static void main(String[] args) {
		
		
		
		//run 1 only with object creating for a constructor- it automatically calls constructor method even without calling or printing
		
				//	Constructors cns= new Constructors();
		//run 2
		Constructors cns= new Constructors();
		new Constructors();  	//whenever object is created for a constructor it executes the block 
		
		
		
		
		
		
		
		
		
	}

}
