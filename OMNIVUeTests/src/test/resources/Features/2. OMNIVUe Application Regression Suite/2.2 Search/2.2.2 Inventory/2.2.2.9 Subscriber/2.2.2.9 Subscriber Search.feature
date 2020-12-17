  @Search_Inventory @Search_Inventory_Subscriber @Regression  @CheckTeste @Reg_Subscriber
Feature: Search - Inventory - Subscriber Side Validation 

As an OV inventory user I need the ability Subscriber Search side validation


 @TC165299
  Scenario: @TC165299 -Verify Google Sytle Search for Subscriber Full Name
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Subscriber" google search
    And I "click on GO button"
    And I should see the "Subscriber Search screen values" been displayed

@TC121821 
  Scenario: @TC121821 -Verify the data displayed in related tab Circuits - Subscriber 360 view screen
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"   
    And I click on search button for "Circuit"    
   And I "search for circuit having subscriber data"
    And In the 360 view I click on the "Circuits" tab
  	Then I verify "Circuit details should be displayed in the Subscriber Screen"
  	
  	
  	
@TC121822 
  Scenario: @TC121822 -Verify the data displayed in related tab Tasks- Subscriber 360 view screen
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"   
    And I click on search button for "Circuit"    
   And I "search for circuit having subscriber data"
    And In the 360 view I click on the "Tasks" tab
  	Then I verify "Task data is been displayed in the Task Related Tab"
  	
@TC121823   	
  	Scenario: @TC121823 -Verify the data displayed in related tab Locations - Subscriber 360 view screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Subscriber" as Inventory type
    And I Enter Subscriber Full name as "Test - Janet"
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
   And In the 360 view I click on the "Locations" tab
  	Then I verify "Location data is been displayed in the Locations Related Tab"
  	
  	
  	
  	@TC121826 
Scenario: @TC121826 -Verify the data displayed in related tab Contacts - Subscriber 360 view screen
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "IPTV"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "IPTV" section Service ID field
And A new tab nnnnnnnnnn-"<Service Type>" will open
And In the 360 view I click on the "Subscribers" tab
And I "launch the subscriber by clicking on the view icon in the related tab"
And In the 360 view I click on the "Contacts" tab
	Then I verify "Contact data is been displayed in the Contacts Related Tab"
	
	  	
  	
  	@TC121827 
Scenario: @TC121827 -Verify the data displayed in related tab Services - Subscriber 360 view screen
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "IPTV"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "IPTV" section Service ID field
And A new tab nnnnnnnnnn-"<Service Type>" will open
And In the 360 view I click on the "Subscribers" tab
And I "launch the subscriber by clicking on the view icon in the related tab"
And In the 360 view I click on the "Services" tab
	Then I verify "Service data is been displayed in the Services Related Tab"
