@BlastPositive
  Feature: Test functionality Blast page
    Background: user already login with registered account

      @WASC08-Positive-add-new-blast
      Scenario: user can create new blast
        Given user navigate to blast page
        When user click on create blast button
          And user click on Type a title field
          And user type title blast
          And user click on Tell your story here
          And user type Tell your story here
          And user click button publish
        Then user successfully add new blast

      @WASC09-Positive-user-can-open-sent-blast
      Scenario: user can open sent blast
        Given user navigate to blast page
        When user click on sent post blast
        Then user succesfully open blast

      @WASC10-Positive-edit-title-and-description-sent-post-Blast
      Scenario: user can edit title & description post Blast
        Given user navigate to blast page
        When user click on sent post blast
          And user click on dot 3 button
          And user click on icon edit
          And user click title blast
          And user type and change title blast
          And user click on save Changes button
        Then user succesfully edit title blast

      @WASC11-Positive-add-new-comment-in-post-blast
      Scenario: user can add new comment in post blast
        Given user navigate to blast page
        When user click on sent post blast
          And user click add new comment in post blast
          And user type comment
          And user click button post
        Then user succesfully add new comment in post blast

      @WASC16-Positive-delete-comment-in-post-blast
      Scenario: user can delete comment in post blast
        Given user navigate to blast page
        When user click on sent post blast comment
          And user click on sent comment dot 3
          And user select delete icon
          And user click delete button
        Then user succesfully delete comment in sent post blast
