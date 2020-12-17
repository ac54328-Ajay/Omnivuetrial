@Create_Inventory @Create_Inventory_Device @Regression @regression_device @regression_device_1
Feature: Create - Inventory - Device Side Validation 

As an OV inventory user I need the ability device Create side validation

@TC23908
Scenario: @TC23908 - NIC_Ethernet_Reg_Verify the Bulk Port Update functionality on a device
    Given I am logged in as a "Admin" user in Omnivue 
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role  
    And I fill all the mandatory fields with "TC23908-NID" data
    And I click on "Create" button in Device Create Screen
		And In the 360 view I click on the "Device Ports" tab
		And I clicked the "Bulk Port Update" button in Device Detail Page 
		Then I should see the "Bulk Port update tab is displayed" been displayed 
		And I clicked the "Show Ports" button in Device Detail Page 
		#Then I verify "on bulk port update is updating the port status of the device" 
		
@TC39202-
		Scenario: NIC_Ethernet_Reg_Verify the functionality of Add Card to a device
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role  
    And I fill all the mandatory fields with "TC174934-NPE" data
    And I click on "Create" button in Device Create Screen
		And In the 360 view I click on the "Device Ports" tab
		And I clicked the "Device port Expand" button in Device Detail Page 
		And I clicked the "Add Card" button in Device Detail Page 
		And I "select the card details from Bulk card and Click on Add Card"
		And I clicked the "Device port Expand" button in Device Detail Page 
		And I clicked the "Add Card" button in Device Detail Page 
		And I "select the card details from Cards By slot and Click on Add Card"
		Then I verify "OMNIVue Audit logs in both OV and Database"
		
@TC119042!
 Scenario Outline: OV- Validating atributes of Create Device Screen for "<Devicerole>" role
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    When I clicked the "Edit" button in Device Detail Page   
    And I "change the provision status in Device details page"    
    Then I clicked the "Save" button in Device Detail Page
     Then I validate the message displayed in Device Detail Page
		#And I Click on "Audit Log" tab on Device Search page
		#When I Click on "OMNIVUE Audit Logs" tab 
		#Then I verify "Update action type is registered under the Audit logs section in Device page"		
    Examples:
    |Devicerole	|Devicetype										|Devicesubtype					|Testdata					|
		|ONT				|Calix 700GE Series ONT				|Calix 720GE						|TC174922-ONT			|

@TC55537_
 Scenario: @TC55537 -Verify the create functionality of GPON device type ONT with Infrastructure Build or Service Provisioning value selected as Service Provisioning
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
     And I fill all the mandatory fields with "TC55537-ONT" data
     #And I "select a MST device in the Fiber Distribution Node"
    And I click on "Create" button in Device Create Screen
#Then I verify "
   
   
@TC167051_ @TC165293
Scenario: @TC167051 -Verify Migration lookup widget for finding a wire center CLLI is not displayed in device create screen
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    Then I verify "wire center clli field is not displayed in the device create screen"


@TC86228_
 Scenario: @TC86228 -Validate changed mandatory attributes of ONT device from Inventory
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC55537-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "Power	Supply attribute is not mandatory field in Device edit screen for ONT role"

		
		@TC125698 @TC126045 @TC126053_old
 Scenario: @TC125698 -OV validating Device CLLI Lookup for Device Edit page
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC55537-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
 		Then I verify "Device Clli is an editable field in Device edit screen for GPON"   
   Then I verify "Device CLLI attribute is in Device edit screen for GPON"   
 				And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page   
		
@TC126047
 Scenario: @TC126047 -OV test:Validation of Editable Feild  device CLLI  on Passive devices for User with Update rights.
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
 And Select the Role as "FDP" with Device Type as "Fiber Distribution Panel" with Sub-Type as "Generic FDP 12:12"
    And I select the Technology type based on "FDP" Device role  
    And I fill all the mandatory fields with "TC174929-FDP" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
 		Then I verify "Device Clli is an editable field in Device edit screen for Passive"   
   #Then I verify "Device CLLI attribute is in Device edit screen for Passive"   
 				And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page 
	
@TC126048
 		 Scenario: @TC86610 -Validating Edit Device Details screen based on Ethernet only for subscriber name
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
      And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "Device Clli is not editable field in Device edit screen for Ethernet" 
 				And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page	
	
	@TC125739
 		 Scenario: @TC125739 -To verify location details updated after successful look up on device location name
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
      And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   And I "change the location details in device edit screen" 
 				And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page		
		
@TC109031 @TC126054
 Scenario: @TC109031 -Validation of solar ARM indexing while editing device CLLI on GPON devices for User with Update rights.
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC55537-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "solar ARM indexing on location field in device edit screen"
  	And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page	
   
@TC109038
	Scenario: @TC109038 -Validating Edit Device Details screen based on Passive technology for Subscriber Name
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "FDP" with Device Type as "Fiber Distribution Panel" with Sub-Type as "Generic FDP 12:12"
    And I select the Technology type based on "FDP" Device role  
    And I fill all the mandatory fields with "TC174929-FDP" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
 		Then I verify "solar ARM indexing on location field in device edit screen"
 		
