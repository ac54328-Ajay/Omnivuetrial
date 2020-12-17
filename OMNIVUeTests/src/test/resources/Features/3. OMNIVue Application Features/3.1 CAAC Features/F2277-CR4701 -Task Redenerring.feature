@TASK
Feature: CR4701 - NIC GPON Supplement Requests to Pending Orders
  
  As a GPON user I need the provisioning system to receive and process supplemental requests from the ordering/billing system so that the most recent version of the customers 
  request is available for all necessary work flows and manual tasks

 
  #Test 1:  Manually select location autoform task--- 695926, 695935
  #Test 1: Fallout task--572522
 





  # Need to complete the pending validation
  #################################################--Sairam Y--####################################################################
  @US153108 @TC195889 @TC189076
  Scenario: OV-Validate View DSP tasks for autoform tasks on completed Task
     Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    #And I searched for Task "Create HSI Fallout"
    And I search for "Create HSI Fallout" from Task name dropdown   
    And I click on search button for "Task"
    And I Identify "View DSP Task & clicked on Arrow button" in Task result page
    #And I have clicked on the arrow
    And I Validate the action buttons in API View
    
   
    #################################################--Sairam Y--####################################################################
