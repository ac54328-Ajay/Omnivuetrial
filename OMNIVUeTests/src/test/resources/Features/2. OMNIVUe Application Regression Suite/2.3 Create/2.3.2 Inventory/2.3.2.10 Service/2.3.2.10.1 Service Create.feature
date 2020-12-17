@Create_Inventory @Create_Inventory_Service @Regression @Service_Reg_Run1
Feature: Service Create form


 #############################	`	MEF ENNI Service    #############################	
 
 ##########		Need to Rework on the complete apporach		###################
 @TC39243 
  Scenario: @TC39243 -Verify Service Association section for the service type MEF ENNI
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Service"
     And I Select "MEF ENNI" for the drop down Service Type  
    And I click the "Launch Create Form" button 
    Then I verify all The Fields depending on selected value from SPEC Code dropdown
 

  @TC84021 
  Scenario: @TC84021 -NIC_Ethernet_Reg_Create MEF ENNI
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Service"
     And I Select "MEF ENNI" for the drop down Service Type  
    And I click the "Launch Create Form" button 
     And I fill all the mandatory fields required in service create form with "MEF ENNI-TC84021 data"
    And I fill the subscriber details in service page 
 
 #############################	`	MEF EVC Service    #############################	
 
 #@TC83472 
  Scenario:  @TC83472 -NIC_Ethernet_Reg_Create MEF EVC_Without Members
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
    
    
 #@TC44385 
  #Scenario: @TC44385 -Verify Migration of Create Activation Task functionality for MEF EVC Service
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab   
    #And I go to "Inventory" type and select "Service" 
    #And I Select "MEF EVC" for the drop down Service Type
    #And I click the "Launch Create Form" button 
    #And I fill all the mandatory fields required in service create form with "MEF EVC-TC44385 data"
    #And I fill the subscriber details in service page
    #And I click on manual activation checkbox in service create form
     #And I click on "Create" button on Service page
    #Then Service should get created successfully
     #And In the 360 view I click on the "Activations" tab 
#		 Then I verify "Activation log must be registered with Activation ID and circuit type in Service view related tab" 
#		  And In the 360 view I click on the "Tasks" tab
    #	And Task should be generated and displayed in related tab Tasks
     #	And I click on "Delete" button on Service page
 #
 
 @TC83613 @TC83613_NIC_Ethernet_Reg_Create_MEF_EVC_with_PM_Type_NID2NID @TCWAST
  Scenario: @TC83613 -Validate user is able to create MEF EVC With member association and PM Type = NID2NID with all the available fields in Create Form
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

  @TC84030 @TC84030_NIC_Ethernet_Reg_Create_MEF_EVC_with_PM_Type_as_BRIX
  Scenario: @TC84030 -Validate user is able to create MEF EVC With member association and PM Type = BRIX with all the available fields in Create Form
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab   
    And I go to "Inventory" type and select "Service" 
    And I Select "MEF EVC" for the drop down Service Type
    And I click the "Launch Create Form" button 
     And I fill all the mandatory fields required in service create form with "MEF EVC with PM BRIX"  
      And I fill the subscriber details in service page
       And I click on "Create" button on Service page
    Then Service should get created successfully
    And I click on Edit
    And I select "Requested" in PM Flag in Service page
    And I select SLA Template "T-MOBILE P1"
   And I click on Save
   And Verify and click on "EVC Members" related system tab
   And Click on Add Member button
   Then Entered the values to add "UNI Member to EVC" member
   And Log out from OMNIVue
   And I click on "Delete" button on Service page   

  
    
    ##############################################################################################################################################    	
     	
    
@TC119251 @TC119316
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
    
   Examples: 
    |Service Type		|Service Test data									|
   	|PROBE UNI			|PROBE UNI Service-TC119251 data		|
    |MEF ENNI				|MEF ENNI Service-TC119251 data			|
    #
  # @TC
  #Scenario: Verify Migration of Create Activation Task functionality for MEF OVC Service
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab 
     #And I go to "Inventory" type and select "Service" 
    #And I Select "MEF OVC" for the drop down Service Type
   #And I click on Launch Create Form for "Service"
     #And I fill all the mandatory fields required in service create form with "MEF OVC-TC44386 data"
#
     #And I fill the subscriber details in service page
#
      #And I click on "Create" button on Service page
    #Then Service should get created successfully
    #
    

 #@TC44385 
  #Scenario: Verify Migration of Create Activation Task functionality for MEF EVC Service
    #Given I am logged in as a "Admin" user in Omnivue
    #When I click on "Create" tab   
    #And I go to "Inventory" type and select "Service" 
    #And I Select "MEF EVC" for the drop down Service Type
    #And I click the "Launch Create Form" button 
    #And I fill all the mandatory fields required in service create form with "MEF EVC-TC44385 data"
    #And I slect a subsciber in Subcriber section
    #And I click on manual activation checkbox in service create form
     #And I click on "Create" button on Service page
    #Then Service should get created successfully
    #And Task should be generated and displayed in related tab Tasks

 
 #TEST1--tbx_name--26/EVC1/012345//AUTO--Need to be changed
   #E2E
   
   
    
    
@US138567 @TC172612
Scenario: OV Validation of the Affiliate Owner fields in DSL OVC Create screen
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "DSL OVC" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed
  	
@TC128903 @GETENF-5027
 Scenario: Validate user is able to Save the note section successfully while Edit Probe UNI
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "Probe UNI" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed
  	
 @TC129641
 Scenario: Verify the CLS format on parent LAG on ENNI Link Create Page
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
  	
  	
 @TC147135
  Scenario: QOS Qualifier(UNI-EVC) value while Edit MEF UNI
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
  	
 @TC157212
  Scenario: MEF ENNI_Create_Spec Code - BGPLU
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
  	
 @TC157213 @TC157819
   Scenario: US122301_MEF ENNI_EDIT_Spec Code - BGPLU
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
  	
  	
 @TC204959
   Scenario: US171334_Create MEF EVC with PM Type as BRIX
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
 
 @TC205006
   Scenario: US171334_Create MEF_EVC with PM Type = NID2NID
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
  
  @TC205070
   Scenario: CR5457_US171334_Create_MEF OVC with PM Type = BRIX
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
 
 @TC205074
   Scenario: US171334_Create MEF_OVC with PM Type = NID2NID
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "ENNI Link" under Create Tab
  	And I click the "Launch Create Form" button
  	Then I should see the "Affiliate Owner field values in DSL OVC Create screen" been displayed	
  	
  @TC55691
  	 Scenario: @TC55691 -Verify the create and edit functionality of MEF ENNI Service
		Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab  
    And I go to "Inventory" type and select "Service"
  	And I select Service type as "MEF ENNI" under Create Tab
  	And I click the "Launch Create Form" button
  	And I fill all the mandatory fields present in Service Create form with "TC55691" data
  	And I select device : "LSVQNVAL"  in "MEF ENNI" Service
    When I click on "Create" button of MEF ENNI page
    Then Service should get created successfully
    
    
    	
    
    
     
  	
 