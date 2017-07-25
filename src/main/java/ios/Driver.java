package ios;

import java.net.URL;
import java.util.Properties;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

import utils.Common;

public class Driver {
	public IOSDriver<MobileElement> driver;

	public void startUp(String capconfig) {
		DesiredCapabilities cap = new DesiredCapabilities();

		System.out.println(capconfig);
		Common common = new Common();
		Properties prop = common.loadProperty(capconfig);

		String platformName = prop.getProperty("platformName");
		String platformVersion = prop.getProperty("platformVersion");
		String deviceName = prop.getProperty("deviceName");
		String automationName = prop.getProperty("automationName");
		String app = prop.getProperty("app");

		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				platformVersion);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
		cap.setCapability(MobileCapabilityType.APP, app);
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
