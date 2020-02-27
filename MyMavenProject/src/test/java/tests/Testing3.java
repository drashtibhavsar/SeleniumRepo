package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test (priority =1)
  public void homeTest() {
	  System.out.println("I am in home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(4>3, "Verifying Element");
	  System.out.println("after assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test (priority =2, dependsOnMethods="homeTest", groups = {"smoke", "sanity"})
  public void mainTest() {
	  System.out.println("I am in home test");
	  System.out.println("before assertion");
	  softAssert.assertTrue(4>3, "Verifying Element");
	  System.out.println("after assertion");
	  softAssert.assertAll();			//similar to junit error collector
  }
  
  @Test (priority =3, dependsOnMethods="mainTest", groups = {"drashti"})
  public void endTest() {
	  System.out.println("I am in home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(4>3, "Verifying Element");
	  System.out.println("after assertion");
	  Assert.assertEquals("abc", "abc1");
	  System.out.println("after second assert");
	  softAssert.assertAll();
  }
}
