@Search_Inventory @Search_Inventory_Device @Regression @regression_device_1 @PilotTesting 
Feature: Search - Inventory - Device Side Validation
  
  As an OV inventory user I need the ability device Search side validation
  
  @TC292406 @TC292406_refact @DeviceRefact @PilotTesting
    Scenario:  @TC292406 -NIC_Ethernet_Reg_Verify that the user is able to update the child card details
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role
    And I fill all the mandatory fields with "TC174934-NPE" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "select the card details and Click on Add Card"
    And I clicked the "Device port Expand" button in Device Detail Page
    And I "add the child card to the added card in device port"
    And I click refresh button in device details page
    And I clicked the "Device port Expand" button in Device Detail Page
    And I click on child accordian tab
    And I update the fields in Child card accordian tab
     
    @TC292407 @TC292407_refact @DeviceRefact @PilotTesting
    Scenario:  @TC292407 -OMNIVue_Verify the delete card functionality
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role
    And I fill all the mandatory fields with "TC174934-NPE" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "select the card details and Click on Add Card"
    And I click refresh button in device details page
    And I clicked the "Device port Expand" button in Device Detail Page
    And I click on Delete card button for the device port expanded
     
  

  @PI6 @Sprint209 @F2262 @US51414 @TC37684 @TC86322_refact @TC125806_refact @DeviceRefact @PilotTesting @TC86322
  Scenario Outline:  @TC86322- TC125806 -NIC_Ethernet_Reg-Validate Create Device functionality for Passive Technology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Role>" with Device Type as "<Device>" with Sub-Type as "<Subtype>"
    Then I fill the mandatory fields with "<Data>" data
    And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Create Device" Action
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the message displayed on triggerring Delete functionality
    And I validate Audit logs details in database for "Delete Device" Action
    Then I need to validate the Device deleted from Inventory

    Examples: 
      | Device                 | Subtype         | Data              | Role |
      | Fiber Distribution Hub | Generic FDH 144 | US43123-TC24409-1 | FDH  |

  #| Fiber Distribution Panel         | Generic FDP 12:12     |US43123-TC24409-2	|FDP|
  # | Fiber Multiport Service Terminal | Generic MST 24:24     |US43123-TC24409-3	|MST|
  #| Fiber Splitter                   | Generic Splitter 1:32 |US43123-TC24409-4 |SPLITTER|
  
  @TC86609_refact @DeviceRefact
  Scenario Outline: @TC86609- NIC_Ethernet_Reg_Verify that the user is able to update the device details of a passive device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Role>" with Device Type as "<Device>" with Sub-Type as "<Subtype>"
    Then I fill the mandatory fields with "<Data>" data
    And I verify "Device details and validate database"
    And I clicked the "Edit" button in Device Detail Page
    And I fill all the mandatory fields  in Device edit form with "TC55671"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action log is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Update Device" Action

    Examples: 
      | Device                 | Subtype         | Data              | Role |
      | Fiber Distribution Hub | Generic FDH 144 | US43123-TC24409-1 | FDH  |

  #| Fiber Distribution Panel         | Generic FDP 12:12     |US43123-TC24409-2	|FDP|
  # | Fiber Multiport Service Terminal | Generic MST 24:24     |US43123-TC24409-3	|MST|
  #| Fiber Splitter                   | Generic Splitter 1:32 |US43123-TC24409-4 |SPLITTER|
  @TC23908_refact @DeviceRefact
  Scenario: @TC23908 - NIC_Ethernet_Reg_Verify the Bulk Port Update functionality on a device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role
    And I fill all the mandatory fields with "TC23908-NID" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Bulk Port Update" button in Device Detail Page
    Then I should see the "Bulk Port update tab is displayed" been displayed
    And I clicked the "Show Ports" button in Device Detail Page
    Then I verify "on bulk port update is updating the port status of the device"

  @TC39200_refact @DeviceRefact
   Scenario: @TC39200 -Verify the reserve port name changes to manage port reservation when user reserves a port
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role
    And I fill all the mandatory fields with "TC23908-NID" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I "expand the shelf having status as Planned in Device Screen"
    And I clicked the "Reserve Port" button in Device Detail Page
    And I "fill all the mandatory fields in the Reserve port pop up window in Device Screen"
    And I verify "Port status is updated as In-Service in Device Screen"
    And I clicked the "Managed Port Reservation" button in Device Detail Page
   And I "remove the reserved port in Device Detail Page"
    And I verify "Port status should change back to Planned in Device Screen"

    #Examples: 
      #| Device role |
    #  | OLT         |

  @TC55484_refact @DeviceRefact
  Scenario Outline: @TC55484- NIC_Ethernt_Reg_Verify the create functionality of an Ethernet device with a manual activation task
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I "select Create Activation Task in Device Create Screen"
    Then I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Tasks" tab
    Then I verify "a manual task gets added on selecting activation task in the device screen"
    #And I verify "Create action type is registered under the Audit logs section in Device page"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
  #  And I validate Audit logs details in database for "Create Device" Action
    And I Validate the manual task details in database

    Examples: 
      | Devicerole | Devicetype     | Devicesubtype | Testdata       |
      | DSLAM      | Calix C Series | Calix C7      | TC174924-DSLAM |

  @TC55507_refact @DeviceRefact
  Scenario: @TC55507 -Verify the create functionality of Ethernet device type NID with Activation Check box selected
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role
    And I fill all the mandatory fields with "TC174932-NID" data
    And I "select Create Activation Task in Device Create Screen"
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Tasks" tab
    Then I verify "a manual task gets added on selecting activation task in the device screen"

  @TC55531_refact @TC125803_refact @DeviceRefact
  Scenario: @TC55531-TC125803 NIC_GPON_Reg_Verify the create functionality of GPON device role OLT
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Create Device" Action
    Then I validate "Delete button" attributes in Search page for "Device"
    And I make the page 100%
    And I clicked the "Delete" button in Device Detail Page
    And I validate the warning message displayed on triggerring Delete functionality
    And I validate Audit logs details in database for "Delete Device" Action
    Then I need to validate the Device deleted from Inventory

  @TC55668_refact @DeviceRefact @GETENF-5095
  Scenario: @TC55668 -NIC_Ethernet_Reg_Verify the transport path details on the supporting tab of a device.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Transport Path"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And I click on device hyperlink in transportpath details page
    And I Click on "Transport Details" tab on Device Search page
    And I validate the Transport path details
    
    
  @TC55671_refact @DeviceRefact
  Scenario: @TC55671 NIC_Ethernet_Reg_Verify that the user is able to update the device details of a Ethernet device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    And I fill all the mandatory fields  in Device edit form with "TC55671"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action log is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Update Device" Action
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the message displayed on triggerring Delete functionality
    
     @TC86321_refact @DeviceRefact
  Scenario: @TC86321 -OV-Validate Location CLLI is optional on Inventory Device Create for GPON Technology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "GPON" technology and device type
    And Select the technology as "GPON" with Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    And Validate "GPON" radio button in device create page
    And Validate Location CLLI
    Then I fill the mandatory fields with "US51414-TC37479" data
    Then I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Create Device" Action
    
    @TC126053_refact @TC86607_refact @DeviceRefact
  Scenario: @TC126053-TC86607- NIC_GPON_Reg_Verify update functionality of device CLLI with special characters on GPON devices
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC174922-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Device Clli is an editable field in Device edit screen for GPON"
    Then I verify "Device CLLI attribute is in Device edit screen for GPON"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the message displayed on triggerring Delete functionality
    
    @PI8 @Sprint220 @F10066 @TC103154_refact @DeviceRefact
  Scenario Outline: @TC103154-  OV-Validate Delete button should not be displayed in 360 view on Non-GPON devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    Then I validate "Delete button" attributes in Search page for "Device"

    Examples: 
      | Device role |
      | BRAS        |
      | DSLAM       |
      | NID         |
      | NPE         |
      | TD          |
     # | AGG         |
      #| BRIX        |
      | CLIENT      |
      | HOST        |
      #| MSAP        |


  @TC119042_refact @DeviceRefact
  Scenario: @TC119042 -NIC_GPON_Reg_Verify the create functionality of GPON device role ONT with selected as Infrastructure Build
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC174922-ONT" data
    And I click on "Create" button in Device Create Screen
    And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Create Device" Action
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the warning message displayed on triggerring Delete functionality
    And I validate Audit logs details in database for "Delete Device" Action
    Then I need to validate the Device deleted from Inventory
    
     @Device_Related_tab @TC287610_refact @TC301763_refact @TC122158_refact @DeviceRefact
  Scenario Outline: @TC287610-TC122158-TC301763 -Verify data displayed in the related tabs for Contacts - "<Device role>" devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I validate the Related  "BAM Report" tab in device page
    And I validate the Related  "Circuits" tab in device page
    #And I validate the Related  "Services" tab in device page
    And I validate the Related  "Locations" tab in device page

    #And In the 360 view I click on the "Subscribers" tab
    #Then I should see the "Impacted Subscribers table is displayed in Device screen" been displayed
    #And In the 360 view I click on the "Orders" tab
    #Then I should see the "Order table in Device screen" been displayed
    #When In the 360 view I click on the "Contacts" tab
    #Then I verify "Contact data is displayed in the Device Screen"
    Examples: 
      | Device role |
      | OLT         |
      | DSLAM       |
      | SPLITTER    |
      
       @TC117326 @TC161953 @TC161957 @TC131088_refact @DeviceRefact
  Scenario Outline: To Validate user is able to see Value in Network Identifier field after "<Devicetype>" Ethernet Device is created
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    Then I verify "Device CLLI is editable field in Device details page"
    Then I verify "SNMP VERSION value is V1 or V2C, SNMP Port default value = 161 in Device details page"
    Then I verify "RO Community String Value  field in Device details page"
     And I Click on "Networking Details" tab on Device Search page
    Then I validate the value displayed under Network Identifier field
    

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata     |
      #		|CLIENT			|Cisco ASR 9000 Series						|Cisco ASR 9000V							|TC212395-CLIENT	|
      #		|DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|
      #		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|TC212391-HOST		|
      #		|MSAP				|Calix C Series										|Calix C7											|TC212392-MSAP		|
      #		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
      #		|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|
      | OLT        | Calix E7   | Calix E7-2    | TC174920-OLT |

  #		|BRAS				|Generic Device										|Generic Device								|TC174925-BRAS		|
  #		|AGG				|Calix E7													|Calix E7-20									|TC174923-AGG			|
    
    @TC165295_refact @DeviceRefact
  Scenario: @TC165295-NIC_Ethernet_Reg_Verify that the user is able to update the networking details of a Ethernet device
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
    And I clicked the "Network Tab-Edit" button in Device Detail Page
    And I fill all the mandatory fields  in Network edit form with "TC165295"
    And I clicked the "Network Tab-Save" button in Device Detail Page
    And I validate the message displayed in Network Detail Page
    And I verify "Updated Network details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action log is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Update Device" Action
    
     @TC189827_refact @DeviceRefact
  Scenario Outline: @TC189827 -NIC_GPON_Reg_Validate delete button in OLT and ONT Devices after user changes the device role to Ethernet from GPON
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I click on "Create" button in Device Create Screen
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Edit" button in Device Detail Page
    And I "changed the role from GPON to Ethernet in device page"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    Then I validate "Delete button" attributes in Search page for "Device"

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata    |
      #|ONT				|Calix 700GE Series ONT				|Calix 720GE						|TC174922-ONT			|
      | OLT        | Calix E7   | Calix E7-2    | TC55671-OLT |

  @TC291303_refact @DeviceRefact
  Scenario Outline: @TC291303 -NIC_GPON_Reg_Verify the create functionality of GFAST DSLAM
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I click on "Create" button in Device Create Screen
    And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Create Device" Action

    Examples: 
      | Devicerole | Devicetype                   | Devicesubtype                | Testdata       |
      #| DSLAM      | Adtran 500 G.fast DPU Series | Adtran 516G DPU AP AC 710 TP | TC174924-DSLAM |
       | DSLAM      | Calix C Series | Calix C7      | TC174924-DSLAM |
  @TC86607 @DeviceRefact
  Scenario: @TC86607 -NIC_GPON_Reg_Validate Update functionality of GPON Device role ONT
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC174922-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    And I fill all the mandatory fields  in Device edit form with "TC55671"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action log is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Update Device" Action
    
      #@TC287873_refact 
  #Scenario: @TC287873 NIC_Ethernet_Reg_Verify google style search for a device
    #Given I am in omnivue url
    #When I log in as a "Admin" user
    #And User should be navigated to "Activations" Page
    #Then I verify SOLR Suggestions for "Device" google search
    
      @TC287874_refact @DeviceRefact
  Scenario Outline: NIC_Ethernet_Reg_Ethernet Device_Validate user is able to create device with Vectoring Type as XXX Internal
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
      | Devicerole | Devicetype | Devicesubtype | Testdata        | Vectroring_Type | Allowed_Devices | Vectroring_Type Allowed   |
      #| NID        | Adtran Total Access 5000          | ADTRAN Total Access 5000 23 Inch Chassis | Ethernet_Device | 384 Internal    | TD,DSLAM,MSAP,NID | 384 Internal,192 Internal |
      # | TD         | Calix E3-48 Series                | Calix E3-48 r2                           | Ethernet_Device | 192 Internal    | TD, DSLAM, AGG    | 192 Internal              |
      # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 Internal    | TD,DSLAM,AGG      | 192 Internal/384 Internal |
      # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 192 Internal    | DSLAM,MSAP        | 192 Internal              |
      #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 192 Internal    | TD,DSLAM,MSAP     | 192 Internal              |
      #| OLT        | Adtran Total Access 5000	         | ADTRAN Total Access 5000 23 Inch Chassis | GPON_OLT_Device | 384 Internal    | OLT               | 384 Internal              |
      | OLT        | Calix E7   | Calix E7-2    | GPON_OLT_Device | 192 Internal    | OLT             | 384 Internal,192 Internal |

  #| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 192 Internal	  | OLT               |	192 Internal	            |

 
   @TC287875_refact @DeviceRefact
  Scenario Outline: @TC287875- NIC_Ethernet_Reg_Ethernet Device_Validate user is able to create device with Vectoring Type as XXX External by associating existing Vectoring topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "EXISTING TOPOLOGY" Vectoring Topology
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
    And I verify "External Vectoring  details and validate database"

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata        | Vectroring_Type | Allowed_Devices | Vectroring_Type Allowed |
      # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
      | OLT        | Calix E7   | Calix E7-2    | GPON_OLT_Device | 384 External    | OLT             | 384 External            |

  # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
  #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
  #| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 384 External 
 
 
   @TC287876_refact @DeviceRefact
  Scenario Outline: TC287876-NIC_Ethernet_Reg_GPON Device_Validate user is able to create device with Vectoring Type as XXX External by associating new Vectoring topology
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
      | Devicerole | Devicetype | Devicesubtype | Testdata        | Vectroring_Type | Allowed_Devices | Vectroring_Type Allowed |
      # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
      | OLT        | Calix E7   | Calix E7-2    | GPON_OLT_Device | 384 External    | OLT             | 384 External            |

  # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
  #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
  #| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 384 External   	| OLT               |	192 Internal/384 External 	          	|
  	
 
 
 @TC287877_refact @DeviceRefact
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
 
 
 
  	  @TC287878_refact @DeviceRefact
  Scenario Outline: @TC287878- NIC_Ethernet_Reg_Edit Device Details by updating Vectoring type as Internal
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
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "" Vectoring Topology in Device details tab
    And I clicked the "Network Tab-Save" button in Device Detail Page
    # And I Click on "Networking Details" tab on Device Search page
    And I verify "Internal Vectoring  details and validate database"

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata        | Vectroring_Type | Allowed_Devices | Vectroring_Type Allowed   |
      # | NID        | Adtran Total Access 5000          | ADTRAN Total Access 5000 23 Inch Chassis | Ethernet_Device | 384 Internal    | TD,DSLAM,MSAP,NID | 384 Internal              |
      # | TD         | Calix E3-48 Series                | Calix E3-48 r2                           | Ethernet_Device | 192 Internal    | TD, DSLAM, AGG    | 192 Internal              |
      # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 Internal    | TD,DSLAM,AGG      | 192 Internal/384 Internal |
      # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 192 Internal    | DSLAM,MSAP        | 192 Internal              |
      #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 192 Internal    | TD,DSLAM,MSAP     | 192 Internal              |
      #  | OLT        | Adtran Total Access 5000	         | ADTRAN Total Access 5000 23 Inch Chassis | GPON_OLT_Device | 384 Internal    | OLT               | 384 Internal              |
      | OLT        | Calix E7   | Calix E7-2    | GPON_OLT_Device | 192 Internal    | OLT             | 384 Internal,192 Internal |

  #| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 192 Internal	  | OLT               |	192 Internal	            |
  @TC287879_refact @DeviceRefact
  Scenario Outline: @TC287879- NIC_Ethernet_Reg_Edit Device Details by updating Vectoring type as External and associating New Vectoring topology
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
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "Create Vectoring Topology" Vectoring Topology in Device details tab
    And I clicked the "Network Tab-Save" button in Device Detail Page
    #And I Click on "Networking Details" tab on Device Search page
    And I verify "External Vectoring  details and validate database"

    Examples: 
      | Devicerole | Devicetype | Devicesubtype | Testdata        | Vectroring_Type | Allowed_Devices | Vectroring_Type Allowed |
      #| AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
      | OLT        | Calix E7   | Calix E7-2    | GPON_OLT_Device | 384 External    | OLT             | 384 External            |

  #| MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
  #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
  #| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                | GPON_OLT_Device | 384 External   	| OLT               |	192 Internal	          	|
  
 
 @TC23917_refact @DeviceRefact
  Scenario: @TC23917 -OV-Validate the child Port Status on the Device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role
    And I fill all the mandatory fields with "TC174934-NPE" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "select the card details and Click on Add Card"
    And I clicked the "Device port Expand" button in Device Detail Page
    And I "add the child card to the added card in device port"
    Then I verify "child card ports are getting consumed while creating circuit"
    
     @TC39202_refact @DeviceRefact
  Scenario: @TC39202 - NIC_Ethernet_Reg_Verify the functionality of Add Card to a device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role
    And I fill all the mandatory fields with "TC174934-NPE" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "select the card details from Bulk card and Click on Add Card"
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "select the card details from Cards By slot and Click on Add Card"
    Then I verify "OMNIVue Audit logs in both OV and Database"
    
   ################################################################################################################################################################################
       
   ################################################################################################################################################################################
    
    
    
      @TC55537 @DeviceRefact
  Scenario: @TC55537 -Verify the create functionality of GPON device type ONT with Infrastructure Build or Service Provisioning value selected as Service Provisioning
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I "select a MST device in the Fiber Distribution Node"
    And I click on "Create" button in Device Create Screen
 
 