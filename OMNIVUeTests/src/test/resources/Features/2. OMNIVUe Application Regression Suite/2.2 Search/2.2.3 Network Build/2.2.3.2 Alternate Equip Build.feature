@Search_NetworkBuild @Search_NetworkBuild_Altbuild @Regression  @PilotTesting
Feature: Search - Network Build - Alternate Equipment Build Side Validation 

 @TC55335 
  Scenario: @TC55335 -Alternate Equipment Build - Verify the search functionality of Alternate Equipment Build from Search slider
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"    
		 And I click on view icon in Search Result page     
		 Then I verify "search functionality of Alternate Equipment Build from Search slider"	 
		 
@TC165248 
  Scenario: @TC165248 -Verify Alt Eqpt Build order number search is retrieving all the details or not
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"      
		 And I click on view icon in Search Result page     
		 Then I verify "Alt Eqpt Build order number search is retrieving all the details"
		 
		 
	@TC204634 
  Scenario: @TC204634 -Validate Cancel Order Button is displayed in Network Order Detail page
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "Alt Equipment Build" in Search tab 
		And I "search Alt Equip build based Created by criteria"
		 And I click on search button for "Network"       
		 And I click on view icon in Search Result page     
		 Then I verify "Cancel Order Button is displayed in Network Order Detail page"
		 
		