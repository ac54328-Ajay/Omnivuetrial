package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import java.sql.SQLException;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OVServiceStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVActivationPage actvtnpage;
	OVCreateServicePage servicecreatepage ;
	OVSearchServicePage servicesearchpage;

	
	
	@And("^I Search \"([^\"]*)\" in Search Tab$")		
    public void i_Search_for(String arg1) throws Throwable {
           actvtnpage.ddl_searchType.selectByVisibleText(arg1);
    }
	
	@And("^I searched for \"([^\"]*)\" with \"([^\"]*)\" Service Type$")
    public void i_searched_for_and_Service_Type(String arg1, String arg2) throws Throwable { 
    
           
           Thread.sleep(1000);
           actvtnpage.ddl_invntryType.selectByVisibleText(arg1);
           
           Thread.sleep(1000);
           
           actvtnpage.ddl_Search_ServiceType.selectByVisibleText(arg2);
           
           Thread.sleep(2000);     
           
    }
	
	@And("^I fill all the mandatory fields required in service create form with \"([^\"]*)\"$")
	 public void i_fill_mandatory_field_service_form(String arg1) throws Throwable {
		Thread.sleep(3000);
		enduser.fill_fields_service(arg1);
	}
	//aparna
	@And("^I fill all the mandatory fields required for \"([^\"]*)\"$")
	public void i_fill_all_the_mandatory_fields_required_for(String arg1) throws Throwable {

		Thread.sleep(3000);
		enduser.fill_fields_service(arg1);
		//servicedetailpage.fill_Subscriber_details();
		
	}
	
	@And("^I select \"([^\"]*)\" in HPC Reference Code and  HPC Expiration Date as \"([^\"]*)\"$")
	public void I_select_HPC_Reference_Code_and_HPC_Expiration_Date(String HPC_Code,String HPC_Date) throws Throwable {

        servicecreatepage.HPC_Details(HPC_Code,HPC_Date);
		
	}
	

	@And("^I validate HPC details should be displayed as \"([^\"]*)\" in HPC Reference Code and  HPC Expiration Date as \"([^\"]*)\" in service details tab$")
	public void I_validate_HPC_details_in_Service_Details_Tab(String HPC_Code,String HPC_Date) throws Throwable {

        
        
		servicecreatepage.Validate_HPC_Details_in_ServiceDetails(HPC_Code,HPC_Date);
		
	}
	
	@And("^Click on Activate button with order number \"([^\"]*)\" to send an activation request$")
	public void i_clicked_on_Activate_button(String Order_Num) throws Throwable {

		servicesearchpage.serviceactivation(Order_Num); }
	
	@And("^Validate Activation Message for \"([^\"]*)\" service$")
	public void validate_activation_message(String ServiceType) throws Throwable {
		
		servicesearchpage.Validate_activationmessage(ServiceType);}	
	
	///
	@And("^I fill Subscriber details  \"([^\"]*)\"$")
	 public void i_fill_suscriber_field_in_service_form(String arg1) throws Throwable {
		Thread.sleep(3000);
		enduser.fill_subscriber_service(arg1);
	}
	
	@When("^I gave the name as \"([^\"]*)\"$")
	public void i_gave_the_name_as(String serviceName) {
		servicecreatepage.fillserviceName(serviceName);
	}
	
	@When("^I filled DTN as \"([^\"]*)\" downStream as \"([^\"]*)\" upStream as \"([^\"]*)\"$")
	public void i_filled_DTN_as_downStream_as_upStream_as(String DTN, String downStream, String upStream) {
	     
		servicecreatepage.fillGponData(DTN,downStream,upStream);
	}

	@And("^I fill the subscriber details in service page$")
	public void i_fill_subscriber_service_form() throws Throwable {
		enduser.i_fill_subscriber_service_form();
			
	}
	
	@And("^I click on manual activation checkbox in service create form$")
	public void I_click_on_manual_activation_checkbox () throws Throwable {
		enduser.I_click_on_manual_activation_checkbox();
	
	
	}
	

	@And("^I click on \"([^\"]*)\" button on Service page$")
	public void ServiceActionmethods(String action) throws Throwable {
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		enduser.ServiceActionmethods(action);
		
		
		/*servicecreatepage.btn_create.click();
		Thread.sleep(5000);*/
		//actpage.btn_Individual_Location.click();
		
	}
	
	 @Then("^I validate \"([^\"]*)\" drop down values in DB$")
	 public void i_validate_drop_down_values_in_DB(String NCI) throws SQLException {
		 servicesearchpage.service_page_validation(NCI);
	     
	 }
	@And("^I updated PM Type dropdown to \"([^\"]*)\"$")
	public void SelectPMType(String value) throws Throwable {
		servicesearchpage.SelectPMType(value);
	}
	@And("^I Validate PM Type dropdown values in database$")
	public void Validate_PMType() throws Throwable {
		servicesearchpage.ValidatePMType_of_service();
	}
	@And("^Service should get created successfully$")
	public void service_should_get_created_successfully() throws Throwable {
	    
		enduser.service_should_get_created_successfully();	
		
	}
	
	
	@And("^Task should be generated and displayed in related tab Tasks$")
	public void task_should_be_generated_and_displayed_in_related_tab_Tasks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		enduser.task_should_be_generated_and_displayed_in_related_tab_Tasks();
		
		
		
	}
	
	@And("^I enter \"([^\"]*)\" : \"([^\"]*)\" in \"([^\"]*)\" Service Association Section$")
	public void i_enter_in_Service_Association_Section(String Dtype, String Dname, String section) throws Throwable {
	   
		enduser.i_enter_in_Service_Association_Section(Dtype,Dname,section);					
			}
	
	@And("^I Enter MSC UNI : \"([^\"]*)\" in MSC UNI Probe Uni Service Association section$")
	public void i_enter_service_name_in_service_association_section(String ServiceName) throws Throwable {
		
		servicecreatepage.perform_MSC_UNI_service_association(ServiceName);
		
	}
	
	@When("^I click on Create button of \"([^\"]*)\" page$")
	public void i_click_on_Create_button_of_Service_page(String Servicename) throws Throwable {

		
		enduser.i_click_on_Create_button_of_Service_page(Servicename);
		// actpage.btn_Individual_Location.click();

	}
	
	@And("^I select \"([^\"]*)\" on view icon in Search Result page$")
	public void search_service_resultpage(String ServiceName) throws Throwable {
		enduser.search_service_resultpage(ServiceName);
	}
	
	@And("^I Click on \"([^\"]*)\" tab on Service view page$")
	public void Service_View_Action(String action) throws Throwable {
		enduser.Service_View_Action(action);
	}
	
	@And("^I fill all the mandatory fields present in Service Create form with \"([^\"]*)\" data$")
	public void fill_fields_services(String data) throws Throwable {
		enduser.fill_fields_basedon_type("OVCreateServicePage", data, "Createform");
	}

	@And("^I select device : \"([^\"]*)\"  in \"([^\"]*)\" Service$")
	public void i_select_device_in_MEF_UNI_Service_Association_Section_Device_section_and_click_on_create(String Dname, String ServType) throws Throwable {
		enduser.i_select_device_in_MEF_UNI_Service_Association_Section_Device_section_and_click_on_create(Dname, ServType);
	}
	
	@And("^I click on \"([^\"]*)\" button of MEF ENNI page$")
	public void mefenni_serviceaction(String action){
		enduser.mefenni_serviceaction(action);
	}
	
	@And("^I click on End device in service details page$")
	public void i_click_on_enddevice_in_servicepage() throws Throwable {
		servicesearchpage.clickEndDevice();
	}
	
	@And("^I cLick on Add VLAN and added VLAN range$")
	public void i_cLick_on_Add_VLAN_and_added_VLAN_ranges() {
		servicecreatepage.i_cLick_on_Add_VLAN_and_added_VLAN_range();
	     
	}
	
	@And("^I verify \"([^\"]*)\" in Service page$")
	public void verify_validation(String validation) throws Throwable {		
		servicesearchpage.service_page_validation(validation);
	}
	@And("^I Click on \"([^\"]*)\" tab on Service Search page$")
	public void service_search_page_tab(String device_tab) throws Throwable {
		enduser.service_search_page_tab(device_tab);
	}
	@And("^I fill all the mandatory fields required in service update form with \"([^\"]*)\"$")
	 public void i_fill_mandatory_field_service_update_form(String arg1) throws Throwable {
		Thread.sleep(3000);
		enduser.fill_fields_service_update(arg1);
	}
	
	@And("^I Search for \"([^\"]*)\" with \"([^\"]*)\" spec code and i associate it to mefovc service$")
	 public void i_search_for_mef_uni(String arg1,String arg2) throws Throwable {
		//actvtnpage.ddl_searchType.selectByVisibleText("");
		//enduser.search_mef_uni(arg1,arg2);
		
		/*jsClick(tab_search);
		waitForElement(ddl_searchType);
		Thread.sleep(3000);*/
		
	}
	@And("^I Associate MEF UNI with \"([^\"]*)\" Non PM Spec Code to mefovc service$")
	 public void i_associate_mef_uni_for_OVC(String arg1) throws Throwable {
		//actvtnpage.ddl_searchType.selectByVisibleText("");
		enduser.search_mef_uni(arg1);
		
		/*jsClick(tab_search);
		waitForElement(ddl_searchType);
		Thread.sleep(3000);*/
		
	}
	@And("^I Associate PM UNI \"([^\"]*)\" mefovc service$")
	 public void i_associate_pm_uni_for_OVC(String arg1) throws Throwable {
		//actvtnpage.ddl_searchType.selectByVisibleText("");
		enduser.search_mef_uni(arg1);
		
	}
	@And("^I verify the SLA template$")
	public void i_verify_slatemplate() throws Throwable {
		servicesearchpage.verify_slatemplate();
	}
	
	@And("^I Validate the service \"([^\"]*)\" field values in database$")
	public void validate_service_field_values(String action) throws Throwable{
		enduser.browser_zoom_in();
		servicesearchpage.validate_service_field_values(action);
	}
	@And("^I verify service related tab displayed in HSI Serivce view page$")
	public void i_verify_service_tab() throws InterruptedException{
		servicesearchpage.verify_service_tab_displayed();
		
	}
	@And("I validate \"([^\"]*)\" in Service 360 view page Displayed")
	public void validate_associationtab_serviceview_displayed(String associationchanges) throws Throwable {
		enduser.validate_associationtab_serviceview(associationchanges);
		
	}
	
	@When("^I click on\"([^\"]*)\"of Associated Services tab$")
	public void i_click_on_of_Associated_Services_tab(String arg1) throws Throwable {
		enduser.validate_changes_associationtab_serviceview(arg1);
	}

	@And("^I validate the Related \"([^\"]*)\" tab in service page$")
	public void i_validate_device_relateted_tab_in_servicepage(String tab_name) throws Throwable {
		servicesearchpage.verify_service_related_tab(tab_name);
	}

	@When("^I double click on \"([^\"]*)\" name$")
	public void i_double_click_on_CEVLAN_name(String ele) throws Exception {
	   
		servicesearchpage.doubleClickOn(ele);
		}
	
	@And("^I verify Associations supporting tab displayed in view page$")
	public void i_verify_associations_tab() throws InterruptedException{
		servicesearchpage.verify_associations_tab_displayed();
		
	}
	
	
	@And("^I fill the mandatory fields required in IPTV Uincast create form$")
	public void i_enter_details_in_IPTV_Unicast_createpage() throws InterruptedException{
		servicecreatepage.create_iptv_unicast();
		
	}
	
	@And("^I select \"([^\"]*)\" in Service Type Indicator field$")
    public void I_select_value_in_Service_Type_Indicator_field(String STI) {
           enduser.I_select_value_in_Service_Type_Indicator_field(STI);
    }
    
    @And("^I select blank in to Service Type Indicator$")
    public void I_select_blank_in_to_Service_Type_Indicator() {
           enduser.I_select_blank_into_STI();
    }
    
    @And("^I validate warning message displayed in the deatils tab$")
    public void I_validate_warning_message_displayed_in_the_deatils_tab() {
    	enduser.I_validate_warning_message_displayed_in_details_tab();
    }
    
    @And("^I validate warning message displayed$")
    public void I_validate_warning_message_displayed() {
           enduser.I_validate_warning_message_displayed();
    }

    @And("^I select \"([^\"]*)\" in Service Type Indicator field in the deatils tab")
    public void I_select_value_in_Service_Type_Indicator_field_details_tab(String STI) {
           enduser.I_select_value_in_Service_Type_Indicator_field_details_tab(STI);
    }

    @And("^I enter the service name \"([^\"]*)\" in search slider$")
    public void I_enter_the_service_name_into_name_field_in_the_search_slider(String servicename){
                    enduser.I_enter_service_name_field_under_search_slider(servicename);
    }
    
    @And("^I click on Service Circuit Design related tab$")
    public void I_click_on_Service_Circuit_Design_related_tab() {
           servicecreatepage.i_click_on_service_circuit_design_related_tab();
    }
    
    @Then("^I verify all the fields displayed in the Service Circuit Design tab$")
    public void I_verify_all_the_fields_displayed_in_the_Service_Circuit_Design_tab() {
           servicecreatepage.i_validate_Service_Circuit_Design_tab();
    }
  
