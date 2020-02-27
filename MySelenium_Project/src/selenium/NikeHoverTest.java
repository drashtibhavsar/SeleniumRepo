package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");

		Thread.sleep(3000);

		 WebElement Men = driver.findElement(By.linkText("MEN"));

		Actions builder = new Actions(driver);
		builder.moveToElement(Men).build().perform();

		Thread.sleep(3000);

		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@id='NavigationMenu-1']//div[2]/a"));
		System.out.println(alloptions.size());

		for(WebElement a : alloptions) {
		System.out.println(a.getText());
		}

	}
}


