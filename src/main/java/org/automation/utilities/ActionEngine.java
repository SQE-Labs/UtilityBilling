package org.automation.utilities;

import com.aventstack.extentreports.Status;
import org.automation.elements.Button;
import org.automation.elements.CheckBox;
import org.automation.elements.DropDown;
import org.automation.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ActionEngine {


    public  void sendKeys_custom(By path, String valueToBeSent, String... label) {
        String var = "";
        try {
            var = label.length > 0 ? label[0] : path.toString();
            Element element = new Element(var, path);
            element.getWebElement().sendKeys(valueToBeSent);
            //log success message in extent report
            // ExtentFactory.getInstance().getExtent().log(Status.PASS,"Entered value as: "+valueToBeSent);
        } catch (Exception e) {
            //log failure in extent
            //  ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Value enter in field: is failed due to exception: "+e);
        }
    }

    public  void sendKeys_withClear(By path, String valueToBeSent, String... label) {

        String var = "";
        try {
            var = label.length > 0 ? label[0] : path.toString();
            Element element = new Element(var, path);
            element.clear();
            element.getWebElement().sendKeys(valueToBeSent);
            //log success message in extent report
            ExtentFactory.getInstance().getExtent().log(Status.PASS, "Ented value as: ");
        } catch (Exception e) {
            //  log failure in extent
            //  ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Value enter in field: is failed due to exception: "+e);
        }
    }


    //custom click method to log evey click action in to extent report
    public  void clickBtn_custom(By path, String... label) {
        String var = "";
        try {
            var = label.length > 0 ? label[0] : path.toString();

            Button btn = new Button(var, path);
            btn.click();
            //log success message in exgent report
            ExtentFactory.getInstance().getExtent().log(Status.PASS, var + "==> Clicked Successfully! ");
        } catch (Exception e) {
            //log failure in extent
            // ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to click on field: " +fieldName +" due to exception: "+e);
        }
    }


    //clear data from field
    public  void clear_custom(By element) {
        try {

            ((WebElement) element).clear();
            Thread.sleep(250);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, "==> Data Cleared Successfully! ");
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to clear Data on field:  due to exception: " + e);

        }
    }

    //custom mouseHover
    public  void moveToElement_custom(By element, String fieldName) {
//            try{
//                JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
//                executor.executeScript("arguments[0].scrollIntoView(true);", element);
//                Actions actions = new Actions(DriverFactory.getInstance().getDriver());
//                actions.moveToElement(element).build().perform();
//                ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Mouse hovered Successfully! ");
//                Thread.sleep(1000);
//            }catch(Exception e){
//                ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to hover mouse on field: " +fieldName +" due to exception: "+e);
//
//            }
    }


    //check if element is Present
    public  boolean isElementPresent_custom(WebElement element, String fieldName) {
        boolean flag = false;
        try {
            flag = element.isDisplayed();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName + "==> Presence of field is: " + flag);
            return flag;
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Checking for presence of field: " + fieldName + " not tested due to exception: " + e);
            return flag;
        }
    }


    //Select dropdown value value by visibleText
    public  void selectDropDownByVisibleText_custom(By path, String ddVisibleText, String... fieldName) {

        String var = "";
        try {
            var = fieldName.length > 0 ? fieldName[0] : path.toString();
            DropDown dd = new DropDown(var, path);
            dd.selectByVisibleText(ddVisibleText);
            //   ExtentFactory.getInstance().getExtent().log(Status.PASS, var+"==> Dropdown Value Selected by visible text: "+ ddVisibleText);
        } catch (Exception e) {
            //    ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown value not selected for field: " +var +"  due to exception: "+e);
        }
    }

    //Select dropdown value value by value
    public  void selectDropDownByValue_custom(By path, String ddValue, String... fieldName) {
        String var = "";
        try {
            var = fieldName.length > 0 ? fieldName[0] : path.toString();
            DropDown dd = new DropDown(var, path);
            dd.selectByValue(ddValue);
            //   ExtentFactory.getInstance().getExtent().log(Status.PASS, var+"==> Dropdown Value Selected by visible text: "+ ddValue);
        } catch (Exception e) {
            //   ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown value not selected for field: " +var +"  due to exception: "+e);
        }
    }

    //Select dropdown list by index
    public  void selectDropDownByIndex_custom(By path, int ddValue, String... fieldName) {
        String var = "";
        try {
            var = fieldName.length > 0 ? fieldName[0] : path.toString();
            DropDown dd = new DropDown(var, path);
            dd.selectByIndex(ddValue);
            //   ExtentFactory.getInstance().getExtent().log(Status.PASS, var+"==> Dropdown Value Selected by visible text: "+ ddValue);
        } catch (Exception e) {
            //  ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown value not selected for field: " +var +"  due to exception: "+e);
        }
    }

    //Get text from webelement
    public   String getText_custom(By path) {
        String text = "";
        try {

            Element element = new Element("", path);
            text = element.getText();
            //  ExtentFactory.getInstance().getExtent().log(Status.PASS, "==> Text retried is: "+ text);
            return text;
        } catch (Exception e) {
            //   ExtentFactory.getInstance().getExtent().log(Status.FAIL, "==> Text not retried due to exception: "+ e);

        }
        return text;
    }

    public  void selectCheckBox(By path, String... fieldName) {
        String var = fieldName.length > 0 ? fieldName[0] : path.toString();
        CheckBox checkBox = new CheckBox(var, path);
        checkBox.check();
    }

    public  void uncheckCheckBox(By path, String... fieldName) {
        String var = fieldName.length > 0 ? fieldName[0] : path.toString();
        CheckBox checkBox = new CheckBox(var, path);
        checkBox.uncheck();
    }

    public  boolean getCheckBoxValue(By path, String... fieldName) {
        String var = fieldName.length > 0 ? fieldName[0] : path.toString();
        CheckBox checkBox = new CheckBox(var, path);
        return checkBox.isChecked();
    }




}
