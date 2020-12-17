@Search_Inventory @Search_Inventory_Contact @Regression @Reg_contact
Feature: Search - Inventory - Contact Side Validation 


 @TC187941 
  Scenario: @TC187941 -Validation of 360 view on Advanced search for Contact
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Contact" as Inventory type
    And I clicked on Advance Search for "Contact"
    And I "search the contact with first name as Auto"
     And I click on Advance search button for "Contact"           
   And I click on view icon in Search Result page      
    Then I should see the "Contact Search screen" been displayed  
    
 