@Search_NetworkBuild @Search_NetworkBuild_Fiberbuild @Regression 
Feature: Search - Network Build -Fiber Build Side Validation 


 @TC194607 
  Scenario: @TC194607 -Validation of 360 view for Fiber Build on Quick search
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Fiber Build" in Search tab 
		And I select Devicerole as "ONT" under Search tab
		And I "search Fiber Build based on device name"
		 And I click on search button for "Network"		  
		 Then I verify "search functionality of Fiber Build from Search slider"	 