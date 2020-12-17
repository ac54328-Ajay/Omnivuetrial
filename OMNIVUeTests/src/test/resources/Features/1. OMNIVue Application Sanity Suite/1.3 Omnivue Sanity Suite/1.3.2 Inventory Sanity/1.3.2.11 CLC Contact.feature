  @Sanity_check @CLC_Contact_Sanity @OVSanity_Suite
Feature: Omnivue CLC Contact Sanity Check
 
 @CLC_Contact_Create_Sanity_check 
   Scenario: @CLC_Contact_Create_Sanity_check -Verify CLC Contact 360 Create screen is displayed
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"     
    And I click the "Launch Create Form" button
    Then I should see the "CLC Contact Create screen attributes" been displayed