Feature: Bank Test

  @author_JigarPatel @sanity @smoke @regression
#  1.bankManagerShouldAddCustomerSuccessfully.
  Scenario: Bank Manager Should Add Customer Successfully
    Given I am on HomePage
    When click On Bank Manager Login Tab
    And click On Add Customer Tab
    And enter First Name "Harry"
    And enter Last Name "Potter"
    And enter Post Code "HA0 1DG"
    And click On Add Customer Button
    And popup display
    Then verify message "Customer added successfully with customer id :"
    And click on ok button on popup

  @author_JigarPatel @sanity @smoke @regression
 # 2. bankManagerShouldOpenAccountSuccessfully.
  Scenario: Bank Manager Should Open Account Successfully
    Given I am on HomePage
    When click On Bank Manager Login Tab
    And click On Open Account Tab
    And Search customer that created in first test "Hermoine Granger"
    And Select currency "Pound"
    And  click on process button
    And popup displayed
    Then verify message "Account created successfully"
    And click on ok button on popup

  @author_JigarPatel @regression
 # 3. customerShouldLoginAndLogoutSuceessfully.
  Scenario: Customer Should Login And Logout Successfully
    Given I am on HomePage
    When click on Customer Login Tab
    And Search customer that created in first test "Hermoine Granger"
    And click on Login Button
    Then verify Logout Tab displayed
    And click on Logout
    Then verify "Harry Potter" text displayed

  @author_JigarPatel @regression
  # 4. customerShouldDepositMoneySuccessfully.
  Scenario: Customer Should Deposit Money Successfully
    Given I am on HomePage
    When click on Customer Login Tab
    And Search customer that created in first test "Hermoine Granger"
    And click on Login Button
    And click on Deposit Tab
    And Enter amount "100"
    And click on Deposit Button
    Then verify message "Deposit Successful"

  @author_JigarPatel @regression
 # 5. customerShouldWithdrawMoneySuccessfully
  Scenario: Customer Should Withdraw Money Successfully
    Given I am on HomePage
    When click on Customer Login Tab
    And Search customer that created in first test "Hermoine Granger"
    And click on Login Button
    And click on Withdrawl Tab
    And Enter amount "50"
    And click on Withdraw Button
    Then verify message "Transaction Successful"