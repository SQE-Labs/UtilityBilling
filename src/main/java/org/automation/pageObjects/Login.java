package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.base.BaseTest;
import org.automation.utilities.ActionEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login extends BasePage {
     BasePage loginPage = new BasePage();
			By userNameField=By.xpath("//input[@name='j_username']");
			By PasswordField = By.xpath("//input[@name='predigpass']");
			By login = By.xpath("//*[@name='submit']");

	//	WebElement LoginButton = driver.findElement(By.xpath("//button[@value='Log In']"));
	public void enterUsername( String fieldName, String userNameText) {
		loginPage.sendKeys_custom(userNameField,fieldName, userNameText);
		
	}
		public void enterPassword( String fieldName , String passNameText)  {
			loginPage.sendKeys_custom(PasswordField,fieldName, passNameText);
     }
		
		public void clickLoginBtn() {
			loginPage.clickBtn_custom(login, "Login");
    }
		public void navigateToLoginPage()  {
			//
    }
}