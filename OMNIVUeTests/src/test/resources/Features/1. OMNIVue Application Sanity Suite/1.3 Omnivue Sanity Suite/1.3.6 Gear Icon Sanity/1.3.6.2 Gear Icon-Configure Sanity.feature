@Gearicon_Sanity @Gearicon_Sanity_Configure @OVSanity_Suite 
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.
          
          
 
  @Sanity @Sanity_Configure
  Scenario: Verify user is able to see the configure type
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I click on "Gear Icon" in Omnivue Homepage		
    And I select "Configure" under the Gear Icon
    Then I verify "Ref Data Table is displayed for all the Application Type in the Configure screen"
          