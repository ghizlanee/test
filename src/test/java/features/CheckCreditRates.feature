Feature:
  credit simulation without creation afterwards

  Scenario Outline:
    Given User is on Home page
    When User clicks on access credit button
    Then User is on login page
    Then User provides the username as <username> and the password as <password>
    Then User clicks on login button
    Then User should be logged in to the application
    Then User clicks on credit button
    Then User clicks on Create Contract credit button
   # Then User provides the purchase amount as <MA> and the credit amount as <MC> and the duration as <D>
    Then User chooses the category as <C>
    Then User clicks on calculate cost credit button
    Then User verify the rate with <T>
    #rate:taux
    Then User clicks on cancel button
    Then User close application

    Examples:
       | MA    | MC   | D | C | T    |
       | 11250 | 9000 | 12| A | 0.02 |
       | 10000 | 8000 | 30| A | 0.02 |
       | 8750  | 7000 | 48| A | 0.032|
       | 12500 | 10000| 12| A | 0.032|
       | 12500 | 10000| 24| A | 0.032|
       | 13750 | 11000| 16| A | 0.032|
       | 13750 | 11000| 24| A | 0.032|
       | 12500 | 10000| 48| A | 0.048|
       | 13750 | 11000| 48| A | 0.048|
       | 17500 | 14000| 17| B | 0.048|
       | 17500 | 14000| 18| B | 0.048|
       | 16250 | 13000| 20| B | 0.062|
       | 13750 | 11000| 36| B | 0.062|
       | 11250 | 9000 | 37| B | 0.072|
       | 18750 | 15000| 24| B | 0.072|
       | 18750 | 15000| 20| B | 0.072|
       | 25000 | 20000| 20| B | 0.072|
       | 21250 | 17000| 24| B | 0.072|
       | 31250 | 25000| 22| B | 0.072|
       | 31250 | 25000| 24| B | 0.072|
       | 18750 | 15000| 26| B | 0.012|
       | 21250 | 17000| 30| B | 0.012|
       | 32500 | 26000| 48| B | 0.012|
       | 31250 | 25000| 27| B | 0.012|
