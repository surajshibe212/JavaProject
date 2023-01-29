package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class cricinfomenuSubMenu {

	public static void main(String[] args) {
		SeleniumUtility s=new SeleniumUtility();
		WebDriver driver=s.setUp("chrome","https://www.cricinfo.com");
		
       List<WebElement> criList=driver.findElements(By.cssSelector("#main-container>div:nth-of-type(3)>div>nav>div>div>div>div:nth-of-type(2)>div:nth-of-type(1)>div>a"));
		
		int cricCount=criList.size();
		
		System.out.println("Total Menu Count:"+cricCount);
		
		for(int i=0;i<cricCount;i++) {
			System.out.println(criList.get(i).getText());
			
		}
		


	}

}
