package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;
//CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='INSURANCE']")
	WebElement getQouteElement;
	@FindBy(xpath = "//h3[text()='Auto Insurance']")
	WebElement autoinsurElement;
	@FindBy(xpath = "(//button[@class='WACHeader__Button WAC__button--base WAC__button--ghost WACHeader__CloseButton'])[5]")
	WebElement chatBoxElement;
	@FindBy(xpath = "(//a[normalize-space(text())='START QUOTE'])[1]")
	WebElement startQoutElement;
	// @FindBy(id="splashContent pad-25")
	// WebElement getaQuotePageTitleElement;
	@FindBy(xpath = "//select[@id='LOB-select']")
	WebElement productElement;
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zipcodElement;
	@FindBy(xpath = "//span[text()='GET MY QUOTE']")
	WebElement getQoutElement;

	public void qouteSteps(String product, String zipcode) throws InterruptedException {
		click(getQouteElement);
		click(autoinsurElement);
		click(chatBoxElement);
		click(startQoutElement);
		// waits.waitUntilVisible(getaQuotePageTitleElement);
		// assertGetText(getaQuotePageTitleElement, expected);
		// sleep(10);
		// driver.getWindowHandle();
		windowHandles(driver);
		if (isPresent(productElement) && isDisplayed(productElement)) {
			selectDropdown(productElement, product);
		}

		input(zipcodElement, zipcode);
		click(getQoutElement);
		Thread.sleep(5000);
	}

}
