Feature: Select Destinations from and to

  @wip
  Scenario: Select Flight
    Given the user navigates to the URL
    When the user selects from "Ajmer"
    And the user selects to "Ahmedabad"
    And click on Search Flight
    Then the user should see all the flights
