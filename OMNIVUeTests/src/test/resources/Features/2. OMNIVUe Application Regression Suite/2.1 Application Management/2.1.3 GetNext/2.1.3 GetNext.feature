@MLTO
Feature: GetNext Validations

  @TC293681_R @TC293683_R @TC293681_db
  Scenario Outline: @TC293681_db - Verify Search GetNext Attribute search --Button Adminstrative name
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I Select "<Attribute_name>" from GetNext Attributes
    And I click on "Search" button in getnext page
    And I verify the mandatory field validation message
    And I Enter partial value "<Partial_value>" in "<Attribute_name>" in Manage GetNext Attributes
    And I click on "Search" button in getnext page
    And I Validate "<Attribute_name>" Search result for "<Partial_value>"
    And I Enter complete value "<Complete_value>" in "<Attribute_name>" in Manage GetNext Attributes
    And I click on "Search" button in getnext page
    And I Validate "<Attribute_name>" Search result for "<Complete_value>"
    And I verify "Export to excel,print and pagination in manage get next buttons page"
    Then I verify "Search action in TRACK_USER table"

    Examples: 
      | Attribute_name             | Partial_value | Complete_value |
      | Button Administrative Name | GetNext_      | GetNext_CDP    |
      | WorkMate Rule Invoked      | GetNext       | GetNext_CDP    |

  ################################-Verify the Add Get Next Button LookUp ########################################################
  @TC293379_R
  Scenario: TC293379 - Verify the Add Get Next Button LookUp
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    Then I verify "Add Get Next Button Look Up Attributes"
    And I click on "Save" on Add Get Next Button LooK Up
    Then I verify "look up message-Please enter the mandatory fields."
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    And I click on "Clear" on Add Get Next button LooK Up

  @TC293435_R
  Scenario: TC293435 - Verify the Add Get Next Button LookUp-Duplicate value validation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    Then I verify "Getnext button create action"
    And I click on "Add GetNext Button" button in getnext page
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    Then I verify "Getnext button create action"
    Then I verify "look up message-The button administrative name already exists in the table. Please retry with another name."
    Then I verify "Getnext button update action"
    Then I verify "Getnext button delete action"

  @TC293381
  Scenario: TC293381 - Validate Get Next Buttons link in gear icon for an Admin Option in OV UI
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    Then I verify "Deafult value for Administrative,Color,FontColor textbox"

  ##############################################Get Next Buttons - UI -  List view##########################################
  @GetNext_UI_LIST
  Scenario: TC293279 - MAINT_US244490_Verify List view columns in Get Next Attribute Search Results page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    Then I verify "Column headers in the Get Next Attribute Search Results page"

  @GetNext_Button_add
  Scenario: TC29328-->Add Get Next Buttton, Update  and Delete
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "Add GetNext Button" button in getnext page
    And I Enter a value GetNext_"AUTO2" in Button Administrative Name
    And I fill all the mandatory fields present in AddGetNext button Look Up with "TC293379" data
    Then I verify "Getnext button create action"
    Then I validate the "GetNext_AUTO2" values in search result page and database
    And  I update the value of "GetNext_AUTO2" with GetNext_AUTO"1" 
    #Then I verify "Getnext button update action"
    Then I validate the "GetNext_AUTO21" values in search result page and database
    Then I delete the record "GetNext_AUTO21" in GetNextPage
    
    #Then I verify "Getnext button delete action"

  #####################################################View ALl##############################
  @TC293681_view
  Scenario: @TC293681_view - Verify Search GetNext Attribute search --Button Adminstrative name
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Gear Icon" in Omnivue Homepage
    And I select "Get Next Buttons" under the Gear Icon
    And I click on "Get Next Buttons" link
    And I click on "View All" button in getnext page
    And I Validate the GetNext Attribute search result

  #Following TC's require Test data , Test data and Rules should be configured before executing these test cases
  ################################################Scenario-When there are no Open tasks###################
  #These are Data Depend Test case Test data and Rules should be configured before executing these test cases
  @Get_next_button_1 @TC293681_view @TC301769
  Scenario: @TC301769 - OMNIVUE_GetNext Button_Validate error message when Defect_Task returned from Workmate is already assigned to other user
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "GetNext_ASP2" button in omnive home page
    And I verify the "click Get Next button again to get the latest task" message in defect task details page

  #####################################################################################################
    @Get_next_task
  Scenario: @Get_next_task - Verify the Status of defect task
   Given I am logged in as a "Admin" user in Omnivue
  #And I click on "GetNext_ASP1" button in omnive home page
  And I click on "GetNext_CDP" button in omnive home page
   Then I verify "User should be presented  with Task details screen"
   Then I verify "Assigned To should be updated to logged in user & Task Status should get updated to Assigned"
  And I click on "Release" button action on Defect task
  #@Get_next_task
 # Scenario: @Get_next_task - Verify the Status of defect task
  #  Given I am logged in as a "Admin" user in Omnivue
    #And I click on "GetNext_ASP1" button in omnive home page
  #  And I click on "GetNext_CDP" button in omnive home page
   # And I verify the "click Get Next button again to get the latest task" message in defect task details page
    #Then I verify "Assigned To & Task Status should get updated to Assigned state"
    #And I click on "Release" button action on Defect task

  ############################   	Data Depend Test case Test data and Rules should be configured before executing these test cases
  @Get_next_button_no_rule @TC293681_view @TC301764
  Scenario: @TC301764 - OMNIVUE_GetNext Button_Validate error message when Rule Configured to Get_Next button is not present in  WorkMate
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "GetNext_ASP1" button in omnive home page
    And I verify the "Rule Specified Was Not Found" message in defect task details page

  ############################   	Data Depend Test case Test data and Rules should be configured before executing these test cases
  @Get_next_button_no_open_task @TC293681_view @TC301769
  Scenario: @TC301769 - OMNIVUE_GetNext Button_Validate error message when there is no work item present in Workmate for Defined Rule 
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "GetNext_CDP" button in omnive home page
    And I verify the "No Work Found For Rule Specified" message in defect task details page
     ############################   	Data Depend Test case-- Resource should not be present in Workmate#########
    @US#  @TC301762
		Scenario: @TC301762 -OMNIVUE_GetNext Button_Validate error message when Resource is not present in WorkMate
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "GetNext_CDP" button in omnive home page
    And I verify the "Resource Specified not Found" message in defect task details page 
    
