@Search_Inventory1
Feature: Inventory - Device Validation
# @PI8 @Sprint220 @F10066 @US92208 @TC106886 @TC106887 @TC109869 @US91622 @TC125803 @TC125806 @TC125807
  Scenario Outline: OV-Verify the Delete button for Devices.
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
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | FDP         |
      | MST         |
      | NID         |
      | NPE         |
      | ONT         |
      | SPLITTER    |
      | TD          |
      | AGG         |
      | BRIX        |
      | CLIENT      |
      | FDH         |
      | HOST        |
      | MSAP        |

  @TC125676
  Scenario: @TC125676 -OV-Verify the Delete button for Devices.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "ONT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    Then I verify "Installation Date and Opti Tap field on Device Details screen for ONT Devices"
    When I clicked the "Edit" button in Device Detail Page
    Then I verify "Installation Date and Opti Tap field on Edit Device Details screen for ONT Devices"

  ######################### #######################  US68557-- CR4701 GPON OLT Edit screen issues ####################### ##########################
  @PI7 @Sprint214 @F2285 @US68557 @TC75816 @TC86601
  Scenario: OV-Validate Max Subscriber Bandwidth field is mandatory and editable for OLT device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I validate "Max Subscriber Bandwidth" attributes in Edit form for "OLT Device"
    And I fill the Max subscriber bandwidth in Device detail page
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  ###############################  US91622-- [Continued] CR4701-OV Enhances Create Device Screen based on Passive technology type ####################### ##########################
  @PI7 @Sprint210 @F2262 @US43123 @TC24975 @TC86594
  Scenario Outline: OV-Validating Search Device Screen based on Passive technology type
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "<Passive Device types>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And Validate attributes in "PASSIVE" Search page
    Then Validate the device name in search page

    Examples: 
      | Passive Device types |
      | MST                  |
      | FDP                  |
      | SPLITTER             |

  ##########################################################################################################################################################################################
  @TC122168 @TC195099
  Scenario: @TC122168 -Validation of 360 view on Advanced search with Device name for CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Devices" tab
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Circuits" tab
    Then I verify "Circuit details should be displayed in the Device Screen"

  @TC122165 @TC122158
  Scenario Outline: @TC122165 -Verify data displayed in the related tabs for Contacts - "<Device role>" devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    When In the 360 view I click on the "Contacts" tab
    Then I verify "Contact data is displayed in the Device Screen"

    Examples: 
      | Device role |
      | OLT         |

  # |BRAS					|
  # |DSLAM				|
  #	|FDP					|
  #	|MST					|
  #|NID					|
  #	|NPE					|
  #|ONT					|
  #|SPLITTER			|
  #|TD						|
  #|AGG					|
  #|BRIX					|
  #|CLIENT				|
  #|FDH					|
  #|HOST					|
  #|MSAP					|
  @TC125792
  Scenario Outline: @TC125792 -Validation of platform ID on device search page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Network Identifiers field should be displayed in Device details screen"
    Then I verify "Platform ID field should be displayed in the device screen"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | FDP         |
      | MST         |
      | NID         |
      | NPE         |
      | ONT         |
      | SPLITTER    |
      | TD          |
      | AGG         |
      | BRIX        |
      | CLIENT      |
      | FDH         |
      | HOST        |
      | MSAP        |

  @TC125750
  Scenario: @TC125750 -To verify ICL thrown records in device location lookup through create
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "DSLAM" in Device advance search
    And I click on Advance search button for "Device"
    Then I verify "Device serach result should display only 20 records from ICL in OV Screen"

  @TC122163
  Scenario: @TC122163- Verify data displayed in the related tabs for Subscriber Ethernet devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search for "Network Orders" type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Subscribers" tab
    Then I should see the "Impacted Subscribers table is displayed in Device screen" been displayed

  @TC264082
  Scenario: @TC264082- Verify data displayed in the related tabs for Subscriber GPON devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "IPTV"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Subscribers" tab
    Then I should see the "Impacted Subscribers table is displayed in Device screen" been displayed

  @TC122162
  Scenario: @TC122162- Verify data displayed in the related tabs for Orders - Ethernet devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search for "Network Orders" type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Orders" tab
    Then I should see the "Order table in Device screen" been displayed

  @TC264081
  Scenario: @TC264081- Verify data displayed in the related tabs for Orders  - GPON device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "IPTV"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Orders" tab
    Then I should see the "Order table in Device screen" been displayed

  @TC122169
  Scenario: @TC122169 -Verify data displayed in the related tabs for Services - GPON devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "IPTV"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Services" tab
    Then I should see the "Services table in Device screen" been displayed

  @TC55669
  Scenario: @TC55669 -Verify data displayed in the related tabs for Services - Ethernet devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "ENNI Link Service" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Services" tab
    Then I should see the "Services table in Device screen" been displayed

  @TC122160 @GETENF-5093
  Scenario: @TC122160- Verify data displayed in the related tabs Tasks - Ethernet devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search for "Network Orders" type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Tasks" tab
    Then I should see the "Task related to Order should" been displayed

  @TC264080
  Scenario: @TC264080- Verify data displayed in the related tabs Tasks - GPON device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "IPTV"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And In the 360 view I click on the "Tasks" tab
    Then I should see the "Task related to Order should" been displayed

  @TC122159
  Scenario Outline: @TC122159 -Verify data displayed in the related tabs Locations - Ethernet devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    When In the 360 view I click on the "Locations" tab
    #And I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab
    Then I verify "Location data is displayed"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | NID         |
      | NPE         |
      | TD          |
      | AGG         |
      | BRIX        |
      | CLIENT      |
      | FDH         |
      | HOST        |
      | MSAP        |

  @TC39246 @TC167060
  Scenario: @TC39246 -Verify 360 view of Device Details for Related Tab Activations
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service" as Inventory type
    And I select Service Type values as "DSL OVC" under Service Search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I "check the Auto-Activate & click on Activate Button in Service screen"
    And I verify "Activation process initiated successfully. message should be displayed in the Service page"
    And I click on "Save" button on Service page
     
   

  @TC167061
  Scenario: @TC167061 -Verify 360 view of Device Details for Related Tab Activations
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Service" as Inventory type
    And I select Service Type values as "DSL OVC" under Service Search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    And I click on "Edit" button on Service page
    And I "check the Auto-Activate & click on Activate Button in Service screen"
    And I verify "Activation process initiated successfully. message should be displayed in the Service page"
    And I click on "Save" button on Service page
    
  ################################# US91626--Provide Delete button on Device Details 360 View ####################################################
  #################################  F10066-CR4701 GPON Delete Device  ###########################################################################
  @PI8 @Sprint220 @F10066 @TC103150 @TC125497
  Scenario Outline: @TC125497- OV-Validate Delete button should be displayed in 360 view on GPON only devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I select Device Type as "<Device Type>"
    And I click on search button for "Device"
    And I click on view icon in Search Result page
    Then I validate "Delete button" attributes in Search page for "Device"

    Examples: 
      | Device Type           |
      | Calix 700F Series ONT |

  @PI8 @Sprint220 @F10066 @TC125499
  Scenario Outline: @TC125499-  OV-Validate Delete button should not be displayed in 360 view on Ethernet devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I select Device Type as "<Device Type>"
    And I click on search button for "Device"
    And I click on view icon in Search Result page
    Then I validate "Delete button" attributes in Search page for "Device"

    Examples: 
      | Device Type    |
      | Calix C Series |

  @PI8 @Sprint220 @F10066 @TC125498
  Scenario Outline: @TC125498-  OV-Validate Delete button should be displayed in 360 view on Passive only devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I select Device Type as "<Device Type>"
    And I click on search button for "Device"
    And I click on view icon in Search Result page
    Then I validate "Delete button" attributes in Search page for "Device"

    Examples: 
      | Device Type    |
      | Fiber Splitter |
      | Corning MST    |
      | Corning FDH    |

  ################################  US92208- Only allow on GPON or Passive Device Role  ############################################# ##########################
  ###############################  US91622-- Delete Button Available for Device with GPON Role only ####################### ##########################
  

  @PI8 @Sprint220 @F10066 @TC187980
  Scenario Outline: @TC187980- Validation of 360 view on Advanced search for Device
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
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | FDP         |
      | MST         |
      | NID         |
      | NPE         |
      | ONT         |
      | SPLITTER    |
      | TD          |
      | AGG         |
      | BRIX        |
      | CLIENT      |
      | FDH         |
      | HOST        |
      | MSAP        |

  @P11 @Sprint237 @US116154 @TC189906
  Scenario Outline: @TC189906- CR6350 - US162982 - TC001 - Verify user is able to retrieve OMNIVUE  Audit Logs from Archive table for  Device
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
      | DSLAM       |
      | FDP         |
      | MST         |
      | NID         |
      | NPE         |
      | ONT         |
      | SPLITTER    |
      | TD          |
      | AGG         |
      | BRIX        |
      | CLIENT      |
      | FDH         |
      | HOST        |
      | MSAP        |

  @TC220933
  Scenario Outline: Validate the Device - IP information Tool Tip
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "<Device role>" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    Then I validate "Device - IP information Tool Tip" attributes in Search page for "Device"

    Examples: 
      | Device role |
      | OLT         |
      | BRAS        |
      | DSLAM       |
      | FDP         |
      | MST         |
      | NID         |
      | NPE         |
      | ONT         |
      | SPLITTER    |
      | TD          |
      | AGG         |
      | BRIX        |
      | CLIENT      |
      | FDH         |
      | HOST        |
      | MSAP        |

  #@US153099 @TC195093 @TC195099
  #   Scenario: Validation of circuit tab on Device details page
  #  Given I am logged in as a "Admin" user in Omnivue
  #  When I Click on "Search" tab in Omnivue Activation Screen
  #		And I select "Orders" in Search slider
  #	And I select "GPON" as Product-type in Order’s Search slider
  #		And I clicked on Advance Search for "Orders"
  #		And I Search order with "<Service Type>"-Service type in Advance search screen
  #		And I click on Advance search button for "Orders"
  #		And I click on magnifying glass for the selected Order number
  #		And A new tab Order Id:nnnnnn will open with an Order details sub tab
  #		And I click on the hyperlink in the "<Service Type>" section Service ID field
  #		Then A new tab nnnnnnnnnn-"<Service Type>" will open
  #		When I click on Circuit tab
  #		Then Circuit associated to that particular service should be displayed.
  @TC170078
  Scenario: @TC170078-  OV Verify the ONT device name is updating as OLD device name to the NEW device name when user swap ONT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "ONT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I "changed the Device Type & Subtype on the ONT Device"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC125525
  Scenario: @TC125525- OV-Validate Delete button functionality on GPON only device linked to Services
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Orders" in Search slider
    And I select "GPON" as Product-type in Order’s Search slider
    And I clicked on Advance Search for "Orders"
    And I Search order with "IPTV"-Service type in Advance search screen
    And I click on Advance search button for "Orders"
    And I click on magnifying glass for the selected Order number
    And A new tab Order Id:nnnnnn will open with an Order details sub tab
    And In the 360 view I click on the "Devices" tab
    And I "select Devices displayed in the Orders screen"
    And I Click on Device Name link in Identifiers Section
    And I clicked the "Delete-action" button in Device Detail Page
    Then I verify "a warning message should be displayed stating device is used by GPON Workers in Device Screen"

  @TC86609_old
  Scenario: @TC86609_old-  OV Verify the ONT device name is updating as OLD device name to the NEW device name when user swap ONT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "ONT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    Then I "changed the Device Type & Subtype on the ONT Device"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @PI7 @Sprint214 @F2285 @US68557 @TC75816
  Scenario: OV-Validate Max Subscriber Bandwidth field is mandatory and editable for OLT device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    And I fill all the mandatory fields  in Device edit form with "TC55671"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action log is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Update Device" Action

  @TC86609_old @GETENF-5099
  Scenario: @TC86609_old NIC_Ethernet_Reg_Verify that the user is able to update the device details of a Ethernet device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Device Search"
    And I select the device role as "OLT" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in Device Detail Page
    And I fill all the mandatory fields  in Device edit form with "TC55671"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action log is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Update Device" Action

  

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


  ################################################################################
 

  @TC119042_old
  Scenario Outline: OV- Validating atributes of Create Device Screen for "<Devicerole>" role
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    When I clicked the "Edit" button in Device Detail Page
    And I "change the provision status in Device details page"
    Then I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action type is registered under the Audit logs section in Device page"

    Examples: 
      | Devicerole | Devicetype             | Devicesubtype | Testdata     |
      | ONT        | Calix 700GE Series ONT | Calix 720GE   | TC174922-ONT |



  #Then I verify "
  @TC167051 @TC165293
  Scenario: @TC167051 -Verify Migration lookup widget for finding a wire center CLLI is not displayed in device create screen
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    Then I verify "wire center clli field is not displayed in the device create screen"

  @TC86228
  Scenario: @TC86228 -Validate changed mandatory attributes of ONT device from Inventory
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Power	Supply attribute is not mandatory field in Device edit screen for ONT role"

  @TC125698 @TC126045 @TC126053_old
  Scenario: @TC125698 -OV validating Device CLLI Lookup for Device Edit page
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Device Clli is an editable field in Device edit screen for GPON"
    Then I verify "Device CLLI attribute is in Device edit screen for GPON"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC126047
  Scenario: @TC126047 -OV test:Validation of Editable Feild  device CLLI  on Passive devices for User with Update rights.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "FDP" with Device Type as "Fiber Distribution Panel" with Sub-Type as "Generic FDP 12:12"
    And I select the Technology type based on "FDP" Device role
    And I fill all the mandatory fields with "TC174929-FDP" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Device Clli is an editable field in Device edit screen for Passive"
    #Then I verify "Device CLLI attribute is in Device edit screen for Passive"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC126048
  Scenario: @TC86610 -Validating Edit Device Details screen based on Ethernet only for subscriber name
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Device Clli is not editable field in Device edit screen for Ethernet"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC125739
  Scenario: @TC125739 -To verify location details updated after successful look up on device location name
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    And I "change the location details in device edit screen"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC109031 @TC126054
  Scenario: @TC109031 -Validation of solar ARM indexing while editing device CLLI on GPON devices for User with Update rights.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "solar ARM indexing on location field in device edit screen"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC109038
  Scenario: @TC109038 -Validating Edit Device Details screen based on Passive technology for Subscriber Name
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "FDP" with Device Type as "Fiber Distribution Panel" with Sub-Type as "Generic FDP 12:12"
    And I select the Technology type based on "FDP" Device role
    And I fill all the mandatory fields with "TC174929-FDP" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "solar ARM indexing on location field in device edit screen"

  @TC86607_old
  Scenario: @TC86607_old -Validating Edit Device Details screen based on GPON technology with ONT role for subscriber name
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Subscriber attribute is not mandatory field in Device edit screen for GPON"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC86609_old @Refact
  Scenario: @TC86609_old -Validating Edit Device Details screen based on Passive technology for Subscriber Name
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "FDP" with Device Type as "Fiber Distribution Panel" with Sub-Type as "Generic FDP 12:12"
    And I select the Technology type based on "FDP" Device role
    And I fill all the mandatory fields with "TC174929-FDP" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Subscriber attribute is not mandatory field in Device edit screen for Passive"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC125675
  Scenario: @TC125675 -Validating MCO field on Edit Device Details screen for ONT Devices
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "MCO field on Edit Device Details screen for ONT Devices"

  @TC86610
  Scenario: @TC86610 -Validating Edit Device Details screen based on Ethernet only for subscriber name
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    Then I verify "Subscriber attribute is mandatory field in Device edit screen for Ethernet"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page

  @TC39202
  Scenario: @TC39202 -Verify the functionality of Add Cards Button using Cards by slot
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "Add the card details and Click on Add Card"
    Then I verify "Card Details Saved Successfully. message should be displayed in Device Details page"

  @TC23878
  Scenario: @TC23878 -Validate the Port Status on the New Device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Device Ports" tab
    And I clicked the "Device port Expand" button in Device Detail Page
    And I clicked the "Add Card" button in Device Detail Page
    And I "Add the card details and Click on Add Card"
    And I verify "Card Details Saved Successfully. message should be displayed in Device Details page"
    And I clicked the "Device port Expand" button in Device Detail Page
    Then I verify "Port Status on the New Device"

  @TC95930
  Scenario: @TC95930 -Validate Affiliate Owner field is not mandatory for Create GPON Device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    Then I verify "Affiliate Owner field is not mandatory for GPON Device"

  
  @TC55671_old
  Scenario: @TC55671_old -Verify entry is made in audit log tab when user updates device information
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC55671-OLT" data
    And I click on "Create" button in Device Create Screen
    And I clicked the "Edit" button in Device Detail Page
    And I "update the Qualification Information section in Device screen"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action type is registered under the Audit logs section in Device page"

  ######################## US94587--CR4701 GPON Edit Device CLLI logic ########################
  @TC174930 @TC212395 @US144722 @TC181465 @TC181488 @TC86604 @US94587 @TC107071 @TC107507 @TC174920 @TC174922 @TC212392 @TC174923 @TC174924 @TC174925 @TC174926 @TC174928 @TC174929 @TC174932 @TC174934 @TC55534 @TC55512 @TC119043 @TC119042_old
  Scenario Outline: OV- Validating atributes of Create Device Screen for "<Devicerole>" role
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    When I clicked the "Edit" button in Device Detail Page
    Then I verify "Device CLLI is editable field in Device details page"
    And I "change the provision status in Device details page"
    Then I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action type is registered under the Audit logs section in Device page"

    Examples: 
      | Devicerole | Devicetype                       | Devicesubtype   | Testdata        |
      | MST        | Fiber Multiport Service Terminal | Generic MST 2:2 | TC174930-MST    |
      | CLIENT     | Cisco ASR 9000 Series            | Cisco ASR 9000V | TC212395-CLIENT |

  #		|DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|
  #		|FDH				|Corning FDH											|Corning 144 Port Distribution|TC174928-FDH			|
  #		|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|
  #		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|TC212391-HOST		|
  #		|MSAP				|Calix C Series										|Calix C7											|TC212392-MSAP		|
  #		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
  #		|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|
  #		|OLT				|Calix E7													|Calix E7-2										|TC174920-OLT			|
  #		|ONT				|Calix 700GE Series ONT						|Calix 720GE									|TC174922-ONT			|
  #		|SPLITTER		|Fiber Splitter										|Generic Splitter 1:16				|TC174922-SPLITTER|
  #		|BRAS				|Generic Device										|Generic Device								|TC174925-BRAS		|
  #		|MDU				|Calix MDU												|Calix 761 MDU								|TC174926-MDU			|
  #		|AGG				|Calix E7													|Calix E7-20									|TC174923-AGG			|
  #|BRIX				|Brix Verifier										|BV-110 Verifier AC						|TC55512-BRIX			|
  #|TD					|Calix C Series										|Calix C7											|TC119043-TD			|
  ################################# US51414-CR4701 GPON Location CLLI is optional for device technology=GPON or Passive #################################
  @PI6 @Sprint209 @F2262 @US51414 @TC37479
  Scenario: @TC37479 -OV-Validate Location CLLI is optional on Inventory Device Create for GPON Technology
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

  @PI6 @Sprint209 @F2262 @US51414 @TC37705 @TC86323
  Scenario: @TC86323 -OV-Validate Location CLLI attribute is mandatory on Inventory Device Create for Ethernet Technology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "ETHERNET" technology and device type
    And Select the technology as "ETHERNET" with Device Type as "Calix C Series" with Sub-Type as "Calix C7"
    And Validate "ETHERNET" radio button in device create page
    And Validate Location CLLI
    And Select subscriber & Equipment role with "US51414-TC37705" data
    Then I fill the mandatory fields with "US51414-TC37705" data

  #################################  US43123--[Continued] CR4701-OV Enhances Create Device Screen based on Passive technology type #################
  @PI7 @Sprint210 @F2262 @US43123 @TC24409 @TC86560 @TC44388
  Scenario Outline: OV- Validating atributes of Create Device Screen on Passive Devices.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "PASSIVE" technology and device type
    And Select the technology as "PASSIVE" with Device Type as "<Device>" with Sub-Type as "<Subtype>"
    #And Select Device Type as <Device> with Sub-Type as <Subtype>
    Then Fill all the mandatory fields with <Data> data

    Examples: 
      | Device                 | Subtype         | Data              |
      | Fiber Distribution Hub | Generic FDH 144 | US43123-TC24409-1 |

  #| Fiber Distribution Panel         | Generic FDP 12:12     |US43123-TC24409-2	|
  #| Fiber Multiport Service Terminal | Generic MST 24:24     |US43123-TC24409-3	|
  #| Fiber Splitter                   | Generic Splitter 1:32 |US43123-TC24409-4	|
  ################################# US91627--When Delete is Initiated, Call ARM API to delete #############################################
  #################################  F10066-CR4701 GPON Delete Device  ####################################################################
  @PI8 @Sprint220 @F10066 @US91627 @TC103271 @TC125494 @TC55532 @TC125730 @TC100415 @TC103517 @TC125874 @TC98292 @TC125595 @TC125638
  Scenario Outline: OV-Validate Delete button functionality on "<Device Type Check>" devices
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I create "<Device Type Check>" device through Inventory
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the message displayed on triggerring Delete functionality
    Then I need to validate the Device deleted from Inventory

    Examples: 
      | Device Type Check |
      | GPON-OLT          |
      | Passive-MST       |

  @PI7 @Sprint210 @F2262 @US43123 @TC25113 @TC86596 @TC86599
  Scenario: OV- Validating radio buttons & Attributes in Create Device Screen on Passive Devices.
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "MST" with Device Type as "Fiber Multiport Service Terminal" with Sub-Type as "Generic MST 2:2"
    And I validated "PASSIVE" radio button and "All" radio button
    And I fill the mandatory fields with "US43123-TC25113" data
    Then Validate attributes in "PASSIVE" device details page

  #####################################################################################################################
  ########										Device Creation Based on the Role									#######################################
  #####################################################################################################################
  ################################# US66646: CR4701-GPON-OSIP-ONT DEVICE-Opti Tap & Installation date fields are not retaining the data after save #############################################
  @PI8 @Sprint220 @F1066 @US99866 @TC125676
  Scenario: OV-Validating "Installation Date" and "Opti Tap"field on Edit Device Details screen for ONT Devices in Inventory/GDB
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC174922-ONT" data
    Then I click on "Create" button in Device Create Screen
    When I clicked the "Edit" button in Device Detail Page
    And I changed the "Installation date & Opti tap field in Device screen"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "Installation date & Opti tap field is updated in Device screen"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the message displayed on triggerring Delete functionality

  ############################################################# ############################################################# ########################
  @DevBrix
  Scenario: @DevBrix -Verify the create functionality of Ethernet device type BRIX with Activation Check box selected
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "BRIX" with Device Type as "Brix Verifier" with Sub-Type as "BV-110 Verifier AC"
    And I select the Technology type based on "BRIX" Device role
    And I fill all the mandatory fields with "TC55512-BRIX" data
    And I "select Create Activation Task in Device Create Screen"
    And I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Tasks" tab
    Then I verify "a manual task gets added on selecting activation task in the device screen"

  ###########################################  US115746 --  OV-Getting a warning message to a non-mandatory field for GPON & passive device create  #######################
  @US115746 @TC129974 @TC248354
  Scenario: OV Test: Verify the warning message on location Cilli field while creating Passive device
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "PASSIVE" technology and device type
    And Select the technology as "PASSIVE" with Device Type as "Fiber Distribution Hub" with Sub-Type as "Generic FDH 144"
    And Validate "PASSIVE" radio button in device create page
    And Validate Location CLLI
    Then I fill the mandatory fields with "US51414-TC37684" data

  @US115746 @TC129973 @TC154441
  Scenario: OV-Validate Location CLLI is optional on Inventory Device Create for GPON Technology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "GPON" technology and device type
    And Select the technology as "GPON" with Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    And Validate "GPON" radio button in device create page
    And Validate Location CLLI
    Then I fill the mandatory fields with "US51414-TC37479" data

  @P12 @Sprint243 @DE39481 @TC223190
  Scenario Outline: Validate Delete button by changing the Device role on Ethernet device
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
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

  #		|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|
  #		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|TC212391-HOST		|
  #		|MSAP				|Calix C Series										|Calix C7											|TC212392-MSAP		|
  #		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
  #		|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|
  #		|OLT				|Calix E7													|Calix E7-2										|TC174920-OLT			|
  #		|BRAS				|Generic Device										|Generic Device								|TC174925-BRAS		|
  #		|AGG				|Calix E7													|Calix E7-20									|TC174923-AGG			|
  #
  @P12 @Sprint244 @TC225455
  Scenario Outline: Validating Is Diverse field on device details page
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
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

  #|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|
  #|MST				|Fiber Multiport Service Terminal	|Generic MST 2:2							|TC174930-MST			|
  @TC55484_2
  Scenario Outline: @TC55484_2 -Verify the create functionality of Ethernet device type DSLAM with Manual Activation check-box selected
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "DSLAM" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I "select Create Activation Task in Device Create Screen"
    And I click on "Create" button in Device Create Screen
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Create action type is registered under the Audit logs section in Device page"
    And I validate Audit logs details in database for "Create Device" Action
    And In the 360 view I click on the "Tasks" tab
    Then I verify "a manual task gets added on selecting activation task in the device screen"
    And I Validate the manual task details in database

    Examples: 
      | Devicerole | Devicetype     | Devicesubtype | Testdata       |
      | DSLAM      | Calix C Series | Calix C7      | TC174924-DSLAM |

 
  @TC125496 @TC125496 @GETENF-5064
  Scenario Outline: @TC125496- OV-Validate Delete button functionality on Passive only devices
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Delete" button in Device Detail Page
    And I validate the message displayed on triggerring Delete functionality
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab
    Then I verify "Update action type is registered under the Audit logs section in Device page"

    Examples: 
      | Devicerole | Devicetype               | Devicesubtype         | Testdata          |
      | SPLITTER   | Fiber Splitter           | Generic Splitter 1:16 | TC174922-SPLITTER |
      | FDP        | Fiber Distribution Panel | Generic FDP 12:12     | TC174929-FDP      |

  ################################# US99866--When Delete is Initiated, Call ARM API to delete with associations #############################################
  @TC264085
  Scenario: @TC264085 -OV-Validate Delete button functionality on Passive device linked to link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I "create a Link using FDP and SPLITTER devices"
    And I "try seraching for link created in Serach slider"
    And I "click on the Device hyperlink displayed in the Link View Screen"
    And I clicked the "Delete-action" button in Device Detail Page
    Then I verify "a warning message should be displayed stating device is being used in Device Screen"
    And I click on "Delete" button in Link screen

  @TC125528
  Scenario: @TC125528 -OV-Validate Delete button functionality on GPON device linked to link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I "create a Link using SPLITTER and FDP devices"
    And I "try seraching for link created in Serach slider"
    And I "click on the Device hyperlink displayed in the Link View Screen"
    And I clicked the "Delete-action" button in Device Detail Page
    Then I verify "a warning message should be displayed stating device is being used in Device Screen"
    And I click on "Delete" button in Link screen

  @TC264084
  Scenario: @TC264084 -OV-Validate Delete button functionality on GPON only device linked to Circuit
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Ethernet Bearer" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I "create a circuit filling all the mandatory fields using SPLITTER and FDP devices"
    And I "click on the Device hyperlink displayed in the Circuit Screen"
    And I clicked the "Delete-action" button in Device Detail Page
    Then I verify "a warning message should be displayed stating device is being used in Device Screen"
    And I click on "Delete" in Circuit page

  @TC264083
  Scenario: @TC264083- OV-Validate Delete button functionality on Passive only device linked to Circuit
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Ethernet Bearer" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I "create a circuit filling all the mandatory fields using FDP and SPLITTER devices"
    And I "click on the Device hyperlink displayed in the Circuit Screen"
    And I clicked the "Delete-action" button in Device Detail Page
    Then I verify "a warning message should be displayed stating device is being used in Device Screen"
    And I click on "Delete" in Circuit page

  @TC181271
  Scenario: @TC181271 -To Validate whether user is able Override 911 value for Network Identifiers of the Existing Device which has  Network Identifier mapping
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I should see the "Device Search screen attributes" been displayed
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Network Identifiers field should be displayed in Device details screen"
    And I clicked the "Edit-Network details" button in Device Detail Page
    And I "update the Network Identifiers in Device details screen"
    And I clicked the "Network Tab-Save" button in Device Detail Page
    Then I verify "Network Identifiers field should be updated with new value in Device details screen"

  ############################################################# ############################################################# ########################
  @TC189903_old
  Scenario: @TC189903_old -Validate delete icon in ONT Device details Page after user adds an Ethernet role to the existing GPON role
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role
    And I fill all the mandatory fields with "TC55537-ONT" data
    And I click on "Create" button in Device Create Screen
    Then I validate "Delete button" attributes in Search page for "Device"
    And I clicked the "Edit" button in Device Detail Page
    And I "changed the role from GPON to Ethernet in device page"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    Then I validate "Delete button" attributes in Search page for "Device"

  #####################################################################################################
 

  ##########################################################################
  

  ####
  @TCVectoringdb
  Scenario: @TCVectoringdb -validate vectoring info in db
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I verify "Internal" vectoring type details in database

 

  ######################################################Vectoring TC's################################################################################

