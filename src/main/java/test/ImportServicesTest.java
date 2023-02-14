package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.AdminPage;
import org.automation.pageObjects.admin.importSetupTools.Imports;
import org.automation.pageObjects.customers.Customer;
import org.automation.pageObjects.customers.RetailElectricityService;
import org.automation.utilities.CSVHelper;
import org.automation.utilities.DateGenerator;
import org.testng.annotations.Test;

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
        RetailElectricityService retailElectricityService = new RetailElectricityService();
        retailElectricityService.searchCustomer(customerId);
        serviceId = retailElectricityService.addRetailElectricityService();
        retailElectricityService.editServiceStatus();

    }

    @Test(priority = 1, enabled = true)
    public void Import_Meter_Number() throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/Customer Import Template.csv";
        String columnStr = "*Service ID,*Meter Serial Number,*Status,*Consumption Type,*Configuration,Multiplier,Constant,Hazard,Location,Additional Site Info,Meter Point ID,Next Scheduled Read Date,Manufacturer,Model,Meter Read Type,Route,Walk Order,*Meter Installation Type,*Date Connected,Date Removed";
        meterNo = "TestMeter" +  (new Random()).nextInt(900) + 100;
        DateGenerator dateGenerator = new DateGenerator();
        String prodate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
        String rowData="10000,,1,110001,1,1/1/2015,HE,R,No,1,,,,,1200-1,APT,Apartment 7,24,Hermit Park,APT,Mount Louisa,AUSTRALIA,4814,0,,,,,,,,";
        rowData.replace("10000",customerId);
        rowData.replace("110001",meterNo);
        rowData.replace("1/1/2015",prodate);
        String[] row = rowData.split(",");
        String[] column = columnStr.split(",");

        CSVHelper.createCSVGeneric(filePath,column,row);
        AdminPage admin = new AdminPage();
        Imports importObj = admin.navigateToCustomerImport();
        importObj.importFile(filePath);

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
        Imports importObj = admin.navigateToMeterReadingsImports();

        importObj.importFile(path);

    }

    @Test(priority = 4, enabled = true)
    public void Import_Meter_Reads_Consumption() throws Exception {
         String path = System.getProperty("user.dir") + "/TestData/Meter Read Import Template - Manual.csv";

        String readDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
        String column []=  {"Alternative Customer Number","Salutation [DR/MISS/MR/MRS/MS/MSTR]","*First Name","*Surname","*Billing Address","Billing Address2","Billing Suburb","Billing State","Billing Postal Code","Billing Country","Phone Number","*Mobile Number","Fax Number","Email","Company","Notes/Feedbacks","Legal Entity","ABN","ACN","*Is Home Address Same As Billing Address? [Yes/No]","Home Address","Home Address2","Home Suburb","Home State","Home Postal Code","Home Country","Category [B-Business/R-Residential]","Billing Email","Account Name","Authentication Type[AC/DL/PA/PN/PI/UB]","Authentication  No.","Date of Birth","Referee Name","Referee Contact Number","Referee relationship to tenant","Enable Internet Access? [Yes/No]","Password","Secondary Customer Name","Secondary Phone Number","Secondary Mobile Number","Secondary Fax Number","Secondary Email","Is life support? [Yes/No]","guarantorFirstName","guarantorLastName","guarantorAddress1","guarantorAddress2","guarantorCity","guarantorState","guarantorZipCode","guarantorMobilePhone","guarantorHomePhone","guarantorEmail","guarantorAuthType","guarantorAuthNo","cycleNo"};
        String filePath = System.getProperty("user.dir") + "/src/main/resources/Customer Import Template.csv";
        String rowData=",Mr,Sands,Hello,3090 Satellite Boulevard,,Duluth,GA,30096,United States,+1 800-001-0001,211 995 500 00 00 01,+1 800-001-0011,peter.andrews@alpha.mail.com,Basics Group of Companies,New customer,,96365484275,,Yes,,,,,,,B,pandrews@wideworld.com,Peter Andrews,AC,10012345,,Matt Andrews,+1 800-001-0100,Brother,No,pass123,Matt Andrews,+1 800-001-0011,211 995 500 00 00 11,,matt.andrews@worldmail.com,No,Mary,Palmer,Parker,Hills,White Pine Bay,Oregon,90414,3232332526,3233453423,rer@gmail.com,AC,78956,0";
        String[] row = rowData.split(",");
        CSVHelper.createCSVGeneric(filePath,column,row);
        AdminPage admin = new AdminPage();
        Imports importObj = admin.navigateToCustomerImport();
        importObj.importFile(filePath);

    }

    @Test(priority = 4, enabled = true)
    public void Import_Customers() throws Exception {
      String column []=  {"Alternative Customer Number","Salutation [DR/MISS/MR/MRS/MS/MSTR]","*First Name","*Surname","*Billing Address","Billing Address2","Billing Suburb","Billing State","Billing Postal Code","Billing Country","Phone Number","*Mobile Number","Fax Number","Email","Company","Notes/Feedbacks","Legal Entity","ABN","ACN","*Is Home Address Same As Billing Address? [Yes/No]","Home Address","Home Address2","Home Suburb","Home State","Home Postal Code","Home Country","Category [B-Business/R-Residential]","Billing Email","Account Name","Authentication Type[AC/DL/PA/PN/PI/UB]","Authentication  No.","Date of Birth","Referee Name","Referee Contact Number","Referee relationship to tenant","Enable Internet Access? [Yes/No]","Password","Secondary Customer Name","Secondary Phone Number","Secondary Mobile Number","Secondary Fax Number","Secondary Email","Is life support? [Yes/No]","guarantorFirstName","guarantorLastName","guarantorAddress1","guarantorAddress2","guarantorCity","guarantorState","guarantorZipCode","guarantorMobilePhone","guarantorHomePhone","guarantorEmail","guarantorAuthType","guarantorAuthNo","cycleNo"};
      String filePath = System.getProperty("user.dir") + "/src/main/resources/Customer Import Template.csv";
      String rowData=",Mr,Sands,Hello,3090 Satellite Boulevard,,Duluth,GA,30096,United States,+1 800-001-0001,211 995 500 00 00 01,+1 800-001-0011,peter.andrews@alpha.mail.com,Basics Group of Companies,New customer,,96365484275,,Yes,,,,,,,B,pandrews@wideworld.com,Peter Andrews,AC,10012345,,Matt Andrews,+1 800-001-0100,Brother,No,pass123,Matt Andrews,+1 800-001-0011,211 995 500 00 00 11,,matt.andrews@worldmail.com,No,Mary,Palmer,Parker,Hills,White Pine Bay,Oregon,90414,3232332526,3233453423,rer@gmail.com,AC,78956,0";
        String[] row = rowData.split(",");
          CSVHelper.createCSVGeneric(filePath,column,row);
        AdminPage admin = new AdminPage();
        Imports importObj = admin.navigateToCustomerImport();
        importObj.importFile(filePath);


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
