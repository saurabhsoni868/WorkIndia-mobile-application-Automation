

Feature: Registration of New User
  This feature file will Register new User

  @tag1
  Scenario Outline: User with enter Name and the Mobile Number in to the Application
    Given User has already on Registration page
    When  User enter the "<Name>" and "<PhoneNumber>"
    And  User click on Submit button
    Then User should move to Next Registration Page

  Examples: 
    | Name     |   PhoneNumber  | 
    | Sobhit   |   1234567890   |
    
    

  @tag2
  Scenario Outline:  Further Details of Registration
   When  User enter the "<Name>" and "<PhoneNumber>"
   And   User click on Submit button
   Given User should be on Choose City Page
   When  User select DELHI
   Then  User enter Area "<Area_name>"
   Then  User click on the Submit button
   Then  User should be moved to next Page
    Examples: 
     | Name     |   PhoneNumber  | Area_name   |
     | Sobhit   |   1234567890   | Karol Bagh  |
  
   
   
  @tag3
  Scenario Outline:  input Intrest , Skills and Qualification Details of Registration
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
   Examples: 
     | Name     |   PhoneNumber  | Area_name   |
     | Sobhit   |   1234567890   | Karol Bagh  |
  
  
  
  
  
  
  