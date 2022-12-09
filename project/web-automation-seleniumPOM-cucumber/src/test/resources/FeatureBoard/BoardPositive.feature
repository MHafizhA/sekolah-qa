@Board-Positive
  Feature: Test functionality board page
    Background: user already login with registered account

      @WASC01-Positive-Add-new-board-list
      Scenario: user can add new board list
        Given user navigate to board page
          When user click add list
            And user input list name
            And user click button create
          Then user succesfully add new board list

      @WASC02-Positive-Add-new-card-in-board-list
      Scenario: user can add new card in board list
        Given user navigate to board page
          When User click on icon + add new card on hafizh list
            And User type Pertemuan 1
            And User click on button check
          Then User successfully add new card

      @WASC03-Positive-Edit-title-on-card-in-board-list
      Scenario: User can Edit title card in board list
        Given user navigate to board page
          When User click on icon pencil next title card
            And User click on change name
            And User type and change pertemuan 1 to materi 1
            And User click save button
          Then User successfully update title card

      @WASC04-Positive-Add-quick-comment-on-card
      Scenario: user can add quick comment on card
        Given user navigate to board page
          When User click on icon pencil next title card
            And user click quick comment
            And user click add new comment
            And user input new comment
            And user click post
          Then user successfully add quick comment

#      @WASC05-Delete-comment-on-card
#      Scenario: user can delete comment on card
#        Given user navigate to board page
#          When user click on card materi 1
#            And user scroll to comment
#            And user click dot3 on comment
#            And user click on delete
#            And user click on delete button
#        Then user successfully delete comment