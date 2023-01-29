package assignment;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;

public class ActtitimeCreate extends SeleniumUtility {
	WebDriver driver;

	static ExtentTest test;
	static ExtentReports report;
	@BeforeMethod
	public static void startTest() {
		report = new ExtentReports(".\\ExtentReport\\ActitimeExtentReport.html",false);
		test = report.startTest("ActitimeRpt");
	}
	
	@BeforeTest
	public void login() {

		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		getCurrentTitleOfApplication("actiTIME - Enter Time-Track");
		String expTitle = "actiTIME - Enter Time-Track";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "Login Faild ");
	}
	
	@Test(priority=1,retryAnalyzer=assignment.RetryAnalyzer.class)
	public void crateTask() throws InterruptedException, IOException {
		//click on Task
		clickOnElement(driver.findElement(By.xpath("//*[@id='container_tasks']")));
		//click on new
		clickOnElement(driver.findElement(By.xpath("//div[text()='Add New']")));
		//click on new Task
		clickOnElement(driver.findElement(By.cssSelector(".createNewTasks")));
		Thread.sleep(5000);
		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector .selectedItem")));
//		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		clickOnElement(driver.findElement(By.xpath(".projectSelector .selectedItem")));
		
		//clickOnElement(driver.findElement(By.cssSelector(".projectSelector .selectedItem")));
		
		List<WebElement> projectList=driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
		projectList.get(3).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("HDFCBank1 Testing");
		driver.findElement(By.cssSelector(".x-btn-text")).click();
		driver.findElement(By.cssSelector("a[title='Next Month (Control+Right)']")).click();
		
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(3)>a>em>span")).click();
		
		driver.findElement(By.cssSelector(".taskTableContainer .value.ellipsis")).click();
		
		driver.findElements(By.cssSelector(".taskTableContainer .typeOfWorkList>div>div")).get(8).click();
		
		driver.findElement(By.cssSelector(".basicLightboxFooter .components_button_label")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String newTaskName = taskNameList.get(i).getText();
			
			if (newTaskName.equals("HDFCBank1 Testing")) {
				test.log(LogStatus.PASS,test.addScreenCapture(screenShot(driver)), "Navigated to the specified URL successfully... ");
				//System.out.println("Navigated to the specified URL successfully and page tile is also validated");
			} else {
				test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)), "Actitime create page validation got failed");
				//System.out.println("Google page validation got failed");
				Assert.assertTrue(newTaskName.equals("HDFCBank1 Testing"));
			}
				System.out.println("Created task present:" + i + " " + newTaskName); 
			} 
		}
			
	
	@Test(priority=2,dependsOnMethods="crateTask",retryAnalyzer=assignment.RetryAnalyzer.class)
	public void delete() throws InterruptedException {
		
		List<WebElement> taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String newTaskName = taskNameList.get(i).getText();
			List<WebElement> taskCheckBoxs = driver.findElements(By.cssSelector(".taskRow .checkbox"));
			if (newTaskName.equals("HDFCBank1 Testing")) {
				System.out.println("Matched Task names:" + i + " " + newTaskName);
				taskCheckBoxs.get(i).click();
				Thread.sleep(3000);;
				driver.findElement(By.xpath("//div[text()='Delete']")).click();
				driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
				System.out.println("Task deleted..");
			}
	     }
	}
	@AfterMethod
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
	@AfterTest
	public void logout() {
		
		driver.findElement(By.id("logoutLink")).click();
		tearDown();
	} 
	
	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/Google_" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
}

