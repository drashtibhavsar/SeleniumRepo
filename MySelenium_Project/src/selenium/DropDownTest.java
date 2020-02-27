package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.ebay.ca/");
		
		WebElement obj = driver.findElement(By.id("gh-cat"));
		List<WebElement> allList = obj.findElements(By.tagName("option"));
		
		//driver.findElement(By.id("gh-cat")).click();
		//List<WebElement> allList = driver.findElements(By.xpath("//div[@id='gh-cat-box']/select/option"));
		
		System.out.println(allList.size());
		
		for(WebElement a:allList)
		{
			System.out.println(a.getText()+"----"+a.isSelected()); //gives you a boolean value of a selected text whether it is selected or not
		}	
		
		Select s = new Select(obj);
		s.selectByIndex(2);
		s.selectByValue("6000");
		s.selectByVisibleText("Books");
		
		System.out.println("----------------After selection.......");
		
		for(WebElement a:allList)
		{
			System.out.println(a.getText()+"----"+a.isSelected()); //gives you a boolean value of a selected text whether it is selected or not
		}	
		
	}

}
