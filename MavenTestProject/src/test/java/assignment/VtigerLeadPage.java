package assignment;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VtigerLeadPage extends SeleniumUtility{
  
	WebDriver driver;

	@BeforeTest
	public void openBrowserAndUrl() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		WebElement user = driver.findElement(By.cssSelector("input#username"));
		typeInput(user,"admin");

		WebElement password = driver.findElement(By.cssSelector("input#password"));
		typeInput(password,"Test@123");
		
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
	}

	@Test(priority = 1,retryAnalyzer=assignment.RetryAnalyzer.class)
	public void createLead() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(By.xpath("//a[@title='Leads']")));
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='None']")));
		clickOnElement(driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")),"Suraj");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")),"Shibe");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_phone")),"7709181035");
//		typeInput(driver.findElement(By.id("Leads_editView_fieldName_company")),"Biz Secure Labs Pvt ltd");
//		typeInput(driver.findElement(By.id("Leads_editView_fieldName_designation")),"Malware Research Engineer");
//		typeInput(driver.findElement(By.id("Leads_editView_fieldName_email")),"suraj.212@gmail.com");
		clickOnElement(driver.findElement(By.id("select2-chosen-12")));
		clickOnElement(driver.findElement(By.xpath("//div[text()='Support Group']")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),'Leads')]")));
		
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//a[contains(text(),'Suraj')]"))));
		System.out.println("Record is created");
	}
	
	@Test(priority=2,dependsOnMethods="createLead",retryAnalyzer=assignment.RetryAnalyzer.class)
	
	public void editLead() {		
		clickOnElement(driver.findElement(By.xpath("//tr[td[span[span[contains(text(),'7709181035')]]]]/td[1]//span[@class='more dropdown action']")));		
		clickOnElement(driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[2]/a[1]")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_company")),"Biz Secure Labs Pvt ltd");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_designation")),"Malware Research Engineer");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_email")),"suraj.212@gmail.com");
		//typeInput(driver.findElement(By.id("Leads_editView_fieldName_website")),"suraj@12311.srs");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//span[contains(text(),'Biz Secure Labs Pvt ltd')]"))));
		System.out.println("Record is updated");
	}
   @Test(priority=3,retryAnalyzer=assignment.RetryAnalyzer.class)
	public void deleteLead() {
	    clickOnElement(driver.findElement(By.xpath("//tr[td[span[span[contains(text(),'7709181035')]]]]/td[1]//span[@class='more dropdown action']")));	
		clickOnElement(driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[3]/a[1]")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//span[contains(text(),'7709181035')]"))),"Lead not deleted please check...");
	}


	@AfterTest
	public void logoutAndCloseBrowser() {
		clickOnElement(driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.png']")));
		clickOnElement(driver.findElement(By.xpath("//span[@class='fa fa-user']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Sign Out']")));
		//cleanUp();
	}
}