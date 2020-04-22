package test1;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.awt.event.KeyEvent;
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


public class OpenIndiaDotComWebsite {

	//Any of the below code works fine
	//static AppiumDriver<MobileElement> appDriver;	
	static WebDriver appDriver;
		
	@Test
	public static void OpenChromeBrowser() throws Exception {				
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-incognito");
		options.addArguments("--disable-popup-blocking");

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1920");
		cap.setCapability(MobileCapabilityType.UDID, "575b6cf1");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("chromedriverExecutableDir", "D:\\picx\\74");
		cap.setCapability(ChromeOptions.CAPABILITY,options);
		
		cap.setCapability("unicodeKeyboard", "true");                                     
		cap.setCapability("resetKeyboard", "true");
		
		//cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
				
		
		//cap.setCapability("language", "en");
		//cap.setCapability("locale", "en_IN");
		      
		URL url = new URL("http://127.0.0.1:4723/wd/hub");		
		appDriver = new AppiumDriver<MobileElement>(url,cap);		
		System.out.print("Opened Chrome Browser");
		
		
		
		
		appDriver.get("https://www.india.com");	
		Thread.sleep(2000);
					
		//WebElement elem1 = appDriver.findElement(By.id("android:id/button1"));
		
		//elem1.click();
		
		WebElement elem2 = appDriver.findElement(By.linkText("SPORTS"));
		
		
		elem2.click();
		//WebElement elem1 = appDriver.findElement(By.name("q"));  this code also works fine
		//elem.sendKeys("learn");
		//elem.sendKeys(Keys.ENTER);				
	}

}
