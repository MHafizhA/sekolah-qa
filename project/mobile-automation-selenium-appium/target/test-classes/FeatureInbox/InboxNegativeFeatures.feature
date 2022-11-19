Feature: feature to test Inbox functionality
  Background: User open staging-cicle app on mobile

  @PASCA31-Negative
  Scenario: User cant delete message that already deleted
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap on sent message <Inbox Already>
    Then User unsuccesfully delete message that already deleted <Inbox>

  @PASCA32-Negative
  Scenario: Invalid manual mention user in Inbox
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap on textbox
      And User Type @Muhammd Hafizh Abdillah
      And User Tap button send <Inbox>
    Then User unsuccesfully to mention other user <Inbox>

  @PASCA36-Negative
  Scenario: User cant delete message other user
    Given User open staging-cicle on mobile <Inbox>
    When User Tap on Menu
      And User Tap on Inbox
      And User Tap on new chat
      And User Tap on user Muhammad Hafizh Abdillah
      And User Tap message other user <Inbox>
    Then User unsuccesfully delete message other user <inbox>
