@Group-Chat-Negative
Feature: Test functionality Group Chat page
  Background: : user already login with registered account

    @WASC18-Negative-invalid-add-new-message
    Scenario: invalid add new message with empty message
      Given user navigate to Group Chat page
      When user click send message button
      Then user failed to add new message in group chat
