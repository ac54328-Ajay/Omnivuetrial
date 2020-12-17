  @Search_Inventory @Search_Inventory_Service_Area @Regression  @CheckTeste
Feature: Search - Inventory - Service Area Side Validation 

As an OV inventory user I need the ability Service Area Search side validation


 @TC165300
  Scenario: @TC165300 -Verify Google Sytle Search for Service Area Name
    Given I am logged in as a "Admin" user in Omnivue
    Then I verify "Google Type search field  is enabled"
    Then I verify SOLR Suggestions for "Service Area" google search
    And I "click on GO button"
    And I should see the "Servicearea Search screen values" been displayed