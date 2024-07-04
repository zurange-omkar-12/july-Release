package testCases;

import pageObjects.*;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_For_Test_Cases {
  
	WebDriver driver_Obj;
	WebDriverWait wait_Obj;
	
	orangeHRM_Login_Page HRM_Login_Page;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver_Obj = new ChromeDriver();
	  wait_Obj = new WebDriverWait(driver_Obj,Duration.ofSeconds(10));
	  
	  driver_Obj.manage().window().maximize();
	  driver_Obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  
	  driver_Obj.quit();
	  
  }

}
