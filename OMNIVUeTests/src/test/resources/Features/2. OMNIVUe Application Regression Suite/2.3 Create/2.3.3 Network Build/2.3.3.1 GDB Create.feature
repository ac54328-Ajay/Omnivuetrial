@Create_NetworkBuild @Create_NetworkBuild_GDB @Regression
Feature: Create - Network Build - GPON Device Build Validation
  
  Test cases related to GPON Device Build
  
  @TC173766 @ref @PilotTesting
  Scenario: @TC173766 - NIC_GPON_Reg_Verify user is able to associate multiple service address to an Existing Service Area in GDB screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate multiple address in GDB Service area"
    Then I verify "Audit logs for the GDB Service area Creation & Association actions"
    
   @TC174125 @ref @PilotTesting
  Scenario: @TC174125- OV test: Validation of associating duplicate addresses to service area in GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    #Then I "Associate multiple address in GDB Service area"
    And I "Associate 1 address in GDB Service area"
    Then I verify "On associating the same address in GDB Service area are we seeing Duplicate address(es) present in selection, duplicate address(es) will not be added to service area. message getting displayed"
  
  
 @TC157450 
 Scenario: @TC157450 NIC_GPON_Reg_Validate the restriction around roles in GDB
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I "select all ports from Device A and Device Z in GDB fiber link screen"
    Then I "Validate cable id & StartStrand ID casecade functionality"
    #And I "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    #And I Validate "Edit button is enabled on establishing the link by selecting ports" while creating fiber Link
    #And I Validate "Strand ID, Cable Id, Aerial/Buried and provisioning status is getting cascaded" while creating fiber Link
    #And I Validate "Select,Refresh & Remove on indiviual" while creating fiber Link
    #And I Validate "Refresh & Remove all functionality" while creating fiber Link
 
 @TC172739 
 Scenario: @TC172739 NIC_GPON_Reg_Validate the restriction around roles in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I make the page 100%
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link edit button" in GDB screen
    And I "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    And I click on "Fiber link Save button" in GDB screen
    Then I verify "Audit logs for the fiber link update functionality"
    
 @TC144825 
  Scenario: @TC144825 NIC_GPON_Reg_Validate the restriction around roles in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I make the page 100%
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I validate "Create fibre link" functionality in GDB
    And I "select ports from Device A and Device Z in 2nd GDB fiber link screen"
    And I validate "Create fibre link" functionality in GDB
    And I click on "Delete 2nd Device component" in GDB
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    Then I validate "Create fibre link" functionality in GDB
    

  @TC125599 @ref @PilotTesting
  Scenario: OV- Validate Fiber Distribution Node Port dropdown of ONT create on GDB for MST device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I select "ONT" as GDB-Component
    And I make the page 100%
    And I create "ONT" device with all the valid data
    And I add "10" more device in GDB
    And I perform "Cascade all button" in GDB
    Then I validate "Fiber Distribution Node Port dropdown of ONT" functionality in GDB

  @TC86562 @US90450 @TC125845 @ref @PilotTesting
  Scenario: OV-Validate when user input splitter number, Relay Rack Shelf is autopopulated
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I Select "SPLITTER" device in GDB
    Then I validate "on entering the Splitter number, relay rack shelf should get autopopulated for splitter" functionality in GDB
    And I create "SPLITTER" device with all the valid data
    And I add "10" more device in GDB
    And I click on "Expand all" in GDB
    And I perform "Cascade all button" in GDB
    Then I click on "Create all button" in GDB
    And I validate GDB device are created in sequence

  @TC168879 @ref @PilotTesting
  Scenario: OV- Validate the ONT Naming Convention in GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    Then I validate GDB Device Topology attribute value in view page

  @TC300718 @ref @PilotTesting
  Scenario: @TC300718 - NIC_GPON_Regression_OV TEST:Validation of adresses in Location look up in GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    Then I verify "adresses in Location look up for GDB device"

  @TC135984 @ref @PilotTesting
  Scenario: @TC135984 -Validation of error while deleting FDH from GDB which contains FDP & Splitter
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "FDH" as GDB-Component
    And I create "FDH" device with all the valid data
    And I "search the device in inventory"
    And In the 360 view I click on the "Device Ports" tab
    #And I clicked the "Device port Expand" button in Device Detail Page
    #And I clicked the "Add Contained Devices" button in Device Detail Page
    And I "search for the FDP device & associate the device to the FDH device in inventory"
    Then I verify "error while deleting FDH from GDB which contains FDP/Splitter"

  @TC144914 @ref @PilotTesting 
  Scenario: @TC144914_1 NIC_GPON_Reg_Verify create all functionality of Passive devices in GDB by Select all/None
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I make the page 100%
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I validate "Create fibre link" functionality in GDB
    And I select "OLT" as GDB-Component
    And I perform drag and drop on the device having fiber link
    And I validate the error message

  @PI7 @Sprint212 @F2285 @TC126091 @ref @PilotTesting
  Scenario: @TC126091 -OV Test: To check the device details after adding it to GDB_OLT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    #And I select "OLT" as GDB-Component
    And I select "MST" as GDB-Component
    And I select "SPLITTER" as GDB-Component
    And I select "OLT" as GDB-Component
    # And I make the page 100%
    #And I create "OLT" device with all the valid data
    And I create "GPON-OLT" device through Inventory
    And I add the existing device in the GPON device build
    Then I verify "all the fields are populated"
    Then I verify "Exiting Check bos is disabled"

  @TC136997 @ref @TC117295 @PilotTesting
  Scenario: @TC136997 -OV: Validate ONTS are created in order on GDB build
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

  @TC144940 @ref @PilotTesting
  Scenario: @TC144940 -OV- Verify Remove all functionality for GDB devices by Select all/None
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I add "10" more device in GDB
    And I select "3" device from the Gpon Device Build
    And I click on "Remove all" button in GDB
    Then I should be able to see success message
    And I select "all" device from the Gpon Device Build
    And I click on "Remove all" button in GDB
    Then I validate audit log for "GDB Remove"
   # Then I should be able to see success message

  @TC144934  @PilotTesting
  Scenario: @TC136188-TC142303--TC174747 -OV- Perform Create all, Remove & Delete all functionality on GPON Device Build with Expand all the device
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
     And I select "2" device from the Gpon Device Build
    And I click on "Remove all" button in GDB
    Then I should be able to see success message
    Then I validate audit log for "GDB Remove"
   
    
  @TC146946 @TC147057 @ref @PilotTesting
  Scenario: @TC146946-TC147057 -NIC_GPON_Reg_Verify Delete icon and Delete all functionality for GDB devices by Partial select
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Delete indiviual button" functionality in GDB
    And I select "3" device from the Gpon Device Build
    And I click on "Delete all" button in GDB
    Then I should be able to see success message
    And I select "all" device from the Gpon Device Build
    And I click on "Delete all" button in GDB
    Then I validate audit log for "GDB Create and Delete functionality"
    
     @TC125824 @ref @PilotTesting
  Scenario: @TC189827 -Validate delete button in OLT and ONT Devices after user changes the device role to Ethernet from GPON
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data
    And I "search the device in inventory"
    And I clicked the "Edit" button in Device Detail Page
    And I "changed the role from GPON to Ethernet in device page"
    And I clicked the "Save" button in Device Detail Page
    Then I verify "delete button is disabled in the GDB Screen on changing the device role to Ethernet"

  @TC125824_1 
  Scenario: @TC125824  OV-Verify the Delete button for GPON and Ethernet role devices on GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I Validate Delete button for GPON and Ethernet role devices on GDB

  @extra
  Scenario: @extra -OV- Verify create all functionality for GDB devices by Select all/None
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I fill all the mandatory fields for "MST" GDB device
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the Add Service Area in GDB

  @TC117296 @PilotTesting
  Scenario: @TC117296 -OV: Validate ONTS are created in order on GDB build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I add "10" more device in GDB
    Then I validate "Select & Remove individual button" functionality in GDB

  @Extra @TC117295
  Scenario: @TC136997 -OV: Validate ONTS are created in order on GDB build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Delete indiviual button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
    And I validate "Refresh button" functionality in GDB
    And I validate "Select all button" functionality in GDB
    Then I validate "Delete all button" functionality in GDB
    Then I verify "Device is completely removed from the screen"

  ##########################  F2285-CR4701 GPON Device Build Ehancements  ########################################################
  ########################## US50181--CR4701 GPON Device Build enhance delete objects-devices- from object creation list #########
  @PI7 @Sprint212 @F2285 @US50181 @TC86217 @TC125746 @TC126060
  Scenario: @TC86217 -Validate whether the select box appears to select for devices through GPON build & also verify Create all & Delete all popup window in GPON build..
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Delete indiviual button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
    And I validate "Refresh button" functionality in GDB
    And I validate "Select all button" functionality in GDB
    Then I validate "Delete all button" functionality in GDB
    Then I verify "Device is completely removed from the screen"

  ##########################  US50209--CR4701 GPON Device Build Start Stand ID is a common attribute  ###########################
  ##########################  US60425--CR4701 GPON Fiber Link Name show Null in A end and cannot edit ###########################
  ##########################  US50168--CR4701 GPON Device Build Refresh Icon for each section of device build ###################
  ##########################  US50209--CR4701 GPON Device Build Start Stand ID is a common attribute ############################
  ########################## US76607--CR4701 GPON Device Build Copy All-Links: Icon shows user has clicked it   #################
  ########################## US76767--CR4701 GPON Device Build enhance delete objects-links- from object creation list ##########
  @PI7 @Sprint212 @F2285 @US50209 @TC86218 @US60425 @TC86648 @US50168 @TC86544 @US114864 @TC154436 @US50209 @US76607 @TC86222 @US76767 @TC86223
  Scenario: OV Test: Validate pop up message is getting displayed on selecting Z port first, Attributes, Cascade, Create, Delete & Remove fiber link functionality in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I Validate "POP-UP message is getting displayed on selecting Z port before selecting A port" while creating fiber Link
    And I Validate "Edit button is enabled on establishing the link by selecting ports" while creating fiber Link
    And I Validate "Strand ID, Cable Id, Aerial/Buried and provisioning status is getting cascaded" while creating fiber Link
    And I Validate "Select,Refresh & Remove on indiviual" while creating fiber Link
    And I Validate "Refresh & Remove all functionality" while creating fiber Link

  ##########################  US49941--CR4701 GPON Device Build Topology Look Up Does not return results when Topology name is specified  ###########################
  @PI7 @Sprint212 @F7610 @US49941 @TC86224
  Scenario: OV Test: Validate the topology lookup results when partial Topology name is specified.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I Select "OLT" device in GDB
    Then I validate "Partial Topology name search" functionality in GDB

  ##########################  US49941--CR4701 GPON Device Build Topology Look Up Does not return results when Topology name is specified  ###########################
  @PI7 @Sprint212 @F2285 @US49941 @TC86263
  Scenario: OV - Verify GPON Build Devices in Network Build.
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form
    Then I should see the "GDB boxes & its related icons" been displayed

  ##########################  US50143--CR4701 GPON Device Build Copy All-Devices: Icon shows user has clicked it  ###########################
  ##########################  US50168--CR4701 GPON Device Build Refresh Icon for each section of device build  ###########################
  ##########################   US115046--CR4701 GPON: GDB Select Behavior  ######################################################
  ##########################   US50143--CR4701 GPON Device Build Copy All-Devices: Icon shows user has clicked it  ###########################
  @PI7 @Sprint212 @F2285 @US50143 @TC86534 @US115046 @TC144911 @US50168 @TC86542 @TC86603 @TC125668 @TC144911_ref
  Scenario Outline: OV- Verify the Delete button on the Created GDB device, Apply to all/Cascade, Refresh & Create all functionality for GDB devices by Partial select
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "<GDB_Devices>" as GDB-Component
    And I create "<GDB_Devices>" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I select "3" device from the Gpon Device Build
    Then I click on "Create all button" in GDB
    Then I click on "Refresh all" in GDB
    And I validate "Select all button" functionality in GDB
    Then I validate "Delete all button" functionality in GDB
    Then I verify "Device is completely removed from the screen"
    Then I validate audit log for "GDB Create and Delete functionality"

    Examples: 
      | GDB_Devices |
      #|	OLT					|
      | FDP-12port  |

  #  |	SPLITTER		|
  #  |	MST					|
  # |	ONT					|
  ##########################   US57044--CR4701 GPON Device Build Attributes: ONT Name is incorrect in OV after creation in GDB   ##########################
  @PI7 @Sprint215 @F2285 @US57044 @TC83693 @TC87052 @TC86220
  Scenario: OV- Validate Wire Center CLLI and Device CLLI field while creating the ONT in GDB.
    Given I am logged in as a "Admin" user in Omnivue
   Scenario: @TC136997 -OV: Validate ONTS are created in order on GDB build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    And I validate "Create all button" functionality in GDB
    Then I validate the "GDB-ONT" Device in view page

  @PI7 @Sprint215 @F2285 @US57044 @TC83694 @TC87053
  Scenario: OV- Validate the ONT Naming Convention in GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    Then I validate the "ONT Naming convention" Device in view page

  ##########################   US57038--CR4701 GPON Device Build Expand All for Devices  ##########################
  @US57038 @TC116894 @TC116891
  Scenario: OV- Perform Cascade functionality on GPON Device Build with Expand all the device
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data
    And I add "10" more device in GDB
    And I click on "Expand all" in GDB
    And I perform "Cascade all button" in GDB
    Then I click on "Create all button" in GDB

  ##########################  US102273--CR4701 GPON : Service Area (GDB Component) - Loader  ##########################
  @US102273 @TC115008 @TC125681 @TC125756
  Scenario: OV-Verify Loader while clicking on Service Area component on GDB.
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the GDB Loader

  ##########################  US86393: CR4701 GPON GDB Export of Build to .xlsx for User Review - This is for UI  ##########################
  @PI8 @Sprint221 @F6099 @US86393 @TC125682 @TC125531
  Scenario: OV- Validating an export to excel icon on GDB screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    Then I verify "Excel icon button on top of GDB create page"

  ########################## Service Area components - Service_Area - Remove All  ##########################
  @PI8 @Sprint221 @F9893 @US102275 @TC116184 @TC118130 @TC125683 @TC317980
  Scenario:TC317980- OV-Verify Remove all functionality of Service Area before and after Creation on GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the "Remove all button" of Service Area in GDB
    Then I verify "Audit logs for the GDB Service area remove actions"

  ########################## Service Area components - Service_Area - Remove  ##########################
  @PI8 @Sprint221 @F9893 @US102277 @TC116187 @TC118152 @TC125706 @ref @TC317980
  Scenario: TC317980-TC125706-TC118152-TC116187-OV-Verify Remove icon functionality of Service Area before and after Creation on GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the "Remove icon" of Service Area in GDB
    Then I verify "Audit logs for the GDB Service area remove actions"
     

  ########################## Service Area components - Service_Area - Delete  ##########################
  @PI8 @Sprint221 @F9893 @US102278 @TC116525 @TC125710 @Ref
  Scenario: TC125710-OV-Verify Delete icon functionality of Service Area on GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the "Delete icon" of Service Area in GDB
    And I clicked on Get Audit Logs button
    Then Validate "DELETE" entry of Service Area in audit log for GDB
    
    @TC125710_1
     Scenario: TC125710-OV-Verify Delete All button functionality of Service Area on GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the "Delete all button" of Service Area in GDB
    And I clicked on Get Audit Logs button
    Then Validate "DELETE" entry of Service Area in audit log for GDB

  ##########################  US102279--CR4701 GPON : Service Area components - Associate Address  ##########################
  @PI8 @Sprint221 @F9893 @US102279 @TC116530 @US102280 @TC114663 @TC125712 @TC125715
  Scenario: OV-Verify Associate Addresses section of Service Area on GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    And I Validate the "Associate icon" of Service Area in GDB
    Then I Validate the "Associate Addresses section" of Service Area in GDB

  ##########################    US102292:CR4701 GPON - Service Area components - Associate Address - Cascade options ##########################
  @PI8 @Sprint221 @F9893 @TC125721
  Scenario: OV- Validating Cascade options of Associate Address in Service Area components
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    # And I perform "Cascade in Service area" in GDB
    And I Validate the "Associate icon" of Service Area in GDB
    Then I Validate the "Associate Addresses section" of Service Area in GDB

  @TC86561
  Scenario: @TC86561 -OV-While adding more devices at a time in GPON application. It should not invoke web browser long running script error.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
    Then I validate "Refresh button" functionality in GDB

  @TC125747 @TC125868 @TC125869 @TC126075
  Scenario: OV Test: Validation of working of Apply to all, Create all, Refresh & Remove button in GPON build.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
    Then I validate "Refresh button" functionality in GDB

  @TC125763 @TC125773 @TC125775 @TC143630 @TC143827 @TC143902 @TC143957 @TC146665 @TC174136 @PilotTesting
  Scenario: @TC125763-TC125773-TC125775-TC143630-TC143827-TC143902-TC143957-TC146665-TC174136: Fiber Link - Create, Update, Remove & Delete functionality
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    When I click on "Fiber link Remove icon button" in GDB screen
    Then I verify "Audit logs for the fiber link remove functionality"
    And I click on "Fiber link edit button" in GDB screen
    And I "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    And I click on "Fiber link Save button" in GDB screen
    Then I verify "Audit logs for the fiber link update functionality"
    Then I validate "Fiber link" attributes in create form for "GPON Device Build"
    Then I verify "Audit logs for the fiber link create functionality"
    When I click on "Fiber link Delete icon button" in GDB screen
    Then I verify "Audit logs for the fiber link delete functionality"

  @TC142587 @TC146665 @TC130423 @TC144916 @TC144922 @TC144922_ref 
  Scenario: @TC142587-TC146665-TC130423-TC144916-TC144922 -OV Test: Fiber Link -  When user edits a field which is in the common area, only update fiber link and not common area
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I add "4" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I add "4" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I "select multiple ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link edit button" in GDB screen
    And I "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    And I click on "Fiber link Save button" in GDB screen
    And I verify "Audit logs for the fiber link update functionality"
    And I "select the first link checkbox in GDB fiber screen"
    And I click on "Fiber link Create all button" in GDB screen
    Then I verify "first fiber link is created only in gdb screen"
    And I click on "Fiber link Create all button" in GDB screen
    Then I verify "all fiber link got created in gdb screen"
    And I click on "Select all check box in fiber link page" in GDB screen
     And I click on "Fiber link Delete all button" in GDB screen
   
   
     @TC190587 @TC190587_ref @ref11 @PilotTesting
  Scenario: @TC190587 -NIC_GPON_Reg_Validate success Fiber Link attributes shouldnot editable, while cascading unsuccessful fiber link in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I add "4" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I add "4" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I "select multiple ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link edit button" in GDB screen
    And I "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    And I click on "Fiber link Save button" in GDB screen
    And I "select the first link checkbox in GDB fiber screen"
    And I click on "Fiber link Create all button" in GDB screen
    Then I verify "first fiber link is created only in gdb screen"
    And I click on "Fiber link edit button" in GDB screen
   	And I Cascade values in GDB Fibre link
    And I click on "Fiber link Create all button" in GDB screen
    Then I verify "all fiber link got created in gdb screen"
    And I click on "Select all check box in fiber link page" in GDB screen
    And I click on "Fiber link Delete all button" in GDB screen
    
     
      
    @TC192544 @TC192544_ref @ref10 @PilotTesting
  Scenario: @TC192544 -NIC_GPON_Reg_Validate duplicate fiber link shouldnot create with same Stand ID in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I add "4" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I add "4" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I "select multiple ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link edit button" in GDB screen
    And I "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    And I click on "Fiber link Save button" in GDB screen
    And I "select the first link checkbox in GDB fiber screen"
    And I click on "Fiber link Create all button" in GDB screen
    Then I verify "first fiber link is created only in gdb screen"
    And I click on "Second Fiber link edit button" in GDB screen
    And I "Change the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen"
    And I click on "Second Fiber link Save button" in GDB screen
    And I click on "Fiber link Create all button" in GDB screen
    And I Verify the error message
    And I click on "Select all check box in fiber link page" in GDB screen
    And I click on "Fiber link Delete all button" in GDB screen
    
    
     @TC174403 @TC174403_ref @ref11 @PilotTesting
    Scenario: @TC174403 -NIC_GPON_Reg_Validate Z device port select all check box of fiber link without selecting the A device Port in the GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I "select a port from Device z and verify the warning message"

  @TC149551 @TC149566 @TC153447 @TC173039 @TC154433 @TC154432 @TC153448 @PilotTesting
  Scenario: @TC149551 -OV- Verify Delete all functionality for fiber link between GDB device
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
    And I "select the first link checkbox in GDB fiber screen"
    When I click on "Fiber link Delete icon button" in GDB screen
   And I click on "Select all check box in fiber link page" in GDB screen
    And I click on "Fiber link Delete all button" in GDB screen
    Then I verify "Audit logs for the fiber link delete functionality"
    #And I "select the first link checkbox in GDB fiber screen"
   # When I click on "Fiber link Delete icon button" in GDB screen
    #Then I verify "Audit logs for the fiber link delete functionality"
   # And I "select ports from Device A and Device Z in GDB fiber link screen"
   # And I click on "Select all check box in fiber link page" in GDB screen
   # And I click on "Fiber link Remove all button" in GDB screen
    #Then I verify "Audit logs for the fiber link remove functionality"

