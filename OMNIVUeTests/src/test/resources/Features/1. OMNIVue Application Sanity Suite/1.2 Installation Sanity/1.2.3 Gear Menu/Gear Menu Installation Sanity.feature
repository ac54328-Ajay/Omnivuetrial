@InstSanity  @InstSanity_Gear  @OVSanity_Suite
Feature:  Omnivue Gear Menu Install Sanity test
          Verify the Gear Menu items – basic sanity test. This doesn’t
          verify all the sub=functions in each menu, but should insure
          That the base install is good and at a high level the search items work.      
          
          
 @InstSanity_Gear 
  Scenario Outline: Validating Gear menu- GI-0 "<Gear labels>"
		Given I am logged in as a "Admin" user in Omnivue		
		When I click on "Gear Icon" in Omnivue Homepage
		Then I should see "<Gear labels>" label displayed in the Gear dropdown
		
		Examples: 
   |Gear labels 				| 
   |App Version , FAQ Link, Link to User Guide, Administration, Reports, Manage Tags, Configure, Logout	|

   
   
   