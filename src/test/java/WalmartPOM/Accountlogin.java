package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class Accountlogin extends baseclass{
	
	@FindBy(id = "username") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(css = "#login-form > div > div:nth-child(3) > div.css-1alnb86.erl5ymg0 > button") WebElement showbtn;
	@FindBy(css = "#login-form > div > div:nth-child(7) > button") WebElement signinbtn;
	
	
	public Accountlogin() {
		PageFactory.initElements(driver, this);
	}
	public void typeusername(String name) {
		username.sendKeys(name);
	}
	public void typepassword(String pass) {
		password.sendKeys(pass);
	}
	public void showpassword() {
		showbtn.click();
	}
	public void loginbtn() {
		signinbtn.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
	
}
