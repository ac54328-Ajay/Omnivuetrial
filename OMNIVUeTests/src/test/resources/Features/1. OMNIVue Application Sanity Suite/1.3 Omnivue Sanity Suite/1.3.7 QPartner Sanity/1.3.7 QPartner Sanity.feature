 @QPartner_Sanity @OVSanity_Suite
Feature:  QPartner Sanity Validations

@QPartner_Sanity_LoginScreen 
   Scenario: @QPartner_Sanity_LoginScreen -Qpartner Sanity validation - Qpartner Login Page
                Given I launch the QPartner application
                Then I verify QPartner Login screen

@QPartner_Sanity_Homepage 
                Scenario: @QPartner_Sanity_Homepage -Qpartner Sanity  validation - Qpartner Home Screen
                Given I launch the QPartner application
               	When I login as "QPartnerUser" in QPartner application         
                Then I verify User should be able to see the Welcome screen & tabs       
                
@QPartner_Sanity_SLCLaunch
                Scenario: @QPartner_Sanity_SLCLaunch -Qpartner Sanity  validation - SLC Launch
                Given I launch the QPartner application
                When I login as "QPartnerUser" in QPartner application          
                And I click on Central tab
                And I hover to Selling sub-tab under Central tab
               And I select OMNIVue link in the Selling drop down
                Then I verify OMNIVUe SLC page is opened in New Tab
                
                
@QPartner_Sanity_SLCSanityvalidation
                Scenario: @QPartner_Sanity_SLCSanityvalidation -Qpartner Sanity  validation - SLC Sanity validation
                Given I launch the QPartner application
								When I login as "QPartnerUser" in QPartner application           
								And I click on Central tab
								And I hover to Selling sub-tab under Central tab
                And I select OMNIVue link in the Selling drop down         
                Then I verify SLC Sanity validation
                
      
@InstSanity_Qpartner_Search  
                Scenario: @InstSanity_Qpartner_Search -Qpartner Sanity  validation - Service Level check Sanity validation
                    Given I launch the QPartner application
     								When I login as "QPartnerUser" in QPartner application                  
    								And I click on Central tab
    								And I hover to Selling sub-tab under Central tab
                    And I select OMNIVue link in the Selling drop down         
                   	And I check the Service check functionality by filling all the mandatory fields in SLC
                 	 	Then I verify the submitted Service is in the SLC Result table

