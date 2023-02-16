package test;

import static com.relevantcodes.extentreports.LogStatus.PASS;
import static com.relevantcodes.extentreports.LogStatus.FAIL;

import java.sql.Driver;

import org.automation.base.BasePage;
import org.automation.base.BaseTest;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.Assertions;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BuildTest extends BaseTest {



//	@Test(priority = 1, enabled = true, description = "verify Customer Tabs")
//	public void verifyBuildVersions() {
//	
//		By copyright = By.xpath("/html/body/div[3]/p/span[1]");
//		String[] arr = { "https://markettest.utilibill.com.au/marketbilling/",
//           
//				"https://utbr8.utilibill.com.au/billing/",          
//				"https://nuruat.utilibill.com.au/nur/", 
//				"https://utbr8uat.utilibill.com.au/billing",
//				"https://test.utilitybilling.com/billing/",
//				"https://go.utilitybilling.com/billing/",
//				"https://test.utilitybilling.com/marketbilling/",
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
//			softAssert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("test1", "buildversion.properties"));
//
//		}
//
//      softAssert.assertAll();

//	}

	@Test(priority = 2, enabled = true, description = "verify Customer Tabs")
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