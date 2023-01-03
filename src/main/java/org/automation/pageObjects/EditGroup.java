package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class EditGroup extends BasePage{
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
	By editGroup = By.xpath("(//*[@class='icon-group'])[1]");
	By companyName = By.xpath("//*[@name='name']");
	
	By ownerName_1 = By.xpath("//*[@name='owner1Name']");
	By ownerName_2 = By.xpath("//*[@name='owner2Name']");
	By financeName = By.xpath("//*[@name='financeName']");
	By contactName =By.xpath("//*[@name='operationName']");
	By salesName = By.xpath("//*[@name='salesName']");
	By collectionsName = By.xpath("//*[@name ='collectionName']");
	
	By ownerEmail_1 = By.xpath("//*[@name='owner1Email']");
	By ownerEmail_2 = By.xpath("//*[@name='owner2Email']");
	By financeEmail = By.xpath("//*[@name='financeEmail']");
	By contactEmail =By.xpath("//*[@name='operationEmail']");
	By salesEmail = By.xpath("//*[@name='salesEmail']");
	By collectionsEmail = By.xpath("//*[@name ='collectionEmail']");
	
	By owner1Phone1 = By.xpath("//*[@name='owner1Phone1']");
	By owner2Phone1 = By.xpath("//*[@name='owner1Phone2']");
	By financePhone1 = By.xpath("//*[@name='financePhone1']");
	By contactPhone1 =By.xpath("//*[@name='operationPhone1']");
	By salesPhone1 = By.xpath("//*[@name='salesPhone1']");
	By collectionsPhone1 = By.xpath("//*[@name ='collectionPhone1']");
	
	By owner1Phone2 = By.xpath("//*[@name='owner1Phone2']");
	By owner2Phone2 = By.xpath("//*[@name='owner2Phone2']");
	By financePhone2 = By.xpath("//*[@name='financePhone2']");
	By contactPhone2 =By.xpath("//*[@name='operationPhone2']");
	By salesPhone2 = By.xpath("//*[@name='salesPhone2']");
	By collectionsPhone2 = By.xpath("//*[@name ='collectionPhone2']");
	
	By owner1Fax = By.xpath(("//*[@name='owner1Fax']"));
	By owner2Fax = By.xpath(("//*[@name='owner2Fax']"));
	By operationFax = By.xpath(("//*[@name='operationFax']"));
	By financeFax = By.xpath(("//*[@name='financeFax']"));
	By salesFax = By.xpath(("//*[@name='salesFax']"));
	By bankName = By.xpath(("//*[@name='bankName']"));
	By bankAccount = By.xpath(("//*[@name='bankAccount']"));
	By bankAccountNumber = By.xpath(("//*[@name='bankAccountNumber']"));
	By creditCardHolder = By.xpath(("//*[@name='creditcardHolder']"));
	By dateExpired = By.xpath(("//*[@name='dateExpired']"));
	By postAddress = By.xpath(("//*[@name='postAddress']"));
	By postSub = By.xpath(("//*[@name='postSub']"));
	By postState = By.xpath(("//*[@name='postState']"));
	By postCode = By.xpath(("//*[@name='postCode']"));
	By billingAddress = By.xpath(("//*[@name='billingAddress']"));
	By billingSub =  By.xpath(("//*[@name='billingAddress']"));
	By billingState = By.xpath(("//*[@name='//*[@id='hState']|.//*[@name='billingState']']"));
	By billingCode = By.xpath(("//*[@name='billingCode']"));
	By tiabNotes = By.xpath(("//*[@name='tiabNotes']"));
	By franchiseeNotes = By.xpath(("//*[@name='franchiseeNotes']"));
	By save_changes = By.xpath(("//*[text()=' Save changes']"));
	
	
	
	public void clickAdmin() {
		ActionEngine.clickBtn_custom(adminTab);
		WebdriverWaits.waitForElementVisible(editGroup, 2);
	    }
	
	public void clickEditGroup() {
		ActionEngine.clickBtn_custom(adminTab);
	    }
	
	public void enterCompanyName(String userNameText) {
		ActionEngine.sendKeys_withClear(companyName, userNameText);
	    }
	
	public void entergroupOwner_1(String userNameText) {
		ActionEngine.sendKeys_withClear(ownerName_1, userNameText);
	    }
	
	public void entergroupOwner_2(String userNameText) {
		ActionEngine.sendKeys_withClear(ownerName_2, userNameText);
	    }

	public void enterOperationContact(String userNameText) {
		ActionEngine.sendKeys_withClear(contactName, userNameText);
	    }
	public void enterFinanceName(String userNameText) {
		ActionEngine.sendKeys_withClear(financeName, userNameText);
	    }
	public void enterSalesName(String userNameText) {
		ActionEngine.sendKeys_withClear(salesName, userNameText);
	    }
	public void enterCollectionName(String userNameText) {
		ActionEngine.sendKeys_withClear(collectionsName, userNameText);
	    }
	
	public void enterOwnerEmail_1(String userNameText) {
		ActionEngine.sendKeys_withClear(ownerEmail_1, userNameText);
	    }
	public void enterOwnerEmail_2(String userNameText) {
		ActionEngine.sendKeys_withClear(ownerEmail_2, userNameText);
	    }
	public void enterFinanceEmail(String userNameText) {
		ActionEngine.sendKeys_withClear(financeEmail, userNameText);
	    }
	public void enterContactEmail(String userNameText) {
		ActionEngine.sendKeys_withClear(contactEmail, userNameText);
	    }
	public void enterSalesEmail(String userNameText) {
		ActionEngine.sendKeys_withClear(salesEmail, userNameText);
	    }
	public void enterCollectionsEmail(String userNameText) {
		ActionEngine.sendKeys_withClear(collectionsEmail, userNameText);
	    } 
	
	public void enterOwner1Phone1(String userNameText) {
		ActionEngine.sendKeys_withClear(owner1Phone1, userNameText);
	    }
	public void enterOwner2Phone1(String userNameText) {
		ActionEngine.sendKeys_withClear(owner1Phone1, userNameText);
	    }
	public void enterFinancePhone1(String userNameText) {
		ActionEngine.sendKeys_withClear(financePhone1, userNameText);
	    }
	public void enterContactPhone1(String userNameText) {
		ActionEngine.sendKeys_withClear(contactPhone1, userNameText);
	    }
	public void enterSalesPhone1(String userNameText) {
		ActionEngine.sendKeys_withClear(salesPhone1, userNameText);
	    }
	public void enterCollectionsPhone1(String userNameText) {
		ActionEngine.sendKeys_withClear(collectionsPhone1, userNameText);
	    } 
	
	public void enterOwner1Phone2(String userNameText) {
		ActionEngine.sendKeys_withClear(owner1Phone2, userNameText);
	    }
	public void enterOwner2Phone2(String userNameText) {
		ActionEngine.sendKeys_withClear(owner1Phone2, userNameText);
	    }
	public void enterFinancePhone2(String userNameText) {
		ActionEngine.sendKeys_withClear(financePhone2, userNameText);
	    }
	public void enterContactPhone2(String userNameText) {
		ActionEngine.sendKeys_withClear(contactPhone2, userNameText);
	    }
	public void enterSalesPhone2(String userNameText) {
		ActionEngine.sendKeys_withClear(salesPhone2, userNameText);
	    }
	public void enterCollectionsPhone2(String userNameText) {
		ActionEngine.sendKeys_withClear(collectionsPhone2, userNameText);
	    } 
}





