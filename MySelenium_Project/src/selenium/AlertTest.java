package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("http://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();		//created object of a alert class and switched it to the alert box
		System.out.println(a1.getText());	//read the text
		a1.accept();		//accept the alert
		//a1.dismiss();	//ignores the alert you can't use both the method at the same time you can only use accept or dismiss at a same time
	}

}
