package utils;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

	

public class Common {
	
	private static final Logger LOGGER = Logger.getLogger(Common.class);
	/**
	 * Method to add a delay to current process
	 *
	 * @param int: number of milliseconds of delay
	 *
	 */
	public static void delay(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			LOGGER.error(e);
		}
	}
	/**
	 * Method to read file into a String
	 * @param String: a file's path inside project
	 * 
	 * @return String: file contents as a string
	 */
	public static String readFile(String path){
		String content = "";
		
		try {
			content = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error(e);
		}
		return content;
	}
}
