Feature: Validating Progressive insurance 2 - Data Table or Date Driven Approch in BDD

*Background:
*print <msg>
|'Auto Quote Test'|

  @BDD-6671
  Scenario Outline: Auto quote test 2
    Given home page title is "Welcome to Progressive Insurance®"
    And Sub-title is  "Better insurance starts here"
    And footter will be "Select a product to quote"
    When user click on Auto
    And user input zipcode <zipCode>
    Then verify zipcode length is <length>
    When user clean Zipcode field
    And user input zipcode "9b12d"
    And user click on button "get a start"
    Then verify zipcode error mgs is "Please use only digits"
    When user clean Zipcode field
    And user input zipcode "11204"
    And user click on button

    Examples: 
      | zipCode  | length |
      | 'abcrd '   | '5'      |
      | '9b12d'   | '5'      |
      | '11218'   | '5'      |
      
  @BDD-8559
 Scenario Outline: Auto quote test 2
    Given home page title is 'Welcome to Progressive Insurance®'
    And Sub-title is  "Better insurance starts here"
    And footter will be "Select a product to quote"
    When user click on Auto
    And user input zipcode <zipCode>
    | zipCode  | 
      | 'abcrd ' |
      | '11218' |
    Then verify zipcode length is '5'
    When user clean Zipcode field
    And user input zipcode "9b12d"
    And user click on button "get a start"
    Then verify zipcode error mgs is "Please use only digits"
    When user clean Zipcode field
    And user input zipcode "11204"
    And user click on button

   