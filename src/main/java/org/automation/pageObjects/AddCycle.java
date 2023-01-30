package org.automation.pageObjects;

import org.openqa.selenium.By;

public class AddCycle 

{
	public static String CUSTnum;

	public static By Admin = By.xpath("//a[@title='Administration']");
	public static By SMTPicon = By.xpath("(//i[@class='icon-hdd'])[2]");
	public static By SrverField = By.xpath("//input[@name='smtpServer']");
	public static By PortField = By.xpath("//input[@name='smtpPort']");
	public static By UserAuthCheckbox = By.xpath("//input[@id='auth']");
	public static By Username = By.xpath("//input[@class='auth-inputs']");
	public static By Password = By.xpath("(//input[@class='auth-inputs'])[2]");
	public static By UpdateSMTPbutton = By.xpath("//a[@class='btn btn-large btn-primary']");

	public static By TemplateIcon = By.xpath("//i[@class='glyphicon glyphicon-comment']");
	public static By MsgType = By.xpath("//select[@id='email_message_type']");
	public static By Emailfrom = By.xpath("//input[@id='email_rem_from']");
	public static By Emailbcc = By.xpath("//input[@id='email_rem_bcc']");
	public static By Subject = By.xpath("//input[@id='email_rem_subject']");
	public static By SaveEmailTemp = By.xpath("(//button[@id='validtagsEmail'])[2]");
	public static By SavedEmailMsg = By.xpath("//div[@class='alert alert-success']/center/p");
	public static By SMStab = By.xpath("//ul[@id='myTab']/li[2]/a");
	public static By Messagetyp = By.xpath("(//tr[@class='frmTb2'])[5]/td[2]/select");
	public static By SMSmsg = By.xpath("//textarea[@id='sms_rem_message']");
	public static By SaveSMS = By.xpath("(//a[@class='buttonSml'])[2]");
	public static By CustDetailsTab = By.xpath("//ul[@class='nav nav-tabs']/li[2]");
	public static By CustEmailField = By.xpath("//input[@name='contact_email']");
	public static By SaveCust = By.xpath("//a[@id='saveButton']");
	public static By OKbtnn = By.xpath("//button[text()='OK']");
	public static By SavedCustMsg = By.xpath("//div[@id='notification']/center");
	public static By CustNumberCreated = By.xpath("(//a[@class='prevent'])[3]/p/b");
	public static By BillRunCycle = By.xpath("(//div[@class='box-content quicklinksbox'])[6]/div[2]");
	public static By CreateCycle = By.xpath("//a[@id='addBtn']");
	public static By CycleName = By.xpath("//input[@id='cyclename']");
	public static By SearchCustForCycle = By.xpath("//input[@class='filter form-control']");
	public static By SelectCust = By.xpath("//select[@name='custnos_helper1']/option");
	public static By RightArrow = By.xpath("(//i[@class='glyphicon glyphicon-arrow-right'])[3]");
	public static By SaveCyc = By.xpath("//button[@id='saveCycle']");
	public static By CycleSavedSuccess = By.xpath("//span[@id='resultMsg']");
	public static By MainCustSearch = By.xpath("//input[@id='search_input']");
	public static By SearchIcon = By.xpath("//button[@id='btn_search']");

	public static By MeterReadsTab = By.xpath("//ul[@class='nav nav-tabs']/li[4]");
	public static By AddRead = By.xpath("//a[@class='btn btn-mini btn-primary addRead']");
	public static By ReadType = By.xpath("//select[@id='modalReadType']");
	public static By ReadDate = By.xpath("//input[@id='modalReadDate']");
	public static By TodayDate = By.xpath("//td[@class='active day']");
	public static By ReadReadings = By.xpath("//input[@id='modalReadingA']");
	public static By SaveReads = By.xpath("(//button[@class='btn btn-primary'])[2]");
	public static By ReadTypeSaved = By.xpath("//tr[@id='0']/td[4]");
	public static By SelectMeterNumbr = By.xpath("//select[@name='meterNo']");
	public static By NextDate = By.xpath("//td[@class='active day']/following-sibling::td");

	public static By BillRunTab = By.xpath("//a[@title='Saas Bill Run']/i");
	public static By RunTheBills = By.xpath("//button[@class='btn btn-success']");
	public static By Reccurringdate = By.xpath("//input[@id='cycleDate']");
	public static By IssueDate = By.xpath("//input[@id='issueDate']");
	public static By DueDate = By.xpath("//input[@id='dueDate']");
	public static By CycleNumber = By.xpath("//select[@id='cycleno']");
	public static By RunBillBtn = By.xpath("//button[@class='btn btn-primary']");
	public static By NextDay = By.xpath("//td[@class='new day']");
	
	
	public void getCustNoCreated() 
	{
		//CUSTnum=
		
	}
}
