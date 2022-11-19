Feature: feature to test Group Chat functionality
  Background: User open staging-cicle app on mobile

    @PASCA21-Positive
      Scenario: User can open Group Chat menu
        Given User open staging-cicle on mobile <Group Chat>
        When User Tap on Sekolah QA in Team menu <Group Chat>
          And User Tap on Group Chat menu
        Then User can see inside Group Chat menu

    @PASCA22-Positive
      Scenario: User can add new message in Group Chat
        Given User open staging-cicle on mobile <Group Chat>
        When User Tap on Sekolah QA in Team menu <Group Chat>
          And User Tap on Group Chat menu
          And User Tap on type message
          And User type Hallo
          And User Tap on button send
        Then user succesfully send message

    @PASCA23-Positive
      Scenario: User can mention other user in Group Chat
        Given User open staging-cicle on mobile <Group Chat>
        When User Tap on Sekolah QA in Team menu <Group Chat>
          And User Tap on Group Chat menu
          And User Tap on type message <Group Chat>
          And User Tap on icon mention <Group Chat>
          And User Tap on user Hafizh Abdillah
          And User Tap on button send
        Then User succesfully mention other user

    @PASCA24-Positive
      Scenario: User can delete sent message in Group Chat
        Given User open staging-cicle on mobile <Group Chat>
        When User Tap on Sekolah QA in Team menu <Group Chat>
          And User Tap on Group Chat menu
          And User Tap on sent message
          And User Tap on Delete
          And user Tap on Ok
        Then User succesfully delete sent message

    @PASCA25-Positive
      Scenario: User can change or move to menu or feature in Group chat
        Given User open staging-cicle on mobile <Group Chat>
        When User Tap on Sekolah QA in Team menu <Group Chat>
          And User Tap on Group Chat menu
          And User Tap on DropDown Group Chat
          And User Tap on Blast
        Then User succesfully change or move to Blast