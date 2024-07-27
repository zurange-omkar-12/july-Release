package testCases;

import org.testng.annotations.Test;
 

import pageObjects.*;

public class TC002 extends Base_Class_For_Test_Cases {

	@Test(dataProvider = "Credential_Provider")
	public void user_Login(user_Details USER) {

		HRM_Login_Page = new orangeHRM_Login_Page(driver_Obj);
		HRM_Dashboard_Page = new orangeHRM_Dashboard_Page(driver_Obj);

		HRM_Login_Page.login_Function(USER.get_userNAME(), USER.get_passWORD());

		if (USER.expecTED) {
			System.out.println("TRUE");
			softAssert_Obj.assertTrue(HRM_Dashboard_Page.validate_Dashboard_Page());
			HRM_Dashboard_Page.capture_Dashboard_Page_Screenshot();
			HRM_Dashboard_Page.Dashboard_Page_Logout();

		} else {
			softAssert_Obj.assertTrue(HRM_Login_Page.check_Invalid_Validation());
			HRM_Login_Page.capture_Invalid_Login_Details_Screenshot();
		}

		softAssert_Obj.assertAll();

	}

}
