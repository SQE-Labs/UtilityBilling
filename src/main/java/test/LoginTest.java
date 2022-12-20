package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.Login;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	Login login = new Login(driver);
	@Test(priority = 0,description = "To verify login functionality")
	public void ValidLogin() throws InterruptedException {

		login.enterUsername(driver,PropertiesUtil.getPropertyValue("userName"));
		Thread.sleep(1000);
		login.enterPassword(driver,PropertiesUtil.getPropertyValue("password"));
		Thread.sleep(1000);
		login.login(driver);
	//	Assert.assertEquals(driver.getCurrentUrl(),PropertiesUtil.getPropertyValue("https://test.utilitybilling.com/billing/");
	}
}
