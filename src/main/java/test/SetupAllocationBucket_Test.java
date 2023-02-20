package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.SetUpAddNewBucket;
import org.testng.annotations.Test;

public class SetupAllocationBucket_Test extends BaseTest {
	
	SetUpAddNewBucket newBucket  = new SetUpAddNewBucket();
	
	
	@Test(priority = 1, description = "Setup New Bucket")
	public void setBucket() throws InterruptedException {
		newBucket.setUpBucket("AlexBucket1");
	   }

}
