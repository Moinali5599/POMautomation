package com.datadriven.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUI {
	public WebDriver driver;
	public Properties prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Documents\\CTS Internship\\AutomationWS\\DatadrivenFramework\\src\\test\\resources\\data_for_tests\\testdata.properties");
	public void invokeBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	public void tearDown() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void enterText(String xpath, String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}
	
	public void elementClick(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

}
