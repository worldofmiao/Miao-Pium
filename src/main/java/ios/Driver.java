package ios;

import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	public IOSDriver<MobileElement> driver;

	public void startUp() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		// cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.APP,
				"/Users/mxiang001c/Documents/XfinityHome.app");
		cap.setCapability(MobileCapabilityType.FULL_RESET, "true");

		try {
			this.driver = new IOSDriver<MobileElement>(new URL(
					"http://0.0.0.0:4723/wd/hub"), cap);
			System.out.println(driver.getPageSource());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void shutDown() {
		driver.quit();

	}
}
