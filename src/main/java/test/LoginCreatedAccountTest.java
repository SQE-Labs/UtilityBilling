package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.LoginCreatedAccount;
import org.automation.pageObjects.LoginPage;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.Test;

public class LoginCreatedAccountTest extends BaseTest {

    @Test(priority=37,enabled = true)
    public void loginAccount() {
        LoginCreatedAccount userPage = new LoginCreatedAccount();
        LoginPage login = new LoginPage();

        userPage.clickAdmin();
        userPage.clickUsers();
        userPage.enterSearch("sqe.user");
        userPage.clickUserIcon();
        userPage.clickLogout();
        login.enterUsername(PropertiesUtil.getPropertyValue("userName"));
        login.enterPassword(PropertiesUtil.getPropertyValue("password"));
        userPage.clickLoginBtn();
        userPage.clickAdmin();
        userPage.clickUsers();
        userPage.enterSearch("sqe.user");
        userPage.clickInquiryCheckbox();
        userPage.clickUserIcon();
        userPage.clickLogout();

    }

}
