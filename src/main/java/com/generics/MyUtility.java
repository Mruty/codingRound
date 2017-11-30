package com.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MyUtility {
	
	 public static void waitFor(int durationInMilliSeconds) {
	        try {
	            Thread.sleep(durationInMilliSeconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	        }
	    }

	    public static void setDriverPath(String platform) {
	        if (platform.equalsIgnoreCase("Mac")) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver");
	        }
	        if (platform.equalsIgnoreCase("Windows")) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        }
	        if (platform.equalsIgnoreCase("Linux")) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	        }
	    }
	    
	    public static boolean isElementPresent(By by,WebDriver driver) {
	        try {
	            driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
}
