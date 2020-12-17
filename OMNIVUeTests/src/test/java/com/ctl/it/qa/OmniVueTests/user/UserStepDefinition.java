package com.ctl.it.qa.OmniVueTests.user;


import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.findby.By;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import cucumber.api.java.en.When;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 /*public class UserStepDefinition {
	
	@Steps
	UserSteps endUser;
	OVLoginPage loginPage;

	// ********************** GIVEN METHODS **************************

	@Given("^I am logged in as a \"([^\"]*)\" user in \"([^\"]*)\"$")
	public void i_am_logged_in_as_a_user_in_SFA(String userType,String portal) {
		slf4jLogger.info("1");
		String url = Page.envData.getFieldValue(portal.toLowerCase()+"-url");
		Serenity.setSessionVariable("url").to(url);
		Serenity.setSessionVariable("user_type").to(userType);
		Serenity.setSessionVariable("portal_name").to(portal);
		endUser.is_in_sfa_login_page(url);
		if(portal.equalsIgnoreCase("SFA")){
			endUser.logs_in_as(userType);
		}else if(portal.equalsIgnoreCase("Partner")){
			endUser.logs_in_partner_portal_as(userType);
		}
	
	 }  
      
}*/



 public class UserStepDefinition {
	 
	 private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVLoginPage loginpage;
	OVHomepage homepage;
	OVActivationPage actvtnpage;
	OVAssociatedServicesPage assocservicespage;
	OVDeviceLookupPage devicelookuppage;
	OVSearchDevicePage searchdevicepage;
	OVSearchServicePage servicedetailspage;
	
	
	
	// ******************** Methods *****************************
	
	@Given("^I am in omnivue url$")		//Need to be removed
	
	public void I_am_in_omnivue_url() {
		
		String url = Page.envData.getFieldValue("omnivue-url");
		slf4jLogger.info("Current url value is" + url);
		enduser.is_in_omnivue_login_page(url);
		loginpage.shouldExist(loginpage);		
	}
		
	@And("^I log in as a \"([^\"]*)\" user$")		//Need to be removed
	
	public void I_log_in_as_a_user(String userType) {
		try{
			enduser.logs_in_as_a(userType);
		}
		
		catch(Exception e){
			slf4jLogger.error("Got Error message");
			//slf4jLogger.wait(
		}
		
	}
	
	
	
	@And("^I log into omnivue as \"([^\"]*)\"$")		

	public void logging_in_OMNIVue(String userType) throws Throwable{
		if(!loginpage.getDriver().getCurrentUrl().contains(Page.envData.getFieldValue("omnivue-Log_in"))){
			
			
				
				loginpage.getDriver().manage().deleteAllCookies();
				
			String url = Page.envData.getFieldValue("omnivue-url");
			slf4jLogger.info("Launching the Omnivue URL:" + url);
			enduser.is_in_omnivue_login_page(url);
			loginpage.shouldExist(loginpage);
			
		
			enduser.logsinov(userType);			
			
			
			} 
	}
	
	
	@Given("^I am logged in as a \"([^\"]*)\" user in Omnivue$")		//19/7/2016--New changes

	public void logging_in_user(String userType) throws Throwable{
		
		
		
	if(!loginpage.getDriver().getCurrentUrl().contains(Page.envData.getFieldValue("omnivue-Log_in"))){
		//if(!loginpage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
			
			loginpage.getDriver().manage().deleteAllCookies();
			//slf4jLogger.info("Cookies Cleared");
		String url = Page.envData.getFieldValue("omnivue-url");
		slf4jLogger.info("Launching the Omnivue URL:" + url);
		enduser.is_in_omnivue_login_page(url);
		loginpage.shouldExist(loginpage);
		
		//enduser.Systemcheckonloginpage();  
		enduser.logs_in_as_a(userType);	
		
		
		
		} 
		//Need to configure the Usertype in XML---21/7/2016
	}
	
	@And("^I verify QPartner Login screen$")		
	
	public void qpartner_loginpagevalidation() {
		enduser.qpartner_loginpagevalidation();
	}
	
	@And("^I login as \"([^\"]*)\" in QPartner application$")		
	
	public void qpartner_Login(String user) {
		enduser.qpartner_Login(user); 
	}

	@And("^I launch the QPartner application$")		
	
	public void I_am_in_qpartner_url() {
		enduser.I_am_in_qpartner_url();
	}
	
	@And("^I verify User should be able to see the Welcome screen & tabs$")		
	
	public void I_verify_QPartnerwelcomepage() {
		enduser.I_verify_QPartnerwelcomepage();
		
	}
	
	@And("^I click on Central tab$")	
	
	public void I_clickonQpartnertab() {
		enduser.I_clickonQpartnertab();
	}
	
	
	@And("^I hover to Selling sub-tab under Central tab$")		
	public void I_clickonQpartnerSubtab() {
		enduser.I_clickonQpartnerSubtab();
	}
	
	@And("^I select OMNIVue link in the Selling drop down$")		
	public void I_clickonOmnivuelink_Qpartner() {
		enduser.I_clickonOmnivuelink_Qpartner();
	}
	
	@And("^I check the Service check functionality by filling all the mandatory fields in SLC$")		
	public void I_servicecheck_Qpartner() {
		enduser.I_servicecheck_Qpartner();
	}
	
	@And("^I verify the submitted Service is in the SLC Result table$")		
	public void I_verifySLC_Qpartner() {
		enduser.I_verifySLC_Qpartner();
	}
	
	
	@And("^I verify OMNIVUe SLC page is opened in New Tab$")		
	public void OVSLCQpartnerchecks() {
		enduser.OVSLCQpartnerchecks();
	}
	
	@And("^I verify SLC Sanity validation$")		
	public void OVSLCQpartnerchecks_QV() {
		enduser.OVSLCQpartnerchecks();
	}
	
	@And("^I Launch the SLC with \"([^\"]*)\"$")
	public void i_Launch_the_SLC_with(String SlcDetails) throws Throwable {
		enduser.fill_create_SCL(SlcDetails);
	}
	
	
	
		/*			@And("^I select OMNIVue link in the Selling drop down
      @And("^I verify OMNIVUe SLC page is opened in New Tab
	*/
	
	
	
	//Moved to OSIPScreen
	/*
	
	@And("^I goto Activation Page$")
	
	public void I_goto_Activation_Page() throws Exception {
		
		enduser.click_activationtab();
		
	}
	
	*/
	
	/*
	@And("^I goto Services Page$")
	
	public void I_goto_Services_Page() throws Exception {
		
		//Shifted 3 lines from I_goto_Activation_Page() down here
		enduser.click_searchtab();
		enduser.select_fields();
		enduser.click_searchbtn();
		enduser.verify_servicetab();
		enduser.click_servicestab();		
	}
	*/
	
	/*
	 Moved to OVUsability
	 
	@And("^I modify the service name from 77/L1XX/785391//CTQF to 77/L1XX/785391//CTFQ")
	
	public void I_modify_the_service_name() throws Exception {
		
		enduser.update_servicename();
		enduser.backto_servicestab();
		
	}
	
	@When("^I do Refresh$")
	
	public void I_do_Refresh() throws Exception {
		
		enduser.click_onRefresh();
	}
	
	@Then("^I should see the updated Associated service name$")
	
	public void I_should_see_the_updated_Associated_service_name() throws Exception {		
		
		enduser.is_having_updatedassociatedservicename();
		enduser.logoutfrom_application();
		
	}
	*/
	@Then("^Log out from OMNIVue$")
	public void logout() throws Exception{
		enduser.logoutfrom_application();
	}
	
	/*@And("Click on Activation tab")
	
	public void Click_on_Activation_tab() throws Exception {
		enduser.click_activationtab();
	}
	
	@And("Click on search tab")
	
	public void Click_on_search_tab() {
		enduser.click_searchtab();
	}
	
	@And("Enter details into fields") 
	
	public void Enter_details_into_fields() {
		enduser.select_fields();
	}
	
    @And("Click on search button")
    
    public void Click_on_search_button() {
    	enduser.click_searchbtn();
    }*/
    
   /* @And("Validate the services tab")
    
    public void Validate_the_services_tab() {
    	enduser.verify_servicetab();
    }
	
    @And("Click on services tab")
    
    public void Click_on_services_tab() throws Exception {
    	enduser.click_servicestab();
    }*/
    
 /*   @And("Update service name")
    
    public void Update_service_name() throws Exception{
    	enduser.update_servicename();
    }
    
    @And("Navigate back to services tab")
    
    public void Navigate_back_to_services_tab() {
    	enduser.backto_servicestab();
    }
    */
   /* @When("I click on Refresh link")
    
    public void I_click_on_Refresh_link() throws Exception {
    	enduser.click_onRefresh();
    }*/
	
	

//	@Then("I should be on loginpage")
//	
//	public void I_should_be_on_loginpage() {
//		
//		enduser.should_be_on_loginpage();
//	}	
	@Given("^I launch the Omnivue url$")	
	public void I_am_launching_omnivue_url() {
		enduser.launchingthepage();
			
	}
	
	@When("^I log-in as \"([^\"]*)\" user in Omnivue$")
	public void I_logged_as_admin_into_omnivue_url(String user) {
		slf4jLogger.info(user);
	}
	
	@Then("^I click on \"([^\"]*)\" in Omnivue Homepage$")
	public void I_clicked_on_gearIcon(String icon) throws Throwable {
		
		enduser.Activation_click_Tab(icon);
	}
	
	@Given("^I make the page (\\d+)%$")
	public void i_make_the_page(int arg1) throws Exception {
	    enduser.browser_zoom_in();
	}
	
	@Then("^I click on \"([^\"]*)\" Tab in Omnivue Homepage$")
		public void I_clicked_on_omnivue_url(String user) throws Throwable {
		slf4jLogger.info(user);	
		enduser.Activation_click_Tab(user);
	}
	
	@Given("^I launch the Firefox browser$")
	public void launch_firfox_browser(){
		
	}
	
	@When("^I check for the URL$")
	public void checkurl_browser(){
		loginpage.getDriver().getCurrentUrl();
		loginpage.maximize();
	}
	
	
	@When("^I select Administration in Gear slider$")
	public void select_administration_gearicon() throws Throwable{
		enduser.select_administration_gearicon();
		
	}
	
	@And("I select \"([^\"]*)\" under Administration$")
	public void select_manageusers_administration_gearicon(String Managetype) throws Throwable {
		enduser.select_manageusers_administration_gearicon(Managetype);
	}
	
	/*@When("^I search the User by UserID from Excel & Perform Delete Action$")
	public void search_user_action() throws Throwable{
		enduser.search_user_action();
	}*/
	
	 @And("^I should see \"([^\"]*)\" label displayed in the Gear dropdown$")
		public void Geartab_validation(String geartype) throws Throwable {
			enduser.Geartab_validation(geartype);
		}
	 
	
	@Then("^I click on \"([^\"]*)\" link$")
		public void I_clicked_on_GetNextButtons_link(String Linkname) throws Throwable {
			
			enduser.click_on_GetNextButtons_link(Linkname);
			
		}
	
	@Then("^I Select \"([^\"]*)\" from GetNext Attributes$")
	
	public void I_select_get_next_attribute(String Linkname) throws Throwable {
		
		enduser.i_select_attribute(Linkname);
		
	}
	

@Then("^I verify the mandatory field validation message$")
	
	public void i_validate_mandatory_message() throws Throwable {
		
		enduser.validate_mandatory_mesasge();
		
	}
	
	
@Then("^I Enter partial value \"([^\"]*)\" in \"([^\"]*)\" in Manage GetNext Attributes$")
	
	public void i_enter_partial_value(String name,String arg1) throws Throwable {
		
		enduser.i_enter_value(name,arg1);
		
	}

@Then("^I Enter complete value \"([^\"]*)\" in \"([^\"]*)\" in Manage GetNext Attributes$")

public void i_enter_complete_value(String name,String arg1) throws Throwable {
	
	enduser.i_enter_value(name,arg1);
	
}


@Then("^I enter \"([^\"]*)\" in Manage GetNext Attributes$")

public void I_clicked_on_GetNextButtons_link_4(String Linkname) throws Throwable {
	
	enduser.click_on_GetNextButtons_link(Linkname);
	
}
@Then("^I Validate the GetNext Attribute search result$")

public void i_validate_search_result() throws Throwable {
	
	enduser.validate_getnext_search_result();
	
}
@Then("^I click on \"([^\"]*)\" button in getnext page$")

public void I_clicked_on_search(String Linkname) throws Throwable {
	
	enduser.i_click_button(Linkname);
	
}

@Then("^I click on \"([^\"]*)\" on Add Get Next Button LooK Up$")
public void I_clicked_on_save_button_on_GetNextButtons_link_on_Add_Get_Next_Button_LooK_Up(String Linkname) throws Throwable {
	
	enduser.clicked_on_save_button_on_GetNextButtons_link_on_Add_Get_Next_Button_LooK_Up();
	Thread.sleep(1000);
	
}

@Then("^I click on \"([^\"]*)\" on Add Get Next button LooK Up$")
public void I_clicked_on_save_button_on_GetNextButtons_link_on_Add_Get_Next_button_LooK_Up(String Linkname) throws Throwable {
	
	enduser.clicked_on_clear_button_on_GetNextButtons_link_on_Add_Get_Next_Button_LooK_Up();
	Thread.sleep(1000);
	
}
@And("^I fill all the mandatory fields present in AddGetNext button Look Up with \"([^\"]*)\" data$")
public void i_select_link_type_as (String testdatatype) throws Throwable {		
enduser.fill_addGetNext_lookup(testdatatype);
} 

@Then("^I click on \"([^\"]*)\" button in omnive home page$")
public void I_click_on_GetNextButton_button_homepage(String buttonname) throws Throwable {
	
	enduser.click_getnext_homepage(buttonname);
	
}
@Then("^I verify the \"([^\"]*)\" message in defect task details page$")
public void defect_task_details(String message) throws Throwable {
	
	enduser.verfiy_defecttask_details(message);
	
}
@Then("^I Validate \"([^\"]*)\" Search result for \"([^\"]*)\"$")

public void i_validate_search_result_in_DB(String arg1,String arg2) throws Throwable {
	
	enduser.validate_getnext_search_result_db(arg1,arg2);
	
}

@Then("^I validate the \"([^\"]*)\" values in search result page and database$")

public void i_validate_result_in_DB(String arg1) throws Throwable {
	
	enduser.validate_getnext1_search_result_db(arg1);
	
}
//I update the value of "GetNext_AUTO" with GetNext_AUTO"1"

@Then("^I update the value of \"([^\"]*)\" with GetNext_AUTO\"([^\"]*)\"$")

public void i_update_values(String arg1,String arg2) throws Throwable {
	
	enduser.updatevalues_getnext(arg1,arg2);
	
}


@Then("^I Enter a value GetNext_\"([^\"]*)\" in Button Administrative Name$")

public void i_enter_name_in_BAN(String arg1) throws Throwable {
	
	enduser.i_enter_name_in_getnext(arg1);
	
}
	


	
@Then("^I delete the record \"([^\"]*)\" in GetNextPage$")

public void i_delete_values(String arg1) throws Throwable {
	
	enduser.i_delete_values_in_getnext(arg1);
	
}

///servicetest///
/////////////////////
@Given("^I want to execute service \"([^\"]*)\"$")
public void i_want_to_execute_service(String url) {
	enduser.execute_service(url);
} 

@When("^I pass the data as parameters in a file \"([^\"]*)\"$")
public void i_pass_the_data_as_parameters_in_a_file(String fileLocation) {
	try {
		enduser.input_paramaters_from_file(fileLocation);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
} 

@When("^I submit the POST request$")
public void i_submit_the_POST_request() {
	enduser.POST_request();
      
}

@Then("^I validate status code \"([^\"]*)\"$")
public void i_validate_status_code(int passedstatuscode) {
enduser.status_code(passedstatuscode);
}

@And("^Running a soap service \"([^\"]*)\" located at \"([^\"]*)\" and response in \"([^\"]*)\".$")
public void i_run_soap(String url, String location, String responseLocation) throws ClientProtocolException, IOException{
	//enduser.i_run_soap(url,location,responseLocation);
}

/////////////////////////////////////////////
@And("^I enter device name \"([^\"]*)\" for topology creation$")
public void enter_deviceName_topology(String deviceName) throws InterruptedException{
	enduser.enter_deviceName_topology(deviceName);
	
}
//click_advsearchbtn(String arg)
@And("^I click on advanced search for \"([^\"]*)\"$")
public void click_advsearchbtn(String arg) throws InterruptedException{
	enduser.click_advsearchbtn(arg);
}

  
 
 @And("^I select OLT role for \"([^\"]*)\"$")
 public void select_deviceRole(String role) throws InterruptedException{
 	enduser.select_devicerole(role);
 }
 //And I select \"([^\"]*)\" as device type
 @And("^I select \"([^\"]*)\" as device type$")
 public void select_deviceType(String deviceType) throws InterruptedException{
 	enduser.select_deviceType(deviceType);
 }
 
 @And("^I click on search button for advanced device search$")
 public void click_srchbtn_advsrch()throws InterruptedException{
	 enduser.click_srchbtn_advsrch();
	 Thread.sleep(1000);
 }
 
 @And("^I validate whether subscriber details are present$")
 public void validate_subscriber_details() throws InterruptedException{
	 enduser.validate_subscribertab_data();
 }
  } 



