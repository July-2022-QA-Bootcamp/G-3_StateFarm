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
	@FindBy(xpath = "(//*[@class='WACIcon__Subtract'])[1]")
	WebElement chatBoxElement;
	@FindBy(xpath = "(//a[normalize-space(text())='START QUOTE'])[1]")
	WebElement startQoutElement;
	
	
	
	public void qouteSteps() {
		click(getQouteElement);
		click(autoinsurElement);
		click(chatBoxElement);
		click(startQoutElement);
	}
	

}
