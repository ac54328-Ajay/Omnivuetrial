@In_Sprint
Feature: Consists of all the In-sprint automation Test cases

 
   @GETENF-30263 @GETENF-30265
   Scenario Outline: OV - Automate MCO Mapping - MEF UNI Service Edit Screen - UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
   Then I validate whether AutoNegotiate field for MEFUNI service is enabled
   
		
		Examples:
      | Search Service Type	|
      |	MEF UNI									|
     
 
 @GETENF-31368
  Scenario: OV INC3050639 Resolve FAQ link
   Given I am logged in as a "Admin" user in Omnivue
    When I click on Gear Icon
    Then FAQ link should be absent
   
 
 @GETENF-5127 
  Scenario: Validate Create Alternative Equipment Build(Network Order) using New devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I configure NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
    And I Click on the "Submit Build" Button in Order Details page
    And I Click on the "Refresh" Button in Order Details page
    Then I Should see the "Network order status changed to Success"
    And I Launch the Network order by clicking on Order/CSOF ID
     #And I Should see the "Cancel Order button enabled & clickable" 
      #When I Click on the "Cancel Order" Button in Order Details page
      #Then I Should see the "Cancellation request successfully sent to DSP. - Message getting displayed in the Network Order Screen"
      #When I Click on the "Audit Log" Button in Order Details page
      #Then I verify "Order Cancel audit log should get displayed in Order details page"
      
 
 @GETENF-4948
  Scenario Outline: NIC_Ethernet_Reg_Verify the Save action on Transport Path
    Given I am logged in as a "Admin" user in Omnivue
    #And Running a soap service "<serviceURL>" located at "<NIDrequest>" and response in "<NIDresponseLocation>".
    #And Running a soap service "<serviceURL>" located at "//serviceTestData/NPEdeviceCreation.xml" and response in "//serviceResponse//responseNIDDeviceCreation.xml".
    #And Running a soap service "<serviceURL>" located at "//serviceTestData/EBcircuitCreation.xml" and response in "//serviceResponse//responseEBcircuitCreation.xml".  
    When I click on "Create" tab
    And I go to "Network Build" type and select "Transport Path"
    And I select Device Role as "NID" and Device Name as "ETRPNVFH711-1234"
    #And I select Device Role as "NID"
    And I click the "Transport Path" button
    And I select circuit for Transport Path
    And I click on "Submit" in Create Transport Path
	  And I click on "Save button" in Transport path screen
	  And I verify "Transport Path result screen for the incomplete"
		#And I click on "Edit Incomplete button" in Transport path screen
		#And I click on "Submit button on Incomplete" in Transport path screen
		#And I verify "Success message should be displayed on the action"
    #And I click on "Delete button on Incomplete task" in Transport path screen
    #Then I verify "Success message is displayed on Delete action in Transport Path screen"
    And Running a soap service "<serviceURL>" located at "//serviceTestData/EBcircuitDeletion.xml" and response in "//serviceResponse//responseEBcircuitDeletion.xml".
    And Running a soap service "<serviceURL>" located at "//serviceTestData/NIDdeviceDeletion.xml" and response in "//serviceResponse//responseNIDDeviceDeletion.xml".
    And Running a soap service "<serviceURL>" located at "//serviceTestData/NPEdeviceDeletion.xml" and response in "//serviceResponse//responseNIDDeviceDeletion.xml".
     
  Examples: 
      | serviceURL                                        |NIDrequest                             |NIDresponseLocation                           |                                                 
      |http://icl-e2e.test.intranet/icl/services/ICL_2_0|//serviceTestData/NIDdeviceCreation.xml|//serviceResponse//responseNIDDeviceCreation.xml |
        

#PI3sprint5
@GETENF-19312
Scenario: OV Button to Initiate RMA process(supported Device In Service)
Given I am logged in as a "Admin" user in Omnivue
When I click on "Search" tab
And I go to "Inventory" Search type and select "Device" as Inventory type
And I click on advanced search for "Device"
And I select "Ciena 3916 Family" as device type
And I click on search button for advanced device search
And I select a device with provision status In Service
And I click on RMA button for the device


Scenario: OV Button to Initiate RMA process(Supported Device not in Service)
Given I am logged in as a "Admin" user in Omnivue
When I click on "Search" tab
And I go to "Inventory" Search type and select "Device" as Inventory type
And I click on advanced search for "Device"
And I select "Ciena 3916 Family" as device type
And I click on search button for advanced device search
And I select a device with provision status In Service
And I verify whether click on RMA button for the device is disabled

#PI3sprint5
@GETENF-22986
Scenario: Test INC2537644 OV Return & Display Subscribers for GFast Devices ( US-19647)
Given I am logged in as a "Admin" user in Omnivue
When I click on "Search" tab
And I go to "Inventory" Search type and select "Device" as Inventory type
And I click on advanced search for "Device"
And I select OLT role for "Device"
And I click on search button for advanced device search
And I click on view icon in Search Result page
And In the 360 view I click on the "Subscribers" tab
And I validate whether subscriber details are present

@GETENF-trial
Scenario Outline: OV- Validating atributes of Create Device Screen for "<Devicerole>" role
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
       
  ###############DEVICE CREATION#####################
   # And I click on "Create" tab
    #And I go to "Inventory" type and select "Device"
    #And I Select "Role" as Filter By value
    #And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    #And I select the Technology type based on "<Devicerole>" Device role  
   #And I fill all the mandatory fields with "<Testdata>" data
    #Then I click on "Create" button in Device Create Screen
    #When I clicked the "Edit" button in Device Detail Page
    # #########CIRCUIT CREATION#####################################      
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Ethernet Bearer" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC119152" data
		And I click on "Create" in Circuit page	
		And I verify "Circuit gets created successfully message is displayed"
		When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Ethernet Bearer" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC119152" data
		And I click on "Create" in Circuit page	
		And I verify "Circuit gets created successfully message is displayed"
		Then I verify "Log is captured for the Create functionality in Circuit screen"	
		And I click on "Delete" in Circuit page	
		Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
			
    Examples: 
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					|
    
		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
	#	|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|


###############################################################################################################################################################
@GETENF-13262
  Scenario Outline: OV to ISAT call for Abort or Proceed
  Given I want to execute service "<serviceURL>"
    When I pass the data as parameters in a file "<FileLocation>"
    Then I submit the POST request
    Then I validate status code "<Succeesstatuscode>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I select "Disconnect Tasks" in Search slider
    And I enter correlation Id
    And I click on "Search" button for task search
    And I click on "Abort" button for disconnect task
        
    Examples: 
      | serviceURL                                                                                  |FileLocation                                | Succeesstatuscode |                                                 
      | https://omnivue-test3.test.intranet/OMNIVue/RESTService/TaskServiceManager/DisconnectService| ../OMNIVUeTools/serviceTestData/request.txt|               200 |
      
      
      
      @GETENF-19636
  Scenario Outline: Assignment of Potential Erroneous Disconnect Task to Workgroupd
  Given I want to execute service "<serviceURL>"
    When I pass the data as parameters in a file "<FileLocation>"
    Then I submit the POST request
    Then I validate status code "<Succeesstatuscode>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I select "Disconnect Tasks" in Search slider
    And I enter correlation Id
    And I click on "Search" button for task search
    And I verify whether the workgroup is added top disconnect task
       
    Examples: 
      | serviceURL                                                                                  |FileLocation                                | Succeesstatuscode |                                                 
      | https://omnivue-test3.test.intranet/OMNIVue/RESTService/TaskServiceManager/DisconnectService| ../OMNIVUeTools/serviceTestData/request.txt|               200 |
    
    
    
    
    
  #########################################Sylviya's Code###########################################################
  
  @TEST_Service
Scenario Outline: LQ POSTPAID - retrieveExternalProductsAndServices
    Given I want to execute service "<serviceURL>"
    When I pass the data as parameters in a file "<FileLocation>"
    Then I submit the POST request
    Then I validate status code "<Succeesstatuscode>"
    
                
    Examples: 
      | serviceURL                                                                                  |FileLocation                                | Succeesstatuscode |                                                 
      | https://omnivue-test2.test.intranet/OMNIVue/RESTService/TaskServiceManager/DisconnectService| ../OMNIVUeTools/serviceTestData/request.txt|               200 |  
      
  
  
  
  
  @12
  Scenario: NIC_Ethernet_Reg_Create MEF EVC_Without Members
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab   
    And I go to "Inventory" type and select "Service" 
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button 
    And I fill all the mandatory fields required in service create form with "MEF EVC-TC44385 data"
    And I fill the subscriber details in service page   
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I click on "Delete" button on Service page
    
   
   @5050
    Scenario: 
Validate user is able to create MEF EVC With member association and PM Type = NID2NID with all the available fields in Create Form
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab   
    And I go to "Inventory" type and select "Service" 
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button 
    And I fill all the mandatory fields required in service create form with "MEF EVC with PM NID2NID"
    And I fill the subscriber details in service page
    And I click on "Create" button on Service page
    Then Service should get created successfully
    #And I click on Edit
    #And I select "Requested" in PM Flag in Service page
    #And I select SLA Template "Sprint - Gold"
    #And I click on Save
    #And Verify and click on "EVC Members" related system tab
    #And Click on Add Member button
    #And Entered the values to add "UNI Member to EVC" member
 		And I click on "Delete" button on Service page
    
    
    @5313
    Scenario: NIC_GPON_Reg_Verify Create functionality of IPTVUnicast Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "IPTV Unicast" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page
    # every time we nedd to change the the service name as there is no "Delete" button for unicast services 
    And I gave the name as "1000084333-IPTVUnicast"
    And I filled DTN as "6783092761" downStream as "100" upStream as "200"
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Create action log details and validate database" in Service page
   # And I Click on "HSI Details"
    And I click on "Edit" button on Service page
    And I Update Alias1 as "testAuto" and Alias2 as "testAuto2"
    And I click on "Save" button on Service page
    And I verify "Service details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Update action log details and validate database" in Service page
    
    
    
    @GETENF-5038
  Scenario: Validate user is able to create MEF EVC With member association and PM Type = BRIX with all the available fields in Create Form
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab   
    And I go to "Inventory" type and select "Service" 
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button 
     And I fill all the mandatory fields required in service create form with "MEF EVC with PM BRIX"  
      And I fill the subscriber details in service page
       And I click on "Create" button on Service page
    Then Service should get created successfully
    #And I click on Edit
   # And I select "Requested" in PM Flag in Service page
    #And I select SLA Template "T-MOBILE P1"
 #  And I click on Save
#   And Verify and click on "EVC Members" related system tab
  # And Click on Add Member button
  # Then Entered the values to add "UNI Member to EVC" member
  # And Log out from OMNIVue
   And I click on "Delete" button on Service page   
   
@GETENF5083aa
Scenario Outline: NIC_ETHERNET_Reg_Verify Delete TC122555functionality of MEF EVC Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I click on "Delete" button on Service page
		#And I "Update HSI/IPTV/IPTV Unicast Service page"
		#And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
		
    Examples:
      | Search Service Type	|
      |	HSI									|     
      |	IPTV								|
			|	IPTV Unicast				|  
   
  
  
  #######################################Suhasini's Code############################################################
  
	@GETENF-5020 @GETENF-5013
 Scenario:NIC_Ethernet_Reg_Validate the SLA Template for MEF EVC Service with PM Type as BRIX
 	Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF EVC with PM BRIX type"
    And I fill the subscriber details in service page
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I Associate MEF UNI with Non PM Spec Code to mefovc service
    And I click on "Edit" button on Service page
    And I fill all the mandatory fields required in service update form with "MEF OVC-5020 Update data"
    And I click on "Save" button on Service page
    And I verify the SLA template Name
    And I verify the SLA template
  	And I verify the SLA template on Focus Tab and Performance Tab value is match
    And I click on "Delete" button on Service page
    
    
    @GETENF-5019
 Scenario:NIC_Ethernet_Reg_Validate the SLA Template for MEF EVC Service with PM Type as NID2NID

 	Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF EVC with PM NID2NID"
    And I fill the subscriber details in service page
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I Associate MEF UNI with Non PM Spec Code to mefovc service
    And I click on "Edit" button on Service page
    And I fill all the mandatory fields required in service update form with "MEF OVC-TC83475 Update data"
    And I click on "Save" button on Service page
    And I verify the SLA template Name
    And I verify the SLA template
  	And I verify the SLA template on Focus Tab and Performance Tab value is match
    And I click on "Delete" button on Service page
    
	#######################################################set2########################################
    @GETENF-4995
       Scenario: NIC_Ethernet_Reg_Validate Edit functionality for Ethernet Topology as Topology Role
      Given I am logged in as a "Admin" user in Omnivue
      And I click on "Search" tab
      And I Search for the "TC55672" data from Search Tab
      And I Select Topology type as "Generic Network" and Topology Role as "Ethernet Topology" in search tab
      And I click on search button for "Inventory"
      And I click on view icon in Search Result page
      And I click on "Update" button on Service page
      And I click on "AddDevice" button
      And I search Device Type as "Calix E7" and Device SubType as "Calix E7-2"
      And I click on "AddCircuit" button
      And I Select circuit data in Create Pager
      And I click on "Save" button on Service page
      And I Click on "Audit Log" tab on Service Search page
      
      
    @GETENF-4947
       Scenario: NIC_Ethernet_Reg_Verify the Delete action on Transport Path
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Network Build" in Search Tab             
    And I select Network type as "Transport Path" in Search tab 
    And I select Device Role as "NID" and Device Name as "<DeviceName>"
    And I click on search button for "Transport Path"
    Then I verify "Transport Path result screen"
    And I click on "DELETE" in Create Transport Path
    Then I Validate the Success message for "Delete" action
      
    
  
  ###################################################################################################
  
 
  ############################################################################################################
   @GETENF-15331 
  Scenario: OV Disconnect Task Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I select "Disconnect Tasks" in Search slider
    And I verify whether Disconnect search options are visible
  
  
  
  @GETENF-5317
 Scenario: Validate the related tabs of a Service Area.
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Service Area" google search
    And I "click on GO button"
    And I should see the "Servicearea Search screen values" been displayed
    And I should see the "associated device and location for service area" been displayed 
 	 	
  
   @GETENF-4994
 Scenario Outline: NIC_Ethernet_Reg_Validate Related tabs  in Host Client or Satellite topology
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab    
    And I go to "Inventory" Search type and select "Topology" as Inventory type   
    And I select Topology type as "<Search Topology Type>" in search tab 
    And I select Topology role as "Host Client or Satellite" in search tab 
    And I click on search button for "Topology"
    And I click on view icon in Search Result page
    And I click on topology view related tab
    And I validate the topology view related tab
		Then I should see the "Topology Search screen attributes" been displayed
		And I validate the Circuits view related tab
		Then I should see the "related tabs of topology" been displayed
#		And I validate the Devices view related tab
#		Then I should see the "Associated Devices" been displayed
#		And I validate the Locations view related tab
#		Then I should see the "Associated Locations" been displayed
#		And I validate the SVLAN view related tab
#		Then I should see the "Associated SVLAN" been displayed
#		
			Examples: 
 			|Search Topology Type |
  		|Generic Network 			|
  		
  		 @GETENF-4981
 Scenario Outline: NIC_Ethernet_Reg_Validate related tabs of Generic Network Topology
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab    
    And I go to "Inventory" Search type and select "Topology" as Inventory type   
    And I select Topology type as "<Search Topology Type>" in search tab 
    And I select Topology role as "Host Client or Satellite" in search tab 
    And I click on search button for "Topology"
    And I click on view icon in Search Result page
    And I click on topology view related tab
    And I validate the topology view related tab
		Then I should see the "Topology Search screen attributes" been displayed
		And I validate the Circuits view related tab
		Then I should see the "related tabs of topology" been displayed
		
		
			Examples: 
 			|Search Topology Type |
  		|Generic Network 			|
  
   @GETENF-5023
 Scenario Outline: NIC_Ethernet_Reg_OMNIVUE-Validate Topology View related tab for Host Client or Satellite topology
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab    
    And I go to "Inventory" Search type and select "Topology" as Inventory type   
     And I select Topology type as "<Search Topology Type>" in search tab 
     And I select Topology role as "Host Client or Satellite" in search tab 
    And I click on search button for "Topology"
    And I click on view icon in Search Result page
    And I click on topology view related tab
    And I validate the topology view related tab
		Then I should see the "Topology Search screen attributes" been displayed
		
			Examples: 
 			|Search Topology Type |
  		|Generic Network 			|
 	 	
   @GETENF-5120
  Scenario: Verify Google Sytle Search for Subscriber Full Name
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Subscriber" google search
    And I "click on GO button"
    And I should see the "Subscriber details tab opened" been displayed
    
    
    
    
  ################################################SPRINT-6####################################################
  

@GETENF-4019
   Scenario: OV -  Automate MCO Mapping - LAG Circuit Edit Screen- UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
		And I select Circuit type as "LAG"  
		And I click on search button for "Circuit" 
		And I click on view icon in Search Result page
		And I click on "Edit" in Circuit page 
		Then I validate whether MCO field is disabled
		
		@GETENF-4014
   Scenario: OV -Automate MCO Mapping - Ethernet Bearer Circuit Edit Screen - UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
		And I select Circuit type as "Ethernet Bearer"  
		And I click on search button for "Circuit" 
		And I click on view icon in Search Result page
		And I click on "Edit" in Circuit page 
		Then I validate whether MCO field is disabled
		
		@GETENF-4015
   Scenario Outline: OV -Automate MCO Mapping - MEF ENNI Service Edit Screen- UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    Then I validate whether MCO field for MEFEENNI service is disabled
		
		Examples:
      | Search Service Type	|
      |	MEF ENNI									|  
      
      @GETENF-4006
   Scenario Outline: OV - Automate MCO Mapping - MEF UNI Service Edit Screen - UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    Then I validate whether MCO field for MEFUNI service is disabled
		
		Examples:
      | Search Service Type	|
      |	MEF UNI									|
		
		
		
		 @GETENF-4005
   Scenario Outline: OV - Automate MCO Mapping - MEF OVC Service Edit Screen - UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    Then I validate whether MCO field for MEFOVC service is disabled
		
		Examples:
      | Search Service Type	|
      |	MEF OVC									|
      
      
      @GETENF-4004
   Scenario Outline: OV - Automate MCO Mapping - MEF OVC Service Edit Screen - UI changes
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    Then I validate whether MCO field for MEFEVC service is disabled
		
		Examples:
      | Search Service Type	|
      |	MEF EVC									|
  
  
  
  
  #####################################################################################################
  
  ###################Update
  
   @GETENF-5070
  Scenario Outline: NIC_Ethernet_Reg_Verify the update functionality of MEF ENNI Service
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I "Update MEF ENNI Service Page"
    And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
    
    
    Examples:
      | Search Service Type	|
      |	MEF ENNI									|     
      
      
      @GETENF-5027
  Scenario Outline: NIC_Ethernet_Reg_Verify update functionality Probe UNI for all fields
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I "Update Probe UNI Service Page"
    And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
		
		 Examples:
      | Search Service Type	|
      |	Probe UNI									|
      
 @GETENF-5014
  Scenario Outline: NIC_Ethernet_Reg_Verify the update functionality of MEF UNI Servicee
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I "Update MEF EVC Service Page"
    And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
		Examples:
      | Search Service Type	|
      |	MEF UNI									| 
		

 @GETENF-5015
  Scenario Outline: NIC_Ethernet_Reg_Verify update functionality MEF EVC service
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I "Update MEF EVC Service Page"
    And I click on "Save" button on Service page
		And I Validate the service "<Search Service Type>" field values in database
    
    
    Examples:
      | Search Service Type	|
      |	MEF EVC									|  
      
    ###################Delete  
    
    
    @Createest
    	Scenario Outline: Verify the functionality of Create Button for create form - service type
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Service"
   	And I Select "<Service Type>" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "<Service Test data>"
    And I fill the subscriber details in service page
     And I click on "Create" button on Service page
    Then Service should get created successfully
    And I click on "Delete" button on Service page
    
   Examples: 
    |Service Type		|Service Test data									|
   	|Host Service			|HOST Service-TC44387 data		|
   	
   	
   	@GETENF-asdasd
       Scenario: NIC_GPON_Reg_Verify the delete functionality of DSL OVC Service 
   	Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "Probe UNI" for the drop down Service Type
    And I click the "Launch Create Form" button    
    And I fill the subscriber details in service page  
    And I fill all the mandatory fields required for "Probe UNI"
    And I enter "BRIX device" : "CNRPMN43111-111" in "PROBE UNI" Service Association Section
    And I Enter MSC UNI : "12/TEST/012218//MSC" in MSC UNI Probe Uni Service Association section
    When I click on Create button of "Probe UNI" page
    Then Service should get created successfully   
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
 	  And I click on "Delete" button on Service page
  
      
       @GETENF-5310
       Scenario: NIC_GPON_Reg_Verify the delete functionality of DSL OVC Service  
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "DSL OVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page 
    #And I fill all the mandatory fields required in service create form with "MEF UNI"
   ## And I fill all the mandatory fields required for "MEF UNI"
    #And I select device : "OCALFLTS111-112"  in "MEF UNI" Service
    #When I click on Create button of "MEF UNI" page
    #Then Service should get created successfully
    #Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
    #And I click on "Delete" button on Service page
 
  ###########################################################################################################
  
  
  
  
  
  
  
  ##################################
  @tdemo
  Scenario: Validating start and end LAG
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    #And I select Circuit type as "LAG"
    #And I click on search button for "Circuit"
    #And I click on view icon in Search Result page
    #And In the 360 view I click on the "Circuits" tab
    #And I click on "Edit" in Circuit page
  
  ####################################
  
  
  
  
    #################################################  06--19--07-02  ##############################################################################
   ######################################## US311066: EVC_NCI codes dropdown for EVC OVC members on the related tab should only show list of valid EVC-NCI codes ###########
   @TC398593 @In_Sprint1
   Scenario: @TC398593-TC398883- Validate EVC-NCI values appear in the dropdown list for EVC Members in the EVC-NCI drop down after associating a member
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF EVC with PM BRIX"
    And I fill the subscriber details in service page
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And In the 360 view I click on the "Members" tab
    And I click on "Add Member" button on Service page
   And I validate "NCI" drop down values in DB
    And I Associate MEF UNI with "49/MEF1/012349//NOPM" Non PM Spec Code to mefovc service
    And I expand the associated service
    And I click on "Edit" button on Service page
    And I validate "NCI" drop down values in DB
    @TC398593
   Scenario: @TC398593-TC398883- Validate EVC-NCI values appear in the dropdown list for EVC Members in the EVC-NCI drop down after associating a member
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF OVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF EVC with PM BRIX"
    And I fill the subscriber details in service page
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And In the 360 view I click on the "Members" tab
    And I click on "Add Member" button on Service page
   And I validate "NCI" drop down values in DB
    And I Associate MEF UNI with "49/MEF1/012349//NOPM" Non PM Spec Code to mefovc service
    And I expand the associated service
    And I click on "Edit" button on Service page
    And I validate "NCI" drop down values in DB
   
   
    
 
  ########################################### @04-24—05-07 ###############################################################################
  ################################################## US310924: OV: Service Type Indicator field needs to be mandatory  #####################################################
  @TC253500
  Scenario: @TC253500 -Topology Diagram - Host Client or Satellite-validating google maps option
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form
    And I click on "AddDevice" button
    And I should see the "Device Role is updated as HOST in Topology create form" been displayed
    And I associate device having role "HOST" in Topology create form
    And I click on "Create" button in Topology Screen
    And I click on Topology view related tab
    Then I validate Google maps option is displayed in the Topology view related tab
    
    @TC255489 @TC255454
  Scenario Outline: TC255454-TC255489-NIC_Ethernet_Reg_Ethernet Device_Validate user is able to create device with Vectoring Type as XXX Internal
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "" Vectoring Topology
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Internal Vectoring  details and validate database"
   Examples: 
      | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
      | NID        | Adtran Total Access 5000          | ADTRAN Total Access 5000 23 Inch Chassis | Ethernet_Device | 384 Internal    | TD,DSLAM,MSAP,NID | 384 Internal,192 Internal |
    #  | TD         | Calix E3-48 Series                | Calix E3-48 r2                           | Ethernet_Device | 192 Internal    | TD, DSLAM, AGG    | 192 Internal              |
    #  | OLT        | Calix E7                                                                                       | Calix E7-2                                                  | GPON_OLT_Device | 192 Internal     | OLT               | 384 Internal,192 Internal    |

@TC287876 @TC255491 @TC255488
   Scenario Outline: TC287876-TC255491-TC255488 NIC_Ethernet_Reg_GPON Device_Validate user is able to create device with Vectoring Type as XXX External by associating new Vectoring topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "Create Vectoring Topology" Vectoring Topology
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
    And I verify "External Vectoring  details and validate database"
    Examples: 
    | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
    | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
  #  | OLT        | Calix E7                                                                                         | Calix E7-2                                                  | GPON_OLT_Device | 384 External    | OLT               | 384 External                 |
    

  @TC254792
  Scenario Outline: TC287877-NIC_Ethernet_Reg_Edit Device Details by updating Vectoring type as External and associating Existing Vectoring topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
    And I clicked the "Edit-Network details" button in Device Detail Page
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "EXISTING TOPOLOGY" Vectoring Topology in Device details tab
    And I clicked the "Network Tab-Save" button in Device Detail Page
    #And I Click on "Networking Details" tab on Device Search page
    And I verify "External Vectoring  details and validate database"

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata        | Vectroring_Type | Allowed_Devices | Vectroring_Type Allowed |
      #| AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
      | OLT        | Calix E7   | Calix E7-2    | GPON_OLT_Device | 384 External    | OLT             | 384 External            |
 
  
 
