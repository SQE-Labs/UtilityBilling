package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class PaymentsPage extends BasePage {
	Assertions as;
	// remove static
	public static By transactionsubtab = By.xpath("(//i[@class='icon-money'])[1]");
	public static By transactintypedropdownfield = By.xpath("//select[@name='tranType']");
	public static By paymentMethoddropdownfield = By.xpath("//select[@name='tranSubType']");
	public static By emailfortransactionfield = By.xpath("//input[@name='receiptEmail']");
	public static By amountfield = By.xpath("//input[@name='amount']");
	public static By allowduplicatecheckbox = By.xpath("//input[@name='allowDupes']");
	public static By commentfield = By.xpath("//input[@name='comment']");
	public static By transactionsubmitbutton = By.xpath("//a[@name='submitBtn']");
	public static By okbuttonfortransaction = By.xpath("(//button[@class='btn btn-primary'])[3]");
	public static By makeNewPaymentButton = By.xpath("//span[text()='Make New Payment']");
	public static By viewHistoryButton = By.xpath("//span[text()='View History']");
	public static By entryMsgOnAddingPaymentByCreditCard = By.xpath("//div[@id='tbl-trans-history_info']");
	public static By entryMsgOnAddingPaymentBySecurityDeposit = By.xpath("//div[@id='tbl-trans-history_info']");
	String SUCCESS_MSG = "Showing 1 to 1 of 1 entries";
	String SUCCESS_MSG_SECURITY = "Showing 1 to 2 of 2 entries";

	public void clickOnTransactionTab() {
		ActionEngine.clickBtn_custom(transactionsubtab, "Transaction");
	}

	public void selectTransactionTypeOption(String transactionTypeText) {
		ActionEngine.selectDropDownByVisibleText_custom(transactintypedropdownfield, transactionTypeText,
				" Transaction Type");
	}

	public void selectPaymentMethodOption(String paymentMethodTypeText) {

		ActionEngine.selectDropDownByVisibleText_custom(paymentMethoddropdownfield, paymentMethodTypeText,
				" Payment Method");
	}

	public void enterReceiptEmail(String receiptEmailText) {
		ActionEngine.sendKeys_withClear(emailfortransactionfield, receiptEmailText, " Receipt Email");
	}

	public void enterAmount(String amountText) {
		ActionEngine.sendKeys_custom(amountfield, amountText, "Amount");
	}

	public void clickduplicateCheckBoxToggleButton() {
		ActionEngine.clickBtn_custom(allowduplicatecheckbox, "Allow Duplicate transcation");

	}

	public void enterComments(String commentText) {
		ActionEngine.sendKeys_custom(commentfield, commentText, "Commnets");

	}

	public void clickSubmitTransactionButton() {
		ActionEngine.clickBtn_custom(transactionsubmitbutton, "Submit Transaction");
	}

	public void clickOkButton() {
		ActionEngine.clickBtn_custom(okbuttonfortransaction, "Ok");
	}

	public void clickOnMakePaymentButton() {
		ActionEngine.clickBtn_custom(makeNewPaymentButton, "Make New Payment");
	}

	public void clickOnViewHistoryButton() {
		ActionEngine.clickBtn_custom(viewHistoryButton, "View History");
	}

	public String entryMsgOnAddingPaymentByCreditCard() {
		WebdriverWaits.waitForElementVisible(entryMsgOnAddingPaymentByCreditCard, 10);
		return ActionEngine.getText_custom(entryMsgOnAddingPaymentByCreditCard);
	}

	public String entryMsgOnAddingPaymentBySecurityDeposit() {
		WebdriverWaits.waitForElementVisible(entryMsgOnAddingPaymentBySecurityDeposit, 10);
		return ActionEngine.getText_custom(entryMsgOnAddingPaymentBySecurityDeposit);
	}

	public void PaymentsFromCreditCard(String transactionTypeText, String paymentMethodTypeText,
			String receiptEmailText, String amountText, String commentText) throws InterruptedException {
		as = new Assertions();
		clickOnTransactionTab();
		selectTransactionTypeOption(transactionTypeText);
		Thread.sleep(3000);
		selectPaymentMethodOption(paymentMethodTypeText);
		enterReceiptEmail(receiptEmailText);
		enterAmount(amountText);
		clickduplicateCheckBoxToggleButton();
		enterComments(commentText);
		clickSubmitTransactionButton();
		clickOkButton();
		clickOnViewHistoryButton();
		as.assertStrings(entryMsgOnAddingPaymentByCreditCard(), SUCCESS_MSG);
		Thread.sleep(3000);
		clickOnMakePaymentButton();

	}

	public void AddSecurityDeposit(String transactionTypeText, String paymentMethodTypeText, String receiptEmailText,
			String amountText, String commentText) {
		as = new Assertions();
		clickOnTransactionTab();
		selectTransactionTypeOption(transactionTypeText);
		selectPaymentMethodOption(paymentMethodTypeText);
		enterReceiptEmail(receiptEmailText);
		enterAmount(amountText);
		clickduplicateCheckBoxToggleButton();
		enterComments(commentText);
		clickSubmitTransactionButton();
		clickOkButton();
		as.assertStrings(entryMsgOnAddingPaymentByCreditCard(), SUCCESS_MSG_SECURITY);

	}
}