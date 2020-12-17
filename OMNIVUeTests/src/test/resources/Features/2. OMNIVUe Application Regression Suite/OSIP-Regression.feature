Feature: OSIP Regression cases

@Regression  @OSIPRegression @all 
   Scenario: Validate activation tab  
	Given I am logged in as a "Admin" user in Omnivue
	When I click on "Search" tab
	 And I Search for the "Search Service" data from Search Tab 
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Activations" tab  
    And I click on expand icon of Related tab "Activations" page
   Then Validate the Activations tab with Activation data
   
    @Regression  @OSIPRegression @all
  Scenario: Validate fields in Create Device Screen for GPON Splitter
  Given I am logged in as a "Admin" user in Omnivue
	When I click on "Create" tab
	And I entered details for the "GENERIC OPTICAL SPLITTER"
	And I Select "1:8 splitter" for the drop down Device Sub Type
	And I click on Launch Create Form for "Device"
  Then Validate fields in create device page for splitter 

	
     @OSIPRegression @all
 Scenario: Validate Apache SOLR feature for Subscriber Name field in DSL OVC Service create screen 
    Given I am logged in as a "Admin" user in Omnivue
	When I click on "Create" tab
   And I entered details for the "Create service"
   And I Select "DSL OVC" for the drop down Service Type
   And I click on Launch Create Form for "Service"
   Then Validate apacheSolr for subscriber in create device service page
   


  @TC44387 @all 
  Scenario: Verify the create functionality of HOST Service
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab 
    And I go to "Inventory" type and select "Service" 
    And I Select "Host Service" for the drop down Service Type
   And I click on Launch Create Form for "Service"
     And I fill all the mandatory fields required in service create form with "HOST Service-TC44387 data"
      And I slect a subsciber in Subcriber section
      And I click on Create button on Service page
    Then Service should get created successfully
   
   #TEST1
   #E2E


#TEST1
   #E2E
   
 
   
   
  @TC54069 @all
  Scenario: Verify the functionality of create Ethernet Bearer Circuit
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Circuit"
    And I select "Ethernet Bearer" as the Circuit type in Create Tab
  	And I click on Launch Create Form for "Circuit"
    And I fill all mandatory fields required with "Ethernet Bearer-TC54069" in Circuit create form
    And I select the "TC54069 Start Device" Start Device
    And I fetch the Start Device ports
    And I select the "TC54069 End Device" End Device
    And I fetch the End Device ports
    And I click on Create Circuit create form
    Then Circuit should get created successfully
  
#TEST1--103/TES/ATLTAGAX654/ATLTAGAX521--Needs to updated
   #E2E--103/TES/ATLTAGAX654/ATLTAGAX521
   
  @TC55214 @all
  Scenario: Verify error message when user enter more than 8-characters in SWC CLLI
   Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab 
    And I go to "Inventory" type and select "Location" 
    And I Select "Individual Location" in Location type drop down 
    And I click on Launch Create Form for "Location"
     And I fill the "Primary Address-TC55214" details in location create form   
    And I select the Location Role in create form "Single" and "Central Office"
    And I fill the "Secondary Address-TC55214" details in location create form     
    And I click on Create button in Individual Address page
    Then Error message should be displayed for SWC CLLI

