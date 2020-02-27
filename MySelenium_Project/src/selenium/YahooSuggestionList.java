package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://ca.yahoo.com/?guccounter=1");
		driver.findElement(By.id("uh-search-box")).click();
		driver.findElement(By.id("uh-search-box")).sendKeys("canada");
		
		Thread.sleep(2000);
		
		//List<WebElement> allList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		List<WebElement> allList = driver.findElements(By.xpath("//li[@role='option']"));
		//List<WebElement> allList = driver.findElements(By.className("yui3-aclist-content"));
		//List<WebElement> allList = driver.findElements(By.xpath("//ul[@id='yui_3_18_0_3_1578152869531_877']/li"));
		System.out.println(allList.size());
		
		for(WebElement a:allList)
		{
			System.out.println(a.getText());
		}	
	}

}
