package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.baseclass;

public class MyAccountTab extends baseclass{
	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement Myaccountbtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[5]/a") WebElement Cartbtn;
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[4]/div[1]/div[2]/div/div[2]") WebElement EmptycartText;
	@FindBy(xpath = "//*[@id=\"accounts-home-page\"]/div[3]/div[1]/div[3]/div[1]/a/div[1]") WebElement Orderhistory;
	@FindBy(id = "view-orders-from-label") WebElement Orderhistorydrpdn;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[1]/div[1]/div/div[1]") WebElement NoOrderText;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[1]/div[1]/div/div[2]/a/button") WebElement Startshopping; 
	
	public MyAccountTab() {
		PageFactory.initElements(driver, this);
	}
	public void cartbtnclick() {		
		Cartbtn.click();
	}
	
	public boolean carttext() {
		System.out.println(EmptycartText.getText());
		return EmptycartText.isDisplayed();
	}
	
	public void order() {
		Myaccountbtn.click();
		Orderhistory.click();
		Orderhistorydrpdn.click();

		Select select = new Select(Orderhistorydrpdn);
		select.selectByVisibleText("2011");	
	}
	
	public boolean NoOrder() {
		Myaccountbtn.click();
		System.out.println(NoOrderText.getText());
		return NoOrderText.isDisplayed();
	}
	
	public void Shopping() {
		
		Startshopping.click();
	
	}
	
}	 