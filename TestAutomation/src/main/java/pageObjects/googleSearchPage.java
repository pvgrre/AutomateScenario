package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class googleSearchPage {
	WebDriver driver;
	
	 public googleSearchPage(WebDriver driver) {
		 this.driver = driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.NAME, using = "q") 
	 private WebElement searchbox;
	 
	 public void googlesearch(String text) {
		 searchbox.sendKeys(text);
		 searchbox.submit();
	 }

 }
