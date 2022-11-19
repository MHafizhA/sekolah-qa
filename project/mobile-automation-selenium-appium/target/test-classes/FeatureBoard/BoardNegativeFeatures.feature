@AllNegativeBoard
Feature: feature to test Board functionality
  Background: User open staging-Cicle app on Mobile

  @PASCA06-Negative
  Scenario: Invalid add Board list
    Given User open staging-cicle on mobile
    When User Tap on Sekolah QA in Team menu
      And User Tap on Board menu
      And User Tap on icon +
      And User Tap on button submit+
    Then user can't add new board

  @PASCA07-Negative
  Scenario: Invalid add card in Board list
    Given User open staging-cicle on mobile
    When User Tap on Sekolah QA in Team menu
      And User Tap on Board menu
      And User Tap on icon + add new card on Test Board_1
      And User Tap on icon Checklist
    Then User can't add new card in Board list

  @PASCA08-Navigate
  Scenario: Invalid add new comment on card in Board list
#    Given User open staging-cicle on mobile
#    When User Tap on Sekolah QA in Team menu
#      And User Tap on Board menu
      And User Tap on Card Materi_1 in Board Test Board_1
      And User Tap on add new comment
      And User Tap on button submitCM
    Then User can't add new comment

  @PASCA09-Negative
  Scenario: Invalid add description on card in Board list
#    Given User open staging-cicle on mobile
#    When User Tap on Sekolah QA in Team menu
#      And User Tap on Board menu
#      And User Tap on Card Materi_1 in Board Test Board_1
      And User Tap on icon pencil on description
      And user Tap on button Publish
    Then user can't add description

  @PASCA10-Negative
  Scenario: Invalid add label on card in Board list
#    Given User open staging-cicle on mobile
#    When User Tap on Sekolah QA in Team menu
#      And User Tap on Board menu
#      And User Tap on Card Materi_1 in Board Test Board_1
      And User Tap on button + on label
      And User Tap on button Create new label
      And User Tap on button submit_4
    Then User can't add new label

