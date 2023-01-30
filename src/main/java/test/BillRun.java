package test;

import org.automation.base.BaseTest;

import org.automation.pageObjects.CreateCustForChangeCustEmail;
import org.automation.pageObjects.admin.commmunications.EmailTemplateSetup;
import org.automation.pageObjects.LoginPage;
import org.automation.pageObjects.admin.commmunications.SMSTemplateSetup;
import org.automation.pageObjects.admin.commmunications.SMTPSetup;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BillRun extends BaseTest

{
	SMTPSetup sp=new SMTPSetup();
	EmailTemplateSetup et=new EmailTemplateSetup();
	SMSTemplateSetup ss=new SMSTemplateSetup();
	
	CreateCustForChangeCustEmail cce=new CreateCustForChangeCustEmail();



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
		String customerId=cce.createCustomer("Residential", "Daino", "Antelleo", "9988907865", "test12@gmail.com", "t12@gmail.com",
				"38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
	}
}
;
