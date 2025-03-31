package Testng;

import org.testng.annotations.Test;

public class TNG08_GroupingTestcase {
  @Test(priority='7',groups="Regression")
  public void login()
  {
	  System.out.println("Login");
  }
  
  @Test(priority='6',groups="Regression")
  public void registration()
  {
	  System.out.println("Registration");
  }
  
  @Test(priority='5',groups="UAT")
  public void Signup()
  {
	  System.out.println("signup");
  }
  
  
  @Test(priority='4',groups="UAT")
  public void SelectProduct()
  {
	  System.out.println("selectproduct");
  }
  
  @Test(priority='3',groups="smoke")
  public void AddtoCart()
  {
	  System.out.println("addtocart");
  }
  
  @Test(priority='2',groups="smoke")
  public void checkout()
  {
	  System.out.println("checkout");
  }
  
  @Test(priority='1',groups="regression")
  public void logout()
  {
	  System.out.println("logout");
  }
  
  
  
  
  
  
  
  
  
}
