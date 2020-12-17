 @OVSanity @Link_Sanity @OVSanity_Suite
Feature: Omnivue Link Sanity Check

 @Link_Search_Sanity_check  
  Scenario Outline: @Link_Search_Sanity_check -Verify Fiber Link 360 view is displayed for "<Link Search Type>"
    Given I am logged in as a "Admin" user in Omnivue   
    And I click on "Search" tab
    And I go to "Inventory" Search type and select "Link" as Inventory type
    And I select Link type as "<Link Search Type>"  
   # And I enter link name as "Test" in the Link search slider  
    And I click on search button for "Inventory"    
    And I click on view icon in Search Result page   
    Then I should see the "Link Search screen attributes" been displayed  
    
     Examples: 
   |Link Search Type							|
   |Fiber 												|
  # |Backplane Link								|
  # |StackRing Link								|
   #|Unshielded Twisted Pair (UTP)	|
   
   
  @Link_Create_Sanity_check  
  Scenario Outline: @Link_Create_Sanity_check -Verify Fiber Link create form is displayed for "<Create Link Types>"
    Given I am logged in as a "Admin" user in Omnivue
    When I click on "Create" tab
    And I go to "Inventory" type and select "Link"
  	And I select Link type as "<Create Link Types>" under Link Create Slider
  	And I click the "Launch Create Form" button
    Then I should see the "Link Create screen attributes" been displayed

		Examples: 
		   |Create Link Types							|
		   |Fiber 												|
		  # |BackPlane Link								|
		   #|StackRing Link								|
		   #|Unshielded Twisted Par(UTP)		|
		   