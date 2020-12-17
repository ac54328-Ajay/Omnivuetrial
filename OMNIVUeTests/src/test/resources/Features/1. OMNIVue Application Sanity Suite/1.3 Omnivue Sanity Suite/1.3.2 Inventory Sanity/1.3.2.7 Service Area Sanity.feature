 @Sanity_check @Servicearea_Sanity @OVSanity_Suite
Feature: Omnivue Service Area Sanity Check

 #@Sanity 
 # Scenario: Verify Subscriber Area 360 view is displayed
 #   Given I am in omnivue url
 #   When I log in as a "Admin" user
 #   And I click on "Search" tab
 #   And I go to "Inventory" Search type and select "Service Area" as Inventory type    
 #   And I enter Service Area Name as "TEST%"
 #   And I click on search button for "Inventory"    
 #   Then I click on view icon in Search Result page   
    
     @Sanity_Create_Servicearea 
  Scenario: @Sanity_Create_Servicearea -OV-Validating create subscriber screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    Then I should see the "Servicearea Create screen attributes" been displayed

  @Sanity_Search_Servicearea
  Scenario: @Sanity_Search_Servicearea -OV-Validating Search subscriber screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service Area" as Inventory type
    And I Enter Servicearea Full name as "SERVICE_AREA"
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    Then I should see the "Servicearea Search screen attributes" been displayed