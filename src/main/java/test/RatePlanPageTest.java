package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.ratePlans.AddTarifPlans;
import org.automation.pageObjects.ratePlans.RatePlanPage;
import org.testng.annotations.Test;

public class RatePlanPageTest extends BaseTest {

	@Test
	public void createPlan() throws InterruptedException {
		RatePlanPage addTarif = new RatePlanPage();

		addTarif.clickRatePlans();
		addTarif.clickCreateNewPlan();
		addTarif.selectGroup("testing002");
		addTarif.selectUsageTypes("Retail Electricity");
		addTarif.enterName("Adam Johhns");
		addTarif.clickDateFrom();
		addTarif.selectDateFrom("");
		addTarif.clickDateTo();
		addTarif.selectDateTo("");
		addTarif.clickAddTarif();
		addTarif.enterChargeDescriptrion("Usage charge");
		addTarif.enterRollupDescriptrion("None");
		addTarif.selectChargeType("Water Charges");
		addTarif.selectAllocation("Tester1");
		addTarif.selectRatingMethod("Network Usage Flat Rate");
		Thread.sleep(1000);
		addTarif.selectUnit("Kiloliter (kL)");
		addTarif.enterRate("65");
		addTarif.clickAdd();
		addTarif.clickPublish();
		addTarif.assertSuccessMessage();
		
	}

}
