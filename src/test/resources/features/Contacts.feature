Feature: Contact page

  Scenario: default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1

    # check it fails:(
  Scenario: Verify create calendar event
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar"

#    for list,dynamically
  Scenario: Menu Options Driver
    Given the user logged in as a "driver"
    Then the should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

#EXTRA; ctr+alt+L -->make organized pipes

  Scenario: Menu Options Sales manager
    Given the user logged in as a "sales manager"
    Then the should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

# Here we use map and value,dynamically

  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | Brenden     |
      | lastname  | Schneider   |
    Then the user should be able to login

# unlike DDT, it is just one step same date
# Even though it is NOT suitable for DDT we can solve with DDT


  Scenario Outline:login as a given user <user>
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | <user>      |
      | password  | UserUser123 |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Then the user should be able to login
#map of data(above) takes the information from examples and assign as expected ones
    Examples:
      | user           | firstName | lastName       |
      | user10         | Brenden   | Schneider      |
      | storemanager85 | Stephan   | Tremaine Haley |




