package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateCircuitPage extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	OVCreateGDBPage gdbcreatepage;

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS1']")
		public WebElementFacade tbx_circuit_editview_alias1; 
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS2']")
		public WebElementFacade tbx_circuit_editview_alias2; 
		
			@FindBy(id="NAME")
			public WebElementFacade tbx_name;
			
		
			@FindBy(id="ALIAS1")
			public WebElementFacade tbx_alias1;
		
		
			@FindBy(id="ALIAS2")
			public WebElementFacade tbx_alias2;
		
			@FindBy(id="CIRCUITBANDWIDTH")
			public WebElementFacade tbx_Bandwidth;
		
			@FindBy(id="DESCRIPTION")
			public WebElementFacade tbx_note;
		
		
			@FindBy(id ="CIRCUITSERVICETYPE")
			public WebElementFacade ddl_Circuit_Service_Type;
		
			@FindBy(id="TSP")
			public WebElementFacade tbx_TSP;
		
			@FindBy(id="TRANSPORTTYPE")
			public WebElementFacade ddl_Trasport_Type;

		
			@FindBy(id="BANDWIDTH")
			public WebElementFacade tbx_Provisioned_Bandwidth;
		
			@FindBy(id="CIRCUIT2FUNCTIONALSTATUS")
			public WebElementFacade ddl_Functional_Status;

	
			@FindBy(id="IS_DIVERSE")
			public WebElementFacade ddl_Is_Diverse;
		

		
			@FindBy(id = "CIRCUIT2PROVISIONSTATUS")
			public WebElementFacade tbx_Provision_status;
		
		
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='createCircuit();']")
			public WebElementFacade btn_create_circuit;
		
			
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetCircuit();']")
			public WebElementFacade btn_reset_circuitcreatepage;
					
		//------------------------------ Subscriber Adding section ------------------------------------------//
		
			@FindBy(xpath = ".//*[@id='addShelf']/div[3]/div[2]/input[1]")
			public WebElementFacade btn_lookup ;
					
			//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='openSubscriberLookUp(field.name)']/i")
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='openSubscriberLookUp(field.name)']/i")
			public WebElementFacade btn_circuitcreate_suscriberlookup ;	
			
			
			//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='invSubscriber.subscriberName']")
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='invSubscriber.subscriberName']")
			public WebElementFacade tbx_circuitcreate_suscriberlookup_subscribername ;	
			
			
			//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='lookUp()']")
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='lookUp()']")
			public WebElementFacade btn_circuitcreate_suscriberlookup_lckupicon ;	
			
			
			//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='lookupData(subscriberLookupData);']")
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='lookupData(subscriberLookupData);']")
			public WebElementFacade lbl_circuitcreate_suscriberlookup_searchresult ;
					
		// common fields for device section
		
			@FindBy(xpath = "//input[@ng-model='invServiceDevLookUp.buildingClli']")
			public WebElementFacade tbx_Building_CLLi ;
		
		
			@FindBy(xpath = "//input[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_Device_CLLi ;
		
		
			@FindBy(xpath = "//input[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_device_lookup ;
		
		
		
			@FindBy(xpath = "//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
			public WebElementFacade lnk_Device_name ;
		
		
		// Start Device section
		
		
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[6]/div/div/div/div[1]/span")
			public WebElementFacade btn_start_device_lookup ;
		
		
			@FindBy(id = "CIRCUIT2STARTLOCATION")
			public WebElementFacade tbx_start_device_name ;
		
		
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[6]/div/div[4]/div/p/span/input")
			public WebElementFacade btn_Sfetch_port ;
		
		
			@FindBy(id = "LOGICALSTARTPORTNAME")
			public WebElementFacade ddl_Start_port_name ;
		
		
		
		// End Device section
					
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[7]/div/div/div/div[1]/span")
			public WebElementFacade btn_end_device_lookup ;
		
		
		
			@FindBy(id = "CIRCUIT2ENDLOCATION")
			public WebElementFacade tbx_end_device_name ;
		
		
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div[9]/div[7]/div/div[4]/div/p/span/input")
			public WebElementFacade btn_Efetch_port ;
		
		
			@FindBy(id = "LOGICALENDPORTNAME")
			public WebElementFacade ddl_End_port_name ;
		
		
		
			
			
			
			
			@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
			public WebElementFacade tab_circuit360view ;
			
			
			@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
			public WebElementFacade tab_create_circuit_form ;
			
			
			@FindBy(xpath = "//*[@ng-show='showAlert' and contains(@class,'alert alert')]")
			public WebElementFacade lbl_message ;
			
			
			// End of Ethernet Bearer Circuit
			
			
			
			/*
			 * @FindBy(xpath = "//input[@ng-click='openDeleteCircuit()']")
			 * public WebElementFacade btn_Delete_circuit
			 */
			
			@FindBy(xpath = ".//li[@class='ng-isolate-scope active']/preceding-sibling::li[1]//tab-heading")
			public WebElementFacade tab_previuos ;
			
			
			@FindBy(xpath = ".//*[contains(text(),'Create Ethernet Bearer Circuit')]/../../preceding-sibling::li[1]")
			public WebElementFacade tab_createethernetbearer_previuos ;
			
			
		
		/*
		
		// Click on Create location button
		@FindBy(id=".//*[@id='0']/ng-include/div/div[3]/div/span/input[1]")
		public WebElementFacade btn_CreateButtonLocation;
		
		*/
			
		//############################################# ####################################### ####################################### //
		//#############################################   Circuit Create Sanity Validations ######################################//
			//############################################# ####################################### ####################################### //	
			@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
			public WebElementFacade tab_currentlydisplayed ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
			public List<WebElementFacade> lbl_allXapath;
			
			//--------------------------------------  Circuit Create General section Sanity Validations ------------------------------------------//
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General Section']")
			public WebElementFacade lbl_Circuit_createform_Gerneralsection ; 
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			//--------------------------------------  Circuit Create Subscriber section Sanity Validations ------------------------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Subscriber Section']")
			public WebElementFacade lbl_Circuit_createform_Subscribersection ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Subscriber Section']/parent::div//span[@ng-click='openSubscriberLookUp(field.name)']/i")
			public WebElementFacade btn_Circuit_createform_subscriberlookup ; 
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			//--------------------------------------  Circuit Create Ethernet Bearer section Sanity Validations ------------------------------------------//
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Ethernet Bearer']")
			public WebElementFacade lbl_Circuit_createform_ethernetbearersection ;
			
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			//--------------------------------------  Circuit Create Port Selection section Sanity Validations ------------------------------------------//
			
			/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']")
			public WebElementFacade lbl_Circuit_createform_Portsection ;				
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']/parent::div//label[contains(text(),'Start Device Name')]/following-sibling::div//span[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
			public WebElementFacade btn_Circuit_createform_startdevicelookup ; 				
		
			
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div//*[contains(text(),'End Device Name')]/following-sibling::div//*[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
			@FindBy(xpath=".//*[contains(text(),'End Device Name')]/..//span")
			public WebElementFacade btn_Circuit_createform_enddevicelookup ;*/
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='USAGE']")
            public WebElementFacade ddl_PseudoWireCircuit_createform_usageType ;
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']")
            public WebElementFacade lbl_Circuit_createform_Portsection;                       
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='PortSelection']")
            public WebElementFacade lbl_Circuit_PWC_createform_Portsection;      
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']/parent::div//label[contains(text(),'Start Device Name')]/following-sibling::div//span[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
            public WebElementFacade btn_Circuit_createform_startdevicelookup;                        
     
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='PortSelection']/parent::div//label[contains(text(),'Start Device Name')]/following-sibling::div//span[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
            public WebElementFacade btn_Circuit_PWC_createform_startdevicelookup; 
            
            //@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div//*[contains(text(),'End Device Name')]/following-sibling::div//*[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
            @FindBy(xpath=".//*[contains(text(),'End Device Name')]/..//span")
            public WebElementFacade btn_Circuit_createform_enddevicelookup ;

            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='CIRCUITSERVICETYPE']")
			public WebElementFacade ddl_CircuitServiceType_Circuit_createform_ethernetbearersection ;
			
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  Circuit Create Port Selection section  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_Circuit_createform_portselection_lookupicon ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Device CLLI %')]/../input")
			public WebElementFacade tbx_Circuit_createform_portselection_deviceclli ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='previous']/div")
			public WebElementFacade btn_Circuit_createform_portselection_previous ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='jqxScrollBtnDownverticalScrollBarcreateDevLookUpId']/div")
			public WebElementFacade btn_Circuit_createform_portselection_dropdown ;
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Start Device Name')]/../../..//*[@value='Fetch Ports']")
			public WebElementFacade btn_Circuit_createform_portselection_startdevice_fetchport ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='LOGICALSTARTPORTNAME']")
			public WebElementFacade ddl_Circuit_createform_portselection_startdevice_startport ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'End Device Name')]/../../..//*[@value='Fetch Ports']")
			public WebElementFacade btn_Circuit_createform_portselection_endevice_fetchport ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='LOGICALENDPORTNAME']")
			public WebElementFacade ddl_Circuit_createform_portselection_endevice_endport ;
			
			
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			//--------------------------------------  Circuit Create Topology Virtual  Selection section Sanity Validations ------------------------------------------//
			
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection Section']/parent::div//*[contains(text(),'Start Device Name')]/following-sibling::div//*[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']/img")
			@FindBy(xpath=".//*[contains(text(),'Start Device Name')]/..//span")
			public WebElementFacade btn_Circuit_createform_topologyvc_startdevicelookup ; 
			
			
			
			
			//--------------------------------------  Circuit Create LAG Selection section Sanity Validations ------------------------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='LAG Section']")
			public WebElementFacade lbl_Circuit_createform_Lagsection ;	
			
			
			
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			//----------------------------  Device name Look up -----------------------//
			
			@FindBy(xpath=".//*[@ng-model='invServiceDevLookUp.buildingClli']")
			public WebElementFacade tbx_Circuit_createform_devicelookup_buildingclli ;	
			@FindBy(xpath=".//*[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_Circuit_createform_devicelookup_deviceClli;	
			
			@FindBy(xpath=".//*[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_Circuit_createform_devicelookup_searchlookupicon ;	
			
			@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
			public WebElementFacade lbl_Circuit_createform_devicelookup_result ;
			
			@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(1)']")
			public WebElementFacade lbl_Circuit_createform_devicelookup_result1 ;
			
			
			@FindBy(xpath=".//*[contains(text(),'Start Device Name')]/../../../..//button")
			public WebElementFacade btn_Circuit_createform_startdevice_fetchport ;
			
			@FindBy(xpath=".//*[contains(text(),'Start Port')]/../select")
			public WebElementFacade ddl_Circuit_createform_startdevice_startport ;
			
			@FindBy(xpath=".//*[contains(text(),'End Device Name')]/../../../..//button")
			public WebElementFacade btn_Circuit_createform_enddevice_fetchport ;
			
			@FindBy(xpath=".//*[contains(text(),'End Port')]/../select")
			public WebElementFacade ddl_Circuit_createformenddevice_endport ;
			
			
			//--------------------------------------  Circuit Create LAG Member Circuit section Sanity Validations ------------------------------------------//
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='LAG Member Circuit']")
			public WebElementFacade lbl_Circuit_createform_Lagmembersection ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='LAG Member Circuit']/following-sibling::div//label[contains(text(),'Circuit Type')]")
			public WebElementFacade lbl_Circuit_createform_Lagmembersection_circuittype ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='LAG Member Circuit']/following-sibling::div//label[text()='Circuit']")
			public WebElementFacade lbl_Circuit_createform_Lagmembersection_circuit ;
			
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='LAG Member Circuit']/following-sibling::div//*[@alt='viewTask']")
			@FindBy(xpath=".//*[contains(@ng-click,'setServiceModal')]")
			public WebElementFacade btn_Circuit_createform_Lagmembersection_circuitlookup ;
			
			@FindBy(xpath=".//i[@ng-click='addRowForLAG(circuitLookUp,ind);']")
			public WebElementFacade btn_Circuit_createform_Lagmembersection_Addrow;
			
			
			@FindBy(xpath=".//*[@ng-model='circuit.circuitName']")
			public WebElementFacade tbx_Circuit_createform_Lagmembersection_circuitname ;
			
			@FindBy(xpath=".//*[contains(@ng-click,'circuitlookUp')]")
			public WebElementFacade btn_Circuit_createform_Lagmembersection_circuitlookupicon ;
			
			@FindBy(xpath="(.//*[@ng-click='circuitcloseModalClick(result)'])[1]")
			public WebElementFacade lbl_Circuit_createform_Lagmembersection_circuitlookup_result ;
			
			
			
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			//--------------------------------------  Circuit Create Optical Bearer section Sanity Validations ------------------------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Optical Bearer']")
			public WebElementFacade lbl_Circuit_createform_opticalbearer ; 
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Optical Bearer']/following-sibling::div//span[@ng-click='openLinkLookUp()']")
			public WebElementFacade btn_Circuit_createform_opticalbearer_linklookup ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invLink.deviceName']")
			public WebElementFacade tbx_Circuit_createform_opticalbearer_linklookup_devicename ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invLink.linkName']")
			public WebElementFacade tbx_Circuit_createform_opticalbearer_linklookup_linkName ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='linkLookUp()']/i")
			public WebElementFacade btn_Circuit_createform_opticalbearer_linklookup_lookupicon ;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//a[@ng-click='lookUpLinkData(link);']/span)[1]")
					public WebElementFacade lbl_Circuit_createform_opticalbearer_linklookup_resulthyperlink ;
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			//--------------------------------------  Circuit Create Optical Bearer section Sanity Validations ------------------------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Topology Virtual Circuit Section']")
			public WebElementFacade lbl_Circuit_createform_topology_VCSection ;
			
			
			
			//------------------------------------------------------------------------------------------------------------------------------------//
		/*	
			//--------------------------------------  Circuit Create Port Selection section Sanity Validations Others having additional section ------------------------------------------//
			*/
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection Section']")
			public WebElementFacade lbl_Circuit_createform_Portselectionsection ;			
			
			/*
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection Section']/parent::div//*[contains(text(),'Start Device Name')]/following-sibling::div//*[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']/img")
			public WebElementFacade btn_Circuit_createform_Portselectionsection_startdevicelookup ; 
						
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div//*[contains(text(),'End Device Name')]/following-sibling::div//*[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']/img")
			public WebElementFacade btn_Circuit_createform_Portselectionsection_enddevicelookup ;
			
			//------------------------------------------------------------------------------------------------------------------------------------//
*/			
			
			//--------------------------------------  Circuit Create VLAN Member Circuit section Sanity Validations ------------------------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='VLAN Member Circuit']")
			public WebElementFacade lbl_Circuit_createform_VLAN_membercircuit ; 
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='VLAN Member Circuit']/following-sibling::div//label[contains(text(),'Circuit Type')]")
			public WebElementFacade lbl_Circuit_createform_VLAN_membercircuit_circuittype ;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='VLAN Member Circuit']/following-sibling::div//label[text()='Circuit']")
			public WebElementFacade lbl_Circuit_createform_VLAN_membercircuit_circuit ;
			
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='VLAN Member Circuit']/following-sibling::div//*[@alt='viewTask']")
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='VLAN Member Circuit']/following-sibling::div//span")
			public WebElementFacade btn_Circuit_createform_VLAN_membercircuit_circuitlookup ;
			
			//------------------------------------------------------------------------------------------------------------------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createCircuit();']")
			public WebElementFacade btn_Circuit_createform_create ;
			
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditCircuit();']")
			public WebElementFacade btn_circuitview_edit;
			
			//--------------------------		Ethernet Bearer Circuit Page -----------------------//
			
			@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Create Ethernet Bearer Circuit')]")
			public WebElementFacade tab_Circuit_createform_Ethernetbearer ;
			
			
			@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Create')]")
			public WebElementFacade tab_Circuit_createform ;
			
			@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Create')]/../../following-sibling::li//tab-heading")
			public WebElementFacade tab_Circuit_createform_followingtab ;
			
			//##########################################################################################################################################//
		/*
			//#########################  Logical port create form  fields  ##############################//
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='createLogicalPort();']")
			public WebElementFacade btn_logicalportcreate_create;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='logicalPortName']")
			public WebElementFacade tbx_logicalportcreate_name;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='alias1']")
			public WebElementFacade tbx_logicalportcreate_alias1;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='alias2']")
			public WebElementFacade tbx_logicalportcreate_alias2;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
			public WebElementFacade btn_logicalportcreate_devicelookup;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_logicalportcreate_devicelookup_deviceclli;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_logicalportcreate_devicelookup_lookupicon;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@title='previous']/div")
			public WebElementFacade btn_logicalportcreate_devicelookup_previous;
			
			@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//a[contains(@ng-click,'lookupGridSettings.selLukupValue(')])[1]")
					public WebElementFacade lbl_logicalportcreate_devicelookup_result;
					
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openPhysicalPortLookUp(field.name)']")
					public WebElementFacade btn_logicalportcreate_deviceport;
					
					@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='servicePhysicalPortlookUp()']")
					public WebElementFacade btn_logicalportcreate_deviceport_lookupicon;
					
					@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//a[@ng-click='closePhysicalPortDataLookUp(port)'])[1]")
							public WebElementFacade lbl_logicalportcreate_deviceport_result;*/
					
			
			//---------------------------------------Transport Path---------------------------------------//
            
            @FindBy(xpath="//select[@ng-model='circuitName']")
            public WebElementFacade ddl_Create_TransportPath_Circuit;
            
            
            @FindBy(xpath=".//button[@ng-click='submitTransportPath();']")
            public WebElementFacade button_Submit_TransportPath_Circuit;
            
            @FindBy(xpath=".//button[@ng-click='saveTransportPath();']")
            public WebElementFacade button_Save_TransportPath_Circuit;
            
            
            //@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createRouteController']//button[@data-ng-click='switchAlert();']/..")
            @FindBy(xpath=".//div[@ng-controller='createRouteController']//div[@ng-class='alert.className'][contains(.,'System Error Occured') or contains(.,'Route')] ")             
            public WebElementFacade lbl_Msg_Transport_Path_Create_tab;
            
            @FindBy(xpath=".//tab-heading[@ng-click='onClickTab(tab)'and contains(text(),'Create Transport Path')]")
            public WebElementFacade tab_Create_Transport_Path_tab;
            
            @FindBy(xpath=".//tab-heading[@ng-click='onClickTab(tab)'and contains(text(),'Transport Path Result')]")
            public WebElementFacade tab_Transport_Path_Result_tab;            
            
            
            @FindBy(xpath=".//tab-heading[@ng-click='onClickTab(tab)' and contains(text(),'Transport Path Result')]/a")
            public WebElementFacade tab_Result_Transport_Path_tab_Close;
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'completeRouteDetail')]//button[@value='Delete']")
            public WebElementFacade button_Delete_Transport_Path_tab;
            
            //@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='searchNetworkTransPathResultCntrl']//button[@data-ng-click='switchAlert();']/..")
            
            @FindBy(xpath=".//div[@ng-controller='searchNetworkTransPathResultCntrl']//div[@ng-class='alert.className'][contains(.,'System Error Occured') or contains(.,'Route')]")
            public WebElementFacade lbl_Msg_Transport_Path_Result_tab;
            
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'inCompleteRouteDetail')]//span[contains(@ng-click,'getTransData')]/i")
            public WebElementFacade button_Expand_IncompleteTransport_Path_Result_tab;
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'inCompleteRouteDetail')]//button[@ng-click='editRouteIncomplete()']")
            public WebElementFacade button_Edit_IncompleteTransport_Path_Result_tab;
            
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'inCompleteRouteDetail')]//button[contains(@ng-click,'submitRoute')]")
            public WebElementFacade button_Submit_IncompleteTransport_Path_Result_tab;
            
            @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'inCompleteRouteDetail')]//button[contains(@ng-click,'saveRoute')]")
            public WebElementFacade button_Save_IncompleteTransport_Path_Result_tab;
            
            @FindBy(xpath=".//a[@ng-click='removeAllTabs()']")
            public WebElementFacade tab_close_all;
            
            
            //Transport Path in Device details tab
            @FindBy(xpath=".//li[@ng-repeat='tab in leftTabs']//tab-heading[@ng-click='onClickTab(tab)' and contains(text(),'Transport Details')]")
            public WebElementFacade tab_Device_Transportpath_Relatedtab;
            



            @FindBy(xpath=".//div[@ng-init='leftTabs=leftTabs']//div[@ng-controller='searchNetworkTransPathResultCntrl']//h4[contains(text(),'Routes for')]")
            public WebElementFacade lbl_Device_Transportpath_Relatedtab;

            @FindBy(xpath=".//div[@ng-init='leftTabs=leftTabs']//div[@ng-controller='searchNetworkTransPathResultCntrl']//span[@ng-click='getTransData(accord2,accord1.title);']/i")
            public WebElementFacade lbl_Device_Transportpath_Relatedtab_Expand;


            @FindBy(xpath=".//div[@ng-init='leftTabs=leftTabs']//div[@ng-controller='searchNetworkTransPathResultCntrl']//div[@ng-if='dataFoundComplete']/h4")
            public WebElementFacade lbl_Device_Transportpath_Details;
            
            @FindBy(xpath=".//div[@ng-init='leftTabs=leftTabs']//div[@ng-controller='searchNetworkTransPathResultCntrl']//i[@ng-click='refreshRoutes(accordianData)']")
            public WebElementFacade lbl_Device_Transportpath_Refresh;
            
            //Transport Path in Device details tab

