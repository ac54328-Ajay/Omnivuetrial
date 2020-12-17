@Create_Inventory  @Create_Inventory_Circuit @Regression
Feature: Create - Inventory - Circuit Side Validation 

			
#################		Optical Bearer CIRCUIT ##################################

#################		Optical Bearer CIRCUIT ##################################
@TC1191661 @TC239356 @TC287655
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
		And I "change the name in the circuit edit screen"
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

@TC239356 
Scenario: @TC239356 -Verify functionality of Optical Bearer
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Optical Bearer" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC239356" data
		Then I click on "Create" in Circuit page
			#And I verify "Log is captured for the Create functionality in Circuit screen"
		When I click on "Edit" in Circuit page
		And I "change the name in the circuit edit screen"
		And I click on "Save" in Circuit page
		And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
			When I click on "Delete" in Circuit page	
			And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
		#	Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
			
			
#################		TOPOLOGY VIRTUAL CIRCUIT##################################

@TC239352 
Scenario: @TC239352 -Validate Create functionality of Topology Virtual Circuit
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

@TC55681 
Scenario: @TC55681 -Verify Edit functionality of TOPOLOGY VIRTUAL CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Topology Virtual Circuit" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC55681" data
		Then I click on "Create" in Circuit page
			#And I verify "Log is captured for the Create functionality in Circuit screen"
		When I click on "Edit" in Circuit page
		And I "change the name in the circuit edit screen"
		And I click on "Save" in Circuit page
		And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
		#Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
			When I click on "Delete" in Circuit page	
			And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
			#Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
			
			
@TC122457 
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
			


#################		Ethernet Bearer CIRCUIT##################################

@TC119152 
Scenario: @TC119152 -Verify Create functionality of Ethernet Bearer CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue   
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
	
@TC239357 
Scenario: @TC239357 -Verify Edit functionality of Ethernet Bearer CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Ethernet Bearer" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC239357" data
		Then I click on "Create" in Circuit page	
		And I verify "Circuit gets created successfully message is displayed"
		Then I verify "Log is captured for the Create functionality in Circuit screen"	
		When I click on "Edit" in Circuit page	
		And I "change the name in the circuit edit screen"
		And I click on "Save" in Circuit page
		And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
		When I click on "Delete" in Circuit page	
		And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
		
@TC122362 
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

	@TC256967 
   Scenario: @TC256967 -Verify a new value on the Transport Type for Create Page of Ethernet Bearer Circuit
  		Given I am logged in as a "Admin" user in Omnivue
     	When I click on "Create" tab    
   		And I go to "Inventory" type and select "Circuit"
   		And I select "Ethernet Bearer" Circuit type under Create Tab 		
			And I click the "Launch Create Form" button
		 	Then I verify Transport type has EOVDSL2 in Ethernet Bearer create form
		 	
		 	
#################		LAG CIRCUIT		##################################
## below TCs are present in regression folder######
#
#@TC39237 
#Scenario: @TC39237 -Verify Create functionality of LAG CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue   
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
#		And I select "LAG" as the Circuit type in Create Tab
#		And I click the "Launch Create Form" button
#		And I fill all the mandatory fields present in Circuit Create form with "TC39237" data
#		Then I click on "Create" in Circuit page		
#		And I verify "Circuit gets created successfully message is displayed"
#		Then I verify "Log is captured for the Create functionality in Circuit screen"	
#		And I click on "Delete" in Circuit page	
#		Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
#	
#		
#@TC55684 
#Scenario: @TC55684 -Verify Edit functionality of LAG CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue   
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
#		And I select "LAG" as the Circuit type in Create Tab
#		And I click the "Launch Create Form" button
#		And I fill all the mandatory fields present in Circuit Create form with "TC55684" data
#		Then I click on "Create" in Circuit page		
#		And I verify "Circuit gets created successfully message is displayed"
#		Then I verify "Log is captured for the Create functionality in Circuit screen"	
#		When I click on "Edit" in Circuit page	
#		And I "change the name in the circuit edit screen"
#		And I click on "Save" in Circuit page
#		And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
#		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
#		When I click on "Delete" in Circuit page	
#		And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
#		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
#		
#@TC122366 
#Scenario: @TC122366 -Verify Delete functionality of LAG CIRCUIT
    #Given I am logged in as a "Admin" user in Omnivue   
    #When I click on "Create" tab
    #And I go to "Inventory" type and select "Circuit"
#		And I select "LAG" as the Circuit type in Create Tab
#		And I click the "Launch Create Form" button
#		And I fill all the mandatory fields present in Circuit Create form with "TC122366" data
#		Then I click on "Create" in Circuit page		
#		And I verify "Circuit gets created successfully message is displayed"
#		Then I verify "Log is captured for the Create functionality in Circuit screen"		
#		When I click on "Delete" in Circuit page	
#		And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
#		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
#		
		
		
		
		
#TC239355	Validate LAG CIRCUIT


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


#################	VLAN Segment ##################################

@TC39239 
Scenario: @TC39239 -Verify Create functionality of VLAN Segment CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "VLAN Segment" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC39239" data
		And I click on "Create" in Circuit page		
		And I verify "Circuit gets created successfully message is displayed"
		Then I verify "Log is captured for the Create functionality in Circuit screen"	
		And I click on "Delete" in Circuit page	
		Then I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"		
		
@TC55685 
Scenario: @TC55685 -Verify Edit functionality of VLAN Segment CIRCUIT
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "VLAN Segment" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I fill all the mandatory fields present in Circuit Create form with "TC39239" data
		Then I click on "Create" in Circuit page		
		And I verify "Circuit gets created successfully message is displayed"
		Then I verify "Log is captured for the Create functionality in Circuit screen"	
		When I click on "Edit" in Circuit page	
		And I "change the name in the circuit edit screen"
		And I click on "Save" in Circuit page
		And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
		When I click on "Delete" in Circuit page	
		And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
		Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action"
		
		
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

    #################		 PW Unrouted (Path) CIRCUIT ###################################################
    
    #@TC287592 @TC287623 @TC287657 @Refact
Scenario: @TC287592-TC287623-TC287657 - NIC_GPON_Reg-Verify the functionality of Create Button for the Circuit type - Pseudo Wire Circuit
   Given I am logged in as a "Admin" user in Omnivue   
   When I click on "Create" tab
  And I go to "Inventory" type and select "Circuit"
	And I select "Pseudo Wire" as the Circuit type in Create Tab
	And I click the "Launch Create Form" button
	And I fill all the mandatory fields present in Circuit Create for "PW Unrouted"
	Then I click on "Create" in Circuit page
	Then I validate Circuit in Database
	And I verify "Log is captured for the Create functionality in Circuit screen"
		When I click on "Edit" in Circuit page
	And I "Update editable fields in the circuit edit screen"
	And I click on "Save" in Circuit page
	When I click on "Edit" in Circuit page
	And I verify "Updated fields in DB for circuit"
	And I click on "Save" in Circuit page
  And I verify "Circuit edit Successfully-message should be displayed in the circuit page"
	Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
	When I click on "Delete" in Circuit page	
	And I verify "Circuit Deleted Successfully.-message should be displayed in the circuit page"
	Then I validate Circuit in Database
	
	
		##############################################################################################################################################