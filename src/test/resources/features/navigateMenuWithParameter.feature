@bekir
Feature: Navigate to Menu with Parameters


  Scenario: Navigation to Developer page
    Given The user is on the login page
    When The user logs using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    * The welcome message contains "Teacher"
    When The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"

  @wip
Scenario: Navigation to Post Page
  Given The user is on the login page
  When The user logs using "EurotechB5@gmail.com" and "Test12345"
  Then The user should be able to login
  * The welcome message contains "eurotechB5"
  When The user navigates to My Posts Page
  Then The user should be able to see header as "Posts"





  # go to Post page
  # verify "Post"

    # login as a developer
  # verify welcome message
  # go to Dashboard page
  # verify "Dashboard"