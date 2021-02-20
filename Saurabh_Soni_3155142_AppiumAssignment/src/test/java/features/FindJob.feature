Feature: Search a Job using Filter to WorkIndia
  In order to find a job as a user
  
 @tag6
   Scenario Outline: User should be able to find job using filter into the Application
    Given User has already on Registration page
    When  User enter the "<Name>" and "<PhoneNumber>"
    And   User click on Submit button
    When  User select DELHI
    Then  User enter Area "<Area_name>"
    Then  User click on the Submit button
    Given  User should be on Please fill more Details
    When User Select Gender , Qualifications , school medium and Fluency in english
    And About Experience , Age and Area of Interest
    And Click on Submit Button
    Then Choose your Area of Skills and Digree 
    Then Click on Submit button
    Then Choose Language
    Then  User clicks on Jobs and Filters option
    Then  User chooses the Interested Areas
    Then  User selects Experience and Qualification level
    Then  User selects the Gender
    Then  User clicks on Apply button
    Then  User choose a job among filtered options
    Then  User clicks on Back button
    Examples: 
     | Name     |   PhoneNumber  | Area_name   |
     | Sobhit   |   1234567890   | Karol Bagh  |