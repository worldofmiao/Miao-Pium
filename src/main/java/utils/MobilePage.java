package utils;

import io.appium.java_client.ios.IOSDriver;
import ios.Driver;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MobilePage {
	public void inputData(WebElement we, String data) {
		we.sendKeys(data);
	}

	public void clickThings(WebElement we) {
		we.click();
	}

	public void iosScrollDown(Driver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver.driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}
}
