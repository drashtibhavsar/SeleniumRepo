package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("http://echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	//both will use in max-time 
		WebDriverWait wait = new WebDriverWait(driver, 30);		//we only use this on a special condition and also we need to create an object of webdriver0wait
		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();		//created object of a alert class and switched it to the alert box
		System.out.println(a1.getText());	//read the text
		a1.accept();
		//a1.dismiss();
	}

}
 