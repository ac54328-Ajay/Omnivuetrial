@Search_Orders @Search_Orders_MLTO @Regression  @CheckTeste
Feature: CR4701 GPON Market Launch Test Orders (MLTO) July US65043

As an inventory user I need the ability to create an order in the native provisioning system, which mimics order flow from the order entry system, so that I can test the infrastructure build, 
activation, and dispatch flow and release the addresses and equipment associated with a new engineering build

@TC258074
Scenario: @TC258074 -Verify the Export to excel ,Print and Refresh icon functionality of Orders Related tab in Circuit ,Device ,Location and Service Details screen
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"   
And I click on view icon in Search Result page
And In the 360 view I click on the "BAM Report" tab
	And I should see "BAM event logs" displayed
	Then I verify "Configuration column, Refresh icon, Excel export, Print Icon, Get Logs & From Archieve checkbox is displayed"
	 When In the 360 view I click on the "Devices" tab
	 Then I verify "Refresh icon, Edit button & Revert button is displayed in Device Related Tab"
And In the 360 view I click on the "Services" tab
Then I verify "Refresh Icon, Excel export & Print Icon is displayed in Service Related Tab"
And In the 360 view I click on the "Tasks" tab
Then I verify "Configuration column, Refresh icon, Excel export & Print Icon is displayed in Task Related Tab"

@TC165236
Scenario: @TC165236 -Verify service name is displayed for HSI Order in Related tab service for a Customer Order
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"   
And I click on view icon in Search Result page 
And In the 360 view I click on the "Services" tab
Then I verify "service name is displayed for HSI Order should be in services Related tab"


@TC165235
Scenario: @TC165235 -Validate Device information in Related tab Devices in Order 360 view for Customer Order
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"   
And I click on view icon in Search Result page 
 And In the 360 view I click on the "Devices" tab
Then I verify "Device information is displayed in Related tab Devices in Order 360 view for Customer Order"
		 
@TC106756
Scenario: @TC106756 -Validate Task information in Related tab Tasks in Order 360 view for Network Order
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"   
		 And I click on view icon in Search Result page  
		 And I verify "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen"
		 And In the 360 view I click on the "Tasks" tab
Then I should see the "Task related to Order should" been displayed  

@TC106753
Scenario: @TC106753 -Validate Device information in Related tab Devices in Order 360 view for Network Order
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"   
		 And I click on view icon in Search Result page  
		 And I verify "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen"
		  And In the 360 view I click on the "Devices" tab
		  Then I verify "Device information is displayed in Related tab Devices in Order 360 view for Network Order"
		 
@TC103399 @TC103395
 Scenario: @TC103399 -Validate Order History tab in Order 360 view for Network Order
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"   
		 And I click on view icon in Search Result page  
		 Then I verify "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen"
		  And I click on the "Order History Tab" in Order details screen
		  Then I verify "Order history table should be displayed in Order screen"
		  
		  
		  @TC165238
		  Scenario: @TC165238 -Verify Order version in Order History tab is displayed for an HSI Customer Order
       Given I am logged in as a "Admin" user in Omnivue
			When I Click on "Search" tab in Omnivue Activation Screen
			And I select "Orders" in Search slider
			And I select "GPON" as Product-type in Order’s Search slider
			And I clicked on Advance Search for "Orders"
			And I Search order with "All"-Service type in Advance search screen
			And I click on Advance search button for "Orders"   
			 And I click on view icon in Search Result page 		 
		 Then I verify "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen"
		  And I click on the "Order History Tab" in Order details screen
		  Then I verify "Order history table should be displayed in Order screen"
		  
		 @TC39263
		  Scenario: @TC39263 -Verify BAM Reports for the 360 view_Network Orders
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"   
		 And I click on view icon in Search Result page  
		 And I verify "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen"
		 And In the 360 view I click on the "BAM Report" tab
	Then I should see "BAM event logs" displayed
	
	
  @TC215638 
  Scenario: @TC215638 -Validate Cancel Order option on Ethernet orders
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"   
		 And I click on view icon in Search Result page     
		 Then I verify "Cancel Order option on Ethernet order detail page"
		 
		  @TC215638 
  Scenario: @TC215638 -Validate Cancel Order option on GPON orders
    Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"   
		 And I click on view icon in Search Result page 
		  Then I verify "Cancel Order option on GPON Order Detail page"
		  
		  
		    @TC39216 @TC103405
  Scenario: @TC39216 -Focus Tab - Order Details_Verify the Order Note History section is displays the information when user saves a note on Ethernet Order
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"   
		 And I click on view icon in Search Result page   
		 And I click on the "Order Notes Tab" in Order details screen
		 And I "enter a log inside the notes section in order screen"
		  And I click on the "Save button on Order Notes Tab" in Order details screen
		 Then I verify "Order Note History section displays the save note details"
		 
		
		 
		   @TC165230 @TC165237
  Scenario: @TC165230 -Focus Tab - Order Details_Verify the Order Note History section is displays the information when user saves a note on GPON Order
    Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"   
		 And I click on view icon in Search Result page 
		  And I click on the "Order Notes Tab" in Order details screen
		 And I "enter a log inside the notes section in order screen"
		  And I click on the "Save button on Order Notes Tab" in Order details screen
		 Then I verify "Order Note History section displays the save note details"
		 
	########################## US62403-- New OV Order Search is not returning search results for GPON orders 	########################## 

