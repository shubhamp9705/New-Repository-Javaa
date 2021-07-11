package org.ZerodhaPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	
private WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	
	
	
//  @Test
//  public void f() {
//  }
}
