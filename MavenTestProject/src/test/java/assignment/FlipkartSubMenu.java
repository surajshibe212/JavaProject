package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class FlipkartSubMenu extends SeleniumUtility {
  @Test
 public void subMenu() throws InterruptedException {
	  
	  WebDriver driver=setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		List<WebElement> mainMenus=driver.findElements(By.cssSelector("div#container>div>div:nth-of-type(2) a>div:nth-of-type(2)"));
		for(int i=0;i<mainMenus.size();i++) {
			System.out.println(mainMenus.get(i).getText());
			
			action.moveToElement(mainMenus.get(i)).perform();
			//Thread.sleep(500);
			List<WebElement> subMenus=driver.findElements(By.cssSelector("div#container>div>div:nth-of-type(2) a>div:nth-of-type(2) ._7qr1OC>a"));
			if(subMenus.size()>0) {
				for(int j=0;j<subMenus.size();j++) {
					System.out.println(subMenus.get(j).getText());
				}
			}
		}
	  
  }
}
