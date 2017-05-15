package elephant;

import org.junit.Test;
import org.junit.Assert;



/**
 * @author 
 *
 * A test case in JUNIT to check if the initialization and setting
 * to a variable works correctly
 */
public class ElephantTest {

	
	
	@Test
	 public void testLegs(){
		Elephant newElephant;
		String noLegsStr="4";
		newElephant = new Elephant();
		
		
		newElephant.setLegs(4);
		noLegsStr = String.valueOf(newElephant.getLegs());
		Assert.assertEquals(noLegsStr,"4");
	}
	 


}
