package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.By;




public class OVCreateServicePage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	
	
	@FindBy(id = "NAME")
	 public WebElementFacade tbx_name;
	
	@FindBy(id = "ALIAS1")
	 public WebElementFacade tbx_alias1;

	@FindBy(id = "ALIAS2")
	 public WebElementFacade tbx_alias2;
	
	@FindBy(id = "DESCRIPTION")
	 public WebElementFacade tbx_note;	
	
	@FindBy(id = "EVCOVCNC")
	 public WebElementFacade ddl_evcnccode;	
	
	@FindBy(id = "CEVLANIDPRESERVATION")
	 public WebElementFacade ddl_cevlanidpreservation;
	
	@FindBy(id ="CEVLANCOSPRESERVATION")
	 public WebElementFacade ddl_cevlancospreservation;
	
	@FindBy(id = "UNICASTFRAMEDELIVERY")
	 public WebElementFacade ddl_unicastframedelivery;
	
	@FindBy(id = "MULTICASTFRAMEDELIVERY")
	 public WebElementFacade ddl_multicastframedelivery;	
	
	@FindBy(id = "BROADCASTFRAMEDELIVERY")
	 public WebElementFacade ddl_broadcastframedelivery;	
	
	@FindBy(id ="STI")
	 public WebElementFacade ddl_servicetypeindicator;	
	
	@FindBy(id = "GROUPNUMBER")
	 public WebElementFacade tbx_groupnumber;
	
	
	@FindBy(id ="USAGE")
	 public WebElementFacade ddl_usagetype;	
	
	@FindBy(id ="COS_ID")
	 public WebElementFacade ddl_cosid;		
	
	@FindBy(id = "ASN")
	 public WebElementFacade tbx_asn;
	
	@FindBy(id = "REQUESTING_AFFILIATE")
	 public WebElementFacade ddl_requestingaffiliate;
	
	@FindBy(id = "SERVICE2FUNCTIONALSTATUS")
	 public WebElementFacade ddl_functionalstatus;	
	
	@FindBy(id = "MCO")
	 public WebElementFacade ddl_mco;	
	
	
	
	
	
	@FindBy(id = "SERVICE2PROVISIONSTATUS")
	 public WebElementFacade tbx_provisionstatus;
	
	@FindBy(id = "subscriberName")
	 public WebElementFacade tbx_subscribername;
	
	//@FindBy(xpath = "//*[@ng-click='openSubscriberLookUp(field.name)']/i")
	@FindBy(xpath = "//*[@ng-click='openSubscriberLookUp(field.name)']")
	 public WebElementFacade btn_subscriberlookupicon;
	

	
	
	@FindBy(xpath = "//select[@id='STI']/following-sibling::error-message/div[@id='sti']")
    public WebElementFacade lbl_error_message_STI_create;

@FindBy(xpath="(//span[@ng-switch-when='inputSelectOneMenu']/select[@id='STI'])[2]")
    public WebElementFacade ddl_STI_Service_edit_page;
@FindBy(xpath=".//div[@ng-controller='viewEditServiceDetailCtrl']/div[@ng-show='showAlert']")
    public WebElementFacade lbl_error_message_service_details_page;
