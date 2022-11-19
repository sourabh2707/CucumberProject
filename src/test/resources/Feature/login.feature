Feature: Validate OrangeHRM login functionality

  Scenario Outline: Verify login functionality with valid credentials
    Given user should be on the login page
    When user enters <username> and <password>
    And clicks on login button
    Then user should be navigated to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Adm      | adm123   |
#Gherkin language
