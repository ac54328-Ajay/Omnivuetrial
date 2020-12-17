@Search_Inventory @Search_Inventory_Service @Regression @Service_Reg_Run1
Feature: Search Inventory Service validations


#suhasini'sode#
  @GETENF-5000 
    Scenario: Verify that the user is able to add VLAN to a MEF OVC Member
    Given I am logged in as a "Admin" user in Omnivue
   	When I click on "Search" tab   
	And I go to "Inventory" Search type and select "Service" as Inventory type   
   	And I select Service Type values as "MEF OVC" under Service Search slider 
   	And I click on search button for "Service"
   	And I click on view icon in Search Result page
   	And I should see the "Service Search screen attributes" been displayed  
   	And I expand the associated service
    And I cLick on Add VLAN and added VLAN range
  	And I verify "VLAN Validation" in Service page
   	And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I click on "Getlogs" button on Service page
    And I verify "Add Vlan action log details and validate database" in Service page
    
     @GETENF-4999
  Scenario:  - Verify that the user is able to add VLAN to a MEF EVC Member
    Given I am logged in as a "Admin" user in Omnivue
   	When I click on "Search" tab   
	And I go to "Inventory" Search type and select "Service" as Inventory type   
   	And I select Service Type values as "MEF EVC" under Service Search slider 
   	And I click on search button for "Service"
   	And I click on view icon in Search Result page
   	And I should see the "Service Search screen attributes" been displayed  
   	And I expand the associated service
    And I cLick on Add VLAN and added VLAN range
  	And I verify "VLAN Validation" in Service page
   	And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I click on "Getlogs" button on Service page
    And I verify "Add Vlan action log details and validate database" in Service page
    
    @GETENF-5116
  Scenario: Verify Google Sytle Search for Service Name
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Service" google search
    And I "click on GO button"
    And I should see the "Service Search screen values" been displayed
    
  
#############################################################################################    

@TC55687 @refact
Scenario Outline: @TC55687 - NIC_GPON_Reg_Verify Update functionality of HSI Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I click on "Edit" button on Service page
		And I "Update HSI/IPTV/IPTV Unicast Service page"
		And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
		
    Examples:
      | Search Service Type	|
      |	HSI									|     
      |	IPTV								|
			|	IPTV Unicast				|  

@TC55688		  @refact
Scenario Outline: @TC55688 - NIC_GPON_Reg_Verify Update functionality of HOST Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I click on "Edit" button on Service page
		And I "Update Host Service Page"
		And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
		
    Examples:
      | Search Service Type	|
      |	Host Service			  |   

 

@TC166991  @TC39203 @TC166999
  Scenario Outline: @TC39203 -Related Systems - Devices_Verify Start and End Device tabs are displayed for an <Search Service Type> service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I should see the "Service Search screen attributes" been displayed  
		And In the 360 view I click on the "Devices" tab
		Then I verify "Start and End Device tabs are displayed in service screen"
		
    Examples: 
      | Search Service Type	|
      |	HSI									|     
      |	IPTV								|
			|	IPTV Unicast				|    


  @TC165303
  Scenario: @TC165303 - Verify Google Sytle Search for Service
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Service" google search
    And I "click on GO button"
    And I should see the "Service Search screen values" been displayed
    
    
 @TC86235  
Scenario: @TC86235- OV --Verify Edit functionality and hyperlink of IPTV UNICAST Service in IPTV MULTICAST Service form.
Given I am logged in as a "Admin" user in Omnivue
When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "IPTV"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "IPTV" section Service ID field
And A new tab nnnnnnnnnn-"IPTV" will open
And I verify "IPTV Unicast service should be displayed under IPTV Service Attributes Section"
And I click on "Edit" button on Service page
And I verify "IPTV Unicast service should be displayed and disabled under IPTV Service Attributes Section in Edit Service page"
And I click on "Save" button on Service page
And I click on the hyperlink in the "IPTV Unicast Link" section Service ID field
Then A new tab nnnnnnnnnn-"IPTV_Unicast" will open

 @TC86233  
