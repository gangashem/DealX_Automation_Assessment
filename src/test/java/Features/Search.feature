@SearchFeature
Feature: Verify Search Results
   #TC1 (Test Case 1)
  @TC1_VerifySearchResults
  Scenario Outline: Search for an item
    Given I search for "<Item>" in search area
    And I click on search button
    Then I verify the first item matches the search criteria
    Examples:
      | Item         |
      | Summer Dress |

  #TC2 (Test Case 2)
  @TC2_VerifySearchResults
  Scenario: Search for an item with 3 search Criteria
    Given I Search and Verify Three different search criteria

  #TC3 (Test Case 3)
  @TC3_VerifySearchResults
  Scenario: Search for an item using Excel Sheet data input
    #Using Excel for data input
    Given I search for Item in search area
    And I click on search button
    Then I verify the first item matches the search criteria