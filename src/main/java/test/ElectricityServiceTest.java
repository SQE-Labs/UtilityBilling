package test;

import org.automation.pageObjects.IndexPage;
import org.automation.pageObjects.customers.RetailElectricityService;
import org.testng.annotations.Test;

public class ElectricityServiceTest  extends IndexPage {

    String customerId="230527";
    String electricityServiceId;
    String genericServiceId;
    String waterServiceId;
    String gasServiceId;

    RetailElectricityService retailElectricityService = new RetailElectricityService();
    @Test
    public void createRetailElectricityService() throws InterruptedException {
        searchCustomer(customerId);
        electricityServiceId= retailElectricityService.addRetailElectricityService();
    }
//    @Test
//    public void editRetailElectricityService() throws InterruptedException {
//         retailElectricityService.editServiceStatus();
//    }
//    @Test
//    public void createGasService() throws InterruptedException {
//        searchCustomer(customerId);
//        gasServiceId= retailElectricityService.addRetailElectricityService();
//    }
//    @Test
//    public void editGasService() throws InterruptedException {
//        retailElectricityService.editServiceStatus();
//    }
//    @Test
//    public void createWaterService() throws InterruptedException {
//        searchCustomer(customerId);
//        waterServiceId= retailElectricityService.addRetailElectricityService();
//    }
//    @Test
//    public void editWaterService() throws InterruptedException {
//        retailElectricityService.editServiceStatus();
//    }
//    @Test
//    public void createGenericService() throws InterruptedException {
//        searchCustomer(customerId);
//        genericServiceId= retailElectricityService.addRetailElectricityService();
//    }
//    @Test
//    public void editGenericService() throws InterruptedException {
//        retailElectricityService.editServiceStatus();
//    }
    }
