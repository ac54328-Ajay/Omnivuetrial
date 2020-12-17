		    
 @FTT_MLTO
	Feature: FTT Automation Scripts
	
	    
 @FTT_MLTO
  Scenario: OV-Validate GPON MLTO uses DSP provisioning flow for HSI+PRISM Service Type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
    And I fill all the fields in Order with "HSI+PRISM-MLTO data" 
    And I Click on the "Create" Button in Order Details page
    Then I update "MLTO order" in the FTT excel sheet
    
	 @FTT_ALT_BUILD @FTT_EQTOrder 
  Scenario: Creating Eqpt Build order number for FTT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I add NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
     Then I update "Equip order" in the FTT excel sheet
     
     
    @FTT_INV @FTT_EQTOrder
   Scenario: Creating Eqpt Build order number for FTT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value    
    And I create NID & NPE device through Inventory
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I add the NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
    And I Click on the "Submit Build" Button in Order Details page
    Then I update "Equip order" in the FTT excel sheet
     
     
          @FTT_MLTO
  Scenario: OV-Validate GPON MLTO uses DSP provisioning flow for HSI+PRISM Service Type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
    And I fill all the fields in Order with "HSI+PRISM-MLTO data" 
    And I Click on the "Create" Button in Order Details page
    Then I update "MLTO order" in the FTT excel sheet
    
	 @FTT_ALT_BUILD @FTT_EQTOrder 
  Scenario: Creating Eqpt Build order number for FTT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I configure NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
     Then I update "Equip order" in the FTT excel sheet
     
     
      @FTT_INV @FTT_EQTOrder
  Scenario: Creating Eqpt Build order number for FTT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
     And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value    
   And I create NID & NPE device through Inventory
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I add the NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
     Then I update "Equip order" in the FTT excel sheet
     
      