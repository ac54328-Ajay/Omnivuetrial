@Create_Inventory  @Create_Inventory_Number @Regression
Feature: Number Create form 


#########################################	PW-ID  	#########################################

@TC118961
 Scenario: @TC118961 -Verify entry is made in Audit log tab when new PW-ID Number is created
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "PW-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118961" data
	     And I "select object type as Port & fill the details in Number page"
	     And I click on "Create" button in Number Screen
 				And I click on "Audit Tab" button in Number Screen
	     Then I verify "Create log is registered in Audit log for Number"     
	      And I click on "Delete" button in Number Screen
	      
 @TC209525 
   Scenario: @TC209525 -OV Validate the Edit and Save functionality for PW-ID number details page
	 	Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "PW-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118961" data
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
	     
	@TC264767
   Scenario: @TC264767 -PW-ID Number - Verify delete number functionality
	 	Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "PW-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118961" data
	     Then I click on "Create" button in Number Screen	     
			 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
	     And I click on "Audit Tab" button in Number Screen
	     And I verify "Delete log is registered in Audit log for Number"



#########################################	SDP 	#########################################

@TC118948 @TC118965
 Scenario: @TC118948 -Verify the create functionality of SDP Number
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "SAP" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118947" data
	     And I "select object type as Port & fill the details in Number page"
	     And I click on "Create" button in Number Screen
	     And I "launch the SDP Number type Create form & fill the mandatory fields"
 				And I click on "Create" button in Number Screen
 					And I click on "Audit Tab" button in Number Screen
			 Then I verify "Create log is registered in Audit log for Number"  
			    And I click on "Delete-Number" button in Number Screen
	
@TC264757
 Scenario: @TC264757 -SDP  Number - Verify edit functionality
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "SAP" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118947" data
	     And I "select object type as Port & fill the details in Number page"
	     And I click on "Create" button in Number Screen
	     And I "launch the SDP Number type Create form & fill the mandatory fields"
 				And I click on "Create" button in Number Screen
 				 And I click on "Edit" button in Number Screen 
  		And I changed the "Name, Alias, Provision Status and Note field values" in Number screen
     And I click on "Save" button in Number Screen
			And I verify "Number updated successfully message is displayed on clicking on Save button in Number page"
			  And I click on "Audit Tab" button in Number Screen
	     And I verify "Update log is registered in Audit log for Number" 
			    And I click on "Delete-Number" button in Number Screen
			    
@TC264758
 Scenario: @TC264758 -SDP  Number - Verify delete number functionality
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "SAP" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118947" data
	     And I "select object type as Port & fill the details in Number page"
	     And I click on "Create" button in Number Screen
	     And I "launch the SDP Number type Create form & fill the mandatory fields"
 				And I click on "Create" button in Number Screen
 					And I click on "Audit Tab" button in Number Screen
			 Then I verify "Create log is registered in Audit log for Number"  
			    And I click on "Delete-Number" button in Number Screen		    
			     Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
			    And I click on "Audit Tab" button in Number Screen
	     And I verify "Delete log is registered in Audit log for Number"
	     
#########################################	SAP 	#########################################

@TC118947
 Scenario: @TC118947 -Verify the create functionality of SAP Number
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "SAP" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118947" data
	     And I "select object type as Port & fill the details in Number page"
	     And I click on "Create" button in Number Screen
 				And I click on "Audit Tab" button in Number Screen
	     Then I verify "Create log is registered in Audit log for Number"     
	      And I click on "Delete" button in Number Screen
	      
	     @TC264700 
   Scenario: @TC264700 -SAP Number - Verify edit functionality
	 	Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "SAP" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118947" data
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
	     
	     	 @TC264701
   Scenario: @TC264701 -SAP Number - Verify delete number functionality
	 	Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "SAP" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118947" data
	     Then I click on "Create" button in Number Screen	     
			 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
	     And I click on "Audit Tab" button in Number Screen
	     And I verify "Delete log is registered in Audit log for Number"
 				
#########################################	MEP-ID 	#########################################

