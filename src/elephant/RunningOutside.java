package elephant;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* Running a test from outside of Eclipse and printing the result to the console */

public class RunningOutside {
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(ElephantTest.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	  }
}
