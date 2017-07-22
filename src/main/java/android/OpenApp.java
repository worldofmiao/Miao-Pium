package android;



import java.io.IOException;
import android.pages.CimaPage;
import org.apache.log4j.Logger;
import utils.Common;

public class OpenApp {
	private Driver driver;

	public OpenApp(Driver driver) {
		this.driver = driver;
	}

	private static final Logger LOGGER = Logger.getLogger(OpenApp.class);

	public CimaPage landToCima() throws InterruptedException, IOException {
		Common.delay(10000);

		
		return new CimaPage(driver);
	}
}
