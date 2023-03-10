package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.WaterService;
import org.testng.annotations.Test;

public class WaterServiceTest extends BaseTest {

    WaterService water = new WaterService();

    @Test(priority = 1, description = "Create Water Service")
    public void createWaterService() throws InterruptedException {
        water.createCustomer("Tenant", "Residential", "SSLabs", "Trade", "Labs", "Dino", "Anotonello", "9988907865", "123456", "test12@gmail.com", "t12@gmail.com", "11", "38 Decca Road", "35 Decca Road", "Goldsborough", "sdfg", "sdsdvc", "sdfsvd", "dfghggf", "dfgf", "dfghgffd", "fhfg", "sdfg", "sdff", "Name", "Passport No", "sdfghgg", "03/03/1999", "Reference", "53456", "xcv", "dsfg", "Savings", "sfdg", "mngf", "jhgf", "a", "12345678", "Note");

    }
}
