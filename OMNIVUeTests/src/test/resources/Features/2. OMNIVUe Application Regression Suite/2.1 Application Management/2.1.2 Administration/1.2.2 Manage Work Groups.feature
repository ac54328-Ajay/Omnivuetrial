@MLTO
Feature: CR4701 GPON Market Launch Test Orders (MLTO) July US65043

As an inventory user I need the ability to create an order in the native provisioning system, which mimics order flow from the order entry system, so that I can test the infrastructure build, 
activation, and dispatch flow and release the addresses and equipment associated with a new engineering build

###############################################################################################################
########################################		Consolidated Script	###############################################
###############################################################################################################


    
###############################################################################################################


#US65043--CR4701 GPON MLTO uses DSP provisioning flow for MLTO and HSI (HSI+PRISM)
#US84417--MLTO Create/View Changes
@US65043 @TC83402 @US84417 @US48231
  Scenario: OV-Validate GPON MLTO Attribute Validation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab     
   Then I validate attributes in create form for "MLTO" 