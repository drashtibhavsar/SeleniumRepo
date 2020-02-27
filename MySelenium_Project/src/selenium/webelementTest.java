package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hfhdjfhd");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("hfhdjfhd");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
	}

}
