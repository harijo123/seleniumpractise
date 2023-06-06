  package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
    	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Karthikraja\\eclipse-workspace\\SeliniumBrowserLaunch\\Driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
		//to launch the browser and load the url
		driver.get("https://www.facebook.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to get the web title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get current url
		String currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         
         //to close the browser
         driver.close();
	}

}
