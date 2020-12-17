@GFast_DeviceView360  @GFast_IST 
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



@GFast_DeviceView 
Scenario: @GFast_DeviceView -launch of DSLAM Device from the Order view Related Tab
Given I should see DSLAM Device opened in a separate tab
And I verify that the "Refresh" icon is present and clickable
And I verify that the "Revert" icon is present and clickable
And I verify that the "Edit" icon is present and clickable

@GFast_DeviceView  
Scenario: @GFast_DeviceView -Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "Information" section in Search page with excel data

@GFast_DeviceView
Scenario: @GFast_DeviceView -Identifiers Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "Identifiers" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -Device Type Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "Device Type" section in Search page with excel data

@GFast_DeviceView  
Scenario: @GFast_DeviceView -IP Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "IP Information" section in Search page with excel data

@GFast_DeviceView 
 Scenario: @GFast_DeviceView -Subscriber Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "Subscriber Information" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -Qualification Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "Qualification Information" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -Topology Membership Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Device Details" tab on Device Search page
Then I Validate "Topology MemberShip" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -Network Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Networking Details" tab on Device Search page
Then I should see Refresh icon and Edit Device Details button
Then I Validate "Network Information" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -Manufacturer Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Networking Details" tab on Device Search page
Then I should see Refresh icon and Edit Device Details button
Then I Validate "Manufacturer Information" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -Network Information Section
Given I should see DSLAM Device opened in a separate tab
When I Click on "Networking Details" tab on Device Search page
Then I should see Refresh icon and Edit Device Details button
Then I Validate "Network Information Section 2" section in Search page with excel data

@GFast_DeviceView 
Scenario: @GFast_DeviceView -ARM Audit Logs
Given I should see DSLAM Device opened in a separate tab
And I Click on "Audit Log" tab on Device Search page
When I Click on "ARM Audit Logs" tab
And I Click on Get Log button
Then I should see Export to Excel icon and Print icon
And I should see "ARM Audit Logs" Table getting displayed in Audit tab
And ARM Audit Logs Section validation passes

@GFast_DeviceView 
Scenario: @GFast_DeviceView -OMNIVUE Audit Logs
Given I should see DSLAM Device opened in a separate tab
And I Click on "Audit Log" tab on Device Search page
When I Click on "OMNIVUE Audit Logs" tab 
Then I should see Export to Excel icon, Refresh icon and Print icon
And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab
And OMNIVUE Audit Logs Section validation passes
