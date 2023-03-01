package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.automation.pageObjects.admin.groupManager.EditGroup;
import org.automation.pageObjects.admin.importSetupTools.Imports;
import org.automation.pageObjects.admin.miscellaneous.InvoiceSetup;
import org.openqa.selenium.By;
import test.BillRunTest;

public class AdminPage extends BasePage {
    public  By MeterNumbersIcon = By.xpath("//p[text()='Meter Numbers']");
    public  By AdminIcon = By.xpath("//a[@title='Administration']/i");
    public  By btnbrowseFile = By.id("btnbrowseFile");
    public  By attDesc = By.id("attDesc");

    public  By invoiceSetupBtn = By.xpath("//p[text()='Invoice Set-up']");
    public  By groupEditBtn = By.xpath("//p[text()='Edit Group']");
    public  By billRun = By.xpath("//span[text()='Bill Run']");
    public  By plans = By.xpath("//span[text()='Plans']");
    public  By customers = By.xpath("//p[text()='Customers']");

    public InvoiceSetup navigateToInvoiceSetup(){
        clickBtn_custom(AdminIcon);
        clickBtn_custom(invoiceSetupBtn);
        return new InvoiceSetup();

    }
    public  EditGroup navigateToEditGroup(){
        clickBtn_custom(AdminIcon);
        clickBtn_custom(groupEditBtn);
        return new EditGroup();

    }
    public BillRunTest navigateToBillRun(){
        clickBtn_custom(AdminIcon);
        scrollIntoView(billRun);
        clickBtn_custom(billRun);
        return new BillRunTest();


    }
    public  void navigateToPlans(){
        clickBtn_custom(AdminIcon);
        clickBtn_custom(plans);

    }
    public  Imports navigateToMeterNumberImports(){
        clickBtn_custom(AdminIcon);
        clickBtn_custom(plans);
        return new Imports();

    }
    public  Imports navigateToMeterReadingsImports(){
        clickBtn_custom(AdminIcon);
        clickBtn_custom(plans);
        return new Imports();

    }
    public  Imports navigateToCustomerImport(){
        clickBtn_custom(AdminIcon);
        scrollIntoView(customers);
        clickBtn_custom(customers);
        return new Imports();

    }
}
