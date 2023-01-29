package MavenPr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElement1 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		SeleniumUtility m=new SeleniumUtility();
		driver=m.setUp("chrome", "https://demo.actitime.com/login.do");
		//verify by default mouse pointer is present in username input field
		
		WebElement el=driver.switchTo().activeElement();
		String str=el.getAttribute("placeholder");
		if(str.equals("Username")) {
			System.out.println("Mouse pointer is in username ");
		}
		
		//perform accessibility testing for login functionality
		el.sendKeys("admin",Keys.TAB);
		//after pressing Tab button control will move to password input field
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
		
	}

}
