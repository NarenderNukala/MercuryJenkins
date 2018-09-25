package stepdefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SearchPage;
import utils.Property;

public class RegistrationSteps {
	
	public WebDriver driver = Hooks.driver;
	private HomePage homePage;
	private RegistrationPage registrationPage;
	
	@Given("^User clicks on the Registration Link in home page$")
	public void user_clicks_on_the_Registration_Link_in_home_page() throws Exception {
		homePage = new HomePage(driver, Property.getPropery("URL"));
		registrationPage = homePage.NavigateToRegistrationPage();
	}

	@Then("^User will be navigated to the registration page$")
	public void user_will_be_navigated_to_the_registration_page() throws Exception {
		Assert.assertTrue(registrationPage.validateRegistrationPage());
	}
	
	@Then("^New user is able to register in to application$")
	public void verifyRegistrationFuncion(DataTable RegisterData) throws Exception {
		List<List<String>> data = RegisterData.raw();
		registrationPage.registerUser(data);
	}
	

}
