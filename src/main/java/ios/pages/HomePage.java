package ios.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import ios.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Common;
import utils.MobilePage;

public class HomePage extends MobilePage {
	private IOSDriver<MobileElement> driver;

    public HomePage(){
    	
    }
	public HomePage(Driver driver) {
		this.driver = driver.driver;
		PageFactory.initElements(this.driver, this);
	}
	
//	@FindBy(name = "Automation")
//	public WebElement automationTab;
	
	@FindBy(name = "Allow")
	public WebElement allowButton;
	
	@FindBy(name = "Automation")
	public WebElement automationTab;
	
//	Common.delay(6000);
//    WebElement allow = driver.findElement(By.name("Allow"));
//    allow.click();

}
