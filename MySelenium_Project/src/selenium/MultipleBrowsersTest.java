package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String browser = prop.getProperty("browser");
	
		WebDriver driver;	//declare a variable globally  
		
		if(browser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
				driver = new FirefoxDriver();   //assign it
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\seleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();	//assign it
		}
		else {
			System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();	//assign it
		}
	
		
		driver.get("https://ca.yahoo.com/");
		List<WebElement> allList = driver.findElements(By.xpath("//li[@data-category='trending news']//li")); //we can directly put double slash it wil print the same result as /ul/li = //li
		
		System.out.println(allList.size());
		
		for(int i=0; i<allList.size();  i++)
		{
			System.out.println(allList.get(i).getText());
		}
	}

}
