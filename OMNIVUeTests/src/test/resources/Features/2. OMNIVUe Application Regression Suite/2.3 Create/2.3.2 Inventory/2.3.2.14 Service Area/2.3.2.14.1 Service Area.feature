@Create_Inventory  @Create_Inventory_Service_area @Regression  @CheckTeste @Reg_Run_2 @PilotTesting
Feature: Create - Inventory - Service Area Side Validation 

  
@TC119018
Scenario: @TC119018 -Validate Create functionality of Service Area
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"
    And I click on "Audit logs tab" button in Service area screen
    When I click on "Getlogs" button in Service area screen
    Then I verify "Create logs are captured in the Service area Audit logs"
    And I click on "Delete" button in Service area screen
    
@TC55689 @TC55725
Scenario: @TC55689 -Validate Edit functionality of Service Area & validate the audit logs on update action
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"
    When I click on "Edit" button in Service area screen
    And I "modify the service area name in edit Service area screen"
     And I click on "Save" button in Service area screen
      Then I verify "Service Area updated successfully message should be displayed in Service area screen"
    And I click on "Audit logs tab" button in Service area screen
    When I click on "Getlogs" button in Service area screen
    Then I verify "Update logs are captured in the Service area Audit logs"
    And I click on "Delete" button in Service area screen
    
   @TC173455
Scenario: @TC173455 -OV Validation of associate addressess to Service Area in Inventory Screen
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"
    When I click on "Edit" button in Service area screen
    And I "modify the service area name in edit Service area screen"
    When I click on "Add-More Address" button in Service area screen    
    And I "associate more than addresses in edit Service area screen"    
     And I click on "Save" button in Service area screen
      Then I verify "Service Area updated successfully message should be displayed in Service area screen"
    And I click on "Audit logs tab" button in Service area screen
    When I click on "Getlogs" button in Service area screen
    Then I verify "Update logs are captured in the Service area Audit logs"
    And I click on "Delete" button in Service area screen
    
    
@TC121836
Scenario:  @TC121836 -Validate Delete functionality of Service Area
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"   
    When I click on "Delete" button in Service area screen
    And I click on "Audit logs tab" button in Service area screen
    When I click on "Getlogs" button in Service area screen
    Then I verify "Delete logs are captured in the Service area Audit logs"
  
 @TC44384
Scenario: @TC44384 -Verify Add More Addresses - Service Area 360 view
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"
    When I click on "Edit" button in Service area screen
    And I "modify the service area name in edit Service area screen"
    When I click on "Add-More Address" button in Service area screen    
    And I "associate more than addresses in edit Service area screen"    
     And I click on "Save" button in Service area screen
      Then I verify "Service Area updated successfully message should be displayed in Service area screen"
    And I click on "Audit logs tab" button in Service area screen
    When I click on "Getlogs" button in Service area screen
    Then I verify "Update logs are captured in the Service area Audit logs"
    And I click on "Delete" button in Service area screen
    
    
     @TC121837
Scenario: @TC121837 -Verify the data displayed in related tab Locations - Service Area 360 view screen
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"
    And In the 360 view I click on the "Locations" tab
		Then I verify "data is displayed in the locations Related Tab of Service Area Screen"	
		
		 @SARTDevicetab
Scenario: @SARTDevicetab -Verify the data displayed in related tab Device - Service Area 360 view screen
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
    Then I verify "Service area view screen atrributes are displayed"
    And In the 360 view I click on the "Devices" tab
		Then I verify "data is displayed in the Devices Related Tab of Service Area Screen is matcching with Device name"	
		
@TC130168
Scenario: @TC130168 -Validating search critera of device look for create service area in OSIP
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
    And I click on "Create" button in Service area screen
   # And I verify "Service area view screen atrributes are displayed"
    Then I verify "on searching with device name Service Area view screen should be displayed" 
    And I click on "Delete" button in Service area screen
    
  @TC143657
Scenario: @TC143657 -Validating Service Area Create with multiple addresses
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Create" tab
    And I go to "Inventory" type and select "Service Area"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Service area Create form with "TC119018" data
     And I click on "Add More Addresses" button in Service area screen
    And I "associate multiple location in Service Area create screen"
    And I click on "Create" button in Service area screen
    And I verify "Service area view screen atrributes are displayed"
     And In the 360 view I click on the "Locations" tab
    Then I verify "associated addresses data is matching with Locations related in Service area" 
    And I click on "Delete" button in Service area screen
    #And I click on "Delete" button in Service area screen
    
      
    