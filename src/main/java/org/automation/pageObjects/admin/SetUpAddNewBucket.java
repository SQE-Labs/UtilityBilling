package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class SetUpAddNewBucket extends BasePage {
	
	BasePage bp=new BasePage();
	
	public By adminIcon = By.xpath("//a[@title='Administration']/i");
	public By allocation = By.xpath("(//*[@class='quick-button-small'])[19]");
	public By addAllocation = By.xpath("//*[@class='btn btn-mini btn-primary']");
	public By discription = By.id("newBucket");
	public By list = By.xpath("//*[@id=\"myModal\"]/div/div/div/div/div[3]/div[2]/button");
	
	
	public void clickAdmin() {
        clickBtn_custom(adminIcon);
    }
	
	public void clickAllocation() {
		bp.scrollIntoView(allocation);
        click_custom(allocation);
    }
	
	public void clickAddAllocation() {
		bp.scrollIntoView(addAllocation);
		click_custom(addAllocation);
    }
	
	 public void enterDescription(String emailText) 
	    {
	    	sendKeys_custom(discription, emailText, "Email");
	    }
	 public void clickAddToList() {
	        click_custom(list);
	    }
	 
	public void setUpBucket(String emailText) throws InterruptedException {
		clickAdmin();
		clickAllocation();
		clickAddAllocation();
		enterDescription(emailText);
		clickAddToList();
	}
	

}
