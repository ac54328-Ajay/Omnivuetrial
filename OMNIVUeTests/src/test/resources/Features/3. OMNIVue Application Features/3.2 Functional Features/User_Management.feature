@User_Management
Feature: Verify OMNIVue Administration functions
         
         
Background: Login-in to the Omnivue Applications & validate the systems are up & running
Given I am logged in as a "Admin" user in Omnivue

@Delete_Users_excel  
Scenario: @Delete_Users_excel- Verify Manage WorkGroups functionality
Given I Click on "Gear icon" tab in Omnivue Activation Screen
When I select Administration in Gear slider
And I select "Manage Users" under Administration
Then I search the User by UserID from Excel & Perform Delete Action