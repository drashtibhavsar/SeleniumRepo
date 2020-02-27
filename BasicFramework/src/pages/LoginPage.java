package pages;

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
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	/*public WebElement email = driver.findElement(By.id("login-username")); //we can not declare the webelements globally because initially 
	public WebElement emailNext = driver.findElement(By.id("login-signin"));		//driver value is null. so when we run the code it will give us an 
	public WebElement password = driver.findElement(By.id("login-passwd"));	//error that nullpointer exception .
	public WebElement passwordNext = driver.findElement(By.id("login-signin"));
	public WebElement errMsg = driver.findElement(By.className("error-msg"));
	public WebElement emailerrMsg = driver.findElement(By.id("username-error"));*/   
	
	@FindBy(id = "login-username")
	public static WebElement email;
	
	@FindBy(id = "login-signin")
	public static WebElement emailNext;
	
	@FindBy(id = "login-passwd")
	public static WebElement password;
	
	@FindBy(id = "login-signin")
	public static WebElement passwordNext;
	
	@FindBy(className = "error-msg")
	public static WebElement errMsg;
	
	@FindBy(id = "username-error")
	public static WebElement emailerrMsg;
	
	public void openBrowser() throws IOException {
		FileInputStream fs = new FileInputStream("D:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    
		PageFactory.initElements(driver, this);
	}
	public void closeBrowser() {
		driver.quit();
	}
	public void openYahoo() {
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void enterEmail(String a) throws InterruptedException {
		email.sendKeys(a);
		emailNext.click();
		Thread.sleep(3000);
	}
	public void enterPassword(String b) throws InterruptedException {
		password.sendKeys(b);
		passwordNext.click();
		Thread.sleep(3000);
	}
	public String readPassErr() {
		String actualErrMsg = errMsg.getText();
		System.out.println(actualErrMsg);
		return actualErrMsg;
	}
	public String readEmailErr() {
		String actualErrMsg = emailerrMsg.getText();
		System.out.println(actualErrMsg);
		return actualErrMsg;
	}
}
