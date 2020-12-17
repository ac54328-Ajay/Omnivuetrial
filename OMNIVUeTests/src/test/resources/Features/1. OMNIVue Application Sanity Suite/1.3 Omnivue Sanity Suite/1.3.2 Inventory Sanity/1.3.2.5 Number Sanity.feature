 @Sanity_check @Number_Sanity @OVSanity_Suite
Feature: Omnivue Number Sanity Check

 #@Number_Search_Sanity_check 
 # Scenario Outline: Verify Number 360 view is displayed
 #   Given I am logged in as a "Adminrole" user in Omnivue   
 #   And I click on "Search" tab
 #   And I go to "Inventory" Search type and select "Number" as Inventory type
 #   And I select Circuit type as "<Circuit types>"   
 #   And I click on search button for "Circuit"    
 #   And I click on view icon in Search Result page 
 #   Then I should see the "Circuit Search screen attributes" been displayed  
    
 #Examples: 
 #  |Circuit types							|
 #  |Ethernet Bearer						|

   
   
  @Number_Create_Sanity_check 
   Scenario Outline: Verify Number 360 Create screen is displayed for "<Number create Types>"
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Number"  
  	And I select Technology type "Ethernet" under Number Create slider
		Then I select Number type as "<Number create Types>" under Number Create slider
    And I click the "Launch Create Form" button
    Then I should see the "Number Create screen attributes" been displayed
    
   Examples: 
   |Number create Types		|
   |CE-VLAN       				| 
   |S-VLAN    						|
  