package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class CricInfo extends SeleniumUtility {
  @Test
  public void subMenus() throws InterruptedException {
			WebDriver driver=setUp("chrome", "https://www.cricinfo.com");
			
			List<WebElement> mainMenus=driver.findElements(By.cssSelector("#main-container>div:nth-of-type(3)>div div>div:nth-of-type(2)>div:nth-of-type(1)>div>a"));
			for(int i=0;i<mainMenus.size();i++) {
				System.out.println(mainMenus.get(i).getText());
				
				action.moveToElement(mainMenus.get(i)).perform();
				Thread.sleep(500);
				List<WebElement> subMenus=driver.findElements(By.cssSelector("div>div:nth-of-type(1)>div>div>div>ul>li>a"));
				if(subMenus.size()>0) {
					for(int j=0;j<subMenus.size();j++) {
						System.out.println(subMenus.get(j).getText());
					}
				}
			}
			
		}
  }
