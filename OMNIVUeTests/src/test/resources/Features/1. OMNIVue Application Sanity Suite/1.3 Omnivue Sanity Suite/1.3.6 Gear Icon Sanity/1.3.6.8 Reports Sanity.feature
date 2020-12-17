 @Gearicon_Sanity @Gearicon_Sanity_Reports @OVSanity_Suite 
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
@Gearicon_Sanity_Reports
  Scenario: @Gearicon_Sanity_Reports -Validate Reports- WorkGroup activity is displayed
	Given I log into omnivue as "Admin"	 
		When I click on "Gear Icon" in Omnivue Homepage		
		And I hover the cursor to "Reports" label under gear icon 			
		And I select "Workgroup Activity" under the Gear Icon
		 Then I verify "Workgroup Activity Tab should be displayed containing DSP Workgroup, Start & End Date - Start Time & Generate report button"