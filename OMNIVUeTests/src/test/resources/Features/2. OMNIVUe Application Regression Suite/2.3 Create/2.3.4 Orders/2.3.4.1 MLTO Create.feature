@Create_Orders @Regression
Feature: CR4701 GPON Market Launch Test Orders (MLTO) July US65043

As an inventory user I need the ability to create an order in the native provisioning system, which mimics order flow from the order entry system, so that I can test the infrastructure build, 
activation, and dispatch flow and release the addresses and equipment associated with a new engineering build


######################################## US65043--CR4701 GPON MLTO uses DSP provisioning flow for MLTO and HSI (HSI+PRISM)###############
######################################## US84417--MLTO Create/View Changes ########################################
######################################## US60596--CR4701 OV Display Acknowledgement on Submit ########################################

   @TC86605 @PilotTesting
  Scenario Outline: TC86605-OV- Validating an acknowledgement when an MLTO/non-order request has been successfully submitted
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
    And I click the "Launch Create Form" button
     And I fill all the fields in Order with "<Service type>"     
    And I Click on the "Create" Button in Order Details page
    Then I should see success alert message for "Order was successful created"
    When I Search for "MLTO order" in Search Tab
    And I click on search button for "Orders"
    And I Click on "Audit Log" tab on Circuit view page
    When I Click on "OMNIVUE Audit Logs" tab
    #Then I "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action"
   	 
   Examples: 
	|Service type					|
	|HSI-MLTO data				|	
	#|HSI+PRISM-MLTO data	|
	 
	 
	  @US65043 @TC83402 @TC86568 @US84417 @US60596 @TC83580 @TC86567 @US60596 @TC95919 @TC125854  @PilotTesting
  Scenario Outline: OV-Validate GPON MLTO uses DSP provisioning flow for HSI & HSI+PRISM Service Type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
    And I click the "Launch Create Form" button
     And I fill all the fields in Order with "<Service type>"     
    And I Click on the "Create" Button in Order Details page
    Then I should see success alert message for "Order was successful created"
    When I Search for "MLTO order" in Search Tab
    And I click on search button for "Orders"
    And I Validate "Edit Order" button in MLTO search page which should be "Enabled" 
		And I Validate "Cancel Order" button in MLTO search page which should be "Enabled"
		When I click on "ISAT Create" button from Available action in MLTO Search page
    Then I should see success alert message for "ISAT Create"
    When I click on "DISPATCH" button from Available action in MLTO Search page
    Then I should see success alert message for "DISPATCH"
    When I click on "IMPROV" button from Available action in MLTO Search page
    Then I should see success alert message for "IMPROV"
    When I click on "ISAT Modify" button from Available action in MLTO Search page
    Then I should see success alert message for "ISAT Modify"		
    When I click on "Edit Order" button in MLTO Search page 
    And I Validate "Cancel & Save" button in MLTO search page which should be "Enabled"    
   	And I click on "Cancel" button in MLTO Search page  
   	When I click on "Cancel Order" button in MLTO Search page    
   	Then I should see success alert message for "Order was cancel request was successful message"
   	 
   Examples: 
	|Service type					|
	|HSI-MLTO data				|	
