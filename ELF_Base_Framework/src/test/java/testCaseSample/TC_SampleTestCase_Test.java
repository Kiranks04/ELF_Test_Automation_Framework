package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.TroubleTickets_Page;
import org.testng.annotations.Test;
public class TC_SampleTestCase_Test extends Base_Test{
	
	@Test
	public void sample() throws InterruptedException {
		homePage.getCustomerProfileLink(emailId).click();
		TroubleTickets_Page trouble=new TroubleTickets_Page(driver);
	
	}
}