@TC86607_old
 Scenario: @TC86607_old -Validating Edit Device Details screen based on GPON technology with ONT role for subscriber name
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC55537-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "Subscriber attribute is not mandatory field in Device edit screen for GPON"
 				And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page
		
			@TC86609_old @Refact
	Scenario: @TC86609_old -Validating Edit Device Details screen based on Passive technology for Subscriber Name
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "FDP" with Device Type as "Fiber Distribution Panel" with Sub-Type as "Generic FDP 12:12"
    And I select the Technology type based on "FDP" Device role  
    And I fill all the mandatory fields with "TC174929-FDP" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "Subscriber attribute is not mandatory field in Device edit screen for Passive"
 				And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page
		
		
		@TC125675
 Scenario: @TC125675 -Validating MCO field on Edit Device Details screen for ONT Devices
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC55537-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "MCO field on Edit Device Details screen for ONT Devices"
 
 @TC86610_
 		 Scenario: @TC86610 -Validating Edit Device Details screen based on Ethernet only for subscriber name
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
      And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
   Then I verify "Subscriber attribute is mandatory field in Device edit screen for Ethernet"
 				And I clicked the "Save" button in Device Detail Page
		#Then I validate the message displayed in Device Detail Page	
 			
 			
 			
@TC39202
   Scenario: @TC39202 -Verify the functionality of Add Cards Button using Cards by slot
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
		And In the 360 view I click on the "Device Ports" tab
		And I clicked the "Device port Expand" button in Device Detail Page 
		And I clicked the "Add Card" button in Device Detail Page 
		And I "Add the card details and Click on Add Card"
		Then I verify "Card Details Saved Successfully. message should be displayed in Device Details page"
		
	@TC23878
   Scenario: @TC23878 -Validate the Port Status on the New Device
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
		And In the 360 view I click on the "Device Ports" tab
		And I clicked the "Device port Expand" button in Device Detail Page 
		And I clicked the "Add Card" button in Device Detail Page 
		And I "Add the card details and Click on Add Card"
		And I verify "Card Details Saved Successfully. message should be displayed in Device Details page"
		And I clicked the "Device port Expand" button in Device Detail Page 
		Then I verify "Port Status on the New Device"
		
		@TC95930_
		Scenario: @TC95930 -Validate Affiliate Owner field is not mandatory for Create GPON Device
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role 
    Then I verify "Affiliate Owner field is not mandatory for GPON Device"
		
		@TC23917
		 Scenario: @TC23917 -OV-Validate the child Port Status on the Device
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12"
    And I select the Technology type based on "NPE" Device role  
    And I fill all the mandatory fields with "TC174934-NPE" data
    And I click on "Create" button in Device Create Screen
		And In the 360 view I click on the "Device Ports" tab
		And I clicked the "Device port Expand" button in Device Detail Page 
		And I clicked the "Add Card" button in Device Detail Page 
		And I "select the card details and Click on Add Card"
		And I clicked the "Device port Expand" button in Device Detail Page 
		And I "add the child card to the added card in device port"
		Then I verify "child card ports are getting consumed while creating circuit"
		
		
		
		@TC55671_old
 Scenario: @TC55671_old -Verify entry is made in audit log tab when user updates device information
  Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC55671-OLT" data
    And I click on "Create" button in Device Create Screen    
 		And I clicked the "Edit" button in Device Detail Page
   And I "update the Qualification Information section in Device screen"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
		And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Update action type is registered under the Audit logs section in Device page"
			

 ######################## US94587--CR4701 GPON Edit Device CLLI logic ########################
  
   @TC174930 @TC212395 @US144722 @TC181465 @TC181488 @TC86604 @US94587 @TC107071 @TC107507 @TC174920 @TC174922 @TC212392 @TC174923 @TC174924 @TC174925 @TC174926 @TC174928 @TC174929 @TC174932 @TC174934 @TC55534 @TC55512 @TC119043 @TC119042_old
   Scenario Outline: OV- Validating atributes of Create Device Screen for "<Devicerole>" role
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    When I clicked the "Edit" button in Device Detail Page
    Then I verify "Device CLLI is editable field in Device details page"    
    And I "change the provision status in Device details page"    
    Then I clicked the "Save" button in Device Detail Page
     Then I validate the message displayed in Device Detail Page
		And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Update action type is registered under the Audit logs section in Device page"
			
    Examples: 
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					|
    |MST				|Fiber Multiport Service Terminal	|Generic MST 2:2							|TC174930-MST			|		
		|CLIENT			|Cisco ASR 9000 Series						|Cisco ASR 9000V							|TC212395-CLIENT	|
