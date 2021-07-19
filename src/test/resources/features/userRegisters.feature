Feature: Avantel

  @regression
  Scenario: Avantel
    Given that an avantel user wants to make a rejection
    When he injects the excel data
    Then he should see the rejection active.