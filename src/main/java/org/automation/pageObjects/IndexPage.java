package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.pageObjects.customers.Details;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {

    // Search Field
    public By SearchField = By.xpath("//*[@id=\"search_input\"]");
    public  By SearchIcon = By.xpath("//*[@class=\"glyphicon glyphicon-search\"]");
    public  By OverviewTab = By.xpath("//*[@class=\"icon-eye-open\"]"); // //*[contains(text(),'Overview')]

    public Details searchCustomer(String customerId){
        clickBtn_custom(SearchIcon);
        clickBtn_custom(SearchField);
        sendKeys_custom(SearchField, customerId);
        clickBtn_custom(SearchIcon);
        return new Details();
    }

}
