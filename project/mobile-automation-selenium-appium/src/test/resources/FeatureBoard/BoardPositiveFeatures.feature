@AllPositiveBoard
Feature: feature to test Board functionality
  Background: User open staging-Cicle app on Mobile

    @PASCA01-Positive
      Scenario: User can open Board menu
        Given User open staging-cicle on mobile
        When User Tap on Sekolah QA in Team menu
          And User Tap on Board menu
        Then user can see inside Board menu

    @PASCA02-Positive
      Scenario: User can Add new Board list
        Given User open staging-cicle on mobile
        When User Tap on Sekolah QA in Team menu
          And User Tap on Board menu
          And User Tap on button +
          And User type Test Board
          And User Tap button submit
        Then user see a new board

    @PASCA03-Positive
      Scenario: User can add new card in Board list
#        Given User open staging-cicle on mobile
#        When User Tap on Sekolah QA in Team menu
#          And User Tap on Board menu
          And User Tap on icon + add new card on Test Board1
          And User type on your card name Pertemuan1
          And User Tap on button Check
        Then user see a new card
#
    @PASCA04-Positive
      Scenario: User can edit title on card
#        Given User open staging-cicle on mobile
#        When User Tap on Sekolah QA in Team menu
#          And User Tap on Board menu
          And User Tap on card Test Board1
          And User Tap on icon pencil next title card
          And User Type and chenge pertemuan1 to Materi1
          And User Tap on icon Checklist next title card
        Then User can see Popup message update succesfully

    @PASCA05-Positive
      Scenario: User can add new label on card
#        Given User open staging-cicle on mobile
#        When User Tap on Sekolah QA in Team menu
#          And User Tap on Board menu
#          And User Tap on card Test Board1
          And User Tap on button label
          And User Tap on Name Your label
          And User Type Pertemuan_1
          And User Tap on button submit
        Then user can add succesfully
        When user Tap on label Pertemuan1
        Then User can toggle succesfully

