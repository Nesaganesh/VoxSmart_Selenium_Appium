Feature: As a new avatrde customer

  Scenario: To verify all the options you selected are added to the favourites from the trade tab
    Given I navigate to avatrade website
    When Logged in as a registered customer
    Then Select Trade tab on left side
    And Scroll down for categories list and select crypto
    Then Select 5 random cryptocurrencies
    And Select the favourites from Trade drop down
    Then verify the values displayed from the favourites tab
