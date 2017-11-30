package com.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

	public WebDriver driver;
	@BeforeMethod
	public void setUp(){
		MyUtility.setDriverPath("Windows");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