@F6277 @PI7 @Sprint211 @US62403 @TC54941 @TC54947 @TC54962 @TC55177 @TC87160 @TC87196 @TC87197 @TC87199 @TC187606
Scenario Outline: Validate OV order search return results for GPON using CSOF Order Id
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I Search for "<Orders>" in Search Tab
And I click on search button for "Orders"
And I click on view icon in Search Result page
Then Validate attributes in order details page

			Examples:
    	| Orders 						|
    	| CSOF Order ID 		|
    	| Ensemble Order ID |
    	| TN 								|
   	 	| Customer Name 		|


################################# US48231--CR4701 MLTO all fields need to be editable on Create Form ####################################################
################################# US71108--CR4701 MLTO Edit functionality needs to be implemented for MLTO orders ####################################################

@F2281 @PI7 @Sprint213 @US48231 @TC86221 @US71108 @TC126911 
Scenario: OV-Validating Edit functionality on MLTO 
	Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "All"-Service type in Advance search screen
	And I click on Advance search button for "Orders"
 	And I Search for "MLTO Order" from Seacrh result page
 	And I Validate the "Edit Order" button functionality on MLTO
 	Then I validate "Editable fields" attributes in Edit form for "MLTO"
 Then I verify "Update Log is captured in the Omnivue Audit log tab"

################################# US79809--Provide Refresh Button for BAM Display ################################# 

	@US79810 @TC81419 @TC95926   
Scenario Outline: @TC95926 -OV Validate Refresh button of  BAM Table in "<Service Type>" service Order
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "<Service Type>"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And In the 360 view I click on the "BAM Report" tab
Then I verify "Refresh icon should be displayed for BAM Reports Related tab in Services"


Examples: 
    |Service Type	|
		|HSI Service	|
		|IPTV					|	
	
################################   US87677--CR4701 GPON OV Consume DSP Service   ###########################################################
    
   @US87677 @TC91478 @TC125486 @US90861 @TC93522 @TC93524 @TC125597 @TC125853 @TC125850 @TC125858 @TC125627 @TC125639 @TC125487 @TC125648 @TC91351 @TC90657 @TC91353  @TC91475 @TC93449 @TC93450 @TC93519 @TC93520 @TC125651 @TC91347 @TC125860 @TC125623
    Scenario Outline: OV-Validating MLTO Action button functionality on MLTO
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "MLTO GPON order"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
    And I validate "Available Actions & Order status" attributes in Search page for "MLTO"
    And I click on "<MLTO Action>" button from Available action in MLTO Search page
    Then I should see success alert message for "<MLTO Action>"
     Then I verify "<MLTO Action> Log is captured in the Omnivue Audit log tab"
     
     Examples: 
    |MLTO Action					|
    |ISAT Create					|
    |DISPATCH							|
    |IMPROV								|
    |ISAT Modify					|
    
    
 #########################  #US95270--HD00008921543  - MLTO Order Not able to View task from OV (Sev3) ############################################################################################################ 
   
   @US95270 @TC94768 @TC125490 
    Scenario: OV-Validate Task tab in MLTO order
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "HSI MLTO Order"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Tasks" tab
		Then I should see "Task details" displayed   
		
	 ##########################	Feature: User can view BAM events tab on Order - GPON and it display captured events ###########################################################

