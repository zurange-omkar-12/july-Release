package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class orangeHRM_Login_Page extends Base_Class_init {
	
	
	
	public orangeHRM_Login_Page(WebDriver driver_Obj)
	{
		
		super(driver_Obj);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement userName; 
	
	@FindBy(xpath="//input[@placeholder='Password']") WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']") WebElement submit_Btn;
	
	
	public void login_Function(String USERNAME , String PASSWORD)
	{
		
		wait_Obj.until(ExpectedConditions.visibilityOf(userName)).sendKeys(USERNAME);
		
		wait_Obj.until(ExpectedConditions.visibilityOf(passWord)).sendKeys(PASSWORD);
		
		wait_Obj.until(ExpectedConditions.elementToBeClickable(submit_Btn)).click();
		
	}
	
	

}