@TC355123
    Scenario Outline: @TC355123 -Host Client or Satellite Topology-Create-Verify Host sequence number is derived using Host Device Subtype
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as ALU-Nokia 7750 Series" in Topology create form
    #And I click on "AddDevice" button
    #And I search Device Type as "Alcatel-Lucent 7750 Service Router"
    And I click on "AddDevice" button
    And I search Device Type as "<Device Type>" and Device SubType as "<Device SubType>"
    And I click on "Create" button in Topology Screen
    Then I validate the Host sequence number for the created Topology with "<Device Type>" and "<Device SubType>"
    
    Examples: 
    |Device Type                               |Device SubType              |                                        
    |Alcatel-Lucent 7750 Service Router        |Alcatel-Lucent 7750 SR-12   |
  #  |Alcatel-Lucent 7750 Service Router        |Alcatel-Lucent 7750 SR-12e  | 
 #   |Alcatel-Lucent 7750 Service Router        |Alcatel-Lucent 7750 SR-7    |
  #  |Alcatel-Lucent 7750 Service Router        |Nokia 7750 SR-12-B          |


  @04-24—05-07 @US310924 @TC381173 @TC381175 @PilotTesting
  Scenario: @TC381173 @TC381175 -Validate Service Type Indicator field is mandatory while MEF EVC create
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF EVC-TC44385 data"
    And I fill the subscriber details in service page
    And I click on "Create" button on Service page
    Then I validate warning message displayed
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I click on "Edit" button on Service page
    And I select blank in to Service Type Indicator
    And I click on "Save" button on Service page
    Then I validate warning message displayed in the deatils tab
    And I select "EVPL" in Service Type Indicator field in the deatils tab
    And I click on "Save" button on Service page
    And I click on "Delete" button on Service page

  @04-24—05-07 @US310924 @TC381177 @TC381189 @PilotTesting
  Scenario: @TC381177 @TC381189 -Verify Service Type indicator is mandatory in MEF OVC details page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF OVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF OVC-TC44386 data"
    And I fill Subscriber details  "MEF OVC Subscriberdata"
    And I click on "Create" button on Service page
    Then I validate warning message displayed
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I click on "Edit" button on Service page
    And I select blank in to Service Type Indicator
    And I click on "Save" button on Service page
    Then I validate warning message displayed in the deatils tab
    And I select "EVPL" in Service Type Indicator field in the deatils tab
    And I click on "Save" button on Service page
    And I click on "Delete" button on Service page

  ############################################################### US312552: Device Details Page fields should update with correct values in ARM DB when edited ######################
  @04-24—05-07 @US312552 @TC381702 @TC381700 @PilotTesting
  Scenario: @TC381702 @TC381700 -Validate the Management VLAN field is updated with the Valid value on  Device Management VLAN edit.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role
    And I fill all the mandatory fields with "Ethernet_Device" data
    And I click on "Create" button in Device Create Screen
    When I clicked the "Edit" button in Device Detail Page
    And I change the Management VLAN field to valid value
    Then I clicked the "Save" button in Device Detail Page
    Then I validate the value updated in the Device details page
    And I validate the updated MGMTVLAN status in DB
    When I clicked the "Edit" button in Device Detail Page
    And I change the Management VLAN field to blank value
    Then I clicked the "Save" button in Device Detail Page
    Then I validate the value updated in the Device details page

  ############################################### @04-24—05-07-END   ###############################################################################
  ####################################### 03-13--03-26 #################################################
  ########################################################### US289389: CR7231 - Building Extension Details on Order Detail Advanced Search ################
  @03-13--03-26 @US289389 @TC369352 @TC369353 @PilotTesting
  Scenario: @TC369352 @TC369353 Validate the GETO field dropdown is displayed under the Order parameter section, on performing Order Details Advanced Search.
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
    And I select "Orders" in Search slider
    And I select "Ethernet" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    Then I validate the GETO value field is displayed in Order Parameters Section
    Then I validate the values displayed under the GETO value field

  ####################################### DE72892: Maint - NIC GPON - OV is not passing the Street Dir Prefix,Street Dir Suffix, Street Type also impacting searching when predirectionals are involved ###########
  @03-13--03-26 @TC365441 @DE72892 @TC365499 @passed @PilotTesting
  Scenario: @TC365441 @TC365499 DE72892-Validate the values displayed under the Street Dir Prefix, Street Dir Suffix and Street Type for  an address range in create mode.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC365441"
    And I click on "Create button" on Location page
    Then I validate the values displayed in the UI
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"
    And I click on "Add Individual Addresses button" on Location page
    Then I validate street dir prefix,street dir suffix and street type are not enabled

  @03-13--03-26 @DE72892 @TC365499 @TC365457
  Scenario: @TC365499 @TC365457 – Validate the values displayed under Street Dir Prefix, Street Dir Suffix and Street Type for an Address range on creation and Associating an Individual Address.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC165244"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"
    And I click on "Add Individual Addresses button" on Location page
    Then I verify "Create Addresses Within Range create form should be displayed"
    And I "fill all the mandatory fields and click on create in Addresses within range create form"
    Then I verify "New locations added within range should be displayed in the Address range location related tab"
    Then I verify "Update Editable fields to null in OV location page and validate database"
    Then I verify "Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range"
    Then I validate the values displayed in the UI for the created individual address
    And I click on "Delete button-individual location1" on Location page
    And I click on "Delete button-individual location2" on Location page
    And I click on "Delete address range button" on Location page

  @03-13--03-26 @DE72892 @Pass @TC365466 @PilotTesting
  Scenario: @TC365466 -Verify the functionality of Individual Location Create Button when ICO is selected as YES
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    #And I click the "Launch Create Form" button
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC365466-Individual Addresses"
    And I click on "Create button" on Location page
    Then I verify "Location address created successfully message should be displayed in create address range page"
    Then I validate the values displayed in the UI for the created individual address
    And I click on "Delete button" on Location page

  @03-13--03-26 @DE72892 @TC365482 @PilotTesting
  Scenario: @TC365482 - Validate the displayed under Street Dir Prefix, Street Dir Suffix and Street Type for an Individual Address on edit.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC365482-Individual Addresses"
    And I click on "Create button" on Location page
    Then I verify "Location address created successfully message should be displayed in create address range page"
    And I click on "Edit button-individual location" on Location page
    And I update the fields in Individual adress
    And I click on "Save button" on Location page
    And I click on "Delete button" on Location page

  ###################################################### US303544: (OV Test Copy) CR7120: ICL - Create Device (Test Only) ########################################
  @03-13--03-26 @US303544 @TC366382 @TC366382 @PilotTesting
  Scenario Outline: @TC366382 @TC366382 OV- Validating atributes of Create Device Screen for "<Devicerole>" role
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I click on "Create" button in Device Create Screen
    Then I Validate "SUPPORTS_OVER_SUBSCRIPTION" and "OVER_SUBSCRIPTION_AMOUNT" columns in ext_device_type for the created device

    Examples: 
      | Devicerole | Devicetype        | Devicesubtype | Testdata     |
      | NID        | Ciena 3916 Family | Ciena 3916 AC | TC174932-NID |

  #|NID           |Ciena 3916 Family          |Ciena 3916 DC     |           |
  #|NID           |Ciena 3916 Family          |Ciena 3916 Dual AC|           |
  # |NID           |Ciena 3916 Family          |Ciena 3916 Mini AC|           |
  ########################################################################################################## End 03-13--03-26 ################################
  ################################################## Sprint 282 #########################################################
  @Sprint282 @TC355915 @US284915 @TC355917 @US284916 @TC355919 @PilotTesting
  Scenario Outline: @TC355915 @TC355917 @TC355919 -Validate for the GETO Details in the report section is displayed under the gear icon when logged in as Admin.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    #Then I should see "<Gear labels>" label displayed in the Gear dropdown
    And I select "GETO Details" under the Gear Icon
    Then I validate the fields displayed in the GETO Details Report page

    Examples: 
      | Gear labels  |
      | GETO Details |

  ##################################################    US289390_CR7231  #########################################################
  #@Sprint282 @TC368790 @US289390 @TC368712
  Scenario: @TC368790-@TC368712-Validate GETO drop down values in task advance search page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    #And I make the page 100%
    And I clicked on Advance Search for "Task"
    Then I validate the GETO value field is displayed in the Task advanced search page

  ############# 	Sprint 278 Start#########################
  ############# 	US276880 -- OV - Modifications to Host Client or Satellite topology Create page #########################
  ############# 	TC334129 -- RTB-US276875- Validate Topology Device Type and Device sub type values for ALU-Nokia 7750 seriesTopology Type on the Create tapology page for Generic topology  #########################
  @PI15 @Sprint278 @US276880 @TC334129 @PilotTesting
  Scenario: @TC334129 -RTB-US276875- Validate Topology Device Type and Device sub type values for ALU-Nokia 7750 seriesTopology Type on the Create tapology page for Generic topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as ALU-Nokia 7750 Series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Alcatel-Lucent 7750 Service Router"
    And I click on "AddDevice" button
    And I search Device Type as "Nokia 7210 SAS-S" and Device SubType as "Nokia 7210 SAS-Sx 46F2C4SFP+"
    And I click on "Create" button in Topology Screen
    And I Validate Audit Logs of Topology
    #And I Validated related tab Topology view Page
    Then I Validated Delete Topology view Page

  ############# 	TC335174 -- RTB-US276875- Validate Topology Device Type and Device sub type values for Client device on the Create tapology page for Generic topology  #########################
  @PI15 @Sprint278 @US276880 @TC336482
  Scenario: @TC335174 -- RTB-US276875- Validate Topology Device Type and Device sub type values for Client device on the Create tapology page for Generic topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series"
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series" and Device SubType as "Cisco ASR 9006"
    And I click on "Create" button in Topology Screen
    And I Validate Audit Logs of Topology
    #And I Validated related tab Topology view Page
    Then I Validated Delete Topology view Page

  ############# 	TC336482 -- RTB-US276875- Validate Topology Device Type and Device sub type values for Cisco ASR 9000 seriesTopology Type on the Create tapology page for Generic topology  #########################
  @PI15 @Sprint278 @US276880 @TC336482
  Scenario: @TC336482 -RTB-US276875- Validate Topology Device Type and Device sub type values for Cisco ASR 9000 seriesTopology Type on the Create tapology page for Generic topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series"
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series" and Device SubType as "Cisco ASR 9006"
    And I click on "Create" button in Topology Screen
    And I Validate Audit Logs of Topology
    #And I Validated related tab Topology view Page
    Then I Validated Delete Topology view Page

  ############# 	US276882 -- OV - Modifications to Host Client or Satellite topology update page  #########################
  ############# 	TC333960 -- RTB_US276878_TC001_Verify the Topology Technology Type field behavior in Topology details tab for Host Client or Satellite Topology  #########################
  @PI15 @Sprint278 @US276882 @TC333960 @PilotTesting
  Scenario: @TC333960 -RTB_US276878_TC001_Verify the Topology Technology Type field behavior in Topology details tab for Host Client or Satellite Topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" and Technology Type as "ALU-Nokia 7750 Series" in search tab
    And I click on search button for "Inventory"
    And I make the page 100%
    And I click on view icon
    Then I should see the "Technology Type as ALU-Nokia 7750 series with Role as Host Client or Satellite" been displayed
    And I click on "Edit" button in Topology details page
    Then I click on AddDevice button and validate the deviceType as "Nokia 7210 SAS-S"

  ################################################## US276875: OV - Populate Topology Technology Type values for Host Client or Satellite topology on Create page #########################################################
  @Jan @Sprint278 @TC331544 @US276875 @PilotTesting
  Scenario: @TC335174 -- RTB-US276875- Validate Topology Device Type and Device sub type values for Client device on the Create tapology page for Generic topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I should see the "Topology Technology Type values for Host Client or SatelliteTopology under create topology page" been displayed
    And I should see the "Topology Technology Type values for Host Client or SatelliteTopology of GUI in database" been displayed
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form

  @Jan @Sprint278 @TC331698 @US276875 @PilotTesting
  Scenario: @TC334129 -RTB-US276875- Validate Topology Device Type and Device sub type values for ALU-Nokia 7750 seriesTopology Type on the Create tapology page for Generic topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I should see the "Topology Technology Type values for Host Client or SatelliteTopology under create topology page" been displayed
    And I should see the "Topology Technology Type values for Host Client or SatelliteTopology of GUI in database" been displayed
    And I select the "Topology Technology Type as ALU-Nokia 7750 Series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Alcatel-Lucent 7750 Service Router"
    And I click on "AddDevice" button
    And I search Device Type as "Nokia 7210 SAS-S" and Device SubType as "Nokia 7210 SAS-Sx 46F2C4SFP+"
    And I click on "Create" button in Topology Screen
    And I Validate Audit Logs of Topology
    Then I Validated Delete Topology view Page

  ##########################################################################################################################################
  ###################### US276878: OV - Populate Topology Technology Type values for Host Client or Satellite topology on Search Slider ###############################
  @Jan @Sprint278 @US276878 @TC331692 @PilotTesting
  Scenario: @TC331692  RTB_US276878_Verify the Topology Technology Type values for Host Client or Satellite topology in the search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    Then I should see the "Topology Technology Type values for Host Client or Satellite Topology under Search slider" been displayed
    And I should see the "Topology Technology Type values for Host Client or SatelliteTopology of GUI in database" been displayed

  ###############################################################################################################################################
  ############################################US276879: OV - Populate Topology Technology Type values for Host Client or Satellite topology in Advanced Search###############################################################
  @Jan @Sprint278 @TC331507 @US276879 @TC331510 @PilotTesting
  Scenario: @TC331507-TC331510- ValidateTopology Technology Type values for Host Client or Satellite topology in Advanced Search    Given I am logged in as a "Admin" user in Omnivue
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I clicked on Advance Search for "Topology"
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in Advance Search Topology
    Then I should see the "Topology Technology Type values for Host Client or SatelliteTopology" been displayed
    Then I should see the "Topology Technology Type values for Host Client or SatelliteTopology under Advance Topology search" been displayed
    And I should see the "Topology Technology Type values for Host Client or SatelliteTopology of GUI in database" been displayed
    And I click on Advance search button for "Topology"
    And I click on view icon in Search Result page

  ##############################################DE68845 Maint-Ad Hoc-After clicking the “Reset” button, unable to search a circuit on create topology page###########################################################################
  @Jan @Sprint278 @TC335381 @DE68845 @PilotTesting
  Scenario: DE68845 Maint-Ad Hoc-After clicking the “Reset” button, unable to search a circuit on create topology page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series"
    And I click on "Reset" button
    And I click on "AddCircuit" button
    And I associate circuit type as "EB" in Topology create form
    And I click on "AddCircuit" button
    And I associate circuit type as "LAG" in Topology create form

  ################################################### US276881: OV - Modifications to Host Client or Satellite topology Create page - Sequence number validation #
  @Jan @Sprint278 @US276881 @TC335179
  Scenario: @TC335179 RTB-US276881- Validate sequence number for Host device on the Create tapology page for Generic topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series"
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series" and Device SubType as "Cisco ASR 9006"
    And I verify sequence number

  ################################################## Sprint 278 end #########################################################
  ################################################## Sprint 277 #########################################################
  ################################################## US275654 C459 - OV - HD00010599592 MEF EVC Edit(PM Type Field) #########################################################
  ################################################## MAINT_US275654_Verify the PM Flag and SLA Template is getting null after we remove the PM Type from a MEF EVC Service #########################################################
  @PI16 @Sprint277 @US275654 @TC330777 @PilotTesting
  Scenario: Scenario: @TC330777 - Verify the PM Flag and SLA Template is getting null after we remove the PM Type from a MEF EVC Service
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Service" as Inventory type
    And I select Service Type values as "MEF EVC" under Service Search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I updated PM Type dropdown to "-Select-"
    When I click on "Save" button on Service page
    Then I Validate PM Type dropdown values in database

  ################################################## End Sprint 277 #########################################################
  ################################################## Sprint 275 #########################################################
  ###################################################US267740 HD00010478951 - ADVANCE DEVICE SEARCH MCO: MPLS% (WILD CARD)##########
  @PI16 @Sprint275 @US267740 @TC323073 @PilotTesting
  Scenario: @TC323073 -Validation of platform ID on device search page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I enter the MCO value as "MPL%" in Device advance search page
    And I click on Advance search button for "Device"
    And I validate the search result with MCO value as "MPL%" in DB

  ################################################## DE66445 Maint - Ad-Hoc - GDB Device Build - Build Component – Service Area section: A false call sent to delete service area when user is trying to delete a service area which has not been created yet.
  @PI16 @Sprint275 @DE66445 @TC324662 @PilotTesting
  Scenario: @DE66445 @TC324662 -Maint - Ad-Hoc -DE66445- GDB Device Build - Build Component – Verify the delete functionality for not created /failed service area
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "Service Area" as GDB-Component
    #Then I add "1" more Service Area in GDB
    And I Verify the delete functionality for Service area which are not created

  ###############################################US266855 [CoD: 5] HD00010487486 - Inventory Update-Range ID missing ########################
  @PI16 @Sprint275 @US266855 @TC317739
  Scenario: @TC317739 -US266855: Validate the Address Range ID for a location by advance search.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Address Range" in Location Advance Search screen
    And I click on Advance search button for "Address Range"
    And I click on view icon in Search Result page
    And I should see the "Location Search screen attributes" been displayed
    Then I verify "Address id and Address range dropdown in edit Individual location page within range"

  ################################################## End Sprint 275 #########################################################
  ################################################## Sprint 273 #########################################################
  #@Sprint273 @US264445 @TC317978_1
  Scenario: @TC317978 -OV- Verify Delete all functionality for fiber link between GDB device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I "select all ports from Device A and Device Z in GDB fiber link screen"
    #And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link Create all button" in GDB screen
    Then I verify "all fiber link got created in gdb screen"
    And I click on "Select all check box in fiber link page" in GDB screen
    #When I click on "Fiber link Remove icon button" in GDB screen
    #Then I verify "Audit logs for the fiber link remove functionality"
    And I click on "Fiber link Remove all button" in GDB screen
    Then I verify "Audit logs for the fiber link remove functionality"

  @Sprint273 @US264445 @TC317984_1 @PilotTesting
  Scenario: @TC317984 -Verify that the associated fiber link is automatically deleted from inventory and the GDB screen if the user deletes either start or the end device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    #And I "select all ports from Device A and Device Z in GDB fiber link screen"
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link Create all button" in GDB screen
    And I click on "Delete 2nd Device component" in GDB

  @Sprint273 @US264445 @TC317983
  Scenario: @TC317983 -Verify that the associated fiber link is automatically removed from the GDB screen if the user removes either start or the end device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    #And I "select all ports from Device A and Device Z in GDB fiber link screen"
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link Create all button" in GDB screen
    And I click on "Remove 2nd Device component" in GDB

  @Sprint273 @US264445 @TC317660
  Scenario: @TC317660 -Verify that the user is able to remove already created devices from the GDB screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I Validate the progress bar
    And I Validate created device in database
    And I validate GDB device are created in sequence
    And I validate "Delete indiviual button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
    And I validate "Refresh button" functionality in GDB
    And I validate "Select all button" functionality in GDB
    Then I validate "Delete all button" functionality in GDB
    Then I verify "Device is completely removed from the screen"
    Then I validate audit log for "GDB Create and Delete functionality"

  @Sprint273 @DE62958 @TC306157 @PilotTesting
  Scenario Outline: @TC274297 -Verify for Functional Status field is not mandatory field in EDIT device page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I validate "Functional status is not mandatory" attributes in Search page for "Device"
    And I clicked the "Save" button in Device Detail Page
    And I validate the updated functional status in DB

    Examples: 
      | Device role |
      | SPLITTER    |

  ##################################################### End Sprint 273   ##########################################################
  ################################################## Sprint 268 #########################################################
  #################################################### DE62096 MAINT Ad-Hoc OMNIVue: Data displayed on the ARM Audit Log sub tab is not correct for the first time after we view a circuit#############
  @PI16 @Sprint268 @DE62096 @PilotTesting
  Scenario Outline: @DE62096- Verify that the ARM Audit Logs are getting displayed after the user click on Get Log button-Circuit.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And I Click on "Audit Log" tab on Circuit view page
    When I Click on "ARM Audit Logs" tab
    And I click on the "Get logs in Audit logs button in ARM Log page" in "Circuit" result page

    Examples: 
      | Circuit types |
      | VLAN Segment  |

  @PI16 @Sprint268 @DE62096
  Scenario Outline: @DE62096- Verify that the ARM Audit Logs are getting displayed after the user click on Get Log button-Device.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "ARM Audit Logs" tab
    And I click on the "Get logs in Audit logs button in ARM Log page" in "Device" result page

    Examples: 
      | Device role |
      | OLT         |
#
  #@PI16 @Sprint268 @DE62096
  #Scenario Outline: @DE62096- Verify that the ARM Audit Logs are getting displayed after the user click on Get Log button-Service.
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Search" tab
    #And I Search "Inventory" in Search Tab
    #And I searched for "Service" with "<Search Service Type>" Service Type
    #And I click on search button for "Service"
    #And I click on view icon in Search Result page
    #And I click on "Audit logs" tab on Service Search page
    #When I Click on "ARM Audit Logs" tab
    #And I click on the "Get logs in Audit logs button in ARM Log page" in "Service" result page
