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
  

    
  
   @US65043 @TC83425 @US84417 @US60596 @TC83582 @TC86568
  Scenario: OV-Validate GPON MLTO uses DSP provisioning flow for HSI+PRISM Service Type
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab
    And I fill all the fields in Order with "HSI+PRISM-MLTO data" 
    And I Click on the "Create" Button in Order Details page
    Then I update "MLTO order" in the FTT excel sheet
    
#####################################################################################################################    
    #US60114--CR4701 GPON MLTO does not require V and H Coordinates
    
    @US60114 @TC81783 
    Scenario: OV-Validate V and H coordinates is not present in create MLTO form 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab     
   Then I validate "V and H coordinates" attributes in create form for "MLTO" 
    
    
    @US60114 @TC83669 @US84417 
    Scenario Outline: OV-Validate V and H coordinates is not present in MLTO Search form 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page     
   Then I validate "V and H coordinates" attributes in Search page for "MLTO"
   
     Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		
   #Test3
   #Order no. 578613 (HSI)
#Order no: 578588 (HIS+PRISM)

#Test1 
#Order no. 646494 (HSI)
#Order no: 638772 (HIS+PRISM)
   
   
   
   @US60114 @TC83670 @US48231 @TC81606 
    Scenario Outline: OV-Validate V and H coordinates is not present in MLTO Edit form 
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page 
    And I click on "Edit" button in MLTO Search page   
   Then I validate "V and H coordinates" attributes in Edit form for "MLTO"
   
    Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		

		
   

   
   
    #####################################################################################################################    
    
    
    #US60611--CR4701 OV Ability to Cancel MLTO 
    
    @US60611 @TC83065 @US71109 @TC69719 
   Scenario Outline: OV-Validate Cancel button is Enabled on MLTO order for Admin
     Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
    Then I Validate "CANCEL" button in MLTO search page which should be "Enabled"
    
     Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		
		@US71109 @TC70232
   Scenario Outline: OV-Validate Cancel button is disabled on MLTO order for Userrole
     Given I am logged in as a "Userrole" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
    Then I Validate "CANCEL" button in MLTO search page which should be "Disabled"
    
     Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		
		
		  @US60611 @TC84580 @US71108 @TC70278
   Scenario Outline: OV-Validate Edit button is Enabled on MLTO order for Admin
     Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
		Then I Validate "EDIT" button in MLTO search page which should be "Enabled" 
		 
		   Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		
			 @US71108 @TC69684
   Scenario Outline:  OV-Validate Edit button is disabled on MLTO order for Userrole
     Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
		Then I Validate "EDIT" button in MLTO search page which should be "Disabled" 
		
		   Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		
#####################################################################################################################################  

#US65101--CR4701 MLTO Feature Code Collection HSI+PRISM

  @US65101 @TC82223 @US65100 @TC82221 @TC82075
    Scenario: OV Test: Validation of Feature code collection for HSI & HSI+PRISM service in MLTO.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I select "Orders" in Create Tab     
   Then I validate "Feature code" attributes in create form for "MLTO" 
   
  
  #####################################################################################################################################  

  #US63681--CR4701 GPON MLTO does not carry down service address
  
    @US63681 @TC69718
    Scenario Outline: OV-Validate Service Address is displayed in MLTO Search
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page      
   Then I validate "Service Address" attributes in Search page for "MLTO"
   
    Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 
		
	  ##################################################################################################################################### 
	  
	  #US48222--CR4701 MLTO Order and Technician remarks are not persisted to dispatching applications (regression only)
	  
	   @US48222 @TC82933
    Scenario Outline: OV Test: Validation of MLTO all remarks on order flowing to downstream Applications.
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab         
    And I searched for "<MLTO Search order>"
    And I click on search button for "Orders"
    And I click on view icon in Search Result page      
   Then I validate "Technician remarks" attributes in Search page for "MLTO"
  
    Examples: 
    |MLTO Search order				|
    |HSI MLTO Order						|
		|HSI+PRISM MLTO Order			| 	
		

  
  
   
		
    
    #test1-Pending completed status-706923  
    #test1-Cancelled/Completed-
    
  