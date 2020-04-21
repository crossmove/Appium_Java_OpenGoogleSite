package test1;
import org.testng.annotations.Test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Calculatortt {

	static AppiumDriver<MobileElement> appDriver;
		
	@Test
	public static void OpenCalculator() throws Exception {				
		
		//Install TestNG
		//https://www.techbeamers.com/install-testng-in-eclipse-ide/#method3
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1920");
		cap.setCapability(MobileCapabilityType.UDID, "575b6cf1");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		//https://chromedriver.storage.googleapis.com/index.html?path=81.0.4044.69/
		// Should Match the mobile chrome browser version
		cap.setCapability("chromedriverExecutableDir", "D:\\picx");
		//cap.setCapability("language", "en"); 
		//cap.setCapability("locale", "en_US");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");		
		appDriver = new AppiumDriver<MobileElement>(url,cap);		
		System.out.print("Starting Calculator app");
		
		appDriver.get("https://www.gmail.com");
		appDriver.findElement(By.name("q")).sendKeys("Mobile");
				
		System.out.println("---------------Opened Chrome Browser --------: ");
				
	}

}
