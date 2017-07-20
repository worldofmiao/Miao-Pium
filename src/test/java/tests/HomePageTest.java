package tests;

import java.io.IOException;

import org.apache.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;
import ios.Driver;
import ios.OpenApp;
import ios.pages.AutomationPage;
import ios.pages.CimaPage;
import ios.pages.HomePage;
import ios.pages.PushConfirmPage;

public class HomePageTest {
	private Driver driver = new Driver();
	private OpenApp openapp;

	private AutomationPage auto = null;

	private static final Logger LOGGER = Logger.getLogger(HomePageTest.class);

	@BeforeTest
	public void Setup() {
		this.driver.startUp();
		this.openapp = new OpenApp(this.driver);
		CimaPage cima = null;
		try {
			cima = this.openapp.landToCima();
		} catch (Exception e) {
			LOGGER.error(e);
		}

		cima.inputData(cima.nameBox, "INNOVATIONS_263");
		cima.inputData(cima.passwordBox, "CoatLost8");

		PushConfirmPage push = cima.LandToPushConfirmPage();
		push.clickThings(push.continueButton);

		Common.delay(3000);
		HomePage home = new HomePage(driver);
		home.clickThings(home.allowButton);
		Common.delay(3000);
		home.clickThings(home.automationTab);

		this.auto = new AutomationPage(driver);

	}

	@Test
	public void heroDesciptionCheck() throws InterruptedException, IOException {
		Assert.assertEquals("Be reminded to arm your system at night",
				auto.heroLabel1.getText());
	}

	@Test
	public void addRuleButtonExist() {
		auto.iosScrollDown(driver);
		auto.iosScrollDown(driver);
		Assert.assertTrue(auto.addRuleButton.isDisplayed());
	}

	@AfterTest
	public void ShutDown() {
		this.driver.shutDown();
	}
}
