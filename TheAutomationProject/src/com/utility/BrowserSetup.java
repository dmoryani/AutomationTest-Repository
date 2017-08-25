/**
 * 
 */
package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author Divya
 * 
 */
public class BrowserSetup extends ConfigReader {
	public static WebDriver driver;
	protected static WebDriverWait wait;

	@BeforeSuite
	public void openChromeBrowser() {
		
		System.setProperty(getDriverValue(), getDriverPath());
	
		// Initialize browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 120);
		openUrl();
	}

	
	public void closeBrowser() {
		driver.close();
	}
	@AfterSuite(alwaysRun = true)
	public void quitBrowser() {
		//driver.quit();
	}

	public void openUrl() {
		driver.get(getUrl());
	}

}
