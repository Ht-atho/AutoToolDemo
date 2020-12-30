Feature: As a user, i want to look up the definition of some work


  @test01
  Scenario: look up success
    Given the user is on the google home page
    When the user looks up the definition of the word 'number'
    Then they should see the definition 'number'
