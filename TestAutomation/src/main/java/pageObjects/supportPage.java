package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class supportPage {
	
	public supportPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }

	 @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/h3") 
	 private WebElement ContactUs;
	 
	 public void selectOption() {
		 ContactUs.click();
	 }

}
