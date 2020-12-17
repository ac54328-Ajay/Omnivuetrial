@Search_Inventory @Search_Inventory_Service @Regression @Service_Reg_Run1
Feature: Search Inventory Service validations

  ################################################################ GPON  ################################################
  @TC287728 @TC287728_
  Scenario: @TC287728-@TC55687 -NIC_GPON_Reg_Verify Create functionality of HSI Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "HSI" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page
    And I gave the name as "1000085333-HSI"
    And I filled DTN as "6783092761" downStream as "100" upStream as "200"
    And I click on "Create" button on Service page
    Then Service should get created successfully
   # And I Click on "Audit Log" tab on Service Search page
   # When I Click on "OMNIVUE Audit Logs" tab
    #And I verify "Create action log details and validate database" in Service page
   # And I Click on "HSI Details"
    #And I click on "Edit" button on Service page
   # And I Update Alias1 as "testAuto" and Alias2 as "testAuto2"
    #And I click on "Save" button on Service page
   # And I verify "Service details and validate database" in Service page
   # And I Click on "Audit Log" tab on Service Search page
   # When I Click on "OMNIVUE Audit Logs" tab
   # And I verify "Update action log details and validate database" in Service page
   #  And I click on "Delete" button on Service page




    @TC119191 @TC122660 @TC122660_
    Scenario: @TC122660-@TC119191 -NIC_GPON_Reg_Verify Create functionality of IPTV Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "IPTV" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page
    And I gave the name as "1000084333-IPTV"
    And I filled DTN as "6783092761" downStream as "100" upStream as "200"
    And I click on "Create" button on Service page
   # Then Service should get created successfully
    #And I Click on "Audit Log" tab on Service Search page
    #When I Click on "OMNIVUE Audit Logs" tab
    #And I verify "Create action log details and validate database" in Service page
   # And I Click on "HSI Details"
    #And I click on "Edit" button on Service page
    #And I Update Alias1 as "testAuto" and Alias2 as "testAuto2"
   # And I click on "Save" button on Service page
   # And I verify "Service details and validate database" in Service page
   # And I Click on "Audit Log" tab on Service Search page
   # When I Click on "OMNIVUE Audit Logs" tab
   # And I verify "Update action log details and validate database" in Service page
   #  And I click on "Delete" button on Service page
     
     
    @TC119220 @TC122627 @TC122627_
    Scenario: @TTC119220 @TC122627 -NIC_GPON_Reg_Verify Create functionality of IPTVUnicast Service
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
  #  Then Service should get created successfully
  #  And I Click on "Audit Log" tab on Service Search page
  #  When I Click on "OMNIVUE Audit Logs" tab
  #  And I verify "Create action log details and validate database" in Service page
   # And I Click on "HSI Details"
    #And I click on "Edit" button on Service page
    #And I Update Alias1 as "testAuto" and Alias2 as "testAuto2"
    #And I click on "Save" button on Service page
    #And I verify "Service details and validate database" in Service page
   # And I Click on "Audit Log" tab on Service Search page
    #When I Click on "OMNIVUE Audit Logs" tab
   # And I verify "Update action log details and validate database" in Service page
     
     
     @TC287744 @TC55688 @TC123597 @TC123597_
   Scenario: @TC287744 @TC55688 @TC123597 -NIC_GPON_Reg_Verify Create functionality of Host Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "Host Service" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page
     And I gave the name as "HOST-AUTOMATION"
   And I click on "Create" button on Service page
  #####  Then Service should get created successfully
   # And I Click on "Audit Log" tab on Service Search page
    #When I Click on "OMNIVUE Audit Logs" tab
    #And I verify "Create action log details and validate database" in Service page
  # And I click on "Edit" button on Service page
   # And I Update Alias1 as "testAuto" and Alias2 as "testAuto2"
    #And I click on "Save" button on Service page
     #And I Click on "Audit Log" tab on Service Search page
   # When I Click on "OMNIVUE Audit Logs" tab
  #  And I verify "Update action log details and validate database" in Service page
  #    And I click on "Delete" button on Service page
          
    # And I click on "Update" button on Service page
    
    @TC287831 @TC287831_
    Scenario: @TC287831 -NIC_GPON_Reg-Verify data displayed in the Related Tabs - HOST service
     Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "Host Service" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page
     And I gave the name as "HIST-AUTOMATION"
     And I click on "Create" button on Service page
    Then Service should get created successfully
      And In the 360 view I click on the "Devices" tab
    And I validate the Related "Devices" tab in service page
    And In the 360 view I click on the "BAM Report" tab
    And I validate the Related "BAM Report" tab in service page
    And In the 360 view I click on the "Locations" tab
    And I validate the Related "Locations" tab in service page
    And In the 360 view I click on the "Performance Monitoring" tab
    And I validate the Related "Performance Monitoring" tab in service page
    And In the 360 view I click on the "Service Area" tab
    And I validate the Related "Service Area" tab in service page
   # And In the 360 view I click on the "Subscribers" tab
    #And I validate the Related "Subscribers" tab in service page
    #And In the 360 view I click on the "Tasks" tab
    #And I validate the Related "Tasks" tab in service page
    #And I validate the Related "Circuits" tab in service page
    #And I click on "Delete" button on Service page
   
  @TC165278-TC287828-TC287829-TC287830-TC287831 @Relatedtab @TC39203_
  Scenario Outline: @TC39203 -Related Systems -Verify data displayed in the Related Tabs <Search Service Type> service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "HSI" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page
    And I gave the name as "1000084333-HSI"
    And I filled DTN as "6783092761" downStream as "100" upStream as "200"
    And I click on "Create" button on Service page
     Then Service should get created successfully
    And I should see the "Service Search screen attributes" been displayed
  #  And In the 360 view I click on the "Devices" tab
  #  And I validate the Related "Devices" tab in service page
    And In the 360 view I click on the "BAM Report" tab
    And I validate the Related "BAM Report" tab in service page
    And In the 360 view I click on the "Locations" tab
    And I validate the Related "Locations" tab in service page
    #And In the 360 view I click on the "Performance Monitoring" tab
    #And I validate the Related "Performance Monitoring" tab in service page
    #And In the 360 view I click on the "Service Area" tab
    #And I validate the Related "Service Area" tab in service page
    #And In the 360 view I click on the "Subscribers" tab
    #And I validate the Related "Subscribers" tab in service page
    #And In the 360 view I click on the "Tasks" tab
    #And I validate the Related "Tasks" tab in service page
    #And In the 360 view I click on the "Topology View" tab
    #And I validate the Related "Topology View" tab in service page
    #And I validate the Related "Circuits" tab in service page
    #And I click on "Delete" button on Service page

    Examples: 
      | Search Service Type |
      | HSI                 |

  #|	IPTV								|
  #|	IPTV Unicast				|
  
  @TC165277 @refact @TC165277_
