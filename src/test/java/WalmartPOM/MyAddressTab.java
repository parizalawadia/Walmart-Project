package WalmartPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.baseclass;

public class MyAddressTab extends baseclass{
	
	JavascriptExecutor exec = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement MyaccountBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[2]/div[3]/div[1]/div[2]/a[3]/div[1]") WebElement AddressBtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div[3]/button[1]") WebElement AddressEdit;
	
	@FindBy(id = "firstName") WebElement firstname;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[1]/div[1]/button") WebElement FirstNameCross;
	
	@FindBy(id = "lastname") WebElement lastname;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[1]/div[2]/button") WebElement LastNameCross;
	
	@FindBy(id = "address1") WebElement Address1;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[1]/div[3]/button") WebElement AddressCross;
	
	@FindBy(id = "city") WebElement CityName;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[1]/div[5]/button") WebElement CityCross;
	
	@FindBy(id = "province") WebElement Province;
	
	@FindBy(id = "postalCode") WebElement PostalCode;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[1]/div[7]/button") WebElement PostalCross;
	
	@FindBy(id = "phoneNumber") WebElement Phonenumber;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[1]/div[8]/button") WebElement PhoneCross;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[2]/button") WebElement AddressSave;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div/form/div[2]/div/button") WebElement AddressCancel;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div/div[3]/button[2]") WebElement AddressRemove;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/div/div") WebElement AddressVisible;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[2]/main/div/div[1]/button") WebElement AddAddressBtn;
	public MyAddressTab() {
		PageFactory.initElements(driver, this);
	}
	
	public void accountlogin() {
		MyaccountBtn.click();
		exec.executeScript("arguments[0].scrollIntoView();", AddressBtn);
		AddressBtn.click();
	}
	
	public void addressdetails(String fname, String lname, String address1, String cityname, String post, String phonenumber) {
		FirstNameCross.click();
		firstname.sendKeys(fname);
		LastNameCross.click();
		lastname.sendKeys(lname);
		AddressCross.click();
		Address1.sendKeys(address1);
		CityCross.click();
		CityName.sendKeys(cityname);
		
		Select select = new Select(Province);
		select.selectByVisibleText("Ontario");
		
		PostalCross.click();
		PostalCode.sendKeys(post);
		
		PhoneCross.click();
		Phonenumber.sendKeys(phonenumber);
		
		AddressSave.click();
	}
	
	public void addaddress() {
		AddAddressBtn.click();
	}
}
