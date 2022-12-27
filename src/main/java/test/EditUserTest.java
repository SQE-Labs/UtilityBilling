package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.EditUser;
import org.automation.utilities.PropertiesUtil;
import org.automation.pageObjects.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditUserTest extends BaseTest {
	
	@BeforeClass
	public void login(){
		try {
	
			LoginPage loginPage = new LoginPage();
		    System.out.println(      getDriver().getTitle());
			loginPage.login(PropertiesUtil.getPropertyValue("userName"),PropertiesUtil.getPropertyValue("password"));

		}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	}

	@Test(priority = 1,description = "To Edit User ")
	public void EditUser() throws InterruptedException {
		EditUser srvAdm = new EditUser();
		srvAdm.clickAdmin();
		srvAdm.clickUsersDetails();
		Thread.sleep(2000);
		srvAdm.enterFirstName("Adams");
		srvAdm.enterLastName("josh");
		Thread.sleep(2000);
		srvAdm.clickSaveBtn();
		srvAdm.clickOkBtn();
  }
}
