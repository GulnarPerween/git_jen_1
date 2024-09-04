Feature: Bank Manager Login
  @sanity
  Scenario Outline: Successfull login with Bank Manager Login
    Given User launch the browser
    When User open the URL "https://www.way2automation.com/angularjs-protractor/banking/#/login"
    When User click BankManager login
    And User  Enter the "<FirstName>","<LastName>","<PostalCode>"
    And User click Add Customer button
    Then User Navigate to Open Account
    And User Enter the "<Customer>" &"<Currency>"
    And User click Process button
    And User navigate to customer Page
     And close Browser
   

    Examples: 
      | FirstName | LastName      | PostalCode | Customer         | Currency |
      | Tom       | Riddle        |     234567 | Harry Potter     | Dollar   |
      | Professor | Severus Snape |    1234444 | Hermoine Granger | Rupee    |
