Feature: As a user I want to be able to create an account in AutomationPractice

  Scenario: Choice of state
    Given User is in Register Form
    When I choose state: "Alabama" from dropdown
    Then I see "Alabama" in dropdown

  Scenario: Send empty form
    Given User is in Register Form
    When I submit empty form
    Then I can see error pop up

  Scenario: Send form only with required fields
    Given User is in Register Form
    When I submit form only with required fields
    Then I see info I am welcomed on site

  Scenario: Send form only with required fields and with too short password
    Given User is in Register Form
    When I submit form only with required fields and with three letter password
    Then I see error password pop up

  Scenario: Send totally filled form
    Given User is in Register Form
    When I submit totally filled form
    Then I see info I am welcomed on site
