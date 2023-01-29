package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class sortable {
	static WebDriver driver;
	public static void main(String[] args) {
	
	SeleniumUtility util = new SeleniumUtility();
	
	driver=util.setUp("chrome","https://jqueryui.com/");

	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	
	driver.switchTo().frame(0);

	List<WebElement> lists = driver.findElements(By.xpath("//ul[@id='sortable']/li"));

	for(int i=0;i<lists.size();++i){
		
		System.out.println(lists.get(i).getText());
	}
	/*
	Actions a = new Actions(driver);

	for(int i=0;i<lists.size();++i){

	WebElement element  = lists.get(i);

	String text =  lists.get(i).getText();
	}
	*/
	
	for(int i=0;i<lists.size()-1;i++) {
		util.performDragAndDrop(lists.get(lists.size()-1), lists.get(i));
		//for HTML sync re-identify
		lists=driver.findElements(By.cssSelector("#sortable>li"));
	}
		
}
}