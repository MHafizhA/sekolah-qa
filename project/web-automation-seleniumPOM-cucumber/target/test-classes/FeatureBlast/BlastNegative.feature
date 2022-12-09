@BlastNegative
Feature: Test functionality Blast page
  Background: user already login with registered account

    @WASC12-Negative-invalid-add-new-blast-with
    Scenario: user failed to add new blat with empty title
      Given user navigate to blast page
      When user click on create blast button
        And user empty field Type a title
        And user click publish button
      Then user failed to add new blast