@TC118944
 Scenario: @TC118944 -Verify the create functionality of MEP-ID Number
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "MEP-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118944" data
	     And I "select object type as Port & fill the details in Number page"
	     And I click on "Create" button in Number Screen
 				And I click on "Audit Tab" button in Number Screen
	     Then I verify "Create log is registered in Audit log for Number"     
 				And I click on "Delete" button in Number Screen

@TC264666 
   Scenario: @TC264666 -MEP-ID Number - Verify edit functionality
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "MEP-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118944" data
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
	     
	     @TC264667
	Scenario: @TC264667 -MEP-ID Number - Verify data displayed in the Related tab Service of Number 360 view
	 	Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "MEP-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118944" data
	     Then I click on "Create" button in Number Screen
	     And In the 360 view I click on the "Services" tab
  		Then I verify "DSL OVC in Related Tab is matching with Associated Inventory section in Number page"
				 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
			 
	
			 @TC264668
   Scenario: @TC264668 -MEP-ID Number - Verify delete number functionality
	 	Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "MEP-ID" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC118944" data
	     Then I click on "Create" button in Number Screen	     
			 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
			And I click on "Audit Tab" button in Number Screen
	     And I verify "Delete log is registered in Audit log for Number"
	     
#########################################	CE-VLAN		#########################################	

@TC118951 @GETENF-5085 @GETENF-5079
 Scenario: @TC118951 -Verify the create functionality of CE-VLAN Number with Object Type as Port
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "CE-VLAN" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC122316" data
	     And I "select object type as Port & fill the details in Number page"
	     Then I click on "Create" button in Number Screen
	     And I click on "Edit" button in Number Screen 
  		And I changed the "Name, Alias, Provision Status and Note field values" in Number screen
     And I click on "Save" button in Number Screen
			And I verify "Number updated successfully message is displayed on clicking on Save button in Number page"
			 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"

@TC122316 
   Scenario: @TC122316 -CE-VLAN Number - Verify edit functionality
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "CE-VLAN" under Number Create slider			
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC122316" data
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
			 
			 
	@TC55340
	Scenario: @TC55340 -CE-VLAN Number - Verify data displayed in the Related tab Service of Number 360 view
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	  	And I select Technology type "CE-VLAN" under Number Create slider
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC122316" data
	     Then I click on "Create" button in Number Screen
	     And In the 360 view I click on the "Services" tab
  		Then I verify "DSL OVC in Related Tab is matching with Associated Inventory section in Number page"
				 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
			 
#		@TC122316
#   Scenario: CE-VLAN Number - Verify edit functionality
#	 		Given I am logged in as a "Admin" user in Omnivue   
#	    And I click on "Create" tab
#	    And I go to "Inventory" type and select "Number"  
#	  		And I select Technology type "CE-VLAN" under Number Create slider
#	    And I click the "Launch Create Form" button
#	     And I fill all the mandatory fields present in Number Create form with "TC122316" data
#	     Then I click on "Create" button in Number Screen
#	     And I click on "Edit" button in Number Screen 
#  		And I changed the "Name, Alias, Provision Status and Note field values" in Number screen
#     And I click on "Save" button in Number Screen
#			And I verify "Number updated successfully message is displayed on clicking on Save button in Number page"
#			 And I click on "Delete" button in Number Screen
#			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
			 
			 	 
			 @TC122276
   Scenario: @TC122276 -CE-VLAN Number - Verify delete number functionality
	 		Given I am logged in as a "Admin" user in Omnivue   
	    And I click on "Create" tab
	    And I go to "Inventory" type and select "Number"  
	 	And I select Technology type "CE-VLAN" under Number Create slider
	    And I click the "Launch Create Form" button
	     And I fill all the mandatory fields present in Number Create form with "TC122316" data
	     Then I click on "Create" button in Number Screen	     
			 And I click on "Delete" button in Number Screen
			 Then I verify "Number deleted successfully message is displayed on clicking on Delete button in Number page"
		And I click on "Audit Tab" button in Number Screen
	     And I verify "Delete log is registered in Audit log for Number"
	