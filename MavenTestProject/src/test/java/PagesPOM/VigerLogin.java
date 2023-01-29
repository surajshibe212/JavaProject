package PagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VigerLogin extends SeleniumUtility {
	
	//Initialize current web page Elements
	public VigerLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//username
	@FindBy(id="username")
	private WebElement userInput;
	//password
		@FindBy(id="password")
		private WebElement passInput;
		//signIn
		@FindBy(xpath="//button[text()='Sign in']")
		private WebElement login;
		
		public void loginPage(String uname,String pass) {
			typeInput(userInput, uname);
			typeInput(passInput, pass);
			clickOnElement(login);

			
		}
		
}
