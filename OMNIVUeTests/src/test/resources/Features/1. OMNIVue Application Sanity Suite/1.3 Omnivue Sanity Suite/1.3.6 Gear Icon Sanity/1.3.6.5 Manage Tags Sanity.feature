 @Gearicon_Sanity @Gearicon_Sanity_ManageTags @OVSanity_Suite 
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
@Gearicon_Sanity_ManageTags
  Scenario: @Gearicon_Sanity_ManageTags -Validate Manage Tags is displayed
	Given I log into omnivue as "Admin"	 
		When I click on "Gear Icon" in Omnivue Homepage					
		And I select "Manage Tags" under the Gear Icon
		Then I should see the "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed" been displayed 