package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedModServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateTopologyPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModServiceDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVTopologyStepDefinition {

	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);	

	@Steps
	UserSteps enduser;	
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
	OVCreateTopologyPage createTopologyPage;
	
	/*@And("^I fill the necessary fields with \"([^\"]*)\" data in Create Topology Page$") //Fill the Device create form page details
	public void fillTopologyData(String testdata) throws InterruptedException{
		enduser.fill_TopologyData(testdata);
	}*/
	@And("^I fill the necessary fields with \"([^\"]*)\" data in Create Topology Page$")
	public void fillTopologyData(String testdata) throws InterruptedException{
		enduser.fill_GeneralAttributes_TopologyData(testdata);
	}
	
	@And("^I click on \"([^\"]*)\" button$")  //Create Button Click on Create Form for Inventory, Subscriber
	public void clickAdddevicecircuit(String button) throws InterruptedException{
		enduser.clickAdddevicecircuit(button);
		}
	
/*	@And("^I click on Add Device button$")  //Create Button Click on Create Form for Inventory, Subscriber
	public void clickAddDevice() throws InterruptedException{
		enduser.clickAddDevice();
		}*/ // 10/13/2016	Need to check if the it's impacting other region
	
	@And("^I verified attributes in Place Devices in Topology Page$")  //Create Button Click on Create Form for Inventory, Subscriber
	public void I_verified_attributes_in_Place_Devices_in_Topology_Page() throws InterruptedException{
		enduser.verifyAttributes();
		}
	
	@And("^I search Device Type as \"([^\"]*)\" with Device SubType as \"([^\"]*)\"$")
	public void i_search_Device_Type_as_with_Device_SubType_as(String devType, String devSubType) throws InterruptedException {
		enduser.searchDevice(devType,devSubType);
	}
	
	@Then("^I validate \"([^\"]*)\" data in the Topology Detail Page$")
	public void i_should_validate_data_in_the_Topology_Detail_Page(String template) throws Throwable {
		Thread.sleep(3000);
		enduser.validateTopologyDetail(template);
		Thread.sleep(10000);
	    
	}
	
	@Then("^I Click on \"([^\"]*)\" in the Topology Detail Page$")
	public void i_click_on_action_in_the_Topology_Detail_Page(String action) throws Throwable {		
		enduser.Topologyaction(action);
		Thread.sleep(10000);    
	}
	@And("^I Select circuit data in Create Topology Page$") 
	public void select_circuit() throws InterruptedException{
		enduser.select_circuit();
	}
	@And("I Select circuit data in Create PON Collector Topology Page")
	public void select_circuit_PONCollector() throws InterruptedException{
		enduser.select_circuit_PONCollector();
	}
	@And("^I Select device data in Create Topology Page$") 
	public void select_device() throws InterruptedException{
		enduser.select_device();
	}
	@And("^I Validated related tab Topology view Page$") 
	public void Validated_relatedtab_Topology() throws InterruptedException{
		enduser.relatedtab_Topology();
	}
	@And("^I Validate Remove device and circuit$")
	public void Validated_Remove_device_circuit() throws InterruptedException{
		enduser.Validated_Remove_device_and_circuit();
	}
	@And("^I Validate Audit Logs of Topology$")
	public void Validated_Auditlogs_of_Topology() throws InterruptedException{
		enduser.Validated_Auditlogs_of_Topology();
	}
	@And("^I Validated Delete Topology view Page$") 
	public void Validated_Delete_Topology() throws InterruptedException{
		enduser.Delete_Topology();
	}
	
	 @And("^I have Updated TopologyType as \"([^\"]*)\"$")
	  public void Update_Topology(String Topology) throws Throwable {
	      enduser.Update_Topology(Topology);
		}
	 
	 @And("^I select Topology type as \"([^\"]*)\" under Create Tab$")
	 public void createtab_inventory_Topologytype(String Topologytype) throws Throwable{
		 enduser.createtab_inventory_Topologytype(Topologytype);
	 }
	 
	 @And("^I select \"([^\"]*)\" as state$")
	 public void I_Select_State(String TopologyState) throws Throwable{
		 enduser.select_state_4_topologycreateform(TopologyState);		 
	 }
	 
	 @And("^I select the \"([^\"]*)\" in Topology create form$")
	 public void Topology_craete_topologyrole(String Topologyrole) throws Throwable{
		 enduser.Topology_craete_topologyrole(Topologyrole);		 
	 }
	 
	 @And("^I associate device having role \"([^\"]*)\" in Topology create form$")
	 public void Topology_create_Adddevcie(String Devicerole) throws Throwable{
		 enduser.Topology_create_Adddevcie(Devicerole);		
	 }
	
	 @And("^I select Topology type as \"([^\"]*)\" in search tab$")
		public void i_select_topology_type_search_slider(String topologytype) throws Throwable {			
			enduser.i_select_topology_type_search_slider(topologytype);		
		}
	 
	 @And("^I select Topology role as \"([^\"]*)\" in search tab$")
		public void i_select_topology_role_search_slider(String topologyrole) throws Throwable {			
			enduser.i_select_topology_role_search_slider(topologyrole);		
		}
	 
	 @And("^I Select Topology type as \"([^\"]*)\" and Topology Role as \"([^\"]*)\" in search tab$")
		public void i_select_topology_type_and_topology_role_search_slider(String topologytype, String topologyrole) throws Throwable {			
			enduser.i_select_topology_type_and_topology_role_search_slider (topologytype,topologyrole);		
		}
	 
	 @And("^I Select Topology type as \"([^\"]*)\" and Topology Role as \"([^\"]*)\" and Technology Type as \"([^\"]*)\" in search tab$")
	 public void i_select_topologyType_topologyRole_technologyType_search_slider(String topologytype, String topologyrole, String technologyType) throws Throwable {
		 enduser.i_select_topologyType_topologyRole_technologyType_search_slider(topologytype,topologyrole,technologyType);
	 }
	 
	 @And("^I click on AddDevice button and validate the deviceType as \"([^\"]*)\"$")
	 public void i_validate_devType(String devType) throws Throwable {
			enduser.i_validate_deviceType(devType);
		}
	 
	 @And("^I click on \"([^\"]*)\" button in Topology details page$")
		public void clickbutton_in_Topology(String button) throws Throwable{
			enduser.Topologyactions_in_searchpage(button);
			}
     @And("^I click on view icon$")
     public void i_click_view_icon()	 throws Throwable {
    	 enduser.i_click_view_icon();
		}
     @And("^I validate the expend and minimize arrows$")
     public void i_validate_expend_minimize_arrows()	 throws Throwable {
    	 enduser.i_validate_expend_minimize_arrows();
		}
	 @And("^I Select Topology type as \"([^\"]*)\" and Topology Role as \"([^\"]*)\" in Advance Search Topology$")
		public void i_select_topology_type_and_topology_role_Advancetopologysearch(String topologytype, String topologyrole) throws Throwable {	
		 enduser.i_select_topology_type_and_topology_role_Advancetopologysearch(topologytype,topologyrole);		
	 }
	 
	 @Then("^I click on \"([^\"]*)\" button in Topology Screen$")
	 public void Topology_create_action(String action) throws Throwable{
		 enduser.Topology_create_Adddevcie(action);	
	 }
	 
	 @And("^I select \"([^\"]*)\" Topology type under Create Tab$")
	 public void createtab_inventory_selectTopologytype(String Topologytype) throws Throwable{
		 enduser.createtab_inventory_selectTopologytype(Topologytype);
	 }
	 
	 @And("^I fill the mandatory fields with \"([^\"]*)\" data in Create Topology Page$") //Fill the Device create form page details
		public void I_fill_mandatoryfield(String arg1) throws Throwable {
			
		 enduser.fill_fields_basedon_type("OVCreateTopologyPage", arg1, "Createform");
		
		}
	 
	 @And("^I search Device Type as \"([^\"]*)\" and Device SubType as \"([^\"]*)\"$")
		public void i_search_Device_Type_as_with_Device_SubType(String devType, String devSubType) throws InterruptedException {
			enduser.searchDevice_for_Association(devType,devSubType);
		}
	 @And("^I verify sequence number$")
	 public void i_verify_sequence_number() {
		   createTopologyPage.topology_sequence();
	 }
	 
	 @And("^I search Device Type as \"([^\"]*)\"$")
     public void i_search_Device_Type_as_with_Device_SubType(String devType) throws InterruptedException {
            enduser.searchDevice_for_Association_with_devicetype(devType);
	 }
     
	 @And("^I associate circuit type as \"([^\"]*)\" in Topology create form$")
	 public void Topology_create_Addcircuit(String circuittype) throws Throwable{
		 enduser.select_circuit_Lag(circuittype);		
	 }

	 @And("^I click on Topology view related tab$")
     public void i_click_on_related_tab() {
            enduser.i_click_on_topology_related_tab();
     }
     
      @Then("^I validate Google maps option is displayed in the Topology view related tab$")
     public void I_validate_Google_maps_option_is_displayed_in_the_Topology_view_related_tab() {
            createTopologyPage.I_validate_Google_maps_option_is_displayed_in_the_Topology_view_related_tab();
     }
     
      @Then("^I validate the Host sequence number for the created Topology with \"([^\"]*)\" and \"([^\"]*)\"$")
      public void I_validate_the_Host_sequence_number_for_the_created_Topology(String Device_type,String Device_subtype) {
             createTopologyPage.validate_topology_host_sequence_number(Device_subtype);
      }
      
      @And("I Select circuit data in Create Pager")
  	public void i_Select_circuit_data_in_Create_Pager() throws InterruptedException{
  		enduser.select_circuit_Select();
  	} 
}
