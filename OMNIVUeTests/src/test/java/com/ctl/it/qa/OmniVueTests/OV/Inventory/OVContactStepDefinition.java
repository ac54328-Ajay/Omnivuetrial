package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVContactStepDefinition {
	
//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	
	@And("^I fill all the mandatory fields present in Contact Create form with \"([^\"]*)\" data$")
		public void i_select_link_type_as (String testdatatype) throws Throwable {		
		enduser.fill_fields_basedon_type("OVCreateContactPage", testdatatype, "Createform");
		}
	
	@And("^I click on \"([^\"]*)\" button in Contact Screen$")
		public void contact_action(String action) throws Throwable {		
		enduser.contact_action(action);
	}
	
	@And("^I modify \"([^\"]*)\"$")
		public void contact_validation(String validation) throws Throwable {
		enduser.verify_validation(validation);
	}

}
