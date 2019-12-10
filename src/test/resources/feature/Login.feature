Feature: Login into Mixcloud website
Existing user should be able to login into account using correct credentials
  
 Scenario Outline: Login into account with correct credentials
Given User navigates to mixcloud website    
When User clicks on the login button on homepage      
  And User enters a valid username "<username>"   
 And User enters a valid password "<password>"    
 When User clicks on the login button          
 Then User should be logged in            
    
  Examples:
	|     username 	         |	 password   |	
	|	foxcy3884@gmail.com  |   qwerty  |
	
  