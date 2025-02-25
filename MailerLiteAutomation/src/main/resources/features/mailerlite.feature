Feature: MailerLite Email Automation

  Scenario: Send a campaign and verify email
    Given I login to MailerLite
    When I create and send a campaign
    Then I should receive the email

  Scenario: Unsubscribe from an email
    Given I receive an email
    When I click on unsubscribe
    Then I should be marked as unsubscribed