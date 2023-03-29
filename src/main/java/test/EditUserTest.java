package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.userManager.UserDetails;
import org.automation.utilities.RandomGenerator;
import org.testng.annotations.Test;

public class EditUserTest extends BaseTest {
    RandomGenerator randomGenerator = new RandomGenerator();

    @Test(priority = 24, enabled = true,description = "Verify that user is able to Edit User ")
    public void EditUser() throws InterruptedException {
        UserDetails editUser = new UserDetails();
        editUser.clickAdmin();
        editUser.clickUsersDetails();
        Thread.sleep(2000);
        String firstName = "Andrew" + randomGenerator.requiredDigits(3);
        editUser.enterFirstName(firstName);
        String lastName = "Mattew" + randomGenerator.requiredDigits(3);
        editUser.enterLastName(lastName);
        Thread.sleep(2000);
        editUser.clickSaveBtn();
        editUser.clickOkBtn();
    }
}
