 @Sanity_check @Networkorder_Sanity @OVSanity_Suite 
Feature: Networkorder Sanity Validations
	Validate the Networkorder are working as expected	


@Networkorder_Createlaunch 
Scenario: @Networkorder_Createlaunch -Validate Network order Create form Launch
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Create" tab in Omnivue Activation Screen
  And I go to "Network Build" type and select "Alternate Equipment Build"
And I click the "Launch Create Form" button
Then I should see the "Alternate Equipment Build screen" been displayed


@Networkorder_Searchlaunch
Scenario: @Networkorder_Searchlaunch -Validate Network order Search Launch
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I search with "Initiated By" criteria in Search Tab
		And I click on search button for "Network" 
		And I click on view icon in Search Result page
		Then I should see the "Alternate Equipment Build screen" been displayed
		#Then I should see the "Network Order screen attributes" been displayed
