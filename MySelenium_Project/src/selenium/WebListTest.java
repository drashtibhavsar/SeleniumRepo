package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.google.com/");
		
	//	WebElement footer = driver.findElement(By.className("fbar"));
	 
	//	WebElement footer = driver.findElement(By.id("fsl"));
		//List<WebElement> allList = footer.findElements(By.tagName("a"));
		//List<WebElement> allList = driver.findElements(By.tagName("a"));
	
		List<WebElement> allList = driver.findElements(By.xpath("//span[@id='fsl']/a"));
		
		System.out.println(allList.size());
		
		for(int i=0; i<allList.size();  i++)
		{
			System.out.println(allList.get(i).getText());
		}
		
	}

}
