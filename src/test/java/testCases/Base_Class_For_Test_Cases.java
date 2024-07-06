package testCases;

import pageObjects.*;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_For_Test_Cases {
  
	WebDriver driver_Obj;
	WebDriverWait wait_Obj;
	
	Properties properties_Obj;
	
	FileReader fileReader_Obj;
			
	SoftAssert softAssert_Obj;
	
	orangeHRM_Login_Page HRM_Login_Page;
	
	orangeHRM_Dashboard_Page HRM_Dashboard_Page;
	
	
  @BeforeMethod
  public void beforeClass() throws IOException {
	  
	  properties_Obj=new Properties();
	  
	  fileReader_Obj = new FileReader("./src/test/resources/config.properties");
	  
	  properties_Obj.load(fileReader_Obj);
	  
	  driver_Obj = new ChromeDriver();
	  wait_Obj = new WebDriverWait(driver_Obj,Duration.ofSeconds(10));
	  softAssert_Obj = new SoftAssert();
	  
	  driver_Obj.manage().window().maximize();
	  driver_Obj.get(properties_Obj.getProperty("appURL"));
  
	  
  
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