#		|DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|
#		|FDH				|Corning FDH											|Corning 144 Port Distribution|TC174928-FDH			|
#		|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|
#		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|TC212391-HOST		|
#		|MSAP				|Calix C Series										|Calix C7											|TC212392-MSAP		|		
#		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
#		|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|
#		|OLT				|Calix E7													|Calix E7-2										|TC174920-OLT			|
#		|ONT				|Calix 700GE Series ONT						|Calix 720GE									|TC174922-ONT			|
#		|SPLITTER		|Fiber Splitter										|Generic Splitter 1:16				|TC174922-SPLITTER|
#		|BRAS				|Generic Device										|Generic Device								|TC174925-BRAS		|
#		|MDU				|Calix MDU												|Calix 761 MDU								|TC174926-MDU			|
#		|AGG				|Calix E7													|Calix E7-20									|TC174923-AGG			|
    #|BRIX				|Brix Verifier										|BV-110 Verifier AC						|TC55512-BRIX			|
    #|TD					|Calix C Series										|Calix C7											|TC119043-TD			|	
    
################################# US51414-CR4701 GPON Location CLLI is optional for device technology=GPON or Passive #################################

@PI6 @Sprint209 @F2262 @US51414 @TC37684 @TC86322 @TC125806 @Refact
  	Scenario Outline: @TC86322 -NIC_Ethernet_Reg-Validate Create Device functionality for Passive Technology
    Given I am logged in as a "Admin" user in Omnivue  
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Role>" with Device Type as "<Device>" with Sub-Type as "<Subtype>"
    Then I fill the mandatory fields with "<Data>" data  
    And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Create action type is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Create Device" Action
		Then I validate "Delete button" attributes in Search page for "Device"
  	And I clicked the "Delete" button in Device Detail Page
  	And I validate the message displayed on triggerring Delete functionality
  	And I validate Audit logs details in database for "Delete Device" Action
  	Then I need to validate the Device deleted from Inventory
  	
		
		 Examples: 
      | Device                           | Subtype               |Data							|Role|
      | Fiber Distribution Hub           | Generic FDH 144       |US43123-TC24409-1	|FDH|
      #| Fiber Distribution Panel         | Generic FDP 12:12     |US43123-TC24409-2	|FDP|
     # | Fiber Multiport Service Terminal | Generic MST 24:24     |US43123-TC24409-3	|MST|
      #| Fiber Splitter                   | Generic Splitter 1:32 |US43123-TC24409-4 |SPLITTER|
		
		
		  
		
		
		
		
 
@PI6 @Sprint209 @F2262 @US51414 @TC37479  
   Scenario: @TC37479 -OV-Validate Location CLLI is optional on Inventory Device Create for GPON Technology
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "GPON" technology and device type
    And Select the technology as "GPON" with Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    And Validate "GPON" radio button in device create page    
     And Validate Location CLLI 
    Then I fill the mandatory fields with "US51414-TC37479" data    
    Then I verify "Device details and validate database"
    

@PI6 @Sprint209 @F2262 @US51414 @TC37705 @TC86323
    Scenario: @TC86323 -OV-Validate Location CLLI attribute is mandatory on Inventory Device Create for Ethernet Technology
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "ETHERNET" technology and device type
    And Select the technology as "ETHERNET" with Device Type as "Calix C Series" with Sub-Type as "Calix C7"
    And Validate "ETHERNET" radio button in device create page     
    And Validate Location CLLI
    And Select subscriber & Equipment role with "US51414-TC37705" data
    Then I fill the mandatory fields with "US51414-TC37705" data    
    
#################################  US43123--[Continued] CR4701-OV Enhances Create Device Screen based on Passive technology type #################
    
   @PI7 @Sprint210 @F2262 @US43123 @TC24409 @TC86560 @TC44388
  Scenario Outline: OV- Validating atributes of Create Device Screen on Passive Devices.
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "PASSIVE" technology and device type   
    And Select the technology as "PASSIVE" with Device Type as "<Device>" with Sub-Type as "<Subtype>" 
    #And Select Device Type as <Device> with Sub-Type as <Subtype>   
    Then Fill all the mandatory fields with <Data> data
       
     Examples: 
      | Device                           | Subtype               |Data							|
      | Fiber Distribution Hub           | Generic FDH 144       |US43123-TC24409-1	|
      #| Fiber Distribution Panel         | Generic FDP 12:12     |US43123-TC24409-2	|
      #| Fiber Multiport Service Terminal | Generic MST 24:24     |US43123-TC24409-3	|
      #| Fiber Splitter                   | Generic Splitter 1:32 |US43123-TC24409-4	|
	
