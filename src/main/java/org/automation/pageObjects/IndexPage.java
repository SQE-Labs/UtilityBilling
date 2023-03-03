package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.pageObjects.customers.Details;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
public class IndexPage extends BasePage {

    // Search Field
    public By SearchField = By.xpath("//*[@id=\"search_input\"]");
    public  By SearchIcon = By.xpath("//*[@class=\"glyphicon glyphicon-search\"]");
    public  By OverviewTab = By.xpath("//*[@class=\"icon-eye-open\"]"); // //*[contains(text(),'Overview')]
    public By footerVersion = By.xpath("//footer/div[2]");

    public Details searchCustomer(String customerId){
        clickBtn_custom(SearchIcon);
        clickBtn_custom(SearchField);
        sendKeys_custom(SearchField, customerId);
        clickBtn_custom(SearchIcon);
        return new Details();
    }
    public void searchCustomerFromSearchPanel(String customerId){

        sendKeys_custom(SearchField, customerId);
        clickBtn_custom(SearchIcon);
    }
    public  String getTextVersion(){
       return getText_custom(footerVersion)    ;
    }
}
