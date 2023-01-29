package PagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VitigerEdit extends SeleniumUtility {
	
	public VitigerEdit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