@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[@id='STI']/following-sibling::error-message/div[2]")
    public WebElementFacade lbl_fill_mandatory_field_STI;
	
	

	
	@FindBy(id = "ISMEETPOINTEVC")
	 public WebElementFacade ddl_ismeetpointevc;
	
	@FindBy(id = "CONTROLLINGCOMPANY")
	 public WebElementFacade tbx_controllingcompany;
	
	
	
	
	@FindBy(xpath ="//*[@ng-click='createActivateClick(createActivate)']")
	 public WebElementFacade cbx_manualtask;
	
	
	
	
	
	// Subscriber section
		
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='invSubscriber.subscriberName']")
	 public WebElementFacade tbx_subcriber_name_window ;
	
	@FindBy(id = "shelfType")
	 public WebElementFacade ddl_subcriber_type ;
	
	
	@FindBy(xpath = "(//*[@value='LookUp'])[1]")
	 public WebElementFacade btn_lookup ;
	
	
	
	@FindBy(xpath = ".//table[starts-with(@id,'subscriber_lookup_')]//a/span")
	 public WebElementFacade lnk_subcribername ;
	
	
	
	// Create service button
	
	@FindBy(xpath ="//*[@ng-click ='createService();']")
	 public WebElementFacade btn_create ;
	
	
	// Related tab Task
	
	@FindBy(xpath = "//*[@id='right-content']/div/div[1]/ul/li[12]/a")
	 public WebElementFacade tab_Tasksrelatedtab;
	
	
	
	@FindBy(xpath  = ".//*[@id='row0taskGrid_1']/div[7]/div")
	//@FindBy(xpath  = "//div[contains(text(),'11/EVC1/012345//AUTO')]")
	 public WebElementFacade lbl_circuitid;
	
	
	//	Create form 
	
	@FindBy(xpath = "//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
	 public WebElementFacade tab_createserviceform;

	
	// Create form to pick success message
	
	@FindBy(xpath = "//*[@ng-show='showAlert' and @class='ng-binding alert alert-success']")
	 public WebElementFacade lbl_message;
	
	
	
	@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	 public WebElementFacade tab_service360view;
	
	

	
	
	// Data for HOST Service
	
	@FindBy(id = "FID_NAME")
	 public WebElementFacade tbx_FID_NAME;
	
	@FindBy(id = "HOST_ACCEPTANCE_STATUS")
	 public WebElementFacade ddl_HOST_ACCEPTANCE_STATUS;
	
	@FindBy(id = "CUSTOMER_ACCEPTANCE_STATUS")
	 public WebElementFacade ddl_CUSTOMER_ACCEPTANCE_STATUS;
	
	
	@FindBy(id = "ACCEPTS_PREMIUM_SERVICES")
	 public WebElementFacade ddl_ACCEPTS_PREMIUM_SERVICES;
	
	@FindBy(id = "ACCEPTS_CVOIP")
	 public WebElementFacade ddl_ACCEPTS_CVOIP;
	
	
	@FindBy(id = "HOSTIPVERSION")
	 public WebElementFacade cbx_HOSTIPVERSION;
	
	@FindBy(id = "NWPROTOCOLTYPE")
	 public WebElementFacade cbx_NWPROTOCOLTYPE;
	
	@FindBy(id = "SERVICECAPABILITY")
	 public WebElementFacade cbx_SERVICECAPABILITY;
	
	
	//End of Data for HOST Service
	
	
	// Related to MEF OVC Service Create Page
	
	@FindBy(id = "COLORFORWARDING")
	 public WebElementFacade ddl_colorforwarding ;
	
	
	@FindBy(id = "SVLANIDPRESERVATION")
	 public WebElementFacade ddl_svlanidpreservation ;
	
	
	@FindBy(id = "SVLANCOSPRESERVATION")
	 public WebElementFacade ddl_svlancospreservation ;
	
	
	@FindBy( id = "EVCOVCREFERENCE")
	 public WebElementFacade tbx_EvcOvcReference ;
	
		
	@FindBy(id = "VPNID")
	 public WebElementFacade ddl_VPNid ;
	
	
		
	// End of MEF OVC Create Page
	
	
	@FindBy(xpath = "//*[@ng-show='errorMessageForTasks']")
	 public WebElementFacade lbl_norelatedtaskmessage ;
	
	// DATA FOR HSI 
	
		@FindBy(id = "DTN")
		 public WebElementFacade tbx_DTN_data ;
		
		@FindBy(id = "CVOIP_TN")
		 public WebElementFacade tbx_CVOIP_TN ;
		
		@FindBy(id = "DOWNSTREAM_RATE")
		 public WebElementFacade tbx_Downstream_rate ;
		
		@FindBy(id = "PROVISIONED_DOWNSTREAM_RATE")
		 public WebElementFacade tbx_Provisioned_Downstream_rate ;
		
		@FindBy(id = "UPSTREAM_RATE")
		 public WebElementFacade tbx_Upstream_rate ;
		
		@FindBy(id = "PROVISIONED_UPSTREAM_RATE")
		 public WebElementFacade tbx_Provisioned_Upstream_rate ;
		
		
		
		// END OF HSI Data
		
		 
		
		// Data for MEF UNI
		
		@FindBy(xpath=".//*[@id='NCCODE']")
		 public WebElementFacade ddl_NCCode;
		
		@FindBy(xpath=".//*[@id='NCICODE']")
		 public WebElementFacade ddl_NCICode;
		
		@FindBy(xpath=".//*[@id='SECNCICODE']")
		 public WebElementFacade ddl_SECNCICode;
		
		@FindBy(xpath=".//*[@id='BW']")
		 public WebElementFacade tbx_BW;
		
		@FindBy(xpath=".//*[@id='SERVICEMUX']")
		 public WebElementFacade ddl_SERVICEMUX;
		
		@FindBy(xpath=".//*[@id='BUNDLING']")
		 public WebElementFacade ddl_BUNDLING;
		
		@FindBy(xpath=".//*[@id='ALLTO1BUNDLING']")
		 public WebElementFacade ddl_ALLTO1BUNDLING;
		
		@FindBy(xpath=".//*[@id='FRAMEFORMAT']")
		 public WebElementFacade tbx_FRAMEFORMAT;
		
		@FindBy(xpath=".//*[@id='FRAMESIZE']")
		 public WebElementFacade ddl_FRAMESIZE;	
				
		
		@FindBy(xpath=".//*[@id='RATE_LIMIT_TYPE']")
		 public WebElementFacade ddl_RateLimitType;
		
		@FindBy(xpath=".//*[@id='TSP']")
		 public WebElementFacade tbx_TSP_MEF_UNI;
		
		@FindBy(xpath=".//*[@id='IS_DIVERSE']")
		 public WebElementFacade ddl_IS_DIVERSE;
		
		
		//UNI Service Attribute Section - PM
	    
	    @FindBy(xpath=".//*[@id='ICO']")
	     public WebElementFacade ddl_ICO;
		
		@FindBy(xpath=".//*[@id='OTC']")
		 public WebElementFacade tbx_OTC;	
		
		
		@FindBy(xpath=".//*[@id='MONITORING_TYPE']")
		 public WebElementFacade ddl_MONITORINGTYPE;		
		
		@FindBy(xpath=".//*[@id='SPECCODE']")
		 public WebElementFacade ddl_Speccode;
		
		//UNI Service Attribute Section
		
		//Service Association Section(Device) & Port
		
			@FindBy(xpath=".//span[@ng-click='opendeviceLookUp(field.name)']")
			 public WebElementFacade btn_device_lookup;
			
			@FindBy(xpath=".//input[@ng-model='invServiceDevLookUp.buildingClli']")
			 public WebElementFacade tbx_Deviceloopup_buildingClli;
					
			@FindBy(xpath=".//input[@ng-model='invServiceDevLookUp.deviceClli']")
			 public WebElementFacade tbx_Deviceloopup_deviceClli;
			
			@FindBy(xpath=".//input[@ng-click='lookUpDeviceDetails()']")
			 public WebElementFacade btn_Service_Deviceloopup;
			
			@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(0)' and @href='#']")
			 public WebElementFacade lnk_servicedevicelookup;
			
			@FindBy(xpath=".//*[@ng-click='openPhysicalPortLookUp(field.name)']")
			 public WebElementFacade btn_serviceport;

			
			@FindBy(xpath=".//input[@ng-click='servicePhysicalPortlookUp()' and @value='LookUp']")
			 public WebElementFacade btn_serviceportlookup;

		// END OF MEF UNI Data
			
			@FindBy(xpath = "(//input[contains(@value,'+')])[1]")
            public WebElementFacade btn_expand_member;
			
			@FindBy(xpath = "(//button[@value='Add VLAN'])[1]")
            public WebElementFacade btn_add_Vlan;
			
			@FindBy(xpath = "(//input[@ng-model='assoNumList.fromVlan'])[1]")
            public WebElementFacade tbx_startRange;
			
			@FindBy(xpath = "(//input[@ng-model='assoNumList.toVlan'])[1]")
            public WebElementFacade tbx_endRange;
			  
			@FindBy(xpath = "(//button[@type='submit'][contains(.,'Save Number')])[1]")
            public WebElementFacade btn_save_number;
			
			
			@FindBy(xpath = "//*[@id='right-content']/div/div[1]/ul/li[11]/a")
            public WebElementFacade tab_Service_circuit_design_relatedtab;
            
            @FindBy(xpath =".//div[@class='tab-pane ng-scope active']//div/div//div//h5/../span")
            public WebElementFacade btn_Google_maps_service;
            
            @FindBy(xpath ="(.//div[@ng-controller='invServiceCircuitDesignCtrl']//div/label/following-sibling::div//span)[1]")
            public WebElementFacade ddl_select_member_service_related;
            
            @FindBy(xpath ="(.//div[@ng-controller='invServiceCircuitDesignCtrl']//div/label/following-sibling::div//ul)[1]")
            public WebElementFacade ddl_select_member_service;
            
            @FindBy(xpath =".//div[contains(.,'Device Name')]/input[@type='checkbox']")
            public WebElementFacade cbx_DeviceName_related_tab;
            
            @FindBy(xpath =".//div[contains(.,'Device Ports')]/input[@type='checkbox']")
            public WebElementFacade cbx_Deviceport_related_tab;
            
            @FindBy(xpath =".//div[contains(.,'Circuits')]/input[@type='checkbox']")
            public WebElementFacade cbx_cricuits_related_tab;

		
			
		// MEF ENNI screen attributes
			
			
							@FindBy(xpath = ".//*[@id='nameval']")
							 public WebElementFacade tbx_Service_Name;
							
							@FindBy(xpath = "//input[@ng-model='serviceDetail.ALIAS1']")
							 public WebElementFacade tbx_Allias1;

							@FindBy(xpath = "//input[@ng-model='serviceDetail.ALIAS2']")
							 public WebElementFacade tbx_Allias2;
							
							@FindBy(xpath = ".//*[@ng-model='serviceDetail.DESCRIPTION']")
							 public WebElementFacade tbx_Note;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.HPC']")
							 public WebElementFacade ddl_HPC_Reference_Code;

							@FindBy(xpath = ".//*[@id='hpcepiration']")
							 public WebElementFacade tbx_HPC_Expiration_Date;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.MONITORING_TYPE']")
							 public WebElementFacade ddl_Monitoring_Type;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.SPECCODE']")
							 public WebElementFacade ddl_SPEC_Code;

							@FindBy(xpath = ".//*[@id='nccodeval']")
							 public WebElementFacade ddl_NC;

							@FindBy(xpath = ".//*[@id='ncicodeval']")
							 public WebElementFacade ddl_NCI;

							@FindBy(xpath = ".//*[@id='secncicodeval']")
							 public WebElementFacade ddl_Sec_NCI;

							@FindBy(xpath = ".//*[@id='bandwidth']")
							 public WebElementFacade tbx_Bandwidth;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.RATE_LIMIT_TYPE']")
							 public WebElementFacade ddl_Rate_Limit_Type;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.FRAMESIZE']")
							 public WebElementFacade ddl_Frame_Size;

							@FindBy(xpath = ".//input[@ng-model='serviceDetail.FRAMEFORMAT']")
							 public WebElementFacade tbx_Frame_Format;

							@FindBy(xpath = ".//input[@ng-model='serviceDetail.SOURCE_SYSTEM']")
							 public WebElementFacade tbx_Source_System;

							@FindBy(xpath = ".//input[@ng-model='serviceDetail.TSP']")
							 public WebElementFacade tbx_Tsp;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.FUNCTIONALSTATUS']")
							 public WebElementFacade ddl_Functional_Status;

							@FindBy(xpath = ".//*[@id='reqaffli']")
							 public WebElementFacade ddl_Requesting_Affiliate;

							@FindBy(xpath = ".//*[@id='mcoval']")
							 public WebElementFacade ddl_MCO;

							@FindBy(xpath = ".//select[@ng-model='serviceDetail.addQOSDetailsSelected']")
							 public WebElementFacade ddl_QOS;
							
							@FindBy(xpath=".//input[@type='checkbox' and  @ng-model='serviceDetail.createActivationTask']")
							 public WebElementFacade img_Checkbox; 

			
			
			// Subscriber section MEF ENNI
			
			@FindBy(xpath = "//*[@ng-click='openSubscriberLookUp()']")
			 public WebElementFacade btn_subscriber_lookupicon;
			
			@FindBy(xpath = ".//*[@ng-model='invSubscriber.subscriberName']")
			 public WebElementFacade tbx_Subscriber_Name_popup;
			
			@FindBy(xpath = ".//*[@ng-click='lookUp()' and @value='LookUp']")
			 public WebElementFacade btn_popup_lookup_subscriber;
			
			@FindBy(xpath = ".//*[@ng-click='lookupData(subscriberLookupData);']")
			 public WebElementFacade lnk_Subscriber_name;
			
			@FindBy(xpath = ".//*[@ng-model='serviceDetail.SERVICE2SUBSCRIBER']")
			 public WebElementFacade tbx_Subscriber_Name;
			
			// End of Subscriber section MEF ENNI
			
			// Service device lookup
			
			@FindBy(xpath = ".//*[@id='0']/ng-include/div/div/div[9]/div[3]/div/div[46]/div[3]/div[1]/div[1]/span")
			 public WebElementFacade btn_Device_lookup;
			
			@FindBy(xpath = ".//*[@id='devicelookup']/div[4]/div[3]/input")
			 public WebElementFacade tbx_building_clli;
			
			@FindBy(xpath = ".//*[@id='devicelookup']/div[4]/div[4]/input")
			 public WebElementFacade tbx_device_clli;
			
			@FindBy(xpath = ".//*[@id='devicelookup']/div[5]/div[2]/input[1]")
			 public WebElementFacade btn_lookup_device;
			
			// end of service device lookup
			
			// service port lookup
			
			@FindBy(xpath = ".//*[@ng-click='openPortLookUp(true)']")
			 public WebElementFacade btn_lookup_physicalport;
			
			// End of service port lookup
			
			@FindBy(xpath = ".//*[@ng-click='createENNIService();']")
			 public WebElementFacade btn_create_service;
			
			//***************	Service view page ********************//
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@value='Edit']")
			public WebElementFacade btn_Servicepage_Edit; 
		// End of MEF ENNI attributes
			
			
		// MSC UNI Data 
			
			@FindBy(xpath=".//*[contains(label,'Probe Uni Service Association')]//*[@ng-switch-when='serviceBuildingClliLookup']//span")
			 public WebElementFacade btn_MSCUNI_BRIX;

			@FindBy(xpath=".//*[@id='CIRCUIT_NAME_PROB_UNI']")
			 public WebElementFacade tbx_BRIX_ProbeUNI;
			
			@FindBy(xpath = ".//*[@ng-click='nmiGridSettings.nmiSelect(0)' and @name='nmiRadio_0']")
			 public WebElementFacade rdb_select_NMI;
			
		// End of MSC UNI	
			
		
			// Probe UNI
			
			@FindBy(xpath=".//*[@ng-click='openServiceRelatedMSCUniServiceLookUp(field.name)']/img")
			 public WebElementFacade img_ProbeUNI_MSCUNI_Association;
			
			@FindBy(xpath=".//*[@id='serviceAssociation']//*[@ng-model='uniServiceLookUp.serviceName']")
			 public WebElementFacade tbx_ProbeUNI_MSCUNI_Name;
			
			@FindBy(xpath=".//*[@id='serviceAssociation']//*[@value='LookUp']")
			 public WebElementFacade btn_ProbeUNI_MSCUNI_Lookup;
			
			@FindBy(xpath="//*[@ng-show='showTableUniServiceLookUp']//*[@id='row0UniServiceLookupId']/div[1]/div[1]/div[1]/Div[1]")
			 public WebElementFacade img_MSCUNI_Lookuplist_Checkbox;
			
			@FindBy(xpath=".//*[@ng-click='associateMscUniServices()']")
			 public WebElementFacade btn_ProbeUNI_MSCUNI;
			
			//End of Probe UNI data
			
			
			//############################################# ####################################### ####################################### //
			//#############################################   Service Create Sanity Validations ######################################//
				//############################################# ####################################### ####################################### //	
				@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
				 public WebElementFacade tab_currentlydisplayed ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span/label[@class='control-label ng-binding']")			
				public List<WebElementFacade> lbl_allXapath;
				
				//--------------------------------------  Service Create General section Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Create']")
				 public WebElementFacade btn_service_create ;
				  
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Reset']")
				 public WebElementFacade btn_service_createpage_reset ;
				  
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General Section']")
				 public WebElementFacade lbl_Service_createform_Gerneralsection ;
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='General Section']")
				 public WebElementFacade lbl_Service_MEFENNIcreateform_Gerneralsection ;
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create Subscriber Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Subscriber Section']")
				 public WebElementFacade lbl_service_createform_Subscribersection;  
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Subscriber Section']")
				 public WebElementFacade lbl_service_MEFENNIcreateform_Subscribersection;  
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Subscriber Section']/..//span[@ng-click='openSubscriberLookUp(field.name)']")
				 public WebElementFacade btn_servcie_createform_subscriberlookup;
			
	
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Subscriber Section']/following-sibling::div//span[@ng-click='openSubscriberLookUp()']")
				 public WebElementFacade btn_servcie_MEFENNIcreateform_subscriberlookup;
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				
				//--------------------------------------  Service Create DSL OVC Service Attributes Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='DSL OVC Service Attributes']")
				 public WebElementFacade lbl_service_createform_Dslovc_service; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='autoActivate']")
				 public WebElementFacade chk_service_createform_Dslovc_autoactivate;  
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='autoActivate']/parent::label")
				 public WebElementFacade lbl_service_createform_Dslovc_autoactivate; 
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='clientDSLOVC']")
				 public WebElementFacade chk_service_createform_Dslovc_clientdslovc; 
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='clientDSLOVC']/parent::label")
				 public WebElementFacade lbl_service_createform_Dslovc_clientdslovc; 
				 
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create DSLAM Path Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='DSLAM Path']")
				 public WebElementFacade lbl_service_createform_Dslampath_service; 
				
				
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create BRAS Path Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='BRAS Path']")
				 public WebElementFacade lbl_service_createform_Braspath_service; 
				
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				//--------------------------------------  Service Create Host Service Attributes Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Host Service Attributes']")
				 public WebElementFacade lbl_service_createform_hostserviceattr_service; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				//--------------------------------------  Service Create ENNI Link Service Attributes Section Sanity Validations ------------------------------------------//				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='ENNI Link Service Attributes Section']")
				 public WebElementFacade lbl_service_createform_ennilinkservice; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create Service Association Section Sanity Validations ------------------------------------------//				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Service Association Section']")
				 public WebElementFacade lbl_service_createform_serviceassociation;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(text(),'Service Association')]")
				 public WebElementFacade lbl_service_MEFENNIcreateform_serviceassociation;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='opendeviceLookUp(field.name)']")
				 public WebElementFacade btn_service_createform_serviceassociation_devicelookup;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Device Name']/following-sibling::div//span[@ng-click=\"setModal('device')\"]")
				 public WebElementFacade btn_service_MEFENNIcreateform_serviceassociation_devicelookup;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='openENNIServiceLookUp(field.name)']/i")
				 public WebElementFacade btn_service_createform_serviceassociation_servicelookup;
				
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create Create Activation Task Sanity Validations ------------------------------------------//				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-click='createActivateClick(createActivate)']")
				 public WebElementFacade chk_service_createform_activate; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='serviceDetail.createActivationTask']")
				 public WebElementFacade chk_service_MEFENNIcreateform_activate; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-click='createActivateClick(createActivate)']/parent::label")
				 public WebElementFacade lbl_service_createform_activate; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create HSI Service Attributes Section Sanity Validations ------------------------------------------//				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='HSI Service Attributes Section']")
				 public WebElementFacade lbl_service_createform_hsiserviceattri; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create HSI Service Attributes Section Sanity Validations ------------------------------------------//				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']")
				 public WebElementFacade lbl_service_createform_portsection; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']/following-sibling::div//i")
				 public WebElementFacade btn_service_createform_portsection_startdevicelookup;
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']/parent::div/following-sibling::div//span[@ng-click='opendeviceLookUp(field.name)']/i")
				 public WebElementFacade btn_service_createform_portsection_enddevicelookup; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create IPTV Service Attributes Section  Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='IPTV Service Attributes Section']")
				 public WebElementFacade lbl_service_createform_IPTVserviceattri; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create HPC Details Section  Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='HPC Details']")
				 public WebElementFacade lbl_service_createform_hpcDetails; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='HPC Details']")
				 public WebElementFacade lbl_service_MEFENNIcreateform_hpcDetails; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create ENNI Service Attributes Section Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='ENNI Service Attributes Section']")
				 public WebElementFacade lbl_service_createform_enniserviceattribute;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(text(),'ENNI Service Attributes')]")
				 public WebElementFacade lbl_service_MEFENNIcreateform_enniserviceattribute;
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create QOS Attributes Section  Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='QOS Attributes']")
				 public WebElementFacade lbl_service_createform_qosattribute; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='QOS Attributes']")
				 public WebElementFacade lbl_service_MEFENNIcreateform_qosattribute; 
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create EVC Service Attributes Section Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='EVC Service Attributes Section']")
				 public WebElementFacade lbl_service_createform_EVCserviceattr; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create OVC Service Attribute Section Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='OVC Service Attribute Section']")
				 public WebElementFacade lbl_service_createform_OVCserviceattr; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create UNI Service Attribute Section Service Attribute Section Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='UNI Service Attribute Section']")
				 public WebElementFacade lbl_service_createform_UNIServiceattr; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create PROBE UNI Service Attribute Section Service Attribute Section Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='PROBE UNI Service Attribute Section']")
				 public WebElementFacade lbl_service_createform_Probeunisection; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Service Create MSC UNI Service Association Section Service Attribute Section Sanity Validations ------------------------------------------//	

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='MSC UNI Service Association']")
				 public WebElementFacade lbl_service_createform_MSCUniassociation; 
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='openServiceRelatedMSCUniServiceLookUp(field.name)']")
				 public WebElementFacade btn_service_createform_MSCUniassociation_servicelookup; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='MCO']")
                public WebElementFacade ddl_serviceMEFEVC_createform_MCO; 
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='REQUESTING_AFFILIATE']")
                public WebElementFacade ddl_serviceMEFEVC_createform_RequestingAffiliate; 
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='EVCOVCNC']")
                public WebElementFacade ddl_serviceMEFEVC_createform_EVCNCCode; 
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='NCCODE']")
                public WebElementFacade ddl_serviceMEFUNI_createform_NC_Code;
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='NCICODE']")
                public WebElementFacade ddl_serviceMEFUNI_createform_NCI_Code;
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active'].//*[@id='SECNCICODE']")
                public WebElementFacade ddl_serviceMEFUNI_createform_Sec_NCI_Code ;
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='RATE_LIMIT_TYPE']")
                public WebElementFacade ddl_serviceMEFUNI_createform_Rate_Limit_Type;
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='REQUESTING_AFFILIATE']")
                public WebElementFacade ddl_serviceMEFUNI_createform_RequestingAffiliate;
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='MCO']")
                public WebElementFacade ddl_serviceMEFUNI_createform_MCO; 
                
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select [@id='DOWNSTREAM_BW_UNIT']")
				 public WebElementFacade ddl_GPONservice_createform_DOWNSTREAM_BW_UNIT; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='UPSTREAM_BW_UNIT']")
				 public WebElementFacade ddl_GPONservice_createform_UPSTREAM_BW_UNIT; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.SPECCODE']")
				 public WebElementFacade ddl_ENNIservice_createform_SPEC_Code;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.MONITORING_TYPE']")
				 public WebElementFacade ddl_ENNIservice_createform_Monitoring_Type;
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='nccodeval']")
				 public WebElementFacade ddl_ENNIservice_createform_NC_Code ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='ncicodeval']")
				 public WebElementFacade ddl_ENNIservice_createform_NCI_Code ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='secncicodeval']")
				 public WebElementFacade ddl_ENNIservice_createform_Sec_NCI_Code ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.RATE_LIMIT_TYPE']")
				 public WebElementFacade ddl_ENNIservice_createform_RateLimitType ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.FRAMESIZE']")
				 public WebElementFacade ddl_ENNIservice_createform_FrameSize ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.FRAMESIZE']")
				 public WebElementFacade ddl_ENNIservice_createform_Functional_Status ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.FRAMESIZE']")
				 public WebElementFacade ddl_ENNIservice_createform_Requesting_Affiliate ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='serviceDetail.FRAMESIZE']")
				 public WebElementFacade ddl_ENNIservice_createform_AddQOSDetails; 
				
                @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select [@id='PROTOCOL_TYPE']")
				 public WebElementFacade ddl_service_createform_Dslovc_NetworkProtocol; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='IPVERSION']")
				 public WebElementFacade ddl_service_createform_Dslovc_SupportedIPVersion; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='USAGE']")
				 public WebElementFacade ddl_service_createform_Dslovc_UsageType; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='AFFILIATE_OWNER']")
				 public WebElementFacade ddl_service_createform_Dslovc_AffiliateOwner; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='SERVICENAME']")
				 public WebElementFacade ddl_service_createform_Dslovc_ServiceName;

                
				@FindBy(id="AFFILIATE_OWNER")
				 public WebElementFacade ddl_dslovc_create_affiliate_owner;
				
				@FindBy(id="HD_STREAMS")
				public WebElementFacade tbx_hdStreams;
				
				
			
	
	public OVCreateServicePage() {
		// TODO Auto-generated constructor stub
		initialize();
	}
  // LoginPage loginpage;
	@Override
	 public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return tbx_subscribername;
	}
	//subscriber section
	/*@FindBy(xpath="(//label[contains(text(),'Subscriber Name')])[1]")			// Check whether its useful
	 public WebElementFacade tbx_subscribername;//2
*/	//Hpc details section
	@FindBy(xpath="//label[text()='HPC Reference Code']")
	 public WebElementFacade tbx_HPCReferenceCode;
	
	@FindBy(xpath="//label[contains(text(),'HPC Expiration Date')]")
	private WebElementFacade tbx_HPCExpirationDate;
	//ENNI Service Attributes SectionSPEC
	@FindBy(xpath="//label[text()='SPEC Code']")
	 public WebElementFacade ddl_SPECCode;
	
	@FindBy(xpath="//label[text()='SPEC Code']/..//select")
	 public WebElementFacade ddl_speccoded;
	
	
	
	
	
	
	@FindBy(xpath="(//label[text()='Monitoring Type'])[1]")
	 public WebElementFacade tbx_MonitoringType;
		
	
	@FindBy(xpath="//label[text()='No of EVC/OVCs allowed']")
	 public WebElementFacade tbx_NoofEVCOVCsallowed;
		
	
	@FindBy(xpath="//label[text()='LAG Indicator']")
	 public WebElementFacade tbx_LAGIndicator;
		
	
	@FindBy(xpath="//label[text()='NC Code']")
	 public WebElementFacade tbx_NCCode;
		
	@FindBy(xpath="//label[text()='NCI Code']")
	 public WebElementFacade tbx_NCICode;
	
	@FindBy(xpath="//label[text()='Sec NCI Code']")
	 public WebElementFacade tbx_SecNCICode;
	
	/*@FindBy(xpath="(//label[text()='Bandwidth'])[3]")
	 public WebElementFacade tbx_Bandwidth;*/							//************************ Check if its needed  **********************//
	
	@FindBy(xpath="//label[text()='Rate Limit Type']")
	 public WebElementFacade tbx_RateLimitType;
	
	@FindBy(xpath="//label[text()='Frame Size']")
	 public WebElementFacade tbx_FrameSize;
	
	@FindBy(xpath="//label[text()='Frame Format']")
	 public WebElementFacade tbx_Frameformat;
	
	@FindBy(xpath="//label[text()='Source System']")
	 public WebElementFacade tbx_SourceSystem;
	
	@FindBy(xpath="//label[text()='TSP']")
	 public WebElementFacade tbx_TSP;
	
	
	@FindBy(xpath="//label[text()='Functional Status']")
	 public WebElementFacade tbx_FunctionalStatus;
	
	@FindBy(xpath="//label[text()='Requesting Affiliate']")
	 public WebElementFacade tbx_RequestingAffiliate;
	
	@FindBy(xpath="//label[text()='Protection Protocol']")
	 public WebElementFacade tbx_ProtectionProtocol;
	
	@FindBy(xpath="//label[text()='MCO']")
	 public WebElementFacade tbx_MCO;
	
	//QOS AttributesAdd
	
	@FindBy(xpath="//label[text()='Add QOS Details']")
	 public WebElementFacade tbx_AddQOSDetails;
	//Service Association Section
