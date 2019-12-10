Feature: Logged in user should be able to search  for necessary music artist and then  play all available tracks.

 Background: Login into account with correct credentials
  Given User navigates to Mixcloud website
  When User clicks on the login button on page
  And User enters a valid username
  And User enters a valid password
  When User clicks on the log in button
  Then User should be successfully logged in


 Scenario: Play all available tracks of required artist
  Given User clicks Search field
  When User enters artistname in the Search field
  Then User goes to artist site
  Then User plays all available tracks of required artist
   Then User goes to profile and checks all available tracks
