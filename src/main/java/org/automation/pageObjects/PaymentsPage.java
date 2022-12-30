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
	 
	 public void selectPaymentMethodOption(String paymentMethodTypeText)
		{
		 
			ActionEngine.sendKeys_withClear(paymentMethoddropdownfield, paymentMethodTypeText," Payment Method" );
		}

	 public void enterReceiptEmail(String receiptEmailText)
		{
			ActionEngine.selectDropDownByVisibleText_custom(emailfortransactionfield, receiptEmailText," Receipt Email" );
		}
	 
	 public void enterAmount(String amountText)
		{
			ActionEngine.selectDropDownByVisibleText_custom(paymentMethoddropdownfield, amountText,"Amount" );
		}
	 
	 public void clickduplicateCheckBoxToggleButton()
	 {
		 ActionEngine.clickBtn_custom(allowduplicatecheckbox, "Allow Duplicate transcation");
		 
	 }
	 public void enterComments(String commentText)
	 {
		 ActionEngine.sendKeys_custom(commentfield,commentText, "Commnets");
		 
	 }
	 public void clickSubmitTransactionButton()
	 {
		 ActionEngine.clickBtn_custom(transactionsubmitbutton, "Submit Transaction");
	 }
	 public void clickOkButton()
	 {
		 ActionEngine.clickBtn_custom(okbuttonfortransaction, "Ok");
	 }
	 
	 public void PaymentsFromCreditCard(String transactionTypeText,String paymentMethodTypeText,String receiptEmailText,String amountText,String commentText)
	 {
		 clickOnTransactionTab();
		 selectTransactionTypeOption(transactionTypeText);
		 selectPaymentMethodOption(paymentMethodTypeText);
		 enterReceiptEmail(receiptEmailText);
		 enterAmount(amountText);
		 clickduplicateCheckBoxToggleButton();
		 enterComments(commentText);
		 clickSubmitTransactionButton();
		 clickOkButton();
	 }
	 
	 public void AddSecurityDeposit(String transactionTypeText,String paymentMethodTypeText,String receiptEmailText,String amountText,String commentText)
	 {
		 clickOnTransactionTab();
		 selectTransactionTypeOption(transactionTypeText);
		 selectPaymentMethodOption(paymentMethodTypeText);
		 enterReceiptEmail(receiptEmailText);
		 enterAmount(amountText);
		 clickduplicateCheckBoxToggleButton();
		 enterComments(commentText);
		 clickSubmitTransactionButton();
		 clickOkButton();;
		 
	 }
}
