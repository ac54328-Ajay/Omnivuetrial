 @Sanity_check @Location_Sanity @OVSanity_Suite
Feature: Omnivue Location Sanity Check

#@Sanity
#  Scenario: Verify Location 360 view is displayed
#    Given I am in omnivue url
#    When I log in as a "Admin" user
#    And I click on "Search" tab   
#    And I go to "Inventory" Search type and select "Location" as Inventory type
#    And I Search for sample Street Name as "TEST"
#    And I click on search button for "Inventory"    
#    Then I click on view icon in Search Result page    
    
 @Location_Search_Sanity_check  
  Scenario Outline: @Location_Search_Sanity_check -Verify Location 360 view is displayed for "<Location Search Type>"
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Location" as Inventory type
    And I clicked on Advance Search for "Location"
    And I select Location type as "<Location Search Type>" in Location Advance Search screen 
    And I click on Advance search button for "<Location Search Type>"          
    And I click on view icon in Search Result page   
    Then I should see the "Location Search screen attributes" been displayed  
    
     Examples: 
   |Location Search Type	|
   |Address Range 				|
   |Individual Location		|
  
   
   
 @Location_Create_Sanity_check 
  Scenario Outline:  @Location_Create_Sanity_check -Verify Location create form is displayed for "<Create Location Types>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
  	And I select Location type as "<Create Location Types>" under Location Create Slider
  	And I click the "Launch Create Form" button
    Then I should see the "Location Create screen attributes" been displayed

		Examples: 
		  |Create Location Types	|
		  |Address Range 					|
   		|Individual Location		|
   		|Bulk Create						|