package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("canada");
	
		Thread.sleep(2000);

		//List<WebElement> allList = driver.findElements(By.className("erkvQe"));
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allList.size());
		
		for(WebElement a:allList)
		{
			System.out.println(a.getText());
		}	
		
	}

}