Scenario: @TC86233- OV - Verify IPTV UNICAST Service is displaying in IPTV MULTICAST Details form.
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "IPTV"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "IPTV" section Service ID field
And A new tab nnnnnnnnnn-"IPTV" will open
Then I verify "IPTV Unicast service should be displayed under IPTV Service Attributes Section"
		
		

@TC200099  
Scenario: @TC200099 -OV Test - Verify Edit functionality in HSI Service 360 view page 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "HSI" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page		
		And I click on "Edit" button on Service page
     And I click on "Save" button on Service page
    Then I verify "Success message should be displayed on update in Service page"
    	And I click on "Audit logs" tab on Service Search page  	
		And I Click on "OMNIVUE Audit Logs" tab
		 And I click on "Getlogs" button on Service page
		And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab 
    Then I verify "Update action type is registered under the Audit logs section in Servic page"
    	
    @TC204845  
Scenario Outline: @TC204845- OV-CR6454-G.Fast-Validate the Cable/Strand id are displaying in facility details tab of HSI/IPTV/IPTV Unicast Services
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "<Service Type>"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "<Service Type>" section Service ID field
Then A new tab nnnnnnnnnn-"<Service Type>" will open
And I validate "Associated Service section" in Service 360 view page not Displayed
And I validate "Associated VLAN section" in Service 360 view page not Displayed
And I validate "Associations tab" in Service 360 view page not Displayed
Then I should see "Services" Related Tab displayed in 360 view Service Page
And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
When I click on "Facility Details" tab on Service Search page
Then I verify "Cable/Strand id are displaying in facility details tab of HSI/IPTV/IPTV Unicast Services"

Examples: 
    |Service Type	|
		|HSI Service	|
		|IPTV					|
		|IPTV-Unicast	|
		
 @TC153519
Scenario: @TC153519 -OV test: To verify 2 boxes are visually present under max up/downstream sub values on HSI service View and edit page. 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "HSI" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		#And I should see the "Service Search screen attributes" been displayed  
		#Then I verify "Max Upstream & Downstream values should be displayed in the HSI service view"
		And I click on "Edit" button on Service page
		Then I verify "Max Upstream & Downstream fields should display in TB, GB, MB, KB sub values in edit service view"
		
		
		
		@TC153520
Scenario: @TC153520 -OV test: To verify 2 boxes are visually present under max up/downstream sub values on IPTV service view and edit page. 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "IPTV" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		#And I should see the "Service Search screen attributes" been displayed  
		#Then I verify "Max Upstream & Downstream values should be displayed in the HSI service view"
		And I click on "Edit" button on Service page
		Then I verify "Max Upstream & Downstream fields should display in TB, GB, MB, KB sub values in edit service view"
		
		
	
      
		
@TC172563  	@TC172542  
Scenario Outline: @TC172563 -OV Test: To verify task related and order related information populating in "<Service Type>" services
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "<Service Type>"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "<Service Type>" section Service ID field
And A new tab nnnnnnnnnn-"<Service Type>" will open
And In the 360 view I click on the "Orders" tab
Then I verify "Order details should be matching with the Order ID in Service page"
And In the 360 view I click on the "Tasks" tab
Then I should see the "Task related to Order should" been displayed  

Examples: 
    |Service Type	|
		|HSI Service	|
		|IPTV					|
		|IPTV-Unicast	|
    
		
		
		
		@TC86614   
Scenario Outline: @TC86614- Validate configure columns button of BAM Report Table in "<Service Type>" services
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "<Service Type>"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "<Service Type>" section Service ID field
And A new tab nnnnnnnnnn-"<Service Type>" will open
And In the 360 view I click on the "BAM Report" tab
Then I verify "Configuration column icon should be displayed for BAM Reports Related tab in Services"


Examples: 
    |Service Type	|
		|HSI Service	|
		|IPTV					|
		
			@TC81597   