#
    #Examples: 
      #| Search Service Type |
      #| HSI                 |

  #|	MEF UNI				|
  ################################################## End Sprint 268 #########################################################
  ################################################## Sprint 266 #########################################################
  ################################################## US246520 MAINT -OV-HD00010312172-RPA #3-: Performance improvement on loading Task Advanced Search page/ Task Search Slider. #########################################################
  ################################################## DE60602 - US244127-MAINT - Not able to view the device which will return only 1 device from Advance Search Page #########################################################
  @PI15 @Sprint266 @DE60602 @PilotTesting
  Scenario: @DE60602 - US244127-MAINT - Not able to view the device which will return only 1 device from Advance Search Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    Then I Enter device name in device advance search and validate results page

  ################################################## DE60637 -US244127--MAINT - Not able to search a Device using Location Address field(SOLR Selected) from Device Advanced Search #########################################################
  @PI15 @Sprint266 @DE60637 @PilotTesting
  Scenario: @DE60637 -US244127--MAINT - Not able to search a Device using Location Address field(SOLR Selected) from Device Advanced Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select location address "Auto" from solr in device advance search
    Then I click on search button in device advance search page and validate results page

  ############################################################## US246520 MAINT -OV-HD00010312172-RPA #3-: Performance improvement on loading Task Advanced Search page/ Task Search Slider. #########################################################
  @PI15 @Sprint266 @US246520 @TC297479 @PilotTesting
  Scenario: @TC297479 -MAINT_US246520_Verify static content of drop down values in Task Search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    Then I verify "Task search slider dropdown values"

  @PI15 @Sprint266 @US246520 @TC297480 @PilotTesting
  Scenario: @TC297480 -MAINT_US246520_Verify static content of drop down values in Task Advance Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I clicked on Advance Search for "Task"
    Then I verify "Task Advance search dropdown values"

  @PI15 @Sprint266 @US2465200 @TC297998 @PilotTesting
  Scenario Outline: @TC297998 -MAINT_US246520_Verify search functionality by using drop down values in Task Search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I selected value "<Value1>" from "<Dropdown1>" dropdown in task search slider
    And I selected value "<Value2>" from "<Dropdown2>" dropdown in task search slider
    Then I click on task search and validate task results page

    Examples: 
      | Value1    | Dropdown1  | Value2 | Dropdown2 |
      | Completed | TaskStatus | CDP    | Workgroup |

  #| Completed 						| TaskStatus      			| ONT Out Of Capacity		|	TaskName						|
  #| Completed 						| TaskStatus      			| 120 - MAINE			    	|	Lata								|
  #| Completed 						| TaskStatus      			| AK-Alaska			    		|	State								|
  @PI15 @Sprint266 @US2465201 @TC297999 @PilotTesting
  Scenario Outline: @TC297999 -MAINT_US246520_Verify search functionality by using drop down values in Task Advance Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I clicked on Advance Search for "Task"
    And I selected value "<Value1>" from "<Dropdown1>" dropdown in task advance search
    And I selected value "<Value2>" from "<Dropdown2>" dropdown in task advance search
    Then I click on task advance search and validate task results page

    Examples: 
      | Value1    | Dropdown1  | Value2 | Dropdown2 |
      | Completed | TaskStatus | CDP    | Workgroup |

  #| Completed 						| TaskStatus      			| ONT Out Of Capacity		|	TaskName						|
  #| Completed 						| TaskStatus      			| 120 - MAINE			    	|	Lata								|
  #| Completed 						| TaskStatus      			| HSI					    			|	ComponentType				|
  #| Completed 						| TaskStatus      			| ANY						    		|	ErrorReason					|
  #| Completed 						| TaskStatus      			| AK-Alaska			    		|	State								|
  ################################################## DE60846 - Ad-Hoc - MAINT – Address Range Id is not getting displayed in location edit page #########################################################
  #@PI15 @Sprint266 @DE60846 @TC298221
  #Scenario: @TC298221- DE60846_ MAINT – Verify Address Range Id in within range Individual location edit page
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Location"
  #And I Select "Address Range" in Location type drop down
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in Location create form with "TC165244"
  #And I click on "Create button" on Location page
  #Then I verify "Address Range should get created successfully message should be displayed in create address range page"
  #And I click on "Add Individual Addresses button" on Location page
  #Then I verify "Create Addresses Within Range create form should be displayed"
  #And I "fill all the mandatory fields and click on create in Addresses within range create form"
  #Then I verify "New locations added within range should be displayed in the Address range location related tab"
  #Then I verify "Address id and Address range dropdown in edit Individual location page within range"
  ################################################## DE60044 - Same device list is getting displayed in each page of device search result page #########################################################
  @PI15 @Sprint266 @F26046 @DE60044 @TC297120 @PilotTesting
  Scenario: @TC297120 -Maintenace : OMNIVUE - Same device list is getting displayed in each page of device search result page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I select device type as "Calix E7" in device search slider
    And I click on search button for "Device"
    And I verity device list by selecting "100" row option
    Then I verify "1st page 100 device list with 2nd page device list"

  ######################################################################## US251016 HD00009550628 - Device List pagination -  Records per page ##################################################
  @PI15 @Sprint266 @F25123 @US251016 @TC298155 @PilotTesting
  Scenario: @TC298155 US251016 - Maint: Verify 500 row option for the device list pagination while search devices from search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I select device type as "Calix E7" in device search slider
    And I click on search button for "Device"
    And I verity device list by selecting "500" row option
    Then I verify "1st page 500 device list with 2nd page device list"

  @PI15 @Sprint266 @F25123 @US251016 @TC298159 @PilotTesting
  Scenario: @TC298159 US251016 - Maint: Verify 500 row option for the device list pagination while search devices from Advance search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "OLT" in Device advance search
    And I select device type as "Calix E7" & subtype as "Calix E7-2" in Device advance search
    And I click on Advance search button for "Device"
    And I verity device list by selecting "500" row option
    Then I verify "1st page 500 device list with 2nd page device list"

  @PI15 @Sprint266 @F25123 @US251016 @TC298161 @PilotTesting
  Scenario: @TC298161 US251016 - Maint: Verify 500 row option for the device list pagination while search devices with selecting vector enabled check box from search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    Then I verify "Verify the Vector Enabled check box instead of Include vectoring check box in device search slider"
    When I "select the Vector Enabled checkbox on search slider and click on search button"
    And I verity device list by selecting "500" row option
    Then I verify "1st page 500 device list with 2nd page device list"

  @PI15 @Sprint266 @F25123 @US251016 @TC298162 @PilotTesting
  Scenario: @TC298162 US251016 - Maint: Verify 500 row option for the device list pagination while search devices with selecting vector enabled check box from Advance search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    Then I verify "the device advanced search result by selecting Vector Enabled check box"
    And I verity device list by selecting "500" row option
    Then I verify "1st page 500 device list with 2nd page device list"

  ##################################### DE60274:MAINT: Clc Contact is displaying twice in the activity focus dropdown ########################
  @PI15 @Sprint266 @DE60274 @TC296958 @PilotTesting
  Scenario: @DE60274 - Clc Contact is displaying twice in the activity focus dropdown
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Audit Logs" under the Gear Icon
    And I verify the duplicate vales in activity focus

  ############################# US248303: Remove link to Consumer OSS Wiki from OMNIVue Help Icon (?)#########################################
  @PI15 @Sprint266 @US248303 @TC296912 @PilotTesting
  Scenario: @TC2969121 - CR59:US248303- Validate HELP Icon in OMNIVUE
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Help Icon" in Omnivue Homepage
    And I validate the new web page displayed in new tab
    And I validate OMNIVUE configurable_data_xref table

  #############################################################################################################################
  ##############################################################Sprint 265##################################################################
  ################################US244461:Get Next Buttons - UI - Search Capability########################################################
  #@PI15 @Sprint265 @F26046 @US244461 @TC293681 @TC293683 @In_Sprint1
  #Scenario Outline: @TC293681 - Verify Search GetNext Attribute search --Button Adminstrative name
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Gear Icon" in Omnivue Homepage
  #And I select "Get Next Buttons" under the Gear Icon
  #And I click on "Get Next Buttons" link
  #And I Select "<Attribute_name>" from GetNext Attributes
  #And I click on "Search" button in getnext page
  #And I verify the mandatory field validation message
  #And I Enter partial value "<Partial_value>" in "<Attribute_name>" in Manage GetNext Attributes
  #And I click on "Search" button in getnext page
  #And I Validate the GetNext Attribute search result
  #And I Enter complete value "<Complete_value>" in "<Attribute_name>" in Manage GetNext Attributes
  #And I click on "Search" button in getnext page
  #And I Validate the GetNext Attribute search result
  #And I verify "Export to excel,print and pagination in manage get next buttons page"
  #Then I verify "Search action in TRACK_USER table"
  #
  #Examples:
  #| Attribute_name             | Partial_value | Complete_value |
  #| Button Administrative Name | GetNext       | GetNext_CDP    |
  #| WorkMate Rule Invoked      | GetNext       | GetNext_CDP    |
  ################################US244630-Verify the Add Get Next Button LookUp ########################################################
  @PI15 @Sprint265 @F26046 @US244630 @TC293379 @In_Sprint1 @PilotTesting
  Scenario: @TC293379 - Verify the Add Get Next Button LookUp
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    Then I verify "Add Get Next Button Look Up Attributes"
    And I click on "Save" on Add Get Next Button LooK Up
    Then I verify "look up message"
    And I click on "Add GetNext Button" button in getnext page
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    And I click on "Clear" on Add Get Next button LooK Up

  @TC293435 @PI15 @Sprint265 @F26046 @US244630 @In_Sprint1 @PilotTesting
  Scenario: @TC293435 - Verify the Add Get Next Button LookUp-Duplicate value validation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    # And I click on "Save" on Add Get Next Button LooK Up
    Then I verify "Getnext button create action"
    And I click on "Add GetNext Button" button in getnext page
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    Then I verify "Getnext button create action"
    Then I verify "look up message"
    Then I verify "Getnext button update action"
    Then I verify "Getnext button delete action"

  @PI15 @Sprint265 @F26046 @US244630 @TC293381 @In_Sprint1 @PilotTesting
  Scenario: @TC293381 - Validate Get Next Buttons link in gear icon for an Admin Option in OV UI
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    Then I verify "Deafult value for Administrative,Color,FontColor textbox"

  ##############################################US244490_Get Next Buttons - UI -  List view##########################################
  @PI15 @Sprint265 @F26046 @US244490 @TC293279 @In_Sprint1 @PilotTesting
  Scenario: @TC293279 - MAINT_US244490_Verify List view columns in Get Next Attribute Search Results page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    Then I verify "Column headers in the Get Next Attribute Search Results page"

  @PI15 @Sprint265 @F26046 @US244490 @TC293282 @TC293285 @TC293287 @In_Sprint1 @PilotTesting
  Scenario: @TC29328  MAINT_US244490_Get Next Buttons - UI -  List view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    Then I verify "Getnext button create action"
    Then I verify "Getnext button update action"
    Then I verify "Getnext button delete action"

  ##############################################################End of Sprint 265#############################################################
  ####################################### Sprint 264 ###################################################################
  ############################		US244363: Get Next Buttons Option in OV UI ##############################################################
  @PI15 @Sprint264 @F26046 @US244363 @TC291495 @In_Sprint1 @PilotTesting
  Scenario: @TC291495 - Validate Get Next Buttons link in gear icon for an Admin Option in OV UI
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    Then I verify "Event Get Next track in TRACK_USER table"

  ###################################### DE59017: MAINT - OMNIVue - Regression - Not able to view the Contact from related system tab of Locations and device	################
  @PI15 @Sprint264 @DE59017 @TC291486 @In_Sprint1 @PilotTesting
  Scenario: @TC291486 -Verify Related tab Contact from related system tab of Locations
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Individual Location" in Location Advance Search screen
    And I click on Advance search button for "Individual Location"
    And I click on view icon in Search Result page
    And I verified view page and clicked on "Contacts" tab
    And I click on view icon in contacts related tab and I validate contact page

  @PI15 @Sprint264 @DE59017 @TC291486 @In_Sprint1
  Scenario Outline: @DE59017 -Verify data displayed in the related tabs for Contacts - "<Devicerole>" devices
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I click on "Create" button in Device Create Screen
    When In the 360 view I click on the "Contacts" tab
    Then I Click on  Add Contact button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen
    Then I verify "Contact data is displayed in the Device Screen and validate the view icon"

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata     |
      | OLT        | Calix E7   | Calix E7-2    | TC291486-OLT |

  ################################################### END SPRINT 264 #############################
  ############################		Sprint 263  ####################################################
  ############################		US242138: Ad-Hoc - MAINT – Location update is not working for blank values (HD00010234013) - Test Only  ##############################################################
  #@PI15 @F25123 @Sprint263 @US242138 @TC287699 @In_Sprint1
  #Scenario: @TC287699 – Validate user is able to update Address Range - by updating fields values to blank
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Location"
  #And I Select "Address Range" in Location type drop down
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in Location create form with "TC165244"
  #And I click on "Create button" on Location page
  #Then I verify "Address Range should get created successfully message should be displayed in create address range page"
  #And I click on "Add Individual Addresses button" on Location page
  #Then I verify "Create Addresses Within Range create form should be displayed"
  #And I "fill all the mandatory fields and click on create in Addresses within range create form"
  #Then I verify "New locations added within range should be displayed in the Address range location related tab"
  #Then I verify "Update Editable fields to null in OV location page and validate database"
  #Then I verify "Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range"
  #And I click on "Delete button-individual location1" on Location page
  #And I click on "Delete button-individual location2" on Location page
  #And I click on "Delete address range button" on Location page
  #
  #@PI15 @F25123 @Sprint263 @US242138 @TC287762 @In_Sprint1
  #Scenario: @TC287762 - Validate user is able to update Address Range - by updating fields values to not null
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Location"
  #And I Select "Address Range" in Location type drop down
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in Location create form with "TC165244"
  #And I click on "Create button" on Location page
  #Then I verify "Address Range should get created successfully message should be displayed in create address range page"
  #And I click on "Add Individual Addresses button" on Location page
  #Then I verify "Create Addresses Within Range create form should be displayed"
  #And I "fill all the mandatory fields and click on create in Addresses within range create form"
  #And I verify "New locations added within range should be displayed in the Address range location related tab"
  #And I verify "Update Editable fields in OV and validate database for location suffix and prefix"
  #Then I verify "Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range"
  #And I click on "Delete button-individual location1" on Location page
  #And I click on "Delete button-individual location2" on Location page
  #And I click on "Delete address range button" on Location page
  #
  #@PI15 @TC287822 @F25123 @Sprint263 @US242138 @In_Sprint1
  #Scenario: @TC287822 - Validate Address Range update from Location Bulk Update tab by updating values in non-mandatory fields
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Location"
  #And I Select "Address Range" in Location type drop down
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in Location create form with "TC165244"
  #And I click on "Create button" on Location page
  #Then I verify "Address Range should get created successfully message should be displayed in create address range page"
  #And I click on "Add Individual Addresses button" on Location page
  #Then I verify "Create Addresses Within Range create form should be displayed"
  #And I "fill all the mandatory fields and click on create in Addresses within range create form"
  #Then I verify "New locations added within range should be displayed in the Address range location related tab"
  #When I click on "Create" tab 2time
  #And I go to "Inventory" type and select "Location Update"
  #And I fill all the mandatory fields required in Location create form with "Location update quick create-TC2877621 data"
  #And I click the "Launch Create Form" button
  #And I enter Street name in Location bulk update
  #And I fill all the mandatory fields required in Bulk Update Location form with "TC287822 data"
  #And I click on "Update button" of Bulk Update Location
  #Then I verify "Updated bulk location"
  #When I click on "Search" tab 2time
  #And I go to "Inventory" Search type and select "Location" as Inventory type
  #And I clicked on Advance Search for "Location"
  #And I select Location type as "Address Range-Street_name" in Location Advance Search screen
  #And I click on Advance search button for "Address Range-Street_name"
  #And I verify "Newly created address rage and its values in DB"
  #Then I verify "Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range"
  #Then I verify "updated Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range"
  #And I click on "Delete button-individual location1" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #And I click on "Delete button-individual location2" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #And I click on "Delete address range button" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #And I click on "Delete address range button2" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #
  #@PI15 @TC287821 @F25123 @Sprint263 @US242138 @In_Sprint1
  #@TC287821
  #Scenario: @TC287821 - Validate Address Range update from Location Bulk Update tab by updating non-mandatory fields to blank
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Location"
  #And I Select "Address Range" in Location type drop down
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in Location create form with "TC165244"
  #And I click on "Create button" on Location page
  #Then I verify "Address Range should get created successfully message should be displayed in create address range page"
  #And I click on "Add Individual Addresses button" on Location page
  #Then I verify "Create Addresses Within Range create form should be displayed"
  #And I "fill all the mandatory fields and click on create in Addresses within range create form"
  #Then I verify "New locations added within range should be displayed in the Address range location related tab"
  #When I click on "Create" tab 2time
  #And I go to "Inventory" type and select "Location Update"
  #And I fill all the mandatory fields required in Location create form with "Location update quick create-TC2877621 data"
  #And I click the "Launch Create Form" button
  #And I enter Street name in Location bulk update
  #And I fill all the mandatory fields required in Bulk Update Location form with "TC287821 data"
  #And I enter Street name in Location bulk update
  #And I click on "Update button" of Bulk Update Location
  #		Then I verify "Updated bulk location"
  #When I click on "Search" tab 2time
  #And I go to "Inventory" Search type and select "Location" as Inventory type
  #And I clicked on Advance Search for "Location"
  #And I select Location type as "Address Range-Street_name" in Location Advance Search screen
  #And I click on Advance search button for "Address Range-Street_name"
  #And I verify "Newly created address rage and its values in DB"
  #Then I verify "updated Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range"
  #And I click on "Delete button-individual location1" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #And I click on "Delete button-individual location2" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  # And I click on "Delete address range button" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #And I click on "Delete address range button2" on Location page
  #And I verify "Location Removed successfully. message should be displayed in location screen"
  #
  #############  US243462: C459 - Location Details - Service Address Range id ##############################################################################################
  #@PI5 @F25123 @Sprint263 @US243462 @TC289431 @In_Sprint1
  #Scenario: @TC289431 - Validate Location Details(Address Range) - Address Range id label
  #Given I am logged in as a "Admin" user in Omnivue
  #And I click on "Search" tab
  #And I go to "Inventory" Search type and select "Location" as Inventory type
  #And I clicked on Advance Search for "Location"
  #And I select Location type as "Address Range" in Location Advance Search screen
  #And I click on Advance search button for "Address Range"
  #Then I verify "address attributes are appearing as separate input fields while searcching for address range"
  #And I click on view icon in Search Result page
  #And I click on "Edit Address Range button" on Location page
  #Then I verify "Address Range id attributes in location page"
  #############  US199947: MAINT-HD00009826945-[CoD:5]-GDB- Service Area Model Create is defaulting Rank to 0 instead of 1  #########################################
  #Updated code as per new requirement
  @PI15 @Sprint263 @US208411 @TC287686 @In_Sprint1
  Scenario: @TC287686 -CR59:US208411 - Validate HELP Icon in OMNIVUE
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Help Icon" in Omnivue Homepage
    And I validate the web page displayed in new tab

  #############  US239706: MAINT - HD00010224354 - Fix the Edit Address Range dynamic query (OV QA)  #########################################
  @PI15 @Sprint263 @US239706 @TC289429 @In_Sprint1 @PilotTesting
  Scenario: @TC289429- Maint-Verify Remove Icon after creating the Fiber Link in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    Then I validate "Fiber link" attributes in create form for "GPON Device Build"
    Then I verify "Remove icon for created Fiberlink in GDB"

  #############   DE58134 Ad-Hoc - HD00010254389-Remove Icon is not disabled after creating the Fiber Link in GDB #########################################
  @PI15 @Sprint263 @DE58134 @TC287585 @In_Sprint1 @PilotTesting
  Scenario: @TC287585- MAINT_US239706_Verify that the user is able of update an address range
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC165244"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"
    Then I verify "Update Editable fields in OV and validate database"

  ############################	End of Sprint 263  ################################################
  ############################		Sprint 262  ################################################
  #############  US199947: MAINT-HD00009826945-[CoD:5]-GDB- Service Area Model Create is defaulting Rank to 0 instead of 1  #########################################
  @PI15 @Sprint262 @F25123 @US199947 @TC284422 @In_Sprint1 @PilotTesting
  Scenario: @TC284422- MAINT- US199947-Validate the default rank of associated address in GDB under service area
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate 1 address in GDB Service area"

  #############  DE56795: Ad-Hoc - MAINT – Address Range ID is not getting displayed along with Address Range Details  #########################################
  #@PI15 @Sprint262 @DE56795 @TC285835 @In_Sprint1
  #Scenario: @TC285835- Ad-Hoc - MAINT – Address Range ID is not getting displayed along with Address Range Details
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Location"
  #And I Select "Address Range" in Location type drop down
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in Location create form with "TC165244"
  #And I click on "Create button" on Location page
  #Then I verify "Address Range should get created successfully message should be displayed in create address range page"
  #And I click on "Add Individual Addresses button" on Location page
  #Then I verify "Create Addresses Within Range create form should be displayed"
  #And I "fill all the mandatory fields and click on create in Addresses within range create form"
  #Then I verify "New locations added within range should be displayed in the Address range location related tab"
  #Then I verify "Address id and Address range dropdown in edit Individual location page within range"
  ############################		Sprint 261  ################################################
  #############  US239340: MAINT - HD00010224771 - Display accurate values for Available BW and Provisioned BW on Ethernet Bearer circuits in OV  #########################################
  @PI15 @Sprint261 @F25123 @US239340 @TC284892 @TC285111 @In_Sprint1
  Scenario: @TC284892 -Verify that the user able to update the provisioned bandwidth and available bandwidth of Ethernet bearer circuit and verify in database
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I clicked on Advance Search for "Circuit"
    And I select Circuit type as "Ethernet Bearer" in advance serach screen
    And I "search with User ID criteria"
    And I click on Advance search button for "Circuit"
    And I click on view icon in Search Result page
    # And I should see the "Circuit Search screen attributes" been displayed
    Then I verify "the Bandwidth and Provisioned Bandwidth on OMNIVue GUI and Database on the Circuit page"
    When I click on "Edit" in Circuit page
    And I "modify the Bandwidth and Provisioned Bandwidth on the Circuit page"
    And I click on "Save" in Circuit page
    Then I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    And I verify "the Bandwidth and Provisioned Bandwidth on OMNIVue GUI and Database on the Circuit page"
    And I Click on "Audit Log" tab on Circuit view page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"

  @PI15 @Sprint261 @F25123 @US239340 @TC285118 @In_Sprint1
  Scenario: @TC285118 -Verify the provisioned bandwidth and available bandwidth values in view and update page of Ethernet bearer circuit if the values in DB is null
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I clicked on Advance Search for "Circuit"
    And I select Circuit type as "Ethernet Bearer" in advance serach screen
    And I "search with User ID criteria"
    And I click on Advance search button for "Circuit"
    And I click on view icon in Search Result page
    #  And I should see the "Circuit Search screen attributes" been displayed
    Then I verify "the Bandwidth and Provisioned Bandwidth on OMNIVue GUI and Database on the Circuit page"
    When I click on "Edit" in Circuit page
    And I "modify the Bandwidth and Provisioned Bandwidth value to null on the Circuit page"
    And I click on "Save" in Circuit page
    Then I verify "Error message should be displayed as fields are left blank in the circuit page"

  #############  	US218967:Ad Hoc [COD 2} -User is able to create/edit contact with Invalid telephone & cell number #########################################
  @PI15 @Sprint261 @F25123 @US218967 @TC284109 @In_Sprint1
  Scenario: @TC284109 -US218967_Verify that a validation error message is displayed for telephone number and cell number for incorrect numbers in create Contact page
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC284109" data
    Then I click on "Create" button in Contact Screen
    Then I verify "Please enter the Cell Number details in number only."

  @PI15 @Sprint261 @F25123 @US218967 @TC284110 @In_Sprint1
  Scenario: @TC284110 -US218967_Verify that a validation error message is displayed for telephone number and cell number for incorrect numbers in update Contact page
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen
    And I click on "Edit" button in Contact Screen
    And I modify "Invalid cell number"
    And I click on "Save" button in Contact Screen
    Then I verify "Please enter the Cell Number details in number only. message is displayed in the contact screen"

  #############  US208378: C459: OV - Not able to observe the PIE chart for Work Group activity report  #########################################
  @PI15 @Sprint261 @F25123 @US208378 @TC281344 @In_Sprint1
  Scenario: @TC281344 -Verify pie chart for work group activity reports
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I hover the cursor to "Reports" label under gear icon
    And I select "Workgroup Activity" under the Gear Icon
    And I select DSP workgroup as "ASP" in workgroup activity report
    And I select "start time & end time in workgroup activity report screen"
    And I click on "Generate Report" in workgroup activity report screen
    And I verify "ASP Group Activity Report tab is displayed in workgroup activity report screen"
    And I click on "Pie-Chart button" in workgroup activity report screen
    Then I verify "Workgroup Activity Summary pie chart displayed"

  @PI14 @Sprint261 @US208488 @TC283851 @In_Sprint1
  Scenario: @TC283851 OV -  Loader is not displaying properly for add role when error message is displaying on look up
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I hover the cursor to "DSP Administration" label under gear icon
    And I select "Manage DSP" under the Gear Icon
    And I click on "Add Role" button in DSP Administration screen
    And I verify "click on the create Role button without data and validate the error message"
    And I verify "Fill the valid data and click on create button"
    When I click on "Gear Icon" in Omnivue Homepage
    And I hover the cursor to "DSP Administration" label under gear icon
    And I select "Manage DSP Role" under the Gear Icon
    Then I verify "Select DSP Role and click on delete button"

  ############################		Sprint 260   ################################################
  #############  DE55997: Ad-Hoc-Maint-“Device Name Look Up” is displaying while deselecting “Existing “check box (GDB) #############################
  @PI14 @Sprint260 @DE55997 @TC280117 @In_Sprint1
  Scenario: @TC280302 -Maint-“Device Name Look Up” is displaying while deselecting “Existing “check box (GDB)
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I click on "Existing icon button" in GDB
    Then I verify "on closing the device name look up new checkbox is selected"

  #############  US228519: [CoD: 4] MAINT: HD00009468940 - Functional Status should be mandatory on GPON Device Build #############################
  @PI14 @Sprint260 @F23130 @US228519 @TC280302 @In_Sprint1
  Scenario: @TC280302 -Validate functional status field for ONT in GDB for a new device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I fill all the mandatory fields for "ONT" GDB device
    And I select Functional status as "None"
    And I verify "error message should be displayed to select functional status in GPON Device build"
    And I select Functional status as "Not Monitored"
    Then I click on "Create icon button" in GDB

  #############  US231972: RTB 1235 - Device List View - Add Vectoring Type & Vectoring Topology columns(From Search Slider) #############################
  @PI14 @Sprint260 @F24420 @US231972 @TC280124 @In_Sprint1
  Scenario: @TC280124  -RTB3259_US231972_Verify the Vector Enabled check box instead of Include vectoring check box in device search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    Then I verify "the Vector Enabled check box instead of Include vectoring check box in device search slider"

  @PI14 @Sprint260 @F24420 @US231972 @TC280126 @In_Sprint1
  Scenario: @TC280126  -RTB3259_US231972_Verify the device search by selecting Vector Enabled check box in search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    Then I verify "Verify the Vector Enabled check box instead of Include vectoring check box in device search slider"
    When I "select the Vector Enabled checkbox on search slider and click on search button"
    And I make the page 100%
    Then I verify "the device search result by selecting Vector Enabled check box in search slider"

  @PI14 @Sprint260 @F24420 @US231972 @TC280129 @In_Sprint1
  Scenario: @TC280129 -RTB3259_US231972_Verify the device advanced search by selecting Vector Enabled check box
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    Then I verify "the device advanced search result by selecting Vector Enabled check box"

  ############################		Sprint 259   ################################################
  #############  US210758 -- MAINT: HD00009468940 - Functional Status should be mandatory on Device Create Screen. #####################
  @PI14 @Sprint259 @F23130 @US210758 @TC274295 @In_Sprint1
  Scenario: @TC274295 -Functional Status should be mandatory on Device Create Screen.-Verify for error message in Create device page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "MST" with Device Type as "Fiber Multiport Service Terminal" with Sub-Type as "Generic MST 2:2"
    And I select the Technology type based on "MST" Device role
    And I fill all the mandatory fields with "TC274295-MST" data
    Then I verify "error message is displayed while creating device Functional Status is mandatory"

  @PI14 @Sprint259 @F23130 @US210758 @TC274294 @In_Sprint1
  Scenario Outline: @TC274294 -Functional Status should be mandatory on Device Create Screen.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    Then I verify "Functional Status field as a asteriks sign in the device create screen"

    Examples: 
      | Devicerole | Devicetype                       | Devicesubtype   |
      | MST        | Fiber Multiport Service Terminal | Generic MST 2:2 |
      | CLIENT     | Cisco ASR 9000 Series            | Cisco ASR 9000V |

  # | DSLAM      | Calix C Series                   | Calix C7                      |
  #| FDH        | Corning FDH                      | Corning 144 Port Distribution |
  # | FDP        | Fiber Distribution Panel         | Generic FDP 12:12             |
  # | HOST       | Cisco ASR 9000 Series            | Cisco ASR 9006                |
  #  | MSAP       | Calix C Series                   | Calix C7                      |
  # | NID        | RAD ETX Series                   | RAD ETX204A                   |
  # | NPE        | Juniper M Series                 | Juniper M20                   |
  # | OLT        | Calix E7                         | Calix E7-2                    |
  # | ONT        | Calix 700GE Series ONT           | Calix 720GE                   |
  # | SPLITTER   | Fiber Splitter                   | Generic Splitter 1:16         |
  # | BRAS       | Generic Device                   | Generic Device                |
  # | MDU        | Calix MDU                        | Calix 761 MDU                 |
  #| AGG        | Calix E7                         | Calix E7-20                   |
  @PI14 @Sprint259 @F23130 @US210758 @TC274297 @In_Sprint1
  Scenario Outline: @TC274297 -Verify for Functional Status field is not mandatory field in EDIT device page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I validate "Functional status is not mandatory" attributes in Search page for "Device"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |

  #  | DSLAM       |
  #  | FDP         |
  #| MST         |
  #  | NID         |
  # | NPE         |
  # | ONT         |
  # | SPLITTER    |
  #| TD          |
  #| AGG         |
  #| BRIX        |
  # | CLIENT      |
  # | FDH         |
  #| HOST        |
  # | MSAP        |
  ############################	End of Sprint 259   ################################################
  ############################		Sprint 258   ################################################
  ############# DE53941 -- Ad-Hoc MAINT - The Device Details page is not getting refreshed after the user clicks on manual refresh icon  ##################
  @PI14 @Sprint258 @DE53941 @TC270792 @In_Sprint1
  Scenario: @TC270792 -Verify the Device details are getting updated when same devices are opened in two tabs
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    Then I click on "Create" button in Device Create Screen
    And I "open again the same device in another tab"
    And I clicked the "Edit" button in Device Detail Page
    Then I "update the Qualification Information section in Device screen"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "updated Qualification Information section in Device screen is getting reflected in the another tab"

  ############# US199823 -- [COD 4] MAINT – OV - HD00009492116 User unable to add Services to a Contact ##################
  @PI14 @Sprint258 @F23130 @US199823 @TC270723 @In_Sprint1
  Scenario: @TC270723 -User unable to add Services to a Contact-Verify for services tab under "Contacts" 360 page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Contact" as Inventory type
    And I clicked on Advance Search for "Contact"
    And I "search with Contact Type as PNCO first name as AUTO and role as circuit"
    And I click on view icon in Search Result page
    #And I should see the "Contact Search screen attributes" been displayed
    And In the 360 view I click on the "Services" tab
    Then I verify "Add service should be displayed for the PNCO contact type in Services related Tab"

  ############# US224660 -- Maint: HD00009865674, HD00009573656 - Provisioned Bandwidth value is not set correct in Ethernet Bearer circuit View/Edit page.  ##################
  @PI14 @Sprint258 @F23130 @US224660 @TC267464 @In_Sprint1
  Scenario: @TC267464 -Maint: HD00009908386 - Provisioned Bandwidth value is not set correct in Ethernet Bearer circuit View/Edit page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    Then I "validate the Avaliable Bandwidth and Provisioned Bandwidth in Ethernet Bearer circuit View/Edit page"

  ############# US222147 -- RTB 1104: Host Client or Satellite topology- check boxes has to be enabled automatically in topology view page when user navigates to next page  ##################
  @PI14 @Sprint258 @F22666 @US222147 @TC270765 @In_Sprint1
  Scenario: @TC270765 -Host Client or Satellite topology- check boxes has to be enabled automatically in topology view page when user navigates to next page-Verify Check boxes for topology view for Host Client or Satellite topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Topology View" tab
    Then I verify "Device Name, Bearer Circuits and Device ports check box is displayed in the Topology view related tab"

  @PI14 @Sprint258 @F22666 @US222147 @TC270769 @In_Sprint1
  Scenario: @TC270769 -Host Client or Satellite topology- check boxes has to be enabled automatically in topology view page when user navigates to next page-Verify Check boxes for topology view for Host Client or Satellite topology when Google maps Disabled
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Topology View" tab
    Then I "validate the check boxes in next page is displayed in the Topology view related tab"

  @PI14 @Sprint258 @F22666 @US222147 @TC270771 @In_Sprint1
  Scenario: @TC270771 -Host Client or Satellite topology- check boxes has to be enabled automatically in topology view page when user navigates to next page-Verify Check boxes for topology view for Host Client or Satellite topology when Google maps Enable
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Topology View" tab
    Then I "validate the check boxes in next page with google maps is enabled in the Topology view related tab"

  ############# DE53666 -- Ad-Hoc Maint-After updating MLTO Order, we are not getting a success message and audit log for EDIT action also not tracked.  ##################
  @PI14 @Sprint258 @DE53666 @TC267474 @In_Sprint1
  Scenario: @TC267474 -Verify the success message is displayed on the MLTO Update
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I select product type as "GPON" under Order paramaters
    And I Search order with "All"-Service type in Advance search screen
    And I "enter the customer name as Infrastructure in order advance search"
    And I click on Advance search button for "Orders"
    And I Search for "MLTO Order" from Seacrh result page
    And I Validate the "Edit Order" button functionality on MLTO
    Then I verify "Success message is displayed on the Order Screen"
    And I verify "Update Log is captured in the Omnivue Audit log tab"

  ############# US207254--C459 OV -Search Enhance Location Searches - Advanced  #############################
  @PI14 @Sprint258 @F23130 @US207254 @TC271039 @In_Sprint1
  Scenario: @TC269149 -Verify the new fields names and label change for Location from Advance Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Individual Location" in Location Advance Search screen
    Then I verify "all the available Individual location fields should be displayed in Location advance screen"
    When I select Location type as "Address Range" in Location Advance Search screen
    Then I verify "all the available Address Range location fields should be displayed in Location advance screen"

  @PI14 @Sprint258 @F23130 @US207254 @TC271045 @In_Sprint1
  Scenario: @TC271045 -Verify that the user is able to search using Address Line 1 and Address Line 2 from Advance Search Page of location
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "Individual Location" in Location Advance Search screen
    And I "enter invalid in address line1 and address line2 in Location Advance Search screen"
    And I click on Advance search button for "Individual Location"
    And I make the page 100%
    Then I verify "No data found for search criteria message is displayed for invalid search"
    And I "invalid in address line1 and address line2 in Location Advance Search screen"
    And I "enter valid in address line1 and address line2 in Location Advance Search screen"
    And I click on Advance search button for "Individual Location"
    Then I verify "search result displayed in location search result"

  ############# US207252  --  MAINT - OV - Enhance Location Searches - Search Slider  #############################
  @PI14 @Sprint258 @F23130 @US207252 @TC269149 @In_Sprint1
  Scenario: @TC269149 -Verify the new labels and text boxes for Location in the search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    Then I verify "new labels and text boxes for Location in the search slider"

  ############# US198938  --  Maint-HD00009830593-[CoD:4]-GDB-Splitter Tab is missing the location lookup magnifying glass and SOLR are NOT working in Device details but IS working for common area  #############################
  @PI14 @Sprint258 @F23130 @US198938 @TC270962 @In_Sprint1
  Scenario: @TC270962 -Verify whether the Solr suggestions are getting displayed with a look up option for the Splitter in create page of GPON Device Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "SPLITTER" as GDB-Component
    Then I verify "Solr suggestions are getting displayed with a look up option for the Splitter in create page of GPON Device Page"

  @PI14 @Sprint258 @F23130 @US198938 @TC270966 @In_Sprint1
  Scenario: @TC270966 -Verify whether the Solr suggestions are getting displayed with a look up option for the Splitter in update page of GPON Device Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I "search for the GPON Device Build data in search slider"
    And I click on search button for "Network"
    And I click on view icon in Search Result page
    And I select "SPLITTER" as GDB-Component
    Then I verify "Solr suggestions are getting displayed with a look up option for the Splitter in create page of GPON Device Page"
    Then I verify "Validate GDB Location Look Up"

  ############# US194821  --  MAINT-HD00009776175-[CoD: 6]-Update of PRISM NOSA is not sending to ARM - Impacting CTL ON Orders are not assigning to Preplaced ONTs.  #############################
  @PI14 @Sprint258 @F23130 @US194821 @TC270760 @In_Sprint1
  Scenario: @TC270760 -Verify the database and GUI after we create a new OLT Device with Prism Nosa Certification
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC270760-OLT" data
    And I "set the Prism Nosa Certification to No in Device Create form"
    And I click on "Create" button in Device Create Screen
    Then I verify "Prism Nosa Certification is updated as No in the Device view screen"

  @PI14 @Sprint258 @US194821 @TC270767 @In_Sprint1
  Scenario: @TC270767 -Verify the database and GUI after we update an OLT Device with Prism Nosa Certification
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC270767-OLT" data
    And I "set the Prism Nosa Certification to Yes in Device Create form"
    And I click on "Create" button in Device Create Screen
    And I verify "Prism Nosa Certification is updated as Yes in the Device view screen"
    And I clicked the "Edit" button in Device Detail Page
    And I "change the Prism Nosa Certification status to No in Device details page"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "Prism Nosa Certification is updated as No in the Device view screen"

  ############# DE40739  -- Ad-Hoc-MAINT_In Configure column of Order search Result page when we move the columns form left side to right and click on Apply ,Omnivue tab is getting closed  #############################
  @PI14 @Sprint258 @DE40739 @TC269980 @In_Sprint1
  Scenario: @TC269980 -OV - Validate apply button in configure columns
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "All"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on "Configure column button in the order result page"
    And I verify "Configure column attributes been displayed"
    And I "move the PON header to the top list & click on the apply button"
    Then I verify "PON header is displayed at the first column result page"
    And I click on "Apply default button in the configure column"

  ############################	End of Sprint 258   ################################################
  ############################		Sprint 257   ################################################
  ############# US210764 -- Maint: HD00009908386 - Project ID(PRID) value has to be displayed in Task List view. #############################
  @PI14 @Sprint257 @F23130 @US210764 @TC266897 @In_Sprint1
  Scenario: @TC266897 -Maint: HD00009908386 - Project ID(PRID) value has to be displayed in Task List view.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I clicked on Advance Search for "Task"
    Then I verify "projectID field is displayed in the Task Advance Search screen"

  @PI14 @Sprint257 @F23130 @US210764 @TC266901 @In_Sprint1
  Scenario: @TC266901 -Validate Task Search Launch
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "ONT Out Of Capacity" from Task name dropdown
    And I click on search button for "Task"
    And I verify "Project ID column is displayed in Task Result screen"

  @PI14 @Sprint257 @F23130 @US210764 @TC266907 @In_Sprint1
  Scenario: @TC266907 -Maint: HD00009908386_US210764 - Project ID(PRID) value has to be displayed in Task List view.-Verify for Project ID value in task list view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I clicked on Advance Search for "Task"
    And I verify "projectID field is displayed in the Task Advance Search screen"
    And I "enter EVPL812 value inside project ID field in Task Advance Search screen"
    And I click on Advance search button for "Task"
    Then I verify "projectID value is displayed in the Task Result screen"

  ############# US210763  --  Maint: HD00009951391 - SNMP Port update on Device Edit page.  #############################
  @PI14 @Sprint257 @F23130 @US210763 @TC267455 @In_Sprint1
  Scenario: @TC267455 -SNMP Port update on Device Edit page.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role
    And I fill all the mandatory fields with "TC174932-NID" data
    And I "set a value SNMP Port number in Device create page"
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
    Then I verify "by default SNMP Port Number field should be updated with default value 161 in device view screen"
    And I clicked the "Network Tab-Edit" button in Device Detail Page
    And I "update the SNMP Port number with 2556 in the Network detail edit screen"
    And I clicked the "Network Tab-Save" button in Device Detail Page
    Then I verify "SNMP Port Number field should be updated with 2556 in device view screen"

  ############# US218821  --  MAINT- OV- Remove VPN ID/VPN-ID Range/VPN-ID SubRange options from Number Create screen.  #############################
  @PI14 @Sprint257 @F23130 @US218821 @TC264766 @In_Sprint1
  Scenario Outline: : @TC264766 -Verify the drop down values for Ethernet Technology Type of Number in Create slider
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Number"
    And I should see the following Number types "<Number Types>" under Create Tab
    Then I verify "VPN ID, VPN-ID Range, VPN-ID SubRange Ethernet technology type is not displayed in the Create slider"

    Examples: 
      | Number Types                                                             |
      | CE-VLAN, S-VLAN, ASN 209 VPNID Range, MEP-ID, PW-ID, SAP, SDP, VSI, VLAN |

  @PI14 @Sprint257 @F23130 @US218821 @TC264768 @In_Sprint1
  Scenario Outline: @TC264768 -Verify the drop down values for Ethernet Technology Type of Number in Search slider
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
    And I go to "Inventory" Search type and select "Number" as Inventory type
    Then I should see the following Number Type values "<Number Types>"

    Examples: 
      | Number Types                                                                                                |
      | ASN 209 VPNID Range, CE-VLAN, MEP - ID, PW-ID, S-VLAN, SAP, SDP, VPN ID, VPN-ID Range, VPN-ID SubRange, VSI |

  ############################		End of Sprint 257   ################################################
  ############################		Sprint 256   ################################################
  ############# US215264  --  C459: OV - Device Ports - Migrate Card Option - Child Card  #############################
  # @PI14 @Sprint256 @F22330 @US215264 @TC260098 @In_Sprint1
  #Scenario: @TC260098 -Verify the Migrate card button is available in the device port related system tab with the child card information for an existing device
  #  Given I am logged in as a "Admin" user in Omnivue
  # When I click on "Search" tab
  # And I go to "Inventory" Search type and select "Device" as Inventory type
  #And I clicked on Advance Search for "Devices"
  #And I select the device role as "NPE" in Device advance search
  # And I click on Advance search button for "Device"
  #  And I click on view icon in Search Result page
  #And I should see the "Device Search screen attributes" been displayed
  #And In the 360 view I click on the "Device Ports" tab
  #Then I verify "Migrate card button is available in the device port related system tab in Device screen"
  ############# US214705  --  C459: OV - Device Ports - Move Card Option from Child Card #############################
  # @PI14 @Sprint256 @F22330 @US214705 @TC260112 @In_Sprint1
  # Scenario: @TC260112 -Verify the Move card button is available in the device port related system tab with the child card information for a new device
  #  Given I am logged in as a "Admin" user in Omnivue
  # And I click on "Create" tab
  # And I go to "Inventory" type and select "Device"
  # And I Select "Role" as Filter By value
  #And Select the Role as "NPE" with Device Type as "Juniper M Series" with Sub-Type as "Juniper M20"
  # And I select the Technology type based on "NPE" Device role
  #And I fill all the mandatory fields with "TC260112-NPE" data
  #And I click on "Create" button in Device Create Screen
  # And I should see the "Device Search screen attributes" been displayed
  # And In the 360 view I click on the "Device Ports" tab
  # Then I verify "the Move card button is available in the device port related system tab with the child card information for a new device"
  ############# US222546  --  C459: OV - Device Ports - Tooltip information on Migrate/Move/Swap Card #############################
  # @PI14 @Sprint256 @F22330 @US222546 @TC262480 @In_Sprint1
  # Scenario: @TC262480 -MAINT_US222546_Verify the Tooltip information in device parent card section
  # Given I am logged in as a "Admin" user in Omnivue
  #  When I click on "Search" tab
  # And I go to "Inventory" Search type and select "Device" as Inventory type
  # And I clicked on Advance Search for "Devices"
  # And I select the device role as "NPE" in Device advance search
  # And I click on Advance search button for "Device"
  #  And I click on view icon in Search Result page
  # And I should see the "Device Search screen attributes" been displayed
  #And In the 360 view I click on the "Device Ports" tab
  # Then I verify "tool tip information hovering on the Swap card button, Move card button & Migrate card button in Device screen"
  #############   US219568  --  RTB 1104: MEF EVC/OVC - Display Member Service details	#############################
  # @PI14 @Sprint256 @F22666 @US219568 @TC262820 @In_Sprint1
  #Scenario Outline: @TC262820 -RTB 1104_US219568: MEF EVC/OVC - Display Member Service details-validation for 'Service Circuit Design' tab for MEF EVC/MEF OVC
    #Given I am logged in as a "Admin" user in Omnivue
    #And I click on "Search" tab
    #And I go to "Inventory" Search type and select "Service" as Inventory type
    #And I select Service Type values as "<Search Service Type>" under Service Search slider
    #And I click on search button for "Service"
    #And I click on view icon in Search Result page
    #Then I verify "Only for MEF EVC/MEF OVC service should display a new related tab as Service Circuit Design"
