Feature: Login feature

@sanity1
Scenario: Login Success
Given I have navigated to application URL
When I have entered correct UserName and Password
Then I am navigated to the SearchPage

@sanity1
Scenario: Login with Parameters
Given I have navigated to application URL
When User enters correct "narender" and "narend"
Then I am navigated to the SearchPage

@Regression
Scenario Outline: Login unsucess
Given I have navigated to application URL
When User enters correct "<UserName>" and "<Password>"
Then I should navigated to the LoginPage
Examples:
|UserName	|Password	|
|Ram		|Test@123	|
|Madhu		|Test@123	|
|Siva		|Test@123	|

