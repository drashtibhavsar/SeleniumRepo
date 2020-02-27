package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
	
		List<WebElement> allLinks = driver.findElements(By.linkText("Sortable")); //we can directly put double slash it will print the same result as /ul/li
		
		System.out.println(allLinks.size());
		
		if(allLinks.size()>0) {
			System.out.println("sortable present");
		}else {
			System.out.println("sortable not present");
		}
		
		List<WebElement> link = driver.findElements(By.id("draggable"));
		System.out.println(link.size());
		
		if(link.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("not present");
		}
		
		//driver.switchTo().frame(0); //int
		//driver.switchTo().frame("demo-frame"); //string only works with the id
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		System.out.println("---------------after switching to frame------------------");
		allLinks = driver.findElements(By.linkText("Sortable")); //we can directly put double slash it will print the same result as /ul/li
		
		System.out.println(allLinks.size());
		
		if(allLinks.size()>0) {
			System.out.println("sortable present");
		}else {
			System.out.println("not present");
		}
		
		link = driver.findElements(By.id("draggable"));
		System.out.println(link.size());
		
		if(link.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("not present");
		}
		
		driver.switchTo().defaultContent();
		System.out.println("-----------------------");
		allLinks = driver.findElements(By.linkText("Sortable")); //we can directly put double slash it will print the same result as /ul/li
		
		System.out.println(allLinks.size());
		
		if(allLinks.size()>0) {
			System.out.println("sortable present");
		}else {
			System.out.println("not present");
		}
		
		link = driver.findElements(By.id("draggable"));
		System.out.println(link.size());
		
		if(link.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("not present");
		}
		
		//driver.switchTo().parentFrame(); //when we used to switch to parent frame
		
		driver.findElement(By.partialLinkText("Sortab")).click();

		Thread.sleep(3000);

		String expectedUrl = "https://jqueryui.com/sortable/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);


		if(expectedUrl.equals(actualUrl) && expectedUrl.equals(actualUrl)) {
		System.out.println("passed");
		}else {
		System.out.println("failed");
		}
	
		
  } 
		  
	
}
