package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class CustomerPage {
	CommonWaits waits;
	
	public CustomerPage(WebDriver driver) {
		waits= new CommonWaits(driver);
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
	@FindBy(xpath = "//select[@id='Client_Address_State']")
	WebElement statElement;
	@FindBy(xpath = "//select[@id='Client_Address_County']")
	WebElement countyDropElement;
	@FindBy(xpath = "//input[@id='Client_PhoneNumber_Number']")
	WebElement cellularNumberElement;
	@FindBy(xpath = "//select[@id='Client_PhoneNumber_NumberType']")
	WebElement personalElement;
	@FindBy(xpath = "//div[@class='next-button-wrap']")
	WebElement nextbuttonElement;
	
	
	public void customerSteps(String firstName, String lastName, String dob, String address, String city, String stat, String county, String number, String Cell) {
		
		input(firstNamElement, firstName);
		input(lastNamElement, lastName);
		input(dobElement, dob);
		input(addressElement, address);
		input(cityElement, city);
		if(isPresent(statElement)&& isPresent(statElement)) {
			selectDropdown(statElement, stat);
		}
		if(isPresent(countyDropElement) && isDisplayed(countyDropElement)) {
			selectDropdown(countyDropElement, county);
		}
		//input(countyDropElement, county);
		input(cellularNumberElement, number);
		if(isPresent(personalElement)&&isDisplayed(personalElement)) {
			selectDropdown(personalElement, Cell);
		}
		click(nextbuttonElement);
	
	}
	
	
	
	
}
