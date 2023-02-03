package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.ratePlans.AddTarifPlans;
import org.testng.annotations.Test;

public class AddTarifTest extends BaseTest {
	
	@Test
	public void addTarifPlans() throws InterruptedException {
		AddTarifPlans addTarif = new AddTarifPlans();
		addTarif.clickRatePlans();
		addTarif.clickCreateNewPlan();
		addTarif.selectGroup("testing002");
		addTarif.selectUsageTypes("Retail Electricity");
		addTarif.enterName("Ricky Martin");
		addTarif.clickDateFrom();
		addTarif.selectDateFrom("");
		addTarif.clickDateTo();
		addTarif.selectDateTo("");
		addTarif.clickAddTarif();
	}

}
