package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
	
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("drashtibhavsar02");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("sgfjhfj");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		
	}

}