################################# US91627--When Delete is Initiated, Call ARM API to delete #############################################
#################################  F10066-CR4701 GPON Delete Device  ####################################################################
    
  @PI8 @Sprint220 @F10066 @US91627 @TC103271 @TC125494 @TC55532 @TC125730 @TC100415 @TC103517 @TC125874 @TC98292 @TC125595 @TC125638
  Scenario Outline: OV-Validate Delete button functionality on "<Device Type Check>" devices
  Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
  	And I create "<Device Type Check>" device through Inventory  	
  	Then I validate "Delete button" attributes in Search page for "Device"
  	And I clicked the "Delete" button in Device Detail Page
  	And I validate the message displayed on triggerring Delete functionality
  	Then I need to validate the Device deleted from Inventory
  	
  	Examples:
  	|Device Type Check	|
  	|GPON-OLT						|
  	|Passive-MST				|
  	
 
 @PI7 @Sprint210 @F2262 @US43123 @TC25113 @TC86596 @TC86599 
  Scenario: OV- Validating radio buttons & Attributes in Create Device Screen on Passive Devices.
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"   
    And I Select "Role" as Filter By value
    And Select the Role as "MST" with Device Type as "Fiber Multiport Service Terminal" with Sub-Type as "Generic MST 2:2"
    And I validated "PASSIVE" radio button and "All" radio button   
    And I fill the mandatory fields with "US43123-TC25113" data    
    Then Validate attributes in "PASSIVE" device details page  
    
   #####################################################################################################################
  ########										Device Creation Based on the Role									#######################################
  #####################################################################################################################
  
 



################################# US66646: CR4701-GPON-OSIP-ONT DEVICE-Opti Tap & Installation date fields are not retaining the data after save #############################################
  
   @PI8 @Sprint220 @F1066 @US99866 @TC125676 
  Scenario: OV-Validating "Installation Date" and "Opti Tap"field on Edit Device Details screen for ONT Devices in Inventory/GDB
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"   
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC174922-ONT" data
    Then I click on "Create" button in Device Create Screen
  	When I clicked the "Edit" button in Device Detail Page
 		And I changed the "Installation date & Opti tap field in Device screen"
 		And I clicked the "Save" button in Device Detail Page
 		Then I verify "Installation date & Opti tap field is updated in Device screen"
 		And I clicked the "Delete" button in Device Detail Page
  	And I validate the message displayed on triggerring Delete functionality
  	
############################################################# ############################################################# ########################

		@TC55507_ @GETENF-5025
		 Scenario: @TC55507 -Verify the create functionality of Ethernet device type NID with Activation Check box selected
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "RAD ETX Series" with Sub-Type as "RAD ETX204A"
    And I select the Technology type based on "NID" Device role  
    And I fill all the mandatory fields with "TC174932-NID" data
    And I "select Create Activation Task in Device Create Screen"
    And I click on "Create" button in Device Create Screen 
     And In the 360 view I click on the "Tasks" tab
		Then I verify "a manual task gets added on selecting activation task in the device screen"
    
    
    		@DevBrix
		 Scenario: @DevBrix -Verify the create functionality of Ethernet device type BRIX with Activation Check box selected
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "BRIX" with Device Type as "Brix Verifier" with Sub-Type as "BV-110 Verifier AC"
    And I select the Technology type based on "BRIX" Device role  
    And I fill all the mandatory fields with "TC55512-BRIX" data
    And I "select Create Activation Task in Device Create Screen"
    And I click on "Create" button in Device Create Screen 
     And In the 360 view I click on the "Tasks" tab
		Then I verify "a manual task gets added on selecting activation task in the device screen"
		 
    
    
    
  
    
 ###########################################  US115746 --  OV-Getting a warning message to a non-mandatory field for GPON & passive device create  #######################
 
 @US115746 @TC129974 @TC248354 @TC248354_
  	Scenario: OV Test: Verify the warning message on location Cilli field while creating Passive device
    Given I am logged in as a "Admin" user in Omnivue  
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "PASSIVE" technology and device type
    And Select the technology as "PASSIVE" with Device Type as "Fiber Distribution Hub" with Sub-Type as "Generic FDH 144"
    And Validate "PASSIVE" radio button in device create page    
    And Validate Location CLLI
    #Then I fill the mandatory fields with "US51414-TC37684" data     
    
  @US115746 @TC129973 @TC154441
   Scenario: OV-Validate Location CLLI is optional on Inventory Device Create for GPON Technology
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "GPON" technology and device type
    And Select the technology as "GPON" with Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    And Validate "GPON" radio button in device create page    
     And Validate Location CLLI 
    Then I fill the mandatory fields with "US51414-TC37479" data    
    
     
     @P12 @Sprint243 @DE39481 @TC223190 
Scenario Outline: Validate Delete button by changing the Device role on Ethernet device
  Given I am logged in as a "Admin" user in Omnivue  
 		When I Click on "Create" tab in Omnivue Activation Screen 		
   	And I go to "Inventory" type and select "Device"   
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen	 		
 		Then I validate "Delete button" attributes in Search page for "Device"
 		#When I clicked the "Edit" button in Device Detail Page
 		#And I changed the "Device role to GPON in Network section"
 		#And I clicked the "Save" button in Device Detail Page
 		#Then I validate "Delete button" attributes in Search page for "Device"
 		
 		
 Examples: 
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					| 
		|CLIENT			|Cisco ASR 9000 Series						|Cisco ASR 9000V							|TC212395-CLIENT	|
		|DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|	
