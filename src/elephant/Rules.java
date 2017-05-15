package elephant;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/* Via the @Rule annotation you can create objects which can be used and configured in your test methods. 
 * This adds more flexibility to your tests. You could for example specify which 
 * exception message your expect during execution of your test code
 */

public class Rules {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void throwsIllegalArgumentExceptionIfIconIsNull() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Negative value not allowed");
		Elephant t = new Elephant();
		t.setEyes(-1);
	}
}


