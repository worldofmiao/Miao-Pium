package tests;

import android.OpenApp;
import android.pages.AutomationPage;
import android.pages.CimaPage;
import android.pages.HomePage;
//import android.pages.PushConfirmPage;

import android.Driver;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Common;

public class HomePageTestAndroid {

	private Driver driver = new Driver();
	private OpenApp openapp;
	private CimaPage cima;

	private AutomationPage auto = null;

	private static final Logger LOGGER = Logger.getLogger(HomePageTest.class);

	@BeforeTest
	@Parameters({ "capconfig" })
	public void Setup(String capconfig) {
		this.driver.startUp(capconfig);
		this.openapp = new OpenApp(this.driver);
		cima = null;
		try {
			cima = this.openapp.landToCima();
		} catch (Exception e) {
			LOGGER.error(e);
		}

	}

	@Test
	public void Test() throws InterruptedException, IOException {
		if (cima.elementExist(driver, By.id("Sign in as someone else"))) {
			cima.clickThings(cima.reSignIn);
			Common.delay(4000);
		}
		cima.inputData(cima.nameBox, "INNOVATIONS_263");
		cima.inputData(cima.passwordBox, "CoatLost8");
		Common.delay(1000);
		cima.clickThings(cima.signinButton);

	}

	@AfterTest(alwaysRun = true)
	public void ShutDown() {
		Common.delay(15000);
		this.driver.shutDown();
	}
}