#	|HSI+PRISM-MLTO data	|
 @Create_Orders 
  Scenario Outline: @Create_Orders- Verify Create MLTO test order
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab 
     And I click the "Launch Create Form" button
    And I validate "<Validation section>" attributes in create form for "MLTO" 
    And I validate "" attributes in create form for "MLTO"     
    And I fill all the fields in Order with "<Service type>" 
    And I Click on the "Create" Button in Order Details page
    Then I update "MLTO order" in the FTT excel sheet     
    When I Search for "MLTO order" in Search Tab
    And I click on search button for "Orders"
    And I validate "V and H coordinates" attributes in Search page for "MLTO"
    And I Validate "Edit Order" button in MLTO search page which should be "Enabled" 
		And I Validate "Cancel Order" button in MLTO search page which should be "Enabled"
		And I validate "Technician remarks" attributes in Search page for "MLTO"
   	And I validate "Service Address" attributes in Search page for "MLTO"
   	And I validate "Available Actions & Order status" attributes in Search page for "MLTO"   
   	When I click on "ISAT Create" button from Available action in MLTO Search page
    Then I should see success alert message for "ISAT Create"
    When I click on "DISPATCH" button from Available action in MLTO Search page
    Then I should see success alert message for "DISPATCH"
    When I click on "IMPROV" button from Available action in MLTO Search page
    Then I should see success alert message for "IMPROV"
    When I click on "ISAT Modify" button from Available action in MLTO Search page
    Then I should see success alert message for "ISAT Modify"		
		When I click on "Edit Order" button in MLTO Search page   
    Then I validate "V and H coordinates" attributes in Edit form for "MLTO"
    Then I validate "Editable fields" attributes in Edit form for "MLTO"
   	And I Validate "Cancel & Save" button in MLTO search page which should be "Enabled"    
   	And I click on "Cancel" button in MLTO Search page  
   	When I click on "Cancel Order" button in MLTO Search page    
   	Then I should see success alert message for "Order was cancel request was successful message"
  
   Examples: 
	|Service type					| Validation section 										|
	|HSI MLTO data				|	HSI Feature code											|
	|HSI PRISM MLTO data	|	HSI+PRISM HD Streams & Feature code		|


@Create_Orders @TC83425
 Scenario Outline: @Create_Orders- Verify Create MLTO test order
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
     And I click the "Launch Create Form" button
    And I validate attributes in create form for "MLTO"
    And I validate "V and H coordinates" attributes in create form for "MLTO"
    And I validate "HD Streams" attributes in create form for "MLTO" 
    And I validate "Feature code" attributes in create form for "MLTO"     
    And I fill all the fields in Order with "<Service type>" 
    Then I Click on the "Create" Button in Order Details page

 Examples: 
	|Service type					| 
	|HSI-MLTO data				|	
	|HSI+PRISM-MLTO data	|
     
 ########################## US65101--CR4701 MLTO Feature Code Collection HSI+PRISM  ########################## 
 ########################## US65100--CR4701 MLTO Feature Code Collection HSI ################################# 
 
  @PI7 @Sprint215 @F2281 @US65101 @TC82223 @US65100 @TC82221 @TC82075 @TC95673 @TC95683
    Scenario: OV Test: Validation of Feature code collection for HSI & HSI+PRISM service in MLTO.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab     
    And I click the "Launch Create Form" button
   Then I validate "Feature code" attributes in create form for "MLTO" 
   
   
  @US65101 @TC95676 
	Scenario: @TC95676- OV Test: Validation of DSP flow for HSI service in MLTO.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
       And I click the "Launch Create Form" button
		And I fill all the fields in Order with "HSI-MLTO data" 
    Then I Click on the "Create" Button in Order Details page
    
  @US65101  @TC95684
    	Scenario: @TC95684- OV Test: Validation of DSP flow for 'HSI +PRISM' service in MLTO.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
       And I click the "Launch Create Form" button
		And I fill all the fields in Order with "HSI+PRISM-MLTO data" 
    Then I Click on the "Create" Button in Order Details page
    
        
   
 ########################## US37700---Add HD Streams as MLTO Input in OV  ########################## 
   
  @PI7 @Sprint215 @F2281 @US37700 @TC83454 @TC83455 @TC83621 @TC83622 @TC95900 @TC95903
   Scenario: OV-Validate HD Streams in create MLTO form for HSI & HSI+PRISM Service type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab 
    And I click the "Launch Create Form" button    
   Then I validate "HD Streams" attributes in create form for "MLTO" 
  # Then I validate "HD Streams" attributes in create form for "MLTO" 
   
 ########################## US60114--CR4701 GPON MLTO does not require V and H Coordinates ########################## 
   @US60114 @TC95915
    Scenario: OV-Validate V and H coordinates attributes are not prsent in MLTO Create form 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
    And I click the "Launch Create Form" button
    	And I fill all the fields in Order with "HSI+PRISM-MLTO data"
    Then I verify "V and H coordinates fields are not displayed in MLTO Create form"
    