Feature: Create an Account from home page.

  Background:
    When Click on Login button

  @PositiveTest
  Scenario: User login with Valid CSR credentials
    When Enter Username Value "supervisor" and Password Value "tek_supervisor"
    Then Validate user navigate to Customer Service Portal



  @NegativeTest
  Scenario Outline: Negative Test. login functionality with invalid credential wrong username and valid password
    When Enter UserName Value "<username>" and Password value "<password>"
    And Vlick on Sign In Button
    Then Validate login error message "<errorMessage>"
    Examples:
      | username      | password           |errorMessage              |
      | supervisor345 | tek_supervisor     |ERROR User tek_supervisor345 not found|
      | supervisor    |  tek_supervisor345  |ERROR Password not matched|