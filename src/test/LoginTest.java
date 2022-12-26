package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.LoginPage;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(description = "To verify login functionality")
	public void ValidLogin() throws InterruptedException {
		LoginPage login = new LoginPage();

		login.enterUsername("UserName",PropertiesUtil.getPropertyValue("userName"));
		login.enterPassword("Password",PropertiesUtil.getPropertyValue("password"));
		
		//login button
		login.clickLoginBtn();
		
		//Assert.assertEquals(getDriver().getCurrentUrl(),PropertiesUtil.getPropertyValue("https://test.utilitybilling.com/billing/index.jsp"));
	}
}
