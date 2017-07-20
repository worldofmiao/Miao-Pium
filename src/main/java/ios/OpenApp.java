package ios;

import java.io.IOException;
import ios.pages.CimaPage;
import org.apache.log4j.Logger;
import utils.Common;

public class OpenApp {
	private Driver driver;

	public OpenApp(Driver driver) {
		this.driver = driver;
	}

	private static final Logger LOGGER = Logger.getLogger(OpenApp.class);

	public CimaPage landToCima() throws InterruptedException, IOException {
		Thread.sleep(5000);

		String command = Common
				.readFile("src/main/resources/ios-allow-script.txt");
		String[] cmd = { "osascript", "-e", command };
		Process proc = Runtime.getRuntime().exec(cmd);

		proc.waitFor();
		return new CimaPage(driver);
	}

	// @Test
	public void testRead() {
		String x = Common.readFile("src/main/resources/ios-allow-script.txt");
		LOGGER.debug(x);
	}

}
