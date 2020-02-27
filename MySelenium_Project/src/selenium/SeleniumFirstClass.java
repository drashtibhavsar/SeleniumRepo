package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
	
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dfghsghh");
	//	driver.findElement(By.name("email")).sendKeys("dfiwri");
		
		driver.findElement(By.name("pass")).sendKeys("whuwhfghj");
		driver.findElement(By.id("loginbutton")).click();
	}

}
