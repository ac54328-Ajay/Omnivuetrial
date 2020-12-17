@Search_Inventory @Search_Inventory_Circuit @Regression @CircuitRefact
Feature: Search - Inventory - Circuit Side Validation Refactored TC

 #################		Optical Bearer CIRCUIT ##################################
  @TC119166_refact  @TC287655_refact @TC239356_refact  @CircuitRefact
  Scenario: TC119166-TC239356-TC287655-NIC_GPON_Reg-Verify the functionality of Create Button for the Circuit type - Optical Bearer
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data
    And I "select ports from Device A and Device Z in GDB fiber link screen"
    And I click on "Fiber link Create all button" in GDB screen
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Optical Bearer"
    And I Enter Circuit name in search slider
    And I click on search button for "Circuit"
    When I click on "Edit" in Circuit page
    #And I "change the name in the circuit edit screen"
    And I update few fields in Circuit details tab for "Optical Bearer" Circuit
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    When I click on "Delete" in Circuit page
    Then I validate Circuit in Database
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Optical Bearer" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create form with "TC239356" data
    Then I click on "Create" in Circuit page
    Then I validate Circuit in Database
     When I click on "Edit" in Circuit page
    And I update few fields in Circuit details tab for "Optical Bearer" Circuit
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    
    @TC287682_refact   @CircuitRefact1
  Scenario: @TC287682 -NIC_GPON_Reg-Verify data displayed in the Related Tabs - Optical Bearer circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Optical Bearer"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
    And I validate the Related  "Locations" tab in circuit page
   # And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page

############################################# Lag #################################################
@Edit_Lag @TC55684_refact @CircuitRefact1 @TC39237_refact @TC122366_refact
  Scenario: @TC55684-TC39237-TC122366 -Verify Create functionality of LAG CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "LAG" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields in Circuit Create tab with "LAG" data
    And I select subscriber as "Test - Janet" in Create Circuit Tab
   And I Associate "1" Circuit "021/GE1/LSVGNVCX902/LSVGNVCAUTO" to LAG Circuit
    And I Associate "2" Circuit "121/GE1/LSVGNVCX902/LSVGNVCAUTO" to LAG Circuit
    Then I click on "Create" in Circuit page
    Then I validate Circuit in Database
    And I verify "Circuit gets created successfully message is displayed"
    When I click on "Edit" in Circuit page
    And I select subscriber as "TEST COMMONS" in Create Circuit Tab
    And I update few fields in Circuit details tab for "Lag" Circuit
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
    
    # E2E : 021/GE1/LSVGNVCX902/LSVGNVCAUTO,121/GE1/LSVGNVCX902/LSVGNVCAUTO
    #test1 :  021/GE1/LSVGNVCX902/LSVGNVCAUTO,121/GE1/LSVGNVCX902/LSVGNVCAUTO
    
     @TC39249_refact @CircuitRefact1
  Scenario: @TC39249 -NIC_Ethernet_Reg-Verify data displayed in the Related Tab -  Lag circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "LAG"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
    And I validate the Related  Circuits tab in Lag circuit page
    And I validate the Related  "Locations" tab in circuit page
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page
    
    ############################################# EB ####################################
      
  @Edit_EB @TC239357_refact @CircuitRefact1 @GETENF-5063
  Scenario: @TC119152-TC122362-TC239357 -Verify Edit functionality of Ethernet Bearer CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Ethernet Bearer" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields in Circuit Create tab with "Ethernet" data
    And I select subscriber as "TEST DELETE" in Create Circuit Tab
    And I Select Start Device as "ALBCGTYI09A-488545.03L" and End Device as "ALBCGTYI09A-488545.04L" in Circuit Create tab
    Then I click on "Create" in Circuit page
    Then I validate Circuit in Database
    And I verify "Circuit gets created successfully message is displayed"
    When I click on "Edit" in Circuit page
    And I update few fields in Circuit details tab for "Ethernet" Circuit
    And I select subscriber as "TEST COMMONS" in Create Circuit Tab
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
    Then I validate Circuit in Database
     
      @TC122361_refact @TC257339_refact @TC122361  @CircuitRefact1
  Scenario Outline: @TC122361-TC257339 -NIC_Ethernet_Reg-Verify data displayed in the Related Tab - <Circuit types>
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
    And I validate the Related  "Locations" tab in circuit page
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Circuits" tab in circuit page
    And I validate the Related  "BAM Report" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page

    Examples: 
      | Circuit types            |
      #| Ethernet Bearer          |
     | Topology Virtual Circuit |
    
    
    ########################################################### TVC ##################################
     @TC55681_refact @TC239352_refact  @TC122457_refact1  @CircuitRefact1 @GETENF-5101
  Scenario: @TC55681-TC239352-TC122457 -Verify Edit functionality of TOPOLOGY VIRTUAL CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Topology Virtual Circuit" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create form with "TC55681" data
    Then I click on "Create" in Circuit page
    And I verify "Log is captured for the Create functionality in Circuit screen"
    When I click on "Edit" in Circuit page
    And I update few fields in Circuit details tab for "TVC" Circuit
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
     #Then I validate Circuit in Database
     
      @TC257339_refact @TC122361  @CircuitRefact1
  Scenario Outline: @TC122361-TC257339 -NIC_Ethernet_Reg-Verify data displayed in the Related Tab - <Circuit types>
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
    And I validate the Related  "Locations" tab in circuit page
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Circuits" tab in circuit page
    And I validate the Related  "BAM Report" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page

    Examples: 
      | Circuit types            |
      | Ethernet Bearer          |
     | Topology Virtual Circuit |
    
    
    ####################################### VLAN Segment CIRCUIT #########################################################
    @TC55685_refact  @TC39239_refact @TC122459_refact @GETENF-5104
