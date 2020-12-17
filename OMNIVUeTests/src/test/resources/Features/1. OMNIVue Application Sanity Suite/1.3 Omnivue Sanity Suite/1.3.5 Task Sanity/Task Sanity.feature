 @Sanity_check @Task_Sanity @OVSanity_Suite  
Feature: Omnivue Task Sanity Check


@Task_Searchlaunch 
  Scenario Outline: @Task_Searchlaunch  -Validate Task Search Launch for "<Task Types>"
    Given I am logged in as a "Admin" user in Omnivue 
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "<Task Types>" from Task name dropdown    
    And I click on search button for "Task"
    And I click on view icon in Search Result page   
		Then I should see the "Task Search screen attributes" been displayed 
		
		Examples: 
  	|Task Types								|
		|Manually create location	|	
		|ONT Out Of Capacity			|