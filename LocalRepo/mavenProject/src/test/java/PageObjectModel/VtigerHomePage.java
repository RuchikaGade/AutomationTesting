package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility {
	WebDriver driver;
	public VtigerHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#appnavigator")
	private WebElement flowNavigator;
	
	@FindBy(xpath="//span[contains(text(),'MARKETING']")
	private WebElement selectMarketingOption;
	
	@FindBy(xpath="//a[@title='Leads']")
	private WebElement selectLeadsOption;
	
	@FindBy(xpath="//a[@title='Contacts']")
	private WebElement selectContactOption;
	
	public void navigateToVtigerLeadsPage() {
		clickOnElement(flowNavigator);
		clickOnElement(selectLeadsOption);
	}
	
	public void navigateToContactPage() {
		clickOnElement(flowNavigator);
		clickOnElement(selectMarketingOption);
		clickOnElement(selectContactOption);
	}
}
