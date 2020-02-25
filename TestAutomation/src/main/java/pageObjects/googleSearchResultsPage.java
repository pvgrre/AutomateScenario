package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class googleSearchResultsPage {
 
	public googleSearchResultsPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.PARTIAL_LINK_TEXT, using = "www.securepay.com.au") 
	 private WebElement url;

	 public void selectURL() {
		 url.click();
	 }
}