#		|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|
#		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|TC212391-HOST		|
#		|MSAP				|Calix C Series										|Calix C7											|TC212392-MSAP		|		
#		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
#		|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|
#		|OLT				|Calix E7													|Calix E7-2										|TC174920-OLT			|			
#		|BRAS				|Generic Device										|Generic Device								|TC174925-BRAS		|	
#		|AGG				|Calix E7													|Calix E7-20									|TC174923-AGG			|
#		

 @P12 @Sprint244 @TC225455 
Scenario Outline: Validating Is Diverse field on device details page
 		 Given I am logged in as a "Admin" user in Omnivue  
 		When I Click on "Create" tab in Omnivue Activation Screen 	
   	And I go to "Inventory" type and select "Device"   
    And I Select "Role" as Filter By value
    And Select the Role as "<DeviceRole>" with Device Type as "<DeviceType>" with Sub-Type as "<DeviceSubType>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<TestData>" data
    Then I click on "Create" button in Device Create Screen	
 		And I click on view icon in Search Result page
 		Then I validate "Is-Diverse" attributes in Search page for "Device"

Examples: 
    |DeviceRole	|DeviceType												|DeviceSubType								|TestData					| 
		|OLT				|Calix E7													|Calix E7-2										|TC174920-OLT			|	
		|ONT				|Calix 700GE Series ONT						|Calix 720GE									|TC174922-ONT			|
		|SPLITTER		|GENERIC OPTICAL SPLITTER					|1:16 splitter        				|TC174922-SPLITTER|
		#|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|
		#|MST				|Fiber Multiport Service Terminal	|Generic MST 2:2							|TC174930-MST			|		
		
		
		@TC55484_2 @GETENF-5024
		 Scenario Outline: @TC55484_2 -Verify the create functionality of Ethernet device type DSLAM with Manual Activation check-box selected
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "DSLAM" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    And I "select Create Activation Task in Device Create Screen"
    And I click on "Create" button in Device Create Screen 
    And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Create action type is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Create Device" Action
     And In the 360 view I click on the "Tasks" tab
		Then I verify "a manual task gets added on selecting activation task in the device screen"
		And I Validate the manual task details in database
		Examples:
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					| 
    |DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|	
		
		
		
		@TC55484_1 @Refact
		Scenario Outline: @TC55484_1 NIC_Ethernt_Reg_Verify the create functionality of an Ethernet device with a manual activation task
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    And I "select Create Activation Task in Device Create Screen"
    Then I click on "Create" button in Device Create Screen
    And In the 360 view I click on the "Tasks" tab
		Then I verify "a manual task gets added on selecting activation task in the device screen"
		#And I verify "Create action type is registered under the Audit logs section in Device page"
		And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Create action type is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Create Device" Action
		And I Validate the manual task details in database
    
    
    Examples:
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					| 
    |DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|	
    
@TC117326 @TC161953 @TC161957 @TC131088 @Refact
   Scenario Outline: To Validate user is able to see Value in Network Identifier field after "<Devicetype>" Ethernet Device is created
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen   
    Then I verify "Device CLLI is editable field in Device details page"    
    Then I verify "SNMP VERSION value is V1 or V2C, SNMP Port default value = 161 in Device details page" 
     Then I verify "RO Community String Value  field in Device details page"    
     
    Examples: 
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					|    
#		|CLIENT			|Cisco ASR 9000 Series						|Cisco ASR 9000V							|TC212395-CLIENT	|
#		|DSLAM			|Calix C Series										|Calix C7											|TC174924-DSLAM		|		
#		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|TC212391-HOST		|
#		|MSAP				|Calix C Series										|Calix C7											|TC212392-MSAP		|		
#		|NID				|RAD ETX Series										|RAD ETX204A									|TC174932-NID			|
#		|NPE				|Juniper M Series									|Juniper M20									|TC174934-NPE			|
		|OLT				|Calix E7													|Calix E7-2										|TC174920-OLT			|
#		|BRAS				|Generic Device										|Generic Device								|TC174925-BRAS		|		
#		|AGG				|Calix E7													|Calix E7-20									|TC174923-AGG			|
		
		
@TC125496 @TC125496
Scenario Outline: @TC125496- OV-Validate Delete button functionality on Passive only devices
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen   
   	Then I validate "Delete button" attributes in Search page for "Device"
   	And I clicked the "Delete" button in Device Detail Page
  	And I validate the message displayed on triggerring Delete functionality
  	And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Update action type is registered under the Audit logs section in Device page"
			
   	
   	Examples: 
    |Devicerole	|Devicetype												|Devicesubtype								|Testdata					| 		
		|SPLITTER		|Fiber Splitter										|Generic Splitter 1:16				|TC174922-SPLITTER|
		|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|TC174929-FDP			|

		
		
################################# US99866--When Delete is Initiated, Call ARM API to delete with associations #############################################

  	
  	@TC264085
Scenario: @TC264085 -OV-Validate Delete button functionality on Passive device linked to link
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"   	
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I "create a Link using FDP and SPLITTER devices"
     And I "try seraching for link created in Serach slider" 
     And I "click on the Device hyperlink displayed in the Link View Screen"
     And I clicked the "Delete-action" button in Device Detail Page
     Then I verify "a warning message should be displayed stating device is being used in Device Screen"     
     And I click on "Delete" button in Link screen
     
