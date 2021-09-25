package WalmartPOM;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class MyProfileTab extends baseclass{
	
	JavascriptExecutor exec = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement MyaccountBtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[2]/div[3]/div[1]/div[2]/a[1]") WebElement Myprofile;
	
	//Name Field Info
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div[1]/button") WebElement NamefieldEditBtn;
	@FindBy(id = "firstName") WebElement FirstName;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/button") WebElement FirstNameCross;
	@FindBy(id = "lastName") WebElement LastName;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[2]/button") WebElement LastNameCross;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[3]/button[1]") WebElement NameFieldSave;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[3]/button[2]") WebElement NameFieldCanael;
	
	//Postal Code Info
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[3]/div[1]/button") WebElement PostalEditBtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[3]/button") WebElement PostalCodeCross;
	@FindBy(id = "postalCode") WebElement PostalCode;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[4]/button[1]") WebElement PostalSave;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[1]/div/div[4]/button[2]") WebElement PostalCancel;
	
	//Email Address Info
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[1]/div[1]/button") WebElement EmailEditBtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[1]/button") WebElement EmailCross;
	@FindBy(id = "emailAddress") WebElement EmailId;
	@FindBy(id = "currentPassword") WebElement CurrentPwd;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[3]/button[1]") WebElement EmailSave;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[3]/button[2]") WebElement EmailCancel;
	
	//Password Info
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[3]/div[1]/button") WebElement PasswordEdit;
	@FindBy(id = "currentPassword") WebElement CurrentPassword;
	@FindBy(id = "newPassword") WebElement NewPassword;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[5]/button[1]") WebElement PasswordUpdate;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[2]/div/div/div[5]/button[2]") WebElement PasswordCancel;
	
	//Language Preference
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[3]/div/div[1]/div[1]/button") WebElement LanguageEdit;
	@FindBy(id = "English") WebElement EnglishSelect;
	@FindBy(id = "") WebElement FrenchSelect;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[3]/div/div[4]/button[1]") WebElement LangSave;
	@FindBy(xpath = "") WebElement LangCancel;
	
	//Associate Discount Info
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[4]/div/div/div[1]/button") WebElement DiscountAdd;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/main/div[1]/div[4]/div/div[4]/button[2]") WebElement DiscountCancel;
	
	
	public MyProfileTab() {
		PageFactory.initElements(driver, this);
	}
	
	public void accountlogin() {

		MyaccountBtn.click();
		exec.executeScript("arguments[0].scrollIntoView();", Myprofile);
		Myprofile.click();
	}
	
	public void namefield(String fname, String lname) {
		NamefieldEditBtn.click();
		FirstNameCross.click();
		FirstName.sendKeys(fname);
		LastNameCross.click();
		LastName.sendKeys(lname);
		NameFieldSave.click();
	}

	public void postalcodefield(String post) {
		PostalEditBtn.click();
		PostalCodeCross.click();
		PostalCode.sendKeys(post);
		PostalSave.click();
	}
	
	public void emailfield(String email, String crntpwd) {
		EmailEditBtn.click();
		EmailCross.click();
		EmailId.sendKeys(email);
		CurrentPwd.sendKeys(crntpwd);
		EmailSave.click();
	}

	public void passwordfield(String currentpass, String newpass) {
		PasswordEdit.click();
		CurrentPassword.sendKeys(currentpass);
		NewPassword.sendKeys(newpass);
		PasswordUpdate.click();
	}
	
	public void langpref() {
		LanguageEdit.click();
		EnglishSelect.click();
		LangSave.click();
	}

	public void associatediscount() {
		DiscountAdd.click();
		DiscountCancel.click();
	}
} 
