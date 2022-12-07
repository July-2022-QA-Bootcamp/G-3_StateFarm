package auto;

import org.testng.annotations.Test;

import base.BaseClass;

public class LogInTest extends BaseClass{
	
	@Test(enabled = true)
	public void logInTest01() {
		logInPage.loginSteps("saleem689@yahoo.com", "Saleem.654");
		
	}
	
	

}
