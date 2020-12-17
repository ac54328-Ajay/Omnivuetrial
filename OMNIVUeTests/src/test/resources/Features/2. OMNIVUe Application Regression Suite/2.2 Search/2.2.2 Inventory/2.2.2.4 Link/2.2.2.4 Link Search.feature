@Search_Inventory @Search_Inventory_Link @Regression 
Feature: Search Inventory Link validations

 @TC55677
  Scenario: @TC55677 -360 View Link Details_Related Tab Circuits - Backplane Link
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Link" as Inventory type
    And I select Link type as "Backplane Link" 
       And I click on search button for "Link" 
       And I click on view icon in Search Result page 
       Then I verify "any data is displayed in the Circuits related Tab" 
   
       
 @TC55680
 Scenario: @TC55680 -360 View Link Details_Related Tab Circuits - UTP Link
  Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Link" as Inventory type
    And I select Link type as "Unshielded Twisted Pair (UTP)" 
       And I click on search button for "Link" 
       And I click on view icon in Search Result page 
       Then I verify "any data is displayed in the Circuits related Tab" 
       
 @TC55679
 Scenario: @TC55679 -360 View Link Details_Related Tab Circuits - StackRing Link
  Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I go to "Inventory" Search type and select "Link" as Inventory type
    And I select Link type as "StackRing Link" 
       And I click on search button for "Link" 
       And I click on view icon in Search Result page 
       Then I verify "any data is displayed in the Circuits related Tab" 