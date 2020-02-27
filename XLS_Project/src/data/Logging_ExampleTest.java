package data;

import org.apache.log4j.Logger;

public class Logging_ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("hello");
		APPLICATION_LOGS.debug("we are writing into log file");
		APPLICATION_LOGS.debug("starting the test case xyz test");
		APPLICATION_LOGS.debug("starting the test case xyz test1");
		
	}

}
