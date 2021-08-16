Feature: Account types
#  Here I am automating same scenario, login/navigate/verify contains
#  So it is the same as DDT(Data Driven Testing) same steps of scenario/testcase with different data
#  I can apply DDT here in feature file
#  unlike TestNG implementing, no external sources(like excel) is used here is not useful

  @wip
  Scenario: Driver user
    Given the user logged in as a "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"
  @wip
  Scenario: Sales manager user
    Given the user logged in as a "sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - CustomerS "
  @wip
  Scenario: Store manager user
    Given the user logged in as a "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"

# Eg: 1--> for first given step
# lets take first two line Scenario and Given to apply the DDT
# in cucumber we use Scenario Outline and Examples keywords or implementing

  #  Scenario: Driver use
  #    Given the user logged in as a "driver"

  #  Scenario: Sales manager user
  #    Given the user logged in as a "sales manager"

  #  Scenario: Store manager user
  #    Given the user logged in as a "store manager"

  Scenario Outline: Different user types
    Given the user logged in as a "<userType>"

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

# firs row is the name of variable, the other rows is test data
# then rows are assigned to variable and executed one by one for each row

# Eg: 2--> for whole scenario
  Scenario Outline: Login with different types <userType>
    Given the user logged in as a "<userType>"
    When the user navigates to "<tap>" "<module>"
    Then the title contains "<title>"

    Examples:
      | userType      | tap        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |
#TDD separate code/test and data so we separated
# Scenario outline: holds test steps/code
# Examples hold: test data
