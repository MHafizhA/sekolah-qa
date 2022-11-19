Feature: feature to test Group Chat functionality
  Background: User open staging-cicle app on mobile

  @PASCA33-Negative
  Scenario: User cant delete message that already deleted
    Given User open staging-cicle on mobile <Group Chat>
    When User Tap on Sekolah QA in Team menu <Group Chat>
      And User Tap on Group Chat menu
      And user Tap on sent message that already deleted
    Then User unsuccesfully delete message that already deleted

  @PASCA34-Negative
  Scenario: Invalid manual mention user in Group Chat
    Given User open staging-cicle on mobile <Group Chat>
    When User Tap on Sekolah QA in Team menu <Group Chat>
      And User Tap on Group Chat menu
      And User Tap on textboxt
      And User Type @Hafizh Abdillah
      And User Tap button send
    Then User unsuccesfully to mention other user

  @PASCA35-Negative
  Scenario: User cant delete message other user
    Given User open staging-cicle on mobile <Group Chat>
    When User Tap on Sekolah QA in Team menu <Group Chat>
      And User Tap on Group Chat menu
      And User Tap message other user
    Then User unsuccesfully delete message other user


