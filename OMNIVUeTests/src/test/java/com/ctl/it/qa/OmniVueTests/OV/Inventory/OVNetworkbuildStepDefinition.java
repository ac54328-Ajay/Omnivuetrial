package com.ctl.it.qa.OmniVueTests.OV.Inventory;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OVNetworkbuildStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	
	
	@And("^I select \"([^\"]*)\" as \"([^\"]*)\" in Search Tab$")
	public void i_select_search_tab(String type1, String type2) throws Exception {
		enduser.select_network_tab_values(type1,type2);
		//System.out.println(taskcheck);
	    
	}
	
	@And("^I select \"([^\"]*)\" as Build type$")
	public void i_select_buildtype(String type) throws Exception {
		enduser.selectbuildtype(type);
		//System.out.println(taskcheck);
	    
	}
	
	@And("^I configure NID & NPE devices in the ALT Equipment Build$")
	public void add_device_buildtype() throws Exception {
		enduser.add_device_Alt_equit();
		//System.out.println(taskcheck);
	    
	}
	
	@And("^I add the NID & NPE devices in the ALT Equipment Build$")
	public void add_existingdevice_buildtype() throws Exception {
		enduser.add_existing_device_Alt_equit();
			    
	}
	
	@And("^I fill mandatory field in Alt Equipment Build$")
	public void fillfieldsinaltequit() throws Exception {
		enduser.fillfields_altequit();
		//System.out.println(taskcheck);
	    
	}
	
	@And("^I select \"([^\"]*)\" in Search Tab$")
	public void select_searchtype(String type) throws InterruptedException{
		enduser.Search_selectsearchtype(type);
	}
	
	@When("^I select Network type as \"([^\"]*)\" in Search tab$")
	public void select_Networktype(String type) throws InterruptedException{
		enduser.select_Networktype(type);
	}
	
	@And("^I select Devicerole as \"([^\"]*)\" under Search tab$")
	public void select_devicerole_fiberbuild(String role) throws InterruptedException{
		enduser.select_devicerole_fiberbuild(role);
	}
	
	@And("^I Select \"([^\"]*)\" as Technology type for Number$")
	public void select_number_technologytype(String type) throws InterruptedException{
		enduser.select_create_number_technologytype(type);
	}
	
	@And("^I search for \"([^\"]*)\" Gpon Build$")
	public void select_build_GDB(String build) throws Throwable{
		enduser.select_GDB_Build(build);
	}
	
	@And("^I search with \"([^\"]*)\" criteria in Search Tab$")
	public void GDB_searchselect_criteria(String criteria) throws Throwable{
		enduser.GDB_searchselect_criteria(criteria);		
	}
	
	@And("^I should see the \"([^\"]*)\" been displayed$")
	public void Sanity_validations(String validation) throws Throwable{
		enduser.Sanity_validations(validation);		
	}
	
		
	
	
	@And("^I click on the \"([^\"]*)\" in Order details screen$")
	public void order_screenvalidation(String validation) throws Throwable{
		enduser.order_screenvalidation(validation);		
	}
	
	
	/*@And("^I click on the \"([^\"]*)\" in Network result page$")
	public void select_build_ID_result(String build) throws Throwable{
		enduser.select_buildid_result(build);
	}*/
	
	
	@And("^I search for the GFAST-Order from common sheet$")
	public void search_gfast_order_excel() throws Throwable{
		enduser.search_gfast_order_excel();
	}
	
	@Then("^I validate for task result in Omnivue$")
	public void Validation_Gfast_order_Task() throws Throwable{
		enduser.Validation_Gfast_order_Task();
	}
	
	@And("^I select the \"([^\"]*)\" as Device Role and device name \"([^\"]*)\"$")
	public void i_select_device_role_and_enter_Device_name (String Drole, String Dname) throws Throwable {
		enduser.Create_Tab_NB_transport_path(Drole, Dname);
		
		
	}
	
	@And("^I launch Network Create form$")
	public void i_launch_the_create_form () throws Throwable {
	
		enduser.launch_NB_Transport_path_create_form();
				
	}
	
	//**********************US171722 - Changes - 7/21/2017 ***************************//
	
	@And("^I Should see the \"([^\"]*)\"$")
	public void Network_order_status(String statusvalidation) throws Throwable {
		enduser.Network_order_status(statusvalidation);
	}
	
	@And("^I Launch the Network order by clicking on Order/CSOF ID$")
	public void launching_networkorder_altequipscreen() throws Throwable {
		enduser.launching_networkorder_altequipscreen();
	}
	
	@And("^I click on \"([^\"]*)\" in Transport path screen$")
	public void TransportPath_actions(String statusvalidation) throws Throwable {
		enduser.TransportPath_actions(statusvalidation);
	}
}
