package elephant;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert;

public class ElephantBeforeAfterClass {
	Elephant newElephant;
	
	/* Executes the method once, before the start of all tests. This can be used to perform time intensive activities, 
	 * for example to connect to a database. Methods annotated with this annotation need to be defined as static to work with JUnit. 
	 */
	
	@BeforeClass
	public static void setUpOnce() throws Exception {
		System.out.println("SetupOnce");
		//newElephant = new Elephant();
	}
	
	/* Executes the method once, after all tests have have been finished. This can be
	 * used to perform clean-up activities, for example to disconnect from a database.
	 * Methods annotated with this annotation need to be defined as static to work with JUnit. 
	 */

	@AfterClass
	public static void tearDownOnce() throws Exception {
		System.out.println("TearDownOnce");
	}
	
	
	
	@Test
	 public void testLegs(){
		String noLegsStr;
		newElephant = new Elephant();
		newElephant.setLegs(4);
		noLegsStr = String.valueOf(newElephant.getLegs());
		Assert.assertEquals(noLegsStr,"4");
	}
	
	@Test
	 public void testTrunk(){
		String noTrunksStr;
		newElephant = new Elephant();
		noTrunksStr = String.valueOf(newElephant.getTrunk());
		Assert.assertEquals(noTrunksStr ,"1");
	}
	
	// @Test (expected = Exception.class) - Fails, if the method does not throw the named exception. 
	// @Test(timeout=100) - Fails, if the method takes longer than 100 milliseconds.  
	

}
