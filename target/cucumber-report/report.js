$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LaunchBrowser.feature");
formatter.feature({
  "line": 2,
  "name": "Launch automationpractice.com Browser",
  "description": "",
  "id": "launch-automationpractice.com-browser",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LaunchBrowserFeature"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Open Browser",
  "description": "",
  "id": "launch-automationpractice.com-browser;open-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@OpenBrowser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LaunchBrowser.Iopenthebrowser()"
});
formatter.result({
  "duration": 23205444900,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SignInFeature"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#TC4 (Test Case 4)"
    }
  ],
  "line": 6,
  "name": "SignIn to automationpractice.com",
  "description": "",
  "id": "sign-in;signin-to-automationpractice.com",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TC4_SignIn_scenario"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i enter the username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click on SignIn button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.iClickOnSignInLink()"
});
formatter.result({
  "duration": 6510474300,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.iEnterTheUsername()"
});
formatter.result({
  "duration": 628747800,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.iEnterThePassword()"
});
formatter.result({
  "duration": 309067300,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.iClickOnSignInButton()"
});
formatter.result({
  "duration": 5987908000,
  "status": "passed"
});
formatter.uri("NavigationMenu.feature");
formatter.feature({
  "line": 2,
  "name": "Navigation Menu",
  "description": "",
  "id": "navigation-menu",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NavigationMenuFeature"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#TC6 (Test Case 6)"
    }
  ],
  "line": 5,
  "name": "Navigation Menu",
  "description": "",
  "id": "navigation-menu;navigation-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC6_MenuNavigation"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "That i hover over Women Menu And I click on T-shirts subcategory",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Verify the correct page has been loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenu.thatIHoverOverWomenMenuAndIClickOnTShirtsSubcategory()"
});
formatter.result({
  "duration": 5902727700,
  "status": "passed"
});
formatter.match({
  "location": "NavigationMenu.iVerifyTheCorrectPageHasBeenLoaded()"
});
formatter.result({
  "duration": 75859100,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Search Results",
  "description": "",
  "id": "verify-search-results",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SearchFeature"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#TC1 (Test Case 1)"
    }
  ],
  "line": 5,
  "name": "Search for an item",
  "description": "",
  "id": "verify-search-results;search-for-an-item",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC1_VerifySearchResults"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I search for \"\u003cItem\u003e\" in search area",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the first item matches the search criteria",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "verify-search-results;search-for-an-item;",
  "rows": [
    {
      "cells": [
        "Item"
      ],
      "line": 10,
      "id": "verify-search-results;search-for-an-item;;1"
    },
    {
      "cells": [
        "Summer Dress"
      ],
      "line": 11,
      "id": "verify-search-results;search-for-an-item;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Search for an item",
  "description": "",
  "id": "verify-search-results;search-for-an-item;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SearchFeature"
    },
    {
      "line": 4,
      "name": "@TC1_VerifySearchResults"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I search for \"Summer Dress\" in search area",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the first item matches the search criteria",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Summer Dress",
      "offset": 14
    }
  ],
  "location": "Search.iSearchForInSearchArea(String)"
});
formatter.result({
  "duration": 192072700,
  "status": "passed"
});
formatter.match({
  "location": "Search.iClickOnSearchButton()"
});
formatter.result({
  "duration": 3744432600,
  "status": "passed"
});
formatter.match({
  "location": "Search.iVerifyTheFirstItemMatchesTheSearchCriteria()"
});
formatter.result({
  "duration": 68588400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 18,
      "value": "#TC3 (Test Case 3)"
    }
  ],
  "line": 20,
  "name": "Search for an item using Excel Sheet data input",
  "description": "",
  "id": "verify-search-results;search-for-an-item-using-excel-sheet-data-input",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC3_VerifySearchResults"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#Using Excel for data input"
    }
  ],
  "line": 22,
  "name": "I search for Item in search area",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the first item matches the search criteria",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.iSearchForItemInSearchArea()"
});
formatter.result({
  "duration": 2201058300,
  "status": "passed"
});
formatter.match({
  "location": "Search.iClickOnSearchButton()"
});
formatter.result({
  "duration": 2855750300,
  "status": "passed"
});
formatter.match({
  "location": "Search.iVerifyTheFirstItemMatchesTheSearchCriteria()"
});
formatter.result({
  "duration": 63315500,
  "status": "passed"
});
formatter.uri("Shopping.feature");
formatter.feature({
  "line": 2,
  "name": "Shopping",
  "description": "",
  "id": "shopping",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ShoppingFeature"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#TC5 (Test Case 5)"
    }
  ],
  "line": 6,
  "name": "Add item to shopping cart",
  "description": "",
  "id": "shopping;add-item-to-shopping-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC5_AddItemToShoppingCart"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I add item to shopping cart",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I view shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I increase \"\u003cItem\u003e\" quantity",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I calculate and verify total amount",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "shopping;add-item-to-shopping-cart;",
  "rows": [
    {
      "cells": [
        "Item"
      ],
      "line": 12,
      "id": "shopping;add-item-to-shopping-cart;;1"
    },
    {
      "cells": [
        "3"
      ],
      "line": 13,
      "id": "shopping;add-item-to-shopping-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Add item to shopping cart",
  "description": "",
  "id": "shopping;add-item-to-shopping-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ShoppingFeature"
    },
    {
      "line": 5,
      "name": "@TC5_AddItemToShoppingCart"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I add item to shopping cart",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I view shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I increase \"3\" quantity",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I calculate and verify total amount",
  "keyword": "Then "
});
formatter.match({
  "location": "Shopping.iAddItemToShoppingCart()"
});
formatter.result({
  "duration": 55027100,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iViewShoppingCart()"
});
formatter.result({
  "duration": 8754744000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "Shopping.iIncreaseQuantity(String)"
});
formatter.result({
  "duration": 148225900,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iCalculateAndVerifyTotalAmount()"
});
formatter.result({
  "duration": 5111042300,
  "status": "passed"
});
});