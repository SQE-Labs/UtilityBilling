package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.testng.annotations.Test;

public class GenericServiceTest extends BaseTest {
	
	String customerId;
	CreateServicePage createService = new CreateServicePage();
	
	@Test(priority=0,enabled = true)
	 public void createGenericService() throws InterruptedException {
		    Customer customer = new Customer ();
		    customerId=customer.createCustomer("Business",
		    		  "SSLabs", "Dallas", "Mathew", "9988907865", "test12@gmail.com",
		    		  "t12@gmail.com", "38 Decca Road", "37 Decca Road", "Goldsborough", "3156", 
		    		  "Australia", "Electricity Residential plan");    
		    createService.genericService(customerId,"","","","12","Generic Services","NetworkCharges", "None", "Account Level Charges", "Day", "100");
			}
	
	@Test(priority=1,enabled = true)
	public void editGenericService() throws InterruptedException {
	    createService.editGenericService("","25","Edit Generic Services","None", "Electricity Charges","Flat rate","Generic service is successfully saved.");
		}
}