############################################################ US56683 -- OV - Display Order BAM Report (Lifecycle Events)  ###########################################################

@F5481 @US56683 @TC86554 @TC87234
Scenario: OV – validate BAM Reports logs displayed on GPON orders for HSI orders
		Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "HSI"-Service type in Advance search screen
	And I click on Advance search button for "Orders"	
	And I click on view icon in Search Result page
	And In the 360 view I click on the "BAM Report" tab
	Then I should see "BAM event logs" displayed
	Then I verify "fallout tasks is getting updated in BAM Report on Orders"
	
	
@F5481 @US56683 @TC53577 
Scenario: OV – validate BAM Reports logs displayed on GPON orders for IPTV orders
			Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "IPTV"-Service type in Advance search screen
	And I click on Advance search button for "Orders"	
	And I click on view icon in Search Result page
	And In the 360 view I click on the "BAM Report" tab
	Then I should see "BAM event logs" displayed		
   
 @F5481 @US56683 @TC86566 	@TC165239
 Scenario: OV - Validate BAM Report logs on Orders for GPON where no data is available
		Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "All"-Service type in Advance search screen
		And I click on Advance search button for "Orders"	
	And I click on view icon in Search Result page
	And In the 360 view I click on the "BAM Report" tab
	Then I should see "BAM event logs" displayed

########################## US79809--All User to Configure Columns in display 	 ##########################	
 
@F5481 	@US79809 @TC81835
Scenario: OV - Validate configure columns button of BAM Report Table GPON order
		Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "All"-Service type in Advance search screen
		And I click on Advance search button for "Orders"	
	And I click on view icon in Search Result page
	And In the 360 view I click on the "BAM Report" tab
	And I should see "BAM event logs" displayed
	Then I verify "Configuration column, Refresh icon, Excel export, Print Icon, Get Logs & From Archieve checkbox is displayed"
	



@F6277 @PI7 @Sprint211 @US62403 @TC55494 @TC87200
Scenario: Validate OV order search return results for GPON using DTN in Advanced search
Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "All"-Service type in Advance search screen
		And I click on Advance search button for "Orders"	
		And I click on view icon in Search Result page
	And I "search for the Order using DTN in advance search screen"
	Then Validate attributes in order details page
	
	    
   @TC179094 @TC181343 @TC179100
    Scenario Outline: CR4701 GPON-OV Validate the status of ISAT, IMPROV, or Dispatch button if a <Order Type> is in held status
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "MLTO GPON order"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
    And I validate "Available Actions & Order status" attributes in Search page for "MLTO"
    And I click on "<Order Type>" button from Available action in MLTO Search page
    Then I should see success alert message for "<MLTO Action>"
    
     Examples: 
    |Order Type					|
    |GPON order					|
    |MLTO	order						|
    |GFAST Order|
    
     
 ######US111959-- [COD: 6] [REG] <50% CR4701 GPON - Order Search results do not display order action Type, IE Add, Change, Remove######
 
 
 @F11501 @US111959 @TC154439 
Scenario: OV Test: To verify GPON - Order Search results page to view order Action type for SIMON/GPON orders
 	Given I am logged in as a "Admin" user in Omnivue
	When I Click on "Search" tab in Omnivue Activation Screen
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "All"-Service type in Advance search screen
	And I click on Advance search button for "Orders"
 	Then I validate Action type in the search result page
 	
@TC169327
Scenario: @TC169327 OV-Verify Upstream and Downstream values of the HSI+IPTV Order details page and Service details page.
 	Given I am logged in as a "Admin" user in Omnivue
	When I Click on "Search" tab in Omnivue Activation Screen
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "IPTV"-Service type in Advance search screen
	And I click on Advance search button for "Orders"
	And I "search for Order having status Pending Completeion state"
 	And In the 360 view I click on the "Services" tab
 	And I verify "Upstream and Downstream values of the HSI+IPTV Order and Service detail page are matching"
 	

 	 
   