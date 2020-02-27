package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> element = driver.findElements(By.linkText("about"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			
			System.out.println("Element is Present");
		} 
		else {
				System.out.println("Element is not Present");
			}
		
	/*	if(driver.findElement(By.linkText("About")).isDisplayed())
		{
			System.out.println("Element is Present");
		}
		else {
			System.out.println("Element is not Present");
		}*/
	}

}
