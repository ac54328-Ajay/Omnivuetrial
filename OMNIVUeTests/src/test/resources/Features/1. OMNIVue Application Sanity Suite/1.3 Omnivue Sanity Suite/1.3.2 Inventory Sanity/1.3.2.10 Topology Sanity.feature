 @Sanity_check @Topology_Sanity @OVSanity_Suite
Feature: Omnivue Sanity Check Topology


  @Topology_Create_Sanity_Check 
  Scenario Outline: @Topology_Create_Sanity_Check -Verify Topology Create Page for "<Create Topology Types>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
  	And I select "<Create Topology Types>" Topology type under Create Tab
  	And I select "CO - Colorado" as state
  	And I click the "Launch Create Form" button
    Then I should see the "Topology Create screen attributes" been displayed
 
 		Examples: 
 			|Create Topology Types |
  		|Generic Network 			 |
  		|MEN Topology					 |
			|PON Network  	 			 |
			
	@Topology_Search_Sanity_Check 
  Scenario Outline: @Topology_Search_Sanity_Check  -Verify Topology 360 view is displayed for "<Search Topology Type>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab    
    And I go to "Inventory" Search type and select "Topology" as Inventory type   
     And I select Topology type as "<Search Topology Type>" in search tab   
    And I click on search button for "Topology"
    And I click on view icon in Search Result page
		Then I should see the "Topology Search screen attributes" been displayed
		
			Examples: 
 			|Search Topology Type |
  		|Generic Network 			|
  		|MEN Topology					|
			|PON Network  	 			|