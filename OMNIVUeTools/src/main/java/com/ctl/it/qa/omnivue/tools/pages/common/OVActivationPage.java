package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.TimeUnit;







//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

/*import com.ctl.it.qa.omnivue.tools.steps.user.Alternate;
import com.ctl.it.qa.omnivue.tools.steps.user.Billing;
import com.ctl.it.qa.omnivue.tools.steps.user.Contact;
import com.ctl.it.qa.omnivue.tools.steps.user.Design;
import com.ctl.it.qa.omnivue.tools.steps.user.Ethernet;
import com.ctl.it.qa.omnivue.tools.steps.user.Implementation;
import com.ctl.it.qa.omnivue.tools.steps.user.Initiator;
import com.ctl.it.qa.omnivue.tools.steps.user.Location;
import com.ctl.it.qa.omnivue.tools.steps.user.Maintenance;
import com.ctl.it.qa.omnivue.tools.steps.user.Optical;
import com.ctl.it.qa.omnivue.tools.steps.user.POINT;
import com.ctl.it.qa.omnivue.tools.steps.user.Transport;*/
/*import com.ctl.it.qa.omnivue.tools.steps.user.CLC;
import com.ctl.it.qa.omnivue.tools.steps.user.QOS;
import com.ctl.it.qa.omnivue.tools.steps.user.Service;*/
/*import com.ctl.it.qa.omnivue.tools.steps.user.Archive;
import com.ctl.it.qa.omnivue.tools.steps.user.Network;
import com.ctl.it.qa.omnivue.tools.steps.user.SLA;*/
//import com.ctl.it.qa.omnivue.tools.steps.user.BRAS;
//import com.ctl.it.qa.omnivue.tools.steps.user.Alternate;
//import com.ctl.it.qa.omnivue.tools.steps.user.Device;
/*import com.ctl.it.qa.omnivue.tools.steps.user.Generic;
import com.ctl.it.qa.omnivue.tools.steps.user.MEN;*/
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Src;

//import org.openqa.selenium.Alert;
//import com.ctl.it.qa.omnivue.tools.steps.user.Virtual;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVActivationPage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
static /*	OVCreateDevicePage devcreatepage;
	OVLoginPage loginPage;*/
	OVLoginPage loginPage;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/a")
	public WebElementFacade tab_search;
	
	//
	
	@FindBy(xpath=".//input[@id='port:TCSOAZBL00W-01WMSO.01206905710']")
	public WebElementFacade port_Icon;
	@FindBy(xpath=".//span[text()='Activation']")
	public WebElementFacade activationSlider;
	@FindBy(xpath="(.//input[@value='Replace Device'])[2]")
	public WebElementFacade rma_btn;
	//
	
	
	@FindBy(xpath=".//*[@id='createMenu-out-div']/a")
	public WebElementFacade tab_create;
	
	//@FindBy(xpath=".//*[@class='headerbg headerFixed-top']//*[starts-with(@id,'dropdownMenu')]/i")
	@FindBy(xpath=".//span[@data-toggle='dropdown']/i")
	public WebElementFacade btn_gear_icon;	
	
	@FindBy(xpath=".//*[@id='omnivue']//*[@class='handle notesTab stickyNote']/i")
	public WebElementFacade btn_stickynoteedit;	
	
	@FindBy(xpath=".//*[@id='omnivue']//img[@alt='CTLI Logo']")
	public WebElementFacade lbl_ctlilogo;	
	
	@FindBy(xpath=".//*[@id='omnivue']//select[@ng-model='selectedModule']")
	public WebElementFacade ddl_selectmodule;	
	
	@FindBy(xpath=".//*[@id='omnivue']//input[@typeahead-loading='loadingSearchData']")
	public WebElementFacade tbx_googlesearchdata;	
	
	@FindBy(xpath="//button[@value='Go']")
	public WebElementFacade btn_googlesearchdata_go;	
	
	@FindBy(xpath="//i[@class='fa fa-question-circle fa-2x']")
	public WebElementFacade btn_helpicon;
	
	@FindBy(xpath="(//*[@ng-click='onClickTab(tab)'])[2]")
	public WebElementFacade tab_created_clccontact;
	//#######################Help page##############################
	
	@FindBy(xpath="//*[@id=\"p-logo\"]/a")
	public WebElementFacade help_ctli_logo;	
	
	@FindBy(xpath="//*[@id='Image_company']")
	public WebElementFacade img_help_ctli_logo;
	//*[@id='Image_company']
	
	//############		Gear Icon ###################################//
	

	@FindBy(xpath=".//*[@id='omnivue']//a[contains(text(),'Version:')]")
	public WebElementFacade lbl_gearicon_appversion;


	@FindBy(xpath=".//*[@id='omnivue']//a[text()='FAQ']")
	public WebElementFacade lbl_gearicon_faq;

	@FindBy(xpath=".//*[@id='omnivue']//a[text()='User Guide']")
	public WebElementFacade lbl_gearicon_userguide;

	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Administration']")
	public WebElementFacade lbl_gearicon_administration;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Reports']")
	public WebElementFacade lbl_gearicon_reports;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Manage Tags']")
	public WebElementFacade lbl_gearicon_Managetags;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Configure']")
	public WebElementFacade lbl_gearicon_configure;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Defect Task Report']")
	public WebElementFacade lbl_gearicon_defecttaskreports;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[@ng-click='logout();']")
	public WebElementFacade lbl_gearicon_logout;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='My Dashboard']")
	public WebElementFacade lbl_gearicon_mydashbord;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='My Profile']")
	public WebElementFacade lbl_gearicon_myprofile;	
	
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Upload XML']")
	public WebElementFacade lbl_gearicon_upldxml;
	
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Manage Users']")
	public WebElementFacade lbl_gearicon_administration_manageusers;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Manage Workgroups']")
	public WebElementFacade lbl_gearicon_administration_manageworkgroups;
	
	@FindBy(xpath=".//*[@id='mainTab']//li[@class='ng-isolate-scope active']//tab-heading[contains(text(),'Manage Workgroups')]")
	public WebElementFacade tab_manageworkgroups;
	
	@FindBy(xpath=".//*[@value='Search User']")
	public WebElementFacade btn_manage_users_searchuser;
	
	
	
	@FindBy(xpath=".//*[@ng-click='gridSettings.deleteTaskDetail(0)']")
	public WebElementFacade btn_manage_users_deleteuser;
			 
	@FindBy(xpath=".//*[@ng-click='removeUserTab($index);']/img[@class='ng-hide']")
	public WebElementFacade btn_manage_users_closetab;
			 
	@FindBy(xpath=".//*[@ng-model='filterByUser']")
	public WebElementFacade ddl_filerby_mangeuser;
	
	@FindBy(xpath=".//*[@ng-model='filterText']")
	public WebElementFacade tbx_useridsearchfield;
	
	@FindBy(xpath=".//*[@value='Delete User']")
	public WebElementFacade btn_deleteuser;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@class='ng-binding alert alert-danger' and @ng-show='showAlert']")
	public WebElementFacade lbl_nodataispresent_onsearch;
	
	
	@FindBy(id="state")
	public WebElementFacade ddl_createState;
	
	//Subcriber create launch form button
	@FindBy(xpath=".//*[text()='Launch Create Form' and @ng-click='create();']")
	public WebElementFacade btn_create_subcform;
	
	
	@FindBy(xpath="(.//button[@ng-click='create();'])[1]")
			public WebElementFacade btn_order_launchcreateform;

	
	
	@FindBy(xpath="(.//*[@id='shelfType'])[2]")
	public WebElementFacade ddl_SubscriberType;
	

	@FindBy(xpath="(.//*[@id='addShelf']/div[3]/div[1]/input)[1]")
	public WebElementFacade tbx_Subscribername;
	
	//Created By Dolly
	//xpath="//div[label[text()='Serial Number']]/following-sibling::div[1]/div[2]/input"
	@FindBy(xpath="(//div[@class='row form-group-device'][2])[2]/div[2]/input")
	public WebElementFacade tbx_serialNumber;
	
	//Created By Dolly
	//div[label[text()='Serial Number']]/following-sibling::div[1]/div[3]/input
	@FindBy(xpath="(//div[@class='row form-group-device'][2])[2]/div[3]/input")
	public WebElementFacade tbx_vendorPartNumber;
	
	//Location Search
	
	@FindBy(xpath=".//*[text()='Street Name %']/following-sibling::input")
	public WebElementFacade tbx_searchstrtName;
	
	//Network create button--Sairam--Move to Create form
	@FindBy(xpath="//button[@ng-click='initiateNetworkCreation();']")
	public WebElementFacade btn_NB_create;
	
	@FindBy(xpath="//label[text()='Search Type']/following-sibling::select")
	public WebElementFacade ddl_searchType;
	
	@FindBy(xpath=".//div[@class='dropdown pull-right']")
	public WebElementFacade gearIcon1;
		
	@FindBy(xpath="(.//label[text()='Task Type']/following-sibling::select)[1]")
	public WebElementFacade ddl_taskType;
			
	@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[@class='errorMsg']")
	public WebElementFacade lbl_error_msg_invalid_criteria_search_sliber;
	
	@FindBy(xpath="//*[@id='dropdownlistContenttaskNamejqxComboBox']/input")
	public WebElementFacade tbx_taskname;
	
	@FindBy(xpath=".//*[@id='dropdownlistWrappertaskNamejqxComboBox']/div[2]/div")
	public WebElementFacade btn_taskname_dropdown;
	
	@FindBy(xpath="//label[text()='Create Type']/following-sibling::select")
	public WebElementFacade ddl_createType;

	@FindBy(xpath=".//*[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab_active_tab;
	
	@FindBy(xpath=".//*[@ng-click='removeAllTabs()']")
	public WebElementFacade tab_closeall_tab;
	
	@FindBy(xpath=".//tab-heading[starts-with(text(),'My DashBoard')]")
	public WebElementFacade tab_Mydashboard;
	
	@FindBy(xpath=".//*[@id='accessTypeSelection' and @ng-model='bucForm.accessType']")
	public WebElementFacade ddl_createtab_BUC_accesstype;
	
	@FindBy(xpath=".//*[@ng-show='showNumberType']/label[text()='Ethernet']/preceding-sibling::input")
	public WebElementFacade rbn_createtab_number_techtype_ethernet;
	
	@FindBy(xpath=".//*[@ng-show='showNumberType']/label[text()='GPON']/preceding-sibling::input[1]")
	public WebElementFacade rbn_createtab_number_techtype_gpon;
	
	//@FindBy(xpath="//label[text()='Inventory Type']/following-sibling::select[@ng-keypress='($event.charCode==13)?searchInventory():return']")
	
	@FindBy(xpath="//label[text()='Inventory Type']/following-sibling::select[1]")
	public WebElementFacade ddl_invntryType;
	
		@FindBy(xpath="//label[text()='Network Type' and @for='Network Type']/following-sibling::select")
	public WebElementFacade ddl_networkType;
		
		@FindBy(xpath=".//label[text()='Initiated By']/following-sibling::input")
		public WebElementFacade tbx_searchslider_initiatedby;
	

	
	//@FindBy(xpath="//label[text()='Device Type']/following-sibling::select")
	@FindBy(xpath="//label[text()='Device Type']/following-sibling::select[@id='deviceType']")
	public WebElementFacade ddl_deviceType;
	
	@FindBy(xpath="//label[text()='Device Role' and @for='Fibre Build']/following-sibling::select")
	public WebElementFacade ddl_searchtab_networkbuild_fiberbuild_devicerole;
	
	@FindBy(xpath="//*[@ng-model='trasportPathSearchParam.deviceRoleType']")
	public WebElementFacade ddl_searchtab_networkbuild_transportpath_devicerole;
	
	@FindBy(xpath="//*[@ng-model='trasportPathSearchParam.transportDeviceName']")
	public WebElementFacade tbx_searchtab_networkbuild_transportpath_devicename;
	
	@FindBy(xpath="//label[text()='Product Type' and @for='Order Type']/following-sibling::select")
	public WebElementFacade ddl_searchtab_order_producttype;
	
	@FindBy(xpath="//label[text()='Order Type' and @for='Order Type']/following-sibling::select")
	public WebElementFacade ddl_searchtab_order_ordertype;
	
	@FindBy(xpath="//*[@ng-change='checkSearchParam();']")
	public WebElementFacade ddl_searchtab_SLC_checktype;
	
	@FindBy(xpath=".//*[@id='CSOF Order ID ']")
	public WebElementFacade ddl_searchtab_task_csofid;
	
	
	@FindBy(xpath="//div[@id='dropdownlistContenttaskStatusjqxComboBox']/input")
	public WebElementFacade ddl_searchtab_taskstatus;
	@FindBy(xpath="//div[@id='dropdownlistContentworkgroupjqxComboBox']/input")
	public WebElementFacade ddl_searchtab_workgroup;
	//@FindBy(xpath=".//label[text()='Task Name']/following-sibling::div//div[@id='dropdownlistContenttaskNamejqxComboBox']/input")
	@FindBy(xpath="//div[@id='dropdownlistContenttaskNamejqxComboBox']/input")
	public WebElementFacade ddl_searchtab_taskname;
	
	@FindBy(xpath=".//div[@id='taskssearch']/div//button[@type='button']")
	public WebElementFacade ddl_searchtab_searchbtn_task;
	
	
	
	
	@FindBy(xpath="(.//*[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//b)[1]")
	public WebElementFacade lbl_searchtab_taskname;
	
	@FindBy(xpath=".//*[@id='dropdownlistContenttaskNamejqxComboBox']/div/div/div")
	public WebElementFacade btn_taskname_closeicon;
	
	@FindBy(id = "numberType")
	public WebElementFacade ddl_search_numbertype ;
	
	@FindBy(id = "reservationType")
	public WebElementFacade ddl_search_reservationtype ;
	
	@FindBy(id="servicetype")
	public WebElementFacade ddl_search_serviceType;
	
	//@FindBy(id="technologyType")
	@FindBy(xpath=".//*[@id='topologyType' and @ng-model='searchParam.topologyType']")
	public WebElementFacade ddl_search_topologyType;
	
	@FindBy(xpath=".//*[@id='basicearch']/div[10]/input[2]")
	public WebElementFacade rbn_gpon_numbercreate;
	
	@FindBy(xpath=".//*[@id='basicearch']/div[10]/input[1]")
	public WebElementFacade rbn_ethernet_numbercreate;
	
	@FindBy(id="servicetype")
	public WebElementFacade ddl_serviceType;
	
	@FindBy(id="circuitToCircuitType")
	public WebElementFacade ddl_circuitType;
	
	@FindBy(xpath=".//*[@ng-model='searchParam.circuitName']")
	public WebElementFacade tbx_circuitname_searchslider;
	
	@FindBy(xpath="//*[@ng-controller='invSearchCtrl']//label[text()='Contact First Name %']/following-sibling::input")
	public WebElementFacade tbx_contact_firstname_searchslider;
	
	@FindBy(xpath="//*[@ng-controller='invSearchCtrl']//label[text()='Contact Last Name %']/following-sibling::input")
	public WebElementFacade tbx_contact_lastname_searchslider;
	
	@FindBy(xpath="//label[text()='Topology Type' and @for='topologyType']/following-sibling::select")
	public WebElementFacade ddl_topolgyType;
	
	@FindBy(xpath="//label[text()='Technology Type']/following-sibling::select")
	public WebElementFacade ddl_topolgydeviceType;	
	
	
	@FindBy(xpath=".//*[text()='Include Vectoring Info']/../input")
	public WebElementFacade cbk_searchslider_device_vectorinfo;	
	
	@FindBy(xpath=".//div[@ng-if='showInvSrch']//label[text()='Vector Enabled']/following-sibling::input")
	public WebElementFacade cbk_searchslider_device_vectorenabled;	

	@FindBy(xpath="//label[text()='Order Type']/following-sibling::select")
	public WebElementFacade ddl_orderTypeSearchTab;
	
	@FindBy(xpath=".//label[text()='Port Type' and @class='control-label']/following-sibling::select")
	public WebElementFacade ddl_portType;
	
	@FindBy(xpath=".//*[@ng-show='showInventoryType']/select")
	public WebElementFacade ddl_CreateinvntryType;
	
	@FindBy(xpath=".//*[@ng-model='resCircuitType']")
	public WebElementFacade ddl_CreateTab_invntry_circuitType;
	
	@FindBy(xpath="//div[@ng-show='showNetworkType']/select")
	public WebElementFacade ddl_CreateNetworkType;
	
	//@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include/div/div/div[2]/div[3]/ng-include/div/ng-include/div/div[1]/input")
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Device Name %']/../input")
	public WebElementFacade tbx_deviceName;
	
	@FindBy(xpath=".//*[@id='servicesrchname1']")
	public WebElementFacade tbx_serviceName;
	//------ Search Tab	Service Area	-------------------------//
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Service Area Name %']/following-sibling::input")
	public WebElementFacade tbx_searchtab_serviceName;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Device Name']/following-sibling::input")
	public WebElementFacade tbx_searchtab_serviceName_devicename;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Service Address']/following-sibling::input")
	public WebElementFacade tbx_searchtab_serviceName_serviceaddress;
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Device Location']/following-sibling::input")
	public WebElementFacade tbx_searchtab_serviceName_devicelocn;
	
	
	//Order search Tabs
		
	@FindBy(xpath=".//*[@id='orderId']")
	public WebElementFacade tbx_orderId;
	
	@FindBy(xpath=".//*[@id='productType']")
	public WebElementFacade ddl_productType;
	
	@FindBy(id = "orderadvanceSearch")
	public WebElementFacade lnk_orderadvanceSearch;
	
	@FindBy(id = "customerName")
	public WebElementFacade tbx_customerName;
	
	@FindBy(id = "DTN")
	public WebElementFacade tbx_DTN;
	
	@FindBy(id = "ensembleOrderNumber")
	public WebElementFacade tbx_ensembleOrderNumber;
	
	@FindBy(xpath=".//*[@id='DTN']")
	public WebElementFacade tbx_dtnorder;
	
	@FindBy(xpath=".//*[@ng-show='showForGPON']/label[text()='Order Type']/following-sibling::select")
	public WebElementFacade ddl_gponordertype;			//ONly for GPON order type
	
	//End of order search Tab
	
	//@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include/div/div/div[2]/div[3]/ng-include/div/ng-include/div/div[1]/input")
	//public WebElementFacade ddl_Service;
	
	// Search button--6/21/16
		@FindBy(xpath=".//*[text()='Search' and @ng-click='searchInventory();']")
		public WebElementFacade btn_inventorysearch;
		
		@FindBy(xpath=".//*[text()='Search' and @ng-click='searchInventory();' and @ng-hide='isForWidgetCreate']")
		public WebElementFacade btn_invservicesearch; 
		
		//@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Inventory Type']/following-sibling::div//button[@ng-hide='isForWidgetCreate']/i")
		@FindBy(xpath="(.//*[@id='basicsearch-out-div']//button[@ng-click='searchInventory();'])[1]")
		public WebElementFacade btn_invservicesearch_contact; 
		
		@FindBy(xpath=".//*[@ng-click='searchOrders();']")
		public WebElementFacade btn_ordersearch;
		
		//@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[@ng-click='searchNetwork()']")
		@FindBy(xpath="(.//*[@id='basicsearch-out-div']//button[@ng-click='searchNetwork();'])[1]")
		public WebElementFacade btn_networksearch;
		
		@FindBy(xpath=".//*[@ng-click='searchInventory();']/i")
		public WebElementFacade btn_invservicesearch_new;
		
		/*@FindBy(xpath=".//*[@ng-click='searchNetwork();']")
		public WebElementFacade btn_networksearch;*/
		
		@FindBy(xpath="(.//*[@ng-click='searchTask();'])[1]")
		public WebElementFacade btn_tasksearch;
		
		@FindBy(xpath=".//tab-heading[contains(text(),'Task Results')]")
		public WebElementFacade tab_taskResults;
		
		@FindBy(xpath=".//div[@title='previous']/div")
		public WebElementFacade btn_taskResults_previous;
		
		@FindBy(xpath=".//*[@id='taskssearch']//button[@ng-click='searchDefectTask();']/i")
		public WebElementFacade btn_DefecttaskSearch;
		
		@FindBy(xpath=".//*[@id='basicsearch-out-div']//button[@ng-click='searchInventory();' and @ng-hide='isForWidgetCreate']")
		public WebElementFacade btn_circuitsearch;
		
		@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[@ng-click='searchArchiveTask();']")
		public WebElementFacade btn_Archivesearch;
		
		//End of Search button
	
	// Start of Location - Search Tab details		

		@FindBy(xpath="//div[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_Locationtype;
		
		@FindBy(xpath="//button[@ng-click='create();']")
		public WebElementFacade btn_Location_create;
		
		@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Street Name %']/following-sibling::input")
		public WebElementFacade tbx_search_loaction_streetname;
		
		@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='City %']/following-sibling::input")
		public WebElementFacade tbx_search_loaction_city;
		
		@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Zip']/following-sibling::input[1]")
		public WebElementFacade tbx_search_loaction_zip;
		
		@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='State']/following-sibling::select")
		public WebElementFacade ddl_search_loaction_State;
		
		
	//End of Location Search Tab button
	
	@FindBy(xpath=".//*[@id='basicearch']/div[11]/ng-include/div/div[2]/div/div[2]/button")
	public WebElementFacade btn_create;
	
	@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
	public WebElementFacade btn_view;
	
	@FindBy(xpath="//div[starts-with(@id,'row0taskGrid')]//input[starts-with(@ng-click,'gridSettings.viewTaskDetailDsp')]")				
	public WebElementFacade btn_viewDSPTask;
	
	@FindBy(xpath="//div[starts-with(@id,'row0taskGrid')]//input[starts-with(@ng-click,'gridSettings.editTaskDetailDsp')]")				
	public WebElementFacade btn_edit_DSPTask;
	
	@FindBy(xpath="//div[starts-with(@id,'row0taskGrid')]//input[starts-with(@ng-click,'gridSettings.viewTaskDetail')]")				
	public WebElementFacade btn_ethernettask_view;
	
	@FindBy(xpath=".//*[@id='filtByRole']")
	public WebElementFacade rdbtn_role;
	
	@FindBy(xpath=".//*[@id='filtByTech']")
	public WebElementFacade rdbtn_tech;
	
	@FindBy(xpath=".//*[@id='filtByAll']")
	public WebElementFacade rdbtn_all;
	
	@FindBy(xpath="//label[text()='Technology']/following-sibling::select")
	public WebElementFacade ddl_Inventory_techType;
	
	@FindBy(xpath="//label[text()='Device Type']/following-sibling::select[@ng-change]")
	public WebElementFacade ddl_Inventory_devType;
	
	@FindBy(xpath="//label[text()='Device Sub-Type']/following-sibling::select")
	public WebElementFacade ddl_Inventory_devsubType;
	
	@FindBy(xpath="//label[text()='Link Type']/following-sibling::select[@ng-model='resLinkType']")
	public WebElementFacade ddl_Createtab_Inventory_LinkType;
	
	@FindBy(xpath="//label[text()='Name %']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_Inventory_Linkname;
	
	//@FindBy(xpath="//label[text()='Location Type']/following-sibling::select")
	@FindBy(xpath=".//*[@ng-model='resLocationType']")
	public WebElementFacade ddl_Createtab_Inventory_LocationType;
	
	@FindBy(xpath="//label[text()='Port Type']/following-sibling::select")
	public WebElementFacade ddl_Createtab_Inventory_PortType;
	
	
	
	
	@FindBy(xpath="//*[@ng-show='EthernetTypes']/label[text()='Number Type']/following-sibling::select")
	public WebElementFacade ddl_Createtab_Inventory_Number_EthernetType;
	
	@FindBy(xpath="//*[@ng-show='GponTypes']/label[text()='Number Type']/following-sibling::select")
	public WebElementFacade ddl_Createtab_Inventory_Number_gponType;
	
	@FindBy(xpath=".//*[@id='address']")
	public WebElementFacade ddl_addNo;
	
	@FindBy(xpath=".//*[@id='streetName']")
	public WebElementFacade ddl_streetName;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield3;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield4;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield5;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield6;
		
	
	/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[@id='start_0']")
	public WebElementFacade tbx_editctag_fld1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[@id='end_0']")
	public WebElementFacade tbx_editctag_fld2;*/
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@id='start_0']")
	public WebElementFacade tbx_ctageditfield1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@id='end_0']")
	public WebElementFacade tbx_ctageditfield2;
	
	@FindBy(xpath=".//*[@id='invDevCreate']//select[@ng-change='updDevTypOnRolSel()']")
	public WebElementFacade ddl_role;
	
	@FindBy(xpath=".//*[@ng-model='fiberBuildSearchParam.fiberBldDevRole']")
	public WebElementFacade ddl_SerachFB_devicerole;
	
	@FindBy(xpath=".//div[@ng-if='showNetworkTransSearch']//label[contains(text(),'Device Name')]/following-sibling::input")
	public WebElementFacade tbx_SerachNB_fiberbuild_devicename;
	
	@FindBy(xpath="(.//div[@ng-if='showNetworkTransSearch']//strong)[1]")
			public WebElementFacade lbl_SerachNB_fiberbuild_deviceresult;
	
	@FindBy(xpath=".//*[@id='invDevCreate']//select[@ng-model='deviceType']")
	public WebElementFacade ddl_create_devicetype;
	
	@FindBy(xpath=".//*[@id='invDevCreate']//select[@ng-model='deviceSubType']")
	public WebElementFacade ddl_create_device_subtype;
	
	
	//Have to find way to place this create path different path
	//Location fields
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[1]/input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Address#']/following-sibling::input")
	public WebElementFacade tbx_addNo;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Street Name']/following-sibling::input")
	public WebElementFacade tbx_streetName;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Building CLLI %']/following-sibling::input")
	public WebElementFacade tbx_buildingclli;
	
	@FindBy(xpath="(.//*[@ng-controller='locationLookUpCtrl']//label[text()='Building CLLI %']/following-sibling::input)[2]")
	public WebElementFacade tbx_buildingclli2;
	
