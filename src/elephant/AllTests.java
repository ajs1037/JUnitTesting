package elephant;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ElephantBeforeAfterClass.class, ElephantTest.class,
		ElephantTestBeforeAfter1.class, ElephantTestBeforeAfter2.class })
public class AllTests {

}
