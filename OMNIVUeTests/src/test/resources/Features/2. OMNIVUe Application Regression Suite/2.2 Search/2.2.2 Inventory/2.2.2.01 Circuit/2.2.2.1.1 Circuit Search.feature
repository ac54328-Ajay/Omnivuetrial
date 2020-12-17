@Search_Inventory @Search_Inventory_Circuit @Regression
Feature: Search - Inventory - Circuit Side Validation 

	#@TC39209 
	#Scenario: @TC39209 -Related System-Devices_Transport Path_Verify Start device details is displayed in Related System Devices section
  #  Given I am logged in as a "Admin" user in Omnivue   
  #  When I click on "Search" tab
 #   And I go to "Inventory" Search type and select "Circuit" as Inventory type
	#	  And I select Circuit type as "Transport Path"   
 #   And I click on search button for "Circuit"      
 #  And I should see the "Circuit Search Result" been displayed 
 #      And I click on view icon in Search Result page  
#		Then I verify "Start device details is displayed in Related System Devices section"
		
			
		@TC257339_old
		Scenario: @TC257339_old -Validate View Button of subscriber details under Circuit Search Results
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "HSI" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I should see the "Service Search screen attributes" been displayed  
		And In the 360 view I click on the "Subscribers" tab
		Then I verify "data displayed in the Subscribers Related Tab of Service Screen is matching with the circuit"	
		
		@TC122361-old
		Scenario: @TC122361_old -Verify data displayed in the Related Tab - Services - Ethernet Bearer circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I Search "Inventory" in Search Tab
    And I searched for "Service" with "MEF EVC" Service Type
    And I click on search button for "Service"
    And I click on view icon in Search Result page
		And I should see the "Service Search screen attributes" been displayed  
		And In the 360 view I click on the "Circuits" tab
		Then I verify "data displayed in the Circuits Related Tab of Service Screen is matching with the Ethernet Bearer circuit"
		
		@TC39249_old @GETENF-4968
		  Scenario: @TC39249_old -Ethernet Bearer - Verify Circuits Related tab for LAG Circuit 
   Given I am logged in as a "Admin" user in Omnivue  
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "LAG"   
    And I click on search button for "Circuit"    
    And I click on view icon in Search Result page 
   # And I should see the "Circuit Search screen attributes" been displayed 
    And In the 360 view I click on the "Circuits" tab  
    Then I verify "Ethernet Bearer circuit is displayed in the Circuit related tab"
    And I click on "view icon of the ethernet bearer in the Circuit related tab"
     And In the 360 view I click on the "Circuits" tab  
     Then I verify "LAG circuit is displayed in the Circuit related tab"
     
     
		 @TC165289
    Scenario: @TC165289 -Related System-Devices_Transport Path_Verify Start device details is displayed in Related System Devices section  
   Given I am logged in as a "Admin" user in Omnivue  
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Transport Path"   
    And I click on search button for "Circuit"    
    And I click on view icon in Search Result page 
   # And I should see the "Circuit Search screen attributes" been displayed 
    And In the 360 view I click on the "Devices" tab  
    Then I verify "Start & End device details is displayed in Related System Devices section in the Circuit Screen"
    
     @TC122364 @GETENF-5086
    Scenario: @TC122364 -Verify data displayed in the Related Tab - Devices - Ethernet Bearer circuit 
   Given I am logged in as a "Admin" user in Omnivue  
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "Ethernet Bearer"   
    And I click on search button for "Circuit"    
    And I click on view icon in Search Result page 
   # And I should see the "Circuit Search screen attributes" been displayed 
    And In the 360 view I click on the "Devices" tab  
    Then I verify "Start & End device details is displayed in Related System Devices section in the Circuit Screen"
    
    	@TESTAJAY
	Scenario: @TC39215 -Edit Circuit_Transport Path_Verify the functionality of Save button when user makes changes.
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
		 And I select Circuit type as "LAG"   
    And I click on search button for "Circuit"  
     And I click on view icon in Search Result page     
    And I click on "Edit" in Circuit page
    
    
			@TC39215
	Scenario: @TC39215 -Edit Circuit_Transport Path_Verify the functionality of Save button when user makes changes.
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
		  And I select Circuit type as "Transport Path"   
    And I click on search button for "Circuit"  
     And I click on view icon in Search Result page     
    And I click on "Edit" in Circuit page
    And I "update the Alias fields in the circuit screen"
     And I click on "Save" in Circuit page
     	Then I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    And I Click on "Audit Log" tab on Circuit view page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
		
 
    
    
 @TC187616 
  Scenario Outline: @TC187616 -Validation of 360 view on Advanced search with Device name for "<Circuit types>" Type
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"   
    And I click on search button for "Circuit"           
   Then I should see the "Circuit Search Result" been displayed   
    When I "Advance Search the Circuit with Device name field"
    Then I should see the "Circuit view page" been displayed  
    
 Examples: 
   |Circuit types							|
   |Ethernet Bearer						|
   |LAG												|
   |Optical Bearer						|
   |PON												|
   |PW Unrouted (Path)				|
   |Topology Virtual Circuit	|
   |Transport Path						|
   |VLAN Segment							|
		
		@P11 @Sprint237 @US116154 @TC189921 
  Scenario Outline: @TC189921 -CR6350 - US162982 - TC002 - Verify user is able to retrieve OMNIVUE  Audit Logs from Archive table for Circuit   
   Given I am logged in as a "Admin" user in Omnivue  
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"   
    And I click on search button for "Circuit"    
    And I click on view icon in Search Result page     
   	And I Click on "Audit Log" tab on Circuit view page
		When I Click on "OMNIVUE Audit Logs" tab 
		And I validate new option From Archive checkbox on Audit logs for "Circuit"		
 		And I click on the "Get logs in Audit logs with From Archive checkbox selected" in "Circuit" result page
    Then I validate the logs displayed in Audit logs by selecting Archive checkbox in "Circuit" result page
    When I Click on "ARM Audit Logs" tab
    And I validate new option From Archive checkbox on Audit logs for "Circuit"		
 		And I click on the "Get logs in Audit logs with From Archive checkbox selected" in "Circuit" result page 
    
 Examples: 
   |Circuit types							|
   |Ethernet Bearer						|
   |LAG												|
   |Optical Bearer						|
   |PON												|
   |PW Unrouted (Path)				|
   |Topology Virtual Circuit	|
   |Transport Path						|
   |VLAN Segment							|
   
  
  
  #######################################################
  @TC122361_new @TC257339 @TC122361
		  Scenario Outline: @TC122361 -NIC_Ethernet_Reg-Verify data displayed in the Related Tab - <Circuit types>
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
   |Circuit types							|
   |Ethernet Bearer						|
   |Topology Virtual Circuit	|
   
   
   
    @TC39249
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
   
   
   @TC291720 @GETENF-4978
		 Scenario: NIC_Ethernet_Reg-Verify data displayed in the Related Tab -  VLAN Segement  circuit
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
    
    
    
   # @TC39211 @Refact
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
    #And I validate the Related  Circuits tab in PON circuit page
    And I validate the Related  "Locations" tab in circuit page  
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page
    
   # @TC287682 @Refact
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
    #And I validate the Related  Circuits tab in PON circuit page
    And I validate the Related  "Locations" tab in circuit page  
    And I validate the Related  "Services" tab in circuit page
    And I validate the Related  "Service Areas" tab in circuit page
    
    @TC39214 @Refact
  Scenario Outline: @TC39214 -CR6350 - US162982 - TC002 - Verify user is able to retrieve OMNIVUE  Audit Logs from Archive table for Circuit   
   Given I am logged in as a "Admin" user in Omnivue  
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Circuit" as Inventory type
    And I select Circuit type as "<Circuit types>"   
    And I click on search button for "Circuit"    
    And I click on view icon in Search Result page     
    When I click on "Edit" in Circuit page
	And I "Update editable fields in the circuit edit screen"
	And I click on "Save" in Circuit page
	When I click on "Edit" in Circuit page
	And I verify "Updated fields in DB for circuit"
	And I click on "Save" in Circuit page
  And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
	Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
   	  
    
 Examples: 
   |Circuit types							|
   |PON												|
   
   
   
  ############################################### EXTRA #########################################
   #################		LAG CIRCUIT		##################################
  #@TC39237_refact @TC122366_refact @CircuitRefact
  #Scenario: @TC39237-TC122366 -Verify Create functionality of LAG CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "LAG" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Circuit Create form with "TC39237" data
    #Then I click on "Create" in Circuit page
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #And I click on "Delete" in Circuit page
    #Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    #
       #@TC39237_refact @TC122366_refact @CircuitRefact
  #Scenario: @TC39237-TC122366 -NIC_Ethernet_Reg-Verify the functionality of Create Button for the Circuit type - LAG
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "LAG" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields in Circuit Create tab with "LAG" data
    #And I select subscriber as "Test - Janet" in Create Circuit Tab
    #And I Associate "1" Circuit "021/GE1/LSVGNVCX902/LSVGNVCAUTO" to LAG Circuit
    #And I Associate "2" Circuit "121/GE1/LSVGNVCX902/LSVGNVCAUTO" to LAG Circuit
    #Then I click on "Create" in Circuit page
    #Then I validate Circuit in Database
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #And I click on "Delete" in Circuit page
    #Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    #Then I validate Circuit in Database
    #
