package org.automation.pageObjects.admin.userManager;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class Password extends BasePage {

    By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
    By passwordTab = By.xpath("//p[contains(text(),'Password')]");
    By newPasswordField = By.xpath("//input[@id='predigpass']");
    By reNewPassword = By.xpath("//input[@id='repredigpass']");
    By changePasswordBtn = By.xpath("//*[@class='buttonLrg']");
    By confirmationPopUp = By.xpath("//button[@class='btn btn-primary']");
    By informationMessage = By.xpath("//p[@class='message']");
    By success_msg = By.xpath("//div//p[@class='message']");


    public void clickAdmin() {
        clickBtn_custom(adminTab);
    }

    public void clickPassword() {
        clickBtn_custom(passwordTab);
    }

    public void enterNewPassword(String userNameText) {
        sendKeys_custom(newPasswordField, userNameText);
    }

    public void ReEnterNewPassword(String userNameText) {
        sendKeys_custom(reNewPassword, userNameText);
    }

    public void clickChangePassword() {
        clickBtn_custom(changePasswordBtn);
    }

    public void clickConfirmPopup() {
        clickBtn_custom(confirmationPopUp);
    }

    public void getInformationMessage() {
        clickBtn_custom(informationMessage);
    }

    public void validateSuccessMessage(String expectedValue) {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(expectedValue, getText_custom(success_msg));

    }
}
