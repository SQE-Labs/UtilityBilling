package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.Login;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority = 0,description = "To verify login functionality")
	public void ValidLogin() throws InterruptedException {
		Login login = new Login();

		login.enterUsername("UserName",PropertiesUtil.getPropertyValue("userName"));
		
		Thread.sleep(1000);
		login.enterPassword("Password",PropertiesUtil.getPropertyValue("password"));
		Thread.sleep(1000);
		login.clickLoginBtn();
		
	//	Assert.assertEquals(driver.getCurrentUrl(),PropertiesUtil.getPropertyValue("https://test.utilitybilling.com/billing/");
	}
}