#
    #Examples: 
      #| Search Service Type |
      #| DSL OVC             |
      # | ENNI Link Service   |
      #| HSI                 |
      # | Host Service        |
      #| IPTV                |
      #| IPTV Unicast        |
      # | MEF ENNI            |
      #| MEF EVC             |
#
  # | MEF OVC             |
  #| MEF Service         |
  #   | MEF UNI             |
  #  | MGR UNI             |
  # | Mgmt EVC            |
  #  | Mgmt UNI            |
  # | Probe UNI           |
  @PI14 @Sprint256 @F22666 @US219568 @TC262823 @TC262821 @In_Sprint1
  Scenario Outline: @TC262821 -RTB 1104_US219568: MEF EVC/OVC - Display Member Service details-validation for Member service drop down under 'Service Circuit Design' tab for "<Search Service Type>" service type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service" as Inventory type
    And I select Service Type values as "<Search Service Type>" under Service Search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Service Circuit Design" tab
    Then I verify "under Service Circuit Design tab we should be seeing the Google maps button & Member Service drop down should be displayed"

    Examples: 
      | Search Service Type |
      | MEF EVC             |

  # | MEF OVC             |
  ############################	End of	Sprint 256   ################################################
  ############################		Sprint 255   ################################################
  #############   US218321  --  RTB 1104: MEF EVC/OVC - Display Circuit Design Information - Related Tab 'Service Circuit Design'	#############################
  #@PI14 @Sprint255 @F22666 @US218321 @TC260428 @In_Sprint1
  #Scenario Outline: @TC260428 -Verify only for MEF EVC/MEF OVC new Related Tab 'Service Circuit Design' is displayed
    #Given I am logged in as a "Admin" user in Omnivue
    #And I click on "Search" tab
    #And I go to "Inventory" Search type and select "Service" as Inventory type
    #And I select Service Type values as "<Search Service Type>" under Service Search slider
    #And I click on search button for "Service"
    #And I click on view icon in Search Result page
    #Then I verify "Only for MEF EVC/MEF OVC service should display a new related tab as Service Circuit Design"
#
    #Examples: 
      #| Search Service Type |
      #| DSL OVC             |
      #| # ENNI Link Service |
      #| HSI                 |
      # | Host Service        |
      #| IPTV                |
      #| IPTV Unicast        |
      #| MEF ENNI            |
      #| MEF EVC             |
