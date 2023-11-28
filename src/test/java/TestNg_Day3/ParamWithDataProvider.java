package TestNg_Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamWithDataProvider {
	
	
	@DataProvider (name ="dataProvider1")
	public Object[][] nameOfTheMethod(){
		
	
	return new Object [][] {{"Shafkat", "Leader Jacket",37}, {"Saroj" ,"T-Shirt",24}, {"April","khakis",32}};
		
		
		
		
		
	}
	
	@Test(dataProvider ="dataProvider1")
	public void printDataProvider(String name1, String name2, int age) {
		System.out.println("My name is " + name1 + ", and I am wearing " + name2 + " .And i am " + age + " years old");
		
	}
	
	

}




