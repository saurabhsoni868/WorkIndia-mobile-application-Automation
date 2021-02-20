
Feature: Update the Information of Registered User

  @tag4
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
  Then User will Click on Profile Icon, User Will Click On My Profile Icon
  Then User Will Select Qualification
 Examples: 
     | Name     |   PhoneNumber  | Area_name   |
     | Sobhit   |   1234567890   | Karol Bagh  |
