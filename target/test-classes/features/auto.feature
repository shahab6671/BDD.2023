Feature: Validating Progressive insurance

  @regression @auto   @smoke
  Scenario: Auto quote test
    Given home page title is "Welcome to Progressive Insurance®"
    And footter will be "Select a product to quote"
    When user click on Auto
    And user input zipcode "abcrd"
    When user clean Zipcode field
    And user input zipcode "9b12d"
    And user click on button "get a start"
    Then verify zipcode error mgs is "Please use only digits"
    When user clean Zipcode field
    And user input zipcode "11204"
    And user click on button


 