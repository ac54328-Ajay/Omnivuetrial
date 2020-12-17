package com.ctl.it.qa.OmniVueTests.user;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedModServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModServiceDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVCreateStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	OVLoginPage loginPage;
	OVHomepage ovhomepage;
	OVActivationPage actvtnpage;
	OVAssociatedServicesPage assocservicespage;
	OVDeviceLookupPage devicelookuppage;
	OVSearchDevicePage searchdevicepage;
	OVSearchServicePage servicedetailspage;
	OVModServiceDetailsPage modservicedetailspage;
	OVModDeviceLookupPage moddevicelookuppage;
	OVAssociatedModServicesPage modassocservicespage;
	OVCreateDevicePage devcreatepage;
	OVCreateServicePage ovg; 
	

	@Steps
	UserSteps enduser;		
	
	//SPRINT-6#################################
	
	@Then("^I validate whether MCO field is disabled$")
    public void is_MCO_disabled() {
	     enduser.is_MCO_disabled();
		
	}
	
	
	@Then("^I validate whether MCO field for MEFEENNI service is disabled$")
    public void is_MEFENNI_MCO_disabled() {
	     enduser.is_MEFENNI_MCO_disabled();
	     
	}     
	
	@Then("^I validate whether MCO field for MEFUNI service is disabled$")
	     public void is_MEFUNI_MCO_disabled() {
	 	     enduser.is_MEFUNI_MCO_disabled();
	 		
		
	}
	
	@Then("^I validate whether AutoNegotiate field for MEFUNI service is enabled$")
    public void is_MEFUNI_AutoNegotiate_enabled() {
	     enduser.is_MEFUNI_AutoNegotiate_enabled();
		
	
}
	
	@Then("^I validate whether MCO field for MEFOVC service is disabled$")
    public void is_MEFOVC_MCO_disabled() {
	     enduser.is_MEFOVC_MCO_disabled();
		
	
}
	
	
	@Then("^I validate whether MCO field for MEFEVC service is disabled$")
    public void is_MEFEVC_MCO_disabled() {
	     enduser.is_MEFEVC_MCO_disabled();
		
	
}
	//#########################################
	
	@And("^I fill the mandatory fields with \"([^\"]*)\" data$") //Fill the Device create form page details
	public void fillmandatoryfield(String testdata){
		enduser.fillmandatoryfield(testdata);		
	}
	
	@And("^I fill all the mandatory fields with \"([^\"]*)\" data$")
	public void fillmandatoryfield_device(String testdata) throws Throwable{
		enduser.fillmandatoryfield_device(testdata);		
	}
	
	@And("^I click on \"([^\"]*)\" button in Device Create Screen$")
	public void action_createscreen(String action) throws Throwable{
		enduser.action_createscreen(action);		
	}
	
	@And("^Fill all the mandatory fields with ([^\"]*) data$")
	public void fillmandatoryfield_passive(String testdata){
		enduser.fillmandatoryfield(testdata);		
	}
	
	@And("^Select subscriber & Equipment role with \"([^\"]*)\" data$") //Select subscriber & equipment role in create form page
	public void select_subcriber_equipmentrole(String testdata) throws InterruptedException{
		enduser.subcriber_equipment(testdata);
	}
	
	@And("^I click on Create button$")  //Create Button Click on Create Form for Inventory, Subscriber
	public void i_click_create_button(){
		enduser.click_createbutton();
		}

	@And("^I select the Technology type based on \"([^\"]*)\" Device role$")
	public void technology_select_based_devicerole(String role) throws Throwable{
		enduser.technology_select_based_devicerole(role);		
	}
	
	@Then("^I validated \"([^\"]*)\" radio button and \"([^\"]*)\" radio button$")
	public void i_validated_radio_button_and_radio_button(String radioBtn1, String radioBtn2) throws Throwable {
		/*if( enduser.getDriver().findElement(By.xpath(".//*[@id='0']/ng-include/div/div[11]/div/div[2]/div/div[3]/input[3]")).isDisplayed() && enduser.getDriver().findElement(By.xpath("//*[@id='0']/ng-include/div/div[11]/div/div[2]/div/div[3]/input[4]")).isDisplayed()){
		slf4jLogger.info("Element is Visible");
		}else{
		slf4jLogger.info("Element is InVisible");
		}*/
		//devcreatepage.IsRadioButtonPresent();				//check why is it throughing error---17/8/2016
	}
		
	@Then("^Validate attributes in order details page$")
	public void validate_order_attributes() {
		enduser.order_attribute();
	}

	@Then("^Validate the device name in search page$")
	public void validate_the_device_name_in_search_page() throws Throwable {
	    enduser.searched_device_is(searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name.getText());
	}	
	
	@And("^I click on the Launch Create form button$")  //Launching the subcribers create form
	public void i_click_launch_create_form(){
		enduser.click_createlaunchformbutton();
		
	}	
	
	@And("^I Update values of \"([^\"]*)\"$")
	public void i_update_value_of(String fields) throws Throwable{
		enduser.fill_fields(fields);
		
	}	
	@And("^I \"([^\"]*)\"$")
	public void i_update_something(String changes) throws Throwable{
		enduser.i_update_something(changes);
	}  
	
	
	@And("^I \"([^\"]*)\" for circuit$")
	public void i_for_circuit(String arg1) throws Exception {
		//select * from circuit where ALIAS1 ='pwd';
	}
	//New Updates---9/23/2016
	@And("^I clicked the \"([^\"]*)\" button in Device Detail Page$")
	public void edit_Button_DeviceDetailPage(String button) throws InterruptedException{
		enduser.edit_Button_DeviceDetailPage(button);
	}
	
	@Then("^I validate the updated functional status in DB$")
	public void i_validate_the_updated_functional_status_in_DB() {
		searchdevicepage.functionalStatus_value_In_DB();
	}
	@Then("^I validate the updated MGMTVLAN status in DB$")
	public void i_validate_the_updated_MGMTVLAN_in_DB() {
		searchdevicepage.MGMTVLAN_value_In_DB();
	}
	
	
	@And("I searched Passive device")
	public void searched_passive_device() throws Throwable{
		enduser.search_passive_device();
	}
	
	@And("^I edit the enabled fields with \"([^\"]*)\" data in Device Detail Tab$")
	public void fillenabledfield(String testdata){
		enduser.fillenabledfield(testdata);		
	}
	
	@And("^I clicked the save button in Networking Details Tab$") 
	public void saveNetworkingDetails() throws InterruptedException{
		enduser.saveNetworkingDetails();		
	}
	
	
	@And("^I clicked the \"([^\"]*)\" button in Networking Details Tab$")
	public void edit_Button_NetworkingDetailPage(String button) throws InterruptedException{
		enduser.edit_Button_NetworkingDetailPage(button);
	}
	
	@And("^I edit the enabled fields with \"([^\"]*)\" data in Networking Details Tab$") //Fill the Device create form page details
	public void networkDetailUpdatefield(String testdata) throws Throwable{
		enduser.fill_fields(testdata);
	}
	
	@And("^I fill the madatory fields for subscriber with \"([^\"]*)\" data$")
	 public void fillSubscriberFields(String data) throws InterruptedException{
		 enduser.fillSubscriberFields(data);
	 }
	
	@And("^I edit the enabled fields with \"([^\"]*)\" data$")
	public void editEnableField(String testdata) throws Throwable{
		enduser.fill_fields(testdata);
	}
	
	@And("^I click on wirecenterCLLI search button$")
	 public void clickwirecenterCLLISearchButton(){
		 devcreatepage.btn_wireclli.click();
	 }
	//End of new change--9/23

	// Network Build Device Creation
		
	@When("^I select \"([^\"]*)\" device$")
	public void gpon_netwrkbuild_createform(String gpondevice) throws Throwable{
		enduser.gpon_ntwrk_deviceselecting(gpondevice);
		
	}
	
	@Then("^I fill the fields present in the network build$")
	public void gpon_field_fill(){
		enduser.gpon_fill_field();
	}
			

	  @And("^I verified \"([^\"]*)\" from the Create Type dropdown$")
 	  public void verifyCreateSection(String sectionValue){
 		  enduser.verifyCreateSection(sectionValue);
 	  }
	  
	  @And("^I verified \"([^\"]*)\" from the Inventory Type dropdown$")
 	  public void verifyInventoryType(String sectionValue){
 		  enduser.verifyInventoryType(sectionValue);
 	  }
	  
		@And("^I Select Topology Type as \"([^\"]*)\" with State as \"([^\"]*)\"$")
		public void selectTopologyType_State(String topologyType, String state) {
			enduser.selectTopologyType_State(topologyType,state);
		}
	  
	  

	//TC54963
	@And("^I clicked the \"([^\"]*)\" button in \"([^\"]*)\" Detail Page$")
	public void edit_Button_TopologyDetailPage(String button, String relatedTabs) throws InterruptedException{
		enduser.edit_Button_TopologyDetailPage(button);
	}
	
	@And("^I validate the message displayed in Device Detail Page$")
	public void validate_message() {
		enduser.validate_message_device_Details();
	}
	@And("^I validate the message displayed in Network Detail Page$")
	public void validate_message_networkdetails() {
		enduser.validate_message_network_Details();
	}
	
	//TC39243
	@Then("^I verify all The Fields depending on selected value from SPEC Code dropdown$")
	public void i_verify_all_The_Fields_depending_on_selected_value_from_SPEC_Code_dropdown() throws InterruptedException 
	{
		//Thread.sleep(5000);
		//enduser.click_createlaunchformbutton();
		enduser.SPEC_Code_validation_servicecreate();
  
	} 
	
	/******************************************************************************************************************/
													//Installation sanity
	/******************************************************************************************************************/
	 @And("^I should see the following Create types \"([^\"]*)\"$")
		public void createtab_validation(String createtype) throws Throwable {
			enduser.createtab_validation(createtype);
		}
	 
	 // ******************************************************************************************************************//
	 //						GPON Scripts Validations																	  //
	 // ******************************************************************************************************************// 
	 
	 @And("^I select \"([^\"]*)\" in Create slider$")
	 public void createtab_select_new(String createtype) throws Throwable {
			enduser.createtab_validation(createtype);
		}
	 
	 @And("^I should be able to select \"([^\"]*)\" under \"([^\"]*)\" create type$")
	 public void createtab_subtypeselect(String create_subtype, String createtype) throws Throwable {
			enduser.createtab_subtype_selection(createtype,create_subtype);
		}
	 
	 @And("^I click the \"([^\"]*)\" button$")
	 public void createtab_launchform(String launchcreateform) throws Throwable {
			enduser.createtab_launchform(launchcreateform);
		}
	 
	 @And("^I select \"([^\"]*)\" as GDB-Component$")
	 public void select_GDBcomponent(String GDBcomponent) throws Throwable {
			enduser.GDB_componentselect(GDBcomponent);
		}
	 
	 @And("^I click on \"([^\"]*)\" in GDB screen$")
	 public void gdb_actionmethods(String GDBcomponent) throws Throwable {
		 enduser.gdb_actionmethods(GDBcomponent);
	 }
	
	 
	 @And("^I create \"([^\"]*)\" device with all the valid data$")
	 public void create_GDBcomponent(String GDBdevicecreate) throws Throwable {
			enduser.GDB_devicecreate(GDBdevicecreate);
		} 
	 
	 @And("^I fill all the mandatory fields for \"([^\"]*)\"$")
	 public void fill_GDBcomponent(String GDBdevicecreate) throws Throwable {
			enduser.fill_GDBcomponent(GDBdevicecreate);
		} 
	 
	 @And("^I should see \"([^\"]*)\" Device created successfully in Gpon device build$")
	 public void GDB_DeviceStatus(String GDBdevicestatus) throws Throwable {
			enduser.GDB_DeviceStatus(GDBdevicestatus);
		} 
	 
	 @And("^I should be able to Associate Service areas to the GDB Devices$")
	 public void GDB_associate_SA() throws Throwable {
			enduser.GDB_associate_SA();
		} 
	 
	 @And("^I create \"([^\"]*)\" device with all the valid data from excel$")
	 public void create_GDBcomponent_excelread(String GDBdevicecreate) throws Throwable {
		 enduser.create_GDBcomponent_excelread(GDBdevicecreate);
		 
	 }
	 
	 @And("^I create Service Area with valid data from excel$")
	 public void create_GDB_Servicearea_excelread() throws Throwable {
		 enduser.GDB_SA_create_exceldata();
	 }
	 
	 @And("^I should be able to Associate Service area to valid location$")
	 public void create_GDB_Servicearea_associate_excelread() throws Throwable {
		 enduser.GDB_SA_associate_address_exceldata();
	 }
	 
	 @And("^I select Functional status as \"([^\"]*)\"$")
	 public void GDB_functionalstatus(String fs) throws Throwable {
		 enduser.GDB_functionalstatus(fs);
	 }
	 
	 // ******************************************************************************************************************//
	 //						End of GPON Scripts Validations																	  //
	 // ******************************************************************************************************************// 
	 
	
	 @And("^I select \"([^\"]*)\" in Create tab$")
	 public void createtab_select(String createtype) throws Throwable {
		 enduser.createtab_createtypeselect(createtype);
		}
	 
	 @And("^I should see the following Bandwidth upgrade check-Access type \"([^\"]*)\"$")
	 	public void createtab_buc_accesstype(String accesstype) throws Throwable {
			enduser.createtab_buc_accesstype(accesstype);
		}
	 
	 @And("^I should see the following Inventory type values \"([^\"]*)\" under Create Tab$")
	 	public void createtab_inventorytypes(String invtype) throws Throwable {
			enduser.createtab_inventorytype(invtype);
		}
	 
	 @And("^I should see the following Circuit types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_circuittype(String circuittype) throws Throwable {
			enduser.createtab_inventory_circuittype(circuittype);			
		}
	 
	 @And("^I should see the following Filter by values \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Device_filterby(String filterbytype) throws Throwable {
			enduser.createtab_inventory_filterbytype(filterbytype);			
		}
	 
	 @And("^I should see the following Role types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Device_Roletype(String Roletype) throws Throwable {
			enduser.createtab_inventory_Roletype(Roletype);			
		}
	 
	 @And("^I should see the following Technology types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Device_Technologytype(String Technologytype) throws Throwable {
			enduser.createtab_inventory_Technologytype(Technologytype);			
		}	 
	 
	 @And("^I should see the following Device types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_devicetype(String devicetype) throws Throwable {
			enduser.createtab_inventory_devicetype(devicetype);
		}
	 
	 @And("^I should see the following Link types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Linktype(String Linktype) throws Throwable {
			enduser.createtab_inventory_Linktype(Linktype);
		}
	 
	 @And("I should see the following Location types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Locationtype(String Locationtype) throws Throwable {
			enduser.createtab_inventory_Locationtype(Locationtype);
		}
	 
	 @And("^I should see the following Logical Port types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Porttype(String Porttype) throws Throwable {
			enduser.createtab_inventory_Porttype(Porttype);
		}
	 
	 @And("^I select Technology type \"([^\"]*)\" under Number Create slider$")
	 public void createtab_inventory_Number_type(String Porttype) throws Throwable {
		 enduser.createtab_inventory_Number_type(Porttype);
	 }
	 
	 @And("^I select Number type as \"([^\"]*)\" under Number Create slider$")
	 public void createtab_inventory_Number_Selecttype(String Porttype) throws Throwable {
		 enduser.createtab_inventory_Number_type(Porttype);
	 }
	 
	 
	 @And("^I should see the following Number types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Number_Type(String numtype) throws Throwable {
			enduser.createtab_inventory_Number_numtype(numtype);
		}
	 
	 @And("^I should see the following Service type \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Service_Type(String Servicetype) throws Throwable {
			enduser.createtab_inventory_Number_Servicetype(Servicetype);
		}
	 
	 @And("^I should see the following Topology types \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Topology_Type(String Topologytype) throws Throwable {
			enduser.createtab_inventory_Topologytype(Topologytype);
		}
	 
	 @And("^I should see the following Network types \"([^\"]*)\" under Create Tab$")
	 public void createtab_network_Type(String networktype) throws Throwable {
			enduser.createtab_networktype(networktype);
		}
	 
	 @And("^I should see the following Build types \"([^\"]*)\" under Create Tab$")
	 public void createtab_network_BuildType(String BuildType) throws Throwable {
			enduser.selectbuildtypecheck(BuildType);
		}
	 
	 @And("^I should see the following Device roles \"([^\"]*)\" under Create Tab$")
	 public void createtab_network_Transport_devicerole(String devicerole) throws Throwable {
			enduser.createtab_network_Transport_devicerole(devicerole);
		}
	 
	 //*********************				Gfast Declarations 16/2/2017 ***********************
	 
	 @And("^I click on Launch create form after entering the GFAST DSLAM device as \"([^\"]*)\"$")
	 public void createtab_network_Transport_devicename(String devicename) throws Throwable {
		 enduser.createtab_network_Transport_devicename(devicename);
	 }
	 
	 @And("^I select \"([^\"]*)\" option from the Dialogue box$")
	 public void createtab_network_Transport_circuittype(String circuittype) throws Throwable {
		 enduser.createtab_network_Transport_circuittype(circuittype);
	 }
	 
	 @And("^I click \"([^\"]*)\" on the pop-up box displayed asking Whether to create new circuit$")
	 public void createtab_network_Transport_popup() throws Throwable {
		 enduser.createtab_network_Transport_popupbox();
	 }
	 
	 @And("^I need to validate \"([^\"]*)\" create form gets launched$")
	 public void createform_transportpath(String transportpath) throws Throwable {
		 enduser.transportpath_createform(transportpath);
	 }
	 
	 

	 //**************************************************************************************************//
	 
	 //*********************************  OSIP scenarios - 14/7/2017  **********************************************//
	 
	
	 
	//**************************************************************************************************//
	 
		 //*********************************  Sanity part - 5/8/2017  **********************************************//
	 
	 @And("^I select Service type as \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Service_Typeselect(String Servicetype) throws Throwable {
			enduser.createtab_inventory_Number_Servicetype(Servicetype);
		}
	 
	 

	 
	 @And("^I fill all the mandatory fields  in Device edit form with \"([^\"]*)\"$")
		public void fillmandatoryfield_edit_device(String testdata) throws Throwable{
		 enduser.fill_fields_update_device(testdata);		
		}
	 @And("^I fill all the mandatory fields  in Network edit form with \"([^\"]*)\"$")
		public void fillmandatoryfield_edit_Network_details(String testdata) throws Throwable{
		 enduser.fill_fields_update_device_network_details(testdata);		
		}
	 @And("^I verify \"([^\"]*)\" vectoring type details in database$")
		public void validate_vectoring(String testdata) throws Throwable{
		 enduser.device_vectoring_type(testdata);		
		}
	 ///////Aparna 08-08-18
	 @And("^I Select \"([^\"]*)\"  in VECTORING_TYPE and select \"([^\"]*)\" Vectoring Topology$")
	 public void I_Select_in_VECTORING_TYPE_and_Vectoring_Topology(String VECTORING_TYPE,String Vectoring_Topology) throws Throwable {
		 
		 enduser.createtab_Device_Create_Vectoring(VECTORING_TYPE,Vectoring_Topology);
	}
	 
	 @And("^I Select \"([^\"]*)\"  in VECTORING_TYPE and select \"([^\"]*)\" Vectoring Topology in Device details tab$")
	 public void I_Select_in_VECTORING_TYPE_and_Vectoring_Topology_in_Device_details_tab(String VECTORING_TYPE,String Vectoring_Topology) throws Throwable {
		 
		 enduser.detailtab_Device_edit_Vectoring(VECTORING_TYPE,Vectoring_Topology);
	 }
	 
	@Then("^I validate street dir prefix,street dir suffix and street type are not enabled$")
    public void i_validate_street_dir_prefix_street_dir_suffix_and_street_type_are_not_enabled() {
	     enduser.validate_street_dir_prefix_suffix_streettype_are_not_enabled();
		
	}
	
	
	
	
	
	@And("^I change the Management VLAN field to valid value$")
	public void I_change_the_Management_VLAN_field_to_valid_value() {
	       
	       enduser.I_change_the_Management_VLAN_field_to_valid_value();
	}

	@Then("^I validate the value updated in the Device details page$")
	public void I_validate_the_value_updated_in_the_Device_details_page() {

	       enduser.I_validate_the_value_updated_in_the_Device_details_page();
	       
	}
	

	@And("^I change the Management VLAN field to blank value$")
	public void I_change_the_Management_VLAN_field_to_blank_value() {
	       
	       enduser.I_change_the_Management_VLAN_field_to_blank_value();
	}

}