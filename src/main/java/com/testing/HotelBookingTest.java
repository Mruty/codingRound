package com.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.generics.BaseTest;
import com.generics.MyUtility;
import com.page.HotelBookingTestPage;

public class HotelBookingTest extends BaseTest {

   
    @Test
    public void shouldBeAbleToSearchForHotels() {

    	HotelBookingTestPage p=new HotelBookingTestPage(driver);
    	p.hotelLink().click();
    	p.localityTextBox().sendKeys("Indiranagar, Bangalore");
    	MyUtility.waitFor(2000);
    	driver.findElement(By.xpath("//a[.='Indiranagar, Bangalore Karnataka, India']")).click();
        new Select(p.travellerSelection()).selectByVisibleText("1 room, 2 adults");
        MyUtility.waitFor(2000);
        p.searchButton().click();
       

    }

   

}
