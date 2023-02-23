package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.DeleteAllocationBucket;
import org.automation.pageObjects.admin.SetUpAddNewBucket;
import org.automation.pageObjects.admin.UpdateAllocationBucket;
import org.testng.annotations.Test;

public class SetupAllocationBucket_Test extends BaseTest {

	SetUpAddNewBucket newBucket = new SetUpAddNewBucket();
	UpdateAllocationBucket updateBucket = new UpdateAllocationBucket();
	DeleteAllocationBucket deleteBucket = new DeleteAllocationBucket();

	@Test(priority = 1, description = "Setup Allocation Bucket")
	public void set_Bucket() throws InterruptedException {
		newBucket.setUpBucket("");
	}

	@Test(priority = 2, description = "Update Allocation Bucket")
	public void update_Bucket() throws InterruptedException {
		updateBucket.updateBucket("");
	}

	@Test(priority = 3, description = "Delete Allocation Bucket")
	public void delete_Bucket() throws InterruptedException {
		deleteBucket.deleteBucket("");
	}

}
