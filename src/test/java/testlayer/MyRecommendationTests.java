package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartPOM.MyRecommendation;
import basepackage.baseclass;

public class MyRecommendationTests extends baseclass{
	
	MyRecommendation log;
	
	public MyRecommendationTests() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		initialize();
		log = new MyRecommendation();
	}
	
	@Test
	public void MyRecTab() {
		log.myrecdropdown();
		log.addtocartbtn();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
