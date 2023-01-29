package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHrmLoginPage extends SeleniumUtility {
	
	 @Given("^user in on OrangeHRM login page$")
	    public void user_in_on_orangehrm_login_page() {
		 setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    @When("^user enters username as (.+) in the username field$")
	    public void user_enters_username_as_in_the_username_field(String username) {
	    	typeInput(driver.findElement(By.name("username")), username);
	    	
	    }

	    @Then("^user should get page title as (.+)$")
	    public void user_should_get_page_title_as(String title) {
			Assert.assertEquals(title, getCurrentTitleOfApplication(title),"Login Page validation failed");
        }
	    @And("^user enters password as (.+) in password field$")
	    public void user_enters_password_as_in_password_field(String password) {
	    	typeInput(driver.findElement(By.name("password")), password);
	    }

	    @And("^clicks on Login button$")
	    public void clicks_on_login_button()  {
	    	clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	       
	    }

//	    @And("^close the browser$")
//	    public void close_the_browser() {
//	    	cleanUp();
//	    }  
	 
}
