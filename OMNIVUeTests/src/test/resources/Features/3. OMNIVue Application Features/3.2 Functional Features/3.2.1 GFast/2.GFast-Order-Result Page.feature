@GFast_OrderSearchResults  @GFast_IST 
Feature: Verify in Omnivue GPON and G.fast order details at the Search Results level, given a “CSOF Order ID”


#Background: 
#Given I am logged in as a "Admin" user in Omnivue
#When I Click on "Search" tab in Omnivue Activation Screen
#And I select "Orders" in Search slider
#And I select "GPON" as Product-type in Order’s Search slider
#And I select "Customer Orders" form Order-type in Order’s Search slider
#And I enter the "Ensemble Order ID" value from excel in Search Slider 
#And I click on search button for "Orders" 
#Then I should see CSOF ID in Order Search Results tab


@GFast_OrderSearchResultPage
Scenario: @GFast_OrderSearchResultPage -Validate Excel Icon is present & clickable on Order Search results page 
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I select "Customer Orders" form Order-type in Order’s Search slider
And I enter the "Ensemble Order ID" value from excel in Search Slider 
And I click on search button for "Orders"
And I should see "Ensemble Order Number" in Order Search Results tab
When I am on the Order Search Results tab
Then I Validate "Excel" icon in Order Search Result tab


@GFast_OrderSearchResultPage
Scenario: @GFast_OrderSearchResultPage -Validate Printer Icon is present & clickable on Order Search results page 
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I select "Customer Orders" form Order-type in Order’s Search slider
And I enter the "Ensemble Order ID" value from excel in Search Slider 
And I click on search button for "Orders"
And I should see "Ensemble Order Number" in Order Search Results tab
When I am on the Order Search Results tab
Then I Validate "Printer" icon in Order Search Result tab


@GFast_OrderSearchResultPage
Scenario: @GFast_OrderSearchResultPage -Validate Arrange Columns Icon is present & clickable on Order Search results page 
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I select "Customer Orders" form Order-type in Order’s Search slider
And I enter the "Ensemble Order ID" value from excel in Search Slider 
And I click on search button for "Orders"
And I should see "Ensemble Order Number" in Order Search Results tab
When I am on the Order Search Results tab
Then I Validate "Arrange Columns" icon in Order Search Result tab

