package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	 
		public homePage(WebDriver driver) {
		     PageFactory.initElements(driver, this);
		 }
		 
		 @FindBy(how = How.ID, using = "menu-item-3367") 
		 private WebElement Support;

		 public void selectTab() {
			 Support.click();
		 }
         
}
