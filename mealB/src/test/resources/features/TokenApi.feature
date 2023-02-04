Feature: Token API

  @apiRegression  @smoke  @tokenApi 
  Scenario: Get token
    Given User creates request data with "mealbemp1" and "Test123!"
    And User submits request to TOKEN api
    And User validates if status code is 200
    Then User retrieves access token from response.