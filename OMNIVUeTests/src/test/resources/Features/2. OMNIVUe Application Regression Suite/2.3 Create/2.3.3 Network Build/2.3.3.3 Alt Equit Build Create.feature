@Create_NetworkBuild  @Create_NetworkBuild_Alt_Equit_Build @Regression  @CheckTeste
Feature: Create - Network Build - Alternate Equipment Build Validation



######		Need To check below scenario

#Verify the Cancel button is displayed in Order Related Tab of Task View 
#Verify Cancel button button is Displayed in GPON, Lion & Network order
#Verify Audit log is captured On submit functionality
#Verify Audit log is captured On Cancel Order functionality



#########################################################################################################################################################
############											US171722 :MAINT - OV - HD00009564098 - Cancel Order option in Network Order Detail page																	###########################
############		 Network Order detail page should have 'Cancel Order' option. This feature is present in Order Details List view but not present in individual 
############ Order Detail Page. After click on 'Cancel Order' option, the cancel order request must be sent to DSP. Please refer attached document for more 
############																										steps and mockups. 																																			###########################
#########################################################################################################################################################

@US1717221 
  Scenario: @TC165248 -OV Test-Validate Cancel Order option in Network Order Detail page
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I configure NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
    And I Click on the "Submit Build" Button in Order Details page
    And I Click on the "Refresh" Button in Order Details page
    Then I Should see the "Network order status changed to Success"
    And I Launch the Network order by clicking on Order/CSOF ID
     #And I Should see the "Cancel Order button enabled & clickable" 
      #When I Click on the "Cancel Order" Button in Order Details page
      #Then I Should see the "Cancellation request successfully sent to DSP. - Message getting displayed in the Network Order Screen"
      #When I Click on the "Audit Log" Button in Order Details page
      #Then I verify "Order Cancel audit log should get displayed in Order details page"
      
    @US171722 
  Scenario: Creating Eqpt Build order number for FTT
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
     And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value    
   And I create NID & NPE device through Inventory
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I add the NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
    And I Click on the "Refresh" Button in Order Details page
     Then I Should see the "Network order status changed to Success"
     And I Launch the Network order by clicking on Order/CSOF ID
     And I Should see the "Cancel Order button enabled & clickable" 
      When I Click on the "Cancel Order" Button in Order Details page
      Then I Should see the "Cancellation request successfully sent to DSP. - Message getting displayed in the Network Order Screen"
  ###################################################################################################################################
 
 
  @TC39265 
  Scenario: @TC39265- Verify the functionality of Submit button of Alt Equipment Build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab    
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I configure NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
    And I Click on the "Refresh" Button in Order Details page
     Then I Should see the "Network order status changed to Success"
       
   @TC256605 
  Scenario: @TC256605- Verify the functionality of ADD Existing Device of Alt Equipment Build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
     And I go to "Inventory" type and select "Device"
      And I create NID & NPE device through Inventory
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I Select "Role" as Filter By value    
   And I add the NID & NPE devices in the ALT Equipment Build
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I add the NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
    And I Click on the "Refresh" Button in Order Details page
     Then I Should see the "Network order status changed to Success"
       
    @TC39262 
  Scenario: @TC39262-  Verify the functionality of Add Device button of Alt Equipment Build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab    
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    Then I verify "functionality of Add Device button of Alt Equipment Build"
  #   When I add the NID & NPE devices in the ALT Equipment Build
   # And I fill mandatory field in Alt Equipment Build
   #  And I Click on the "Submit Build" Button in Order Details page
   # And I Click on the "Refresh" Button in Order Details page
   #  Then I Should see the "Network order status changed to Success"
   
    @TC255790 
  Scenario: @TC255790 -Verify the functionality of Delete Device button of Alt Equipment Build
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab    
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    Then I verify "functionality of Delete Device button of Alt Equipment Build"
     
     @AEB-TaskRT
  Scenario: @AEB-TaskRT -Verify the Cancel button is displayed in Order Related Tab of Task View 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Non-CE" as Build type
    And I configure NID & NPE devices in the ALT Equipment Build
    And I fill mandatory field in Alt Equipment Build
     And I Click on the "Submit Build" Button in Order Details page
      And I Click on the "Refresh" Button in Order Details page
     Then I Should see the "Network order status changed to Success"
     And I Launch the Network order by clicking on Order/CSOF ID
		And In the 360 view I click on the "Tasks" tab
		And I "click on the view task button in the Orders details screen"
     	And In the 360 view I click on the "Orders" tab
     	Then I verify "Cancel button is displayed in ethernet Order Related Tab of Task details screen"