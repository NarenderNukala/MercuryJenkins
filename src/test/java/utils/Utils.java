package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	
	public static void SelectElement(WebElement ele, String value) {
		Select Element = new Select(ele);
		Element.selectByVisibleText(value);
	}

}
