@Create_Inventory @Create_Inventory_QOS @Regression 
Feature: Create - Inventory - QOS Side Validation 


@TC39193
Scenario: @TC39193 -Verify the functionality of Create button_QOS_Template
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "QOS Template"   
    And I click the "Launch Create Form" button
    And I verify "alert message should be displayed as -Please fill in the mandatory fields when create QOS is initiated"
     And I verify "alert message should be displayed on entering alpha-numeric character in QOS Template"
     And I fill all the mandatory fields present in QOS Create form with "TC39193" data
     And I click on "Create" in the QOS Template page
		Then I verify "Success messsage should be displayed as - QOS template created Successfully in QOS Template page"
 		And I "search for the QOS Created in Search Tab"
 		And I click on "Delete" in the QOS Template page
 		
 		
 @TC39186
Scenario: @TC39186 -Verify QoS Template EDIT button functionality
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "QOS Template"   
    And I click the "Launch Create Form" button
     And I fill all the mandatory fields present in QOS Create form with "TC39193" data
     And I click on "Create" in the QOS Template page
   Then I verify "Success messsage should be displayed as - QOS template created Successfully in QOS Template page"
    And I "search for the QOS Created in Search Tab"
    And I click on "Edit" in the QOS Template page
		And I verify "a message should be displayed on entering invalid value in QOS Template as - Incorrect partition value" 
     And I "entered valid value in QOS Template table" 
     And I click on "Save" in the QOS Template page
     	Then I verify "success message should be displayed as - QOS Template has been updated in QOS Template" 
     	Then I verify "Audit logs shoulld have the logs for Edit & create for QOS Template"
     	 And I click on "Delete" in the QOS Template page
     	
      
@TC39207
  Scenario: @TC39207 -List View(QoS Template)_Verify QoS Template list view is displayed when search is performed
     Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "QOS Template"   
    And I click the "Launch Create Form" button
     And I fill all the mandatory fields present in QOS Create form with "TC39193" data
     And I click on "Create" in the QOS Template page
   And I verify "Success messsage should be displayed as - QOS template created Successfully in QOS Template page"
    And I "search for the QOS Created in Search Tab"
    Then I verify "QoS Template list view is displayed when search is performed"
     And I click on "Delete" in the QOS Template page
     
     
  @TC251093
  Scenario: @TC251093 -Verify QoS Template Delete button functionality
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "QOS Template"   
    And I click the "Launch Create Form" button
     And I fill all the mandatory fields present in QOS Create form with "TC39193" data
     And I click on "Create" in the QOS Template page
		Then I verify "Success messsage should be displayed as - QOS template created Successfully in QOS Template page"
 		And I "search for the QOS Created in Search Tab"
 		And I click on "Delete" in the QOS Template page