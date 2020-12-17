package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVLogicalPortStepDefinition {
	
//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	
	@And("^I fill all the mandatory fields present in logiacl port Create form with \"([^\"]*)\" data$")
	public void i_fillclccontact(String testdatatype) throws Throwable {		
		enduser.fill_fields_basedon_type("OVCreateLogicalPortPage", testdatatype, "Createform");
		}
	
	@And("^I click on the \"([^\"]*)\" Logical port Page$")
	public void performactionLB(String action) throws Throwable {		
		enduser.performactionLB(action);
		}
	
	
	@And("^I fill all the mandatory fields present in LAG logiacl port Create form with \"([^\"]*)\" data$")
    public void i_fill_LAG_logical_form(String testdatatype) throws Throwable {           
           enduser.fill_fields_basedon_type("OVCreateLogicalPortPage", testdatatype, "Createform");
           }


}
