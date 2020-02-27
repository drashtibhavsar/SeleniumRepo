package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("lastname")).sendKeys("sdfdgbvdfsafdg");
		driver.findElement(By.name("reg_email__")).sendKeys("6475863485");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dzsfgfsadf");
		WebElement obj = driver.findElement(By.id("month"));
		Select s = new Select(obj);
		s.selectByIndex(12);
		WebElement obj1 = driver.findElement(By.id("day"));
		Select s1 = new Select(obj1);
		s1.selectByValue("29");
		WebElement obj2 = driver.findElement(By.id("year"));
		Select s2 = new Select(obj2);
		s2.selectByVisibleText("1995");
		
		List<WebElement> radios = driver.findElements(By.name("sex")); //we can directly put double slash it will print the same result as /ul/li
		
		System.out.println(radios.size());
		
		for(WebElement a:radios) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value"));
			}
		}
		
		radios.get(0).click();
		System.out.println("----------------");
		
		for(WebElement a: radios) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value"));
			}
	
		
		
		driver.findElement(By.name("websubmit")).click();
	}
	}
}
