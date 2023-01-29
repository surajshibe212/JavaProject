package PagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PersonalDetailsPage extends SeleniumUtility {

	public PersonalDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	//Job Link
	@FindBy(css="div:nth-child(6) a:nth-child(1)")
	private WebElement clickJob;
	//Job Title Dropdown
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")
	private WebElement clickJobTitle;
	//Job Title Dropdown Elements
	@FindBy(xpath="//div[@role='listbox']//div[19]")
	private WebElement jobPos;
	
	//Save Button
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveBut;
	//Function: Update PIM
	public void editEmployee() {
		clickOnElement(clickJob);
		clickOnElement(clickJobTitle);
		clickOnElement(jobPos);
		clickOnElement(saveBut);
		setSleepTime(2000);
	}
}