Scenario Outline: @TC165277 - NIC_GPON_Reg_Verify the update functionality of DSL OVC Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    #And I enter the service name "DSL OVC" in search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I click on "Edit" button on Service page
		And I "Update DSLOVC Service Page"
		And I click on "Save" button on Service page
	#	And I Validate the service "<Search Service Type>" field values in database
		
    Examples:
      | Search Service Type	|
      |	DSL OVC						  |  
 
 
   @TC198772-TC199741-TC199884
  Scenario Outline: @TC198772-TC199741-TC199884- OV Test - Verify Clean up HSI, IPTV & IPTV UNiCast Service 360 view page
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
    Then I should see "Services" Related Tab displayed in 360 view Service Page
    And In the 360 view I click on the "Services" tab
    And I verify "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services"
    Then I validate the Associated Service & edit Assocaition button in Services related tab
    And I verify "Associated Service table is it getting displayed in Services related tab"
    When I click on Edit Assocaite in service related tab of Associated Services tab
    Then I should see the Associate Backhaul button enabled
    And I click on"Delete Association button"of Associated Services tab
    And I click on"Associate Backhaul button"of Associated Services tab

    Examples: 
      | Service Type |
      | HSI Service  |

  #|IPTV					|
  #	|IPTV-Unicast	|
  
  @US31642 @TC20884 @TC86315
  Scenario: @TC86315-TC20884- Validate single range of C Tag pool 1-4095 for DSL OVC service with Ethernet-HSI usage type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service" as Inventory type
    And I select Service Type values as "DSL OVC" under Service Search slider
    And I click on search button for "Service"
    And I select "DSL OVC with no CTAG Associated" on view icon in Search Result page
    #Then I should see the "View Entry in Audit log for DSL OVC View Action" been displayed
    And I verified view page and clicked on "CTag" tab
    And Add the CTag range "Less than 1"
    And Add the CTag range "Greater than 4095"
    And Add the CTag range "Alphanumeric values"
    Then Add the CTag range "Single Range 1-4095"
    Then Add the CTag range "Single Number Range"
    And Add the CTag range "Multiple Range between 1-4095"
    Then Add the CTag range "Overlapping the CTag range"
    And I Delete the added CTag range

  @TC86230 @TC86231
  Scenario Outline: @TC86230-TC86231- NIC_GPON_Reg_Verify that CTag value update functionality in VLAN / Virtual ports related tab of HSI/IPTV UNICAST service.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service" as Inventory type
    And I select Service Type values as "<Search Service Type>" under Service Search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I should see "VLAN/Virtual Ports" Related Tab displayed in 360 view Service Page
    And In the 360 view I click on the "VLAN/Virtual Ports" tab
    And In the 360 view I click on the "Virtual Ports" tab
    And I double click on "CEVLAN" name

    #And Add the CEVLAN "Less than 1"
    #And Add the CEVLAN "Greater than 4095"
    #And Add the CEVLAN "Alphanumeric values"
    #Then Add the CEVLAN "Single Range 1-4095"
    #Then Add the CEVLAN "Single Number Range"
    Examples: 
      | Search Service Type |
      | HSI                 |
		#|	IPTV Unicast				|   

		
	
      
  
  ########################################################   Refactored Ethernet ######################################################
 
	##############################MEF UNI###################################################################################
  
  @TC128659	@TC122607 @GETENF-5069 @GETENF-5026

  Scenario: @TC128659 -NIC_Ethernet_Reg_Create MEF UNI_in CLF Format;	@TC122607	NIC_Ethernet_Reg_Verify the delete functionality of MEF UNI Service  
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
      And I go to "Inventory" type and select "Service"
    And I Select "MEF UNI" for the drop down Service Type
    And I click the "Launch Create Form" button
     And I fill the subscriber details in service page 
     And I fill all the mandatory fields required in service create form with "MEF UNI"
   # And I fill all the mandatory fields required for "MEF UNI"
    And I select device : "OCALFLTS111-112"  in "MEF UNI" Service
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
     And I click on "Delete" button on Service page
 
  @TC143221	@TC84020   @GETENF-5108
    Scenario: @TC143221	NIC_Ethernet_Reg_Validate User is able to give HPC Reference='Yes' While Creating MEF UNI Service; @TC84020	NIC_Ethernet_Reg_Create MEF UNI with PM SPEC Code                  
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF UNI" for the drop down Service Type
    And I click the "Launch Create Form" button
     And I fill the subscriber details in service page 
    And I fill all the mandatory fields required for "PM UNI"
    And I select "Yes" in HPC Reference Code and  HPC Expiration Date as "08/21/2019"  
    And I select device : "PRDSNVDZ111-111"  in "MEF UNI" Service  
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully
    Then I validate HPC details should be displayed as "Yes" in HPC Reference Code and  HPC Expiration Date as "08/21/2019" in service details tab     
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
 	 And I click on "Delete" button on Service page
 	  
 	  @TC84021_Refactored @TC122609_Refactored @GETENF-5071
  
  Scenario: @TC84021 - NIC_Ethernet_Reg_Create MEF ENNI; @TC122609	NIC_Ethernet_Reg_Verify the delete functionality of MEF ENNI Service  
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF UNI" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill the subscriber details in service page  
    And I fill all the mandatory fields required for "MEF ENNI"
    And I select device : "CRVSORNB111-111"  in "MEF ENNI" Service
    When I click on Create button of "MEF ENNI" page
     Then Service should get created successfully 
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
    And I click on "Delete" button on Service page
    
     @TC83463_Refactored @GETENF-5054
  Scenario: @MSCUNI -NIC_Ethernet_Reg_Create MSC UNI
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
  And I go to "Inventory" type and select "Service"
    And I Select "MSC UNI" for the drop down Service Type
    And I click the "Launch Create Form" button
     And I fill the subscriber details in service page  
    And I fill all the mandatory fields required for "MSC UNI"
    And I enter "NID Device" : "CRVSORNB111-111" in "MSC UNI" Service Association Section
    And I enter "BRIX device" : "CNRPMN43111-111" in "Probe Uni" Service Association Section
    When I click on Create button of "MEF UNI" page
     Then Service should get created successfully 
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
    
      @TC84022_Refactored @TC122564_Refactored	@GETENF-5031
  Scenario: @TC84022 -NIC_Ethernet_Reg_Create PROBE UNI service @TC122564	NIC_Ethernet_Reg_Verify the delete functionality of Probe UNI service  
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
 	  
 	    @TC83610_Refactored
  Scenario: Activate a MEF UNI Service and check in ISAT Datbase and match with the GUI
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
      And I go to "Inventory" type and select "Service"
    And I Select "MEF UNI" for the drop down Service Type
    And I click the "Launch Create Form" button
     And I fill the subscriber details in service page
    And I select device : "CRVSORNB111-111"  in "MEF UNI" Service
    And I fill all the mandatory fields required for "MEF UNI"
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully 
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action" 
    And Click on Activate button with order number "Z12345" to send an activation request
    And Validate Activation Message for "MEF UNI" service
  
      @TC83611_Refactored @GETENF-5039
  Scenario: @TC55691 - NIC_Ethernet_Reg_MEF_ENNI_Manual Activation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF UNI" for the drop down Service Type
    And I click the "Launch Create Form" button
     And I fill the subscriber details in service page
    And I fill all the mandatory fields required for "MEF ENNI"
    And I select device : "CRVSORNB111-111"  in "MEF ENNI" Service
    When I click on Create button of "MEF ENNI" page
    Then Service should get created successfully 
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"
    And Click on Activate button with order number "Z12345" to send an activation request
    And Validate Activation Message for "MEF ENNI" service
    
    
      @TC143220_Refactored @TC143220_ @GETENF-5109
    Scenario: @TC143220 -NIC_Ethernet_Reg_Validate User is able to update HPC Reference='Yes' for existing MEF UNI Service
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
     And I go to "Inventory" type and select "Service"
    And I Select "MEF UNI" for the drop down Service Type
     And I click the "Launch Create Form" button
     And I fill the subscriber details in service page
    And I select device : "CRVSORNB111-111"  in "MEF UNI" Service
    And I fill all the mandatory fields required for "MEF UNI"
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully 
    Then I "click on Audit Tab in Service Screen to verify the log is been registered for Create action"    
     And I click on "Edit" button on Service page
     And I select "Yes" in HPC Reference Code and  HPC Expiration Date as "12/21/2018"
    And I click on "Save" button on Service page
    Then I validate HPC details should be displayed as "Yes" in HPC Reference Code and  HPC Expiration Date as "12/21/2018" in service details tab 
    And I click on "Delete" button on Service page
    
 #############################################################################################################
  @TC83472_refact @TC129196_refact @TC122555_refact @In_Sprint1
  Scenario: @TC83472-TC129196-TC122555- -NIC_Ethernet_Reg_Create MEF EVC service without members-update-delete
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF EVC-TC44385 data"
    And I fill the subscriber details in service page
    And I select "EVPL" in Service Type Indicator field
    And I click on manual activation checkbox in service create form
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Create action log details and validate database" in Service page
    And I click on "Edit" button on Service page
    Then I validate warning message displayed in the deatils tab
    And I select "EVPL" in Service Type Indicator field in the deatils tab
    And I click on "Save" button on Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Update action log details and validate database" in Service page
    And I click on "Delete" button on Service page

  @TC83475_refact @TC129163_refact @TC122552_refact @In_Sprint1 @GETENF-5057
  Scenario: @TC83475-@TC129163-@TC122552 -NIC_Ethernet_Reg_Create MEF OVC service without members-update-delete
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF OVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF OVC-TC44386 data"
    And I fill Subscriber details  "MEF OVC Subscriberdata"
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Create action log details and validate database" in Service page
    Then Service should get created successfully
    And I click on "Edit" button on Service page
    And I select "EVPL" in Service Type Indicator field in the deatils tab
    And I click on "Save" button on Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Update action log details and validate database" in Service page
    And I click on "Delete" button on Service page

  @TC129196 @TC129196_NIC @TC131614_refact @TC84030_Refact @TC83623_refact @TC154953_refact @In_Sprint1
  Scenario: @TC129196-TC84030-TC83623-TC131614 -NIC_Ethernet_Reg_Create MEF EVC with PM Type as BRIX
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
    And I Associate MEF UNI with "17/MUNI/171717//MUNI" Non PM Spec Code to mefovc service
    And I expand the associated service
    And I cLick on Add VLAN  and added VLAN range
    And I click on "Edit" button on Service page
    And I "remove the PM type on Service edit page"
    And I click on "Save" button on Service page
    Then I verify "PM Type does not contain any value in Service page"
    And I Click on "MEF OVC Details" tab on Service Search page
    And I verify the SLA template
    And I click on "Delete" button on Service page

  @TC129196 @TC129196_NIC_Ethernet_Reg_Edit_MEF_EVC_Without_Members @TC154952_Refact @TC83613_tefact
  Scenario: @TC129196-TC84030-TC83613-TC154952-NIC_Ethernet_Reg_Create MEF_EVC with PM Type as NID2NID
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
    And I Associate MEF UNI with "17/MUNI/171717//MUNI" Non PM Spec Code to mefovc service
    And I expand the associated service
    And I cLick on Add VLAN  and added VLAN range
    And I click on "Edit" button on Service page
    And I "remove the PM type on Service edit page"
    And I click on "Save" button on Service page
    Then I verify "PM Type does not contain any value in Service page"
    And I Click on "MEF OVC Details" tab on Service Search page
    And I verify the SLA template
    And I "remove the PM type on Service edit page"
    And I click on "Save" button on Service page
    Then I verify "PM Type does not contain any value in Service page"
    And I click on "Delete" button on Service page

   @TC83475 @TC122552 @TC83617_refact @TC154954_refact @GETENF-5045
  Scenario: TC83617-TC154954- NIC_Ethernet_Reg_Create MEF OVC service with PM Type as NID2NID
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF OVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF OVC-TC44386 data"
    And I fill Subscriber details  "MEF OVC Subscriberdata"
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I verify "Service details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Create action log details and validate database" in Service page
    And I Associate MEF UNI with "17/MUNI/171717//MUNI" Non PM Spec Code to mefovc service
    And I expand the associated service
    And I cLick on Add VLAN  and added VLAN range
    # And I Associate PM UNI "39/MEF1/012349//AUTO" mefovc service
    And I click on "Edit" button on Service page
    And I fill all the mandatory fields required in service update form with "MEF OVC-TC83475 Update data"
    And I click on "Save" button on Service page
    And I verify "Service details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Update action log details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Add Member action log details and validate database" in Service page
    And I Click on "MEF OVC Details" tab on Service Search page
    And I verify the SLA template
    And I click on "Delete" button on Service page

  @TC154955_refact @TC129163 @TC154955_refact @GETENF-5016
  Scenario: @TC154955-@TC154955- NIC_Ethernet_Reg_Create MEF OVC service with PM Type as BRIX
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I Select "MEF OVC" for the drop down Service Type
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in service create form with "MEF OVC-TC44386 data"
    And I fill Subscriber details  "MEF OVC Subscriberdata"
    And I select "EVPL" in Service Type Indicator field
    And I click on "Create" button on Service page
    Then Service should get created successfully
    And I verify "Service details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Create action log details and validate database" in Service page
    And I Associate MEF UNI with "49/MEF1/012349//NOPM" Non PM Spec Code to mefovc service
    And I expand the associated service
    And I cLick on Add VLAN  and added VLAN range
    # And I Associate PM UNI "39/MEF1/012349//AUTO" mefovc service
    And I click on "Edit" button on Service page
    And I fill all the mandatory fields required in service update form with "MEF OVC-TC154955 Update data"
    And I click on "Save" button on Service page
    And I verify "Service details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Update action log details and validate database" in Service page
    And I Click on "Audit Log" tab on Service Search page
    When I Click on "OMNIVUE Audit Logs" tab
    And I verify "Add Member action log details and validate database" in Service page
    And I Click on "MEF OVC Details" tab on Service Search page
    And I verify the SLA template
    And I click on "Delete" button on Service page

  @TC266330_refact
  Scenario: @TC266330 -NIC_Ethernet_Reg_OMNIVUE -Service - Ethernet- Verify Service circuit design tab for MEF EVC/OVC
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
    And I Associate MEF UNI with "17/MUNI/171717//MUNI" Non PM Spec Code to mefovc service
    And I click on Service Circuit Design related tab
    Then I verify all the fields displayed in the Service Circuit Design tab
    And I click on "Delete" button on Service page

 