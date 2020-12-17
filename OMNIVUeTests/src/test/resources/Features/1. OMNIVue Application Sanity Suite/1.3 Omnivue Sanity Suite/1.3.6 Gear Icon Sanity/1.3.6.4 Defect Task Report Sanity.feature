 @Gearicon_Sanity @Gearicon_Sanity_Defect_Task_Report @OVSanity_Suite 
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
@Gearicon_Sanity_Defect_Task_Report
  Scenario: @Gearicon_Sanity_Defect_Task_Report -Validate Defect Task Report is displayed
	Given I log into omnivue as "Admin"	 
		When I click on "Gear Icon" in Omnivue Homepage					
		And I select "Defect Task Report" under the Gear Icon
		Then I should see the "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed" been displayed 