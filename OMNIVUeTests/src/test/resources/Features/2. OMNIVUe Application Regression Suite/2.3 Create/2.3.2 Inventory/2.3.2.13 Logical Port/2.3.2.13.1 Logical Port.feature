@Create_Inventory @Create_Inventory_LogicalPort @Regression @Reg_Run_2 @PilotTesting
Feature: Create - Inventory - Logical Port Side Validation

  @TC39192_logicalport @TC55696
  Scenario: @TC39192 @TC55696 -Verify the functionality of Create Button for logical port
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role
    And I fill all the mandatory fields with "TC23908-NID" data
    And I click on "Create" button in Device Create Screen
    # And I get the Ethernet device created
    When I click on "Create" tab
    And I go to "Inventory" type and select "Logical Port"
    And I Select Port Type as "Ethernet Bearer"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in logiacl port Create form with "TC39192" data
    And I click on the "Create button in Ethernet Bearer" Logical port Page
    Then I verify "Logical Port is created successfully with Port Id message is getting displayed"
    When I click on "Create" tab
    And I go to "Inventory" type and select "Logical Port"
    And I Select Port Type as "LAG Port"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in LAG logiacl port Create form with "TC55696" data
    And I click on the "Create button in LAG Logical" Logical port Page
    Then I verify "Logical Port is created successfully with Port Id message is getting displayed"
    When I click on "Create" tab
    And I go to "Inventory" type and select "Logical Port"
    And I Select Port Type as "VLAN Interface"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in LAG logiacl port Create form with "TC55696" data
    And I click on the "Create button in VLAN Logical" Logical port Page
    Then I verify "Logical Port is created successfully with Port Id message is getting displayed"
    
    
    ################################### END of regression logical port ########################################################
    
    
  @TC39192
  Scenario: @TC39192 -Verify the functionality of Create Button for logical port
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Logical Port"
    And I Select Port Type as "Ethernet Bearer"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in logiacl port Create form with "TC39192" data
    And I click on the "Create button in Ethernet Bearer" Logical port Page
    Then I verify "Logical Port is created successfully with Port Id message is getting displayed"

  #Then I verify "Logical Port is created successfully with Port Id message is getting displayed"
