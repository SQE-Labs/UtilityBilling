package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class LoginCreatedAccount extends BasePage{
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
	By users = By.xpath("(//*[@class='quick-button-small'])[6]");
	By search = By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input");
	By userIcon = By.xpath("(//*[@class='btn dropdown-toggle'])[4]");
	By logout = By.xpath("//*[@id=\"upperHeaderRightPart\"]/li[4]/ul/li[5]/a");
	By userNameField=By.xpath("//input[@name='j_username']");
	By PasswordField = By.xpath("//input[@name='predigpass']");
	By login = By.xpath("//*[@name='submit']");
	By checkbox = By.id("chksqe.user:3");
	
	
	public void clickAdmin() {
		ActionEngine.clickBtn_custom(adminTab);
		WebdriverWaits.waitForElementVisible(users, 3);
	    }
	
	public void clickInquiryCheckbox() {
		ActionEngine.clickBtn_custom(checkbox);
		WebdriverWaits.waitForElementVisible(checkbox, 3);
	    }
	
	public void clickUsers() {
        ActionEngine.clickBtn_custom(users);
	}
	
	public void enterSearch(String searchnameText) {
		ActionEngine.sendKeys_withClear(search, searchnameText);
	    }
	
	public void clickUserIcon() {
        ActionEngine.clickBtn_custom(userIcon);
	}
	
	public void clickLogout() {
        ActionEngine.clickBtn_custom(logout);
	}
	
	public void enterUsername(String userNameText) {
		ActionEngine.sendKeys_withClear(userNameField, userNameText);
	}
	
		public void enterPassword(String passNameText)  {
			ActionEngine.sendKeys_withClear(PasswordField ,passNameText);
     }
		
		public void clickLoginBtn() {
			ActionEngine.clickBtn_custom(login);
    }
}
