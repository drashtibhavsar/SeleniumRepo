package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PageLoadTimeOutTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));	//created webelement
		Actions builder = new Actions(driver); 		//use action class to create(hover or click etc) particular action
		builder.moveToElement(electronics).build().perform();
		
	//	Thread.sleep(3000);
		driver.findElement(By.linkText("Cameras & Photo")).click();	//performing particular action
	}

}
