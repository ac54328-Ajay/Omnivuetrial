@Order
Feature: US39146-Create ONT

## Needs Re work


  @US40972-TC23914 @RegDemo @all 
  Scenario: OV- Validate changed mandatory attributes of ONT device from Inventory
    Given I Click on "Search" tab in Omnivue Activation Screen  
    And I click on "Create" tab
    And I go to "Inventory" type and select "Device"
    And I Select "Role" as Filter By value
    And Select the Role as "ONT" with Device Type as "Calix 700GE ONTs" with Sub-Type as "Calix 720GE"
    Then Validate attributes in "ONT" device details page
    And I fill the mandatory fields with "US40972-TC23914" data
 

  #topology Test3-TXNTW7223
    #Topology Test1-CANTW7920
    
  @US40972-TC23918 
  Scenario: OV- Validate changed mandatory attributes of ONT device from Network Build
    Given I Click on "Search" tab in Omnivue Activation Screen
    And I click on "Create" tab
    And I go to "Network Build" type and select "GPON Device Build"
    And I Launch the Network form with "GPON Details"
    And I select "ONT" device
    Then I fill the fields present in the network build


  @US47958-TC32254
  Scenario: OV --Verify Edit functionality and hyperlink of IPTV UNICAST Service in IPTV MULTICAST Service form
    Given I Click on "Search" tab in Omnivue Activation Screen
    And I click on "Search" tab
    