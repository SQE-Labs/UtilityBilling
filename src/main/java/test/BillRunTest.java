package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.AddCycle;
import org.automation.pageObjects.CreateCustForChangeCustEmail;
import org.automation.pageObjects.admin.commmunications.EmailTemplateSetup;
import org.automation.pageObjects.admin.commmunications.SMSTemplateSetup;
import org.automation.pageObjects.admin.commmunications.SMTPSetup;
import org.automation.pageObjects.customers.Customer;
import org.automation.utilities.RandomGenerator;
import org.testng.annotations.Test;

public class BillRunTest extends BaseTest

{
	SMTPSetup sp=new SMTPSetup();
	EmailTemplateSetup et=new EmailTemplateSetup();
	SMSTemplateSetup ss=new SMSTemplateSetup();
	Customer cp = new Customer();
	CreateCustForChangeCustEmail cce=new CreateCustForChangeCustEmail();
	RandomGenerator rand=new RandomGenerator();
	AddCycle addcycle=new AddCycle();
	CreateServicePage cs = new CreateServicePage();



	@Test(priority = 1, description = "SMTP Setup")
	public void smtpInformationSetup() throws InterruptedException {
		sp.smtpInformation("mail.utilibill.com.au", "25","testingkk464@gmail.com","swaan321");
	}

	@Test(priority = 2, description = "Email Setup")
	public void setEmailSetup() throws InterruptedException {
		et.emailSetup("Invoice","testingkk464@gmail.com","Email Template Subject");
	}

	@Test(priority = 3, description = "SMS Setup")
	public void setSMSSetup() throws InterruptedException {
		ss.smsSetup(1,"SMS Message");
	};
	@Test(priority = 4, description = "Create a Customer")
	public void createACustomer() throws InterruptedException {
		cp.createCustomer("Business", "SSLabs", "Dino", "Anotonello", "9988907865", "test12@gmail.com", "t12@gmail.com",
				"38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
	}
	@Test(priority = 5, description = "change  a Customer Email")
	public void changeCustEmail() throws InterruptedException {
		cce.changeCustomerEmailAddress("Test13@gmail.com");
	}
	@Test(priority = 6, description = "Add a cycle.")
	public void addACycle() throws InterruptedException {
		String billRuncycleName=rand.requiredDigits(5);

		addcycle.AddANewCycle(billRuncycleName,billRuncycleName);
	}

	@Test(priority = 7, description = "Create a service.")
	public void createAService() throws InterruptedException {
		cs.newRetailElectricitySevice("Electricity Flat Template Plan", "Flat Rate", "Consumption");
	}

}
