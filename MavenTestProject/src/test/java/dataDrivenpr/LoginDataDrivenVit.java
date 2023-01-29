package dataDrivenpr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class LoginDataDrivenVit extends SeleniumUtility {
	
	String appUrl;
	String userName;
	String password;	
	@Test
	public void orangeHrmLogin() {
		
		    appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 3, 0);
		    userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 3, 1);
		    password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 3, 2);

		
		    WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.id("username")),userName);
			typeInput(driver.findElement(By.name("pwd")),password);
			performClick(driver.findElement(By.id("loginButton")));	
			if(getPageTitle("actiTIME - Enter Time-Track").equals("actiTIME - Enter Time-Track")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 3, 4,"actiTIME - Enter Time-Track");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 3, 5,"Passed");
				
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 3, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle("actiTIME - Enter Time-Track"), "actiTIME - Enter Time-Track");
			driver.close();
	}
	
	@Test
	public void orangeHrmLoginInvalid() {
		
		 appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 4, 0);
		    userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 4, 1);
		    password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 4, 2);

		
		    WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.id("username")),userName);
			typeInput(driver.findElement(By.name("pwd")),password);
			performClick(driver.findElement(By.id("loginButton")));	
			if(getPageTitle("actiTIME - Login").equals("actiTIME - Login")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 4, 4,"actiTIME - Login");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 4, 5,"Passed");
				
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle("actiTIME - Login"), "actiTIME - Login");
			driver.close();
	}


}


