Feature:
  As a Credit Manager
  I want to be able to establish a credit agreement for an existing customer


  Scenario Outline : Establishment of a credit agreement for an existing customer
    Given User is on Home page
    When User clicks on access credit button
    Then User is on login page
    Then User provides the username as <username> and the password as <password>
    Then User clicks on login button
    Then User should be logged in to the application
    Then User clicks on credit button
    Then User clicks on Create Contract credit button
    #montant achat
    Then User provides the purchase amount as <MA> and the credit amount as <MC> and the duration as <D>
    Then User chooses the category as <C>
    Then User clicks on calculate cost credit button
    Then User clicks on create contract button
    Then User provides the last name as <name> and the first name as <lastname>
    Then User clicks on search button
    Then User select a customer
    Then User clicks on valid button
    Then User clicks on print button

    Examples:
      | MA    | MC   | D | C | name     | lastname |
      | 11250 | 9000 | 12| A | bensalem | ghizlane |




