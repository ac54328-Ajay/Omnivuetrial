@Create_Inventory @Create_Inventory_Location @Regression
Feature: Location Create form

  @TC39189
  Scenario: @TC39189 -Verify the functionality of Individual Location Create Button when ICO is selected as YES
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    #And I click the "Launch Create Form" button
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC365466-Individual Addresses"
    And I click on "Create button" on Location page
    Then I verify "Location address created successfully message should be displayed in create address range page"
    And I click on "Delete button" on Location page

  @TC54061
  Scenario: @TC54061 -OSIP-Verify the functionality of create location button for Address Ranges
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC54061 data"
    And I click on "Create button" on Location page
    And I verify "Address Range should get created successfully message should be displayed in create address range page"
    Then I "click on audit log tab to verify a log is captured for Create action in Location screen"
    And I click on "Delete button" on Location page

  @TC167320 @TC167322
  Scenario: @TC167320 -verify Edit Address Range button functionality & audit log is registed
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC121960 data"
    And I click on "Create button" on Location page
    And I verify "Address Range should get created successfully message should be displayed in create address range page"
    And I click on "Edit Address Range button" on Location page
    And I "change the range value & street name in address range page"
    And I click on "Save button" on Location page
    And I verify "Location address saved successfully. message should be displayed in location screen"
    Then I "click on audit log tab to verify a log is captured for Update action in Location screen"
    And I click on "Delete button" on Location page
    And I verify "Location Removed successfully. message should be displayed in location screen"

  @TC121960
  Scenario: @TC121960 -verify Delete Address Range button functionality
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC121960 data"
    And I click on "Create button" on Location page
    And I verify "Address Range should get created successfully message should be displayed in create address range page"
    And I click on "Delete button" on Location page
    And I verify "Location Removed successfully. message should be displayed in location screen"
    Then I "click on audit log tab to verify a log is captured for Delete action in Location screen"

  @TC44386
  Scenario: @TC44386 -360 view location - address range_Verify Add Next Address Button
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC44386"
    And I click on "Create button" on Location page
    And I verify "Location address created successfully message should be displayed in create address range page"
    Then I verify "Add Next Address button should be disabled for individual location"
    And I click on "Delete button" on Location page

  @TC165244
  Scenario: @TC165244  -Verify the functionality of create location button using Add Individual address button
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC165244"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"
    And I click on "Add Individual Addresses button" on Location page
    Then I verify "Create Addresses Within Range create form should be displayed"
    And I verify "alert message should be displayed as -Please fill in the mandatory fields when Create Addresses within range is initiated"
    And I "fill all the mandatory fields and click on create in Addresses within range create form"
    Then I verify "warning message should be displayed as Please Re-enter Address# , It should fall between Low Street# - High Street#"
    Then I verify "New locations added within range should be displayed in the Address range location related tab"
    When I click on "Delete-Ranges button" on Location page
    Then I verify "no locations should be displayed in the Address range location related tab"
    And I click on "Delete button" on Location page

  @TC167321
  Scenario: @TC167321 -Verify data displayed in the related tab locations - Address Range 360 view
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC165244"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"
    And I click on "Add Individual Addresses button" on Location page
    Then I verify "Create Addresses Within Range create form should be displayed"
    And I verify "alert message should be displayed as -Please fill in the mandatory fields when Create Addresses within range is initiated"
    And I "fill all the mandatory fields and click on create in Addresses within range create form"
    And I verify "warning message should be displayed as Please Re-enter Address# , It should fall between Low Street# - High Street#"
    Then I verify "New locations added within range should be displayed in the Address range location related tab"
    When I click on "Delete-Ranges button" on Location page
    Then I verify "no locations should be displayed in the Address range location related tab"
    And I click on "Delete button" on Location page

  ###################################################
  @TC163160
  Scenario: OSIP-Verify the error mesage when the user is tried to create an Individual Location by SWC_CLLI which doesnt exist in SWC_LEGACY_COMPANY table
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC54061 data"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"

  ##### Check TC163160 & TC172685 & TC163162
  @TC172685
  Scenario: @TC172685 -OSIP-Verify the error mesage when the user is tried to create an Individual Location by SWC_CLLI which doesnt exist in SWC_LEGACY_COMPANY table
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC54061 data"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"

  @TC163162
  Scenario: @TC163162 -OSIP-Verify whether user able to create "Individual Location" by giving SWC_CLLI which exist in SWC_LEGACY_COMPANY table
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC54061 data"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"

  @TC163168
  Scenario: @TC163168 -OSIP-Verify that the user is not allowed to create an Individual Location using address range with a invalid SWC_CLLI
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Address Range-TC54061 data"
    And I click on "Create button" on Location page
    Then I verify "Address Range should get created successfully message should be displayed in create address range page"

  #create a test case forit
  @Locnchk
  Scenario: @Locnchk -OSIP-Verify error message is displayed when duplicate address range is created
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Address Range" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "Invalid Address Range-TC54062"
    And I click on "Create button" on Location page
    Then Error message should be displayed on Location create form

  @TC54072
  Scenario: @TC54072 -Verify user able to add address to a Range from Individual Location create form
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    And I click the "Launch Create Form" button
    And I select "Add to Range" and search for "Address Range"
    And I fill the "Primary Address-TC54072" details in location create form
    And I select the Location Role in create form "Single" and "Central Office"
    And I fill the "Secondary Address-TC54072" details in location create form
    And I click on Create button in Individual Address page
    Then Location should get created successfully

  @TC39276 @failed
  Scenario: @TC39276 -Verify the functionality of Create Button when ICO is selected as NO
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    And I click the "Launch Create Form" button
    And I fill the "Primary Address-TC39276" details in location create form
    And I select the Location Role in create form "Single" and "Remote Site"
    And I fill the "Secondary Address-TC39276" details in location create form
    And I click on Create button in Individual Address page
    Then Individual Location should get created successfully

  @TC86526 @TC86904
  Scenario: @TC86526 -Verify Restricted Location dropdown list in location create page.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I Select "Individual Location" in Location type drop down
    And I click the "Launch Create Form" button
    Then I verify "Restricted Address Indicators is displayed Individual Location create form"
    Then I verify "Restricted Location dropdown list in location create page"

  # @TC54068
  # Scenario: @TC54068 -Verify the functionality of create location button using Add Individual address button
  #   Given I am logged in as a "Admin" user in Omnivue
  #   When I click on "Search" tab
  #   And I go to "Inventory" Search type and select "Location" as Inventory type
  #   And I click on Advance Search for "Location"
  #   And I select Address Range radio button
  #   And I search for an "TC54068-Address Range" in Advance search
  #   And I click on view icon in Search Result page
  #   And I click on Add Individual Address button from Address Range view page
  #   And I fill the mandatory fields required for "TC54068-Individual Addresses"
  #   And I click on Create button in Address Within Range page
  #   Then AWR Location should get created successfully
  #Sanjay
  #  @TC4D5L
  #Scenario: Verify the functionality of create location button using Add Next address button
  # Given I am logged in as a "Admin" user in Omnivue
  # Then I Click on "Search" tab in Omnivue Activation Screen
  #And I go to "Inventory" search type and select "Location" as the inventory type
  #And I click on Advanced search link
  #And I select Address Range radio button
  #And I search for an "TC54068-Address Range"
  # And I clicked on view icon of search result page
  #And I click on Add Individual Address button from Address Range view page
  #   And I fill the mandatory fields required for "TC54068-Individual Addresses"
  #   When I click on Create button in Address Within Range page
  #   Then AWR Location should get created successfully
  # And I close the AWR form
  #   And I click on Add Next Address button
  #  And I fill the mandatory fields required for "TC4D5L-Add Next Addresses"
  # When I click on Create button in Address Within Range page
  # Then AWR Location should get created successfully
  # And Log out from OMNIVue
  @US146392 @TC172694
  Scenario: @TC172694 US146392-Verify whether user able to create "Individual Location" by giving SWC_CLLI which exist in SWC_LEGACY_COMPANY table
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I select Location type as "Individual Location" under Create Tab
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields required in Location create form with "TC172694"
