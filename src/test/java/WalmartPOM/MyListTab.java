package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class MyListTab extends baseclass{
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement Myaccountbtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[2]/div[3]/div[3]/div[2]/a[3]") WebElement ListBtn;
	@FindBy(name = "embedded-search-form-input") WebElement Searchbox;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div/form/button") WebElement SearchBtn;
	
	public MyListTab() {
		PageFactory.initElements(driver, this);
	}
	
	public void listbtnclick() {
		Myaccountbtn.click();
		ListBtn.click();
		Searchbox.sendKeys(prop.getProperty("itemtosearch"));
		SearchBtn.click();
	}
	
}
