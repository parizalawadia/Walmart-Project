package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WalmartPOM.CreateAccount;
import basepackage.baseclass;
import testdata.ExcelSheet;

public class AccountCreationTests extends baseclass{
	
	CreateAccount log;
	
	public AccountCreationTests() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log = new CreateAccount();
	}
	
	@DataProvider
	public Object[][] AccountDetails(){
		Object details[][] = ExcelSheet.dataread("Sheet1");//Specify exact sheet name from where the data is to be read.
		return details;
	}
	
	@Test(dataProvider = "AccountDetails")
	public void accountdetails(String fname, String lname, String phone, String email, String password) {
		log.typefirstname(fname);
		log.typelasttname(lname);
		log.typephone(phone);
		log.typeemailid(email);
		log.typepassword(password);
		log.showpassword();
		log.consentchkbox();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}