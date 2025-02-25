package com.mailerlite.tests;

import com.mailerlite.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UnsubscribeTest {

    WebDriver driver;
    EmailPage emailPage;
    SubscriberPage subscriberPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("email-client-url"); // Replace with actual email client URL
        emailPage = new EmailPage(driver);
        subscriberPage = new SubscriberPage(driver);
    }

    @Test
    public void verifyUnsubscription() {
        emailPage.unsubscribe("Not interested");
        Assert.assertTrue(subscriberPage.isSubscriberUnsubscribed(), "User unsubscribed successfully!");
    }
}
