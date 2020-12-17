package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.And;
 
import net.thucydides.core.annotations.Steps;

public class OVSubscriberStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	
	@And("^I fill all the mandatory fields present in Subscriber Create form with \"([^\"]*)\" data$")
	public void I_fill_Qosmandatoryfield(String arg1) throws Throwable {
		enduser.fill_fields_basedon_type("OVCreateSubscriberPage", arg1, "Createform");
	}
	
	
	@And("^I click on \"([^\"]*)\" on Subscriber page$")
	public void Action_subscriberpage(String action) throws Throwable {
		enduser.Action_subscriberpage(action); 
	}
}
