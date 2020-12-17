@Search_Inventory @Search_Inventory_Topology @Regression
Feature: Search Inventory Topology validations

 @US131258 @TC199163
 Scenario: @TC199163 Verify OLT Ring and PON Collector is not available for Topology Type in Search dropdown
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    Then I verify the OLT RING & PON Collector Topology Technology Type should not be displayed in "Search" slider
    
 
 @US131585 @TC199784 @TC172638 @TC199784_
 Scenario: @TC199784 CR6168_US131585_Verify the order and values for topology technology type when topology role is ethernet topology from Search dropdown and Advance Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Ethernet Topology" in search tab 
 		Then I should see the "Topology Technology Type values for Ethernet Topology under Search slider" been displayed
 		And I clicked on Advance Search for "Topology"
 		And I Select Topology type as "Generic Network" and Topology Role as "Ethernet Topology" in Advance Search Topology  
		Then I should see the "Topology Technology Type values for Ethernet Topology under Advance Topology search" been displayed  
		
@TC174087	
Scenario: @TC174087 US135028_Search for a Generic Topology with Topology Role as Host Client or Satelite
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab  		
 	 	And I click on search button for "Inventory"nt or Satellite" been displayed  		
		And I verify "Topology having Role Host Client or Satellite and Technology Type as Juniper MX 
 	 	And I verify "Topology having Role Host Client or Satellite and Technology Type as ALU-Nokia 7750 series in the Topology search result"
		Then I should see the "Technology Type as ALU-Nokia 7750 series with Role as Host Clieseries in the Topology search result"
		Then I should see the "Technology Type as Juniper MX series with Role as Host Client or Satellite" been displayed  