package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import dataGenerator.supportFormData;

public class contactUsPage {
	
	public contactUsPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }

	 @FindBy(how = How.NAME, using = "first-name") 
	 private WebElement txt_firstName;
	 
	 public void enter_firstName(String firstname) {
		 txt_firstName.sendKeys(firstname);
		 }
	 
	 @FindBy(how = How.NAME, using = "last-name") 
	 private WebElement txt_lastName;
	 
	 public void enter_lastName(String lastname) {
		 txt_lastName.sendKeys(lastname);
		 }

	 @FindBy(how = How.NAME, using = "email-address") 
	 private WebElement txt_email;
	 
	 public void enter_email(String email) {
		 txt_email.sendKeys(email);
		 }
	 
	 @FindBy(how = How.NAME, using = "phone-number") 
	 private WebElement txt_phonenumber;
	 
	 public void enter_phonenumber(String phone) {
		 txt_phonenumber.sendKeys(phone);
		 }
	 
	 @FindBy(how = How.NAME, using = "website-url") 
	 private WebElement txt_websiteURL;
	 
	 public void enter_websiteURL(String weburl) {
		 txt_websiteURL.sendKeys(weburl);
		 }
	 
	 @FindBy(how = How.NAME, using = "business-name") 
	 private WebElement txt_businessName;
	 
	 public void enter_businessName(String businessName) {
		 txt_businessName.sendKeys(businessName);
		 }
	 
	 @FindAll(@FindBy(how = How.NAME, using = "reason-for-enquiry")) 
	 private List<WebElement> dropdown_reasonForEnquiry;
	 
	 public void select_reasonForEnquiry(int reason) {
		 if(reason==0) {
			 dropdown_reasonForEnquiry.get(0).click();
		 }else 
			 if(reason==1){
					 dropdown_reasonForEnquiry.get(1).click();
		 }else dropdown_reasonForEnquiry.get(2).click();
	 }
	 
	 @FindBy(how = How.NAME, using = "message") 
	 private WebElement txt_message;
	 
	 public void enter_message(String msg) {
		 txt_message.sendKeys(msg);
		 }
	 
	 public void fill_supportForm () {	
		 supportFormData data = new supportFormData();
		 enter_firstName(data.firstName());
		 enter_lastName(data.lastName());
		 enter_email(data.email());
		 enter_phonenumber(data.phonenumber());
		 enter_websiteURL(data.websiteURL());
		 enter_businessName(data.businessName());
		 select_reasonForEnquiry(data.select_reasonForEnquiry());
		 enter_message(data.message());
		 
	 }
	 
	 @FindBy(how = How.CSS, using = "#section-heading > div > h1") 
	 private WebElement page_header;
	 
	 public String getHeaderText() {
		 return page_header.getText();
		 }
	 
}
