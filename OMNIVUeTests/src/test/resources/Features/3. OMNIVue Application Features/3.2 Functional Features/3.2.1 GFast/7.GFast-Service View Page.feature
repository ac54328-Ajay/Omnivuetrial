@GFast_ServiceView360   @GFast_IST 
Feature: Verify Omnivue GPON and G.fast orders Service features
         -Base sanity 
         
Background: 
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I select "Customer Orders" form Order-type in Order’s Search slider
And I enter the "Ensemble Order ID" value from excel in Search Slider 
And I click on search button for "Orders"
Then I am on the Order Search Results tab
And I click on magnifying glass for the selected Order number
Then A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "HSI" section Service ID field
Then A new tab nnnnnnnnnn-"HSI" will open
         
         
@GFast_ServiceView @TESTERT2134
Scenario: @GFast_ServiceView -HSI Services Section
Given I am on the nnnnnnnnnn -HSI tab
When I click on "HSI Details" tab on Service Search page
Then I Validate "HSI General" section in Service Search page with excel data

@GFast_ServiceView @TESTERT2134
Scenario: @GFast_ServiceView -Associated Services Section
Given I am on the nnnnnnnnnn -HSI tab
When I click on "HSI Details" tab on Service Search page
Then I Validate "Associated Services" section in Service Search page with excel data

@GFast_ServiceView 
Scenario: @GFast_ServiceView -Associated VLAN Section
Given I am on the nnnnnnnnnn -HSI tab
When I click on "HSI Details" tab on Service Search page
Then I Validate "Associated Vlan" section in Service Search page with excel data

@GFast_ServiceView 
Scenario: @GFast_ServiceView -Associated Services Section in Association Tab
Given I am on the nnnnnnnnnn -HSI tab
When I click on "Associations" tab on Service Search page
Then I Validate "Association Details" section in Service Search page with excel data

@GFast_ServiceView 
Scenario: @GFast_ServiceView -Associated Services VLAN_Segments Section in Association Tab
Given I am on the nnnnnnnnnn -HSI tab
When I click on "Associations" tab on Service Search page
Then I Validate "Associated Vlan Segments" section in Service Search page with excel data

@GFast_ServiceView   
Scenario: @GFast_ServiceView -Facility_Details Section
Given I am on the nnnnnnnnnn -HSI tab
When I click on "Facility Details" tab on Service Search page
Then I Validate "Facility Circuit Layout" section in Service Search page with excel data

@GFast_ServiceView 
Scenario: @GFast_ServiceView -ARM Audit Logs Section
Given I am on the nnnnnnnnnn -HSI tab
When I click on "Audit logs" tab on Service Search page
When I Click on "ARM Audit Logs" tab
And I Click on Get Log button
Then I should see Export to Excel icon and Print icon
And I should see "ARM Audit Logs" Table getting displayed in Audit tab
And ARM Audit Logs Section validation passes

@GFast_ServiceView 
Scenario: @GFast_ServiceView -OMNIVUE Audit Logs Section
Given I am on the nnnnnnnnnn -HSI tab
When I click on "Audit logs" tab on Service Search page
When I Click on "OMNIVUE Audit Logs" tab 
Then I should see Export to Excel icon, Refresh icon and Print icon
And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab
And OMNIVUE Audit Logs Section validation passes
