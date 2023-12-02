@registration
Feature: Automation Site

  @smoke @1
  Scenario: Verify Success message on 8 or more than 8 chars in passoword
    And user click on registration page
    And user enter "harsh" in username on registration page
    And user enter "harsh12345" in password on registration page
    And user click on "submit" button on registration page
    Then user verify "Success!" message on alert

  @smoke @2
  Scenario: Verify Success message on less than 8 chars in passoword
    And user click on registration page
    And user enter "harsh" in username on registration page
    And user enter "harsh" in password on registration page
    And user click on "submit" button on registration page
    Then user verify "failed" message on alert
