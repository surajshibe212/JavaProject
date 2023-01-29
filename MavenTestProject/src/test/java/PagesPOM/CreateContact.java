package PagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class CreateContact extends SeleniumUtility{
	public CreateContact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public String getContactPageTitle() {
		getCurrentTitleOfApplication("Contacts");
		return getCurrentTitleOfApplication();
	}
	
	@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addCon;
	
	@FindBy(id="select2-chosen-2")
	private WebElement none;
	
	@FindBy(xpath="//div[@id='select2-drop']/ul/li[2]")
	private WebElement type1;

	@FindBy(id="Contacts_editView_fieldName_firstname")
	private WebElement fName;
	
	@FindBy(id="Contacts_editView_fieldName_lastname")
	private WebElement lName;
	
	@FindBy(id="Contacts_editView_fieldName_mobile")
	private WebElement mob;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	
	@FindBy(css=".module-title")
	private WebElement view;
	
	@FindBy(xpath="//a[contains(text(),'Suraj')]")
	private WebElement checkName;
	
	public void createCont(String name,String lastName,String mobile) {
		clickOnElement(addCon);
		clickOnElement(none);
		clickOnElement(type1);
		typeInput(fName,name);
		typeInput(lName,lastName);
		typeInput(mob,mobile);
		clickOnElement(save);
		clickOnElement(view);
	}
	
	public boolean checkCon() {
			return isElementExist(checkName);
		}

}