@TC317978 @refact @PilotTesting
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

    
     @refact @TC317984_1 @PilotTesting
  Scenario: @TC317984 -OV- Verify that the associated fiber link is automatically deleted from inventory and the GDB screen if the user deletes either start or the end device
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
    
     
    @TC317983 
    Scenario: @TC317983 -OV- Verify that the associated fiber link is automatically removed from the GDB screen if the user removes either start or the end device
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
    
    
  @TC126141 @US102272 @TC126059
  Scenario: OV Test: Verify the service area section components in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    And I Validate service area section components in GDB

  @TC126062
  Scenario: @TC126062 -OV Test: Validation of add component in service area section of GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    And I Validate the Add Service Area in GDB

  @TC86241
  Scenario: @TC86241 -OV-Validate changed mandatory attributes of ONT device from Network
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" as GDB-Component
    Then I verify "Fiber Distribution Device, Power Supply, Fiber Cable Name & Fiber Strand ID are not mandatory in ONT GDB"

  @PI7 @Sprint212 @F2285 @TC126063 @TC125879 @remove
  Scenario: OV Test: To verify devices removing from the list when moving from one component to another
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data
    And I add "10" more device in GDB
    And I validate "Cascade all button" functionality in GDB
    And I validate "Create all button" functionality in GDB
    And I validate "Delete indiviual button" functionality in GDB
    And I validate "Select & Remove individual button" functionality in GDB
    And I validate "Refresh button" functionality in GDB
    And I validate "Select all button" functionality in GDB
    Then I validate "Remove all button" functionality in GDB
    Then I verify "Device is completely removed from the screen"
    Then I verify "Audit logs for the GDB Create, Delete, Remove & Delete functionality"

  @TC126139
  Scenario: @TC126139 -OV Test: Validation of Refresh all on service area section  components in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I create "MST" device in GDB
    #And I create "GDB_SERVICEAREA" in GDB
    And I Validate the "Refresh all button" of Service Area in GDB

  @TC126143
  Scenario: @TC126143 -OV test:Validation of No links field should be present for FDH & Service Area in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I Select "SPLITTER" device in GDB
    And I Select "FDH" device in GDB
    And I Select "OLT" device in GDB
    And I Select "Service Area" device in GDB
    And I Select "MST" device in GDB
    Then I validate fiber links between FDH & Service Area in GDB

  #########################################################################################################################################################
  ########    TC67624 ---OV-Validate GPON Device build without selecting any value in Functional status attribute  #############################
  ########    TC67677 ---OV-Validate GPON Device build by selecting value in Functional status attribute  #############################
  @TC67624 @TC67677
  Scenario Outline: OV Test: Validate the ports available after deletion of Fiber link GDB & Ports
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "<FunctionalStatusDevice>" as GDB-Component
    And I select Functional status as "<Functionalstatus>"
    Then I create "<FunctionalStatusDevice>" device with all the valid data

    Examples: 
      | FunctionalStatusDevice | Functionalstatus |
      | OLT                    | Not Monitored    |
      | FDP-12port             | Not Specified    |
      | SPLITTER               | No Value given   |
      | FDP-144port            | Faulty           |
      | MST                    | Defective        |
      | ONT                    | Maintenance      |

  ##############################################	Sprint 223	######################################################################
  ##########	US115995 -- [COD: 4] <50% CR4701 On changing the device role in Inventory, the Delete icon is still in enable state on GDB. (DE17396) ########################
  ##########	US115753 -- OV-Verify the Delete icon button for Existing non-Ethernet devices in GDB.   ###################################################
  @Sprint223 @US115995 @TC130587 @US115753 @TC133313
  Scenario Outline: OV-Verify the Delete Icon on GDB Device after changing the role to Ethernet & GPON
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I create "<Device type>" device through Inventory
    And I add the existing device in the GPON device build
    Then I validate Delete icon for the "<Device type>" device in GDB

    Examples: 
      | Device type  |
      | GPON-OLT     |
      | Ethernet-OLT |

  ################## F7610 CR4701 GPON Device Build Delivered Functionality- NO CODE NEEDED ## ##########
  ##################  Sprint 211  ########  US60475 -- [Continued] CR4701 GPON Once Fiber link is deleted then selected port should be enabled  ## ##########
  ##################  Sprint 211  ########    US57058--[Continued] CR4701 GPON Fiber Build: Only Display ports by Line or Drop   ## ##########
  @US60475 @TC54537 @TC54539 @TC54540 @TC54538 @US57058 @TC53654 @TC53655 @TC53657 @TC53658 @TC171931 @refact
  Scenario Outline: @TC54537 -OV Test: Validate the ports available after deletion of Fiber link GDB & Ports
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "<DeviceA>" as GDB-Component
    And I create "<DeviceA>" device with all the valid data
    And I select "<DeviceZ>" as GDB-Component
    And I create "<DeviceZ>" device with all the valid data
    And I select fiber link between GDB devices
    Then I validate Ports been "Displayed" is "Only Display ports by Line or Drop"
    And I add the fiber link between the GDB device
    And I validate Ports been "Consumed" is "Disabled"
    And I validate "Fiber-Delete" functionality in GDB
    Then I validate Ports been "Consumed" is "Enabled"

    Examples: 
      | DeviceA     | DeviceZ     |
      #| OLT         | FDP-12port  |
     # | FDP-12port  | SPLITTER    |
      | SPLITTER    | FDP-144port |
      #| FDP-144port | MST         |

  ############################################################################################################################################
  ##################  Sprint 225  ########  US57038 -- CR4701 GPON Device Build Expand All for Devices  ## ##########
  ##############US115736 --[COD 6] CR4701 OV Test-Not able to create Device in GDB without expanding device. 		########################
  @Extra
  Scenario: @TC136188 -OV- Perform Create all, Remove & Delete all functionality on GPON Device Build with Expand all the device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I fill all the mandatory fields for "OLT" GDB device
    And I add "10" more device in GDB
    And I click on "Expand all" button in GDB
    And I should be seeing all the devices "Expanded"
    And I click on "Cascade all" button in GDB
    And I click on "Shrink all" button in GDB
    And I select "3" device from the Gpon Device Build
    And I click on "Remove all" button in GDB
    Then I should be able to see success message
    And I click on "Create all" button in GDB
    Then I should see "OLT" Device created successfully in Gpon device build
    And I select "5" device from the Gpon Device Build
    And I click on "Delete all" button in GDB
    Then I should be able to see success message

  @TC130021 @TC130022
  Scenario: OV-Validate the Audit Log functionality for Create (Service Area)
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I select "Service Area" as GDB-Component
    And I create "Service Area" in GDB
    Then I click on Audit logs & validate "CREATE" entry of Service Area in audit log for GDB

  @US102289 @TC130019
  Scenario: @TC130019 -OV-Validate the Audit Log functionality for Delete of Service Area
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I create "MST" device in GDB
    And I create "GDB_SERVICEAREA" in GDB
    And I Validate the "Delete icon" of Service Area in GDB
    And I clicked on Get Audit Logs button
    And I clicked on refresh icon of audit log page
    Then I click on Audit logs & validate "DELETE" entry of Service Area in audit log for GDB

  @TC130020
  Scenario: @TC130020 -OV-Validate the Audit Log functionality for Delete All of Service Area
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I create "MST" device in GDB
    And I create "GDB_SERVICEAREA" in GDB
    #And I Validate the "Delete icon" of Service Area in GDB
    # And I clicked on Get Audit Logs button
    #And I clicked on refresh icon of audit log page
    Then I click on Audit logs & validate "DELETE" entry of Service Area in audit log for GDB

  @TC130013
  Scenario: @TC130013 -OV-Validate the Audit Log functionality for Remove of service area
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate service area section components in GDB

  @TC130016
  Scenario: @TC130016 -OV-Validate the Audit Log functionality for Remove all of service area
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate service area section components in GDB

  @TC172249
  Scenario: @TC172249 -OV Validation of Create Service Area- new view screen in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate service area section components in GDB

  @TC172248
  Scenario: @TC172248 -OV Validation of the Add Service Area-new view screen in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I fill all the mandatory fields for "MST" GDB device
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the Add Service Area in GDB

  @TC142304
  Scenario: @TC142304 -OV- Perform Delete all functionality on GPON Device Build with Expand all the device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I fill all the mandatory fields for "MST" GDB device
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the Add Service Area in GDB

  @TC142305
  Scenario: @TC142305 -OV- Perform Remove all functionality on GPON Device Build with Expand all the device
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I fill all the mandatory fields for "MST" GDB device
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the Add Service Area in GDB

  @TC106757 @TC106886 @TC106887
  Scenario: OV-Validate Delete Device button/icon available in GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I fill all the mandatory fields for "MST" GDB device
    And I create "GDB_SERVICEAREA" in GDB
    Then I Validate the Add Service Area in GDB

  @TC173005 @ref @PilotTesting
  Scenario: @TC173005-  OV Test: Validation of service area creation in GDB-Without associated Addresses
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    Then I create "GDB_SERVICEAREA" in GDB
    Then I add "1" more Service Area in GDB
     Then I verify "Audit logs for the GDB Service area Creation"

  ##############################   # Re-work on this ##############################  ##############################
  @TC173015
  Scenario: @TC173015- OV Test: Validation of INDIVIDUAL service area create in GDB-With associated Addresses
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate 1 address in GDB Service area"

  @TC173018 @ref @PilotTesting
  Scenario: @TC173018- OV Test: Validation of service area CREATE ALL in GDB-With associated Addresses
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate multiple address in GDB Service area"
Then I verify "Audit logs for the GDB Service area Creation & Association actions"
    

  ##############################  ##############################  ##############################  ##############################
  @TC174125
  Scenario: @TC174125- OV test: Validation of associating duplicate addresses to service area in GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate multiple address in GDB Service area"
    #And I "Associate 1 address in GDB Service area"
    Then I verify "On associating the same address in GDB Service area are we seeing Duplicate address(es) present in selection, duplicate address(es) will not be added to service area. message getting displayed"


  ##############################  ##############################  ##############################  ##############################
 
  @TC154447 @ref @TC126100 @PilotTesting
  Scenario: @TC154447-TC126100- OV Test: Verify the device attributes in GDB after changing it in inventory
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data
    And I "search the device in inventory"
    And I clicked the "Edit" button in Device Detail Page
    And I "updated the Network element role, Provision Status in Device Detail Page"
    And I clicked the "Save" button in Device Detail Page
    And I "switch back to GPON Device Build page & click on Refresh button"
    Then I verify "updated Network element role, Provision Status is also updated in the GDB page"

  @TC173729
  Scenario: @TC173729- OV TEST : Verify user is able to add service address to the Associated Addresses section in GDB screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate 1 address in GDB Service area"

  @TC173730
  Scenario: @TC173730- OV TEST : Verify user is able to add multiple service address to the Associated Addresses section in GDB screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    Then I "Associate multiple address in GDB Service area"

  @TC154450
  Scenario: @TC154450- OV Test: To verify the common area of fiber links functionality through Edit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I "select a port in each GDB component to initiate fiber link"
    And I click on "Edit icon in fiber link" button in GDB
    Then I verify "fields displayed in edit view of fiber links"

  @TC116828 @TC116984 @TC116994
  Scenario: @TC116828 -Validating Audit Log functionality for Associate button of Associate Address on GDB
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    And I "Associate multiple address in GDB Service area"
    Then I verify "Audit logs for the GDB Service area Creation & Association actions"

  @TC117485
  Scenario: @TC117485 -Validate the Loader functionality for Remove button in Associate_Addresses section
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I create "GDB_SERVICEAREA" in GDB
    And I "remove the associated address in GDB Service area"
    Then I verify "Audit logs for the GDB Service area remove actions"

  @TC129439
  Scenario: @TC129439 -Validation of adresses in Location look up in GDB.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    Then I verify "adresses in Location look up for GDB device"

 

  @TC195101
  Scenario: @TC195101 -OV-Verify Loader while clicking on Service Area component on GDB.
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data
    And I select "Service Area" as GDB-Component
    And I "add 200 more Service area component on GDB Screen"
    And I "fill all the mandatory fields present for Service area in GDB screen"
    Then I click on "Create all button" in GDB

  #Then I Validate the GDB Loader
   #Then I Validate the GDB Loader
  ###############################################################################################################
 

  

   