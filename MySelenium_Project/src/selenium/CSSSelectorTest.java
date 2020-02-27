package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	
			driver.findElement(By.cssSelector("#u_0_h")).sendKeys("fhgfhghg");
			driver.findElement(By.cssSelector("#u_0_k")).sendKeys("1234567890");
			driver.findElement(By.cssSelector("#u_0_p")).sendKeys("fghgfjhej");
			WebElement obj = driver.findElement(By.cssSelector("#month"));
			Select s = new Select(obj);
			s.selectByIndex(12);
			WebElement obj1 = driver.findElement(By.cssSelector("#day"));
			Select s1 = new Select(obj1);
			s1.selectByValue("29");
			WebElement obj2 = driver.findElement(By.cssSelector("#year"));
			Select s2 = new Select(obj2);
			s2.selectByVisibleText("1995");
			
			List<WebElement> list = driver.findElements(By.cssSelector("#u_0_s>span>input"));
			System.out.println(list.size());
			
			for(WebElement a:list) {
				if(a.isSelected()) {
					System.out.println(a.getAttribute("value"));
				}
			}
			
			list.get(0).click();
			driver.findElement(By.cssSelector("#u_0_w")).click();
			
	}

}
