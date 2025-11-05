package FileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageTest {
	WebDriver driver;
	public SearchPageTest() {
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//input[@class='Pke_EE']")
	WebElement search_ProductEdt;
}
