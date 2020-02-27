package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));	//created webelement
		Actions builder = new Actions(driver); 		//use action class to create(hover or click etc) particular action
		builder.moveToElement(electronics).build().perform();		
		
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.cssSelector("body.desktop.gh-flex:nth-child(2) div.main-content:nth-child(10) div.hl-cat-nav:nth-child(1) ul.hl-cat-nav__container:nth-child(1) li.hl-cat-nav__js-tab:nth-child(5) div.hl-cat-nav__flyout:nth-child(3) div.hl-cat-nav__sub-cats div.hl-cat-nav__sub-cat-col:nth-child(1) > ul:nth-child(2)>li"));
		System.out.println(list.size());
		
		for(WebElement a: list) {
			System.out.println(a.getText());
		}
	
	}

}
