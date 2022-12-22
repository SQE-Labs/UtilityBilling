package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SrvAdministration extends BasePage {
	
	 BasePage loginPage = new BasePage();
     
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
    By usersDetailsBtn = By.xpath("//p[contains(text(),'User Details')]");
    By firstNameField = By.id("firstName");
	By lastNameField = By.id("lastName");
    By saveBtn = By.xpath("//*[@id='btnDetailsSave']");
    By okBtn = By.xpath("//*[@class='btn btn-primary']");
	
	public void ClickAdmin() {
	loginPage.clickBtn_custom(adminTab, "AdminTab");
    }
	
	public void ClickUsersDetails() {
	loginPage.clickBtn_custom(usersDetailsBtn, "UserDetailsTab");
    }
	
	public void ClearfirstNameField() {
	loginPage.clear_custom(firstNameField, "FirstName");
	}
	
	public void EnterfirstName( String fieldName, String userNameText) {
	loginPage.sendKeys_custom(firstNameField,fieldName, userNameText);
	}
	
	public void ClearlastNameField() {
	loginPage.clear_custom(firstNameField, "FirstName");
	}
		
	public void EnterlastName( String fieldName, String userNameText) {
	loginPage.sendKeys_custom(firstNameField,fieldName, userNameText);
	}
	
	public void ClicksaveBtn() {
		loginPage.clickBtn_custom(saveBtn, "SaveBtn");
	    }
	
	public void ClickoKBtn() {
		loginPage.clickBtn_custom(okBtn, "OkBtn Popup");
	    }
   }


