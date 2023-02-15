package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.userManager.Password;
import org.testng.annotations.Test;

public class ChangePasswordTest extends BaseTest {

	@Test(priority = 1,description = "Change Password")
	public void changePassword()  {
		Password cp = new Password();
		cp.clickAdmin();
		cp.clickPassword();
		cp.enterNewPassword("sqe.user");
		cp.ReEnterNewPassword("sqe.user");
		cp.clickChangePassword();
		cp.clickConfirmPopup();
		cp.getInformationMessage();
  }
}
