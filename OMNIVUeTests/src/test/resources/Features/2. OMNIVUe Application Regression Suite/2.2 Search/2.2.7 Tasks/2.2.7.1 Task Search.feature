@Search_Task @Regression  @CheckTeste

Feature: As a GPON user I need the provisioning system to receive and process supplemental requests from the ordering/billing system so that the most recent version of the customers 
  request is available for all necessary work flows and manual tasks
  
  
  
############################################ US81430--CR4701 GPON OV has ability to determine which task rendering is occuring ############################################ 

  @US81430 @TC87055 @TC125475 @TC125476 @TC125596 @TC125484 @TC89314
  Scenario Outline: @TC125596 OV-Validate the View & Edit to determine which are Autoform Task from Fallout task in Task Result Page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "<GPON Task>" from Task name dropdown    
    And I click on search button for "Task"
    Then I validate the View & Edit for "DSP Task" in Task result page
     And I click on the "View DSP Task" in Task result page    
     Then I verify "API view needs to be displayed for the task selected"

    Examples: 
      | GPON Task          															| 
      |ISATActivationForCTLON														|
#|ISAT Activation For Default Change|
#|SuspendorRestoreUpdateInventoryFallout|
#|SuspendorRestoreISATFallout|
#|Out of Port Capacity|
#|Out of Bandwidth Capacity|
#|DSP Service Order Fallout Task|
#|Create Subscriber Location in CLC Fallout|
#|Manually create location|
#|Create Subscriber and/or Location in CLC Fallout|
#|Manual fallout for select subscriber|
#|Manually Select Location|
#|Update Inv disconnect From Location|
#|Assign And Design For To Location|
#|Update Inventory For Default Change|
#|Assign and Design for Default Change|
#|Update Inv-Disconnect Location For IPTV|
#|ICLUpdateServiceFailure|
#|AddHSI to IMPROV fallout task|
#|Structure Loader ICL manual falloutForCPELocation|
#|DeaactiveOrderInCBRASforIMPROV|
#|DeactiveOrderInEMS/CMS|
#|Structure Loader Create HSI fallout task IPTV|
#|Structure Loader ICL manual falloutForCreateHSI|
#|UpdateInventoryForCancelOfInstall|
#|Manually Design And Assign Fallout Task|
#|Splitter Out Of Capacity|
#|ONT Out Of Capacity|
#|OLT Can Not Support Service|
#|Notification to IMPROV Failure|
#|MLTO Dispatch Successful, Cancel MLTO|
#|Manual task SLA breach for NEWHSI|
#|Manual task invalid state for NEWHSI|
#|Manually Design And Assign Fallout Task|
#|Manual Jeopardy Task|
#|HSI/HIS+IPTV Supp-Manual fallout|
#|Revert IPTV Manual Task|
#|ISAT Activation Fallout Task|
#|Incorrect or Missing Platform ID|
#|IMPROV Integration fallout task|
#|Identify Service Area Terminal|
#|Identify And Assign CTag|
#|Clean up Network in Inventory Fallout|
#|DGWFallout|
#|Design and assign HSI service fallout|
#|Define PON Route|
#|DeactivateCustomerService|
#|Create PON Fallout|
#|Create OVC VLAN Association Fallout|
#|Create ONT|
#|Create HSI Fallout|
#|Create FiberLink Fallout|
#|Confirm Inventory Speed Change|
#|Clean up Network in Inventory Fallout|
#|ALU7750 BRAS Configuration						|


@TC91967 @TC125478
  Scenario: @TC91967 -OV-Validate Task Workflow on completed the autoform tasks
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I "select Task Status as completed under search slider"
    And I click on search button for "Task"  
     And I click on the "View DSP Task" in Task result page    
     Then I verify "Task Workflow on completed the autoform tasks"

