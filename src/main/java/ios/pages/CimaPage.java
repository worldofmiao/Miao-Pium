package ios.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import ios.Driver;
import utils.MobilePage;

public class CimaPage implements MobilePage {
	private IOSDriver<MobileElement> driver;

	public CimaPage() {
	}

	public CimaPage(Driver driver) {
		this.driver = driver.driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
	public WebElement nameBox;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField")
	public WebElement passwordBox;

	@FindBy(name = "Sign In")
	public WebElement signinButton;

	public void inputData(WebElement we, String data) {
		we.sendKeys(data);
	}

	public void clickThings(WebElement we) {
		we.click();
	}

}
