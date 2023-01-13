package org.automation.pageObjects;

import java.util.random.RandomGenerator;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;



public class CreateAdminAccount extends BasePage {
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
	By users = By.xpath("(//*[@class='quick-button-small'])[6]");
	By createNewUser = By.xpath("(//*[@class='btn btn-primary'])[2]");
	By group = By.xpath("//*[@class='filter-option pull-left']");
	By group2 = By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div/div[2]/form/div[1]/div/div/div/ul/li/a");
	By username = By.id("uid");
	By Password = By.id("predigpass");
	By saveUser = By.xpath("(//*[@class='btn btn-primary'])[2]");
	
	
	public void clickAdmin() {
		ActionEngine.clickBtn_custom(adminTab);
		WebdriverWaits.waitForElementVisible(users, 3);
	    }
	
	public void clickUsers() {
        ActionEngine.clickBtn_custom(users);
		WebdriverWaits.waitForElementVisible(createNewUser, 2);
	}
	
	public void clickCreateNewUser() {
		ActionEngine.clickBtn_custom(createNewUser);
	//	WebdriverWaits.waitForElementVisible(Users, 2);
	}
	
	public void selectGroup(String groupText) {
		ActionEngine.clickBtn_custom(group);
		WebdriverWaits.waitForElementVisible(group, 3);
		ActionEngine.clickBtn_custom(group2);	
	      } 
	
	public void enterUsername(String userNameText) {
		ActionEngine.sendKeys_withClear(username, userNameText);
	    }
	
	public void enterPassword(String userNameText) {
		ActionEngine.sendKeys_withClear(Password, userNameText);
	    }
	
	public void clickSaveUser() {
		ActionEngine.clickBtn_custom(saveUser);
	}

}
