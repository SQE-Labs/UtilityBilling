package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class ChangePassword {
	
	BasePage loginPage = new BasePage();
	
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
	By passwordTab = By.xpath("//p[contains(text(),'Password')]");
    By newPasswordField = By.xpath("//input[@id='predigpass']");
    By reNewPassword = By.xpath("//input[@id='repredigpass']");
    By changePasswordBtn = By.xpath("//*[@class='buttonLrg']");
    By confirmationPopUp = By.xpath("//button[@class='btn btn-primary']");
    By informationMessage = By.xpath("//p[@class='message']");
    
    
	
    public void clickAdmin() {
		loginPage.clickBtn_custom(adminTab);
	    }
    
    public void clickPassword() {
		loginPage.clickBtn_custom(passwordTab);
	    }

    public void enterNewPassword(String userNameText ) {
		loginPage.sendKeys_custom(newPasswordField, userNameText);
	    }
    
    public void ReEnterNewPassword(String userNameText ) {
		loginPage.sendKeys_custom(reNewPassword, userNameText);
	    }

    public void clickChangePassword() {
		loginPage.clickBtn_custom(changePasswordBtn);
	    }
    
    public void clickConfirmPopup() {
		loginPage.clickBtn_custom(confirmationPopUp);
	    }
    
    public void getInformationMessage() {
		loginPage.clickBtn_custom(informationMessage);
	    }
}
