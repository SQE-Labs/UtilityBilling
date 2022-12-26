package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditUser extends BasePage {
	
	 BasePage loginPage = new BasePage();
     
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
    By usersDetailsBtn = By.xpath("//p[contains(text(),'User Details')]");
    By firstNameField = By.id("firstName");
	By lastNameField = By.id("lastName");
    By saveBtn = By.xpath("//*[@id='btnDetailsSave']");
    By okBtn = By.xpath("//*[@class='btn btn-primary']");
	
	public void clickAdmin() {
	loginPage.clickBtn_custom(adminTab);
    }
	
	public void clickUsersDetails() {
	loginPage.clickBtn_custom(usersDetailsBtn);
    }
	
	public void enterFirstName(String userNameText) {
	loginPage.sendKeys_withClear(firstNameField, userNameText);
	}
	
	public void enterLastName(String userNameText) {
	loginPage.sendKeys_withClear(lastNameField, userNameText);
	}
	
	public void clickSaveBtn() {
		loginPage.clickBtn_custom(saveBtn, "SaveBtn");
	    }
	
	public void clickOkBtn() {
		loginPage.clickBtn_custom(okBtn, "OkBtn Popup");
	    }
   }


