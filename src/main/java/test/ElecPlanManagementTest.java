package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.EditGroup;
import org.automation.pageObjects.ElecPlanManagement;
import org.testng.annotations.Test;

public class ElecPlanManagementTest extends BaseTest {
	
	@Test
	public void createPlan() throws InterruptedException {
		ElecPlanManagement planPage = new ElecPlanManagement();
		
		planPage.clickRatePlans();
		planPage.clickCreateNewPlan();
		planPage.selectGroup("testing002");
		planPage.selectUsageTypes("Retail Electricity");
		planPage.enterName("Adam Johns");
		planPage.clickDateFrom();
		Thread.sleep(2000);
		planPage.selectDateFrom("dd/mm/yyyy");
		Thread.sleep(2000);
		planPage.clickDateTo();
		Thread.sleep(2000);
		planPage.selectDateTo("DD/MM/YYYY");
		planPage.clickAddTarif();
		planPage.enterChargeDescriptrion("Usage charge");
		planPage.enterRollupDescriptrion("None");
		planPage.selectChargeType("Water Charges");
		planPage.selectAllocation("Tester1");
		planPage.selectRatingMethod("Network Usage Flat Rate");
		Thread.sleep(5000);
		planPage.selectUnit("Kiloliter (kL)");
		planPage.enterRate("65");
		planPage.clickAdd();
				
		
	}

}
