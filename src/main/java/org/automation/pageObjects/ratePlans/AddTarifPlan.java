package org.automation.pageObjects.ratePlans;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class AddTarifPlan extends BasePage{
	
	By ratePlans = By.xpath("//*[@title='Plans']");
    By createNewPlan = By.xpath("//*[@id='addBtn']");
    By addTarrif = By.id("addTrfBtn");
    By chargeDescription = By.xpath("//*[@name='charge-desc']");
    By rollupDescription = By.xpath("//*[@name='rollup-desc']");
    By chargeType = By.xpath("//*[@name='charge-type']");
    By allocation = By.xpath("//*[@name='alloc']");
    By ratingMethod = By.xpath("//*[@name='method-type']");
  //*[@id="unit-type"]
    By unit = By.xpath("//*[@id='unit-type']");
    By rate = By.xpath("//*[@name='rate']");
    By taxType = By.xpath("//*[@name='tax-type']");
    By addButton = By.id("addTrf");
    By publish = By.id("publishBtn");
    By crossIcon = By.xpath("//*[@id='closeBtn']/i"); 
    By successMsg = By.xpath("//*[@id=\"errAlert\"]/div/center/text()");
    

    String SUCCESS_MESG = "The following errors have occured:";

    public void assertSuccessMessage() {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertStrings(SUCCESS_MESG, getText_custom(successMsg));
    }

    public void clickPublish() {
    	click_custom(publish);
        WebdriverWaits.waitForElementVisible(publish, 2);
    }


    public void clickCrossIcon() {
    	WebdriverWaits.waitForElementVisible(crossIcon, 2);
    	click_custom(crossIcon);
       // WebdriverWaits.waitForElementVisible(crossIcon, 2);
    }
    public void clickAdd() {
    	 WebdriverWaits.waitForElementVisible(addTarrif, 2);
    	click_custom(addButton);
        WebdriverWaits.waitForElementVisible(publish, 2);
    }


    public void clickRatePlans() {
    	click_custom(ratePlans);
        WebdriverWaits.waitForElementVisible(ratePlans, 2);
    }

    public void clickCreateNewPlan() {
    	click_custom(createNewPlan);
    }

    public void clickAddTarif() {
    	// WebdriverWaits.waitForElementVisible(addTarrif, 2);
    	click_custom(addTarrif);
      //  WebdriverWaits.waitForElementVisible(addTarrif, 2);
    }

    public void enterChargeDescriptrion(String descriptionText) {
        sendKeys_withClear(chargeDescription, descriptionText);
    }

    public void enterRollupDescriptrion(String rollupText) {
        sendKeys_withClear(rollupDescription, rollupText);
    }

    public void enterRate(String rateText) {
        sendKeys_withClear(rate, rateText);
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
    	click_custom(ratingMethod);
        WebdriverWaits.waitForElementVisible(ratingMethod, 3);
        selectDropDownByVisibleText_custom(ratingMethod, ratingMethodText, "Select Rating Method");
       
    }

    public void selectUnit(String unitText){
    	click_custom(unit);
        WebdriverWaits.waitForElementVisible(unit, 8);
        selectDropDownByVisibleText_custom(unit, unitText, "Select Unit");

    }

    public void selectTaxType(String textTypeText) {
        WebdriverWaits.waitForElementVisible(taxType, 1);
        selectDropDownByVisibleText_custom(taxType, textTypeText, "Select TaxType");
    }
    public void addTarif(String descriptionText,String rollupText, String chargeTypeText,String allocationText,String ratingMethodText,String unitText,String rateText) throws InterruptedException {
    	clickRatePlans();
		clickCreateNewPlan();
		clickAddTarif();
		enterChargeDescriptrion(descriptionText);
		enterRollupDescriptrion(rollupText);
		selectChargeType(chargeTypeText);
		selectAllocation(allocationText);
		Thread.sleep(1000);
		selectRatingMethod(ratingMethodText);
		Thread.sleep(1000);
		enterRate(rateText);
		selectUnit(unitText);
		clickAdd();
		assertSuccessMessage();
		clickCrossIcon();
		
    }

}