//	@FindBy(xpath="(//label[text()='Device Name'])[1]")
	@FindBy(xpath="(//div[@class='col-sm-6 col-xs-12 col-md-4 col-lg-3'])[27]/label")
	 public WebElementFacade tbx_DeviceNameservuceassociation;
	
	@FindBy(xpath="(//input[@class='ng-pristine ng-untouched ng-valid'])[7]")
	 public WebElementFacade cbx_createactivation;
	//probe uni service section
	
	@FindBy(xpath="(//label[text()='Device Name'])[2]")
	 public WebElementFacade tbx_DeviceNameUniservice;
	
	
	@FindBy(xpath="//label[text()='Circuit Name']")
	 public WebElementFacade tbx_CircuitName;
	
	//mef Enni Lag service section
	@FindBy(xpath="//label[text()='MEF ENNI LAG Service']")
	 public WebElementFacade tbx_MEFENNILAGService;
	
	
	@FindBy(xpath="(.//*[@ng-click='removeTab(tab.id,$index)'])[1]")
	public WebElementFacade img_previoustab;
	
	@FindBy(xpath=".//*[label='HPC Reference Code']/../..//div[1]/label")
	 public WebElementFacade tbx_DetailsHPCReferenceCode;
	
	@FindBy(xpath=".//*[label='HPC Expiration Date']/../..//div[1]/label")
	private WebElementFacade tbx_DetailsHPCExpirationDate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_edit_service_viewpage;
	
	public void HPC_Details(String HPC_Code,String HPC_date){
		
		
		jsClick(img_previoustab);
		
			ddl_HPC_Reference_Code.selectByValue(HPC_Code);
		
		if (HPC_Code.toUpperCase().equals("YES")&&tbx_HPC_Expiration_Date.isCurrentlyEnabled()) {
			
			tbx_HPC_Expiration_Date.sendKeys(HPC_date);
			
		}else throw new Error("HPC Expiration Date is not enabled");	
		
	}
	
	public void Validate_HPC_Details_in_ServiceDetails(String HPC_Code,String HPC_date){
		
	    waitFor(btn_edit_service_viewpage);
		
		
		System.out.println(tbx_DetailsHPCReferenceCode.getText());
		
		System.out.println(tbx_DetailsHPCExpirationDate.getText());
		

		
		if (HPC_Code.toUpperCase().equals(tbx_DetailsHPCReferenceCode.getText().trim().toUpperCase())
				&& HPC_date.equals(tbx_DetailsHPCExpirationDate.getText().trim().toUpperCase())) {
			System.out.println("PASS");
			
		}else throw new Error("HPC Expiration Date is not enabled");	
		
	}
	
	public void verifyfield() throws InterruptedException
	{
		  Select select=new Select(ddl_speccoded);
	        List<WebElement> option = select.getOptions();
	        
      for(int i=1;i<option.size()-1;i++){       {
        	String s1=option.get(i).getText();
        	
            	select.selectByIndex(i);
            	
            	
            	if(s1.equals("-Select-")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MSCSP")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_DeviceNameUniservice.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_CircuitName.getText().trim(), "Circuit Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MSCSMUX")){ 	
            		commonAttributeforverification();
            		Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
            		Assert.assertEquals(tbx_DeviceNameUniservice.getText().trim(), "Device Name");
            		Assert.assertEquals(tbx_CircuitName.getText().trim(), "Circuit Name");
            		Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MSCENNI")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_DeviceNameUniservice.getText().trim(), "Device Name");
                	Assert.assertEquals(tbx_CircuitName.getText().trim(), "Circuit Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("ERPSC")){
            		commonAttributeforverification();
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MCLAGAS")){
            		commonAttributeforverification();
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENNH")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENNS")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENN")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());
            	} else if(s1.equals("MOENNML")){
            		commonAttributeforverification();
                	Assert.assertEquals(tbx_DeviceNameservuceassociation.getText().trim(), "Device Name");
                	Assert.assertTrue(cbx_createactivation.isPresent());        			
            	} else if(s1.equals("BGPLU")){
            		commonAttributeforverification();            					
            	}
        
         option = select.getOptions();
       
        
      }
      }
	}
	 public void commonAttributeforverification() throws InterruptedException {
		
		
			 Assert.assertEquals(tbx_subscribername.getText().trim(), "Subscriber Name");
			 Assert.assertEquals(tbx_HPCReferenceCode.getText().trim(), "HPC Reference Code");
			Assert.assertEquals(tbx_HPCExpirationDate.getText().trim(), "HPC Expiration Date");
		
			 Assert.assertEquals(ddl_SPECCode.getText().trim(), "SPEC Code");
			 Assert.assertEquals(tbx_MonitoringType.getText().trim(), "Monitoring Type");

			  Assert.assertEquals(tbx_NoofEVCOVCsallowed.getText().trim(), "No of EVC/OVCs allowed");
			 Assert.assertEquals(tbx_LAGIndicator.getText().trim(), "LAG Indicator");
			 Assert.assertEquals(tbx_NCCode.getText().trim(), "NC Code");
			 Assert.assertEquals(tbx_NCICode.getText().trim(), "NCI Code");
			 Assert.assertEquals(tbx_SecNCICode.getText().trim(), "Sec NCI Code");
			 Assert.assertEquals(tbx_Bandwidth.getText().trim(), "Bandwidth");
			 Assert.assertEquals(tbx_RateLimitType.getText().trim(), "Rate Limit Type");
			 Assert.assertEquals(tbx_FrameSize.getText().trim(), "Frame Size");
			Assert.assertEquals(tbx_Frameformat.getText().trim(), "Frame Format");
			 Assert.assertEquals(tbx_SourceSystem.getText().trim(), "Source System");
			 Assert.assertEquals(tbx_TSP.getText().trim(), "TSP");
			 Assert.assertEquals(tbx_FunctionalStatus.getText().trim(), "Functional Status");
			 Assert.assertEquals(tbx_RequestingAffiliate.getText().trim(), "Requesting Affiliate");
			 Assert.assertEquals(tbx_ProtectionProtocol.getText().trim(), "Protection Protocol");
			 Assert.assertEquals(tbx_MCO.getText().trim(), "MCO");
		 Assert.assertEquals(tbx_AddQOSDetails.getText().trim(), "Add QOS Details");
     	
     }
     
	

		// perform device lookup and select a value
			
			
			public void perform_device_lookup(String Dname){
				
				jsClick(btn_device_lookup);
				waitFor(btn_Service_Deviceloopup);
				
				tbx_Deviceloopup_buildingClli.sendKeys(Dname);
				tbx_Deviceloopup_deviceClli.sendKeys(Dname);
				jsClick(btn_Service_Deviceloopup);
				 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 jsClick(lnk_servicedevicelookup);
			}
		
			// select the ports to connect a service to a device
			
			public void select_port_from_port_lookup (){
				
				String portlookupstart=".//*[@id='row";
				
				String portlookupend="jqxGrid0']/div[4]/div";
				
				for (int i=0; i<20; i++){	
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//Port
					
					String deviceport = ".//*[@ng-click='gridSettings.selLukupValue(" + i + ")' and @href='#']";
					
					//Port Status
					String portlookup=portlookupstart+i+portlookupend;
					
					System.out.println(deviceport) ;
					System.out.println(i) ;
					System.out.println(portlookup) ;

					if(getDriver().findElement(By.xpath(portlookup)).getText().equals("Planned"))
					{							
						jsClick(getDriver().findElement(By.xpath(deviceport)));
						break;	
					}		
					
				}
			}
			
			
	// select the NMI circuit through service needs to flow
			
			public void select_NMI_circuit (){
				
				for (int i=0; i<10; i++){	

				String NMI = ".//*[@ng-controller='createNmiCircuitAssociationCtrl']//*[contains(@id,'row" + i + "jqxGrid')]/div[3]";
				
				String NMI_radiobutton = ".//*[@ng-controller='createNmiCircuitAssociationCtrl']//*[@ng-click='nmiGridSettings.nmiSelect("+ i + ")']";
				
				if(getDriver().findElement(By.xpath(NMI)).getText().contains("Unrouted Ethernet Bearer"))	
					{
					jsClick(getDriver().findElement(By.xpath(NMI_radiobutton)));
			              break;
					}		
				
				}
				
			}
			
			
			
	// select ports for ENNI service create
			
			public void select_port_for_ENNI() throws Throwable{
				for (int i=1; i<20; i++){

					Thread.sleep(1000);
					//Port
					String deviceport = ".//*[@id='servicePhysicalPortLookUp']//*[@id='servicePort_look_up']/tbody/tr[" + i + "]/td[2]/*[@href='#']";
					// Port Status
					String portlookup=".//*[@id='servicePhysicalPortLookUp']//*[@id='servicePort_look_up']/tbody/tr[" + i + "]/td[4]";
					if(getDriver().findElement(By.xpath(portlookup)).getText().equals("Planned")){
						
						jsClick(getDriver().findElement(By.xpath(deviceport)));
						break;
						}	
				}
			}
			
			
			
			
	//  Fill Subscriber details for MEF ENNI 		
			
			
			public void fill_subscriber_mef_enni(){
				
				jsClick(btn_subscriber_lookupicon);
				tbx_Subscriber_Name_popup.sendKeys("TEST - JANET");
				jsClick(btn_popup_lookup_subscriber);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				jsClick(lnk_Subscriber_name);
				
				String subscriber_name = tbx_Subscriber_Name.getTextValue();
				System.out.println("successfully selected the Subscriber = "+ subscriber_name);	
			}
			
			
			
		// perform device lookup and select a value for MEF ENNI
			
			
					public void perform_device_lookup_enni(String Dname){
						
						jsClick(btn_Device_lookup);
						
						tbx_building_clli.sendKeys(Dname);
						tbx_device_clli.sendKeys(Dname);
						jsClick(btn_lookup_device);
						 try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						 jsClick(lnk_servicedevicelookup);
					}		
			
					
					
		// Add BRIX Device using lookup
					
					public void perform_BRIX_device_lookup(String Dname){
						
						jsClick(btn_MSCUNI_BRIX);
						waitFor(btn_Service_Deviceloopup);
						
						tbx_Deviceloopup_buildingClli.sendKeys(Dname);
						tbx_Deviceloopup_deviceClli.sendKeys(Dname);
						
						jsClick(btn_Service_Deviceloopup);
						waitFor(lnk_servicedevicelookup);
						 try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						 jsClick(lnk_servicedevicelookup);
							 			
						
					}
					
		// Probe UNI service Association section
					
					public void perform_MSC_UNI_service_association(String ServiceName){
						
						jsClick(img_ProbeUNI_MSCUNI_Association);
						waitFor(btn_ProbeUNI_MSCUNI_Lookup);
						tbx_ProbeUNI_MSCUNI_Name.sendKeys(ServiceName);
						jsClick(btn_ProbeUNI_MSCUNI_Lookup);
						waitFor(btn_ProbeUNI_MSCUNI);
						jsClick(img_MSCUNI_Lookuplist_Checkbox);
						jsClick(btn_ProbeUNI_MSCUNI);
						
					}
			
					
					
		// select ports for ENNI service create
					
			public void select_port_for_PROBE() throws Throwable{
						
				for (int i=0; i<20; i++){

				Thread.sleep(1000);
							
							//Port
				String deviceport = ".//*[@ng-controller='createPhysicalPortLookUp']//*[@ng-show='showTableServicePortLookUp']//*[@id='row" + i + "jqxGrid0']//*[@href='#']";
							// Port Status
				String portlookup=".//*[@ng-controller='createPhysicalPortLookUp']//*[@ng-show='showTableServicePortLookUp']//*[@id='row" + i + "jqxGrid0']/Div[4]/Div";

				if(getDriver().findElement(By.xpath(portlookup)).getText().equals("Planned")){
								
					jsClick(getDriver().findElement(By.xpath(deviceport)));
					break;
								
					}		
							
				}
			}
	
		public void	Service_create_Sanity_Validation() throws Throwable{
			waitForElement(btn_service_create);Thread.sleep(8000);
			
				slf4jLogger.info("Create Service Validations");
				waitForElementclickable(tab_currentlydisplayed);
				
			if(!tab_currentlydisplayed.isCurrentlyVisible()){
				throw new Error("Create form is not displayed");
			}
			
			if(!btn_service_create.isCurrentlyVisible() && !btn_service_create.isCurrentlyEnabled()){
				throw new Error("Create button is not Visible & enable:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
			
			if(!btn_service_createpage_reset.isCurrentlyVisible() && !btn_service_createpage_reset.isCurrentlyEnabled()){
				throw new Error("Reset button is not Visible & enable:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
			
			if(!lbl_Service_createform_Gerneralsection.isCurrentlyVisible()){
				if(!lbl_Service_MEFENNIcreateform_Gerneralsection.isCurrentlyVisible()){			
				throw new Error("General Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
			}
			List<WebElementFacade> service_create_attribute = lbl_allXapath;
			
			ArrayList<String> servicecreate_Fieldattributelist=new ArrayList<String>();
				for(int j=0;j<service_create_attribute.size();j++){
					
					servicecreate_Fieldattributelist.add(j, service_create_attribute.get(j).getText().trim());
						//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
					}
			ArrayList<String> List2compare_service_Fieldattributelist=new ArrayList<String>();
			
			slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
			
			switch(tab_currentlydisplayed.getText().replaceAll("\\s+$", "")){
			
			case "Create DSL OVC Service": 			List2compare_service_Fieldattributelist.add(0, "Provisioning Status");
													List2compare_service_Fieldattributelist.add(1, "Name *");
													List2compare_service_Fieldattributelist.add(2, "Alias 1");
													List2compare_service_Fieldattributelist.add(3, "Alias 2");													
													List2compare_service_Fieldattributelist.add(4, "Note");
													List2compare_service_Fieldattributelist.add(5, "Subscriber Name *");
													List2compare_service_Fieldattributelist.add(6, "Network Protocol *");
													List2compare_service_Fieldattributelist.add(7, "Supported IP Version *");
													List2compare_service_Fieldattributelist.add(8, "Usage Type *");
													List2compare_service_Fieldattributelist.add(9, "Affiliate Owner");
													List2compare_service_Fieldattributelist.add(10, "Path Name *");
													List2compare_service_Fieldattributelist.add(11, "VLAN/VPN *"); 
													List2compare_service_Fieldattributelist.add(12, "Path Name *");
													List2compare_service_Fieldattributelist.add(13, "VLAN/VPN *");
													List2compare_service_Fieldattributelist.add(14, "Service Name *"); 
													
													if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
														throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
														throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}													
														
													if(!lbl_service_createform_Dslovc_service.isCurrentlyVisible()){
														throw new Error("DSL OVC Service Attributes section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!lbl_service_createform_Dslampath_service.isCurrentlyVisible()){
														throw new Error("DSLAM Path section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!lbl_service_createform_Braspath_service.isCurrentlyVisible()){
														throw new Error("BRAS Path section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!lbl_service_createform_hostserviceattr_service.isCurrentlyVisible()){
														throw new Error("Host Service Attributes section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!chk_service_createform_Dslovc_autoactivate.isCurrentlyVisible()){
														throw new Error("AUTO-ACTIVATE check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!lbl_service_createform_Dslovc_autoactivate.isCurrentlyVisible()){
														throw new Error("AUTO-ACTIVATE label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!chk_service_createform_Dslovc_clientdslovc.isCurrentlyVisible()){
														throw new Error("CLIENT DSL-OVC check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!lbl_service_createform_Dslovc_clientdslovc.isCurrentlyVisible()){
														throw new Error("CLIENT DSL-OVC label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
                                                    
                                                ddl_service_createform_Dslovc_NetworkProtocol.selectByIndex(2);
                                               ddl_service_createform_Dslovc_SupportedIPVersion.selectByIndex(3);
                                               ddl_service_createform_Dslovc_UsageType.selectByIndex(6);
                                               ddl_service_createform_Dslovc_AffiliateOwner.selectByIndex(2);
                                               ddl_service_createform_Dslovc_ServiceName.selectByIndex(0);    
													     
													break;
					
			case "Create ENNI Link Service": 	List2compare_service_Fieldattributelist.add(0, "Name *");
												List2compare_service_Fieldattributelist.add(1, "Alias 1");
												List2compare_service_Fieldattributelist.add(2, "Alias 2");
												List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
												List2compare_service_Fieldattributelist.add(4, "Note");
												List2compare_service_Fieldattributelist.add(5, "Subscriber Name *");										
												List2compare_service_Fieldattributelist.add(6, "Parent LAG *");
												List2compare_service_Fieldattributelist.add(7, "Device Name *");
												
												if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
													throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
													throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}											 
													
												if(!lbl_service_createform_ennilinkservice.isCurrentlyVisible()){
													throw new Error("ENNI Link Service Attributes Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!lbl_service_createform_serviceassociation.isCurrentlyVisible()){
													throw new Error("Service Association Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!btn_service_createform_serviceassociation_devicelookup.isCurrentlyVisible() && !btn_service_createform_serviceassociation_devicelookup.isCurrentlyEnabled()){
													throw new Error("Service Association Section Device lookup is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!chk_service_createform_activate.isCurrentlyVisible()){
													throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!lbl_service_createform_activate.isCurrentlyVisible()){
													throw new Error("Create Activation Task label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												 
												     
												break;
												
			case "Create HSI Service": 				List2compare_service_Fieldattributelist.add(0, "Name *");
													List2compare_service_Fieldattributelist.add(1, "Alias 1");
													List2compare_service_Fieldattributelist.add(2, "Alias 2");
													List2compare_service_Fieldattributelist.add(3, "Provisioning Status");													
													List2compare_service_Fieldattributelist.add(4, "Subscriber Name *");
													List2compare_service_Fieldattributelist.add(5, "DTN(Data TN) *");
													List2compare_service_Fieldattributelist.add(6, "Downstream Rate *");
													List2compare_service_Fieldattributelist.add(7, "");
													List2compare_service_Fieldattributelist.add(8, "Provisioned Downstream Rate");
													List2compare_service_Fieldattributelist.add(9, "Service Profile");
													List2compare_service_Fieldattributelist.add(10, "CVOIP TN");
													List2compare_service_Fieldattributelist.add(11, "Upstream Rate *"); 
													List2compare_service_Fieldattributelist.add(12, "");
													List2compare_service_Fieldattributelist.add(13, "Provisioned Upstream Rate");
													List2compare_service_Fieldattributelist.add(14, "Service Profile Index");
													List2compare_service_Fieldattributelist.add(15, "Start Device Name");
													List2compare_service_Fieldattributelist.add(16, "End Device Name");
													
													if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
														throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
														throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!lbl_service_createform_hsiserviceattri.isCurrentlyVisible()){
														throw new Error("HSI Service Attributes Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!lbl_service_createform_portsection.isCurrentlyVisible()){
														throw new Error("Port Selection is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}	
													
													if(!btn_service_createform_portsection_startdevicelookup.isCurrentlyVisible() && !btn_service_createform_portsection_startdevicelookup.isCurrentlyEnabled()){
														throw new Error("Start Device Name lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}
													
													if(!btn_service_createform_portsection_enddevicelookup.isCurrentlyVisible() && !btn_service_createform_portsection_enddevicelookup.isCurrentlyEnabled()){
														throw new Error("End Device Name lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
													}											
													
                                                    ddl_GPONservice_createform_DOWNSTREAM_BW_UNIT.selectByIndex(1);
                                                    ddl_GPONservice_createform_UPSTREAM_BW_UNIT.selectByIndex(2);
                                                    
													break;
													
			case "Create Host Service": List2compare_service_Fieldattributelist.add(0, "Name *");
										List2compare_service_Fieldattributelist.add(1, "Alias 1");
										List2compare_service_Fieldattributelist.add(2, "Alias 2");
										List2compare_service_Fieldattributelist.add(3, "Provisioning Status");	
										List2compare_service_Fieldattributelist.add(4, "Note");
										List2compare_service_Fieldattributelist.add(5, "Subscriber Name *");													
										List2compare_service_Fieldattributelist.add(6, "Full Name");
										List2compare_service_Fieldattributelist.add(7, "Host Acceptance Status");
										List2compare_service_Fieldattributelist.add(8, "Customer Acceptance Status");
										List2compare_service_Fieldattributelist.add(9, "Accepts Premium Services");
										List2compare_service_Fieldattributelist.add(10, "Accepts CVOIP");
										List2compare_service_Fieldattributelist.add(11, "Supported IP Version *"); 
										List2compare_service_Fieldattributelist.add(12, "Network Protocol *");
										List2compare_service_Fieldattributelist.add(13, "Service Capability Type(Usage) *");
										
										if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
											throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
											throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!chk_service_createform_activate.isCurrentlyVisible()){
											throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!lbl_service_createform_activate.isCurrentlyVisible()){
											throw new Error("Create Activation Task label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										break;
												
										
			case "Create IPTV Service":  List2compare_service_Fieldattributelist.add(0, "Name *");
										List2compare_service_Fieldattributelist.add(1, "Alias 1");
										List2compare_service_Fieldattributelist.add(2, "Alias 2");
										List2compare_service_Fieldattributelist.add(3, "Provisioning Status");													
										List2compare_service_Fieldattributelist.add(4, "Subscriber Name *");
										List2compare_service_Fieldattributelist.add(5, "DTN(Data TN) *");
										List2compare_service_Fieldattributelist.add(6, "Downstream Rate *");
										List2compare_service_Fieldattributelist.add(7, "");
										List2compare_service_Fieldattributelist.add(8, "Provisioned Downstream Rate");
										List2compare_service_Fieldattributelist.add(9, "Service Profile");
										List2compare_service_Fieldattributelist.add(10, "HD Streams *");
										List2compare_service_Fieldattributelist.add(11, "Upstream Rate *"); 
										List2compare_service_Fieldattributelist.add(12, "");
										List2compare_service_Fieldattributelist.add(13, "Provisioned Upstream Rate");
										List2compare_service_Fieldattributelist.add(14, "Service Profile Index");
										List2compare_service_Fieldattributelist.add(15, "Start Device Name");
										List2compare_service_Fieldattributelist.add(16, "End Device Name");
										
										if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
											throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
											throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!lbl_service_createform_IPTVserviceattri.isCurrentlyVisible()){
											throw new Error("IPTV Service Attributes Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!lbl_service_createform_portsection.isCurrentlyVisible()){
											throw new Error("Port Selection is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}	
										
										if(!btn_service_createform_portsection_startdevicelookup.isCurrentlyVisible() && !btn_service_createform_portsection_startdevicelookup.isCurrentlyEnabled()){
											throw new Error("Start Device Name lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_service_createform_portsection_enddevicelookup.isCurrentlyVisible() && !btn_service_createform_portsection_enddevicelookup.isCurrentlyEnabled()){
											throw new Error("End Device Name lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}											
										ddl_GPONservice_createform_DOWNSTREAM_BW_UNIT.selectByIndex(3);
                                        ddl_GPONservice_createform_UPSTREAM_BW_UNIT.selectByIndex(2);

										break;
										
			case "Create IPTV Unicast Service":   List2compare_service_Fieldattributelist.add(0, "Name *");
												List2compare_service_Fieldattributelist.add(1, "Alias 1");
												List2compare_service_Fieldattributelist.add(2, "Alias 2");
												List2compare_service_Fieldattributelist.add(3, "Provisioning Status");													
												List2compare_service_Fieldattributelist.add(4, "Subscriber Name *");
												List2compare_service_Fieldattributelist.add(5, "Start Device Name");
												List2compare_service_Fieldattributelist.add(6, "End Device Name");
												
												if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
													throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
													throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!lbl_service_createform_portsection.isCurrentlyVisible()){
													throw new Error("Port Selection is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!btn_service_createform_portsection_startdevicelookup.isCurrentlyVisible() && !btn_service_createform_portsection_startdevicelookup.isCurrentlyEnabled()){
													throw new Error("Start Device Name lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!btn_service_createform_portsection_enddevicelookup.isCurrentlyVisible() && !btn_service_createform_portsection_enddevicelookup.isCurrentlyEnabled()){
													throw new Error("End Device Name lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}											
												
												break;
												
			case "Create MEF ENNI Service": List2compare_service_Fieldattributelist.add(0, "Name *");
											List2compare_service_Fieldattributelist.add(1, "Alias 1");
											List2compare_service_Fieldattributelist.add(2, "Alias 2");
											List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
											List2compare_service_Fieldattributelist.add(4, "Note");
											List2compare_service_Fieldattributelist.add(5, "Subscriber Name *");
											List2compare_service_Fieldattributelist.add(6, "HPC Reference Code");
											List2compare_service_Fieldattributelist.add(7, "HPC Expiration Date");
											List2compare_service_Fieldattributelist.add(8, "SPEC Code");
											List2compare_service_Fieldattributelist.add(9, "Monitoring Type");
											List2compare_service_Fieldattributelist.add(10, "No of EVC/OVCs allowed");
											List2compare_service_Fieldattributelist.add(11, "LAG Indicator"); 
											List2compare_service_Fieldattributelist.add(12, "NC Code *");
											List2compare_service_Fieldattributelist.add(13, "NCI Code *");
											List2compare_service_Fieldattributelist.add(14, "Sec NCI Code *"); 
											List2compare_service_Fieldattributelist.add(15, "Bandwidth *"); 
											List2compare_service_Fieldattributelist.add(16, "Rate Limit Type"); 
											List2compare_service_Fieldattributelist.add(17, "Frame Size"); 
											List2compare_service_Fieldattributelist.add(18, "Frame Format"); 
											List2compare_service_Fieldattributelist.add(19, "Source System"); 
											List2compare_service_Fieldattributelist.add(20, "TSP"); 
											List2compare_service_Fieldattributelist.add(21, "Functional Status"); 
											List2compare_service_Fieldattributelist.add(22, "Requesting Affiliate *"); 
											List2compare_service_Fieldattributelist.add(23, "Protection Protocol"); 
											List2compare_service_Fieldattributelist.add(24, "MCO *"); 
											List2compare_service_Fieldattributelist.add(25, "Add QOS Details"); 
											List2compare_service_Fieldattributelist.add(26, "Device Name *"); 
											
											
											if(!lbl_service_MEFENNIcreateform_Subscribersection.isCurrentlyVisible()){
												throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_servcie_MEFENNIcreateform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_MEFENNIcreateform_subscriberlookup.isCurrentlyEnabled()){
												throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											if(!lbl_service_MEFENNIcreateform_hpcDetails.isCurrentlyVisible()){
												throw new Error("HPC Details section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_MEFENNIcreateform_enniserviceattribute.isCurrentlyVisible()){
												throw new Error("ENNI Service Attributes section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_MEFENNIcreateform_qosattribute.isCurrentlyVisible()){
												throw new Error("QOS Attributes section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_MEFENNIcreateform_serviceassociation.isCurrentlyVisible()){
												throw new Error("Service Association Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_service_MEFENNIcreateform_serviceassociation_devicelookup.isCurrentlyVisible() && !btn_service_MEFENNIcreateform_serviceassociation_devicelookup.isCurrentlyEnabled()){
												throw new Error("Service Association Section Device lookup is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!chk_service_MEFENNIcreateform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											waitFor(ddl_ENNIservice_createform_SPEC_Code);
                                            ddl_ENNIservice_createform_SPEC_Code.selectByIndex(7);
                                            ddl_ENNIservice_createform_Monitoring_Type.selectByIndex(2);
                                            ddl_ENNIservice_createform_NC_Code.selectByVisibleText("KRE6");
                                            if(!ddl_ENNIservice_createform_NCI_Code.isCurrentlyEnabled())
                                           {
                                                  waitFor(ddl_ENNIservice_createform_NCI_Code);
                                           }
                                            ddl_ENNIservice_createform_NCI_Code.selectByIndex(1);
                                            ddl_ENNIservice_createform_Sec_NCI_Code.selectByIndex(1);
                                            ddl_ENNIservice_createform_RateLimitType.selectByIndex(1);
                                            ddl_ENNIservice_createform_FrameSize.selectByIndex(1);
                                            ddl_ENNIservice_createform_Functional_Status.selectByIndex(1);
                                            ddl_ENNIservice_createform_Requesting_Affiliate.selectByIndex(1);
                                            ddl_ENNIservice_createform_AddQOSDetails.selectByIndex(1);
                                            	break;
											
			case "Create MEF EVC Service":  List2compare_service_Fieldattributelist.add(0, "Name *");
											List2compare_service_Fieldattributelist.add(1, "Alias 1");
											List2compare_service_Fieldattributelist.add(2, "Alias 2");
											List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
											List2compare_service_Fieldattributelist.add(4, "Note");
											List2compare_service_Fieldattributelist.add(5, "Name *");
											List2compare_service_Fieldattributelist.add(6, "Service Subtype Code");
											List2compare_service_Fieldattributelist.add(7, "EVC - NC Code *");
											List2compare_service_Fieldattributelist.add(8, "CE - VLAN ID Preservation");
											List2compare_service_Fieldattributelist.add(9, "CE - VLAN COS Preservation");
											List2compare_service_Fieldattributelist.add(10, "UnicastFrameDelivery");
											List2compare_service_Fieldattributelist.add(11, "MulticastFrameDelivery");
											List2compare_service_Fieldattributelist.add(12, "BroadcastFrameDelivery");
											List2compare_service_Fieldattributelist.add(13, "Service Type Indicator");
											List2compare_service_Fieldattributelist.add(14, "Group Number");
											List2compare_service_Fieldattributelist.add(15, "Usage Type");
											List2compare_service_Fieldattributelist.add(16, "COS ID");
											List2compare_service_Fieldattributelist.add(17, "ASN");
											List2compare_service_Fieldattributelist.add(18, "VPN ID");
											List2compare_service_Fieldattributelist.add(19, "Is Meet point EVC");
											List2compare_service_Fieldattributelist.add(20, "Controlling Company");
											List2compare_service_Fieldattributelist.add(21, "Requesting Affiliate *");
											List2compare_service_Fieldattributelist.add(22, "PM Type");
											List2compare_service_Fieldattributelist.add(23, "Functional Status");
											List2compare_service_Fieldattributelist.add(24, "MCO *");										
											
											
											if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
												throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
												throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											if(!lbl_service_createform_EVCserviceattr.isCurrentlyVisible()){
												throw new Error("EVC Service Attributes Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!chk_service_createform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_createform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											WaitForPageToLoad(600);
                                            ddl_serviceMEFEVC_createform_MCO.selectByIndex(4);
                                            ddl_serviceMEFEVC_createform_RequestingAffiliate.selectByIndex(1);
                                            ddl_serviceMEFEVC_createform_EVCNCCode.selectByIndex(4);

											break;
											
											
			case "Create MEF OVC Service": 	List2compare_service_Fieldattributelist.add(0, "Name *");
											List2compare_service_Fieldattributelist.add(1, "Alias 1");
											List2compare_service_Fieldattributelist.add(2, "Alias 2");
											List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
											List2compare_service_Fieldattributelist.add(4, "Note");
											List2compare_service_Fieldattributelist.add(5, "Description");
											List2compare_service_Fieldattributelist.add(6, "Subscriber Name *");
											List2compare_service_Fieldattributelist.add(7, "Is Offnet");
											List2compare_service_Fieldattributelist.add(8, "Service Subtype Code");
											List2compare_service_Fieldattributelist.add(9, "OVC - NC Code *");
											List2compare_service_Fieldattributelist.add(10, "Color Forwarding");
											List2compare_service_Fieldattributelist.add(11, "CE - VLAN ID Preservation");
											List2compare_service_Fieldattributelist.add(12, "CE - VLAN CoS Preservation");
											List2compare_service_Fieldattributelist.add(13, "S - VLAN ID Preservation");
											List2compare_service_Fieldattributelist.add(14, "S - VLAN CoS Preservation");
											List2compare_service_Fieldattributelist.add(15, "UnicastFrameDelivery");
											List2compare_service_Fieldattributelist.add(16, "MulticastFrameDelivery");
											List2compare_service_Fieldattributelist.add(17, "BroadcastFrameDelivery");
											List2compare_service_Fieldattributelist.add(18, "EVC-OVC Reference");
											List2compare_service_Fieldattributelist.add(19, "Service Type Indicator");
											List2compare_service_Fieldattributelist.add(20, "Group Number");
											List2compare_service_Fieldattributelist.add(21, "Usage Type");									
											List2compare_service_Fieldattributelist.add(22, "ASN");
											List2compare_service_Fieldattributelist.add(23, "VPN ID");											
											List2compare_service_Fieldattributelist.add(24, "Requesting Affiliate *");
											List2compare_service_Fieldattributelist.add(25, "PM Type");											
											List2compare_service_Fieldattributelist.add(26, "MCO *");										
											
											
											if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
												throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
												throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											if(!lbl_service_createform_OVCserviceattr.isCurrentlyVisible()){
												throw new Error("OVC Service Attribute Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!chk_service_createform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_createform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
                                            WaitForPageToLoad(600);
                                            ddl_serviceMEFEVC_createform_MCO.selectByIndex(4);
                                            ddl_serviceMEFEVC_createform_RequestingAffiliate.selectByIndex(1);
                                            ddl_serviceMEFEVC_createform_EVCNCCode.selectByIndex(4);

											break;
											
											
			case "Create MEF UNI Service": 	List2compare_service_Fieldattributelist.add(0, "Name *");
											List2compare_service_Fieldattributelist.add(1, "Alias 1");
											List2compare_service_Fieldattributelist.add(2, "Alias 2");
											List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
											List2compare_service_Fieldattributelist.add(4, "Note");
											List2compare_service_Fieldattributelist.add(5, "Subscriber Name *");
											List2compare_service_Fieldattributelist.add(6, "HPC Reference Code");
											List2compare_service_Fieldattributelist.add(7, "HPC Expiration Date");
											List2compare_service_Fieldattributelist.add(8, "ICO");
											List2compare_service_Fieldattributelist.add(9, "OTC");
											List2compare_service_Fieldattributelist.add(10, "Monitoring Type");
											List2compare_service_Fieldattributelist.add(11, "No of EVC/OVCs allowed");
											List2compare_service_Fieldattributelist.add(12, "SPEC");
											List2compare_service_Fieldattributelist.add(13, "NC Code *");
											List2compare_service_Fieldattributelist.add(14, "NCI Code *");
											List2compare_service_Fieldattributelist.add(15, "Bandwidth");
											List2compare_service_Fieldattributelist.add(16, "Sec NCI Code *");
											List2compare_service_Fieldattributelist.add(17, "Service MUX");
											List2compare_service_Fieldattributelist.add(18, "Bundling");
											List2compare_service_Fieldattributelist.add(19, "All To1Bundling");
											List2compare_service_Fieldattributelist.add(20, "Frame Format");
											List2compare_service_Fieldattributelist.add(21, "Frame Size");
											List2compare_service_Fieldattributelist.add(22, "Rate Limit Type *");
											List2compare_service_Fieldattributelist.add(23, "TSP");
											List2compare_service_Fieldattributelist.add(24, "Is Diverse");
											List2compare_service_Fieldattributelist.add(25, "Functional Status"); 
											List2compare_service_Fieldattributelist.add(26, "Requesting Affiliate *"); 											
											List2compare_service_Fieldattributelist.add(27, "MCO *"); 
											List2compare_service_Fieldattributelist.add(28, "Add QOS Details"); 
											List2compare_service_Fieldattributelist.add(29, "Device Name *"); 
											
											
											if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
												throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
												throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											if(!lbl_service_createform_hpcDetails.isCurrentlyVisible()){
												throw new Error("HPC Details section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_createform_UNIServiceattr.isCurrentlyVisible()){
												throw new Error("UNI Service Attribute Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											if(!lbl_service_createform_qosattribute.isCurrentlyVisible()){
												throw new Error("QOS Attributes section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_createform_serviceassociation.isCurrentlyVisible()){
												throw new Error("Service Association Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_service_createform_serviceassociation_devicelookup.isCurrentlyVisible() && !btn_service_createform_serviceassociation_devicelookup.isCurrentlyEnabled()){
												throw new Error("Service Association Section Device lookup is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!chk_service_createform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!lbl_service_createform_activate.isCurrentlyVisible()){
												throw new Error("Create Activation Task label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
                                            WaitForPageToLoad(500);
                                            ddl_serviceMEFUNI_createform_NC_Code.selectByVisibleText("KRE6");
                                            if(!ddl_serviceMEFUNI_createform_NCI_Code.isCurrentlyEnabled())
                                           {
                                                  waitFor(ddl_ENNIservice_createform_NCI_Code);
                                           }
                                            ddl_ENNIservice_createform_NCI_Code.selectByIndex(1);
                                            ddl_serviceMEFUNI_createform_Sec_NCI_Code.selectByIndex(1);
                                           
                                            ddl_serviceMEFUNI_createform_Rate_Limit_Type.selectByIndex(2);
                                            ddl_serviceMEFUNI_createform_RequestingAffiliate.selectByIndex(1);
                                            ddl_serviceMEFUNI_createform_MCO.selectByIndex(1);                                           

                                            break;
											
											
			case "Create MGR UNI Service": List2compare_service_Fieldattributelist.add(0, "Name *");
											List2compare_service_Fieldattributelist.add(1, "Alias 1");
											List2compare_service_Fieldattributelist.add(2, "Alias 2");
											List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
											List2compare_service_Fieldattributelist.add(4, "Note");
											List2compare_service_Fieldattributelist.add(5, "Bandwidth");
											List2compare_service_Fieldattributelist.add(6, "Subscriber Name *");
											List2compare_service_Fieldattributelist.add(7, "Device Name *"); 
											List2compare_service_Fieldattributelist.add(8, "Physical Port *");
											List2compare_service_Fieldattributelist.add(9, "Service Name");
											List2compare_service_Fieldattributelist.add(10, "MEN ID *");
											
											
											if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
												throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
												throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											if(!lbl_service_createform_serviceassociation.isCurrentlyVisible()){
												throw new Error("Service Association Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	
											
											if(!btn_service_createform_serviceassociation_servicelookup.isCurrentlyVisible() && !btn_service_createform_serviceassociation_servicelookup.isCurrentlyEnabled()){
												throw new Error("Service Association Section Service lookup is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}	break;
											
			case "Create Probe UNI Service": 	List2compare_service_Fieldattributelist.add(0, "Name *");
												List2compare_service_Fieldattributelist.add(1, "Alias 1");
												List2compare_service_Fieldattributelist.add(2, "Alias 2");
												List2compare_service_Fieldattributelist.add(3, "Provisioning Status");
												List2compare_service_Fieldattributelist.add(4, "Note");			
												List2compare_service_Fieldattributelist.add(5, "Subscriber Name *");
												List2compare_service_Fieldattributelist.add(6, "Monitoring Type");
												List2compare_service_Fieldattributelist.add(7, "No of EVC/OVCs allowed");
												List2compare_service_Fieldattributelist.add(8, "SPEC");
												List2compare_service_Fieldattributelist.add(9, "NC Code");
												List2compare_service_Fieldattributelist.add(10, "NCI Code");
												List2compare_service_Fieldattributelist.add(11, "Sec NCI Code");
												List2compare_service_Fieldattributelist.add(12, "Service MUX");
												List2compare_service_Fieldattributelist.add(13, "Bundling");									
												List2compare_service_Fieldattributelist.add(14, "All To1Bundling");
												List2compare_service_Fieldattributelist.add(15, "Frame Size");
												List2compare_service_Fieldattributelist.add(16, "Rate Limit Type *");
												List2compare_service_Fieldattributelist.add(17, "Is Diverse");
												List2compare_service_Fieldattributelist.add(18, "Device Name *");
												List2compare_service_Fieldattributelist.add(19, "Service Name *");
			
												if(!lbl_service_createform_Subscribersection.isCurrentlyVisible()){
													throw new Error("Subscriber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!btn_servcie_createform_subscriberlookup.isCurrentlyVisible() && !btn_servcie_createform_subscriberlookup.isCurrentlyEnabled()){
													throw new Error("Subscriber lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!lbl_service_createform_Probeunisection.isCurrentlyVisible()){
													throw new Error("PROBE UNI Service Attribute Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!lbl_service_createform_serviceassociation.isCurrentlyVisible()){
													throw new Error("Service Association Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!btn_service_createform_serviceassociation_devicelookup.isCurrentlyVisible() && !btn_service_createform_serviceassociation_devicelookup.isCurrentlyEnabled()){
													throw new Error("Service Association Section Device lookup is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												

												if(!lbl_service_createform_MSCUniassociation.isCurrentlyVisible()){
													throw new Error("MSC UNI Service Association Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!btn_service_createform_MSCUniassociation_servicelookup.isCurrentlyVisible() && !btn_service_createform_MSCUniassociation_servicelookup.isCurrentlyEnabled()){
													throw new Error("MSC UNI Service Association service lookup is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!chk_service_createform_activate.isCurrentlyVisible()){
													throw new Error("Create Activation Task check box is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
												
												if(!lbl_service_createform_activate.isCurrentlyVisible()){
													throw new Error("Create Activation Task label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}	
                                                WaitForPageToLoad(500);
                                                ddl_serviceMEFUNI_createform_Rate_Limit_Type.selectByIndex(2);

												break;										
											
								
											//List2compare_service_Fieldattributelist.add(7, "");
			}
			
			for(int i=0;i<servicecreate_Fieldattributelist.size();i++){
				if(!servicecreate_Fieldattributelist.get(i).contains(List2compare_service_Fieldattributelist.get(i))){
					slf4jLogger.info("servicecreate_Fieldattributelist="+servicecreate_Fieldattributelist.get(i));
					slf4jLogger.info("List2compare_service_Fieldattributelist="+List2compare_service_Fieldattributelist.get(i)+" Not matching");
					throw new Error("Fields are not matching check:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
				}
			}
			slf4jLogger.info("Circuit Create field attributes are expected as per "+tab_currentlydisplayed.getText().replaceAll("\\s+$", "")+" Circuit type");
			
													
		}
		
		//################ Kundan --TC172612 -- 8/28  #########################//
	
		public void validate_the_affiliate_owner_fields_DSLOVC(){
			jsClick(ddl_dslovc_create_affiliate_owner);
			String str1=ddl_dslovc_create_affiliate_owner.getText();
			for(String w:str1.split("\n")){
			if ( w.equalsIgnoreCase("--Select--")) {	
				System.out.println("Afffiliated owner value:"+ w);
			}
			else if ( w.equalsIgnoreCase("LOCAL")){
			System.out.println("Afffiliated owner value:"+ w);
			}
			else if ( w.equalsIgnoreCase("IXC")){
			System.out.println("Afffiliated owner value:"+ w);
			}
			else throw new Error("Affiliated Owner is not present");
			}
		}
		
		public void fill_fields(String container1, String container2) {
			switch(container1){
			case "TC55691":waitForElement(tbx_Bandwidth);
				tbx_Service_Name.type("11/ENNI/111317//REG");
	              tbx_Allias1.type(container1);      
	              tbx_Allias2.type("Test"); 
	              tbx_Note.type("Test"); 
	              ddl_HPC_Reference_Code.selectByVisibleText("No");
	              ddl_Monitoring_Type.selectByVisibleText("HIGH DENSITY");
	              ddl_SPEC_Code.selectByVisibleText("MOENNH");
	              ddl_NC.selectByVisibleText("KRE6");
	              ddl_NCI.selectByVisibleText("02LNF.A06");
	              ddl_Sec_NCI.selectByVisibleText("02CXF.N1C");
	              tbx_Bandwidth.type("50"); 
	              ddl_Rate_Limit_Type.selectByVisibleText("EVCM");
	              ddl_Frame_Size.selectByVisibleText("JUMBO");
	              tbx_Frame_Format.type("OMNIVue"); 
	              tbx_Source_System.type("OMNIVue");
	              tbx_Tsp.type("OMNIVue"); 
	              ddl_Functional_Status.selectByVisibleText("Not Specified"); 
	              ddl_Requesting_Affiliate.selectByVisibleText("QWEST"); 
	              ddl_MCO.selectByVisibleText("MPLSMNETHQ");    
	              ddl_QOS.selectByVisibleText("No");

				
				break;
			}
		}
		
		public void i_select_device_in_MEF_UNI_Service_Association_Section_Device_section_and_click_on_create(String Dname, String ServType) throws Throwable {
			
			switch(ServType){
			
			case "MEF UNI":perform_device_lookup(Dname);
							waitForElement(btn_serviceport);
							jsClick(btn_serviceport);
							jsClick(btn_serviceportlookup);
							Thread.sleep(5000);
							select_port_from_port_lookup();
							select_NMI_circuit(); break;
							
			case "MEF ENNI": perform_device_lookup_enni(Dname);
							waitForElement(btn_lookup_physicalport);
							jsClick(btn_lookup_physicalport);
							jsClick(btn_serviceportlookup);
							Thread.sleep(5000);
							select_port_for_ENNI();
							jsClick(img_Checkbox);break;
							
			case "Probe UNI": 	perform_device_lookup(Dname);
							waitForElement(btn_lookup_physicalport);
							jsClick(btn_serviceport);
								jsClick(btn_serviceportlookup);
								Thread.sleep(5000);
								select_port_from_port_lookup();
								select_NMI_circuit();break;
			
			}		
			
			
		} 
		
		public void verify_validation(String action){
			switch(action){
			case "MEF ENNI Create":jsClick(btn_create_service); waitForElement(btn_Servicepage_Edit);break;
			}
			
		}
		
		public void i_fill_subscriber_service_form() throws Throwable {
			waitForElement(btn_subscriberlookupicon); Thread.sleep(2000);
			
			jsClick(btn_subscriberlookupicon);
			waitForElement(btn_lookup);
			tbx_subcriber_name_window.type("TEST - JANET");
			jsClick(btn_lookup);
			
			waitForElement(lnk_subcribername);
			
			jsClick(lnk_subcribername);
			Thread.sleep(2000);
				if (ddl_ismeetpointevc.isCurrentlyVisible()){
				
				//String evcmeetpt = ddl_ismeetpointevc.getText();
				slf4jLogger.info("Is Meet Point EVC value is = " + ddl_ismeetpointevc.getText());
			
			}
				//mefevccreatepage.tbx_provisionstatus.isEnabled() ;
				slf4jLogger.info("Checking Provision status field is enabled = " + tbx_provisionstatus.isEnabled());
				
				/*
				// If loop used for MEF EVC Page
				
				//String evcmeetpt = mefevccreatepage.ddl_ismeetpointevc.getText();
				if (ddl_ismeetpointevc.isCurrentlyVisible()){
					
					String evcmeetpt = ddl_ismeetpointevc.getText();
					slf4jLogger.info("Is Meet Point EVC value is = " + ddl_ismeetpointevc.getText());
				
				}*/
				
				
				
				// data related to host service
				
				if (cbx_HOSTIPVERSION.isCurrentlyVisible() && cbx_NWPROTOCOLTYPE.isCurrentlyVisible() && cbx_SERVICECAPABILITY.isCurrentlyVisible() ){
					
						cbx_HOSTIPVERSION.selectByVisibleText("Both");
						cbx_NWPROTOCOLTYPE.selectByVisibleText("DHCP");
						cbx_SERVICECAPABILITY.selectByVisibleText("IPTV-DATA");
						
				}
				
			
			
				
		}
		
		public void I_click_on_manual_activation_checkbox () throws Throwable {
			
		jsClick(cbx_manualtask); Thread.sleep(1000);
		slf4jLogger.info("Selected the manual checkbox");
		
		}
		
		public WebElement waitForElement(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
		    
		    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
			
		    return element;
		}

		public WebElement waitForElementclickable(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(getDriver(),500);	
		    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		    
			
		    return element;
		}
		public void jsClick(WebElement element) {
			try {
				
				JavascriptExecutor executor = (JavascriptExecutor) getDriver();
				executor.executeScript("arguments[0].click();", element);
			} catch (Exception e) {
				System.out.println("unable to click by java script");
				element.click();
			}

		}
		
		public void create_iptv_unicast() {
			
			long mili=System.currentTimeMillis();
			int time_minutes=(int) (mili/1000);
			String time_dif=Integer.toString(time_minutes);
			tbx_name.sendKeys(time_dif+"-IPTV");
			
		}
		
		public void i_click_on_service_circuit_design_related_tab() {
            try {
                  waitForElement(tab_Service_circuit_design_relatedtab);
                  jsClick(tab_Service_circuit_design_relatedtab);
            }catch(Exception e) {
                  e.printStackTrace();
            }
     }
     
		public void i_expand_the_associated_service() {
            try {
                  waitForElement(btn_expand_member);
                  jsClick(btn_expand_member);
                  Thread.sleep(1000);
                  

            }catch(Exception e) {
                  e.printStackTrace();
            }
     }
		public void i_cLick_on_Add_VLAN_and_added_VLAN_range() {
            try {
                 
                  waitForElement(btn_add_Vlan);
                  jsClick(btn_add_Vlan);
                  waitForElement(tbx_startRange);
                  tbx_startRange.click();
                  tbx_startRange.type("100");
                  tbx_endRange.click();
                  tbx_endRange.type("105");
                  
                  jsClick(btn_save_number);
 
            }catch(Exception e) {
                  e.printStackTrace();
            }
     }
     public void i_validate_Service_Circuit_Design_tab() {
            try {
                  waitForElement(btn_Google_maps_service);
                  jsClick(btn_Google_maps_service);
                  Assert.assertTrue("Google maps not enabled",btn_Google_maps_service.isEnabled() );
                  Thread.sleep(3000);
                  jsClick(cbx_DeviceName_related_tab);
                  Assert.assertTrue("Device Name not checked",cbx_DeviceName_related_tab.isEnabled());
                  Thread.sleep(5000);
                  jsClick(cbx_Deviceport_related_tab);
                  Assert.assertTrue("Device port Name not checked",cbx_DeviceName_related_tab.isEnabled());
                  Thread.sleep(5000);
                  jsClick(cbx_Deviceport_related_tab);
                  Assert.assertTrue("Circuit Name not checked",cbx_cricuits_related_tab.isEnabled());
            }catch(Exception e) {
                  
            }
     }

     public void fillGponData(String DTN, String downStream,String upStream)
		{
			tbx_DTN_data.sendKeys(DTN);
			tbx_Downstream_rate.sendKeys(downStream);
			tbx_Upstream_rate.sendKeys(upStream);
			
		}
		
     
    
		public void fillserviceName(String Name)
		{
			tbx_name.sendKeys(Name);
			
		}
		
		

}
