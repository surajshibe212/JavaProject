package dataDrivenpr;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class LoginDataDriven extends SeleniumUtility {
	String appUrl;
	String userName;
	String password;	
	@Test
	public void orangeHrmLogin() {
		
		    appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 5, 0);
		    userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 5, 1);
		    password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 5, 2);

		
			WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.name("username")),userName);
			typeInput(driver.findElement(By.name("password")),password);
			performClick(driver.findElement(By.xpath("//button[@type='submit']")));	
			
			if(getPageTitle("OrangeHRM").equals("OrangeHRM")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 5, 4,"OrangeHRM");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 5, 5,"Passed");
				
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 5, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle("OrangeHRM"), "OrangeHRM");
			driver.close();
	}
	
	@Test
	public void orangeHrmLoginInvalid() {
		
		 appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 6, 0);
		    userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 6, 1);
		    password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 6, 2);

		
			WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.name("username")),userName);
			typeInput(driver.findElement(By.name("password")),password);
			performClick(driver.findElement(By.xpath("//button[@type='submit']")));	
			
			if(getPageTitle("OrangeHRM").equals("OrangeHRM")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 6, 4,"OrangeHRM");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 6, 5,"Passed");
				
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 6, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle("OrangeHRM"), "OrangeHRM");
			driver.close();
	}
}
