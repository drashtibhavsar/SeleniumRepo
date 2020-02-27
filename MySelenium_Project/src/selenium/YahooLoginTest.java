package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		
		driver.findElement(By.id("login-username")).sendKeys("test2");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys("sgfjhfj");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		
		String expectedErrMsg = "Invalid Password. Please try again.";
		String actualErrMsg = driver.findElement(By.className("error-msg")).getText();
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
	}

}
