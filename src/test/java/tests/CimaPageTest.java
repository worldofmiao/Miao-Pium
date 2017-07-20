package tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;
import ios.Driver;
import ios.OpenApp;
import ios.pages.CimaPage;

public class CimaPageTest {
	private Driver driver = new Driver();
    private OpenApp openapp;
    
    @BeforeTest
    public void Setup(){
    	this.driver.startUp();
    }
    
    @Test
    public void Test() throws InterruptedException, IOException {
    	this.openapp = new OpenApp(this.driver);
        CimaPage cima = this.openapp.landToCima();
        cima.inputData(cima.nameBox, "INNOVATIONS_263");
        cima.inputData(cima.passwordBox, "CoatLost8");
        cima.clickThings(cima.signinButton);
        Common.delay(10000);
    }
    
    @AfterTest
    public void ShutDown() {
        this.driver.shutDown();
    }
}
