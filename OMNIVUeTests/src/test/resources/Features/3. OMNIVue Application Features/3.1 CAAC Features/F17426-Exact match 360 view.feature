@F17426
Feature: Exact match - 360 view : if Search (solr/Quick/Adv) results to one exact match then OV should display detail view (currently OV is displaying grid list)

Background: Login-in to the Omnivue Applications & validate the systems are up & running
Given I am logged in as a "Admin" user in Omnivue


#########################################################################################################################################################
############											US158982 : Exact match - 360 view - Advanced search																					###########################
############		As an inventory user I need the ability to display the Detailed view if Adv search results in exact match			###########################
#########################################################################################################################################################


@US158982 @TC187606 @P11 @Sprint236
Scenario: @TC187606 -Validation of 360 view on Advanced search for ORDERS
Given I Click on "Search" tab in Omnivue Activation Screen
When I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I Search with "CSOFID" through slider with data from Order Advanced Search result
And I click on search button for "Orders"
Then Verify the direct 360 view page and Adv search results match
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
#And I validate Order details tab with Order Advanced Search result data


@US158982 @TC187616 @P11 @Sprint236
Scenario: @TC187616 -Validation of 360 view on Advanced search for CIRCUIT
Given I click on "Search" tab
And I go to "Inventory" Search type and select "Circuit" as Inventory type
And I clicked on Advance Search for "Circuit"
And I Search "Circuit" with "PON" in Advance search screen
And I click on Advance search button for "Circuit"
And I Search with "Circuit Name" through Search slider with data from "Circuit" Advanced Search result
And I click on search button for "Circuit"
Then Verify the direct 360 view page and Adv search results match
And A new tab with "Circuit" name will open
#And I validate Circuit details tab with Advanced Search result data


@US158982 @TC187941 @P11 @Sprint236
Scenario: @TC187941 -Validation of 360 view on Advanced search for Contact
Given I click on "Search" tab
And I go to "Inventory" Search type and select "Contact" as Inventory type
And I clicked on Advance Search for "Contact"
And I Search "Contacts" with "Category-Help Desk" in Advance search screen
And I click on Advance search button for "Contacts"
And I Search with "First/Name" through Search slider with data from "Contact" Advanced Search result
And I click on search button for "Contact"
Then Verify the direct 360 view page and Adv search results match
And A new tab with "Contact" name will open


@US158982 @TC187980 @P11 @Sprint236
Scenario: @TC187980 Validation of 360 view on Advanced search for Device
Given I click on "Search" tab
And I go to "Inventory" Search type and select "Device" as Inventory type
And I clicked on Advance Search for "Device Search"
And I select the device role as "ONT" in Device advance search
And I click on Advance search button for "Device"
And I Search with "Device Name" through Search slider with data from "Device" Advanced Search result
And I click on search button for "Device"
Then Verify the direct 360 view page and Adv search results match
And A new tab with "Device" name will open

@US158982 @TC187981 @P11 @Sprint236
Scenario: @TC187981 Validation of 360 view on Advanced search for Individual Location
Given I click on "Search" tab
And I go to "Inventory" Search type and select "Location" as Inventory type
And I clicked on Advance Search for "Location"
And I Search "Location" with "State as Florida" in Advance search screen
And I click on Advance search button for "Location"
And I Search with "Location" through Search slider with data from "Location" Advanced Search result
And I click on search button for "Location"
Then Verify the direct 360 view page and Adv search results match
And A new tab with "Location" name will open
