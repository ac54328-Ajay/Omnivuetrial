package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OVDeviceStepDefinition {

	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;	
	OVSearchDevicePage searchDevicePage;
	@And("^I click on \"([^\"]*)\" button in Search page$")
	public void i_click_on_button_search_form(String button) throws Exception {
		Thread.sleep(5000);
		enduser.Serach_button_actions(button);
	}
	
	@And("^I add a Card to \"([^\"]*)\" Device$")
	public void i_addcard_device(String device) throws Throwable {		
		enduser.adddevicecardtodevice(device);
	}
	
	@And("^I validate the \"([^\"]*)\" Device in view page$")
	public void I_validate_device(String device) throws Throwable {		
		enduser.Validate_device_attributes(device);
	}
	
	@And("^I create NID & NPE device through Inventory$")
	public void I_create_NID_NPE() throws Exception {		
		enduser.create_NID_NPE("NID & NPE");
	}
	
	@And("^I select the device role as \"([^\"]*)\" in Device advance search$")
	public void advance_device_search(String role) throws InterruptedException{
		enduser.advance_devicesearch(role);
	}
	
	@And("^I select device type as \"([^\"]*)\" & subtype as \"([^\"]*)\" in Device advance search$")
	public void advance_devicetype_search(String type,String subtype) throws InterruptedException{
		enduser.advance_devicetype_search(type,subtype);
	}
	
	
	@And("^I select the device status as \"([^\"]*)\" in Device advance search$")
	public void advance_device_search_status(String status) throws InterruptedException{
		enduser.advance_device_search_status(status);
	}
	
	@And("^I verify that the \"([^\"]*)\" icon is present and clickable$")
	public void device_search_button_validation(String buttons) throws Throwable{
		enduser.device_search_button_validation(buttons);
	}
	
	@Then("^I fill the Max subscriber bandwidth in Device detail page$")
	public void i_fill_the_mandatory_field() throws Throwable {
		enduser.devicedetailpage_maxsubsfill();
	  
	}
	
	@And("^I validate the message displayed on triggerring Delete functionality$")
	public void device_delete_msg_validations() throws Throwable{
		enduser.device_delete_msg_validation();
	}
	@And("^I validate the warning message displayed on triggerring Delete functionality$")
	public void device_delete_warn_msg_validations() throws Throwable{
		enduser.device_delete_Warning_msg_validation();
	}
	
	@Then("^I need to validate the Device deleted from Inventory$")
	public void i_validate_device_inventory() throws Throwable {
		enduser.validate_device_OSIP();
	}
	
	@Then("^Device should get created successfully$")
	public void created_successfully_msg() throws Throwable {
		enduser.success_message_validation();
		slf4jLogger.info("Successfully created");
	}
	
	@And("^I click on the \"([^\"]*)\" in \"([^\"]*)\" result page$")
	public void Device_validationbasedaction(String action,String page) throws Throwable{
		enduser.Device_validationbasedaction(action,page);
		
	}
	
	@And("I Validate device is deleted form Inventory")
	public void i_validate_delted_device_inventory() throws Throwable {
		enduser.validate_deleted_device_inventory();
	}
	
	//############################ TC223190 - 9/5/2017 #######################################//
	
	@And("^I changed the \"([^\"]*)\"$")
	public void device_role_change(String arg) throws Throwable{
		enduser.device_role_change(arg);
	}
	
	//########################################################################################################################//
	
	@And("^I validate the Transport path details$")
	public void device_serach_networking_tab() throws Throwable {
		enduser.device_viewpage_transport_path();
	}
	
	
	
	
	////###############################################-8-07-18###########################################################//
	@And("^I Enter device name in device advance search and validate results page$")
    public void Enter_devicename_in_advancesearch() throws Throwable{
           enduser.Enter_devicename_in_advancesearch();
    }

@And("^I select location address \"([^\"]*)\" from solr in device advance search$")
    public void locationaddress_advance_device_search(String location) throws Throwable{
           enduser.locationaddress_in_advance_devicesearch(location);
    }

@And("^I click on search button in device advance search page and validate results page$")
    public void click_on_search_and_validate_results() throws Throwable{
           enduser.click_on_search_and_validate_results();
    }

@And("^I validate GDB Device Topology attribute value in view page$") 
public void I_validate_topology_attribute() throws Throwable {		
	enduser.validate_Topology_attribute_value();
}
@And("^I enter the MCO value as \"([^\"]*)\" in Device advance search page$")
public void advance_device_search_mco(String mco_val) throws InterruptedException{
	enduser.advance_devicesearch_mco(mco_val);
}

@And("^I validate the search result with MCO value as \"([^\"]*)\" in DB$")
public void validate_mco_device_search_db(String mco_val) throws InterruptedException{
	
	enduser.validate_mco_device_search_db(mco_val);
	
}

@Then("^I Validate \"([^\"]*)\" and \"([^\"]*)\" columns in ext_device_type for the created device$")
public void i_Validate_and_columns_in_ext_device_type_for_the_created_device(String sharedFlag, String arg2) {
	searchDevicePage.validate_OVER_SUBSCRIPTION_AMOUNT_and_SUPPORTS_OVER_SUBSCRIPTION();
}

@Then("^I validate the value displayed under Network Identifier field$")
public void I_validate_the_value_displayed_under_Network_Identifier_field() {
       enduser.I_validate_the_value_displayed_under_Network_Identifier_field();
       
}

@And("^I click on child accordian tab$")
public void I_click_on_child_accordian_tab() {
       enduser.I_click_on_child_accordian_tab();
}

@And("^I update the fields in Child card accordian tab$")
public void I_update_the_fields_in_Child_card_accordian_tab() {
       enduser.I_update_the_fields_in_Child_card_accordian_tab();        
       }


@And("^I click on Delete card button for the device port expanded$")
public void I_click_on_Deletecard_button_for_the_device_port_expanded() {
       enduser.I_delete_the_parent_card();
}

@And("^I click refresh button in device details page$")
public void I_click_refresh_button_in_device_details_page() {
       enduser.I_click_refresh_button_in_device_details_page();
}

@And("^I Enter Device Name as \"([^\"]*)\" in Device Search Slider$")
public void i_Enter_Device_Name_as_in_Device_Search_Slider(String DeviceName) {

	searchDevicePage.tbx_devicename.type(DeviceName);
	
} 
}
