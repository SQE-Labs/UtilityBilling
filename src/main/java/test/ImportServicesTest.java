package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.AdminPage;
import org.automation.pageObjects.admin.importSetupTools.Imports;
import org.automation.pageObjects.customers.Customer;
import org.automation.pageObjects.customers.Services;
import org.automation.utilities.CSVHelper;
import org.automation.utilities.DateGenerator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ImportServicesTest extends BaseTest {
    AdminPage admin = new AdminPage();
    DateGenerator dateGenerator = new DateGenerator();
    Customer customer = new Customer();
    CSVHelper csvHelper = new CSVHelper();
    String meterNo;
    String serviceId;
    String customerId;

    @Test(priority = 0)
    public void Add_Customer_and_Service_for_Imports() throws Exception {
        extentTest = extent.startTest("Add_Customer_and_Service");
        customerId = customer.createCustomer("Business", "SSLabs", "Dino", "Anotonello", "9988907865", "test12@gmail.com", "t12@gmail.com",
                "38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
        ;
        Services services = new Services();
        serviceId = services.addService(customerId);
        services.editServiceStatus();

    }

    @Test(priority = 1, enabled = true)
    public void Import_Meter_Number() throws Exception {
        extentTest = extent.startTest(" Meter Number import ");
        extentTest.setDescription(" Verify that User is able to run meter number import");
        int random2 = (new Random()).nextInt(900) + 100;
        String meterImport_FilePath = System.getProperty("user.dir") + "/TestData/Electricity - Meter Import Template.csv";
        String col = "*Service ID,*Meter Serial Number,*Status,*Consumption Type,*Configuration,Multiplier,Constant,Hazard,Location,Additional Site Info,Meter Point ID,Next Scheduled Read Date,Manufacturer,Model,Meter Read Type,Route,Walk Order,*Meter Installation Type,*Date Connected,Date Removed";
        meterNo = "TestMeter" + random2;
        DateGenerator dateGenerator = new DateGenerator();
        String prodate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
        csvHelper.ImportMeterNumber(meterImport_FilePath, col, serviceId, meterNo, "Current", "Cumulative", "POS", "", "", "", "", "", "", "", "", "", "", "", "", "BASIC", prodate, "");
        AdminPage admin = new AdminPage();
        Imports importObj = admin.navigateToMeterNumberImports();
        importObj.meterNumberImport(meterImport_FilePath);
    }

    @Test(priority = 2, enabled = true)
    public void Import_Meter_Register() throws Exception {
        extentTest = extent.startTest(" Meter Register Import ");
        extentTest.setDescription(" Verify that User is able to run meter register using Import");
        String path = System.getProperty("user.dir") + "/TestData/Register Import Template.csv";
        DateGenerator dateGenerator = new DateGenerator();
        String prodate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
        String col = "*Service ID, *Meter Serial Number, *Register ID, *Network Tariff Code, *Unit Of Measure, *Time Of Day, *Multiplier, *Dial Format, *Suffix, *Controlled Load, *Status, *Consumption Type, *Demand1, *Demand2, *Date Connected, Date Removed ";
        csvHelper.ImportMeterRegister(path, col, serviceId, meterNo, "1", "NA", "KWH", "ALLDAY", "1", "5", "11", "No", "Current", "Cumulative", "0", "0", prodate, "");
        AdminPage admin = new AdminPage();
        Imports importObj = admin.navigateToMeterNumberImports();
        importObj.meterRegisterImport(path);

    }

    @Test(priority = 3, enabled = true)
    public void Import_Meter_Reads_Initial() throws Exception {
        extentTest = extent.startTest(" Meter Reads Import ");
        extentTest.setDescription(" Verify that User is able to   Import Meter reads");
        String path = System.getProperty("user.dir") + "/TestData/Meter Read Import Template - Manual.csv";
        DateGenerator dateGenerator = new DateGenerator();

        String readDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
        String col = "*Service ID,*Meter Number,*Date of Read,*Meter Read,*Period,*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate],Notes,Is Read Rollover? [Yes/No],Unit? [GAC-Cubic meter (m3)/GAB-Cubic feet (ft3)/GAA-British thermal unit (btu)/GAD-Kilowatt hour (kWh)/GAE-Mega joules (MJ)/GAF-Therms (th)],Datastream,Special Type";
        csvHelper.ImportMeterReads(path, col, serviceId, meterNo, readDate, "100", "P", "I", "notes", "", "", "E1", "none");
        Imports importObj = admin.navigateToMeterNumberImports();

        importObj.meterReadsImport(path);

    }

    @Test(priority = 4, enabled = true)
    public void Import_Meter_Reads_Consumption() throws Exception {
        extentTest = extent.startTest(" Meter Reads Import ");
        extentTest.setDescription(" Verify that User is able to   Import Meter reads");
        String path = System.getProperty("user.dir") + "/TestData/Meter Read Import Template - Manual.csv";

        String readDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
        String col = "*Service ID,*Meter Number,*Date of Read,*Meter Read,*Period,*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate],Notes,Is Read Rollover? [Yes/No],Unit? [GAC-Cubic meter (m3)/GAB-Cubic feet (ft3)/GAA-British thermal unit (btu)/GAD-Kilowatt hour (kWh)/GAE-Mega joules (MJ)/GAF-Therms (th)],Datastream,Special Type";
        AdminPage admin = new AdminPage();
        csvHelper.ImportMeterReads(path, col, serviceId, meterNo, readDate, "250", "P", "C", "notes", "", "", "12", "");
        Imports importObj = admin.navigateToMeterNumberImports();
        importObj.meterReadsImport(path);
    }

    @Test(priority = 4, enabled = true)
    public void Import_Customers() throws Exception {
      //  String [] column = {"*Service ID,*Meter Number,*Date of Read,*Meter Read,*Period,*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate],Notes,Is Read Rollover? [Yes/No],Unit? [GAC-Cubic meter (m3)/GAB-Cubic feet (ft3)/GAA-British thermal unit (btu)/GAD-Kilowatt hour (kWh)/GAE-Mega joules (MJ)/GAF-Therms (th)],Datastream,Special Type";
       // };

        // Conversion of array to ArrayList
        // using Arrays.asList
       // ArrayList alist = Arrays.asList(column);
      //  CSVHelper.createCSVGeneric(alist,);
    }

    @Test(priority = 4, enabled = true)
    public void Import_Recurring_Charge() throws Exception {

    }
    @Test(priority = 4, enabled = true)
    public void Import_Generic_Service() throws Exception {

    }
    @Test(priority = 4, enabled = true)
    public void Import_Payments() throws Exception {

    }
    @Test(priority = 4, enabled = true)
    public void Import_Demand_Reads() throws Exception {

    }
    @Test(priority = 4, enabled = true)
    public void Import_Prorated_Tariff() throws Exception {

    }
    @Test(priority = 4, enabled = true)
    public void Import_Security_Deposit() throws Exception {

    }
}
