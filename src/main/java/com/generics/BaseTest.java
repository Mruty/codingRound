package com.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod
	public void setUp(){
		MyUtility.setDriverPath("Windows");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		wait =new WebDriverWait(driver, 20);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
