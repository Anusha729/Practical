package AppiumOurkids.Practical;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base 
{
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException
	{
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/global.properties");
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/locators.properties");
		
		
		Properties prop = new Properties();
		prop.load(fis);
		prop.load(fis1);
		
		AndroidDriver<AndroidElement> android;
		
		File appDir = new File("src");
		File app = new File(appDir,(String)prop.get(appName));
		DesiredCapabilities capabilities = new  DesiredCapabilities();
		String device = (String) prop.get("device");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.UDID, device);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability("app", app.getAbsolutePath());
		URL appiumURL = new URL("http://0.0.0.0:4723/wd/hub");
		android = new AndroidDriver(appiumURL, capabilities);
		Thread.sleep(5000);
		return android;
	}

}
