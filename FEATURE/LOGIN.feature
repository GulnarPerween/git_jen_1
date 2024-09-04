Feature: Login to Application
@Regression
  Scenario: Successfull login with valid credentials
 
    Given User launch the browser
    When User open the URL "https://www.way2automation.com/angularjs-protractor/banking/#/login"
    And User select customer login
    And User Select the  Name such as "Albus Dumbledore"
    And User click the Deposit   button
    And User enter  amount that need to be Deposited as 2000
    And User click Deposit button
    Then user validate amount is  deposited or not
    When User Navigate to Home login Page
    Then Page Title should be  "Protractor practice website - Banking App"
    And close Browser

    @sanity
    Scenario Outline: Successfull login 
    Given User launch the browser
    When User open the URL "https://www.way2automation.com/angularjs-protractor/banking/#/login"
    And User select customer login
    And User Select the  Name such as "<character_name>"
    And User click the Deposit   button
    And User enter  amount that need to be Deposited as <amount>
    And User click Deposit button
    Then user validate amount is  deposited or not
    When User Navigate to Home login Page
    Then Page Title should be  "Protractor practice website - Banking App"
    And close Browser
    
    Examples:
   |character_name   |amount|
   |Harry Potter     |1000  |
   |Hermoine Granger |90000 |
   |Ron Weasly       |8700  |