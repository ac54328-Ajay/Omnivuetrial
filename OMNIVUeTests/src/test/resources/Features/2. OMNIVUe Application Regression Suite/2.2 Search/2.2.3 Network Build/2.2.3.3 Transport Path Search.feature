@Search_NetworkBuild @Search_NetworkBuild_Tranportpath @Regression
Feature: Search - Network Build -Tranport Path Side Validation

  @TC3925811_Ref
  Scenario Outline: @TC39258  -Verify the functionality of Save button in Create Transport Path Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Transport Path"
    And I select Device Role as "NID" and Device Name as "<DeviceName>"
    And I click the "Launch Create Form" button
    And I select circuit for Transport Path
    And I click on "Submit" in Create Transport Path
    Then I Validate the Success message for "Submit" action
    When I click on "Search" tab 2time
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I Enter Device Name as "<DeviceName>" in Device Search Slider
    And I click on search button for "Device"
    Then I Validate Transport Path details for Device:"<DeviceName>"
    And I click on "DELETE" in Create Transport Path
    Then I Validate the Success message for "Delete" action
    When I click on "Create" tab
    And I go to "Network Build" type and select "Transport Path"
    And I select Device Role as "NID" and Device Name as "<DeviceName>"
    And I click the "Launch Create Form" button
    And I select circuit for Transport Path
    And I click on "Save" in Create Transport Path
    Then I Validate the Success message for "Save" action
    And I click on "Edit" in Create Transport Path
    Then I Validate the Success message for "Edit" action
    And I click on "DELETE" in Create Transport Path
    Then I Validate the Success message for "Delete" action

    Examples: 
      | DeviceName      |
      | LTTNCOMO111-111 |

  ############################################################################### END of Regression trance port path ###########################################
  @TC55705
  Scenario: @TC55705 -Verify the search functionality of Transport Path
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Search" tab
    When I "search for the Transport path data in search slider"
    And I click on search button for "Transport Path"
    Then I verify "Transport Path result screen"

  @TC194610
  Scenario: @TC194610 -OV Test:Validation of 360 view  for Transport path on Quick search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    Then I verify "360 view  for Transport path on Quick search"

  @TC153824 @TC153824_
  Scenario: @TC153824 -OV  Validation of create  Transport path on GFAST DSLAM which does not have EB associated.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "DSLAM" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
   # And I "launch the Transport path Create form"
    #Then I verify "Transport path confirmation window should be displayed to select Ethernet Bearer & Optical Bearer"
    #And I click on "OK Button by selecting Ethernet Bearer radio button" in Transport path screen
    #Then I verify "Ethernet Bearer Create form should be displayed if not available"

  @TC153824
  Scenario: @TC153824 -OV  Validation of create  Transport path on GFAST DSLAM which does not have OB associated.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Device" as Inventory type
    And I clicked on Advance Search for "Devices"
    And I select the device role as "DSLAM" in Device advance search
    And I click on Advance search button for "Device"
    And I click on view icon in Search Result page
    And I "launch the Transport path Create form"
    Then I verify "Transport path confirmation window should be displayed to select Ethernet Bearer & Optical Bearer"
    And I click on "OK Button by selecting Optical Bearer radio button" in Transport path screen
    Then I verify "Optical Bearer Create form should be displayed if not available"

  @TC55701
  Scenario: @TC55701 -Verify the functionality of Submit button in Create Transport Path Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    When I "enter the Transport path data in Create slider"
    Then I verify "Transport path create screen should be displayed"
    And I "select circuit from the drop down in Transport path create screen"
    And I click on "Save button" in Transport path screen
    And I verify "Transport Path result screen for the incomplete"
    And I click on "Edit Incomplete button" in Transport path screen
    And I click on "Submit button on Incomplete" in Transport path screen
    And I verify "Success message should be displayed on the action"
    And I click on "Delete button on Incomplete task" in Transport path screen
    Then I verify "Success message is displayed on Delete action in Transport Path screen"

  @TC165250_
  Scenario: @TC165250  -Verify the functionality of Delete button in Create Transport Path Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    When I "enter the Transport path data in Create slider"
    And I verify "Transport path create screen should be displayed"
    And I "select circuit from the drop down in Transport path create screen"
    And I click on "Save button" in Transport path screen
    And I verify "Transport Path result screen for the incomplete"
    And I click on "Edit Incomplete button" in Transport path screen
    And I click on "Submit button on Incomplete" in Transport path screen
    And I verify "Success message should be displayed on the action"
    And I click on "Delete button on Incomplete task" in Transport path screen
    #Then I verify "Success message is displayed on Delete action in Transport Path screen"

  @TC39258_
  Scenario: @TC39258  -Verify the functionality of Save button in Create Transport Path Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    When I "enter the Transport path data in Create slider"
    And I verify "Transport path create screen should be displayed"
    And I "select circuit from the drop down in Transport path create screen"
    And I click on "Save button" in Transport path screen
    And I verify "Transport Path result screen for the incomplete"
    And I click on "Edit Incomplete button" in Transport path screen
    And I click on "Save button on Incomplete" in Transport path screen
   # And I verify "Success message should be displayed on the Save action along with new Transportpath gets added"
    #And I click on "Delete button on Incomplete task" in Transport path screen
    #Then I verify "Success message is displayed on Delete action in Transport Path screen"
