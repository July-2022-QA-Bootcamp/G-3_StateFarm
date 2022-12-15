package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomeInsurencePage {
	WebDriver driver;

	public HomeInsurencePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Person_FirstName']")
	WebElement personalNamElement;
	@FindBy(xpath = "//input[@id='Person_LastName']")
	WebElement personalLastNamElement;
	@FindBy(xpath = "//input[@id='Person_DOB_Month']")
	WebElement dobMonthElement;
	@FindBy(xpath = "//input[@id='Person_DOB_Day']")
	WebElement dobDayElement;
	@FindBy(xpath = "//input[@id='Person_DOB_Year']")
	WebElement dobYearElement;
	@FindBy(xpath = "//input[@id='street_number']")
	WebElement streetAddressElement;
	@FindBy(xpath = "//input[@id='locality']")
	WebElement cityElement;
	@FindBy(xpath = "//select[@id='administrative_area_level_1']")
	WebElement stateStatElement;
	@FindBy(xpath = "//input[@id='postal_code']")
	WebElement postalCodeElement;
	@FindBy(xpath = "//button[@id='the-next-button']")
	WebElement nextButtonElement;

	public void homeInsuranceSteps(String firstName, String lastName, String month, String day, String year,
			String address, String city, String state, String postal) {
		input(personalNamElement, firstName);
		input(personalLastNamElement, lastName);
		input(dobMonthElement, month);
		input(dobDayElement, day);
		input(dobYearElement, year);
		input(streetAddressElement, address);
		input(cityElement, city);
		if (isPresent(stateStatElement) && isDisplayed(stateStatElement)) {
			selectDropdown(stateStatElement, state);
		}
		input(postalCodeElement, postal);
		click(nextButtonElement);
	}

}