#
 #
#
 # @TC55684_refact @TC39237_refact @TC122366_refact @CircuitRefact
  #Scenario: @TC55684-TC39237-TC122366 -Verify Edit functionality of LAG CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "LAG" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Circuit Create form with "TC55684" data
    #Then I click on "Create" in Circuit page
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #When I click on "Edit" in Circuit page
    #And I "change the name in the circuit edit screen"
    #And I click on "Save" in Circuit page
    #And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    #When I click on "Delete" in Circuit page
    #And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
#
  #
#
  #@TC122366_refact
  #Scenario: @TC122366 -Verify Delete functionality of LAG CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "LAG" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Circuit Create form with "TC122366" data
    #Then I click on "Create" in Circuit page
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #When I click on "Delete" in Circuit page
    #And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"

  #################		TOPOLOGY VIRTUAL CIRCUIT##################################
  @TC239352_refact  @TC122457_refact @CircuitRefact @GETENF-5062
  Scenario: @TC239352-TC122457 -Validate Create functionality of Topology Virtual Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Topology Virtual Circuit" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create form with "TC239352" data
    And I click on "Create" in Circuit page
    Then I verify "Circuit gets created successfully message is displayed"
    And I verify "Log is captured for the Create functionality in Circuit screen"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"

 

  #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
  #@TC122457_refact @CircuitRefact
  @GETENF-5088
  Scenario: @TC122457 -Verify Delete functionality of TOPOLOGY VIRTUAL CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Topology Virtual Circuit" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create form with "TC122457" data
    Then I click on "Create" in Circuit page
    Then I validate Circuit in Database
    Then I verify "Topology Virtual circuit gets created successfully message is displayed"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"

  
    ######################################################################################################
    @TC165302 
