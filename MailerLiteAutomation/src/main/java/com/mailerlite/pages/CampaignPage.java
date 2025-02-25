package com.mailerlite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Create Campaign')]")
    private WebElement createCampaignButton;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement subjectField;

    @FindBy(xpath = "//input[@name='sender']")
    private WebElement senderField;

    @FindBy(xpath = "//button[contains(text(),'Send')]")
    private WebElement sendButton;

    public CampaignPage(WebDriver driver) {
        super(driver);
    }

    public void createAndSendCampaign(String subject, String sender) {
        click(createCampaignButton);
        sendText(subjectField, subject);
        sendText(senderField, sender);
        click(sendButton);
    }
}
