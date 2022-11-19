@AllPositiveInbox
Feature: feature to test Inbox functionality
  Background: User open staging-cicle app on mobile

  @PASCA26-Positive
  Scenario: Open Inbox
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
    Then User can see inside Inbox

  @PASCA27-Positive
  Scenario: New chat in Inbox
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap on type message <Inbox>
      And User Type HalloIB
      And User Tap button SendIB
    Then User succesfully send message

  @PASCA28-Positive
  Scenario: Mention other user
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap on type message <Inbox>
      And User Tap on icon mention <Inbox>
      And User Tap on user Muhammad Hafizh AbdillahMT
      And User Tap on button send <Inbox>
    Then User succesfully mention other user <Inbox>

  @PASCA29-Positive
  Scenario: User can Delete sent message
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap on sent message <Inbox Delete>
      And User Tap on Delete <Inbox>
      And user Tap on Ok <Inbox>
    Then User succesfully delete sent message <Inbox>

  @PASCA30-Positive
  Scenario: User can select message on sent message
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap on sent message <Inbox Select>
      And User Tap on Select
      And User Tap on close
    Then User succesfully select message

