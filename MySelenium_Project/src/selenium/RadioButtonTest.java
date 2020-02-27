package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		
		List<WebElement> radios = driver.findElements(By.name("group1")); //we can directly put double slash it will print the same result as /ul/li
			
		System.out.println(radios.size());
		
		/*for(WebElement a: radios) {
			System.out.println(a.getAttribute("value")+"----"+a.isSelected());
		
		}*/
		for(WebElement a:radios) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value"));
			}
			
		}
		
		radios.get(2).click();
		System.out.println("----------------");
		
		for(WebElement a: radios) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value"));
			}
		
	}
	}
}