//	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]//*[@for='city']/following-sibling::input")
	@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='City']/following-sibling::input")
	public WebElementFacade tbx_lcncity;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-keyup='setAdddressFields(entity[field.name])']")
	public WebElementFacade tbx_lcnclli_createform;
	
	//Topology fields
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='port']")
	public WebElementFacade ddl_TopologyType;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='topologylookup']/div[3]/div[1]/input")
	public WebElementFacade tbx_Topologyname;
	
	@FindBy(xpath=".//*[@ng-model='topologyLookUp.topologyType']")
	public WebElementFacade ddl_Topologytype;
	
	//Wired Clli details
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[3]/div[1]/input")
	public WebElementFacade tbx_wiredaddNo;
	
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[3]/div[2]/input")
	public WebElementFacade tbx_wiredstreetName;
	
	@FindBy(xpath=".//*[@ng-controller='wireCentClliLookUpCtrl']/div[1]/div[2]/div[@id='cllilookup']/div[4]/div[4]/div/input")
	public WebElementFacade tbx_wiredbuildingclli;
	
	//Device form fields
	@FindBy(xpath="(//div[label[normalize-space(text()) = 'Device CLLI']])[2]/following-sibling::div[1]/div[1]/input")
	public WebElementFacade tbx_deviceCLLI;
	
	@FindBy(id="CLLI")
	public WebElementFacade tbx_DeviceCLLI;
	
	@FindBy(id="DEVICE_DESIGNATOR")
	public WebElementFacade tbx_Devicedesignator;
	
	@FindBy(xpath=".//*[@id='RELAYRACKID']")
	public WebElementFacade tbx_relayID;
	
	@FindBy(xpath=".//*[@id='AerialOrBuried']")
	public WebElementFacade ddl_Aerialrburied;
	
	@FindBy(id="isDiversed")
	public WebElementFacade ddl_IsDiversed;	

	
	@FindBy(id="AFFILIATE_OWNER")
	public WebElementFacade ddl_affiliate_owner;
	
	@FindBy(id="AerialOrBuried")
	public WebElementFacade ddl_AerialOrBuried;
	
	@FindBy(id="INDOOR")
	public WebElementFacade ddl_Indooroutdoor;
	
	@FindBy(id="RONTAID")
	public WebElementFacade tbx_rid;
	
	@FindBy(id="InstallationIndicator")
	public WebElementFacade ddl_InstallationIndicator;
	
	@FindBy(id="FiberProvisioning")
	public WebElementFacade ddl_FiberProvisioning;
	
	@FindBy(id="NOSACertification")
	public WebElementFacade ddl_nosacer;
	
	@FindBy(id="1GbpsIndicator")
	public WebElementFacade ddl_gbpsind;
	
	@FindBy(id="ConnectorType")
	public WebElementFacade ddl_connectortype;
	
	
	//@FindBy(xpath=".//*[@ng-click='searchGponNetworkGridSettings.openCreateGponPage(0)']")
	@FindBy(xpath=".//*[@ng-click='searchGponNetworkGridSettings.openCreateGponPage(0)']")
	public WebElementFacade btn_buildid_searchresultpage;
	
	//@FindBy(xpath=".//*[@id='contentgponNetworkGrid']//*[@id='row0gponNetworkGrid']/div[1]/div/a")
	@FindBy(xpath=".//*[@id='contentgponNetworkGrid']//div[@id='row0gponNetworkGrid']/div[1]/div/a")
	public WebElementFacade btn_networkbuildid_searchresultpage;
	
	@FindBy(xpath="//input[@id='topologyName']")
	public WebElementFacade tbx_topologyname;
	
	// End of Device create form
	
	//Splitter details in Create form
	
	@FindBy(id="SplitterGroupNumber")
	public WebElementFacade tbx_Splitter_no;
	
	@FindBy(id="StartPortNumber")
	public WebElementFacade tbx_Splitter_port;
	
	// End of splitter update
	
	// Subscriber Search Tab
	
	@FindBy(xpath = "//label[text()='Subscriber Full Name %']/following-sibling::input")
	public WebElementFacade tbx_SubscriberFullName;

	@FindBy(xpath = "//label[text()='Enterprise Account ID']/following-sibling::input")
	public WebElementFacade tbx_EnterpriseAccountID;

	@FindBy(xpath = "//label[text()='Subscriber ID %']/following-sibling::input")
	public WebElementFacade tbx_SubscriberID;

	@FindBy(xpath = "//label[text()='ACNA/CCNA']/following-sibling::input")
	public WebElementFacade tbx_ACNA_CCNA;
	
	// End of Subscriber search
	
	//Subscriber field data
	@FindBy(id="subscriberName")
	public WebElementFacade tbx_subcsname;
	
	@FindBy(id="accountIdentifier")
	public WebElementFacade ddl_subcaccidentifier;
	
	@FindBy(id="subscriberId")
	public WebElementFacade tbx_subscid;
	
	@FindBy(id="subscriberType")
	public WebElementFacade ddl_subctype;
	
	@FindBy(id="subscriberSubType")
	public WebElementFacade ddl_subcsubtype;
	
	//End of subscriber
	//************************		Network Build- GPON Device Template Search Tab   **************************************//
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Template Name %']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_GCT_templatename;
	
	@FindBy(xpath = "(.//div[@class='tab-pane ng-scope active']//a)[1]")
			public WebElementFacade lbl_GCT_templatename_result;

	//Transport Path
    
    @FindBy(xpath="//select[@ng-model='trasportPathSearchParam.deviceRoleType']")
    public WebElementFacade ddl_Create_TransportPath_DeviceRole;
    
    @FindBy(xpath="//input[@ng-model='trasportPathSearchParam.transportDeviceName']")
    public WebElementFacade tbx_Create_TransportPath_DeviceName;      
    
    
    //Transport Path

	
	
	//************************		Network Build- GPON Device Build Search Tab   **************************************//
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Build ID']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_buildid;
	
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Engineering Order ID']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_engorderid;
	
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Device CLLI %']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_deviceclli;
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Device Address']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_deviceaddr;	
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Initiated By']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_initiatedby;
	
	@FindBy(xpath = ".//div[@ng-if='showNetworkTransSearch']//label[text()='Last Modified By']/following-sibling::input")
	public WebElementFacade tbx_Searchtab_networkbuild_lastmodifiedby;
	
	
	
	
	//************************************************************************************************//
	//************		QOS Template **************//
	
	@FindBy(id="templateName")
	public WebElementFacade tbx_searchtab_templateName;
	
	//************	End of 	QOS Template **************//
	//Network Build for create Tab
	
	@FindBy(xpath="//input[@id='serviceCLLI']")
	public WebElementFacade tbx_SWCCLLI;
			
	@FindBy(xpath="//input[@id='engOrdId']")
	public WebElementFacade tbx_EngOrdId;
	
	//End of Network build
	
	
	// Subscriber Data field
	
	//@FindBy(xpath="//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[1]/label[text()='Subscriber Name %']/following-sibling::input")
	//@FindBy(xpath=".//*[@style='height: 524px;']/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[1]/label[text()='Subscriber Name %']/following-sibling::input")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-model='invSubscriber.subscriberName']")
	public WebElementFacade tbx_subscriber;
	
	@FindBy(xpath=".//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[2]/label[text()='Subscriber Type']/following-sibling::select")
	public WebElementFacade ddl_subtype;
	
	@FindBy(xpath=".//*[not(contains(@style,'height: 0px;'))]/following-sibling::ng-include/div/div/div[2]/div[@id='addShelf']/div[2]/div[3]/label[text()='Subscriber ID %']/following-sibling::input")
	public WebElementFacade tbx_subid;
	
	// End of Subscriber Data field
	
	//Alt Subscriber Data need to validate for others as well
	
	@FindBy(xpath=".//*[@id='addShelf']/div[3]/div[1]/input")
	public WebElementFacade tbx_Altbuld_subscribername;
	
	@FindBy(xpath=".//*[@id='shelfType']")
	public WebElementFacade ddl_Altbuld_subtype;
	
	@FindBy(xpath=".//*[@id='addShelf']/div[4]/div[1]/input")
	public WebElementFacade tbx_Altbuld_subid;
	
	// Divya Logical Port Data
	
	@FindBy(xpath=".//*[@id='devicelookup']/div[4]/div[4]/input")
	public WebElementFacade tbx_devicelookup;
	
	@FindBy(id="logicalPortName")
	public WebElementFacade tbx_logportname;
	
	//Location Create form attributes--21/7/2016--US48525-TC53733
	
	@FindBy(xpath="//input[@id='addressNumber']") 
	public WebElementFacade tbx_addressNumber;
	
	@FindBy(xpath="//input[@id='street']") 
	public WebElementFacade tbx_street;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='state')]") 
	public WebElementFacade ddl_state;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='city')]") 
	public WebElementFacade ddl_city;
	
	@FindBy(xpath="//select[@id='NewConstructionIndicator']") 
	public WebElementFacade ddl_NewConstructionIndicator;
	
	@FindBy(xpath="//input[@id='sWCCLLI']") 
	public WebElementFacade tbx_sWCCLLI;

	//End of Location Create form
	
	//Start QOS Template
	
	@FindBy(xpath=".//*[starts-with(text(),'Template Name')]/../input")
	public WebElementFacade tbx_searchtab_Template_name;
	
	@FindBy(xpath=".//*[@id='p2']")
	public WebElementFacade tbx_p2;
	
	@FindBy(xpath=".//*[@id='p3']")
	public WebElementFacade tbx_p3;
	
	@FindBy(xpath=".//*[@id='p4']")
	public WebElementFacade tbx_p4;
	
	//End of QOS Template
	
	
	
	@FindBy(xpath=".//*[text()='Launch Create Form' and @ng-click='createDevice();']")						//Shiva
	public WebElementFacade btn_createdevice;
	

	@FindBy(xpath=".//*[text()='Launch Create Form' and @ng-click='create();']")
	public WebElementFacade btn_createservice;
	
	@FindBy(xpath="//select[@id='typeSelection' and @ng-model='resServiceType']")
	public WebElementFacade ddl_createServicetype;
	
	@FindBy(xpath=".//*[@id='topologyType' and @ng-model='TOPOLOGY2TOPOLOGYTYPE']")
	public WebElementFacade ddl_createtab_topologytype;
	
	
	
	
	//New changes--9/23
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[2]/div[2]/select")
	public WebElementFacade ddl_FunctionalStatus;
	
	@FindBy(xpath="//div[label[contains(text(),'Element Note')]]/following-sibling::div//input[@ng-model='deviceDetail.DESCRIPTION']")
	public WebElementFacade tbx_networkElementNode;
	
	@FindBy(xpath="//div[label[text()='Alias1']]/following-sibling::div//input[@ng-model='deviceDetail.ALIAS1']")
	public WebElementFacade tbx_Alias1;
	
	@FindBy(xpath="//div[label[text()='Alias2']]/following-sibling::div//input[@ng-model='deviceDetail.ALIAS2']")
	public WebElementFacade tbx_Alias2;
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[10]/div[2]/input")
	public WebElementFacade tbx_vedorPartNum;
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[10]/div[3]/input")
	public WebElementFacade tbx_partType;
	
	@FindBy(xpath="(//div[@class='row form-group-device'])[10]/div[4]/input")
	public WebElementFacade tbx_manufacturerPartNum;
	
	@FindBy(xpath="//div[label[text()='Management VLAN']]/following-sibling::div//input[@ng-model='deviceDetail.MGMTVLAN']")
	public WebElementFacade tbx_manufacturerVLAN;
	
	
	@FindBy(xpath="//thead[tr[th[text()='Provision Status']]]/following-sibling::tbody//td[2]")
	public WebElementFacade tag_functionalStatus;
	
	@FindBy(xpath="//thead[tr[th[text()='Provision Status']]]/following-sibling::tbody//td[3]")
	public WebElementFacade tag_networkElementNode;
	
	@FindBy(xpath="//thead[tr[th[text()='Device CLLI']]]/following-sibling::tbody[2]//td[1]")
	public WebElementFacade tag_alias1;
	
	@FindBy(xpath="//thead[tr[th[text()='Device CLLI']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_alias2;
	
	@FindBy(xpath="//thead[tr[th[text()='Device Type']]]/following-sibling::tbody[2]//td[2]")
	public WebElementFacade tag_vendorPortNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Device Type']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_partType;
	
	@FindBy(xpath="//thead[tr[th[text()='Device Type']]]/following-sibling::tbody[2]//td[4]")
	public WebElementFacade tag_ManufacpartNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Management VLAN']]]/following-sibling::tbody[1]//td[3]")
	public WebElementFacade tag_ManagementVLAN;
	
	@FindBy(xpath = "//div[label[text()='Chassis Serial Number']]/following-sibling::div//input[@ng-model='deviceDetail.CHASSISSERIALNUMBER']")
	public WebElementFacade tbx_NDchasisSerialNum;
	
	@FindBy(xpath = "//div[label[text()='Serial Number']]/following-sibling::div//input[@ng-model='deviceDetail.SERIALNUMBER']")
	public WebElementFacade tbx_NDserialNum;
	
	@FindBy(xpath = "//div[label[text()='Socket Number']]/following-sibling::div//input[@ng-model='deviceDetail.SOCKETNUMBER']")
	public WebElementFacade tbx_NDSocketNum;
	
	@FindBy(xpath = "//div[label[text()='Hardware Version']]/following-sibling::div//input[@ng-model='deviceDetail.HARDWAREVERSION']")
	public WebElementFacade tbx_NDHardwareVersion;
	
	@FindBy(xpath = "//div[label[text()='Software Version']]/following-sibling::div//input[@ng-model='deviceDetail.SOFTWAREVERSION']")
	public WebElementFacade tbx_NDSoftwareVersion;
	
	@FindBy(xpath = "//div[label[text()='Management IP Subnet Mask']]/following-sibling::div//input[@ng-model='deviceDetail.MGMT_IP_SUBNET_MASK']")
	public WebElementFacade tbx_NDIPSubnetMask;
	
	@FindBy(xpath = "//div[label[text()='Revision']]/following-sibling::div//input[@ng-model='deviceDetail.REVISION']")
	public WebElementFacade tbx_NDRevision;
	
	@FindBy(xpath = "//div[label[text()='Discontinue Date']]/following-sibling::div//input[@ng-model='deviceDetail.DISCONTINUEDATE']")
	public WebElementFacade tbx_DisContinueDate;
	
	@FindBy(xpath = "//div[label[text()='Discontinue Reason']]/following-sibling::div//input[@ng-model='deviceDetail.DISCONTINUEREASON']")
	public WebElementFacade tbx_DisContinueReason;
	
	@FindBy(xpath = "//div[label[text()='MAC Address']]/following-sibling::div//input[@ng-model='deviceDetail.MACADDRESS']")
	public WebElementFacade tbx_NDMacAddress;
	
	@FindBy(xpath = "//div[label[text()='SNMP Object ID']]/following-sibling::div//input[@ng-model='deviceDetail.SNMPOBJECTID']")
	public WebElementFacade tbx_NDSNMPObjectID;
	
	@FindBy(xpath = "//div[label[text()='SNMP Port Number']]/following-sibling::div//input[@ng-model='deviceDetail.SNMP_PORT_ID']")
	public WebElementFacade tbx_NDSNMPPortNum;
	
	@FindBy(xpath = "//div[label[text()='Monitoring Type']]/following-sibling::div//input[@ng-model='deviceDetail.MONITORING_TYPE']")
	public WebElementFacade tbx_NDMonitoringType;
	
	@FindBy(xpath = "//div[label[text()='Firmware Version']]/following-sibling::div//input[@ng-model='deviceDetail.FIRMWAREVERSION']")
	public WebElementFacade tbx_NDFirmWareVersion;
	
	@FindBy(xpath = "//div[label[text()='NMS Type']]/following-sibling::div//input[@ng-model='deviceDetail.NMSTYPE']")
	public WebElementFacade tbx_NDNMSType;
	
	@FindBy(xpath = "//div[label[text()='NMS Host Name']]/following-sibling::div//input[@ng-model='deviceDetail.NMSHOSTNAME']")
	public WebElementFacade tbx_NDNMSHostName;
	
	@FindBy(xpath = "//div[label[text()='NMS Description']]/following-sibling::div//input[@ng-model='deviceDetail.NMSDESCRIPTION']")
	public WebElementFacade tbx_NDNMSDescription;
	
	@FindBy(xpath = "//div[label[text()='Network Identifier']]/following-sibling::div//input[@ng-model='deviceDetail.NETWORKIDENTIFIER']")
	public WebElementFacade tbx_NDNetworkIdentifier;
	
	@FindBy(xpath = "//div[label[text()='Network Name']]/following-sibling::div//input[@ng-model='deviceDetail.NETWORKNAME']")
	public WebElementFacade tbx_NDNetworkName;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[1]//td[1]")
	public WebElementFacade tag_NDchasisSerialNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[1]//td[2]")
	public WebElementFacade tag_NDserialNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[1]")
	public WebElementFacade tag_NDSocketNum;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[2]")
	public WebElementFacade tag_NDHardwareVersion;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_NDSoftwareVersion;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[2]//td[4]")
	public WebElementFacade tag_NDIPSubnetMask;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[3]//td[1]")
	public WebElementFacade tag_NDRevision;
	
	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[3]//td[2]")
	public WebElementFacade tag_DisContinueDate;

	@FindBy(xpath="//thead[tr[th[text()='Chassis Serial Number']]]/following-sibling::tbody[3]//td[3]")
	public WebElementFacade tag_DisContinueReason;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[1]")
	public WebElementFacade tag_NDMacAddress;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[2]")
	public WebElementFacade tag_NDSNMPObjectID;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[3]")
	public WebElementFacade tag_NDSNMPPortNum;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[1]//td[4]")
	public WebElementFacade tag_NDMonitoringType;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[1]")
	public WebElementFacade tag_NDFirmWareVersion;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[2]")
	public WebElementFacade tag_NDNMSType;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[3]")
	public WebElementFacade tag_NDNMSHostName;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[2]//td[4]")
	public WebElementFacade tag_NDNMSDescription;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[3]//td[1]")
	public WebElementFacade tag_NDNetworkIdentifier;;
	
	@FindBy(xpath="//thead[tr[th[text()='MAC Address']]]/following-sibling::tbody[3]//td[2]")
	public WebElementFacade tag_NDNetworkName;;
	
	
	@FindBy(xpath="(//div[@id='cllilookup'])[1]/div[3]//input[@id='address']")
	public WebElementFacade tbx_wireCenteraddress;
	
	@FindBy(xpath="(//div[@id='cllilookup'])[1]/div[3]//input[@id='streetName']")
	public WebElementFacade tbx_wireCenterstreetName;
	
	@FindBy(xpath="(//div[@id='cllilookup'])[1]/div[4]//input[@id='buildingCLLI']")
	public WebElementFacade tbx_wireCenterbuildingCLLI;
	
	@FindBy(id="WIRECENTERCLLI")
	public WebElementFacade tbx_wireCenterCLLI;
	
	@FindBy(xpath="//label[text()='Device Role']/following-sibling::select")
	public WebElementFacade ddl_devRole;
	
	@FindBy(xpath="//label[normalize-space(text()) = 'Device Name']/following-sibling::input")
	public WebElementFacade tbx_devName;
	
	//@FindBy(xpath="(//button[text()='Launch Create Form'])[2]")
	@FindBy(xpath=".//*[@id='createMenu-out-div']//button[@ng-if='!showSLCSection && !showBUCSection']")
	public WebElementFacade btn_topologylaunchCreate;
	
	@FindBy(xpath=".//*[text()='Launch Create Form' and @ng-click='createDevice();']")
	public WebElementFacade btn_Device_launchCreate;
	
	@FindBy(xpath=".//*[@ng-if='!showCreateDeviceSection']//button[@class='ov-button-prime ng-scope']")
	public WebElementFacade btn_clccontact_launchCreate;
	
	// Link elements
	
		@FindBy(id = "linktype")
		public WebElementFacade ddl_Link_type ;
		
		@FindBy(xpath = ".//*[@id='basicsearch-out-div']//*[text()='Device Name %']/following-sibling::input")
		public WebElementFacade tbx_Searchtab_Link_Devicename ;
		
		@FindBy(xpath = ".//*[text()='Name %']/following-sibling::input")
		public WebElementFacade tbx_Searchtab_Linkname ;
		
		@FindBy(xpath = "//input[@ng-model='searchParam.name']")
		public WebElementFacade tbx_link_name ;
		
		@FindBy( xpath = ".//*[@id='mainTab']/div/ul/li[2]/a")
		public WebElementFacade lbl_view_page ;
		
	//End of Link
		
	/*@FindBy(xpath = ".//*[@ng-repeat='row in NumberTypeList']")
	public List<WebElementFacade> ddl_search_number_list ;
	
	@FindBy(xpath = ".//*[@ng-repeat='reservationList in reservationTypeList']")
	public List<WebElementFacade> ddl_search_reservation_list ;
		*/
	@FindBy(xpath = "//select[@ng-model='searchParam.circuitToCircuitType']")
	public WebElementFacade ddl_circuittype ;
	
	@FindBy(xpath = "//input[@ng-model='searchParam.circuitName']")
	public WebElementFacade ddl_circuitname ;
	
	@FindBy(id = "contactType")
	public WebElementFacade ddl_search_contacttype ;
	
			
	@FindBy(xpath = "//input[@ng-model='searchParam.streetName']")
	public WebElementFacade tbx_streetname;
	
	@FindBy( xpath = "//input[@ng-model='searchParam.serviceAreaName']")
	public WebElementFacade tbx_service_area_name ;
	
	
	//Aparna Sanity Declaration
	
	@FindBy(xpath="//label[text()='Service Type ']/following-sibling::select")
    public WebElementFacade ddl_Search_ServiceType;

	@FindBy(xpath = "//*[@ng-show='showLocationType']/select")
	public WebElementFacade ddl_LocationType;
	
	//click on create form to view the success message
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
	public WebElementFacade tab_Back_2_AddressRangeForm;
			
			
	// success message
	@FindBy(xpath=".//*[@id='0']/ng-include/div/div[1]")
	public WebElementFacade lbl_success_message_AddressRangeForm;
			
	
	@FindBy (id = "invAdvanceSearch")
	public WebElementFacade lnk_Advanced_Search ;
	
	@FindBy (xpath = ".//a[@id='orderadvanceSearch']")
			public WebElementFacade lnk_Advanced_Search_order ;
	
	
	@FindBy (id = "invAdvanceSearch")
	public WebElementFacade lnk_Advanced_Search_location;
	
	@FindBy (id = "defectTaskAdvancedSearch")
	public WebElementFacade lnk_Advanced_Search_defect_task;
	
	@FindBy (xpath = ".//a[@ng-if='!showDefectTaskSrch']")
	public WebElementFacade lnk_Advanced_Search_task;
	
	
	@FindBy(xpath = ".//*[@ng-show='showCircuitType']/select")
	public WebElementFacade ddl_CircuitType_Createtab ;
	
	@FindBy(id = "functionalStatus")
	public WebElementFacade ddl_functional_status ;

	@FindBy(id = "AFFILIATE_OWNER")
	public WebElementFacade ddl_Affiliate_Owner ;
	
	@FindBy(id = "MGMT_IP_SUBNET_MASK")
	public WebElementFacade tbx_mngip_subnetmask ;
	
	@FindBy(id = "MGMT_IP_DEFAULT_GATEWAY")
	public WebElementFacade tbx_deftgateway ;

	@FindBy(id = "MONITORING_TYPE")
	public WebElementFacade tbx_monitoring_type ;
	
	
	@FindBy(xpath= ".//*[text()='Go to page:']")
	public WebElementFacade lbl_Searchresultpage ;
	
	@FindBy(xpath= ".//*[@title='Refresh']")
	public WebElementFacade btn_refreshSearchresultpage ;
	
	//Search Tab----Task path
	
	@FindBy(id = "defaultTaskSelected")
	public WebElementFacade ddl_task_type ;
	
	@FindBy(id = "CSOF Order ID ")
	public WebElementFacade tbx_task_csofid ;

	@FindBy(xpath=".//*[@id='basicsearch-out-div']//label[text()='Topology Type']/following-sibling::select")
	public WebElementFacade ddl_Search_topologyType;

	@FindBy(id="topologyType")
	public WebElementFacade ddl_topologyTypeForSearch;
	
	@FindBy(xpath=".//*[@id='topologyRole']")
	public WebElementFacade dd_topology_role; 
	
	@FindBy(xpath="//input[@ng-click='gridSettings.viewTaskDetail(0)']")
	public WebElementFacade btn_view_icon; 
	
	
	@FindBy(xpath=".//*[@id='basicsearch-out-div']//label[text()='Topology Technology Type']/following-sibling::select")
	public WebElementFacade dd_Search_topology_techType; 
	
	@FindBy(id="topologyName")
	public WebElementFacade tbx_topologyNameForSearch;
	
	@FindBy(id="contactFirstName") 
	public WebElementFacade	 tbx_contactFirstName;
	
	@FindBy(id="contactType")
	public WebElementFacade ddl_contactType;
	
	@FindBy(xpath="//span[span[label[text()='Name']]]/following-sibling::span//input")
	public WebElementFacade tbx_TDName;
	
	@FindBy(xpath="//span[span[label[text()='Full Name']]]/following-sibling::span//input")
	public WebElementFacade tbx_TDFullName;
	
	@FindBy(xpath="//span[span[label[text()='Alias1']]]/following-sibling::span//input")
	public WebElementFacade tbx_TDAlias1;
	
	@FindBy(xpath="//span[span[label[text()='Topology Role']]]/following-sibling::span//select")
	public WebElementFacade ddl_TDTopologyRole;
	
	@FindBy(xpath="//span[span[label[text()='Topology Technology Type']]]/following-sibling::span//select")
	public WebElementFacade ddl_TDTopologyTechnologyType;
	
	@FindBy(xpath="//span[span[label[text()='Topology Notes']]]/following-sibling::span//textarea")
	public WebElementFacade tbx_TDTopologyNotes;


	@FindBy(xpath="//span[span[label[text()='Name']]]/following-sibling::span//label")
	public WebElementFacade tag_TDName;
	
	@FindBy(xpath="//span[span[label[text()='Full Name']]]/following-sibling::span//label")
	public WebElementFacade tag_TDFullName;
	
	@FindBy(xpath="//span[span[label[text()='Alias1']]]/following-sibling::span//label")
	public WebElementFacade tag_TDAlias1;
	
	@FindBy(xpath="//span[span[label[text()='Topology Role']]]/following-sibling::span//label")
	public WebElementFacade tag_TDTopologyRole;
	
	@FindBy(xpath="//span[span[label[text()='Topology Technology Type']]]/following-sibling::span//label")
	public WebElementFacade tag_TDTopologyTechnologyType;
	
	@FindBy(xpath="//span[span[label[text()='Topology Notes']]]/following-sibling::span//label")
	public WebElementFacade tag_TDTopologyNotes;
	

	//@FindBy(xpath="(//div[@class='split-handler'])[2]/img[1]")
	@FindBy(xpath="//img[@src='../images/expandRight.png']")
	public WebElementFacade btn_leftarrow_Topology;
	
	//@FindBy(xpath="(//div[@class='split-handler'])[2]/img[3]")
	@FindBy(xpath="//img[@src='../images/ExpandLeft.png']")
	public WebElementFacade btn_rightarrow_Topology;

	@FindBy(xpath="//div[div[div[div[div[span[text()='Device CLLI']]]]]]/following-sibling::div[1]/div/div[1]/div[4]/div")
	public WebElementFacade tag_deviceCLLIl;
	
	@FindBy(xpath="//thead[tr[th[span[text()='Device Name']]]]/following-sibling::tbody/tr[1]//a")
	public WebElementFacade tag_deviceName;
	
	

	
	@FindBy(xpath="(//select[@id='typeSelection'])[2]")
	public WebElementFacade ddl_servicetype; 


	@FindBy(xpath="//label[text()='City %']/..//input")
	public WebElementFacade tbx_city;
	
	@FindBy(xpath="//label[text()='State']/..//select")
	public WebElementFacade ddl_stateArizona; 

	@FindBy(xpath="(//label[contains(text(),'Link Type')])[1]/..//select")
	public WebElementFacade ddl_LinkType; 
	@FindBy(xpath="//label[text()='Name %']/../input")
	public WebElementFacade tbx_searchname; 

	@FindBy(xpath="//select[@id='servicetype']")
	public WebElementFacade  ddl_servicetypeForSearch;
	
	@FindBy(id = "networkType")
	public WebElementFacade ddl_EquipmentBuildType;
	
	@FindBy(xpath = "//label[text()='Order Number']/following-sibling::input")
	public WebElementFacade tbx_orderNum;
	

	
	@FindBy(xpath = ".//*[@ng-click='initiateNetworkCreation();']")
	public WebElementFacade btn_createNetwork;
	
	@FindBy(xpath = ".//*[text()='Launch Create Form' and @ng-click='create();']")
	public WebElementFacade btn_createlocation;
	
	//########################  CLC Contact Search Tab  ########################################//
	
			@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Contact First Name %']/following-sibling::input")
			public WebElementFacade tbx_clccontact_firstname;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Contact Last Name %']/following-sibling::input")
			public WebElementFacade tbx_clccontact_lastname;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Email']/following-sibling::input")
			public WebElementFacade tbx_clccontact_email;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Telephone Number']/following-sibling::input")
			public WebElementFacade tbx_clccontact_telephone;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']//*[text()='Customer Name']/following-sibling::input")
			public WebElementFacade tbx_clccontact_customername;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Search By']/following-sibling::input[@value='GROUPID']")
			public WebElementFacade rdn_Searchslider_clccontact_GROUPID;	
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Search By']/following-sibling::input[@value='GROUPNAME']")
			public WebElementFacade rdn_Searchslider_clccontact_GROUPNAME;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Search By']/following-sibling::input[@value='CUID']")
			public WebElementFacade rdn_Searchslider_clccontact_CUID;
			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Search By']/following-sibling::input[@value='NONE']")
			public WebElementFacade rdn_Searchslider_clccontact_NONE;

			
			@FindBy(xpath=".//*[@id='basicsearch-out-div']/ng-include//label[text()='Search By']/following-sibling::input[@ng-model='searchParam.value']")
			public WebElementFacade tbx_clccontact_searchfield;
			
			@FindBy(xpath="//input[@ng-model='searchParam.value']")
			public WebElementFacade tbx_clccontact_searchfield_searchBy;
			
			@FindBy(xpath="//input[@ng-model='searchParam.clcContactFirstName']")
			public WebElementFacade tbx_clccontact_searchfield_FirstName;
			
			@FindBy(xpath="//input[@ng-model='searchParam.clcContactLastName']")
			public WebElementFacade tbx_clccontact_searchfield_LastName;
			
			@FindBy(xpath="//input[@ng-model='searchParam.email']")
			public WebElementFacade tbx_clccontact_searchfield_email;
			
			@FindBy(xpath="//input[@ng-model='searchParam.telephoneNumber']")
			public WebElementFacade tbx_clccontact_searchfield_telephoneNumber;
			
			@FindBy(xpath="(//input[@ng-model='selectedCustomerFromSolr.ID'])[1]")
			public WebElementFacade tbx_clccontact_searchfield_Customer;
	
//****************************************		GDB **************************************************************//
	

@FindBy(xpath="//select[@id='deviceType']")
			public WebElementFacade ddl_NB_deviceType;//1
			
			@FindBy(xpath="//select[@id='deviceSubType']")
			public WebElementFacade ddl_NB_deviceSubType;//2



@FindBy(xpath="//input[@name='clli']")
			public WebElementFacade tbx_NB_CLLI;

@FindBy(xpath=".//*[@ng-model='invServiceDevLookUp.deviceClli']")
public WebElementFacade tbx_gpon_mdutab_fdhlookup_deviceclli;

//@FindBy(xpath=".//input[@ng-model='gponDeviceObj.DEVICE_DESIGNATOR']")
@FindBy(xpath="//input[@name='desig']")
			public WebElementFacade tbx_NB_Location_Designator;
			

		@FindBy(xpath="//select[@id='aerialBuried']")
			public WebElementFacade ddl_NB_aerialBuried;

			
			@FindBy(xpath="//select[@id='buildType']")
			public WebElementFacade ddl_NB_buildType;

	@FindBy(xpath="//select[@id='indoorOutdoor']")
			public WebElementFacade ddl_NB_indoorOutdoor;

@FindBy(xpath="//select[@id='selfTechInstall']")
			public WebElementFacade ddl_NB_selfTechInstall;

			//@FindBy(xpath="//input[@ng-model='gponDeviceObj.RONTAID ']")
	@FindBy(xpath="//input[@ng-model='aDevice.gponDeviceObj.RONTAID ']")			
	public WebElementFacade tbx_NB_Rontaid;

	@FindBy(xpath="//select[@id='isDiverse']")
			public WebElementFacade ddl_NB_isDiverse;


//@FindBy(xpath="//input[@ng-model='gponDeviceObj.RELAYRACK']")
	@FindBy(xpath="//*[@ng-model='aDevice.gponDeviceObj.RELAYRACK']")
			public WebElementFacade tbx_NB_RelayRack;

@FindBy(xpath="//select[@id='nosaCertificate']")
			public WebElementFacade ddl_NB_nosaCertificate;

@FindBy(xpath=".//*[@ng-model='aDevice.gponDeviceObj.SPLITTERGROUPNUMBER']")
public WebElementFacade tbx_NB_SplitterNumber;

@FindBy(xpath=".//*[@ng-model='aDevice.gponDeviceObj.SPLITTERSTARTPORTNUMBER']")
public WebElementFacade tbx_NB_Splitterport;
	
	@FindBy(xpath=".//*[text()='Address#']/following-sibling::input")
	public WebElementFacade tbx_mltoaddressno;
	
	@FindBy(xpath=".//*[text()='Street Name %']/following-sibling::input")
	public WebElementFacade tbx_mltostreetName;
	
	@FindBy(xpath=".//*[text()='City']/following-sibling::input[@placeholder='City']")
	public WebElementFacade tbx_mltocity;
	
	@FindBy(xpath=".//*[@id='fiberDistNode']")
	public WebElementFacade ddl_gpon_ONTFDNMSTport;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//textarea[@ng-model='aDevice.gponDeviceObj.NETWORK_ELEMENT_NOTE']")
	public WebElementFacade tbx_gdb_ntwkelenode;	
	
	//**********************************************************************************************************************//
	
	//MLTO
	@FindBy(id="OrderNo")
	public WebElementFacade tbx_orderno;
	
	@FindBy(id="customerFirstName")
	public WebElementFacade tbx_mltocustomername;
	
	@FindBy(id="customerLastname")
	public WebElementFacade tbx_customerlastname;
	
	@FindBy(id="customerType")
	public WebElementFacade ddl_customerType;
	
	@FindBy(id="customerSubtype")
	public WebElementFacade ddl_customerSubtype;
	
	@FindBy(id="accountType")
	public WebElementFacade ddl_accountType;

@FindBy(id="remark")
	public WebElementFacade tbx_General_remark;
	
	@FindBy(id="DTN")
	public WebElementFacade tbx_dtn;
	

	
	@FindBy(id="serviceType")
	public WebElementFacade ddl_mltoserviceType;
	
	@FindBy(id="hdStreams")
	public WebElementFacade ddl_hdStreams;
	
	
	@FindBy(id="downSpeed")
	public WebElementFacade ddl_downSpeed;
	
	@FindBy(id="upSpeed")
	public WebElementFacade ddl_upSpeed;		
	
	
	@FindBy(id="featureCodeRemark")
	public WebElementFacade tbx_featureCodeRemark;
	
	@FindBy(id="appointmentStartDate_0")
	public WebElementFacade tbx_appointmentStartDate;
	
	@FindBy(id="appointmentEndDate_0")
	public WebElementFacade tbx_appointmentEndDate;
	
	@FindBy(id="requestedDueDate_0")
	public WebElementFacade tbx_requestedDueDate;
	
	@FindBy(id="dispatchRemark")
	public WebElementFacade tbx_dispatchRemark;
	
	//End of MLTO
	
	//Alt Equit Build order
	
	@FindBy(id="eqRole")
	public WebElementFacade ddl_altequip_equiprole;			
	
	@FindBy(xpath=".//*[@ng-change='checkCLLILength();']")
	public WebElementFacade tbx_altequip_deviceclli;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.DEVICE_DESIGNATOR']")
	public WebElementFacade tbx_altequip_deviceclli_designator;
	
	//@FindBy(xpath=".//*[@ng-show='!existingMode']/select[@id='deviceType']")
	@FindBy(id="deviceType")
	public WebElementFacade ddl_altequip_devicetype;				
	
	@FindBy(id="deviceSubType")
	public WebElementFacade ddl_altequip_devicesubtype;			

	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.RELAYRACK']")
	public WebElementFacade tbx_altequip_relayshelf;
	
	@FindBy(xpath=".//*[@id='affiliateOwner' and @ng-change='enableDisableIsOffnet()']")
	public WebElementFacade ddl_altequip_affliateown;		
	
	//************************************ GFast DLsam Device****************************//
	
		@FindBy(xpath=".//*[@ng-model='trasportPathSearchParam.transportDeviceName']")
		public WebElementFacade tbx_createtab_NB_Transportpath_devicename;
		
		@FindBy(xpath=".//*[@ng-click='createCircuitForRoute();']")
		public WebElementFacade btn_Transportpath_create_form;
		
	
	//************************************ End of GFast DLsam Device****************************//
	
	//************************************ Device Create form Page ****************************//
		
		// Topology Search & select
		
		@FindBy(xpath=".//*[@ng-controller='topologyLookupCtrl']//*[@id='topologylookup']//*[@ng-model='topologyLookUp.topologyType']")
		public WebElementFacade ddl_createdevice_topologytype;
		
		@FindBy(xpath=".//*[@ng-controller='topologyLookupCtrl']//*[@id='topologylookup']//*[@ng-model='topologyLookUp.topologyName']")
		public WebElementFacade tbx_createdevice_topologyname;
		
		
		//***************************************************************************************//
		
		//************************************ Search Result Page ****************************//

		@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading[contains(text(),'Search Results')]")
		public WebElementFacade tab_search_result_page;
		
		//***************************************************************************************//
		
		//*********************** Launch TRANSPORT PATH Create FORM  ************************//
		
	@FindBy(xpath = "//*[@ng-click='createCircuitForRoute();']")
	public WebElementFacade btn_Launch_Network_Create_form;	
				
				
	//***************************************************************************************//
				
			
	//@FindBy(xpath="//*[@ng-controller='inventoryDeviceCreateCtrl']//*[@ng-model='invSubscriber.subscriberName']")
	@FindBy(xpath="//*[@ng-model='invSubscriber.subscriberName']")
	public WebElementFacade tbx_Createdevice_subscribername;
				
	//*********************** Search Tab -- Archive  ************************//
						
				
				
	@FindBy(xpath=".//*[text()='Search From']/following-sibling::select")
	public WebElementFacade ddl_searchtab_archive_searchfrom;
				
	@FindBy(xpath=".//*[text()='Workgroup']/following-sibling::div//input")
	public WebElementFacade tbx_searchtab_archive_workgroup;	
	
	@FindBy(xpath=".//*[text()='Workgroup']/following-sibling::div//*[@class='jqx-icon-close']")
	public WebElementFacade lbl_searchtab_archive_Added_workgroup_closeicon;
	
	@FindBy(xpath=".//*[starts-with(@id,'listBoxContentinnerListBoxjqxWidget')]//*[@aria-selected='true']//b")
	public WebElementFacade lbl_searchtab_archive_workgroup_highlighted;
	
	@FindBy(xpath=".//*[starts-with(@id,'listBoxContentinnerListBox')]//span[text()='Open']")
	public WebElementFacade lbl_searchtab_archive_Openstatus_highlighted;
	
	@FindBy(xpath=".//*[text()='Task Status']/following-sibling::div//*[@id='dropdownlistArrowtaskStatusjqxComboBox']")
	public WebElementFacade btn_searchtab_archive_taskstatus;
	
	@FindBy(xpath=".//*[text()='Task Status']/following-sibling::div//input[@type='textarea']")
	public WebElementFacade tbx_searchtab_taskstatus;
	
	@FindBy(xpath=".//*[starts-with(@id,'listBoxContentinnerListBox')]//*[text()='Completed']")
	public WebElementFacade lbl_searchtab_archive_completedstatus;
	
	@FindBy(xpath=".//*[text()='Task Status']/following-sibling::div//*[@class='jqx-icon-close']")
	public WebElementFacade lbl_searchtab_archive_Added_taskstatus_closeicon;
	
	
	@FindBy(id="PON")
	public WebElementFacade tbx_searchtab_archive_PON;
	
	
	@FindBy(id="CircuitID ")
	public WebElementFacade tbx_searchtab_archive_Circuitid;
	
	@FindBy(id="CSOF Order ID ")
	public WebElementFacade tbx_searchtab_archive_Csofid;
				
	//***************************************************************************************//
	
	//########################  Defect Task ########################################//
	
	@FindBy(xpath="(.//*[@id='basicearch']//label[text()='Task Type']/following-sibling::select)[1]")
	public WebElementFacade ddl_TaskType;
	
	@FindBy(xpath=".//div[@id='taskssearch']//label[text()='Task Status']/../div[@ng-disabled='showMyDefectTaskSrch']//div[@id='dropdownlistArrowtaskStatusjqxComboBox']")
	public WebElementFacade btn_defectTask_taskstatus;
	
	@FindBy(xpath=".//*[@id='dropdownlistContenttaskStatusjqxComboBox']/input")				
	public WebElementFacade tbx_defectTask_status;
	
	@FindBy(xpath=".//*[@aria-selected='true']/span")				
	public WebElementFacade lbl_defectTask_status;
	
	@FindBy(xpath=".//*[@class='jqx-icon-close']")				
	public WebElementFacade btn_defectTask_status_closeicon;
	
	@FindBy(xpath=".//*[@id='Defect Task ID']")				
	public WebElementFacade tbx_Defect_Task_ID;	
	
	@FindBy(xpath="(.//*[@ng-if='showTaskSrch']//*[text()='Task Name']/following-sibling::div//input)[1]")				
	public WebElementFacade tbx_Defect_Task_Taskname;	
	
	
	@FindBy(xpath=".//*[@id='deviceCLLI ']")
	public WebElementFacade tbx_DefectTask_CLLI;
	

	@FindBy(xpath=".//*[@id='deviceName ']")
	public WebElementFacade tbx_DefectTask_DeviceName;

	@FindBy(xpath=".//*[@id='dropdownlistContentworkgroupjqxComboBox']/input")
	public WebElementFacade tbx_DefectTask_Workgroup;
	
	@FindBy(xpath=".//*[@aria-selected='true']/span")				
	public WebElementFacade lbl_DefectTask_Workgroup;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Defect Task Results')]")
	public WebElementFacade tab_DefecttaskResults;
	
	@FindBy(xpath=".//*[@id='dropdownlistContentdefectTaskNamejqxComboBox']/input")
	public WebElementFacade tbx_Defecttask_taskname;
	
	
	
	//########################  Topology create form  ########################################//
	
	@FindBy(id="FULLNAME")
	public WebElementFacade tbx_topologycreateform_fullname;
	
	@FindBy(id="ALIAS1")
	public WebElementFacade tbx_topologycreateform_alias1;
	
	@FindBy(id="NOTES")
	public WebElementFacade tbx_topologycreateform_notes;
	
	//------------------------------------------------------------------------------------------//
	
	
	
	//------------------------------------------------------------------------------------------//
	
	//------------------------- Create Circuit Page -----------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='NAME']")
	public WebElementFacade tbx_Circuitcreate_name ;

	//------------------------------------------------------------------------------------------//
	
	//------------------------- Create Device Page -----------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Create']")
	public WebElementFacade btn_CraeteDev_Create;

	//------------------------------------------------------------------------------------------//
	
	//-------------------------Device Vectoring Page -----------------------------//
	
	@FindBy(xpath=".//span[text()='Vectoring Type']")
	public WebElementFacade lbl_Devresultheader_vectype;
	
	@FindBy(xpath=".//span[text()='Vectoring Topology']")
	public WebElementFacade lbl_Devresultheader_vectoplogy;
	
	@FindBy(xpath=".//*[contains(@id,'jqxScrollAreaDownhorizontalScrollBarjqxGrid')]")
	public WebElementFacade btn_result_rightcornerslider;
	
	//------------------------------------------------------------------------------------------//
	
	
	//######################################################		Logout Page 	######################################################//
	
		
	@FindBy(xpath=".//a[text()='here']")
	public WebElementFacade lbl_OVLogout_relogin;
	
	@FindBy(xpath=".//h1[text()='User Logout']")
	public WebElementFacade lbl_OVLogout_header;	
	
	@FindBy(xpath=".//span[contains(text(),'OMNIVue Version')]")
	public WebElementFacade lbl_OVLogout_version;
	
	
	
	//#######################################################################################################################################//
	
	//######################################################		Configure Page 	######################################################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Application Type')]/following-sibling::select")
	public WebElementFacade ddl_gearicon_configure_applicationtype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Ref Data Table')]/following-sibling::select")
	public WebElementFacade ddl_gearicon_configure_refdatatypetype;
	
	
	
	//#######################################################################################################################################//
	
	
	//######################################################		Location Search Slider New Labels 	######################################################//
	
	@FindBy(xpath=".//label[text()='Full Name']/following-sibling::input")
	public WebElementFacade tbx_searchslider_location_fullname;
	
	@FindBy(xpath=".//label[text()='Address Line 1']/following-sibling::input")
	public WebElementFacade tbx_searchslider_location_addressline1;
	
	@FindBy(xpath=".//label[text()='Address Line 2']/following-sibling::input")
	public WebElementFacade tbx_searchslider_location_addressline2;
	
	@FindBy(xpath=".//label[text()='City %']/following-sibling::input")
	public WebElementFacade tbx_searchslider_location_city;
	
	@FindBy(xpath=".//label[text()='State/Province/Region']/following-sibling::select")
	public WebElementFacade ddl_searchslider_location_state;
	
	@FindBy(xpath="(.//label[text()='Zip/Postal Code']/following-sibling::input)[1]")
	public WebElementFacade tbx_searchslider_location_zip1;
	
	@FindBy(xpath="(.//label[text()='Zip/Postal Code']/following-sibling::input)[2]")
	public WebElementFacade tbx_searchslider_location_zip2;
	
	
	//#######################################################################################################################################//
	
	//***************************************************SOLR suggestions***********************************************************************//
	
	@FindBy(xpath = "//ul[@class='dropdown-menu ng-isolate-scope' and @aria-hidden='false']")
	public WebElementFacade ggl_Solrsuggestions;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu ng-isolate-scope' and @aria-hidden='false']/li[1]/a")
	public WebElementFacade ggl_Solr_value;
	
	
	//***************************************************************************************************************************************//
	
	
	//######################################	SLC			######################################################################//
	
	@FindBy(xpath=" .//*[@id='omnivue']//*[@id='slcFormAddressCreate']")
	public WebElementFacade tbx_SCL_Location_Create_Slider;
	
	@FindBy(xpath=".//*[@id='omnivue']//*[@id='slcSearchTab']")
	public WebElementFacade lnk_SLC_Search_Tab_Location_Create_Slider;
	
	//#######################################################################################################################################//
	
	//############################################################  Device Advance Search #############################################################//
	
	@FindBy(id="deviceRole")
	public WebElementFacade ddl_deviceadvsearch_devicerole;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//label[text()='Vector Enabled']/following-sibling::input")
	public WebElementFacade cbk_deviceadvsearch_vectorenabled;
	
	@FindBy(xpath=".//a[@id='invAdvanceSearch']")
	public WebElementFacade cbk_deviceadvsearch;
	
	@FindBy(xpath=".//select[@id='deviceRole']")
	public WebElementFacade deviceRole_deviceadvsearch;
	
	@FindBy(xpath="(.//select[@id='deviceType'])[2]")
	public WebElementFacade deviceType_deviceadvsearch;
	
	@FindBy(xpath=".//button[@value='Search']")
	public WebElementFacade searchbtn_deviceadvsearch;
	//#######################################################################################################################################//
	
	//############################################################  Circuit Advance Search #############################################################//
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='circuitToCircuitType']")
	public WebElementFacade ddl_circuitadvsearch_circuittype;
	
	//#######################################################################################################################################//
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_search;
	}
	
	public void click_actscreentab(String Acttab) {
		//if(!ddl_createType.isCurrentlyVisible()){
		slf4jLogger.info("Going to click on:"+Acttab);
		WebDriverWait wait = new WebDriverWait(getDriver(),100);	
			switch(Acttab){
			case "Create": //if(!ddl_createType.isCurrentlyVisible()){			
							jsClick(tab_create);
							waitForElement(ddl_createType);
						//	}
							break;
				
			case "Search": //if(!ddl_searchType.isCurrentlyVisible()){
								jsClick(tab_search);
								waitForElement(ddl_searchType);
							break;
			
			case "Gear Icon": if(!lbl_gearicon_administration.isCurrentlyVisible()){
										jsClick(btn_gear_icon); 
										  wait.until(ExpectedConditions.visibilityOf(lbl_gearicon_administration));
									}  break;
									
			case "My Dashboard":click_actscreentab("Gear Icon"); jsClick(lbl_gearicon_mydashbord);
			 					waitForElement(tab_Mydashboard);break;
			 					
			case "Help Icon": jsClick(btn_helpicon);break;
							
			}
	
	}
	
	public void select_administration_gearicon() throws Throwable {
		WebDriverWait wait = new WebDriverWait(getDriver(),100);	
		Actions action = new Actions(getDriver());
		while(!lbl_gearicon_administration_manageusers.isCurrentlyVisible()){
			//action.moveToElement(lbl_gearicon_administration).build().perform();
			action.clickAndHold(lbl_gearicon_administration).build().perform();
			//action.moveToElement(lbl_gearicon_administration,198,25).build().perform();
		 
			 
			
	        wait.until(ExpectedConditions.visibilityOf(lbl_gearicon_administration_manageusers)); 
	        System.out.println("Rechecking on the dropdown");
	        Thread.sleep(1000);
	        
		}
        
	}
	
	public void select_manageusers_administration_gearicon(String managetype) throws Throwable {
		WebDriverWait wait = new WebDriverWait(getDriver(),100);	
		switch(managetype){
		case "Manage Users":jsClick(lbl_gearicon_administration_manageusers);
							wait.until(ExpectedConditions.visibilityOf(btn_manage_users_searchuser)); break;
							
		case "Manage Workgroup":jsClick(lbl_gearicon_administration_manageworkgroups);
						waitForElement(tab_manageworkgroups);break;
		}
		
		
	}
	
	public void  searchtab_serachtype(String searchtype, String search_subtype){
		WebDriverWait wait = new WebDriverWait(getDriver(),100);	
		
		switch(searchtype){
		case "Inventory":ddl_searchType.selectByVisibleText(searchtype);
						wait.until(ExpectedConditions.visibilityOf(btn_CraeteDev_Create)); 
						ddl_invntryType.selectByVisibleText(search_subtype);
						wait.until(ExpectedConditions.visibilityOf(tbx_deviceName));break;	
		}
		
	}
	
	public void selectCreateType(String type, String subtype) {
	//Remove if it workds
		
	}	
	
	public void click_searchbtn(String search_button) throws InterruptedException {
		slf4jLogger.info("Clicking on Search button in the Search Slider");
		//btn_inventorysearch);
		Thread.sleep(1000);
		switch(search_button){
		case "Service Area":jsClick(btn_invservicesearch_contact); break;
		case "Inventory": jsClick(btn_invservicesearch_contact); break;
		case "Orders": /*Actions act=new Actions(getDriver());
		act.moveToElement(btn_ordersearch));//.build().perform().; 
*/			/*			
			  WebElement element = btn_ordersearch;
			  JavascriptExecutor js =(JavascriptExecutor)getDriver();
			  js.executeScript("document.elementFromPoint(" + element.getLocation().x + "," + element.getLocation().y + "));”);
			  js.executeScript("window.scrollTo(0,"+element.getLocation().x+")");
		        element);*/jsClick(btn_ordersearch); 
			break;
		case "Network": jsClick(btn_networksearch); break;
		case "Task": jsClick(btn_tasksearch); waitForElement(tab_closeall_tab); 
		if(tab_taskResults.isCurrentlyVisible()){
			Thread.sleep(2000);
			jsClick(btn_taskResults_previous);Thread.sleep(2000);
		}else{
			System.out.println("No Data Found");
		}
		break;
		case "Service":if(btn_invservicesearch.isCurrentlyVisible()){
			jsClick(btn_invservicesearch);
						}else {
							jsClick(btn_invservicesearch_new);
						}
						 break;
		case "Circuit": jsClick(btn_circuitsearch);
		
		Thread.sleep(10000);
			/*	if(!tab_closeall_tab.isCurrentlyVisible()){		
					//WebElement target = loginPage.getDriver().findElement(By.linkText(btn_circuitsearch.getText()));
					((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", btn_circuitsearch);
					System.out.println("Clicked Search again");
					Thread.sleep(10000); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
					jsClick(btn_circuitsearch);
					}*/
		
		break;
		case "Defect Task":jsClick(btn_DefecttaskSearch);break;
		case "Archive":jsClick(btn_Archivesearch);break;
		case "Contact": jsClick(btn_invservicesearch_contact); break;
		case "Device": /*btn_invservicesearch);*/ jsClick(btn_invservicesearch_contact); break;
		case "Location": /*btn_invservicesearch);*/ jsClick(btn_invservicesearch_contact); break;
		case "Topology": jsClick(btn_invservicesearch_contact); break;
		case "CLC Contact": jsClick(btn_invservicesearch_contact); break;
		case "Link":jsClick(btn_invservicesearch_contact); break;
		case "Transport Path":jsClick(btn_networksearch); Thread.sleep(5000); break;
		}
		
		/*if(search_button.equals("Inventory")){
			btn_inventorysearch);					
		
		}
		else if(search_button.equals("Orders")){
		btn_ordersearch);					
			
		}
		 
		else if(search_button.equals("Network")){
			btn_networksearch);						
		
		}
		else if(search_button.equals("Task")){
			btn_tasksearch);						
			
		}else if(search_button.equals("Service")){
			btn_invservicesearch);						
			
		}else if(search_button.equals("Circuit")){
		btn_circuitsearch);
		}*/
		
		/*while(btn_invservicesearch.isPresent()){
			slf4jLogger.info("Search is still available");
			//btn_inventorysearch);
			if(btn_invservicesearch.isPresent()){
			WebElement target = loginPage.getDriver().findElement(By.xpath(".//*[text()='Search' and @ng-click='searchInventory();' and @ng-hide='isForWidgetCreate']"));
			((JavascriptExecutor) loginPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
			Thread.sleep(500); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
			target);
			break;
			}
		}
		*/
		//loginPage.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(15000);
		//btn_search);
	}
	
	public void click_advsearchbtn(String search_button) throws InterruptedException {
		slf4jLogger.info("Clicking on Advanced Search button in the Search Slider");
		//btn_inventorysearch);
		Thread.sleep(1000);
		switch(search_button){
		case "Device":jsClick(cbk_deviceadvsearch); Thread.sleep(5000); break;
		}
		}
	public void select_devicerole(String Role) throws InterruptedException {
		slf4jLogger.info("Selecting device role in the Advanced Search Slider");
		//btn_inventorysearch);
		Thread.sleep(1000);
		switch(Role){
		case "Device":Thread.sleep(1000);
		jsClick(deviceRole_deviceadvsearch.selectByValue("OLT"));
		Thread.sleep(3000);
		break;
		}
		}
	
	public void select_deviceType(String deviceType) throws InterruptedException {
		slf4jLogger.info("Selecting device Type in the Advanced Search Slider");
		//btn_inventorysearch);
		Thread.sleep(1000);
		jsClick(deviceType_deviceadvsearch.selectByValue(deviceType));
		}
		
	public void click_srchbtn_advsearch() throws InterruptedException {
		
		slf4jLogger.info("Clicking on Search button in the Advanced Search Slider");
		
		jsClick(searchbtn_deviceadvsearch);
		Thread.sleep(5000);
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
	
	public void click_viewbtn() {
		if(btn_view.isCurrentlyVisible()){
			if(tab_search_result_page.isCurrentlyVisible()){
				jsClick(btn_view);	
			}
		} else if(btn_buildid_searchresultpage.isCurrentlyVisible()){
			jsClick(btn_buildid_searchresultpage);
		} else if(btn_networkbuildid_searchresultpage.isCurrentlyVisible()){
			jsClick(btn_networkbuildid_searchresultpage);			
		} else if(btn_viewDSPTask.isCurrentlyVisible()){
			jsClick(btn_viewDSPTask);			
		} else if(btn_ethernettask_view.isCurrentlyVisible()){
			jsClick(btn_ethernettask_view);			
		}		
		
		slf4jLogger.info("Done with View action");
	}
	
	public void clickcreatelaunchform() throws InterruptedException{
		
		jsClick(btn_create_subcform);
		Thread.sleep(5000);
		
	}
	
	public boolean Validation_Usability(String serviceType,String serviceCapabilityType) throws InterruptedException {
		 int i=0,j=10;
		    while(i!=j) 
			{
		    	String actualServiceTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[3]/div";
		 		 
				 String actualServiceType=find(By.xpath(actualServiceTypeXpath)).getText();
				 if(actualServiceType.equals(serviceType))
				 {
					 String actualServiceCapabilityTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div";
					 
					 String actualServiceCapabilityType=find(By.xpath(actualServiceCapabilityTypeXpath)).getText();
					 if(actualServiceCapabilityType.equals(serviceCapabilityType))
					 {
						 slf4jLogger.info("Successfully validated");
						 i=j;
						 slf4jLogger.info(actualServiceType);
						 slf4jLogger.info(actualServiceCapabilityType);
						 
						 return true;
					 }
				 }
				 
				 i++;
			}
			return true;
				 
			}

	
	public void click_Technologytype(String tech){     //Selecting Radio Button in Create Form for Inventory Type		
		try {
		if(ddl_createType.isCurrentlyVisible()){
			switch(tech){
			case "Role":jsClick(rdbtn_role); break;
			case "Technology":jsClick(rdbtn_tech); break;
			case "All":jsClick(rdbtn_all); break;
			}
			//if(!ddl_createType.isCurrentlyVisible()){
				Thread.sleep(2000);
				//jsClick(tab_create);
				//Thread.sleep(1000);
			//}			
			
		} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void selecttech(String techType){   // Selecting the Technology in Create Form for Inventory Type
		if(ddl_Inventory_techType.isCurrentlyVisible()){
			jsClick(ddl_Inventory_techType.selectByVisibleText(techType));
		}
		
		}
	
	public void device_select_create(String devtype,String devsubtype){		//Selecting device type while creating
		try {
			Thread.sleep(1000);
			jsClick(ddl_Inventory_devType.selectByVisibleText(devtype));
			Thread.sleep(1000);
			jsClick(ddl_Inventory_devsubType.selectByVisibleText(devsubtype));
			Thread.sleep(1000);
			btn_Netwrkbuildcreate("Device");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
/*	public void click_launch_create_form(String create_button) throws InterruptedException {							//Shiva
		if(create_button.equals("Device")){
			WebDriverWait wait = new WebDriverWait(getDriver(),30);
			wait.until(ExpectedConditions.elementToBeClickable(btn_createdevice));
			jsClick(btn_createdevice);
		}  else if(create_button.equals("Service")){
			WebDriverWait waita = new WebDriverWait(getDriver(),30);
			 waita.until(ExpectedConditions.elementToBeClickable(btn_createservice));
			 jsClick( btn_createservice);	
		} else if (create_button.equals("NetworkBuild")) {
			WebDriverWait waitb = new WebDriverWait(getDriver(), 30);
			waitb.until(ExpectedConditions
					.elementToBeClickable(btn_createNetwork));
			jsClick(btn_createNetwork);
		} else if (create_button.equals("Location") || create_button.equals("Circuit")) {
			WebDriverWait waitb = new WebDriverWait(getDriver(), 30);
			waitb.until(ExpectedConditions
					.elementToBeClickable(btn_createlocation));
			jsClick(btn_createlocation);
		}
		
		
		Thread.sleep(5000);
		//btn_search);
	}*/
	
	public void i_Select_for_the_drop_down_Service_Type_actvtnpage(String service_type) throws InterruptedException {											//shiva
		
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		
		wait.until(ExpectedConditions.elementToBeClickable(ddl_createServicetype));
		
		//Thread.sleep(3000);
		
		ddl_createServicetype.selectByVisibleText(service_type);
		
	}
	
	
	//Network Build steps
	
	public void btn_Netwrkbuildcreate(String type){
		WebDriverWait wait = new WebDriverWait(getDriver(),100);
		switch(type){
		case "Device": if(btn_Device_launchCreate.isCurrentlyVisible()){
							jsClick(btn_Device_launchCreate);
						} break;
						
		case "NB":if(btn_NB_create.isCurrentlyVisible()){
			
			jsClick(btn_NB_create);
					}break;
					
		case "Order create form":if(btn_order_launchcreateform.isCurrentlyVisible()){
								 jsClick(btn_order_launchcreateform);
								 }break;
								 
		case "Transport Path": if(btn_Transportpath_create_form.isCurrentlyVisible()){
								 jsClick(btn_Transportpath_create_form);
								 }break;
								 
		default: if(ddl_createType.isCurrentlyVisible()){
							if(btn_NB_create.isCurrentlyVisible()){
								
								jsClick(btn_NB_create);
							} else if(btn_Device_launchCreate.isCurrentlyVisible()){
								jsClick(btn_Device_launchCreate);
							}
								else if(btn_create_subcform.isCurrentlyVisible()) {
							
									jsClick(btn_create_subcform);
								
							} else if(btn_topologylaunchCreate.isCurrentlyVisible()){
								jsClick(btn_topologylaunchCreate);
							 }else if(btn_clccontact_launchCreate.isCurrentlyVisible()){
								 jsClick(btn_clccontact_launchCreate);
								 }else if(btn_order_launchcreateform.isCurrentlyVisible()){
									 jsClick(btn_order_launchcreateform);
									 } else if(btn_Transportpath_create_form.isCurrentlyVisible()){
										 jsClick(btn_Transportpath_create_form);
										 }
							break;
		}	
		
		
		wait.until(ExpectedConditions.elementToBeClickable(tab_closeall_tab));
	}
	}
	
	
	public void locntype(String lcntype){		//Sairam code merge---21/7/2016--@US48525 @TC53733
		try {
			ddl_Locationtype.selectByVisibleText(lcntype);
			Thread.sleep(1000);
			jsClick(btn_Location_create);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public void sel_devicesubtype(String splitter_option) {											//shiva
		
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		
		wait.until(ExpectedConditions.elementToBeClickable(ddl_Inventory_devsubType));
		
		ddl_Inventory_devsubType.selectByVisibleText(splitter_option);
		
	}
	
	
	public void createDeviceRole_Name(String devRole,String devName){		//Selecting device type while creating
		try {
			Thread.sleep(1000);
			ddl_devRole.selectByVisibleText(devRole);
			Thread.sleep(1000);
			tbx_devName.sendKeys(devName);
			Thread.sleep(1000);
			jsClick(btn_topologylaunchCreate);
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectTopologyType_State(String topologyType,String state){		//Selecting device type while creating
		try {
			Thread.sleep(1000);
			ddl_topologyTypeForSearch.selectByVisibleText(topologyType);
			Thread.sleep(1000);
			ddl_createState.selectByVisibleText(state);
			Thread.sleep(1000);
			jsClick(btn_topologylaunchCreate);
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void SearchTopology(String TopologyName){		//Selecting Topology Name while creating
		try {
			Thread.sleep(1000);
			click_actscreentab("Search");
			Thread.sleep(1000);
			ddl_searchType.selectByVisibleText("Inventory");
			Thread.sleep(1000);
			ddl_invntryType.selectByVisibleText("Topology");
			Thread.sleep(1000);
			tbx_topologyname.sendKeys(TopologyName);	
			click_searchbtn("Inventory");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
			
	public void createtab_inventory_number_typeselect(String numtype){
		try {
		switch(numtype){
		case "Ethernet":jsClick(rbn_createtab_number_techtype_ethernet);Thread.sleep(1000); break;
		case "VLAN":jsClick(rbn_createtab_number_techtype_gpon);			
					Thread.sleep(1000);
					jsClick(ddl_Createtab_Inventory_Number_gponType.selectByVisibleText(numtype));break;
		default:jsClick(rbn_createtab_number_techtype_ethernet);Thread.sleep(1000);
				jsClick(ddl_Createtab_Inventory_Number_EthernetType.selectByVisibleText(numtype));break;
		}
		
		/*if(numtype.equals("VLAN")){
			jsClick(rbn_createtab_number_techtype_gpon);			
				Thread.sleep(1000);
				jsClick(ddl_Createtab_Inventory_Number_gponType.selectByVisibleText(numtype));
			
		} else {
			jsClick(rbn_createtab_number_techtype_ethernet);Thread.sleep(1000);
			jsClick(ddl_Createtab_Inventory_Number_EthernetType.selectByVisibleText(numtype));
		}		*/
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void task_name_select(String taskname) throws Throwable{
		waitForElement(btn_tasksearch);
		if(btn_taskname_closeicon.isCurrentlyVisible()){
			jsClick(btn_taskname_closeicon);
		} int i=1;
		while(!btn_taskname_closeicon.isCurrentlyVisible()){
			ddl_searchtab_taskname.type(taskname);	
			Thread.sleep(3000);	    
			 if(lbl_searchtab_taskname.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_taskname); Thread.sleep(2000); break;
			 }	 
			jsClick(ddl_searchtab_taskname);Thread.sleep(1000);
			i++;
			if(i==5){
				break;
			}
		}		
	}
	
	
	public void validate_topologydropdownvalues(String slider) throws Throwable {
		String[] expectedvalues = {"--Select--", "Generic Network", "MEN Topology", "PON Network"};		
		Select Select_Topology=null;
		switch(slider){
		case "Search":Select_Topology=new Select(ddl_search_topologyType);break;
		case "Create":Select_Topology=new Select(ddl_createtab_topologytype);break;
		
		}
		
		
		List<WebElement>  allvalues_topology=Select_Topology.getOptions();
		
		for(String str:expectedvalues) 
		{
			boolean found=false;
			for(WebElement ele1:allvalues_topology)
			{
				
				if(str.equals(ele1.getText()))
				{
					found=true;
					slf4jLogger.info(str+" Topoplgy exists");
					break;
				}
			}
			if(!found)
			{
				throw new Error("Topology does not exist");
			}
		}
	}
	
	public void task_searchtype_tasktype(String Search_Type,String Task_Type) throws Throwable {				
		
		jsClick(ddl_searchType.selectByValue(Search_Type));
		waitForElement(ddl_TaskType);
		
		
		ddl_TaskType.selectByValue(Task_Type);
	    
	}
	
	public void select_search_taskworkgroup(String workgp) throws Throwable {
		tbx_DefectTask_Workgroup.type(workgp);
		waitForElement(lbl_DefectTask_Workgroup);
		jsClick(lbl_DefectTask_Workgroup);
	}
	
	public void Defect_task_search() throws Throwable {
		 if (tab_DefecttaskResults.isDisplayed()) {
				
		    	System.out.println("User is able to Search defect Task using Workgroup");
		    	
			}
		    else{throw new Error("User is not able to Search defect Task using Workgroup");}
	}
	
	public void select_search_taskstatus(String status) throws Throwable {
	//String Message;
		//btn_defectTask_taskstatus);
		//tbx_defectTask_status.type("C");
		//tbx_defectTask_status.type(status);

		/*waitFor(lbl_defectTask_status);
		lbl_defectTask_status);*/
		Thread.sleep(2000);
		switch(status){
		case "Open":	waitForElement(tbx_defectTask_status); //btn_defectTask_taskstatus.click();
			tbx_defectTask_status.type(status);	Thread.sleep(1000);tbx_defectTask_status.type(status);
			
						waitForElement(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));
						Thread.sleep(2000);
						jsClick(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]"))); break;
			
			default:  tbx_Defect_Task_Taskname.type(status);
			waitForElement(getDriver().findElement(By.xpath(".//*[starts-with(@id,'listBoxContentinnerListBox')]//*[@aria-selected='true']/span[contains(text(),'"+status.substring(1)+"')]")));
			jsClick(getDriver().findElement(By.xpath(".//*[starts-with(@id,'listBoxContentinnerListBox')]//*[@aria-selected='true']/span[contains(text(),'"+status.substring(1)+"')]")));
			if(status.equals("Location Test")){
				tbx_Defect_Task_ID.type("1107");
			}
			
			break;
				
		}
		
	
	}
	
	public void i_select_topology_type_and_topology_role_search_slider(String topologytype, String topologyrole) throws Throwable {		
		
		
		ddl_Search_topologyType.selectByVisibleText(topologytype);
		Thread.sleep(1000);
		
		dd_topology_role.selectByVisibleText(topologyrole);
	
	}
	public void i_select_topologyType_topologyRole_technologyType_search_slider(String topologytype, String topologyrole,  String technologyType) throws Throwable {		
		
		
		ddl_Search_topologyType.selectByVisibleText(topologytype);
		Thread.sleep(1000);
		
		dd_topology_role.selectByVisibleText(topologyrole);
		
		Thread.sleep(1000);
		dd_Search_topology_techType.selectByVisibleText(technologyType);
		
	}
      public void i_click_view_icon() throws Throwable {		
	Thread.sleep(1000);	
	btn_view_icon.click();
	Thread.sleep(1000);
	 }
     
      public void i_validate_expend_minimize_arrows()throws Throwable {		
    		Thread.sleep(3000);	
    		waitForElement(btn_rightarrow_Topology);
    		jsClick(btn_rightarrow_Topology);
    		Thread.sleep(1000);
    		jsClick(btn_leftarrow_Topology);
    		Thread.sleep(1000);
    		jsClick(btn_leftarrow_Topology);
    		Thread.sleep(1000);
    		jsClick(btn_rightarrow_Topology);
      }
	public void validate_topologytype_searchslider() throws Throwable {
		String[] expectedvalues = {"--Select--", "G.8032", "Calix ERP", "MPLS", "LACP", "Spanning Tree", "IP", "BGP-LU"};		
		
		Select Select_Topology_techtype =	new Select(dd_Search_topology_techType);
		
		List<WebElement>  allvalues_topology=Select_Topology_techtype.getOptions();
		
		for(String str:expectedvalues) 
		{
			boolean found=false;
			for(WebElement ele1:allvalues_topology)
			{
				
				if(str.equals(ele1.getText()))
				{
					found=true;
					slf4jLogger.info(str+" Topology Technology Type exists");
					break;
				}
			}
			if(!found)
			{
				throw new Error("Topolgy Technology Type does not exist");
			}
		}
		
	}
	
	public void validate_topologytype_searchslider_forHostClient() throws Throwable {
		String[] expectedvalues = {"--Select--", "ALU-Nokia 7750 Series", "Cisco ASR 9000 Series"};		
		
		Select Select_Topology_techtype =	new Select(dd_Search_topology_techType);
		
		List<WebElement>  allvalues_topology=Select_Topology_techtype.getOptions();
		
		for(String str:expectedvalues) 
		{
			boolean found=false;
			for(WebElement ele1:allvalues_topology)
			{
				
				if(str.equals(ele1.getText()))
				{
					found=true;
					slf4jLogger.info(str+" Topology Technology Type exists");
					break;
				}
			}
			if(!found)
			{
				throw new Error("Topolgy Technology Type does not exist");
			}
		}
		
	}
	 
	
	public void i_check_FAQ() throws Throwable{
		if(lbl_gearicon_faq.isVisible()){
			throw new Error("FAQ link is stil present");
		}
		else
			System.out.println("Test Passed as FAQ link is not present");
	}
	
	public void Geartab_validation(String geartype) throws Throwable {
		waitForElement(lbl_gearicon_administration);
		switch(geartype){
				case "App Version" : if(!lbl_gearicon_appversion.getText().trim().contains(Page.envData.getFieldValue("OV-Version"))){
												throw new Error("App version is not correct its displayed as "+lbl_gearicon_appversion.getText().trim());
											} break;
											
				case "FAQ Link": if(!lbl_gearicon_faq.isCurrentlyVisible()){
										throw new Error("FAQ Link is not correct under Gear icon");
									} break;
									
				case "Link to User Guide":if(!lbl_gearicon_userguide.isCurrentlyVisible()){
											throw new Error("FAQ Link is not Displayed under Gear icon");
										} break;
										
				case "Administration": if(!lbl_gearicon_userguide.isCurrentlyVisible()){
												throw new Error("Administration is not Displayed under Gear icon");
											} break;
											
				case "Reports": if(!lbl_gearicon_reports.isCurrentlyVisible()){
									throw new Error("Reports is not Displayed under Gear icon");
								} break;
								
				case "Configure":  if(!lbl_gearicon_configure.isCurrentlyVisible()){
										throw new Error("Configure is not Displayed under Gear icon");
									} break;
									
				case "Logout": if(!lbl_gearicon_logout.isCurrentlyVisible()){
									throw new Error("Logout is not Displayed under Gear icon");
								} break;
								
				case "Manage Tags":if(!lbl_gearicon_Managetags.isCurrentlyVisible()){
										throw new Error("Manage Tags is not Displayed under Gear icon");
									} break;
									
				}		
		  
	}
	
	public void createtab_createtypeselect(String createtype) throws Throwable{
		jsClick(ddl_createType.selectByVisibleText(createtype));
	}
	
	public void createtab_createInventory_typ(String invtype) throws Throwable{
		jsClick(ddl_CreateinvntryType.selectByVisibleText(invtype));
	}
	
	
	
	public void createtab_createInventory_typeselect(String Inventorytype, String Subtype) throws Throwable{
		switch(Inventorytype){
		case "Circuit": if(!ddl_CreateTab_invntry_circuitType.isCurrentlyVisible()){
							jsClick(ddl_CreateinvntryType.selectByVisibleText(Inventorytype));
							}ddl_CreateTab_invntry_circuitType.selectByVisibleText(Subtype); break;
		}
		
		
	}
	
	public void inventory_advancecircuittypeselect(String circuittype) throws Throwable {
		waitForElement(ddl_circuitadvsearch_circuittype); Thread.sleep(2000);
		ddl_circuitadvsearch_circuittype.selectByVisibleText(circuittype);
	}
	
	public void i_enterlinkname_as(String Lname) throws Throwable {
		waitForElement(tbx_Searchtab_Inventory_Linkname);
		tbx_Searchtab_Inventory_Linkname.type(Lname);
	}
	public void searchslider_clccontact(String slidr) throws Throwable {	
		switch(slidr){
		case "Group Id": jsClick(rdn_Searchslider_clccontact_GROUPID);break;
		case "Group Name":jsClick(rdn_Searchslider_clccontact_GROUPNAME);break;
		case "CUID":jsClick(rdn_Searchslider_clccontact_CUID);break;		
		case "None":jsClick(rdn_Searchslider_clccontact_NONE);break;
		}
		Thread.sleep(1000);
	}
	public void verify_validation(String validation) throws Throwable {		
		String message;
		String[] createtype;
		int i=0,j=0;
		switch(validation){
		case "search Fiber Build based on device name":
						tbx_SerachNB_fiberbuild_devicename.type("-ONT-");			
						waitForElement(lbl_SerachNB_fiberbuild_deviceresult);
						jsClick(lbl_SerachNB_fiberbuild_deviceresult);			
						break;
						
		case "enter Initiated by field with a value for GDB":
			waitForElement(tbx_Searchtab_networkbuild_buildid); Thread.sleep(2000);			
			tbx_Searchtab_networkbuild_initiatedby.type(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));			
			break;
			
		case "enter Last Modified by field with a value for GDB":
			waitForElement(tbx_Searchtab_networkbuild_buildid); Thread.sleep(2000);	
			tbx_Searchtab_networkbuild_lastmodifiedby.click();
			tbx_Searchtab_networkbuild_lastmodifiedby.sendKeys(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));			
			break;
			
		case "360 view for GPON Build Template on Quick search":
					message=lbl_GCT_templatename_result.getText().trim();			
					jsClick(tab_closeall_tab);			
					click_actscreentab("Search");			
					waitForElement(tbx_Searchtab_networkbuild_GCT_templatename); Thread.sleep(1000);
					tbx_Searchtab_networkbuild_GCT_templatename.type(message);	
					jsClick(btn_networksearch);
					
					break;
			
		case "enter template name as test for GPON Build Templates":
			waitForElement(tbx_Searchtab_networkbuild_GCT_templatename); Thread.sleep(1000);
			tbx_Searchtab_networkbuild_GCT_templatename.type("test");				
			break;
		case "enter Device Address field with a value for GDB":
			waitForElement(tbx_Searchtab_networkbuild_buildid); Thread.sleep(2000);			
			tbx_Searchtab_networkbuild_deviceaddr.type("123%");			
			break;
			
		case "enter Device clli field with a value for GDB":
			waitForElement(tbx_Searchtab_networkbuild_buildid); Thread.sleep(2000);			
			tbx_Searchtab_networkbuild_deviceclli.type("TESTYYYY");
			break;
			
		case "Device CLLI field is an additional search option for GDB":
			waitForElement(tbx_Searchtab_networkbuild_buildid); Thread.sleep(2000);
			if(!tbx_Searchtab_networkbuild_buildid.isCurrentlyVisible() && !tbx_Searchtab_networkbuild_buildid.isCurrentlyEnabled()){
				slf4jLogger.debug("Build ID field is not displayed under Serach Network Build");
				throw new Error("Build ID field is not displayed under Serach Network Build");
			}
			if(!tbx_Searchtab_networkbuild_engorderid.isCurrentlyVisible() && !tbx_Searchtab_networkbuild_engorderid.isCurrentlyEnabled()){
				slf4jLogger.debug("Engineering Order ID field is not displayed under Serach Network Build");
				throw new Error("Engineering Order ID field is not displayed under Serach Network Build");
			}
			if(!tbx_Searchtab_networkbuild_deviceclli.isCurrentlyVisible() && !tbx_Searchtab_networkbuild_deviceclli.isCurrentlyEnabled()){
				slf4jLogger.debug("Device CLLI field is not displayed under Serach Network Build");
				throw new Error("Device CLLI field is not displayed under Serach Network Build");
			}
			if(!tbx_Searchtab_networkbuild_deviceaddr.isCurrentlyVisible() && !tbx_Searchtab_networkbuild_deviceaddr.isCurrentlyEnabled()){
				slf4jLogger.debug("Device Address field is not displayed under Serach Network Build");
				throw new Error("Device Address field is not displayed under Serach Network Build");
			}
			if(!tbx_Searchtab_networkbuild_initiatedby.isCurrentlyVisible() && !tbx_Searchtab_networkbuild_initiatedby.isCurrentlyEnabled()){
				slf4jLogger.debug("Initiated By field is not displayed under Serach Network Build");
				throw new Error("Initiated By field is not displayed under Serach Network Build");
			}
			if(!tbx_Searchtab_networkbuild_lastmodifiedby.isCurrentlyVisible() && !tbx_Searchtab_networkbuild_lastmodifiedby.isCurrentlyEnabled()){
				slf4jLogger.debug("Last Modified By field is not displayed under Serach Network Build");
				throw new Error("Last Modified By field is not displayed under Serach Network Build");
			}		
			
			break;
		case "on the completed task edit dsp task button is disabled":

							waitForElement(btn_taskResults_previous);
							if(btn_edit_DSPTask.isCurrentlyEnabled()){
								slf4jLogger.debug("Edit DSP Task is enabled for Completed Task");
								throw new Error("Edit DSP Task is enabled for Completed Task");
							}
							break;
							
		case "select Task Status as completed under search slider":

						waitForElement(tbx_searchtab_taskstatus);Thread.sleep(1000);
						
					//	jsClick(btn_searchtab_archive_taskstatus);
					
						while(!lbl_searchtab_archive_Added_taskstatus_closeicon.isCurrentlyVisible()){
							tbx_searchtab_taskstatus.type("Completed");Thread.sleep(2000);
							if(!lbl_searchtab_archive_completedstatus.isCurrentlyVisible()){
								jsClick(btn_searchtab_archive_taskstatus);
							} else {
								jsClick(lbl_searchtab_archive_completedstatus);Thread.sleep(2000);
							}
							
						}
						
								break;
					
		case "the device advanced search result by selecting Vector Enabled check box":
			waitForElement(ddl_deviceadvsearch_devicerole);
			
			jsClick(cbk_deviceadvsearch_vectorenabled);
			
			
			break;
		case "search Alt Equip build based Created by criteria":
					waitForElement(tbx_searchslider_initiatedby); Thread.sleep(1000);
					tbx_searchslider_initiatedby.type(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));
					break;
		case "Google Type search field  is enabled":
								if(tab_closeall_tab.isCurrentlyVisible()){
									jsClick(tab_closeall_tab);
								}
								if(!ddl_selectmodule.isCurrentlyEnabled()){
									throw new Error("Google select module is not Displayed in OV");
								}
								if(!tbx_googlesearchdata.isCurrentlyEnabled()){
									throw new Error("Google Search data is not Displayed in OV");
								}
								if(!btn_googlesearchdata_go.isCurrentlyVisible() && !btn_googlesearchdata_go.isCurrentlyEnabled()){
									throw new Error("Google Search data Go button is not Displayed in OV");
								}break;
										 	
			
		case "SOLR Suggestions for google search":
										//WebDriverWait wait = new WebDriverWait(getDriver(), 30);
							
										waitForElement(tbx_googlesearchdata);
										//List<String> autoSuggest = ggl_Solrsuggestions.
									//	autoSuggest.
												
										tbx_googlesearchdata.type("CTL I");
										Thread.sleep(2000);
										if (ggl_Solrsuggestions.isCurrentlyVisible()) {
							
											slf4jLogger.info("SOLR feature is working fine");
										} else {
											slf4jLogger.info("SOLR feature is NOT working");
										}
									
										int count = loginPage.getDriver().findElements(By.xpath(".//ul[@role='listbox']/li")).size();
										//tbx_googlesearchdata.type("CTL");
										System.out.println("Count"+count);
										
										for(j=1;j<=count;j++){
											String slots=".//ul[@role='listbox']/li["+j+"]/a[starts-with(text(),'SBCBR')] ";
											if(loginPage.getDriver().findElement(By.xpath(slots)).getText().startsWith("SBCBR")){
												Thread.sleep(3000);
												slf4jLogger.info("Subscriber --"+loginPage.getDriver().findElement(By.xpath(slots)).getText());
																	
											} else slf4jLogger.info("Subscriber is not selected"+j);
										}
										
										ggl_Solr_value.click();
										tbx_googlesearchdata.getText();
										
										//wait.until(ExpectedConditions.elementToBeClickable(ddl_subscriberSolr));
							
										Thread.sleep(2000);
									break;
									
		case "new labels and text boxes for Location in the search slider":
											waitForElement(tbx_searchslider_location_fullname);
											if(!tbx_searchslider_location_fullname.isCurrentlyVisible()){
												 slf4jLogger.error("Location Full Name field is not displayed in the Search slider");
													throw new Error("Location Full Name field is not displayed in the Search slider");
											}
											
											
											if(!tbx_searchslider_location_addressline1.isCurrentlyVisible()){
												 slf4jLogger.error("Location Address Line 1 field is not displayed in the Search slider");
													throw new Error("Location Address Line 1 field is not displayed in the Search slider");
											}
											
											if(!tbx_searchslider_location_addressline2.isCurrentlyVisible()){
												slf4jLogger.error("Location Address Line 2 field is not displayed in the Search slider");
												throw new Error("Location Address Line 2 field is not displayed in the Search slider");
											}
											
											if(!tbx_searchslider_location_city.isCurrentlyVisible()){
												slf4jLogger.error("Location City field is not displayed in the Search slider");
												throw new Error("Location City field is not displayed in the Search slider");
											}
											
											if(!ddl_searchslider_location_state.isCurrentlyVisible()){
												slf4jLogger.error("Location State/Province/Region field is not displayed in the Search slider");
												throw new Error("Location State/Province/Region field is not displayed in the Search slider");
											}
											
											if(!tbx_searchslider_location_zip1.isCurrentlyVisible()){
												slf4jLogger.error("Location Zip/Postal Code is not displayed in the Search slider");
												throw new Error("Location Zip/Postal Code field is not displayed in the Search slider");
											}
											
											if(!tbx_searchslider_location_zip2.isCurrentlyVisible()){
												slf4jLogger.error("LocationZip/Postal Code is not displayed in the Search slider");
												throw new Error("Location Zip/Postal Code is not displayed in the Search slider");
											}
											
																						break;
											
		case "search for the GPON Device Build data in search slider":
											ddl_searchType.selectByValue("Network Build"); 	Thread.sleep(2000);
											ddl_networkType.selectByVisibleText("GPON Device Build"); Thread.sleep(2000);
											tbx_searchslider_initiatedby.type(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));
											break;

		case "Ref Data Table is displayed for all the Application Type in the Configure screen":
											waitForElement(ddl_gearicon_configure_applicationtype);
											
											ArrayList<String> configure_applicationtype=new ArrayList<String>();
											
											configure_applicationtype.add(0, "ARM");
											configure_applicationtype.add(1, "CLC");
											configure_applicationtype.add(2, "DSP");
											configure_applicationtype.add(3, "ICL");
											configure_applicationtype.add(4, "OMNIVUE");
											
											for(i=0;i<5;i++){
												ddl_gearicon_configure_applicationtype.selectByVisibleText(configure_applicationtype.get(i));
												Thread.sleep(2000);
												for(j=0;j<2;j++){
													ddl_gearicon_configure_refdatatypetype.selectByIndex(j);
													
													Thread.sleep(3000);
												}	
												
											}										
												break;
			
		case "VPN ID, VPN-ID Range, VPN-ID SubRange Ethernet technology type is not displayed in the Create slider":
					jsClick(rbn_createtab_number_techtype_ethernet);Thread.sleep(1000);
					
					 Select select = new Select(ddl_Createtab_Inventory_Number_EthernetType);  
					 
					 List<WebElement> options = select.getOptions();  
					 
					 for(WebElement we:options)  
				        {  
				         for (i=0; i<options.size(); i++){
				             if (we.getText().equals("VPN ID") || we.getText().equals("VPN-ID Range") || we.getText().equals("VPN-ID SubRange")){
				            	 slf4jLogger.error("VPN ID, VPN-ID Range, VPN-ID SubRange Ethernet technology type is displayed in the Create slider");
									throw new Error("VPN ID, VPN-ID Range, VPN-ID SubRange Ethernet technology type is displayed in the Create slider");
				             	} 
				           }
				         }  			
					break;
			
		case "Vectoring Type and Vectoring Topology table header should not be in device search result page": waitForElement(btn_view); 		
		
																					jsClick(btn_result_rightcornerslider);Thread.sleep(1000);															
																															
																			if(lbl_Devresultheader_vectype.isCurrentlyVisible() && lbl_Devresultheader_vectoplogy.isCurrentlyVisible()){
																				slf4jLogger.error("Vectoring Type and Vectoring Topology table header is displayed for Vector info was not selected");
																				throw new Error("Vectoring Type and Vectoring Topology table header is displayed for Vector info was not selected");
																			}break;
																			
		case "select the Vector Enabled checkbox on search slider and click on search button":
			jsClick(cbk_searchslider_device_vectorenabled); 
			click_searchbtn("Device");
			
			
			break;
		
		case "don't select the Vectoring Info checkbox on search slider and click on search button":	ddl_deviceType.selectByVisibleText("Calix C Series");
																										click_searchbtn("Device");
																										break;
																										
		case "the device search result by selecting Vector Enabled check box in search slider":
													waitForElement(btn_view); 	
													jsClick(btn_result_rightcornerslider);Thread.sleep(1000);	
													if(lbl_Devresultheader_vectype.isCurrentlyVisible() && lbl_Devresultheader_vectoplogy.isCurrentlyVisible()){
														slf4jLogger.info("Vectoring Type and Vectoring Topology table header is displayed");
													}
													else {
														slf4jLogger.info("Vectoring Type and Vectoring Topology table header is not displayed");
														throw new Error("Vectoring Type and Vectoring Topology table header is not displayed");
													}break;
		case "Vectoring Type and Vectoring Topology table header should be in device search result page": waitForElement(btn_view); 		
		
																											jsClick(btn_result_rightcornerslider);

																											if(lbl_Devresultheader_vectype.isCurrentlyVisible() && lbl_Devresultheader_vectoplogy.isCurrentlyVisible()){
																												slf4jLogger.info("Vectoring Type and Vectoring Topology table header is displayed");
																											}
																											else {
																												slf4jLogger.info("Vectoring Type and Vectoring Topology table header is not displayed");
																												throw new Error("Vectoring Type and Vectoring Topology table header is not displayed");
																											}break;
		case "select the Vectoring Info checkbox on search slider and click on search button":
														jsClick(cbk_searchslider_device_vectorenabled); 
														click_searchbtn("Device");
														break;
		case "Include Vectoring Info checkbox on search slider should be displayed": 
			if(cbk_searchslider_device_vectorinfo.isCurrentlyVisible() && cbk_searchslider_device_vectorinfo.isSelected()){
				slf4jLogger.error("Vectoring Info checkbox on search slider is displayed instead of Vector Enabled check box");
				throw new Error("Vectoring Info checkbox on search slider is displayed instead of Vector Enabled check box");
			}	
			
			if(!cbk_searchslider_device_vectorenabled.isCurrentlyVisible() && !cbk_searchslider_device_vectorenabled.isSelected()){
				slf4jLogger.error("Vector Enabled check box on search slider is not displayed");
				throw new Error("Vector Enabled check box on search slider is not displayed");
			}	
			break;
			
		case "the Vector Enabled check box instead of Include vectoring check box in device search slider":
			if(cbk_searchslider_device_vectorinfo.isCurrentlyVisible() && cbk_searchslider_device_vectorinfo.isSelected()){
				slf4jLogger.error("Vectoring Info checkbox on search slider is displayed instead of Vector Enabled check box");
				throw new Error("Vectoring Info checkbox on search slider is displayed instead of Vector Enabled check box");
			}	
			
			if(!cbk_searchslider_device_vectorenabled.isCurrentlyVisible() && !cbk_searchslider_device_vectorenabled.isSelected()){
				slf4jLogger.error("Vector Enabled check box on search slider is not displayed");
				throw new Error("Vector Enabled check box on search slider is not displayed");
			}
			
			break;
			
		case "search QOS Template with Template name as TEST": 
									tbx_searchtab_Template_name.type("TEST"); break;
		case "Ethernet Bearer":createtab_createInventory_typeselect("Circuit",validation); break;
			
		case "MEF ENNI":jsClick(ddl_createServicetype.selectByVisibleText(validation));
		case "Apart from My Dashboard default options like Google Type search option, Gear Icon, Help Icon, Search Tab & Create Tab is not been disturbed":

			if(!tab_search.isCurrentlyVisible() && !tab_search.isCurrentlyEnabled()){
				throw new Error("Search Tab is not Displayed in OV");
			}
			if(!tab_create.isCurrentlyVisible() && !tab_create.isCurrentlyEnabled()){
				throw new Error("Create Tab is not Displayed in OV");
			}
			if(!btn_gear_icon.isCurrentlyVisible() && !btn_gear_icon.isCurrentlyEnabled()){
				throw new Error("Gear Icon is not Displayed in OV");
			}
			if(!btn_stickynoteedit.isCurrentlyVisible() && !btn_stickynoteedit.isCurrentlyEnabled()){
				throw new Error("Edit sticky note is not Displayed in OV");
			}			
			if(!lbl_ctlilogo.isCurrentlyVisible()){
				throw new Error("CTLI Logo is not Displayed in OV");
			}
			if(!ddl_selectmodule.isCurrentlyVisible()){
				throw new Error("Google select module is not Displayed in OV");
			}
			if(!tbx_googlesearchdata.isCurrentlyVisible()){
				throw new Error("Google Search data is not Displayed in OV");
			}
			if(!btn_googlesearchdata_go.isCurrentlyVisible() && !btn_googlesearchdata_go.isCurrentlyEnabled()){
				throw new Error("Google Search data Go button is not Displayed in OV");
			}
			if(!btn_helpicon.isCurrentlyVisible() && !btn_helpicon.isCurrentlyEnabled()){
				throw new Error("Help Icon is not Displayed in OV");
			} break;
			
		case "Bandwidth Upgrade Check, Inventory, Network Build, Orders":	
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){
				createtab_createtypeselect(createtype[i].trim());
			}break;
			
		case "Ethernet Bearer, LAG, Optical Bearer, PON, Pseudo Wire, Topology Virtual Circuit, VLAN Segment":
					createtype = validation.split(",");
					for(i=0;i<createtype.length;i++){
						createtab_createInventory_typeselect("Circuit",createtype[i].trim());
					}break;						
						
		case "CLC Contact, Circuit, Contact, Device, Link, Location, Number, QOS Template, Reservation, Service, Service Area, Subscriber":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){
				createtab_createInventory_typ(createtype[i].trim());
			}break;
			
		case "Role, Technology, All":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){
				click_Technologytype(createtype[i].trim());
			}break;
			
		case "AGG, BRAS, DSLAM, FDH, FDP, MDU, MST, NID, NPE, OLT, ONT, SPLITTER":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_role.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "ETHERNET, GPON, PASSIVE":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				selecttech(createtype[i].trim());
			}break;
			
		case "Suttle MST, Calix E7, Corning MST, Fiber Splitter, Calix C Series, Calix 800G Series ONT":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_Inventory_devType.selectByVisibleText(createtype[i].trim()));
			}break;
			
		case "BackPlane Link, Fiber, StackRing Link, Unshielded Twisted Par(UTP)":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_Createtab_Inventory_LinkType.selectByVisibleText(createtype[i].trim()));
			}break;
			
		case "Address Range, Individual Location, Bulk Create":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_Createtab_Inventory_LocationType.selectByVisibleText(createtype[i].trim()));
			}break;
			
		case "Ethernet Bearer, LAG Port, VLAN Interface":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_Createtab_Inventory_PortType.selectByVisibleText(createtype[i].trim()));
			}break;
			
		case "DSL OVC, ENNI Link, HSI, Host Service, IPTV, IPTV Unicast, MEF ENNI,	MEF OVC, MEF UNI, MGR UNI, Probe UNI":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_createServicetype.selectByVisibleText(createtype[i].trim()));
			}break;
			
		case "CE-VLAN, S-VLAN, ASN 209 VPNID Range, MEP-ID, PW-ID, SAP, SDP, VSI, VLAN":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				createtab_inventory_number_typeselect(createtype[i].trim());
			}break;
			
		case "Generic Network, MEN Topology, PON Network":	
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_createtab_topologytype.selectByVisibleText(createtype[i].trim()));
			}break;
			
		case "Alternate Equipment Build, GPON Device Build, Transport Path":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_CreateNetworkType.selectByVisibleText(createtype[i].trim()));
			}break;	
			
			
		case "CE, Non-CE":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_EquipmentBuildType.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "BRAS, DSLAM, NID":
			createtype = validation.split(",");
			for(i=0;i<createtype.length;i++){				
				jsClick(ddl_devRole.selectByVisibleText(createtype[i].trim()));
			}break;		
			
		case "fields that are enabled by selecting different Search by conditions under CLC contact search Slider":
				searchslider_clccontact("None"); Thread.sleep(2000);			
						if(tbx_clccontact_searchfield.isCurrentlyEnabled()){
							slf4jLogger.error("Search field is enabled for None Search by");
							throw new Error("Search field is enabled for None Search by");
						}
						if(!tbx_clccontact_firstname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact First name field is not enabled for None Search by");
							throw new Error("CLC Contact First name field is not enabled for None Search by");
						}
						if(!tbx_clccontact_lastname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Last name field is not enabled for None Search by");
							throw new Error("CLC Contact Last name field is not enabled for None Search by");
						}
						if(!tbx_clccontact_email.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact e-mail field is not enabled for None Search by");
							throw new Error("CLC Contact e-mail field is not enabled for None Search by");
						}
						if(!tbx_clccontact_telephone.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Telephone field is not enabled for None Search by");
							throw new Error("CLC Contact Telephone field is not enabled for None Search by");
						}
						if(!tbx_clccontact_customername.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Customer name field is not enabled for None Search by");
							throw new Error("CLC Contact Customer name field is not enabled for None Search by");
						}
						
			searchslider_clccontact("Group Name"); Thread.sleep(2000);			
						if(!tbx_clccontact_searchfield.isCurrentlyEnabled()){
							slf4jLogger.error("Search field is not enabled for Group Name Search by");
							throw new Error("Search field is not enabled for Group Name Search by");
						}
						if(tbx_clccontact_firstname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact First name field is enabled for Group Name Search by");
							throw new Error("CLC Contact First name field is enabled for Group Name Search by");
						}
						if(tbx_clccontact_lastname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Last name field is enabled for Group Name Search by");
							throw new Error("CLC Contact Last name field is enabled for Group Name Search by");
						}
						if(tbx_clccontact_email.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact e-mail field is enabled for Group Name Search by");
							throw new Error("CLC Contact e-mail field is enabled for Group Name Search by");
						}
						if(tbx_clccontact_telephone.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Telephone field is enabled for Group Name Search by");
							throw new Error("CLC Contact Telephone field is enabled for Group Name Search by");
						}
						if(tbx_clccontact_customername.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Customer name field is enabled for Group Name Search by");
							throw new Error("CLC Contact Customer name field is enabled for Group Name Search by");
						}
						
			searchslider_clccontact("CUID"); Thread.sleep(2000);			
						if(!tbx_clccontact_searchfield.isCurrentlyEnabled()){
							slf4jLogger.error("Search field is not enabled for CUID Search by");
							throw new Error("Search field is not enabled for CUID Search by");
						}
						if(tbx_clccontact_firstname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact First name field is enabled for CUID Search by");
							throw new Error("CLC Contact First name field is enabled for CUID Search by");
						}
						if(tbx_clccontact_lastname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Last name field is enabled for CUID Search by");
							throw new Error("CLC Contact Last name field is enabled for CUID Search by");
						}
						if(tbx_clccontact_email.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact e-mail field is enabled for CUID Search by");
							throw new Error("CLC Contact e-mail field is enabled for CUID Search by");
						}
						if(tbx_clccontact_telephone.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Telephone field is enabled for CUID Search by");
							throw new Error("CLC Contact Telephone field is enabled for CUID Search by");
						}
						if(tbx_clccontact_customername.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Customer name field is enabled for CUID Search by");
							throw new Error("CLC Contact Customer name field is enabled for CUID Search by");
						}
						
			searchslider_clccontact("Group Id"); Thread.sleep(2000);			
						if(!tbx_clccontact_searchfield.isCurrentlyEnabled()){
							slf4jLogger.error("Search field is not enabled for Group Id Search by");
							throw new Error("Search field is not enabled for Group Id Search by");
						}
						if(tbx_clccontact_firstname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact First name field is enabled for Group Id Search by");
							throw new Error("CLC Contact First name field is enabled for Group Id Search by");
						}
						if(tbx_clccontact_lastname.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Last name field is enabled for Group Id Search by");
							throw new Error("CLC Contact Last name field is enabled for Group Id Search by");
						}
						if(tbx_clccontact_email.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact e-mail field is enabled for Group Id Search by");
							throw new Error("CLC Contact e-mail field is enabled for Group Id Search by");
						}
						if(tbx_clccontact_telephone.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Telephone field is enabled for Group Id Search by");
							throw new Error("CLC Contact Telephone field is enabled for Group Id Search by");
						}
						if(tbx_clccontact_customername.isCurrentlyEnabled()){
							slf4jLogger.error("CLC Contact Customer name field is enabled for Group Id Search by");
							throw new Error("CLC Contact Customer name field is enabled for Group Id Search by");
						}
						
					 break;
					 
		case "search with Contact first name as AUTO": tbx_contact_firstname_searchslider.type("AUTO");break;
							
		}
	}
	
	public void createtab_inventory_Linktype(String Linktype) throws Throwable{
		String[] createtype;
		createtype = Linktype.split(",");
		for(int i=0;i<createtype.length;i++){	
		if(ddl_Createtab_Inventory_LinkType.isCurrentlyVisible()){
			jsClick(ddl_Createtab_Inventory_LinkType);
				ddl_Createtab_Inventory_LinkType.selectByVisibleText(createtype[i].trim());
				//ddl_Createtab_Inventory_LinkType.selectByVisibleText("BackPlane Link");
			}	
		}
	}
	
	public void searchvalidation(String type)throws Throwable{
		String[] createtype;
		switch(type){
		case "Archive":ddl_searchType.selectByVisibleText(type);break;
		case "DSL OVC":jsClick(ddl_search_serviceType.selectByVisibleText(type));break;
		case "MEF EVC":jsClick(ddl_search_serviceType.selectByVisibleText(type));break;
		case "HSI":jsClick(ddl_search_serviceType.selectByVisibleText(type));break;
		case "IPTV Unicast":jsClick(ddl_search_serviceType.selectByVisibleText(type));break;
		case "Orders":jsClick(ddl_searchType.selectByVisibleText(type)); waitForElement(ddl_searchtab_order_producttype); break;	
		case "Tasks":jsClick(ddl_searchType.selectByVisibleText(type)); waitForElement(ddl_searchtab_taskname); break;
		case "Search":jsClick(ddl_searchtab_searchbtn_task); break;
		case "Disconnect Tasks":jsClick(ddl_taskType.selectByVisibleText(type)); break;
		case "Archive, Inventory, Network Build, Orders, SLA Template, SLC, Tasks":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_searchType.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "CLC Contact, Circuit,	Contact, Device, Link,	Location, Number, QOS Template, Reservation, Service, Service Area, Subscriber,	Topology":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_invntryType.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "Ethernet Bearer, LAG, Optical Bearer, PON, PW Unrouted (Path), Topology Virtual Circuit, Transport Path, VLAN Segment":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_circuittype.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "Alternate Location Contact, Billing Contact, Design Contact, ICOCON, Implementation Contact, Initiator Contact, Location Contact, MEET POINT CONTACT, Maintenance Contact, Proactive Notification Contact":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_search_contacttype.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "Adtran 400 Series ONT, Suttle MST, Calix E7, Corning MST, Calix C Series, Fiber Splitter":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_deviceType.selectByVisibleText(createtype[i].trim()));
			}break;	
					
		case "Backplane Link, Fiber, StackRing Link, Unshielded Twisted Pair (UTP)":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_Link_type.selectByVisibleText(createtype[i].trim()));
			}break;	
					
		case "ASN 209 VPNID Range, CE-VLAN, MEP - ID, PW-ID, S-VLAN, SAP, SDP, VPN ID, VPN-ID Range, VPN-ID SubRange, VSI":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_search_numbertype.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "Hard, Soft":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_search_reservationtype.selectByVisibleText(createtype[i].trim()));
			}break;	
					
		case "DSL OVC, ENNI Link Service, HSI, Host Service, IPTV, IPTV Unicast, MEF ENNI, MEF EVC, MEF OVC, MEF Service, MEF UNI, MGR UNI, Mgmt EVC, Mgmt UNI, Probe UNI":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_search_serviceType.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "Generic Network,	MEN Topology, PON Network":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_search_topologyType.selectByVisibleText(createtype[i].trim()));
			}break;	
					
					
		case "Alt Equipment Build, Fiber Build, GPON Device Build, Transport Path, GPON Build Templates":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_networkType.selectByVisibleText(createtype[i].trim()));
			}break;	
			
		case "FDH, FDP, MDU, MST, OLT, ONT, Splitter":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_searchtab_networkbuild_fiberbuild_devicerole.selectByVisibleText(createtype[i].trim()));
			}break;	
				
		case "BRAS, DSLAM, NID":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_searchtab_networkbuild_transportpath_devicerole.selectByVisibleText(createtype[i].trim()));
			}break;	
					
		case "Customer Orders, Network Orders, Customer Orders, Test Orders":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				//ddl_searchtab_networkbuild_transportpath_devicerole.selectByVisibleText(createtype[i].trim()));
			}break;		
			
		case "Bandwidth Upgrade Check, Service Level Check":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				jsClick(ddl_searchtab_SLC_checktype.selectByVisibleText(createtype[i].trim()));
			}break;	
					
		case "App Version , FAQ Link, Link to User Guide, Administration, Reports, Manage Tags, Configure, Logout":
			createtype = type.split(",");
			for(int i=0;i<createtype.length;i++){				
				Geartab_validation(createtype[i].trim());
			}break;	
	
		}
	}

	public void search_ordertype(String type){
		if(type.equals("Customer Orders") || type.equals("Network Orders")){
			jsClick(ddl_searchtab_order_producttype.selectByVisibleText("Ethernet"));
		}else {
			jsClick(ddl_searchtab_order_producttype.selectByVisibleText("GPON"));
		}
		
		jsClick(ddl_searchtab_order_ordertype.selectByVisibleText(type));
		/*ddl_searchtab_order_producttype.selectByVisibleText(producttype);
		
		ddl_searchtab_order_ordertype.selectByVisibleText(ordertype);*/
	}
	
	
	
	
	public void User_should_be_navigated_to_Page(String action) throws Throwable {
		switch(action){
		
		case "Logout":waitForElement(lbl_OVLogout_relogin);
							if(!lbl_OVLogout_relogin.isCurrentlyVisible()){
								slf4jLogger.debug("Unable to Login page from Logout screen");
								throw new Error("Unable to Login page from Logout screen");
							}
							
							if(!lbl_OVLogout_header.isCurrentlyVisible()){
								slf4jLogger.debug("Logout successfully header is not displayed in Logout screen");
								throw new Error("Logout successfully header is not displayed in Logout screen");
							}
							
							if(!lbl_OVLogout_version.isCurrentlyVisible()){
								slf4jLogger.debug("Version is not displayed in Logout screen");
								throw new Error("Version is not displayed in Logout screen");
							}
							
							if(!lbl_OVLogout_version.getText().contains(Page.envData.getFieldValue("OV-LoginVersion"))){
								slf4jLogger.debug("Version is Wrongly displayed in Logout screen");
								throw new Error("Version is Wrongly displayed in Logout screen");
							}break;		
			
		}
		
	}
	
	public void solr_search_value(String svalue) throws InterruptedException {
		
		switch(svalue){
		case "Subscriber": Thread.sleep(3000);
		                   ddl_selectmodule.selectByVisibleText("Subscriber");
		                   //tbx_googlesearchdata.type("CTL I");
		                   tbx_googlesearchdata.type("TEST - JANET");
		                   Solr_select(svalue,"SBCBR");
							break;
							
		case "Service Area": Thread.sleep(3000);
							tbx_googlesearchdata.type("SERVICE_AREA");
							Solr_select(svalue,"SAREA");
							 break;
		 
		case "Service": Thread.sleep(3000);
							ddl_selectmodule.selectByVisibleText("Service");
							tbx_googlesearchdata.type("HSI");
							Solr_select(svalue,"SRV");
							 break;
		 
		case "Circuit": Thread.sleep(3000);
							ddl_selectmodule.selectByVisibleText("Circuit");
							tbx_googlesearchdata.type("VSEG");
							Solr_select(svalue,"CKT");
							 break;
							 
		case "Location": Thread.sleep(3000);
							ddl_selectmodule.selectByVisibleText("Location");
							tbx_googlesearchdata.type("1");
							Solr_select(svalue,"STRET");
							 break;
							 
		case "Device": Thread.sleep(3000);
							ddl_selectmodule.selectByVisibleText("Device");
							tbx_googlesearchdata.type("LSVGNVXV");
							Solr_select(svalue,"EQP");
							
        case "Contact": Thread.sleep(3000);
                        ddl_selectmodule.selectByVisibleText("Contact");
                         tbx_googlesearchdata.type("TEST");
                        Solr_select(svalue,"CONT");
        }
					

		
		   
		}
	
	
	public void Solr_select(String svalue,String lvalue) throws InterruptedException {		

		waitForElement(tbx_googlesearchdata);
		
		Thread.sleep(3000);
		if (ggl_Solrsuggestions.isCurrentlyVisible()) {

			slf4jLogger.info("SOLR feature is working fine");
		} else {
			slf4jLogger.info("SOLR feature is NOT working");
		}
	
		int count = loginPage.getDriver().findElements(By.xpath(".//ul[@role='listbox']/li")).size();
		
		System.out.println("Count"+count);
		
		for(int j=1;j<=count;j++){
			String slots=".//ul[@role='listbox']/li["+j+"]/a[starts-with(text(),lvalue)] ";
			if(loginPage.getDriver().findElement(By.xpath(slots)).getText().startsWith(lvalue)){
				Thread.sleep(3000);
				slf4jLogger.info("Available values"+loginPage.getDriver().findElement(By.xpath(slots)).getText());
				
			} else slf4jLogger.info("Value is not selected"+j);
		}
		
	
		jsClick(ggl_Solr_value);
	
		Thread.sleep(2000);

		System.out.println("Select Value is "+tbx_googlesearchdata.getValue());
		
		}
	
	public void i_select_port_type_createtab (String ptype) throws Throwable {
		waitForElement(ddl_Createtab_Inventory_PortType);
		ddl_Createtab_Inventory_PortType.selectByVisibleText(ptype);
	
	}
	
	public void select_devicerole_fiberbuild(String role) throws InterruptedException{
		waitForElement(ddl_SerachFB_devicerole);
		ddl_SerachFB_devicerole.selectByVisibleText(role);
	}
	
	
	
	public void click_GO_button() throws Throwable{
		jsClick(btn_googlesearchdata_go);
		Thread.sleep(2000);				
		}

	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}
	public static boolean iselementcurrentlyenable(WebElement webobject) {
		try {	
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 3);
			wait.until(ExpectedConditions.elementToBeClickable(webobject));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {

			return false;

		} catch (org.openqa.selenium.TimeoutException e1) {
			return false;
		}
	} 
	public static boolean iselementdisable(WebElement webobject) {
		try {	
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 3);
			wait.until(ExpectedConditions.
					elementToBeClickable(webobject));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {

			return false;

		} catch (org.openqa.selenium.TimeoutException e1) {
			return false;
		}
	}
	
	public void click_rma() throws InterruptedException{
		Thread.sleep(5000);
		//port_Icon.click();
		jsClick(port_Icon);
		Thread.sleep(5000);
		//activationSlider.click();
		jsClick(activationSlider);
		Thread.sleep(10000);
		//rma_btn.click();
		jsClick(rma_btn);
		WebDriver d= getDriver();
		d.switchTo().alert().accept();
	}
	
	public void check_rma() throws InterruptedException{
		Thread.sleep(5000);
		//port_Icon.click();
		jsClick(port_Icon);
		Thread.sleep(5000);
		//activationSlider.click();
		jsClick(activationSlider);
		Thread.sleep(10000);
		//rma_btn.click();
		if (rma_btn.isEnabled()){
			 throw new Error("Button should be disabled");
		}
		else
			System.out.println("Button is disabled");
	}
}
