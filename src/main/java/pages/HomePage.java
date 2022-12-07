package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;



public class HomePage {
	
//	WebDriver driver;
//	CommonWaits waits;
	
	public HomePage(WebDriver driver) {
		//this.driver = driver;
		//waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='INSURANCE']")
	WebElement getQouteElement;
	@FindBy(xpath = "//h3[text()='Auto Insurance']")
	WebElement autoinsurElement;
	//@FindBy(xpath = "(//*[@class='WACIcon__Subtract'])[1]")
	//WebElement chatBoxElement;
	@FindBy(xpath = "(//a[normalize-space(text())='START QUOTE'])[1]")
	WebElement startQoutElement;
	@FindBy(xpath = "//select[@id='LOB-select']")
	WebElement productElement;
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zipcodElement;
	@FindBy(xpath = "//span[text()='GET MY QUOTE']")
	WebElement getQoutElement;
	
	
	
	public void qouteSteps(String product, String zipcode) {
		click(getQouteElement);
		click(autoinsurElement);
	//	click(chatBoxElement);
		click(startQoutElement);
		if(isPresent(productElement) && isDisplayed(productElement)) {
			selectDropdown(productElement, product);
		}
		
		input(zipcodElement, zipcode);
		//click(getQoutElement);
	}
	

}
