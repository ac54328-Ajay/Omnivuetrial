package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVNumberStepDefinition {
	
//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	
	@And("^I fill all the mandatory fields present in Number Create form with \"([^\"]*)\" data$")
	public void fill_fieldsnumber(String testdatatype) throws Throwable {		
	enduser.fill_fields_basedon_type("OVCreateNumberPage",testdatatype,"NumberPage");
	}
	
	@And("^I click on \"([^\"]*)\" button in Number Screen$")
	public void Number_screenActions(String action) throws Throwable {		
		enduser.Number_screenActions(action);
	}
	
	
	@And("^I changed the \"([^\"]*)\" in Number screen$")
	public void Number_screenupdation(String fields2update) throws Throwable {	
		enduser.Number_screenActions(fields2update);
	}

}
