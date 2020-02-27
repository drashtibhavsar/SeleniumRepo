package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("About")).click();
		
		driver.findElement(By.partialLinkText("Abo")).click();  
		
		Thread.sleep(3000);
		
		String expectedTitle = "About - Google";
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle) && expectedUrl.equals(actualUrl)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
	
	}

}
