package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OVTaskStepdefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	
	
	@And("^I validate the View & Edit for \"([^\"]*)\" in Task result page$")
	public void validate_Taskresult(String taskcheck) throws Exception {
		enduser.validate_taskresult(taskcheck);
		//slf4jLogger.info(taskcheck);
	    
	}
	@And("I Identify \"([^\"]*)\" in Task result page")
	public void I_Identify_Task(String taskselect) throws Exception {
		enduser.I_Identify_Task(taskselect);		
	    
	}
	@And("^I click on the \"([^\"]*)\" in Task result page$")
	public void click_view_taskt(String taskselect) throws Throwable {
		enduser.click_viewtask(taskselect);		
	    
	}
	
	@And("^I Validate \"([^\"]*)\" of the Task$")
	public void Validate_view_taskpage(String viewtask) throws Exception {
		enduser.Taskviewpage(viewtask);		
	    
	}
	
	@And("^I need to validate \"([^\"]*)\" section for the GPON Autoform Task$")
	public void Validate_API_Section_GPON_taskpage(String viewtask) throws Exception {
		enduser.validateapisectiontask(viewtask);		
	    
	}
	
	@Then("^I validate Task actions buttons for \"([^\"]*)\"$")
	public void task_action_validation(String taskstatus){
		enduser.validatetaskactions(taskstatus);	
	}
	
	@And("^I search for \"([^\"]*)\" from Task name dropdown$")
	public void task_name_select(String taskname)throws Throwable {
		enduser.task_name_select(taskname);	
	}
	@And("^I selected value \"([^\"]*)\" from \"([^\"]*)\" dropdown in task search slider$")
	public void task_search_select_value_from_dropdown(String value,String dropdown)throws Throwable {
		enduser.task_search_select_value_from_dropdown(value,dropdown);	
	}
	@And("^I selected value \"([^\"]*)\" from \"([^\"]*)\" dropdown in task advance search$")
	public void task_advancesearch_select_value_from_dropdown(String value,String dropdown)throws Throwable {
		enduser.task_advancesearch_select_value_from_dropdown(value,dropdown);	
	}
	@Then("^I validate new option From Archive checkbox on Audit logs for \"([^\"]*)\"$")
	public void Validate_FROM_Archie_Auditlog(String place){
		enduser.Validate_FROM_Archie_Auditlog(place);	
	}
	
	@Then("^I validate the logs displayed in Audit logs by selecting Archive checkbox in \"([^\"]*)\" result page$")
	public void Validate_Auditlog_witharchieve(String place){
		enduser.Validate_Auditlog_witharchieve(place);
	}
	
	@And("^I go to \"([^\"]*)\" search type and select \"([^\"]*)\" as Task Type$")
	public void I_go_to_search_type_and_select_as_Task_Type(String Search_Type,String Task_Type) throws Throwable {
		
		enduser.task_searchtype_tasktype(Search_Type,Task_Type);    
	    
	}
	
	@And("^I select \"([^\"]*)\" from Workgroup field$")
	public void select_search_taskworkgroup(String workgp) throws Throwable {
		enduser.select_search_taskworkgroup(workgp);
	}
	
	@Then("^I Validate is search results tab is displayed for Defect task search$")
	public void Defect_task_search() throws Throwable {
		enduser.Defect_task_search();
	}
	
	@And("^I Search \"([^\"]*)\" in the Search Defect Task slider$")
	public void search_defecttaskby(String criteria) throws Throwable {
		enduser.search_defecttaskby(criteria);
	}
	
	@And("^I select \"([^\"]*)\" from Task status$")
	public void select_search_taskstatus(String status) throws Throwable {
		enduser.select_search_taskstatus(status);
	}
	
	@Then("^I Verify Edit button is enabled for the Open Task$")
	public void Validate_defecttask_button() throws Throwable {
		enduser.Validate_defecttask_button();
	}
	
	@And("^I Click on \"([^\"]*)\" button on the Open Task in Defect task search$")
	public void click_edit_open_defectTask(String action) throws Throwable {
		enduser.click_edit_open_defectTask(action);
	}
	
	@And("^I select \"([^\"]*)\" in Defect task search$")
	public void selecttag_defectTask(String action) throws Throwable {
		enduser.click_edit_open_defectTask(action);
	}
	
	@And("^I click on \"([^\"]*)\" button action on Defect task$")
	public void click_edit_open_defectTask1(String action) throws Throwable {
		enduser.click_edit_open_defectTask(action);
	}
	
	@Then("^I Validate the Task Status & Assigned field is updated with the right value$")
	public void Validate_defecttask_status_assigned() throws Throwable {
		enduser.Validate_defecttask_status_assigned();
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void action_method(String action) throws Throwable {
		enduser.Sanity_validations(action);
	}
	@And("^I select \"([^\"]*)\" value from Tags dropdown in Defect task search$")
	public void select_tag_defectTask(String action) throws Throwable {
		enduser.update_defecttask_tag_new(action);
	}
	@And("^I verify \"([^\"]*)\" tag is displayed in Defect task$")
	public void verify_tag_defectTask(String action) throws Throwable {
		enduser.verify_update_defecttask_tag_new(action);
	}
	@Then("^I validate the GETO value field is displayed in the Task advanced search page$")
    public void i_validate_GETO_value_dropdown_in_task_advanced_search() {
           enduser.validate_GETO_values_under_GETOvalue_task_advanced_search();
    }
}
