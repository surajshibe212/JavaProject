package PagesScriptPOM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesPOM.OrangeHrmHome;
import PagesPOM.OrangeHrmLogin;
import PagesPOM.PersonalDetailsPage;
import PagesPOM.PimHomePage;
import PagesPOM.addEmployeePage;
import utilities.SeleniumUtility;
//import webpages.AddEmployeePage;

public class OrangeHrmScript extends SeleniumUtility{
	OrangeHrmLogin getOrangeHrmLogin;
	OrangeHrmHome getOrangeHrmHome;
	PimHomePage getPimHomePage;
	PersonalDetailsPage getPersonalDetailsPage;
	addEmployeePage getaddEmployeePage;
	@BeforeTest
	public void startUp() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHrmLogin=new OrangeHrmLogin(driver);
		getOrangeHrmHome=new OrangeHrmHome(driver);
		getPimHomePage=new PimHomePage(driver);
		getPersonalDetailsPage=new PersonalDetailsPage(driver);
		getOrangeHrmLogin.loginIntoOrangeHrm("Admin","admin123");
		String expectedTitle="OrangeHRM";
		String actualTitle=getOrangeHrmHome.getHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"login got failed or home page title got changed");
		getOrangeHrmHome.clickOnPIM();
	}

	@Test(priority=0)
	public void testPimCreation() throws InterruptedException {
		getaddEmployeePage=new addEmployeePage(driver);
		getPimHomePage=new PimHomePage(driver);
		getPimHomePage.clickOnAddButton();
		getaddEmployeePage.createEmployee("Mobile", "Lead", 434);
		getOrangeHrmHome.clickOnPIM();
		Thread.sleep(2000);
		getPimHomePage.searchCreatedEmployee(434);
		Thread.sleep(1000);
		String acutalMsg=getPimHomePage.getSearchResultMsg();
		String expectedMsg="(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
	
	@Test(priority=1)
	public void testPimEdit() throws InterruptedException {
		getPersonalDetailsPage=new PersonalDetailsPage(driver);
		getOrangeHrmHome=new OrangeHrmHome(driver);
		getPimHomePage=new PimHomePage(driver);
		getOrangeHrmHome.clickOnPIM();
		
		getPimHomePage.searchCreatedEmployee(434);
		
		getPimHomePage.editCreatedEmployee();
		
		getPersonalDetailsPage.editEmployee();
		Thread.sleep(2000);
		getOrangeHrmHome.clickOnPIM();
		Thread.sleep(2000);
		getPimHomePage.searchCreatedEmployee(434);
		Thread.sleep(1000);

	}  

	@Test(priority=2)
	public void testPimDeletion() throws InterruptedException {
		getOrangeHrmHome.clickOnPIM();
		getPimHomePage=new PimHomePage(driver);
		getPimHomePage.searchCreatedEmployee(434);
		getPimHomePage.deleteCreatedEmployee();
		Thread.sleep(3000);
		String acutalMsg=getPimHomePage.getSearchResultMsg();
		String expectedMsg="No Records Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
	@AfterTest
	public void postcondition() {
		//tearDown();
	}  
	
}
