 @Sanity_check  @Order_Sanity @OVSanity_Suite 
 Feature: Omnivue Order Sanity Check

  #@Sanity @Order_Sanity_check
  #Scenario Outline: OV-Validating Order Search based on types
  #  Given I am in omnivue url
  #  When I log in as a "Admin" user
  #  And I click on "Search" tab
  #  And I searched for "<Container>"
  #  And I click on search button for "Orders"
  #  Then I click on view icon in Search Result page

  #  Examples: 
  #    | Container                    |
  #    | Ethernet Order-Sanity search |
  #    | GPON Order-Sanity search     |

@Order_Createlaunch 
Scenario: @Order_Createlaunch -Validate Order Create form Launch
Given I am logged in as a "Admin" user in Omnivue
 When I click on "Create" tab
 And I select "Orders" in Create Tab 
 And I click the "Order create form" button
Then I should see the "Order Create screen attributes" been displayed


@Order_Searchlaunch 
Scenario: @Order_Searchlaunch -Validate Order Search Launch
Given I am logged in as a "Admin" user in Omnivue
When I Click on "Search" tab in Omnivue Activation Screen
And I select "Orders" in Search slider
And I select "GPON" as Product-type in Order’s Search slider
And I clicked on Advance Search for "Orders"
And I Search order with "All"-Service type in Advance search screen
And I click on Advance search button for "Orders"
And I click on view icon in Search Result page   
Then I should see the "Order Search screen attributes" been displayed 