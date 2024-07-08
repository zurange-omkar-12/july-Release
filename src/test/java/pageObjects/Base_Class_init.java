package pageObjects;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_init {
	
	WebDriver driver_Obj;
	WebDriverWait wait_Obj;
	
	TakesScreenshot take_Screenshot_Object;
	Random random_int_Obj;
	
	
	Base_Class_init(WebDriver driver_Obj)
	{
		this.driver_Obj = driver_Obj;
		PageFactory.initElements(driver_Obj, this);
		this.wait_Obj=new WebDriverWait(driver_Obj,Duration.ofSeconds(10));
		this.take_Screenshot_Object = (TakesScreenshot) driver_Obj;
		this.random_int_Obj= new Random();
		
	}
	
	

}
