package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartPOM.MyListTab;
import basepackage.baseclass;

public class MyListTabTests extends baseclass{
	
	MyListTab log;
	
	public MyListTabTests() {
		super();
	}
	
	@BeforeMethod 
	public void setup() throws InterruptedException {
		initialize();
		log = new MyListTab();
	}
	
	@Test
	public void listtest() {
		log.listbtnclick();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
