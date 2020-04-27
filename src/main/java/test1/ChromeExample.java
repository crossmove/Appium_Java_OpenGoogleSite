package test1;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class ChromeExample {

	//Any of the below code works fine
	//static AppiumDriver<MobileElement> appDriver;	
	static WebDriver driver;
		
	@Test
	public static void OpenChromeBrowser() throws Exception {				
		
		//Start appium server
		
		//Install TestNG
		//https://www.techbeamers.com/install-testng-in-eclipse-ide/#method3
		
		//How to Run
		//Right click inside any test methods --> Run as --> TestNG Test
		
		
		/*ChromeOptions chrome_options = new ChromeOptions();		
		chrome_options.addArguments("--disable-infobars");*/
				
		/*chrome_options.addArguments(
		   "--verbose",
		   //"--headless",
		   "--disable-web-security",
		   "--ignore-certificate-errors",
		   "--allow-running-insecure-content",
		   "--allow-insecure-localhost",
		   "--no-sandbox",
		   "--disable-gpu",
		   "-incognito",
		   "--allow-file-access-from-files"
		  );
		*/
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1920");
		cap.setCapability(MobileCapabilityType.UDID, "575b6cf1");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("chromedriverExecutableDir", "D:\\picx\\81");
		cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		
		//cap.setCapability(ChromeOptions.CAPABILITY,chrome_options);		
		//cap.setCapability("appium:chromeOptions", "{args: ['--disable-popup-blocking']}");			
		//cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");		
		//https://chromedriver.storage.googleapis.com/index.html?path=81.0.4044.69/
		// Should Match the mobile chrome browser version			
		//cap.setCapability("showChromedriverLog", True);		
		//i am facing some issue to change language
		//cap.setCapability("language", "en"); 
		//cap.setCapability("locale", "en_US");
			         
		URL url = new URL("http://127.0.0.1:4723/wd/hub");		
		driver = new AppiumDriver<MobileElement>(url,cap);		
		System.out.print("Opened Chrome Browser");
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	    driver.findElement(By.xpath("//div[@id='divUsername']/span")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("pradeepkumar");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");		
	}

}
