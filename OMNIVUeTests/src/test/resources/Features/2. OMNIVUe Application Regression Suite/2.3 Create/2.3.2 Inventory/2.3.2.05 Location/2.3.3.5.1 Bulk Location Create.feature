@Create_Inventory @Create_Inventory_PUN @Regression
Feature: F5491 - CR4701 GPON Bulk Address Creation --As a GPON user I need the ability create multiple addresses at one time so that I can minimize address creation and support GA expansion and CTL ON expansion in NIC

################################# US91043: CR4701 GPON Upload of PUN form #################################

 @PI6 @Sprint220 @F5491 @TC125799
   	Scenario: OV-Validate Choose file button for uploading of PUN form
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Location"
    And I should see the following Location types "Bulk Create" under Create Tab
    And I click the "Launch Create Form" button
    And I select PUN form from following path "\\eldnp1515dm3\Mixdeng06\Data\NetworkSystemTest\OMNIVUE\Automation\Selenium\PUN Form\PUN_form.xlsm"
    And I click on "Import" in create Bulk Address form
    
    
################################# US91222-CR4701 GPON Submit Addresses - Retry Button #################################


  @PI6 @Sprint220 @F5491 @US91222 @TC125654	@TC125677 @TC125827
   	Scenario: OV-Verify Import PUN form, Retry Button button of Verify/Manage Address Ranges section
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Location"
    And I should see the following Location types "Bulk Create" under Create Tab
    And I click the "Launch Create Form" button
    And I select PUN form from following path "\\eldnp1515dm3\Mixdeng06\Data\NetworkSystemTest\OMNIVUE\Automation\Selenium\PUN Form\PUN_form.xlsm"
    And I click on "Import" in create Bulk Address form
    Then I verify ""
    And I click on "Create button" in create Bulk Address form
    Then I click on "Retry button" in create Bulk Address form
    
    
 @PI6 @TC143194
   	Scenario: OV- Validate  duplicate Address ranges couldn't be created in Pun form
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Location"
    And I should see the following Location types "Bulk Create" under Create Tab
    And I click the "Launch Create Form" button
    And I select PUN form from following path "\\eldnp1515dm3\Mixdeng06\Data\NetworkSystemTest\OMNIVUE\Automation\Selenium\PUN Form\PUN_form.xlsm"
    And I click on "Import" in create Bulk Address form
    Then I verify ""
    And I click on "Create button" in create Bulk Address form
    Then I click on "Retry button" in create Bulk Address form
 