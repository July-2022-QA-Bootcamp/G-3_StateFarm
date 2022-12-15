package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class LogInPage {

	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "desktop-login-button")
	WebElement logInBtnElement;
	@FindBy(xpath = "//input[@id='username']")
	WebElement userNamElement;
	@FindBy(xpath = "//input[@id='password']")
	WebElement userPasswordElement;
	@FindBy(xpath = "(//a[@id='signInBtn'])[1]")
	WebElement lohInButtonElement;

	public void loginSteps(String userName, String Password) {
		click(logInBtnElement);
		input(userNamElement, userName);
		input(userPasswordElement, Password);
		click(lohInButtonElement);
	}

}
