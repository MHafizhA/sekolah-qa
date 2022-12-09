@board
Feature: test functionality login
  Background: user already have registired account


    @TC01-Login
    Scenario: verify succes login when user entered valid an account
      Given user navigate to staging cicle
        When user click google login button
          And user input google email field
          And User click google after email button
          And user input password google
          And user click google after password button
        Then user succesfully login




