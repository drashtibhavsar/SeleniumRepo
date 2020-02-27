package selenium;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)		//it will run the code in specific order otherwise 
//sometimes what happens the code will not run in the specific order so that;s why we can use this method to overcome the issue.
public class Testing3 {

	@Rule
	public ErrorCollector errorcol = new ErrorCollector();
	
	@Ignore		//if you don't want to run the code then ignore it, it will count the number of case but skip the code
	@Test
	public void test6() {
		
		System.out.println("I am a testAssert");
		String actualResult = "abc";
		String expectedResult = "abc1";
		
		Assert.assertEquals(expectedResult, actualResult);	//it will reduce the line of code and gives us proper output(we don't use if-else here)
		System.out.println("After first assertion");
		Assert.assertTrue("verifying if 2>3", 2>3);
		System.out.println("After 2nd assert");
		
	}
	
	@Test
	public void test7() {
		
		System.out.println("I am a testAssert");
		String actualResult = "abc";
		String expectedResult = "abc1";
		try {
		Assert.assertEquals(expectedResult, actualResult);	//it will reduce the line of code and gives us proper output(use instead of if-else)
		}catch(Throwable t) {
			System.out.println("I'm in catch 1");
			errorcol.addError(t); 
		}
		System.out.println("after first assertion");
		try {
		Assert.assertTrue("verifying if 2>3", 2 > 3);
		}catch(Throwable t) {
		System.out.println("I'm in catch 2");
		errorcol.addError(t);
		}
		System.out.println("after second assertion");
	}
}
