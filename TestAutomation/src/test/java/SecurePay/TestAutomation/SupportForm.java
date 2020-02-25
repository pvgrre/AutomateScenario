package SecurePay.TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SupportForm {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cigniti\\Documents\\Eclipse\\Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:www.google.com.au/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Securepay");
		element.submit();
		
		//By.id("rso");
		//By.className("iUh30 tjvcx");
		WebElement url = driver.findElement(By.partialLinkText("www.securepay.com.au"));
		url.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		WebElement Support = driver.findElement(By.id("menu-item-3367"));
		Support.click();
		
		WebElement Contactus = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/h3"));
		Contactus.click();
		
		WebElement firstName = driver.findElement(By.name("first-name"));
		firstName.sendKeys("FN");
		
		WebElement lastName = driver.findElement(By.name("last-name"));
		lastName.sendKeys("LN");  
		
		WebElement emailAddress = driver.findElement(By.name("email-address"));
		emailAddress.sendKeys("FN.LN@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.name("phone-number"));
		phoneNumber.sendKeys("1234567890");
		
		WebElement websiteURL = driver.findElement(By.name("website-url"));
		websiteURL.sendKeys("http://test.com");
		
		WebElement businessName = driver.findElement(By.name("business-name"));
		businessName.sendKeys("Trial Inc");
		
		Select enquiryReason = new Select(driver.findElement(By.name("reason-for-enquiry")));
		enquiryReason.selectByValue("Support");
		
		WebElement message =driver.findElement(By.name("message"));
		message.sendKeys("No specific comment");		

	}

}