//---------------------------------------Transport Path---------------------------------------//
			              
	
			              

		//##########################################################################################################################################//			
					
					
		public WebElement waitForElement(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(getDriver(),5000);				   
		    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
			
		    return element;
		}	
	
		
		public void Circuit_create_Sanity_Validation() throws Throwable{
			
			slf4jLogger.info("Create Circuit Validations");
			waitForElement(lbl_Circuit_createform_Gerneralsection); Thread.sleep(3000);
			if(!tab_currentlydisplayed.isCurrentlyVisible()){
				throw new Error("Create form is not displayed");
			}
			
			if(!btn_create_circuit.isCurrentlyVisible() && !btn_create_circuit.isCurrentlyEnabled()){
				throw new Error("Create button is not Visible & enable:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
			
			if(!btn_reset_circuitcreatepage.isCurrentlyVisible() && !btn_reset_circuitcreatepage.isCurrentlyEnabled()){
				throw new Error("Reset button is not Visible & enable:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
			
			if(!lbl_Circuit_createform_Gerneralsection.isCurrentlyVisible()){
				throw new Error("General Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
		
			List<WebElementFacade> circuit_create_attribute = lbl_allXapath;
			
			ArrayList<String> Circuitcreate_Fieldattributelist=new ArrayList<String>();
				for(int j=0;j<circuit_create_attribute.size();j++){
					Circuitcreate_Fieldattributelist.add(j, circuit_create_attribute.get(j).getText());
						//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
					}
			//	System.out.println("Fields Present:"+Circuitcreate_Fieldattributelist);
			ArrayList<String> List2compare_Circuit_Fieldattributelist=new ArrayList<String>();
			
			slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
			
			switch(tab_currentlydisplayed.getText().replaceAll("\\s+$", "")){
			
			case "Create Ethernet Bearer Circuit": 	List2compare_Circuit_Fieldattributelist.add(0, "Name *");
													List2compare_Circuit_Fieldattributelist.add(1, "Alias 1");
													List2compare_Circuit_Fieldattributelist.add(2, "Alias 2");
													List2compare_Circuit_Fieldattributelist.add(3, "Provision Status");
													List2compare_Circuit_Fieldattributelist.add(4, "Bandwidth");
													List2compare_Circuit_Fieldattributelist.add(5, "Description");
													List2compare_Circuit_Fieldattributelist.add(6, "Note");
													List2compare_Circuit_Fieldattributelist.add(7, "Subscriber Name *");
													List2compare_Circuit_Fieldattributelist.add(8, "Circuit Service Type *");
													List2compare_Circuit_Fieldattributelist.add(9, "TSP");
													List2compare_Circuit_Fieldattributelist.add(10, "Transport Type");
													List2compare_Circuit_Fieldattributelist.add(11, "Provisioned Bandwidth *");
													List2compare_Circuit_Fieldattributelist.add(12, "Functional Status");
													List2compare_Circuit_Fieldattributelist.add(13, "Is Diverse"); 
													List2compare_Circuit_Fieldattributelist.add(14, "Start Device Name *");
													List2compare_Circuit_Fieldattributelist.add(15, "End Device Name *");
																									
													if(!lbl_Circuit_createform_Subscribersection.isCurrentlyVisible()){
														throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!btn_Circuit_createform_subscriberlookup.isCurrentlyVisible() && !btn_Circuit_createform_subscriberlookup.isCurrentlyEnabled()){
														throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!lbl_Circuit_createform_ethernetbearersection.isCurrentlyVisible()){
														throw new Error("Ethernet Bearer Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!lbl_Circuit_createform_Portsection.isCurrentlyVisible()){
														throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}												
													
													if(!btn_Circuit_createform_startdevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_startdevicelookup.isCurrentlyEnabled()){
														throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!btn_Circuit_createform_enddevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_enddevicelookup.isCurrentlyEnabled()){
														throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}													 
													 
													break;
				
			case "Create LAG Circuit": 	List2compare_Circuit_Fieldattributelist.add(0, "Name *");
										List2compare_Circuit_Fieldattributelist.add(1, "Alias 1");
										List2compare_Circuit_Fieldattributelist.add(2, "Alias 2");
										List2compare_Circuit_Fieldattributelist.add(3, "Provision Status");
										List2compare_Circuit_Fieldattributelist.add(4, "Description");									
										List2compare_Circuit_Fieldattributelist.add(5, "Note");
										List2compare_Circuit_Fieldattributelist.add(6, "Subscriber Name *");
										List2compare_Circuit_Fieldattributelist.add(7, "Circuit Service Type");
										List2compare_Circuit_Fieldattributelist.add(8, "Protection Type");
										List2compare_Circuit_Fieldattributelist.add(9, "LAG Number");
										
										if(!lbl_Circuit_createform_Subscribersection.isCurrentlyVisible()){
											throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_Circuit_createform_subscriberlookup.isCurrentlyVisible() && !btn_Circuit_createform_subscriberlookup.isCurrentlyEnabled()){
											throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_Circuit_createform_Lagsection.isCurrentlyVisible()){
											throw new Error("LAG section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_Circuit_createform_Lagmembersection.isCurrentlyVisible()){
											throw new Error("LAG Member Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}										
										
										if(!lbl_Circuit_createform_Lagmembersection_circuittype.isCurrentlyVisible()){
											throw new Error("Circuit type dropdown label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_Circuit_createform_Lagmembersection_circuit.isCurrentlyVisible()){
											throw new Error("Circuit field label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_Circuit_createform_Lagmembersection_circuitlookup.isCurrentlyVisible() && !btn_Circuit_createform_Lagmembersection_circuitlookup.isCurrentlyEnabled()){
											throw new Error("Circuit lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}													 
										 
										break;				
										
										 
				
			case "Create Optical Bearer Circuit":	List2compare_Circuit_Fieldattributelist.add(0, "Name");
													List2compare_Circuit_Fieldattributelist.add(1, "Alias 1");
													List2compare_Circuit_Fieldattributelist.add(2, "Alias 2");
													List2compare_Circuit_Fieldattributelist.add(3, "Provision Status");
													List2compare_Circuit_Fieldattributelist.add(4, "Link *");
													
													if(!lbl_Circuit_createform_opticalbearer.isCurrentlyVisible()){
														throw new Error("Optical Bearer section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!btn_Circuit_createform_opticalbearer_linklookup.isCurrentlyVisible() && !btn_Circuit_createform_opticalbearer_linklookup.isCurrentlyEnabled()){
														throw new Error("Optical Beare Link lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}													 
													 
													break;	
													 
			
			
			case "Create PON Circuit": 	List2compare_Circuit_Fieldattributelist.add(0, "Name");
										List2compare_Circuit_Fieldattributelist.add(1, "Alias 1");
										List2compare_Circuit_Fieldattributelist.add(2, "Alias 2");
										List2compare_Circuit_Fieldattributelist.add(3, "Provision Status");
										List2compare_Circuit_Fieldattributelist.add(4, "Subscriber Name *");
										List2compare_Circuit_Fieldattributelist.add(5, "Start Device Name *");
				
										if(!lbl_Circuit_createform_Subscribersection.isCurrentlyVisible()){
											throw new Error("Subscriber section is not displayed");
										}	
										
										if(!btn_Circuit_createform_subscriberlookup.isCurrentlyVisible() && !btn_Circuit_createform_subscriberlookup.isCurrentlyEnabled()){
											throw new Error("Subscriber lookup button is not enabled");
										}
										
										if(!lbl_Circuit_createform_Portsection.isCurrentlyVisible()){
											throw new Error("Port Selection section is not displayed");
										}												
										
										if(!btn_Circuit_createform_startdevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_startdevicelookup.isCurrentlyEnabled()){
											throw new Error("Start Device lookup button is not enabled");
										} break;	
										
				
			case "Create Pseudo Wire Circuit": 	List2compare_Circuit_Fieldattributelist.add(0, "Alias 1");
												List2compare_Circuit_Fieldattributelist.add(1, "Alias 2");
												List2compare_Circuit_Fieldattributelist.add(2, "Provision Status");
												List2compare_Circuit_Fieldattributelist.add(3, "Usage Type *");
												List2compare_Circuit_Fieldattributelist.add(4, "Description");
												List2compare_Circuit_Fieldattributelist.add(5, "Note");												
												List2compare_Circuit_Fieldattributelist.add(6, "Start Device Name *");
												List2compare_Circuit_Fieldattributelist.add(7, "End Device Name *");
												
												if(!lbl_Circuit_createform_Portsection.isCurrentlyVisible()){
													throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}												
												
												if(!btn_Circuit_createform_startdevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_startdevicelookup.isCurrentlyEnabled()){
													throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!btn_Circuit_createform_enddevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_enddevicelookup.isCurrentlyEnabled()){
													throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}													 
												 
												break;
				
			case "Create Topology Virtual Circuit":		List2compare_Circuit_Fieldattributelist.add(0, "Name *");
														List2compare_Circuit_Fieldattributelist.add(1, "Alias 1");
														List2compare_Circuit_Fieldattributelist.add(2, "Alias 2");
														List2compare_Circuit_Fieldattributelist.add(3, "Provision Status");														
														List2compare_Circuit_Fieldattributelist.add(4, "Description");
														List2compare_Circuit_Fieldattributelist.add(5, "Note");
														List2compare_Circuit_Fieldattributelist.add(6, "Modification User Id");
														List2compare_Circuit_Fieldattributelist.add(7, "Exception Handling Info"); 
														List2compare_Circuit_Fieldattributelist.add(8, "Start Device Name *");
														List2compare_Circuit_Fieldattributelist.add(9, "End Device Name *");			
														
														if(!lbl_Circuit_createform_topology_VCSection.isCurrentlyVisible()){
															throw new Error("Topology Virtual Circuit Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														}	
														
														if(!lbl_Circuit_createform_Portselectionsection.isCurrentlyVisible()){
															throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														}												
														
														if(!btn_Circuit_createform_topologyvc_startdevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_topologyvc_startdevicelookup.isCurrentlyEnabled()){
															throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														} 
														
														if(!btn_Circuit_createform_enddevicelookup.isCurrentlyVisible() && !btn_Circuit_createform_enddevicelookup.isCurrentlyEnabled()){
															throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														}													 
														 
														break;
			
			case "Create VLAN Segment Circuit": 	List2compare_Circuit_Fieldattributelist.add(0, "Name *");
													List2compare_Circuit_Fieldattributelist.add(1, "Alias 1");
													List2compare_Circuit_Fieldattributelist.add(2, "Alias 2");
													List2compare_Circuit_Fieldattributelist.add(3, "Provision Status");													
													List2compare_Circuit_Fieldattributelist.add(4, "Description");
													List2compare_Circuit_Fieldattributelist.add(5, "Note");

													 ;   
													if(!lbl_Circuit_createform_VLAN_membercircuit.isCurrentlyVisible()){
														throw new Error("VLAN Member Circuit Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!lbl_Circuit_createform_VLAN_membercircuit_circuittype.isCurrentlyVisible()){
														throw new Error("VLAN Member Circuit Type Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!lbl_Circuit_createform_VLAN_membercircuit_circuit.isCurrentlyVisible()){
														throw new Error("VLAN Member Circuit field is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!btn_Circuit_createform_VLAN_membercircuit_circuitlookup.isCurrentlyVisible() && !btn_Circuit_createform_VLAN_membercircuit_circuitlookup.isCurrentlyEnabled()){
														throw new Error("VLAN Member Circuit lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}													 
													 
													break;
			}
			
			for(int i=0;i<Circuitcreate_Fieldattributelist.size();i++){
				if(!Circuitcreate_Fieldattributelist.get(i).contains(List2compare_Circuit_Fieldattributelist.get(i))){
					slf4jLogger.info("Circuitcreate_Fieldattributelist="+Circuitcreate_Fieldattributelist.get(i));
					slf4jLogger.info("List2compare_Circuit_Fieldattributelist="+List2compare_Circuit_Fieldattributelist.get(i)+" Not matching");
					throw new Error("Fields are not matching check:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
				}
			}
			slf4jLogger.info("Circuit Create field attributes are expected as per "+tab_currentlydisplayed.getText().replaceAll("\\s+$", "")+" Circuit type");
			
		}
		
		public void EB_transporttypevalidation() throws Throwable {
			ddl_Trasport_Type.selectByVisibleText("EOVDSL2");
		}
		
		
		public void verifyvalidation(String validation){try {
			String Message;
			String deviceClli_start="PHNXAZPR06W";
			String deviceClli_end="TEMPAZCC11W";
			switch(validation){
			case "ethernet circuit with device created":
				Message=tab_previuos.getText().trim();
				jsClick(btn_Circuit_createform_topologyvc_startdevicelookup);
				waitForElement(tbx_Circuit_createform_devicelookup_buildingclli);tbx_Circuit_createform_devicelookup_buildingclli.type(Message);
				jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);waitForElement(lbl_Circuit_createform_devicelookup_result);
				
				while(!isElementVisible(By.xpath(".//*[contains(@ng-click,'lookupGridSettings.selLukupValue(') and text()='"+Message+"']"))){
					jsClick(btn_Circuit_createform_portselection_previous); Thread.sleep(2000);
				}
				
				
				jsClick(getDriver().findElement(By.xpath(".//*[contains(@ng-click,'lookupGridSettings.selLukupValue(') and text()='"+Message+"']")));
					
						Thread.sleep(1000);waitForElement(btn_Circuit_createform_startdevice_fetchport);jsClick(btn_Circuit_createform_startdevice_fetchport);waitForElement(ddl_Circuit_createform_startdevice_startport);
						ddl_Circuit_createform_startdevice_startport.selectByVisibleText("Pluggable.1.1/1.1 - (Planned) - 1/1/1 / 1/1/1");
					
				if(btn_Circuit_createform_enddevicelookup.isCurrentlyVisible()){
					jsClick(btn_Circuit_createform_enddevicelookup);waitForElement(tbx_Circuit_createform_devicelookup_buildingclli);tbx_Circuit_createform_devicelookup_buildingclli.type("GLRDFLXA");
					jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);waitForElement(lbl_Circuit_createform_devicelookup_result1);Thread.sleep(1000);
					jsClick(lbl_Circuit_createform_devicelookup_result1);Thread.sleep(1000);
					waitForElement(btn_Circuit_createform_enddevice_fetchport);jsClick(btn_Circuit_createform_enddevice_fetchport);waitForElement(ddl_Circuit_createformenddevice_endport);
					ddl_Circuit_createformenddevice_endport.selectByIndex(3);
				}
				
				
				break;
			case "Link association for Optical Bearer":				
								jsClick(btn_Circuit_createform_opticalbearer_linklookup);Thread.sleep(1000);	
								waitForElement(btn_Circuit_createform_opticalbearer_linklookup_lookupicon);Thread.sleep(2000);	
								
								tbx_Circuit_createform_opticalbearer_linklookup_linkName.type(gdbcreatepage.Fiberlink());
								//tbx_Circuit_createform_opticalbearer_linklookup_devicename.type("LSVGNV01");
								jsClick(btn_Circuit_createform_opticalbearer_linklookup_lookupicon);Thread.sleep(2000);	
								waitForElement(lbl_Circuit_createform_opticalbearer_linklookup_resulthyperlink);Thread.sleep(1000);	
								jsClick(lbl_Circuit_createform_opticalbearer_linklookup_resulthyperlink);
											
								waitForElement(lbl_Circuit_createform_Portsection);
								
								break;
								
			case "Circuit gets created successfully message is displayed":

				
							Thread.sleep(4000);
							if(tab_Circuit_createform_followingtab.isCurrentlyVisible()){
								waitForElement(btn_circuitview_edit);Thread.sleep(2000);		
							}
							
							jsClick(tab_Circuit_createform);
							Message=lbl_message.getText().trim();						
							Message = Message.toString().substring(1);		
							Message = Message.trim(); 
							if(!Message.contains("Circuit created successfully")){
								throw new Error("Create Circuit is failed due to message:"+Message);
							}
							if(tab_Circuit_createform_followingtab.isCurrentlyVisible()){
								jsClick(tab_Circuit_createform_followingtab);
								waitForElement(btn_circuitview_edit);Thread.sleep(2000);		
							}
							
							break;
			case "Ethernet Bearer Create form should be displayed if not available":
															Thread.sleep(3000);		
													if(!(tab_currentlydisplayed.getText().replaceAll("\\s+$", "").equals("Create Ethernet Bearer Circuit"))){
														if(!(tab_currentlydisplayed.getText().replaceAll("\\s+$", "").equals("Create Transport Path"))){
															slf4jLogger.debug("Optical bearer crcuit create form is not displayed");
															throw new Error("Optical bearer crcuit create form is not displayed");
														}
													
													}
													
													break;
			case "Optical Bearer Create form should be displayed if not available":
							Thread.sleep(3000);		
						if(!(tab_currentlydisplayed.getText().replaceAll("\\s+$", "").equals("Create Optical Bearer Circuit"))){
							if(!(tab_currentlydisplayed.getText().replaceAll("\\s+$", "").equals("Create Transport Path"))){
								slf4jLogger.debug("Optical bearer crcuit create form is not displayed");
								throw new Error("Optical bearer crcuit create form is not displayed");
							}
						
						}
						
						break;
			case "create a circuit filling all the mandatory fields using SPLITTER and FDP devices":
																				waitForElement(btn_Circuit_createform_create);
																				tbx_name.type("1/2BTL/AUTOTEST01U/AUTOTEST01U");
																				verifyvalidation("Subscriber fill");
																				tbx_start_device_name.type("SPLITTER-");
																				
																				waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
																				jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
																				
																					Thread.sleep(1000);
																				waitForElement(btn_Circuit_createform_startdevice_fetchport);jsClick(btn_Circuit_createform_startdevice_fetchport);waitForElement(ddl_Circuit_createform_startdevice_startport);
																				ddl_Circuit_createform_startdevice_startport.selectByIndex(3);
																				
																				
																				tbx_end_device_name.type("FDP-");
																			
																			
																				waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
																				jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
																				
																					Thread.sleep(1000);
																					waitForElement(btn_Circuit_createform_enddevice_fetchport);jsClick(btn_Circuit_createform_enddevice_fetchport);waitForElement(ddl_Circuit_createformenddevice_endport);
																					ddl_Circuit_createformenddevice_endport.selectByIndex(3);
																					
																					ddl_Circuit_Service_Type.selectByVisibleText("Aggregate-Trunk");
																					tbx_Provisioned_Bandwidth.type("2000");
																					Thread.sleep(1000);
																			jsClick(btn_Circuit_createform_create);Thread.sleep(1000);
																			waitForElement(btn_circuitview_edit);
																			
																		break;
			case "create a circuit filling all the mandatory fields using FDP and SPLITTER devices":
														waitForElement(btn_Circuit_createform_create);
														tbx_name.type("1/2BTL/AUTOTEST01U/AUTOTEST01U");
														verifyvalidation("Subscriber fill");
														
														tbx_start_device_name.type("FDP-");
														waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
														jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
														
															Thread.sleep(1000);
														waitForElement(btn_Circuit_createform_startdevice_fetchport);jsClick(btn_Circuit_createform_startdevice_fetchport);waitForElement(ddl_Circuit_createform_startdevice_startport);
														ddl_Circuit_createform_startdevice_startport.selectByIndex(3);
														
														
														tbx_end_device_name.type("SPLITTER-");
													
													
														waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
														jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
														
															Thread.sleep(1000);
															waitForElement(btn_Circuit_createform_enddevice_fetchport);jsClick(btn_Circuit_createform_enddevice_fetchport);waitForElement(ddl_Circuit_createformenddevice_endport);
															ddl_Circuit_createformenddevice_endport.selectByIndex(3);
															
															ddl_Circuit_Service_Type.selectByVisibleText("Aggregate-Trunk");
															tbx_Provisioned_Bandwidth.type("2000");
															Thread.sleep(1000);
													jsClick(btn_Circuit_createform_create);Thread.sleep(1000);
													waitForElement(btn_circuitview_edit);
													
												break;
				
			case "Subscriber fill":try {
									if(btn_circuitcreate_suscriberlookup.isCurrentlyVisible()){
										jsClick(btn_circuitcreate_suscriberlookup); waitForElement(btn_circuitcreate_suscriberlookup_lckupicon);
									tbx_circuitcreate_suscriberlookup_subscribername.type("TEST - JANET");
									jsClick(btn_circuitcreate_suscriberlookup_lckupicon);
									waitForElement(lbl_circuitcreate_suscriberlookup_searchresult);
									jsClick(lbl_circuitcreate_suscriberlookup_searchresult);				
										Thread.sleep(2000);				
										}
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}break;
										
			case "Start-Device association":jsClick(btn_Circuit_createform_topologyvc_startdevicelookup);
														waitForElement(tbx_Circuit_createform_devicelookup_buildingclli);tbx_Circuit_createform_devicelookup_buildingclli.type("GLRDFLXA");
														jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);waitForElement(lbl_Circuit_createform_devicelookup_result);jsClick(lbl_Circuit_createform_devicelookup_result);
															
																Thread.sleep(1000);waitForElement(btn_Circuit_createform_startdevice_fetchport);jsClick(btn_Circuit_createform_startdevice_fetchport);waitForElement(ddl_Circuit_createform_startdevice_startport);
																ddl_Circuit_createform_startdevice_startport.selectByIndex(3);
															
														if(btn_Circuit_createform_enddevicelookup.isCurrentlyVisible()){
															jsClick(btn_Circuit_createform_enddevicelookup);waitForElement(tbx_Circuit_createform_devicelookup_buildingclli);tbx_Circuit_createform_devicelookup_buildingclli.type("GLRDFLXA");
															jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);waitForElement(lbl_Circuit_createform_devicelookup_result1);Thread.sleep(1000);
															jsClick(lbl_Circuit_createform_devicelookup_result1);Thread.sleep(1000);
															waitForElement(btn_Circuit_createform_enddevice_fetchport);jsClick(btn_Circuit_createform_enddevice_fetchport);waitForElement(ddl_Circuit_createformenddevice_endport);
															ddl_Circuit_createformenddevice_endport.selectByIndex(3);
														}
															
														break;
														
			case "Start-Device association-Pseudo Wire":jsClick(btn_Circuit_createform_topologyvc_startdevicelookup);
			waitForElement(tbx_Circuit_createform_devicelookup_deviceClli);tbx_Circuit_createform_devicelookup_deviceClli.type(deviceClli_start);
			jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);waitForElement(lbl_Circuit_createform_devicelookup_result);jsClick(lbl_Circuit_createform_devicelookup_result);
					Thread.sleep(1000);waitForElement(btn_Circuit_createform_startdevice_fetchport);jsClick(btn_Circuit_createform_startdevice_fetchport);
					waitForElement(ddl_Circuit_createform_startdevice_startport);
					Thread.sleep(5000);
					ddl_Circuit_createform_startdevice_startport.click();
					ddl_Circuit_createform_startdevice_startport.selectByIndex(1);
				
			if(btn_Circuit_createform_enddevicelookup.isCurrentlyVisible()){
				jsClick(btn_Circuit_createform_enddevicelookup);waitForElement(tbx_Circuit_createform_devicelookup_deviceClli);tbx_Circuit_createform_devicelookup_deviceClli.type(deviceClli_end);
				jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);waitForElement(lbl_Circuit_createform_devicelookup_result);Thread.sleep(1000);
				jsClick(lbl_Circuit_createform_devicelookup_result);Thread.sleep(1000);
				waitForElement(btn_Circuit_createform_enddevice_fetchport);jsClick(btn_Circuit_createform_enddevice_fetchport);waitForElement(ddl_Circuit_createformenddevice_endport);
				ddl_Circuit_createformenddevice_endport.selectByIndex(1);
				Thread.sleep(1000);
				 
			}
				
			break;
					
					
			case "Circuit association":  jsClick(btn_Circuit_createform_Lagmembersection_circuitlookup);waitForElement(tbx_Circuit_createform_Lagmembersection_circuitname);
													tbx_Circuit_createform_Lagmembersection_circuitname.type("01/GE1/%");jsClick(btn_Circuit_createform_Lagmembersection_circuitlookupicon);waitForElement(lbl_Circuit_createform_Lagmembersection_circuitlookup_result);
														jsClick(lbl_Circuit_createform_Lagmembersection_circuitlookup_result);
															Thread.sleep(1000);
														break;
	
					case "fetch start devices & select port in Etherent create form":if(!btn_Circuit_createform_create.isCurrentlyVisible()){
																						jsClick(tab_Circuit_createform_Ethernetbearer);
																									}
								String StartDevice=getDriver().findElement(By.xpath("(.//*[@id='mainTab']//a[@ng-click='removeAllTabs()']/../..//tab-heading)[3]")).getText().trim();
								String[] StartDeviceclli = StartDevice.split("-");
								jsClick(btn_Circuit_createform_startdevicelookup);
								waitForElement(btn_Circuit_createform_portselection_lookupicon);
								tbx_Circuit_createform_portselection_deviceclli.type(StartDeviceclli[0]);
								jsClick(btn_Circuit_createform_portselection_lookupicon);
								waitForElement(btn_Circuit_createform_portselection_previous);
								jsClick(btn_Circuit_createform_portselection_previous); Thread.sleep(2000);
								if(btn_Circuit_createform_portselection_dropdown.isCurrentlyVisible()){
									jsClick(btn_Circuit_createform_portselection_dropdown);
									 Thread.sleep(1000);
									 jsClick(btn_Circuit_createform_portselection_dropdown);
									 Thread.sleep(1000);
								}
								
								jsClick(getDriver().findElement(By.linkText(StartDevice)));
								Thread.sleep(2000);
								waitForElement(btn_Circuit_createform_portselection_startdevice_fetchport);
								jsClick(btn_Circuit_createform_portselection_startdevice_fetchport);
								waitForElement(ddl_Circuit_createform_portselection_startdevice_startport);
								ddl_Circuit_createform_portselection_startdevice_startport.selectByIndex(2);		
								break;
								
					case "fetch end devices & select port in Etherent create form": 
						String EndDevice=getDriver().findElement(By.xpath("(.//*[@id='mainTab']//a[@ng-click='removeAllTabs()']/../..//tab-heading)[4]")).getText().trim();	
						String[] EndDeviceclli = EndDevice.split("-");	
						jsClick(btn_Circuit_createform_enddevicelookup);
						
						waitForElement(btn_Circuit_createform_portselection_lookupicon);
						tbx_Circuit_createform_portselection_deviceclli.type(EndDeviceclli[0]);
						jsClick(btn_Circuit_createform_portselection_lookupicon);
						waitForElement(btn_Circuit_createform_portselection_previous);
						jsClick(btn_Circuit_createform_portselection_previous); Thread.sleep(2000);
						if(btn_Circuit_createform_portselection_dropdown.isCurrentlyVisible()){
							jsClick(btn_Circuit_createform_portselection_dropdown);
							 Thread.sleep(1000);
							 jsClick(btn_Circuit_createform_portselection_dropdown);
							 Thread.sleep(1000);
						}
						
						jsClick(getDriver().findElement(By.linkText(EndDevice)));
						Thread.sleep(2000);
						waitForElement(ddl_Circuit_createform_portselection_endevice_endport);
						ddl_Circuit_createform_portselection_endevice_endport.selectByIndex(2);		
						break;
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		
		public void createcircuitpage_Subscriber(String Subscriber){try 
		{
			Thread.sleep(5000);
			waitForElement(btn_circuitcreate_suscriberlookup);
		
			//if(btn_circuitcreate_suscriberlookup.isEnabled()){
				jsClick(btn_circuitcreate_suscriberlookup); 
				
				waitForElement(btn_circuitcreate_suscriberlookup_lckupicon);
				tbx_circuitcreate_suscriberlookup_subscribername.type(Subscriber);			
				jsClick(btn_circuitcreate_suscriberlookup_lckupicon);	
				
			waitForElement(lbl_circuitcreate_suscriberlookup_searchresult);
			
			for (int i = 1; i < 10; i++) {
				
				String xpath;				
				xpath = "(.//*[@class='tab-pane ng-scope active']//*[@ng-click='lookupData(subscriberLookupData);'])[" + i +"]";
				
				if (getDriver().findElement(By.xpath(xpath)).getText().trim().toUpperCase().equals(Subscriber.toUpperCase())) {
					
					jsClick(getDriver().findElement(By.xpath(xpath)));
					
					break;
				}			
				
				
			}
			
			
			
			
			//jsClick(lbl_circuitcreate_suscriberlookup_searchresult);				
			Thread.sleep(2000);			
	//} 		
		
		}
		catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		}
		
		public void createcircuitpage_AssociateDevice(String StartDevice,String EndDevice){try
		{
			//String devicename;
			
			// Associate Start Device in Circuit
			
			if(btn_Circuit_createform_topologyvc_startdevicelookup.isCurrentlyVisible()){	
				
				jsClick(btn_Circuit_createform_topologyvc_startdevicelookup);
				
				waitForElement(tbx_Circuit_createform_devicelookup_buildingclli);
				//tbx_Circuit_createform_devicelookup_buildingclli.type(StartDevice);
				tbx_Circuit_createform_devicelookup_deviceClli.type(StartDevice);
				jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);
				waitForElement(lbl_Circuit_createform_devicelookup_result);
				
				
				
				// jsClick(lbl_Circuit_createform_devicelookup_result);
				
				for (int i = 0; i < 10; i++) {
					
					String CXpath = ".//*[@ng-click='lookupGridSettings.selLukupValue("+i+")']";
				//String CXpath = ".//*[@ng-click='lookupGridSettings.selLukupValue(0)']";
					System.out.println(CXpath);
					System.out.println(getDriver().findElement(By.xpath(CXpath)).getText());
					
                     System.out.println("get text one"+ getDriver().findElement(By.xpath(CXpath)).getText().trim());
                     System.out.println("StartDevice"+StartDevice);
					if(getDriver().findElement(By.xpath(CXpath)).getText().trim().equalsIgnoreCase(StartDevice))
					{		
						
						jsClick(getDriver().findElement(By.xpath(CXpath)));
					
					break;
				}
				
				}
				
														
				Thread.sleep(1000);
				
				waitForElement(btn_Circuit_createform_startdevice_fetchport);
				
				jsClick(btn_Circuit_createform_startdevice_fetchport);
				
				waitForElement(ddl_Circuit_createform_startdevice_startport);
				
				ddl_Circuit_createform_startdevice_startport.selectByIndex(3);
				
			}
			// Associate End Device in Circuit
			
			if(btn_Circuit_createform_enddevicelookup.isCurrentlyVisible()){
			jsClick(btn_Circuit_createform_enddevicelookup);
			
			waitForElement(tbx_Circuit_createform_devicelookup_buildingclli);
			
			//tbx_Circuit_createform_devicelookup_buildingclli.type(EndDevice);
			tbx_Circuit_createform_devicelookup_deviceClli.type(StartDevice);
			
			jsClick(btn_Circuit_createform_devicelookup_searchlookupicon);
			
			waitForElement(lbl_Circuit_createform_devicelookup_result1);
			
			Thread.sleep(1000);
			
			//jsClick(lbl_Circuit_createform_devicelookup_result1);
			
			for (int i = 0; i < 10; i++) {
				
				String CXpath = ".//*[@ng-click='lookupGridSettings.selLukupValue("+i+")']";
				
				
				System.out.println(getDriver().findElement(By.xpath(CXpath)).getText());
				
				
				if(getDriver().findElement(By.xpath(CXpath)).getText().trim().equals(EndDevice))
				{							
					jsClick(getDriver().findElement(By.xpath(CXpath)));
				
				break;
			}
			
			}
			Thread.sleep(1000);
			waitForElement(btn_Circuit_createform_enddevice_fetchport);
			jsClick(btn_Circuit_createform_enddevice_fetchport);
			
			waitForElement(ddl_Circuit_createformenddevice_endport);
			ddl_Circuit_createformenddevice_endport.selectByIndex(3);
														
			}  
			
		}
			
		
		catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
													
			}
		
		
		public void createLAG_AssociateCircuit(int Number,String Circuit){try
		{
			
			String Xpath;		
				
				if (Number != 1) {
					
					jsClick(btn_Circuit_createform_Lagmembersection_Addrow);
					
				}		
						
				Xpath = "(.//*[contains(@ng-click,'setServiceModal')])["+Number+"]";						
						
				jsClick(getDriver().findElement(By.xpath(Xpath)));
				
				waitForElement(tbx_Circuit_createform_Lagmembersection_circuitname);
				tbx_Circuit_createform_Lagmembersection_circuitname.type(Circuit);
				
				jsClick(btn_Circuit_createform_Lagmembersection_circuitlookupicon);
				
				waitForElement(lbl_Circuit_createform_Lagmembersection_circuitlookup_result);
				jsClick(lbl_Circuit_createform_Lagmembersection_circuitlookup_result);
					Thread.sleep(1000);			
				
			
		}
			
		
		catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
													
			}
		
		
		
        //---------------------------------------Transport Path---------------------------------------//

public void select_circuit(){
               
                     
               waitForElement(ddl_Create_TransportPath_Circuit);
               
               ddl_Create_TransportPath_Circuit.selectByIndex(1);
               
        }
        
        public void select_action_Create_TransportPath(String action) throws InterruptedException{
               
               action = action.toUpperCase();
               
               switch (action) {
               case "SAVE":                      
                     button_Save_TransportPath_Circuit.click();
                     break;
                     
               case "SUBMIT":      
                     button_Submit_TransportPath_Circuit.click();
                     break;
                     
               case "DELETE":
                     tab_Transport_Path_Result_tab.click();
                     waitFor(button_Delete_Transport_Path_tab);
                     button_Delete_Transport_Path_tab.click();
                     getDriver().switchTo().alert().accept();
                     break;
                     
               case "EDIT":
                     tab_Transport_Path_Result_tab.click();
                     
                     waitFor(button_Expand_IncompleteTransport_Path_Result_tab);
                     button_Expand_IncompleteTransport_Path_Result_tab.click();
                     
                     waitFor(button_Edit_IncompleteTransport_Path_Result_tab);                       
                     button_Edit_IncompleteTransport_Path_Result_tab.click();
                     
                     waitFor(button_Submit_IncompleteTransport_Path_Result_tab);                            
                     button_Submit_IncompleteTransport_Path_Result_tab.click();
                     
                     break;


               }
               
               
        }
        
        
        
        public void Validate_Success_Message_TransportPath(String action) throws InterruptedException{
               
                     String Text = "";
                     
                     action=action.toUpperCase();
                     
                     switch (action) {
                     case "SUBMIT":                                 
                            tab_Create_Transport_Path_tab.click();
                            waitForElement(lbl_Msg_Transport_Path_Create_tab);                       
                            Text = lbl_Msg_Transport_Path_Create_tab.getText();

                            if (Text.trim().contains("Route is created Succesfully")){
                                   System.out.println("Correct Msg is getting displayed: "+Text.trim());
                                   
                            } else {
                                   //throw new Error("Route is not Created Successfully: following Message is getting displayed: "+Text.trim());
                            }
                            break;
                     
                     case "SAVE":
                            tab_Create_Transport_Path_tab.click();
                            waitForElement(lbl_Msg_Transport_Path_Create_tab);                       
                            Text = lbl_Msg_Transport_Path_Create_tab.getText();
                            
                            if (Text.trim().contains("Route is created successfully with Route Id as")){
                                   System.out.println("Correct Msg is getting displayed: "+Text.trim());
                                   
                            } else {
                                   throw new Error("Route is not Saved Successfully: "+Text);
                            }
                            break; 
                            
                     case "DELETE":
                            Thread.sleep(5000);
                            waitFor(lbl_Msg_Transport_Path_Result_tab);                               
                            Text = lbl_Msg_Transport_Path_Result_tab.getText();
                            
                            System.out.println("Text-----"+Text);
                            
                            if (Text.trim().contains("Route is deleted successfully")){
                                   System.out.println("Correct Msg is getting displayed: "+Text.trim());
                                   
                            } else {
                                   throw new Error("Route is not deleted Successfully");
                            }
                             tab_close_all.click();
                            break;
                            
                     case "EDIT":
                            
                            Text = lbl_Msg_Transport_Path_Result_tab.getText();
                            
                            if (Text.trim().contains("Route") && Text.trim().contains("is created successfully")){
                                   System.out.println("Correct Msg is getting displayed: "+Text.trim());
                                   
                            } else {
                                   throw new Error("Route is edited successfully");
                            }
                            break;
                     default:
                            throw new Error("Message displayed is not correct"+Text.trim());
                     
                     }
                     

               }
        
        
        public void Validate_TransportPath_details_in_Device_Relatedtab(String DeviceName)throws InterruptedException{
               
               
               waitFor(tab_Device_Transportpath_Relatedtab);
               
               tab_Device_Transportpath_Relatedtab.click();
               
               while (!lbl_Device_Transportpath_Relatedtab.isDisplayed()) {
                     lbl_Device_Transportpath_Refresh.click();
                     waitFor(lbl_Device_Transportpath_Relatedtab);
               }
               
               
               waitFor(lbl_Device_Transportpath_Relatedtab);
               
               //String test = lbl_Device_Transportpath_Relatedtab.getTextValue();
               
               //System.out.println(test);
               
               if (lbl_Device_Transportpath_Relatedtab.getTextValue().contains("Logical Routes for") && lbl_Device_Transportpath_Relatedtab.getTextValue().contains(DeviceName) ){
                     
                     lbl_Device_Transportpath_Relatedtab_Expand.click();
                     
                     if (lbl_Device_Transportpath_Details.isDisplayed()) {                                  

                            System.out.println(DeviceName+" Cotains Route Data:"+lbl_Device_Transportpath_Details.getTextValue().trim());
                            
                     } else {
                            throw new Error("No Routes is displayed for given Device");
                     }
                     
                     
               } else {
                     throw new Error("No Routes is displayed for given Device");
               }
               
               getDriver().findElement(By.xpath(".//tab-heading[@ng-click='onClickTab(tab)' and contains(text(),'"+DeviceName+"')]/a")).click();
               
               
                            
               
        }
                     
        
        //---------------------------------------Transport Path---------------------------------------//

		
		

		
		public void jsClick(WebElement element) {
			try {
				
				JavascriptExecutor executor = (JavascriptExecutor) getDriver();
				executor.executeScript("arguments[0].click();", element);
			} catch (Exception e) {
				System.out.println("unable to click by java script");
				element.click();

			}

		}
		
		
		
		public WebElement waitForElementclickable(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(getDriver(),500);	
		    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		    
			
		    return element;
		}



      
        
        
        
     
        
        
       

	 
}
