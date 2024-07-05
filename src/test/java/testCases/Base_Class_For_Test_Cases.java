package testCases;

import pageObjects.*;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_For_Test_Cases {
  
	WebDriver driver_Obj;
	WebDriverWait wait_Obj;
	
	SoftAssert softAssert_Obj;
	
	orangeHRM_Login_Page HRM_Login_Page;
	orangeHRM_Dashboard_Page HRM_Dashboard_Page;
	
  @BeforeMethod
  public void beforeClass() {
	  
	  driver_Obj = new ChromeDriver();
	  wait_Obj = new WebDriverWait(driver_Obj,Duration.ofSeconds(10));
	  softAssert_Obj = new SoftAssert();
	  
	  driver_Obj.manage().window().maximize();
	  driver_Obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterMethod
  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  
	 driver_Obj.quit();
	  
  }
  
  
  @DataProvider(name="Credential_Provider")
  Object[][] user_Credential_Provider()
  {

	 return new Object[][] {
		{new user_Details("Admin","admin123",true)},
		 {new user_Details("admin","admin",false)}
	 };

  

}
  
}
