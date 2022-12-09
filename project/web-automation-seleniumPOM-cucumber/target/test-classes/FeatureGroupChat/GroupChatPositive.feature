@Group-Chat-Positive
Feature: Test functionality Group Chat page
  Background: : user already login with registered account

    @WASC06-Positive-add-new-messsage
    Scenario: user can add new message in Group Chat
      Given user navigate to Group Chat page
      When user click type message here
      And user type message halo
      And user click send message button
      Then user succesfully add new message in Group Chat

#    @WASC07-Positive-delete-message
#    Scenario: user can delete messege in Group Chat
#      Given user navigate to Group Chat page
#      When user select message
#        And user click icon drop down on message
#        And user select delete message button
#        And user click button delete
#      Then user succesfully delete messsage

      @WASC13-Positive-upload-file
      Scenario: user can upload file in group chat
        Given user navigate to Group Chat page
        When user input file
        Then user succesfully attach or upload file in group chat

      @WASC14-Positive-mention-other-user
      Scenario: user can mention other user in Group Chat
        Given user navigate to Group Chat page
        When user click type message here
        And user type @ and input the user
        And user click send message button
        Then user succesfully mention other user

      @WASC15-Positive-see-profile-other-user
      Scenario: user can see profile other user after click that has mention in message
        Given user navigate to Group Chat page
        When user click message that has mention user
        Then user succesfully see other user profile


