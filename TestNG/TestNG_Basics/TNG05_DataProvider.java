package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG05_DataProvider {
	
	
	
	@Test(dataProvider="senddata")
	
	public void getdata(String browser,String username,String number, String emailid)
	{
		
		
		
		System.out.println("Browsername: "+browser+ " username: "+username+" phone number: "+number+" email id: "+emailid);
		
	}

	
  
  
  
  
  @DataProvider
  
  public Object[][] senddata()
  {
	  
	   
	  Object[][] data=new Object[3][4];
	  	data[0][0] = "Chrome";
		data[0][1] = "Admin";
		data[0][2] = "2345677";
		data[0][3] = "nitin@yopmail.com";

		data[1][0] = "Mozilla";
		data[1][1] = "SuperAdmin";
		data[1][2] = "XXXXXXX";
		data[1][3] = "sachin@yopmail.com";

		data[2][0] = "Edge";
		data[2][1] = "LocalAdmin";
		data[2][2] = "---YYY";
		data[2][3] = "Deepak@yopmail.com";

		
		return data;
		
	  
	  
	  
	  
  }
}
