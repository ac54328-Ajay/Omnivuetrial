@Location
Feature: GPON Contracted Property Type Indicators

#	US48525-CR4701 GPON Contracted Property Drop Down Allows Multiple Select of Property Type
  @US48525 @TC53733 
  Scenario: OV - Verify creating the individual address with multiple values of Century link contracted property attribute
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Location"
    And I select "Individual Location" location type
    And I fill the mandatory fields with "US48525-TC53733" data
    Then Validate attributes in "Location" Search page
    

    #US48525-TC53733------can we have edit seperate validation