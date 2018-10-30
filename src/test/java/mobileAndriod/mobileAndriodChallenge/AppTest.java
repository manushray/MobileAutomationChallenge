package mobileAndriod.mobileAndriodChallenge;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mobileAndriod.mobileAndriodChallenge.Pages.App;
import mobileAndriod.mobileAndriodChallenge.codeBase.Base;

@Listeners(mobileAndriod.mobileAndriodChallenge.ExtentReportListener.ExtentReportNG.class)
public class AppTest extends Base
{
	static App app;

    public AppTest( )
    {
        super();
        log.info("Code is coming in Constructor method of AppTest class");
    }
    
    @BeforeMethod
    public static void setup() throws Exception {
    	initialisation();
    	 app =new App(driver);
    	 log.info("Code is coming in Before method of AppTest class");
    }
    
    @Test(priority=1)
    public static void firstScenarioTestMethod() throws Exception {
  
    	String MedValue=app.calcliMethod(prop.getProperty("1st_1stScenario_input_Number"),prop.getProperty("2nd_1stScenario_input_Number"),prop.getProperty("3rd_1stScenario_input_Number"));
    	float valuefrommainmethod= Float.valueOf(MedValue);
    	float value= (Float.valueOf(prop.getProperty("1st_1stScenario_input_Number"))+Float.valueOf(prop.getProperty("2nd_1stScenario_input_Number"))+Float.valueOf(prop.getProperty("3rd_1stScenario_input_Number")))/3;
    	log.info("Code is coming in 1st Test Scenario of App class");
    	log.info("Value of Median Value return from main code in 1st Test Scenario is:"+valuefrommainmethod);
    	Assert.assertEquals(valuefrommainmethod, value);
    	
    }
    
    @Test(priority=2)
    public static void secondScenarioTtestMethod() throws Exception {
  
    	String MedValue=app.calcliMethod(prop.getProperty("1st_2ndScenario_input_Number"),prop.getProperty("2nd_2ndScenario_input_Number"),prop.getProperty("3rd_2ndScenario_input_Number"));
    	float valuefrommainmethod= Float.valueOf(MedValue);
    	float value= (Float.valueOf(prop.getProperty("1st_2ndScenario_input_Number"))+Float.valueOf(prop.getProperty("2nd_2ndScenario_input_Number"))+Float.valueOf(prop.getProperty("3rd_2ndScenario_input_Number")))/3;
    	log.info("Code is coming in 2nd Test Scenario of AppTest class");
    	log.info("Value of Median Value return from main code in 2nd Test Scenario is:"+valuefrommainmethod);
    	Assert.assertEquals(valuefrommainmethod, value);
    	
    }
    
    @Test(priority=3)
    public static void thirdScenarioTtestMethod() throws Exception {
   
    	String MedValue=app.calcliMethod(prop.getProperty("1st_3rdScenario_input_Number"),prop.getProperty("2nd_3rdScenario_input_Number"),prop.getProperty("3rd_3rdScenario_input_Number"));
    	float valuefrommainmethod= Float.valueOf(MedValue);
    	float value= (Float.valueOf(prop.getProperty("1st_3rdScenario_input_Number"))+Float.valueOf(prop.getProperty("2nd_3rdScenario_input_Number"))+Float.valueOf(prop.getProperty("3rd_3rdScenario_input_Number")))/3;
    	log.info("Code is coming in 3rd Test Scenario of AppTest class");
    	log.info("Value of Median Value return from main code in 3rd Test Scenario is:"+valuefrommainmethod);
    	Assert.assertEquals(valuefrommainmethod, value);
    	
    }
    
    @AfterMethod
    public static void tearDown(ITestResult result) {
    	log.info("Code is coming in After method of AppTest class");
    	driver.quit();
    }
    
    
  
}
