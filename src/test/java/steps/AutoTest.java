package steps;

import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass{

	@Test
	public void qouteSteps() throws InterruptedException {
		homePage.qouteSteps("Auto", "11230");
	}
	
	
}


