 @Gearicon_Sanity @Gearicon_Sanity_My_Dashboard @OVSanity_Suite
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
@Gearicon_Sanity_My_Dashboard
  Scenario: @Gearicon_Sanity_My_Dashboard -Validate My Dashboard is displayed
	Given I log into omnivue as "Admin"	 
		When I click on "Gear Icon" in Omnivue Homepage					
		And I select "My Dashboard" under the Gear Icon
		 Then I verify "Add Widget drop down field should be displayed containing Inventory, Network Build, Order, Reports, Tasks & IFrame Widgets values"