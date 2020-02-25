package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataGenerator.supportFormData;
import junit.framework.Assert;
import pageObjects.contactUsPage;
import pageObjects.googleSearchPage;
import pageObjects.googleSearchResultsPage;
import pageObjects.homePage;
import pageObjects.supportPage;

public class TestSteps {
	WebDriver driver;
	String urltext = "www.securepay.com.au";
	googleSearchPage search;
	googleSearchResultsPage searchresult;
	homePage mainTab;
	supportPage options;
	contactUsPage formData;
	
			
	@Given("^user is on google search page$")
	public void user_is_on_google_search_page() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:www.google.com.au/");
	}

	@When("^he searches for SecurePay$")
	public void he_searches_for_SecurePay(){
		search = new googleSearchPage(driver);
		search.googlesearch("SecurePay");	
	}

	@When("^selects the result with link \"([^\"]*)\" from search results page$")
	public void selects_the_result_with_link_from_search_results_page(String urltext) {
		searchresult = new googleSearchResultsPage(driver);
		searchresult.selectURL();
	}

	@When("^clicks on the Support tab$")
	public void clicks_on_the_Support_tab(){
		mainTab = new homePage(driver);
		mainTab.selectTab();
	}

	@When("^selects the Contact Us box from support page$")
	public void selects_the_Contact_Us_box_from_support_page(){
		options = new supportPage(driver);
		options.selectOption();
	}

	@When("^fills out the support form with request details$")
	public void fills_out_the_support_form_with_request_details() {
		formData = new contactUsPage(driver);
		formData.fill_supportForm();		
	}

	@Then("^support form is ready for submission$")
	public void support_form_is_ready_for_submission() {
	    driver.quit();
	}
	
	@Then("^Contact Us page is loaded successfully\\.$")
	public void contact_Us_page_is_loaded_successfully() {
		formData = new contactUsPage(driver);
		Assert.assertEquals("Contact Us page is loaded successfully", formData.getHeaderText(), "Contact us");
	     driver.quit();
	}


}
