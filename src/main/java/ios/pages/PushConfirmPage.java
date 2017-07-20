package ios.pages;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import ios.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Common;
import utils.MobilePage;

public class PushConfirmPage extends MobilePage {
	private IOSDriver<MobileElement> driver;

    public PushConfirmPage(){
    	
    }
	public PushConfirmPage(Driver driver) {
		this.driver = driver.driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "We'd like to send you push notifications")
	public WebElement pushLabel;

	@FindBy(name = "Continue")
	public WebElement continueButton;
	
//	public HomePage LandToHomePage() {
//		HomePage home = new HomePage();
//		continueButton.click();
//        Common.delay(5000);
//		PageFactory.initElements(new AppiumFieldDecorator(driver, 10 , TimeUnit.SECONDS), home);
//		return home;
//	}
}
