package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrm extends SeleniumUtility {
	WebDriver driver;

	@BeforeTest
	public void login() {

		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		getCurrentTitleOfApplication("OrangeHRM");
		String expTitle = "OrangeHRM";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "Login Faild ");
	}

	@Test(priority = 1,retryAnalyzer=assignment.RetryAnalyzer.class)
	public void crateTask() throws InterruptedException {
		// click on Task
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));

		// click on new
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-header-container>button")));
		// click on new Task

		driver.findElement(By.name("firstName")).sendKeys("suraj");
		driver.findElement(By.name("lastName")).sendKeys("shibe");
		Actions act = new Actions(driver);

		WebElement emp = driver.findElement(
				By.cssSelector("#app form>div:nth-of-type(1) div:nth-of-type(2)>div>div>div:nth-of-type(2)>input"));

		act.moveToElement(emp).doubleClick().sendKeys("789").build().perform();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));

		driver.findElement(By.cssSelector("#app form>div:nth-of-type(1)>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("789");

		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		List<WebElement> empid = driver.findElements(By.cssSelector(
				"#app>div:nth-of-type(1) div:nth-of-type(3) div:nth-of-type(2)>div>div>div:nth-of-type(2)>div"));
		for (int i = 0; i < empid.size(); i++) {
			String eid = empid.get(i).getText();
			if (eid.equals("789")) {
				System.out.println("Created Emp id:" + eid);
			}
		}  
	//	Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//div[contains(text(),'789')]"))));
	}
	@Test(priority=2,dependsOnMethods="crateTask",retryAnalyzer=assignment.RetryAnalyzer.class)
	public void editEmp() throws InterruptedException {
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		
		driver.findElement(By.cssSelector("#app form>div:nth-of-type(1)>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("789");

		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		List<WebElement> empid = driver.findElements(By.cssSelector("#app>div:nth-of-type(1) div:nth-of-type(3) div:nth-of-type(2)>div>div>div:nth-of-type(2)>div"));
		for (int i = 0; i < empid.size(); i++) {
			String eid = empid.get(i).getText();
			List<WebElement> idCheckBoxs = driver.findElements(By.cssSelector("#app>div:nth-of-type(1) div:nth-of-type(3)>div>div:nth-of-type(2)>div>div>div:nth-of-type(1)>div>div>label>span"));
			if (eid.equals("789")) {
				System.out.println("Matched Emp id:" + i + " " + eid);
				idCheckBoxs.get(i).click();
				
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("#app>div:nth-of-type(1) div:nth-of-type(1)>div>div:nth-of-type(9)>div>button:nth-of-type(2)")).click();
				clickOnElement(driver.findElement(By.xpath("//a[text()='Job']")));
				clickOnElement(driver.findElement(By.cssSelector("div:nth-of-type(1)>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)")));
				clickOnElement(driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[19]/span")));
				clickOnElement(driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/div[2]")));
				clickOnElement(driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div[2]/div[5]/span")));
				
				clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
				clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));

			}
		}
		
	}
@Test(priority=3,dependsOnMethods="editEmp",retryAnalyzer=assignment.RetryAnalyzer.class)
	public void deleteEmp() throws InterruptedException {
	clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
	
	driver.findElement(By.cssSelector("#app form>div:nth-of-type(1)>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("789");

	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	Thread.sleep(2000);

		List<WebElement> empid = driver.findElements(By.cssSelector("#app>div:nth-of-type(1) div:nth-of-type(3) div:nth-of-type(2)>div>div>div:nth-of-type(2)>div"));
		for (int i = 0; i < empid.size(); i++) {
			String eid = empid.get(i).getText();
			List<WebElement> idCheckBoxs = driver.findElements(By.cssSelector("#app>div:nth-of-type(1) div:nth-of-type(3)>div>div:nth-of-type(2)>div>div>div:nth-of-type(1)>div>div>label>span"));
			if (eid.equals("789")) {
				System.out.println("Matched Emp id:" + i + " " + eid);
				idCheckBoxs.get(i).click();
				
				Thread.sleep(3000);;
				clickOnElement(driver.findElement(By.cssSelector("#app>div:nth-of-type(1) div:nth-of-type(1)>div>div:nth-of-type(9)>div>button:nth-of-type(1)")));
				clickOnElement(driver.findElement(By.cssSelector("#app>div:nth-of-type(3)>div>div>div>div:nth-of-type(3)>button:nth-of-type(2)")));
				System.out.println("Empid deleted..");  
			}
		}
	}

}
