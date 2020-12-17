@Create_Inventory @Create_Inventory_Device @Regression
Feature: Create - Inventory - Link Side Validation

  #//--------------------BackPlane Link----------------------------//
  @TC39190
  Scenario: @TC39190 -Verify the functionality of Create button_Create BackPlane Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "BackPlane Link" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @BPlink
  Scenario: @BPlink -Verify the functionality of Edit & Save button_Create BackPlane Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "BackPlane Link" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Edit" button in Link screen
    And I "change the provision status & functional status in Link view page"
    And I click on "Save" button in Link screen
    Then I verify "Link Detail Edited successfully. messgae should be displayed"
    Then I verify "in audit logs Update logs are captured for the Link"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @BPlink
  Scenario: @BPlink -Verify the functionality of Delete button_Create BackPlane Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "BackPlane Link" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  #//--------------------Fiber Link----------------------------//
  @TC119003 @TC39277
  Scenario: @TC119003 -Verify the functionality of Create button_Create Fiber Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "Fblink" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    Then I verify "any data is displayed in the Circuits related Tab"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @TC39223
  Scenario: @TC39223 -Verify the functionality of Edit & Save button_Create Fiber Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "Fblink" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Edit" button in Link screen
    And I "change the provision status & functional status in Link view page"
    And I click on "Save" button in Link screen
    Then I verify "Link Detail Edited successfully. messgae should be displayed"
    Then I verify "in audit logs Update logs are captured for the Link"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @Fblink
  Scenario: @Fblink -Verify the functionality of Delete button_Create Fiber Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "Fblink" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  #//--------------------Unshielded Twisted Pair (UTP) Link ----------------------------//
  @TC119006
  Scenario: @TC119006 -Verify the functionality of Create button_Create UTP (Unshielded Twisted Pair) Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Unshielded Twisted Par(UTP)" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @TC39224
  Scenario: @TC39224 -Verify the functionality of Edit & Save button_Create UTP (Unshielded Twisted Pair) Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Unshielded Twisted Par(UTP)" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Edit" button in Link screen
    And I "change the provision status & functional status in Link view page"
    And I click on "Save" button in Link screen
    Then I verify "Link Detail Edited successfully. messgae should be displayed"
    Then I verify "in audit logs Update logs are captured for the Link"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @BPlink
  Scenario: @BPlink -Verify the functionality of Delete button_Create UTP (Unshielded Twisted Pair) Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "Unshielded Twisted Par(UTP)" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  #//--------------------StackRing Link ----------------------------//
  @TC119004
  Scenario: @TC119004 -Verify the functionality of Create button_Create StackRing Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "StackRing Link" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @BPlink
  Scenario: @BPlink -Verify the functionality of Edit & Save button_Create StackRing Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "StackRing Link" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Edit" button in Link screen
    And I "change the provision status & functional status in Link view page"
    And I click on "Save" button in Link screen
    Then I verify "Link Detail Edited successfully. messgae should be displayed"
    Then I verify "in audit logs Update logs are captured for the Link"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"

  @BPlink
  Scenario: @BPlink -Verify the functionality of Delete button_Create StackRing Link
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"
    And I select Link type as "StackRing Link" under Create Slider
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Link Create form with "TC39190" data
    And I click on "Create" button in Link screen
    Then I verify "Link was created successfully messgae should be displayed"
    And I "try seraching for link created in Serach slider"
    And I click on "Delete" button in Link screen
    Then I verify "Link Deleted successfully. messgae should be displayed"
    Then I verify "in audit logs Delete logs are captured for the Link"
