package com.mailerlite.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I login to MailerLite")
    public void loginToMailerLite() {
        System.out.println("Logging into MailerLite");
    }

    @When("I create and send a campaign")
    public void createAndSendCampaign() {
        System.out.println("Creating and sending campaign");
    }

    @Then("I should receive the email")
    public void verifyEmailReceived() {
        System.out.println("Verifying email received");
    }

    @Given("I receive an email")
    public void receiveEmail() {
        System.out.println("Receiving an email");
    }

    @When("I click on unsubscribe")
    public void clickOnUnsubscribe() {
        System.out.println("Clicking on unsubscribe");
    }

    @Then("I should be marked as unsubscribed")
    public void verifyUnsubscribed() {
        System.out.println("Verifying unsubscribe");
    }
}
