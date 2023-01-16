package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    By userNameField = By.xpath("//input[@name='j_username']");
    By PasswordField = By.xpath("//input[@name='predigpass']");
    By login = By.xpath("//*[@name='submit']");

    public void enterUsername(String userNameText) {
        sendKeys_custom(userNameField, userNameText);
    }

    public void enterPassword(String passNameText) {
        sendKeys_custom(PasswordField, passNameText);
    }

    public void clickLoginBtn() {
        clickBtn_custom(login);
    }

    public void login(String userName, String password) {
        enterUsername(userName);
        enterPassword(password);
        clickLoginBtn();
    }
}
