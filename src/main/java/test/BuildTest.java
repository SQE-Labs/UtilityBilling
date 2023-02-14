package test;

import java.sql.Driver;

import org.automation.base.BasePage;
import org.automation.base.BaseTest;
import org.automation.utilities.Assertions;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BuildTest {
	WebDriver driver ;
	
	@BeforeMethod
	public void beforemethod(){
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Itsqe\\New folder\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();		 
	}
	
	@AfterMethod
	public void aftermethod(){
     driver.close();
	}
	
	@Test(priority = 1, enabled = true, description = "verify Customer Tabs")
	public void verifyCustomerTabs()  {
		//By version = By.cssSelector(".loginbody>div>p>span");
		//By copyright=By.className("copyright-text");
		By copyright = By.xpath("/html/body/div[3]/p/span[1]");
	    String[] arr = {
//	            "https://markettest.utilibill.com.au/marketbilling/",+
//	            "https://test.electricitybilling.com/billingtest/",
//	            "https://prod.electricitybilling.com/billing",
//	            "https://test.waterworkslms.com/waterworks",
//	            "https://prod.waterworkslms.com/waterworks",  
//	            "https://testing.utilibill.com.au/billingtest",
	            "https://utbr8.utilibill.com.au/billing/",
//	            "https://tvs.utilibill.com.au/truevaluesolaruat",+
//	            "https://tvs.utilibill.com.au/truevaluesolar",
//	            "https://winenergy.utilibill.com.au/winenergyuat",
//	            "https://winenergy.utilibill.com.au/winenergy",
	            "https://nuruat.utilibill.com.au/nur/",
	            "https://utbr8uat.utilibill.com.au/billing",
//	            "https://edp.waterworkslms.com/edp",
//	            "https://utbr8git.utilibill.com.au/billing/",
	            "https://test.utilitybilling.com/billing/",
	            "https://go.utilitybilling.com/billing/",
//	            "https://markettestv8.utilibill.com.au/marketbilling/",
//	            "https://stanwelluat.utilibill.com.au/stanwell/",
//	            "https://stanwell5msuat.utilibill.com.au/stanwell/",
//	            "https://powerclubuat.utilibill.com.au/powerclub/",
//	            "https://futurexenergyuat.utilibill.com.au/futurexenergy",
//	            "https://utbrxuat.utilibill.com.au/utbrx/",+
	            "https://test.utilitybilling.com/marketbilling/",
//	            "https://go2.utilitybilling.com/billing/",
//	            "https://test2.utilitybilling.com/billing/",
//	            "https://electricityinaboxuat.utilibill.com.au/electricityinabox/"+
	            };
	    
   	        SoftAssert softAssert = new SoftAssert();
   	        
	        for (int i = 0; i < arr.length; i++) {
	    	String versiontext ="";
	    	//driver.navigate()(arr[i]);
	    	try {
	    	driver.get(arr[i]);
	        versiontext = driver.findElement(copyright).getText();
	    	}
            catch( Exception e) {
	    	}
	    	
	     	System.out.println(versiontext);
	     //	System.out.println(PropertiesUtil.getPropertyValue("test1","buildversion.properties"));
	     //  softAssert.assertEquals(versiontext,PropertiesUtil.getPropertyValue("test1","buildversion.properties"));
        	}
	     //   softAssert.assertAll();
	        }
	   	    
//	        webservice.switchToWindow("");
//            webservice.verifyConsoleLogs();
//	        getScreenshot(getDriver(), fileName);
//	        webservice.navigateBack();

}
