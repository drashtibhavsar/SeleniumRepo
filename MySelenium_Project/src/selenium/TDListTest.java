package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\seleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.td.com/ca/en/personal-banking/?cm_sp=:GOOGLE:EN+-+Core+-+Brand+(20_S_BR_BAC_AO_ACQ_ENFR_NAT):DIF:Misspells+-+Exact&ds_rl=1220704&gclid=EAIaIQobChMIgYK-8PH75gIVmY3ICh210QncEAAYASAAEgKY5PD_BwE&gclsrc=aw.ds");
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		
		System.out.println(allList.size());
		
		for(WebElement a:allList) {
			System.out.println(a.getText());
			}
		}

}
