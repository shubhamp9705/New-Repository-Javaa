package org.ZerodhaPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//input[@id='userid']")
	private WebElement Userid;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//button[text()='Login ']")
	private WebElement Login;
	
	@FindBy (xpath = "//input[@id='pin']")
	private WebElement Pin;
	
	@FindBy (xpath = "//button[text()='Continue ']")
	private WebElement Continue;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean sendUserid(String userid)
	{
		Userid.sendKeys(userid);
		boolean result = Userid.isDisplayed();
		return result;
	}
	
	public boolean sendPasword(String password)
	{
		Password.sendKeys(password);
		boolean result1 = Password.isDisplayed();
		return result1;
	}
	
	public boolean clickLogin()
	{
		Boolean result2 = Login.isEnabled();
		Login.click();
		return result2;
	}
	
	public void sendPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	public boolean clickContinue()
	{
		boolean button = Continue.isEnabled();
		Continue.click();
		return button;
	}
	
	

}
