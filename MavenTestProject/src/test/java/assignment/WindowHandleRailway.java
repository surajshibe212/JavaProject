package assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;

public class WindowHandleRailway extends SeleniumUtility{

	//public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(".\\ExtentReport\\ExtentReportResults.html",false);
		test = report.startTest("RailwayRpt");	}	
	
		@Test
		public void rail() throws InterruptedException, IOException {
		//SeleniumUtility s=new SeleniumUtility();
			
		
		driver=setUp("chrome","https://etrain.info/in");
		//get cureent window id
		String homeId=driver.getWindowHandle();
		System.out.println("Current window Id="+homeId);
		driver.findElement(By.linkText("Refund Rules")).click();
		
		Set<String> allWin=driver.getWindowHandles();
		System.out.println("All Window Id:"+allWin);
		//remove home id from all id to get child id
		
		allWin.remove(homeId);
		System.out.println("After remove home id:"+allWin);
		
		//get child id using iterator
		Iterator<String> itr=allWin.iterator();
		String childId=itr.next();
/*		
		while (iterator.hasNext()) {
            String childId = iterator.next();
                if (!homeId.equalsIgnoreCase(childId)) {
                driver.switchTo().window(childId);
          }
	*/	
		
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//a[text()='Services']")).click();
		//driver.findElement(By.xpath("//*[@id='collapse4']/ul/li[5]/a")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='collapse1']/ul/li/a"));
		System.out.println("All Services List:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(2000);
		list.get(4).click();
		driver.findElement(By.cssSelector(".link-click")).click();
		
		Set<String> child2=driver.getWindowHandles();
		List<String> child2List=new ArrayList<>(child2);
		System.out.println("Total Windows are:"+child2List.size());
		System.out.println("Windows id are:"+child2List);
		driver.switchTo().window(child2List.get(2));
		
		System.out.println("Page Text:"+driver.findElement(By.xpath("//div[@class='col-md-8 col-md-push-2 text-center']/h3")).getText());
		driver.switchTo().window(homeId);
		driver.findElement(By.id("rsfi2")).sendKeys("RATNAGIRI");
		List<WebElement> train=driver.findElements(By.xpath("//div[@id='et_autocomplete']/div/a"));
		
		train.get(0).click();
		driver.findElement(By.id("stnsbmtbtn")).click();
		
		List<WebElement>num=driver.findElements(By.xpath("//*[@id='upperdata']/div/div[1]/table/tbody/tr/td[1]/a"));

		System.out.println("Total Train:"+num.size());
		List<WebElement>name=driver.findElements(By.xpath("//*[@id='upperdata']/div/div[1]/table/tbody/tr/td[2]/a"));
		System.out.println("Total Train:"+name.size());
		
		if (getCurrentUrlOfApplication().equals("https://etrain.info/station/Ratnagiri-RN/all")) {
			test.log(LogStatus.PASS,test.addScreenCapture(screenShot(driver)), "Navigated to the specified URL successfully... ");
			//System.out.println("Navigated to the specified URL successfully and page tile is also validated");
		} else {
			test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)), "Train page validation got failed");
			//System.out.println("Google page validation got failed");
			Assert.assertTrue(getCurrentTitleOfApplication().equals("https://etrain.info/station/Ratnagiri-RN/all"));
		}
		
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i).getText()+" :"+name.get(i).getText());
		}
		
		driver.quit();
	}
		
		@AfterClass
		public static void endTest() {
			report.endTest(test);
			report.flush();
		}
		public static String screenShot(WebDriver driver) throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File Dest = new File("src/../BStackImages/Google_" + System.currentTimeMillis()+ ".png");
			String errflpath = Dest.getAbsolutePath();
			FileUtils.copyFile(scrFile, Dest);
			return errflpath;
			}

}
