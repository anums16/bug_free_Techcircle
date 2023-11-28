package TestNG_Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {

	
    @BeforeTest
    public void setUp() {
        System.out.println("BeforeTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }



    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterMethod
    @AfterTest
    public void tearDown() {
        System.out.println("AfterTest");
    }
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }
    
    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
    
    @Test(groups= {"Regression"})
    public void test2() {
        System.out.println("Test2");
    }
    
    @Test(groups= {"SmokeTest"})
    public void test1() {
        System.out.println("Test");
    }
	
    @Test(groups={"Gautam", "SmokeTest"})
    public void test4() {
        System.out.println("Test4");
    }
	
	
	
	
	

}
