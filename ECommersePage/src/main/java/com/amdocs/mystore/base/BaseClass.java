package com.amdocs.mystore.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties properties;

	

	@AfterSuite
	public void afterSuite() {
//	  ExtentManager.endreport();

	}

	@BeforeTest
	public void loadConfig() {
		try {
			properties = new Properties();
			System.out.println("Super Constructor invoked");
			FileInputStream inputStream = new FileInputStream(
					System.getProperty("user.dir") + "//Configuration//config.properties");
			properties.load(inputStream);
			System.out.println("driver: " + driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void launchApp() {

		WebDriverManager.chromedriver().setup();
		String browserName = properties.getProperty("browser");

		if (browserName.contains("chrome"))
			driver = new ChromeDriver();
		else if (browserName.contains("FireFox"))
			driver = new FirefoxDriver();
		else if (browserName.contains("IE"))
			driver = new InternetExplorerDriver();

		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();

		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicitWait")),
				//TimeUnit.SECONDS);
	    // driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeOut")),
			//	TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));

	}
	
	public static void setUp() {
		BaseClass base = new BaseClass();
		base.loadConfig();
		BaseClass.launchApp();
	}

	
}
