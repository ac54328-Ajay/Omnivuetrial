@GFast_DeviceViewRelatedTab  @GFast_IST
Feature: Verify in Omnivue GPON and G.fast orders issued via Simon
A spreadsheet will be utilized for the required input of the Simon Order. Details of data passed will need to be documented.


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
And In the 360 view I click on the "Devices" tab
And I verify for "DSLAM" Network role
And I Click on Device Name link in Identifiers Section
And I should see tab name should match with the Device name link
Then I should see DSLAM Device opened in a separate tab

@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -BAM Report Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "BAM Report" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I should see "BAM event logs" displayed


@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -Circuits Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Circuits" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I should see "Circuit columns" displayed

@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -Device Ports Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Device Ports" tab
Then I verify that the "Bulk Card Update, Bulk Port Update, Add Shelves and Groom UNI" Buttons is present and clickable in 360 view related tab
And I should see "G.Fast port & Serives associated" displayed

@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -Locations Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Locations" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I Validate "Location Tab" section in Search page with excel data 

@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -Contacts Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Contacts" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I Validate "Contacts Tab" section in Search page with excel data 

@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -Orders Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Orders" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I Validate "Orders Tab" section in Search page with excel data 

@GFast_DeviceViewRelatedTab
Scenario: @GFast_DeviceViewRelatedTab -Services Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Services" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Services Details" displayed
Then I validate "Services" displayed in the related tab

@GFast_DeviceViewRelatedTab @TEST12545
Scenario: @GFast_DeviceViewRelatedTab -Subscribers Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Subscribers" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Subscribers Details" displayed
Then I validate "Subscribers" displayed in the related tab

@GFast_DeviceViewRelatedTab 
Scenario: @GFast_DeviceViewRelatedTab -Tasks Related Tab
Given I should see DSLAM Device opened in a separate tab
When In the 360 view I click on the "Tasks" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Task details" displayed
Then I validate "Tasks" displayed in the related tab
