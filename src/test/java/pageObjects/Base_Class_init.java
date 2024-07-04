package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_init {
	
	WebDriver driver_Obj;
	WebDriverWait wait_Obj;
	
	
	Base_Class_init(WebDriver driver_Obj)
	{
		this.driver_Obj = driver_Obj;
		PageFactory.initElements(driver_Obj, this);
		this.wait_Obj=new WebDriverWait(driver_Obj,Duration.ofSeconds(10));
		
	}
	
	

}
