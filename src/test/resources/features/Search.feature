Feature: Search feature

Background: User logged in
	Given I have navigated to application URL
	When I have entered correct UserName and Password
	Then I am navigated to the SearchPage

@sanity
Scenario: Search for flight
When I have entered travel details and searched for flights
| PassengerCount	| FromCity	| FromMonth	| FromDate | ToCity		| ToMonth	| ToDate	| ServiceClass	  | Airline			 |
| 3					| London	| October	| 21	   | Paris		| October	| 28		| Business Class  | Unified Airlines |
Then I should be able to see search results

