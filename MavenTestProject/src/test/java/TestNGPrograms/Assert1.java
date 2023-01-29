package TestNGPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert1 {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
	}
  @Test
  public void testGoogle() {
	  
	  String expT="Google";
	  String actT=driver.getTitle();
	 // System.out.println(expT.equals(actT));
	  Assert.assertEquals(actT, expT, "Login Faild please invalid title");
	  //Assert.assertTrue(true);
  }
  @Test(dependsOnMethods="testGoogle")
  public void testSearch() {
	  
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	  System.out.println("Title"+driver.getTitle());
  }
  @AfterTest
  public void clean() {
	  driver.close();
  }
}
