@Search_DefectTask
Feature: Defect Task related validations

		
#@TC216210
    Scenario: @TC216210 -NIC_Ethernet_Reg_To Validate Defect Task - Release action
  	Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
		And I go to "Tasks" search type and select "Defect Tasks" as Task Type
		And I select "Open" from Task status 
		And I click on search button for "Defect Task"
		And I Validate is search results tab is displayed for Defect task search
		And I Click on "Edit" button on the Open Task in Defect task search	
		Then I verify "Assigned To & Task Status should get updated to Assigned state"	
   	And I click on "Release" button action on Defect task
   	Then I should see the "Defect task released successfully message" been displayed
   	Then I verify "Assigned To & Task Status should get updated to open state"
  
  
#@TC206824
    Scenario: @TC206824 -To Validate if user is able to "Save" the existing defect task
  	Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
		And I go to "Tasks" search type and select "Defect Tasks" as Task Type
		And I select "Open" from Task status 
		And I click on search button for "Defect Task"
		And I Validate is search results tab is displayed for Defect task search
		And I Click on "Edit" button on the Open Task in Defect task search	
		Then I verify "Assigned To & Task Status should get updated to Assigned state"	
		And I Click on "Save" button on the Open Task in Defect task search	
		   	Then I should see the "Defect task details saved successfully" been displayed
   	And I click on "Release" button action on Defect task
   	Then I should see the "Defect task released successfully message" been displayed
   	Then I verify "Assigned To & Task Status should get updated to open state" 	
   	
   	#@TC216210
    Scenario: @TC216210 -NIC_Ethernet_Reg_To Validate Defect Task - Release action
  	Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
		And I go to "Tasks" search type and select "Defect Tasks" as Task Type
		And I select "Open" from Task status 
		And I click on search button for "Defect Task"
		And I Validate is search results tab is displayed for Defect task search
		And I Click on "Edit" button on the Open Task in Defect task search	
		Then I verify "Assigned To & Task Status should get updated to Assigned state"		
   	And I click on "Release" button action on Defect task
   	Then I should see the "Defect task released successfully message" been displayed
   	Then I verify "Assigned To & Task Status should get updated to open state" 	
   	

		
		
		#@TC238991 
		Scenario: @TC238991 -To Validate View all tag button in list view
		Given I am logged in as a "Admin" user in Omnivue		
		When I click on "Gear Icon" in Omnivue Homepage
		And I select "Manage Tags" under the Gear Icon
		And I create "a new Tag as AUTO Test"
		Then I verify "Verify AUTO Test Tag name is displayed in Manage Tags Search result page"
		And I click on "View All Tags button" in Manage tags page
		And I verify "Excel & Print Icon displayed in Tag search result page"
	  Then I click on "Search" tab
		And I go to "Tasks" search type and select "Defect Tasks" as Task Type
		And I select "Open" from Task status 
		And I click on search button for "Defect Task"
		And I Validate is search results tab is displayed for Defect task search
		And I Click on "Edit" button on the Open Task in Defect task search	
		And I select "Test Auto value from Tags dropdown" in Defect task search
   	And I Click on "Save Tag Action" button on the Open Task in Defect task search
   	And I click on "Release" button action on Defect task
 		When I click on "Gear Icon" in Omnivue Homepage
		And I select "Manage Tags" under the Gear Icon
		And I click on "Delete Created tag" in Manage tags page   	