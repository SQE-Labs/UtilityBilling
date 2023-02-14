package org.automation.pageObjects.ratePlans;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class Autogenrate_Four_plans extends BasePage {
	
	By ratePlans = By.xpath("//*[@title='Plans']");
	By searchField = By.xpath("//*[@id='datatablePlnList_filter']/label/input");
    By successMsg = By.xpath("//*[@id='plnListBody']/tr/td[7]");
	By validatePlans = By.xpath("//tbody[@id='plnListBody']//td[3]");
	By validateAuto = By.xpath("//tbody[@id='plnListBody']//td[7]");

    String EXPECTED_LABEL_AUTOGENERATED = "autogenerated";
    String EXPECTED_LABEL_GAS = "Gas";
    String EXPECTED_LABEL_ELECTRICITY = "Retail Electricity";
    String EXPECTED_LABEL_WATER = "Water";
	    
	 public void validateGasPlan() {
	     WebdriverWaits.sleep(2);
	     Assertions ass = new Assertions();
	     ass.assertStrings(EXPECTED_LABEL_GAS, getText_custom(validatePlans));
	    }
	 
	 public void validateAutoPlan() {
	     WebdriverWaits.sleep(2);
	     Assertions ass = new Assertions();
	     ass.assertStrings(EXPECTED_LABEL_AUTOGENERATED, getText_custom(validateAuto));
	    }

	 
	 public void validateElectricityPlan() {
	     WebdriverWaits.sleep(2);
	     Assertions ass = new Assertions();
	     ass.assertStrings(EXPECTED_LABEL_ELECTRICITY, getText_custom(validatePlans));
	    }

	 
	 public void validateWaterPlan() {
	     WebdriverWaits.sleep(2);
	     Assertions ass = new Assertions();
	     ass.assertStrings(EXPECTED_LABEL_WATER, getText_custom(validatePlans));
	    }


	
	public void clickRatePlans() {
		click_custom(ratePlans);
        WebdriverWaits.waitForElementVisible(ratePlans, 2);
    }
	
	
    public void enterPlanName(String planNameText) {
	    sendKeys_withClear(searchField, planNameText);
	    WebdriverWaits.waitForElementVisible(ratePlans, 2);
	    }
    
    
    public void auto_Generate(String planNameText,String planNameText1,String planNameText2,String planNameText3) throws InterruptedException {
		clickRatePlans();
		enterPlanName(planNameText);		
		validateAutoPlan();
		enterPlanName(planNameText1);
		validateGasPlan();
		enterPlanName(planNameText2);
		validateElectricityPlan();
		enterPlanName(planNameText3);
		validateWaterPlan();
    }
}