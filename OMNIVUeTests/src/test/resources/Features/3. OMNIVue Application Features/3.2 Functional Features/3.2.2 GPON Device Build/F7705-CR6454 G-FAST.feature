@F7705
Feature: F7705 - CR6454 G.FAST-[Inventory Build] DSLAM and MOE Connection Inventory
	As an inventory user, I need the ability to create G.Fast DSLAMs, device attributes, and transport paths/DSL OVCs so that I can support subscriber qualification, provisioning, activation, dispatch, and service assurance activities.
	
	
	
	#########################################################################################################################################################
	################################################  								 GFAST IST FLOW						################################################
	#########################################################################################################################################################
	
	
	@F7705
Scenario: Validating the GFAST Order in OMNIVUE Application
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab	
		And I select "Tasks" in Search Tab
		And I search for the GFAST-Order from common sheet
		And I click on search button for "Task"  
		Then I validate for task result in Omnivue
	
	
	#########################################################################################################################################################
	###		US121621-[Spike Session Needed] CR5464 G.FAST - OV Create Transport Path to Allow Optical Bearer Circuits on initial Device Selection #####
	
	
	
	 @US121621 @TC153824
   	Scenario: CR5464 G.FAST - OV Validation of create Transport path on GFAST DSLAM which does not have Optical Bearer associated.
   	Given I am logged in as a "Admin" user in Omnivue
   	When I Click on "Create" tab in Omnivue Activation Screen    
    And I go to "Network Build" type and select "Transport Path"
		And I should see the following Device roles "DSLAM" under Create Tab
		And I click on Launch create form after entering the GFAST DSLAM device as "AURSCOYW23D-QWEST123"
		And I select "Optical Bearer" option from the Dialogue box
		And I click "OK" on the pop-up box displayed asking Whether to create new circuit 
		Then I need to validate "Create Optical Bearer Circuit" create form gets launched
		
	 @US121621 @TC153824-1
   	Scenario: CR5464 G.FAST - OV Validation of create Transport path on GFAST DSLAM which does not have Ethernet Bearer associated.
   	Given I am logged in as a "Admin" user in Omnivue
   	When I Click on "Create" tab in Omnivue Activation Screen    
    And I go to "Network Build" type and select "Transport Path"
		And I should see the following Device roles "DSLAM" under Create Tab
		And I click on Launch create form after entering the GFAST DSLAM device as "AURSCOYW23D-QWEST123"
		And I select "Ethernet Bearer" option from the Dialogue box
		And I click "OK" on the pop-up box displayed asking Whether to create new circuit 
		Then I need to validate "Create Ethernet Bearer Circuit" create form gets launched	
	
	#########################################################################################################################################################