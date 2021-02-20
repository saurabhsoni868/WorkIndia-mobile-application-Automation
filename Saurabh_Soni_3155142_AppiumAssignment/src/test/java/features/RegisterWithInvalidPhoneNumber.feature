
Feature: Try to Register User with Invalid Phone Number

  @tag5
  Scenario: Try to Register with Invalid Digits Mobile Number
    Given User has already on Registration page
    When  User Enters Name and Mobile_num
          | saurabh | 123456789 | 
    And  User click on Submit button
    Then the User will not be Registered
