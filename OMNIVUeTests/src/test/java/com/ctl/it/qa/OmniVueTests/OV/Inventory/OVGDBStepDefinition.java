package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateGDBPage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OVGDBStepDefinition {

	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVCreateGDBPage gdbcreatepage;
	
	 @And("^I create \"([^\"]*)\" device in GDB$")
	 public void gpon_device_create(String gpondevice) throws Throwable{
			enduser.gpon_ntwrk_devicecreate(gpondevice);
			
	}
	 
	 @And("^I clicked on Expand button for \"([^\"]*)\" box in GDB Screen$")
	 public void GDB_SelectBox_Expand(String gpondevice) throws Throwable{
		 enduser.GDB_SelectBox_Expand(gpondevice);
	 }
	 
	 @And("^I should see the device status as Success in GDB$")
	 public void gpon_device_create_success_validation() throws Throwable{
			enduser.gpon_device_status_validation();
			
	}
	 
	 
	 @And("^I add the fiber link between the GDB device$")
	 public void gpon_fiberlinkinge() throws Throwable{
			enduser.GDB_fiberlinking();
			
	}
	 
	 @And("^I should write the Gpon device build-excel file$")
	 public void gdb_build_excel() throws Throwable{
			enduser.gdb_build_excel_download();
			
	}
	 
	 @And("^I should write the GDB Device into the excel sheet$")
	 public void gdb_build_excel_another_approach() throws Throwable{
		 enduser.gdb_build_excel_download_newapproach();
	 }
	 
	 @And("^I create fiber-link between the GDB device & write into excel sheet$")
	 public void gdb_fiberlink_build_excel_another_approach() throws Throwable{
		 enduser.GDB_fiberlinking_newapproach();
	 }
	 
	 @And("^I write the service area data into the excelsheet$")
	 public void gdb_service_area_excel_another_approach() throws Throwable{
		 enduser.GDB_service_area_newapproach();
	 }
	 
	 @And("^I should write the GDB data in excel$")
	 public void gdb_build_excel_new_version() throws Throwable{
		 enduser.gdb_build_excel_new_version();
	 }
	 
	 @And("^I click on view icon in GPON Network Result page$")
	 public void gpon_viewresult() throws Throwable{
			enduser.GDB_viewresultsearch();
			
	}
	 
	 @And("^I Select \"([^\"]*)\" device in GDB$")
	 public void gpon_device_select(String selectgpondevice) throws Throwable{
			enduser.gpon_device_select(selectgpondevice);
		/* Thread.sleep(5000);
		 gdbcreatepage.btn_gpon_Splitter.click();
		 Thread.sleep(5000);
		 gdbcreatepage.btn_gpon_Splitter_box.click();
			slf4jLogger.info(selectgpondevice);*/
			
	}
	 
	 @Then("^I validate fiber links between FDH & Service Area in GDB$")
	 public void gpon_fiberlink_validation() throws Throwable{
			enduser.gpon_fiberlink_validation();
			
	}
	 
	 @And("^I add \"([^\"]*)\" more device in GDB$")
	 public void gpon_adddevicegdb(String addcount) throws Throwable{
			enduser.gpon_adddevicegdb(addcount);			
	}
	 
	 @And("^I validate \"([^\"]*)\" functionality in GDB$")					//Recheck Below & Above line
	 public void GDB_functionality(String action) throws Throwable{
			enduser.GDB_functionality(action);			
	}	 
		 
	 @And("^I click on \"([^\"]*)\" in GDB$")
	 public void GDB_functionality_component(String action) throws Throwable{
			enduser.GDB_functionality(action);			
	}
	 
	 @And("^I perform \"([^\"]*)\" in GDB$")
	 public void GDB_functionality_component1(String action) throws Throwable{
			enduser.GDB_functionality(action);			
	}
	 
	 @And("^I Validate \"([^\"]*)\" while creating fiber Link$")
	 public void popup_msgvalidationon_selecting_Zportfirst_fiberlink(String action) throws Throwable{
			enduser.popup_msgvalidationon_selecting_Zportfirst_fiberlink(action);			
	}
	 
	 @And("^I create \"([^\"]*)\" in GDB$")
	 public void gpon_service_create(String component) throws Throwable{
			//enduser.gpon_ntwrk_servicearea(component);
			enduser.GDB_devicecreate(component); 
	}
	 
	 @And("^I Validate the GDB Loader$")
	 public void validate_GDB_Loader() throws Throwable{
		enduser.validate_GDB_Loader();		
     }
	 
	 @And("^I Validate the Add Service Area in GDB$")
	 public void validate_Add_SA_GDB() throws Throwable{
			enduser.validate_Add_SA();		
	     }
	 
	 @And("^I Validate the \"([^\"]*)\" of Service Area in GDB$")
	 public void validate_GDB_SA_RefreshAll(String action) throws Throwable{
			enduser.validate_SA_RefreshAll(action);		
	 }
	 
	 @And("^I Validate service area section components in GDB$")
	 public void validate_GDB_SA_section() throws Throwable{
			enduser.validate_SA_section();		
     }
	 
	 @And("^I Validate Delete button for GPON and Ethernet role devices on GDB$")
	 public void validate_Ethernet_role_devices_on_GDB() throws Throwable{
			enduser.validate_Ethernet_role_devices();				
     }
	 
	 @And("^Validating excel import button is clickable or not$")
	 public void validating_excel_import_button_is_clickable_or_not() throws Throwable {
	   enduser.IsExcelImportButtonPresent();  
	 }
	 
	 @And("^I clicked on Get Audit Logs button$")
	 public void i_clicked_on_Get_Audit_Logs_button() throws Throwable {
		 Thread.sleep(1000);
	     enduser.clickOnauditbuttonOfServiceArea();
	     Thread.sleep(5000);
	     slf4jLogger.info(" clicked on Audit log");
	 }
	 
	 @Then("^Validate \"([^\"]*)\" entry of Service Area in audit log for GDB$")
	 public void validate_entry_of_Service_Area_in_audit_log_for_GDB(String action) throws Throwable {
	     enduser.validate_SA_auditLog(action);
	 }

	 
	 @And("^I clicked on refresh icon of audit log page$")
	 public void i_clicked_on_refresh_icon_of_audit_log_page() throws Throwable {
		 enduser.clickOnRefreshIconOfAuditLogOfServiceArea();
		 slf4jLogger.info(" clicked on Refresh Icon");
	 }
	 
	/* @And("^validating delete entry for \"([^\"]*)\" in audit log$")
	 public void validating_delete_entry_for_in_audit_log(String arg1) throws Throwable {
	      enduser.validate_SearviceAreaNameAndTimeInAuditLog("DELETE");
	      
	 }
	 
	 @Then("^validating create entry for \"([^\"]*)\" in audit log$")
	 public void validating_create_entry_for_in_audit_log(String arg1) throws Throwable {
	      enduser.validate_SearviceAreaNameAndTimeInAuditLog("CREATE");
	      
	 }*/
	 
	 @Then("^I click on Audit logs & validate \"([^\"]*)\" entry of Service Area in audit log for GDB$")
	 public void validating_audit_log_GDB(String arg1) throws Throwable {
	      enduser.validating_audit_log_GDB(arg1);
	      
	 }
	 
	 @And("^I validate GDB Device Build component$")
	 public void i_validate_gdb_build_component() throws Throwable {
		 enduser.validate_GDB_component();
	 }
	 
	 @And("^I need to validate \"([^\"]*)\" device in GDB$")
	 public void i_validate_GDB_component_beforeservicearea(String arg1) throws Throwable {
		 enduser.validate_Service_area_GDBDevice(arg1);
	 }
	 
	 @And("^I fill all the mandatory fields for \"([^\"]*)\" GDB device$")
	 public void i_fill_mandatory(String filldata) throws Throwable {
		 enduser.fill_GDB_mandatoryfields(filldata);
	 }
	 
	 @And("^I click on \"([^\"]*)\" button in GDB$")
	 public void i_click_GDB_function_key(String action) throws Throwable {
		 enduser.GDB_component_action(action);
	 }
	 
	 @And("^I should be seeing all the devices \"([^\"]*)\"$")
	 public void GDB_Validation_screen(String validatinGDB) throws Throwable {
		 enduser.GDB_Validation_screen(validatinGDB);
	 }
	 
	 @And("^I select \"([^\"]*)\" device from the Gpon Device Build$")
	 public void GDB_device_selectbox(String count) throws Throwable {
		 enduser.GDB_device_selectbox(count);
	 }
	 
	 @And("^I should be able to see success message$")
	 public void GDB_device_actionsmsgs() throws Throwable {
		 enduser.GDB_device_actionsmsgs();
	 }
	 
	 @And("^I add the existing device in the GPON device build$")
	 public void GDB_manually_adding_device() throws Throwable {
		 enduser.GDB_manually_adding_device();
	 }
	 
	 @And("^I add the existing \"([^\"]*)\" device in the GPON device build$")
	 public void GDB_manually_adding_device(String Devicetype) throws Throwable {
		 enduser.GDB_manually_adding_selected_device(Devicetype);
	 }
	 
	 
	 @And("^I create \"([^\"]*)\" device through Inventory$")
	 public void GDB_creating_device_through_inventory(String role) throws Throwable {
		 enduser.GDB_creating_device_through_inventory(role);
	 }
	 
	 @And("^I validate Delete icon for the \"([^\"]*)\" device in GDB$")
	 public void GDB_delete_icon_validation(String devicetype) throws Throwable {
		 enduser.GDB_delete_icon_validation(devicetype);
	 }
	 
	 @And("^I create \"([^\"]*)\" device with data from common share excel$")
	 public void GDB_device_create_exceldata(String devicetype) throws Throwable {
		// enduser.GDB_devicecreate(devicetype);
		 enduser.GDB_devicecreate_excel(devicetype);
		 
	 }
	 
	 @And("^I should be able to select \"([^\"]*)\" and launch GDB create form$")
	 public void GDB_createform_exceldata(String devicetype) throws Throwable {
		 enduser.GDB_Createtab_excel_data(devicetype);
	 }
	 
	 @And("^I select fiber link between GDB devices$")
	 public void fiber_link_select_gdb() throws Throwable {
		 enduser.fiber_link_select_gdb();
	 }
	 
	 @And("^I validate Ports been \"([^\"]*)\" is \"([^\"]*)\"$")
	 public void validating_GDB_Fiberlink_portstatus(String port,String portstatus) throws Throwable {
		 enduser.validating_GDB_Fiberlink_portstatus(port,portstatus);
	 }
	 
	 
	 @And("^I Validate the progress bar$")
	 public void validating_GDB_progressbar() throws Throwable {
		 enduser.validating_GDB_progressbar();
	 }
	 @And("^I Validate created device in database$")
	 public void validating_GDB_device_db() throws Throwable {
		 enduser.validating_GDB_device_in_db();
	 }
	 
	 @And("^I Validate deleted in database$")
	 public void validating_GDB_fiberlink_db() throws Throwable {
		  
	 }
	 @And("^I validate GDB device are created in sequence$")
	 public void validating_GDB_device_sequence() throws Throwable {
		 enduser.validating_GDB_device_in_sequence();
	 }
	 
	 @And("^I validate audit log for \"([^\"]*)\"$")
		 public void validating_auditlog(String log) throws Throwable {
			 enduser.validating_gdb_device_auditlog(log);
		 }
	 @And("^I perform drag and drop on the device having fiber link$")
	 public void GDB_device_draganddrop() throws Throwable {
		 enduser.GDB_device_drang_drop_actions();
	 }
	 
	 @And("^I validate the error message$")
	 public void GDB_device_fibre_exist() throws Throwable {
		 enduser.GDB_fibre_exist_error();
	 }
	 @And("^I Cascade values in GDB Fibre link$")
	 public void GDB_device_fibre_cascade() throws Throwable {
		 enduser.GDB_fibre_exist_cascade();
	 }
	 
	 
	 @And("^I Verify the error message$")
	 public void GDB_device_fibre_link_exist_error() throws Throwable {
		 enduser.GDB_fibre_alreadyexist_error();
	 }
 
	 
	 @And("^I add \"([^\"]*)\" more Service Area in GDB$")
	 public void add_sa(String cnt) throws Throwable {
		 enduser.add_service_area(cnt);
	 }
	 
	 
	
	 @And("^I Verify the delete functionality for Service area which are not created$")
	 public void delete_sa() throws Throwable {
		 enduser.delete_service_area();
	 }
	
}
