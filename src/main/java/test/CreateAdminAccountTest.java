package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.CreateAdminAccount;
import org.automation.utilities.RandomGenerator;
import org.testng.annotations.Test;

public class CreateAdminAccountTest extends BaseTest {

    RandomGenerator randomGenerator = new RandomGenerator();
    @Test(priority=1,enabled = true,description = "Verify that user is able to create account")
    public void createAccount() throws InterruptedException {

        CreateAdminAccount adminPage = new CreateAdminAccount();

        adminPage.clickAdmin();
        adminPage.clickUsers();
        adminPage.clickCreateNewUser();
        adminPage.selectGroup("testing002");
        String newUser = "NewUser" + randomGenerator.requiredDigits(3);
        adminPage.enterUsername(newUser);
        Thread.sleep(1000);
        adminPage.enterPassword("Test@12345");
        adminPage.clickSaveUser();
        adminPage.validateNewUser(newUser);

    }

}
