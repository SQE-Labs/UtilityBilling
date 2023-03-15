package test;

import org.automation.pageObjects.IndexPage;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.automation.pageObjects.customers.RetailElectricityService;
import org.automation.utilities.DateGenerator;
import org.automation.utilities.RandomGenerator;
import org.testng.annotations.Test;

public class ServiceTest extends IndexPage {

    String electricityServiceId;
    String genericServiceId;
    String waterServiceId;
    String gasServiceId;
    CreateServicePage createService = new CreateServicePage();
    String customerId;
    RandomGenerator randomGenerator = new RandomGenerator();
    RetailElectricityService retailElectricityService = new RetailElectricityService();
    DateGenerator dateGenerator = new DateGenerator();
    @Test(enabled = true,priority = 20)
    public void createRetailElectricityService() throws InterruptedException {
        Customer customer = new Customer();
        customerId = customer.createCustomer("Business",
                "SSLabs", "Dallas", "Mathew", "9988907865", "test12@gmail.com",
                "t12@gmail.com", "38 Decca Road", "37 Decca Road", "Goldsborough", "3156",
                "Australia", "Electricity Residential plan");
        electricityServiceId = retailElectricityService.addRetailElectricityService();

    }

    @Test(priority = 21, enabled = true, description = "Create Gas Service")

    public void createGasService() throws InterruptedException {
        createService.gasService(customerId, "Gas Flat Template Plan", "Flat Rate", "Reads");
    }

    @Test(priority = 22, enabled = true)

    public void createGenericService() throws InterruptedException {

        String currDate = dateGenerator.getCurrentDate();
        String endDate = dateGenerator.getDateWithDays("dd/MM/yyyy", 60);
        String description = "Generic_" + randomGenerator.requiredCharacters(5);
            createService.genericService(customerId, description, currDate, endDate, "12", "Generic Services", "NetworkCharges", "RollUp Descrition", "Account Level Charges", "Day", "100");
    }

    @Test(priority = 23)
    public void editGenericService() throws InterruptedException {
        String description = "Generic_U" + randomGenerator.requiredCharacters(5);
        createService.editGenericService(description, "25", "Edit Generic Services", "RollUp Description edited", "Electricity Charges", "Flat rate", "Generic service is successfully saved.");
    }
    @Test(priority = 24,enabled = true, description = "Create Water Service")
    public void createWaterService() throws InterruptedException {
        createService.waterSevice(customerId,"Water Flat Template Plan","Flat Rate", "Reads");

    }
}
