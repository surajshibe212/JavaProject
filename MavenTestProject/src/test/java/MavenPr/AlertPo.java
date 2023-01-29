package MavenPr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class AlertPo {
 
	static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtility s=new SeleniumUtility();
	    driver=s.setUp("chrome","https://courses.letskodeit.com/practice");

	   // driver.switchTo().frame("iframeResult");
	    driver.findElement(By.id("alertbtn")).click();
	    System.out.println("Alert text message is:"+driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	}

}
