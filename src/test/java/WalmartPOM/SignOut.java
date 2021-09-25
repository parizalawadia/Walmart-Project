package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class SignOut extends baseclass{
	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement MyaccountBtn;
	@FindBy(className = "css-mxl3yf et5cpij3") WebElement SignOutBtn;
	public SignOut() {
		PageFactory.initElements(driver, this);
	}
	
	public void signoutbtn() {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(MyaccountBtn).build().perform();
		SignOutBtn.click();
	}
	
	
	
}
