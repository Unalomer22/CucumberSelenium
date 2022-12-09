@NavigationMenu
Feature: Navigation Menu

  @Developer
  Scenario: Navigation to Developers menu
    # Senaryo: Geliştiriciler menüsüne gidin
    Given The user is on the login page
      # Kullanıcı giriş sayfasında
    When  The user enters teacher credentials
      #Kullanıcı, öğretmen kimlik bilgilerini girer
    Then  The user should be able to sees welcome message
      #Kullanıcı karşılama mesajını görebilmelidir.
    And   The user navigates to Developers menu
      #Kullanıcı, Geliştiriciler menüsüne gider
    Then  The user able to see developer text
    #Geliştirici metnini görebilen kullanıcı


  Scenario: Navigation to All Post menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to sees welcome message
    And The user navigates to All Post menu
    Then The user able to see Posts text

  @wip
  Scenario:Navigation to My Account menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to sees welcome message
    And The user navigates to My Account menu
    Then The user able to see dashboard text