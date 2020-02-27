package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> popup = driver.findElements(By.className("close-layer"));
		System.out.println(popup.size());
	
		if(popup.size()>0) {
			
			driver.findElement(By.className("close-layer")).click();
			Thread.sleep(3000);
		}
	
		driver.findElement(By.linkText("Buyer Protection")).click();
	}

}
