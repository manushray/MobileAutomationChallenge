package mobileAndriod.mobileAndriodChallenge.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileAndriod.mobileAndriodChallenge.codeBase.Base;

public class App extends Base {

	@AndroidFindBy(id="txtNota1")
	WebElement FirstTextBoxInput;
	
	@AndroidFindBy(id="txtNota2")
	WebElement SecondTextBoxInput;
	
	@AndroidFindBy(id="txtNota3")
	WebElement ThirdTextBoxInput;
	
	@AndroidFindBy(id="btnCalcular")
	WebElement Calcbtn;
	
	@AndroidFindBy(id="txtMediaFinal")
	WebElement MedianValue;
	
	
	
	//Initializing the Page Object
	public App(AppiumDriver<WebElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		log.info("Code is coming in Constructor method of App class");
	}


	
	//App method passing input and clicking on calculate button
	public String calcliMethod(String firstNmb, String secNmb, String ThdNmb ) throws Exception {
		log.info("Code is coming in calciMethod of App class");
		FirstTextBoxInput.sendKeys(firstNmb);
		
		SecondTextBoxInput.sendKeys(secNmb);
		
		ThirdTextBoxInput.sendKeys(ThdNmb);
		
		Thread.sleep(200);
		Calcbtn.click();
		return MedianValue.getText();
	}
	
}
