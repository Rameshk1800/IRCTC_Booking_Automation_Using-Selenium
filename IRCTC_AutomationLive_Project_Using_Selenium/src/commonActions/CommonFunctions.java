package commonActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	
	public static Properties properties=null;
	public static WebDriver driver;
	public static ChromeOptions option;
	public static FirefoxOptions options;
	
	Logger logger = Logger.getLogger(CommonFunctions.class);
	
	public Properties loadproperties() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("ConfigFile.properties");
		 properties= new Properties();
		properties.load(fileInputStream);
		
		return properties;		
	}
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Railway Booking Automation Test LiveProject");
		logger.info("Loding The Propertie File");
		loadproperties();	
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverLocation=properties.getProperty("driverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			logger.info("Launching Chrome Browser");
			System.setProperty("webdriver.chrome.driver", driverLocation);
			ChromeOptions option =new ChromeOptions();
			option.addArguments("disable-notifications");
			
			driver = new ChromeDriver(option);
			 
		}else if(browser.equalsIgnoreCase("firefox")) {
			logger.info("Launching FireFox Browser");
			System.setProperty("webdriver.gecko.driver", driverLocation);
			FirefoxOptions options= new FirefoxOptions();
			options.addArguments("disable-notifications");
			driver=new FirefoxDriver();
		}
		
		logger.info("Maximizing the Browser");
		driver.manage().window().maximize();
		logger.info("getting Into The URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	@AfterSuite
	public void tearDown() {
		logger.info("Execution Done And Closing The Browser");
		driver.quit();
	}
}
