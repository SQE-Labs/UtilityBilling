package test;

import static com.relevantcodes.extentreports.LogStatus.PASS;
import static com.relevantcodes.extentreports.LogStatus.FAIL;
import org.automation.base.BaseTest;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BuildTest extends BaseTest {

	By copyright = By.xpath("/html/body/div[3]/p/span[1]");

	@Test(priority = 1, enabled = true, description = "Verify First URL")
	public void validate_MarketTest() throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://markettest.utilibill.com.au/marketbilling/";
		Thread.sleep(5000);
		versiontext = getDriver().findElement(copyright).getText();
		Thread.sleep(5000);
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL1", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);

		softAssert.assertAll();
	}

	@Test(priority = 2, enabled = true, description = "Verify Second URL")
	public void validate_Utbr8Test() {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://utbr8.utilibill.com.au/billing/";
		versiontext = getDriver().findElement(copyright).getText();
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL2", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);
		softAssert.assertAll();
	}

	@Test(priority = 3, enabled = true, description = "Verfiy Third URL")
	public void validateNuruatTest() {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://nuruat.utilibill.com.au/nur/";
		versiontext = getDriver().findElement(copyright).getText();
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL3", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);
		softAssert.assertAll();
	}

	@Test(priority = 4, enabled = true, description = "Verfiy Fourth URL")
	public void validateUtbr8uatTest() {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://utbr8uat.utilibill.com.au/billing";
		versiontext = getDriver().findElement(copyright).getText();
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL4", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);
		softAssert.assertAll();
	}

	@Test(priority = 5, enabled = true, description = "Verfiy Fifth URL")
	public void validatetestTest() {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://test.utilitybilling.com/billing/";
		versiontext = getDriver().findElement(copyright).getText();
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL5", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);
		softAssert.assertAll();
	}

	@Test(priority = 6, enabled = true, description = "Verfiy Sixth URL")
	public void validateGoTest() {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://go.utilitybilling.com/billing/";
		versiontext = getDriver().findElement(copyright).getText();
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL6", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);
		softAssert.assertAll();
	}

	@Test(priority = 7, enabled = true, description = "Verfiy Seventh URL")
	public void validateUtilityMarketTest() {

		SoftAssert softAssert = new SoftAssert();

		String versiontext = "https://test.utilitybilling.com/marketbilling/";
		versiontext = getDriver().findElement(copyright).getText();
		softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL7", "buildversion.properties"));
		extentTest.log(PASS, "==> Version Text " + versiontext);
		softAssert.assertAll();
	}

//	@Test(priority = 8, enabled = true, description = "verify Customer Tabs")
//	public void verifyBuildVersions() {
//
//		By copyright = By.xpath("/html/body/div[3]/p/span[1]");
//		String[] arr = { "https://markettest.utilibill.com.au/marketbilling/",
//				"https://utbr8.utilibill.com.au/billing/", "https://nuruat.utilibill.com.au/nur/",
//				"https://utbr8uat.utilibill.com.au/billing", "https://test.utilitybilling.com/billing/",
//				"https://go.utilitybilling.com/billing/", "https://test.utilitybilling.com/marketbilling/",
//
//		};
//
//		SoftAssert softAssert = new SoftAssert();
//
//		for (int i = 0; i < arr.length; i++) {
//			String versiontext = "";
//
//			try {
//				getDriver().get(arr[i]);
//				versiontext = getDriver().findElement(copyright).getText();
//				extentTest.log(PASS, "==> Version Text " + versiontext);
//
//			} catch (Exception e) {
//				extentTest.log(FAIL, "Exception getting Version Text " + versiontext);
//
//			}
//			softAssert.assertEquals(versiontext,
//					PropertiesUtil.getPropertyValue("marketTest1", "buildversion.properties"));
//
//		}
//
//		softAssert.assertAll();
//
//	}

	@Test(priority = 9, enabled = true, description = "verify Customer Tabs")
	public void verifyBuild() {

		By copyright = By.xpath("/html/body/div[3]/p/span[1]");
		String[] arr = { "https://markettest.utilibill.com.au/marketbilling/",
				"https://test.electricitybilling.com/billingtest/", "https://prod.electricitybilling.com/billing",
				"https://test.waterworkslms.com/waterworks", "https://prod.waterworkslms.com/waterworks",
				"https://testing.utilibill.com.au/billingtest", "https://tvs.utilibill.com.au/truevaluesolaruat",
				"https://tvs.utilibill.com.au/truevaluesolar", "https://winenergy.utilibill.com.au/winenergyuat",
				"https://winenergy.utilibill.com.au/winenergy", "https://edp.waterworkslms.com/edp",
				"https://utbr8git.utilibill.com.au/billing/", "https://markettestv8.utilibill.com.au/marketbilling/",
				"https://stanwelluat.utilibill.com.au/stanwell/", "https://stanwell5msuat.utilibill.com.au/stanwell/",
				"https://powerclubuat.utilibill.com.au/powerclub/",
				"https://futurexenergyuat.utilibill.com.au/futurexenergy", "https://utbrxuat.utilibill.com.au/utbrx/",
				"https://go2.utilitybilling.com/billing/", "https://test2.utilitybilling.com/billing/",
				"https://electricityinaboxuat.utilibill.com.au/electricityinabox/" };

		SoftAssert softAssert = new SoftAssert();

		for (int i = 0; i < arr.length; i++) {
			String versiontext = "";
			try {
				getDriver().get(arr[i]);
				versiontext = getDriver().findElement(copyright).getText();
				extentTest.log(PASS, "==> Version Text " + versiontext);

			} catch (Exception e) {
				extentTest.log(FAIL, "Exception getting Version Text " + versiontext);

			}
			softAssert.assertNotNull(versiontext);

		}
		softAssert.assertAll();

	}

}