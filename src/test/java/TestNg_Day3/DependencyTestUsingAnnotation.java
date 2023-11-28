package TestNg_Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	String expectedMessage ="April";
	
	@Test
	public void TestPrintMessage() {
		System.out.println("Printing inside TestPrintMessage");
		String actualMessage ="April";
		Assert.assertEquals(actualMessage, expectedMessage);
		
			
	}
	
	@Test (dependsOnMethods = {"TestPrintMessage", "thirdMethod"})
	public void testSalutationToApril() {
		System.out.println("Printing inside testSalutationToApril() ");
	}
	
	@Test
	public void thirdMethod() {
		System.out.println("Printing inside thirdMethod()");
		Assert.assertTrue(true);
	}

}
