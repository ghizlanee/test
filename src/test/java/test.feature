Feature:
  test


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
