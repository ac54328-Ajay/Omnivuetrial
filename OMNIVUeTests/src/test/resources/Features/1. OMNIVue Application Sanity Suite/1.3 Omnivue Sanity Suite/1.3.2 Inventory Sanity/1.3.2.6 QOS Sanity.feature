 @Sanity_check @QOSTemplate_Sanity @OVSanity_Suite
Feature: Omnivue QOS Template Sanity Check


 @QOSTemplate_Search_Sanity_check 
  Scenario: @QOSTemplate_Search_Sanity_check -Verify QOS Template 360 view is displayed
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "QOS Template" as Inventory type
    And I search QOS Template with Template name as "TEST"
    And I click on search button for "Inventory"    
    And I click on view icon in Search Result page 
    Then I should see the "QOS Template Search screen attributes" been displayed  
    
    
    @QOSTemplate_Create_Sanity_check 
   Scenario: @QOSTemplate_Create_Sanity_check -Verify QOS Template 360 Create screen is displayed
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "QOS Template"   
    And I click the "Launch Create Form" button
    Then I should see the "QOS Template Create screen attributes" been displayed