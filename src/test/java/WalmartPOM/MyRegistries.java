package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class MyRegistries extends baseclass{
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement Myaccountbtn;
	@FindBy(xpath = "//*[@id=\"accounts-home-page\"]/div[3]/div[1]/div[3]/div[1]/a/div[1]") WebElement Orderhistory; 
	@FindBy(xpath = "/html/body/div/div/div[4]/div[1]/div/div[2]/div[1]/section/div/div[1]/ul/li[5]/div/a") WebElement MyRegistries;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/p") WebElement RegistrymovedText;
	
	public MyRegistries() {
		PageFactory.initElements(driver, this);
	}
	
	public void myregistries() throws InterruptedException {
		Myaccountbtn.click();
		Orderhistory.click();
		Thread.sleep(3000);
		MyRegistries.click();
		System.out.println(RegistrymovedText.getText());
	}
}
