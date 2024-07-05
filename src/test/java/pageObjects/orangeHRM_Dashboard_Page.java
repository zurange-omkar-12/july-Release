package pageObjects;

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
	
	

}
