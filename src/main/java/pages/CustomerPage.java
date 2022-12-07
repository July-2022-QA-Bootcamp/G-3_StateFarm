package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	public CustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Client_FirstName']")
	WebElement firstNamElement;
	@FindBy(xpath = "//input[@id='Client_LastName']")
	WebElement lastNamElement;
	@FindBy(xpath = "//input[@id='Client_DOB']")
	WebElement dobElement;
	@FindBy(xpath = "//input[@id='Client_Address_StreetAddress']")
	WebElement addressElement;
	@FindBy(xpath = "//input[@id='Client_Address_City']")
	WebElement cityElement;
	@FindBy(xpath = "//select[@id='Client_Address_County']")
	WebElement countyDropElement;
	@FindBy(xpath = "//input[@id='Client_PhoneNumber_Number']")
	WebElement cellularNumberElement;
	@FindBy(xpath = "//select[@id='Client_PhoneNumber_NumberType']")
	WebElement personalElement;
	
	
	
	
	public void customerSteps(String firstName, String lastName, String dob, String address, String city, String county, String number, String personal) {
		
		
		
		
		
		
		
	}
	
	
	
	
}
