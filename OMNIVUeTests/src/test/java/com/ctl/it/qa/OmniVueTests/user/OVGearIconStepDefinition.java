package com.ctl.it.qa.OmniVueTests.user;

import java.sql.SQLException;

 
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVGearIconStepDefinition {

	 //private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
		
		@Steps
		UserSteps enduser;
				
		@And("^I select \"([^\"]*)\" under the Gear Icon$")			
		public void select_gearicon(String type) {
			
				enduser.select_gearicon(type);	
			}
		
		
		@And("^I verify the duplicate vales in activity focus$")
		public void validate_duplicate_value() throws Throwable{
			enduser.duplicate_value();
		} 
		
		@And("^I click on \"([^\"]*)\" button in Manager User screen$")			
		public void manageuser_actions(String type) {
			
				enduser.manageuser_actions(type);	
			}
		
		@And("^I click on the view icon in the User search result$")			
		public void gearicon_viewmanageusers() {
			enduser.gearicon_viewmanageusers();
		}
		
		@And("^I hover the cursor to \"([^\"]*)\" label under gear icon$")			
		public void hover_gearicon(String type) {
			
				enduser.select_gearicon(type);	
			}
		
		@And("^I click on \"([^\"]*)\" in Manage tags page$")			
		public void select_managetag(String type) {
			
				enduser.select_gearicon(type);	
			}
		
		@And("^I select \"([^\"]*)\" in Manage tags page$")			
		public void select_tasktype(String type) {
			
				enduser.select_gearicon(type);	
			}
		
		@And("^I create \"([^\"]*)\"$")			
		public void create_tag_ManageTag(String name) {
			
				enduser.create_tag_ManageTag(name);	
			}
		
		@And("^I create \"([^\"]*)\" tag$")			
		public void create_tag_ManageTag1(String name) {
			
				enduser.create_tag_ManageTag1(name);	
			}
		
		@And("^I select \"([^\"]*)\" as OV Workgroup in Defect Task Report$")			
		public void DefectTask_OVworkgroup(String wgrp) {
			
				enduser.DefectTask_OVworkgroup(wgrp);	
			}
		
		
		@And("^I filter by \"([^\"]*)\" in Manager User screen$")			
		public void mnguserfilerby(String wgrp) {
			
			enduser.mnguserfilerby(wgrp);	
			}
		
		@And("^I enter filter text with \"([^\"]*)\"$")			
		public void mnguserfilertext_type(String usrname) {
			
			enduser.mnguserfilertext_type(usrname);	
			}
		
		@And("^I select DSP workgroup as \"([^\"]*)\" in workgroup activity report$")			
		public void select_dspworkgroup_wrkgroupactivity(String grpname) {
			enduser.select_dspworkgroup_wrkgroupactivity(grpname);	
		}
		
		@And("^I click on \"([^\"]*)\" in workgroup activity report screen$")			
		public void action_dspworkgroup_wrkgroupactivity(String action) {
			enduser.action_dspworkgroup_wrkgroupactivity(action);	
		}
		
		@And("I click on \"([^\"]*)\" button in DSP Administration screen")
		public void DSPAdmin_actions(String type) {
			
			enduser.DSPAdmin_actions(type);	
		}
		
		@And("^I validate the web page displayed in new tab$")
		public void i_validate_the_web_page_displayed_in_new_tab() {			
			enduser.i_validate_the_web_page();		   
		}
		
		@And("^I validate the new web page displayed in new tab$")
		public void i_validate_the_new_web_page_displayed_in_new_tab() {			
			enduser.i_validate_the_new_web_page();		   
		}
		@And("^I Validate the tag names in DB and GUI$")
		public void tag_name() throws SQLException, InterruptedException {
			enduser.readtag_name();
			
		}
		
		@And("^I validate OMNIVUE configurable_data_xref table$")
		public void validate_OMNIVUE_configurable_data_xref_table() throws InterruptedException {			
			enduser.configurable_data_xref_table();		   
		}
		@And("^I Delete \"([^\"]*)\" Tag$")			
		public void delete_tag(String usrname) {
			
			enduser.delete_Tag(usrname);	
			}
		
		
		@And("^I validate the fields displayed in the GETO Details Report page$")
        public void i_validate_GETO_Details_report_page(){
               enduser.validate_GETO_Details_page();
        }

		
}
