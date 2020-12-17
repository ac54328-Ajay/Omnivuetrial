package com.ctl.it.qa.OmniVueTests.OV.Inventory;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVDashboardStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);

@Steps
UserSteps enduser;


@And("^I click on the \"([^\"]*)\" button in Widget window$")
	public void Widgetactionbuttons(String Acttab) throws Throwable {
	enduser.Widgetactionbuttons(Acttab);	    
	}

@And("^I select \"([^\"]*)\" under \"([^\"]*)\" in Widget window$")
public void Widgettypeselect(String subtype,String type) throws Throwable {
	enduser.Widgettypeselect(subtype,type);	    
	}

}
