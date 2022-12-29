package org.automation.pageObjects;

import org.automation.utilities.ActionEngine;
import org.openqa.selenium.By;

public class PaymentsPage
{
	 public static By transactionsubtab=By.xpath("(//i[@class='icon-money'])[1]");
	 public static By transactintypedropdownfield=By.xpath("//select[@name='tranType']");
	 public static By paymentMethoddropdownfield=By.xpath("//select[@name='tranSubType']");
	 public static By emailfortransactionfield=By.xpath("//input[@name='receiptEmail']");
	 public static By amountfield=By.xpath("//input[@name='amount']");
	 public static By allowduplicatecheckbox=By.xpath("//input[@name='allowDupes']");
	 public static By commentfield=By.xpath("//input[@name='comment']");
	 public static By transactionsubmitbutton=By.xpath("//a[@name='submitBtn']");
	 public static By okbuttonfortransaction=By.xpath("(//button[@class='btn \btn-primary'])[3]");
	 
	 public  void clickOnTransactionTab() 
		{
			ActionEngine.clickBtn_custom(transactionsubtab, "Transaction");
		}

	 public void selectTransactionTypeOption(String transactionTypeText)
		{
			ActionEngine.selectDropDownByVisibleText_custom(transactintypedropdownfield, transactionTypeText," Transaction Type" );
		}
	 
	 public void selectPaymentMethodOption(String PaymentMethodTypeText)
		{
		 
			ActionEngine.sendKeys_withClear(emailfortransactionfield, PaymentMethodTypeText," Transaction Type" );
		}

	 public void enterReceiptEmail(String ReceiptEmailText)
		{
			ActionEngine.selectDropDownByVisibleText_custom(paymentMethoddropdownfield, ReceiptEmailText," Receipt Email" );
		}
	 
	 public void enterAmount(String ReceiptEmailText)
		{
			ActionEngine.selectDropDownByVisibleText_custom(paymentMethoddropdownfield, ReceiptEmailText," Receipt Email" );
		}

}
