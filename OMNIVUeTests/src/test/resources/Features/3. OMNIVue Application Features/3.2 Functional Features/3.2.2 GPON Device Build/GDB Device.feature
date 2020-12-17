@GDB
Feature: GDB Sanity Validations
	Validate the GDB Devices are working as expected every build
	
		############################################################################################################
   ######			Read complete Data from Excel									#######################################
   ############################################################################################################
		@GDB_New_test @GDB-OLT @GDB-Device 
   	Scenario: @OV_GDB_New_test Creating OLT Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider  
    And I should be able to select "GPON Device Build" and launch GDB create form 
    And I click the "Launch Create Form" button
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data from excel  
    Then I should see "OLT" Device created successfully in Gpon device build
    
    @GDB_New_test @GDB-FDP12port @GDB-Device
   	Scenario: Creating FDP-12port Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form 
    And I click the "Launch Create Form" button
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data from excel
    #And I create "FDP-12port" device with data from common share excel     
    And I should see "FDP-12port" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet
    
    @GDB_New_test @GDB-SPLITTER @GDB-Device
		Scenario: Creating SPLITTER Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form
    And I click the "Launch Create Form" button
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data from excel
    #And I create "SPLITTER" device with data from common share excel   
    And I should see "SPLITTER" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet
    
    @GDB_New_test @GDB-FDP144port @GDB-Device
    Scenario: Creating FDP-144port Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form
    And I click the "Launch Create Form" button
    And I select "FDP-144port" as GDB-Component
    And I create "FDP-144port" device with all the valid data from excel
    #And I create "FDP-144port" device with data from common share excel      
    And I should see "FDP-144port" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet

    
    
    @GDB_New_test @GDB-MST  @GDB-Device
    Scenario: Creating MST Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form
    And I click the "Launch Create Form" button
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data from excel
    #And I create "MST" device with data from common share excel       
    And I should see "MST" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet
    
    @GDB_New_test @GDB-ONT  @GDB-Device  
    Scenario: Creating ONT Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form
    And I click the "Launch Create Form" button
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data from excel
    #And I create "ONT" device with data from common share excel     
    And I should see "ONT" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet     
     
        
   @GDB_New_test @GDB-Fiber_link  @GDB-Device 
		Scenario: Creating Fiber link between GPON Device Build component   	
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" and launch GDB create form
    And I click the "Launch Create Form" button
    And I validate GDB Device Build component
    And I add the fiber link between the GDB device 
    #Then I create fiber-link between the GDB device & write into excel sheet
    

     
     @GDB_New_test @GDB-Service_area  
    Scenario: Associate Service areas to the Devices
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I need to validate "MST" device in GDB
    And I select "Service Area" as GDB-Component
    And I create Service Area with valid data from excel
    And I should be able to Associate Service area to valid location
    #And I should be able to Associate Service areas to the GDB Devices 
    #Then I write the service area data into the excelsheet
	Then I should write the Gpon device build-excel file
	
    

		
	############################################################################################################
   ######			Read Data from Excel									#######################################
   ############################################################################################################
   
	
	@GDB_New @GDB-OLT @GDB-Device 
   	Scenario: Creating OLT Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider  
 		And I should be able to select "GPON Device Build" under "Network Build" create type    
    And I click the "Launch Create Form" button
    And I select "OLT" as GDB-Component   
    And I create "OLT" device with data from common share excel     
    Then I should see "OLT" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet 
   
   
   @GDB_New @GDB-FDP12port @GDB-Device
   	Scenario: Creating FDP-12port Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with data from common share excel     
    And I should see "FDP-12port" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet
    
    @GDB_New @GDB-SPLITTER @GDB-Device
		Scenario: Creating SPLITTER Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with data from common share excel   
    And I should see "SPLITTER" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet
    
    @GDB_New @GDB-FDP144port @GDB-Device
    Scenario: Creating FDP-144port Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "FDP-144port" as GDB-Component
    And I create "FDP-144port" device with data from common share excel      
    And I should see "FDP-144port" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet

    
    
    @GDB_New @GDB-MST  @GDB-Device
    Scenario: Creating MST Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "MST" as GDB-Component
    And I create "MST" device with data from common share excel       
    And I should see "MST" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet
    
    @GDB_New @GDB-ONT  @GDB-Device  
    Scenario: Creating ONT Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "ONT" as GDB-Component
    And I create "ONT" device with data from common share excel     
    And I should see "ONT" Device created successfully in Gpon device build
    #Then I should write the GDB Device into the excel sheet 
        
   @GDB_New1 @GDB-Fiber_link  @GDB-Device
		Scenario: Creating Fiber link between GPON Device Build component   	
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I validate GDB Device Build component
    And I add the fiber link between the GDB device 
    #Then I create fiber-link between the GDB device & write into excel sheet
    

     
      @GDB_New1 @GDB-Service_area  
    Scenario: Associate Service areas to the Devices
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I need to validate "MST" device in GDB
    And I select "Service Area" as GDB-Component
    And I should be able to Associate Service areas to the GDB Devices 
    #Then I write the service area data into the excelsheet
		Then I should write the Gpon device build-excel file
	
	
	
	
	
	
	
	
	
	
	
	
	############################################################################################################
   ######			Create a Modular scripts for each devices									#######################################
   ############################################################################################################
   
   @GDB @GDB-OLT @GDB-Device 
   	Scenario: Creating OLT Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "OLT" as GDB-Component
    And I create "OLT" device with all the valid data  
    And I should see "OLT" Device created successfully in Gpon device build
   
   
   
   @GDB @GDB-FDP12port @GDB-Device
   	Scenario: Creating FDP-12port Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "FDP-12port" as GDB-Component
    And I create "FDP-12port" device with all the valid data  
    Then I should see "FDP-12port" Device created successfully in Gpon device build

    @GDB @GDB-SPLITTER @GDB-Device
		Scenario: Creating SPLITTER Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "SPLITTER" as GDB-Component
    And I create "SPLITTER" device with all the valid data  
    Then I should see "SPLITTER" Device created successfully in Gpon device build
    
    @GDB @GDB-FDP144port @GDB-Device
    Scenario: Creating FDP-144port Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "FDP-144port" as GDB-Component
    And I create "FDP-144port" device with all the valid data  
    Then I should see "FDP-144port" Device created successfully in Gpon device build
    
    
    @GDB @GDB-MST  @GDB-Device
    Scenario: Creating MST Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data  
    Then I should see "MST" Device created successfully in Gpon device build
    
    @GDB @GDB-ONT  @GDB-Device  
    Scenario: Creating ONT Device in GPON Device Build
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data  
    Then I should see "ONT" Device created successfully in Gpon device build
        
   @GDB @GDB-Fiber_link  @GDB-Device 
		Scenario: Creating Fiber link between GPON Device Build component   	
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I validate GDB Device Build component
    Then I add the fiber link between the GDB device  
    

     
      @GDB @GDB-Service_area  
    Scenario: Associate Service areas to the Devices
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Network Build" in Create slider
    And I should be able to select "GPON Device Build" under "Network Build" create type
    And I click the "Launch Create Form" button
    And I need to validate "MST" device in GDB
    And I select "Service Area" as GDB-Component
    And I should be able to Associate Service areas to the GDB Devices 
    Then I should write the Gpon device build-excel file
   
       ################################################################
       
       #US92208-- Only allow on GPON or Passive Device Role
       #US92211--	Only Allow when Device is Created
   
   	

    ############################################################################################################  
   
   @GDB1 @GDBExcel1
