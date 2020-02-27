package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\seleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://ca.yahoo.com/");
		
		/*get() is used to navigate particular URL(website) and wait till page load. driver. 
		 navigate() is used to navigate to particular URL and does not wait to page load. 
		It maintains browser history or cookies to navigate back or forward.*/
	}

}
