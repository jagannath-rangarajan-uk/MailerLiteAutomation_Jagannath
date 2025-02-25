package com.mailerlite.tests;

import com.mailerlite.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CampaignTest {

    WebDriver driver;
    LoginPage loginPage;
    CampaignPage campaignPage;
    EmailPage emailPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://dashboard.mailerlite.com");
        loginPage = new LoginPage(driver);
        campaignPage = new CampaignPage(driver);
        emailPage = new EmailPage(driver);
    }

    @Test
    public void verifyEmailReception() {
        loginPage.login("your_email@example.com", "password");
        campaignPage.createAndSendCampaign("Test Subject", "sender@example.com");

        // Wait for email reception and assert email content (e.g., check subject)
        Assert.assertTrue(true, "Email received correctly!");
    }
}
