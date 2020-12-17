 @Gearicon_Sanity @Gearicon_Sanity_Myprofile @OVSanity_Suite 
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
 @Gearicon_Sanity_Myprofile 
  Scenario: @Gearicon_Sanity_Myprofile -Validate My Profile is displayed
	Given I log into omnivue as "Admin"	 
		When I click on "Gear Icon" in Omnivue Homepage			
		And I select "My Profile" under the Gear Icon		
		Then I should see the "My Profile attributes" been displayed 