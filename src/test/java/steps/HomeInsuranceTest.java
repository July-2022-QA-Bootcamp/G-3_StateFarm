package steps;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;

public class HomeInsuranceTest extends BaseClass{

	@Test
	public void homeQouteTest() throws InterruptedException {
		homePage.qouteSteps("Home", "11230");
		homeInsurencePage.homeInsuranceSteps("Saif", "Khan", "07", "07", "2005", "243 foster ave ", "Brooklyn", "New York", "11230");
	}
	
	
	
	
}
