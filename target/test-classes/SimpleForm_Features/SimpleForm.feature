@sample
Feature: To validate the  Simple Form Submission

  @tag1
  Scenario: Submit the Simple Form
    Given open the enter the url simple form page
    When enter name "Shubham" in the first name field
    And enter surname "Yetonde" in the last name field
    And enter Email "shubhamyetonde865.com" in the email field
    And enter number "9876543210" in the phone number field
    And click the submit button
    Then confirmation message
