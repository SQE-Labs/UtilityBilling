package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.ratePlans.AddCommercialPlan;
import org.automation.pageObjects.ratePlans.AddMonthlyPlan;
import org.automation.pageObjects.ratePlans.AddMonthlyTarif;
import org.automation.pageObjects.ratePlans.AddTarifConnectionFee;
import org.automation.pageObjects.ratePlans.AddTarifPlan;
import org.automation.pageObjects.ratePlans.RatePlanPage;
import org.testng.annotations.Test;

public class ElecPlanManagementTest extends BaseTest {
	
	RatePlanPage plan  = new RatePlanPage();
	AddTarifPlan tarifPlan = new AddTarifPlan();
	AddMonthlyTarif monthlyTarif = new AddMonthlyTarif();
	AddTarifConnectionFee connectionFee = new AddTarifConnectionFee();
	AddCommercialPlan commercialPlan = new AddCommercialPlan();
	AddMonthlyPlan monthlyPlan = new AddMonthlyPlan();
	

//	@Test(priority = 1, description = "Create Plan")
//	public void createPlan() throws InterruptedException {
//		plan.createPlan("testing002","Retail Electricity","Adam Johhns","","","Usage charge","None","Water Charges","Tester1","Network Usage Flat Rate","Kiloliter (kL)","65");	
//	   }
	
//	@Test(priority = 2, description = "Add Tarif")
//	public void addTarif() throws InterruptedException {
//		tarifPlan.addTarif("Usage charge","None","Electricity Charges","Tester1","Network Usage Flat Rate","Kilowatt (KW)","65");		
//	   }
	
//	@Test(priority = 3, description = "Add Monthly Tarif")
//	public void addMonthlyTarif() throws InterruptedException {
//		monthlyTarif.addMonthlyTarif("monthly administration fee","None","Electricity Charges","Tester1","Usage Tiered Monthly","Kilowatt (kW)","No Tax","10","100","1000");		
//	   }
	
//	@Test(priority = 4, description = "Add Tarif Connection Fee")
//	public void addTarifConnectionFee() throws InterruptedException {
//		connectionFee.addTarifConnection("Connection Fee","None","Account Level Charges","Tester1","Access Fee Per Day","Month","60","No Tax");		
//	   }
	
	@Test(priority = 5, description = "Add Commercial Plan")
	public void addCommercialPlan() throws InterruptedException {
		commercialPlan.createCommercialPlan("testing002","Retail Electricity","Adams Johhons","","","Usage commerical","None","Electricity Charges","Tester1","Usage Peak","Kilowatt (kW)","65");	
	   }
	
//	@Test(priority = 6, description = "Add Monthly Plan")
//	public void addMonthlyPlan() throws InterruptedException {
//		monthlyPlan.addMonthlyPlan("monthly administration fee","None","Electricity Charges","Tester1","Usage Tiered Monthly","Kilowatt (kW)","No Tax","20","100","1000");		
//	   }
	}


