Feature: The Utest user
  you must create a new record
  access as a student

  Scenario: Successful user creation
    Given user in the home page
    When he user create an account filling all fields
    Then he user sees its username