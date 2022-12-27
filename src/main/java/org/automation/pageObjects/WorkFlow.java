package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class WorkFlow {
	
	BasePage loginPage = new BasePage();
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
    By workFlowTypes = By.xpath("(//*[@class='quick-button-small'])[22]");
    By createNewLog = By.id("addBtn");
    By displayNameField = By.xpath("//*[@name='display_name']");
	By typeNameField = By.xpath("//*[@name='type_name']");
	By saveButton = By.xpath("//button[@class='btn btn-primary save-logtype']");
	By searchLog = By.xpath("//*[@id=\"datatableLogType_filter\"]/label/input");
	By firstRecord = By.xpath("//tbody[@id='logtypeListBody']//tr[1]//td[]");
    
    
    
	
	public void clickAdmin() {
		loginPage.clickBtn_custom(adminTab);
	    }
	
	public void clickWorkFlowTypes() {
		loginPage.clickBtn_custom(workFlowTypes);
	    }
	public void clickCreateNewlog() {
		loginPage.clickBtn_custom(createNewLog);
	}
	
	public void enterDisplayName(String userNameText ) {
		loginPage.sendKeys_custom(displayNameField, userNameText);
	    }
	
	public void enterTypename(String userNameText ) {
		loginPage.sendKeys_custom(typeNameField, userNameText);
	    }
	
	public void clickSaveButton() {
		loginPage.clickBtn_custom(saveButton);
	    }
	
	public void enterSearchLog(String userNameText ) {
		loginPage.sendKeys_custom(searchLog, userNameText);
	    }
	
}
