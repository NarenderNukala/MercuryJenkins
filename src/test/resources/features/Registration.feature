Feature: Registration Feature

@sanity
Scenario: Verify Registration Page
Given User clicks on the Registration Link in home page
Then User will be navigated to the registration page

@Regression
Scenario: Validate Registration Functionality
Given User clicks on the Registration Link in home page
Then New user is able to register in to application
| FirstName	| LastName	| Phone			| Email			   | 
| Naren		| Nukala	| 9123456789	| test@test.com	   | 