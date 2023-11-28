package TestNg_Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParallel {
	WebDriver driver;

	public void method1() {
		System.out.println();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.techcircleschool.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	

	}

	public void method2() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	
	}
}
