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
		planPage.enterName("Adam Johhns");
		planPage.clickDateFrom();
		planPage.selectDateFrom("");
		planPage.clickDateTo();
		planPage.selectDateTo("");
		planPage.clickAddTarif();
		planPage.enterChargeDescriptrion("Usage charge");
		planPage.enterRollupDescriptrion("None");
		planPage.selectChargeType("Water Charges");
		planPage.selectAllocation("Tester1");
		planPage.selectRatingMethod("Network Usage Flat Rate");
		Thread.sleep(1000);
		planPage.selectUnit("Kiloliter (kL)");
		planPage.enterRate("65");
		planPage.clickAdd();
		planPage.clickPublish();
		planPage.assertSuccessMessage();
			
	}

}
