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
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
 
 

public class OVCreateDevicePage extends OmniVuePage {
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	

	
	
	@FindBy(xpath=".//select[@id='IS_DIVERSE' or @id='isDiversed']")
    public WebElementFacade ddl_IsDiversed; 
//2
		
	@FindBy(xpath="//input[@value='Shared']")
	public WebElementFacade rdbtn_Shared;//3
		
	@FindBy(xpath=".//*[text()='Wire Center CLLI']")
	public WebElementFacade lbl_wire_clli;
	
	@FindBy(xpath=".//*[@ng-click='openWireCenterCLLILookUp(field.name)']/img")
	public WebElementFacade btn_wireclli;
	
	@FindBy(xpath="//span[@ng-click='openTopologyLookUp(field.name)']")
	public WebElementFacade btn_Topologysearch;
	
	//@FindBy(xpath=".//*[@id='topologylookup']/div[3]/div[1]/input")
	//public WebElementFacade tbx_Topologyname;
	
	//@FindBy(id="port")
	//public WebElementFacade ddl_TopologyType;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='row0topologyGrid']/div[@class='jqx-grid-cell jqx-grid-cell-office jqx-item jqx-item-office']/div[@tabindex='0']/div[1]/div")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@role='columnheader']//div[@aria-checked='false']")
	public WebElementFacade ckb_TopologylookUp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Look Up']")
	public WebElementFacade btn_TopologylookUp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Associate Topology']")
	public WebElementFacade btn_AssociateTopology;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='node2Topology']")
	public WebElementFacade tbx_createdevice_Topologyfield;
	////
	
	@FindBy(xpath = ".//*[@id='subscriberName']")
	public WebElementFacade tbx_SubscriberName;

	@FindBy(xpath = "//ul[@class='dropdown-menu ng-isolate-scope' and @aria-hidden='false']")
	public WebElementFacade ddl_subscriberSolr;
	
	
	
	//Another window  change id=0 to 1
	//@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[1]/input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Address#']/following-sibling::input")
	public WebElementFacade tbx_addNo;
	
	//@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Street Name']/following-sibling::input")
	public WebElementFacade tbx_streetName;
	
	//@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Building CLLI %']/following-sibling::input")
	public WebElementFacade tbx_buildingclli;
	
	@FindBy(xpath=".//*[@id='loclkp']/img")
	public WebElementFacade btn_locationLookup;
	
	@FindBy(xpath=".//*[@id='loclkp']/i")
	public WebElementFacade btn_locationLookup_newdevicecreateform;
	
	//@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[5]/button[text()='Look Up']")
	@FindBy(xpath=".//*[@title='Lookup' and @ng-click='searchLocation()']/i")
	public WebElementFacade btn_lookUp;
	
	@FindBy(xpath="(.//*[@title='Look Up' and @ng-click='searchLocation();']/i)[2]")
	public WebElementFacade btn_Location_lookUp2;
	
	@FindBy(xpath=".//*[@title='Look Up' and @ng-click='searchLocation()']")
	public WebElementFacade btn_altequpbuild_locnlookUp;
	
	
	@FindBy(xpath=".//*[@ng-click='searchLocation()']/i")
	public WebElementFacade btn_lookUp_newdevicecreateform;
	
	@FindBy(xpath = ".//div[@title='CLLI Lookup']//div[@class='modal-body']//select[@id='state' and @ng-model='locationlkp.STATE']")
	public WebElementFacade ddl_State ;
	
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[5]/div[2]/button[text()='Look Up']")
	public WebElementFacade btn_wiredlookUp;
	
	//@FindBy(xpath=".//*[@id='row0jqxGrid0']/div/div[1]/a[@href='#']")
	@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/a")
	public WebElementFacade lnk_addlcn;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='previous']")
	public WebElementFacade btn_locnlookup_previous;
	
	@FindBy(xpath=".//input[@ng-keyup='setAdddressFields(entity[field.name])' and @ng-model='entity[field.name]']")
	public WebElementFacade tbx_locationclli;
	
	@FindBy(xpath=".//*[@id='RELAYRACKID']")
	public WebElementFacade tbx_relayID;	

	@FindBy(xpath=".//*[@id='isSharedOrDedicated' and  @value='Shared']")
	public WebElementFacade rad_shared;
		
	@FindBy(id="MGMT_IP_SUBNET_MASK")
	public WebElementFacade tbx_devicecreate_mgntsubnetmask;
	
	@FindBy(id="MGMT_IP_DEFAULT_GATEWAY")
	public WebElementFacade tbx_devicecreate_mgntdftgatewaymask;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Create']")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createDeviceDetailForm();']")
	public WebElementFacade btn_Create;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetDeviceDetails();']")
	public WebElementFacade btn_Reset;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")//Only selecting the first rom not all the elements
	//@FindBy(xpath=".//*[@class='ng-scope']/div[11]/div")
	public List<WebElementFacade> lbl_allXapath;
	
	//@FindBy(xpath=".//*[@id='1']/ng-include/div/div[11]/div/div[2]/div/div[3]/input[3]")  /// Check is it used
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='PASSIVE']")
	@FindBy(xpath=".//input[@value='PASSIVE']")
	public WebElementFacade rbn_passive;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='PASSIVE']/following-sibling::label[text()='Passive']")
	public WebElementFacade lbl_createdevice_rbntext_passive;
	
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='ETHERNET']")
	@FindBy(xpath=".//input[@value='ETHERNET']")
	public WebElementFacade rbn_ethernet;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='ETHERNET']/following-sibling::label[text()='Ethernet']")
	public WebElementFacade lbl_createdevice_rbntext_ethernet;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='GPON']")
	@FindBy(xpath=".//input[@value='GPON']")
	public WebElementFacade rbn_Gpon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='GPON']/following-sibling::label[text()='GPON']")
	public WebElementFacade lbl_createdevice_rbntext_Gpon;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='ALL']")
	@FindBy(xpath=".//input[@value='ALL']")
	public WebElementFacade rbn_all;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='deviceTech' and @value='ALL']/following-sibling::label[text()='All']")
	public WebElementFacade lbl_createdevice_rbntext_all;
	
	@FindBy(xpath="//label[text()='Location CLLI']")
	public WebElementFacade lbl_locationClli;
	
	@FindBy(xpath="//label[text()='Location CLLI']/following-sibling::input")
	public WebElementFacade tbx_locationClli;
	
	@FindBy(xpath="//select[@id='NETWORKROLES']")
	public WebElementFacade ddl_Equipment_role;
	
	/*@FindBy(xpath="//div[@class='ng-binding alert alert-success']")
	public WebElementFacade success_alert;*/
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='ng-binding alert alert-success']")
	public WebElementFacade success_alert; 
	
	@FindBy(xpath="(//div[@class='ng-binding alert alert-success'])[2]")
	public WebElementFacade success_alert_edit;
	
	@FindBy(xpath="//div[@class='ng-binding alert alert-success']/button")
	public WebElementFacade success_alert_close;
	
	@FindBy(xpath = ".//*[@id='ConnectorType']")
	public WebElementFacade ddl_Connector_type;
	
	@FindBy(id = "NODE2NODETYPE")
	public WebElementFacade ddl_device_type_createform;
	
	@FindBy(id = "NODE2NODEDEF")
	public WebElementFacade ddl_device_subtype_createform;
	
	
	@FindBy(id = "Vectoring_Type")
	public WebElementFacade ddl_createdevice_vectortype;
	
	@FindBy(id = "Vectoring_Topology")
	public WebElementFacade ddl_createdevice_vectortopolgy;
	
	@FindBy(xpath = ".//input[@ng-model='vectoringTopologyData.Vectoring_Topology_Name']")
    public WebElementFacade tbx_createdevice_Newvectortopolgy;
	
	@FindBy(xpath = ".//textarea[@id = 'topologyNotes']")
    public WebElementFacade tbx_createdevice_vectortopolgyNote;
	
	
	@FindBy(xpath = ".//button[contains(@ng-click,'createVectoringTopology')]/i")
    public WebElementFacade button_createdevice_Newvectortopolgy;
	
	@FindBy(id = "NOSACertification")
	public WebElementFacade ddl_createdevice_prism_nosacert;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//textarea[@id='topologyNotes']")
	public WebElementFacade tbx_createdevice_Topologynotes;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[contains(@ng-click,'createVectoringTopology')]")
	public WebElementFacade btn_createdevice_Topologysave;
	
	//Tab switch Check its already present
	//@FindBy(xpath="//*[contains(text(),'Create Device')]")
	@FindBy(xpath=".//*[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
			public WebElementFacade tab1;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab2;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading")
	public WebElementFacade tab3;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[4]/a/tab-heading")
	public WebElementFacade tab4;
	
	
	//Tab switch Check its already present
		@FindBy(xpath="//tab-heading[contains(text(),'Create Device')]")
		public WebElementFacade tab_createdevice;
		
	
		
	//Subscriber field
		
		//@FindBy(xpath=".//ng-include[@class='ng-scope']/div/div[11]/div/div[2]/div/div[4]/div[9]/div/div/div[2]/div/div/div[1]/div[1]/span/img")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='openSubscriberLookUp(field.name)']/img")
		public WebElementFacade btn_subsciber;
				
		//@FindBy(xpath="//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[3]/div[2]/input[@value='LookUp']")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-show='showAlertForSubscriber']/following-sibling::div//*[@value='LookUp']")
		public WebElementFacade btn_sublookup;
				
		@FindBy(xpath=".//*[contains(@id,'subscriber_lookup_')]/tbody/tr[1]/td[1]/a/span")
		public WebElementFacade lnk_addsub;
				
	//End of Subscriber build
		@FindBy(id="ConnectorType")
		public WebElementFacade ddl_connectortype;  //Passive device create form details
		
		@FindBy(xpath=".//*[text()='DSL OVC']")
		public List<WebElementFacade> lbl_allServiceXapath;// Move to service page

		@FindBy(xpath=".//*[@ng-if='viewDevice']/div[@class='container']/div[4]/table/tbody[1]/tr/td[2]")
		public WebElementFacade lbl_devicename; 		//Getting the device name
		
	//Logical Port Creation---21/7/2016---Divya-OSIp Regression	
		@FindBy(xpath=".//*[@ng-switch-when='circuitBuildingClliLookup']/div[1]/span/img")
		public WebElementFacade btn_devicelookup;				//Divya Logical port paths --- 20-7-2016
		
		@FindBy(xpath=".//*[@id='devicelookup']/div[5]/div[2]/input[1]")
		public WebElementFacade btn_lookuplogicalfrm;
		
		@FindBy(xpath=".//*[@id='logicalPhysicalPort']/following-sibling::span/img")
		public WebElementFacade btn_lookuplogicalport;
		
		@FindBy(xpath=".//*[@ng-click='servicePhysicalPortlookUp()']")
		public WebElementFacade btn_lookuplogicalport_lookup;
			
		@FindBy(xpath=".//*[@id='servicePort_look_up']/tbody/tr[1]/td[2]/a")
		public WebElementFacade lbl_selctlogicalport_lookup;
		
		
	// End of Logical port
		
		//Location creation start
		@FindBy(xpath="//div[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_Locationtype;
		
		@FindBy(xpath="//button[@ng-click='create();']")
		public WebElementFacade btn_Location_create;
		
		@FindBy(xpath="//input[@id='addRangeY']")
		public WebElementFacade rdbtn_addRange;
		
		@FindBy(xpath="//select[@id='locationRole']") 
		public WebElementFacade ddl_locationRole;
		
		@FindBy(xpath="//input[@id='addressNumber']") //2------------Check do we need its in activationpage
		public WebElementFacade tbx_addressNumber;
		
		@FindBy(xpath="//input[@id='street']") //3------------Check do we need its in activationpage
		public WebElementFacade tbx_street;
		
		@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='state')]") //4------------Check do we need its in activationpage
		public WebElementFacade ddl_state;
		
		@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='city')]") //5------------Check do we need its in activationpage
		public WebElementFacade ddl_city;
		
		@FindBy(xpath="//input[@id='zip']") //6----------Not a mandatory field so not used
		public WebElementFacade tbx_zip;
		
		@FindBy(xpath="//select[@id='NewConstructionIndicator']") //7
		public WebElementFacade ddl_NewConstructionIndicator;
		
		@FindBy(xpath="//input[@id='sWCCLLI']") //8
		public WebElementFacade tbx_sWCCLLI;
		
		@FindBy(xpath="//select[@id='addrangeVal']") //9
		public WebElementFacade ddl_addrangeVal;
		
		@FindBy(xpath="//input[@value='Find Address Range']") //10
		public WebElementFacade btn_FindAddressRange;
		
		@FindBy(xpath="//select[@id='ContractType']") //11
		public WebElementFacade ddl_CTL_ContractType;
		
		@FindBy(xpath="//div[@ng-if='isEditMode']/div[2]/div[7]/div/div[2]/ng-include/div/span[2]/span/select")
		public WebElementFacade ddl_Edit_contractType;
		
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[(@class='cmdButton')and(@value='Edit')]")
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Edit']")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@value='Edit']")
		public WebElementFacade btn_Edit;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[(@class='cmdButton')and(@value='Save')]")
		public WebElementFacade btn_Save;
		
		@FindBy(xpath="//select[@id='RestrictedAddressCode']") //12
		public WebElementFacade ddl_RestrictedAddressCode;
		
			
		@FindBy(xpath="//*[contains(text(),'Create Individual Location')]") //14
		public WebElementFacade tab_Indivdual_Location;
		
		@FindBy(xpath="//*[contains(text(),'Create Individual Location')]/a")
		public WebElementFacade tab_Indivdual_Location_cancel;
		
		//@FindBy(xpath="//*[ends-with(text(),'STREET3')]")
		//public WebElementFacade tab_Indivdual_Location;
		
		@FindBy(xpath="//div[@class='ng-binding alert alert-success']") //15
		public WebElementFacade loc_success;
		
		@FindBy(xpath="//div[@ng-controller='viewEditLocationAWRCtrl']/div[@class='ng-binding alert alert-success']")
		public WebElementFacade loc_Edit_success;
		
		@FindBy(xpath="//*[@id='mainTab']/div/ul/li[Last()-1]/a/tab-heading")
		public WebElementFacade created_tab;
		
		

		//End of location creation
		
		// Editing the device page--9/23
		@FindBy(xpath="//label[@class='col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label']")//Only selecting the first rom not all the elements
		//@FindBy(xpath=".//*[@class='ng-scope']/div[11]/div")
		public List<WebElementFacade> lbl_allXapath1;
		
		@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//label[contains(text(),'Functional Status')]/../../following-sibling::span//select")
		public WebElementFacade ddl_functionalstatus ;
		@FindBy(id = "AFFILIATE_OWNER")
		public WebElementFacade ddl_Affiliate_Owner ;
		
		@FindBy(xpath="(//span[@class='input-group-addon span-img']/img)[3]")
		public WebElementFacade btn_subscriberName;
		
		@FindBy(xpath=".//*[@id='addShelf']/div[5]/div[2]/input[@value='LookUp']")
		public WebElementFacade btn_subscriberLookUp;
		
		@FindBy(xpath=".//*[@id='subscriber_lookup_0']/tbody/tr/td[1]/a/span")
		public WebElementFacade lnk_subscriberName;
		
		@FindBy(xpath="(//div[@class='row form-group-device'])[16]/div[3]//img")
		public WebElementFacade btn_searchSubscriberName;
		
		@FindBy(xpath="(//input[@value='Save'])[1]")
		public WebElementFacade btn_saveDeviceDetail;
		
		@FindBy(id="AerialOrBuried")
	       public WebElementFacade ddl_AerialOrBuried;
	       
	       @FindBy(id="AFFILIATE_OWNER")
	       public WebElementFacade ddl_AffiliateOwner;
	       
	       @FindBy(id="INDOOR")
	       public WebElementFacade ddl_IndoororOutdoor;
	       
	       @FindBy(id="InstallationIndicator")
	       public WebElementFacade ddl_SelfTechInstall;
	       
	       @FindBy(id="FiberProvisioning")
	       public WebElementFacade ddl_InfrastructureBuildOrServiceProvisioning;

		
		//End of editing device page
		
	//New Changes -- 9/23
		
		@FindBy(id="streetType")
		public WebElementFacade ddl_wireCenterstreetType;
		
		@FindBy(id="city")
		public WebElementFacade tbx_wireCenterCity;

		@FindBy(id="state")
		public WebElementFacade tbx_wireCenterstate;
		
		@FindBy(id="zip")
		public WebElementFacade tbx_wireCenterzip;
		
		@FindBy(xpath="(//button[text()='Look Up'])[1]")
		public WebElementFacade btn_wireCenterLookUp;
		
		@FindBy(xpath="(//button[text()='Cancel'])[1]")
		public WebElementFacade btn_wireCenterCancel;
		
		// Start of Location Address Details lookup
		
		@FindBy(id = "loclkp")
		public WebElementFacade btn_Locationlookup ;

		@FindBy(xpath = ".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[1]/input")
		public WebElementFacade tbx_address ; 

		@FindBy(xpath = "//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
		public WebElementFacade tbx_streetname ;

		@FindBy(xpath = "//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
		public WebElementFacade tbx_Building_CLLi ;

		@FindBy(xpath = "//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[5]/button[text()='Look Up']")
		public WebElementFacade btn_lookup ;
		
		@FindBy(id = "locationAddress")
		public WebElementFacade tbx_location_address ;
		
		@FindBy(xpath = "//*[@ng-click='lookupGridSettings.selLukupValue(1)']")
		public WebElementFacade lnk_address ;

		@FindBy(xpath=".//*[@id='IS_DIVERSE']")
		public WebElementFacade ddl_IsDiversedForNPE;
	
		@FindBy(id = "DEVICE_DESIGNATOR")
		public WebElementFacade tbx_designator ;
		

// End of Location Address section details
		
		
		
		@FindBy(xpath = "//*[@value='LookUp' and @ng-click='lookUp()']")
		public WebElementFacade btn_lookup_window ;
		
		
		// ***************************** Device creation based on ROle & Technology --- 22/2/2017 ************************************//
		
		@FindBy(xpath=".//*[@value='GPON' and @ng-model='deviceTech']")
		public WebElementFacade rbn_Createdevice_Gpontechnology;
		
		@FindBy(xpath=".//*[@value='ETHERNET' and @ng-model='deviceTech']")
		public WebElementFacade rbn_Createdevice_Ethernettechnology;
		
		@FindBy(xpath=".//*[@value='PASSIVE' and @ng-model='deviceTech']")
		public WebElementFacade rbn_Createdevice_passivetechnology;
		
		@FindBy(xpath=".//*[@ng-controller='topologyLookupCtrl']//*[@id='topologylookup']//*[@value='Look Up']")
		public WebElementFacade btn_Createdevice_topology_lookup;
		
		
		@FindBy(xpath=".//*[@ng-controller='topologyLookupCtrl']//*[@id='topologylookup']//*[@value='Associate Topology']")
		public WebElementFacade btn_Createdevice_topology_associate;
		
		
		@FindBy(xpath="//*[@ng-controller='inventoryDeviceCreateCtrl']//*[@ng-model='invSubscriber.subscriberName']")
		public WebElementFacade tbx_Createdevice_subscribername;
		
		@FindBy(xpath="//*[@ng-controller='inventoryDeviceCreateCtrl']//*[@value='LookUp' and @ng-click='lookUp()']")
		public WebElementFacade btn_Createdevice_subscriber_lookup;
		
		@FindBy(xpath="//*[@ng-controller='inventoryDeviceCreateCtrl']//tr[1][@on-finish-render='loadSearchDetailDataTable']//span")
		public WebElementFacade lbl_Createdevice_subscriber_associate;
		
		@FindBy(xpath="//input[@id='SplitterGroupNumber']")
		public WebElementFacade tbx_Splitter_no;
		
		
		@FindBy(xpath="//input[@id='StartPortNumber']")
		public WebElementFacade tbx_Splitter_port;
		
		
		
		// ***************************************************************************************************************************** ************************************//	
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Device Details')]")
		public WebElementFacade tab_serach_device_Device_details;
		
		@FindBy(xpath=".//*[@ng-show='islocerror']")
		public WebElementFacade lbl_Createdevice_locationclli_errormsg;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
		public WebElementFacade lbl_Createdevice_alertmsg;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']/button")
		public WebElementFacade btn_Createdevice_alertmsg_clsicon;
		
		//##################################################  Device Create screen Sanity Definitions ############################################################//
		
		//------------------------------------------------  Device Details screen -------------------------------------------------------------------------------//
		
		@FindBy(xpath=".//*[@id='RELATIVENAME']/parent::div/preceding-sibling::label")
		public WebElementFacade lbl_Createdevice_subscribername;
		
		@FindBy(xpath = "//*[@ng-click='openSubscriberLookUp(field.name)']")
		public WebElementFacade btn_subscriberlookupicon;
		
		
		@FindBy(xpath=".//*[@id='NETWORKROLES']/option[@value='0']")
		public WebElementFacade lbl_devicecreate_euipt_role;
		
		@FindBy(id="SNMP_VERSION")
		public WebElementFacade ddl_devicecreate_snmpversion;
		
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Device Details']")
		public WebElementFacade lbl_Createdevice_devicedetails; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Device Role']")
		public WebElementFacade lbl_Createdevice_devicerole;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Filter By']")
		public WebElementFacade lbl_Createdevice_filterby;
		
/*		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-if=\"deviceTech=='ETHERNET'\"]//*[@ng-click='createActivateClick(createActivate)']/parent::label/preceding-sibling::div[5]/label")
		public WebElementFacade lbl_Createdevice_subscribersection;*/
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-click='createActivateClick(createActivate)']")
		public WebElementFacade btn_Createdevice_craete_activationtask;
		
		
		@FindBy(id="SNMP_PORT_ID")
		public WebElementFacade tbx_Createdevice_snmpPortnumber;
		
		@FindBy(id="SNMP_VERSION")
		public WebElementFacade ddl_Createdevice_snmpversion;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Affiliate Owner')]")
		public WebElementFacade lbl_Createdevice_affiliateowner;
		
		//####################		ONT Device Create page for MST device linking 	####################################//
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openFDHCLLILookUp(field.name)']")
		public WebElementFacade btn_Createdevice_FiberDistributionNode_lookup;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@ng-controller='fdhClliLookUpCtrl']//input[@ng-model='locationlkp.BuildingCLLI']")
		public WebElementFacade tbx_Createdevice_FiberDistributionNode_lookup_buildingclli;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@ng-controller='fdhClliLookUpCtrl']//button[@ng-click='lookUpCall()']")
		public WebElementFacade btn_Createdevice_FiberDistributionNode_lookup_lckicon;		
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@ng-controller='fdhClliLookUpCtrl']//div[@title='next']/div")
		public WebElementFacade btn_Createdevice_FiberDistributionNode_lookup_nexticon;
		
		@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@ng-controller='fdhClliLookUpCtrl']//a[contains(@ng-click,'lookupGridSettings.selLukupValue(')])[1]")
				public WebElementFacade lbl_Createdevice_FiberDistributionNode_lookup_result;
				
		@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@ng-controller='fdhClliLookUpCtrl']//div[contains(text(),'MST')]/../preceding-sibling::div//a)[1]")
				public WebElementFacade lbl_Createdevice_FiberDistributionNode_lookup_resultmst;
				
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//select[@id='FiberPort']")
		public WebElementFacade lbl_Createdevice_FiberDistributionNode_port;		
		
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String window_switch(){
		//String Parent_Window = driver.getWindowHandle();
		String Parent_Window = getDriver().getWindowHandle();
		//btn_locationLookup);
		try {			
			//Thread.sleep(5000);
			slf4jLogger.info("cliked on location lookup");
			Thread.sleep(3000);
			//Set<String> allWindowHandles = getDriver().getWindowHandles();
			for (String allWindowHandles1 : getDriver().getWindowHandles()) {
				 
	        	slf4jLogger.info(allWindowHandles1);

	        	getDriver().switchTo().window(allWindowHandles1);
	        	slf4jLogger.info("switched..............");
	        	Thread.sleep(1000);
	        	
			} 
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return Parent_Window;
	}
	public void switch_win(String parentwin){
			//btn_locationLookup);
			try {
				//Thread.sleep(5000);
				//WebDriverWait wait = new WebDriverWait(getDriver(), 1000);
				//slf4jLogger.info("cliked on location lookup");
				//Thread.sleep(5000);
				//Set<String> allWindowHandles = getDriver().getWindowHandles();
				//for (String allWindowHandles1 : getDriver().getWindowHandles()) {
					 
		        //	slf4jLogger.info(allWindowHandles1);

		       // 	getDriver().switchTo().window(allWindowHandles1);
		        //	slf4jLogger.info("switched..............");
		        	//}
				//slf4jLogger.info(enduser.get_container_from_xml("OVCreateDevicePage","US43123-TC24409","Locationdata").getFieldValue("tbx_buildingclli").toString());
					//Thread.sleep(10000);
				//	enduser.locn_field();
					//slf4jLogger.info(enduser.get_data_for_page(actvtnpage).getContainer(ctag_range));
					//btn_lookUp);
				Thread.sleep(3000);
				waitForElement(lnk_addlcn);
					Thread.sleep(3000);
				
					jsClick(lnk_addlcn);  
					
					getDriver().switchTo().window(parentwin);
					Thread.sleep(5000);
					//lnk_addlcn);
					//Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//btn_lookUp);

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
	

	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),200);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}
	
	public void form_field(){
		//WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		try {
			//Thread.sleep(5000);
		//rdbtn_Shared);
		Thread.sleep(5000);
		//slf4jLogger.info(lbl_wire_clli.getText());
		jsClick(btn_Create);
		Thread.sleep(3000);
		if(lbl_Createdevice_alertmsg.isCurrentlyVisible()){
			String Message=lbl_Createdevice_alertmsg.getText().trim();
			
			if(Message.contains("Please use Topology lookup to associate Topology.")){
				tbx_createdevice_Topologyfield.type("NVNTW4203");
			} jsClick(btn_Createdevice_alertmsg_clsicon); 
			
			jsClick(btn_Create);
			Thread.sleep(3000);
		}
		waitForElement(btn_Edit);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void topology_fill(){
		try {
			waitForElement(btn_TopologylookUp);
			
		//btn_Topologysearch);
		// After search selecting 
			jsClick(btn_TopologylookUp);
		Thread.sleep(5000);
		waitForElement(ckb_TopologylookUp);
		
		//ckb_TopologylookUp.sendKeys(Keys.SPACE);
		
	//getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@role='columnheader']//div[@aria-checked='false']")).
		//((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", ckb_TopologylookUp);
		//window_switch();
		jsClick(ckb_TopologylookUp);
		Thread.sleep(3000);
		ckb_TopologylookUp.click();
		
		
		Thread.sleep(3000);
		jsClick(btn_AssociateTopology);
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean validatingAtributesOfPassiveCreatePage(String devtype)
	{
		List<WebElementFacade> acutalList = lbl_allXapath;
		ArrayList<String> atributesOfPage=new ArrayList<String>();
		for(int j=0;j<acutalList.size();j++){
			atributesOfPage.add(j, acutalList.get(j).getText());
		}
		if(devtype.equals("PASSIVE")){
			for(int j=0;j<atributesOfPage.size();){
				slf4jLogger.info(atributesOfPage.get(j));
				if(atributesOfPage.get(j).equals("Is Diverse") || atributesOfPage.get(j).equals("Affiliate Owner *") || atributesOfPage.get(j).equals("Monitoring Type") || atributesOfPage.get(j).equals("Management VLAN") || atributesOfPage.get(j).equals("SNMP Port Number") || atributesOfPage.get(j).equals("SNMP Version") || atributesOfPage.get(j).equals("SNMP User") || atributesOfPage.get(j).equals("Management IP Subnet Mask") || atributesOfPage.get(j).equals("RO Community String")){
					return false;
				}
					j++;					
			}
		}
	
		else if(devtype.equals("ONT")){
			for(int j=0;j<atributesOfPage.size();){
				slf4jLogger.info(atributesOfPage.get(j));
				if(atributesOfPage.get(j).equals("Power Supply*") || atributesOfPage.get(j).equals("Fiber Distribution Node*") || atributesOfPage.get(j).equals("Fiber Distribution Node-Port*") || atributesOfPage.get(j).equals("Fiber Cable Name*") || atributesOfPage.get(j).equals("Fiber Strand ID*") ){
					return false;
				}
					j++;				
			}
		
		
	
		}
		
		/*
		String[] expectedList = {"Is Diverse","Affiliate Owner *","Monitoring Type","Management VLAN","SNMP Port Number","SNMP Version","SNMP User","Management IP Subnet Mask","RO Community String"};
		   
		List<WebElementFacade> acutalList = lbl_allXapath;

		for(int j=0;j<acutalList.size();j++){

		  // list.get(i).getText();
			acutalList.get(j);
		   slf4jLogger.info(acutalList.get(j).getText());
		   //
		   for (int i=0; i<expectedList.length; i++){
				 
			      if (!(acutalList.get(j).getText().equals(expectedList[i])))
			    		 // {
			        
			        //slf4jLogger.info(acutalList.get(j).getText()+"==="+expectedList[i]);
			    	  
			      //}
			      slf4jLogger.info(acutalList.get(j).getText()+"==="+expectedList[i]);
			    }		    
		  }
		  */
		slf4jLogger.info("these are not present in the list...");
		 // Assert.assertTrue(match);
		 // converting list to string[]		 
		return true;
	}
	
	public void IsRadioButtonPresent()
	 {
		 if( rbn_passive.isDisplayed() && rbn_all.isDisplayed()){
			slf4jLogger.info("passive and all radibutton is Visible");
			}else{
			slf4jLogger.info("Element is InVisible");
			}
	 }
	
	public boolean isRadioButtonSelected(String radioButton) throws Throwable 
		{
				boolean isRadioButtonSelected=false;
				slf4jLogger.info(radioButton+"..............");
				Thread.sleep(3000);
		
				if(radioButton.equals("PASSIVE")){
					if(rbn_passive.isSelected())
					{
						isRadioButtonSelected=true;
						slf4jLogger.info(radioButton+"is seclected");
					}					
				}
				else if(rbn_ethernet.isSelected())
				{
					isRadioButtonSelected=true;
					slf4jLogger.info(radioButton+"is seclected");
				}
				else if(radioButton.equals("GPON")){
					if(rbn_Gpon.isSelected())
					{
						isRadioButtonSelected=true;
						slf4jLogger.info(radioButton+"is seclected");
					}		
				}					
									
	return isRadioButtonSelected;
	}
	
	public boolean isLocationCLLIMandatory() throws Throwable {
			String LocationClli=lbl_locationClli.getText();
		  
            boolean isLocationCLLIMandatory=false;
		    if(LocationClli.contains ("*"))
		    	{
		    	isLocationCLLIMandatory=true;
		    	
              //String parts[] = LocationClli.split("[+]");
		        //LocationClli =  parts[0]; // i want to strip part after  +
		    	}
		    System.out.println(isLocationCLLIMandatory);	
		    	tbx_locationClli.sendKeys("TESTYYYY");
		    	Thread.sleep(2000);
		    	tbx_locationClli.clear();
		    	if(lbl_Createdevice_locationclli_errormsg.isCurrentlyVisible()){
		    		throw new Error("Getting error message displayed at location clli");	 
		    	}
		    	return isLocationCLLIMandatory;
	    	}
	
	//To filter the unwanted text --- By Sairam
	public String create_device_successfull_msg() {
		String message=success_alert.getText();
		String[] msg1 = message.split(":"); 
		message=msg1[2].replaceAll("\\s","");;
		 slf4jLogger.info(message);
		return message.trim();
		}
	
	public void clickcreate(){
		jsClick(btn_Create);
	}
	
	
	public void create_msg(){
		jsClick(tab_createdevice);
		try {
			Thread.sleep(5000);
		
		WebElement ele = ddl_Equipment_role.selectByValue("0");
		String role =ele.getText();
		created_device_role_is(":"+role+" "+create_device_successfull_msg());
		slf4jLogger.info("*******************"+create_device_successfull_msg());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void created_device_role_is(String deviceName) throws InterruptedException
	{
		 
		 Thread.sleep(1000);
		 
		
	}
	
	public void Validate_attributes_in_create_device_page_splitter() { // Shiva

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);

		wait.until(ExpectedConditions.elementToBeClickable(ddl_Connector_type));

		try {
			Thread.sleep(5000);

			// List<WebElement> attributeList =
			// driver.findElements(By.xpath(".//*[@id='0']/ng-include/div/div[11]"));
			List<WebElement> attributeList = getDriver()
					.findElements(By.xpath(".//*[@class='control-label ng-binding']"));
			ArrayList<String> atributesOfPage = new ArrayList<String>();

			for (int j = 0; j < attributeList.size(); j++) {

				atributesOfPage.add(j, attributeList.get(j).getText());

				// slf4jLogger.info("Step Two done");

			}

			System.out.println(atributesOfPage);

			ArrayList<String> testAttributes = new ArrayList<String>();

			testAttributes.add(0, "Device Type*");
			testAttributes.add(1, "Device Subtype*");
			testAttributes.add(2, "Device CLLI*");
			testAttributes.add(3, "Relay Rack Shelf *");
			testAttributes.add(4, "Shared Flag *");
			testAttributes.add(5, "Is Diverse*");
			testAttributes.add(6, "Location CLLI");
			testAttributes.add(7, "Location Address*");
			testAttributes.add(8, "Functional Status");
			testAttributes.add(9, "Affiliate Owner *");
			testAttributes.add(10, "Monitoring Type");
			testAttributes.add(11, "Network Identifier");
			testAttributes.add(12, "Management VLAN");
			testAttributes.add(13, "Device Template");
			testAttributes.add(14, "Management IP Subnet Mask");
			testAttributes.add(15, "SNMP Port Number");
			testAttributes.add(16, "RO Community String");
			testAttributes.add(17, "Network Element Note");
			testAttributes.add(18, "Equipment Roles*");
			testAttributes.add(19, "Splitter Number*");
			testAttributes.add(20, "Splitter Start Port #*");
			testAttributes.add(21, "Fiber in count");
			testAttributes.add(22, "Fiber out count");
			testAttributes.add(23, "Connector Type*");
			testAttributes.add(24, "Aerial or Buried*");
			testAttributes.add(25, "Topology *");

			for (String attributeb : testAttributes) {
				slf4jLogger.info(attributeb);
			}

			if (atributesOfPage.containsAll(testAttributes)) {
				slf4jLogger.info("pass");
			} else {
				slf4jLogger.info("fail");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void validate_apacheSolr_for_subscriber_in_create_device_service_createpage() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);

		wait.until(ExpectedConditions.elementToBeClickable(tbx_SubscriberName));

		tbx_SubscriberName.sendKeys("united");
		
		List<String> autoSuggest = ddl_subscriberSolr.getSelectOptions();
		
		System.out.println(autoSuggest);
		
		
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(ddl_subscriberSolr));

		Thread.sleep(2000);
		if (ddl_subscriberSolr.isCurrentlyVisible()) {

			slf4jLogger.info("Apache SOLR feature is working fine");
		} else {
			slf4jLogger.info("Apache SOLR feature is NOT working");
		}
	}
	
	
	public void action_createscreen(String action) throws Throwable{
		switch(action){
		case "Create":form_field();break;
		}
	}
	
	
	public void technology_select_based_devicerole(String role) throws Throwable{
		String[] Devicerole=role.split("-");
		/*System.out.println("1="+Devicerole[0]);
		System.out.println("1="+Devicerole[1]);*/
		waitForElement(rbn_ethernet);
		Thread.sleep(2000);
		switch(Devicerole[0]){
		
		case "MST": jsClick(rbn_passive); break;
		case "CLIENT": jsClick(rbn_ethernet);/*Thread.sleep(2000); waitFor(ddl_devicecreate_snmpversion);ddl_devicecreate_snmpversion.selectByVisibleText("--Select--")*/; break;
		case "DSLAM": jsClick(rbn_ethernet);break;
		case "FDH": jsClick(rbn_Gpon);break;
		case "FDP": jsClick(rbn_passive);break;
		case "HOST": jsClick(rbn_ethernet);break;
		case "MSAP": jsClick(rbn_ethernet);break;
		case "NID": jsClick(rbn_ethernet);break;
		case "NPE": jsClick(rbn_ethernet);break;
		case "OLT": jsClick(rbn_Gpon);break;
		case "ONT": jsClick(rbn_Gpon);break;
		case "SPLITTER": jsClick(rbn_Gpon);break;
		case "BRAS": jsClick(rbn_ethernet);break;
		case "MDU":jsClick(rbn_Gpon);break;
		case "AGG": jsClick(rbn_ethernet);break;
		}
		
		Thread.sleep(5000);
	}
	
	
	
	public void Device_Sanity_validations() throws Throwable{
		waitForElement(btn_Create);
		slf4jLogger.info("Device Sanity Check"); Thread.sleep(3000);
		
		if(!tab_createdevice.isCurrentlyVisible()){
			 throw new Error("Device Create screen is not displayed");
		}
		
		if(!lbl_Createdevice_devicedetails.isCurrentlyVisible() && !lbl_Createdevice_devicerole.isCurrentlyVisible() && !lbl_Createdevice_filterby.isCurrentlyVisible()){
			 throw new Error("Device Details, Roles & Filter by header is displayed in Device Create screen");
		} 
		
		/*if(rbn_passive.isCurrentlyVisible()){
			slf4jLogger.info("rbn_passive buttons is not Diplayed & Enabled");
			
		}
		
		if(rbn_ethernet.isCurrentlyVisible()){
			slf4jLogger.info("rbn_ethernet buttons is not Diplayed & Enabled");
			
		}
		
		if(rbn_Gpon.isCurrentlyVisible()){
			slf4jLogger.info("rbn_Gpon buttons is not Diplayed & Enabled");
			
		}
		
		if(rbn_all.isCurrentlyVisible()){
			slf4jLogger.info("rbn_all buttons is not Diplayed & Enabled");
		}*/
		
		
		if(rbn_passive.isCurrentlyVisible() && rbn_ethernet.isCurrentlyVisible() && rbn_Gpon.isCurrentlyVisible() && rbn_all.isCurrentlyVisible()){
			if(lbl_createdevice_rbntext_passive.isCurrentlyVisible() && lbl_createdevice_rbntext_ethernet.isCurrentlyVisible() && lbl_createdevice_rbntext_Gpon.isCurrentlyVisible() && lbl_createdevice_rbntext_all.isCurrentlyVisible() ){
				slf4jLogger.info("Filter By Buttons are Diplayed & Enabled");
			} else throw new Error("Filter By Buttons are not displayed in Device Create screen");
		}  else throw new Error("Filter By Buttons are not displayed in Device Create screen");
		
		if(btn_Create.isCurrentlyVisible() && btn_Create.isCurrentlyEnabled() && btn_Reset.isCurrentlyVisible() && btn_Reset.isCurrentlyEnabled() ){
			slf4jLogger.info("Create & Reset Buttons are diplayed & enabled");
		} else throw new Error("Create & Reset Buttons are not displayed in Device Create screen");
		
		if(btn_locationLookup_newdevicecreateform.isCurrentlyVisible() && btn_locationLookup_newdevicecreateform.isCurrentlyEnabled()){
			slf4jLogger.info("Location lookup is diplayed & enabled");
		} else throw new Error("Location lookup Buttons are not displayed in Device Create screen");
		
	//	System.out.println("lbl_devicecreate_euipt_role="+lbl_devicecreate_euipt_role.getText());
		
		List<WebElementFacade> Devicecreate_attribute = lbl_allXapath;
		
		ArrayList<String> Devicecreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<Devicecreate_attribute.size();j++){
					Devicecreate_Fieldattributelist.add(j, Devicecreate_attribute.get(j).getText());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> List2compare_Device_Fieldattributelist=new ArrayList<String>();
				
		
		switch(lbl_devicecreate_euipt_role.getText()){
		
		case "NPE":  	List2compare_Device_Fieldattributelist.add(0, "Device Type*");
						List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
						List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
						List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
						List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
						List2compare_Device_Fieldattributelist.add(5, "Is Diverse");
						List2compare_Device_Fieldattributelist.add(6, "Location CLLI*");
						List2compare_Device_Fieldattributelist.add(7, "Location Address*");
						List2compare_Device_Fieldattributelist.add(8, "Functional Status");
						List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner *");
						List2compare_Device_Fieldattributelist.add(10, "Alias 1");
						List2compare_Device_Fieldattributelist.add(11, "Alias 2");
						List2compare_Device_Fieldattributelist.add(12, "Monitoring Type");
						List2compare_Device_Fieldattributelist.add(13, "Network Identifier");
						List2compare_Device_Fieldattributelist.add(14, "Management VLAN");						
						List2compare_Device_Fieldattributelist.add(15, "Management IP Subnet Mask");						
						List2compare_Device_Fieldattributelist.add(16, "Default Gateway");	
						List2compare_Device_Fieldattributelist.add(17, "Write Community String");
						List2compare_Device_Fieldattributelist.add(18, "SNMP Port Number");
						List2compare_Device_Fieldattributelist.add(19, "SNMP Version");						
						List2compare_Device_Fieldattributelist.add(20, "RO Community String");					
						List2compare_Device_Fieldattributelist.add(21, "SNMP User");
						List2compare_Device_Fieldattributelist.add(22, "Vectoring Type");
						List2compare_Device_Fieldattributelist.add(23, "Vectoring Topology");						 
						List2compare_Device_Fieldattributelist.add(24, "Network Element Note");
						List2compare_Device_Fieldattributelist.add(25, "Equipment Roles*");
						List2compare_Device_Fieldattributelist.add(26, "Is Offnet");
						if(!lbl_Createdevice_subscribername.isCurrentlyVisible() && lbl_Createdevice_subscribername.getText().trim().contains("Subscriber Name*") && !btn_subscriberlookupicon.isCurrentlyVisible()){
							throw new Error("Subscriber field is missing in Device Create screen");
						}
						
						if(!btn_Createdevice_craete_activationtask.isCurrentlyVisible()){
							throw new Error("Activation checkbox field is missing in Device Create screen");
						}
						
                        ddl_IsDiversed.selectByIndex(1);
                        ddl_AerialOrBuried.selectByIndex(1);
                        ddl_functionalstatus.selectByIndex(1);
                        ddl_AffiliateOwner.selectByIndex(1);

												
						break;
						
						
		case "MST": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
					List2compare_Device_Fieldattributelist.add(4, "Functional Status");
					List2compare_Device_Fieldattributelist.add(5, "Device Template");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");
					List2compare_Device_Fieldattributelist.add(8, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(9, "Network Identifier");					
					List2compare_Device_Fieldattributelist.add(10, "Alias 1");
					List2compare_Device_Fieldattributelist.add(11, "Alias 2");
					List2compare_Device_Fieldattributelist.add(12, "Vectoring Type");
					List2compare_Device_Fieldattributelist.add(13, "Vectoring Topology");					
					List2compare_Device_Fieldattributelist.add(14, "Network Element Note");
					List2compare_Device_Fieldattributelist.add(15, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(16, "Fiber in count");
					List2compare_Device_Fieldattributelist.add(17, "Fiber out count");
					List2compare_Device_Fieldattributelist.add(18, "Aerial or Buried*");
					List2compare_Device_Fieldattributelist.add(19, "Connector Type*");
					List2compare_Device_Fieldattributelist.add(20, "Topology *"); 
					if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
						throw new Error("Topology button is missing in Device Create screen");
					}
					
					ddl_functionalstatus.selectByIndex(1);
                    ddl_Connector_type.selectByIndex(1);
                    ddl_AerialOrBuried.selectByIndex(1);

					break;
			
		case "TD":  	List2compare_Device_Fieldattributelist.add(0, "Device Type*");
						List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
						List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
						List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
						List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
						List2compare_Device_Fieldattributelist.add(5, "Is Diverse");
						List2compare_Device_Fieldattributelist.add(6, "Location CLLI*");
						List2compare_Device_Fieldattributelist.add(7, "Location Address*");
						List2compare_Device_Fieldattributelist.add(8, "Functional Status");
						List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner *");
						List2compare_Device_Fieldattributelist.add(10, "Alias 1");
						List2compare_Device_Fieldattributelist.add(11, "Alias 2");
						List2compare_Device_Fieldattributelist.add(12, "Monitoring Type");
						List2compare_Device_Fieldattributelist.add(13, "Network Identifier");
						List2compare_Device_Fieldattributelist.add(14, "Management VLAN");						
						List2compare_Device_Fieldattributelist.add(15, "Management IP Subnet Mask");
						List2compare_Device_Fieldattributelist.add(16, "Default Gateway");	
						List2compare_Device_Fieldattributelist.add(17, "Write Community String");	
						List2compare_Device_Fieldattributelist.add(18, "SNMP Port Number");
						List2compare_Device_Fieldattributelist.add(19, "SNMP Version");						
						List2compare_Device_Fieldattributelist.add(20, "RO Community String");							
						List2compare_Device_Fieldattributelist.add(21, "SNMP User");
						List2compare_Device_Fieldattributelist.add(22, "Vectoring Type");
						List2compare_Device_Fieldattributelist.add(23, "Vectoring Topology");						
						List2compare_Device_Fieldattributelist.add(24, "Network Element Note");
						List2compare_Device_Fieldattributelist.add(25, "Equipment Roles*");
						List2compare_Device_Fieldattributelist.add(26, "Is Offnet");
						if(!lbl_Createdevice_subscribername.isCurrentlyVisible() && lbl_Createdevice_subscribername.equals("Subscriber Name*") && !btn_subscriberlookupicon.isCurrentlyVisible()){
							throw new Error("Subscriber field is missing in Device Create screen");
						}
						
						if(!btn_Createdevice_craete_activationtask.isCurrentlyVisible()){
							throw new Error("Activation checkbox field is missing in Device Create screen");
						}
						
                        ddl_functionalstatus.selectByIndex(1);   
                        ddl_IsDiversed.selectByIndex(1);
                        ddl_AffiliateOwner.selectByIndex(1);        											
						break;
						
		case "FDH": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
					List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(5, "Is Diverse *");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");
					List2compare_Device_Fieldattributelist.add(8, "Functional Status");
					List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner");
					List2compare_Device_Fieldattributelist.add(10, "Monitoring Type");					
					List2compare_Device_Fieldattributelist.add(11, "Device Template");					
					List2compare_Device_Fieldattributelist.add(12, "Network Identifier");	
					List2compare_Device_Fieldattributelist.add(13, "Management VLAN");
					List2compare_Device_Fieldattributelist.add(14, "Management IP Subnet Mask");
					List2compare_Device_Fieldattributelist.add(15, "Default Gateway");			
					List2compare_Device_Fieldattributelist.add(16, "SNMP Port Number");					
					List2compare_Device_Fieldattributelist.add(17, "RO Community String");						
					List2compare_Device_Fieldattributelist.add(18, "Vectoring Type");	
					List2compare_Device_Fieldattributelist.add(19, "Vectoring Topology");	
					List2compare_Device_Fieldattributelist.add(20, "Network Element Note");										
					List2compare_Device_Fieldattributelist.add(21, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(22, "Fiber in count");
					List2compare_Device_Fieldattributelist.add(23, "Fiber out count");
					List2compare_Device_Fieldattributelist.add(24, "Aerial or Buried*");
					List2compare_Device_Fieldattributelist.add(25, "Build Template");
					List2compare_Device_Fieldattributelist.add(26, "Topology *"); 
					if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
						throw new Error("Topology button is missing in Device Create screen");
					} 
					
					ddl_AerialOrBuried.selectByIndex(1);
                    ddl_functionalstatus.selectByIndex(1);
                    ddl_Connector_type.selectByIndex(1);

					break;
					
		case "FDP": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
					List2compare_Device_Fieldattributelist.add(4, "Functional Status");
					List2compare_Device_Fieldattributelist.add(5, "Device Template");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");					
					List2compare_Device_Fieldattributelist.add(8, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(9, "Network Identifier");
					List2compare_Device_Fieldattributelist.add(10, "Alias 1");
					List2compare_Device_Fieldattributelist.add(11, "Alias 2");
					List2compare_Device_Fieldattributelist.add(12, "Vectoring Type");		
					List2compare_Device_Fieldattributelist.add(13, "Vectoring Topology");					
					List2compare_Device_Fieldattributelist.add(14, "Network Element Note");					
					List2compare_Device_Fieldattributelist.add(15, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(16, "Fiber In Count");
					List2compare_Device_Fieldattributelist.add(17, "Fiber Out Count");
					List2compare_Device_Fieldattributelist.add(18, "Aerial or Buried*");
					List2compare_Device_Fieldattributelist.add(19, "Connector Type*");
					List2compare_Device_Fieldattributelist.add(20, "Topology *"); 
					if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
						throw new Error("Topology button is missing in Device Create screen");
					} 
                    ddl_AerialOrBuried.selectByIndex(1);
                    ddl_functionalstatus.selectByIndex(1);
                    ddl_Connector_type.selectByIndex(1);					
					break;
					
		case "HOST": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
						List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
						List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
						List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
						List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
						List2compare_Device_Fieldattributelist.add(5, "Is Diverse");
						List2compare_Device_Fieldattributelist.add(6, "Location CLLI*");
						List2compare_Device_Fieldattributelist.add(7, "Location Address*");
						List2compare_Device_Fieldattributelist.add(8, "Functional Status");
						List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner *");
						List2compare_Device_Fieldattributelist.add(10, "Alias 1");
						List2compare_Device_Fieldattributelist.add(11, "Alias 2");
						List2compare_Device_Fieldattributelist.add(12, "Monitoring Type");
						List2compare_Device_Fieldattributelist.add(13, "Network Identifier");
						List2compare_Device_Fieldattributelist.add(14, "Management VLAN");						
						List2compare_Device_Fieldattributelist.add(15, "Management IP Subnet Mask");
						List2compare_Device_Fieldattributelist.add(16, "Default Gateway");	
						List2compare_Device_Fieldattributelist.add(17, "Write Community String");	
						List2compare_Device_Fieldattributelist.add(18, "SNMP Port Number");
						List2compare_Device_Fieldattributelist.add(19, "SNMP Version");
						List2compare_Device_Fieldattributelist.add(20, "RO Community String");						
						List2compare_Device_Fieldattributelist.add(21, "SNMP User");
						List2compare_Device_Fieldattributelist.add(22, "Vectoring Type");
						List2compare_Device_Fieldattributelist.add(23, "Vectoring Topology");						
						List2compare_Device_Fieldattributelist.add(24, "Network Element Note");
						List2compare_Device_Fieldattributelist.add(25, "Equipment Roles*");
						List2compare_Device_Fieldattributelist.add(26, "Is Offnet");
						if(!lbl_Createdevice_subscribername.isCurrentlyVisible() && lbl_Createdevice_subscribername.equals("Subscriber Name*") && !btn_subscriberlookupicon.isCurrentlyVisible()){
							throw new Error("Subscriber field is missing in Device Create screen");
						}
						
						if(!btn_Createdevice_craete_activationtask.isCurrentlyVisible()){
							throw new Error("Activation checkbox field is missing in Device Create screen");
						}
							
                        ddl_functionalstatus.selectByIndex(1);   
                        ddl_IsDiversed.selectByIndex(1);
                        ddl_AffiliateOwner.selectByIndex(1);                                 

						break;
						
		case "NID": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
					List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(5, "Is Diverse");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI*");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");
					List2compare_Device_Fieldattributelist.add(8, "Functional Status");
					List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner *");
					List2compare_Device_Fieldattributelist.add(10, "Alias 1");
					List2compare_Device_Fieldattributelist.add(11, "Alias 2");
					List2compare_Device_Fieldattributelist.add(12, "Monitoring Type");
					List2compare_Device_Fieldattributelist.add(13, "Network Identifier");
					List2compare_Device_Fieldattributelist.add(14, "Management VLAN");						
					List2compare_Device_Fieldattributelist.add(15, "Management IP Subnet Mask");
					List2compare_Device_Fieldattributelist.add(16, "Default Gateway");	
					List2compare_Device_Fieldattributelist.add(17, "Write Community String");	
					List2compare_Device_Fieldattributelist.add(18, "SNMP Port Number");
					List2compare_Device_Fieldattributelist.add(19, "SNMP Version");					
					List2compare_Device_Fieldattributelist.add(20, "RO Community String");				
					List2compare_Device_Fieldattributelist.add(21, "SNMP User");
					List2compare_Device_Fieldattributelist.add(22, "Vectoring Type");
					List2compare_Device_Fieldattributelist.add(23, "Vectoring Topology");					
					List2compare_Device_Fieldattributelist.add(24, "Network Element Note");
					List2compare_Device_Fieldattributelist.add(25, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(26, "Is Offnet");
					if(!lbl_Createdevice_subscribername.isCurrentlyVisible() && lbl_Createdevice_subscribername.equals("Subscriber Name*") && !btn_subscriberlookupicon.isCurrentlyVisible()){
						throw new Error("Subscriber field is missing in Device Create screen");
					}
					
					if(!btn_Createdevice_craete_activationtask.isCurrentlyVisible()){
						throw new Error("Activation checkbox field is missing in Device Create screen");
					}
						
                    ddl_functionalstatus.selectByIndex(1);   
                    ddl_IsDiversed.selectByIndex(1);
                    ddl_AffiliateOwner.selectByIndex(1);                                 
					break;
					
		case "OLT": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
					List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(5, "Is Diverse *");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");
					List2compare_Device_Fieldattributelist.add(8, "Functional Status *");
					List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner *");
					List2compare_Device_Fieldattributelist.add(10, "Monitoring Type");					
					List2compare_Device_Fieldattributelist.add(11, "Device Template");					
					List2compare_Device_Fieldattributelist.add(12, "Network Identifier");	
					List2compare_Device_Fieldattributelist.add(13, "Management VLAN");
					List2compare_Device_Fieldattributelist.add(14, "Management IP Subnet Mask");
					List2compare_Device_Fieldattributelist.add(15, "Default Gateway");
					List2compare_Device_Fieldattributelist.add(16, "SNMP Port Number");					
					List2compare_Device_Fieldattributelist.add(17, "RO Community String");						
					List2compare_Device_Fieldattributelist.add(18, "Vectoring Type");
					List2compare_Device_Fieldattributelist.add(19, "Vectoring Topology");					
					List2compare_Device_Fieldattributelist.add(20, "Network Element Note");					
					List2compare_Device_Fieldattributelist.add(21, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(22, "1 Gbps Indicator");
					List2compare_Device_Fieldattributelist.add(23, "Build Template");
					List2compare_Device_Fieldattributelist.add(24, "Network Node #");
					List2compare_Device_Fieldattributelist.add(25, "Stack Ring Sequence #");
					List2compare_Device_Fieldattributelist.add(26, "Stack Ring Shelf Identifier");
					List2compare_Device_Fieldattributelist.add(27, "NOSA Certification");					
					List2compare_Device_Fieldattributelist.add(28, "Topology *"); 
					if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
						throw new Error("Topology button is missing in Device Create screen");
					} 
					
					ddl_functionalstatus.selectByIndex(1);   
                    ddl_IsDiversed.selectByIndex(1);
                    ddl_AffiliateOwner.selectByIndex(1);

					break;
					
					
		case "ONT": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf");
					List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(5, "Is Diverse *");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");
					List2compare_Device_Fieldattributelist.add(8, "Functional Status *");
					List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner");
					List2compare_Device_Fieldattributelist.add(10, "Monitoring Type");					
					List2compare_Device_Fieldattributelist.add(11, "Device Template");					
					List2compare_Device_Fieldattributelist.add(12, "Network Identifier");	
					List2compare_Device_Fieldattributelist.add(13, "Management VLAN");
					List2compare_Device_Fieldattributelist.add(14, "Management IP Subnet Mask");
					List2compare_Device_Fieldattributelist.add(15, "Default Gateway");		
					List2compare_Device_Fieldattributelist.add(16, "SNMP Port Number");
					List2compare_Device_Fieldattributelist.add(17, "RO Community String");						
					List2compare_Device_Fieldattributelist.add(18, "Vectoring Type");	
					List2compare_Device_Fieldattributelist.add(19, "Vectoring Topology");					
					List2compare_Device_Fieldattributelist.add(20, "Network Element Note");					
					List2compare_Device_Fieldattributelist.add(21, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(22, "Power Supply");
					List2compare_Device_Fieldattributelist.add(23, "Indoor or Outdoor*");
					List2compare_Device_Fieldattributelist.add(24, "Self/Tech Install*");
					List2compare_Device_Fieldattributelist.add(25, "RONTA ID*");
					List2compare_Device_Fieldattributelist.add(26, "ONT ID");										
					List2compare_Device_Fieldattributelist.add(27, "Topology *");
					List2compare_Device_Fieldattributelist.add(28, "Fiber Distribution Node");
					List2compare_Device_Fieldattributelist.add(29, "Fiber Distribution Node-Port");
					List2compare_Device_Fieldattributelist.add(30, "Fiber Cable Name");
					List2compare_Device_Fieldattributelist.add(31, "Aerial or Buried*");
					List2compare_Device_Fieldattributelist.add(32, "Infrastructure Build Or Service Provisioning*");
					List2compare_Device_Fieldattributelist.add(33, "Fiber Strand ID");
					if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
						throw new Error("Topology button is missing in Device Create screen");
					} 
                    ddl_IndoororOutdoor.selectByIndex(1);
                    ddl_SelfTechInstall.selectByIndex(1);
                    ddl_InfrastructureBuildOrServiceProvisioning.selectByIndex(1);
                    ddl_functionalstatus.selectByIndex(1);   
                    ddl_IsDiversed.selectByIndex(1);
					
					break;
					
		case "SPLITTER": 	List2compare_Device_Fieldattributelist.add(0, "Device Type*");
							List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
							List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
							List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
							List2compare_Device_Fieldattributelist.add(4, "Functional Status");
							List2compare_Device_Fieldattributelist.add(5, "Device Template");
							List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
							List2compare_Device_Fieldattributelist.add(7, "Location Address*");					
							List2compare_Device_Fieldattributelist.add(8, "Shared Flag *");
							List2compare_Device_Fieldattributelist.add(9, "Network Identifier");
							List2compare_Device_Fieldattributelist.add(10, "Alias 1");
							List2compare_Device_Fieldattributelist.add(11, "Alias 2");
							List2compare_Device_Fieldattributelist.add(12, "Vectoring Type");	
							List2compare_Device_Fieldattributelist.add(13, "Vectoring Topology");							
							List2compare_Device_Fieldattributelist.add(14, "Network Element Note");					
							List2compare_Device_Fieldattributelist.add(15, "Equipment Roles*");
							List2compare_Device_Fieldattributelist.add(16, "Splitter Number *");
							List2compare_Device_Fieldattributelist.add(17, "Splitter Start Port # *");
							List2compare_Device_Fieldattributelist.add(18, "Fiber in count");
							List2compare_Device_Fieldattributelist.add(19, "Fiber out count");
							List2compare_Device_Fieldattributelist.add(20, "Connector Type*");
							List2compare_Device_Fieldattributelist.add(21, "Aerial or Buried*");							
							List2compare_Device_Fieldattributelist.add(22, "Topology *"); 
							if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
								throw new Error("Topology button is missing in Device Create screen");
							} 
                            ddl_AerialOrBuried.selectByIndex(1);
                            ddl_functionalstatus.selectByIndex(1);
                            ddl_Connector_type.selectByIndex(1);

							
							break;
							
		case "MDU": List2compare_Device_Fieldattributelist.add(0, "Device Type*");
					List2compare_Device_Fieldattributelist.add(1, "Device Subtype*");
					List2compare_Device_Fieldattributelist.add(2, "Device CLLI*");
					List2compare_Device_Fieldattributelist.add(3, "Relay Rack Shelf *");
					List2compare_Device_Fieldattributelist.add(4, "Shared Flag *");
					List2compare_Device_Fieldattributelist.add(5, "Is Diverse *");
					List2compare_Device_Fieldattributelist.add(6, "Location CLLI");
					List2compare_Device_Fieldattributelist.add(7, "Location Address*");
					List2compare_Device_Fieldattributelist.add(8, "Functional Status *");
					List2compare_Device_Fieldattributelist.add(9, "Affiliate Owner");
					List2compare_Device_Fieldattributelist.add(10, "Monitoring Type");					
					List2compare_Device_Fieldattributelist.add(11, "Device Template");					
					List2compare_Device_Fieldattributelist.add(12, "Network Identifier");	
					List2compare_Device_Fieldattributelist.add(13, "Management VLAN");
					List2compare_Device_Fieldattributelist.add(14, "Management IP Subnet Mask");
					List2compare_Device_Fieldattributelist.add(15, "Default Gateway");	
					List2compare_Device_Fieldattributelist.add(16, "SNMP Port Number");					
					List2compare_Device_Fieldattributelist.add(17, "RO Community String");						
					List2compare_Device_Fieldattributelist.add(18, "Vectoring Type");
					List2compare_Device_Fieldattributelist.add(19, "Vectoring Topology");					
					List2compare_Device_Fieldattributelist.add(20, "Network Element Note");					
					List2compare_Device_Fieldattributelist.add(21, "Equipment Roles*");
					List2compare_Device_Fieldattributelist.add(22, "Build Template");
					List2compare_Device_Fieldattributelist.add(23, "FDH CLLI");					
					List2compare_Device_Fieldattributelist.add(24, "Topology *"); 
					if(!btn_Topologysearch.isCurrentlyVisible() && btn_Topologysearch.isCurrentlyEnabled()){
						throw new Error("Topology button is missing in Device Create screen");
					} 
                    
                    ddl_IsDiversed.selectByIndex(1);
                    ddl_functionalstatus.selectByIndex(1);   					
					break;
						
		}
		
	
		
		
		for(int i=0;i<Devicecreate_Fieldattributelist.size();i++){
			if(!Devicecreate_Fieldattributelist.get(i).contains(List2compare_Device_Fieldattributelist.get(i))){
				slf4jLogger.info("Devicecreate_Fieldattributelist="+Devicecreate_Fieldattributelist.get(i));
				slf4jLogger.info("List2compare_Device_Fieldattributelist="+List2compare_Device_Fieldattributelist.get(i)+" Not matching");
				slf4jLogger.info("Devicecreate_Fieldattributelist all fields="+Devicecreate_Fieldattributelist);
				throw new Error("Fields are not matching check");
			}
		}
		slf4jLogger.info("Device Create field attributes are expected as per "+lbl_devicecreate_euipt_role.getText()+" Device role");
	}
	
	//GPON Netwrok Build steps below
	
/*	public void gpon_ntwdevice_select(String devicetype){
		try {	
			if(devicetype.equals("ONT")){
				btn_gpon_ONT);
				Thread.sleep(2000);	
			}			
			Thread.sleep(2000);
			btn_gpon_tab0);
			Thread.sleep(2000);
			rdbtn_gpon_select);
			btn_gpon_expand);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}*/
	
	//-------------------------------------ANKIT-------------------------------------------------------
	
	public void verify_validation(String validation)  throws Throwable {	
		String Message;
		switch(validation){
		case "Affiliate Owner field is not mandatory for GPON Device":

			if(lbl_Createdevice_affiliateowner.getText().trim().contains("*")){
				slf4jLogger.debug("Affiliate Owner field is mandatory for GPON Device");
				throw new Error("Affiliate Owner field is mandatory for GPON Device");
			}
			
			break;
		case "select a MST device in the Fiber Distribution Node":
							waitForElement(btn_Createdevice_FiberDistributionNode_lookup);
							jsClick(btn_Createdevice_FiberDistributionNode_lookup);
							waitForElement(btn_Createdevice_FiberDistributionNode_lookup_lckicon);
							tbx_Createdevice_FiberDistributionNode_lookup_buildingclli.type("LSVGNV01");
							jsClick(btn_Createdevice_FiberDistributionNode_lookup_lckicon);Thread.sleep(2000);
							waitForElement(lbl_Createdevice_FiberDistributionNode_lookup_result);
							while(!lbl_Createdevice_FiberDistributionNode_lookup_resultmst.isCurrentlyVisible()){	
								jsClick(btn_Createdevice_FiberDistributionNode_lookup_nexticon);Thread.sleep(1000);
							}
									jsClick(lbl_Createdevice_FiberDistributionNode_lookup_resultmst);	
									Thread.sleep(2000);
									lbl_Createdevice_FiberDistributionNode_port.selectByIndex(2);		
										break;
										
										
		case "whether wire center CLLI is present while creating a device":
							verify_validation("wire center clli field is not displayed in the device create screen");			
							break;
			
		case "select Create Activation Task in Device Create Screen":
								waitForElement(btn_Createdevice_craete_activationtask);
							btn_Createdevice_craete_activationtask.click(); Thread.sleep(2000);		
							break;
		case "Functional Status field as a asteriks sign in the device create screen":Thread.sleep(2000);		
							if(!getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//label[contains(text(),'Functional Status')]")).getText().contains("*")){
								slf4jLogger.debug("Functional Status is not mandatory field in the device create screen");
								throw new Error("Functional Status is not mandatory field in the device create screen");
							}break;
							
		case "error message is displayed while creating device Functional Status is mandatory":
									ddl_functionalstatus.selectByIndex(0);Thread.sleep(1000);
									jsClick(btn_Create);
									Thread.sleep(2000);
									waitForElement(lbl_Createdevice_alertmsg);
									Message = lbl_Createdevice_alertmsg.getText();
									Message = Message.toString().substring(1);
									
									Message = Message.trim(); 
								if(!Message.contains("Please select a Functional Status option.")){
									throw new Error("Invalid message is displayed as:"+Message);
								}jsClick(btn_Createdevice_alertmsg_clsicon); break;
		
		case "wire center clli field is not displayed in the device create screen":
							if(btn_wireclli.isCurrentlyVisible()){
								slf4jLogger.debug("wire center clli field is displayed in the device create screen");
								throw new Error("wire center clli field is displayed in the device create screen");
							}	break;
							
		case "set the Prism Nosa Certification to Yes in Device Create form":
						waitForElement(ddl_createdevice_prism_nosacert);ddl_createdevice_prism_nosacert.selectByVisibleText("Yes");			
						break;
			
		case "set a value SNMP Port number in Device create page":				
							waitForElement(tbx_Createdevice_snmpPortnumber);
							tbx_Createdevice_snmpPortnumber.type("654");			
							ddl_Createdevice_snmpversion.selectByVisibleText("V1");Thread.sleep(1000);	
							break;
							
		case "Vectoring Topology field drop down value should contain the Device clli in Device Create screen":
			waitForElement(ddl_createdevice_vectortopolgy);
			
			
			break;
		case "enter Location details in Device Create screen":		waitForElement(tbx_locationClli);	
																tbx_locationClli.type("HNSONVFS");Thread.sleep(1000);																	
																break;
																
		case "Vectoring field & Vectoring Topology should be displayed in Device Create screen":
																											if(!ddl_createdevice_vectortype.isCurrentlyEnabled() ){
																												slf4jLogger.debug("Vectoring field is not displayed in Device Create screen");
																												throw new Error("Vectoring field is not displayed in Device Create screen");
																											}
																											
																											if(!ddl_createdevice_vectortopolgy.isCurrentlyEnabled() ){
																												slf4jLogger.debug("Vectoring Topology is not displayed in Device Create screen");
																												throw new Error("Vectoring Topology is not displayed in Device Create screen");
																											}
																											
																											
																											break;
		case "on selecting Vectoring Topology as Create Vectoring Topology value Topology Create Pop window should be displayed":waitForElement(ddl_createdevice_vectortype);	ddl_createdevice_vectortype.selectByVisibleText("192 Internal");
																														ddl_createdevice_vectortype.selectByVisibleText("384 External");Thread.sleep(1000);
																														ddl_createdevice_vectortopolgy.selectByVisibleText("Create Vectoring Topology");Thread.sleep(1000);	waitForElement(btn_createdevice_Topologysave);
																														
																														if(!btn_createdevice_Topologysave.isCurrentlyEnabled() && !btn_createdevice_Topologysave.isCurrentlyVisible() ){
																															slf4jLogger.debug("Topology Create Save button Popup window is not displayed");
																															throw new Error("Topology Create Save button Popup window is not displayed");
																														}

																														if(!tbx_createdevice_Topologynotes.isCurrentlyEnabled() ){
																															slf4jLogger.debug("Topology Create Notes Popup window is not displayed");
																															throw new Error("Topology Create Notes  Popup window is not displayed");
																														}
																														tbx_createdevice_Topologynotes.type("Test");jsClick(btn_createdevice_Topologysave);
																														break;
		
			
		case "a warning message should be displayed on selecting Vectoring field as External & not seleting Vectoring Topology in Device Create screen as Vectoring Topology is mandatory for External Vectoring Types." :waitForElement(ddl_createdevice_vectortype);	
																														ddl_createdevice_vectortype.selectByVisibleText("384 External");Thread.sleep(1000); jsClick(btn_Create);
																														Thread.sleep(3000);
																														waitForElement(lbl_Createdevice_alertmsg);
																														Message = lbl_Createdevice_alertmsg.getText();
																														Message = Message.toString().substring(1);
																														
																														Message = Message.trim(); 
																													if(!Message.contains("Vectoring Topology is mandatory for External Vectoring Types.")){
																														throw new Error("Invalid message is displayed as:"+Message);
																													}jsClick(btn_Createdevice_alertmsg_clsicon); break;
		
		case "should be able to select Internal & external drop down values under Vectoring field in Device Create screen":waitForElement(ddl_createdevice_vectortype);		
																												ddl_createdevice_vectortype.selectByVisibleText("192 Internal");	Thread.sleep(1000);
																												ddl_createdevice_vectortype.selectByVisibleText("384 Internal");Thread.sleep(1000);
																												ddl_createdevice_vectortype.selectByVisibleText("384 External");Thread.sleep(1000); break;
		
			
		case "on selecting Vectoring field as External in Device Create screen we should see warning message displayed as Please enter Device CLLI.." : waitForElement(ddl_createdevice_vectortype);			
																												ddl_createdevice_vectortype.selectByVisibleText("384 External");
																												waitForElement(lbl_Createdevice_alertmsg);
																												Message = lbl_Createdevice_alertmsg.getText();
																												Message = Message.toString().substring(1);
																												
																												Message = Message.trim(); 
																											if(!Message.contains("Please enter Device CLLI..")){
																												throw new Error("Invalid message is displayed as:"+Message);
																											}jsClick(btn_Createdevice_alertmsg_clsicon); break;
			
		case "Vectoring Type dropdown should display '192 Internal' and '384 External' value for device having role like DSLAM,MSAP":
															ddl_Equipment_role.selectByVisibleText("DSLAM"); Thread.sleep(2000);
															ddl_createdevice_vectortype.selectByVisibleText("192 Internal");			
															ddl_createdevice_vectortype.selectByVisibleText("384 External");
															ddl_Equipment_role.selectByVisibleText("MSAP");Thread.sleep(2000);
															ddl_createdevice_vectortype.selectByVisibleText("192 Internal");			
															ddl_createdevice_vectortype.selectByVisibleText("384 External");
															break;
		case "Vectoring Type dropdown should display '192 Internal' and '384 External' value for device having role like TD,OLT,DSLAM,MSAP":
															ddl_Equipment_role.selectByVisibleText("TD");Thread.sleep(2000);
															ddl_createdevice_vectortype.selectByVisibleText("192 Internal");															
															ddl_createdevice_vectortype.selectByVisibleText("384 External");
															ddl_Equipment_role.selectByVisibleText("OLT"); Thread.sleep(2000);
															ddl_createdevice_vectortype.selectByVisibleText("192 Internal");															
															ddl_createdevice_vectortype.selectByVisibleText("384 External");
															ddl_Equipment_role.selectByVisibleText("DSLAM"); Thread.sleep(2000);
															ddl_createdevice_vectortype.selectByVisibleText("192 Internal");															
															ddl_createdevice_vectortype.selectByVisibleText("384 External");
															ddl_Equipment_role.selectByVisibleText("MSAP");Thread.sleep(2000);
															ddl_createdevice_vectortype.selectByVisibleText("192 Internal");															
															ddl_createdevice_vectortype.selectByVisibleText("384 External");
															break;
		case "Vectoring Type dropdown should display '192 Internal' value for device having role like TD,DSLAM,AGG":
														ddl_Equipment_role.selectByVisibleText("TD");Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");														
														ddl_Equipment_role.selectByVisibleText("DSLAM"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");														
														ddl_Equipment_role.selectByVisibleText("AGG");Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");														
														break;
		case "an error message should be displayed as 'There are No vectoring types for current device subtype' in device create page":
														waitForElement(lbl_Createdevice_alertmsg);
														Message = lbl_Createdevice_alertmsg.getText();
														Message = Message.toString().substring(1);
														
														Message = Message.trim(); 
													if(!Message.contains("There are 'No' vectoring types for current device subtype")){
														throw new Error("Invalid message is displayed as:"+Message);
													}jsClick(btn_Createdevice_alertmsg_clsicon); break;
		case "change the device type to Calix 800G Series ONT & subtype to Calix 801G in Device create form":
														ddl_device_type_createform.selectByVisibleText("Calix 800G Series ONT"); Thread.sleep(2000); ddl_device_subtype_createform.selectByVisibleText("Calix 801G");Thread.sleep(2000);
														break;
		case "Vectoring Type dropdown should display '192 Internal','384 Internal' and '384 External' value for device having role like TD,OLT,DSLAM,AGG":
														ddl_Equipment_role.selectByVisibleText("TD");Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 External");
														ddl_Equipment_role.selectByVisibleText("OLT"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 External");
														ddl_Equipment_role.selectByVisibleText("DSLAM"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 External");
														ddl_Equipment_role.selectByVisibleText("AGG");Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("192 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_createdevice_vectortype.selectByVisibleText("384 External");
														break;
		case "Vectoring Type dropdown should display '384 Internal' value for device having role like TD,OLT,DSLAM,MSAP,NID":
														ddl_Equipment_role.selectByVisibleText("TD");Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_Equipment_role.selectByVisibleText("OLT"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_Equipment_role.selectByVisibleText("DSLAM"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_Equipment_role.selectByVisibleText("MSAP"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");
														ddl_Equipment_role.selectByVisibleText("NID"); Thread.sleep(2000);
														ddl_createdevice_vectortype.selectByVisibleText("384 Internal");		
															break;
		case "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask":
								tbx_devicecreate_mgntsubnetmask.type("OMNIVUE123"); jsClick(btn_Create); waitForElement(lbl_Createdevice_alertmsg);
								Message = lbl_Createdevice_alertmsg.getText();
								Message = Message.toString().substring(1);
								
								Message = Message.trim(); 
							if(!Message.contains("Please enter valid data for - Management IP Subnet Mask")){
								throw new Error("Invalid message is displayed as:"+Message);
							}jsClick(btn_Createdevice_alertmsg_clsicon);
							
							tbx_devicecreate_mgntsubnetmask.type("256.256.256.256"); jsClick(btn_Create); waitForElement(lbl_Createdevice_alertmsg);
							Message = lbl_Createdevice_alertmsg.getText();
							Message = Message.toString().substring(1);
							
							Message = Message.trim(); 
						if(!Message.contains("Please enter valid data for - Management IP Subnet Mask")){
							throw new Error("Invalid message is displayed as:"+Message);
						}jsClick(btn_Createdevice_alertmsg_clsicon);
							
						tbx_devicecreate_mgntsubnetmask.type("1.1.1.1.1"); jsClick(btn_Create); waitForElement(lbl_Createdevice_alertmsg);
						Message = lbl_Createdevice_alertmsg.getText();
						Message = Message.toString().substring(1);
						
						Message = Message.trim(); 
					if(!Message.contains("Please enter valid data for - Management IP Subnet Mask")){
						throw new Error("Invalid message is displayed as:"+Message);
					}jsClick(btn_Createdevice_alertmsg_clsicon);
					
							tbx_devicecreate_mgntsubnetmask.clear();break;
							
		case "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway":
									tbx_devicecreate_mgntdftgatewaymask.type("OMNIVUE123"); jsClick(btn_Create); waitForElement(lbl_Createdevice_alertmsg);
									Message = lbl_Createdevice_alertmsg.getText();
									Message = Message.toString().substring(1);
									
									Message = Message.trim(); 
									if(!Message.contains("Please enter valid data for - Default Gateway")){
										throw new Error("Invalid message is displayed as:"+Message);
									}jsClick(btn_Createdevice_alertmsg_clsicon);
									
									tbx_devicecreate_mgntdftgatewaymask.type("256.256.256.256"); jsClick(btn_Create); waitForElement(lbl_Createdevice_alertmsg);
									Message = lbl_Createdevice_alertmsg.getText();
									Message = Message.toString().substring(1);
									
									Message = Message.trim(); 
									if(!Message.contains("Please enter valid data for - Default Gateway")){
										throw new Error("Invalid message is displayed as:"+Message);
									}jsClick(btn_Createdevice_alertmsg_clsicon);
									
									tbx_devicecreate_mgntdftgatewaymask.type("1.1.1.1.1"); jsClick(btn_Create); waitForElement(lbl_Createdevice_alertmsg);
									Message = lbl_Createdevice_alertmsg.getText();
									Message = Message.toString().substring(1);
									
									Message = Message.trim(); 
									if(!Message.contains("Please enter valid data for - Default Gateway")){
										throw new Error("Invalid message is displayed as:"+Message);
									}jsClick(btn_Createdevice_alertmsg_clsicon);				
								
								tbx_devicecreate_mgntdftgatewaymask.clear();break;
							
		case "enter valid Management IP subnet mask & Default gateway ranging between 0.0.0.0 - 255.255.255.255": 
			tbx_devicecreate_mgntsubnetmask.type("127.1.1.254"); 
			tbx_devicecreate_mgntdftgatewaymask.type("127.1.1.255"); break;
		}
		
	}
	
	public void createtab_Device_Create_Vectoring_device(String VECTORING_TYPE,String Vectoring_Topology) throws InterruptedException{
		
		 ddl_createdevice_vectortype.selectByVisibleText(VECTORING_TYPE);	
		 
	if (VECTORING_TYPE.contains("External")) {
		
		
	   if(Vectoring_Topology.contains("Create Vectoring Topology")) {
		
		   ddl_createdevice_vectortopolgy.selectByVisibleText(Vectoring_Topology);
			 
			 
			 System.out.println( tbx_createdevice_Newvectortopolgy.getTextValue());
			 
			 tbx_createdevice_vectortopolgyNote.sendKeys("Test");
			 
			 button_createdevice_Newvectortopolgy.waitUntilClickable();
			 
			 System.out.println("Vectoring");
			 
			// Thread.sleep(5000);s

			 jsClick(button_createdevice_Newvectortopolgy);	   
		   
	}	
	   else{
		   Thread.sleep(10000);
		 //  ddl_createdevice_vectortopolgy.selectByVisibleText(Vectoring_Topology); 
		   ddl_createdevice_vectortopolgy.selectByIndex(2);
	   }
		
		 
		
	}
	
	}



}

		
	
	
	
	

