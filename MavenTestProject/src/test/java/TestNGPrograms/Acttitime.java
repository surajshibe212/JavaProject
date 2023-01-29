package TestNGPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Acttitime {
	static WebDriver driver;
	SeleniumUtility util ;
  @Test
	public void a_loginInToActitime() throws InterruptedException {
	   util = new SeleniumUtility();
		driver=util.setUp("chrome","https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
     	util.getCurrentTitleOfApplication("actiTIME - Enter Time-Track");
		System.out.println("Title:"+driver.getTitle());
		String actTitle=driver.getTitle();
		
//		System.out.println(actTitle);
		String expTitle="actiTIME - Enter Time-Track";
		if(actTitle.equals(expTitle)) {
			System.out.println("Login Valid");
		}
		else {
			System.out.println("Login failed");
		}
		
	}
	
	
	@Test
	public void b_verifyTaskCreation() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='container_tasks']")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector("div:nth-of-type(19)>div:nth-of-type(3).item")).click();
		//first drp list
		driver.findElement(By.cssSelector("tr:nth-of-type(1)>td:nth-of-type(1)>div>div>div:nth-of-type(1)>div:nth-of-type(3)")).click();
		List<WebElement> drpList=driver.findElements(By.cssSelector("div>div:nth-of-type(2)>div>div:nth-of-type(1)>div.searchItemList>div"));
		drpList.get(4).click();
		
		Thread.sleep(500);
		//second drp list
		driver.findElement(By.cssSelector("tr:nth-of-type(3)>td:nth-of-type(1)>div>div>div:nth-of-type(1)>div:nth-of-type(3)")).click();
		
		List<WebElement> drpList1=driver.findElements(By.cssSelector("tr:nth-of-type(3)>td:nth-of-type(1)>div>div>div:nth-of-type(2)>div>div:nth-of-type(1)>div>div"));
		drpList1.get(3).click();
		
		driver.findElement(By.cssSelector("tr:nth-of-type(1)>td:nth-of-type(1).nameCell>input")).sendKeys("Testing");
		driver.findElement(By.className("tr>td:nth-of-type(2)>em>button#ext-gen45")).click();
		driver.findElement(By.id("ext-gen118")).click();
		driver.findElement(By.cssSelector("tr:nth-of-type(3)>td:nth-of-type(4)>a>em>span")).click();
	}
	@Test
	public void c_verifyTaskDeletion() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='container_tasks']")).click();
		//driver.findElement(By.xpath("//div[text()='Flight analysis']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='taskRowsTableContainer']/table/tbody/tr/td[1]/div/div"));
		System.out.println("Total Task:"+list.size());
		
		list.get(3).click();
		
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		
	}
}
