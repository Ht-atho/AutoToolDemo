Feature: As a user, i want to login into the Test You


  @test01
  Scenario: login successfully
    Given Go to 'https://mektoube.fr/login' url
    When Insert 'yassine_yes' into the Email field
    When Insert 'Mektoubi2017' into the Password field
    When Click login button
    Then User login successfully into front site
