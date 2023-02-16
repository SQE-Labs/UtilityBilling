package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.LoginPage;
import org.automation.pageObjects.customers.ChargePage;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mongodb.assertions.Assertions;

public class CreateCustomer extends BaseTest {
	
		ChargePage sn = new ChargePage();
		CreateServicePage cs = new CreateServicePage();
		Customer NC = new Customer();




	@Test(priority = 1, description = "Create Commercial Customer")
	public void createACommercialCustomer() throws InterruptedException {
		String CustomerId = NC.createCustomer("Tenant","Commercial", "SSLabs","Trade","Labs", "Dino", "Anotonello", "9988907865" ,"123456", "test12@gmail.com", "t12@gmail.com", "11","38 Decca Road", "35 Decca Road", "Goldsborough","sdfg","sdsdvc","sdfsvd","dfghggf","dfgf","dfghgffd","fhfg", "sdfg", "sdff","Name","Passport No","sdfghgg","03/03/1999","Reference","53456","xcv","dsfg","Savings","sfdg","mngf","jhgf","a","12345678","Note");
		}

		@Test(priority = 2, description = "Create Business Customer")
		public void createABusinessCustomer() throws InterruptedException {
			 String CustomerId = NC.createCustomer("Tenant","Business", "SSLabs","Trade","Labs", "Dino", "Anotonello", "9988907865" ,"123456", "test12@gmail.com", "t12@gmail.com", "11","38 Decca Road", "35 Decca Road", "Goldsborough","sdfg","sdsdvc","sdfsvd","dfghggf","dfgf","dfghgffd","fhfg", "sdfg", "sdff","Name","Passport No","sdfghgg","03/03/1999","Reference","53456","xcv","dsfg","Savings","sfdg","mngf","jhgf","a","12345678","Note");
		  }
		@Test(priority = 3, description = "Create Residential Customer")
		public void createAresidentialCustomer() throws InterruptedException {
			 String CustomerId = NC.createCustomer("Tenant","Residential", "SSLabs","Trade","Labs", "Dino", "Anotonello", "9988907865" ,"123456", "test12@gmail.com", "t12@gmail.com", "11","38 Decca Road", "35 Decca Road", "Goldsborough","sdfg","sdsdvc","sdfsvd","dfghggf","dfgf","dfghgffd","fhfg", "sdfg", "sdff","Name","Passport No","sdfghgg","03/03/1999","Reference","53456","xcv","dsfg","Savings","sfdg","mngf","jhgf","a","12345678","Note");
		  }
        }