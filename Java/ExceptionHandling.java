package basics;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * *
		
		 	//*********Run1 - uncomment and run only this block********
		
		//exception is not handled
		int i=10/0; // this line will throw exception as number cant be divided by zero
		
		System.out.println(i);  // this will throw arithmetic exception
		
		
		
			//*********Run2 - uncomment and run only this block********
		
		//exception handling
		//1.compile time error- coding issue- add throws on main method method
		
				Thread.sleep(100);			//unhandled exception- InterruptedException- so add throws
		
		* 
		 */
		
			//*********Run3 - uncomment and run only this block********
		
		
				
				// 2. try throw to handle runtime exception
						
						System.out.println("Line1");
						try
						{
							int j=10/0; 
						}
						catch(ArithmeticException e)
						{
							System.out.println("Handled exception");
							
						}
						
						finally
						{
							System.out.println("printing additional msg block if catch fails");
						}
						System.out.println("Line2");
						
			
						
						
	}

}
