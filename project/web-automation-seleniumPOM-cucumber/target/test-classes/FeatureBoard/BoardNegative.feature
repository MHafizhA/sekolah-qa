@Board-Negative
Feature: Test functionality board page
  Background: user already login with registered account

    @WASC17-Negative-Invalid-add-new-board-list
    Scenario: Invalid add new board list with empty title
      Given user navigate to board page
      When user click add list
      And user empty list name
      And user click button create
      Then user failed to add new board list