Scenario Outline: @TC81597 -OV Validate Refresh button of  BAM Table in "<Service Type>" services
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "<Service Type>"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "<Service Type>" section Service ID field
And A new tab nnnnnnnnnn-"<Service Type>" will open
And In the 360 view I click on the "BAM Report" tab
Then I verify "Refresh icon should be displayed for BAM Reports Related tab in Services"


Examples: 
    |Service Type	|
		|HSI Service	|
		|IPTV					|
		
		
		
		@TC86614   @TC95925
Scenario Outline: @TC86614- Validate configure columns button of BAM Report Table in "<Service Type>" services
Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "<Service Type>"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on magnifying glass for the selected Order number
And A new tab Order Id:nnnnnn will open with an Order details sub tab 
And I click on the hyperlink in the "<Service Type>" section Service ID field
And A new tab nnnnnnnnnn-"<Service Type>" will open
And In the 360 view I click on the "BAM Report" tab
Then I verify "Configuration column icon should be displayed for BAM Reports Related tab in Services"


Examples: 
    |Service Type	|
		|HSI Service	|
		|IPTV					|
		|IPTV-Unicast	|


@TC55334 
  Scenario: @TC55334 - Verify the Device information displayed in Related tab devices of ENNI Link Service
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Search" tab
   	And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "ENNI Link Service" under Service Search slider  	
    And I click on search button for "Service" 
  	And I click on view icon in Search Result page 
  	 And I verified view page and clicked on "Devices" tab
  	 Then I verify "Device Name should match when compared to The Device name displayed in the ENNI Link Details tab under Service Association Section"
  	
 @TC55331 @TC154958
  Scenario: @TC55331 -ENNI Link Service - Verify the Edit functionality of ENNI Link Service
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Search" tab
   	And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "ENNI Link Service" under Service Search slider  	
    And I click on search button for "Service" 
  	And I click on view icon in Search Result page   
     And I click on "Edit" button on Service page
     And I click on "Save" button on Service page
    Then I verify "Success message should be displayed on update in Service page"
    	And I click on "Audit logs" tab on Service Search page  	
		And I Click on "OMNIVUE Audit Logs" tab
		And I click on "Getlogs" button on Service page
		And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab 
    Then I verify "Update action type is registered under the Audit logs section in Servic page"
    	
 @TC55318 
  Scenario: @TC55318 -Verify the Edit functionality of DSL OVC Service
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Search" tab
   	And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider  	
    And I click on search button for "Service" 
  	And I click on view icon in Search Result page   
     And I click on "Edit" button on Service page
     And I click on "Save" button on Service page
    Then I verify "Success message should be displayed on update in Service page"
    	And I click on "Audit logs" tab on Service Search page  	
		And I Click on "OMNIVUE Audit Logs" tab
		 And I click on "Getlogs" button on Service page
		And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab 
    	Then I verify "Update action type is registered under the Audit logs section in Servic page"


@TC207986 
Scenario: @TC207986- OV-Validating audit log for view action of IPTV Unicast service
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
		And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "IPTV Unicast" under Service Search slider   	
    And I click on search button for "Service" 
  	And I click on view icon in Search Result page
  	And I click on "Audit logs" tab on Service Search page  	
		And I Click on "OMNIVUE Audit Logs" tab 
		And I should see Export to Excel icon, Refresh icon and Print icon
		And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab 
  	Then I verify "View action type is registered under the Audit logs section in Servic page"
  	
  	
@TC207990
Scenario: @TC207990- OV-Validating audit log for view action of HSI service
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
		And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "HSI" under Service Search slider  	
    And I click on search button for "Service" 
  	And I click on view icon in Search Result page
  	And I click on "Audit logs" tab on Service Search page  	
		And I Click on "OMNIVUE Audit Logs" tab 
		And I should see Export to Excel icon, Refresh icon and Print icon
		And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab 
  	Then I verify "View action type is registered under the Audit logs section in Servic page"
  	
  	

 
		
