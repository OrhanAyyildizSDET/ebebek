@ebebek
@Close
Feature: ebebek features
  Background: User Logins the Application
    Given user go to the "https://www.e-bebek.com" page
  Scenario: ebebek scenario
    When user click the searchbox
    And user enter the word "biberon" and click enter
    And user select the first item
    And user click the "sepete ekle" and "sepeti gör" button
    Then user check the basket