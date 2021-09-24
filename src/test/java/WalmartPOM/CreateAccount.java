package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class CreateAccount extends baseclass{
	
	@FindBy(id="firstName") WebElement firstname;
	@FindBy(id="lastName") WebElement lastname;
	@FindBy(id="phoneNumber") WebElement phonenumber;
	@FindBy(id="email") WebElement emailid;
	@FindBy(id="password") WebElement password;
	@FindBy(css = "#create-account-form > div > div:nth-child(6) > div.css-1alnb86.erl5ymg0 > button") WebElement passwordshow;
	@FindBy(css = "#TAndC") WebElement consentcheckbox;
	
	public CreateAccount() {
		PageFactory.initElements(driver, this);
	}
	
	public void typefirstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void typelasttname(String lname) {
		lastname.sendKeys(lname);
	}
	public void typephone(String phone) {
		phonenumber.sendKeys(phone);
	}
	public void typeemailid(String email) {
		emailid.sendKeys(email);
	}
	public void typepassword(String pass) {
		password.sendKeys(pass);
	}
	public void showpassword() {
		passwordshow.click();
	}
	public void consentchkbox() {
		consentcheckbox.click();
	}
	
}