######################		F2241-GPON DSL OVC Inventory Enhancements  ###################################################
######################  US33620-Display GPON DSL OVCs Associated to Device	############################################
@US33620 @TC18903 
   Scenario: Validate OLT Devices display MEF EVC for HSI
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
		And I go to "Inventory" Search type and select "Device" as Inventory type 
 		And I clicked on Advance Search for "Devices"
 		And I select the device role as "OLT" in Device advance search
 		And I select the device status as "In Service" in Device advance search
 		And I click on Advance search button for "Device" 
 		And I "search for device having MEF EVC displayed in Services related tab" 
   Then validate the service type as "MEF EVC" when service capability types as "HSI" & "HSI + IPTV Unicast"

@US33620 @TC18883
   Scenario: Validate OLT Devices display DSL OVC for HSI
Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   

		And I go to "Inventory" Search type and select "Device" as Inventory type 
 		And I clicked on Advance Search for "Devices"
 		And I select the device role as "OLT" in Device advance search
 		And I select the device status as "In Service" in Device advance search
 		And I click on Advance search button for "Device" 
 		And I "search for device having DSL OVC displayed in Services related tab"  
    Then validate the service type as "DSL OVC" when service capability types as "IPTV-UNICAST" & "IPTV-DATA"
  
  


###################### US31642-GPON SVLAN C Tag Pool Display, Create and Update and C Tag Status Display ##################

# @US31642 @TC20884 @TC86315 #present inrefactored page
  Scenario: @TC86315- Validate single range of C Tag pool 1-4095 for DSL OVC service with Ethernet-HSI usage type
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab 
    And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider
  	And I click on search button for "Service"
  	And I select "DSL OVC with no CTAG Associated" on view icon in Search Result page
    And I verified view page and clicked on "CTag" tab
    And Add the CTag range "Less than 1"
    And Add the CTag range "Greater than 4095"
    And Add the CTag range "Alphanumeric values"
    Then Add the CTag range "Single Range 1-4095"
    And I Delete the added CTag range   


	@US31642 @TC20897 @TC20901 @TC86316 
  Scenario: @TC86316- Validate C Tag Pool multiple ranges can be edited on a non activated subscribers or Pending orders
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab    
    And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider
  	And I click on search button for "Service"
  	And I select "DSL OVC with no CTAG Associated" on view icon in Search Result page
    And I verified view page and clicked on "CTag" tab
    And Add the CTag range "Multiple Range between 1-4095" 
    Then Add the CTag range "Overlapping the CTag range"   
     And I Delete the added CTag range
   

    @US31642-TC20902 @TC86318
  Scenario: @TC86318- Validate C Tag Pool support single number range for DSL OVC service
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab    
    And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider
  	And I click on search button for "Service"
  	And I select "DSL OVC with no CTAG Associated" on view icon in Search Result page
    And I verified view page and clicked on "CTag" tab
    Then Add the CTag range "Single Number Range"  
    And I Delete the added CTag range
   
 
		@US31642-TC21874 @TC86319
  	Scenario: @TC86319- Modifying the existing CTag Pool range values for DSL OVC of any service
  	Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
    And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider
  	And I click on search button for "Service"
  	And I select "DSL OVC with no CTAG Associated" on view icon in Search Result page
    And I verified view page and clicked on "CTag" tab
    Then Add the CTag range "Modify the Ctag Range"   
     And I Delete the added CTag range
     
     @US31642-TC21874 @TC86317
  	Scenario: @TC86317- Validate C Tag Pool for DSL OVC service will support Segmented pools without overlapping
  	Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
    And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider
  	And I click on search button for "Service"
  	And I select "DSL OVC with no CTAG Associated" on view icon in Search Result page
    And I verified view page and clicked on "CTag" tab
    Then Add the CTag range "Modify the Ctag Range"   
     And I Delete the added CTag range
     

	
	 @TC171912
 Scenario: CR6456 CTLON - OV - Validate of audit log on DSL OVC View screen
   Given I am logged in as a "Admin" user in Omnivue
   When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "DSL OVC" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page   
 		Then I should see the "View Entry in Audit log for DSL OVC View Action" been displayed
 		

  	
  	
 @TC162917 @TC170964 @TC171898
 Scenario: CR6456 CTLON - OV - Validate AffiliateOwner field on DSL OVC View screen
  Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "DSL OVC" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on the "Edit" in "Service" result page 
 		Then I should see the "Affiliate Owner field values in DSL OVC View Screen" been displayed
 		And I click on the "Save" in "Service" result page 
 		Then I should see the "Update Entry in Audit log for DSL OVC View Action" been displayed 
 		
 
 		
 @P11 @Sprint237  @US116154 @TC189925 
  Scenario Outline: @TC189925 -CR6350 - US162982 - TC003 - Verify user is able to retrieve OMNIVUE  Audit Logs from Archive table for Service     
    Given I click on "Search" tab
    When I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I Click on "Audit Log" tab on Service view page
		When I Click on "OMNIVUE Audit Logs" tab 
		And I validate new option From Archive checkbox on Audit logs for "Service"		
 		And I click on the "Get logs in Audit logs with From Archive checkbox selected" in "Service" result page
    Then I validate the logs displayed in Audit logs by selecting Archive checkbox in "Service" result page
    When I Click on "ARM Audit Logs" tab
    And I validate new option From Archive checkbox on Audit logs for "Service"		
 		And I click on the "Get logs in Audit logs with From Archive checkbox selected" in "Service" result page 
		
    Examples: 
      | Search Service Type	|
      #| DSL OVC							|
      #|	ENNI Link Service		|
      #|	HSI									|
      #|	Host Service				|
      #|	IPTV								|
      #|	IPTV Unicast				|
      #|	Local EVC						|
      #|	MEF ENNI						|
      #|	MEF EVC							|
      #|	MEF OVC							|
      #|	MEF Service					|
      #|	MEF UNI							|
      #|	MGR UNI							|
      #|	Mgmt EVC						|
      #|	Mgmt UNI						|
      |	Probe UNI						|     
      
 
      


		
		
		
