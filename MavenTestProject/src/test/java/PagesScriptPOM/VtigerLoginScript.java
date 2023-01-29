package PagesScriptPOM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesPOM.CreateContact;
import PagesPOM.VigerLogin;
import PagesPOM.VtigerHomePage;
import utilities.SeleniumUtility;

public class VtigerLoginScript extends SeleniumUtility {

	VigerLogin getVigerLogin;
	VtigerHomePage getVtigerHomePage;
	CreateContact getContact;
	@BeforeTest
	public void startUp() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVigerLogin=new VigerLogin(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getContact=new CreateContact(driver);
	}

	@Test(priority=0)
	public void testLogin() {
		getVigerLogin.loginPage("admin","Test@123");
		String expectedTitle="Dashboard";
		String actualTitle=getVtigerHomePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Either vtiger login got failed or home page title got changed");
		
	}
	@Test(priority=1)
	public void navigateCon() {
		getVtigerHomePage.navigateContact();
		String expTitle="Contacts";
		String actTitle=getContact.getContactPageTitle();
		Assert.assertEquals(expTitle, actTitle,"Navigate to other page");
	}
	@Test(priority=2)
	public void createC() {
		getContact.createCont("Suraj", "Shibe", "7798181214");
		Assert.assertTrue(getContact.checkCon(),"Contact not created");
		
	}
	
	@AfterTest
	public void ends() {
		cleanUp();
	}

}
