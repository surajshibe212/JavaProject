package dataDrivenpr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class LoginDataDrivenACt extends SeleniumUtility {
	
	String appUrl;
	String userName;
	String password;	
	@Test
	public void orangeHrmLogin() {
		
		    appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 1, 0);
		    userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 1, 1);
		    password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 1, 2);

		
			WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.id("username")),userName);
			typeInput(driver.findElement(By.id("password")),password);
			performClick(driver.findElement(By.xpath("//button[@type='submit']")));	
			
			if(getPageTitle("Tableau de bord").equals("Tableau de bord")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 1, 4,"Tableau de bord");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 1, 5,"Passed");
				
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 1, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle("Tableau de bord"), "Tableau de bord");
			driver.close();
	}
	
	@Test
	public void orangeHrmLoginInvalid() {
		
		 appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 0);
		    userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 1);
		    password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 2);

		
		    WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.id("username")),userName);
			typeInput(driver.findElement(By.id("password")),password);
			performClick(driver.findElement(By.xpath("//button[@type='submit']")));	
			
			if(getPageTitle("vtiger").equals("vtiger")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 4,"vtiger");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 5,"Passed");
				
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTestData.xlsx", "Sheet2", 2, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle("vtiger"), "vtiger");
			driver.close();
	}


}
