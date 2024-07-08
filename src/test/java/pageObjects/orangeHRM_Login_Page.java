package pageObjects;

import java.io.File;

import org.openqa.selenium.OutputType;
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
	
	@FindBy(xpath="//p[text()='Invalid credentials']") WebElement Invalid_Credential_Result;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']/div[2]") WebElement Invalid_Credential_Result_Screenshot;
	
	
	public void login_Function(String USERNAME , String PASSWORD)
	{
		
		wait_Obj.until(ExpectedConditions.visibilityOf(userName)).sendKeys(USERNAME);
		
		wait_Obj.until(ExpectedConditions.visibilityOf(passWord)).sendKeys(PASSWORD);
		
		wait_Obj.until(ExpectedConditions.elementToBeClickable(submit_Btn)).click();
		
		
	}
	
	
	public boolean check_Invalid_Validation()
	{

		return wait_Obj.until(ExpectedConditions.visibilityOf(Invalid_Credential_Result)).isDisplayed(); //false
		
	}
	
	public void capture_Invalid_Login_Details_Screenshot()
	{
		File source = wait_Obj.until(ExpectedConditions.visibilityOf(Invalid_Credential_Result_Screenshot)).getScreenshotAs(OutputType.FILE);
		
		File Target = new File(System.getProperty("user.dir")+"/Screenshots/Invalid"+random_int_Obj.nextInt(10000)+".png");
		
		source.renameTo(Target);
	}
	
		

}