#
  #   | MEF OVC             |
  # | MEF Service         |
  #  | MEF UNI             |
  #  | MGR UNI             |
  #  | Mgmt EVC            |
  # | Mgmt UNI            |
  #  | Probe UNI           |
  ############################	End of	Sprint 255   ################################################
  ############################		Sprint 254  ################################################
  #############   US209179--C459: OV - Device Ports - Move Card Option - Parent Card   ################################################
  @PI14 @Sprint254 @F22330 @US209179 @TC260035 @In_Sprint1
  Scenario Outline: @TC260035-  Verify the move card button is available in the device port related system tab with the card information for an existing device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    When In the 360 view I click on the "Device Ports" tab
    And I "should be seeing the Parent card action buttons Add Child Cards, Edit Card Details, Swap Card, Move Card, Delete Card in this format under Device port"
    Then I verify "for the ports having parent card, should display a new button as move card in Device port related tab"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |

  #| DSLAM       |
  # | FDP         |
  #| MST         |
  #| NID         |
  # | NPE         |
  #| ONT         |
  #| SPLITTER    |
  # | TD          |
  # | AGG         |
  # | BRIX        |
  # | CLIENT      |
  # | FDH         |
  #| HOST        |
  #  | MSAP        |
  @PI14 @Sprint254 @F22330 @US209179 @TC260038 @In_Sprint1
  Scenario Outline: @TC260038 -Verify the move card button is available in the device port related system tab with the card information for a new device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    When In the 360 view I click on the "Device Ports" tab
    And I "should be seeing the Parent card action buttons Add Child Cards, Edit Card Details, Swap Card, Move Card, Delete Card in this format under Device port"
    Then I verify "for the ports having parent card, should display a new button as move card in Device port related tab"

    Examples: 
      | Devicerole | Devicetype                       | Devicesubtype   | Testdata        |
      | MST        | Fiber Multiport Service Terminal | Generic MST 2:2 | TC174930-MST    |
      | CLIENT     | Cisco ASR 9000 Series            | Cisco ASR 9000V | TC212395-CLIENT |

  #| DSLAM      | Calix C Series                   | Calix C7                      | TC174924-DSLAM    |
  #| FDH        | Corning FDH                      | Corning 144 Port Distribution | TC174928-FDH      |
  #| FDP        | Fiber Distribution Panel         | Generic FDP 12:12             | TC174929-FDP      |
  #| HOST       | Cisco ASR 9000 Series            | Cisco ASR 9006                | TC212391-HOST     |
  #| MSAP       | Calix C Series                   | Calix C7                      | TC212392-MSAP     |
  #| NID        | RAD ETX Series                   | RAD ETX204A                   | TC174932-NID      |
  #| NPE        | Juniper M Series                 | Juniper M20                   | TC174934-NPE      |
  #| OLT        | Calix E7                         | Calix E7-2                    | TC174920-OLT      |
  #| ONT        | Calix 700GE Series ONT           | Calix 720GE                   | TC174922-ONT      |
  #| SPLITTER   | Fiber Splitter                   | Generic Splitter 1:16         | TC174922-SPLITTER |
  #| BRAS       | Generic Device                   | Generic Device                | TC174925-BRAS     |
  #| MDU        | Calix MDU                        | Calix 761 MDU                 | TC174926-MDU      |
  # | AGG        | Calix E7                         | Calix E7-20                   | TC174923-AGG      |
  ############################	End of	Sprint 254   ################################################
  ############################		Sprint 253   ################################################
  #############   US213812--RTB 1104: Topology Diagram - Host Client or Satellite - Provide Hyperlink   ################################################
  @PI13 @Sprint253 @F17315 @US213812 @In_Sprint2
  Scenario: RTB 1104 Topology Diagram - Host Client or Satellite - Provide Hyperlink
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    And I click on search button for "Inventory"
    And I click on view icon
    And I validate the expend and minimize arrows

  #############   US213669--CR5457: Bulk Contact Search results - changes to List View   ################################################
  @PI13 @Sprint253 @F19784 @US213669 @TC255067 @TC255076 @In_Sprint2
  Scenario: CR5457 - Bulk Contact Search results - changes to List View
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I select "CUID" in CLC contact Search Tab

  #############   US213663--CR5457: Bulk Contact Search results - changes to Details View   ################################################
  @PI13 @Sprint253 @F19784 @US213663 @TC255617 @In_Sprint2
  Scenario: @TC255617 -CR5457: Bulk Contact Search results - changes to Details View
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I select "CUID" in CLC contact Search Tab
    Then I Search Bulk Contact with Cuid as "AB71711" and Validate in Bulk Contacts view page

  #############   US172830--RTB 1235 - Edit Device Details Add Vectoring field & Vectoring Topology   ################################################
  @PI13 @Sprint253 @F17478 @US172830 @TC254588 @In_Sprint2
  Scenario Outline: @TC254588-  Validate Vectoring field & Vectoring Topology in Device Details - Networking Details Tab
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Vectoring field & Vectoring Topology should be displayed in Device details screen"
    And I clicked the "Edit-Network details" button in Device Detail Page
    Then I verify "Vectoring field & Vectoring Topology should be editable in Device details screen"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | FDP         |

  # | MST         |
  # | NID         |
  #  | NPE         |
  #  | ONT         |
  #| SPLITTER    |
  #| TD          |
  # | AGG         |
  # | BRIX        |
  #| CLIENT      |
  #| FDH         |
  #| HOST        |
  # | MSAP        |
  @PI13 @Sprint253 @F17478 @US172830 @TC254609 @In_Sprint2
  Scenario Outline: @TC254609-  Validate Vectoring Type & Vectoring Topology field behavior when Device has Vectoring Type as "Internal" and Device sub type allowable vectoring type as "Internal"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I select device type as "<Device Type>" & subtype as "<Device SubType>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Vectoring field & Vectoring Topology should be displayed in Device details screen"
    And I clicked the "Edit-Network details" button in Device Detail Page
    Then I verify "user should be able to select Internal & external drop down values under Vectoring field"

    Examples: 
      | Device role | Device Type              | Device SubType                           |
      | OLT         | Calix E7                 | Calix E7-2                               |
      | DSLAM       | Adtran Total Access 5004 | Adtran Total Access 5004                 |
      | NID         | Adtran Total Access 5000 | ADTRAN Total Access 5000 23 Inch Chassis |

  #   | TD          | Calix E7                 | Calix E7-2                               |
  #| AGG         | Calix E7                 | Calix E7-2                               |
  @PI13 @Sprint253 @F17478 @US172830 @TC254615 @TC255443 @In_Sprint2
  Scenario Outline: @TC255443-  Validate Vectoring Type & Vectoring Topology field behavior when Device has Vectoring Type as "External" and Device sub type allowable vectoring type as "Internal" and "External"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I select device type as "<Device Type>" & subtype as "<Device SubType>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Vectoring field & Vectoring Topology should be displayed in Device details screen"
    And I clicked the "Edit-Network details" button in Device Detail Page
    And I verify "user should be able to select Internal & external drop down values under Vectoring field"
    And I "select Vectoring field as External & Vectoring Topology as Create Vectoring Topology in Device details screen"
    Then I verify "Topology Create Pop window should display in Device details screen"

    Examples: 
      | Device role | Device Type              | Device SubType                           |
      | OLT         | Calix E7                 | Calix E7-2                               |
      #| DSLAM       | Adtran Total Access 5004 | Adtran Total Access 5004                 |
      | NID         | Adtran Total Access 5000 | ADTRAN Total Access 5000 23 Inch Chassis |

  # | TD          | Calix E7                 | Calix E7-2                               |
  # | AGG         | Calix E7                 | Calix E7-2                               |
  #############   US207997 -- RTB 1235 - Create Device Details Screen -  Fetch Topology Details  ################################################
  @PI14 @Sprint253 @F22330 @US207997 @TC254554 @In_Sprint2
  Scenario Outline: @TC254554 -Validate New field "Vectoring Topology" is added to Create Device page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I verify "Vectoring field & Vectoring Topology should be displayed in Device Create screen"
    Then I verify "on selecting Vectoring field as External in Device Create screen we should see warning message displayed as Please enter Device CLLI.."

    Examples: 
      | Devicerole | Devicetype               | Devicesubtype            | Testdata       |
      | OLT        | Calix E7                 | Calix E7-2               | TC174920-OLT   |
      | DSLAM      | Adtran Total Access 5004 | Adtran Total Access 5004 | TC174924-DSLAM |
      #  | NID        | Adtran Total Access 5000 | ADTRAN Total Access 5000 23 Inch Chassis | TC174932-NID   |
      # | TD         | Calix E7                 | Calix E7-2                               | TC174920-OLT   |
      | # AGG      | Calix E7                 | Calix E7-2               | TC174923-AGG   |

  @PI14 @Sprint253 @F22330 @US207997 @TC254779 @In_Sprint2
  Scenario Outline: @TC254779 -  Validate Create dEvice tab - Vectoring Topology field when Vectoring Type = XXX Internal
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    Then I "should be able to select Internal & external drop down values under Vectoring field in Device Create screen"

    Examples: 
      | Devicerole | Devicetype               | Devicesubtype            | Testdata       |
      | OLT        | Calix E7                 | Calix E7-2               | TC174920-OLT   |
      | DSLAM      | Adtran Total Access 5004 | Adtran Total Access 5004 | TC174924-DSLAM |

  # | NID        | Adtran Total Access 5000 | ADTRAN Total Access 5000 23 Inch Chassis | TC174932-NID   |
  # | TD         | Calix E7                 | Calix E7-2                               | TC174920-OLT   |
  # | AGG        | Calix E7                 | Calix E7-2                               | TC174923-AGG   |
  @PI14 @Sprint253 @F22330 @US207997 @TC254781 @In_Sprint2
  Scenario Outline: @TC254781 - Validate Create Device tab - Vectoring Topology field when Vectoring Type = XXX Extenal and Selected Device CLLI with existing Vectoring Topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I "enter Location details in Device Create screen"
    Then I verify "Vectoring Topology field drop down value should contain the Device clli in Device Create screen"

    Examples: 
      | Devicerole | Devicetype               | Devicesubtype            | Testdata       |
      | OLT        | Calix E7                 | Calix E7-2               | TC174920-OLT   |
      | DSLAM      | Adtran Total Access 5004 | Adtran Total Access 5004 | TC174924-DSLAM |

  # | NID        | Adtran Total Access 5000 | ADTRAN Total Access 5000 23 Inch Chassis | TC174932-NID   |
  # | TD         | Calix E7                 | Calix E7-2                               | TC174920-OLT   |
  #  | AGG        | Calix E7                 | Calix E7-2                               | TC174923-AGG   |
  ############################	End of	Sprint 253   ################################################
  ############################		Sprint 252   ################################################
  #############   US203454: CR5457: Bulk Contact Upload  - Edit Contact Lookup UI	#############################
  @PI13 @Sprint252 @F17478 @US203454 @TC253355 @In_Sprint2
  Scenario: @TC253355 -Verify Enter Contact Details section fields when clicking on edit icon in Bulk contact upload sub tab.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    And I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Bulk upload tab" button in CLC Contact Page
    And I "upload the valid spreadsheet in the Bulk upload CLC Contact Page"
    And I click on the "Submit" button in CLC Contact Page
    And I verify "Job should get created message should be displayed along with the table displayed in CLC contact page"
    When I click on the "Edit-icon" button in CLC Contact Page
    Then I verify "Contact details should contains two sections Step1:Enter Contact Details and Step 2:Enter Circuit Details in CLC contact page"
    And I click on the "Delete" button in CLC Contact Page

  #############  US174454: RTB 1235 - Create Device Details Screen -  Add Vectoring Type field	#############################
  @PI13 @Sprint252 @F17478 @US174454 @TC254109 @In_Sprint2
  Scenario: @TC254109 -Validate Create "Vectoring Type" field on Device Details Screen for "Adtran Total Access 5000"device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "All" as Filter By value
    And Select Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    Then I verify "Vectoring Type dropdown should display '384 Internal' value for device having role like TD,OLT,DSLAM,MSAP,NID"

  @PI13 @Sprint252 @F17478 @US174454 @TC254117 @In_Sprint2
  Scenario: @TC254109 -Validate Create "Vectoring Type" field on Device Details Screen for "Calix E7"device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "All" as Filter By value
    And Select Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    Then I verify "Vectoring Type dropdown should display '192 Internal','384 Internal' and '384 External' value for device having role like TD,OLT,DSLAM,AGG"

  @PI13 @Sprint252 @F17478 @US174454 @TC254128 @In_Sprint2
  Scenario: @TC254128 -Validate Create "Adtran Total Access 1148VX Series" field on Device Details Screen for "Adtran TA 1148VX Host"device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "All" as Filter By value
    And Select Device Type as "Adtran Total Access 1148VX Series" with Sub-Type as "Adtran TA 1148VX Host"
    Then I verify "Vectoring Type dropdown should display '192 Internal' and '384 External' value for device having role like DSLAM,MSAP"

  @PI13 @Sprint252 @F17478 @US174454 @TC254149 @In_Sprint2
  Scenario: @TC254109 -Validate Create "Adtran Total Access 5004" field on Device Details Screen for "Adtran Total Access 5004"device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "All" as Filter By value
    And Select Device Type as "Adtran Total Access 5004" with Sub-Type as "Adtran Total Access 5004"
    Then I verify "Vectoring Type dropdown should display '192 Internal' and '384 External' value for device having role like TD,OLT,DSLAM,MSAP"

  @PI13 @Sprint252 @F17478 @US174454 @TC254161 @In_Sprint2
  Scenario: @TC254161 -Validate Create "Calix E3-48 Series" field on Device Details Screen for "Calix E3-48 r2"device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "All" as Filter By value
    And Select Device Type as "Calix E3-48 Series" with Sub-Type as "Calix E3-48 r2"
    Then I verify "Vectoring Type dropdown should display '192 Internal' value for device having role like TD,DSLAM,AGG"

  @PI13 @Sprint252 @F17478 @US174454 @TC254395 @In_Sprint2
  Scenario: @TC254395 -Validate Create "Vectoring Type" field on Device Details Screen for "Adtran Total Access 5000" device on changing the Device type
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "All" as Filter By value
    And Select Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    Then I verify "Vectoring Type dropdown should display '384 Internal' value for device having role like TD,OLT,DSLAM,MSAP,NID"
    When I "change the device type to Calix 800G Series ONT & subtype to Calix 801G in Device create form"
    Then I verify "an error message should be displayed as 'There are No vectoring types for current device subtype' in device create page"

  #############  US207972: RTB 1235 - Device List View - Add Vectoring Type & Vectoring Topology columns(From Search Slider) #############################
  @PI13 @Sprint252 @F17478 @US207972 @TC253943 @In_Sprint2
  Scenario: @TC253943  -RTB1235 - US207972- Validate "Vectoring Type" and "Vectoring Topology" columns in Device Search result page when 'Include Vectoring Info' checkbox is checked
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    Then I verify "Include Vectoring Info checkbox on search slider should be displayed"
    When I "select the Vectoring Info checkbox on search slider and click on search button"
    Then I verify "Vectoring Type and Vectoring Topology table header should be in device search result page"

  @PI13 @Sprint252 @F17478 @US207972 @TC253945 @In_Sprint2
  Scenario: @TC253945  -RTB1235 - US207972- Validate "Vectoring Type" and "Vectoring Topology" columns in Device Search result page when 'Include Vectoring Info' checkbox is checked
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    Then I verify "Include Vectoring Info checkbox on search slider should be displayed"
    When I "don't select the Vectoring Info checkbox on search slider and click on search button"
    Then I verify "Vectoring Type and Vectoring Topology table header should not be in device search result page"

  #############  US205480: RTB 1104: Topology Diagram - Host Client or Satellite  #############################
  @PI13 @Sprint252 @F17315 @US205480 @TC253498 @In_Sprint2
  Scenario: @TC253498  -Topology Diagram - Host Client or Satellite-Validating topology view options
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Topology" as Inventory type
    And I Select Topology type as "Generic Network" and Topology Role as "Host Client or Satellite" in search tab
    And I click on search button for "Topology"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Topology View" tab
    Then I "should be able to see Device Name, Bearer Circuits, Device ports check boxes on the right top corner in Topology View Related tab"

  #############  US212346 -- (Copy of) CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports  #######################
  @PI13 @Sprint252 @F21678 @US212346 @TC253589 @In_Sprint2
  Scenario: @TC253589 -Validate Defect Task Reports Hyperlink
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    Then I verify "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed"

  @PI13 @Sprint252 @F21678 @US212346 @TC253591 @In_Sprint2
  Scenario: @TC253591 -Validate Defect Task Reports workgroup dropdown as single value selected
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    Then I verify "OV Workgroup should Single value selected drop down in Defect Task Report Tab"

  #Then I verify "OV Workgroup should have ASP & NST drop down value been displayed in Defect Task Report Tab"
  #############  US211994 -- CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports - Workgroup summary  section: Open to Completed Task Stats  #######################
  @PI13 @Sprint252 @F21678 @US211994 @TC252211 @In_Sprint2
  Scenario: @TC252211 -Validate Defect Task Reports Open to Completed Task Stats section
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Open to Completed Task Stats section we should be seeing Duration Mean, Duration Mode & Duration Median fields with values been displayed in Defect Task Report"

  #############  US204653 -- [Unfinished] CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports - Workgroup summary  #######################
  @PI13 @Sprint252 @F21678 @US204653 @TC252214 @In_Sprint2
  Scenario: @TC252214 -Validate Defect Task Reports Tasks Interaction Stats section
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"

  @PI13 @Sprint252 @F21678 @US204653 @TC252206 @In_Sprint2 @In_Sprint3
  Scenario: @TC252206 -Validate Defect Task Reports Volume summary section Total Tasks Hyper Link
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I make the page 100%
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"
    When I "click on Total tasks Hyperlink in Defect Task Report"
    Then I verify "Total tasks link should launch a new tab and should display all the task details"

  #############  US211997 -- CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports - Workgroup summary  section: Open to Completed Task Stats  #######################
  @PI13 @Sprint252 @F21678 @US211997 @TC252214 @In_Sprint2
  Scenario: @TC252214 -Validate Defect Task Reports Tasks Interaction Stats section
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Tasks Interaction Stats section we should be seeing Number of User Touches, Number of Status Changes & Average Duration Open to Claim/Assign fields with values been displayed in Defect Task Report"

  ############# US204387 --CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks:  List View  #########################
  @PI13 @Sprint252 @F21678 @US204387 @TC250435 @In_Sprint2
  Scenario: @TC250435 -To validate network identifier coulmn in Defect Tasks List View using regular search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    Then I verify "Network Identifier column has to be added to defect task result list view"

  @PI13 @Sprint252 @F21678 @US204387 @TC250437 @In_Sprint2
  Scenario: @TC250437 -To validate network identifier coulmn in  Defect Tasks List View using My defect tasks search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "My Defect Tasks" as Task Type
    And I click on search button for "Defect Task"
    Then I verify "Network Identifier column has to be added to defect task result list view"

  @PI13 @Sprint252 @F21678 @US204387 @TC250440 @In_Sprint2 @In_Sprint3
  Scenario: @TC250440 -To validate network identifier column in Defect Tasks List View using advanced search hyper link
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "My Defect Tasks" as Task Type
    And I clicked on Advance Search for "Defect Task"
    And I click on Advance search button for "Defect Task"
    Then I verify "Network Identifier column has to be added to defect task result list view"

  #############  US204654: CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports - Detail View  #############################
  @PI13 @Sprint252 @F21678 @US204654 @TC253200 @In_Sprint2 @In_Sprint3
  Scenario: @TC253200 -Validate Task Reports By clicking on Hyperlinks
    Given I am logged in as a "Admin" user in Omnivue
    And I make the page 100%
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"
    When I "click on Total tasks Hyperlink in Defect Task Report"
    Then I verify "Total tasks link should launch a new tab and should display all the task details"

  @PI13 @Sprint252 @F21678 @US204654 @TC253254 @In_Sprint2 @In_Sprint3
  Scenario: @TC253254 -Validate Task Reports By clicking on Hyperlinks and Also Validate Task Details view
    Given I am logged in as a "Admin" user in Omnivue
    And I make the page 100%
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"
    When I "click on Total tasks Hyperlink in Defect Task Report"
    Then I verify "Total tasks link should launch a new tab and should display all the task details"

  @PI13 @Sprint252 @F21678 @US204654 @TC253257 @In_Sprint2 @In_Sprint3
  Scenario: @TC253257 -Validate Export to Excel Icon
    Given I am logged in as a "Admin" user in Omnivue
    And I make the page 100%
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"
    When I "click on Total tasks Hyperlink in Defect Task Report"
    Then I verify "Total tasks link should launch a new tab and should display all the task details"

  @PI13 @Sprint252 @F21678 @US204654 @TC253259 @In_Sprint2 @In_Sprint3
  Scenario: @TC253259 -Validate Print Icon
    Given I am logged in as a "Admin" user in Omnivue
    And I make the page 100%
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"
    When I "click on Total tasks Hyperlink in Defect Task Report"
    Then I verify "Total tasks link should launch a new tab and should display all the task details"

  #############  US204655: CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID  #############################
  @PI13 @Sprint252 @F21678 @US204655 @TC253033 @In_Sprint2
  Scenario: @TC253033 -Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID-Gear Icon validation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    Then I verify "Defect Task Report should be displayed under the Gear Icon"

  @PI13 @Sprint252 @F21678 @US204655 @TC253036 @In_Sprint2
  Scenario: @TC253036 - Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID-"Defect task report" hyperlink validation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    Then I verify "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed"

  @PI13 @Sprint252 @F21678 @US204655 @TC253038 @In_Sprint2
  Scenario: @TC253038 -Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID- User ID Section validation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under By User ID section we should see table having CUID, First Name, Last Name, Number of Task Types, Completed, Claimed, Total Count and Claimed but Released headers displyed in Defect Task Report"

  @PI13 @Sprint252 @F21678 @US204655 @TC253217 @In_Sprint2 @In_Sprint3
  Scenario: @TC253217 -Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID-CUID hyperlink
    Given I am logged in as a "Admin" user in Omnivue
    And I make the page 100%
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report"
    When I "click on Total tasks Hyperlink in Defect Task Report"
    Then I verify "Total tasks link should launch a new tab and should display all the task details"

  @PI13 @Sprint252 @F21678 @US204655 @TC253218 @In_Sprint2 @In_Sprint3
  Scenario: @TC253218 -Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID-"Number of Task Types" hyperlink
    Given I am logged in as a "Admin" user in Omnivue
    And I make the page 100%
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    And I select "ASP" as OV Workgroup in Defect Task Report
    And I "select start & end date in Defect Task Report"
    And I "click on Generate report in Defect Task Report"
    Then I verify "Generate Reports button is disabled under By Task type in Defect Task Report"
    When I "click on the Generate reports under Task type by select generate report in Defect Task Report"
    Then I verify "all the fields displayed for the Task Report: Task Names in Defect Task Report"

  #############  US204655: CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports - Generate Report Action - By User ID  #############################
  ############################		End of Sprint 252   ################################################
  ############################		Sprint 251   ################################################
  #############  US207350 -- CR5457: Bulk Contact Upload UI - Validations  #########################
  ###  Add NST workgroup to see the defect report  #
  #############  US204531 -- CR5457 : NPP7184 - H2.0 - Expand OmniVue Defect Tasks: Reports  #######################
  @PI13 @Sprint251 @F21678 @US204531 @TC250427 @In_Sprint2
  Scenario: @TC250427 -To validate Defect task report hyper link under gear icon
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Defect Task Report" under the Gear Icon
    Then I verify "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed"

  ############# US203888 --- CR5457: Bulk Contact Search results - List View  #########################
  @PI13 @Sprint253 @F19784 @US203888 @TC251418 @In_Sprint2
  Scenario: @TC251418 - Verify Group Name and Total Contacts in Bulk Contact search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I select "CUID" in CLC contact Search Tab
    And I Search Bulk Contact with Cuid as "AB67493" and Validate in Bulk Contacts view page
    Then I validate Total contacts of Bulk contacts in OV Database

  #############  US199150 -- CR5457: Bulk Contact Upload UI - Validations  #########################
  @PI13 @Sprint251 @F19784 @US199150 @TC248931 @In_Sprint2
  Scenario: @TC248931 -Verify Bulk Contact Upload tab fields in CLC Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    And I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Bulk upload tab" button in CLC Contact Page
    Then I verify "Bulk Contact Upload tab fields in CLC Contact"
    And I click on the "Delete" button in CLC Contact Page

  #############  US204017 -- CR5457: Bulk Contact Upload UI - Validations  #########################
  @PI13 @Sprint251 @F19784 @US204017 @TC249190 @In_Sprint2
  Scenario: @TC249190 -Verify the submit button until the user uploaded a document and entered a group name for bulk CLC Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    And I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Bulk upload tab" button in CLC Contact Page
    Then I verify "Submit button is not enabled without uploading an template and entering a Group Name in CLC contact"
    And I click on the "Delete" button in CLC Contact Page

  #############  US203874 -- CR5457: Bulk Contact Upload  - Search Option - UI  #########################
  @PI13 @Sprint251 @F19784 @US203874 @TC250335 @In_Sprint2
  Scenario: @TC250335 -Verify the Search By section from search slider for CLC Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    #And I select "<CLCSearchslider>" in CLC contact Search Tab
    Then I verify "fields that are enabled by selecting different Search by conditions under CLC contact search Slider"

  #############  US205792 -- CR5457: CLC Contact Search - Advanced Search  #########################
  @PI13 @Sprint251 @F19784 @US205792 @TC248889 @In_Sprint2
  Scenario: @TC248889 - To validate CLC Contact - Advanced Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I clicked on Advance Search for "CLC Contact"
    And I "Create CLC contact"
    And I Verify the CLC Contact Details displayed in CLC Contact Page
    And I click on the "Delete" button in CLC Contact Page

  #####   Need few clarifications ########################
  ############################	End of	Sprint 251  ################################################
  ############################		Sprint 250   ################################################
  #############  US206376 -- MAINT - OV -Management IP subnet Mask & Default Gateway attributes in Device Edit Screen  #########################
  @PI13 @Sprint250 @F22046 @US206376 @TC246190 @In_Sprint2
  Scenario Outline: @TC246190 - MAINT_US206376_To Validate Default Gateway for Device with Ethernet and GPON/Lion Role while Edit by selecting provision status as 'In Service'
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I click on "Create" button in Device Create Screen
    And I verify "Management IP Subnet Mask & default gateway values should display blank in Device details page"
    And I "change the Provision status to In-Service in Device details page"
    And I verify "Management IP Subnet Mask & default gateway values should display blank in Device details page"
    And I clicked the "Network Tab-Edit" button in Device Detail Page
    And I verify "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask in Device view page"
    And I verify "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway in Device view page"
    And I clicked the "Network Tab-Edit" button in Device Detail Page
    And I "enter valid Management IP subnet mask & Default gateway in Device view page"
    And I clicked the "Network Tab-Save" button in Device Detail Page
    Then I verify "Management IP Subnet Mask & default gateway values are displayed in Device details page and validated in Database"

    Examples: 
      | Devicerole | Devicetype       | Devicesubtype | Testdata     |
      | NPE        | Juniper M Series | Juniper M20   | TC174934-NPE |

  #| CLIENT     | Cisco ASR 9000 Series    | Cisco ASR 9000V               | TC212395-CLIENT   |
  #| DSLAM      | Calix C Series           | Calix C7                      | TC174924-DSLAM    |
  #   #| FDH        | Corning FDH             | Corning 144 Port Distribution | TC174928-FDH      |
  #  #| FDP        | GENERIC FDP             | 12-Port FDP                   | TC174929-FDP      |
  # | HOST       | Cisco ASR 9000 Series    | Cisco ASR 9006                | TC212391-HOST     |
  # | MSAP       | Calix C Series           | Calix C7                      | TC212392-MSAP     |
  # | NID        | RAD ETX Series           | RAD ETX204A                   | TC174932-NID      |
  #| NPE        | Juniper M Series         | Juniper M20                   | TC174934-NPE      |
  # #| SPLITTER   | GENERIC OPTICAL SPLITTER  |1:16 splitter                | TC174922-SPLITTER |
  #  #| MDU        | Calix MDU                | Calix 761 MDU                | TC174926-MDU      |
  #| AGG        | Calix E7                 | Calix E7-20                   | TC174923-AGG      |
  ############################	End of Sprint 250   ################################################
  ############################		Sprint 249   ################################################
  #############  US204439: CR5457: CLC Contact Details View - 360 view(Left Panel) - Customer Name - Create Page  #########################
  @PI13 @Sprint249 @F19784 @US204439 @TC245568 @In_Sprint2
  Scenario: @TC245568 -To validate Customer name filed look up in Create contact page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I verify "Multiple Subscriber can be linked in Customer name field"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Multiple Subscribers displayed in the CLC Contact page"
    And I click on the "Delete" button in CLC Contact Page

  #############  US199431: CR5457: CLC Contact Details View - Circuit Related Tab - Actions - Associate Circuit  #########################
  @PI13 @Sprint249 @F19784 @US199431 @TC244970 @In_Sprint2
  Scenario: @TC244970 -Verify associating circuits by searching with CIRCUIT or CAC option and validate in database.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    And In the 360 view I click on the "Circuits" tab
    And I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"
    And I click on the "Add Circuit" button in CLC Contact Page
    And I "verify the Cicrcuit lookup window in CLC Contact page"
    Then I click on the "Cancel circuit" button in CLC Contact Page
    And I click on the "Delete" button in CLC Contact Page

  #############     US203820:CR5457: CLC Contact Details View - 360 view(Left Panel) - Customer Name - View and Edit pages  #########################
  @PI13 @Sprint249 @F19784 @US203820 @TC245083 @In_Sprint2
  Scenario: @TC245083 -Verify the company or add customer name is mandatory while updating a CLC Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    When I click on the "Edit" button in CLC Contact Page
    And I "remove all the Subscribers associated to the contact"
    And I click on the "Save with no subscribers associated" button in CLC Contact Page
    Then I verify "Please associate atleast one customer. message should be displayed"
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint249 @F19784 @US203820 @TC245096 @In_Sprint2
  Scenario: @TC245096 -Verify that the user is able to associate company or add customer name while updating a CLC Contact and validate in database
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    When I click on the "Edit" button in CLC Contact Page
    And I verify "On Associating the same subscriber an message should be displayed as -You cannot associate duplicate company/customer."
    Then I verify "On Associating the same subscriber through Look up an message should be displayed as -You cannot associate duplicate company/customer."
    And I click on the "Delete" button in CLC Contact Page

  #############      US187690--CR5457: CLC Contact Details View - Circuit Related Tab - Actions - Add Circuit  #########################
  @PI13 @Sprint249 @F19784 @US187690 @TC244965 @In_Sprint2
  Scenario: @TC244965 -Verify the Add Circuit button in CLC Contact related tab Circuits
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And In the 360 view I click on the "Circuits" tab
    And I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"
    And I click on the "Add Circuit" button in CLC Contact Page
    And I "verify the Cicrcuit lookup window in CLC Contact page"
    Then I click on the "Cancel circuit" button in CLC Contact Page
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint249 @F19784 @US187690 @TC244969 @In_Sprint2
  Scenario: @TC244969 -Verify clicking on lookup button without entering the CAC or CIRCUIT values in Circuit Look Up.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And In the 360 view I click on the "Circuits" tab
    And I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"
    And I click on the "Add Circuit" button in CLC Contact Page
    And I verify "Please enter value for CAC. message is diplayed on serching CAC lookup without any value in CLC contact page"
    And I verify "Please enter value for Circuit. message is diplayed on serching Circuit lookup without any value in CLC contact page"
    Then I click on the "Cancel circuit" button in CLC Contact Page
    And I click on the "Delete" button in CLC Contact Page

  ############################	End of Sprint 249   ################################################
  ############################		Sprint 248   ################################################
  ###############################  US196967 -- C459 - Widget - Inventory ################################################
  @PI13 @Sprint248 @F21121 @US196967 @TC243475 @In_Sprint2
  Scenario: @TC243475 -Validate 'Inventory' option in add wizget drop drown
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    Then I verify "Inventory widget under My Dashboard is displayed"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC243488 @In_Sprint2
  Scenario: @TC243488 -Validate the edit widget icon and widget pop on dashboard
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    Then I verify "edit inventory widget under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  ### passed in test1 ##
  @PI13 @Sprint248 @F21121 @US196967 @TC244006 @In_Sprint2
  Scenario: @TC244006 -Validating save functionality of "Widget Name " popup for devices
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Device" under "Inventory" in Widget window
    And I "search with device name in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244155 @In_Sprint2
  Scenario: @TC244155 -Validating save functionality of "Widget Name " popup for Circuit
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Circuit" under "Inventory" in Widget window
    And I "search with Circuit type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244158 @In_Sprint2
  Scenario: @TC244158 -Validating save functionality of "Widget Name " popup for Conatact
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Contact" under "Inventory" in Widget window
    And I "search with Contact type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244167 @In_Sprint2
  Scenario: @TC244167 -Validating save functionality of "Widget Name " popup for Link
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Link" under "Inventory" in Widget window
    And I "search with Link type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244171
  Scenario: @TC244171 -Validating save functionality of "Widget Name " popup for Location
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Location" under "Inventory" in Widget window
    And I "search with Location name in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244269
  Scenario: @TC244269 -Validating save functionality of "Widget Name " popup for Number
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Number" under "Inventory" in Widget window
    And I "search with Number type in Widget window"
    And I click on the "Save widget" button in Widget window
    And I click on "Resize icon under My Dashboard to Resize the Widget"
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC245354
  Scenario: @TC245354 -Validating save functionality of "Widget Name " popup for Service
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Service" under "Inventory" in Widget window
    And I "search with Service type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244276
  Scenario: @TC244276 -Validating save functionality of "Widget Name " popup for Pun Location
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "PUN Location" under "Inventory" in Widget window
    And I "search with PUN Location created by in Widget window"
    And I click on the "Save pun widget" button in Widget window
    Then I verify "Pun Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244279
  Scenario: @TC244279 -Validating save functionality of "Widget Name " popup for Reservation
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Reservation" under "Inventory" in Widget window
    And I "search with Reservation type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC245311
  Scenario: @TC245311 -Validating save functionality of "Widget Name " popup for Topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Topology" under "Inventory" in Widget window
    And I "search with Topology type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC245317
  Scenario: @TC245317 -Validating save functionality of "Widget Name " popup for Subscriber
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Subscriber" under "Inventory" in Widget window
    And I "search with TEST - JANET Subscriber in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  #############  US173592: Maint_US201316:{CoD: 3] Unable to create multiple MDU in GDB  #########################
  @PI13 @Sprint248 @F18892 @US173592 @TC236628
  Scenario Outline: @TC236628 - Validate 'Management IP Subnet Mask' behavior in Device Create Page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I verify "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask"
    And I verify "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway"
    And I "enter valid Management IP subnet mask & Default gateway ranging between 0.0.0.0 - 255.255.255.255"
    Then I click on "Create" button in Device Create Screen
    Then I verify "Management IP Subnet Mask & default gateway values are displayed in Device details page"

    Examples: 
      | Devicerole | Devicetype            | Devicesubtype   | Testdata        |
      | CLIENT     | Cisco ASR 9000 Series | Cisco ASR 9000V | TC212395-CLIENT |

  #| DSLAM      | Calix C Series           | Calix C7                      | TC174924-DSLAM    |
  #| FDH        | Corning FDH              | Corning 144 Port Distribution | TC174928-FDH      |
  # | FDP        | Fiber Distribution Panel | Generic FDP 12:12             | TC174929-FDP      |
  #| HOST       | Cisco ASR 9000 Series    | Cisco ASR 9006                | TC212391-HOST     |
  #| MSAP       | Calix C Series           | Calix C7                      | TC212392-MSAP     |
  # | NID        | RAD ETX Series           | RAD ETX204A                   | TC174932-NID      |
  # | NPE        | Juniper M Series         | Juniper M20                   | TC174934-NPE      |
  # | SPLITTER   | Fiber Splitter           | Generic Splitter 1:16         | TC174922-SPLITTER |
  # | MDU        | Calix MDU                | Calix 761 MDU                 | TC174926-MDU      |
  #  | AGG        | Calix E7                 | Calix E7-20                   | TC174923-AGG      |
  #############  DE44923: Maint_US201316:{CoD: 3] Unable to create multiple MDU in GDB  #########################
  @PI13 @Sprint248 @DE44923 @TC242761
  Scenario: @TC242761 -Verify Create functionality of MDU in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MDU" as GDB-Component
    And I add "3" more device in GDB
    And I fill all the mandatory fields for "MDU"
    And I validate "Cascade all button" functionality in GDB
    Then I validate "Create all button" functionality in GDB

  ### *************************Location clli look up broken need to fix it  *************************#########################
  ############# DE42260 : MAINT : If the user selects a blank value or --Select-- value in device update page then --Select-- is getting stored in database and --Select-- is getting updated for Affiliate Owner for GPON and Passive Devices ###############
  @PI13 @Sprint248 @DE42260 @TC242334
  Scenario: @TC242334 -Validate Omnivue application behavior when user select "--Select--" for MCO while Device - Edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I "select MCO field with --Select-- value"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "MCO field is updated with null value & also verify in DB"
    And I verify "Updated Device details and validate database"

  @PI13 @Sprint248 @DE42260 @TC242324
  Scenario: @TC242324 -Validate Omnivue application behavior when user select "--Select--" for Affiliate Owner while Device - Edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I "select Affiliate Owner field with --Select-- value"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "Affiliate Owner field is updated with null value & also verify in DB"

  ### *************************confirm do we need to check for gpon & passive seperately  *************************#########################
  #############  US187678 -- CR5457: CLC Contact Details View - 360 view(Left Panel)  #########################
  @PI13 @Sprint248 @F19784 @US187678 @TC243238
  Scenario: @TC243238 -Verify that the CLC Contacs are displayed in list view if the number of search results are more than one
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I Enter CLC contact firstname as "ABINASH KUMAR"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Search Results tab is displayed along the search results"
    And I click on view icon in Search Result page
    Then I verify "CLC Contact Page displayed"

  @PI13 @Sprint248 @F19784 @US187678 @TC244045
  Scenario: @TC244045 -Verify that the CLC Contacs are displayed in 360 view if the number of search results return one record
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I Enter CLC contact firstname as "ABINASH KUMAR"
    And I click on search button for "CLC Contact"
    And I click on view icon in Search Result page
    And I "Search CLC contact with all criteria filled"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Page displayed"

  #############  US187687 -- CR5457: CLC Contact Details View - 360 view(Right Panel)  #########################
  @PI13 @Sprint248 @F19784 @US187687 @TC242425
  Scenario: @TC242425 -Verify Related tab Circuit screen in CLC Contact view screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I Enter CLC contact firstname as "ABINASH KUMAR"
    #And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    And I verify "CLC Contact Search Results tab is displayed along the search results"
    And I click on view icon in Search Result page
    And I verify "CLC Contact Page displayed"
    And In the 360 view I click on the "Circuits" tab
    And I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"
    Then I verify "Circuit table should contain View, Circuit Name, CAC, Region & Remove Headers displayed in Circuit Related tab for CLC contact page"

  #############  US187688 -- CR5457: CLC Contact Details View - Circuit Related Tab - Actions - Delete/Delete All  #########################
  @PI13 @Sprint248 @F19784 @US187688 @TC242746
  Scenario: @TC242746 -Verify Individual Delete icon functionality in Related tab Circuit screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I Enter CLC contact firstname as "ABINASH KUMAR"
    And I click on search button for "CLC Contact"
    And I verify "CLC Contact Search Results tab is displayed along the search results"
    And I click on view icon in Search Result page
    And I verify "CLC Contact Page displayed"
    And In the 360 view I click on the "Circuits" tab
    Then I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"

  #############  US201116 -- CR5457: CLC Contact Access Levels - Database configurations.  #########################
  @PI13 @Sprint248 @F19784 @US201116 @TC242747
  Scenario: @TC242747- Verify the new modules for a Workgroup in OMNIVue GUI for CLC Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" tab
    And I hover the cursor to "Administration" label under gear icon
    # And I "Hover to Administration under Gear Icon"
    And I select "Manage Workgroup" under Administration
    Then I verify "Under Manage Workgroup we should see Add Workgroup, Edit Workgroup, Delete Workgroup & Workgroup list is been displayed"
    And I "Select first workgroup & click on Edit Workgroup button in Manage Workgroup page"
    Then I verify "CLC_Contact_Create, CLC_Contact_Search & CLC_Contact_Update modules are displayed in Role permission"

  #############  US187665 -- CR5457: CLC Contact Create Screen  #########################
  @PI13 @Sprint248 @F19784 @US187665 @TC243431
  Scenario: @TC243431 -To validate error message when all the mandatory fields/few mandatory fields in the create screen are not entered .
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    Then I verify "Warning message displayed on all the mandatory fields when create button is clicked if no data is entered in CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243433
  Scenario: @TC243433 -To validate reset button on CLC create Contact screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    Then I verify "POP-Up messsage is displayed on clicking on Reset button in CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243501
  Scenario: @TC243501 -To validate Success message in create contact page after the CLC contact is created
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I verify "Customer Name is added in the CLC Contact page"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint248 @F19784 @US187665 @TC243503
  Scenario: @TC243503 -To validate Error message in create contact page when duplicate contact is created
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    #And I fill all the mandatory fields present in CLC Contact Create form with "Existing" data
    And I click on the "Create" button in CLC Contact Page
    When I click on "Create" tab 2time
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501-2nd" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact already present in the database. message is displayed in the CLC Contact create page"
    And I click on the created CLC Contact Page
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint248 @F19784 @US187665 @TC243637
  Scenario: @TC243637 -To validate email field in CLC Contact Create Screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I "provide the Invalid Email id in CLC contact create page"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Please enter valid Email ID message is displayed in the CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243747
  Scenario: @TC243747 -To validate telephone field in CLC Contact Create Screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I "provide the Invalid Phone number in CLC contact create page"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Please enter a valid telephone number. message is displayed in the CLC Contact create page"

  #############  US187676 -- CR5457: CLC Contact Search Results view  #########################
  @PI13 @Sprint248 @F19784 @US187676 @TC242647
  Scenario: @TC242647 -To Validate List view for CLC Contact Search Results view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Search Results tab is displayed along the search results"

  @PI13 @Sprint248 @F19784 @US187676 @TC242655
  Scenario: @TC242655 -To Validate print button in List view of CLC Contact Search Results page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "Print button is displayed CLC Contact Search Results"

  @PI13 @Sprint248 @F19784 @US187676 @TC242657
  Scenario: @TC242657 -To Validate Export to Excel button in List view of CLC Contact Search Results page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "Excel export button is displayed CLC Contact Search Results"

  @PI13 @Sprint248 @F19784 @US187676 @TC242658
  Scenario: @TC242658 -To Validate 360 view for CLC Contact Search Results view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with all criteria filled"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Page displayed"

  #############  US187737 -- CR5457: CLC Contact Edit Screen  #########################
  @PI13 @Sprint248 @F19784 @US187737 @TC243137
  Scenario: @TC243137 -To Validate CLC Contact in Edit Page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Edit" button in CLC Contact Page
    And I "modify the all the fields CLC Contact view screen"
    And I click on the "Save" button in CLC Contact Page
    Then I verify "CLC contact is saved successfully. message is displayed in the CLC Contact page"
    Then I verify "Modified values are reflecting in CLC Contact page"
    Then I verify "Audit log captured the Update log on the new changes in the CLC Contact page"
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint248 @F19784 @US187737 @TC243454
  Scenario: @TC243454 -To Validate Delete Button on Contact Edit Screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Delete" button in CLC Contact Page
    Then I verify "Audit log captured Delete action in the CLC Contact page"

  #####  US187737 is in blocked state #########
  #############  US196964 -- C459 - omnivueHome.html to Dashboard  #########################
  @PI13 @Sprint248 @F21121 @US196964 @TC244028
  Scenario: @TC244028 - Validate - OMNIVUE - Default "My Dashboad" tab when User Preference - Default Tab = "Dashboard"
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I should see the "My Dashboard tab" been displayed
    Then I verify "Add Widget drop down field should be displayed containing Inventory, Network Build, Order, Reports, Tasks & IFrame Widgets values"

  @PI13 @Sprint248 @F21121 @US196964 @TC244029
  Scenario: @TC244029 - Validate - OMNIVUE - Default "My Dashboad" tab when User Preference - Default Tab = "None"
    Given I am logged in as a "Admin" user in Omnivue
    # And I click on "My Dashboard" tab
    Then I verify "Apart from My Dashboard default options like Google Type search option, Gear Icon, Help Icon, Search Tab & Create Tab is not been disturbed"

  @PI13 @Sprint248 @F21121 @US196964 @TC244156
  Scenario: @TC244156 - Validate "Inventory" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244157
  Scenario: @TC244157 -  Validate "Network Build" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Network Build under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244169
  Scenario: @TC244169 -  Validate "Order" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Order under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  ## Report is removed from Add Widget from My Dashboard : US219663#
  #@PI13 @Sprint248 @F21121 @US196964 @TC244170
  #Scenario: @TC244170 -  Validate "Reports" Option in "My Dashboard" tab - "Add Widget" drop down
  # Given I am logged in as a "Admin" user in Omnivue
  # And I click on "My Dashboard" tab
  #And I select "Reports under Add Widget from My Dashboard"
  #Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
  #And I click on "Remove icon under My Dashboard to Remove the Widget"
  @PI13 @Sprint248 @F21121 @US196964 @TC244172
  Scenario: @TC244172 -  Validate "Tasks" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Tasks under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244173
  Scenario: @TC244173 - Validate "Iframe Widgets" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Iframe Widgets under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  ############################	End of Sprint 248   ################################################
  ############################		Sprint 247   ################################################
  #############  US196515: MAINT - MCO field verification from Circuit/Service/Device Module #########################
  @PI12 @Sprint248 @F18236 @US196515 @TC236246
  Scenario Outline: @TC236246 -Validate  MCO field in Device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    Then I verify "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Device view"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |

  # | DSLAM       |
  #| FDP         |
  #| MST         |
  # | NID         |
  #| NPE         |
  #| ONT         |
  # | SPLITTER    |
  #  | TD          |
  # | AGG         |
  #| BRIX        |
  # | CLIENT      |
  #  | FDH         |
  #| HOST        |
  # | MSAP        |
  # @PI12 @Sprint248 @F18236 @US196515 @TC235933
  #Scenario Outline: @TC235933 -Validate  MCO field in Circuit
  #Given I am logged in as a "Admin" user in Omnivue
  # When I click on "Search" tab
  # And I go to "Inventory" Search type and select "Circuit" as Inventory type
  # And I select Circuit type as "<Circuit types>"
  #And I click on search button for "Circuit"
  #And I click on view icon in Search Result page
  #Then I verify "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Circuit view"
  # Examples:
  #| Circuit types      |
  #  | Ethernet Bearer    |
  #| LAG                |
  # | Optical Bearer     |
  # | PON                |
  # | PW Unrouted (Path) |
  #@PI12 @Sprint248 @F18236 @US196515 @TC235932
  #Scenario Outline: @TC235932 -Validate  MCO field in Service
  #Given I am logged in as a "Admin" user in Omnivue
  # When I click on "Search" tab
  # And I Search "Inventory" in Search Tab
  #And I searched for "Service" with "<Service Types>" Service Type
  #And I click on search button for "Service"
  # And I click on view icon in Search Result page
  #Then I verify "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Service view"
  #Examples:
  #| Service Types |
  # | MEF ENNI      |
  # | MEF EVC       |
  #| MEF OVC       |
  #  | MEF Service   |
  # | MEF UNI       |
  #| Mgmt EVC      |
  #  | Mgmt UNI      |
  ############# US173592: CR5457 - Make 'Subnet Mask' attribute mandatory upon device creation / edit  #########################
  #############  US173586 -- CR5457 Device Attribute changes in OV  #########################
  @PI12 @Sprint248 @F18236 @US173586 @TC223780
  Scenario: Validate 'Default Gateway' on DefectTask details page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Location Test" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "View" button on the Open Task in Defect task search
    Then I verify "Default Gateway field is displayed along with value in Defect Task Details"

  ###  Need few more things to be implemented waiting for sonalin & Divya's update ##############
  @PI12 @Sprint248 @F18236 @US173586 @TC223788
  Scenario: Validate 'Default Gateway' attribute on Ethernet/Lion Device create page.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And Select the technology as "ETHERNET" with Device Type as "Calix E5-111 AC" with Sub-Type as "Calix E5-111 AC"
    Then I fill the mandatory fields with "TC223788" data

  ############# US197544 --CR5457 - OV : Defect Task Detail View  - Tag details  #########################
  @PI12 @Sprint247 @F18236 @US197544 @TC236840 @TC236920 @TC238021
  Scenario: To Validate DDLB in "Tags" section on Defect Task Details Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I create "Test_Auto_pop" tag
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I select "Test_Auto_pop" value from Tags dropdown in Defect task search
    #And I select "Test_pop value from Tags dropdown" in Defect task search
    And I Click on "Save Action" button on the Open Task in Defect task search
    # Then I verify "Updated Tag name is displayed in Defect task"
    Then I verify "Test_Auto_pop" tag is displayed in Defect task
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I Delete "Test_Auto_pop" Tag

  @PI12 @Sprint247 @F18236 @US197544 @TC236920_OLD
  Scenario: To validate Dropdown in Defect Task Detail View page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I select "Test_pop value from Tags dropdown" in Defect task search
    And I Click on "Save Action" button on the Open Task in Defect task search
    Then I verify "Updated Tag name is displayed in Defect task"

  ############# US197541--CR5457 - OV : Defect Task Search Options  - Tags  #########################
  #####  Need clarification on this test case  ###########
  @PI12 @Sprint247 @F18236 @US197541_OLD @TC236807_OLD
  Scenario Outline: To Validate if Search Slider for Defect Task contains new search option "Tag Name'
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "<Task Name List>" from Task status
    And I click on search button for "Defect Task"
    Then I Validate is search results tab is displayed for Defect task search

    Examples: 
      | Task Name List   |
      | DNS              |
      | Location Fallout |

  @PI12 @Sprint247 @F18236 @US197541 @TC236807 @In_Sprint2
  Scenario: To Validate if Search Slider for Defect Task contains new search option "Tag Name'
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I Validate the tag names in DB and GUI

  @PI12 @Sprint247 @F18236 @US197522 @TC238095 @In_Sprint2
  Scenario: To validate Adding tag using add tag button under manage tag
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I create "a new Tag as AUTO Test"
    Then I verify "AUTO Test Tag name are displayed in Manage Tags Search result page"
    #And I click on "View All Tags button" in Manage tags page
    Then I verify "On Performing Delete operation Pop-up message should be displayed"

  #############  US197522--CR5457 - OV : Manage Tags  - Add/Delete/Search/View All Tags & Defect Task List view #########################
  @PI12 @Sprint247 @F18236 @US197522 @TC236847
  Scenario: To Validate "View All Tags" Button on Manage Tags Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "View All Tags Button is displayed under Manage Tags"

  @PI12 @Sprint247 @F18236 @US197522 @TC236864
  Scenario: To validate Search Tag button under manage tag in gear icon on OV
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "Search Tags Button is displayed under Manage Tags"

  @PI12 @Sprint247 @F18236 @US197522 @TC236871
  Scenario: To Validate View all tag button in list view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I select "Hover Tasks as Task type" in Manage tags page
    And I click on "View All Tags button" in Manage tags page
    And I verify "Excel & Print Icon displayed in Tag search result page"
    Then I verify "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page"

  @PI12 @Sprint247 @F18236 @US197522 @TC238095
  Scenario: To validate Adding tag using add tag button under manage tag
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I create "a new Tag as AUTO Test"
    Then I verify "AUTO Test Tag name are displayed in Manage Tags Search result page"

  #@PI12 @Sprint247 @F18236 @US197522 @TC238021--->Duplicate TC
  #Scenario: To Validate Associated tag in Defect Task List view
  # Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I go to "Tasks" search type and select "Defect Tasks" as Task Type
  #And I select "Open" from Task status
  #And I click on search button for "Defect Task"
  # And I Validate is search results tab is displayed for Defect task search
  #And I Click on "Edit" button on the Open Task in Defect task search
  #And I select "Test_pop value from Tags dropdown" in Defect task search
  #And I Click on "Save Action" button on the Open Task in Defect task search
  # Then I verify "Updated Tag name is displayed in Defect task"
  ############################	End of Sprint 247   ################################################
  #############  US192424--CR5457 - OV : Manage Tags  - Add Tag #########################
  @PI12 @Sprint246 @F18236 @US192424 @TC236403
  Scenario: To validate Error message when tag name is blank
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'"

  @PI12 @Sprint246 @F18236 @US192424 @TC236404
  Scenario: To validate Error message when duplicate tag is added
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I select "Hover Tasks as Task type" in Manage tags page
    And I click on "View All Tags button" in Manage tags page
    And I create "Duplicate Manage tag"
    Then I verify "Error Message should be displayed as Tag already exist for tag type 'Hoover Tasks'"

  #############  US191676--CR5457 - OV : Defect Task List View Changes. #########################
  @PI12 @Sprint246 @F18236 @US191676 @TC236116
  Scenario: To Validate New Coloumns "Tags" and "Notes" fields are available in Configure Column on Defect List View
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I verify "Confiurecolumnslider and related Action buttons like Apply, Apply Default & Cancel inside configuration icon"
    And I click on "Apply Default in the configuration column"
    Then I verify "Defect Task Result page should have Defect Task Id, Defect Status, Task Creation Date, Workgroup, Task Name, CUID, Task Completion Date, Device Name, Tags & Notes table header displayed"

  #############  US192405--CR5457 - OV : Tasks - Manage Tags view  #########################
  @PI12 @Sprint246 @F18236 @US192405 @TC235753
  Scenario: To Validate display of "Task Type" and "Tag Name" Fields on click on Manage Tags
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "Task Type and Tag name fields are displayed in Manage Tags page is displayed"

  @PI12 @Sprint246 @F18236 @US192405 @TC235765
  Scenario: To Validate "Add Tag" Button on Manage Tags Page with Read/Write Access
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I create "a new Tag as AUTO Test"
    Then I verify "AUTO Test Tag name are displayed in Manage Tags Search result page"

  #############  US192418--CR5457 - OV : Manage Tags  - Search Tag #########################
  @PI12 @Sprint246 @F18236 @US192418 @TC235862
  Scenario: To validate Search Tag button under manage tag in gear icon on OV
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I select "Hover Tasks as Task type" in Manage tags page
    And I click on "View All Tags button" in Manage tags page
    And I verify "Excel & Print Icon displayed in Tag search result page"
    Then I verify "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page"

  @PI12 @Sprint246 @F18236 @US192418 @TC236348
  Scenario: To validate Error Message when we click on search tag button by keeping Tag name as blank
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'"

  @PI12 @Sprint246 @F18236 @US192418 @TC236349 @TC236350
  Scenario: To validate Excel & Print Icon is displayed in the Manage Task result page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "Excel & Print Icon displayed in Tag search result page"

  #############  US192425--CR5457 - OV : Manage Tags  - View All Tags #########################
  @PI12 @Sprint246 @F18236 @US192425 @TC235877
  Scenario: To Validate View all tag button in list view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I verify "Search Tag, Add Tag and View All Tags action buttons in Manage Tag page is displayed"
    And I verify "Task Type and Tag name fields are displayed in Manage Tags page is displayed"
    And I verify "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'"
    And I click on "View All Tags button" in Manage tags page
    And I verify "Excel & Print Icon displayed in Tag search result page"
    Then I verify "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page"

  @PI12 @Sprint246 @F18236 @US192425 @TC236414
  Scenario: To Validate delete button and Confirmation dialog
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I click on "View All Tags button" in Manage tags page
    Then I verify "On Performing Delete operation Pop-up message should be displayed"

  #############  US193895-- MAINT - Drools rules for Device MCO generation (OV QA) #########################
  @PI12 @Sprint246 @F19517 @US193895 @TC233981
  Scenario Outline: Verify the new value of MCO in device update page for all Devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "MCO attribute is having New option as NOT_REQUIRED"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | FDP         |
      | MST         |

  #| NID         |
  #| NPE         |
  #| ONT         |
  #| SPLITTER    |
  #| TD          |
  #| AGG         |
  #| BRIX        |
  #| CLIENT      |
  #| FDH         |
  #| HOST        |
  #| MSAP        |
  #############  US191679 -- CR5457 - OV : Defect Task  - Search Slider enhancements.  #########################
  @PI12 @Sprint245 @F18236 @US191679 @TC229924
  Scenario: To Validate if Search Slider for Defect Task contains new search option "Task Name' and is able to Search using "Task Name"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Search "by Task Name" in the Search Defect Task slider
    And I click on search button for "Defect Task"
    Then I verify "Search result contains same Task name"

  #############  US178759 -- CR5457 - OV : Defect Task  - Search Slider enhancements.  #########################
  @PI12 @Sprint245 @F18236 @US178759 @TC230967 @TC230973 @TC230989
  Scenario: Validate functionality of Claim & Release button on DefectTask
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    Then I verify "Task Status is updated as Assigned & Assigned to field is updated with logged in user"
    And I click on "Claim" button action on Defect task
    Then I should see the "The defect task is already assigned to you message" been displayed
    And I click on "Release" button action on Defect task
    And I should see the "Defect task released successfully message" been displayed
    Then I verify "Task Status is updated as Open & Assigned to field is blank"
    And I click on "Claim" button action on Defect task
    Then I should see the "Defect task claimed successfully message" been displayed

  ############# 	US135031 -- RTB684 Create New Topology in OV  #########################
  @P10 @Sprint234 @US135031 @TC179340
  Scenario: @TC179340 -US135031 - TC01 - Validate user is able to create Generic Network Topology with Topology role as Host Client or Satellite
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button
    And I select the "Topology role as Host Client or Satellite" in Topology create form
    And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form
    And I click on "AddDevice" button
    And I search Device Type as "Cisco ASR 9000 Series"
    #And I search Device Type as "Cisco ASR 9000 Series" and Device SubType as "Cisco ASR 9006"
    And I click on "Create" button in Topology Screen
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    Then I Validated Delete Topology view Page

  #And I create "TC212391-HOST" device through Inventory
  #And I click on "AddDevice" button
  #	Then I should see the "Device Role is updated as HOST in Topology create form" been displayed
  #	And I associate device having role "HOST" in Topology create form
  #	And I click on "AddDevice" button
  #	Then I should see the "Device Role is updated as Client in Topology create form" been displayed
  #	And I associate device having role "CLIENT" in Topology create form
  #	And I fill all the mandatory fields with "TC179340" data
  #	Then I click on "Create" button in Topology Create Screen
  ######################### NEXT SET  ######################################
  @TC17345502
  Scenario: CR6456 CTLON - OV - Validate of audit log on DSL OVC View screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I select Topology type as "Generic Network" under Create Tab
    And I select "CO - Colorado" as state
    And I click the "Launch Create Form" button

  #####	Pending from Sairam  #####################
  # @TC1734550
  #################		Pending from Harsha End  ###############################
  # @TC172669
  Scenario: OV Validation of create of DSL OVC without Affiliate Owner value
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I select Service type as "DSL OVC" under Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields with "TC172669-DSLOVC" data

  #  Then I will verify the Affliliate Owner field value in DSL OVC screen
  @TC224135
  Scenario: User has to perform manual refresh in-order to add the location
    Given I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields with "TC224135" data

  @P10 @Sprint234 @US143516 @TC201139
  Scenario: CR5457 - US143516 - TC006 - Validate user is able to search Defect Task using Work Group Option
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "ASP" from Workgroup field
    And I click on search button for "Defect Task"
    Then I Validate is search results tab is displayed for Defect task search

  @P10 @Sprint234 @US143516 @TC201133
  Scenario: CR5457 - US143516 - TC005 - Validate user is able to search Defect Task using all available fields in quick search panel
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "ASP" from Workgroup field
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    Then I Validate is search results tab is displayed for Defect task search

  @P10 @Sprint234 @US143527 @TC201125
  Scenario: Verify that the Edit icon is enabled for the task with open status
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    Then I Verify Edit button is enabled for the Open Task

  @P10 @Sprint234 @US143527 @TC202215
  Scenario: Verify that the defect task is moving to assigned task after the user edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    Then I Validate the Task Status & Assigned field is updated with the right value

  @P10 @Sprint234 @US143543 @TC206824
  Scenario: @TC206824 -To Validate if user is able to Save the existing defect task
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I Click on "Save" button on the Open Task in Defect task search
    Then I should see the "Defect task details saved successfully message" been displayed
    And I Click on "Release" button on the Open Task in Defect task search

  @P10 @Sprint234 @US143543 @TC206928
  Scenario: CR5457_US143543_To Validate if user is able to "Complete" defect task
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I click on "Complete" button action on Defect task
    Then I should see the "Defect task details submitted successfully message" been displayed

  @US211177 @TC255146 @TC255147 @TC255149 @TC255151 @TC255153
  Scenario: Dashboard
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I hover the cursor to "Dashboard" label under gear icon
    And I select "DSP Dashboard" under the Gear Icon
    When I click on "Gear Icon" in Omnivue Homepage
    And I hover the cursor to "Dashboard" label under gear icon
    And I select "OV Dashboard" under the Gear Icon

  @US208141 @TC256004 @TC256010 @TC256011 @TC256019
  Scenario: CR5457: Retain CLC Contact Search parameter values after performing Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I select "CUID" in CLC contact Search Tab
    Then I Search Bulk Contact with Cuid as "AB71711" and Validate in Bulk Contacts view page

  @US204934 @TC255815 @TC255816 @TC255821 @TC255822
  Scenario: CR5457: CLC Contact Details View - Circuit Related Tab - Actions - Associate Circuit - Customer Info
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I select "None" in CLC contact Search Tab
    And I search CLC contact with firstname as "AUTOMATION"
    And I validate the customer column
    And I validate add circuit popup in CLC Contact view page

  ############################################################ Sprint 237 #################################################################
  ############################ US153108 :[CoD: 5] CR4701 HD00009307878 - click on task arrow icon is loading MDWWeb page ###########
  @PI11 @Sprint237 @US153108 @TC189076 @TC89326 @TC86968
  Scenario: @TC189076 -OV Validate task search result is loading Auto form task instead of MDW Web page
    Given I am logged in as a "Admin" user in Omnivue
    Given I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "Out of Port Capacity" from Task name dropdown
    And I click on search button for "Task"
    And I click on the "View Fallout Task" in Task result page
    Then I verify "Iframe view in displayed for the Non-Autoform task"

  @PI11 @Sprint237 @US153108 @TC195889_1
  Scenario: @TC195889 -OV Validate the Arrow buttons in task search result
    Given I am logged in as a "Admin" user in Omnivue
    Given I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "ONT Out Of Capacity" from Task name dropdown
    And I click on search button for "Task"
    And I click on "Arrow button in Task result"
    Then I verify "API view in the Task result screen"

  ######################################################## US116154: [Cont from US166857] [Cont] CR6350 - Fetch OV Audit Logs from Archive < OV >####################################
  @P11 @Sprint237 @US116154 @TC189906
  Scenario Outline: @TC189906- CR6350 - US162982 - TC001 - Verify user is able to retrieve OMNIVUE  Audit Logs from Archive table for  Device
    Given I click on "Search" tab
    When I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I validate new option From Archive checkbox on Audit logs for "Devices"
    And I click on the "Get logs in Audit logs with From Archive checkbox selected" in "Device" result page
    Then I validate the logs displayed in Audit logs by selecting Archive checkbox in "Device" result page
    When I Click on "ARM Audit Logs" tab
    And I validate new option From Archive checkbox on Audit logs for "Devices"
    And I click on the "Get logs in Audit logs with From Archive checkbox selected" in "Device" result page

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |

  #| DSLAM       |
  #| FDP         |
  #| MST         |
  #| NID         |
  #| NPE         |
  #| ONT         |
  #| SPLITTER    |
  #| TD          |
  #| AGG         |
  #| BRIX        |
  #| CLIENT      |
  #| FDH         |
  #| HOST        |
  #| MSAP        |
  ###################################################################################END Sprint237###########################################################
  ########################################################### Sprint 238 ###################################################################
  #########################################################################################################################################################
  ############                                                                           US165583 : Remove Association tab from supporting tab for HSI Service                                                                               ###########################
  ############             As an Inventory user, I need associated Services/VLAN section to be displayed as a part of related tabs                ###########################
  #########################################################################################################################################################
  ############                                                                           US165579: Remove Associated Vlan's section from HSI service Details                                                                                       ###########################
  ############             As an Inventory user, I need associated VLAN section to be displayed as a part of Service related tab                   ###########################
  #########################################################################################################################################################
  ############                                                                           US165580 : Remove Associated Services section from HSI Service Details                                                                        ###########################
  ############             As an Inventory user, I need associated Services section to be displayed as a part of Service related tab              ###########################
  #########################################################################################################################################################
  ############                                                                           US165581 : Add New related tab 'Services' for HSI Service                                                                                                                           ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                                    ###########################
  #########################################################################################################################################################
  ############                                                                           US165582 : Move Associate Service section to related tab 'Services'                                                                                      ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                                    ###########################
  #########################################################################################################################################################
  ############                                                                           US165587 : Move delete Associated Services to 'Service' related tab                                                                                      ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US165588 :rename the current  Virtual Ports related tab to VLAN / Virtual Ports  related tab ########################
  ############             As an Inventory user, I need VLAN segment information section to be displayed as a part of Virtual Ports / VLAN Segment related tab  ####
  #########################################################################################################################################################
  #########################################################################################################################################################
  ############                                                                           US165906 : rename the current  Virtual Ports related tab to VLAN / Virtual Ports tab                       ###########################
  ############             As an Inventory user, I need VLAN segment information section to be displayed as a part of Virtual Ports / VLAN Segment related tab  ####
  #########################################################################################################################################################
  ############                                                                           US165900 : Add New related tab 'Service' for IPTV Service                                                                                                                           ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US165902 : Move Associate Service section to related tab 'Service'                                                                                       ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US165903 : Move Edit Associated Service to 'Service' Related tab                                                                                                ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US165904 : Move delete Associated Services to 'Service' related tab                                                                                      ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US165910 : Remove Associated Vlan's scection from IPTV service Details                                                                        ###########################
  ############             As an Inventory user, I need associated VLAN section to be displayed as a part of Service related tab                   ###########################
  #########################################################################################################################################################
  ############                                                                           US165912 : Remove Association tab from supporting tab for IPTV Service                                                                        ###########################
  ############             As an Inventory user, I need associated Services/VLAN section to be displayed as a part of related tabs                ###########################
  #########################################################################################################################################################
  ############                                                                           US165909 :Remove Associated Services section from IPTV Service Details                                                                       ###########################
  ############             As an Inventory user, I need associated Services section to be displayed as a part of Service related tab              ###########################
  #########################################################################################################################################################
  #########################################################################################################################################################
  ############                                                                           US167001 : rename the current  Virtual Ports related tab to VLAN / Virtual Ports tab                       ###########################
  ############             As an Inventory user, I need VLAN segment information section to be displayed as a part of Virtual Ports / VLAN Segment related tab  ####
  #########################################################################################################################################################
  ############                                                                           US167006 : Add New related tab 'Service' for IPTV Service                                                                                                                           ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US167005 : Move Associate Service section to related tab 'Service'                                                                                       ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US167003: Move delete Associated Services to 'Service' related tab                                                                                      ###########################
  ############             As an Inventory user, I need Back haul service to be displayed as a part of related service tab                             ###########################
  #########################################################################################################################################################
  ############                                                                           US166996 : Remove Associated Vlan's scection from IPTV UNicast service Details                                           ###########################
  ############             As an Inventory user, I need associated VLAN section to be displayed as a part of Service related tab                   ###########################
  #########################################################################################################################################################
  ############                                                                           US166997 : Remove Association tab from supporting tab for IPTV UNicast Service                                           ###########################
  ############             As an Inventory user, I need associated Services/VLAN section to be displayed as a part of related tabs                ###########################
  #########################################################################################################################################################
  ############                                                                           US166995 :Remove Associated Services section from IPTV UNicast Service Details                                          ###########################
  ############             As an Inventory user, I need associated Services section to be displayed as a part of Service related tab              ###########################
  #########################################################################################################################################################
  #@US165583 @TC194604 @US165579 @TC196140 @TC193402 @US165580 @TC199043 @TC202257 @US165581 @TC194579 @TC194582 @US165582 @TC195947 @US165587 @TC198772 @US165588 @TC193411 @TC196127 @TC198642 @US165906 @TC199728 @US165900 @TC198647 @TC198648 @TC202944 @US165902 @TC199859 @US165903 @TC200172 @TC200174 @TC200176 @US165904 @US165910 @US165912 @TC198650 @US165909 @TC199963 @US167001 @TC199879 @US166995 @TC199472 @US166996 @TC200326 @US166997 @TC198652 @TC198660 @TC202946 @US167003 @TC199884 @US167005 @TC199995
  #Scenario Outline: @TC194604- OV Test - Verify Clean up HSI, IPTV & IPTV UNiCast Service 360 view page
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I select "Orders" in Search slider
  #And I select "GPON" as Product-type in Order’s Search slider
  #And I clicked on Advance Search for "Orders"
  #And I Search order with "<Service Type>"-Service type in Advance search screen
  #And I click on Advance search button for "Orders"
  #And I click on magnifying glass for the selected Order number
  #And A new tab Order Id:nnnnnn will open with an Order details sub tab
  #And I click on the hyperlink in the "<Service Type>" section Service ID field
  #Then A new tab nnnnnnnnnn-"<Service Type>" will open
  #And I validate "Associated Service section" in Service 360 view page not Displayed
  #And I validate "Associated VLAN section" in Service 360 view page not Displayed
  #And I validate "Associations tab" in Service 360 view page not Displayed
  #Then I should see "Services" Related Tab displayed in 360 view Service Page
  #And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
  #And In the 360 view I click on the "Services" tab
  #And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
  #Then I validate the Associated Service & edit Assocaition button in Services related tab
  #And I verify "Associated Service table is it getting displayed in Services related tab"
  #When I click on Edit Assocaite in service related tab of Associated Services tab
  #Then I should see the Associate Backhaul button enabled
  #
  #Examples:
  #| Service Type |
  #| HSI Service  |
  #| IPTV         |
  # | IPTV-Unicast |
  #
  #@TC200181 @TC200184 @TC200186 @TC199860
  #Scenario Outline: @TC200181- OV Test - Verify 'Associate Backhaul' button functionality of related tab Services in IPTV Service 360 view Page
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I select "Orders" in Search slider
  #And I select "GPON" as Product-type in Order’s Search slider
  #And I clicked on Advance Search for "Orders"
  #And I Search order with "<Service Type>"-Service type in Advance search screen
  #And I click on Advance search button for "Orders"
  #And I click on magnifying glass for the selected Order number
  #And A new tab Order Id:nnnnnn will open with an Order details sub tab
  #And I click on the hyperlink in the "<Service Type>" section Service ID field
  #Then A new tab nnnnnnnnnn-"<Service Type>" will open
  #And I validate "Associated Service section" in Service 360 view page not Displayed
  #And I validate "Associated VLAN section" in Service 360 view page not Displayed
  #And I validate "Associations tab" in Service 360 view page not Displayed
  #Then I should see "Services" Related Tab displayed in 360 view Service Page
  #And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
  #And In the 360 view I click on the "Services" tab
  #And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
  #Then I validate the Associated Service & edit Assocaition button in Services related tab
  #And I verify "Associated Service table is it getting displayed in Services related tab"
  #When I click on Edit Assocaite in service related tab of Associated Services tab
  #Then I click on cancel icon and Remove associated service
  #And I click on Assocaite Backhaul button in service related tab of Associated Services tab
  #And I search DSL OVC Services in service Look up
  #And I make the page 100%
  #Then I select all services and click on Associate Services button
  #Then I validate Error and success messages
  #
  #Examples:
  #| Service Type |
  #| HSI Service  |
  #| IPTV         |
  #
  #@TC199741 @TC199995 @TC199884
  #Scenario Outline: @TC199741- NIC_GPON_Reg_Verify functionality of Services related tab for an IPTV Service
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I select "Orders" in Search slider
  #And I select "GPON" as Product-type in Order’s Search slider
  #And I clicked on Advance Search for "Orders"
  #And I Search order with "<Service Type>"-Service type in Advance search screen
  #And I click on Advance search button for "Orders"
  #And I click on magnifying glass for the selected Order number
  #And A new tab Order Id:nnnnnn will open with an Order details sub tab
  #And I click on the hyperlink in the "<Service Type>" section Service ID field
  #Then A new tab nnnnnnnnnn-"<Service Type>" will open
  #And I validate "Associated Service section" in Service 360 view page not Displayed
  #And I validate "Associated VLAN section" in Service 360 view page not Displayed
  #And I validate "Associations tab" in Service 360 view page not Displayed
  #Then I should see "Services" Related Tab displayed in 360 view Service Page
  #And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
  #And In the 360 view I click on the "Services" tab
  #And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
  #Then I validate the Associated Service & edit Assocaition button in Services related tab
  #And I verify "Associated Service table is it getting displayed in Services related tab"
  #When I click on Edit Assocaite in service related tab of Associated Services tab
  #Then I click on cancel icon and Remove associated service
  #Then I should see the Associate Backhaul button enabled
  #And I click on Assocaite Backhaul button in service related tab of Associated Services tab
  #And I should see the Service Name,Service Type and Device name fields
  #And I search DSL OVC Services in service Look up
  #And I make the page 100%
  #Then I select all services and click on Associate Services button
  #Then I validate Error and success messages
  #Then I validate Update Omnivue audit logs
  #
  #Examples:
  #| Service Type |
  #| HSI Service  |
  #| IPTV         |
  #| IPTV-Unicast |
  #
  # @TC200403 @TC200112
  #Scenario Outline: @TC200403 OV Validate the new related tab Services for IPTV Unicast service
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I select "Orders" in Search slider
  #And I select "GPON" as Product-type in Order’s Search slider
  #And I clicked on Advance Search for "Orders"
  #And I Search order with "<Service Type>"-Service type in Advance search screen
  #And I click on Advance search button for "Orders"
  #And I click on magnifying glass for the selected Order number
  #And A new tab Order Id:nnnnnn will open with an Order details sub tab
  #And I click on the hyperlink in the "<Service Type>" section Service ID field
  #Then A new tab nnnnnnnnnn-"<Service Type>" will open
  #And I validate "Associated Service section" in Service 360 view page not Displayed
  #And I validate "Associated VLAN section" in Service 360 view page not Displayed
  #And I validate "Associations tab" in Service 360 view page not Displayed
  #Then I should see "Services" Related Tab displayed in 360 view Service Page
  #And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
  #And In the 360 view I click on the "Services" tab
  #And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
  #Then I validate the Associated Service & edit Assocaition button in Services related tab
  #Then I should see the Associate Backhaul button enabled
  #Examples:
  #| Service Type |
  #| HSI Service  |
  #| IPTV         |
  #| IPTV-Unicast |
  # @US165583 @TC202943_1
  #Scenario Outline: @TC202943_1 - Verify related tab Services is displayed in HSI Service 360 view Page after a new service is created
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Service"
  #And I Select "<Service Type>" for the drop down Service Type
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in service create form with "<Test Data>"
  #And I fill Subscriber details  "HSI Subscriberdata"
  #And I click on "Create" button on Service page
  #Then Service should get created successfully
  #Then I verify service related tab displayed in HSI Serivce view page
  #And I click on "Delete" button on Service page
  #
  #
  #Examples:
  #| Service Type |Test Data						|
  #| HSI  			   |HSI-TC202943 data 	|
  #|IPTV					 |IPTV-TC202944 data	|
  #
  #
  #@US166997 @TC198652_1
  #Scenario Outline: @TC202943_1 - Verify related tab Services is displayed in HSI Service 360 view Page after a new service is created
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Service"
  #And I Select "<Service Type>" for the drop down Service Type
  #And I click the "Launch Create Form" button
  #And I fill all the mandatory fields required in service create form with "<Test Data>"
  #And I fill Subscriber details  "HSI Subscriberdata"
  #And I click on "Create" button on Service page
  #Then Service should get created successfully
  #And I click on the hyperlink in the "<Service Type Hyperlink>" section Service ID field
  #Then I verify Associations supporting tab displayed in view page
  #And I click on "Delete" button on Service page
  #
  #
  #Examples:
  #| Service Type |Test Data						|Service Type Hyperlink|
  #|IPTV					 |IPTV-TC202944 data	|IPTV Unicast Link     |
  #
  #
  #
  #@US166997 @TC202946_1
  #Scenario Outline: @TC202946_1 Verify related tab Services is displayed in HSI Service 360 view Page after a new service is created
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Create" tab
  #And I go to "Inventory" type and select "Service"
  #And I Select "<Service Type>" for the drop down Service Type
  #And I click the "Launch Create Form" button
  #And I fill the mandatory fields required in IPTV Uincast create form
  #And I fill Subscriber details  "HSI Subscriberdata"
  #And I click on "Create" button on Service page
  #Then Service should get created successfully
  #Then I verify Associations supporting tab displayed in view page
  #
  #Examples:
  #| Service Type |Test Data						|Service Type Hyperlink|
  #|IPTV Unicast	 |IPTV-TC202944 data	|IPTV Unicast Link     |
  #
  #
  #@TC199859_1  @TC39203 @TC166999
  #Scenario Outline: @TC199859_1 -Related Systems - Devices_Verify Start and End Device tabs are displayed for an <Search Service Type> service
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I Search "Inventory" in Search Tab
  #And I searched for "Service" with "<Search Service Type>" Service Type
  #And I click on search button for "Service"
  #And I click on view icon in Search Result page
  #		And I should see the "Service Search screen attributes" been displayed
  #		And In the 360 view I click on the "Services" tab
  #		And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
  #		Then I validate the Associated Service & edit Assocaition button in Services related tab
  #		And I verify "Associated Service table is it getting displayed in Services related tab"
  #		When I click on Edit Assocaite in service related tab of Associated Services tab
  #		Then I should see the Associate Backhaul button and Cancel button enabled
  #		When I click on Assocaite Backhaul button in service related tab of Associated Services tab
  #		Then I should see the Service Name,Service Type and Device name fields
  #		Examples:
  #| Search Service Type	|
  #|	IPTV								|
  #
  #
  #  @TC195947_1 @TC195947-TC196140-TC193402-TC199043-TC202257-TC194579-TC194582-TC193411-TC194604
  #Scenario Outline: @TC195947-TC196140-TC193402-TC199043-TC202257-TC194579-TC194582-TC193411-TC194604 -OV- Validating Associate Service section on related tab 'Services' for HSI service.
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I Search "Inventory" in Search Tab
  #And I searched for "Service" with "<Service Types>" Service Type
  #And I click on search button for "Service"
  #And I click on view icon in Search Result page
  #And I validate "Associated Service section" in Service 360 view page not Displayed
  #And I validate "Associated VLAN section" in Service 360 view page not Displayed
  #And I validate "Associations tab" in Service 360 view page not Displayed
  #Then I should see "Services" Related Tab displayed in 360 view Service Page
  #And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
  #Then I verify service related tab displayed in HSI Serivce view page
  #And I validate "Associated Service section" in Service 360 view page Displayed
  #And In the 360 view I click on the "Services" tab
  #And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
  #Then I validate the Associated Service & edit Assocaition button in Services related tab
  #And I verify "Associated Service table is it getting displayed in Services related tab"
  #When I click on Edit Assocaite in service related tab of Associated Services tab
  #Then I should see the Associate Backhaul button enabled
  #
  #Examples:
  #| Service Types |
  #| HSI           |
  # | IPTV          |
  # | IPTV-Unicast  |
  #
  ########################################################################################### Sprint 238 END ###############################################
  ##################################### Sprint 239 #######################################################
  ###############################################      US143527: CR5457 - Defect Taks List View Edit - Assigned ######################
  @PI11 @Sprint239 @TC201125 @US143527 @ch
  Scenario: Verify that the Edit icon is enabled for the task with open status
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    Then I Verify Edit button is enabled for the Open Task

  @PI11 @Sprint239 @US143527 @TC202215 @ch
  Scenario: Verify that the defect task is moving to assigned task after the user edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    Then I Validate the Task Status & Assigned field is updated with the right value

  ############################################################################################################# SPRINT 239 END ###############################################################
  ############################################################### Sprint 240 #########################################
  ################################ US173811: HD00007909483 - Cable/Strand ID Display ############################
  #@PI11 @Sprint240 @US173811 @TC204845 @ch @reg
  #Scenario Outline: @TC204845- OV-CR6454-G.Fast-Validate the Cable/Strand id are displaying in facility details tab of HSI/IPTV/IPTV Unicast Services
  #Given I am logged in as a "Admin" user in Omnivue
  #When I click on "Search" tab
  #And I select "Orders" in Search slider
  #And I select "GPON" as Product-type in Order’s Search slider
  #And I clicked on Advance Search for "Orders"
  #And I Search order with "<Service Type>"-Service type in Advance search screen
  #And I click on Advance search button for "Orders"
  #And I click on magnifying glass for the selected Order number
  #And A new tab Order Id:nnnnnn will open with an Order details sub tab
  #And I click on the hyperlink in the "<Service Type>" section Service ID field
  #Then A new tab nnnnnnnnnn-"<Service Type>" will open
  #And I validate "Associated Service section" in Service 360 view page not Displayed
  #And I validate "Associated VLAN section" in Service 360 view page not Displayed
  #And I validate "Associations tab" in Service 360 view page not Displayed
  #Then I should see "Services" Related Tab displayed in 360 view Service Page
  #And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
  #When I click on "Facility Details" tab on Service Search page
  #Then I verify "Cable/Strand id are displaying in facility details tab of HSI/IPTV/IPTV Unicast Services"
  #
  #Examples:
  #| Service Type |
  #| HSI Service  |
  #| IPTV         |
  #| IPTV-Unicast |
  #################################################### US171722 : MAINT - OV - HD00009564098 - Cancel Order option in Network Order Detail page ######################################
  @PI11 @Sprint240 @US171722 @TC206757 @ch
  Scenario: @TC206757 -Validate Cancel Order option on Ethernet orders
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Network Build" in Search Tab
    And I select Network type as "Alt Equipment Build" in Search tab
    And I "search Alt Equip build based Created by criteria"
    And I click on search button for "Network"
    And I click on view icon in Search Result page
    Then I verify "Cancel Order option on Ethernet order detail page"

  @PI11 @Sprint240 @US171722 @TC206752 @ch
  Scenario: @TC206752 -Validate Cancel Order option on GPON orders
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Home Screen
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "All"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on view icon in Search Result page
    Then I verify "Cancel Order option on GPON Order Detail page"

  @PI11 @Sprint240 @US171722 @TC210544 @ch
  Scenario: @TC210544 -OV Test-Validate Cancel Order option in Network Order Detail page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I configure NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
    And I make the page 100%
    And I Click on the "Submit Build" Button in Order Details page
    #And I Click on the "Refresh" Button in Order Details page
    #Then I Should see the "Network order status changed to Success"
    And I Launch the Network order by clicking on Order/CSOF ID
    And I Should see the "Cancel Order button enabled & clickable"
    When I Click on the "Cancel Order" Button in Order Details page
    Then I Should see the "Cancellation request successfully sent to DSP. - Message getting displayed in the Network Order Screen"
    When I Click on the "Audit Log" Button in Order Details page
    Then I verify "Order Cancel audit log should get displayed in Order details page"

  ######################################################## US143516-CR5457 -  Defect Tasks List View #######################################################
  @PI11 @Sprint240 @US143516 @TC201139 @ch
  Scenario: CR5457 - US143516 - TC006 - Validate user is able to search Defect Task using Work Group Option
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "ASP" from Workgroup field
    And I click on search button for "Defect Task"
    Then I Validate is search results tab is displayed for Defect task search

  @P10 @Sprint240 @US143516 @TC201133 @ch
  Scenario: CR5457 - US143516 - TC005 - Validate user is able to search Defect Task using all available fields in quick search panel
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "ASP" from Workgroup field
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    Then I Validate is search results tab is displayed for Defect task search

  ######################################### US175434
  @PI11 @Sprint240 @TC209305 @US175434
  Scenario: @TC209305 -OV Validate the edit and save functionality for contact details page
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen
    And I click on "Edit" button in Contact Screen
    And I modify "Category as NETWORK MANAGEMENT SERVICES"
    And I click on "Save" button in Contact Screen
    Then I verify "Contact Detail updated successfully message is displayed"
    And I "click on Audit Tab in Contact Screen to verify the log is been registered for Update action"
    And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"

  ########################## US175432: C459 Maint - viewEditNumberDetail.html###########################
  @PI11 @Sprint240 @US175432 @TC209525_1
  Scenario: @TC209525_1 -OV Validate the Edit and Save functionality for PW-ID number details page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Number"
    And I select Technology type "PW-ID" under Number Create slider
    And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Number Create form with "TC209525" data
    And I fill all the mandatory fields present in Number Create form with "TC118944" data
    And I "select object type as Port & fill the details in Number page"
    Then I click on "Create" button in Number Screen
    And I click on "Audit Tab" button in Number Screen
    And I verify "Create log is registered in Audit log for Number"
    And I click on "Edit" button in Number Screen
    And I changed the "Name, Alias, Provision Status and Note field values" in Number screen
    And I click on "Save" button in Number Screen
    And I verify "Number updated successfully message is displayed on clicking on Save button in Number page"
    And I click on "Audit Tab" button in Number Screen
    And I verify "Update log is registered in Audit log for Number"
    And I click on "Delete" button in Number Screen
    Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
    And I click on "Audit Tab" button in Number Screen
    And I verify "Delete log is registered in Audit log for Number"

  ########################  US166277 : C459 Edit HSI Service details UI change ############################################
  # @PI11 @Sprint240 @US166277 @TC200099
  #Scenario: @TC200099 -OV Test - Verify Edit functionality in HSI Service 360 view page
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Search" tab
    #And I Search "Inventory" in Search Tab
    #And I searched for "Service" with "HSI" Service Type
    #And I click on search button for "Service"
    #And I click on view icon in Search Result page
    #And I click on "Edit" button on Service page
    #And I click on "Save" button on Service page
    #Then I verify "Success message should be displayed on update in Service page"
    #And I click on "Audit logs" tab on Service Search page
    #And I Click on "OMNIVUE Audit Logs" tab
    #And I click on "Getlogs" button on Service page
    #And I should see "Omnivue Audit Logs" Table getting displayed in Audit tab
    #Then I verify "Update action type is registered under the Audit logs section in Servic page"

  ###########################################     US176690: CR459 - deviceDetails.html ########################################
  @PI11 @Sprint240 @US176690 @TC212391 @CH
  Scenario Outline: Verify the create functionality for Device role HOST
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    Then I validate "Delete button" attributes in Search page for "Device"

    #When I clicked the "Edit" button in Device Detail Page
    #And I changed the "Device role to GPON in Network section"
    #And I clicked the "Save" button in Device Detail Page
    #Then I validate "Delete button" attributes in Search page for "Device"
    Examples: 
      | Devicerole | Devicetype            | Devicesubtype  | Testdata      |
      | HOST       | Cisco ASR 9000 Series | Cisco ASR 9006 | TC212391-HOST |

  ##################################################################################################################### END ########################
  ########################## Sprint 241#################
  ######################################################
  ########################## Sprint 242#################
  ######################################################
  ######################################### Sprint 243 ########################################################
  @P12 @Sprint243 @DE37350 @TC223188
  Scenario Outline: Validate Delete button by changing the Device role on Ethernet device
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    Then I validate "Delete button" attributes in Search page for "Device"

    #When I clicked the "Edit" button in Device Detail Page
    #And I changed the "Device role to GPON in Network section"
    #And I clicked the "Save" button in Device Detail Page
    #Then I validate "Delete button" attributes in Search page for "Device"
    Examples: 
      | Devicerole | Devicetype            | Devicesubtype   | Testdata        |
      | CLIENT     | Cisco ASR 9000 Series | Cisco ASR 9000V | TC212395-CLIENT |
      | DSLAM      | Calix C Series        | Calix C7        | TC174924-DSLAM  |

  #| FDP        | Fiber Distribution Panel | Generic FDP 12:12 | TC174929-FDP    |
  #| HOST       | Cisco ASR 9000 Series    | Cisco ASR 9006    | TC212391-HOST   |
  #| MSAP       | Calix C Series           | Calix C7          | TC212392-MSAP   |
  # | NID        | RAD ETX Series           | RAD ETX204A       | TC174932-NID    |
  # | NPE        | Juniper M Series         | Juniper M20       | TC174934-NPE    |
  # | OLT        | Calix E7                 | Calix E7-2        | TC174920-OLT    |
  # | BRAS       | Generic Device           | Generic Device    | TC174925-BRAS   |
  # | AGG        | Calix E7                 | Calix E7-20       | TC174923-AGG    |
  ############################## DE38406: User has to perform manual refresh in-order to add the location ##############################
  @P12 @Sprint243 @TC224135
  Scenario: @TC224135 -User has to perform manual refresh in-order to add the location
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen
    And In the 360 view I click on the "Locations" tab
    And I click on "Add Locations" button in Contact Screen
    Then I verify "Add Locations functionality in Contact screen"
    And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"

  @P12 @Sprint243 @TC224267
  Scenario: TC224267 -Validating auto refresh in-order to add a subscriber in Contact details page
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC39221" data
    Then I click on "Create" button in Contact Screen
    And In the 360 view I click on the "Subscribers" tab
    And I click on "Add Subscribers" button in Contact Screen
    Then I verify "Add subscriber functionality in Contact screen"
    And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"

  ###########################################################################################################END Sprint243#######################
  ############################################################################ Sprint244 ##################################################
  ################################ DE39481: OMNIVUE - Device Details Tab - Is Diverse field is displayed as "No"; irrespective of value selected in Create Form#################
  @P12 @Sprint244 @DE39481 @TC225455
  Scenario Outline: Validating Is Diverse field on device details page
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Home Screen
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<DeviceRole>" with Device Type as "<DeviceType>" with Sub-Type as "<DeviceSubType>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<TestData>" data
    Then I click on "Create" button in Device Create Screen
    And I click on view icon in Search Result page
    Then I validate "Is-Diverse" attributes in Search page for "Device"

    Examples: 
      | DeviceRole | DeviceType               | DeviceSubType | TestData          |
      | OLT        | Calix E7                 | Calix E7-2    | TC174920-OLT      |
      | ONT        | Calix 700GE Series ONT   | Calix 720GE   | TC174922-ONT      |
      | SPLITTER   | GENERIC OPTICAL SPLITTER | 1:16 splitter | TC174922-SPLITTER |

  #|FDP                      |Fiber Distribution Panel                              |Generic FDP 12:12                                       |TC174929-FDP              |
  #|MST                      |Fiber Multiport Service Terminal |Generic MST 2:2                                             |TC174930-MST              |
  ####################################################################################END Sprint244#####################################################################
  ######################################################### Sprint 245####################################################################################
  #############  US191679 -- CR5457 - OV : Defect Task  - Search Slider enhancements.  #########################
  @PI12 @Sprint245 @F18236 @US191679 @TC229924
  Scenario: To Validate if Search Slider for Defect Task contains new search option "Task Name' and is able to Search using "Task Name"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Search "by Task Name" in the Search Defect Task slider
    And I click on search button for "Defect Task"
    Then I verify "Search result contains same Task name"

  #############  US178759 -- CR5457 - OV : Defect Task  - Search Slider enhancements.  #########################
  @PI12 @Sprint245 @F18236 @US178759 @TC230967 @TC230973 @TC230989
  Scenario: Validate functionality of Claim & Release button on DefectTask
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    Then I verify "Task Status is updated as Assigned & Assigned to field is updated with logged in user"
    And I click on "Claim" button action on Defect task
    Then I should see the "The defect task is already assigned to you message" been displayed
    And I click on "Release" button action on Defect task
    And I should see the "Defect task released successfully message" been displayed
    Then I verify "Task Status is updated as Open & Assigned to field is blank"
    And I click on "Claim" button action on Defect task
    Then I should see the "Defect task claimed successfully message" been displayed

  ################################################################# END Sprint 245 #################################################################
  ########################## Sprint 246###################################################################
  #############  US192424--CR5457 - OV : Manage Tags  - Add Tag #########################
  @PI12 @Sprint246 @F18236 @US192424 @TC236403
  Scenario: To validate Error message when tag name is blank
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'"

  @PI12 @Sprint246 @F18236 @US192424 @TC236404
  Scenario: To validate Error message when duplicate tag is added
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I select "Hover Tasks as Task type" in Manage tags page
    And I click on "View All Tags button" in Manage tags page
    And I create "Duplicate Manage tag"
    Then I verify "Error Message should be displayed as Tag already exist for tag type 'Hoover Tasks'"

  #############  US191676--CR5457 - OV : Defect Task List View Changes. #########################
  @PI12 @Sprint246 @F18236 @US191676 @TC236116
  Scenario: To Validate New Coloumns "Tags" and "Notes" fields are available in Configure Column on Defect List View
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I verify "Confiurecolumnslider and related Action buttons like Apply, Apply Default & Cancel inside configuration icon"
    And I click on "Apply Default in the configuration column"
    Then I verify "Defect Task Result page should have Defect Task Id, Defect Status, Task Creation Date, Workgroup, Task Name, CUID, Task Completion Date, Device Name, Tags & Notes table header displayed"

  #########################################################  US192405--CR5457 - OV : Tasks - Manage Tags view  ##################################################
  @PI12 @Sprint246 @F18236 @US192405 @TC235753
  Scenario: To Validate display of "Task Type" and "Tag Name" Fields on click on Manage Tags
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "Task Type and Tag name fields are displayed in Manage Tags page is displayed"

  @PI12 @Sprint246 @F18236 @US192405 @TC235765
  Scenario: To Validate "Add Tag" Button on Manage Tags Page with Read/Write Access
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I create "a new Tag as AUTO Test"
    Then I verify "AUTO Test Tag name are displayed in Manage Tags Search result page"

  ####################################################  US192418--CR5457 - OV : Manage Tags  - Search Tag ###########################################################
  @PI12 @Sprint246 @F18236 @US192418 @TC235862
  Scenario: To validate Search Tag button under manage tag in gear icon on OV
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I select "Hover Tasks as Task type" in Manage tags page
    And I click on "View All Tags button" in Manage tags page
    And I verify "Excel & Print Icon displayed in Tag search result page"
    Then I verify "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page"

  @PI12 @Sprint246 @F18236 @US192418 @TC236348
  Scenario: To validate Error Message when we click on search tag button by keeping Tag name as blank
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'"

  @PI12 @Sprint246 @F18236 @US192418 @TC236349 @TC236350
  Scenario: To validate Excel & Print Icon is displayed in the Manage Task result page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "Excel & Print Icon displayed in Tag search result page"

  ##########################################################################  US192425--CR5457 - OV : Manage Tags  - View All Tags #########################
  @PI12 @Sprint246 @F18236 @US192425 @TC235877
  Scenario: To Validate View all tag button in list view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I verify "Search Tag, Add Tag and View All Tags action buttons in Manage Tag page is displayed"
    And I verify "Task Type and Tag name fields are displayed in Manage Tags page is displayed"
    And I verify "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'"
    And I click on "View All Tags button" in Manage tags page
    And I verify "Excel & Print Icon displayed in Tag search result page"
    Then I verify "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page"

  @PI12 @Sprint246 @F18236 @US192425 @TC236414
  Scenario: To Validate delete button and Confirmation dialog
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I click on "View All Tags button" in Manage tags page
    Then I verify "On Performing Delete operation Pop-up message should be displayed"

  ############################################################  US193895-- MAINT - Drools rules for Device MCO generation (OV QA) #########################
  @PI12 @Sprint246 @F19517 @US193895 @TC233981
  Scenario Outline: Verify the new value of MCO in device update page for all Devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "MCO attribute is having New option as NOT_REQUIRED"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |
      #| DSLAM       |

  # | FDP         |
  # | MST         |
  # | NID         |
  # | NPE         |
  # | ONT         |
  # | SPLITTER    |
  # | TD          |
  # | AGG         |
  # | BRIX        |
  # | CLIENT      |
  # | FDH         |
  # | HOST        |
  # | MSAP        |
  ###################################################### END  Sprint 246#########################################
  ###################################################### Sprint 247#######################################################################
  #################################################### US197544 --CR5457 - OV : Defect Task Detail View  - Tag details  ##############################################
  @PI12 @Sprint247 @F18236 @US197544 @TC236840
  Scenario: To Validate DDLB in "Tags" section on Defect Task Details Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I select "Test_pop value from Tags dropdown" in Defect task search
    And I Click on "Save Action" button on the Open Task in Defect task search
    Then I verify "Updated Tag name is displayed in Defect task"

  @PI12 @Sprint247 @F18236 @US197544 @TC236920
  Scenario: To validate Dropdown in Defect Task Detail View page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I select "Test_pop value from Tags dropdown" in Defect task search
    And I Click on "Save Action" button on the Open Task in Defect task search
    Then I verify "Updated Tag name is displayed in Defect task"

  ######################################################## US197541--CR5457 - OV : Defect Task Search Options  - Tags  #########################
  #####  Need clarification on this test case  ###########
  @PI12 @Sprint247 @F18236 @US197541 @TC236807
  Scenario Outline: To Validate if Search Slider for Defect Task contains new search option "Tag Name'
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "<Task Name List>" from Task status
    And I click on search button for "Defect Task"
    Then I Validate is search results tab is displayed for Defect task search

    Examples: 
      | Task Name List   |
      | DNS              |
      | Location Fallout |

  #########################################  US197522--CR5457 - OV : Manage Tags  - Add/Delete/Search/View All Tags & Defect Task List view #########################
  @PI12 @Sprint247 @F18236 @US197522 @TC236847
  Scenario: To Validate "View All Tags" Button on Manage Tags Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "View All Tags Button is displayed under Manage Tags"

  @PI12 @Sprint247 @F18236 @US197522 @TC236864
  Scenario: To validate Search Tag button under manage tag in gear icon on OV
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    Then I verify "Search Tags Button is displayed under Manage Tags"

  @PI12 @Sprint247 @F18236 @US197522 @TC236871
  Scenario: To Validate View all tag button in list view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I select "Hover Tasks as Task type" in Manage tags page
    And I click on "View All Tags button" in Manage tags page
    And I verify "Excel & Print Icon displayed in Tag search result page"
    Then I verify "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page"

  @PI12 @Sprint247 @F18236 @US197522 @TC238095
  Scenario: To validate Adding tag using add tag button under manage tag
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Manage Tags" under the Gear Icon
    And I create "a new Tag as AUTO Test"
    Then I verify "AUTO Test Tag name are displayed in Manage Tags Search result page"

  @PI12 @Sprint247 @F18236 @US197522 @TC238021
  Scenario: To Validate Associated tag in Defect Task List view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Open" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "Edit" button on the Open Task in Defect task search
    And I select "Test_pop value from Tags dropdown" in Defect task search
    And I Click on "Save Action" button on the Open Task in Defect task search
    Then I verify "Updated Tag name is displayed in Defect task"

  ######################################################  END Sprint 247 ##############################################################
  ######################################################## Sprint 248 ################################################################
  ###############################  US196967 -- C459 - Widget - Inventory ################################################
  @PI13 @Sprint248 @F21121 @US196967 @TC243475
  Scenario: @TC243475 -Validate 'Inventory' option in add wizget drop drown
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    Then I verify "Inventory widget under My Dashboard is displayed"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC243488
  Scenario: @TC243488 -Validate the edit widget icon and widget pop on dashboard
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    Then I verify "edit inventory widget under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244006
  Scenario: @TC244006 -Validating save functionality of "Widget Name " popup for devices
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Device" under "Inventory" in Widget window
    And I "search with device name in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244155
  Scenario: @TC244155 -Validating save functionality of "Widget Name " popup for Circuit
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Circuit" under "Inventory" in Widget window
    And I "search with Circuit type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244158
  Scenario: @TC244158 -Validating save functionality of "Widget Name " popup for Conatact
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Contact" under "Inventory" in Widget window
    And I "search with Contact type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244167
  Scenario: @TC244167 -Validating save functionality of "Widget Name " popup for Link
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Link" under "Inventory" in Widget window
    And I "search with Link type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244171
  Scenario: @TC244171 -Validating save functionality of "Widget Name " popup for Location
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Location" under "Inventory" in Widget window
    And I "search with Location name in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244269
  Scenario: @TC244269 -Validating save functionality of "Widget Name " popup for Number
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Number" under "Inventory" in Widget window
    And I "search with Number type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC245354
  Scenario: @TC245354 -Validating save functionality of "Widget Name " popup for Service
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Service" under "Inventory" in Widget window
    And I "search with Service type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244276
  Scenario: @TC244276 -Validating save functionality of "Widget Name " popup for Pun Location
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "PUN Location" under "Inventory" in Widget window
    And I "search with PUN Location created by in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC244279
  Scenario: @TC244279 -Validating save functionality of "Widget Name " popup for Reservation
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Reservation" under "Inventory" in Widget window
    And I "search with Reservation type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC245311
  Scenario: @TC245311 -Validating save functionality of "Widget Name " popup for Topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Topology" under "Inventory" in Widget window
    And I "search with Topology type in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196967 @TC245317
  Scenario: @TC245317 -Validating save functionality of "Widget Name " popup for Subscriber
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    And I click on the "Edit widget" button in Widget window
    And I select "Subscriber" under "Inventory" in Widget window
    And I "search with TEST - JANET Subscriber in Widget window"
    And I click on the "Save widget" button in Widget window
    Then I verify "Widget window should display the results"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  #############  US173592: Maint_US201316:{CoD: 3] Unable to create multiple MDU in GDB  #########################
  @PI13 @Sprint248 @F18892 @US173592 @TC236628
  Scenario Outline: @TC236628 - Validate 'Management IP Subnet Mask' behavior in Device Create Page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I verify "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask"
    And I verify "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway"
    And I "enter valid Management IP subnet mask & Default gateway ranging between 0.0.0.0 - 255.255.255.255"
    Then I click on "Create" button in Device Create Screen
    Then I verify "Management IP Subnet Mask & default gateway values are displayed in Device details page"

    Examples: 
      | Devicerole | Devicetype            | Devicesubtype   | Testdata        |
      | CLIENT     | Cisco ASR 9000 Series | Cisco ASR 9000V | TC212395-CLIENT |
      | DSLAM      | Calix C Series        | Calix C7        | TC174924-DSLAM  |

  #| FDH        | Corning FDH              | Corning 144 Port Distribution | TC174928-FDH      |
  #| FDP        | Fiber Distribution Panel | Generic FDP 12:12             | TC174929-FDP      |
  #| HOST       | Cisco ASR 9000 Series    | Cisco ASR 9006                | TC212391-HOST     |
  #| MSAP       | Calix C Series           | Calix C7                      | TC212392-MSAP     |
  #| NID        | RAD ETX Series           | RAD ETX204A                   | TC174932-NID      |
  #| NPE        | Juniper M Series         | Juniper M20                   | TC174934-NPE      |
  #| SPLITTER   | Fiber Splitter           | Generic Splitter 1:16         | TC174922-SPLITTER |
  #| MDU        | Calix MDU                | Calix 761 MDU                 | TC174926-MDU      |
  #| AGG        | Calix E7                 | Calix E7-20                   | TC174923-AGG      |
  #############  DE44923: Maint_US201316:{CoD: 3] Unable to create multiple MDU in GDB  #########################
  @PI13 @Sprint248 @DE44923 @TC242761
  Scenario: @TC242761 -Verify Create functionality of MDU in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MDU" as GDB-Component
    And I add "3" more device in GDB
    And I fill all the mandatory fields for "MDU"
    And I validate "Cascade all button" functionality in GDB
    Then I validate "Create all button" functionality in GDB

  ### *************************Location clli look up broken need to fix it  *************************#########################
  ############# DE42260 : MAINT : If the user selects a blank value or --Select-- value in device update page then --Select-- is getting stored in database and --Select-- is getting updated for Affiliate Owner for GPON and Passive Devices ###############
  @PI13 @Sprint248 @DE42260 @TC242334
  Scenario: @TC242334 -Validate Omnivue application behavior when user select "--Select--" for MCO while Device - Edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I "select MCO field with --Select-- value"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "MCO field is updated with null value & also verify in DB"

  @PI13 @Sprint248 @DE42260 @TC242334
  Scenario: @TC242334 -Validate Omnivue application behavior when user select "--Select--" for Affiliate Owner while Device - Edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I "select Affiliate Owner field with --Select-- value"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "Affiliate Owner field is updated with null value & also verify in DB"

  ### *************************confirm do we need to check for gpon & passive seperately  *************************#########################
  #############  US187678 -- CR5457: CLC Contact Details View - 360 view(Left Panel)  #########################
  @PI13 @Sprint248 @F19784 @US187678 @TC243238
  Scenario: @TC243238 -Verify that the CLC Contacs are displayed in list view if the number of search results are more than one
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Search Results tab is displayed along the search results"
    And I click on view icon in Search Result page
    Then I verify "CLC Contact Page displayed"

  @PI13 @Sprint248 @F19784 @US187678 @TC244045
  Scenario: @TC244045 -Verify that the CLC Contacs are displayed in 360 view if the number of search results return one record
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with all criteria filled"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Page displayed"

  #############  US187687 -- CR5457: CLC Contact Details View - 360 view(Right Panel)  #########################
  @PI13 @Sprint248 @F19784 @US187687 @TC242425
  Scenario: @TC242425 -Verify Related tab Circuit screen in CLC Contact view screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    And I verify "CLC Contact Search Results tab is displayed along the search results"
    And I click on view icon in Search Result page
    And I verify "CLC Contact Page displayed"
    And In the 360 view I click on the "Circuits" tab
    And I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"
    Then I verify "Circuit table should contain View, Circuit Name, CAC, Region & Remove Headers displayed in Circuit Related tab for CLC contact page"

  #############  US187688 -- CR5457: CLC Contact Details View - Circuit Related Tab - Actions - Delete/Delete All  #########################
  @PI13 @Sprint248 @F19784 @US187688 @TC242746
  Scenario: @TC242746 -Verify Individual Delete icon functionality in Related tab Circuit screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    And I verify "CLC Contact Search Results tab is displayed along the search results"
    And I click on view icon in Search Result page
    And I verify "CLC Contact Page displayed"
    And In the 360 view I click on the "Circuits" tab
    Then I "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page"

  #############  US201116 -- CR5457: CLC Contact Access Levels - Database configurations.  #########################
  @PI13 @Sprint248 @F19784 @US201116 @TC242747
  Scenario: @TC242747- Verify the new modules for a Workgroup in OMNIVue GUI for CLC Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" tab
    And I "Hover to Administration under Gear Icon"
    And I select "Manage Workgroup" under Administration
    Then I verify "Under Manage Workgroup we should see Add Workgroup, Edit Workgroup, Delete Workgroup & Workgroup list is been displayed"
    And I "Select first workgroup & click on Edit Workgroup button in Manage Workgroup page"
    Then I verify "CLC_Contact_Create, CLC_Contact_Search & CLC_Contact_Update modules are displayed in Role permission"

  #############  US187665 -- CR5457: CLC Contact Create Screen  #########################
  @PI13 @Sprint248 @F19784 @US187665 @TC243431
  Scenario: @TC243431 -To validate error message when all the mandatory fields/few mandatory fields in the create screen are not entered .
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    Then I verify "Warning message displayed on all the mandatory fields when create button is clicked if no data is entered in CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243433
  Scenario: @TC243433 -To validate reset button on CLC create Contact screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    Then I verify "POP-Up messsage is displayed on clicking on Reset button in CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243501
  Scenario: @TC243501 -To validate Success message in create contact page after the CLC contact is created
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I verify "Customer Name is added in the CLC Contact page"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint248 @F19784 @US187665 @TC243503
  Scenario: @TC243503 -To validate Error message in create contact page when duplicate contact is created
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "Existing" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact already present in the database. message is displayed in the CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243637
  Scenario: @TC243637 -To validate email field in CLC Contact Create Screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I "provide the Invalid Email id in CLC contact create page"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Please enter valid Email ID message is displayed in the CLC Contact create page"

  @PI13 @Sprint248 @F19784 @US187665 @TC243747
  Scenario: @TC243747 -To validate telephone field in CLC Contact Create Screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I "provide the Invalid Phone number in CLC contact create page"
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Please enter a valid telephone number. message is displayed in the CLC Contact create page"

  #############  US187676 -- CR5457: CLC Contact Search Results view  #########################
  @PI13 @Sprint248 @F19784 @US187676 @TC242647
  Scenario: @TC242647 -To Validate List view for CLC Contact Search Results view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Search Results tab is displayed along the search results"

  @PI13 @Sprint248 @F19784 @US187676 @TC242655
  Scenario: @TC242655 -To Validate print button in List view of CLC Contact Search Results page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "Print button is displayed CLC Contact Search Results"

  @PI13 @Sprint248 @F19784 @US187676 @TC242657
  Scenario: @TC242657 -To Validate Export to Excel button in List view of CLC Contact Search Results page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with Abinash"
    And I click on search button for "CLC Contact"
    Then I verify "Excel export button is displayed CLC Contact Search Results"

  @PI13 @Sprint248 @F19784 @US187676 @TC242658
  Scenario: @TC242658 -To Validate 360 view for CLC Contact Search Results view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "CLC Contact" as Inventory type
    And I "Search CLC contact with all criteria filled"
    And I click on search button for "CLC Contact"
    Then I verify "CLC Contact Page displayed"

  #############  US187737 -- CR5457: CLC Contact Edit Screen  #########################
  @PI13 @Sprint248 @F19784 @US187737 @TC243137
  Scenario: @TC243137 -To Validate CLC Contact in Edit Page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Edit" button in CLC Contact Page
    And I "modify the all the fields CLC Contact view screen"
    And I click on the "Save" button in CLC Contact Page
    Then I verify "CLC contact is saved successfully. message is displayed in the CLC Contact page"
    Then I verify "Modified values are reflecting in CLC Contact page"
    Then I verify "Audit log captured the Update log on the new changes in the CLC Contact page"
    And I click on the "Delete" button in CLC Contact Page

  @PI13 @Sprint248 @F19784 @US187737 @TC243454 @TC251575
  Scenario: @TC243454 -To Validate Delete Button on Contact Edit Screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "CLC Contact"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in CLC Contact Create form with "TC243501" data
    And I click on the "Create" button in CLC Contact Page
    Then I verify "Contact created successfully. message is displayed in the CLC Contact create page"
    And I click on the "Delete" button in CLC Contact Page
    Then I verify "Audit log captured Delete action in the CLC Contact page"

  #####  US187737 is in blocked state #########
  #############  US196964 -- C459 - omnivueHome.html to Dashboard  #########################
  @PI13 @Sprint248 @F21121 @US196964 @TC244028
  Scenario: @TC244028 - Validate - OMNIVUE - Default "My Dashboad" tab when User Preference - Default Tab = "Dashboard"
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I should see the "My Dashboard tab" been displayed
    Then I verify "Add Widget drop down field should be displayed containing Inventory, Network Build, Order, Reports, Tasks & IFrame Widgets values"

  @PI13 @Sprint248 @F21121 @US196964 @TC244029
  Scenario: @TC244029 - Validate - OMNIVUE - Default "My Dashboad" tab when User Preference - Default Tab = "None"
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    Then I verify "Apart from My Dashboard default options like Google Type search option, Gear Icon, Help Icon, Search Tab & Create Tab is not been disturbed"

  @PI13 @Sprint248 @F21121 @US196964 @TC244156
  Scenario: @TC244156 - Validate "Inventory" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Inventory under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244157
  Scenario: @TC244157 -  Validate "Network Build" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Network Build under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244169
  Scenario: @TC244169 -  Validate "Order" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Order under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244170
  Scenario: @TC244170 -  Validate "Reports" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Reports under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244172
  Scenario: @TC244172 -  Validate "Tasks" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Tasks under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  @PI13 @Sprint248 @F21121 @US196964 @TC244173
  Scenario: @TC244173 - Validate "Iframe Widgets" Option in "My Dashboard" tab - "Add Widget" drop down
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "My Dashboard" tab
    And I select "Iframe Widgets under Add Widget from My Dashboard"
    Then I verify "Resize, Edit & Remove icons should be displayed under My Dashboard"
    And I click on "Remove icon under My Dashboard to Remove the Widget"

  #############  US196515: MAINT - MCO field verification from Circuit/Service/Device Module #########################
  @PI12 @Sprint248 @F18236 @US196515 @TC236246
  Scenario Outline: @TC236246 -Validate  MCO field in Device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    Then I verify "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Device view"

    Examples: 
      | Device role |
      | OLT         |

  #| BRAS        |
  #| DSLAM       |
  #| FDP         |
  #| MST         |
  #| NID         |
  #| NPE         |
  #| ONT         |
  #| SPLITTER    |
  #| TD          |
  #| AGG         |
  #| BRIX        |
  #| CLIENT      |
  #| FDH         |
  #| HOST        |
  #| MSAP        |
  #@PI12 @Sprint248 @F18236 @US196515 @TC235933
  Scenario Outline: @TC235933 -Validate  MCO field in Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    Then I verify "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Circuit view"

    Examples: 
      | Circuit types   |
      | Ethernet Bearer |

  # | LAG                |
  # | Optical Bearer     |
  # | PON                |
  # | PW Unrouted (Path) |
  @PI12 @Sprint248 @F18236 @US196515 @TC235932
  Scenario Outline: @TC235932 -Validate  MCO field in Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Service Types>" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    Then I verify "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Service view"

    Examples: 
      | Service Types |
      | MEF ENNI      |

  #| MEF EVC       |
  #| MEF OVC       |
  #| MEF Service   |
  #| MEF UNI       |
  #| Mgmt EVC      |
  #| Mgmt UNI      |
  ############# US173592: CR5457 - Make 'Subnet Mask' attribute mandatory upon device creation / edit  #########################
  #############  US173586 -- CR5457 Device Attribute changes in OV  #########################
  @PI12 @Sprint248 @F18236 @US173586 @TC223780
  Scenario: Validate 'Default Gateway' on DefectTask details page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Tasks" search type and select "Defect Tasks" as Task Type
    And I select "Location Test" from Task status
    And I click on search button for "Defect Task"
    And I Validate is search results tab is displayed for Defect task search
    And I Click on "View" button on the Open Task in Defect task search
    Then I verify "Default Gateway field is displayed along with value in Defect Task Details"

  ###  Need few more things to be implemented waiting for sonalin & Divya's update ##############
  @PI12 @Sprint248 @F18236 @US173586 @TC223788
  Scenario: Validate 'Default Gateway' attribute on Ethernet/Lion Device create page.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And Select the technology as "ETHERNET" with Device Type as "Calix E5-111 AC" with Sub-Type as "Calix E5-111 AC"
    Then I fill the mandatory fields with "TC223788" data
