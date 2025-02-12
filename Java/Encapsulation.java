package basics;


class hiddendata
{
	
	private int accbal=100000;
	
	
	
	//creating getter method to access private member
	
	int getAccBal()
	{
		return accbal;
	}
	
	
	
	//Setting/Changing accbal to the private member
	
	void setAccBal(int val)
	{
		
		accbal=val;
		
	}
	
	
	
}



public class Encapsulation {
	
	
	

	public static void main(String[] args) {
		
		
		hiddendata hd=new hiddendata();
	//	hd.accbal    //cannot access accbal using normal object creation as private member can be accessed using encapsulation
		
		
		
		int temp=hd.getAccBal();			//getting account balance using creating object
		
		System.out.println(temp);		 //before value of acc bal
		
		
		
								
		
		
		
		hd.setAccBal(1234567);   //after setting balance
		
		System.out.println(hd.getAccBal());    //after value of acc bal
		
		
		
			
		
		
		
	
		

	}

}
