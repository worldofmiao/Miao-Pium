package android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import android.Driver;
//import android.pages.PushConfirmPage;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MobilePage;

public class CimaPage extends MobilePage{
	private AndroidDriver<MobileElement> driver;

    public CimaPage(){
    	
    }
	public CimaPage(Driver driver) {
		this.driver = driver.driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id = "user")
	public WebElement nameBox;

	@FindBy(id = "passwd")
	public WebElement passwordBox;
    
	@FindBy(id = "sign_in")
	public WebElement signinButton;
	
	@FindBy(id = "Sign in as someone else")
	public WebElement reSignIn;
	
	

//	public PushConfirmPage LandToPushConfirmPage() {
//		PushConfirmPage push = new PushConfirmPage();
//		signinButton.click();
//		PageFactory.initElements(new AppiumFieldDecorator(driver, 10 , TimeUnit.SECONDS), push);
//		return push;
//	}
}
