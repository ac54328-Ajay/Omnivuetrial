 @Sanity_check @Contact_Sanity @OVSanity_Suite
Feature: Omnivue Contact Sanity Check


@Contact_Create_Sanity_check
  Scenario: @Contact_Create_Sanity_check -Verify Contact 360 Create screen is displayed
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
   Then I should see the "Contact Create screen attributes" been displayed
   
   
 @Contact_Search_Sanity_check 
  Scenario: @Contact_Search_Sanity_check -Verify Contact 360 view is displayed
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Contact" as Inventory type
    And I "search with Contact first name as AUTO" 
    And I click on search button for "Contact"    
    And I click on view icon in Search Result page 
    Then I should see the "Contact Search screen attributes" been displayed  