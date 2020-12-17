 @Sanity_check  @OVSanity_Suite
 Feature: Sanity check on each build
  
  
  @Sanity @Sanity_login 
  Scenario: OV- Validating login page of Omnivue
    Given I am in omnivue url
    When I am in the Omnivue Welcome page
    And I need to check User login box
    And I need to check OSR, DSP, MOB, ARM, ICL, CLC System are up & running in Omnivue page
    Then I log in as a "Admin" user
    
  @Sanity @Sanity_login 
  Scenario: Verify OMNIVUE Version is displayed
    Given I am in omnivue url
    Then OMNIVUE Version should be displayed in Login Page

  @Sanity @Sanity_login 
  Scenario: Verify user is able to perform successful login
    Given I am in omnivue url
    When I log in as a "Admin" user
    Then User should be navigated to "Activations" Page
    
   @Sanity @Sanity_logout
  Scenario: Verify user is able to perform successful Logout
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Gear Icon" in Omnivue Homepage		
    And I select "Logout" under the Gear Icon
    Then User should be navigated to "Logout" Page
    
     @Sanity @Sanity_login @Google_style
  Scenario: Verify user is able to perform successful login
    Given I am in omnivue url
    When I log in as a "Admin" user
    And User should be navigated to "Activations" Page
    Then I verify SOLR Suggestions for "Device" google search
    
    