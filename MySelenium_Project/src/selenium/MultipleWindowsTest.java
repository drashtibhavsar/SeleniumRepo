package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
	
		
		driver.findElement(By.linkText("Faq")).click();
		Set<String> windows = driver.getWindowHandles();			//it will not allow to access the duplicate value
		System.out.println(windows.size());
		
		Iterator<String> iteration = windows.iterator();			
		String mainwindow = iteration.next();
		String childwindow = iteration.next();
		System.out.println(mainwindow);
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		driver.close();				//it will only close the current window
		
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());
		//driver.quit();				//quit is only used to close the browser including all windows
	}

}
