package testlayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WalmartPOM.MyAddressTab;
import basepackage.baseclass;
import testdata.ExcelSheet;

public class MyAdderssTabTests extends baseclass{
	
	MyAddressTab log;
	
	public MyAdderssTabTests() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log = new MyAddressTab();
	}
	
	@DataProvider
	public Object[][] details(){
		Object details[][] = ExcelSheet.dataread("Sheet3");
		return details;
	}
	
	@Test(dataProvider = "details")
	public void address(String fname, String lname, String address1, String cityname, String post, String phonenumber) {
		log.accountlogin();
		log.addressdetails(fname, lname, address1, cityname, post, phonenumber);
	}
	
	@Test(dataProvider = "details")
	public void addressadd(String fname, String lname, String address1, String cityname, String post, String phonenumber) {
		log.addaddress();
		address(fname, lname, address1, cityname, post, phonenumber);
	}
	
	@Test
	public void teardown() {
		driver.close();
	}
}
