package org.ZerodhaPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGZerodha2 {
	
	private WebDriver driver;
	private ChromeOptions options;
	private LoginPage loginPage;
	private BuyStocks buyStocks;
	
	@BeforeClass
	public void openBrowser()
	{
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver(options);
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void loginZerodha() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		loginPage = new LoginPage(driver);
//		buyStocks = new BuyStocks(driver);
		loginPage.sendUserid("JN9191");
		loginPage.sendPasword("Shubhu@143");
		loginPage.clickLogin();
		loginPage.sendPin("898354");
		loginPage.clickContinue();
	}
	
  @Test
  public void firstTest() 
  {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 buyStocks = new BuyStocks(driver);
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 Assert.assertEquals(url,"https://kite.zerodha.com/");
	 boolean method1 = buyStocks.clickOrder();
	 Assert.assertTrue(method1);
	 boolean method2  = buyStocks.clickGetStarted();
	 Assert.assertTrue(method2);
	 String url2 = driver.getCurrentUrl();
	 Assert.assertEquals(url2,"https://kite.zerodha.com/orders");
	 System.out.println(url2);
  }
  
  @Test
  public void secondTest()
  {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  buyStocks = new BuyStocks(driver);
	  buyStocks.clickListFive();
	  boolean method3 = buyStocks.searchboxxx("Tata Motors");
	  Assert.assertTrue(method3);
  }
  
  @AfterMethod
  public void logOut()
  {
	  buyStocks.clickuserID();
	  buyStocks.clicklogOut();
  }
  
//  @AfterClass
//  public void closeBrowser()
//  {
//	 
//  }
}
