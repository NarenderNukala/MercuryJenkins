package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.Utils;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.NAME, using="firstName")
	public static WebElement FirstName;
	
	@FindBy(how=How.NAME, using="lastName")
	public static WebElement LastName;
	
	@FindBy(how=How.NAME, using="phone")
	public static WebElement Phone;
	
	@FindBy(how=How.NAME, using="userName")
	public static WebElement Email;
	
	public Boolean validateRegistrationPage() {
		if (driver.getTitle().equals("Register: Mercury Tours"))
			return true;
		else
			return false;
	}
	
	public void registerUser(List<List<String>> RegisterData) {
		try {
			FirstName.sendKeys(RegisterData.get(1).get(0));
			LastName.sendKeys(RegisterData.get(1).get(1));
			Phone.sendKeys(RegisterData.get(1).get(2));
			Email.sendKeys(RegisterData.get(1).get(3));
			
			Thread.sleep(3000);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
