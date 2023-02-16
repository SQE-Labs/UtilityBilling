package test;


import org.automation.base.BaseTest;
import org.automation.pageObjects.LoginPage;
import org.automation.pageObjects.admin.AdminPage;
import org.automation.pageObjects.admin.commmunications.SMSTemplateSetup;
import org.automation.pageObjects.admin.groupManager.EditGroup;
import org.automation.pageObjects.admin.invoice.createNewInvoiceSetupPage;
import org.automation.pageObjects.admin.invoice.invoiceSetupPage;
import org.automation.pageObjects.admin.invoice.invoiveSetupPageAction;
import org.automation.pageObjects.admin.miscellaneous.InvoiceSetup;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvoiceTest extends BaseTest {

	AdminPage adminPage = new AdminPage();
	invoiceSetupPage invoiceSetup= new invoiceSetupPage();
	createNewInvoiceSetupPage createInvoice= new createNewInvoiceSetupPage();
	invoiveSetupPageAction finish= new invoiveSetupPageAction();
	EditGroup editGroup= new EditGroup();
	String invoiceName="vikas";


	@BeforeClass
	public void login() {
		try {

			LoginPage loginPage = new LoginPage();
			System.out.println(getDriver().getTitle());
			loginPage.login(PropertiesUtil.getPropertyValue("userName"), PropertiesUtil.getPropertyValue("password"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

						}
	@Test(priority = 1, description = "Create New Invoice")
	public void create_NewInvoice() throws InterruptedException
	{
		//ss.clickOnAdminTab();
		invoiceSetup =adminPage.navigateToInvoiceSetup();
		createInvoice=invoiceSetup.clkCreateNewInvoice();
		createInvoice.setInvoiceName(invoiceName);
		createInvoice.setPaperSize();
		createInvoice.setMargins();

		createInvoice.setCategory();
		finish=createInvoice.saveInvoice();
		invoiceSetup=finish.clkFininshBtn();

	}
	@Test(priority=2, description ="Edit Existing invoice")
	public void edit_invoice()
	{
		invoiceSetup.search(invoiceName);
		invoiceSetup.clkSeachInvoice();
		finish=createInvoice.clkNext();
		invoiceSetup=finish.clkFininshBtn();
	}

	@Test(priority=3, description ="Updating invoice setting in Edit group")
	public void update_invoice_settings()
	{
		editGroup.clickAdmin();
		editGroup.clickEditGroup();
		editGroup.selectPrimaryFrontInvoice(invoiceName);
		editGroup.selectPrimaryBackInvoice(invoiceName);

		editGroup.clickSaveChanges();
		editGroup.clickOkButton();
		editGroup.assertSuccessMessage();


	}


}
