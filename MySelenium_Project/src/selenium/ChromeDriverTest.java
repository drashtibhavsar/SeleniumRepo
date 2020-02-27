package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","D:\\seleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://ca.yahoo.com/?guccounter=1");
		driver.findElement(By.id("uh-search-box")).click();
		driver.findElement(By.id("uh-search-box")).sendKeys("canada");
		
		Thread.sleep(2000);
	
		List<WebElement> allList = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println(allList.size());
		
		for(WebElement a:allList)
		{
			System.out.println(a.getText());
		}
	}

}
