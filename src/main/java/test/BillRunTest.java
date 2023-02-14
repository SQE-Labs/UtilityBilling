package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.ChangeCustEmail;
import org.automation.pageObjects.AddCycle;
import org.automation.pageObjects.CreateCustForChangeCustEmail;
import org.automation.pageObjects.CreateServicePage;
import org.automation.pageObjects.admin.billing.BillWithDownloadPdfAndCommit;
>>>>>>> 7f1cd701d9ca4cf8988c6cb15fb9af7636edf7b3:src/main/java/test/BillRun.java
import org.automation.pageObjects.admin.commmunications.EmailTemplateSetup;
import org.automation.pageObjects.LoginPage;
import org.automation.pageObjects.admin.commmunications.SMSTemplateSetup;
import org.automation.pageObjects.admin.commmunications.SMTPSetup;
import org.automation.pageObjects.admin.paymentGateway.PaymentsPage;
import org.automation.pageObjects.customers.AddMeterReads;
import org.automation.pageObjects.customers.Customer;
import org.automation.utilities.PropertiesUtil;
import org.automation.utilities.RandomGenerator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BillRunTest extends BaseTest

{
	String customerId;
	SMTPSetup sp=new SMTPSetup();
	EmailTemplateSetup et=new EmailTemplateSetup();
	SMSTemplateSetup ss=new SMSTemplateSetup();
	Customer cp = new Customer();
	CreateCustForChangeCustEmail cce=new CreateCustForChangeCustEmail();
	RandomGenerator rand=new RandomGenerator();
	AddCycle addcycle=new AddCycle();
	CreateServicePage cs = new CreateServicePage();
	AddMeterReads addMeterRead=new AddMeterReads();
	BillWithDownloadPdfAndCommit runTheCycle=new BillWithDownloadPdfAndCommit();
	PaymentsPage addPayment=new PaymentsPage();



	  @Test(priority = 1, description = "SMTP Setup")
	  public void smtpInformationSetup() throws InterruptedException {
	  sp.smtpInformation("mail.utilibill.com.au",
	  "25","testingkk464@gmail.com","swaan321"); }

	  @Test(priority = 2, description = "Email Setup")
	  public void setEmailSetup()throws InterruptedException {
	  et.emailSetup("Invoice","testingkk464@gmail.com","Email Template Subject"); }

	  @Test(priority = 3, description = "SMS Setup") // to fix
	  public void setSMSSetup() throws InterruptedException {
	  ss.smsSetup(1,"SMS Message"); };


	  @Test(priority = 4, description = "Create a Customer")
	  public void  createACustomer() throws InterruptedException
	  {
		  customerId=cp.createCustomer("Business",
	  "SSLabs", "Dallas", "Mathew", "9988907865", "test12@gmail.com",
	  "t12@gmail.com", "38 Decca Road", "37 Decca Road", "Goldsborough", "3156",
	  "Australia", "Electricity Residential plan"); }

	  @Test(priority = 5, description = "change  a Customer Email") public void
	  changeCustEmail() throws InterruptedException {
	  cce.changeCustomerEmailAddress("Test13@gmail.com"); }

	  @Test(priority = 6, description = "Add a cycle.")
	  public void addACycle() throws InterruptedException
	  {
		  addcycle.AddANewCycle(customerId,customerId);

	  }


	@Test(priority = 7, description = "Create a service.")
	public void createAService() throws InterruptedException {
		cs.newRetailElectricitySevice(customerId,"Electricity Flat Template Plan", "Flat Rate", "Consumption");
	}

	@Test(priority = 8, description = "Add meter for Actual and Initial")
	public void addMEterReadsForInitialAndActual() throws InterruptedException {
		addMeterRead.addMeterReadsForInitial(1, "Initial", "100");
		addMeterRead.addMeterReadsForActual(1, "Consumption", "500");
	}
	@Test(priority = 9, description = "Run the Bill Run Cycle")
	public void runTheBillRunCycle() throws InterruptedException {
		runTheCycle.runTheBillRunCycle(customerId);
	}
	@Test(priority = 10, description = "Add meter for Estimate")
	public void addMEterReadsForEstimate() throws InterruptedException {
		addMeterRead.addMeterReadsForInitial(1, "Estimate", "400");

	}
	@Test(priority = 11, description = "Add a Payment from Credit Card")
	public void addPaymentFromCreditCard() throws InterruptedException {
		addPayment.PaymentsFromCreditCard("Payment", "Credit Card", "test11@gmail.com", "10",
				"Hey!!! this is the comment section under payment tab");
	}
}
