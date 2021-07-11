package org.ZerodhaPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGZerodha1 {
	
	private ChromeOptions options;
	private WebDriver driver;
	private LoginPage loginPage;
	private BuyStocks buyStocks;
	private SoftAssert softAssert ;
	private WebDriverWait wait;
	
//	@BeforeClass
//	public void openBrowser()
//	{
//		options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//	}
	
	@BeforeMethod
	public void openZerodha()
	{
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test
	public void validLogin()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		softAssert = new SoftAssert();
//		wait = new WebDriverWait(driver,10);
		boolean send = loginPage.sendUserid("JN9191");
		softAssert.assertTrue(send);
		boolean send1 = loginPage.sendPasword("Shubhu@143");
		softAssert.assertTrue(send1);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login ']")));
		boolean click = loginPage.clickLogin();
		softAssert.assertTrue(click);
		String url = driver.getCurrentUrl();
		softAssert.assertEquals(url,"https://kite.zerodha.com/");
		System.out.println(url);
		softAssert.assertAll();
	}
	
	@Test (priority=1)
	public void validPin()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		buyStocks = new BuyStocks(driver);
		
		loginPage.sendUserid("JN9191");
		loginPage.sendPasword("Shubhu@143");
		loginPage.clickLogin();
		loginPage.sendPin("898354");
		boolean buttun1 = loginPage.clickContinue();
		Assert.assertTrue(buttun1);
		buyStocks.clickuserID();
		buyStocks.clicklogOut();
	}
	
	@AfterMethod
	public void quitTabs()
	{
		driver.quit();
	}
	
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.close();
//	}
	
  
}
