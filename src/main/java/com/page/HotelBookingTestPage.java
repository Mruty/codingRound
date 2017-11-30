package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.BaseTest;

public class HotelBookingTestPage extends BaseTest {
	   @FindBy(linkText = "Hotels")
	    private WebElement hotelLink;

	    @FindBy(id = "Tags")
	    private WebElement localityTextBox;

	    @FindBy(id = "SearchHotelsButton")
	    private WebElement searchButton;

	    @FindBy(id = "travellersOnhome")
	    private WebElement travellerSelection;

	    HotelBookingTestPage(){
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
