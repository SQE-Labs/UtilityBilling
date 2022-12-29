package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.ChargePage;
import org.automation.pageObjects.CustomerPage;
import org.automation.pageObjects.LoginPage;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElectPayment extends BaseTest


{
	CustomerPage cp =new CustomerPage();
	ChargePage sn=new ChargePage();
	
	@BeforeClass
	public void login(){
		try {
	
			LoginPage loginPage = new LoginPage();
		    System.out.println(getDriver().getTitle());
			loginPage.login(PropertiesUtil.getPropertyValue("userName"),PropertiesUtil.getPropertyValue("password"));

		}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	}
	
	@Test(priority = 2,description = "Create a Customer")
	public void createAPayment()
	{
		cp.createCustomer("Business","SS Labs","Kevin","Mills","9988907865","test12@gmail.com","t12@gmail.com","38 Decca Road","35 Decca Road","Goldsborough","3156","Australia","Electricity Residential plan",0,1000);
	}
	
	@Test(priority = 3,description = "Add a Manual Charge")
	public void addManualCharge() throws InterruptedException
	{
		sn.addOnceOffCharges(1,"Connection Fee","Description",0,1000,"20","20","200");
	}
	
	@Test(priority = 4,description = "Add a Recurring Charge")
	public void addRecurringCharge()
	{
		sn.addNewRecurringCharge(1,1,"1");
	}
}
