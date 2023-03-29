package org.automation.pageObjects.admin.commmunications;

import org.automation.base.BasePage;
import org.automation.utilities.ActionEngine;
import org.automation.utilities.Assertions;
import org.automation.utilities.RandomGenerator;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class ReminderSetup extends BasePage {

    RandomGenerator randomGenerator = new RandomGenerator();


    public By reminderName = By.xpath("(//*[@name='Rem2'])[2]");

    public By numberOfDays = By.xpath("(//*[@name='days2'])[2]");


    public By dueDate = By.xpath("(//*[@name='cutoff2'])[2]");

    public By minimumAmount = By.xpath("(//*[@id='min2'])[2]");

    public By autoSend = By.xpath("(//*[@id='out2'])[2]");
    public By followUpActivity = By.xpath("//*[@id='follow2']");

    public By deliveryEmail = By.xpath("(//*[@id='email2'])[2]");

    public By deliveryPost = By.xpath("(//*[@id='post2'])[1]");

    public By updateReminder = By.id("reminders-schedule-update");

    public By okButton = By.xpath("//button[@class='btn btn-primary']");

    public By AdminIcon = By.xpath("//a[@title='Administration']/i");

    public By addNewRow = By.xpath("(//button[@class='btn btn-expand'])[2]");



    public void enter_ReminderName(String nameText) {
        sendKeys_withClear(reminderName,nameText);
    }

    public void clickAdminIcon(){
        click_custom(AdminIcon);
    }

    public void clickDeleteReminder(String reminderName){
        reminderName="New Reminder";
        click_custom(By.xpath("//td/input[@value='"+reminderName+"']/../../td[9]/a"));
    }

    public void clickAddNewRow(){
        click_custom(addNewRow);
    }

    public void enter_NumberOfDays(String numberOfDaysText) {
        sendKeys_withClear(numberOfDays,numberOfDaysText);
    }

    public void enter_DueDate(String dueDateText) {
        sendKeys_withClear(dueDate,dueDateText);
    }

    public void enter_MinimumAmount(String amountValue) {
        sendKeys_withClear(minimumAmount,amountValue);
    }
    public void click_UpdateReminder() {
        click_custom(updateReminder);
    }

    public void add_Delete_Reminder(String reminderName,String numberOfDaysText,String dueDateText,String amountValue) throws InterruptedException {
        clickAddNewRow();
        enter_ReminderName(reminderName)     ;
        enter_NumberOfDays(numberOfDaysText);
        enter_DueDate(dueDateText);
        Thread.sleep(1000);
        enter_MinimumAmount(amountValue);
        click_custom(autoSend);
        click_custom(followUpActivity);
        click_custom(deliveryEmail);
        click_custom(deliveryPost);
        clickDeleteReminder(reminderName);
        click_custom(okButton);
        Thread.sleep(2000);


    }
}
