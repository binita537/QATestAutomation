Feature: Verify user authentication 

Scenario: User login with correct username and password 
    Given user navigate to the login page
    When user enter valid username and password
    Then user is successfully logged in
    
    