Scenario: @TC55685-TC39239-TC122459 -Verify Edit functionality of VLAN Segment CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "VLAN Segment" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC39239" data
		Then I click on "Create" in Circuit page	
		Then I validate Circuit in Database	
		And I verify "Circuit gets created successfully message is displayed"
		Then I verify "Log is captured for the Create functionality in Circuit screen"	
		When I click on "Edit" in Circuit page	
		#And I "change the name in the circuit edit screen"
		And I update few fields in Circuit details tab for "VLAN" Circuit
		And I click on "Save" in Circuit page
		And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
		When I click on "Delete" in Circuit page	
		And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
		
		
  @TC291720_refact  @CircuitRefact1
  Scenario: @TC291720 -NIC_Ethernet_Reg-Verify data displayed in the Related Tab -  VLAN Segement  circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "VLAN Segment"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
    And I validate the Related  Circuits tab in VLAN Segment circuit page
    And I validate the Related  "Locations" tab in circuit page
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page
		
  ####################################################### PON #############################
  @TC39211_refact @CircuitRefact1
  Scenario: @TC39211 -NIC_GPON_Reg-Verify data displayed in the Related Tabs - PON circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "PON"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
     And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
  #  And I validate the Related  Circuits tab in PON circuit page
   # And I validate the Related  "Locations" tab in circuit page
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page

  @TC39214_refact @CircuitRefact1
  Scenario Outline: @TC39214 -NIC_GPON_Reg_Verify the update functionality of PON Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"
    And I enter the circuit name "GP101/GE2X/LSVKNVKR00W/LNTWOHADH00" into name field in the search slider
    And I click on search button for "Circuit"
  #  And I click on view icon in Search Result page
    When I click on "Edit" in Circuit page
    And I "Update editable fields in the circuit edit screen"
    And I click on "Save" in Circuit page
    When I click on "Edit" in Circuit page
    And I verify "Updated fields in DB for circuit"
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
 # GP101/GE2X/LSVGNVXV09L/LSVGNVXV08L (E2E)
 # GP101/GE2X/LSVKNVKR00W/LNTWOHADH00 (Test1)
    Examples: 
      | Circuit types |
      | PON           |
      
       #################		 PW Unrouted (Path) CIRCUIT ###################################################
  @TC287592_refact @TC287623_refact @TC287657_refact   @CircuitRefact1
  Scenario: @TC287592-TC287623-TC287657 - NIC_GPON_Reg-Verify the functionality of Create Button for the Circuit type - Pseudo Wire Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Pseudo Wire" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create for "PW Unrouted"
    Then I click on "Create" in Circuit page
    #Then I validate Circuit in Database
    And I verify "Log is captured for the Create functionality in Circuit screen"
    When I click on "Edit" in Circuit page
    And I "Update editable fields in the circuit edit screen"
    And I click on "Save" in Circuit page
    When I click on "Edit" in Circuit page
    #And I verify "Updated fields in DB for circuit"
    And I click on "Save" in Circuit page
    And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I validate Circuit in Database

@TC287683_refact  @CircuitRefact1
  Scenario Outline: @TC287683 -NIC_GPON_Reg-Verify data displayed in the Related Tabs - Pseudo Wire circuit - <Circuit types>
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"
    And I click on search button for "Circuit"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Circuits" tab
    And I validate the Related  "Subscribers" tab in circuit page
    And I validate the Related  "Devices" tab in circuit page
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Circuits" tab in circuit page
    And I validate the Related  "BAM Report" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page

    #And I validate the Related  "Locations" tab in circuit page
    Examples: 
      | Circuit types      |
      | PW Unrouted (Path) |
      
         ##############################################################################################

  @TC300510_refact  @CircuitRefact1
  Scenario Outline: NIC_GPON_Reg_Validate Delete button functionality on GPON only device linked to Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I enter the service name "1000000789-HSI" in search slider
    And I click on search button for "Service"
   # And I click on view icon in Search Result page
    And I click on End device in service details page
    And I clicked the "Delete" button in Device Detail Page
    Then I validate the warning message displayed on triggerring Delete functionality
# E2E and test1 test data 1000000789-HSI, 1000000789-IPTV (test1)
    Examples: 
      | Search Service Type |
      | HSI                 |

  @TC300512_Refact @CircuitRefact1
  Scenario Outline: NIC_GPON_Reg_OV-Validate Delete button functionality on Passive only device linked to Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "<Search Service Type>" Service Type
    And I enter the service name "1000000789-HSI" in search slider
    And I click on search button for "Service"
    And I click on view icon in Search Result page
    When I click on "Facility Details" tab on Service Search page
    Then I searched Passive device
    And I clicked the "Delete" button in Device Detail Page
    Then I validate the warning message displayed on triggerring Delete functionality

    Examples: 
      | Search Service Type |
      | HSI                 |
      
       @TC165302__Refact 
  Scenario: @TC165302 - Verify Google Sytle Search for Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I verify "Google Type search field  is enabled"
    And I verify SOLR Suggestions for "Circuit" google search
    And I "click on GO button"
    Then I should see the "Circuit Search screen values" been displayed

  ########################################################### END of CKT regression ##########################################################################
 