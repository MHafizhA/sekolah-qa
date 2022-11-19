Feature: Search Feature
  This feature deal with the search functionality of application

  Scenario Outline: Search Correctly
    Given user on page <searchProductCode> automationpractice
      And user typing t-shirt
      And user click icon search
    Then user see t-shirt <output>

    Examples:
      | Search  | output |
      | T-shirt | True   |
      |         | False  |