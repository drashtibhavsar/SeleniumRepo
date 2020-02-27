package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
 
	LoginPage login = new LoginPage();
	DataFile df = new DataFile();
	public WebDriver driver;
	
  @BeforeMethod 
  public void beforeMethod() throws IOException {
	  
	  	login.openBrowser();
		login.openYahoo();
  }

  @AfterMethod
  public void afterMethod() {
	  login.closeBrowser();
  }

 @Test (priority =1)
  public void verifyLoginWithWrongPasswordTest() throws InterruptedException {
	  	login.enterEmail(df.correctEmail);
		login.enterPassword(df.wrongPassword);
		
		String expectedErrMsg = df.passErr;
		String actualErrMsg = login.readPassErr();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		
  }
 @Test (priority =2)
 public void verifyLoginWithWrongEmailTest() throws InterruptedException {
	  	login.enterEmail(df.wrongEmail);
		
		String expectedErrMsg = df.emailErr;
		String actualErrMsg = login.readEmailErr();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
 }
 
}
