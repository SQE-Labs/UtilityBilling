package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.jsoup.Connection;
import org.openqa.selenium.By;

public class IndexPage  extends BasePage {
    public By footerVersion = By.xpath("//footer/div[2]");


    public  String getTextVersion(){
       return getText_custom(footerVersion)    ;
    }
}
