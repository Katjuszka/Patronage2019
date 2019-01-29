Feature: As I user I want to able to get in register form in AutomationPractice

   Scenario: Getting to authentication form
     Given User is in Automation page
     When I click on Sign in link
     Then I see Create An Account
     And I see Email address input

   Scenario: Empty email input
     Given User is on Automation page
     When I click on Sign in link
     And I submit empty email input below Create an Account header
     Then I see error pop-up


    Scenario: Invalid email input
      Given User is on Automation page
      When I click on Sign in link
      And I type invalid email
      Then I see error pop-up

   Scenario: Correct email input
     Given User is on Automation page
     When I click on Sign in link
     And I submit correct email
     Then I see an Account Creation form

    Scenario: An email that has been already registered
      Given User is on Automation page
      When I click on Sign in link
      And I submit an email: "123@abc.pl"
      Then I see error pop-up
