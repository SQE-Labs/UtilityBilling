package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.LocaleSetting;
import org.testng.annotations.Test;

public class LocaleSettingTest extends BaseTest{
	
	@Test
	public void localeSetting() throws InterruptedException {
		LocaleSetting localePage = new LocaleSetting();
		
		localePage.clickAdmin();
		localePage.clickLocalesetting();
		Thread.sleep(3000);
		localePage.selectCurrencySymbol("Dollar");
		localePage.selectDecimalPoints("3");
		localePage.selectDecimalSymbol("Comma(,)");
     	localePage.enterDecimalSymbol("0");
     	localePage.selectDateFormat("dd/MM/yyyy");
     	localePage.selectTimeFormat("hh:mm a");
     	localePage.clickSaveChanges();
     	localePage.assertSuccessMessage();

		
	}
}