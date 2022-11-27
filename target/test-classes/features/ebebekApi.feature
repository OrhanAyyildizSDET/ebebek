@ebebekApi
Feature: ebebek api
  Scenario: get and post requests
    When user get a clients information with "https://generator.swagger.io/api/gen/clients/scala"
    Then assert that status code is  "200"


