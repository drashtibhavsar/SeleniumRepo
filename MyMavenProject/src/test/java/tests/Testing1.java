package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
	
	
 @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n+s);
  }
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  @Test
  public void test2() {
	  System.out.println("test2");
  }
  @Test
  public void test3() {
	  System.out.println("test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");
  }
  
 @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");
  }

}
