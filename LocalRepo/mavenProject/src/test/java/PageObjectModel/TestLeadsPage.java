package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utilities.SeleniumUtility;

public class TestLeadsPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage = null;
	VtigerHomePage getVtigerHomePage = null;
	VtigerLeadsPage getVtigerLeadsPage = null;

	@BeforeTest
	public void prerequisite() {
		WebDriver driver = setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
		getVtigerLeadsPage = new VtigerLeadsPage(driver);

		getVtigerLoginPage.loginVtiger("admin", "Test@123");

		getVtigerHomePage.navigateToVtigerLeadsPage();
	}

	@Test
	public void testLeadCreation() {
		getVtigerLeadsPage.createNewLead("Ruchika", "Shipra", "7745818523");
		Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation());
	}

	@Test(dependsOnMethods = "testLeadsCreation")
	public void testLeadDeletion() {

		getVtigerLeadsPage.deleteCreatedLead();
		Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation(), "CreatedLeads is not deleted");
	}

	@AfterTest
	public void tearDown() {
		cleanUp();
	}

}
