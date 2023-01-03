package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.EditGroup;
import org.testng.annotations.Test;

public class EditGroupTest extends BaseTest {
	
	@Test
	public void editGroup() throws InterruptedException {
		EditGroup Eg = new EditGroup();
		
		Eg.clickAdmin();
		Eg.clickEditGroup();
		Eg.enterCompanyName("testing002");
		
		Eg.entergroupOwner_1("Aida");
		Eg.entergroupOwner_2("Barkley");
		Eg.enterFinanceName("Elias");
		Eg.enterSalesName("Hartley");
		Eg.enterOperationContact("Charli");
		Eg.enterCollectionName("Bob");
		
		Eg.entergroupOwner_1("Aida@gmail.com");
		Eg.entergroupOwner_2("Barkley@gmail.com");
		Eg.enterFinanceName("Elias@gmail.com");
		Eg.enterSalesName("Hartley@gmail.com");
		Eg.enterOperationContact("Charli@gmail.com");
		Eg.enterCollectionName("Bob@gmail.com");
		
		Eg.entergroupOwner_1("123456789");
		Eg.entergroupOwner_2("987654321");
		Eg.enterFinanceName("65525655789");
		Eg.enterSalesName("12345545849");
		Eg.enterOperationContact("558156789");
		Eg.enterCollectionName("5566332211");
	   
		
	}

}
