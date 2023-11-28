package TestNg_Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestOnGroups {
	
	
	@Test (groups = "cohort16")
	public void testPrintMessage() {
		System.out.println("Printingn testPrintMessage()");
		Assert.assertTrue(true);
	}
	

	@Test (groups = "cohort16")
	public void testPrintMessage2() {
		System.out.println("Printingn testPrintMessage2()");
		Assert.assertTrue(true);
	}
	
	@Test (dependsOnGroups = "cohort16")
	public void testSaluteGroups () {
		System.out.println("Printing this from TestSaluteGroups");
	}
	

}