Scenario: Creating Fiber link
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab	
		And I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Device Build" in Search tab 
		And I search for "9303" Gpon Build
		And I click on search button for "Network"  
		#And I click on the "Build ID" in Network result page 
		And I click on view icon in Search Result page
		Then I should write the Gpon device build-excel file
		
		 #When I click on "Search" tab	
		#And I select "Network Build" in Search Tab 		
		#And I select Network type as "GPON Device Build" in Search tab 
		#And I search for "23039" Gpon Build
		#And I click on search button for "Network" 
   	#And I click on view icon in Search Result page
   #	And I select "OLT" device from the GPON Device build
   
   
	#US95677--CR4701 GPON - FBL Status indicators
	
	@GDB1 @TESTINGGDB @US95677 @TC154432 @TC154433
Scenario: Creating Fiber link
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab	
		And I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Device Build" in Search tab 
		And I search for "8789" Gpon Build
		And I click on search button for "Network"  
		#And I click on the "Build ID" in Network result page 
		And I click on view icon in Search Result page
		Then I add the fiber link between the GDB device
		


 
   
@US115767 @TC129762
Scenario: Creating GDB Device 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I create "OLT" device in GDB
    And I create "FDP-12port" device in GDB
   	And I create "SPLITTER" device in GDB
   	And I create "FDP-144port" device in GDB
   	And I create "MST" device in GDB
    And I create "ONT" device in GDB
    Then I add a Card to "GDB-OLT" Device
   And I add the fiber link between the GDB device  
   
     
  
  

   
        
 @GDB1 @GDBSanity
Scenario: GDB Attributes validations
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I Select "OLT" device in GDB
    Then I validate "OLT" attributes in create form for "GPON Device Build" 
    
  
    
   
     
     
   
   
    
    
    

    


     
   

     
   
    

   #########################################################################################################################################################
   
      ##################  Sprint 211  ########  US166829 -- [CoD: 4] HD00009516218 & HD00009499408- Consumer GPON-FDN port is disappearing from GDB screens  ## ##########  Pending
      
      @US166829
       Scenario: OV Test: Validate the ports available after deletion of Fiber link GDB & Ports 
  Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"  
    And I select "MST" as GDB-Component
    And I create "MST" device with all the valid data  
    And I select "ONT" as GDB-Component
    And I create "ONT" device with all the valid data     
    
    

   