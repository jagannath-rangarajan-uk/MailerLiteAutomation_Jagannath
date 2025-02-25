package com.mailerlite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriberPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Unsubscribed')]")
    private WebElement unsubscribedStatus;

    public SubscriberPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSubscriberUnsubscribed() {
        return unsubscribedStatus.isDisplayed();
    }
}
