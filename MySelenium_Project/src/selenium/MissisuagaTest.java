package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MissisuagaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.mississauga.ca/portal/home");
		
		WebElement city = driver.findElement(By.xpath("//div[@id='tnNavHall']//a//img"));	//created webelement
		Actions builder = new Actions(driver); 		//use action class to create(hover or click etc) particular action
		builder.moveToElement(city).build().perform();
		
		Thread.sleep(2000);
	
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		System.out.println(all.size());
		
		for(WebElement a: all) {
			System.out.println(a.getText());
		}
		
		driver.findElement(By.linkText("Jobs & Careers")).click();	//performing particular action
		System.out.println("AfterClicking");
		
		all = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		System.out.println(all.size());
		
		for(WebElement a: all) {
			System.out.println(a.getText());
		}
		
	}
	
}
