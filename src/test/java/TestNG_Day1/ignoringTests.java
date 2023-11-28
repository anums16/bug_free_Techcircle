package TestNG_Day1;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoringTests {

	String myExpectedName = "Gothem";

	@Ignore
	@Test(enabled = true)
	public void testPrintMessage() {
		System.out.println("This is the message == Happy Holidays!");

	}

	@Test

	public void assertTesting() {
		String actualName = "Gautam";

		Assert.assertEquals(actualName, myExpectedName);
		

	}

}
