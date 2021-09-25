package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartPOM.SignOut;
import basepackage.baseclass;

public class SignOutTests extends baseclass{
	
	SignOut log;
	
	public SignOutTests() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log = new SignOut();
	}
	
	@Test
	public void signout() {
		log.signoutbtn();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
