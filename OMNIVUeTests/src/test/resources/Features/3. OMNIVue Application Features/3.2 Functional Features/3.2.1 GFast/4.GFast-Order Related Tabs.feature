@GFast_OrderViewRelatedTab  @GFast_IST
Feature: Verify in Omnivue GPON and G.fast order details after hitting the View magnifying glass on the Order Search Page, bringing up the Order Id: nnnnn tab in the 360 view


#Background: 
#Given I am logged in as a "Admin" user in Omnivue
#When I Click on "Search" tab in Omnivue Activation Screen
#And I select "Orders" in Search slider
#And I select "GPON" as Product-type in Order’s Search slider
#And I select "Customer Orders" form Order-type in Order’s Search slider
#And I enter the "Ensemble Order ID" value from excel in Search Slider 
#And I click on search button for "Orders" 
#Then I am on the Order Search Results tab
#And I click on magnifying glass for the selected Order number
#Then A new tab Order Id:nnnnnn will open with an Order details sub tab


@GFast_OrderViewRelatedTab 
Scenario: @GFast_OrderViewRelatedTab -BAM Related Tab
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
And I view the Order Details section 
And In the 360 view I click on the "BAM Report" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I should see "BAM event logs" displayed

@GFast_OrderViewRelatedTab
Scenario: @GFast_OrderViewRelatedTab -Device Related Tab
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
And I view the Order Details section
And In the 360 view I click on the "Devices" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Devices" displayed
Then I validate "OLT & DSLAM role devices" displayed in the related tab

@GFast_OrderViewRelatedTab 
Scenario: @GFast_OrderViewRelatedTab -Services Related Tab
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
And I view the Order Details section
And In the 360 view I click on the "Services" tab
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
And I should see "Services Details" displayed
Then I validate "Services" displayed in the related tab

@GFast_OrderViewRelatedTab 
Scenario: @GFast_OrderViewRelatedTab -Tasks Related Tab
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
And I view the Order Details section
And In the 360 view I click on the "Tasks" tab
And I should see "Task details" displayed
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I validate "Tasks" displayed in the related tab

@GFast_OrderViewRelatedTab 
Scenario: @GFast_OrderViewRelatedTab -Tirks Related Tab
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
And I view the Order Details section
And In the 360 view I click on the "TIRKS" tab
And I should see "CD and WA tabs" displayed
And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
Then I validate "Tirks" displayed in the related tab
