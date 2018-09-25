package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SearchPage;
import utils.Property;

public class HomePageSteps {
	
	public WebDriver driver = Hooks.driver;
	private HomePage homePage;
	private SearchPage searchPage;
	
	
	@Given("^I have navigated to application URL$")
	public void i_have_navigated_to_application_URL() throws Exception {
		homePage = new HomePage(driver, Property.getPropery("URL"));
	}

	@When("^I have entered correct UserName and Password$")
	public void i_have_entered_correct_UserName_and_Password() throws Exception {
		searchPage = homePage.Login("narender", "narender");
	}

	@Then("^I am navigated to the SearchPage$")
	public void i_am_navigated_to_the_SearchPage() throws Exception {
		Assert.assertTrue(homePage.ValidateLogin()); 	
	}
	
	@When("^User enters correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_correct_and(String userName, String passWord) throws Exception {
		searchPage = homePage.Login(userName, passWord);
	}
	
	@Then("^I should navigated to the LoginPage$")
	public void i_should_navigated_to_the_LoginPage() throws Exception {
		Assert.assertTrue(homePage.ValidateHomePage()); 
	}
	
	@When("^I have preformed some validations$")
	public void i_have_preformed_some_validations() throws Exception {
	    System.out.println("Test");
	}

	
}