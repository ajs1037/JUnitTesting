package elephant;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 
/**
 * JUnit Parameterized Test
 * The “Parameterized Test” means vary parameter value for unit test. 
 * In JUnit, both @RunWith and @Parameter annotation are use to provide parameter 
 * value for unit test, @Parameters have to return List[], and the parameter will pass into class constructor as argument.
 *
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTest{
 
	 private int number;
 
	 public ParameterizedTest(int number) {
	    this.number = number;
	 }
 
	 @Parameters
	 public static Collection<Object[]> data() {
	   Object[][] data = new Object[][] { {1}, { 2 }, { 3 }, { 4 }};
	   return Arrays.asList(data);
	 }
	 
	 @Test
	 public void pushTest() {
	   System.out.println("Parameterized Number is : " + number);
	 }
	 
	 /* JUnit 4.5
	 @TestWith({
		    "clerk,      45'000 USD, GOLD",
		    "supervisor, 60'000 GBP, PLATINUM"
		})
		public void canAcceptDebit(Employee employee, Money money, ClientType clientType) {
		    assertTrue(   employee.canAcceptDebit(money, clientType)   );
		}
		
		*/
 
}