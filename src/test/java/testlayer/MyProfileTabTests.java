package testlayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WalmartPOM.MyProfileTab;
import basepackage.baseclass;
import testdata.ExcelSheet;

public class MyProfileTabTests extends baseclass{
	
	MyProfileTab log;
	
	public MyProfileTabTests() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log = new MyProfileTab();
	}
	
	@DataProvider
	public Object[][] details(){
		Object details[][] = ExcelSheet.dataread("Sheet2");
		return details;
	}
	@Test
	public void accountlogin() {
		log.accountlogin();
	}
	
	@Test(dataProvider = "details", dependsOnMethods = {"accountlogin"})
	public void personalinfo(String fname, String lname, String post) {	
		log.namefield(fname, lname);
		log.postalcodefield(post);
	}
	
	@Test(dataProvider = "details", dependsOnMethods = {"accountlogin"})
	public void email(String email, String crntpwd) {	
		log.emailfield(email, crntpwd);
	}
	
	@Test(dataProvider = "details", dependsOnMethods = {"accountlogin"})
	public void password(String currentpass, String newpass) {	
		log.passwordfield(currentpass, newpass);
	}
	
	@Test(dependsOnMethods = {"accountlogin"})
	public void langselection() {
		log.langpref();
	}
	
	@Test(dependsOnMethods = {"accountlogin"})
	public void associatediscount() {
		log.associatediscount();
	}

}
