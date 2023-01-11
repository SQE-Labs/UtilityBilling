package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.CreateAdminAccount;
import org.testng.annotations.Test;

public class CreateAdminAccountTest extends BaseTest{
	
	
	@Test
	public void createAccount() {
		
		CreateAdminAccount adminPage = new CreateAdminAccount();
		
		adminPage.clickAdmin();
		adminPage.clickUsers();
		adminPage.clickCreateNewUser();
		adminPage.selectGroup("testing002");
		adminPage.enterUsername("sawwfss");
		adminPage.enterPassword("Test@12345");
		adminPage.clickSaveUser();
		
	}

}
