@ShoppingFeature
Feature: Shopping

  #TC5 (Test Case 5)
    @TC5_AddItemToShoppingCart
    Scenario Outline: Add item to shopping cart
      Given I add item to shopping cart
      When I view shopping cart
      And I increase "<Item>" quantity
      Then I calculate and verify total amount
      Examples:
        | Item |
        | 3    |