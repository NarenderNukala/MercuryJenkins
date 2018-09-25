package stepdefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchPage;

public class SearchSteps {
	
	public WebDriver driver = Hooks.driver;
	private SearchPage searchPage;
	
	@When("^I have entered travel details and searched for flights$")
	public void i_have_entered_travel_details_and_searched_for_flights(DataTable SearchData) throws Exception {
		List<List<String>> data = SearchData.raw();
		searchPage = new SearchPage(driver);
		searchPage.EnterTravelDetails(data);
	}

	@Then("^I should be able to see search results$")
	public void i_should_be_able_to_see_search_results() throws Exception {
		System.out.println("Pending Implementation");
	}


}
