package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChargePage 
{
	BasePage bp=new BasePage();
	
	//Charges
	public  By Chargetab= By.xpath("//a[text()=' Charges']");
	public  By AddIconForManualCharge= By.xpath("//a[@title='Add Charge']");
	public  By ServiceDropdownField= By.xpath("//select[@name='lineSeqNo']");
	public  By ChargeDescriptionField= By.xpath("//input[@name='description']"); 
	public  By RollupDescriptionField= By.xpath("//input[@name='rollupDescription']");  
	public  By unitsField= By.xpath("//input[@name='units']");  
	public  By rateField= By.xpath("//input[@name='rate']");  
	public  By ActiveDayField= By.xpath("//td[@class='active day']");  
	public  By PriceChargeDollarField= By.xpath("//input[@name='price_charge_dollar']");  
	public  By SaveButton= By.xpath("//a[@value='Save']");  
	public  By ClickOnDatepickerField= By.xpath("//input[@id='dateStart']");  
	public  By clickOnOkButton= By.xpath("//button[@class='btn btn-default'])[2]");
	
	//Recurring Charges
	public  By AddIconForRecurringCharge= By.xpath("(//i[@class='icon-plus'])[2]");
	public  By ServiceDropdownRecurringField= By.xpath("//select[@name='lineSeqNo']");
	public  By CodeField= By.xpath("//select[@name='code']");
	public  By CurrentDateField= By.xpath("//td[@class='active day']");
	public  By PlanNameField= By.xpath("//input[@name='planName']");
	public  By NumberOfPeriodsField= By.xpath("//input[@name='cycleInMonth']");
	public  By ChargeOngoingField= By.xpath("//input[@name='chargeOngoing']");
	
	
	public  void clickOnChargeTab() 
	{
		ActionEngine.clickBtn_custom(Chargetab, "Charge");
	}
	public  void clickOnSaveBtn() 
	{
		ActionEngine.clickBtn_custom(SaveButton, "Save");
	}
	public void clickOnPlusIcon()
	{
		ActionEngine.clickBtn_custom(AddIconForManualCharge, "Plus Icon");
	}
	
	public void selectService(int serviceByIndex)
	{
		ActionEngine.selectDropDownByIndex_custom(ServiceDropdownField, serviceByIndex, "Service");
	}
	
	public void enterChargeDesciption(String chargeDescriptionText)
	{
		ActionEngine.sendKeys_custom(ChargeDescriptionField, chargeDescriptionText," Charge Desciption" );
	}
	
	public void enterRolupDesciption(String rollupDescriptionText)
	{
		ActionEngine.sendKeys_custom(ChargeDescriptionField, rollupDescriptionText," Rollup Desciption" );
	}
	
	public void enterStartDate()
	{
		ActionEngine.clickBtn_custom(ClickOnDatepickerField, "Start Date");
		ActionEngine.clickBtn_custom(ActiveDayField, "Datepicker");
	}
	
	public void enterUnitsRate(String unitText)
	{
		ActionEngine.sendKeys_custom(unitsField, unitText,"Unit" );
	}
	
	public void enterFlatRate(String rateText) 
	{
		ActionEngine.sendKeys_custom(rateField, rateText,"Rate" );
	}
	
	public void enterPriceChargeDollar(String PriceChargetext)
	{
		ActionEngine.sendKeys_custom(PriceChargeDollarField, PriceChargetext,"Charge" );
	}
	
	public void clickOkButton() 
	{
		ActionEngine.clickBtn_custom(clickOnOkButton, "Ok");
	}
	
	public void addOnceOffCharges(int selectService,String ChargeDescriptionText, String rollUpText, int x, int y, String unitRateText, String flatRateText, String priceChargeText   ) throws InterruptedException
	{
		clickOnChargeTab();
		clickOnPlusIcon();
		selectService(selectService);
		enterChargeDesciption(ChargeDescriptionText);
		Thread.sleep(1000);
		enterRolupDesciption(rollUpText);
		enterStartDate();
		bp.ScrollDownThePage(x, y);
		enterUnitsRate(unitRateText);
		enterFlatRate(flatRateText);
		enterPriceChargeDollar(priceChargeText);
		clickOnSaveBtn();
		clickOkButton();
	}


	public void clickOnRecurringPlusIcon()
	{
		ActionEngine.clickBtn_custom(AddIconForRecurringCharge, "Plus Icon ");
	}
	
	public void enterServiceDropdownOption(int serviceText)
	{
		ActionEngine.selectDropDownByIndex_custom(ServiceDropdownRecurringField, serviceText,"Service" );
	}
	
	public void enterChargeDescriptionDropdownOption(int chargeText)
	{
		ActionEngine.selectDropDownByIndex_custom(CodeField, chargeText,"Service" );
	}
	
	public void clickOnGoingToggleBtn()
	{
		ActionEngine.clickBtn_custom(ChargeOngoingField, "On Going - always Recurring");
	}
	
	public void enterPeriodOFCharge(String PeriodOfChargeText)
	{
		ActionEngine.sendKeys_custom(NumberOfPeriodsField, PeriodOfChargeText,"Period Of Charge" );
	}
public void addNewRecurringCharge(int serviceText, int chargeText, String PeriodOfChargeText)
{
	clickOnRecurringPlusIcon();
	enterServiceDropdownOption(serviceText);
	enterStartDate();
	enterChargeDescriptionDropdownOption(chargeText);
	clickOnGoingToggleBtn();
	enterPeriodOFCharge(PeriodOfChargeText);
	clickOnSaveBtn();
	clickOkButton();
	
}

}

