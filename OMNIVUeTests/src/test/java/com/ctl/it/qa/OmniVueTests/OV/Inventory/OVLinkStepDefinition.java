package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVLinkStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVActivationPage actvtnpage;
	
	
	@And("^I go to \"([^\"]*)\" Search type and select \"([^\"]*)\" as Inventory type$")
	public void i_go_to_Search_type_and_select_inventory_type (String arg1, String arg2) throws Throwable {
		
		enduser.i_go_to_Search_type_and_select_inventory_type (arg1,arg2);
		
	}
	@And("^I select Link type as \"([^\"]*)\" under Link Create Slider$")
	public void i_selectlinktypeas_createslider(String arg1) throws Throwable {
		enduser.i_selectlinktypeas_createslider(arg1);
	}
	
	@And("^I select Link type as \"([^\"]*)\"$")
	public void i_select_link_type_as (String Ltype) throws Throwable {
		
		actvtnpage.ddl_Link_type.selectByVisibleText(Ltype) ;
		//actvtnpage.tbx_Searchtab_Link_Devicename.clear();
		//actvtnpage.tbx_Searchtab_Link_Devicename.sendKeys("TESTYYYY");
	}
	
	@And("^I enter link name as \"([^\"]*)\" in the Link search slider$")
	public void i_enterlinkname_as(String Lname) throws Throwable {
		enduser.i_enterlinkname_as(Lname);
	}
	
	@And("^I select Link type as \"([^\"]*)\" under Create Slider$")
	public void createtab_inventory_Link_Type(String Linktype) throws Throwable {
		enduser.createtab_inventory_Linktype(Linktype);
	}
	
	@And("^I fill all the mandatory fields present in Link Create form with \"([^\"]*)\" data$")
	public void I_fill_mandatoryfield(String arg1) throws Throwable {
		enduser.fill_fields_basedon_type("OVCreateLinkPage", arg1, "Createform");
	}
	@And("^I select device type as \"([^\"]*)\" in device search slider$")
	public void devicetype_in_device_search_slider(String type) throws InterruptedException{
		enduser.devicetype_in_device_search_slider(type);
	}

	@And("^I click on \"([^\"]*)\" button in Link screen$")
	public void Link_Action(String action) throws Throwable {
		enduser.Link_Action(action);
	}
	
	 //*********************************  Sanity part - 5/8/2017  **********************************************//
	 
	
	
	@And("^I select Link type as \"([^\"]*)\" under Create Tab$")
	public void createtab_inventory_Link_Typeselect(String Linktype) throws Throwable {
		enduser.createtab_inventory_devicetype(Linktype);
	}
}
