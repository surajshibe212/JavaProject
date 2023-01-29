package PagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility{
	public VtigerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="appnavigator")
	private WebElement navigator;

	@FindBy(xpath="//span[contains(text(),'MARKETING')]")
	private WebElement marketing;
	
	@FindBy(xpath="//*[@id='mCSB_1_container']/li[3]/a")
	private WebElement contact;
	
	public void navigateContact() {
		clickOnElement(navigator);
		clickOnElement(marketing);
		clickOnElement(contact);
	}

	public String getHomePageTitle() {
		getCurrentTitleOfApplication("Dashboard");
		return getCurrentTitleOfApplication();
	}
}