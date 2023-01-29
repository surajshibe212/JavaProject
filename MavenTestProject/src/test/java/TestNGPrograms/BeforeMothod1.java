package TestNGPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class BeforeMothod1 extends SeleniumUtility {
  
  WebDriver driver;
	@BeforeMethod
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
	@AfterMethod
	public void tearDown() {
		
		cleanUp();
	}
}
