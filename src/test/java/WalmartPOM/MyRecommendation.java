package WalmartPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basepackage.baseclass;

public class MyRecommendation extends baseclass {
	
	Actions action = new Actions(driver);
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/span/svg/path") WebElement MyAccountDropDown; 
	@FindBy(css = "#thumb-6000201790922 > div > button") WebElement addtocart;
	
	public MyRecommendation() {
		PageFactory.initElements(driver, this);
	}
	
	public void myrecdropdown() {
		
		action.moveToElement(MyAccountDropDown).build().perform();
		
	}
	
	public boolean addtocartbtn() {
		System.out.println(addtocart.getText());
		return addtocart.isDisplayed();
	}
	
	
}
