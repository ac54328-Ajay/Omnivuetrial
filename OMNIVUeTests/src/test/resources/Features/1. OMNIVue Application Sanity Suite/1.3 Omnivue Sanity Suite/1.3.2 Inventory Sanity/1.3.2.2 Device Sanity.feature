 @OVSanity  @Device_Sanity @OVSanity_Suite
Feature: Omnivue Sanity Check Device
	
	#  @Sanity 
  #Scenario Outline: OV-Validating Search Device Screen based on technology type
  #  Given I am in omnivue url
  #  When I log in as a "Admin" user   
  #  And I click on "Search" tab
  #  And I searched for "<Device Type>"
  #  And I click on search button for "Inventory"
  #  Then I click on view icon in Search Result page
        
  ##  Examples: 
  #  |Device Type						|
  #  |GPON-Sanity search			|
  #  |Ethernet-Sanity search	|
  #  |Passive-Sanity search	|
    
 @Device_Create_Sanity_check 
   Scenario Outline: @Device_Create_Sanity_check- Create Device field validation Sanity Check for "<Devicerole>"
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"   
    And I Select "Role" as Filter By value
    And Select the Role as "<Devicerole>" with Device Type as "<Devicetype>" with Sub-Type as "<Devicesubtype>"
    And I select the Technology type based on "<Devicerole>" Device role  
   	Then I should see the "Device Create screen attributes" been displayed
     
    Examples: 
    |Devicerole	|Devicetype												|Devicesubtype								|
    |MST				|Fiber Multiport Service Terminal	|Generic MST 2:2							|		
		|CLIENT			|Cisco ASR 9000 Series						|Cisco ASR 9000V							|
		|DSLAM			|Calix C Series										|Calix C7											|
		|FDH				|Corning FDH											|Corning 144 Port Distribution|
		|FDP				|Fiber Distribution Panel					|Generic FDP 12:12						|
		|HOST				|Cisco ASR 9000 Series						|Cisco ASR 9006								|
		|MSAP				|Calix C Series										|Calix C7											|		
		|NID				|RAD ETX Series										|RAD ETX204A									|
		|NPE				|Juniper M Series									|Juniper M20									|
		|OLT				|Calix E7													|Calix E7-2										|
		|ONT				|Calix 700GE Series ONT						|Calix 720GE									|
		|SPLITTER		|Fiber Splitter										|Generic Splitter 1:16				|
		|BRAS				|Generic Device										|Generic Device								|
		|MDU				|Calix MDU												|Calix 761 MDU								|
		|AGG				|Calix E7													|Calix E7-20									|
		
	@Device_Search_Sanity_check
		Scenario Outline: @Device_Search_Sanity_check- Verify Device 360 view is displayed for "<Device role>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Search" tab   
   	And I go to "Inventory" Search type and select "Device" as Inventory type 
 		And I clicked on Advance Search for "Devices"
 		And I select the device role as "<Device role>" in Device advance search
 		And I click on Advance search button for "Device" 		
 		And I click on view icon in Search Result page  
 		Then I should see the "Device Search screen attributes" been displayed
 		
 		Examples: 
    |Device role	|
    |OLT					|
    |BRAS					|
    |DSLAM				|
   	|FDP					|
		|MST					|
		|NID					|
		|NPE					|
		|ONT					|
		|SPLITTER			|
		|TD						|
		|AGG					|
		|BRIX					|
		|CLIENT				|
		|FDH					|
		|HOST					|
		|MSAP					|