@TC125528
Scenario: @TC125528 -OV-Validate Delete button functionality on GPON device linked to link
  	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Link"   	
    And I select Link type as "Fiber" under Create Slider
    And I click the "Launch Create Form" button
    And I "create a Link using SPLITTER and FDP devices"
     And I "try seraching for link created in Serach slider" 
     And I "click on the Device hyperlink displayed in the Link View Screen"
     And I clicked the "Delete-action" button in Device Detail Page
     Then I verify "a warning message should be displayed stating device is being used in Device Screen"     
     And I click on "Delete" button in Link screen
     
@TC264084 
Scenario: @TC264084 -OV-Validate Delete button functionality on GPON only device linked to Circuit
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Ethernet Bearer" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I "create a circuit filling all the mandatory fields using SPLITTER and FDP devices"
		And I "click on the Device hyperlink displayed in the Circuit Screen"
		And I clicked the "Delete-action" button in Device Detail Page		
		Then I verify "a warning message should be displayed stating device is being used in Device Screen"
		And I click on "Delete" in Circuit page	

@TC264083 
Scenario: @TC264083- OV-Validate Delete button functionality on Passive only device linked to Circuit
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
		And I select "Ethernet Bearer" as the Circuit type in Create Tab
		And I click the "Launch Create Form" button
		And I "create a circuit filling all the mandatory fields using FDP and SPLITTER devices"
		And I "click on the Device hyperlink displayed in the Circuit Screen"
		And I clicked the "Delete-action" button in Device Detail Page
		Then I verify "a warning message should be displayed stating device is being used in Device Screen"
		And I click on "Delete" in Circuit page	


	@TC181271
     Scenario: 	@TC181271 -To Validate whether user is able Override 911 value for Network Identifiers of the Existing Device which has  Network Identifier mapping
      Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen 
    And I should see the "Device Search screen attributes" been displayed
    And I Click on "Networking Details" tab on Device Search page
    	And I verify "Network Identifiers field should be displayed in Device details screen"
    	And I clicked the "Edit-Network details" button in Device Detail Page
    	And I "update the Network Identifiers in Device details screen"
   	And I clicked the "Network Tab-Save" button in Device Detail Page
		Then I verify "Network Identifiers field should be updated with new value in Device details screen"
		
   	
    
	
############################################################# ############################################################# ########################


