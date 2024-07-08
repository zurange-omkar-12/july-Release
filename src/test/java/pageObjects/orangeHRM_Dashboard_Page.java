package pageObjects;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class orangeHRM_Dashboard_Page extends Base_Class_init {
	
	public orangeHRM_Dashboard_Page(WebDriver driver_Obj)
	{
		super(driver_Obj);
		
		
		
	}
	
	@FindBy(xpath="//h6") WebElement dashboard_Header;
	
	public boolean validate_Dashboard_Page()
	{
		
		return wait_Obj.until(ExpectedConditions.visibilityOf(dashboard_Header)).isDisplayed();
	}
	
	
	public void capture_Dashboard_Page_Screenshot()
	{
		File Source=take_Screenshot_Object.getScreenshotAs(OutputType.FILE);
		
		File Target = new File(System.getProperty("user.dir")+"/Screenshots/Valid"+random_int_Obj.nextInt(10000)+".png");
		
		Source.renameTo(Target);
		
	}
	

}
