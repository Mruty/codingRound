package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HotelBookingTestPage  {
	   @FindBy(linkText = "Hotels")
	    private WebElement hotelLink;

	    @FindBy(id = "Tags")
	    private WebElement localityTextBox;

	    @FindBy(xpath = ".//*[@id='SearchHotelsButton']")
	    private WebElement searchButton;

	    @FindBy(id = "travellersOnhome")
	    private WebElement travellerSelection;

	   public  HotelBookingTestPage(WebDriver driver){
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public WebElement hotelLink(){
	    	return hotelLink;
	    }
	    public WebElement localityTextBox(){
	    	return localityTextBox;
	    }
	    public WebElement searchButton(){
	    	return searchButton;
	    }
	    public WebElement travellerSelection(){
	    	return travellerSelection;
	    }
}
