package MavenPr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElementOrngHrm {
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		driver=util.setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//verify by default mouse pointer is present in username input field
		WebElement element=driver.switchTo().activeElement();
		String exp=element.getAttribute("name");
		if(exp.equals("username")) {
			System.out.println("Mouse pointer is in username field");
		}
		element.sendKeys("Admin",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("admin123",Keys.ENTER);
		
		
		
	}

}
