package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.OmniVueTests.user.UserStepDefinition;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OVGFASTStepDefinition {
	
	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVLoginPage loginpage;
	UserStepDefinition userstepdefinition;
	
	@Given("^I am on the expanded Search item with Product-type \"([^\"]*)\" selected$")
 	public void i_select_Search_slider_GPONorders_ordertype(String search_order_producttype) throws Throwable {
		if(!loginpage.getDriver().getCurrentUrl().contains(Page.envData.getFieldValue("omnivue-Log_in"))){			
			userstepdefinition.logging_in_user("Adminrole");
		}
		
		enduser.search_tab_ordertype(search_order_producttype);
		
	}

	
	@When("^I select Ensemble Order ID field and enter the \"([^\"]*)\"$")
 	public void i_select_Search_slider_GPONorders_ensemble_order(String search_order_ensemble) throws Throwable {
		enduser.search_GPONorders_ensemble_order(search_order_ensemble);
	}
	
	@When("^I enter CSOF Order Number in the CSOF Order ID field$")
	public void i_select_Search_slider_GPONorders_csof_id() throws Throwable {
		enduser.search_GPONorders_CSOFid_order();
	}
	
	@When("^I select TN field and enter the TN$")
 	public void i_select_Search_slider_GPONorders_TN() throws Throwable {
		enduser.search_GPONorders_TN();
	}
	
	@When("^I select the Customer Name field and enter the Customer Name$")
 	public void i_select_Search_slider_GPONorders_customer_name() throws Throwable {
		enduser.search_GPONorders_customer_name();
	}
	
	@And("^I should see \"([^\"]*)\" in Order Search Results tab$")
 	public void order_search_results_tab_orders_validation(String columnvalidation) throws Throwable {
		enduser.order_search_results_tab_orders_validation(columnvalidation);
	}
	
	@Then("^I should see an Order Search Results tab with \"([^\"]*)\" listed in the Search Parameters$")
 	public void order_search_results_tab_search_parameters_validations(String search_parameter) throws Throwable {
		enduser.order_search_results_tab_search_parameters_validations(search_parameter);
	}
	
	@And("^\"([^\"]*)\" column should have a value$")
 	public void order_search_results_Order_ID_validation(String valuecolumn) throws Throwable {
		enduser.order_search_results_tab_orders_validation(valuecolumn);
	}
	
	@And("^I should see CSOF ID in Order Search Results tab$")
 	public void order_search_results_csof_ID_validation() throws Throwable {
		enduser.order_search_results_csof_ID_validation();
	}
	
	/*@And("^Action column should have a value$")
 	public void order_search_results_Action_column_validation() throws Throwable {
		enduser.order_search_results_tab_orders_validation("Action");
	}
	
	@And("^Customer column should have a value$")
 	public void order_search_results_Customer_column_validation() throws Throwable {
		enduser.order_search_results_tab_orders_validation("Customer");
	}
	
	@And("^Status column should have a value$")
 	public void order_search_results_Status_column_validation() throws Throwable {
		enduser.order_search_results_tab_orders_validation("Status");
	}
	
	@And("^Due Date column should have a date value$")
 	public void order_search_results_Due_date_column_validation() throws Throwable {
		enduser.order_search_results_tab_orders_validation("Due Date");
	}
	
	@And("^Ensemble Order Number column should have a value$")
 	public void order_search_results_ensemble_order_column_validation() throws Throwable {
		enduser.order_search_results_tab_orders_validation("Ensemble Order Number");
	}*/
	
	@When("^I am on the Order Search Results tab$")
 	public void i_should_see_order_details_page_gfast() throws Throwable {
		enduser.order_searchresult_page();
	}
	
	
	
	@Then("^I Validate \"([^\"]*)\" icon in Order Search Result tab$")
 	public void i_validate_icon_search_result(String iconvalidation) throws Throwable {
		enduser.order_search_result_icon_validation(iconvalidation);
	}
	
	@Then("^I click on magnifying glass for the selected Order number$")
 	public void i_click_on_magnify_search_order_page() throws Throwable {
		enduser.select_viewBtn();
	}
	
	@Then("^A new tab Order Id:nnnnnn will open with an Order details sub tab$")
 	public void order_tab_view_screnn_validation() throws Throwable {
		enduser.order_tab_view_screnn_validation();
	}
	
	@When("^I am on the Order Details tab")
 	public void i_am_on_order_details_page_gfast() throws Throwable {
		if(!loginpage.getDriver().getCurrentUrl().contains(Page.envData.getFieldValue("omnivue-Log_in"))){			
			userstepdefinition.logging_in_user("Adminrole");
		}
		
		enduser.order_details_page();
	}
	
	@Then("^I view the Order Details section$")
 	public void i_view_order_details_tab_orderpage() throws Throwable {
		enduser.order_view_order_details_tab();
	}
	
	@And("^I validate the field values in \"([^\"]*)\" with excel data")
 	public void order_view_page_validation(String orderpagesction) throws Throwable {
		enduser.order_view_page_validation(orderpagesction);
	}
	
	@Then("^Order Details Section validation passes$")
	public void Order_details_section_orderpage() throws Throwable {
		enduser.Order_details_section_orderpage();
	}
	
	@And("^I validate Available Action buttons based on Order status")
 	public void avail_action_section_orderpage() throws Throwable {
		enduser.avail_action_section_orderpage();
	}
	
	@Then("^Available Actions Section validation passes$")
	public void Avail_action_details_section_orderpage() throws Throwable {
		enduser.Avail_action_details_section_orderpage();
	}
	
	@Then("^Customer Details Section validation passes$")
	public void customer_details_section_orderpage() throws Throwable {
		enduser.customer_details_section_orderpage();
	}
	
	@Then("^Contact Details Section validation passes$")
	public void Contact_details_section_orderpage() throws Throwable {
		enduser.Contact_details_section_orderpage();
	}
	
	@Then("^Location Details Section validation passes$")
	public void Location_details_section_orderpage() throws Throwable {
		enduser.Location_details_section_orderpage();
	}
	
	@Then("^ServiceID field is a clickable hyperlink to \"([^\"]*)\" section$")
	public void ServiceID_clickable_details_section_orderpage(String servicetype) throws Throwable {
		enduser.ServiceID_clickable_details_section_orderpage(servicetype);
	}
	
	@Then("^Service Section validation passes$")
	public void Service_details_section_orderpage() throws Throwable {
		enduser.Service_details_section_orderpage();
	}
	
	@Then("^Dispatch Details Section validation passes$")
	public void Dispatch_details_section_orderpage() throws Throwable {
		enduser.Dispatch_details_section_orderpage();
	}
	
	@Then("^Other Details Section validation passes$")
	public void Other_details_section_orderpage() throws Throwable {
		enduser.Other_details_section_orderpage();
	}
	
	
	@And("^I verify that the “Export to Excel” icon, “Refresh” icon, “Configure Column” icon and “Print” icon is present & clickable in 360 view related tab$")
	public void support_icons_related_tabs() throws Throwable {
		enduser.support_icons_related_tabs();
	}
	
	@And("^I validate \"([^\"]*)\" displayed in the related tab$")
	public void validate_related_tab_viewpage(String relatedtab_values) throws Throwable {
		enduser.validate_related_tab_viewpage(relatedtab_values);
	}
	
	@And("^I verify for \"([^\"]*)\" Network role$")
	public void serach_Device_related_tab_based_on_role(String ntwrole) throws Throwable {
		enduser.serach_Device_related_tab_based_on_role(ntwrole);
	}
	
	@And("^I Click on Device Name link in Identifiers Section$")
	public void click_Device_related_tab_device_hyperlink() throws Throwable {
		enduser.click_Device_related_tab_device_hyperlink();
	}
	
	@And("^I should see tab name should match with the Device name link$")
	public void click_Device_related_tab_device_hyperlink_matching() throws Throwable {
		slf4jLogger.info("Validated in previous step it self");
	}
	
	@And("^I should see DSLAM Device opened in a separate tab$")
	public void device_role_checking_dslam() throws Throwable {
		enduser.Device_role_validation();
	}
	
	@And("^I am on the DSLAM Device tab$")
	public void dslam_device_tab() throws Throwable {
		if(!loginpage.getDriver().getCurrentUrl().contains(Page.envData.getFieldValue("omnivue-Log_in"))){			
			userstepdefinition.logging_in_user("Adminrole");
		}
		
		enduser.dslam_device_tab();
		
	}
	
	@And("^I Click on \"([^\"]*)\" tab on Device Search page$")
	public void device_serach_page_tab(String device_tab) throws Throwable {
		enduser.device_serach_page_tab(device_tab);
	}
	
	@And("^I Validate \"([^\"]*)\" section in Search page with excel data$")
	public void search_Device_section_validation(String device_section) throws Throwable {
		enduser.search_Device_section_validation(device_section);
		
	}
	
	@And("^I should see Refresh icon and Edit Device Details button$")
	public void device_serach_page_network_tab_icon( ) throws Throwable {
		enduser.device_serach_page_network_tab_icon();
	}
	
	@And("^I Click on \"([^\"]*)\" tab$")
	public void search_Device_section_audit_logs_button(String Auditlog_btn) throws Throwable {
		enduser.search_Device_section_audit_logs_button(Auditlog_btn);
	}
	
	@And("^I Click on Get Log button$")
	public void device_viewpage_auditlog_armlog_getlog() throws Throwable {
		enduser.device_viewpage_auditlog_armlog_getlog();
	}
	
	@And("^I should see Export to Excel icon and Print icon$")
	public void device_viewpage_auditlog_armlog_icons_validation() throws Throwable {
		enduser.device_viewpage_auditlog_armlog_icons_validation();
	}
	
	@And("^I should see \"([^\"]*)\" Table getting displayed in Audit tab$")
	public void device_viewpage_auditlog_armlog_table_displayed(String Auditlog) throws Throwable {
		enduser.device_viewpage_auditlog_armlog_table_displayed(Auditlog);
	}
	
	@And("^ARM Audit Logs Section validation passes$")
	public void device_viewpage_auditlog_armlog_validation() throws Throwable {
		enduser.device_viewpage_auditlog_armlog_validation();
	}
	
	@And("^I should see Export to Excel icon, Refresh icon and Print icon$")
	public void device_viewpage_auditlog_omnivuelog_icon() throws Throwable {
		enduser.device_viewpage_auditlog_omnivuelog_icon();
	}
	
	@And("^OMNIVUE Audit Logs Section validation passes$")
	public void device_viewpage_auditlog_omnivuelog_validation() throws Throwable {
		enduser.device_viewpage_auditlog_omnivuelog_validation();
	}
	
	@And("^I am on the DSLAM Device: nnnnnn tab$")
	public void DSLAM_device_tab_displayed() throws Throwable {		
		dslam_device_tab();
	}
	
	@Then("^I verify that the \"([^\"]*)\" Buttons is present and clickable in 360 view related tab$")
	public void verify_buttons_related_tabs(String buttons) throws Throwable {
		enduser.verify_buttons_related_tabs(buttons);
	}
	
	@And("^I click on the hyperlink in the \"([^\"]*)\" section Service ID field$")
	public void order_search_page_service_hyperlink(String hyperlinkType) throws Throwable {		
		enduser.order_search_page_service_hyperlink(hyperlinkType);
	}
	
	@And("^A new tab nnnnnnnnnn-\"([^\"]*)\" will open$")
	public void service_new_tab(String Type) throws Throwable {	
		enduser.service_new_tab(Type);
	}
	
	@And("I am on the nnnnnnnnnn -HSI tab$")
	public void services_viewpage_tab() throws Throwable {	
		/*if(!loginpage.getDriver().getCurrentUrl().contains(Page.envData.getFieldValue("omnivue-Log_in"))){			
			userstepdefinition.logging_in_user("Adminrole");
		}*/
		
		enduser.services_viewpage_tab();
	}
	
	@And("I click on \"([^\"]*)\" tab on Service Search page$")
	public void Service_tabs_section_click(String service_view_tabs) throws Throwable {
		enduser.Service_tabs_section_click(service_view_tabs);
	}
	
	@And("I Validate \"([^\"]*)\" section in Service Search page with excel data$")
	public void service_section_validations(String service_section) throws Throwable {
		enduser.service_section_validations(service_section);
	}
	
	//**************************** New Changes ********************************//

	@And("I enter the \"([^\"]*)\" value from excel in Search Slider$")
	public void enter_value_from_excel(String service_section) throws Throwable {
		enduser.search_GPONorders_Based_on_excel(service_section);
	}
		
	@And("I update automation status in excel sheet$")
	public void evaluate_automation_status_excel_sheet() throws Throwable {
		enduser.gfast_automation_status_sheet_update();
	}
	@And("I enter csof id \"([^\"]*)\" in search slider")
	public void I_enter_csofid_in_searchslider(String order) throws Throwable {
		enduser.I_enter_csofid_in_searchslider(order);
		
	}
	
	@And("I validate \"([^\"]*)\" in Service 360 view page not Displayed")
	public void validate_associationtab_serviceview(String associationchanges) throws Throwable {
		enduser.validate_changes_associationtab_serviceview(associationchanges);
		
	}
	
	@And("I should see \"([^\"]*)\" Related Tab displayed in 360 view Service Page")
	public void validate_changes_associationtab_serviceview(String rt) throws Throwable {
		enduser.validate_changes_associationtab_serviceview(rt);
	}
	
	@And("I validate the Associated Service & edit Assocaition button in Services related tab")
	public void validate_associationservices_editassociation_serviceview() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Association Service Tab in Service Related Tab");
		enduser.validate_changes_associationtab_serviceview("Edit Association button in Service Related Tab");
	}
	
	@And("I should see Associated Service table getting displayed in Services related tab")
	public void validate_servicesRT_associationservicesTable_serviceview() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Association Services Table");
	}
	
	@And("I click on Edit Assocaite in service related tab of Associated Services tab")
	public void click_edit_associationbutton_Associationservies() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Click on Edit Association button");
	}
	
	@And("I should see the Associate Backhaul button enabled")
	public void validate_backhaul_Associationservies() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Associate Backhaul button validation");
	}
	@And("I should see the Associate Backhaul button and Cancel button enabled")
	public void validate_backhaul_Associationservies_cancel_button() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Associate Backhaul and cancel button validation");
	}
	@And("I should see the Service Name,Service Type and Device name fields")
	public void validate_service_lookup() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Service Name,Service Type and Device name");
	}
	@And("I click on Assocaite Backhaul button in service related tab of Associated Services tab")
	public void click_Assocaite_Backhaul_button() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Click on Associate Backhaul button");
	}
	@And("I search DSL OVC Services in service Look up")
	public void search_DSLOVC_Service_in_LookUp() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Search DSL OVC Services in LookUp");
	}
	@And("I select all services and click on Associate Services button")
	public void select_all_and_associate_all_services() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Select all services and click on Associate service buttons");
	}
	@And("I validate Error and success messages")
	public void validate_success_and_error_message() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Validate success and error messages");
	}
	
	@And("I click on cancel icon and Remove associated service")
	public void click_on_cancel() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Remove associated service");
	}
	@And("I validate Update Omnivue audit logs")
	public void update_omnivue_logs() throws Throwable {
		enduser.validate_changes_associationtab_serviceview("Validate Update OMNIVue Audit logs");
	}
}
