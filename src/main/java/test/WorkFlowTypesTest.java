package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.miscellaneous.WorkFlowTypes;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Date;

public class WorkFlowTypesTest extends BaseTest {

    public Select select;
    public Date date = new Date();

    @Test(priority = 1, description = "To Edit User ")
    public void workFlowTypes() {
        WorkFlowTypes wft = new WorkFlowTypes();
        wft.clickAdmin();
        wft.clickWorkFlowTypes();
        wft.clickCreateNewlog();
        String clname = date.toString();
        clname = clname.replace(":", "");
        clname = clname.replace(" ", "");
        wft.enterTypename("AA TN" + clname);
        wft.enterDisplayName("AA DN" + clname);
        wft.clickSaveButton();
        wft.clickSaveButton();
        wft.enterSearchLog("AA TN" + clname);
    }
}
