package pages;

import java.util.List;
import utils.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.NAME, using="passCount")
	public static WebElement PassengerCount;
	
	@FindBy(how=How.NAME, using="fromPort")
	public static WebElement FromPort;
	
	@FindBy(how=How.NAME, using="fromMonth")
	public static WebElement FromMonth;
	
	@FindBy(how=How.NAME, using="fromDay")
	public static WebElement FromDay;
	
	@FindBy(how=How.NAME, using="toPort")
	public static WebElement ToPort;
	
	@FindBy(how=How.NAME, using="toMonth")
	public static WebElement ToMonth;
	
	@FindBy(how=How.NAME, using="toDay")
	public static WebElement ToDay;
	
	@FindBy(how=How.NAME, using="servClass")
	public static WebElement ServiceClass;
	
	@FindBy(how=How.NAME, using="airline")
	public static WebElement AirLine;
	
	@FindBy(how=How.NAME, using="findFlights")
	public static WebElement FindFlights;

	public void EnterTravelDetails(List<List<String>> TravelDetails) {
		
		try {
			Utils.SelectElement(PassengerCount, TravelDetails.get(1).get(0));
			Utils.SelectElement(FromPort, TravelDetails.get(1).get(1));
			Utils.SelectElement(FromMonth, TravelDetails.get(1).get(2));
			Utils.SelectElement(FromDay, TravelDetails.get(1).get(3));
			Utils.SelectElement(ToPort, TravelDetails.get(1).get(4));
			Utils.SelectElement(ToMonth, TravelDetails.get(1).get(5));
			Utils.SelectElement(ToDay, TravelDetails.get(1).get(6));
			//Utils.SelectElement(ServiceClass, TravelDetails.get(1).get(7));
			Utils.SelectElement(AirLine, TravelDetails.get(1).get(8));
			FindFlights.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