########		Need To Check  ##################

@TC178355
Scenario: To Validate if VLAN's display  on MEF OVC(Without Check Box)
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
		And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider 
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I verified view page and clicked on "Services" tab  
    
 @TC178723   
    Scenario: To Validate if VLAN's display on DSL OVC(Without Check Box)
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab   
		And I go to "Inventory" Search type and select "Service" as Inventory type   
  	And I select Service Type values as "DSL OVC" under Service Search slider 
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I verified view page and clicked on "Services" tab  
    
    
### Need to modify the scripts
@TC19275 
  Scenario: Validate Refresh functionality of OLT Devices under Service tab
      Given I am logged in as a "Admin" user in Omnivue  
    And I click on "Search" tab    
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"  
    And I click on view icon in Search Result page
    
    
   # Given I am logged in as a "Admin" user in Omnivue
	#When I click on "Search" tab
  #  And I Search for the "Refreshdata" data from Search Tab
 #  	And I click on search button for "Inventory"
  #   And I click on view icon in Search Result page
     And I verified view page and clicked on "Services" tab    
    And I modify the service name from 77/L1XX/785391//CTQF to 77/L1XX/785391//ADCD
    And I do Refresh      
    Then I should see the updated Associated service name 
   
    
 
@TC19068
Scenario: Validate OLT Devices with No service
    Given I am logged in as a "Admin" user in Omnivue
		When I click on "Search" tab 
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"  
    And I click on view icon in Search Result page
    And I verified view page and clicked on "Services" tab
    Then validate the Service Tab
		
		
		######################  US56682--OV - Display Service BAM Report (Lifecycle Events) ###################### 

@PI7 @Sprint214 @F5481 @US56682 @TC52783 @TC95693
Scenario: OV – validate BAM Reports logs displayed on GPON orders for HSI Service
	Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "HSI"-Service type in Advance search screen
	And I click on Advance search button for "Orders"
	And I click on view icon in Search Result page	
	And I click on the hyperlink in the "HSI Service" section Service ID field
	Then A new tab nnnnnnnnnn-"HSI Service" will open
	And In the 360 view I click on the "BAM Report" tab
	Then I verify "BAM event logs should be displayed"	

	
