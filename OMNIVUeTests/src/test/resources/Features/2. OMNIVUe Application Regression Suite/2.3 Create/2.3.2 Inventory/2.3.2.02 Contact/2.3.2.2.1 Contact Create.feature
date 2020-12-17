@Create_Inventory  @Create_Inventory_Contact @Regression @Reg_contact @PilotTesting
Feature: Contact Create form

  @TC118966
  Scenario: @TC118966 -Verify create button functionality in Create Contact Form
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen    
      And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
  
  @TC209305
   Scenario: @TC209305 -OV Validate the edit and save functionality for contact details page
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen
    And I click on "Edit" button in Contact Screen 
    And I modify "Category as NETWORK MANAGEMENT SERVICES"
    And I click on "Save" button in Contact Screen
    Then I verify "Contact Detail updated successfully message is displayed"
    And I "click on Audit Tab in Contact Screen to verify the log is been registered for Update action"
     And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
    
    @TC39198
    Scenario:  @TC39198 -Verify the appropriate validation message if Contact Information is selected but not 24X7
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC39198" data
     And I "Uncheck the preferred contact in Contact page"
      And I click on "Create" button in Contact Screen
       Then I verify "Select at-least one Preferred method of contact. message should be displayed in contact page"
       
    @TC39199
     Scenario:  @TC39199 -Verify Audit Log of Create for Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC39199" data
    Then I click on "Create" button in Contact Screen
      And I "click on Audit Tab in Contact Screen to verify the log is been registered for Create action"  
      And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
     @TC256437
     Scenario:  @TC256437 -Verify Audit Log of Delete action is registered for Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen     
    And I click on "Delete" button in Contact Screen
    And I verify "Contact Successfully deleted message is displayed"
     Then I "click on Audit Tab in Contact Screen to verify the log is been registered for Delete action"  
    
    @TC251575
     Scenario:  @TC251575 -CR5457_US187737_To Validate Delete Button on Contact Edit Screen
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen     
    And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"    
       
  @TC39221 
  Scenario:  @TC39221 -Verify Add Subscribers button - Contact 360 view
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC39221" data
    Then I click on "Create" button in Contact Screen
    And In the 360 view I click on the "Subscribers" tab
     And I click on "Add Subscribers" button in Contact Screen   
    Then  I verify "Add subscriber functionality in Contact screen"
      And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
    @TC39244
  Scenario:  @TC39244 -Verify 360 View Contact Details Manual Refresh for each tab
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    And I click on "Create" button in Contact Screen  
     Then  I verify "Manual Refresh icon should is displayed for each tab in Contact screen"
      And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
        
    @TC55311
  Scenario:  @TC55311 -Verify the Edit functionality of Contact
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    And I click on "Create" button in Contact Screen  
    #Then I should see the "Contact Search screen attributes" been displayed  
    And I click on "Edit" button in Contact Screen  
    And I "modify the firstname, lastname, category & type in edit contact screen"
      And I click on "Save" button in Contact Screen  
      Then I verify "Contact Detail updated successfully. message should be displayed in contact screen"
         And I "click on Audit Tab in Contact Screen to verify the log is been registered for Update action"  
       And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
    
     @TC55304 
  Scenario: @TC55304 -Verify the functionality of Add Locations button - Contact 360 view
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC209305" data
    Then I click on "Create" button in Contact Screen
    And In the 360 view I click on the "Locations" tab
     And I click on "Add Locations" button in Contact Screen       
    Then  I verify "Add Locations functionality in Contact screen"
      And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
    
  @TC165254 
  Scenario: @TC165254 -Verify the functionality of Add Service button - Contact 360 view
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Contact"   	
    And I click the "Launch Create Form" button
    And I fill all the mandatory fields present in Contact Create form with "TC165254" data
    Then I click on "Create" button in Contact Screen
    And In the 360 view I click on the "Services" tab         
    Then  I verify "Add service should be displayed for thePNCO contact type in Services related Tab"
      And I click on "Delete" button in Contact Screen
    Then I verify "Contact Successfully deleted message is displayed"
    
      #@TC165254 
  #Scenario: @TC165254 -Verify the functionality of Add Service button - Contact 360 view
  #	Given I am logged in as a "Admin" user in Omnivue
    #When I Click on "Create" tab in Omnivue Activation Screen
    #And I go to "Inventory" type and select "Contact"   	
    #And I click the "Launch Create Form" button
    #And I fill all the mandatory fields present in Contact Create form with "TC165254" data
    #Then I click on "Create" button in Contact Screen
    #And In the 360 view I click on the "Services" tab         
    #Then  I verify "Add service should be displayed for thePNCO contact type in Services related Tab"
      #And I click on "Delete" button in Contact Screen
    #Then I verify "Contact Successfully deleted message is displayed"