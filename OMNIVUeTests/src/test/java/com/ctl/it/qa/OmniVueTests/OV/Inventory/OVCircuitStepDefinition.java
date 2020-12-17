package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateCircuitPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateServicePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchCircuitpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OVCircuitStepDefinition {
	
	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVActivationPage actvtnpage;
	OVCreateServicePage servicecreatepage ;
	OVCreateCircuitPage createcircuitpage ;
	OVSearchCircuitpage OVSearchCircuitpage;
	
	
	
	@And("^I select Circuit type as \"([^\"]*)\"$")
	public void i_select_link_type_as (String Ltype) throws Throwable {
		
		actvtnpage.ddl_circuittype.selectByVisibleText(Ltype) ;
		
		}
	
	
	
	@And("^I select \"([^\"]*)\" Circuit type under Create Tab$")
	public void i_select_circuittype_as (String circuittype) throws Throwable {
		enduser.createtab_inventory_circuittype(circuittype);	
	}
	
	@And("^I select \"([^\"]*)\" as the Circuit type in Create Tab$")
		public void i_select_circuit_type_createtab (String Ltype) throws Throwable {
		enduser.i_select_circuit_type_createtab(Ltype) ;
		
		}
	
	
	@And("^I select \"([^\"]*)\" as the port type in Create Tab$")
	public void i_select_port_type_createtab (String ptype) throws Throwable {
		enduser.i_select_port_type_createtab(ptype);
	
	}
	

	@And("^I fill all mandatory fields required with \"([^\"]*)\" in Circuit create form$")
	public void I_fill_all_mandatory_fields_required_for_Create_circuit (String arg1) throws Throwable {
	
		enduser.fill_fields_create_Circuit(arg1);
	
		servicecreatepage.btn_subscriberlookupicon.click();
		servicecreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
		createcircuitpage.btn_lookup.click();
		
		Thread.sleep(5000);
		
		servicecreatepage.lnk_subcribername.click();
		
		String subscriber_name = servicecreatepage.tbx_subscribername.getTextValue();
		slf4jLogger.info("successfully selected the Subscriber = "+ subscriber_name);
		
		// Provision status
		
		slf4jLogger.info("Checking Provision status field is enabled = " + createcircuitpage.tbx_Provision_status.isEnabled());	
	
	
	}
	//And I fill all the mandatory fields in Circuit Create tab with "Ethernet" data
	
		@And("^I fill all the mandatory fields in Circuit Create tab with \"([^\"]*)\" data$")
		public void I_fill_all_the_mandatory_fields_in_Circuit_Create_tab_with(String arg1) throws Throwable {
			
		
			
			enduser.fill_fields_for_Circuit_type("OVCreateCircuitPage", arg1, "Createform");
		}
		
		@And("^I update few fields in Circuit details tab for \"([^\"]*)\" Circuit$")
		public void I_update_few_fields_in_Circuit_details_tab_for_Circuit(String arg1) throws Throwable {
			
		
			enduser.fill_fields_for_Circuit_type("OVSearchCircuitpage", arg1, "Editform");
		
		}
		
		@And("^I select subscriber as \"([^\"]*)\" in Create Circuit Tab$")
		public void I_select_subscriber_as_in_Create_Circuit_Tab(String Subscriber) throws Throwable {
			createcircuitpage.createcircuitpage_Subscriber(Subscriber);
		}
		
		//And I Select Start Device as "" and End Device as "" in Circuit Create tab
		
		@And("^I Select Start Device as \"([^\"]*)\" and End Device as \"([^\"]*)\" in Circuit Create tab$")
		public void I_Select_Start_Device_as_and_End_Device_as_in_Circuit_Create_tab(String StartDevice,String EndDevice) throws Throwable {
			createcircuitpage.createcircuitpage_AssociateDevice(StartDevice,EndDevice);
		}
		
		
		
		@And("^I Associate \"([^\"]*)\" Circuit \"([^\"]*)\" to LAG Circuit$")
		public void I_Associate_Circuit_to_LAG_Circuit(int Number,String Circuit) throws Throwable {
			createcircuitpage.createLAG_AssociateCircuit(Number,Circuit);
			
		}
	
	@And("^I fill all the mandatory fields present in Circuit Create form with \"([^\"]*)\" data$")
	public void I_fill_mandatoryfield(String arg1) throws Throwable {
		enduser.fill_fields_basedon_type("OVCreateCircuitPage", arg1, "Createform");
		//enduser.fill_fields_basedon_type("OVCreatePWDCircuitPage", arg1, "Createform");
		
	}
	
	@And("^I fill all the mandatory fields present in Circuit Create for \"([^\"]*)\"$")
	public void i_fill_all_the_mandatory_fields_present_in_Circuit_Create_for(String arg1) throws Exception {
		enduser.Fill_fields_for_PW_circuit();	
		
	}
	
	@And("^I select the \"([^\"]*)\" Start Device$")
	public void I_select_the_Start_Device(String arg1) throws Throwable {
	
		Thread.sleep(2000);
	
		createcircuitpage.btn_start_device_lookup.click();
	
		enduser.fill_fields_create_Circuit(arg1);
	
		createcircuitpage.btn_device_lookup.click();
	
		Thread.sleep(3000);
	
		createcircuitpage.lnk_Device_name.click();
	
		Thread.sleep(3000);
	
		String SDname = createcircuitpage.tbx_start_device_name.getTextValue() ;
		slf4jLogger.info("Start Device Name = " + SDname);
	
	}
	

	@And("^I fetch the Start Device ports$")
		public void I_fetch_the_Start_Device_ports () throws Throwable {
		
		
			createcircuitpage.btn_Sfetch_port.waitUntilClickable() ;
		
			createcircuitpage.btn_Sfetch_port.click();
		
			Thread.sleep(3000);

			createcircuitpage.ddl_Start_port_name.selectByIndex(1) ;
		
		
		}
	
	@And("^I select the \"([^\"]*)\" End Device$")
	public void I_select_the_End_Device(String arg1) throws Throwable {
	
		Thread.sleep(2000);
	
		createcircuitpage.btn_end_device_lookup.click();
	
		enduser.fill_fields_create_Circuit(arg1);
	
		createcircuitpage.btn_device_lookup.click();
	
		Thread.sleep(3000);
	
		createcircuitpage.lnk_Device_name.click();
	
		Thread.sleep(3000);
	
		String SDname = createcircuitpage.tbx_end_device_name.getTextValue() ;
		slf4jLogger.info("End Device Name = " + SDname);
	
	}


@And("^I fetch the End Device ports$")
	public void I_fetch_the_End_Device_ports () throws Throwable {


		createcircuitpage.btn_Sfetch_port.waitUntilClickable() ;

		createcircuitpage.btn_Efetch_port.click();

		Thread.sleep(3000);

		createcircuitpage.ddl_End_port_name.selectByIndex(1) ;


	}

@And("^I validate Circuit in Database$")
public void validate_circuit_in_database() throws Throwable {
enduser.validate_circuit_in_database();
}


@And("^I click on \"([^\"]*)\" in Circuit page$")
public void Circuit_actions (String action) throws Throwable {
	Thread.sleep(10000);	
	enduser.Circuit_actions(action);
}

@And("^I click on device hyperlink in transportpath details page$")
public void transportpath_device () throws Throwable {
		enduser.transportpath_device();
		
}


@Then("^Circuit should get created successfully$")
public void Circuit_should_get_created_successfully () throws Throwable {

	
	
	createcircuitpage.tab_create_circuit_form.click();
	
	slf4jLogger.info( "Message = " + createcircuitpage.lbl_message.getText());
	
	


}

/*******************************	Sprint 236	*********************************************************/

@And("^I Search \"([^\"]*)\" with \"([^\"]*)\" in Advance search screen$")
public void advance_circuit_search(String type, String subtype) throws Throwable {
	enduser.advance_circuit_search(type,subtype);
}

@And("^I Search with \"([^\"]*)\" through Search slider with data from \"([^\"]*)\" Advanced Search result$")
public void circuit_advancesearch_searchslider(String circuitsearch,String type) throws Throwable {
	enduser.circuit_advancesearch_searchslider(circuitsearch,type); 
}


@And("^A new tab with \"([^\"]*)\" name will open$")
public void tabname_validations(String type) throws Throwable {
	enduser.tabname_validations(type);	
}

@And("^I validate Circuit details tab with Advanced Search result data$")
public void search_tab_validations_with_Advancesearch() throws Throwable {
	enduser.search_tab_validations_with_Advancesearch();
}

@And("^I Click on \"([^\"]*)\" tab on Circuit view page$")
public void Circuit_viewpage_tabaction(String tabaction) throws Throwable {
	enduser.Circuit_viewpage_tabaction(tabaction);	
}

@And("^I verify Transport type has EOVDSL2 in Ethernet Bearer create form$")
public void EB_transporttypevalidation() throws Throwable {
	enduser.EB_transporttypevalidation();	
}

@And("^I select Circuit type as \"([^\"]*)\" under create tab$")
public void createtab_inventory_circuittypeselect(String circuittype) throws Throwable {
		enduser.createtab_inventory_circuittypeselect(circuittype);			
	}

@And("^I select Circuit type as \"([^\"]*)\" in advance serach screen$")
public void inventory_advancecircuittypeselect(String circuittype) throws Throwable {
	enduser.inventory_advancecircuittypeselect(circuittype);			
}

@And("^I Enter Circuit name in search slider$")
public void Enter_circuit_name() throws Throwable {
	enduser.Enter_circuit_name();	
}

@And("^I enter the circuit name \"([^\"]*)\" into name field in the search slider$")
public void I_enter_the_circuit_name_into_name_field_in_the_search_slider(String circuitname){
                enduser.I_enter_name_field_under_search_slider(circuitname);
                
}
//Transport Path

@And("^I select circuit for Transport Path$")
public void I_select_circuit_for_Transport_Path() throws Throwable {    

     createcircuitpage.select_circuit();
     
}


@And("^I click on \"([^\"]*)\" in Create Transport Path$")
public void i_click_on_in_Create_Transport_Path(String Action)  throws Throwable {   

     createcircuitpage.select_action_Create_TransportPath(Action);
     
}

@Then("^I Validate the Success message for \"([^\"]*)\" action$")
public void i_Validate_Success_Message_in_Create_Transport_Path(String Action)  throws Throwable {      

     createcircuitpage.Validate_Success_Message_TransportPath(Action);
     
}


@Then("^I Validate Transport Path details for Device:\"([^\"]*)\"$")
public void i_Validate_Transport_Path_details_for_Device(String DeviceName)throws Throwable  {

     createcircuitpage.Validate_TransportPath_details_in_Device_Relatedtab(DeviceName);
}

//Transport Path

 


}
