 @Sanity_check @Circuit_Sanity @OVSanity_Suite
Feature: Omnivue Circuit Sanity Check
    
   @Circuit_Search_Sanity_check
  Scenario Outline: @Circuit_Search_Sanity_check -Verify Circuit 360 view is displayed for "<Circuit types>"
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"   
    And I click on search button for "Circuit"    
    And I click on view icon in Search Result page 
    Then I should see the "Circuit Search screen attributes" been displayed  
    
 Examples: 
   |Circuit types							|
   |Ethernet Bearer						|
   |LAG												|
   |Optical Bearer						|
   |PON												|
   |PW Unrouted (Path)				|
   |Topology Virtual Circuit	|
   |Transport Path						|
   |VLAN Segment							|
   
   
  @Circuit_Create_Sanity_check 
   Scenario Outline: @Circuit_Create_Sanity_check -Verify Circuit 360 Create screen is displayed for "<Circuit create Types>"
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"  
   And I select Circuit type as "<Circuit create Types>" under create tab
    And I click the "Launch Create Form" button
    Then I should see the "Circuit Create screen attributes" been displayed
    
   Examples: 
   |Circuit create Types		|
   |Ethernet Bearer       	| 
   |LAG    									|
   |Optical Bearer       		|
   |PON        	        		|
   |Pseudo Wire					 		| 
   |Topology Virtual Circuit|
   |VLAN Segment      	 		|   