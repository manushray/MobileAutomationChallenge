package mobileAndriod.mobileAndriodChallenge.codeBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.*;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base 
{
    
	public static AppiumDriver<WebElement> driver;
	public static Properties prop;
	public static Logger log= LogManager.getLogger(Base.class);
	public static DesiredCapabilities cap = new DesiredCapabilities();
	
	public Base(){
		
		try {
			prop =new Properties();
			
			FileInputStream ip= new FileInputStream("./src/main/java/mobileAndriod/mobileAndriodChallenge/Configuration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void initialisation() throws Exception {
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Andriod Emulator");
			cap.setCapability(MobileCapabilityType.APP,prop.getProperty("App_Path"));
			driver= new AndroidDriver<WebElement>(new URL(prop.getProperty("Appium_URL")),cap);
			log.info("Code is coming in initialisation method of Base class");
			

}
	
}
