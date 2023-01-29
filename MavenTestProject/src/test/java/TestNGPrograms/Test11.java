package TestNGPrograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	WebDriver driver;
  @BeforeTest
  public void load1() throws IOException {
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
  
  @Test
  public void Test1() throws IOException {
	  driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	  TakesScreenshot ts=(TakesScreenshot)driver;
	//get screenshot using getScreenshotAs() of TakesScreenshot interface
	  File fs=ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(fs, new File(".\\screenshot\\vit.jpg"));
	  System.out.println("success");
  }
  
  @AfterTest
  public void close1() {
	  driver.close();
  }
}