@TC189903_old
 Scenario: @TC189903_old -Validate delete icon in ONT Device details Page after user adds an Ethernet role to the existing GPON role
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC55537-ONT" data
 		And I click on "Create" button in Device Create Screen
 		Then I validate "Delete button" attributes in Search page for "Device"
 		And I clicked the "Edit" button in Device Detail Page
   And I "changed the role from GPON to Ethernet in device page"
  	And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page	
		Then I validate "Delete button" attributes in Search page for "Device"
		
		#####################################################################################################
		 @TC86321 @Refact
   Scenario: @TC86321 -OV-Validate Location CLLI is optional on Inventory Device Create for GPON Technology
    Given I am logged in as a "Admin" user in Omnivue    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Technology" as Filter By value
    And I validated "GPON" technology and device type
    And Select the technology as "GPON" with Device Type as "Adtran Total Access 5000" with Sub-Type as "ADTRAN Total Access 5000 23 Inch Chassis"
    And Validate "GPON" radio button in device create page  
		And Validate Location CLLI 
    Then I fill the mandatory fields with "US51414-TC37479" data    
    Then I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
    When I Click on "OMNIVUE Audit Logs" tab 
    Then I verify "Create action type is registered under the Audit logs section in Device page" 
    And I validate Audit logs details in database for "Create Device" Action
    ##########################################################################
    
    @TC126053 @TC86607_2 @Refact
    Scenario: @TC126053 -NIC_GPON_Reg_Verify update functionality of device CLLI with special characters on GPON devices
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC174922-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
 		Then I verify "Device Clli is an editable field in Device edit screen for GPON"   
   Then I verify "Device CLLI attribute is in Device edit screen for GPON"    
	  And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page   
		 And I verify "Updated Device details and validate database"
  	Then I validate "Delete button" attributes in Search page for "Device"
  	And I clicked the "Delete" button in Device Detail Page
  	And I validate the message displayed on triggerring Delete functionality
    ####
    
    @TCVectoringdb
    Scenario:@TCVectoringdb -validate vectoring info in db
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I verify "Internal" vectoring type details in database
    
    
    @TC189827 @Refact
   Scenario Outline: @TC189827 -NIC_GPON_Reg_Validate delete button in OLT and ONT Devices after user changes the device role to Ethernet from GPON
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
     And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
 		And I click on "Create" button in Device Create Screen 
 		Then I validate "Delete button" attributes in Search page for "Device"
 		And I clicked the "Edit" button in Device Detail Page
   And I "changed the role from GPON to Ethernet in device page"
  	And I clicked the "Save" button in Device Detail Page
		Then I validate the message displayed in Device Detail Page	
		Then I validate "Delete button" attributes in Search page for "Device"
	     Examples:
    |Devicerole	|Devicetype										|Devicesubtype					|Testdata					|
		#|ONT				|Calix 700GE Series ONT				|Calix 720GE						|TC174922-ONT			|
		|OLT			  |Calix E7			                |Calix E7-2					   	|TC55671-OLT			| 
		
		
		
		
		 @TC291303 @Refact
   Scenario Outline: @TC291303 -NIC_GPON_Reg_Verify the create functionality of GFAST DSLAM
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
     And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
    And I fill all the mandatory fields with "<Testdata>" data
 		And I click on "Create" button in Device Create Screen 
 		And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Create action type is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Create Device" Action
		
 		
 		
 		 Examples:
    |Devicerole	|Devicetype										|Devicesubtype					      |Testdata					|
    |DSLAM			|Adtran 500 G.fast DPU Series |Adtran 516G DPU AP AC 710 TP |TC174924-DSLAM		|		
    
    
      @TC86607 @Refact
    Scenario: @TC86607 -NIC_GPON_Reg_Validate Update functionality of GPON Device role ONT
     Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC174922-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I clicked the "Edit" button in Device Detail Page
 		And I fill all the mandatory fields  in Device edit form with "TC55671"
    And I clicked the "Save" button in Device Detail Page
    Then I validate the message displayed in Device Detail Page
    And I verify "Updated Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Update action log is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Update Device" Action
		
		@TC55531 @TC125803 @Refact
    Scenario: @TC55531 NIC_GPON_Reg_Verify the create functionality of GPON device role OLT
 		 Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I select the Technology type based on "OLT" Device role  
    And I fill all the mandatory fields with "TC174920-OLT" data
    And I click on "Create" button in Device Create Screen
    And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Create action type is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Create Device" Action
		Then I validate "Delete button" attributes in Search page for "Device"
		And I make the page 100%
  	And I clicked the "Delete" button in Device Detail Page
  	And I validate the warning message displayed on triggerring Delete functionality
  	And I validate Audit logs details in database for "Delete Device" Action
  	Then I need to validate the Device deleted from Inventory 
 
		@TC119042 @Refact
    Scenario: @TC119042 -NIC_GPON_Reg_Verify the create functionality of GPON device role ONT with selected as Infrastructure Build
     Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 720GE"
    And I select the Technology type based on "ONT" Device role  
    And I fill all the mandatory fields with "TC174922-ONT" data
 		And I click on "Create" button in Device Create Screen
 		And I verify "Device details and validate database"
    And I Click on "Audit Log" tab on Device Search page
		When I Click on "OMNIVUE Audit Logs" tab 
		Then I verify "Create action type is registered under the Audit logs section in Device page"
		And I validate Audit logs details in database for "Create Device" Action
		Then I validate "Delete button" attributes in Search page for "Device"
  	And I clicked the "Delete" button in Device Detail Page
  	And I validate the warning message displayed on triggerring Delete functionality
  	And I validate Audit logs details in database for "Delete Device" Action
  	Then I need to validate the Device deleted from Inventory
  	
  	######################################################Vectoring TC's################################################################################
  	 @TC287874
  Scenario Outline: NIC_Ethernet_Reg_Ethernet Device_Validate user is able to create device with Vectoring Type as XXX Internal
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "" Vectoring Topology
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
    And I verify "Internal Vectoring  details and validate database"


    Examples: 
      | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
      #| NID        | Adtran Total Access 5000          | ADTRAN Total Access 5000 23 Inch Chassis | Ethernet_Device | 384 Internal    | TD,DSLAM,MSAP,NID | 384 Internal,192 Internal |
     # | TD         | Calix E3-48 Series                | Calix E3-48 r2                           | Ethernet_Device | 192 Internal    | TD, DSLAM, AGG    | 192 Internal              |
     # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 Internal    | TD,DSLAM,AGG      | 192 Internal/384 Internal |
     # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 192 Internal    | DSLAM,MSAP        | 192 Internal              |
      #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 192 Internal    | TD,DSLAM,MSAP     | 192 Internal              |
      #| OLT        | Adtran Total Access 5000	         | ADTRAN Total Access 5000 23 Inch Chassis | GPON_OLT_Device | 384 Internal    | OLT               | 384 Internal              |
      | OLT        | Calix E7													 | Calix E7-2					                      | GPON_OLT_Device | 192 Internal	  | OLT               | 384 Internal,192 Internal	|
			#| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 192 Internal	  | OLT               |	192 Internal	            |
			
			
			
				@TC287876
   Scenario Outline:  NIC_Ethernet_Reg_GPON Device_Validate user is able to create device with Vectoring Type as XXX External by associating new Vectoring topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "Create Vectoring Topology" Vectoring Topology
    Then I click on "Create" button in Device Create Screen
     And I Click on "Networking Details" tab on Device Search page
     And I verify "External Vectoring  details and validate database"
 
    
    Examples: 
    | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
   # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
    | OLT        | Calix E7													 | Calix E7-2					                      | GPON_OLT_Device | 384 External    | OLT               | 384 External            	|
   # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
		#| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
		#| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 384 External   	| OLT               |	192 Internal/384 External 	          	|


	@TC287875 @TC287875_
   Scenario Outline:  NIC_Ethernet_Reg_Ethernet Device_Validate user is able to create device with Vectoring Type as XXX External by associating existing Vectoring topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "EXISTING TOPOLOGY" Vectoring Topology
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
     And I verify "External Vectoring  details and validate database"
 
    
    Examples: 
    | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
   # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
    | OLT        | Calix E7													 | Calix E7-2					                      | GPON_OLT_Device | 384 External    | OLT               | 384 External            	|
   # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
		#| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
		#| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 384 External   	| OLT               |	192 Internal	          	|
		
		
		


   @TC287878
  Scenario Outline: NIC_Ethernet_Reg_Edit Device Details by updating Vectoring type as Internal
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
   	And I clicked the "Edit-Network details" button in Device Detail Page
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "" Vectoring Topology in Device details tab
    And I clicked the "Network Tab-Save" button in Device Detail Page 
   # And I Click on "Networking Details" tab on Device Search page
    And I verify "Internal Vectoring  details and validate database"


    Examples: 
      | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
     # | NID        | Adtran Total Access 5000          | ADTRAN Total Access 5000 23 Inch Chassis | Ethernet_Device | 384 Internal    | TD,DSLAM,MSAP,NID | 384 Internal              |
     # | TD         | Calix E3-48 Series                | Calix E3-48 r2                           | Ethernet_Device | 192 Internal    | TD, DSLAM, AGG    | 192 Internal              |
     # | AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 Internal    | TD,DSLAM,AGG      | 192 Internal/384 Internal |
     # | MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 192 Internal    | DSLAM,MSAP        | 192 Internal              |
      #| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 192 Internal    | TD,DSLAM,MSAP     | 192 Internal              |
    #  | OLT        | Adtran Total Access 5000	         | ADTRAN Total Access 5000 23 Inch Chassis | GPON_OLT_Device | 384 Internal    | OLT               | 384 Internal              |
      | OLT        | Calix E7													 | Calix E7-2					                      | GPON_OLT_Device | 192 Internal	  | OLT               | 384 Internal,192 Internal	|
			#| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 192 Internal	  | OLT               |	192 Internal	            |

  
  
  @TC287879
  Scenario Outline: NIC_Ethernet_Reg_Edit Device Details by updating Vectoring type as External and associating New Vectoring topology
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
   	And I clicked the "Edit-Network details" button in Device Detail Page
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "Create Vectoring Topology" Vectoring Topology in Device details tab
    And I clicked the "Network Tab-Save" button in Device Detail Page 
    #And I Click on "Networking Details" tab on Device Search page
     And I verify "External Vectoring  details and validate database"

    Examples: 
    | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
    #| AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
     | OLT        | Calix E7													 | Calix E7-2					                      | GPON_OLT_Device | 384 External    | OLT               | 384 External            	|
    #| MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
		#| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
		#| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                | GPON_OLT_Device | 384 External   	| OLT               |	192 Internal	          	|


  @TC287877
  Scenario Outline: NIC_Ethernet_Reg_Edit Device Details by updating Vectoring type as External and associating Existing Vectoring topology 
    Given I am logged in as a "Admin" user in Omnivue
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role
    And I fill all the mandatory fields with "<Testdata>" data
    Then I click on "Create" button in Device Create Screen
    And I Click on "Networking Details" tab on Device Search page
   	And I clicked the "Edit-Network details" button in Device Detail Page
    And I Select "<Vectroring_Type>"  in VECTORING_TYPE and select "EXISTING TOPOLOGY" Vectoring Topology in Device details tab
    And I clicked the "Network Tab-Save" button in Device Detail Page
    #And I Click on "Networking Details" tab on Device Search page
     And I verify "External Vectoring  details and validate database"


    Examples: 
    | Devicerole | Devicetype                        | Devicesubtype                            | Testdata        | Vectroring_Type | Allowed_Devices   | Vectroring_Type Allowed   |
    #| AGG        | Calix E7                          | Calix E7-2                               | Ethernet_Device | 384 External    | TD,DSLAM,AGG      | 384 External              |
    | OLT        | Calix E7													 | Calix E7-2					                      | GPON_OLT_Device | 384 External    | OLT               | 384 External            	|
    #| MSAP       | Adtran Total Access 1148VX Series | Adtran TA 1148VX Host                    | Ethernet_Device | 384 External    | DSLAM,MSAP        | 384 External            	|
		#| DSLAM      | Adtran Total Access 5004          | Adtran Total Access 5004                 | Ethernet_Device | 384 External    | TD,DSLAM,MSAP     | 384 External              |
	#	| OLT        | Adtran Total Access 5004					 | Adtran Total Access 5004                 | GPON_OLT_Device | 384 External   	| OLT               |	192 Internal/384 External	|