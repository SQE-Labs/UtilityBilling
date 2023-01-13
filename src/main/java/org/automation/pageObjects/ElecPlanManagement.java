package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class ElecPlanManagement extends BasePage {
	
	By ratePlans = By.xpath("//*[@title='Plans']");
	By createNewPlan = By.xpath("//*[@id='addBtn']");
	By group = By.xpath("//*[@id='groupNo']");
	By usageTypes = By.xpath("//*[@id='usageTypes']");
	By name = By.xpath("//*[@id='name']");
	By dateFromValid = By.xpath("//*[@name='dateValidFrom']");
	By dateToValid = By.xpath("//*[@name='dateValidTo']");
	By dateValidFrom = By.xpath("//td[@class='active day']");
	By dateValidTo = By.xpath("//td[@class='active day']");
	By addTarrif = By.id("addTrfBtn");
	By chargeDescription = By.xpath("//*[@name='charge-desc']");
	By rollupDescription = By.xpath("//*[@name='rollup-desc']");
	By chargeType = By.xpath("//*[@name='charge-type']");
	By allocation = By.xpath("//*[@name='alloc']");
	By ratingMethod = By.xpath("//*[@name='method-type']");
	By unit = By.xpath("//*[@name='unit-type']");
	By rate = By.xpath("//*[@name='rate']");
	By taxType = By.xpath("//*[@name='tax-type']");
	By addButton = By.id("addTrf");
	By publish = By.id("publishBtn");
	By successMsg = By.xpath("//*[@id=\"successPlnAlrt\"]/div/center/p/strong");
	
	String  SUCCESS_MESG="Adam johhns has been sucessfully";
	
	
	public void assertSuccessMessage() 
	{
		WebdriverWaits.sleep(2);
		Assertions ass=new Assertions();
		ass.assertStrings(SUCCESS_MESG,ActionEngine.getText_custom(successMsg));	
	}
	
	public void clickPublish() {
		ActionEngine.clickBtn_custom(publish);
		WebdriverWaits.waitForElementVisible(publish, 2);	
	}
	

	    public void clickAdd() {
		ActionEngine.clickBtn_custom(addButton);
		WebdriverWaits.waitForElementVisible(publish, 2);	
	}
	

		public void clickRatePlans() {
			ActionEngine.clickBtn_custom(ratePlans);
			WebdriverWaits.waitForElementVisible(ratePlans, 2);	
		}
		
		public void clickCreateNewPlan() {
			ActionEngine.clickBtn_custom(createNewPlan);
			//WebdriverWaits.waitForElementVisible(dateValidFrom, 2);
		}
		
		public void selectGroup(String groupSelect) {
			ActionEngine.selectDropDownByVisibleText_custom(group, groupSelect,"Select Group Dropdown");
			WebdriverWaits.waitForElementVisible(group, 1);
		      } 
		
		public void selectUsageTypes(String usagetype ) {
			ActionEngine.selectDropDownByVisibleText_custom(usageTypes, usagetype,"Usage Type Dropdown");
			WebdriverWaits.waitForElementVisible(usageTypes, 1);
		      } 
		
		public void enterName(String nameText) {
			ActionEngine.sendKeys_withClear(name, nameText);
		    }
		
		public void selectDateFrom(String dateFrom ) {
			WebdriverWaits.waitForElementVisible(dateValidFrom, 5);
			ActionEngine.selectDropDownByVisibleText_custom(dateValidFrom, dateFrom,"Select Today Date");
			ActionEngine.clickBtn_custom(dateValidFrom);
		      } 
	
		public void selectDateTo(String dateTo) {
			WebdriverWaits.waitForElementVisible(dateValidTo, 1);
			ActionEngine.selectDropDownByVisibleText_custom(dateValidTo, dateTo,"Select Today Date");
			ActionEngine.clickBtn_custom(dateValidTo);
		      } 
		
		public void clickDateFrom() {
			ActionEngine.clickBtn_custom(dateFromValid);
			WebdriverWaits.waitForElementVisible(dateValidFrom, 2);	
		}
		
		public void clickDateTo() {
			ActionEngine.clickBtn_custom(dateToValid);
			WebdriverWaits.waitForElementVisible(dateValidTo, 2);	
		}
		
		public void clickAddTarif() {
			ActionEngine.clickBtn_custom(addTarrif);
			WebdriverWaits.waitForElementVisible(addTarrif, 2);	
		}
		
		public void enterChargeDescriptrion(String descriptionText) {
			ActionEngine.sendKeys_withClear(chargeDescription, descriptionText);
		    }
		
		public void enterRollupDescriptrion(String rollupText) {
			ActionEngine.sendKeys_withClear(rollupDescription, rollupText);
		    }
		
		public void enterRate(String rateText) {
			ActionEngine.sendKeys_withClear(rate, rateText);
		    }
		
		public void selectChargeType(String chargeTypeText) {
			WebdriverWaits.waitForElementVisible(chargeType, 2);
			ActionEngine.selectDropDownByVisibleText_custom(chargeType, chargeTypeText,"Select Charge Type");
		      } 
		public void selectAllocation(String allocationText) {
			WebdriverWaits.waitForElementVisible(allocation, 4);
			ActionEngine.selectDropDownByVisibleText_custom(allocation, allocationText,"Select Allocation");
		      } 
		public void selectRatingMethod(String ratingMethodText) {
			ActionEngine.clickBtn_custom(ratingMethod);
			WebdriverWaits.waitForElementVisible(ratingMethod, 3);
			ActionEngine.selectDropDownByVisibleText_custom(ratingMethod, ratingMethodText,"Select Rating Method");
		      } 
		public void selectUnit(String unitText) {
			ActionEngine.clickBtn_custom(unit);
			WebdriverWaits.waitForElementVisible(unit, 5);
			ActionEngine.selectDropDownByVisibleText_custom(unit, unitText,"Select Unit");

		      } 
		public void selectTaxType(String textTypeText) {
			WebdriverWaits.waitForElementVisible(taxType, 1);
			ActionEngine.selectDropDownByVisibleText_custom(taxType, textTypeText,"Select TaxType");
		      } 
		
		
	}


