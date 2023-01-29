package TestNGPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class BeforeAfterAssertion extends SeleniumUtility {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=setUp("chrome","https://www.google.com");
		
	}
	@Test(priority=1)
	public void test() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
		
	}
	@Test(priority=2)
	public void test2() {
		
		getActiveElementFromUI().sendKeys("sql",Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("sql"),"SQL is failed");
	}
	@AfterTest
	public void tearDown() {
		
		cleanUp();
	}

}
