package MavenPr;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class WindowsHanling {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");

		String homeId = driver.getWindowHandle();
		System.out.println("Home Page Windows Id:" + homeId);

		// performing click operation to open Linkedin page in new tab

		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[3]")).click();
		// get all windows unique IDs which are opened by selenium current instance

		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All win id:" + allWinId);

		// remove home window id from all window id dn you will get child window id

		allWinId.remove(homeId);

		System.out.println("After remove home id:" + allWinId);

		// get child window id using iterator

		// Iterator<String> itr = allWinId.iterator();
		Iterator<String> itr = allWinId.iterator();
		String childWinId = itr.next();
		// now you can switch you control from Main window to child window

		driver.switchTo().window(childWinId);
		// or
       // switch control to child window
         //driver.switchTo().window(allWinIds.iterator().next());
 
        // now you are allow to identify any element from child window
		
		System.out.println("Page Title of youtube:"+driver.getTitle());
		System.out.println("Page url:"+driver.getCurrentUrl());
		
		// switch back to home page window in order to perform any required operation on that
				driver.switchTo().window(homeId);
				
				System.out.println("Page Title :"+driver.getTitle());
				System.out.println("Page url:"+driver.getCurrentUrl());
				driver.quit();
				
	}

}