@TC125658 @TC90623 @TC125477
  Scenario: @TC125658 -OV test: To verify completed by field in DSP Task details on completed task
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
   And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I "select Task Status as completed under search slider"
    And I click on search button for "Task"  
    And I verify "on the completed task edit dsp task button is disabled" 
     And I click on the "View DSP Task" in Task result page    
     Then I verify "General Task Details on the completed autoform tasks"
     
  @TC90901
  Scenario: @TC90901 -OV-Validate complete action Task Specific Details Area on completed task
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
   And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I "select Task Status as completed under search slider"
    And I click on search button for "Task"
    And I verify "on the completed task edit dsp task button is disabled" 
     And I click on the "View DSP Task" in Task result page    
     Then I verify "Task Specific Info section on the completed autoform tasks"   
       
    @TC195889
    Scenario: @TC195889 -OV Validate the Arrow buttons in task search result
	  Given I click on "Search" tab      
    And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown    
    And I click on search button for "Task"
		And I click on "Arrow button in Task result"  
		Then I verify "API view in the Task result screen" 
		
		@TC189076  @TC89326 @TC86968
    Scenario: @TC189076 -OV Validate task search result is loading Auto form task instead of MDW Web page
	  Given I click on "Search" tab      
    And I select "Tasks" in Search slider
    And I search for "Out of Port Capacity" from Task name dropdown    
    And I click on search button for "Task"
     And I click on the "View Fallout Task" in Task result page 
		Then I verify "Iframe view in displayed for the Non-Autoform task" 
		
		
		   @TC125653
    Scenario: @TC125653 -OV Test: To verify Order details are displaying for the Tasks
	  Given I click on "Search" tab      
    And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown    
    And I click on search button for "Task"
 		And I click on the "View DSP Task" in Task result page 
 		And I verify "API View is displayed for Autofomr Task Screen"
 		And In the 360 view I click on the "Orders" tab
		Then I should see the "Order details" been displayed  
 		
############################################ US80981--CR4701 GPON Task Specific Details Area from DSP ############################################

#------------------------		Test Data Dependency	------------------------
 #@TC125479 
  #Scenario: OV-Validate Task specific details area is updated by DSP in OV for GPON orders
   # Given I am logged in as a "Admin" user in Omnivue
   # When I click on "Search" tab
   ## And I searched for "GPON Autoform Task"
    #And I click on search button for "Task"
    #And I click on the "Edit DSP Task" in Task result page
    #Then I need to validate "GPON Task Specific Details Area" section for the GPON Autoform Task
    
    
 @US80981 @TC87232 @TC125230 
  Scenario:  @TC125230 -OV-Validate Task specific details area is updated by DSP in OV for GPON orders
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
    And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I click on search button for "Task"
    And I click on the "View DSP Task" in Task result page
    Then I verify "Task Specific Info section on the Autoform tasks" 
 
 
################################## US90812--Completed Date Field in General Task Details ###################################################################################
  
  @US90812 @TC90631  @TC125658
  Scenario: @TC125658 -To verify completed by field in DSP Task details once completing task
    Given I am logged in as a "Admin" user in Omnivue   
    When I click on "Search" tab
   And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I "select Task Status as completed under search slider"
    And I click on search button for "Task"
    And I verify "on the completed task edit dsp task button is disabled" 
     And I click on the "View DSP Task" in Task result page    
    Then I verify "Completed field is updated in Task Specific Info section on the completed autoform tasks" 
    
#################################### US80947--CR4701 GPON OV General Task Details Area #################################################################################
  
  @US80947 @TC84042 @TC283703
  Scenario: @TC283703 -OV-Validate General Task details area is updated by DSP in OV for GPON orders
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
   And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I click on search button for "Task"   
     And I click on the "View DSP Task" in Task result page    
    And I Validate "API View" of the Task
    Then I need to validate "GPON General Task Details Area" section for the GPON Autoform Task
    
#------------------------		Test Data Dependency	------------------------
 # @TC125480 @TC125483 @TC125482 @TC125481
 # Scenario: OV-Validate on Release task  from Action Dropdown, Assigned to field value is removed with CUID in Task Results
 #   Given I am logged in as a "Admin" user in Omnivue
 #   When I click on "Search" tab
 #   And I searched for "GPON Autoform Task"
 #   And I click on search button for "Task"
 #   When I Select "Claim from Task action drop down & click on Go button" in Task result page 
 #   Then I should see the "Task Assigned successfuly message" been displayed
 #   And I click on the "View DSP Task" in Task result page    
 #   Then I need to validate "GPON General Task Details Area" section for the GPON Autoform Task
 #   When I Select "Release from Task action drop down & click on Go button" in Task result page 
 #   Then I should see the "Task Released successfuly message" been displayed
        