@And("^I expand the associated service$")
public void i_expand_the_associated_service() {
	servicecreatepage.i_expand_the_associated_service();
 
}

@And("^I cLick on Add VLAN  and added VLAN range$")
public void i_cLick_on_Add_VLAN_and_added_VLAN_range() {
	servicecreatepage.i_cLick_on_Add_VLAN_and_added_VLAN_range();
     
}

@When("^I Click on \"([^\"]*)\"$")
public void i_Click_on(String ServiceDetailsName) {
	servicesearchpage.tab_serviceDetailsName.click();
    
}


@When("^I Update Alias(\\d+) as \"([^\"]*)\" and Alias(\\d+) as \"([^\"]*)\"$")
public void i_Update_Alias_as_and_Alias_as(int arg1, String arg2, int arg3, String arg4) 
{
    
}

@And("^I Associate MEF UNI with Non PM Spec Code to mefovc service$")
	 public void i_associate_mef_uni() throws Throwable {
		//actvtnpage.ddl_searchType.selectByVisibleText("");
		enduser.search_mef_uni("%/KXFS/%");
		
		/*jsClick(tab_search);
		waitForElement(ddl_searchType);
		Thread.sleep(3000);*/
		
	} 
 
@And("^I verify the SLA template Name$")
	public void i_verify_slatemplate_Name() throws Throwable {
		servicesearchpage.verify_slatemplate_name();
	} 
 

@And("^I verify the SLA template on Focus Tab and Performance Tab value is match$")
public void i_verify_the_SLA_template_on_Focus_Tab_and_Performance_Tab_value_is_match() throws Throwable {
	servicesearchpage.verifing_slatemplate();
}



}
	
	 
