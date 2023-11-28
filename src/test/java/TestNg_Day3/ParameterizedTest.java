package TestNg_Day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters("anyName")
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is --> " + myName);
	}
	
	

}
