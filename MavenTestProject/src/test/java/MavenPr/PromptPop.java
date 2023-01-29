package MavenPr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class PromptPop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumUtility s=new SeleniumUtility();
	    driver=s.setUp("chrome","https://courses.letskodeit.com/practice");

	    WebElement el=driver.findElement(By.id("name"));
	    
	    el.sendKeys("hwwwe");
	   
	    driver.findElement(By.id("confirmbtn")).click();
	    System.out.println("Alert text message is:"+driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    //driver.switchTo().alert().dismiss();

	    //System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());

	    
	}

}
