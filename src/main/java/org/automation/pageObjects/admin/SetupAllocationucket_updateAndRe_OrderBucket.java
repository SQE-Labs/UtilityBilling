package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class SetupAllocationucket_updateAndRe_OrderBucket extends BasePage {
	
	public  By AdminIcon = By.xpath("//a[@title='Administration']/i");
	
	
	public void clickAdmin() {
        clickBtn_custom(AdminIcon);
    }

}
