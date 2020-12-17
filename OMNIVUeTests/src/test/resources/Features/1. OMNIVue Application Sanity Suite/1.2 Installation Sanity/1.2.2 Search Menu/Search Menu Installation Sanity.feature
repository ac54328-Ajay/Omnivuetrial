@InstSanity  @InstSanity_Search   @OVSanity_Suite
Feature:  Omnivue Search Menu Install Sanity test
          Verify the Search Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
 
 @InstSanity_Search 
  Scenario: OmniVue-Gen - Validating Search Tab in Omnivue -S
    Given I am in omnivue url
    When I am in the Omnivue Welcome page
    And I need to check User login box
    And I need to check OSR, DSP, MOB, ARM, ICL, CLC System are up & running in Omnivue page
    And I am logged in as a "Admin" user in Omnivue
		Then I Click on "Search" tab in Omnivue Activation Screen	
    
 @InstSanity_Search  
  Scenario Outline: OmniVue-Gen - Validating Search menu – ST-0 -"<Search Types>"
		Given I am logged in as a "Admin" user in Omnivue
		When I Click on "Search" tab in Omnivue Activation Screen	
		Then I should see the following Search types "<Search Types>"
		
		Examples: 
   |Search Types  	| 
   |Archive, Inventory, Network Build, Orders, SLA Template, SLC, Tasks|

	 
	 
 @InstSanity_Search  
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory Types- SI-0 -"<Inventory Types>"
		Given I am logged in as a "Admin" user in Omnivue
		When I Click on "Search" tab in Omnivue Activation Screen	
		And I select "Inventory" from the Search type
    Then I should see the following Inventory type values "<Inventory Types>"
    
    Examples: 
   |Inventory Types	|
   |CLC Contact, Circuit, Contact, Device, Link,	Location, Number, QOS Template, Reservation, Service, Service Area, Subscriber,	Topology|

	 
 @InstSanity_Search 
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory - Circuit – SIC-0 -"<Circuit Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Circuit" as Inventory type
		Then I should see the following Circuit Type values "<Circuit Types>"
		
		Examples: 
   |Circuit Types						|
   |Ethernet Bearer, LAG, Optical Bearer, PON, PW Unrouted (Path), Topology Virtual Circuit, Transport Path, VLAN Segment| 

   
   
 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory - Contact – SIC-0 -"<Contact Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Contact" as Inventory type
		Then I should see the following Contact Type values "<Contact Types>"
		
		Examples: 
	 |Contact Types										|
   |Alternate Location Contact, Billing Contact, Design Contact, ICOCON, Implementation Contact, Initiator Contact, Location Contact, MEET POINT CONTACT, Maintenance Contact, Proactive Notification Contact| 

   
 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory - Device  – SID-0 -"<Device Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Device" as Inventory type   
  	Then I should see the following Device Type values "<Device Types>"
  	
  Examples: 
	|Device Types												|
	|Adtran 400 Series ONT, Suttle MST, Calix E7, Corning MST, Calix C Series, Fiber Splitter	|


 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory - Link   – SILink-0 -"<Link Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Link" as Inventory type   
  	Then I should see the following Link Type values "<Link Types>"
  	
  Examples: 
	|Link Types											|
	|Backplane Link, Fiber, StackRing Link, Unshielded Twisted Pair (UTP)	|

	
 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory-Number – SINum-0 -"<Number Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Number" as Inventory type   
  	Then I should see the following Number Type values "<Number Types>"
  	
  Examples: 
	|Number Types					|
	|ASN 209 VPNID Range, CE-VLAN, MEP - ID, PW-ID, S-VLAN, SAP, SDP, VPN ID, VPN-ID Range, VPN-ID SubRange, VSI|


 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory-Reservation – SIRes-0 -"<Reservation Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Reservation" as Inventory type   
  	Then I should see the following Reservation Type values "<Reservation Types>"
  	
  Examples: 
	|Reservation Types	|
	|Hard, Soft					|



 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory-Service – SIS-0 -"<Service Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Service" as Inventory type   
  	Then I should see the following Service Type values "<Service Types>"
  	
  Examples: 
	|Service Types			|
	|DSL OVC, ENNI Link Service, HSI, Host Service, IPTV, IPTV Unicast, MEF ENNI, MEF EVC, MEF OVC, MEF Service, MEF UNI, MGR UNI, Mgmt EVC, Mgmt UNI, Probe UNI|

 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Inventory-Topology – SITop-0 -"<Topology Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I go to "Inventory" Search type and select "Topology" as Inventory type   
  	Then I should see the following Topology Type values "<Topology Types>"
  	
  Examples: 
	|Topology Types												|
	|Generic Network,	MEN Topology, PON Network		|



 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Network Build-Network Type – SNB-0 -"<Network Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I select "Network Build" in Search Tab  		 
  	Then I should see the following Network Type values "<Network Types>"
  	
  Examples: 
	|Network Types				|
	|Alt Equipment Build, Fiber Build, GPON Device Build, Transport Path, GPON Build Templates  	|


 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Network Build-Network Type - Fiber Build – SNBFB-0 -"<Fiber Build Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I select "Network Build" in Search Tab 		
		And I select Network type as "Fiber Build" in Search tab 
  	Then I should see the following Fiber Build- Devicerole values "<Fiber Build Types>"
  	
  Examples: 
	|Fiber Build Types	|
	|FDH, FDP, MDU, MST, OLT, ONT, Splitter	|

 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Network Build-Network Type - Transport Path – SNBTP-0 -"<Transport Path Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I select "Network Build" in Search Tab 
		And I select Network type as "Transport Path" in Search tab				 
  	Then I should see the following Transport Path-Devicerole values "<Transport Path Types>"
  	
  Examples: 
	|Transport Path Types	|
	|BRAS, DSLAM, NID			|

 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Orders-Product Type – SOrd-0 -"<Order types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I select "Orders" in Search Tab  
		Then I should see the following Order type "<Order types>"
		
		Examples: 
	|Order types			|
			|Customer Orders, Network Orders, Customer Orders, Test Orders |



 @InstSanity_Search
  Scenario Outline: OmniVue-Gen - Validating Search menu – Service Level Check -SLC-0 -"<SLC check Types>"
	Given I am logged in as a "Admin" user in Omnivue
    When I Click on "Search" tab in Omnivue Activation Screen	
		And I select "SLC" in Search Tab  
		Then I should see the following SLC check Types "<SLC check Types>"
		
	 Examples: 
	|SLC check Types					|
	|Bandwidth Upgrade Check, Service Level Check	|
