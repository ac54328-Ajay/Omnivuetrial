package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVServiceareaStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVActivationPage actvtnpage;
	
	@And("^I enter Service Area Name as \"([^\"]*)\"$")
	public void i_select_Service_Area_name_as (String SerAreaname) throws Throwable {
		
		actvtnpage.tbx_service_area_name.sendKeys(SerAreaname);
		
	}
	
	@And("^I Enter Servicearea Full name as \"([^\"]*)\"$")
	public void I_Enter_Servicearea_Fullname_as_Test(String name) throws Throwable 
	{
		
		enduser.I_Enter_Servicearea_Fullname_as_Test(name);		
	}
	
	@And("^I fill all the mandatory fields present in Service area Create form with \"([^\"]*)\" data$")
	public void I_fill_mandatoryfield(String arg1) throws Throwable {
		enduser.fill_fields_basedon_type("OVCreateSerivceAreaPage", arg1, "Createform");
	}
	
	@And("^I click on \"([^\"]*)\" button in Service area screen$")
	public void Servicearea_Action(String action) throws Throwable {
		enduser.Servicearea_Action(action);
	}

}
