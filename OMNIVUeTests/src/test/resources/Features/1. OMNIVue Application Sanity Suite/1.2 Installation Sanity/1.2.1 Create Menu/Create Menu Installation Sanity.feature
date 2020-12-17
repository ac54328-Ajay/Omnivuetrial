 #CREATE MENU

@InstSanity @InstSanity_Create  
Feature: Omnivue Create Menu Install Sanity test
         Verify the Create Menu items – basic sanity test. This doesn’t
         verify all the sub-functions in each menu, but should insure
         that the base install is good and at a high level Create items work.
        
 @InstSanity_Create 
  Scenario: @InstSanity_Create -Validating Create Tab inOmnivue - C
    Given I am in omnivue url
    When I am in the Omnivue Welcome page    
     And I need to check User login box
    And I need to check OSR, DSP, MOB, ARM, ICL, CLC System are up & running in Omnivue page
    And I log in as a "Admin" user    
    Then I click on "Create" tab		
		
		
@InstSanity_Create 
  Scenario Outline: @InstSanity_Create -Validating Create menu - CT-0 -"<Create Types>"
		Given I am logged in as a "Admin" user in Omnivue		
		When I click on "Create" Tab in Omnivue Homepage
		Then I should see the following Create types "<Create Types>"
		
		Examples: 
   |Create Types  					| 
   |Bandwidth Upgrade Check, Inventory, Network Build, Orders |

	 
@InstSanity_Create
  Scenario Outline: :  @InstSanity_Create -Validating Create menu- Inventory Type-Circuit – CIC-0 -"<Circuit Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		 And I go to "Inventory" type and select "Circuit"
		 Then I should see the following Circuit types "<Circuit Types>" under Create Tab

 Examples: 
   |Circuit Types						|
   |Ethernet Bearer, LAG, Optical Bearer, PON, Pseudo Wire, Topology Virtual Circuit, VLAN Segment|   



@InstSanity_Create 
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Create Type-Bandwidth Upgrade Check – CBW-1	-"<Access Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I select "Bandwidth Upgrade Check" in Create tab
		Then I should see the following Bandwidth upgrade check-Access type "<Access Types>"

Examples: 
  	|Access Types | 
		|UNI					|	



@InstSanity_Create 
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Create Type-Inventory – CI-0 -"<Inventory Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I select "Inventory" in Create tab
		Then I should see the following Inventory type values "<Inventory Types>" under Create Tab
		
		 Examples: 
   |Inventory Types	|
   | CLC Contact, Circuit, Contact, Device, Link, Location, Number, QOS Template, Reservation, Service, Service Area, Subscriber |





@InstSanity_Create 
  Scenario Outline: :  Validating Create menu- Inventory Type- Device – Filter By- CID-0 -"<Filter by>"
	Given I am logged in as a "Admin" user in Omnivue
		When I click on "Create" Tab in Omnivue Homepage		
		 And I go to "Inventory" type and select "Device"
		 Then I should see the following Filter by values "<Filter by>" under Create Tab
		
 Examples: 
   |Filter by		|
   |Role, Technology, All|


@InstSanity_Create 
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Device – Role - CIDR -0 -"<Role Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Inventory" type and select "Device"
		And I Select "Role" as Filter By value		 
 		Then I should see the following Role types "<Role Types>" under Create Tab

Examples: 
  |Role Types	|
  |AGG, BRAS, DSLAM, FDH, FDP, MDU, MST, NID, NPE, OLT, ONT, SPLITTER	|

  
@InstSanity_Create
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Device – Technology - CIDT -0 -"<Technology Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Inventory" type and select "Device"
		And I Select "Technology" as Filter By value
		Then I should see the following Technology types "<Technology Types>" under Create Tab

Examples: 
  |Technology Types	|
	|ETHERNET, GPON, PASSIVE |	


@InstSanity_Create
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Device – All Device - CIDT -0 -"<Device Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Inventory" type and select "Device"
		And I Select "All" as Filter By value
		Then I should see the following Device types "<Device Types>" under Create Tab

Examples: 
  |Device Types												|
	|Suttle MST, Calix E7, Corning MST, Fiber Splitter, Calix C Series,	Calix 800G Series ONT	|

	
@InstSanity_Create
  Scenario Outline: : Validating Create menu- Inventory Type- Link – CILink-0 -"<Link Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen	
		And I go to "Inventory" type and select "Link"
		Then I should see the following Link types "<Link Types>" under Create Tab

Examples: 
  |Link Types											|
  |BackPlane Link, Fiber, StackRing Link, Unshielded Twisted Par(UTP)	| 

	

@InstSanity_Create 
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Location – CILoc-0 -"<Location Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen		
		And I go to "Inventory" type and select "Location"
		Then I should see the following Location types "<Location Types>" under Create Tab

Examples: 
  |Location Types				|
  |Address Range, Individual Location, Bulk Create |

  
 @InstSanity_Create
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Logical Port  - CILPort-0 -"<Port Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen	
		And I go to "Inventory" type and select "Logical Port"
		Then I should see the following Logical Port types "<Port Types>" under Create Tab

Examples: 
  |Port Types				|
  |Ethernet Bearer, LAG Port, VLAN Interface	|
 
  
  
  @InstSanity_Create
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Number/Ethernet Type - CINumE-0 -"<Number Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Inventory" type and select "Number"		
		Then I should see the following Number types "<Number Types>" under Create Tab

Examples: 
 	|Number Types					|
 	|CE-VLAN, S-VLAN, ASN 209 VPNID Range, MEP-ID, PW-ID, SAP, SDP, VSI, VLAN|
#VPN ID, VPN-ID Range, VPN-ID SubRange,
   @InstSanity_Create
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Service – CIS-0 -"<Service Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Inventory" type and select "Service"
  Then I should see the following Service type "<Service Types>" under Create Tab

Examples: 
  |Service Types	|
  |DSL OVC, ENNI Link, HSI, Host Service, IPTV, IPTV Unicast, MEF ENNI,	MEF OVC, MEF UNI, MGR UNI, Probe UNI |



@InstSanity_Create
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Inventory Type- Topology – CITop-0 -"<Topology Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Inventory" type and select "Topology"
  Then I should see the following Topology types "<Topology Types>" under Create Tab

Examples: 
  |Topology Types		|
  |Generic Network, MEN Topology, PON Network	|

	

@InstSanity_Create @TEST2345
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Create Type-Network Build – CINB-0 -"<Network Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I select "Network Build" in Create tab
		Then I should see the following Network types "<Network Types>" under Create Tab

Examples: 
  |Network Types							|
  |Alternate Equipment Build, GPON Device Build, Transport Path	|

	@InstSanity_Create @TEST2345
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Create Type-Network Build- Alternate Equipment Build – CIBN-1 -"<Equipment Types>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Network Build" type and select "Alternate Equipment Build"
		Then I should see the following Build types "<Equipment Types>" under Create Tab

Examples: 
  |Equipment Types	|
  |CE, Non-CE				|

  
  @InstSanity_Create @TEST2345
  Scenario Outline: : @InstSanity_Create -Validating Create menu- Create Type-Network Build- Transport Path  CINBT-0 -"<Device roles>"
		Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Create" tab in Omnivue Activation Screen
		And I go to "Network Build" type and select "Transport Path"
		Then I should see the following Device roles "<Device roles>" under Create Tab

Examples: 
  |Device roles	|
  |BRAS, DSLAM, NID	|
