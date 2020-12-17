@GFast_ServiceViewRelatedTab   @GFast_IST 
Feature: Verify Omnivue GPON and G.fast orders Service Related Tabs features
         
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


@GFast_ServiceViewRelatedTab 
Scenario: @GFast_ServiceViewRelatedTab -Bam Report Related Tab
Given I am on the nnnnnnnnnn -HSI tab
When In the 360 view I click on the "BAM Report" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I should see "BAM event logs" displayed

@GFast_ServiceViewRelatedTab   
 Scenario: @GFast_ServiceViewRelatedTab -Locations Related Tab
Given I am on the nnnnnnnnnn -HSI tab
When In the 360 view I click on the "Locations" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I Validate "Location Tab" section in Search page with excel data 

@GFast_ServiceViewRelatedTab 
Scenario: @GFast_ServiceViewRelatedTab -Order Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Orders" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Order columns" displayed
Then I Validate "Orders Tab" section in Search page with excel data 

@GFast_ServiceViewRelatedTab
Scenario: @GFast_ServiceViewRelatedTab -Subscribers Related Tab
Given I am on the nnnnnnnnnn -HSI tab
When In the 360 view I click on the "Subscribers" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Subscribers Details" displayed
Then I validate "Subscribers" displayed in the related tab

@GFast_ServiceViewRelatedTab 
Scenario: @GFast_ServiceViewRelatedTab -Tasks Related Tab
Given I am on the nnnnnnnnnn -HSI tab
When In the 360 view I click on the "Tasks" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Task details" displayed
Then I validate "Tasks" displayed in the related tab

@GFast_ServiceViewRelatedTab 
Scenario: @GFast_ServiceViewRelatedTab -Devices Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Devices" tab
Then I should see "Devices" displayed
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I validate "OLT & DSLAM role devices" displayed in the related tab

@GFast_ServiceViewRelatedTab  
Scenario: @GFast_ServiceViewRelatedTab -Circuits Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Circuits" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I should see "Circuit columns" displayed

@GFast_ServiceViewRelatedTab  
Scenario: @GFast_ServiceViewRelatedTab -Service Area Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Service Areas" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Service Areas columns" displayed
Then I validate "Service Areas" displayed in the related tab

@GFast_ServiceViewRelatedTab
Scenario: @GFast_ServiceViewRelatedTab -Tirks Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "TIRKS" tab
And I should see "CLO List tab" displayed
Then I validate "Tirks" displayed in the related tab
 
@GFast_ServiceViewRelatedTab  
Scenario: @GFast_ServiceViewRelatedTab -Performance Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Performance" tab
Then I validate "Performance details" displayed in the related tab
 
@GFast_ServiceViewRelatedTab 
Scenario: @GFast_ServiceViewRelatedTab -Virtual Ports Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Virtual Ports" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Virtual Ports columns" displayed
Then I validate "Virtual Ports" displayed in the related tab

@GFast_ServiceViewRelatedTab 
Scenario: @GFast_ServiceViewRelatedTab -Services Related Tab
Given I am on the nnnnnnnnnn -HSI tab
And In the 360 view I click on the "Services" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Associated Services Tab" displayed
Then I validate "Associated Services" displayed in the related tab