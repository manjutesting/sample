Feature: facebook login fuctionality
  Scenario: Login with valid credentials
  Given User is on Login page
  When User enter username
  And User enter password
  And User click on sigin button
  Then  User login page displayed
  

  Scenario: Login with invalid credentials
  Given User is on Login page
  When User enter incorrect username
  And User enter password
  And User click on sigin button
  
  