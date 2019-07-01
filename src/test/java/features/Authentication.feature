Feature:
  Authentication


  Scenario Outline: Successful login with valid credentials
    Given User is on Home page
    When User clicks on access credit button
    Then User is on login page
    Then  User provides the username as <username> and the password as <password>
    Then User clicks on login button
    Then User should be logged in to the application
    Then User close application


    Examples:
      | username | password |
      | gca      | qsi2019  |
      | rca      | qsi2019  |
      | lca      | qsi2019  |
      | aca      | qsi2019  |



  Scenario Outline: unsuccessful login with invalid credentials
    Given User is on Home page
    When User clicks on access credit button
    Then User is on login page
    Then  User provides the username as <username> and the password as <password>
    Then User clicks on login button
    Then User should be show an error message
    Then User close application
    Then User close application


    Examples:
      | username | password |
      | gca      | toto     |
      | test     | toto     |
      | toto     | qsi2019  |
      |          |          |
      | Gca      | qsi2019  |
      | gCa      | qsi2019  |
      | gcA      | qsi2019  |
      |          | qsi2019  |
      | gca      |          |
      | GCA      | qsi2019  |