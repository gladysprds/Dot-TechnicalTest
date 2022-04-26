Feature: Login
  As a user
  i want to login
  so that i can access the website


 // Scenario: As a user i have to be able to login
   // Given i am on login page
  //  When i input valid username
   // And I input valid password
  //  And click login button
    // Then I am at homepage


  Background:
    Given i am on login page

  @DDT
  Scenario Outline: Login scenario
    When i input "<username>" username
    And i input "<password>" password
    And click login button
    Then i get the "<result>"
    Examples:
      |username|password|result|
      |dummyforta2022@gmail.com|realgladz1511|home page|
      |dummyforta2022@gmail.com|    |Login Page|
      |   |realgladz1511|Login Page|
      |   |             |Login Page|
      |dummyforta2022@gmail.com|gladz1511#|Login Page|
      |dummyforta2@gmail.com|realgladz1511|Login Page|