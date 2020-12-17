package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVCLCContactStepDefinition {
	
//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
		
	
	@And("^I fill all the mandatory fields present in CLC Contact Create form with \"([^\"]*)\" data$")
	public void i_fillclccontact(String testdatatype) throws Throwable {
		enduser.browser_zoom_in();
		enduser.fill_fields_basedon_type("OVCreateCLCContactPage", testdatatype, "Createform");
		}
	
	@And("^I click on the \"([^\"]*)\" button in CLC Contact Page$")
	public void action_clccontact(String acttype) throws Throwable {		
		enduser.action_clccontact(acttype);
		}
	
	@And("^I click on the created CLC Contact Page$")
	public void i_click_on_the_created_CLC_Contact_Page() throws Exception {
		
		enduser.click_on_secondTab();
		 
		}
	
	@And("^I select \"([^\"]*)\" in CLC contact Search Tab$")
	public void searchslider_clccontact(String slidr) throws Throwable {	
		enduser.searchslider_clccontact(slidr);
	}
	@And("^I Search Bulk Contact with Cuid as \"([^\"]*)\" and Validate in Bulk Contacts view page$")
	public void enter_Search_clccontact(String slidr) throws Throwable {	
		enduser.enter_Search_clccontact(slidr);
	}
	@And("I validate the column names")
	public void validate_column_names() throws Throwable {	
		enduser.validate_column_names();
	}
	@And("^I search CLC contact with firstname as \"([^\"]*)\"$")
	public void Search_clccontact_with_firstname(String firstname) throws Throwable {	
		enduser.Search_clccontact_with_firstname(firstname);
	}
	@And("^I validate the customer column$")
	public void validating_customercoloum() throws Throwable {	
		enduser.validating_customer_columnheader();
	}
	@And("^I validate add circuit popup in CLC Contact view page$")
	public void validate_add_circuit() throws Throwable {
	enduser.validate_add_circuit();
	}
	@And("^I Enter CLC contact firstname as \"([^\"]*)\"$")
	public void Enter_clccontact_firstname(String firstname) throws Throwable {	
		enduser.Enter_clccontact_firstname(firstname);
	}
	
	@And("^I validate Total contacts of Bulk contacts in OV Database$")
	public void validate_Total_contacts_in_database() throws Throwable {	
		enduser.validate_Total_contacts_in_database();
	}
	@And("^I Verify the CLC Contact Details displayed in CLC Contact Page$")
	public void i_verify_clccontact_details_page() throws Throwable {
		
		enduser.verify_clc_details();
	}
}
