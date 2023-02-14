package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.ratePlans.RatePlanPage;
import org.automation.utilities.ActionEngine;
import org.testng.annotations.Test;

public class RatePlanPageTest extends BaseTest {

	@Test
	public void createPlan() throws InterruptedException {
		RatePlanPage planPage = new RatePlanPage();

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
