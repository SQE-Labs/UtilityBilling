package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.paymentGateway.PaymentsPage;
import org.automation.pageObjects.customers.ChargePage;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.testng.annotations.Test;

public class ElectPaymentTest extends BaseTest {
    Customer customer = new Customer();
    ChargePage charges = new ChargePage();
    CreateServicePage service = new CreateServicePage();
    PaymentsPage gPayment = new PaymentsPage();
    String customerId;


    @Test(priority = 25,enabled = true, description = "Create Business Customer")
    public void createACustomer() throws InterruptedException {
        customerId = customer.createCustomer("Business", "SSLabs", "Dino", "Anotonello", "9988907865", "test12@gmail.com", "t12@gmail.com",
                "38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
    }

    @Test(priority = 26,enabled = true, description = "Create a Retail Electricity Service")
    public void createARetailElectricity() throws InterruptedException {
        service.newRetailElectricitySevice(customerId, "Electricity Flat Template Plan", "Flat Rate", "Consumption");
    }

    @Test(priority = 27,enabled = true, description = "Add a Manual Charge")
    public void addManualCharge() throws InterruptedException {
        charges.addOnceOffCharges(1, "Connection Fee", "Description", "20", "20", "200");
    }

    @Test(priority = 28,enabled = true, description = "Add a Recurring Charge")
    public void addRecurringCharge() throws InterruptedException {
        charges.addNewRecurringCharge(1, 1, "1");
    }

    @Test(priority = 29,enabled = true, description = "Add a Payment from Credit Card")
    public void addPaymentFromCreditCard() throws InterruptedException {
        gPayment.PaymentsFromCreditCard("Payment", "Credit Card", "test11@gmail.com", "10",
                "Hey!!! this is the comment section under payment tab");
    }

    @Test(priority = 30,enabled = true, description = "Add a Security Deposit")
    public void addSecurityDeposit() throws InterruptedException {
        gPayment.AddSecurityDepositFromCC("Security Deposit", "Deposit", "sqelabs11@gmail.com", "75",
                "Hey!!! this is the comment section under payment tab(Security Tab)");
    }

}
