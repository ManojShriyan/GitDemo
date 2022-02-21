Feature: Application Login 

Scenario: HomePage Default Login 
	Given User is on NetBanking LandingPage 
	When User login into Application with username "jin" & password "1234" 
	Then HomePage is populated 
	And Cards are displayed "true" 
	
	
	
Scenario: HomePage Default Login 
	Given User is on NetBanking LandingPage 
	When User login into Application with username "john" & password "4321" 
	Then HomePage is populated 
	And Cards are displayed "false" 
