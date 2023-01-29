package MavenPr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class AlertPopup {
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumUtility s=new SeleniumUtility();
		driver=s.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//as the required element is present inside the frame, so need to switch our control inside frame first
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		//to perform another action on alert, we need to again switch our control to the alert
		driver.switchTo().alert().accept();
		

	}

}
