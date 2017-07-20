package ios.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import ios.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MobilePage;

public class AutomationPage extends MobilePage{
	private IOSDriver<MobileElement> driver;

    public AutomationPage(){
    	
    }
	public AutomationPage(Driver driver) {
		this.driver = driver.driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "Be reminded to arm your system at night")
	public WebElement heroLabel1;
	
	@FindBy(name = "Add a Rule")
	public WebElement addRuleButton;
	

}
