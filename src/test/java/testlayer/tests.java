package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartPOM.Accountlogin;
import basepackage.baseclass;

public class tests extends baseclass{
	Accountlogin log;
	
	public tests() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		initialize();
		log = new Accountlogin();
	}
	
	@Test (priority = 1)
	public void title() {
		String titleofweb = log.verify();
		Assert.assertEquals(titleofweb, "Walmart Canada");
		System.out.println(titleofweb);
	}
	
	@Test (priority = 2, dependsOnMethods = "title")
	public void login() throws InterruptedException {
		log.typeusername(prop.getProperty("username"));
		log.typepassword(prop.getProperty("password"));
		log.showpassword();
		Thread.sleep(3000);
		log.loginbtn();
	}
	
	@AfterMethod
	public void close() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
