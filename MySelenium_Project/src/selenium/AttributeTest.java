package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.ebay.ca/");
		
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
		
	}

}
