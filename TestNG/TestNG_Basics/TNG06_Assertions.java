package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG06_Assertions {
  @Test
  public void VerificationMEthods() {
	  
	  String str1="Hello";
	  String str2="Hello";
	  
	 //Hard Assert 
	  
//	 Assert.assertEquals(str1, str2);
//	 Assert.assertTrue(str1==str2); 
	  
	 //Soft Assert
	 
	 SoftAssert soft=new SoftAssert();
	 
	soft.assertEquals(str1, str2);
	 soft.assertTrue(str1==str2); 
	 soft.assertTrue(20>15);
	 
	 
	 soft.assertAll();
	  
	   
  }
}
