package org.ZerodhaPack;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyStocks {
	
	private WebDriver driver;
	
	@FindBy (xpath = "(//li[@class='item'])[4]")
	private WebElement ListNo5;
	
	@FindBy ( xpath = "(//span[text()='Orders'])[1]")
	private WebElement order;
	
	@FindBy ( xpath = "//button[text()='Get started ']")
	private WebElement getStarted;
	
	@FindBy ( xpath = "(//li[@class='item'])[4]")
	private WebElement listFive;
	
	@FindBy ( xpath = "//input[@id='search-input']")
	private WebElement searchBox;
	
	@FindBy ( xpath = "(//span[text()='TATAMOTORS'])[1]")
	private WebElement tataMotors;
	
	
	@FindBy ( xpath = "//span[@class='user-id']")
	private WebElement userID;
	
	@FindBy ( xpath = "//a[text()=' Logout']")
	private WebElement logOut;
	
	
	public BuyStocks(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean clickOrder()
	{
		boolean result = order.isDisplayed();
		order.click();
		return result;
	}
	
	public boolean clickGetStarted()
	{
		boolean result2 = getStarted.isEnabled();
		return result2;
	}
	
	public void clickListFive()
	{
		listFive.click();
	}
	
	public boolean searchboxxx(String abs)
	{
		boolean result3 = searchBox.isDisplayed();
		searchBox.clear();
		searchBox.sendKeys(abs);
		return result3;
	}
	
	
	
	public void clickuserID()
	{
		userID.click();
	}
	
	public void clicklogOut()
	{
		logOut.click();
	}

}