Scenario: @TC165302  - Verify Google Sytle Search for Circuit
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Circuit" google search
    And I "click on GO button"
    And I should see the "Circuit Search screen values" been displayed
    
    
 




  

  #################		Optical Bearer CIRCUIT ##################################
 
  #@TC239356_refact @CircuitRefact
  #Scenario: @TC239356 -Verify functionality of Optical Bearer
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "Optical Bearer" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Circuit Create form with "TC239356" data
    #Then I click on "Create" in Circuit page
    #And I verify "Log is captured for the Create functionality in Circuit screen"
    #When I click on "Edit" in Circuit page
    #And I "change the name in the circuit edit screen"
    #And I click on "Save" in Circuit page
    #And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    #When I click on "Delete" in Circuit page
    #And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
#
  #	Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
  #
 
  #################		Ethernet Bearer CIRCUIT##################################
  #@TC119152_refact @TC122362_refact  @CircuitRefact
  #Scenario: @TC119152-TC122362 -Verify Create functionality of Ethernet Bearer CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "Ethernet Bearer" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Circuit Create form with "TC119152" data
    #And I click on "Create" in Circuit page
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #And I click on "Delete" in Circuit page
    #Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
     
       #@TC119152_ref @TC122362 @CircuitRefact
  #Scenario: @TC119152-TC122362-TC239357-NIC_Ethernet_Reg-Verify the functionality of Create Button for the Circuit type - Ethernet Bearer Circuit
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "Ethernet Bearer" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields in Circuit Create tab with "Ethernet" data
    #And I select subscriber as "TEST DELETE" in Create Circuit Tab
    #And I Select Start Device as "MLTWPAAI111-111" and End Device as "MLTWPAAI213-234" in Circuit Create tab
    #Then I click on "Create" in Circuit page
    #Then I validate Circuit in Database
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #And I click on "Delete" in Circuit page
    #Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    #Then I validate Circuit in Database
    #

  #@TC239357_refact  @CircuitRefact
  #Scenario: @TC239357 -Verify Edit functionality of Ethernet Bearer CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
    #And I select "Ethernet Bearer" as the Circuit type in Create Tab
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Circuit Create form with "TC239357" data
    #Then I click on "Create" in Circuit page
    #And I verify "Circuit gets created successfully message is displayed"
    #Then I verify "Log is captured for the Create functionality in Circuit screen"
    #When I click on "Edit" in Circuit page
    #And I "change the name in the circuit edit screen"
    #And I click on "Save" in Circuit page
    #And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
    #When I click on "Delete" in Circuit page
    #And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
    #
  
  #@TC122362_refact  @CircuitRefact
  @GETENF-5087 
  Scenario: @TC122362 -Verify delete circuit functionality - Ethernet Bearer
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Ethernet Bearer" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create form with "TC122362" data
    Then I click on "Create" in Circuit page
    And I verify "Circuit gets created successfully message is displayed"
    Then I verify "Log is captured for the Create functionality in Circuit screen"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
    
    #########################################################################################################################

  @TC256967 
  Scenario: @TC256967 -Verify a new value on the Transport Type for Create Page of Ethernet Bearer Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Ethernet Bearer" Circuit type under Create Tab
    And I click the "Launch Create Form" button
    Then I verify Transport type has EOVDSL2 in Ethernet Bearer create form

  #################	PON Circuit ##################################
  #	Test Data dependent test case need to move it to Manual
  #@TC239353
  #Scenario: @TC239353 -Verify Create functionality of PON CIRCUIT
  #    Given I am logged in as a "Admin" user in Omnivue
  #    And I click on "Create" tab
  #    And I go to "Inventory" type and select "Circuit"
  #		And I select "PON" as the Circuit type in Create Tab
  #		And I click the "Launch Create Form" button
  #		And I fill all the mandatory fields present in Circuit Create form with "TC239353" data
  #		Then I click on "Create" in Circuit page
  #		And I click on "Delete" in Circuit page
 
  @TC122459
  Scenario: @TC122459 -Verify Delete functionality of VLAN Segment CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "VLAN Segment" as the Circuit type in Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Circuit Create form with "TC39239" data
    Then I click on "Create" in Circuit page
    And I verify "Circuit gets created successfully message is displayed"
    Then I verify "Log is captured for the Create functionality in Circuit screen"
    When I click on "Delete" in Circuit page
    And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
    Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
    Then I validate Circuit in Database

  #TC239354	Validate VLAN segment Circuit
  #TC39236	Verify the functionality of Create Button for the Circuit type
  # Functional Test case need to verify with NIC Ethernet team do we have regression test case related to below
  #@TC146329 @TC146343 @TC146346 @TC146347 @TC146438 @TC146439 @TC146440 @TC148842
  # Scenario Outline: Validate whether user able to add new circuits with a valid Facility Type (or Service code) for a given transport type and circuit service type as NMI
  # 		Given I am logged in as a "Admin" user in Omnivue
  #   	When I click on "Create" tab
  #  		And I go to "Inventory" type and select "Circuit"
  #  		And I select "<Circuit Type>" Circuit type under Create Tab
  #			And I click the "Launch Create Form" button
  #		 	Then I verify Transport type has EOVDSL2 in Ethernet Bearer create form
  #		 Examples:
  #    |Circuit Type		|
  # @TC146702
  #  Scenario: Validate whether user able to add new circuits with a valid Facility Type (or Service code)  for  transport type  as NULL
  #  		Given I am logged in as a "Admin" user in Omnivue
  #     	When I click on "Create" tab
  #   		And I go to "Inventory" type and select "Circuit"
  #   		And I select "Ethernet Bearer" Circuit type under Create Tab
  #			And I click the "Launch Create Form" button
  #		 	Then I verify Transport type has EOVDSL2 in Ethernet Bearer create form
  

  ##############################################################################################################################################


  
   
    
