package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VKTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://vk.com/");
		
		driver.findElement(By.id("ij_first_name")).sendKeys("drashti");
		driver.findElement(By.id("ij_last_name")).sendKeys("asydhsd");
		
		driver.findElement(By.id("dropdown1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='option_list_options_container_1_30']")).click();
		
		driver.findElement(By.id("dropdown2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='option_list_options_container_2_13']")).click();
		
		driver.findElement(By.id("dropdown3")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='option_list_options_container_3_13']")).click();
		
		List<WebElement> radios = driver.findElements(By.className("radiobtn")); //we can directly put double slash it will print the same result as /ul/li
		
		System.out.println(radios.size());
		
		for(WebElement a:radios) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value"));
			}
		}
		
		radios.get(0).click();
	
		driver.findElement(By.id("ij_submit")).click();
		}
	}


