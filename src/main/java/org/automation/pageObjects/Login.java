package org.automation.pageObjects;

import org.automation.utilities.ActionEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login extends ActionEngine {
	ActionEngine AOBJ = new ActionEngine(driver);


//	public Login (WebDriver driver){
//		super(driver);
//	}

	public Login(WebDriver driver) {
		super(driver);
	}

	//	WebElement LoginButton = driver.findElement(By.xpath("//button[@value='Log In']"));
	public void enterUsername(WebDriver driver , String userNameText) throws InterruptedException {
		WebElement userNameField=driver.findElement(By.xpath("//input[@name='j_username']"));
		AOBJ.sendKeys_custom(userNameField, userNameText);
	}
		public void enterPassword(WebDriver driver, String passNameText) throws InterruptedException {
			WebElement PasswordField = driver.findElement(By.xpath("//input[@name='predigpass']"));
			AOBJ.sendKeys_custom(PasswordField, passNameText);
     }
		
		public void login(WebDriver driver) throws InterruptedException {
			WebElement login = driver.findElement(By.xpath("//*[@name='submit']"));
			AOBJ.click_custom(login, "Login");
    }
}