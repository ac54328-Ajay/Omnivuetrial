@Search_NetworkBuild  @Search_NetworkBuild_GDB  @Regression @PilotTesting
Feature: Search - Network Build - GPON Device Build Validation 

Test cases related to GPON Device Build

@TC107103 @ref
  Scenario: @TC107103 -Validate the Device CLLI field is an additional search option for GDB
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Device Build" in Search tab 
		And I verify "Device CLLI field is an additional search option for GDB"
		And I "enter Device clli field with a value for GDB"
		 And I click on search button for "Network"    
		 And I click on view icon in Search Result page     
		 Then I verify "search functionality of GDB from Search slider"	 
		 
		 
		 
		 @TC109120 @TC300822 @ref
  Scenario: @TC109120-TC300822 -Validate we can search GPON Device Build by Address in GDB
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Device Build" in Search tab 
		And I verify "Device CLLI field is an additional search option for GDB"
		And I "enter Device Address field with a value for GDB"
		 And I click on search button for "Network"    
		 And I click on view icon in Search Result page     
		 Then I verify "search functionality of GDB from Search slider"	 
		 
		  
		 @TC194609 @TC323324 @ref
  Scenario: @TC194609-TC323324 -NIC_GPON_Reg_Validate search GPON Device Build additional optional Initiated By and Last Modified By in GDB
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Device Build" in Search tab 	
		And I "enter Initiated by field with a value for GDB"
		 And I click on search button for "Network"    
		 And I click on view icon in Search Result page     
		 Then I verify "360 view for GPON Device Build on Quick search"	 
		 
#		 	 @TC194609 @TC323324_1 @ref
  #Scenario: @TC194609-TC323324 -NIC_GPON_Reg_Validate search GPON Device Build additional optional Last Modified By in GDB
    #Given I am logged in as a "Admin" user in Omnivue   
    #When I click on "Search" tab
   #And I select "Network Build" in Search Tab 		
#		And I select Network type as "GPON Device Build" in Search tab 	
#		And I "enter Last Modified by field with a value for GDB"
#		 And I click on search button for "Network"    
#		# And I click on view icon in Search Result page     
#		 #Then I verify "360 view for GPON Device Build on Quick search"	
#		 
		  @TC194606 
  Scenario: @TC194606 -Validation of 360 view for GPON Build Template on Quick search
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Network Build" in Search Tab 		
		And I select Network type as "GPON Build Templates" in Search tab 
		And I "enter template name as test for GPON Build Templates"
		 And I click on search button for "Network"   
		 Then I verify "360 view for GPON Build Template on Quick search"
		 
		 
#		  @TC194606 
  #Scenario: @TC194606 -Validation of 360 view for GPON Build Template on Quick search
    #Given I am logged in as a "Admin" user in Omnivue   
    #When I click on "Search" tab
   #And I select "Network Build" in Search Tab 		
#		And I select Network type as "GPON Build Templates" in Search tab 
#		And I "enter template name as test for GPON Build Templates"
#		 And I click on search button for "Network"   
#		 Then I verify "360 view for GPON Build Template on Quick search"
		
		 