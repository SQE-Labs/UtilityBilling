package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.EditUser;
import org.automation.utilities.PropertiesUtil;
import org.automation.pageObjects.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditUserTest extends BaseTest {
	

	@Test(priority = 1,description = "To Edit User ")
	public void EditUser() throws InterruptedException {
		EditUser Eu = new EditUser();
		Eu.clickAdmin();
		Eu.clickUsersDetails();
		Thread.sleep(2000);
		Eu.enterFirstName("Adams");
		Eu.enterLastName("josh");
		Thread.sleep(2000);
		Eu.clickSaveBtn();
		Eu.clickOkBtn();
  }
}
