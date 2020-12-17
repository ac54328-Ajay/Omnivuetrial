@Create_Inventory @Create_Inventory_Topology @Regression @Reg_Run_2
Feature: Create - Inventory - Topology Side Validation 

	
	
	@GETENF-5096
Scenario Outline: Validate Create functionality for Ethernet Topology as Topology Rolee   
    Given I am logged in as a "Admin" user in Omnivue
    And Running a soap service "<serviceURL>" located at "<NIDrequest>" and response in "<NIDresponseLocation>".
    And Running a soap service "<serviceURL>" located at "//serviceTestData/NPEdeviceCreation.xml" and response in "//serviceResponse//responseNPEDeviceCreation.xml".
  	And I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
  	And I click the "Launch Create Form" button
  	And I fill the mandatory fields with "GETENF-5096" data in Create Topology Page
    And I click on "AddDevice" button
    And I enter device name "ETRPNVFH711-1234" for topology creation
    And I click on "AddDevice" button
    And I enter device name "ETRPNVFH722-1234" for topology creation
    #And I click on "Create" button in Topology Screen
    #And I Validate Audit Logs of Topology
    And Running a soap service "<serviceURL>" located at "//serviceTestData/NIDdeviceDeletion.xml" and response in "//serviceResponse//responseNIDDeviceDeletion.xml".
    And Running a soap service "<serviceURL>" located at "//serviceTestData/NPEdeviceDeletion.xml" and response in "//serviceResponse//responseNPEDeviceDeletion.xml".
  Examples: 
      | serviceURL                                        |NIDrequest                             |NIDresponseLocation                           |                                                 
      |http://icl-test1.test.intranet/icl/services/ICL_2_0|//serviceTestData/NIDdeviceCreation.xml|//serviceResponse//responseNIDDeviceCreation.xml |
        
	
	
	@TC214386 @TC39217 @TC214386_
  	Scenario: @TC214386 -NIC_Ethernet_Reg_Validate Create functionality for Ethernet Topology as Topology Role
  	Given I am logged in as a "Admin" user in Omnivue
  	And I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
  	And I click the "Launch Create Form" button
    And I fill the mandatory fields with "TC39217" data in Create Topology Page
    And I click on "AddDevice" button
  	And I search Device Type as "Calix E7" and Device SubType as "Calix E7-20"
  	And I click on "AddCircuit" button
  	And I associate circuit type as "EB" in Topology create form  	
  	And I click on "AddCircuit" button
  	And I associate circuit type as "LAG" in Topology create form  	
  	And I click on "Create" button in Topology Screen
  	And I Validate Audit Logs of Topology
  	And I Validated related tab Topology view Page
  	 And I Validated Delete Topology view Page
   

 @P10 @Sprint234 @US135031  @TC179837 
  Scenario: @TC179837 -TC05 - Validate user is able to create Generic Network Topology with only HOST and Topology role as Host Client or Satellite
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
  	And I click the "Launch Create Form" button
  	And I select the "Topology role as Host Client or Satellite" in Topology create form
  	And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form  
  	And I click on "AddDevice" button
  	And I should see the "Device Role is updated as HOST in Topology create form" been displayed 
  	And I associate device having role "HOST" in Topology create form  
  	And I click on "Create" button in Topology Screen	
  	Then I verify "Topology is getting created with only HOST Device"
   # And I click on "Delete" button in Topology Screen	
    
    @TC179852 
  Scenario: @TC179852 -TC06 - Validate user is able to add CLIENT devices to Generic Network Topology with only HOST and Topology role as Host Client or Satellite
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
 And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
  	And I click the "Launch Create Form" button
  	And I select the "Topology role as Host Client or Satellite" in Topology create form
  	And I select the "Topology Technology Type as Cisco ASR 9000 series" in Topology create form  
  	And I click on "AddDevice" button
  	And I should see the "Device Role is updated as HOST in Topology create form" been displayed 
  	And I associate device having role "HOST" in Topology create form     	  	
  	And I click on "Create" button in Topology Screen	
  Then I verify "Topology is getting created with only HOST Device"
  And I "create EB circuit between HOST & CLIENT role devices"
   And I click on "Edit" button in Topology Screen	
   And I click on "AddDevice" button in Topology Screen
   And I "associate client role device in Topolopgy screen"
   
    And I click on "Delete" button in Topology Screen	
    And I click on "Delete" button in Topology Screen	
    
    
   @TC39280 @TC119541
  Scenario: TC39280-TC119541 Verify Create Update and Delete Topology functionality for Generic Network
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
    And I click on "AddCircuit" button
    And I Select circuit data in Create Topology Page
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I Validate Remove device and circuit
    #And I have Updated TopologyType as "Generic Network"
    #And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    And I Validated Delete Topology view Page
    #And Log out from OMNIVue

