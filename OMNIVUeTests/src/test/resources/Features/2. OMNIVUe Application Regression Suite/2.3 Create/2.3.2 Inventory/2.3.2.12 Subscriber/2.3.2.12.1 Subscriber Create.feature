@Create_Inventory @Create_Inventory_Subscriber @Regression @Reg_Subscriber1 @Reg_Run_2 @PilotTesting
Feature: Create - Inventory - Subscriber Side Validation

  @TC121820
  Scenario: @TC121820 -Verify Delete Subscriber functionality
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Subscriber"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Subscriber Create form with "TC121820" data
    And I click on "Create button" on Subscriber page
    And I should see the "Subscriber Search screen attributes" been displayed
    And I click on "Delete button" on Subscriber page
    Then I verify "Subscriber was successly deleted message should be displayed in Subscriber screen"
    And I click on "Audit log Tab" on Subscriber page
    Then I verify "Audit log is captured on Delete action in Subscriber screen"

  @TC119019 @TC251096
  Scenario: @TC55726 -Verify Subscriber ID is auto generated when a new subscriber is created
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Subscriber"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Subscriber Create form with "TC119019" data
    And I click on "Create button" on Subscriber page
    Then I verify "Subscriber ID is auto generated when a subscriber is created"
    And I click on "Delete button" on Subscriber page

  @TC55726
  Scenario: @TC55726 -Verify an entry is made in audit log tab when user updates information of a subscriber
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Subscriber"
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Subscriber Create form with "TC55726" data
    And I click on "Create button" on Subscriber page
    Then I should see the "Subscriber Search screen attributes" been displayed
    And I click on "Audit log Tab" on Subscriber page
    And I verify "Audit log is captured on Create action in Subscriber screen"
    And I click on "Edit button" on Subscriber page
    And I "modify the fields in Subscriber Screen"
    And I click on "Save button" on Subscriber page
    And I verify "success message should be displayed in Subscriber screen"
    And I click on "Audit log Tab" on Subscriber page
    Then I verify "Audit log is captured on Update action in Subscriber screen"
    And I click on "Delete button" on Subscriber page

  @TC39187
  Scenario: @TC39187 -Verify Create, Edit & Delete button functionality for Subscriber
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Subscriber"
    # And I click on the Launch Create form button
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Subscriber Create form with "TC39187" data
    And I click on "Create button" on Subscriber page
    Then I should see the "Subscriber Search screen attributes" been displayed
    And I click on "Audit log Tab" on Subscriber page
    And I verify "Audit log is captured on Create action in Subscriber screen"
    And I click on "Edit button" on Subscriber page
    And I "modify the fields in Subscriber Screen"
    And I click on "Save button" on Subscriber page
    And I verify "success message should be displayed in Subscriber screen"
    And I click on "Audit log Tab" on Subscriber page
    And I verify "Audit log is captured on Update action in Subscriber screen"
    And I click on "Delete button" on Subscriber page
    And I verify "Subscriber was successly deleted message should be displayed in Subscriber screen"
    And I click on "Audit log Tab" on Subscriber page
    And I verify "Audit log is captured on Delete action in Subscriber screen"
    # And I verify "Audit log is captured on Delete action in Subscriber screen"