############################# #US80965--CR4701 GPON Task Action Section ########################################################################################
 
 @TC92445
   Scenario: @TC92445 -OV-Validate Action button for Autoform task
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab
   And I select "Tasks" in Search slider
    And I search for "Manually Select Location" from Task name dropdown   
    And I click on search button for "Task"   
     And I click on the "View DSP Task" in Task result page  
     Then I verify "All the action buttons displayed in the Action section of Autoform task API Screen"
  
  #------------------------		Test Data Dependency	------------------------   
  #@US80965 @TC84555 @TC88872 @TC88877 @TC90829 @US94145 @TC92445 @TC125488 @TC90897 @TC90899  @TC91970
  #Scenario Outline: OV-Validate the View & Edit to determine which are Autoform Task
  #  Given I am logged in as a "Admin" user in Omnivue
  #  When I click on "Search" tab
  #  And I searched for "GPON Autoform Task"
  #  And I click on search button for "Task"
  #  And I click on the "<View Task action>" in Task result page
  #  Then I validate Task actions buttons for "<View/Edit Actions>"
  #  And I Validate "Save button" of the Task
   # And I Validate "Retry button" of the Task
  #  And I Validate "Complete button" of the Task
  #  And I Validate "Re-Assign button" of the Task

#    Examples: 
 #     | View Task action | View/Edit Actions |
 #     | View DSP Task    | View Action       |
 #     | Edit DSP Task    | Edit Action       |
 
  ########################### US80936--CR4701 GPON OV consumes API For task details ###########################################################################################
  
  #------------------------		Test Data Dependency	------------------------
 #  @US80936 @TC87046
  # Scenario Outline: OV-Validate the View tasks displayed in API view in OV for GPON Autoform orders & Iframe view for GPON Fallout orders
   #  Given I am logged in as a "Admin" user in Omnivue
  #   When I click on "Search" tab
  #   And I searched for "<GPON Task>"
  #   And I click on search button for "Task"
  #   And I click on the "<View Task>" in Task result page
  #   Then I Validate "<Page View>" of the Task

   #  Examples: 
  #     | GPON Task          | View Task         | Page View   |
   #    | GPON Autoform Task | View DSP Task     | API View    |
 #      | GPON Fallout Task  | View Fallout Task | Iframe View |
      
  ###########################  US91358--Integrate workflow image to task details page   ########################### 
  
   #------------------------		Test Data Dependency	------------------------
 # @P10 @Sprint234 @US91358 @TC90503
# Scenario: OV-Validate Workflow image is displayed in Edit DSP tasks for autoform tasks
#    Given I am logged in as a "Admin" user in Omnivue
 #   When I click on "Search" tab
#    And I searched for "GPON Autoform Task"
#    And I click on search button for "Task"
#    And I click on the "View DSP Task" in Task result page
#    Then I Validate "Workflow image is displayed" of the Task
		
 @P11 @Sprint236 @US117351 @TC188610 @US117358 @TC191601 @TC188876 @TC192327 @TC192320 @TC192287 @TC188873 
    Scenario Outline: Verify whether User able to search Archived Tasks data  with the Task status option
	   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab      
    When I select "Archive" in Search slider
    And I should see Task value in the Search from dropdown
    And I select "<Criteria to search with>" in the Search Archive slider     
    And I click on search button for "Archive"
    Then I should be able to see the Archive search result displayed
    
   Examples: 
   |Criteria to search with			|
   |Workgroup as CDP						|
   |Task status as Open					|
   |a value in PON 							|
   |a value in CSOF ID					|
   |a value in Circuit ID				|  
   

 @P11 @Sprint237 @US164876 @TC195478 @US116166 @TC189273 
    Scenario Outline: Verify that a new option From Archive on Audit Log Page for Task
	  Given I click on "Search" tab      
    And I select "Tasks" in Search slider
    And I search for "<Task type>" from Task name dropdown    
    And I click on search button for "Task"
    And I click on view icon in Search Result page   
    And I click on the "Audit Logs Tab" in Task result page
    Then I validate new option From Archive checkbox on Audit logs for "Task"
   	And I click on the "Get logs in Audit logs with From Archive checkbox selected" in Task result page 
    Then I validate the logs displayed in Audit logs by selecting Archive checkbox in "Task" result page
    
    
 Examples: 
   |Task type															|
   |ONT Out Of Capacity										|
   |Activation Fallout Task -- Ordering		|   
   
   #########		Test Data Dependency		######################
 #  @TC188583
 #  	 Scenario: Verify whether "Archive" option is added in search panel for searching Archived tasks in omnivue
#	  Given I click on "Search" tab      
 #   And I select "Tasks" in Search slider
  #  And I search for "<Task type>" from Task name dropdown    
   # And I click on search button for "Task"
   # And I click on view icon in Search Result page   
    