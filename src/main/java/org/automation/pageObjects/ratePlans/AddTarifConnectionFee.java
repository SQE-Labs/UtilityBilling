package org.automation.pageObjects.ratePlans;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class AddTarifConnectionFee extends BasePage {
	
			
			By ratePlans = By.xpath("//*[@title='Plans']");
		    By createNewPlan = By.xpath("//*[@id='addBtn']");
		    By addTarrif = By.id("addTrfBtn");
		    By chargeDescription = By.xpath("//*[@name='charge-desc']");
		    By rollupDescription = By.xpath("//*[@name='rollup-desc']");
		    By chargeType = By.xpath("//*[@name='charge-type']");
		    By allocation = By.xpath("//*[@name='alloc']");
		    By ratingMethod = By.xpath("//*[@name='method-type']");
		    By unit = By.xpath("//*[@name='unit-type']");
		    By rate = By.xpath("//*[@name='rate']");
		    By taxType = By.xpath("//*[@name='tax-type']");
		    By addButton = By.xpath("//*[@id=\"addTrf\"]");
		    By tieredRatesFrom = By.id("ulow");
		    By tieredRatesTo = By.id("uhigh");
		    By tieredRatesRate = By.id("rateR");
		    By addRange =By.id("addRangeBtn");
		    By successMsg =By.xpath("//*[@id='datatablePreview_info']");
		 
		    String SUCCESS_MESG = "Showing 1 to 1 of 1 entries";
		    
		    
		    public void assertSuccessMessage() {
		        WebdriverWaits.sleep(2);
		        Assertions ass = new Assertions();
		        ass.assertStrings(SUCCESS_MESG, getText_custom(successMsg));
		    }
		   
		    
		    public void clickAddRange() {
		        clickBtn_custom(addRange);
		        WebdriverWaits.waitForElementVisible(addRange, 2);
		    }

		    public void enterTieredRatesFrom(String fromRateText) {
		        sendKeys_withClear(tieredRatesFrom, fromRateText);
		    }
		    
		    public void enterTieredRatesTo(String toRateText) {
		        sendKeys_withClear(tieredRatesTo, toRateText);
		    }
		    
		    public void enterTieredRatesRate(String ratesText) {
		        sendKeys_withClear(tieredRatesRate, ratesText);
		    }

		    public void enterRate(String rateText) {
		        sendKeys_withClear(rate, rateText);
		    }

		    public void clickAdd() {
		        clickBtn_custom(addButton);
		 //       WebdriverWaits.waitForElementVisible(addButton, 2);
		    }


		    public void clickRatePlans() {
		        clickBtn_custom(ratePlans);
		        WebdriverWaits.waitForElementVisible(ratePlans, 2);
		    }

		    public void clickCreateNewPlan() {
		        clickBtn_custom(createNewPlan);
		        //WebdriverWaits.waitForElementVisible(dateValidFrom, 2);
		    }

		    public void clickAddTarif() {
		        clickBtn_custom(addTarrif);
		        WebdriverWaits.waitForElementVisible(addTarrif, 2);
		    }

		    public void enterChargeDescriptrion(String descriptionText) {
		        sendKeys_withClear(chargeDescription, descriptionText);
		    }

		    public void enterRollupDescriptrion(String rollupText) {
		        sendKeys_withClear(rollupDescription, rollupText);
		    }

		    public void selectChargeType(String chargeTypeText) {
		        WebdriverWaits.waitForElementVisible(chargeType, 2);
		        selectDropDownByVisibleText_custom(chargeType, chargeTypeText, "Select Charge Type");
		    }

		    public void selectAllocation(String allocationText) {
		        WebdriverWaits.waitForElementVisible(allocation, 4);
		        selectDropDownByVisibleText_custom(allocation, allocationText, "Select Allocation");
		    }

		    public void selectRatingMethod(String ratingMethodText) {
		        clickBtn_custom(ratingMethod);
		        WebdriverWaits.waitForElementVisible(ratingMethod, 3);
		        selectDropDownByVisibleText_custom(ratingMethod, ratingMethodText, "Select Rating Method");
		        clickBtn_custom(unit);
		    }

		    public void selectUnit(String unitText){
		        clickBtn_custom(unit);
		        WebdriverWaits.waitForElementVisible(unit, 5);
		        selectDropDownByVisibleText_custom(unit, unitText, "Select Unit");

		    }

		    public void selectTaxType(String textTypeText) {
		        WebdriverWaits.waitForElementVisible(taxType, 1);
		        selectDropDownByVisibleText_custom(taxType, textTypeText, "Select TaxType");
		    }
		    public void addTarifConnection(String descriptionText,String rollupText, String chargeTypeText,String allocationText,String ratingMethodText,String unitText,String rateText ,String textTypeText) throws InterruptedException {
		    	clickRatePlans();
				clickCreateNewPlan();
				clickAddTarif();
				enterChargeDescriptrion(descriptionText);
				enterRollupDescriptrion(rollupText);
				selectChargeType(chargeTypeText);
				selectAllocation(allocationText);
				selectRatingMethod(ratingMethodText);
				Thread.sleep(1000);
				selectUnit(unitText);
				enterRate(rateText);
				selectTaxType(textTypeText);
				clickAdd();
				assertSuccessMessage();
		
				
		    }

		}