#TEST1
   #E2E
   
   
  @TCS1452 @all  @TEST11
  Scenario: Validate NID device creation
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab 
    And I go to "Inventory" type and select "Device"   
    And I Select "Role" as Filter By value
    And Select the Role as "NID" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-7"
     Then I fill the mandatory fields with "TCS1452" data 
  
    #TEST1
   #E2E
   
   ###################################################################################
   ##							Pratim Team scripts																						######
   ##																																						######
   ##																																						######
   ##																																						######
   ###################################################################################
 
   
  @TC55536 @regprathim @all
  Scenario: Verify the create functionality of GPON device type FDH
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "FDH" with Device Type as "OFS FDH" with Sub-Type as "OFS 160 FDC"
    And I fill the mandatory fields with "TC55536" data
    And I clicked the "Edit" button in Device Detail Page
    And I edit the enabled fields with "TC55531_EnabledFields" data in Device Detail Tab
    And I validate "TC55531_EnabledFields" data in the Device Detail Page
    And I clicked Networking Details Tab
    And I clicked the "Edit" button in Networking Details Tab
    And I edit the enabled fields with "Network Information" data in Networking Details Tab
    And I clicked the save button in Networking Details Tab
    Then I validate "Network Information" data in the Network Detail Page

  @TC55537 @regprathim @all
  Scenario: Verify the create functionality of GPON device type ONT
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE Series ONT" with Sub-Type as "Calix 711GE"
    And I fill the mandatory fields with "TC55537" data
    And I clicked the "Edit" button in Device Detail Page
    And I edit the enabled fields with "TC55531_EnabledFields" data in Device Detail Tab
    And I validate "TC55531_EnabledFields" data in the Device Detail Page
    And I clicked Networking Details Tab
    And I clicked the "Edit" button in Networking Details Tab
    And I edit the enabled fields with "Network Information" data in Networking Details Tab
    And I clicked the "Save" button in Networking Details Tab
    Then I validate "Network Information" data in the Network Detail Page

   @TC55531_old @all @regprathim
   Scenario: Verify the create functionality of GPON device type OLT
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "OLT" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I fill the mandatory fields with "TC55531" data
		And I clicked the "Edit" button in Device Detail Page
    And I edit the enabled fields with "TC55531_EnabledFields" data in Device Detail Tab
    And I validate "TC55531_EnabledFields" data in the Device Detail Page
    And I clicked Networking Details Tab
    And I clicked the "Edit" button in Networking Details Tab
    And I edit the enabled fields with "Network Information" data in Networking Details Tab
    And I clicked the save button in Networking Details Tab
    Then I validate "Network Information" data in the Network Detail Page
    
      @TC55534 @all @regprathim
  Scenario: Verify the create functionality of GPON device type MDU
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "MDU" with Device Type as "Calix MDU" with Sub-Type as "Calix 761 MDU"
    And I fill the mandatory fields with "TC55534" data
    And I clicked the "Edit" button in Device Detail Page
    And I edit the enabled fields with "TC55534_EnabledFields" data in Device Detail Tab
    And I validate "TC55531_EnabledFields" data in the Device Detail Page
    And I clicked Networking Details Tab
    And I clicked the "Edit" button in Networking Details Tab
    And I edit the enabled fields with "Network Information" data in Networking Details Tab
    And I clicked the save button in Networking Details Tab
    Then I validate "Network Information" data in the Network Detail Page
    
      @TC55701_1 @regprathim @all
  Scenario: Verify the create functionality of Transport Path
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Network Build" type and select "Transport Path"
    And I Select Device Role as "NID" with Device Name as "OREMUTTC00W-01CUST.01"
    And I validate "OREMUTTC00W-01CUST.01" device name along with the start device name
    And I select "101/GE1/OREMUTMA05W/OREMUTTC00W" as circuit between start and end device in Transport Path page
    And I validate "101/GE1/OREMUTMA05W/OREMUTTC00W" device name along with the end device name
    Then I validate the submit button as enabled and click on it
    
      @TC54960 @regprathim @all
  Scenario: Verify Create Topology functionality for PON Collector
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Topology"
    And I verified "Inventory" from the Create Type dropdown
    And I verified "Topology" from the Inventory Type dropdown
    And I Select Topology Type as "PON Collector" with State as "CO - Colorado"
    And I fill the necessary fields with "TopologyData" data in Create Topology Page
    And I click on "AddDevice" button
    And I verified attributes in Place Devices in Topology Page 
    And I search Device Type as "Calix C Series" with Device SubType as "Calix C7"
    Then I validate "TopologyData" data in the Topology Detail Page
    
 


  #@TC39263 @regprathim @all
  Scenario: Verify BAM Reports for the 360 view_Orders
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Search" tab
    And I Search for the "TC39263" data from Search Tab
    And I click on search button for "Orders"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "BAM Report" tab
    Then I should see "BAM event logs" displayed

  @TC55484 @regprathim @all
  Scenario: Verify the create functionality of GPON device type MDU
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "DSLAM" with Device Type as "Calix E7" with Sub-Type as "Calix E7-2"
    And I fill the madatory fields for subscriber with "TC55484-SubscriberDevices" data
    And I fill the mandatory fields with "TC55484-CreateDevices" data
    And I click on Create button
    And I clicked the "Edit" button in Device Detail Page
    And I edit the enabled fields with "TC55484-CD" data
    And I clicked the "Save" button in Device Detail Page
    And I verified all fields in device details page
    And I clicked Networking Details Tab
    And I clicked the "Edit" button in Networking Details Tab
    And I edit the enabled fields with "TC55484-ND" data
    And I clicked the "Save" button in Networking Details Tab
    Then I verified all fields in networking details page
  #Needs some rework to merge with others
  
  @TC39242 @regprathim @all
  Scenario: Verify the create functionality of GPON device type MDU
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Adtran Total Access 300 Series ONT" with Sub-Type as "Adtran TA324 G1"
    And I click on wirecenterCLLI search button
    Then I verified all fields of wire center CLLI lookup

  @TC55673 @regprathim @all
  Scenario: Verify data displayed in the related tabs for GPON devices
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Search" tab
    And I Search for the "TC55673-Search" data from Search Tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Locations" tab
    Then I verified "Locations" Details page
    And In the 360 view I click on the "Circuits" tab
    Then I verified "Circuits" Details page
    And In the 360 view I click on the "Devices" tab
    Then I verified "Devices" Details page

  @TC55535 @regprathim @all
  Scenario: Verify the create functionality of GPON device type MST
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "MST" with Device Type as "Corning MST" with Sub-Type as "Corning 12-port MST"
    And I fill the mandatory fields with "TC55535-CreateDevices" data
    And I click on Create button
    And I clicked the "Edit" button in Device Detail Page
    And I edit the enabled fields with "TC55484-CD" data
    And I clicked the "Save" button in Device Detail Page
    And I verified all fields in device details page
    And I clicked Networking Details Tab
    And I clicked the "Edit" button in Networking Details Tab
    And I edit the enabled fields with "TC55484-ND" data
    And I clicked the "Save" button in Networking Details Tab
    Then I verified all fields in networking details page

  
  @TC54963 @regprathim @all
  Scenario: Verify Edit functionality for PON Collector Topology
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Search" tab
    And I Search for the "TC54963-Search" data from Search Tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in "Topology" Detail Page
    And I edit the enabled fields with "TC55963-TD" data
    And I clicked the "Save" button in "Topology" Detail Page
    Then I verified all fields in topology details page

  @TC54965 @regprathim @all
  Scenario: Verify correct Data displayed in Related tab for PON Collector Topology
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Search" tab
    And I Search for the "TC54965-Search" data from Search Tab
    And I verified "Inventory" from the Search type dropdown
    And I verified "Topology" from the Inventory type dropdown
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And In the 360 view I click on the "Devices" tab
    Then I verified correct Data displayed in Devices tab





 ## @TC39223 @regprathim @all @extra
  Scenario: Verify the Add Subscriber association button
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Search" tab
    And I Search for the "TC39223" data from Search Tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    And I clicked the "Edit" button in "Link" Detail Page   
    Then I fill the field from "Tc39223searchlink"
    And I clicked the "Save" button in "Link" Detail Page    
    Then I validate the field which we had selected

  @TC55672 @regprathim @all
  Scenario: Verify data displayed in the related tabs of generic topology
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


    
   @TC55509 @regprathim @all
 		 Scenario: Verify the create functionality of GPON device type MDU
 		 Given I am logged in as a "Admin" user in Omnivue
   	 
   	 And I click on "Create" tab
   	 And I go to "Inventory" type and select "Device"
   	 And I Select "Role" as Filter By value
 		 And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-12" 		 
 		 And I fill the madatory fields for subscriber with "TC55484-SubscriberDevices" data
 		 And I fill the mandatory fields with "TC55509-CreateDevices" data
 		 And I click on Create button 		 
 		 And I clicked the "Edit" button in Device Detail Page 		
 		 And I edit the enabled fields with "TC55484-CD" data 		
 		 And I clicked the "Save" button in Device Detail Page 		 
 		 And I verified all fields in device details page 		 
 		 And I clicked Networking Details Tab 		 
 		 And I clicked the "Edit" button in Networking Details Tab 		 
 		 And I edit the enabled fields with "TC55484-ND" data 		 
 		 And I clicked the "Save" button in Networking Details Tab  		 
 		 Then I verified all fields in networking details page	
 		 
 		 
 		 
 		 #######################################################################################################
 		 ###			Week 5 Scripts -Pratim Team																		#####
 		 
 		 
 		 
 		@Reqwe
  Scenario: Verify Alt Eqpt Build order number search is retrieving all the details or not
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I select "Alt Equipment Build Type" as "CE" in Search Tab    
    And I click on Launch Create Form for "NetworkBuild"
    #And I validate "All" attributes in create form for "Alternate Equipment Build"
    And I enter the order number with "TC39261" data and click

  @TC39262
  Scenario: Verify the functionality of Add Device button of Alt Equipment Build
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Network Build" type and select "Alternate Equipment Build"
    And I entered details for the "TC39262-Alt. Equipment Build Type"
    And I click on Launch Create Form for "NetworkCreate"
    And I click on "Device-1 CLLI" button under build components
    And I fill the mandatory fields for "TC39262-Device1FORCLLI" and "TC39262-Device1" and "TC39262-Device1FORSubscriber"
    And I click on validate device button
    And I click on "Device-2 CLLI" button under build components
    And I fill the mandatory fields for "TC39262-Device2FORCLLI" and "TC39262-Device2" and "TC39262-Device2FORSubscriber"
    And I click on validate device button

  #ankit------------------------------------- Validate the ---------------# Test cases name has changed
  @TC55726
  Scenario Outline: verify Quick search fields functionality of Subscriber
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen    
    And I Search for the <TestData1> data from Search Tab
    And I click on search button for "Inventory"
    And I click on view icon in Search Result page
    Then I verify the suscriber view

    Examples: 
      | TestData1 |
      | TC55726   |
      | TC55726A  |
      | TC55726B  |
      | TC55726C  |


 		 
 	 #This TC having issue and incomplete,issue is while creating DSL OVC service Task is not created
  @TC55325 @regprathim
  Scenario: DSL OVC Service Verify the Create button functionality of DSL OVC service with AutoActivation checkbox selected
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Service"
    And I verified "Inventory" from the Create Type dropdown
    And I verified "Service" from the Inventory Type dropdown
    And I Select "DSL OVC" for the drop down Service Type
    And I click on Launch Create Form for "ServiveCreate"

  #    And I fill the necessary fields with "DSL OVC Service Data" data in Create Service Page
  @regprathim
  Scenario: Verify the appropriate validation message if Contact Information is selected but not 24X7
    Given I am logged in as a "Admin" user in Omnivue
    
    And I click on "Create" tab
    And I go to "Inventory" type and select "Contact"
    And I click on the Launch Create form button
    And I fill all the manadtory field at ov contact search deatails page
    And I click on Create button
    Then I verified the alert message

    #################################################################################################################################################
    #################							Harsha OSIP Regression																																				#####################
    #################################################################################################################################################
    
    @TC44384
   	Scenario: Verify Add More Addresses - Service Area 360 view
   	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select "Inventory" in Create slider
    And I should be able to select "Service Area" under "Inventory" create type
    And I click on the Launch Create form button
    And I validate the Searvice area create form
    
    
     #################################################################################################################################################
    #################							Sanjay OSIP Regression---7/9/2017																																				#####################
    #################################################################################################################################################
    
     @TC55509
  Scenario: Validate NPE device creation
    Given I am logged in as a "Admin" user in Omnivue    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I select Create type as "Inventory" and sub-type as "Device" under the Create Tab    
    And I Select "Role" as Filter By value
    And Select the Role as "NPE" with Device Type as "Alcatel-Lucent 7750 Service Router" with Sub-Type as "Alcatel-Lucent 7750 SR-7"
    And I fill the mandatory fields with "TC55509" data
    Then Device should get created successfully
    

 



  @TC55484
  Scenario: Verify the create functionality of Ethernet device type DSLAM with Activation Check box selected
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Device" as Inventory type
    And I select the filter by option
    And Select Role as "DSLAM" with Device Type as "Adtran Total Access 3000 Series" with Device sub type as "Adtran TA3000"
    And I select filter by option in create form for Device "ETHERNET"
    And I click on manual activation checkbox
    And I fill Location Address "TC119049-DSLAM-Address"
    And I fill Subscriber Details "TCS1452 - Subscriber"
    And I fill mandatory field of "TC55484 - DSLAM"
    When I click on Create Device button
    Then Device should get created successfully
    And Validate the task generated in Related tab task
    And Log out from OMNIVue

  @TC119049
  Scenario: Validate DSLAM device creation
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Device" as Inventory type
    And I select the filter by option
    And Select Role as "DSLAM" with Device Type as "Adtran Total Access 3000 Series" with Device sub type as "Adtran TA3000"
    #And I select filter by option in create form for Device "ETHERNET"
    # And I fill Location Address "TC96978-Address"
    And I fill Location Address "TC119049-DSLAM-Address"
    And I fill Subscriber Details "TCS1452 - Subscriber"
    And I fill mandatory field of "TC119049 - DSLAM"
    When I click on Create Device button
    Then Device should get created successfully
    And Log out from OMNIVue

  @TC119043
  Scenario: Validate TD device creation
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Device" as Inventory type
    And I select the filter by option
    And Select Role as "TD" with Device Type as "Adtran Total Access 3000 Series" with Device sub type as "Adtran TA3000"
    #And I select filter by option in create form for Device "ETHERNET"
    And I fill Location Address "TC119043-TD-Address"
    And I fill Subscriber Details "TCS1452 - Subscriber"
    And I fill mandatory field of "TC119043 - TD"
    When I click on Create Device button
    Then Device should get created successfully
    And Log out from OMNIVue

  @TC55510
  Scenario: Validate BRAS device creation
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Device" as Inventory type
    And I select the filter by option
    And Select Role as "BRAS" with Device Type as "Generic Unstructured Device" with Device sub type as "Generic Unstructured Device"
    #And I select filter by option in create form for Device "ETHERNET"
    And I fill Location Address "TC55510-BRAS-Address"
    And I fill Subscriber Details "TCS1452 - Subscriber"
    And I fill mandatory field of "TC55510 - BRAS"
    When I click on Create Device button
    Then Device should get created successfully
    And Log out from OMNIVue

  @TC55512
  Scenario: Validate BRIX device creation
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Device" as Inventory type
    And I select the filter by option
    And Select Role as "BRIX" with Device Type as "Brix Verifier" with Device sub type as "BV-1100 Verifier AC"
    And I fill Location Address "TC55512-BRIX-Address"
    And I fill Subscriber Details "TCS1452 - Subscriber"
    And I fill mandatory field of "TC55512 - BRIX"
    When I click on Create Device button
    Then Device should get created successfully
    And Log out from OMNIVue

  @TCTest
  Scenario: Verify the functionality of create Ethernet Bearer Circuit with Service type as DSLAM TRUNK
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Ethernet Bearer Circuit" as the Circuit type
    And I fill all mandatory fields required for "Ethernet Bearer - DSLAM TRUNK" Create
    And I select the "TCTest Start Device" Start Device
    And I fetch the Start Device ports
    And I select the "TC54069 End Device" End Device
    And I fetch the End Device ports
    When I click on Create Circuit
    Then Circuit should get created successfully
    And Log out from OMNIVue
    
    @TCTest01
  Scenario: Verify the functionality of create Ethernet Bearer Circuit with Service type as BRAS TRUNK
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Ethernet Bearer Circuit" as the Circuit type
    And I fill all mandatory fields required for "Ethernet Bearer - BRAS -Trunk" Create
    And I select the "TCTest01 Start Device" Start Device
    And I fetch the Start Device ports
    And I select the "TC54069 End Device" End Device
    And I fetch the End Device ports
    When I click on Create Circuit
    Then Circuit should get created successfully
    And Log out from OMNIVue

  @TC51455
  Scenario: Verify Related tab Circuits for EB Circuit part of LAG Circuit
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Circuit" as the inventory type and select "LAG" as circuit type
    And I click on view icon
    When I click on clicked on related tab "Circuit"
    Then I validated circuit name displayed in related tab Circuits
    And Log out from OMNIVue

  @TC51456
  Scenario: Verify the functionality of Create Button for create form - service type- HSI
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "HSI Service" as the service type
    And I fill all the mandatory fields required for "HSI Service - TC51456"
    When I click on create button
    Then Service should get created successfully
    And Log out from OMNIVue

  @TC845124
  Scenario: Verify data displayed in the related tabs of Backplane Link
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Link" as the inventory type and select "Backplane Link" as Link type
    And I click on view icon
    And I click on related tab Circuit
    Then I validated information displayed in related tab Circuits "Backplane Link"
    And Log out from OMNIVue

  @TC845125
  Scenario: Verify data displayed in the related tabs of Fiber Link
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Link" as the inventory type and select "Fiber" as Link type
    And I click on view icon
    And I click on related tab Circuit
    Then I validated information displayed in related tab Circuits "Fiber"
    And Log out from OMNIVue

  @TC55672
  Scenario Outline: Validate Location data displayed in the related tab locations of Topology 360 view Page
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Topology" topology as the inventory type
    And I select "<Topology Type>" topology type
    And I click on view icon
    And I click on related tab Locations
    Then I validated information displayed in related tab Location "Generic tplgy"
    And Log out from OMNIVue

    Examples: 
      | Topology Type   |
      | Generic Network |
      | OLT Ring        |
      | PON Collector   |
      | PON Network     |

  @TC44384 @TC39232 @TC39231
  Scenario: Verify Add More Addresses - Service Area 360 view
    Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen
    
    And I select "Inventory" as search type and "Service Area" as the inventory type
    And I click on view icon
    Then I navigate to edit page
    When I click on Add more Address button and search for a Location using "MPLSMNCD" CLLI
    Then I validated the message displayed
    And Log out from OMNIVue

  @TC55687
  Scenario: Verify Edit functionality of HSI Service
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Service" as the inventory type and select "HSI Service Search" as service type
    And I click on view icon
    Then I navigate to edit page of the service
    And I update the service information "TC55689 - HSI Service Update"
    When I click on save button to save the service information
    Then data should be saved successfully
    And Log out from OMNIVue

  @TC39263
  Scenario Outline: Verify BAM Reports for the 360 view_Orders
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Orders" search type and select "<prdctType>" as Product Type
    And I select "<orderType>" as Order Type and enter order id "<orderNumber>"
    And I click on view icon
    When I click on related tab "BAM Report"
    Then I validate the information displayed
    And Log out from OMNIVue

    Examples: 
      | prdctType | orderType       | orderNumber |
      | Ethernet  | Network Orders  |      741701 |
      #| Ethernet  | Customer Orders |      762047 |
      #| GPON      | Customer Orders |      762814 |

  ########################
  #	BAM Report  				 #
  #	Devices							 #
  #	Tasks								 #
  #	Services						 #
  ########################
  ####################### OUT OF MY LIST ##############################################
  @TC5
  Scenario: Verify the functionality of create Ethernet Bearer Circuit with Service type as NNI
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Ethernet Bearer Circuit" as the Circuit type
    And I fill all mandatory fields required for "Ethernet Bearer - NNI" Create
    And I select the "TC54069 Start Device" Start Device
    And I fetch the Start Device ports
    And I select the "TC54069 End Device" End Device
    And I fetch the End Device ports
    When I click on Create Circuit
    Then Circuit should get created successfully
    And Log out from OMNIVue

  @TC39237
  Scenario: Verify the functionality of create LAG Circuit
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "LAG" as the Circuit type
    And I fill all mandatory fields required for "TC51 - LAG" Create
    And I click on circuit lookup
    And I enter circuit name "101/GE1/AGFIAZSR779/AGFIAZSR424" and circuit type "NMI"
    When I click on Create Circuit
    Then Circuit should get created successfully
    And Log out from OMNIVue

  @TC652221445211
  Scenario: Verify the create functionality of HOST Service with manual Activation task
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "HOST Service" as the service type
    And I fill all the mandatory fields required for "HOST Service with Activation Task"
    And I click on manual activation checkbox
    When I click on create button
    Then Service should get created successfully
    And Task should be generated and displayed in related tab Tasks
    And Log out from OMNIVue

  ######################## DONOT WORK #############################################
  @TC118966
  Scenario: Verify Create Contact Functionality
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "Contact"
    And I fill Create Contact form "TC118966 - Contact"
    When I click on Create Contact button
    Then Contact should get created successfully
    And Log out from OMNIVue

  ############################################################################################
  #				SANJAY																																						#
  #				 Jan 2017																																					#
  ############################################################################################
 

  @ABCD
  Scenario: Validate the Circuit information displayed in the related tab Circuits of Device 360 view
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and search for a "TC0214521 - Device"
    And I click on view icon
    And I click on related tab "Circuit"
    Then I validate information displayed in related tab Circuit for a Device
    And Log out from OMNIVue

  @ABCDE
  Scenario: Validate the Service information displayed in the related tab Services of Device 360 view
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and search for a "TC0214521 - Device"
    And I click on view icon
    And I click on related tab "Services"
    Then I validate information displayed in related tab Services for a Device
    And Log out from OMNIVue

  @ABCDEF
  Scenario: Validate the Contact information displayed in the related tab Contact of Device 360 view
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and search for a "TC0214521 - Device"
    And I click on view icon
    And I click on related tab "Contacts"
    Then I validate information displayed in related tab Contact for a Device
    And Log out from OMNIVue

  @ABCDEF11 @TC122364
  Scenario: Validate the Device information displayed in the related tab Device in Circuit 360 view
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Circuit" as the inventory type and select "EB" as circuit type
    And I click on view icon
    And I click on related tab "Devices"
    Then I validate Device information displayed in related tab Device in Circuit 360 view
    And Log out from OMNIVue

  @ABCDEF111
  Scenario: Validate the Subscriber information displayed in the related tab Subscriber in Circuit 360 view
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Circuit" as the inventory type and select "EB" as circuit type
    And I click on view icon
    And I click on related tab "Subscribers"
    Then I validate Device information displayed in related tab Subscriber in Circuit 360 view
    And Log out from OMNIVue

  @ABCDEF111 @TC122364_Completion_pending
  Scenario: Validate the Services information displayed in the related tab Service in Circuit 360 view
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Circuit" as the inventory type and select "EB" as circuit type
    And I click on view icon
    And I click on related tab "Services"
    Then I validate Device information displayed in related tab Services in Circuit 360 view
    And Log out from OMNIVue

  ############################################################################################
  #				ABINASH																																						#
  #				15 Dec 2016																																				#
  ############################################################################################
  @US408364_TC83610_NIC_Ethernet_Reg_MEF_UNI_Manual_Activation
  Scenario: Activate a MEF UNI Service and check in ISAT Datbase and match with the GUI
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Service" as the inventory type and select "MEF UNI Service" as service type
    And I click on view icon
    # And Search for a "UNI Service"
    # And Click on the view icon and launch View page
    And Click on Activate button with order number "Z12345" to send an activation request
    And Validate Activation Message
    And Verify and click on "Activations" related system tab
    Then Get the Values from Activation Related System Tab
    And Get the Values from Database
    Then Compare Actual and Expected Values
    And Log out from OMNIVue

  @US408364_TC83611_NIC_Ethernet_Reg_MEF_ENNI_Manual_Activation
  Scenario: Activate a MEF ENNI Service and check in ISAT Datbase and match with the GUI
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Service" as the inventory type and select "MEF ENNI Service" as service type
    And I click on view icon
    And Click on Activate button with order number "Z12345" to send an activation request
    And Verify and click on "Activations" related system tab
    Then Get the Values from Activation Related System Tab
    And Get the Values from Database
    Then Compare Actual and Expected Values
    And Log out from OMNIVue

  @US39730_TC117331_NIC_Ethernet_Reg_Revert_UNI @GETENF-5105
  Scenario: Revert a MEF UNI Service
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Service" as the inventory type and select "MEF UNI Service" as service type
    And I click on view icon
    And Click on revert button with Order Number "123456" and Reason "Test Revert"
    Then Validate Revert Message
    And Log out from OMNIVue

  @US39730_TC117332_NIC_Ethernet_Reg_Revert_ENNI @GETENF-5106
  Scenario: Revert a MEF ENNI Service
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Service" as the inventory type and select "MEF ENNI Service" as service type
    And I click on view icon
    And Click on revert button with Order Number "123456" and Reason "Test Revert"
    Then Validate Revert Message
    And Log out from OMNIVue

  @US33815_TC117333_NIC_Ethernet_Reg_Revert_Device
  Scenario: Verify the Revert of a Device
    Given I am logged in as a "Admin" user in Omnivue
    
    Then I Click on "Search" tab in Omnivue Activation Screen
    And I go to "Inventory" search type and select "Device" as the inventory type and select "Revert - Device" as device type
    And I click on view icon
    And Clicked on Revert Button
    And Entered Revert Reason as "Test Revert"
    And Clicked on Submit button
    Then Validate the Revert Message for Device
    And Log out from OMNIVue

  

  ############################################################################################
  #				ABINASH																																						## 
  #				15 Dec 2016			Need test case numbers																																	#
  ############################################################################################
  @Create01
  Scenario: Verify the create functionality of MEF UNI Service
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "MEF UNI" as service type
    And I fill all the mandatory fields required for "MEF UNI"
    And I select device : "OCALFL1"  in "MEF UNI" Service Association Section(Device) section
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully
    And Log out from OMNIVue

  @Create03 @GETENF-5029
  Scenario: NIC_Ethernet_Reg_Create MEF UNI with PM SPEC Code
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "MEF UNI" as service type
    And I fill all the mandatory fields required for "PM UNI"
    And I select device : "OCALFL1"  in "MEF UNI" Service Association Section(Device) section
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully
    And Log out from OMNIVue

  @Create06
  Scenario: NIC_Ethernet_Reg_Create MEF UNI_in CLF Format
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "MEF UNI" as service type
    And I fill all the mandatory fields required for "MEF UNI"
    And I select device : "OCALFL1"  in "MEF UNI" Service Association Section(Device) section
    When I click on Create button of "MEF UNI" page
    Then Service should get created successfully
    And Log out from OMNIVue

  @Create02 @GETENF-5030
  Scenario: NIC_Ethernet_Reg_Create MEF ENNI
    Given I am logged in as a "Admin" user in Omnivue
    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" create type and select "MEF ENNI" as service type
    And I fill all the mandatory fields required for "MEF ENNI" service
    And I select device : "LSVQNVAL111"  in "MEF ENNI" Service Association Section(Device) section
    When I click on Create button of MEF ENNI page
    Then Service should get created successfully
    And Log out from OMNIVue

  @Create004
  Scenario: NIC_Ethernet_Reg_Create MSC UNI
    Given I am logged in as a "Admin" user in Omnivue    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Service"    
  	And I should see the following Service type "MEF UNI" under Create Tab   
  	And I click on the Launch Create form button 
    And I fill all the mandatory fields required for "MSC UNI"
    And I enter "NID Device" : "BSILLANA003" in "MSC UNI" Service Association Section
    And I enter "BRIX device" : "LSVGNVCX002" in "Probe Uni" Service Association Section
    When I click on Create button of "MSC UNI" page
    Then Service should get created successfully
   

# Need test case numbers
  @Create05
  Scenario: NIC_Ethernet_Reg_Create PROBE UNI
    Given I am logged in as a "Admin" user in Omnivue    
    When I Click on "Create" tab in Omnivue Activation Screen
    And I go to "Inventory" type and select "Service"    
  	And I should see the following Service type "Probe UNI" under Create Tab
  	And I click on the Launch Create form button      
    And I fill all the mandatory fields required for "Probe UNI"
    And I enter "BRIX device" : "LSVGNVCX002" in "PROBE UNI" Service Association Section
    And I Enter MSC UNI : "12/TEST/012017//MSC" in MSC UNI Probe Uni Service Association section
    When I click on Create button of "Probe UNI" page
    Then Service should get created successfully
    

    
    
    
    
    
    