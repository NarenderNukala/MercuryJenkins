package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage(WebDriver driver, String url) {
		super(driver);
		driver.get(url);
	}

	@FindBy(how=How.NAME, using="userName")
	public static WebElement UserName;
	
	@FindBy(how=How.NAME, using="password")
	public static WebElement Password;
	
	@FindBy(how=How.NAME, using="login")
	public static WebElement LoginButton;
	
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	public static WebElement RegisterLink;
	
	
	public SearchPage Login(String user, String password)
	{
		UserName.sendKeys(user);
		Password.sendKeys(password);
		LoginButton.click();
		return new SearchPage(driver);
	}
	
	public Boolean ValidateLogin() {
		if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
			return true; 	
		} else {
			return false; 
		}
	}
	
	public Boolean ValidateHomePage() {
		if (driver.getTitle().equals("Sign-on: Mercury Tours")) {
			return true;	
		} else {
			return false;
		}
	}
	
	public RegistrationPage NavigateToRegistrationPage()
	{
		RegisterLink.click();
		return new RegistrationPage(driver);
	}
}


