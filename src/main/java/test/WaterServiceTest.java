package test;

import org.testng.annotations.Test;
import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.AddMeterReads;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.automation.pageObjects.customers.WaterService;
import org.testng.annotations.Test;

public class WaterServiceTest extends BaseTest{
	
	WaterService water = new WaterService();
	CreateServicePage createService = new CreateServicePage();
	AddMeterReads addMeterReads = new AddMeterReads();
	String customerId;
	
	@Test(priority = 1,enabled = true, description = "Create Water Service")
    public void createWaterService() throws InterruptedException {
    Customer customer = new Customer ();
    customerId=customer.createCustomer("Business",
    		  "SSLabs", "Dallas", "Mathew", "9988907865", "test12@gmail.com",
    		  "t12@gmail.com", "38 Decca Road", "37 Decca Road", "Goldsborough", "3156", 
    		  "Australia", "Electricity Residential plan");    
    createService.waterSevice(customerId,"Water Flat Template Plan","Flat Rate", "Reads");  
       
    }
}
