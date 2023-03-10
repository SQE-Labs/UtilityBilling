package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.billing.Penalty;
import org.automation.pageObjects.admin.miscellaneous.CustomerPortalSettings;
import org.automation.pageObjects.admin.paymentGateway.PaymentBatch;
import org.testng.annotations.Test;

public class OtherAdminTest extends BaseTest {

	PaymentBatch pb = new PaymentBatch();
	Penalty pen = new Penalty();
	CustomerPortalSettings cps = new CustomerPortalSettings();

	@Test(priority = 0)
	public void paymentBatchTest() {

		pb.clickAdmin();
		pb.clickPaymentBatch();
		pb.enterBatchNumber("3442");
		pb.selectTransType("P");
		pb.selectPaymentMethod("Cash");
		pb.selectIDUsed("Customer ID");
		pb.enterCustomerID("230874");
		pb.enterAmount("146");
		pb.enterComments("Payments Batch Generated");
		pb.clickRefresh();

	}

	@Test(priority = 1)
	public void createPenaltyTest() throws InterruptedException {

		pen.clickAdmin();
		pen.clickPenalty();
		pen.clickCreatePenalty();
		pen.selectPenaltyOptions("Simple Penalty");
		pen.enterPenaltyDescription("New Penalty Test");
		pen.enterGraceDays("10");
		pen.clickSavePenalty();
		pen.validatePenalty("Successfully added new penalty.");
	}

	@Test(priority = 2)
	public void updatePenaltyTest() {
		pen.clickEditPenalty();
		pen.enterPenaltyDescription("Penalty Check");
		pen.enterGraceDays("20");
		pen.clickSavePenalty();

	}

	@Test(priority = 3)
	public void deletePenaltyTest() {
		pen.clickDeletePenalty();
		pen.clickOKButton();

	}

	@Test(priority = 4)
	public void customerPortalSettings() throws InterruptedException {
		cps.clickAdmin();
		cps.clickCustomerPortal();
		cps.activateArchievedToggle();
		cps.enableServiceEditToggle();
		cps.enableAccountSettingDetailsEditToggle();
		cps.enableServiceSettingEditToggle();
		cps.enableCustomerPortalSignUpToggle();
		cps.clickSaveSetting();

	}

}
