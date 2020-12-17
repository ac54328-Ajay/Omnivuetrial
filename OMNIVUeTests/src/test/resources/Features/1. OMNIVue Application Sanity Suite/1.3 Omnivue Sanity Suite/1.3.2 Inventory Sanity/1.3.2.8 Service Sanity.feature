 @Sanity_check @Service_Sanity @OVSanity_Suite
Feature: Omnivue Service Sanity Check

  @Service_Search_Sanity_check 
  Scenario Outline: @Service_Search_Sanity_check -Verify Services 360 view is displayed for "<Search Service Type>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		Then I should see the "Service Search screen attributes" been displayed  
		
    Examples: 
      | Search Service Type	|
      | DSL OVC							|
      |	ENNI Link Service		|
      |	HSI									|
      |	Host Service				|
      |	IPTV								|
      |	IPTV Unicast				|      
      |	MEF ENNI						|
      |	MEF EVC							|
      |	MEF OVC							|
      |	MEF Service					|
      |	MEF UNI							|
      |	MGR UNI							|
      |	Mgmt EVC						|
      |	Mgmt UNI						|
      |	Probe UNI						|      
      
      
  @Service_Create_Sanity_check
  Scenario Outline: @Service_Create_Sanity_check -Verify "<Create Service Types>" Service Create screen is displayed
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "<Create Service Types>" for the drop down Service Type  
  	 And I click the "Launch Create Form" button
    Then I should see the "Service Create screen attributes" been displayed

Examples: 
  |Create Service Types	|
  |DSL OVC							|
	|ENNI Link						|
	|HSI									|
	|Host Service					|
	|IPTV									|
	|IPTV Unicast					|
	|MEF ENNI							|
	|MEF EVC							|
	|MEF OVC							|
	|MEF UNI							|
	|MGR UNI							|
	|Probe UNI						|