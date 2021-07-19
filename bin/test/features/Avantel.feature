Feature: Avantel

  @regression
  Scenario Outline: Avantel
    Given that an avantel user wants to make a rejection
    When he injects the excel data
      | excelClientNumber|
      | <id>  |
    Then he should see the rejection active.
    Examples:
      | id |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 6 |
      | 7 |
      | 8 |
      | 9 |
      | 10|
      | 11|