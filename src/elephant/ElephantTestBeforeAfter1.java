package elephant;


import org.junit.Test;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;


/* @author 
*
* A test case in JUNIT to with setup and teardown
*/


public class ElephantTestBeforeAfter1 {
	Elephant newElephant;
	
	/* Executes the method before each test. This method can prepare the test 
	 * environment (e.g. read input data, initialize the class). 
	 */
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
		newElephant = new Elephant();
	}
	
	/* Executes the method after each test. This method can cleanup the test
	 * environment (e.g. delete temporary data, restore defaults). It can also 
	 * save memory by cleaning up expensive memory structures. 
	 */

	@After
	public void tearDown() throws Exception {
		System.out.println("Teardown");
	}
	
	
	
	@Test
	 public void testLegs(){
		String noLegsStr;
		newElephant.setLegs(4);
		noLegsStr = String.valueOf(newElephant.getLegs());
		Assert.assertEquals(noLegsStr,"4");
	}
	
	@Test
	 public void testTrunk() {
		String noTrunksStr;
		noTrunksStr = String.valueOf(newElephant.getTrunk());
		Assert.assertEquals(noTrunksStr ,"1");
	}

}
