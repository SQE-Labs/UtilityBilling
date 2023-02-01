package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.Charges;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.automation.pageObjects.LoginPage;
import org.automation.pageObjects.admin.paymentGateway.GroupPayment;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElectPaymentTest extends BaseTest

{
	Customer customer = new Customer();
	Charges charges = new Charges();
	CreateServicePage service = new CreateServicePage();
	GroupPayment gPayment = new GroupPayment();

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

	@Test(priority = 1, description = "Create Business Customer")
	public void createACustomer() throws InterruptedException {
		customer.createCustomer("Business", "SSLabs", "Dino", "Anotonello", "9988907865", "test12@gmail.com", "t12@gmail.com",
				"38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
	}

	@Test(priority = 2, description = "Create a Retail Electricity Service")
	public void createARetailElectricity() {
		service.newRetailElectricitySevice("Electricity Flat Template Plan", "Flat Rate", "Consumption");
	}

	@Test(priority = 3, description = "Add a Manual Charge")
	public void addManualCharge() throws InterruptedException {
		charges.addOnceOffCharges(1, "Connection Fee", "Description", "20", "20", "200");
	}

	@Test(priority = 4, description = "Add a Recurring Charge")
	public void addRecurringCharge() throws InterruptedException {
		charges.addNewRecurringCharge(1, 1, "1");
	}

	@Test(priority = 5, description = "Add a Payment from Credit Card")
	public void addPaymentFromCreditCard() throws InterruptedException {
		gPayment.PaymentsFromCreditCard("Payment", "Credit Card", "test11@gmail.com", "10",
				"Hey!!! this is the comment section under payment tab");
	}

	@Test(priority = 6, description = "Add a Security Deposit")
	public void addSecurityDeposit() throws InterruptedException {
		gPayment.PaymentsFromCreditCard("Security Deposit", "Deposit", "sqelabs11@gmail.com", "75",
				"Hey!!! this is the comment section under payment tab(Security Tab)");

	}

}