#TC119518	Verify Device details displayed in the related tab Devices of generic topology
#TC119530	Verify Circuit name is displayed in the related tab Circuits of generic topology

@TC119518 @TC119530
  Scenario: TC119530-TC119518-Verify Create Update and Delete Topology functionality for Generic Network
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "TX - Texas"
    And I click on "AddCircuit" button
    And I Select circuit data in Create Topology Page
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I Validate Remove device and circuit
    And I have Updated TopologyType as "Generic Network"
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    And I Validated Delete Topology view Page

  @TC119021
  Scenario: TC119021-Verify Create Topology functionality for MEN Topology
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "MEN Topology" with State as "CO - Colorado"
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I Validate Remove device and circuit
    And I have Updated TopologyType as "MEN Topology"
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    And I Validated Delete Topology view Page
    And Log out from OMNIVue

  @Topology-View @OLTRing
  Scenario: Verify Create Topology functionality for OLT Ring
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "OLT Ring" with State as "CO - Colorado"
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I have Updated TopologyType as "OLT Ring"
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    And I Validated Delete Topology view Page
    And Log out from OMNIVue

  @Topology-View @PONCollector
  Scenario: Verify Create Topology functionality for PON Collector
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "PON Collector" with State as "CO - Colorado"
    And I click on "AddCircuit" button
    And I Select circuit data in Create PON Collector Topology Page
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I Validate Remove device and circuit
    And I have Updated TopologyType as "PON Collector"
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    And I Validated Delete Topology view Page
    And Log out from OMNIVue

  @Topology-View @PONNetwork
  Scenario: Verify Create Topology functionality for PON Network
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "PON Network" with State as "CO - Colorado"
    And I click on "AddCircuit" button
    And I Select circuit data in Create Topology Page
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I Validate Remove device and circuit
    And I have Updated TopologyType as "PON Network"
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    And I Validated Delete Topology view Page
    And Log out from OMNIVue
    
 @P10 @Sprint234 @US135030 @TC173874
  Scenario: @TC173874 -RTB684 - US135030- TC001 - Validate the drop down values of “Topology Technology Type”  when user selects "Host Client or Satellite" from  Topology Role drop down
    Given I click on "Create" tab
    When I go to "Inventory" type and select "Topology"
  	And I select Topology type as "Generic Network" under Create Tab
  	And I select "CO - Colorado" as state
  	And I click the "Launch Create Form" button
  	Then I should see the "Host Client or Satellite drop down value present for Topology role in Topology create form" been displayed   	
 		

  	
  	
  	@P10 @Sprint234 @US135029  @TC172609 
  Scenario: Validate the UI changes for Topology Role -  “Host Client or Satellite
    Given I click on "Create" tab
    When I go to "Inventory" type and select "Topology"
  	And I select Topology type as "Generic Network" under Create Tab
  	And I select "CO - Colorado" as state
  	And I click the "Launch Create Form" button
  	And I select the Topology role as "Host Client or Satellite" in Topology create form

@TC172611
  	Scenario: verify whether Generic network topology has 'Host Client or Satellite' as option in topology role drop down
    Given I click on "Create" tab
    When I go to "Inventory" type and select "Topology"
  	And I select Topology type as "Generic Network" under Create Tab
  	And I select "CO - Colorado" as state
  	And I click the "Launch Create Form" button
  	And I select the Topology role as "Host Client or Satellite" in Topology create form
  	
 @US131258 @TC199171
  Scenario: @TC199171 CR6168_US131258_Verify OLT Ring and PON Collector is not available for Topology Type in Create dropdown
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab    
    And I go to "Inventory" type and select "Topology" 
    Then I verify the OLT RING & PON Collector Topology Technology Type should not be displayed in "Create" slider 
    
     @TC39218
  Scenario: Verify Create Update and Delete Topology functionality for Generic Network
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I Select Topology Type as "Generic Network" with State as "CO - Colorado"
    #And I click on "AddCircuit" button
    #And I Select circuit data in Create Topology Page
    And I click on "AddDevice" button
    And I Select device data in Create Topology Page
    And I fill the necessary fields with "TopologyGeneralAttributes" data in Create Topology Page
    And I Validate Audit Logs of Topology
    And I Validate Remove device and circuit
    And I have Updated TopologyType as "Generic Network"
    And I Validate Audit Logs of Topology
    And I Validated related tab Topology view Page
    Then I Validated Delete Topology view Page
    
   @TC55672 @TC119530 @TC119518
  Scenario: TC55672-TC55672-TC119530-Verify data displayed in the related tabs of generic topology
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Search" tab
    And I Search for the "TC55672" data from Search Tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    Then I verified "Devices" Details page
    And In the 360 view I click on the "Locations" tab
    Then I verified "Locations" Details page
    And In the 360 view I click on the "Circuits" tab
    Then I verified "Circuits" Details page
  