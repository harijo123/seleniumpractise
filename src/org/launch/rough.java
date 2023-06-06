package org.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {
	
	WebDriver driver = new ChromeDriver();
	public void screenshot(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Karthikraja\\eclipse-workspace\\SeliniumBrowserLaunch\\hari.png");
		FileUtils.copyFile(file, d);
	}

}
