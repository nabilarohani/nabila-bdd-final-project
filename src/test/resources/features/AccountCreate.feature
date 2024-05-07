@Regression
Feature: Create an Account from home page.
    Background:

    When User click on Create Primary Account button


    Scenario: create an account
        And User validates page Title as Expected “Create Primary Account Holder”

    Scenario: create an account by filling up the form using List of map data table
    When User fill out Create Account Form

    |email | title | firstName | lastName | gender | maritalStatus | employmentStatus | date0fBirth |
    | TahaAhmad12345@gmail.com | Mr.| Taha | Ahmadi | Male  |Single | Softwear |06/23/2013|


    When User click on Create Account Button
    And Validate user is on "sign up your account"
    Then Email displayed as entered

    @Negative
    Scenario: create an account with existing email address
    When User creates account with existing email address

    | email |title |firstName | LastName |gender |maritalStatus |employmentStatus |date0fBirth |
    | Sara1232@gmail.com | Miss. | Sara | Sori | Male | Single  | Engineer        |04/01/2003  |

    Then Click on Create Account Button
    Then Error message "account with email Sara1232@gmail.com is exist"