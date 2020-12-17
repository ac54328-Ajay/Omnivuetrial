  @Search_Inventory @Search_Inventory_location @Regression
Feature: Search - Inventory - Loaction Side Validation 

As an OV inventory user I need the ability loaction Search side validation
  
  
    @TC165301
  Scenario: @TC165301 - Verify Google Sytle Search for Location
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Location" google search
    And I "click on GO button"
    And I should see the "Location Search screen values" been displayed
    
    
     @TC39197
  Scenario:  @TC39197 -OSIP-360 View Location - Individual Address_Verify Related Tab - Contacts Add Contact Button
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I searched for "TC44383-Location"
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And I verified view page and clicked on "Contacts" tab
    Then I validate Add contact button in contacts tab
    
    
    @TC122055
  Scenario: @TC122055 -Verify the data displayed in Circuits related tab in Location 360 view
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"   
    And I click on search button for "Circuit"    
  And I click on view icon in Search Result page   
   And In the 360 view I click on the "Locations" tab	   
  And I "launch the location displayed in the related tab screen"  
     And In the 360 view I click on the "Circuits" tab	
     Then I verify "Circuit details should be displayed in the Location Screen"     
    
     
         @TC122058
  Scenario: @TC122058 -Verify the data displayed in related tab Orders - Location 360 view
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "PON"   
    And I click on search button for "Circuit"    
  And I click on view icon in Search Result page   
   And In the 360 view I click on the "Locations" tab	   
  And I "launch the location displayed in the related tab screen"  
     And In the 360 view I click on the "Orders" tab
   Then I should see the "Order table in Location screen" been displayed 
   
  @TC122102
  Scenario: @TC122102 -Verify the data displayed in related tab Tasks - Location 360 view
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "PON"   
    And I click on search button for "Circuit"    
  And I click on view icon in Search Result page   
   And In the 360 view I click on the "Locations" tab	   
  And I "launch the location displayed in the related tab screen"  
     And In the 360 view I click on the "Tasks" tab
Then I should see the "Task table in Location screen" been displayed   
    
    
     @TC122104
  Scenario: @TC122104 -Verify the data displayed in related tab Service Area - Location 360 view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service Area" as Inventory type
    And I Enter Servicearea Full name as "Test"
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
     And In the 360 view I click on the "Locations" tab	   
  And I "launch the location displayed in the related tab screen"  
      And In the 360 view I click on the "Service Areas" tab
Then I should see the "Service Areas table in Location screen" been displayed   

@TC167062
    Scenario: @TC167062 -Verify the data displayed in related tab Devices - Location 360 view
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"   
    And I click on search button for "Circuit"    
  And I click on view icon in Search Result page   
   And In the 360 view I click on the "Locations" tab	   
  And I "launch the location displayed in the related tab screen"  
     And In the 360 view I click on the "Devices" tab
   Then I should see the "Devices table in Location screen" been displayed 
   
     @TC39208  
  Scenario: @TC39208 -Related Tab - Subscriber - Add Subscriber Association_Verify the newly added subcriber is displayed in the Related System Subscriber section
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Individual Location" in Location Advance Search screen 
    And I click on Advance search button for "Individual Location"          
    And I click on view icon in Search Result page 
    And I verified view page and clicked on "Subscribers" tab
    And I verify "Subscriber related tab section in the Location Screen"
		And I click on "Add Subscriber Association button" on Location page
		 Then I verify "New subscriber should get associated in Subscribers related tab"
		 
	 @TC39225  
  Scenario: @TC39225 -Verify the Add Subscriber association button in Location screen
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Individual Location" in Location Advance Search screen 
    And I click on Advance search button for "Individual Location"          
    And I click on view icon in Search Result page 
    And I verified view page and clicked on "Subscribers" tab
    Then I verify "Subscriber related tab section in the Location Screen"

	

###########################		Address Range		######################################  
		 
@TC67926  
  Scenario: @TC67926 -Validate result header while searching for address range.
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Address Range" in Location Advance Search screen   
    And I click on Advance search button for "Address Range"
    Then I verify "address attributes are appearing as separate input fields while searcching for address range"          
    And I click on view icon in Search Result page 
     Then I should see the "Location Search screen attributes" been displayed  
    
@TC86219  
  Scenario: @TC86219 -Validate result header tab consist of Low Street no.-High Street no. Street name on view of Address range.
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Address Range" in Location Advance Search screen   
    And I click on Advance search button for "Address Range"
    Then I verify "address attributes are appearing as separate input fields while searcching for address range"          
    And I click on view icon in Search Result page 
     #And I should see the "Location Search screen attributes" been displayed  
     Then I verify "address range Tab is combination of 'Low Street no.-High Street no. Street name'"
     
     
      @TC291486  
  Scenario: @TC291486 -Verify Related tab Contact from related system tab of Locations 
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Individual Location" in Location Advance Search screen 
    And I click on Advance search button for "Individual Location"          
    And I click on view icon in Search Result page 
     And I verified view page and clicked on "Contacts" tab
    And I click on view icon in contacts related tab and I validate contact page
    
      
    
    @TC291486_22
 Scenario Outline: @TC291486_22 -Verify data displayed in the related tabs for Contacts - "<Device role>" devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab   
   	And I go to "Inventory" Search type and select "Device" as Inventory type 
 		And I clicked on Advance Search for "Devices"
 		And I select the device role as "<Device role>" in Device advance search
 		And I click on Advance search button for "Device" 		
 		And I click on view icon in Search Result page  
 		When In the 360 view I click on the "Contacts" tab
 		Then I Click on  Add Contact button	
 		And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen  	
		Then I verify "Contact data is displayed in the Device Screen and validate the view icon"
		
		Examples: 
    |Device role	|
    |OLT					|