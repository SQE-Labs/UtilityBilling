package org.automation.pageObjects.outbox;

import org.automation.base.BasePage;
import org.automation.pageObjects.admin.commmunications.ReminderSetup;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class OutBoxPage extends BasePage {
    private By generateRemindersBtn = By.id("generate");
    private By downloadBtn = By.xpath("//button[contains(text(),'Download')][@class='btn btn-large dropdown-toggle btn-primary']");
    private By sendBtn = By.id("sendToCustomMail");
    private By searchBox = By.xpath("//input[@type='search']");
    private By viewVoiceBtn = By.xpath("//a[@title='View Invoice']");
    private By deleteRemBtn = By.xpath("//a[@title='Delete Reminder']");
    public By outbox = By.xpath("//*[@id='navbar-menu']/div/ul/li[8]/a");

    public By customerCheckbox = By.xpath("(//input[@class='chkDelete_'])[1]");

    public By send = By.xpath("(//button[@class='btn btn-large dropdown-toggle btn-primary'])[2]");

    public By selectedCustomers = By.xpath("//a[text()=' Selected customers']");

    public By confirmSend = By.xpath("(//*[@class='btn btn-primary'])[14]");

    public By closeOutbox = By.id("sendEmailResultClose");

    public By validateOutbox = By.xpath("(//div/h4[@class='modal-title'])[2]");


    public void clickGenerateReminderBtn() {
        clickBtn_custom(generateRemindersBtn, "Generate Reminders");

    }

    public void clickViewVoiceBtn() {
        clickBtn_custom(viewVoiceBtn, "View Voice");

    }

    public void enter_in_SearchBox(String searchText) {
        sendKeys_custom(searchBox, searchText, "Search");

    }
    public void navigateToOutbox(){
        click_custom(outbox);
    }

    public void clickCustomerCheckbox(){
        click_custom(customerCheckbox);
    }

    public void clickSend(){
        click_custom(send);
    }

    public void clickSelectedCustomer(){
        click_custom(selectedCustomers);

    }

    public void clickConfirmSend(){
        click_custom(confirmSend);
    }

    public void clickCloseOutbox(){
        click_custom(closeOutbox);
    }


    public void ValidateOutbox(String expectedValue){
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(expectedValue, getText_custom(validateOutbox));
    }
    public void sendEmail_SelectedCustomer(){
        clickCustomerCheckbox();
        clickSend();
        clickSelectedCustomer();
        clickConfirmSend();
        clickCloseOutbox();
    }

}
