package steps;

import org.testng.annotations.Test;

import base.BaseClass;

public class CustomerTest extends BaseClass {

	@Test
	
	public void customergetQoute() throws InterruptedException {
		homePage.qouteSteps("Auto", "11230");
		customerPage.customerSteps("Shaim", "Khalid", "05/19/2003", "103 Foster ave ", "Brooklyn","New York" ,"Kings", "917475364","Cell");
		
		
		
		
		
	}
	


}
