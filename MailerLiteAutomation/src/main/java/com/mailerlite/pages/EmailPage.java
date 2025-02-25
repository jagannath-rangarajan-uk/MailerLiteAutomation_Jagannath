package com.mailerlite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Unsubscribe')]")
    private WebElement unsubscribeLink;

    @FindBy(xpath = "//textarea[@name='reason']")
    private WebElement reasonField;

    @FindBy(xpath = "//button[contains(text(),'Finish Unsubscribing')]")
    private WebElement finishUnsubscribeButton;

    public EmailPage(WebDriver driver) {
        super(driver);
    }

    public void unsubscribe(String reason) {
        click(unsubscribeLink);
        sendText(reasonField, reason);
        click(finishUnsubscribeButton);
    }
}
