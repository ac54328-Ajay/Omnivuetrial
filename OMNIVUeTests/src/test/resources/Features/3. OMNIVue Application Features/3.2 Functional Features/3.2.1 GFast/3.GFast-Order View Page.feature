@GFast_OrderView360   @GFast_IST 
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



@GFast_OrderView 
Scenario: @GFast_OrderView -Order Details Section
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
And I validate the field values in "Order Details Section" with excel data
Then Order Details Section validation passes

@GFast_OrderView 							
Scenario: @GFast_OrderView -Avail. Actions Section
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
And I validate Available Action buttons based on Order status 
Then Available Actions Section validation passes

@GFast_OrderView
Scenario: @GFast_OrderView -Customer Details Section
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
And I validate the field values in "Customer Details Section" with excel data
Then Customer Details Section validation passes

@GFast_OrderView 
Scenario: @GFast_OrderView -Contact Details Section
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
And I validate the field values in "Contact Details Section" with excel data
Then Contact Details Section validation passes

@GFast_OrderView 
Scenario: @GFast_OrderView -Location Details Section
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
And I validate the field values in "Location Details Section" with excel data
Then Location Details Section validation passes

@GFast_OrderView 
Scenario: @GFast_OrderView -HSI Section
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
And ServiceID field is a clickable hyperlink to "HSI" section
And I validate the field values in "HSI Service Section" with excel data
Then Service Section validation passes

@GFast_OrderView
Scenario: @GFast_OrderView -IPTV Section
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
And ServiceID field is a clickable hyperlink to "IPTV" section
And I validate the field values in "IPTV Service Section" with excel data 
Then Service Section validation passes

@GFast_OrderView 
Scenario: @GFast_OrderView -Dispatch Details Section
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
And I validate the field values in "Dispatch Details Section" with excel data 
Then Dispatch Details Section validation passes

@GFast_OrderView 
Scenario: @GFast_OrderView -Other Details Section
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
And I validate the field values in "Other Details Section" with excel data 
Then Other Details Section validation passes
