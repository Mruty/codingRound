package com.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generics.BaseTest;
import com.generics.MyUtility;

public class SignInTest extends BaseTest{

 

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
        MyUtility.waitFor(2000);

        driver.findElement(By.linkText("Your trips")).click();
        driver.findElement(By.id("SignIn")).click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("signInButton"))).click();
       

        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
    }

}
