package android;

import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Driver {
	public AndroidDriver<MobileElement> driver;
    
	public void startUp() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "My Emulator");
		cap.setCapability(MobileCapabilityType.APP,
				"/Users/mxiang001c/Downloads/xfinityhome-tps-release-8.16.5.816006.apk");
		cap.setCapability("appPackage", "com.comcast.xfinityhome.tps");
		cap.setCapability("appActivity", "com.comcast.xfinityhome.view.activity.StartupActivity");
		//cap.setCapability(MobileCapabilityType.FULL_RESET, "true");

		try {
			this.driver = new AndroidDriver<MobileElement>(new URL(
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
