package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.LoginCreatedAccount;
import org.testng.annotations.Test;

public class LoginCreatedAccountTest extends BaseTest{

	@Test
	public void loginAccount() {
		LoginCreatedAccount userPage = new LoginCreatedAccount();

		userPage.clickAdmin();
		userPage.clickUsers();
		userPage.enterSearch("sqe.user");
		userPage.clickUserIcon();
		userPage.clickLogout();
		userPage.enterUsername("sqe.user");
		userPage.enterPassword("Sqe123!@#");
		userPage.clickLoginBtn();
		userPage.clickAdmin();
		userPage.clickUsers();
		userPage.enterSearch("sqe.user");
		userPage.clickInquiryCheckbox();
		userPage.clickUserIcon();
		userPage.clickLogout();

	}

}
