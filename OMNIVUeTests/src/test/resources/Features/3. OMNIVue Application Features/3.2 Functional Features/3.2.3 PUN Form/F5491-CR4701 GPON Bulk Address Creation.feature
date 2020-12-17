		    
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