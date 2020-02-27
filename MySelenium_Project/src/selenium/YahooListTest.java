package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://ca.yahoo.com/");
		List<WebElement> allList = driver.findElements(By.xpath("//li[@data-category='trending news']//li")); //we can directly put double slash it wil print the same result as /ul/li = //li
		
		System.out.println(allList.size());
		
		for(int i=0; i<allList.size();  i++)
		{
			System.out.println(allList.get(i).getText());
		}
	}

}
 