package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartPOM.MyRegistries;
import basepackage.baseclass;

public class MyRegistriesTests extends baseclass{
	
	MyRegistries log;
	
	public MyRegistriesTests() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log  = new MyRegistries();
	}
	
	@Test
	public void myregistrybtn() throws InterruptedException {
		log.myregistries();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
