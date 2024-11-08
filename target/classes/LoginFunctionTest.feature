@Smoke @Regression
Feature: Login Function Test

Background:
Given Open the browser
And Go to the application URL

  @Positive @TC_1
  Scenario: As a para bank user,Login should pass with valid credential
    
    When Put the valid user
    And Put the valid password
    And Click the login button
    Then Check the login should pass 
   

  @Negative @TC_2
  Scenario: As a para bank user,Login should fail with invalid credential
    
    When Put the invalid user
    And Put the invalid password
    And Click the login button
    Then Check the login should fail 

    @Negative @TC_3
  Scenario: As a para bank user,Login should fail with null credential
    
    When Put the null user
    And Put the null password
    And Click the login button
    Then Check the login should fail 
    