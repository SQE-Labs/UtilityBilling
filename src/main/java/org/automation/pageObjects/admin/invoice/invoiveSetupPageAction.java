package org.automation.pageObjects.admin.invoice;

import org.automation.base.BasePage;
import org.automation.base.BaseTest;
import org.openqa.selenium.By;

import com.gargoylesoftware.htmlunit.javascript.host.Element;



public class invoiveSetupPageAction extends BasePage {
	
	By finishBtn= By.xpath("//button[@id='btnNext']");
	



public invoiceSetupPage clkFininshBtn()
{
	
	
	clickBtn_custom(finishBtn, "Finish");	
	return new invoiceSetupPage();

}
}


