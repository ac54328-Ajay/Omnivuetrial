 @Sanity_check @Subscriber_Sanity @OVSanity_Suite
Feature: Omnivue Sanity Check Subscriber

  @Sanity_CreateSubscriber 
  Scenario: @Sanity_CreateSubscriber -OV-Validating create subscriber screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Subscriber"
    And I click the "Launch Create Form" button
    Then I should see the "Subscriber Create screen attributes" been displayed

  @Sanity_SearchSubscriber 
  Scenario: @Sanity_SearchSubscriber -OV-Validating Search subscriber screen
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Subscriber" as Inventory type
    And I Enter Subscriber Full name as "Test"
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    Then I should see the "Subscriber Search screen attributes" been displayed
