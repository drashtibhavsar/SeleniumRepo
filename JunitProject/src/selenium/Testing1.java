package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("beforeclass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("afterclass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		System.out.println("Login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
		System.out.println("logout");
	}

	@Test
	public void test1() {
		//System.out.println("Login");		
		System.out.println("test1");	//if code will not work then every other test cases will fail 
		//System.out.println("logout"); 	//if code fails then you are not logged out so every other test cases will fail
	}
	@Test
	public void test2() {
		//System.out.println("Login");	////apde fri fri ek ni ek line lakhvani jrur nthi apde aa line ne before class ma lakhi daie etle e badha mate work krse
		System.out.println("test2");
		//System.out.println("logout");		//apde fri fri ek ni ek line lakhvani jrur nthi apde aa line ne after class ma lakhi daie etle e badha mate work krse
	}
	@Test
	public void test3() {
		//System.out.println("Login");
		System.out.println("test3");
		//System.out.println("logout");
	}
	

}
