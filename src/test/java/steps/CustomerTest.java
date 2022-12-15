package steps;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import base.BaseClass;

public class CustomerTest extends BaseClass {

	@Test(enabled = false)
	public void customergetQoute() throws InterruptedException {
		homePage.qouteSteps("Auto", "11230");
		customerPage.customerSteps("Shaim", "Khalid", "05/19/2003", "103 Foster ave ", "Brooklyn", "New York", "Kings",
				"917475364", "Cell");

	}

	@Parameters({ "Auto", "zipcode", "firstName", "lastName", "dob", "address", "city", "state", "county", "cellNumber",
			"contact" })
	@Test(enabled = true)
	public void customergetQouteParameterized(String auto, String zipcode, String firstName, String lastName,
			String dob, String address, String city, String state, String county, String cellNumber, String contact)
			throws InterruptedException {
		homePage.qouteSteps(auto, zipcode);
		customerPage.customerSteps(firstName, lastName, dob, address, city, state, county, cellNumber, contact);

	}

}
