package org.automation.pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class CreateServicePage {
	Assertions as;
	BasePage bp = new BasePage();

	static String waterPlan = "Water Flat Template Plan";
	static String gasPlan = "Gas Flat Template Plan";
	static String notesstr = "Editing done";

	public static By Overviewtab = By.xpath("//i[@class='icon-eye-open']");
	public static By AddRetailelect = By.xpath("(//a[@class='addicon'])[2]");

	public static By SelectPlan = By.xpath("//select[@id='planNo']");
	public static By MeterNo = By.xpath("//input[@id='userName']");
	public static By MeterConfig = By.xpath("//select[@id='meterConfig']");
	public static By ReadType = By.xpath("//select[@id='readType']");
	public static By DemandReadsToggle = By.xpath("//span[@class='switch-label']");
	public static By CreateElectServ = By.xpath("//a[@class='btn btn-mini btn-primary']");
	public static By OK_btn = By.xpath("//button[text()='OK']");
	public static By CreatedElectServc = By.xpath("//td[@class='sorting_1']");
	public static By CreateWaterSrvc = By.xpath("//button[@id='createServBtn']");

	public static By AddWaterServc = By.xpath("(//i[@class='icon-plus'])[4]");
	public static By AddGasServc = By.xpath("(//a[@class='addicon'])[1]");
	public static By NotesSectn = By.xpath("//textarea[@name='notes']");
	public static By SaveServiceChanges = By.xpath("(//a[@class='btn btn-primary'])[4]");
	public static By ChangesSavedText = By.xpath("//p[@class='message']");
	public static By addProrata = By.xpath("//a[@class='btn btn-primary']");
	public static By NewProRataDate = By.xpath("//input[@class='date-picker readOnlyText']");
	public static By MoveOutbtn = By.xpath("//i[@class='icon-signout']");
	public static By MoveOutOK = By.xpath("(//button[@class='btn btn-primary'])[2]");

	public static By AddGenericService = By.xpath("(//a[@class='addicon'])[6]");
	public static By ProductDesc = By.xpath("//input[@id='meterName']");
	public static By ProrataDate = By.xpath("//input[@id='start-date']");
	public static By Todaydate = By.xpath("//td[@class='active day']");
	public static By Quantity = By.xpath("//input[@id='quantity']");
	public static By RollupDesc = By.xpath("//input[@id='rollup-desc']");
	public static By ChargeType = By.xpath("//select[@id='charge-type']");
	public static By UnitType = By.xpath("//select[@id='unit-type']");
	public static By Rate = By.xpath("//input[@id='rate']");
	public static By SaveServ = By.xpath("//button[@id='saveSrv']");
	public static By OKbtn = By.xpath("//button[text()='OK']");
	public static By Finishbtn = By.xpath("//button[@id='finishBtn']");
	public static By Services = By.xpath("//ul[@class='nav nav-tabs']/li[3]");
	public static By ManageService = By.xpath("//button[@class='btn btn-primary toolt']");
	public static By UpdtServc = By.xpath("//a[@id='updateSrv']");
	public static By UpdtAllert = By.xpath("//div[@id='successAlert']");
	public static By NewDay = By.xpath("//td[@class='new day']");
	public static By MovereadDate = By.xpath("//input[@id='moveOutDate']");
	public static By FinalreadDate = By.xpath("//input[@id='finalreaddate']");
	public static By FinalRead = By.xpath("//input[@name='finalRead']");
	public static By ContmoveOut = By.xpath("//a[@name='continueMoveOut']");
	public static By MoveOutConfOK = By.xpath("(//button[text()='OK'])[2]");
	public static By SuccessMoveOutMsg = By.xpath("//p[@class='message']");

	public static By GenServcExpand = By.xpath("//i[@class='pull-right icon-chevron-down']");
	public static By CreatedGenericService = By
			.xpath("//*[@id='content']/div[2]/div[3]/div[1]/div[1]/ul[2]/li/ul/li/span/span[1]/a");
	public static By AssertElectricity = By.xpath("//tr[@class='odd']/td[2]");

	public static By EditWaterPlan = By.xpath("//select[@id='planNo']");
	String SUCCESS_MSG = "Electricity";

	public void clickOnOverview() {

		ActionEngine.clickBtn_custom(Overviewtab, "Overview");
	}

	public void clickRetailElectricity() {
		ActionEngine.clickBtn_custom(AddRetailelect, "Retail Electricity Icon");
	}

	public void selectPlan(String selectPlanText) {
		ActionEngine.clickBtn_custom(SelectPlan, "Plan");
		ActionEngine.selectDropDownByVisibleText_custom(SelectPlan, selectPlanText, "Plan");
	}

	public void enterMeterNumber() {

		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		String mno = cal.getTime().toString();
		System.out.println(mno = mno.substring(11, 19));
		mno = mno.replaceAll(":", "");
		ActionEngine.sendKeys_custom(MeterNo, "Ele" + mno, "First Name");
		String MeterNumberEntered = ActionEngine.getText_custom(MeterNo);

		System.out.println("........");
		System.out.println(MeterNumberEntered);
	}

	public void selectMeterConfiguration(String MeterConfigurationText) {
		ActionEngine.clickBtn_custom(MeterConfig, "Meter Cnfiguration");
		ActionEngine.selectDropDownByVisibleText_custom(MeterConfig, MeterConfigurationText, "Meter Configuration");
	}

	public void selectreadType(String readingTypeText) {
		bp.scrollIntoView(ReadType);
		ActionEngine.clickBtn_custom(ReadType, "Reading Type");
		ActionEngine.selectDropDownByVisibleText_custom(ReadType, readingTypeText, "Reading Type");
	}

	public void clickDemandToggleButton()

	{
		ActionEngine.clickBtn_custom(DemandReadsToggle, "Enable Demand Type");

	}

	public void clickCreateService() {
		bp.scrollIntoView(CreateElectServ);
		ActionEngine.clickBtn_custom(CreateElectServ, "Create Service");

	}

	public void clickOkButton() {
		ActionEngine.clickBtn_custom(OK_btn, "Ok");

	}

	public String createNewRetailElectrcityService() {
		WebdriverWaits.waitForElementVisible(AssertElectricity, 40);
		return ActionEngine.getText_custom(AssertElectricity);
	}

	public void newRetailElectricitySevice(String selectPlanText, String MeterConfigurationText, String readingTypeText)

	{
		// 1. Customer is already created using Customer flow.
		// 2. Adding electricity service to a customer.
		// 3. Overview > Electricity
		as = new Assertions();
		clickOnOverview();
		clickRetailElectricity();
		selectPlan(selectPlanText);
		enterMeterNumber();
		selectMeterConfiguration(MeterConfigurationText);
		selectreadType(readingTypeText);
		clickDemandToggleButton();
		clickCreateService();
		clickOkButton();
		as.assertStrings(createNewRetailElectrcityService(), SUCCESS_MSG);
	}

}
