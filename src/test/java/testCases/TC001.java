package testCases;

import org.testng.annotations.Test;

import pageObjects.*;



public class TC001 extends Base_Class_For_Test_Cases {
	
		
	
  @Test
  public void f() {
	  
	  HRM_Login_Page = new orangeHRM_Login_Page(driver_Obj);
	  

	  HRM_Login_Page.login_Function("Admin", "admin123");
	 
  }


}
