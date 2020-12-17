 @Sanity_check @GDB-Sanity @OVSanity_Suite
Feature: GDB Sanity Validations
	Validate the GDB Devices are working as expected every build
	
	 Background: Setup base Search criteria before specific search type
Given I am logged in as a "Admin" user in Omnivue

@GDB_Createlaunch 
Scenario: @GDB_Createlaunch -Validate GDB Create form Launch
Given I Click on "Create" tab in Omnivue Activation Screen 
 And I go to "Network Build" type and select "GPON Device Build"
 And I Launch the Network form with "GPON Details"  
#And I should be able to select "GPON Device Build" and launch GDB create form 
Then I should see the "GDB boxes & its related icons" been displayed
And I select "OLT" as GDB-Component
And I clicked on Expand button for "OLT" box in GDB Screen
Then I verify "GDB field drop down values is displayed in create screen"

@GDB_Searchlaunch
Scenario: @GDB_Searchlaunch -Validate GDB Search Launch
Given I Click on "Search" tab in Omnivue Activation Screen
When I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Device Build" in Search tab 
		And I search with "Initiated By" criteria in Search Tab
		And I click on search button for "Network" 
		And I click on view icon in Search Result page
		Then I should see the "GDB boxes & its related icons" been displayed