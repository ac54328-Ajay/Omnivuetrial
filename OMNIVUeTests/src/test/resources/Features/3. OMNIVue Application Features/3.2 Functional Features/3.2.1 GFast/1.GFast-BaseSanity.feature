@GFast_BaseSanity   @GFast_IST
Feature: Verify Omnivue GPON and G.fast main search screen functionality
         -Base sanity 

         
 #Background: Setup base Search criteria before specific search type
#Given I am logged in as a "Admin" user in Omnivue
#When I Click on "Search" tab in Omnivue Activation Screen
#And I select "Orders" in Search slider
#And I select "GPON" as Product-type in Order’s Search slider
#And I select "Customer Orders" form Order-type in Order’s Search slider       
  
@GFast_OrderNumberMenuSanity 
Scenario: @GFast_OrderNumberMenuSanity -Validate searching via Ensemble order id through Omnivue Search Slider
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I select "Customer Orders" form Order-type in Order’s Search slider     
#And I am on the expanded Search item with Product-type "GPON" selected
And I enter the "Ensemble Order ID" value from excel in Search Slider 
And I click on search button for "Orders"
And I should see "Ensemble Order Number" in Order Search Results tab
Then I should see an Order Search Results tab with "Ensemble Order Number" listed in the Search Parameters
And "Order ID" column should have a value
And "Action" column should have a value
And "Customer" column should have a value
And "Status" column should have a value
And "Due Date" column should have a value



#@GFast_Customer_OrderNumberSanity
#Scenario: @GFast_Customer_OrderNumberSanity -Validate searching via Ensemble Order & Customer name through Omnivue Search Slider
#Given I am on the expanded Search item with Product-type "GPON" selected
#When I enter CSOF Order Number in the CSOF Order ID field
#And I enter the "Ensemble Order & Customer Name" value from excel in Search Slider
#And I click on search button for "Orders"
#Then I should see an Order Search Results tab with "Ensemble Order & Customer Name" listed in the Search Parameters   
#And "Ensemble Order Number" column should have a value
#And "Order ID" column should have a value
#And "Action" column should have a value
#And "Customer" column should have a value
#And "Status" column should have a value
#And "Due Date" column should have a value
		 
# Not Possible
#@GFastgpon-TNMenuSanity @OV_Base_Sanity_TNMenu 
#Scenario: @GFast-TNMenuSanity -Validate searching via TN through Omnivue Search Slider
#Given I am on the expanded Search item with Product-type "GPON" selected
#When I select TN field and enter the TN
#And I enter the "TN" value from excel in Search Slider 
#And I click on search button for "Orders" 
#Then I should see an Order Search Results tab with "TN" listed in the Search Parameters 
#And "Order ID" column should have a value
#And "Ensemble Order Number" column should have a value
#And "Action" column should have a value
#And "Customer" column should have a value
#And "Status" column should have a value
#And "Due Date" column should have a value

# Not Possible
#@GFastgpon-CustNameMenuSanity @OV_Base_Sanity_CustNameMenu 
#Scenario: @GFast-CustNameMenuSanity -Validate searching via Customer Name through Omnivue Search Slider
#Given I am on the expanded Search item with Product-type "GPON" selected
#When I select the Customer Name field and enter the Customer Name
#And I enter the "Customer Name" value from excel in Search Slider 
#And I click on search button for "Orders" 
#And I should see "Customer" in Order Search Results tab
#Then I should see an Order Search Results tab with "Customer Name" listed in the Search Parameters 
#And "Order ID" column should have a value
#And "Ensemble Order Number" column should have a value
#And "Action" column should have a value
#And "Customer" column should have a value
#And "Status" column should have a value
#And "Due Date" column should have a value
         

         