@PI7 @Sprint214 @F5481 @US56682 @TC52783 @TC95696
	Scenario: OV – validate BAM Reports logs displayed on GPON orders for IPTV Service
	Given I am logged in as a "Admin" user in Omnivue	
	When I click on "Search" tab
	And I select "Orders" in Search slider
	And I select "GPON" as Product-type in Order’s Search slider
	And I clicked on Advance Search for "Orders"
	And I select product type as "GPON" under Order paramaters
	And I Search order with "IPTV"-Service type in Advance search screen
	And I click on Advance search button for "Orders"
	And I click on view icon in Search Result page	
	And I click on the hyperlink in the "IPTV" section Service ID field
	Then A new tab nnnnnnnnnn-"IPTV" will open
	And In the 360 view I click on the "BAM Report" tab
	Then I verify "BAM event logs should be displayed"		
	
	
@US79810 @TC81597 
Scenario: OV - Validate Refresh button for BAM Reports on GPON Service
	Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
	And I Search for the "BAM logs for HSI Service" data from Search Tab
	And I click on search button for "Inventory"
	And I click on view icon in Search Result page
	And In the 360 view I click on the "BAM Report" tab
	And I do Refresh
	Then I should see "BAM event logs" displayed
	
	########################## US79809--All User to Configure Columns in display 	 ##########################
 	
 @F5481 	@US79809 @TC81820 
Scenario: OV - Validate configure columns button of BAM Report Table in services
	Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
	And I Search for the "BAM logs for HSI Service" data from Search Tab
	And I click on search button for "Inventory"
	And I click on view icon in Search Result page
	And In the 360 view I click on the "BAM Report" tab
	And I should see "BAM event logs" displayed
	Then I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
	
	
	@TC55669 @TC122160
	Scenario: Verify data displayed in the related tabs for Services - Ethernet devices
	Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
	And I Search for the "Service" data from Search Tab
	And I click on search button for "Inventory"
	And I click on view icon in Search Result page
	And In the 360 view I click on the "All the related" tab
	And I should see "logs" displayed
	Then I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
		
		
		
		
        #@US153099 @TC195093 
     Scenario: Validation of circuit tab on service details page.
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
			And I select "Orders" in Search slider
			And I select "GPON" as Product-type in Order’s Search slider
			And I clicked on Advance Search for "Orders"
			And I Search order with "<Service Type>"-Service type in Advance search screen
			And I click on Advance search button for "Orders"
			And I click on magnifying glass for the selected Order number
			And A new tab Order Id:nnnnnn will open with an Order details sub tab 
			And I click on the hyperlink in the "<Service Type>" section Service ID field
			Then A new tab nnnnnnnnnn-"<Service Type>" will open
			When I click on Circuit tab
			Then Circuit associated to that particular service should be displayed.
    

@TC202403 
     Scenario: US150915_To Validate if user is able to see Virtual Ports for MEF EVC
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
			And I select "Orders" in Search slider
			And I select "GPON" as Product-type in Order’s Search slider
			And I clicked on Advance Search for "Orders"
			And I Search order with "<Service Type>"-Service type in Advance search screen
			And I click on Advance search button for "Orders"
			
			
@TC203205 
     Scenario: US150915_To Validate if user is able to see Virtual Ports for MEF OVC
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
			And I select "Orders" in Search slider
			And I select "GPON" as Product-type in Order’s Search slider
			And I clicked on Advance Search for "Orders"
			And I Search order with "<Service Type>"-Service type in Advance search screen
			And I click on Advance search button for "Orders"
	
	
	
 
    
   # @F18084 @F18112 @F18114
#Feature: Clean up HSI, IPTV & IPTV UNiCast Service
#Clean up of HSI, IPTV & IPTV UNiCast service details section
#1. Change UI
#2. Move associations to related tab
#3. any pre existing defects 
		
		
		
		
		
		
		
		
		
		
		