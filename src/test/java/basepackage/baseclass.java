package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import utility.TimeUtils;



public class baseclass {
	
	public static Properties prop = new Properties();
	public static Properties prop1 = new Properties();
	public static WebDriver driver; 
	
	public baseclass() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\jines\\eclipse-workspace\\WalmartManagement\\src\\test\\java\\environmentvariables\\configuration.properties");
			prop.load(file);
			
//			FileInputStream accountcreation = new FileInputStream("C:\\Users\\jines\\eclipse-workspace\\WalmartManagement\\src\\test\\java\\environmentvariables\\accountcreation.properties");
//			prop.load(accountcreation);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException f) {
			f.printStackTrace();
		}
	}
	
	public static void initialize() throws InterruptedException {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timeunit, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("url1"));
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login-form > div > div:nth-child(7) > button")).click();
		Thread.sleep(5000);
	}
	
}