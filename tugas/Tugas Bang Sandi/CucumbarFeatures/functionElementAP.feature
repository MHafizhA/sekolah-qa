Feature: create function element
  Background: user open http://automationpractice.com/index.php

  Scenario: user use function Behavior and Interaction
    Given user open page home <automatioinPractice>
    When user click button menu t shirt
      And user click button back
      And user click button forward
      And user click button refresh


  Scenario: user use Function Element
    Given user open page <automationPractice2> t shirt
    When user click checkbox catalog SIZE S
    Then user see t-shirt SIZE S
    When user click dropdown Sort By
    Then user see list Sort By