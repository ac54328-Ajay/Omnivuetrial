 @SLC_Sanity @OVSanity_Suite
Feature:  SLC Sanity Validations

@SLC_Create_Sanity
 Scenario: @SLC_Create_Sanity -Service Level Check Sanity validation
Given I am logged in as a "Admin" user in Omnivue
 When I click on "Create" tab
 And I select "Service Level Check" in Create Tab 
And I Launch the SLC with "SlcDetails" 
Then I verify SLC Sanity validation

@BandwidthUpgradeChecker_Create_Sanity
 Scenario: @BandwidthUpgradeChecker_Create_Sanity -Order_Createlaunch -Bandwidth Upgrade Checker Sanity validation
Given I am logged in as a "Admin" user in Omnivue
 When I click on "Create" tab
 And I select "Service Level Check" in Create Tab 
And I Launch the SLC with "SlcDetails" 
Then I verify "Bandwidth Upgrade Checker screen"