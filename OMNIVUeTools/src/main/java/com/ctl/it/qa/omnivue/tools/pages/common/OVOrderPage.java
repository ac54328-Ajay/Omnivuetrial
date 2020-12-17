package com.ctl.it.qa.omnivue.tools.pages.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.OSRDB;
import com.ctl.it.qa.omnivue.tools.steps.user.Excel_Read;
import com.ctl.it.qa.omnivue.tools.steps.user.FileIOTest;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
 

public class OVOrderPage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	OVCreateDevicePage devcreatepage;
	UserSteps enduser;
	OVLoginPage loginPage;
	OVActivationPage actvtnpage;
	Excel_Read excel_access = new Excel_Read();
	FileIOTest fileiotest;
	OSRDB osrdb;
	
	
	//OVServiceDetailsPage servicedetailpage;
	
	//OVSearchDevicePage searchdevicepage;
	
	@FindBy(id="OrderNo")
	public WebElementFacade tbx_orderno;
	
	@FindBy(id="customerFirstName")
	public WebElementFacade tbx_customername;
	
	@FindBy(id="customerLastname")
	public WebElementFacade tbx_customerlastname;
	
	@FindBy(id="customerType")
	public WebElementFacade ddl_customerType;
	
	@FindBy(id="customerSubtype")
	public WebElementFacade ddl_customerSubtype;
	
	@FindBy(id="accountType")
	public WebElementFacade ddl_accountType;
	
	//@FindBy(xpath=".//*[@ng-click='openServAddrLocLookUp(field.name)']/img")
	@FindBy(xpath=".//*[@ng-click='openServAddrLocLookUp(field.name)']/i")
	public WebElementFacade btn_serviceaddress;
	
	@FindBy(id="serviceAddress")
	public WebElementFacade lbl_serviceaddress_field1;
	
	@FindBy(xpath=".//*[@ng-click='lookUpCall()']")	
	public WebElementFacade btn_mltolocnlookUp;
	
	@FindBy(id="addressLine2")
	public WebElementFacade lbl_serviceaddress_field2;
	
	@FindBy(id="wireCenterCLLI")
	public WebElementFacade lbl_wirecenterclli;
	
	@FindBy(id="latitude")
	public WebElementFacade lbl_latitude;
	
	@FindBy(id="longitude")
	public WebElementFacade lbl_logitude;
	
	@FindBy(id="remark")
	public WebElementFacade tbx_General_remark;	


	@FindBy(id="serviceType")
	public WebElementFacade ddl_serviceType_MLTO;
	
	@FindBy(id="hdStreams")
	public WebElementFacade ddl_hdStreams_MLTO;
	
	@FindBy(id="hdStreams")
	public List<WebElementFacade> ddl_hdStreams1_MLTO;
	
	
	@FindBy(id="downSpeed")
	public WebElementFacade ddl_downSpeed_MLTO;
	
	@FindBy(id="upSpeed")
	public WebElementFacade ddl_upSpeed_MLTO;
	
	@FindBy(id="DTN")
	public WebElementFacade tbx_dtn;
	
	@FindBy(id="reasonCode")
	public WebElementFacade tbx_reasoncode;
	
	@FindBy(id="serviceType")
	public WebElementFacade ddl_serviceType;
	
	@FindBy(id="hdStreams")
	public WebElementFacade ddl_hdStreams;
	
	@FindBy(id="hdStreams")
	public List<WebElementFacade> ddl_hdStreams1;
	
	
	@FindBy(id="downSpeed")
	public WebElementFacade ddl_downSpeed;
	
	@FindBy(id="upSpeed")
	public WebElementFacade ddl_upSpeed;
	
	@FindBy(id="featureCodeCollection")
	public List<WebElementFacade> lbl_featureCodeCollection;
	
	@FindBy(id="featureCodeCollection")
	public WebElementFacade lbl_featureCodeCollection1;
	
	@FindBy(id="featureCodeRemark")
	public WebElementFacade tbx_featureCodeRemark;
	
	@FindBy(xpath=".//*[starts-with(@id,'appointmentStartDate_')]")
	public WebElementFacade tbx_appointmentStartDate;
	
	@FindBy(xpath=".//*[starts-with(@id,'appointmentEndDate_')]")
	public WebElementFacade tbx_appointmentEndDate;
	
	@FindBy(xpath=".//*[starts-with(@id,'requestedDueDate_')]")
	public WebElementFacade tbx_requestedDueDate;
	
	@FindBy(id="appointmentStartTime")
	public WebElementFacade tbx_appointmentstarttime;
	
	@FindBy(id="appointmentEndTime")
	public WebElementFacade tbx_appointmentendtime;
	
	
	@FindBy(id="dispatchRemark")
	public WebElementFacade tbx_dispatchRemark;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='createOrder();']")
	public WebElementFacade btn_OrderCreateform_create;
	
	//				Need to compare with Device Location search & remove if it's already available
	
	@FindBy(xpath=".//*[text()='Address#']/following-sibling::input")
	public WebElementFacade tbx_mltoaddressno;
	
	@FindBy(xpath=".//*[text()='Street Name %']/following-sibling::input")
	public WebElementFacade tbx_mltostreetName;
	
	@FindBy(xpath=".//*[text()='City']/following-sibling::input[@placeholder='City']")
	public WebElementFacade tbx_mltocity;
	
	@FindBy(id="state")
	public WebElementFacade ddl_state;
	
	@FindBy(xpath=".//*[@ng-click='lookUpCall()']")
	public WebElementFacade btn_lookup;
	
	// End of it
	
	//@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/a")
	//@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
	@FindBy(xpath=".//div[@role='gridcell']/div/a[@ng-click='lookupGridSettings.selLukupValue(0)']")
	//@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
	//@FindBy(xpath=".//*[contains(@id,'contenttablejqxGrid')]/div[1]//a")
	public WebElementFacade lnk_addlcn;
	
	@FindBy(xpath=".//*[@title='previous']/div")
	public WebElementFacade btn_previous_locnsearch;
	
	@FindBy(xpath=".//*[@class='order-detail-group ng-scope']/div/div")	
	public List<WebElementFacade> lbl_SearchpageOrderxpath;
	
	//@FindBy(xpath=".//*[@class='control-label ng-binding']")	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@class='control-label ng-binding']")
	public List<WebElementFacade> lbl_EditpageOrderxpath;
	
	//Action Button check
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditOrder();']")
	public WebElementFacade btn_editmltoorder; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@ng-click='saveEditedOrder();']")
	public WebElementFacade btn_Save_editmltoorder;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@ng-click='backToView();']")
	public WebElementFacade btn_cancel_Editmltoorder;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@value='Cancel Order']")
	public WebElementFacade btn_cancelmltoorder;
	
	
	//Service Area check
	
	@FindBy(xpath=".//*[text()='Service Address:']/following-sibling::label[1]")
	public WebElementFacade lbl_orderserviceaddress;
	
	
	//Search Remarks section
	
	@FindBy(xpath=".//*[text()='Remarks:']/following-sibling::label")
	public WebElementFacade lbl_locnremarks;
	
	@FindBy(xpath=".//*[text()='Feature Code Remark:']/following-sibling::label")
	public WebElementFacade lbl_featurecoderemark;
	
	@FindBy(xpath=".//*[text()='Remark:']/following-sibling::label")
	public WebElementFacade lbl_dispatchremark;
	
	//Actions button
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='Dispatch']")
	public WebElementFacade btn_dispatch; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='IMPROV']")
	public WebElementFacade btn_improv; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='ISAT Create']")
	public WebElementFacade btn_isatcreate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='ISAT Modify']")
	public WebElementFacade btn_isatmodify;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@class,'ng-binding alert alert-success')]")
	public WebElementFacade lbl_alertmsg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@class,'ng-binding alert alert-success')]/button")
	public WebElementFacade btn_alertmsg_clsicon;
	
	@FindBy(xpath=".//*[@data-ng-click='switchFunc()']")
	public WebElementFacade lbl_alertmsg1;
	

	
	@FindBy(xpath=".//*[contains(text(),'Create Market Launch Test Order')]")
	public WebElementFacade tab_create;
	
	//Alt Equip ment Build order
	
	@FindBy(xpath=".//*[@role='tablist']/li[1]/button/span")
	public WebElementFacade btn_device1;
	
	@FindBy(xpath=".//*[@role='tablist']/li[3]/button/span")
	public WebElementFacade btn_device2;
	
	@FindBy(xpath=".//*[@value='Validate Device']/span")
	public WebElementFacade btn_validatedevice;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.EXISTING' and @value='New']")
	public WebElementFacade btn_device_state_new;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.EXISTING' and @value='Existing']")
	public WebElementFacade btn_device_state_existing;
	
	@FindBy(xpath=".//*[@value='NID' and @label='NID']")
	public WebElementFacade btn_device1_equprole_NID;
	
	@FindBy(xpath=".//*[@value='NPE' and @label='NPE']")
	public WebElementFacade btn_device1_equprole_NPE;
	
	@FindBy(id="loclkp")
	public WebElementFacade btn_device_locn_lookup;
	
	@FindBy(xpath=".//*[@ng-click='openDeviceLookUp()']")
	public WebElementFacade btn_existing_device_lookup_altequipmt;
	
	
	@FindBy(xpath=".//*[@ng-click='openSubscriberLookUp()']")
	public WebElementFacade btn_device_Subscribersearch;
	
	@FindBy(xpath=".//*[@ng-click='lookUp()']")
	public WebElementFacade btn_device_Subscriberlckup;
	
	@FindBy(xpath=".//*[@ng-click='lookupData(subscriberLookupData);']")
	public WebElementFacade lbl_device_Subscriberid;
	
	
	//other fields in Alt equipment build
	@FindBy(xpath=".//*[@ng-change='checkCLLILength();']")
	public WebElementFacade tbx_altequip_deviceclli;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.DEVICE_DESIGNATOR']")
	public WebElementFacade tbx_altequip_deviceclli_designator;
	
	@FindBy(xpath=".//*[@ng-show='!existingMode']/select[@id='deviceType']")
	public WebElementFacade ddl_devicetype;				//
	
	@FindBy(id="deviceSubType")
	public WebElementFacade ddl_devicesubtype;			//
	
	@FindBy(xpath=".//*[@ng-show='!existingMode']/select[@id='affiliateOwner']")
	public WebElementFacade ddl_affowner;	
	
	
/*	@FindBy(xpath=".//*[@class='form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-valid-date']")
	public WebElementFacade tbx_altequip_duedate;//
*/	
	@FindBy(xpath=".//*[@ng-model='altDeviceGeneralInfo.ENG_DUE_DT']")
	public WebElementFacade tbx_altequip_duedate;
	
	@FindBy(xpath=".//*[@ng-click='openStartDate($event)']/i")
	public WebElementFacade btn_altequip_engduedate;
	
	@FindBy(xpath=".//button[text()='Today']")
	public WebElementFacade btn_altequip_engduedate_today;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceGeneralInfo.PROJECT_ID']")
	public WebElementFacade tbx_altequip_projectid;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceGeneralInfo.BVAPP']")
	public WebElementFacade tbx_altequip_BVAPP;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceGeneralInfo.PON']")
	public WebElementFacade tbx_altequip_pon;
	
	@FindBy(xpath=".//*[@value='Submit Build']/span")
	public WebElementFacade btn_altequip_submitbuild;
	
	//@FindBy(xpath=".//*[@ng-controller='networkCreateDeviceCtrl']//*[@class='form-horizontal']//div[5]/div")
	@FindBy(xpath=".//*[@ng-controller='networkCreateDeviceCtrl']//label[contains(text(),'Status')]/following-sibling::div")
	public WebElementFacade lbl_altequip_buildstatus;
	
	@FindBy(xpath=".//*[@ng-click='gponHeaderData()']")
	public WebElementFacade btn_altequip_buildstatus_refresh;
	
	@FindBy(xpath=".//*[@ng-click='navigateToOrderDetailsPage();']")
	public WebElementFacade lbl_altequip_buildstatus_ordernumber;
	
	@FindBy(xpath=".//*[text()='COMMENTS: com.centurylink.icl.arm.exception.ARMException: Device CLLI should have either 8 or 11 charcters']")
	public WebElementFacade lbl_altequip_devicestatus_success;
	
	@FindBy(xpath=".//*[text()='DEVICE: (WNGRFLXA01T) - 1 Status: (SUCCESS)']")
	public WebElementFacade lbl_altequip_device1_status;
	
	@FindBy(xpath=".//*[text()='DEVICE: (WNGRFLXA02T) - 2 Status: (SUCCESS)']")
	public WebElementFacade lbl_altequip_device2_status;
	
	// Alt Equipment order search
	
	@FindBy(xpath=".//*[@id='mydeviceLookupModal']//*[@ng-model='invServiceDevLookUp.address']")
	public WebElementFacade tbx_altequip_devicelookup_address;
	
	@FindBy(xpath=".//*[@id='mydeviceLookupModal']//*[@@ng-model='invServiceDevLookUp.streetName']")
	public WebElementFacade tbx_altequip_devicelookup_streetname;
	
	@FindBy(xpath=".//*[@id='mydeviceLookupModal']//*[@ng-model='invServiceDevLookUp.buildingClli']")
	public WebElementFacade tbx_altequip_devicelookup_buildingclli;
	
	@FindBy(xpath=".//*[@id='mydeviceLookupModal']//*[@ng-model='invServiceDevLookUp.deviceClli']")
	public WebElementFacade tbx_altequip_devicelookup_deviceclli;
	
	@FindBy(xpath=".//*[@id='mydeviceLookupModal']//*[@ng-click='lookUpDeviceDetails()']")
	public WebElementFacade btn_altequip_devicelookup;
	
	@FindBy(xpath=".//*[@ng-if='showTableServiceDeviceLookUp']//*[@title='previous']/div")
	public WebElementFacade btn_altequip_devicelookup_previous;
	
	@FindBy(xpath=".//*[@id='jqxScrollBtnDownverticalScrollBarcreateDevLookUpId']/div")
	public WebElementFacade btn_downarrow_devicescroll;
	
	@FindBy(xpath=".//*[@name='deviceRole']")
	public WebElementFacade cbk_altequip_devicerole;
	
	@FindBy(xpath=".//*[@id='row0createDevLookUpId']/div[1]/div/a")
	public WebElementFacade lbl_altequip_devicesearchresult;
	
	//***************************************** Order Resullt Page Tab *****************************//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Search Results')]")
	public WebElementFacade tab_search_result_page;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@title='next']")
	public WebElementFacade btn_search_result_next;
	
	@FindBy(xpath="(.//*[@class='ng-isolate-scope active']//tab-heading/a/img)[1]")
			public WebElementFacade btn_tabactive_close;
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading")
	public WebElementFacade tabactive;
	
	//************************* Advance Order search path's below **********************************//
	
	@FindBy(xpath=".//*[@id='selectdateRange']")
	public WebElementFacade btn_adsearchcheckbtn;
	
	@FindBy(xpath=".//accordion[5]/div/div/div/h4/a/span")
	public WebElementFacade lnk_circuitparameter;
	
	@FindBy(xpath=".//*[@ng-click='searchOrders()']")
	public WebElementFacade btn_adsearchorder;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='circuitSearch();']")
	public WebElementFacade btn_adsearch_circuit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='contactSearch();']")
	public WebElementFacade btn_adsearch_contact;
	
	@FindBy(xpath=".//*[@ng-click='inDeviceAdvncSearch()']")
	public WebElementFacade btn_advance_device_search;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='locationAdvncSearch()']")
	public WebElementFacade btn_advance_location_search;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='rangeAdvncSearch()']")
	public WebElementFacade btn_advance_Andvancerange_search;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='searchDefectTask();']")
	public WebElementFacade btn_defect_task_advanced_search;
	
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='topologySearch();']")
	public WebElementFacade btn_topology_advanced_search;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='taskSearch();']")
	public WebElementFacade btn_task_advanced_search;
	
	@FindBy(id="serviceType")
	public WebElementFacade ddl_servicetype_adsearchorder;
	
	@FindBy(xpath=".//*[@ng-controller='orderSearchAdvncCtrl']//select[@ng-model='SearchRequest.productType']")
	public WebElementFacade ddl_adsearchorder_producttype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='OrderType']")
	public WebElementFacade ddl_adsearchorder_ordertype;
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[contains(text(),'Customer Parameters')]")
	public WebElementFacade lbl_adsearchorder_customerparameter;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//label[contains(text(),'Name %')]/following-sibling::input[@id='customerName']")
	public WebElementFacade tbx_adsearchorder_customerparameter_custombername;
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@ng-model='SearchRequest.DTN']")
	public WebElementFacade tbx_adsearchorder_DTN;
	
	//***************************************************************************************************//
	
	//********************* ORder View Page ************************************************************//
	
	@FindBy(xpath=".//*[@ng-init='getOrderDetailsForFocusTab()']/div[4]//*[contains(text(),'Action:')]")
	public WebElementFacade lbl_orderview_Action;
	
	@FindBy(xpath=".//*[@ng-init='getOrderDetailsForFocusTab()']/div[4]//*[contains(text(),'Action:')]/following-sibling::label")
	public WebElementFacade lbl_orderview_Action_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Action:']/following-sibling::label[1]")
	public WebElementFacade lbl_MLTO_orderview_Action_value;
	
	//***************************************************************************************************//
	
	//********************* ORder Search Page ************************************************************//
	
	@FindBy(xpath=".//*[@ng-click='exportToExcel()']")
	public WebElementFacade btn_order_result_page_excel;
	
	@FindBy(xpath=".//*[@ng-click='printGridData()']")
	public WebElementFacade btn_order_result_page_print;
	
	@FindBy(xpath=".//*[contains(@id,'invDeviceReconfg-out-div')]/a")
	public WebElementFacade btn_order_result_page_config_mng;
	
	@FindBy(xpath=".//*[contains(text(),'Customer Name%')]/following-sibling::label")
	public WebElementFacade lbl_order_result_page_search_parameters_customer_name;
	
	@FindBy(xpath=".//*[contains(text(),'TN')]/following-sibling::label")
	public WebElementFacade lbl_order_result_page_search_parameters_TN;
	
	@FindBy(xpath=".//*[contains(text(),'Ensemble Order ID')]/following-sibling::label")
	public WebElementFacade lbl_order_result_page_search_parameters_Ensemble_Order_ID;
	
	@FindBy(xpath=".//*[contains(text(),'CSOF Order ID')]/following-sibling::label")
	public WebElementFacade lbl_order_result_page_search_parameters_CSOF_Order_ID;
	
	
	//***************************************************************************************************//
	
	//******************************Order Tab Validations***********************************************//
	
	@FindBy(xpath=".//*[contains(text(),'Order Search Results')]")
	public WebElementFacade btn_order_search_results_tab;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Order Id:')]")
	public WebElementFacade btn_order_tab_search_view_page;
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading[contains(text(),'Order Id:')]")
	public WebElementFacade btn_order_ACTIVE_tab_search_view_page;
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading[contains(text(),'Order Details')]")
	public WebElementFacade btn_order_details_tab_search_view_page;
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//*[@ng-mouseleave='hoverEdit = false']/img[1]")
	public WebElementFacade btn_order_details_tab_search_view_page_close;	
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading[contains(text(),'-HSI')]")
	public WebElementFacade tab_Active_HSI_service_tab;
	
	//***************************************************************************************************//
	
	//******************************Order Details Section Validations***********************************************//
	
	@FindBy(xpath=".//*[contains(text(),'CSOF Order Number:')]")
	public WebElementFacade lbl_csof_order_no_field;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'CSOF Order Number:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_csof_order_no;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Order Type:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_order_type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Version:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_version;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Action:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_action; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Order Created on:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_order_created_date;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Due Date:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_due_date; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Order Status:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_order_status; 
	
	//***************************************************************************************************//
	//******************************Customer Details Section Validations***********************************************//
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Customer Type:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cust_sec_customer_type; 
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Subscriber:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cust_sec_subscriber; 
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'BAN:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cust_sec_BAN;
	
	//***************************************************************************************************//
	
	//******************************Contact Details Section Validations***********************************************//
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder'][3]//*[contains(text(),'Type:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cont_sec_type; 
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder'][3]//*[contains(text(),'Name:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cont_sec_Name;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder'][3]//*[contains(text(),'Phone:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cont_sec_Phone;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder'][3]//*[contains(text(),'Email:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_cont_sec_Email;
	
	//***************************************************************************************************//
	
	//******************************Location Details Section Validations***********************************************//
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'SWC:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_SWC;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Location:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_Location;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'LATA:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_LATA;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Jurisdiction (PIU):')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_Jurisdiction;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Remarks:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_Remarks;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Service Street Name Prefix:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_Service_Street_Name_Prefix;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Service Street Name Suffix:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_Service_Street_Name_Suffix;
	
	@FindBy(xpath=".//*[@ng-if='showServiceOrder']//*[contains(text(),'Location Designator:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_locn_sec_Location_Designator;
	
	
	
	//***************************************************************************************************//
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_editservicepage;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
	public WebElementFacade tab_services;
	//******************************HSI Service ID Details Section Validations***********************************************//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Service Id:']/following-sibling::label[1]/a[contains(text(),'-HSI')]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Service_Id;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Service Name:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Service_Name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Reason Code:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Reason_Code;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Wire Maintenance Plan Ind:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Wire_Maintenance_Plan_Ind;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Service Type:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Service_Type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Service Action:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Service_Action;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Organization ID:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Organization_ID;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'VoIP TN:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_VoIP_TN;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Download Speed:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Download_Speed;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Upload Speed:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Upload_Speed;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Address Line 1:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Address_Line1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Address Line 2:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Address_Line2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'State:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_State;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'City:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_City;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Zip:')]/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Zip;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-class='alertData.className']")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Service_Id_invalid_msg_data_notavailable;
	
	//***************************************************************************************************//
	
	//******************************IPTV Service ID Details Section Validations***********************************************//
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Service Id:']/following-sibling::label[1]/a[contains(text(),'-IPTV')]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Service_Id;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Service Name:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Service_Name;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Unicast Service Id:')]/following-sibling::label[1]/a")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Reason Code:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Reason_Code;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Wire Maintenance Plan Ind:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Wire_Maintenance_Plan_Ind;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Service Type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Service_Type;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Service Action:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Service_Action;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Organization ID:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Organization_ID;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'HD Stream:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_HD_Stream;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Download Speed:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Download_Speed;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Upload Speed:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Upload_Speed;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Address Line 1:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Address_Line1;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Address Line 2:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Address_Line2;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'State:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_State;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'City:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_City;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-init='getOrderDetailsForFocusTab()']/div[10]//*[contains(text(),'Zip:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_IPTV_Service_sec_Zip;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'IPTV Unicast Service')]/..//a")
		public WebElementFacade  lbl_IPTV_Service_sec_Unicast_service_id;
		
		//***************************************************************************************************//
		
		//******************************Dispatch Details Section Validations***********************************************//
		
		@FindBy(xpath=".//*[contains(text(),'Appointment Start Date:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Disptach_sec_Appointment_Start_Date;
		
		@FindBy(xpath=".//*[contains(text(),'Appointment End Date:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Disptach_sec_Appointment_End_Date;
		
		@FindBy(xpath=".//*[contains(text(),'Appointment Start Time:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Disptach_sec_Appointment_Start_Time;
		
		@FindBy(xpath=".//*[contains(text(),'Appointment End Time:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Disptach_sec_Appointment_End_Time;
		
		@FindBy(xpath=".//*[contains(text(),'Feature Code:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Disptach_sec_Feature_code;
		
		@FindBy(xpath=".//*[contains(text(),'Tech Remarks :')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Disptach_sec_Tech_remarks;
		
		
		
		//***************************************************************************************************//
		
		//******************************Other Details Section Validations***********************************************//
		
		@FindBy(xpath=".//*[contains(text(),'HSI GeoCode:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_GeoCode;
		
		@FindBy(xpath=".//*[contains(text(),'HSI Address Verified Ind:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_Address_Verified_Ind;
		
		@FindBy(xpath=".//*[contains(text(),'HSI CLCID:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_CLCID;
		
		@FindBy(xpath=".//*[contains(text(),'HSI Street Name:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_Street_Name;
		
		@FindBy(xpath=".//*[contains(text(),'HSI Address Type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_Address_Type;
		
		@FindBy(xpath=".//*[contains(text(),'HSI Street Nr First:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_First;
		
		@FindBy(xpath=".//*[contains(text(),'HSI Street Nr First Suffix:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_First_Suffix;
		
		@FindBy(xpath=".//*[contains(text(),'HSI Street Nr Last Suffix:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_Last_Suffix;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV GeoCode:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_GeoCode;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV Address Verified Ind:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_Address_Verified_Ind;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV CLCID:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_CLCID;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV Street Name:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_Street_Name;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV Address Type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_Address_Type;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV Street Nr First:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_First;
		
		@FindBy(xpath=".//*[contains(text(),'IPTV Street Nr First Suffix:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_First_Suffix;		
		
		@FindBy(xpath=".//*[contains(text(),'IPTV Street Nr Last Suffix:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_Last_Suffix;
		
		@FindBy(xpath=".//*[contains(text(),'Customer Category:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Customer_Category;
		
		@FindBy(xpath=".//*[contains(text(),'Customer Category:')]/following-sibling::label[contains(text(),'Customer Type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Customer_Type;
		
		@FindBy(xpath=".//*[contains(text(),'Customer Sub Type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Customer_Sub_Type;
		
		@FindBy(xpath=".//*[contains(text(),'Account Sub type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Account_Sub_type;
		
		@FindBy(xpath=".//*[contains(text(),'Received Date:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Received_Date;
		
		@FindBy(xpath=".//*[contains(text(),'Sent Date:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Sent_Date;
		
		@FindBy(xpath=".//*[contains(text(),'Sent Time:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Sent_Time;
		
		@FindBy(xpath=".//*[contains(text(),'Transaction Type:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Transaction_Type;
		
		@FindBy(xpath=".//*[contains(text(),'Object ID:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Object_ID;
		
		@FindBy(xpath=".//*[contains(text(),'DTN:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_DTN;
		
		@FindBy(xpath=".//*[contains(text(),'Provision Remarks:')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Provision_Remarks;
	
		//***************************************************************************************************//
		
		
		//******************** Last Section **********************************************************//
		
		@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'EnsembleOrderNumber')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Ensemble_order;
		
		@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Customer Name')]/following-sibling::label[1]")
		public WebElementFacade lbl_vieworderpage_Other_details_sec_Cust_name;
		
		
		
		//******************************Related Tab Section Validations***********************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//*[@class='ng-scope active']/a")
		public WebElementFacade tab_selected_360viewpage;
		
		//******************************BAM Report - Related Tab Section Validations Supporting Icons************************************************//
		
		/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-hide='bamReportShow']//*[contains(@id,'invDeviceReconfg-out-div')]/a")
		public WebElementFacade btn_vieworderpage_related_tab_BAM_Configcol;*/
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//i[@ng-click='refreshDetails();']")
		public WebElementFacade btn_vieworderpage_related_tab_BAM_Refresh;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//i[@ng-click='exportToExcel()']")
		public WebElementFacade btn_vieworderpage_related_tab_BAM_Excel;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//i[@ng-click='printGridData()']")
		public WebElementFacade btn_vieworderpage_related_tab_BAM_Print;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//*[@ng-click='searchBamArchive();']")
		public WebElementFacade btn_vieworderpage_related_tab_BAM_getlogs;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//*[text()='From Archive']/preceding-sibling::input")
		public WebElementFacade cbx_vieworderpage_related_tab_BAM_fromarchieve;
		
		
		//************************************************************************************************************************//
		
		//******************************Devices - Related Tab Section Validations Supporting Icons************************************************//
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//div[@ng-show='viewDevice']//th[text()='Network Roles']/../../following-sibling::tbody//td[4])[1]")
		public WebElementFacade lbl_vieworderpage_related_tab_active_device_networkrole;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//*[@ng-show='viewDevice']/div/div[4]/table/tbody[1]/tr/td[3]")
		public WebElementFacade lbl_vieworderpage_related_tab_active_device_fullname;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//a")
		public WebElementFacade lbl_vieworderpage_related_tab_active_device_name_hyperlink;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='main-tab ng-isolate-scope']//li[@class='ng-isolate-scope active']/a")
		public WebElementFacade lbl_vieworderpage_related_tab_active_tab_devicename;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//*[@ng-show='viewDevice']/div/div[2]/table/tbody[1]/tr/td[1]")
		public WebElementFacade lbl_vieworderpage_related_tab_active_device_Provision_status;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//*[@ng-show='viewDevice']/div/div[2]/table/tbody[1]/tr/td[2]")
		public WebElementFacade lbl_vieworderpage_related_tab_active_device_Functinal_status;
				
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='relatedServiceDeviceCtrl']/div[2]//*[@class='ng-isolate-scope' and @active='tab.active']")
		public WebElementFacade lbl_vieworderpage_related_tab_non_active_tab_device;
		
	//	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='relatedServiceDeviceCtrl']/div[2]//*[@class='ng-isolate-scope' and @ng-click='refreshDevices()']")
	//	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='relatedServiceDeviceCtrl']/div[2]//*[@ng-click='refreshDevices()']")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='relatedServiceDeviceCtrl']//i[@ng-click='refreshDevices()']")
		public WebElementFacade btn_vieworderpage_related_tab_device_refresh;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//*[@ng-show='viewDevice']//*[contains(text(),'Gfast')]")
		public WebElementFacade lbl_RT_GFAST_DSLAM_Device_type;
		
		
		
		//************************************************************************************************************************//
		
		//****************************** BAM Reports Related Tab Support icons ************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//button[@value='Get Logs']")
		public WebElementFacade btn_BAM_related_tab_getlogs;
		
		//************************************************************************************************************************//
		//****************************** Related Tab Section Validations Supporting Icons************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//i[starts-with(@ng-click,'exportToExcel()')]")
		public WebElementFacade btn_related_tab_excel_icon;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//i[starts-with(@ng-click,'printGridData()')]")
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[@ng-click='printGridData()']")
		public WebElementFacade btn_related_tab_print_icon;
		
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[@ title='Refresh']")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//i[contains(@ng-click,'refresh')]")
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[@ng-click='refreshDetails();']")
		public WebElementFacade btn_related_tab_refresh_icon;
		
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[@id='invSLCReconfg-out-div']/a")		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[contains(@id,'Reconfg-out-div')]/a")
		public WebElementFacade btn_related_tab_configcol_icon;		
		
		
		
		//************************************************************************************************************************//
		
		//******************************Task - Related Tab Section Validations Supporting Icons************************************************//
		
		/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='taskResultsCtrl']//*[@ng-click='printGridData()']")
		public WebElementFacade btn_vieworderpage_related_tab_tasks_print_icon;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='taskResultsCtrl']//*[@ng-click='exportToExcel()']")
		public WebElementFacade btn_vieworderpage_related_tab_tasks_excel_icon;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='taskResultsCtrl']//a[contains(@class,'invDeviceReconfg')]")
		public WebElementFacade btn_vieworderpage_related_tab_tasks_configcol_icon;	*/	
		
		//************************************************************************************************************************//
		
		//******************************Circuit - Related Tab Section Validations Supporting Icons************************************************//
		
		/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='circuitSearchController']//*[@title='Save as Excel']/img")
		public WebElementFacade btn_vieworderpage_related_tab_circuit_excel_icon;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='circuitSearchController']//*[@title='View Print View']/img")
		public WebElementFacade btn_vieworderpage_related_tab_circuit_print_icon;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(@task-id,'InventoryDevice')]//*[@ng-click='refreshCircuits()']//*[@title='Refresh']")
		public WebElementFacade btn_vieworderpage_related_tab_circuit_refresh_icon;*/
		
		//************************************************************************************************************************//
		
		//***************************************************** Device Ports tab section Supporting Icons* ************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceTreeDetailCtrl']//*[@value='Bulk Card Swap']")
		public WebElementFacade btn_serach_device_related_tab_device_port_bulk_card_swap;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceTreeDetailCtrl']//*[@ng-click='bulkPortUpdate();']")
		public WebElementFacade btn_serach_device_related_tab_device_port_bulk_Port_update;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceTreeDetailCtrl']//*[@ng-click='openShelfModal()']")
		public WebElementFacade btn_serach_device_related_tab_device_port_Add_Shelf;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceTreeDetailCtrl']//*[@ng-click='groomUNI()']")
		public WebElementFacade btn_serach_device_related_tab_device_port_Groom_UNI;
		
		//**************************************************************************************************************************//
		
		//***************************************************** Locations tab section Supporting Icons* ************************************************//
		
		/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='locationsAssociatedIndvAddrCtrl']//*[@ng-hide='errorMessageForServiceLocations']//*[@ng-click='printGridData()']")
		public WebElementFacade btn_serach_device_related_tab_locatin_print;	
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='locationsAssociatedIndvAddrCtrl']//*[@ng-hide='errorMessageForServiceLocations']//*[@ng-click='exportToExcel()']")
		public WebElementFacade btn_serach_device_related_tab_locatin_excel;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='refreshLocationButton']")
		public WebElementFacade btn_serach_device_related_tab_locatin_refresh;*/
		
		//**************************************************************************************************************************//
		
		//***************************************************** Order tab section Supporting Icons************************************************//
		
/*		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[@ng-click='exportToExcel()']")
		public WebElementFacade btn_serach_device_related_tab_order_excel;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[@ng-click='printGridData()']")
		public WebElementFacade btn_serach_device_related_tab_order_print;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='refreshOrders()']//i")
		public WebElementFacade btn_serach_device_related_tab_order_refresh;*/
		
		
		//**************************************************************************************************************************//
		
		//************************************************************** Sliders control in view page **************************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//img[@class='expandButton'][1]")
		public WebElementFacade btn_expandbutton_left;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//img[@class='expandButton'][2]")
		public WebElementFacade btn_expandbutton_right;
		
		//**********************************************************************************************************************************************************//
		
		//************************************************************** TIRKS Related Tab **************************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//*[@ng-hide='circuitDetailsFound' and contains(@class,'alert alert-danger')]")
		public WebElementFacade lbl_alert_message_no_data_tirks_CD;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//*[contains(@class,'alert alert-danger')]")
		public WebElementFacade lbl_alert_message_no_data_tirks_CLOlist;
		
		//**********************************************************************************************************************************************************//
		
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert-danger')]")
		public WebElementFacade lbl_alert_message_no_data_related_tabs;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='alert alert-danger']")
		public WebElementFacade lbl_alert_message_no_data_Performance_related_tabs;
		

		
		
		//************************************************************** Device role Tab **************************************************************//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-if='viewDevice']/div[@class='container']/div[4]/table/tbody[1]/tr/td[4]")
		public WebElementFacade lbl_devicerole;
		
		//***************************************************** Network Information 1 ************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-if='viewNetwork']/div/div[2]//tbody[1]//td[1]")
		public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_Source_System;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[contains(@id,'columntableserviceGrid')]//*[text()='Name']")
		public WebElementFacade lbl_Service_RT_Name_column;
		
		//**************************************************************************************************************************//
		
		
		//**********************************************************************Order Advance Search Validations ***************************************//
		
		@FindBy(xpath=".//*[@ng-click='onClickTab(tab)' and contains(text(),'Order Advanced Search Results')]")
		public WebElementFacade tab_order_advance_search_result;
		
		
		@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
		public WebElementFacade btn_view;
		
		//**************************************************************************************************************************//
		
		//**********************************************************************Order Advance Search Validations ***************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@active='tab.active']/a")
		public WebElementFacade tab_ActiveRelatedatb_subActivetab;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='General Section']")
		public WebElementFacade lbl_networkorder_generalsection;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-click='cancelDeviceOrder();']")
		public WebElementFacade btn_networkorder_cancelorder;
		
		
		//**************************************************************************************************************************//
		
		//*****************************************************************Location fields *****************************************************************//
		@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[1]/input")
		public WebElementFacade tbx_addNo;
		
		@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
		public WebElementFacade tbx_streetName;
		
		@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
		public WebElementFacade tbx_buildingclli;
		
		@FindBy(xpath=".//*[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]//*[@for='city']/following-sibling::input")
		public WebElementFacade tbx_lcncity;
		
		@FindBy(xpath=".//*[@ng-keyup='setAdddressFields(entity[field.name])']")
		public WebElementFacade tbx_lcnclli_createform;
		
		//*****************************************************************************************************************************************************//
		
		//*****************************************************************************************************************************************************//
		//*****************************************************************Create Order Page Sanity Validation *****************************************************************//
		//*****************************************************************************************************************************************************//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createOrder();']")
		public WebElementFacade btn_createorder_create; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetOrder();']")
		public WebElementFacade btn_createorder_reset;
		
		
		//*****************************************************************************************************************************************************//
		
		//*****************************************************************Create Order Page General Section Validation *****************************************************************//
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General Section']")
		public WebElementFacade lbl_craeteorder_generalsection; 
		
		
		
		
		
		//*****************************************************************************************************************************************************//
		
		//*****************************************************************Create Order Page Location Details Validation *****************************************************************//
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Location Details']")
		public WebElementFacade lbl_craeteorder_locationdetailssection;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='openServAddrLocLookUp(field.name)']/i")
		public WebElementFacade btn_craeteorder_locationdetailssection_locationlookup; 
		
		//*****************************************************************************************************************************************************//
		
		//*****************************************************************Create Order Page Service Details Validation *****************************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Service Details']")
		public WebElementFacade lbl_craeteorder_servicedetails; 
		
		
		
		
		//*****************************************************************************************************************************************************//
		//*****************************************************************Create Order Page Dispatch Details Validation *****************************************************************//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Dispatch Details']")
		public WebElementFacade lbl_craeteorder_dispatchdetails;
		
		
		
		//*****************************************************************************************************************************************************//
		
		//*****************************************************************Search Order Page Details Validation *****************************************************************//
		
		
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//h4[contains(text(),'Details')]")
				public WebElementFacade lbl_orderno_details;
				
				
				
		//*****************************************************************************************************************************************************//
				
				//*****************************************************************Search Order Page left side tabs Validation *****************************************************************//
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
				public WebElementFacade tab_Searchorder_Auditlogs; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'OrderNotes')]")
				public WebElementFacade tab_Searchorder_Ordernotes; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order Details')]")
				public WebElementFacade tab_Searchorder_Orderdetails; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order XML View')]")
				public WebElementFacade tab_Searchorder_Orderxmlview; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order History')]")
				public WebElementFacade tab_Searchorder_Orderhistory; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order Difference')]")
				public WebElementFacade tab_Searchorder_Orderdifference; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Related Orders')]")
				public WebElementFacade tab_Searchorder_Relatedorders;
				
				
		//*****************************************************************************************************************************************************//
				
	//***************************************************************** Audit Logs Validation *****************************************************************//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[contains(text(),'OmniVue Audit Logs')]")
				public WebElementFacade tab_Searchorder_Auditlogs_omnivueauditlog; 
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")
				public WebElementFacade btn_Searchorder_Auditlogs_omnivueauditlog_getlog; 
				
				
				
				//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				
	//###############################################		Order Notes tab validation  ####################################################################//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveNoteTab();']")
				public WebElementFacade btn_Searchorder_ordernotes_save;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//textarea[@ng-model='newOrderNote']")
				public WebElementFacade tbx_Searchorder_ordernotes_notes; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//textarea[@ng-model='orderNoteHistory']")
				public WebElementFacade lbl_Searchorder_ordernotes_history; 
				
	//--###############----------------------------------------------------------------------------------------------------------------------------------###############----------------------------------------//			
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='CTag Pool']")
				public WebElementFacade tab_ctag;

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Orders']")
				public WebElementFacade tab_orders;

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Contacts']")
				public WebElementFacade tab_contact;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='BAM Report']")
				public WebElementFacade tab_bamreport;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Circuit Details']")
				public WebElementFacade tab_circuitdetails;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Activations']")
				public WebElementFacade tab_Activations;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='ARMOR']")
				public WebElementFacade tab_Armor;
				
			
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Subscribers']")
				public WebElementFacade tab_Subscriber;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Circuits']")
				public WebElementFacade tab_Circuits;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Tasks']")
				public WebElementFacade tab_Tasks;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Locations']")
				public WebElementFacade tab_Locations;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Devices']")
				public WebElementFacade tab_Devices;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Facilities']")
				public WebElementFacade tab_facilities;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Device Ports']")
				public WebElementFacade tab_Device_ports;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Service Areas']")
				public WebElementFacade tab_Service_Areas;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='TIRKS']")
				public WebElementFacade tab_TIRKS;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Performance Monitoring']")
				public WebElementFacade tab_Performance;	
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='VLAN / Virtual Ports']")
				public WebElementFacade tab_Virtual_Ports;
				//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	//***************************************************** Configure Column Validation	****************************************************//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//a[contains(@class,'invDeviceReconfg-out')]")
				public WebElementFacade btn_Orderresultpage_configurecolumn;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Apply']")
				public WebElementFacade btn_Orderresultpage_configurecolumn_apply;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Apply Default']")
				public WebElementFacade btn_Orderresultpage_configurecolumn_applydefault;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='moveRightList']")
				public WebElementFacade ddl_Orderresultpage_configurecolumn_list;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='upButton']")
				public WebElementFacade btn_Orderresultpage_configurecolumn_up;
						

				
//*****************************************************************************************************************************************************//		
				
	//***************************************************** Task Related Tab Validation	****************************************************//				
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@ng-click='gridSettings.viewTaskDetail(0)']")
	public WebElementFacade btn_Orderresultpage_taskRT_view;
	
	@FindBy(xpath=".//div[@id='mainTab']//tab-heading[contains(text(),'Task Id:')]")
	public WebElementFacade lbl_tab_task;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='cancelDeviceOrder();']")
	public WebElementFacade btn_taskresultpage_orderRT_cancelorder;
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Go']")
	public WebElementFacade btn_TaskRT_GO;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='exportToExcel()']")
	public WebElementFacade btn_TaskRT_exportexcelicon;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[contains(@id,'invDeviceReconfg-out-div')]/a")
	public WebElementFacade btn_TaskRT_Configicon;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@ng-click='refreshTaskResults()']")
	public WebElementFacade btn_TaskRT_refreshicon;
				
//*****************************************************************************************************************************************************//	
	
//**************************************************** Order History Tab Validation	****************************************************//			
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[text()='Order History']")
	public WebElementFacade lbl_orderhistory_Header;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//th[text()='ORDER NUMBER']")
	public WebElementFacade lbl_orderhistory_ordernumber;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//th[text()='ORDER VERSION']")
	public WebElementFacade lbl_orderhistory_orderversion;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//th[text()='STATUS CODE']")
	public WebElementFacade lbl_orderhistory_statuscode;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//th[text()='COMPLETION DATE']")
	public WebElementFacade lbl_orderhistory_completiondate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//th[text()='ORDER ACTION']")
	public WebElementFacade lbl_orderhistory_orderaction;
	
	
	//*****************************************************************************************************************************************************//
	
//**************************************************** Device Related Tab Validation	****************************************************//	
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='refreshDeviceFields(deviceDetail.NODEID)'])[1]")
			public WebElementFacade btn_deviceRT_refreshicon;
			
			
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[contains(@ng-click,'editDeviceDetails')])[1]")
					public WebElementFacade btn_deviceRT_edit;
					
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[@ng-click='openRevertDeviceLookUp()'])[1]")
							public WebElementFacade btn_deviceRT_revert;
	
//*****************************************************************************************************************************************************//
	
//**************************************************** Service Related Tab Validation	****************************************************//	
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='exportToExcel();']")
	public WebElementFacade btn_ServiceRT_excelexporticon; 
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='printGridData()']")
	public WebElementFacade btn_ServiceRT_printicon;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//li[@ng-click='refreshServices()']")
	public WebElementFacade btn_ServiceRT_refreshicon;
	
	
//*****************************************************************************************************************************************************//	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_create;
	}
	
	public String create_order_successfull_msg() {
		String message=devcreatepage.success_alert.getText();
		String msg = message.substring(1, message.length());
		 slf4jLogger.info(msg);
		return msg;
		}
	
	/*public void fttsheetupdate(String ordertype) throws InterruptedException{
		if(!ordertype.equals(null)){
			String msg=null;
		if(ordertype.equals("MLTO order")){
		msg=devcreatepage.success_alert.getText();
		slf4jLogger.info(msg);
		
		} else if(ordertype.equals("Equip order")){
			Alert alertDialog = loginPage.getDriver().switchTo().alert();
			msg=alertDialog.getText();
			alertDialog.accept();
			
			msg=lbl_altequip_buildstatus_ordernumber.getText();
			slf4jLogger.info(msg);
			slf4jLogger.info(lbl_altequip_buildstatus.getText());
			msg=lbl_altequip_buildstatus_ordernumber.getText();
			if(msg!=null){
			if(!lbl_altequip_buildstatus_ordernumber.getText().equals(null)){
			//int time=85000;
			while(!lbl_altequip_buildstatus.getText().equals("SUCCESS"))				
        	{
				Thread.sleep(3000);										// Need to wait still Success
				jsClick(btn_altequip_buildstatus_refresh);
				slf4jLogger.info("Doing Refresh1");        		
        		slf4jLogger.info(lbl_altequip_buildstatus.getText());
				Thread.sleep(2000);
				if(lbl_altequip_buildstatus.getText().equals("Build Submitted")){
					Thread.sleep(3000);
					jsClick(btn_altequip_buildstatus_refresh);
					slf4jLogger.info("Doing Refresh2");        		
	        		slf4jLogger.info(lbl_altequip_buildstatus.getText());
	        		Thread.sleep(2000);
	        		if(lbl_altequip_buildstatus.getText().equals("SUCCESS")){
	        			slf4jLogger.info(lbl_altequip_buildstatus.getText());
	        			Thread.sleep(2000);
	        			break;
	        		}
				}
				if(lbl_altequip_buildstatus.getText().equals("FAILURE")){
        			altdevicecheck_validation();
        		}
				//Thread.sleep(15000);
				slf4jLogger.info("Doing Refresh");        		
        		slf4jLogger.info(lbl_altequip_buildstatus.getText());
        		//time=time-40000;
        	}
			
			} else {
				slf4jLogger.info("Orders are not getting created");
				return;
			}
				
			msg=lbl_altequip_buildstatus_ordernumber.getText();
			slf4jLogger.info(msg);
			
		}
		msg=msg.replaceAll("[^0-9]", "");	
					        try {
		      
		FileInputStream file;
		FileOutputStream os;
		
        //  file = new FileInputStream(new File("C://Users/AB52523/Desktop/MLTo/Common_FTT_CI - OV.xls"));
          
		if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
			
			file = new FileInputStream(new File("C://OSSPROV/Common_FlowThru/Common_FTT_CI_E2E.xls"));
			//file = new FileInputStream(new File("C://FTT/Common_FlowThru/Common_FTT_CI_E2E.xls"));
			
		} else {
					        	
        file = new FileInputStream(new File("C://OSSPROV/Common_FlowThru/Common_FTT_CI.xls"));
		}
		
		
		String FTT_Sheet = Page.envData.getFieldValue("FTT-Sheet");
		 
		 file = new FileInputStream(new File(FTT_Sheet));
		 
          HSSFWorkbook workbook = new HSSFWorkbook(file);
          
        //Get first sheet from the workbook
          HSSFSheet sheet = workbook.getSheetAt(0);
             
            
            //sheet.shiftRows(1, sheet.getLastRowNum(), 1, true,true);
            
           // Row row1 = sheet.getRow(i);
            
            int rowNum = sheet.getLastRowNum() + 1;
            //int colNum = sheet.getRow(0).getLastCellNum();
           // System.out.print(rowNum+"-Rolw-"+colNum);
            
            Row row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(Integer.parseInt(msg));  
            slf4jLogger.info("About to write on Excel file ..."+Integer.parseInt(msg));
            
            // open an OutputStream to save written data into Excel file
            
            if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
    			
            	//os = new FileOutputStream(new File("C://FTT/Common_FlowThru/Common_FTT_CI_E2E.xls"));
            	os = new FileOutputStream(new File("C://OSSPROV/Common_FlowThru/Common_FTT_CI_E2E.xls"));
    			
    		} else {
    					        	
    			 os = new FileOutputStream(new File("C://OSSPROV/Common_FlowThru/Common_FTT_CI.xls"));
    		}
            
            os = new FileOutputStream(new File(FTT_Sheet));
            
          //  os = new FileOutputStream(new File("C://Users/AB52523/Desktop/MLTo/Common_FTT_CI - OV.xls"));
            workbook.write(os);
            slf4jLogger.info("Writing on Excel file Finished ...");

            // Close workbook, OutputStream and Excel file to prevent leak
            os.flush();
            os.close();
            //workbook.close();
            file.close();
         //   Thread.sleep(30000);

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
		}
		}
		else throw new Error("DSP System is down");*/
   //S }      

	public void altdevicecheck_validation() throws InterruptedException{
		jsClick(btn_device1);
		 Thread.sleep(3000);
		 
		if(lbl_altequip_devicestatus_success.isPresent() && lbl_altequip_devicestatus_success.isDisplayed() && !lbl_altequip_device1_status.isPresent()){
		// if(tbx_altequip_deviceclli_designator.isEnabled()){
			slf4jLogger.info("Doing Device 1 Validation");
			tbx_altequip_deviceclli_designator.clear();
			Thread.sleep(1000);
			tbx_altequip_deviceclli_designator.sendKeys("03T");
			
		}  
		jsClick(btn_device2);
			Thread.sleep(3000);
			if(lbl_altequip_devicestatus_success.isPresent() && lbl_altequip_devicestatus_success.isDisplayed()){
			// if(tbx_altequip_deviceclli_designator.isEnabled()){
		 tbx_altequip_deviceclli_designator.clear();
			Thread.sleep(1000);
			tbx_altequip_deviceclli_designator.sendKeys("05T");
		}
		
		
			jsClick(btn_altequip_submitbuild);
		Thread.sleep(3000);
		/* Alert alertDialog = loginPage.getDriver().switchTo().alert();
			String msg=alertDialog.getText();
			alertDialog.accept();
			slf4jLogger.info(msg);*/
		 try {
		        WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 10);
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alertDialog = loginPage.getDriver().switchTo().alert();
				String msg=alertDialog.getText();
				 Thread.sleep(5000);
				alertDialog.accept();
				slf4jLogger.info(msg);
		    } catch (Exception e) {
		        //exception handling
		    }
	}
	
	
	
	public WebElementFacade actionperformed(String action){
		if(action.equals("DISPATCH")){
			jsClick(btn_dispatch);
		} else if(action.equals("IMPROV")){
			jsClick(btn_improv);
		} else if(action.equals("ISAT Create")){
			jsClick(btn_isatcreate);
		} else if(action.equals("ISAT Modify")){
			jsClick(btn_isatmodify);
		}
		
		return lbl_alertmsg;
	}
	
	public void alertmessageonmltoaction(String msg) throws InterruptedException{
		
		/*if(msg.equals("ISAT Create")){
			if(lbl_alertmsg.getText().contains("ISAT Create action submitted successfully.")){
				slf4jLogger.info("ISAT Create action was successful");
			} else throw new Error("ISAT Create action was not successful"+lbl_alertmsg.getText()+"and"+lbl_alertmsg1.getText());
		} else if(msg.equals("DISPATCH")){
			if(lbl_alertmsg.getText().contains("Dispatch action submitted successfully.")){
				slf4jLogger.info("Dispatch action was successful");
			} else throw new Error("Dispatch action was not successful"+lbl_alertmsg.getText());
		} else if(msg.equals("IMPROV")){
			if(lbl_alertmsg.getText().contains("IMPROV action submitted successfully.")){
				slf4jLogger.info("IMPROV action was successful");
			} else throw new Error("IMPROV action was not successful"+lbl_alertmsg.getText());
		} else if(msg.equals("ISAT Modify")){
			if(lbl_alertmsg.getText().contains("ISAT Modify action submitted successfully.")){
				slf4jLogger.info("ISAT Modify action was successful");
			} else throw new Error("ISAT Modify action was not successful"+lbl_alertmsg.getText());
		}*/
		
		
		switch(msg){
		case "Order was cancel request was successful message": waitForElement(lbl_alertmsg);
							if(lbl_alertmsg.getText().contains("Order Cancel request submitted successfully.")){
																		slf4jLogger.info("Expected messgae is displayed:"+lbl_alertmsg.getText());
																	} else {
																		throw new Error("Invalid message is been displayed:"+lbl_alertmsg.getText());
																	}
																	if(lbl_vieworderpage_order_status.getText().replaceAll("\\s","").equals("CANCELLED")){
																		slf4jLogger.info("Order Status got updated as:"+lbl_vieworderpage_order_status.getText().replaceAll("\\s","")+"= As expected");
																	} else {
																		throw new Error("Invalid Order status is been displayed:"+lbl_vieworderpage_order_status.getText().replaceAll("\\s",""));
																	}
																	break;
																	
		case "Order was successful created":create_order_successfull_msg();break;
		
		case "ISAT Create": waitForElement(lbl_alertmsg);
			if(lbl_alertmsg.getText().contains("ISAT Create action submitted successfully.")){
								slf4jLogger.info("ISAT Create action was successful");
							} else throw new Error("ISAT Create action was not successful"+lbl_alertmsg.getText()+"and"+lbl_alertmsg1.getText());
			jsClick(btn_alertmsg_clsicon);break;
			
		case "DISPATCH": waitForElement(lbl_alertmsg);
			if(lbl_alertmsg.getText().contains("Dispatch action submitted successfully.")){
			slf4jLogger.info("Dispatch action was successful");
		} else throw new Error("Dispatch action was not successful"+lbl_alertmsg.getText());jsClick(btn_alertmsg_clsicon); break;
			
		case "IMPROV": waitForElement(lbl_alertmsg);
			if(lbl_alertmsg.getText().contains("IMPROV action submitted successfully.")){
			slf4jLogger.info("IMPROV action was successful");
		} else throw new Error("IMPROV action was not successful"+lbl_alertmsg.getText());jsClick(btn_alertmsg_clsicon);break;
		
		case "ISAT Modify": waitForElement(lbl_alertmsg);
			if(lbl_alertmsg.getText().contains("ISAT Modify action submitted successfully.")){
			slf4jLogger.info("IMPROV action was successful");
		} else throw new Error("ISAT Modify was not successful"+lbl_alertmsg.getText());jsClick(btn_alertmsg_clsicon);break;
		}
		
	}
	
	public void actionfieldvalidation() throws Throwable{  
		
		switch(lbl_vieworderpage_order_status.getText().replaceAll("\\s","")){
		case "COMPLETED":
		case "HELD":
		case "CANCELLED": if(!btn_dispatch.isEnabled() || !btn_improv.isEnabled() || !btn_isatcreate.isEnabled() || !btn_isatmodify.isEnabled()){
								slf4jLogger.info("All the buttons are not Enabled for "+lbl_vieworderpage_order_status.getText());
								int k=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Dispatch Button (Action is Based on the Order Status)");
								for(int i=0;i<4;i++){
								gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", k, "Pass");
								k++;
								}
								
							} else{ 
								int k=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Dispatch Button (Action is Based on the Order Status)");
								for(int i=0;i<4;i++){
								gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", k, "Fail");
								k++;
								}
								
								throw new Error("Buttons are Enabled for ="+lbl_vieworderpage_order_status.getText()); 
								
								
							} break;
							
		default: 	if(btn_dispatch.isEnabled() && btn_improv.isEnabled() && btn_isatcreate.isEnabled() && btn_isatmodify.isEnabled()){
						slf4jLogger.info("All the buttons are available for this status"+lbl_vieworderpage_order_status.getText());
						int k=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Dispatch Button (Action is Based on the Order Status)");
						for(int i=0;i<4;i++){
						gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", k, "Pass");
						k++;
						}
					} else {
						int k=14;
						for(int i=0;i<4;i++){
						gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", k, "Fail");
						k++;
						}
						throw new Error("Buttons are not available"+lbl_vieworderpage_order_status.getText()); 
					}break;
		}
		/*if(!lbl_vieworderpage_order_status.getText().contains("COMPLETED") || !lbl_vieworderpage_order_status.getText().contains("CANCELLED")){
		if(btn_dispatch.isEnabled() || btn_improv.isEnabled() || btn_isatcreate.isEnabled() || btn_isatmodify.isEnabled()){
			slf4jLogger.info("All the buttons are available for this status"+lbl_vieworderpage_order_status.getText());
		} else{
			throw new Error("Buttons are not available"+lbl_vieworderpage_order_status.getText());
		}
		} else if(!btn_dispatch.isEnabled() || !btn_improv.isEnabled() || !btn_isatcreate.isEnabled() || !btn_isatmodify.isEnabled()){
			slf4jLogger.info("All the buttons are Enabled for "+lbl_vieworderpage_order_status.getText());
		}*/ 
		
	}
	
	public void buttonvisibilitycheck(String button,String state){
		
		switch(button){
		case "Cancel & Save": if(btn_cancel_Editmltoorder.isCurrentlyVisible() && btn_cancel_Editmltoorder.isCurrentlyEnabled()){
									slf4jLogger.info("Cancel button is enabled & clickable as expected");
								} else {
									throw new Error("Cancel is not been displayed");
								}
								if(btn_Save_editmltoorder.isCurrentlyVisible() && btn_Save_editmltoorder.isCurrentlyEnabled()){
									slf4jLogger.info("Save button is enabled & clickable as expected");
								} else {
									throw new Error("Save is not been displayed");
								} break;
								
		case "Edit Order":	if(state.equals("Enabled")){
								if(!btn_editmltoorder.isEnabled()){
									throw new Error("Edit Buttons are disabled for Admin role");
								}
								} else if(state.equals("Disabled")){
									if(btn_editmltoorder.isEnabled()){
										throw new Error("Edit Buttons are Enabled for User role");
									}
									}  break;
									
		case "Cancel Order": 	btn_cancelmltoorder.isEnabled();
								if(state.equals("Enabled")){
									if(!btn_cancelmltoorder.isEnabled()){				
									  throw new Error("Cancel Buttons are disabled for Admin role");
									}				 
								}
									if(state.equals("Disabled")){
										if(btn_cancelmltoorder.isEnabled()){
											throw new Error("Cancel Buttons are Enabled for User role");
										}
										} break; 
		}
		/*if(button.equals("Edit Order")){	
			if(state.equals("Enabled")){
			if(!btn_editmltoorder.isEnabled()){
				throw new Error("Edit Buttons are disabled for Admin role");
			}
			} else if(state.equals("Disabled")){
				if(btn_editmltoorder.isEnabled()){
					throw new Error("Edit Buttons are Enabled for User role");
				}
				}  
		} 
		
		if(button.equals("Cancel Order")){
			btn_cancelmltoorder.isEnabled();
			if(state.equals("Enabled")){
				if(!btn_cancelmltoorder.isEnabled()){				
				  throw new Error("Cancel Buttons are disabled for Admin role");
				}				 
			}
				if(state.equals("Disabled")){
					if(btn_cancelmltoorder.isEnabled()){
						throw new Error("Cancel Buttons are Enabled for User role");
					}
					}  
			} */
	}
	
	public void Order_pagevalidation(String str1) throws Throwable {
		switch(str1){
		case "Available Actions & Order status": actionfieldvalidation();break;
		case "V and H coordinates fields are not displayed in MLTO Create form": 
			List<WebElementFacade> Ordercreatelist = lbl_SearchpageOrderxpath;
			ArrayList<String> OrderatributesOfPage=new ArrayList<String>();
			for(int j=0;j<Ordercreatelist.size();j++){				
				OrderatributesOfPage.add(j, Ordercreatelist.get(j).getText().trim());				
			}
			
			for(int i=0;i<OrderatributesOfPage.size();i++){
				
				switch(OrderatributesOfPage.get(i)){
				case "V coordinates:":throw new Error("V Coordinate is present");
				case "H coordinates":throw new Error("H Coordinate is present");
				case "V and H coordinates":throw new Error("V and H Coordinate is present");			
				
				}
			} break;
		}
	}
	
	
/*	public void editfieldvalidation(){
		if(!tbx_orderno.isEnabled() && !tbx_customername.isEnabled() && !tbx_customerlastname.isEnabled()&& !ddl_customerType.isEnabled() && !ddl_customerSubtype.isEnabled() && !ddl_accountType.isEnabled() && !lbl_serviceaddress_field1.isEnabled() && !lbl_serviceaddress_field2.isEnabled() && !lbl_wirecenterclli.isEnabled() && lbl_latitude.isEnabled() && !lbl_logitude.isEnabled() && !tbx_General_remark.isEnabled() && !tbx_dtn.isEnabled() && !tbx_reasoncode.isEnabled() && !ddl_serviceType.isEnabled() && !ddl_hdStreams.isEnabled() && !ddl_downSpeed.isEnabled() && !ddl_upSpeed.isEnabled() && !lbl_featureCodeCollection1.isEnabled() && !tbx_featureCodeRemark.isEnabled()){
			if(tbx_appointmentStartDate.isEnabled() && tbx_appointmentEndDate.isEnabled() && tbx_requestedDueDate.isEnabled() && tbx_appointmentstarttime.isEnabled() && tbx_appointmentendtime.isEnabled() && tbx_dispatchRemark.isEnabled()){
				slf4jLogger.info("As expected only DIspatch fileds are editable");
			} throw new Error("Able to see the fields in ediatble state");
		}else throw new Error("Able to see the fields in ediatble state");
		if(ddl_serviceType.getText().equals("HSI")){
			if(!ddl_hdStreams.isPresent()){
				slf4jLogger.info("As expected");
			} throw new Error("Able to see the HD Stream in edit of HSI service");
		}
	}*/
	
	public void dispatchdetails() throws InterruptedException {
		
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		 tbx_appointmentStartDate.type(date1);
		 Thread.sleep(5000);
		 tbx_appointmentEndDate.type(date1);
		 Thread.sleep(5000);
		 tbx_requestedDueDate.type(date1);
		 Thread.sleep(5000);
		 DateFormat dateFormat1 = new SimpleDateFormat("HH:mm yy/MM/dd");
		 Date date20 = new Date();
		 String date21= dateFormat1.format(date20);
		 date21=date21.replace("/","");
		 date21=date21.replace(":","");
		 date21=date21.replace(" ","");
		 slf4jLogger.info(date21);

		 tbx_orderno.type(shuffle_words(date21));
		 
		 Thread.sleep(5000);
		 DateFormat dateFormat2 = new SimpleDateFormat("yy/MM/dd HH:mm");
		 Date date30 = new Date();
		 String date31= dateFormat2.format(date30);
		 date31=date31.replace("/","");
		 date31=date31.replace(":","");
		 date31=date31.replace(" ","");
		 slf4jLogger.info(date31);

		 tbx_dtn.type(shuffle_words(date31));
	}
	
	/**
     * Shuffles a given word. Randomly swaps characters 10 times.
     * @param word
     * @return 
     */
	
	public String shuffle_words(String word) {
	        String shuffledWord = word; // start with original
	        int wordSize = word.length();
	        
	        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm yy/MM/dd");
			 Date date20 = new Date();
			 String date21= dateFormat1.format(date20);
			 date21=date21.replace("/","");
			 date21=date21.replace(":","");
			 date21=date21.replace(" ","");
			 //slf4jLogger.info(date21);
			 
	        int shuffleCount = date21.charAt(0)+date21.charAt(1); // let us randomly shuffle letters 
	        slf4jLogger.info("Shuffle count:"+shuffleCount);
	        for(int i=0;i<shuffleCount;i++) {
	            //swap letters in two indexes
	            int position1 = ThreadLocalRandom.current().nextInt(0, wordSize);
	            int position2 = ThreadLocalRandom.current().nextInt(0, wordSize);
	            shuffledWord = swapCharacters(shuffledWord,position1,position2);
	        }
	        return shuffledWord;
	    }
	 
	public String swapCharacters(String shuffledWord, int position1, int position2) {
	        char[] charArray = shuffledWord.toCharArray();
	        // Replace with a "swap" function, if desired:
	        char temp = charArray[position1];
	        charArray[position1] = charArray[position2];
	        charArray[position2] = temp;
	        return new String(charArray);
	    }
	  
	public void altequitfill() throws InterruptedException{
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat dateFormat1 = new SimpleDateFormat("ddMMyyyy");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);

		// tbx_altequip_duedate.type(date1);
		 jsClick(btn_altequip_engduedate);
		 waitForElement(btn_altequip_engduedate_today);Thread.sleep(2000);
		 jsClick(btn_altequip_engduedate_today);
		 
		 date1= dateFormat1.format(date);
		 tbx_altequip_projectid.type(date1);
		 Thread.sleep(5000);		 
	}
	
	public void validating_orders(){		// Remove this scripts its no more needed
		try {
	        //  File excel = new File("C://Users/AB52523/Desktop/MLTo/Common_FTT_CI - OV.xlsx");
	          File excel = new File("//eldnp1515dm3/mixdeng06/Data/NetworkSystemTest/DSPWF/Automation/NIC_DSP_FLOWTHRU_AUTOMATION/DSPTEST1/Main/Common_FTT_CI.xlsx");
	           // \\\\
	            FileInputStream fis = new FileInputStream(excel);
	            XSSFWorkbook book = new XSSFWorkbook(fis);
	            XSSFSheet sheet = book.getSheetAt(1);
	          
	            int rowNum = sheet.getLastRowNum() + 1;
	            int colNum = sheet.getRow(0).getLastCellNum();
	            
	           System.out.print(rowNum+"-Rolw-"+colNum);
	          //os.close();
	            book.close();
	            fis.close();

	        } catch (FileNotFoundException fe) {
	            fe.printStackTrace();
	        } catch (IOException ie) {
	            ie.printStackTrace();
	        }
		
	}
	
	public void validatedevicestatus() throws InterruptedException{
		
		// NID Device
		//btn_device1);
		//Thread.sleep(5000);
		if(!btn_device_state_existing.isSelected()){
		if(!tbx_altequip_deviceclli_designator.getText().equals("01T")){
			slf4jLogger.info(tbx_altequip_deviceclli_designator.getText()+"First designator");
			tbx_altequip_deviceclli.clear();
			tbx_altequip_deviceclli_designator.clear();
			Thread.sleep(2000);
			tbx_altequip_deviceclli.sendKeys("WNGRFLXA");
			tbx_altequip_deviceclli_designator.sendKeys("01T");
			jsClick(btn_validatedevice);
			
		}	
			
		
		Thread.sleep(3000);
		
		// NPE Device
		jsClick(btn_device2);
		Thread.sleep(5000);
		
		if(!tbx_altequip_deviceclli_designator.getText().equals("02T")){
			tbx_altequip_deviceclli.clear();
		tbx_altequip_deviceclli_designator.clear();
		Thread.sleep(2000);
		tbx_altequip_deviceclli.sendKeys("WNGRFLXA");
		tbx_altequip_deviceclli_designator.sendKeys("02T");
	
		Thread.sleep(5000);
		jsClick(btn_validatedevice);
		}
		}
	}
	
	public void i_search_order_inadvancesearchOrder(String searchcriteria) throws Throwable{
		waitForElement(btn_adsearchorder);
		switch(searchcriteria){
		case "Network Orders":ddl_adsearchorder_ordertype.selectByVisibleText(searchcriteria);break;
		}
	}	
	
	public void Advance_search_order() throws Exception {
		slf4jLogger.info(lnk_circuitparameter.getText());
		jsClick(lnk_circuitparameter);
		//loginPage.waitFor(actvtnpage.tbx_dtnorder);
		waitForElement(ddl_servicetype_adsearchorder);
	}                                                                     
	
	public void Advance_Search_button_action(String button)throws Throwable{ 
		slf4jLogger.info("About to click "+button);
		switch(button){
		case "Orders":	jsClick(btn_adsearchorder);Thread.sleep(7000); break;
		case "Circuit": jsClick(btn_adsearch_circuit);Thread.sleep(8000); break;
		case "Contacts":jsClick(btn_adsearch_contact); break;
		case "Device": jsClick(btn_advance_device_search); waitForElement(btn_view);break;
		case "Location":jsClick(btn_advance_location_search);Thread.sleep(5000); break;
		case "Address Range":jsClick(btn_advance_Andvancerange_search);	waitForElement(btn_view);break;
		case "Individual Location":jsClick(btn_advance_location_search); waitForElement(btn_view);break;   
		case "Task":jsClick(btn_task_advanced_search); Thread.sleep(3000);break;
		case "Address Range-Street_name" :jsClick(btn_advance_Andvancerange_search);Thread.sleep(5000);break;
		case "Defect Task" : jsClick(btn_defect_task_advanced_search);Thread.sleep(5000);break;
		case "Topology" : jsClick(btn_topology_advanced_search);Thread.sleep(5000);break;
		//waitForElement(searchlocation.btn_search_Addressrange_view_DeleteAddressrange);break;
		
		}
	
	
	}
	
	public void servicetype_select_advancesearch(String type) {
		switch(type){
		case "All":ddl_servicetype_adsearchorder.selectByValue("HSI");
					ddl_servicetype_adsearchorder.selectByValue("IPTV");
					ddl_servicetype_adsearchorder.selectByValue("HSI_IPTV");break;
					
		case "HSI": ddl_servicetype_adsearchorder.selectByValue("HSI");;break;
		
		case "IPTV": ddl_servicetype_adsearchorder.selectByValue("IPTV"); ddl_servicetype_adsearchorder.selectByValue("HSI_IPTV");break;
		}
		
		
	}
	
	public String validate_actiontype_order_Search_page() throws Throwable{
		
		String path1=".//*[contains(@id,'columntablejqxGrid')]/div[";
		int j=0,i=1;
		String validation="Pass";
		while(i!=0){
			String columnheader=path1+i+"]//span";
			if(loginPage.getDriver().findElement(By.xpath(columnheader)).getText().contains("Action")){
				j=i;
				slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(columnheader)).getText()+"Field found");
				break;				
			}
			i++;
			slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(columnheader)).getText()+"Field found");
		}
		
		String path2=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
		String resultactionvalue=loginPage.getDriver().findElement(By.xpath(path2+j+"]/div")).getText();
		slf4jLogger.info(resultactionvalue+"Action value");
		
		if(!btn_order_tab_search_view_page.isCurrentlyVisible()){
			jsClick(actvtnpage.btn_view);
		waitForElement(btn_dispatch);
		Thread.sleep(8000);
		} else {
			jsClick(btn_order_tab_search_view_page);
			
		}
		waitForElement(btn_dispatch);
		if(lbl_orderview_Action_value.isCurrentlyVisible()){		
		
		switch(resultactionvalue){
			case "N": if(!lbl_orderview_Action_value.getText().contains("ADD")){
					slf4jLogger.info(lbl_orderview_Action_value.getText());
					validation="Fail";
						}
						break;
			case "C": if(!lbl_orderview_Action_value.getText().contains("CHANGE")){
					slf4jLogger.info(lbl_orderview_Action_value.getText());
						//throw new Error("Invalid value is populated");
						validation="Fail";
						}
						break;			
			case "D": if(!lbl_orderview_Action_value.getText().contains("REMOVE") || !lbl_orderview_Action_value.getText().contains("DEACTIVATE")){
					slf4jLogger.info(lbl_orderview_Action_value.getText());
						//throw new Error("Invalid value is populated");
						validation="Fail";
						}		
						break;
			case " ": if(!lbl_orderview_Action_value.getText().contains(" ")){
				slf4jLogger.info(lbl_orderview_Action_value.getText());
						//throw new Error("Invalid value is populated");
				validation="No Action value is updated";
						}
						break;
			}
		} else {
			if(resultactionvalue.equals(lbl_MLTO_orderview_Action_value.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Action Value is matching as expected");
			} else {
				throw new Error("Action Value is NOT matching");
			}
		}
		return validation;
		
	}
	
	public void order_search_results_tab_search_parameters_validations(String search_parameter)throws Throwable{
		
		String validationvalue=null;
		int column_count=0;
		slf4jLogger.info("Searching the Tab");
		if(btn_order_search_results_tab.isCurrentlyVisible()){
			slf4jLogger.info("Search Result Tab is Displayed");
		switch(search_parameter){
		case "Ensemble Order Number": if(lbl_order_result_page_search_parameters_Ensemble_Order_ID.getText().replaceAll("\\s","").equals(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")).replaceAll("\\s",""))){
											validationvalue="Pass as expected";
										} else {
											validationvalue="Fail";
											}
		column_count=search_hearder_excel("GFast_BaseSanity","Search Parameter"); slf4jLogger.info("Search Parameter:"+column_count);
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);break;
		case "CSOF Order Number": compare_filed_values_with_expected(lbl_order_result_page_search_parameters_CSOF_Order_ID.getText(), "685482", "CSOF Order Number"); break;
		case "TN": compare_filed_values_with_expected(lbl_order_result_page_search_parameters_TN.getText(), "1000009567", "TN"); break;
		case "Customer Name":compare_filed_values_with_expected(lbl_order_result_page_search_parameters_customer_name.getText(), "BEGINNINGS, NEW", "Customer Name"); break;
		
		
		case "Ensemble Order & Customer Name": if(lbl_order_result_page_search_parameters_Ensemble_Order_ID.getText().replaceAll("\\s","").equals(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")).replaceAll("\\s","")) && lbl_order_result_page_search_parameters_customer_name.getText().replaceAll("\\s","").equals(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).toUpperCase().replaceAll("\\s","")+","+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).toUpperCase().replaceAll("\\s",""))){
													validationvalue="Pass as expected";
													} else {
														validationvalue="Fail";
														}
		column_count=search_hearder_excel("GFast_BaseSanity","Search Parameter"); slf4jLogger.info("Search Parameter:"+column_count);
												gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);break;
												
												
			
		}
		}else if(btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){

			slf4jLogger.info("Order Id is displayed");
				switch(search_parameter){
				case "Ensemble Order Number": if(compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Ensemble_order.getText().replaceAll("\\s",""), gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")).replaceAll("\\s",""), "Ensemble Order Number")){
													validationvalue="Pass in Order View Page";
												} else {
													validationvalue="Fail";
													}
											column_count=search_hearder_excel("GFast_BaseSanity","Search Parameter"); slf4jLogger.info("Search Parameter:"+column_count);
											gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);break;
				case "CSOF Order Number": compare_filed_values_with_expected(lbl_order_result_page_search_parameters_CSOF_Order_ID.getText(), "685482", "CSOF Order Number"); break;
				case "TN": compare_filed_values_with_expected(lbl_order_result_page_search_parameters_TN.getText(), "1000009567", "TN"); break;
				case "Customer Name":compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Cust_name.getText(), "BEGINNINGS, NEW", "Customer Name"); break;
				
				
				case "Ensemble Order & Customer Name": if(compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Ensemble_order.getText().replaceAll("\\s",""), gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")).replaceAll("\\s",""), "Ensemble Order Number") && compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Cust_name.getText().replaceAll("\\s",""), gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).toUpperCase().replaceAll("\\s","")+","+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).toUpperCase().replaceAll("\\s",""), "Customer Name")){
															validationvalue="Pass in Order View Page";
															} else {
																validationvalue="Fail";
																}
																column_count=search_hearder_excel("GFast_BaseSanity","Search Parameter"); slf4jLogger.info("Search Parameter:"+column_count);
																gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);break;
														
														
					
				}
			
				
			
		}
		}
	
	public void order_search_results_csof_ID_validation() throws Throwable{
		if(btn_order_search_results_tab.isCurrentlyVisible()){
			slf4jLogger.info("In Order Result section");
		} else if(btn_order_tab_search_view_page.isCurrentlyVisible()){
			slf4jLogger.info("Order View Page");
		}
			
		
	}
	
	
	
	public void order_search_results_tab_orders_validation(String columnvalidation) throws Throwable{
		
		String validationvalue=null;
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
		int column_count=0;
		
		if(btn_order_search_results_tab.isCurrentlyVisible()){
		
		//String resultactionvalue=loginPage.getDriver().findElement(By.xpath(tableheader+j+"]/div")).getText();
		
		int i=1;
		
		while(i!=0){
			//slf4jLogger.info("Header displayed"+loginPage.getDriver().findElement(By.xpath(tableheader+i+"]//span")).getText());
			if(loginPage.getDriver().findElement(By.xpath(tableheader+i+"]//span")).getText().contains(columnvalidation)){
				//slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(tableheader+i+"]//span")).getText()+" Header found");
				 validationvalue=loginPage.getDriver().findElement(By.xpath(fieldvalue+i+"]/div")).getText();
				 //slf4jLogger.info(columnvalidation+"="+validationvalue);
				switch(columnvalidation){
				case "Ensemble Order Number":if(!validationvalue.isEmpty()){			
			
											if(validationvalue.contains(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")))){
												//slf4jLogger.info("Validated Ensemble Order Number"); 
												validationvalue="Pass";
													} 	else {
														validationvalue="Fail-Ensemble Order Number is not correct";
													}
											} else {
												throw new Error("No Data is displayed on the serach");
											}
											if(validationvalue.contains(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")))){
												column_count=search_hearder_excel("GFast_BaseSanity","Ensemble Order Number from Order Result column"); 
												gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
											}
											 break;
											
				case "Order ID":	if(!validationvalue.isEmpty()){
									//slf4jLogger.info("Validated Order ID:"+validationvalue);
										if(validationvalue.contains(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")))){
											column_count=search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column"); 
											gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
										}
									
									} else {
										throw new Error("No Data is displayed on the serach");
									}break;
									
				case "Action": 		if(!validationvalue.isEmpty()){
									//slf4jLogger.info("Validated Action:"+validationvalue); 
									column_count=search_hearder_excel("GFast_BaseSanity","Action from Order Result column"); 
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									} else {
										throw new Error("No Data is displayed on the serach");
									}break;
									
				case "Customer":	if(!validationvalue.isEmpty()){
									if(validationvalue.contains(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")))){
									if(validationvalue.replaceAll("\\s","").equals(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).replaceAll("\\s","").toUpperCase()+","+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).replaceAll("\\s","").toUpperCase())){
									//slf4jLogger.info("Validated Customer");
									validationvalue="Pass";
									} else {
										slf4jLogger.info("Value of customer is:"+validationvalue.replaceAll("\\s",""));
										slf4jLogger.info("Value it compared with is:"+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).replaceAll("\\s","")+","+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).replaceAll("\\s",""));
										validationvalue="Fail-Customer name is not correct";
										
									}
									column_count=search_hearder_excel("GFast_BaseSanity","Customer Name from Order Result column"); 
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									}
										}else {
											throw new Error("No Data is displayed on the serach");
										}break;
									
				case "Status":		if(!validationvalue.isEmpty()){
									//slf4jLogger.info("Validated Status:"+validationvalue); 
					if(validationvalue.contains(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")))){
									column_count=search_hearder_excel("GFast_BaseSanity","Order Status from Order Result column"); 
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									} } else {
										throw new Error("No Data is displayed on the serach");
									}break;
									
				case "Due Date":	if(!validationvalue.isEmpty()){
									//slf4jLogger.info("Validated Due Date:"+validationvalue);
									if(validationvalue.contains(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")))){
									column_count=search_hearder_excel("GFast_BaseSanity","Due Date from Order Result column"); 
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									gfast_Automation_status_update("GFast-Sheet","GFast_BaseSanity");
									} }else {
										throw new Error("No Data is displayed on the serach");
									}break;							
				}
				
			}
			
			i++;
			
			if(!loginPage.isElementVisible(By.xpath(tableheader+i+"]//span"))){
				slf4jLogger.info("Break");
				break;
			}
		}
		}else if(btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){
			
				
				switch(columnvalidation){
				case "Ensemble Order Number": Thread.sleep(3000);
				//lbl_vieworderpage_csof_order_no);syso
				slf4jLogger.info("Order Number is :"+lbl_vieworderpage_csof_order_no.getText());
											JavascriptExecutor jse = (JavascriptExecutor)getDriver();
											jse.executeScript("window.scrollBy(0,250)", "");
											jse.executeScript("window.scrollBy(0,250)", "");
											jse.executeScript("window.scrollBy(0,250)", "");
										if( lbl_vieworderpage_Other_details_sec_Ensemble_order.getText().replaceAll("\\s","").equals(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")).replaceAll("\\s",""))){
												//slf4jLogger.info("Validated Ensemble Order Number"); 
												validationvalue="Pass";
													} else {
														validationvalue="Fail-Ensemble Order Number is not correct";
													} 
											slf4jLogger.info("Sheet data:"+ gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")));
											slf4jLogger.info("Data Dispalyed:"+ lbl_vieworderpage_Other_details_sec_Ensemble_order.getText().replaceAll("\\s",""));
										column_count=search_hearder_excel("GFast_BaseSanity","Ensemble Order Number from Order Result column"); 
										gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
										
										jse.executeScript("window.scrollBy(0,-250)", "");
										jse.executeScript("window.scrollBy(0,-250)", "");
										jse.executeScript("window.scrollBy(0,-250)", "");
										break;
											
				case "Order ID":	if(!lbl_vieworderpage_csof_order_no.getText().isEmpty()){
									//slf4jLogger.info("Validated Order ID:"+validationvalue); 
									validationvalue=lbl_vieworderpage_csof_order_no.getText();
										}
										else {
												validationvalue="Fail-CSOF ID is not correct";
										}
										column_count=search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column"); 
										gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									 break;
									
				case "Action": 		if(!lbl_vieworderpage_action.getText().isEmpty()){
					
									//slf4jLogger.info("Validated Action:"+validationvalue); 
											validationvalue=lbl_vieworderpage_action.getText();
										}
										else{
										}
										column_count=search_hearder_excel("GFast_BaseSanity","Action from Order Result column"); 
										gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									 break;
									
				case "Customer":	validationvalue=gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).replaceAll("\\s","").toUpperCase()+","+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).replaceAll("\\s","").toUpperCase();
									if(compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Cust_name.getText().replaceAll("\\s",""),validationvalue,"Customer")){
									//slf4jLogger.info("Validated Customer");
									validationvalue="Pass";
									} else {
										slf4jLogger.info("Value of customer is:"+validationvalue.replaceAll("\\s",""));
										slf4jLogger.info("Value it compared with is:"+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).replaceAll("\\s","")+","+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).replaceAll("\\s",""));
										validationvalue="Fail-Customer name is not correct";
										
									}
									column_count=search_hearder_excel("GFast_BaseSanity","Customer Name from Order Result column"); 
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									break;
									
				case "Status":		if(!lbl_vieworderpage_order_status.getText().isEmpty()){
									//slf4jLogger.info("Validated Status:"+validationvalue); 
											validationvalue=lbl_vieworderpage_order_status.getText();
										}
										else {
												validationvalue="Fail-Status is not correct";
										}
										column_count=search_hearder_excel("GFast_BaseSanity","Order Status from Order Result column"); 
										gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									 break;
									
				case "Due Date":	if(!lbl_vieworderpage_due_date.getText().isEmpty()){
											validationvalue=lbl_vieworderpage_due_date.getText();
										}
										else {
												validationvalue="Fail-Status is not correct";
										}
									column_count=search_hearder_excel("GFast_BaseSanity","Due Date from Order Result column"); 
									gfast_write_data_inexcel("GFast-Sheet","GFast_BaseSanity",column_count,validationvalue);
									gfast_Automation_status_update("GFast-Sheet","GFast_BaseSanity");
									 break;							
				}
				
			
			

		}
		
		/*if(validationvalue.contains("Fail")){
			gfast_Automation_status_update("GFast-Sheet","GFast_BaseSanity");
			throw new Error(validationvalue);
		}*/
	}
	
	public void order_search_result_icon_validation(String iconvalidation) throws Throwable{
		if(btn_order_search_results_tab.isCurrentlyVisible()){
		switch(iconvalidation){
		case "Excel": //waitForElementclickable_gfast(btn_order_result_page_excel);
						//gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 2, gfast_get_excel_data_from("GFast-Sheet", "GFast_OrderSearchResults", 2));
			if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
						gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 3, waitForElementclickable_gfast(btn_order_result_page_excel)+"-Excel icon Validation");
						
						if(waitForElementclickable_gfast(btn_order_result_page_excel).contains("Fail")){
							gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 5, waitForElementclickable_gfast(btn_order_result_page_excel)+"-Excel icon is not present");
						}
			}
						//gfast_Automation_status_update("GFast-Sheet","GFast_OrderSearchResults");
						
						slf4jLogger.info("Excel Icon is present");break;
		case "Printer"://waitForElementclickable_gfast(btn_order_result_page_print); 
						//gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 2, gfast_get_excel_data_from("GFast-Sheet", "GFast_OrderSearchResults", 2));
						if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
								gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 3, waitForElementclickable_gfast(btn_order_result_page_print)+"-Print icon Validation");
								//gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 4, loginPage.getDate("MM-dd-yyyy HH:mm:ss"));
								if(waitForElementclickable_gfast(btn_order_result_page_excel).contains("Fail")){
									gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 5, waitForElementclickable_gfast(btn_order_result_page_excel)+"-Print icon is not present");
								}
						}
						//gfast_Automation_status_update("GFast-Sheet","GFast_OrderSearchResults");
						slf4jLogger.info("Printer Icon is present");break;
		case "Arrange Columns"://waitForElementclickable_gfast(btn_order_result_page_config_mng); 
						//gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 2, gfast_get_excel_data_from("GFast-Sheet", "GFast_OrderSearchResults", 2));
						if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
						gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 3, waitForElementclickable_gfast(btn_order_result_page_config_mng)+"-Configuration column icon");
								//gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 4, loginPage.getDate("MM-dd-yyyy HH:mm:ss"));
								if(waitForElementclickable_gfast(btn_order_result_page_excel).contains("Fail")){
									gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 5, waitForElementclickable_gfast(btn_order_result_page_excel)+"-Configuration column icon is not present");
								}
						}
						//gfast_Automation_status_update("GFast-Sheet","GFast_OrderSearchResults");
						slf4jLogger.info("Arrange Columns Icon is present");break;
	}
		} else if(btn_order_tab_search_view_page.isCurrentlyVisible()){
			if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
				switch(iconvalidation){
					case "Excel": 
						if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
						gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 3, "NA-Due to New code change");
						} slf4jLogger.info("NA-Due to New code change");
								//slf4jLogger.info("Excel Icon is present");
					break;
								
					case "Printer":	
						if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
						gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 3, "NA-Due to New code change");
						}	slf4jLogger.info("NA-Due to New code change");	
								//slf4jLogger.info("Printer Icon is present");
					break;
								
					case "Arrange Columns":	
						if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
						gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 3, "NA-Due to New code change");
						} slf4jLogger.info("NA-Due to New code change");	
								//slf4jLogger.info("Arrange Columns Icon is present");
					break;
					}
			}
		}
		
			if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
		gfast_write_data_inexcel("GFast-Sheet", "GFast_OrderSearchResults", 4, Page.getDate("MM-dd-yyyy HH:mm:ss"));
			}
	}  
	
	
	public void gfast_order_tab_validation() throws Throwable{
		
		if(lbl_vieworderpage_csof_order_no.isCurrentlyVisible()){
		slf4jLogger.info(btn_order_tab_search_view_page.getText());
		if(btn_order_tab_search_view_page.getText().contains("Order Id:"+gfast_order_id_search())){
			slf4jLogger.info("As expected Tab is correctly displayed");
		} else {
			slf4jLogger.info("Invalid Tab display");
		}
		waitForElement(btn_dispatch);
		}
	}
	
	public void order_view_order_details_tab() throws Throwable{
		jsClick(btn_order_details_tab_search_view_page);
		waitForElement(btn_dispatch);
		if(lbl_csof_order_no_field.isCurrentlyVisible()){
			slf4jLogger.info("Order Details page id displayed");			
		} else {
			slf4jLogger.info("Not Displayed");
		}
	}
	
	public void order_view_page_validation(String orderpagesction) throws Throwable{
		String Validation=null;
		int column_count=0;
		switch(orderpagesction){ 

		case "select Devices displayed in the Orders screen": Thread.sleep(3000);break;
		case "Order Details Section": column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Csof order");
									//compare_filed_values_with_expected(lbl_vieworderpage_csof_order_no.getText(),"685482","Csof order"); 
										waitForElement(lbl_vieworderpage_csof_order_no);
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_csof_order_no.getText().replaceAll("\\s",""));
									  //compare_filed_values_with_expected(lbl_vieworderpage_order_type.getText(),"Standalone HSI","Order Type");
									  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_order_type.getText().replaceAll("\\s",""));
									 // compare_filed_values_with_expected(lbl_vieworderpage_version.getText(),"1","Version");
									  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_version.getText().replaceAll("\\s",""));
									
									  //compare_filed_values_with_expected(lbl_vieworderpage_action.getText(),"ADD","Action"); 
									  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_action.getText().replaceAll("\\s",""));
									  if(btn_order_search_results_tab.isCurrentlyVisible()){
										  jsClick(btn_order_search_results_tab);
									  if(validate_actiontype_order_Search_page().contains("Fail")){
										  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, "Fail-Action value is wrongly updated");
									  }
									  }
									  //compare_filed_values_with_expected(lbl_vieworderpage_order_created_date.getText(),"2017-03-16","Oder Created Date");
									  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_order_created_date.getText().replaceAll("\\s",""));
									  //compare_filed_values_with_expected(lbl_vieworderpage_due_date.getText(),"2017-04-06","Due Date");
									  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_due_date.getText().replaceAll("\\s",""));
									  //compare_filed_values_with_expected(lbl_vieworderpage_order_status.getText(),"COMPLETED","Order Status");
									  gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_order_status.getText().replaceAll("\\s",""));
									  
									  
									  break; 
									  
		case "Customer Details Section": column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Customer Type");
										//compare_filed_values_with_expected(lbl_vieworderpage_cust_sec_customer_type.getText(),"CUSTOMER","Customer Type");
		 								gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_cust_sec_customer_type.getText().replaceAll("\\s",""));
										 //compare_filed_values_with_expected(lbl_vieworderpage_cust_sec_subscriber.getText(),"BEGINNINGS, NEW","Subscriber");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_cust_sec_subscriber.getText().replaceAll("\\s",""));
										 if(lbl_vieworderpage_cust_sec_BAN.getText().replaceAll("\\s","").equals(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","Ban")).replaceAll("\\s",""))){
											 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, "Pass");
										 } else {
											 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, "Fail-Ban value is not matching with Excel");
										 }
										 
										 
										 break;
										 
		case "Contact Details Section": column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Type");
										//compare_filed_values_with_expected(lbl_vieworderpage_cont_sec_type.getText(),"CUSTOMER","Type in contact section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_cont_sec_type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_cont_sec_Name.getText(),"CUSTOMER","Name in contact section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_cont_sec_Name.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_cont_sec_Phone.getText(),"4232796584","Phone in contact section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_cont_sec_Phone.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_cont_sec_Email.getText(),"CUSTOMER","Email in contact section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_cont_sec_Email.getText().replaceAll("\\s",""));
										break;
			
		case "Location Details Section": column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"SWC");
										//compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_SWC.getText(),"CUSTOMER","SWC in Location section");
											if(lbl_vieworderpage_locn_sec_SWC.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_SWC.getText().replaceAll("\\s","");
											}
		 								 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_Location.getText(),"CUSTOMER","Location in Location section");
		 								if(lbl_vieworderpage_locn_sec_Location.getText().replaceAll("\\s","").isEmpty()){
											Validation="Fail- No data is displayed";
										} else {
											Validation=lbl_vieworderpage_locn_sec_Location.getText().replaceAll("\\s","");
										}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_LATA.getText(),"CUSTOMER","LATA in Location section");
										 if(lbl_vieworderpage_locn_sec_LATA.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_LATA.getText().replaceAll("\\s","");
											}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_Jurisdiction.getText(),"CUSTOMER","Jurisdiction in Location section");
										 if(lbl_vieworderpage_locn_sec_Jurisdiction.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_Jurisdiction.getText().replaceAll("\\s","");
											}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_Remarks.getText(),"CUSTOMER","Remarks in Location section");
										 if(lbl_vieworderpage_locn_sec_Remarks.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_Remarks.getText().replaceAll("\\s","");
											}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_Service_Street_Name_Prefix.getText(),"CUSTOMER","Service Street Name Prefix in Location section");
										 if(lbl_vieworderpage_locn_sec_Service_Street_Name_Prefix.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_Service_Street_Name_Prefix.getText().replaceAll("\\s","");
											}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_Service_Street_Name_Suffix.getText(),"CUSTOMER","Service Street Name Suffix in Location section");
										 if(lbl_vieworderpage_locn_sec_Service_Street_Name_Suffix.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_Service_Street_Name_Suffix.getText().replaceAll("\\s","");
											}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 //compare_filed_values_with_expected(lbl_vieworderpage_locn_sec_Location_Designator.getText(),"CUSTOMER","Location Designator in Location section");
										 if(lbl_vieworderpage_locn_sec_Location_Designator.getText().replaceAll("\\s","").isEmpty()){
												Validation="Fail- No data is displayed";
											} else {
												Validation=lbl_vieworderpage_locn_sec_Location_Designator.getText().replaceAll("\\s","");
											}
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, Validation);
										 break;
										 
		case "HSI Service Section" :	column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"HSI Service Id");
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Service_Id.getText(),"1000009567-HSI","Service Id in HSI Sevice section");
		 								gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Service_Name.getText(),"1000009567  ","Service Name in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Service_Name.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Reason_Code.getText(),"NEW","Reason Code in HSI Sevice section"); 
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Reason_Code.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Wire_Maintenance_Plan_Ind.getText(),"N","Wire Maintenance Plan Ind in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Wire_Maintenance_Plan_Ind.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Service_Type.getText(),"HSI","Service Type in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Service_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Service_Action.getText(),"ADD","Service Action in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Service_Action.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Organization_ID.getText(),"embarq","Organization ID in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Organization_ID.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_VoIP_TN.getText()," ","VoIP TN in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_VoIP_TN.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Download_Speed.getText(),"40 Mbps","Download Speed in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Download_Speed.getText());
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Upload_Speed.getText(),"2 Mbps","Upload_Speed in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Upload_Speed.getText());
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Address_Line1.getText(),"405 EGG HUNT CLB","Address Line 1 in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Address_Line1.getText());
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Address_Line2.getText(),"405 EGG HUNT CLB","Address Line 2 in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Address_Line2.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_State.getText(),"NV","State in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_State.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_City.getText(),"HENDERSON","City in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_City.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_HSI_Service_sec_Zip.getText()," ","Zip in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_HSI_Service_sec_Zip.getText().replaceAll("\\s",""));
										break;	
										
		case "IPTV Service Section" : 	if(!lbl_vieworderpage_order_type.getText().contains("Standalone HSI")){
										column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"IPTV Service Id");
										////compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Service_Id.getText(),"1000009567-IPTV","Service Id in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Service_Id.getText().replaceAll("\\s",""));
										////compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Service_Name.getText(),"1000009567  ","Service Name in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Service_Name.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Reason_Code.getText(),"NEW","Reason Code in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id.getText().replaceAll("\\s","")); 
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Reason_Code.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Wire_Maintenance_Plan_Ind.getText(),"N","Wire Maintenance Plan Ind in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Wire_Maintenance_Plan_Ind.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Service_Type.getText(),"IPTV","Service Type in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Service_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Service_Action.getText(),"ADD","Service Action in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Service_Action.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Organization_ID.getText(),"embarq","Organization ID in HSI Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Organization_ID.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_VoIP_TN.getText()," ","VoIP TN in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_HD_Stream.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Download_Speed.getText(),"40 Mbps","Download Speed in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, "NA");
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Upload_Speed.getText(),"2 Mbps","Upload_Speed in IPTV Sevice section");
										// gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", 62, lbl_vieworderpage_IPTV_Service_sec_Upload_Speed.getText());
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Address_Line1.getText(),"405 EGG HUNT CLB","Address Line 1 in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Address_Line1.getText());
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Address_Line2.getText(),"405 EGG HUNT CLB","Address Line 2 in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Address_Line2.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_State.getText(),"NV","State in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_State.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_City.getText(),"HENDERSON","City in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_City.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_IPTV_Service_sec_Zip.getText()," ","Zip in IPTV Sevice section");
										 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_IPTV_Service_sec_Zip.getText().replaceAll("\\s",""));
										} else {
											slf4jLogger.info("Only HSI is present");
											int j=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"IPTV Service Id");
											for(int i=0;i<15;i++){
												 gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", j, "Not applicable");
												 j++;
											}
											
										}
										break;
										
		case "Dispatch Details Section": column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Appointment_Start_Date");
										//compare_filed_values_with_expected(lbl_vieworderpage_Disptach_sec_Appointment_Start_Date.getText(),"04/06/2017","Appointment_Start_Date in Dispatch section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Disptach_sec_Appointment_Start_Date.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Disptach_sec_Appointment_End_Date.getText(),"04/06/2017","Appointment_End_Date in Dispatch section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Disptach_sec_Appointment_End_Date.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Disptach_sec_Appointment_Start_Time.getText(),"08:00 AM","Appointment_Start_Time in Dispatch section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Disptach_sec_Appointment_Start_Time.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Disptach_sec_Appointment_End_Time.getText(),"11:59 AM","Appointment_End_Time in Dispatch section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Disptach_sec_Appointment_End_Time.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Disptach_sec_Feature_code.getText(),"7325","Feature_code in Dispatch section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Disptach_sec_Feature_code.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Disptach_sec_Tech_remarks.getText()," ","Tech_remarks in Dispatch section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Disptach_sec_Tech_remarks.getText().replaceAll("\\s",""));
										break;
										
		case "Other Details Section": 	column_count=search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"HSI_GeoCode");
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_GeoCode.getText(),"290030437","HSI_GeoCode in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_GeoCode.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_Address_Verified_Ind.getText(),"Y","HSI_Address_Verified_Ind in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_Address_Verified_Ind.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_CLCID.getText(),"271372","HSI_CLCID in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_CLCID.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_Street_Name.getText(),"EGG HUNT","HSI_Street_Name in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_Street_Name.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_Address_Type.getText(),"S","HSI_Address_Type in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_Address_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_First.getText(),"405","HSI_Street_Nr_First in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_First.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_First_Suffix.getText()," ","HSI_Street_Nr_First_Suffix in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_First_Suffix.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_Last_Suffix.getText()," ","HSI_Street_Nr_Last_Suffix in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_HSI_Street_Nr_Last_Suffix.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_GeoCode.getText()," ","IPTV_GeoCode in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_GeoCode.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_Address_Verified_Ind.getText()," ","IPTV_Address_Verified_Ind in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_Address_Verified_Ind.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_CLCID.getText()," ","IPTV_CLCID in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_CLCID.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_Street_Name.getText()," ","IPTV_Street_Name in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_Street_Name.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_Address_Type.getText()," ","IPTV_Address_Type in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_Address_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_First.getText()," ","IPTV_Street_Nr_First in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_First.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_First_Suffix.getText()," ","IPTV_Street_Nr_First_Suffix in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_First_Suffix.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_Last_Suffix.getText()," ","IPTV_Street_Nr_Last_Suffix in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_IPTV_Street_Nr_Last_Suffix.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Customer_Category.getText()," ","Customer_Category in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Customer_Category.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Customer_Type.getText()," ","Customer_Type in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Customer_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Customer_Sub_Type.getText()," ","Customer_Sub_Type in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Customer_Sub_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Account_Sub_type.getText()," ","Account_Sub_type in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Account_Sub_type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Received_Date.getText(),"2017-04-02","Received_Date in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Received_Date.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Sent_Date.getText(),"2017-03-16","Sent_Date in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Sent_Date.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Sent_Time.getText(),"15:40:29","Sent_Time in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Sent_Time.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Transaction_Type.getText(),"HSI_PROV","Transaction_Type in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Transaction_Type.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Object_ID.getText(),"0140149459700922072042#1","Object_ID in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Object_ID.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_DTN.getText(),"1000009567","DTN in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_DTN.getText().replaceAll("\\s",""));
										//compare_filed_values_with_expected(lbl_vieworderpage_Other_details_sec_Provision_Remarks.getText()," ","Provision_Remarks in Other Details section");
										gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", column_count++, lbl_vieworderpage_Other_details_sec_Provision_Remarks.getText().replaceAll("\\s",""));
										break;
		
										
		}
		
	//	gfast_Automation_status_update("GFast-Sheet","GFast_OrderView360");
		//gfast_Automation_status_update_NA("GFast-Sheet","GFast_OrderView360");
	}
	
	public void avail_action_section_orderpage() throws Throwable{
		actionfieldvalidation();
		
	}
	
	public void ServiceID_clickable_details_section_orderpage(String servicetype) throws Throwable{
		switch(servicetype){
					case "HSI":waitForElementclickable(lbl_vieworderpage_HSI_Service_sec_Service_Id);
								
					case "IPTV": if(!lbl_vieworderpage_order_type.getText().contains("Standalone HSI")){
									waitForElementclickable(lbl_vieworderpage_IPTV_Service_sec_Service_Id);
									} else {
										slf4jLogger.info("Only HSI is present");
									}
									break;
		}
	}
	
	public void support_icons_related_tabs() throws Throwable{		
		
		String Validation_status=null;
		
		String tab_name=tab_selected_360viewpage.getText();
		slf4jLogger.info("Validation of supporting icons in "+tab_name+" Tab");
		
		switch(tab_name){
		case "BAM Report": 
		
		case "Contacts":
							
		case "Services":  
								
		case "Tasks": 
						
		case "Circuits": 
		
		case "Service Areas":
		
		case "Locations": 
		
		case "Orders": 
			
		case "TIRKS":
			
		case "VLAN / Virtual Ports":
		
		case "Subscribers":  realted_tab_services_icon_validation(tab_name); break; 
		
		case "Device Ports": related_tab_device_port_buttons_validations();break;
		
		case "Devices": if(btn_vieworderpage_related_tab_device_refresh.isCurrentlyEnabled()){
			slf4jLogger.info("refresh is enabled for="+tab_name+" Tab");
			Validation_status="Refresh enabled";
			//order_RT_support_icon_write(tab_name,"Refresh enabled");
			//search_type_sheet()
			} else {
				slf4jLogger.info("Refresh is not enabled");
				Validation_status="Refresh is not enabled";
				//order_RT_support_icon_write(tab_name,"Refresh is not enabled");
			} 
		 if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			 gfast_sheet_seperation(tab_name,Validation_status);
		 }
		
				break;
		
		}
	}
	
	public void	realted_tab_services_icon_validation(String tab_name) throws Throwable{	
		
		String Validation_status="Pass";
		
		if(btn_related_tab_configcol_icon.isCurrentlyVisible()){
		 if(btn_related_tab_configcol_icon.isCurrentlyEnabled()){
									slf4jLogger.info("Configure Column icon is enabled");
									} 
		} else {
			slf4jLogger.info("Configure Column icon is not enabled in Services");
			Validation_status="Configuration column icon is not present: ";
		}
		
		if(btn_related_tab_excel_icon.isCurrentlyVisible()){
			if(btn_related_tab_excel_icon.isCurrentlyEnabled()){
				slf4jLogger.info("Excel icon is enabled");
				} 
		} else {
			slf4jLogger.info("Excel icon is not enabled");
			Validation_status=Validation_status+"Excel icon is not present: ";
		}
		
		
		if(btn_related_tab_refresh_icon.isCurrentlyVisible()){
			if(btn_related_tab_refresh_icon.isCurrentlyEnabled()){
				slf4jLogger.info("Refresh icon is enabled");
				} 
		} else {
			slf4jLogger.info("Refresh icon is not enabled");
			Validation_status=Validation_status+"Refresh icon is not present: ";
		} 
		
			
		if(btn_related_tab_print_icon.isCurrentlyVisible()){
			if(btn_related_tab_print_icon.isCurrentlyEnabled()){
				slf4jLogger.info("Print icon is enabled ");
				} 
		} else {
			slf4jLogger.info("Print icon is not enabled");
			Validation_status=Validation_status+"Print icon is not present: ";
		} 	
		if(btn_order_tab_search_view_page.isCurrentlyVisible()){
		  if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			  gfast_sheet_seperation(tab_name,Validation_status);
		  }
		}
		
					
	}
	
	public void gfast_sheet_seperation(String tab_name,String Validation_status) throws Throwable{
	slf4jLogger.info("Sheet name:"+search_type_sheet());
	switch(search_type_sheet()){
	
	case "GFast_OrderViewRT": order_RT_support_icon_write(tab_name,Validation_status); break;
		
	case "GFast_DeviceViewRT": Device_RT_support_icon_write(tab_name,Validation_status); break;
		
	case "GFast_ServiceViewRT":  Service_RT_support_icon_write(tab_name,Validation_status); break;
	}
	}
	
		public void	Service_RT_support_icon_write(String tab_name,String Validation_status) throws Throwable{
			int column_count = 0;
			String sheetname=fileiotest.readFile("Sheet_name").replaceAll("\\s","");
				switch(tab_name){
				
				
				case "BAM Report": column_count=search_hearder_excel(sheetname,"BAM Related Tab"); column_count++; break;
				//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
				
				
				case "Services"://  gfast_write_data_inexcel("GFast-Sheet",sheetname, 53, Validation_status); break;
					column_count=search_hearder_excel(sheetname,"Services Related Tab"); column_count++; break;
										
				case "Tasks":  column_count=search_hearder_excel(sheetname,"Tasks Related Tab");column_count++;  break;
				//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
					
				case "Circuits": column_count=search_hearder_excel(sheetname,"Circuits Related Tab");column_count++; break;
					
					
					
				case "TIRKS": column_count=search_hearder_excel(sheetname,"TIRKS Related Tab");column_count++; break;
				
				
				
				case "Devices": column_count=search_hearder_excel(sheetname,"Devices Related Tab"); column_count++; slf4jLogger.info("Device column:"+column_count); break;
				//				gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
				
				case "Locations": column_count=search_hearder_excel(sheetname,"Locations Related Tab");column_count++; break;
								//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
				
				case "Orders": column_count=search_hearder_excel(sheetname,"Order Related Tab");column_count++; break;
						//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
				
				case "Subscribers": column_count=search_hearder_excel(sheetname,"Subscribers Related Tab");column_count++; break;
					//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
				
				case "Service Areas":column_count=search_hearder_excel(sheetname,"Service Area Related Tab"); column_count++; break;
				 		//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); break;
		
				case "VLAN / Virtual Ports":column_count=search_hearder_excel(sheetname,"Virtual Ports Related Tab"); column_count++; break;
	 					//	gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status);
				}
				
					gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); 
				
				
			}
	
	public void	Device_RT_support_icon_write(String tab_name,String Validation_status) throws Throwable{
		
		int column_count = 0;
		String sheetname=fileiotest.readFile("Sheet_name").replaceAll("\\s","");
		
		switch(tab_name){
		
		case "BAM Report": column_count=search_hearder_excel(sheetname,"BAM Related Tab"); column_count++; break;
		
		
		case "Services":  column_count=search_hearder_excel(sheetname,"Services Related Tab"); column_count++; break;
								
		case "Tasks": column_count=search_hearder_excel(sheetname,"Tasks Related Tab");column_count++;  break;
			
		case "Circuits": column_count=search_hearder_excel(sheetname,"Circuits Related Tab");column_count++; break;
			
		case "TIRKS": column_count=search_hearder_excel(sheetname,"TIRKS Related Tab");column_count++; break;
		
		case "Device Ports": column_count=search_hearder_excel(sheetname,"Device Ports Related Tab");column_count++; break;
		
		case "Locations": column_count=search_hearder_excel(sheetname,"Locations Related Tab");column_count++; break;
		
		case "Orders": column_count=search_hearder_excel(sheetname,"Order Related Tab");column_count++; break;
		
		case "Subscribers": column_count=search_hearder_excel(sheetname,"Subscribers Related Tab");column_count++; break;
		
		case "Contacts": column_count=search_hearder_excel(sheetname,"Contact Related Tab");column_count++; break;
		}
		
		gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); 
		
	}
	
	public void	order_RT_support_icon_write(String tab_name,String Validation_status) throws Throwable{
		int column_count=0;
		String sheetname=fileiotest.readFile("Sheet_name").replaceAll("\\s","");
		
		switch(tab_name){
		case "BAM Report": column_count=search_hearder_excel(sheetname,"BAM Related Tab"); column_count++; break;
		
							
		case "Services": column_count=search_hearder_excel(sheetname,"Services Related Tab"); column_count++; break;
								
		case "Tasks": column_count=search_hearder_excel(sheetname,"Tasks Related Tab"); column_count++; break;
			
		case "Devices": column_count=search_hearder_excel(sheetname,"Devices Related Tab"); column_count++; break;
			
		case "TIRKS": column_count=search_hearder_excel(sheetname,"TIRKS Related Tab"); column_count++; break;
			
		}
		
		gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status); 
		//gfast_write_data_inexcel("GFast-Sheet","GFast_OrderView360", 102, lbl_vieworderpage_Other_details_sec_Provision_Remarks.getText());
	}
	
	public String search_type_sheet(){
		
		if(btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){
			return "GFast_OrderViewRT";
		} else if(tab_Active_HSI_service_tab.isCurrentlyVisible()){
			return "GFast_ServiceViewRT";
		} else return "GFast_DeviceViewRT";
			
		
		
		
	}
	
	/*public void	realted_tab_orders_icon_validation(String icons) throws Throwable{
		switch(icons){
		
		case "Excel":if(btn_serach_device_related_tab_order_excel.isCurrentlyVisible() && btn_serach_device_related_tab_order_excel.isCurrentlyEnabled()){
							slf4jLogger.info("Excel icon is enabled for Orders");
						} else {
							slf4jLogger.info("Excel icon is disbaled for Orders");
						} break;

		case "Refresh": if(btn_serach_device_related_tab_order_refresh.isCurrentlyVisible() && btn_serach_device_related_tab_order_refresh.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Orders");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Orders");
						} break;
		
		case "Print": if(btn_serach_device_related_tab_order_print.isCurrentlyVisible() && btn_serach_device_related_tab_order_print.isCurrentlyEnabled()){
							slf4jLogger.info("Print icon is enabled for Orders");
						} else {
							slf4jLogger.info("Print icon is disbaled for Orders");
						} break;						
		
		}
		
		}
	public void	related_tab_locations_validations(String icons)  throws Throwable{
		switch(icons){
		
		case "Excel":if(btn_serach_device_related_tab_locatin_excel.isCurrentlyVisible() && btn_serach_device_related_tab_locatin_excel.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Location");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Circuit");
						} break;
		
		case "Refresh": if(btn_serach_device_related_tab_locatin_refresh.isCurrentlyVisible() && btn_serach_device_related_tab_locatin_refresh.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Locations");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Locations");
						} break;
		
		case "Print": if(btn_serach_device_related_tab_locatin_print.isCurrentlyVisible() && btn_serach_device_related_tab_locatin_print.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Locations");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Locations");
						} break;
				
		}
	}*/
	
	public void related_tab_device_port_buttons_validations() throws Throwable{
		String validation=null;
		 if(btn_serach_device_related_tab_device_port_bulk_card_swap.isCurrentlyVisible() && btn_serach_device_related_tab_device_port_bulk_card_swap.isCurrentlyEnabled()){
																						slf4jLogger.info("device_port_bulk_card_update button is enabled in Device ports");
																						validation= "Pass";
																					} else {
																						slf4jLogger.info("device_port_bulk_card_update button is not enabled in Device ports");
																						validation= "Fail";
																					}
																					
																					if(btn_serach_device_related_tab_device_port_bulk_Port_update.isCurrentlyVisible() && btn_serach_device_related_tab_device_port_bulk_Port_update.isCurrentlyEnabled()){
																						slf4jLogger.info("bulk_Port_update button is enabled in Device ports");
																						validation= "Pass";
																					} else {
																						slf4jLogger.info("bulk_Port_update button is not enabled in Device ports");
																						validation= "Fail";
																					}
																					
																					if(btn_serach_device_related_tab_device_port_Add_Shelf.isCurrentlyVisible() && btn_serach_device_related_tab_device_port_Add_Shelf.isCurrentlyEnabled()){
																						slf4jLogger.info("Add_Shelf button is enabled in Device ports");
																						validation= "Pass";
																					} else {
																						slf4jLogger.info("Add_Shelf button is not enabled in Device ports");
																						validation= "Fail";
																					}
																					
																					if(btn_serach_device_related_tab_device_port_Groom_UNI.isCurrentlyVisible() && btn_serach_device_related_tab_device_port_Groom_UNI.isCurrentlyEnabled()){
																						slf4jLogger.info("Groom_UNI button is enabled in Device ports");
																						validation= "Pass";
																					} else {
																						slf4jLogger.info("Groom_UNI button is not enabled in Device ports");
																						validation= "Fail";
																					}		
																					if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
																						Device_RT_support_icon_write("Device Ports",validation);
																					}
																					
	}
	
/*	public void circuit_icons_validations(String icons) throws Throwable{
		switch(icons){
		case "Refresh":if(btn_vieworderpage_related_tab_circuit_refresh_icon.isCurrentlyVisible() && btn_vieworderpage_related_tab_circuit_refresh_icon.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Circuit");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Circuit");
						} break;
						
		case "Excel": if(btn_vieworderpage_related_tab_circuit_excel_icon.isCurrentlyVisible() && btn_vieworderpage_related_tab_circuit_excel_icon.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Circuit");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Circuit");
						} break;
		
		case "Print": if(btn_vieworderpage_related_tab_circuit_print_icon.isCurrentlyVisible() && btn_vieworderpage_related_tab_circuit_print_icon.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled for Circuit");
						} else {
							slf4jLogger.info("Refresh icon is disbaled for Circuit");
						} break;
			
		}
	}
	
	public void BAM_report_related_tab_validation(String icons) throws Throwable{
		switch(icons){
		case "Refresh": if(btn_vieworderpage_related_tab_BAM_Refresh.isCurrentlyVisible() && btn_vieworderpage_related_tab_BAM_Refresh.isCurrentlyEnabled()){
							slf4jLogger.info("Refresh icon is enabled");
						} else {
							slf4jLogger.info("Refresh icon is disbaled");
						} break;
		case "Excel": if(btn_vieworderpage_related_tab_BAM_Excel.isCurrentlyVisible() && btn_vieworderpage_related_tab_BAM_Excel.isCurrentlyEnabled()){
							slf4jLogger.info("Excel icon is enabled");
						} else {
							slf4jLogger.info("Excel icon is disbaled");
						} break;
		case "Print": if(btn_vieworderpage_related_tab_BAM_Print.isCurrentlyVisible() && btn_vieworderpage_related_tab_BAM_Print.isCurrentlyEnabled()){
							slf4jLogger.info("Print icon is enabled");
						} else {
							slf4jLogger.info("Print icon is disbaled");
						} break;
		case "Configure Column": if(btn_vieworderpage_related_tab_BAM_Configcol.isCurrentlyVisible() && btn_vieworderpage_related_tab_BAM_Configcol.isCurrentlyEnabled()){
									slf4jLogger.info("Configure Column icon is enabled");
								} else {
									slf4jLogger.info("Configure Column icon is disbaled");
								} break;
			
		}
		
	}*/
	
	public void validate_related_tab_viewpage(String relatedtab_values) throws Throwable{
		switch(relatedtab_values){
				case "OLT & DSLAM role devices": validate_olt_dslam_role_devices_related_tab(); break;
				case "Services": validate_services_related(); break;
				case "Tasks": validate_task_related(); break;
				case "Subscribers": validate_subscribers_related_tab(); break;
				case "Service Areas":validate_service_area_related_tab();break;
				case "Tirks": validate_Tirks_related_tab(); break;
				case "Performance details": validate_performance_related_tab_validations(); break;
				case "Virtual Ports": validate_Virtual_ports_related_tab_validations(); break;
				case "Associated Services": validate_Associated_service_related_tab_validations("FTT"); break;
		}
	}
	
	public void validate_Associated_service_related_tab_validations(String type) throws Throwable{
		String sheetname=null;int column_count=0;
		
		int i=1,Service_Name_column=0,Subscriber_name_column=0,Service_type_column=0,Usage_type_column=0,MCO_column=0,Delete_column=0;
		String Validation_status=null, delete_validation=null, service_name_hyperlink_validation=null;
		
		String Service_Name=null,Subscriber_name=null,Service_type=null,Usage_type=null,MCO=null;
		
		String[] Association_service_header={"SERVICENAME", "SubscriberName", "ServiceTYPE", "USAGETYPE", "MCO", "DELETE"};
		
		switch(type){
		case "FTT":if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
							//sheetname=sheetname=fileiotest.readFile("Sheet_name").replaceAll("\\s","");
							column_count=search_hearder_excel(sheetname,"SERVICE NAME");
						}
							
						if(lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							slf4jLogger.info("Fail- Getting this error message: "+lbl_alert_message_no_data_related_tabs.getText());
							if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
								for(i=0;i<5;i++){
									gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status);				
								column_count++;				
								}
								gfast_Automation_status_update("GFast-Sheet",sheetname);
							}
							throw new Error("Fail- Getting this error message: "+lbl_alert_message_no_data_related_tabs.getText());
						}break;
		
		case "Validation": 	if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			
			
			
							}break;
		
		
		
		}
		
		
		jsClick(btn_expandbutton_left);
		
		waitForElement(btn_related_tab_excel_icon);
		i=1;
		while(i!=0){
			switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
			case "SERVICENAME":Service_Name_column=i; break;
			case "SubscriberName":Subscriber_name_column=i; break;
			case "ServiceTYPE":Service_type_column=i; break;
			case "USAGETYPE":Usage_type_column=i; break;
			case "MCO":MCO_column=i; break;
			case "DELETE":Delete_column=i; break;
			}
			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","").equals(Association_service_header[i-1])){
				slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
			} else {
				slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
			}
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span"))){
				slf4jLogger.info("Not visible");
				break;
			}
					
		}
		
		i=1;
		while(i!=0){
			
			if(!loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Delete_column+"]//input")).isEnabled()){
				delete_validation="Pass";
			} else {
				delete_validation="Fail- Delete button is enabled without clicking on edit";
			}
			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]//a")).isEnabled()){
				service_name_hyperlink_validation="Pass";
			} else {
				service_name_hyperlink_validation="Fail- Service name is not hyperlinked";
			}
			
			if(Service_Name==null){
				Service_Name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]")).getText();
				Subscriber_name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Subscriber_name_column+"]")).getText();
				Service_type=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_type_column+"]")).getText();
				Usage_type=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Usage_type_column+"]")).getText();
				MCO=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+MCO_column+"]")).getText();
			
			} else {
				Service_Name+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]")).getText());
				Subscriber_name+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Subscriber_name_column+"]")).getText());
				Service_type+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_type_column+"]")).getText());
				Usage_type+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Usage_type_column+"]")).getText());
				MCO+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+MCO_column+"]")).getText());
			
			}
			
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]//a"))){
				slf4jLogger.info("Not visible");
				break;
			}
			
		}
		
		slf4jLogger.info("Service Name hyperlink status:"+service_name_hyperlink_validation);
		slf4jLogger.info("Service Name:"+Service_Name);
		slf4jLogger.info("Subscriber name:"+Subscriber_name);
		slf4jLogger.info("Service Type:"+Service_type);
		slf4jLogger.info("Usage Type"+Usage_type);
		slf4jLogger.info("MCO"+MCO);
		slf4jLogger.info("Delete Button Status: "+delete_validation);
		
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			
			if(service_name_hyperlink_validation.equals("Pass")){
			gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,Service_Name );
			} else {
				gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,service_name_hyperlink_validation );	
			}
			column_count++;
			
			gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,Subscriber_name );
			column_count++;
			
			gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,Service_type );
			column_count++;
			
			gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,Usage_type );
			column_count++;
			
			gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,MCO );
			column_count++;
			
			gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count,delete_validation );			
			gfast_Automation_status_update("GFast-Sheet",sheetname);
			
		}
		
		if(!service_name_hyperlink_validation.equals("Pass") || !delete_validation.equals("Pass")){
			throw new Error("Service name/ Delete button are not hyperlinked");
		}
		
		
		
	}
	
	public void validate_Virtual_ports_related_tab_validations() throws Throwable{
		String sheetname=null;int column_count=0;
		int i=1,Name_column=0,Function_column=0,NumberType_column=0,ProvisioningStatus_column=0;
				@SuppressWarnings("unused")
				int Owner_column=0,Alias1_column=0,Alias2_column=0,Service_column=0,Circuit_column=0,DeviceCLLI_column=0,DSLOVC_column=0,view_colummn=0;
		String Validation_status=null;
		//String Name_value=null, Function_value=null,NumberType_value=null,ProvisioningStatus_value=null,Owner_value=null,Alias1_value=null,Alias2_value=null,Service_value=null,Circuit_value=null,DeviceCLLI_value=null,DSLOVC_value=null;
		String[] service_area_table_header={"View","Name","Function","NumberType","ProvisioningStatus","Owner","Alias1","Alias2","Service","Circuit","DeviceCLLI","DSLOVC"};
		
		
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			sheetname=search_type_sheet();
			column_count=search_hearder_excel(sheetname,"CE-VLAN NAME(HSI Details Tab- Associated VLAN Segment Section)");
			slf4jLogger.info("Sheet Name:"+sheetname);
			slf4jLogger.info("Column count:"+column_count);
		}
		
		if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			
			slf4jLogger.info("Able to see Virtual ports");
			/*btn_expandbutton_left);
			waitForElement(btn_related_tab_refresh_icon);
			Thread.sleep(1000);*/
			jsClick(btn_related_tab_refresh_icon);
			waitForElement(btn_related_tab_excel_icon);
			i=1;
			while(i!=0){
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'columntableserviceVLANGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
				case "Name":Name_column=i; break;
				case "Function":Function_column=i; break;
				case "NumberType": NumberType_column=i; break;
				case "ProvisioningStatus": ProvisioningStatus_column=i; break;		
				case "View":view_colummn=i; break;				
				case "Owner":Owner_column=i; break;
				case "Alias1":Alias1_column=i; break;
				case "Alias2":Alias2_column=i; break;
				case "Service":Service_column=i; break;
				case "Circuit":Circuit_column=i; break;
				case "DeviceCLLI":DeviceCLLI_column=i; break;
				case "DSLOVC":DSLOVC_column=i; break;
				case "DSLOVC_column":DSLOVC_column=i; break;
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'columntableserviceVLANGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","").equals(service_area_table_header[i-1])){
					slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'columntableserviceVLANGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				} else {
					slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'columntableserviceVLANGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'columntableserviceVLANGrid')]/div["+i+"]/div/div[1]/span"))){
					slf4jLogger.info("Not visible");
					break;
				}
				//slf4jLogger.info("Position:"+i);
			}
			
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			i=1;
			while(i!=0){
				
				gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'contenttableserviceVLANGrid')]/div["+i+"]/div["+Name_column+"]/div")).getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'contenttableserviceVLANGrid')]/div["+i+"]/div["+Function_column+"]/div")).getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'contenttableserviceVLANGrid')]/div["+i+"]/div["+NumberType_column+"]/div")).getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'contenttableserviceVLANGrid')]/div["+i+"]/div["+ProvisioningStatus_column+"]/div")).getText());				
				column_count++;
				
				
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='numberSearchController']//*[contains(@id,'contenttableserviceVLANGrid')]/div["+i+"]/div["+Name_column+"]/div"))){
					slf4jLogger.info("Not visible");
					break;
				}
				column_count++;
			}
			}
		
		Validation_status="Pass";
		
		jsClick(btn_expandbutton_right);
		waitForElement(btn_expandbutton_left);
		} else {
			
			Validation_status="Fail-"+lbl_alert_message_no_data_related_tabs.getText();
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				for(i=0;i<7;i++){
					if(column_count!=3){
						gfast_write_data_inexcel("GFast-Sheet",sheetname, column_count, Validation_status);
					}
					column_count++;
				}
				
			}
			
		}
		if(Validation_status.contains("Fail")){
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				gfast_Automation_status_update("GFast-Sheet",sheetname);
			}
			throw new Error(Validation_status);
		} else {
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				gfast_Automation_status_update("GFast-Sheet",sheetname);
			}
		}
			
			
	}
	
	public void validate_performance_related_tab_validations() throws Throwable{
		String sheetname=null;int column_count=0;
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			sheetname=search_type_sheet();
			column_count=search_hearder_excel(sheetname,"Performance Related Tab");
		}
		if(!lbl_alert_message_no_data_Performance_related_tabs.isCurrentlyVisible()){
			slf4jLogger.info("Performance details are Displayed");
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Pass");
				gfast_Automation_status_update("GFast-Sheet", sheetname);
			}
		} else 
		{
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail- Getting this message:"+lbl_alert_message_no_data_Performance_related_tabs.getText());
				gfast_Automation_status_update("GFast-Sheet", sheetname);
			}
			throw new Error("No Data seen in this tab Getting Message as : "+lbl_alert_message_no_data_Performance_related_tabs.getText());
		}
			
	}
	
	public void validate_Tirks_related_tab() throws Throwable{
		String Validation_Status=null;
		String sheetname=search_type_sheet();
		int column_count=0;
	 if(lbl_alert_message_no_data_tirks_CLOlist.isCurrentlyVisible()){ 
			Validation_Status="Fail-Getting message as "+lbl_alert_message_no_data_tirks_CLOlist.getText()+" on the Orders Related Tab";
			slf4jLogger.info(lbl_alert_message_no_data_tirks_CLOlist.getText()+" :Message is displayed");
			}
			else if(lbl_alert_message_no_data_tirks_CD.isCurrentlyVisible()){ 
			
				Validation_Status="Fail-Getting message as "+lbl_alert_message_no_data_tirks_CD.getText();
				slf4jLogger.info(lbl_alert_message_no_data_tirks_CD.getText()+" :Message is displayed");
			} else {
				Validation_Status="Pass";
			}
		
		if(Validation_Status.contains("Fail")){
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				column_count=search_hearder_excel(sheetname,"TIRKS Related Tab");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Validation_Status);
				/*column_count=search_hearder_excel(sheetname,"TIRKS Validation");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Validation_Status);*/
				gfast_Automation_status_update("GFast-Sheet", sheetname);
			} 
			
			throw new Error("Fail- "+Validation_Status);
			
			
		} else {
			if(Validation_Status.equals("Pass")){
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				column_count=search_hearder_excel(sheetname,"TIRKS Related Tab");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Validation_Status);
				column_count=search_hearder_excel(sheetname,"TIRKS Validation");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Validation_Status);
				gfast_Automation_status_update("GFast-Sheet", sheetname);
			}
			slf4jLogger.info("Passed able to see Tirks data");
		}
		}
		slf4jLogger.info("Validations status on Tirks Tab"+Validation_Status);
	}
	
	public void validate_service_area_related_tab() throws Throwable{
		
		int i=1,service_area_name_column=0,device_name_column=0,device_location_column=0,view_column=0;
		int column_count;
		String servicearea_value=null, devicename_value=null,devicelocn_value=null,view_validation=null;
		String[] service_area_table_header={"View","ServiceAreaName","DeviceName","DeviceLocation"};
		
		if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){			
	
		while(i!=0){
			switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
			case "ServiceAreaName":service_area_name_column=i; break;
			case "DeviceName": device_name_column=i; break;
			case "DeviceLocation": device_location_column=i; break;		
			case "View":view_column=i; break;	
			}
			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").equals(service_area_table_header[i-1])){
				slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
			} else {
				slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
			}
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span"))){
				slf4jLogger.info("Not visible");
				break;
			}
			
		}
		
		slf4jLogger.info(service_area_name_column+"=ServiceAreaName "+device_name_column+"=DeviceName "+device_location_column+"=DeviceLocation");
		i=1;
		
		while(i!=0){
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+view_column+"]")).isEnabled()){
				view_validation="Pass";
			}
			
			if(servicearea_value==null){
				servicearea_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_area_name_column+"]")).getText().replaceAll("\\s","");
				devicename_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+device_name_column+"]")).getText().replaceAll("\\s","");
				devicelocn_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+device_location_column+"]")).getText();
			} else {
				servicearea_value+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_area_name_column+"]")).getText().replaceAll("\\s",""));
				devicename_value+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+device_name_column+"]")).getText().replaceAll("\\s",""));
				devicelocn_value+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+device_location_column+"]")).getText());
			}
			
			/*if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_area_name_column+"]")).getText().replaceAll("\\s","").equals("GFASTEGGHUNT")){
				
				slf4jLogger.info("Service Area Name is matching");
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+device_name_column+"]")).getText().replaceAll("\\s","").equals("GFASTEGGHUN-T.01")){
					slf4jLogger.info("Subscriber ID is matching");
				}else {
					slf4jLogger.info("Subscriber ID is not matching");
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+device_location_column+"]")).getText().equals("1001 EASTER N VEGAS ST, HENDERSON, NV 89120, USA")){
					slf4jLogger.info("Subscriber Type is matching");
					
				}else {
					slf4jLogger.info("Subscriber Type is not matching");
				}				
				
				break;
			} else {
				slf4jLogger.info("Service Area Name is not matching"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_area_name_column+"]")).getText().replaceAll("\\s",""));
			}*/
			
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='serviceAreaSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]"))){
				slf4jLogger.info("End of Value search");
				break;
			}
		}
		
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			column_count=search_hearder_excel(search_type_sheet(),"Service Area Related Tab");
			column_count+=2;
			gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, view_validation);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, servicearea_value);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, devicename_value);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, devicelocn_value);
			gfast_Automation_status_update("GFast-Sheet", search_type_sheet());
		}
		slf4jLogger.info("Able to see Service Areas");;
	
		} else {
			
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				column_count=search_hearder_excel(search_type_sheet(),"Service Area Related Tab");
				column_count+=2;
				gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, "Fail- No data is displayed getting this message:"+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, "Fail- No data is displayed getting this message:"+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, "Fail- No data is displayed getting this message:"+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", search_type_sheet(), column_count, "Fail- No data is displayed getting this message:"+lbl_alert_message_no_data_related_tabs.getText());
				gfast_Automation_status_update("GFast-Sheet", search_type_sheet());
			}
			
			
			throw new Error("No data is displayed getting this message: "+lbl_alert_message_no_data_related_tabs.getText());
		}
		
		
		
	}
	
	
	public void validate_subscribers_related_tab() throws Throwable{
	
		int i=1,subscriber_name_column=0,subscriber_id_column=0,subscriber_type_column=0,subscriber_subtype_column=0,view_column=0,EnterpriseAccountID_column=0,ACNA_column=0,ProvisioningStatus_column=0;
		
		//String Subscriber_name=null;
		String[] subscriber_table_header={"View","SubscriberName","EnterpriseAccountID","ACNA/CCNA","SubscriberID","Type","Subtype","ProvisioningStatus"};
		
		String sheetname=search_type_sheet();
		
		String SubscriberName=null, EnterpriseAccountID=null, ACNA=null, SubscriberID=null, Type=null,Subtype=null,ProvisioningStatus=null,viewstatus=null;
		int column_count=search_hearder_excel(search_type_sheet(),"Subscriber Name");
		
		String[] impacted_subscriber_table_header={"Port","DTN","ServiceType","ServiceID","CustomerName","PONCircuit","CVLAN","SVLAN","CustomerID","AddressLine1","AddressLine2","City","State"};
		
		String Portname=null,DTNname=null,ServiceTypename=null,ServiceIDname=null,CustomerNamename=null,PONCircuitname=null,CVLANname=null,SVLANname=null,CustomerIDname=null,AddressLine1name=null,AddressLine2name=null,Cityname=null,Statename=null;
		
		int Portname_column=0,DTNname_column=0,ServiceTypename_column=0,ServiceIDname_column=0,CustomerNamename_column=0,PONCircuitname_column=0,CVLANname_column=0,SVLANname_column=0,CustomerIDname_column=0,AddressLine1name_column=0,AddressLine2name_column=0,Cityname_column=0,Statename_column=0;
		
		if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			
			jsClick(btn_expandbutton_left);
			
		if(tab_ActiveRelatedatb_subActivetab.getText().equals("Subscriber Details")){
			
		
		while(i!=0){
			switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='columntablegenericSubscriberGrid']/div["+i+"]//span")).getText().replaceAll("\\s","")){
			case "SubscriberName":subscriber_name_column=i; break;
			case "SubscriberID": subscriber_id_column=i; break;
			case "Type": subscriber_type_column=i; break;
			case "Subtype": subscriber_subtype_column=i; break;		
			case "View":view_column=i; break;	
			case "EnterpriseAccountID":EnterpriseAccountID_column=i; break;	
			case "ACNA/CCNA":ACNA_column=i; break;	
			case "ProvisioningStatus":ProvisioningStatus_column=i; break;	
			}
			
			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='columntablegenericSubscriberGrid']/div["+i+"]//span")).getText().replaceAll("\\s","").equals(subscriber_table_header[i-1])){
				slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='columntablegenericSubscriberGrid']/div["+i+"]//span")).getText().replaceAll("\\s",""));
			} else {
				slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='columntablegenericSubscriberGrid']/div["+i+"]//span")).getText().replaceAll("\\s",""));
			}
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='columntablegenericSubscriberGrid']/div["+i+"]//span"))){
				slf4jLogger.info("Not visible");
				break;
			}
		}
		
		slf4jLogger.info(subscriber_name_column+"=SubscriberName "+subscriber_id_column+"=SubscriberID "+subscriber_type_column+"=Type"+subscriber_subtype_column+"=Subtype");
		i=1;
		
		while(i!=0){
			/*if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_name_column+"]")).getText().replaceAll("\\s","").equals("BEGINNINGS,NEW")){
				
				slf4jLogger.info("Subscriber Name is matching");
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_id_column+"]")).getText().replaceAll("\\s","").equals("A007393")){
					slf4jLogger.info("Subscriber ID is matching");
				}else {
					slf4jLogger.info("Subscriber ID is not matching");
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_type_column+"]")).getText().replaceAll("\\s","").equals("EXTERNAL")){
					slf4jLogger.info("Subscriber Type is matching");
					
				}else {
					slf4jLogger.info("Subscriber Type is not matching");
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_subtype_column+"]")).getText().replaceAll("\\s","").equals("RETAIL")){
					
					slf4jLogger.info("Subscriber Subtype is matching");
				}else {
					slf4jLogger.info("Subscriber Subtype is not matching");
				}
				
				break;
			} else {
				slf4jLogger.info("Subscriber name is not matching"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_name_column+"]")).getText().replaceAll("\\s",""));
			}*/			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+view_column+"]")).isEnabled()){
				viewstatus="Pass";
			if(SubscriberName==null){
				SubscriberName=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_name_column+"]")).getText();
				EnterpriseAccountID=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+EnterpriseAccountID_column+"]")).getText();
				ACNA=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+ACNA_column+"]")).getText();
				SubscriberID=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_id_column+"]")).getText();
				Type=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_type_column+"]")).getText();
				Subtype=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_subtype_column+"]")).getText();
				ProvisioningStatus=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+ProvisioningStatus_column+"]")).getText();
				
			} else {
				SubscriberName+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_name_column+"]")).getText());
				EnterpriseAccountID+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+EnterpriseAccountID_column+"]")).getText());
				ACNA+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+ACNA_column+"]")).getText());
				SubscriberID+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_id_column+"]")).getText());
				Type+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_type_column+"]")).getText());
				Subtype+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_subtype_column+"]")).getText());
				ProvisioningStatus+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+ProvisioningStatus_column+"]")).getText());
			}
			}
			
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_name_column+"]"))){
				slf4jLogger.info("End of Value search");
				break;
			}
		}
		
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			column_count--;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, viewstatus);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, SubscriberName);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, EnterpriseAccountID);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, ACNA);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, SubscriberID);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Type);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Subtype);
			column_count++;
			gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, ProvisioningStatus);
			
		}
		
		} else if(tab_ActiveRelatedatb_subActivetab.getText().equals("Impacted Subscribers")){
			
			while(i!=0){
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
				case "Port":Portname_column=i; break;
				case "DTN": DTNname_column=i; break;
				case "ServiceType": ServiceTypename_column=i; break;
				case "ServiceID": ServiceIDname_column=i; break;		
				case "CustomerName":CustomerNamename_column=i; break;	
				case "PONCircuit":PONCircuitname_column=i; break;	
				case "CVLAN":CVLANname_column=i; break;	
				case "SVLAN":SVLANname_column=i; break;	
				case "CustomerID":CustomerIDname_column=i; break;	
				case "AddressLine1":AddressLine1name_column=i; break;	
				case "AddressLine2":AddressLine2name_column=i; break;	
				case "City":Cityname_column=i; break;	
				case "State":Statename_column=i; break;					
				}
				
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").equals(impacted_subscriber_table_header[i-1])){
					slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
				} else {
					slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span"))){
					slf4jLogger.info("Not visible");
					break;
				}
			}
			
		//	slf4jLogger.info(subscriber_name_column+"=SubscriberName "+subscriber_id_column+"=SubscriberID "+subscriber_type_column+"=Type"+subscriber_subtype_column+"=Subtype");
			
			i=1;
			
			while(i!=0){
				
				if(Portname==null){
					Portname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Portname_column+"]/div")).getText();
					DTNname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+DTNname_column+"]/div")).getText();
					ServiceTypename=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ServiceTypename_column+"]/div")).getText();
					ServiceIDname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ServiceIDname_column+"]/div")).getText();
					CustomerNamename=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CustomerNamename_column+"]/div")).getText();
					PONCircuitname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+PONCircuitname_column+"]/div")).getText();					
					CVLANname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CVLANname_column+"]/div")).getText();
					SVLANname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+SVLANname_column+"]/div")).getText();
					CustomerIDname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CustomerIDname_column+"]/div")).getText();
					AddressLine1name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+AddressLine1name_column+"]/div")).getText();
					
					AddressLine2name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+AddressLine2name_column+"]/div")).getText();
					Cityname=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Cityname_column+"]/div")).getText();
					Statename=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Statename_column+"]/div")).getText();
					
				} else {
					Portname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Portname_column+"]/div")).getText());
					DTNname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+DTNname_column+"]/div")).getText());
					ServiceTypename+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ServiceTypename_column+"]/div")).getText());
					ServiceIDname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ServiceIDname_column+"]/div")).getText());
					CustomerNamename+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CustomerNamename_column+"]/div")).getText());
					PONCircuitname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+PONCircuitname_column+"]/div")).getText());					
					CVLANname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CVLANname_column+"]/div")).getText());
					SVLANname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+SVLANname_column+"]/div")).getText());
					CustomerIDname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CustomerIDname_column+"]/div")).getText());
					AddressLine1name+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+AddressLine1name_column+"]/div")).getText());
					
					AddressLine2name+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+AddressLine2name_column+"]/div")).getText());
					Cityname+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Cityname_column+"]/div")).getText());
					Statename+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='deviceImpactedSubscriberCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Statename_column+"]/div")).getText());
				}
				
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='genericSubscriberGrid']//*[@id='contenttablegenericSubscriberGrid']/div["+i+"]/div["+subscriber_name_column+"]"))){
					slf4jLogger.info("End of Value search");
					break;
				}
				
			}
			
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				column_count=search_hearder_excel(search_type_sheet(),"Port Name");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Portname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, DTNname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, ServiceTypename);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, ServiceIDname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, CustomerNamename);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, PONCircuitname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, CVLANname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, SVLANname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, CustomerIDname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, AddressLine1name);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, AddressLine2name);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Cityname);
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Statename);
			}
		}
		
		
		} else {
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				
				column_count--;
				for(int k=0;k<8;k++){
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail- Getting message as:"+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
				}
			}
		}
		
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			gfast_Automation_status_update("GFast-Sheet", sheetname);
		}
		
		
		jsClick(btn_expandbutton_right);
		waitForElement(btn_expandbutton_left);
	
	}
	
	public String to_check_value_isempty(String valvalue){
		if(valvalue.isEmpty() || valvalue.length()<1){
			return "";
		}
		return ":"+"\n"+valvalue;
	}
	
	
	public void validate_task_related() throws Throwable{
		String Validation_Status="Pass";
		String sheetname=search_type_sheet();
		int column_count=0;
		String Task_names=null,Task_status=null;
		
		if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
		
		
		
			jsClick(btn_expandbutton_left);
		waitForElement(btn_related_tab_configcol_icon);
		@SuppressWarnings("unused")
		String task_header,task_name,task_status;
		int task_status_column=0,task_name_column=0,task_csof_id=0;
		waitForElement(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'columntabletaskGrid')]")));
		 int i=3;
		 while(i!=0){
			task_header=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'columntabletaskGrid')]/div["+i+"]/div/div[1]/span")).getText();
			//slf4jLogger.info(task_header+":In-Position:"+i);
			switch(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'columntabletaskGrid')]/div["+i+"]/div/div[1]/span")).getText()){
			
			case "CSOF Order ID": task_csof_id=i; break;
			case "Task Status": task_status_column=i; break;
			case "Task Name": task_name_column=i;	break;
			}
			
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'columntabletaskGrid')]/div["+i+"]/div/div[1]/span"))){
				slf4jLogger.info("End of Field search");
				break;
			}
			
		}
		int j=0;
		int k=1;
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			slf4jLogger.info("Gfast Data is displayed");
			slf4jLogger.info("CSOF Order ID:"+task_csof_id);
			slf4jLogger.info("Task Status:"+task_status_column);
			slf4jLogger.info("Task Name:"+task_name_column);
			
			while(k!=0){
				slf4jLogger.info("CSOF ID Displayed:"+loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_csof_id+"]/div")).getText()+"In psition:"+k);
				if(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_csof_id+"]")).getText().contains(gfast_order_id_search())){
					slf4jLogger.info("Entered the task Loop");
					
					/*if(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_status_column+"]")).getText().contains("Open")){
						Task_names=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText()+": Fail-Task is Still in Open State";
						Task_status=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_status_column+"]")).getText();
						
					}*/
					
					
					if(Task_names!=null){
						
						if(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_status_column+"]")).getText().contains("Open")){
							Task_names=Task_names+to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText())+": Fail-Task is Still in Open State";
							Validation_Status+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText())+": Fail-Task is Still in Open State";
						} else {
							Task_names=Task_names+to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText());
						}
						
						
						Task_status=Task_status+to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_status_column+"]")).getText());
					} else {
						
						if(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_status_column+"]")).getText().contains("Open")){
							Task_names=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText()+": Fail-Task is Still in Open State";
							Validation_Status=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText())+": Fail-Task is Still in Open State";
						}  else {
							Task_names=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_name_column+"]")).getText();
						}						
						
						Task_status=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_status_column+"]")).getText();
					}
					slf4jLogger.info("Task Names="+Task_names);
					slf4jLogger.info("Task Status="+Task_status);
					
				}
					k++;
					
					if(!loginPage.isElementVisible(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+k+"]/div["+task_csof_id+"]/div"))){
						slf4jLogger.info("End of Field search");
						break;
					
					}
				
			}
				
					slf4jLogger.info("Final count Task Names="+Task_names);
					slf4jLogger.info("Final count Task Status="+Task_status);
				
					
						column_count=search_hearder_excel(sheetname,"CSOF Order ID");
						
						
						if(Task_names!=null){
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Pass");
						column_count++;
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Task_names);
						column_count++;
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, Task_status);
						column_count++;
					
						gfast_Automation_status_update("GFast-Sheet", sheetname);
						} else throw new Error("Not getting the value");
						
						if(Validation_Status.contains("Fail")){
							jsClick(btn_expandbutton_right);
							waitForElement(btn_expandbutton_left);
							throw new Error(Validation_Status);
						}
			
		} else {
		
			i=3;
		while(i!=0){
			
			
			
			task_name=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+i+"]/div["+task_name_column+"]")).getText();
			//slf4jLogger.info("Value of Task name is="+task_name+"=Value");
			task_status=loginPage.getDriver().findElement(By.xpath(".//div[@class='tab-pane ng-scope active']//*[contains(@id,'contenttabletaskGrid')]/div["+i+"]/div["+task_status_column+"]")).getText();
			/*if(task_name==" "){
				slf4jLogger.info("Broke");
				break;
			}*/
			slf4jLogger.info(task_name+"=Task name & Status="+task_status);
			
			j=i+1;
			if(!loginPage.isElementVisible(By.xpath(".//div[@class='tab-pane ng-scope active']//*[@ng-click='gridSettings.viewTaskDetailDsp("+j+")']/div["+task_name_column+"]"))){
				slf4jLogger.info("End of Task");
				break;
			}
			
			/*if(!loginPage.getDriver().findElement(By.xpath(".//*[contains(@id,'contenttabletaskGrid')]/div["+j+"]/div["+task_name_column+"]")).getText().isEmpty()){
				slf4jLogger.info("End of Task");
				break;
			}*/
				
			
		}
		
		}
		
		
		jsClick(btn_expandbutton_right);
		waitForElement(btn_expandbutton_left);
		
		}
		else {
			
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				column_count=search_hearder_excel(sheetname,"CSOF Order ID");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail-No Data is displayed getting message as "+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail-No Data is displayed getting message as "+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail-No Data is displayed getting message as "+lbl_alert_message_no_data_related_tabs.getText());
				column_count++;
			
				gfast_Automation_status_update("GFast-Sheet", sheetname);
			} 
			throw new Error("No Task details are displayed getting messgae as "+lbl_alert_message_no_data_related_tabs.getText());
			
		}
		
	}
	
	public void validate_services_related() throws Throwable{
		//String[] service_header={""
		String hsi_service=null;
		String IPTV_service=null;
		int i=1,service_name=0,service_type=0,cust_name=0;
		@SuppressWarnings("unused")
		String Validation_Status_HSI=null,Validation_Status_IPTV=null;
		String sheetname=search_type_sheet();slf4jLogger.info("Sheet Name:"+sheetname);
		@SuppressWarnings("unused")
		int column_count=0,HSI_pos=0,IPTV_pos=0;
		
		if(!lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
			
			slf4jLogger.info("HSI Service Page is not visible");
			
			if(btn_order_tab_search_view_page.isCurrentlyVisible()){
				
				String device_tab=loginPage.getDriver().findElement(By.xpath(".//*[@class='ng-isolate-scope active']//*[@draggable='true']//tab-heading")).getText().replaceAll("\\s","");
				slf4jLogger.info("Device Tab name:"+device_tab);
				
				jsClick(btn_order_tab_search_view_page);
				
				waitForElement(btn_dispatch);
				
				hsi_service=lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
				slf4jLogger.info("Order view page HSI service"+hsi_service);
				
				
				if(lbl_vieworderpage_IPTV_Service_sec_Service_Id.isCurrentlyVisible() || !lbl_vieworderpage_order_type.getText().contains("Standalone HSI")){
					IPTV_service=lbl_vieworderpage_IPTV_Service_sec_Service_Id.getText().replaceAll("\\s","");
					
					slf4jLogger.info("Order view page IPTV service"+IPTV_service);
					
				}
				
				jsClick(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+device_tab+"')]")));
				waitForElement(btn_expandbutton_right);
				
				jsClick(btn_expandbutton_left);
				waitForElement(btn_expandbutton_right);
				
				
				//*********************************** Search For Header ************************************************************************//
				while(i!=0){
					
					slf4jLogger.info("Service Header:pos("+i+")="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				
					switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
							case "Name":service_name=i; break;
							case "ServiceType":service_type=i; break;
							case "CustomerName":cust_name=i; break;
						}
				
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span"))){
					//slf4jLogger.info("End of Field search");
					break;
				}
				}
				slf4jLogger.info("service_Name="+service_name);
				slf4jLogger.info("ServiceType="+service_type);
				slf4jLogger.info("CustomerName="+cust_name);
				
				
				//************************************ Search for the value *****************************************************************//
				
				i=1;
				while(i!=0){
					
					slf4jLogger.info("Service Name :pos("+i+")="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+service_name+"]/div")).getText().replaceAll("\\s",""));
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+service_name+"]/div")).getText().replaceAll("\\s","").contains(hsi_service)){
						slf4jLogger.info("Found HSI Service="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+service_name+"]/div")).getText().replaceAll("\\s",""));			
						Validation_Status_HSI="Pass";
						HSI_pos=i;
						if(IPTV_service==null){
							break;
						}
					} else {
						Validation_Status_HSI="Fail";
					}					
					
					
					if(IPTV_service!=null){
						
						slf4jLogger.info("IPTV Service is present");
						if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+(i+1)+"]/div["+service_name+"]/div")).getText().replaceAll("\\s","").contains(IPTV_service)){
							slf4jLogger.info("Found IPTV Service="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+(i+1)+"]/div["+service_name+"]/div")).getText().replaceAll("\\s",""));			
							Validation_Status_IPTV="Pass";
							IPTV_pos=i+1;
							break;
						} else {
							Validation_Status_IPTV="Fail";
						}				
						
					}
					
					
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+service_name+"]/div"))){
						slf4jLogger.info("End of Value search");
						break;
					}
					
				}
				
				/*if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
					column_count=search_hearder_excel(sheetname,"HSI Service Name");
					if(!Validation_Status_HSI.equals("Fail")){
						
						
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+HSI_pos+"]/div["+service_name+"]/div")).getText());
						
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+HSI_pos+"]/div["+service_type+"]/div")).getText());
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+HSI_pos+"]/div["+cust_name+"]/div")).getText());
						
						
					} else {
						for(int j=0;i<6;i++){
							gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail- Wrong/Invalid Service's are Displayed");
							column_count++;
						}
					}
					
					if(IPTV_service!=null){
						column_count=search_hearder_excel(sheetname,"IPTV Service Name");
						if(!Validation_Status_IPTV.equals("Fail")){
							
							gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+(IPTV_pos)+"]/div["+service_name+"]/div")).getText());
							
							gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+(IPTV_pos)+"]/div["+service_type+"]/div")).getText());
							gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div["+(IPTV_pos)+"]/div["+cust_name+"]/div")).getText());
							
							
						} 
						
					}
				}*/
				
				
			}
			
			jsClick(btn_expandbutton_right);
			waitForElement(btn_expandbutton_left);
			} else {
		
	
		hsi_service=lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
		slf4jLogger.info("Order view page HSI service"+hsi_service);
		
		String hsi_service_value_related_tab=loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='subscriberAssServiceResultsCtrl']//*[contains(text(),'"+hsi_service+"')]")).getText();
		slf4jLogger.info("Related page HSI service"+hsi_service_value_related_tab);
		
		compare_filed_values_with_expected(hsi_service,hsi_service_value_related_tab,"Services are matching with the view page & related tab");
		
		if(!lbl_vieworderpage_order_type.getText().contains("Standalone HSI")){
			IPTV_service=lbl_vieworderpage_IPTV_Service_sec_Service_Id.getText().replaceAll("\\s","");
			
			slf4jLogger.info("Order view page IPTV service"+IPTV_service);
			
			String IPTV_service_value_related_tab=loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='subscriberAssServiceResultsCtrl']//*[contains(text(),'"+IPTV_service+"')]")).getText();
			slf4jLogger.info("Related page IPTV service"+IPTV_service_value_related_tab);
			
			compare_filed_values_with_expected(IPTV_service,IPTV_service_value_related_tab,"IPTV Services are matching with the view page & related tab");
			
		}
		
		
		//*********************************** Search For Header ************************************************************************//
		while(i!=0){
			slf4jLogger.info("Service Header:pos("+i+")="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
		switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
		case "Name":service_name=i; break;
		case "ServiceType":service_type=i; break;
		case "CustomerName":cust_name=i; break;
		}
		
		i++;
		if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span"))){
			slf4jLogger.info("End of Field search");
			break;
		}
		}
		slf4jLogger.info("service_Name="+service_name);
		slf4jLogger.info("ServiceType="+service_type);
		slf4jLogger.info("CustomerName="+cust_name);
		//************************************ Search for the value *****************************************************************//
		
		i=1;
		while(i!=0){
			
			slf4jLogger.info("Service Name :pos("+i+")="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name+"]/div")).getText().replaceAll("\\s",""));
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name+"]/div")).getText().replaceAll("\\s","").contains(hsi_service)){
				slf4jLogger.info("Found HSI Service="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name+"]/div")).getText().replaceAll("\\s",""));			
				Validation_Status_HSI="Pass";
			} else {
				Validation_Status_HSI="Fail";
			}
			
			
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
				column_count=search_hearder_excel(sheetname,"HSI Service Name");
				if(!Validation_Status_HSI.equals("Fail")){
					
					
					gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name+"]/div")).getText());
					
					gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_type+"]/div")).getText());
					gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+cust_name+"]/div")).getText());
					
					
				}
						
				
			
			if(IPTV_service!=null){
				i++;
				slf4jLogger.info("IPTV Service is present");
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+(i)+"]/div["+service_name+"]/div")).getText().replaceAll("\\s","").contains(IPTV_service)){
					slf4jLogger.info("Found IPTV Service="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+(i)+"]/div["+service_name+"]/div")).getText().replaceAll("\\s",""));			
					Validation_Status_HSI="Pass";
				} else {
					Validation_Status_HSI="Fail";
				}
				
				if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
					column_count=search_hearder_excel(sheetname,"IPTV Service Name");
					if(!Validation_Status_HSI.equals("Fail")){
						
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+(i)+"]/div["+service_name+"]/div")).getText());
						
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+(i)+"]/div["+service_type+"]/div")).getText());
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+(i)+"]/div["+cust_name+"]/div")).getText());
						
						
					} 
				}
				
			}
			}
			
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name+"]/div"))){
				slf4jLogger.info("End of Value search");
				break;
			}
			
		}
			}
		
		if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			gfast_Automation_status_update("GFast-Sheet", sheetname);
		}
		
	}
	
	

	
	
		public void validate_olt_dslam_role_devices_related_tab() throws Throwable{
			String sheetname=search_type_sheet();
			String DSLAM_Check=null;
			int column_count=0;
			//String ValidationStatus=null;
			
			
			
			if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
				
				
			
			String device=related_tab_device_section_validation();
			String[] devicedetails=device.split("'");
			
			
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){		
				
			if(!lbl_RT_GFAST_DSLAM_Device_type.isCurrentlyVisible()){
				column_count=search_hearder_excel(sheetname,"OLT Device");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, devicedetails[0]);
				gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[1]);
				gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[2]);
			} else {
				column_count=search_hearder_excel(sheetname,"DSLAM Device");
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, devicedetails[0]);
				gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[1]);
				gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[2]);
				DSLAM_Check="Pass";
			}
			
			
			}
			
			slf4jLogger.info("Done with Device One validation");
			
			if(lbl_vieworderpage_related_tab_non_active_tab_device.isCurrentlyVisible()){
				jsClick(lbl_vieworderpage_related_tab_non_active_tab_device);
				waitForElement(lbl_vieworderpage_related_tab_active_device_name_hyperlink);
				device=related_tab_device_section_validation();
				devicedetails=device.split("'");
				if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
					
					
				if(lbl_RT_GFAST_DSLAM_Device_type.isCurrentlyVisible()){
					column_count=search_hearder_excel(sheetname,"DSLAM Device");
					gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, devicedetails[0]);
					gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[1]);
					gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[2]);
					DSLAM_Check="Pass";
				} else 
					if(DSLAM_Check==null){
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail- GFast Dslam device is not present");
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, "Fail- GFast Dslam device is not present");
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, "Fail- GFast Dslam device is not present");
						DSLAM_Check="Fail";
					} else {
						column_count=search_hearder_excel(sheetname,"OLT Device");
						gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, devicedetails[0]);
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[1]);
						gfast_write_data_inexcel("GFast-Sheet", sheetname, ++column_count, devicedetails[2]);
					}
				
				}
				slf4jLogger.info("Validated Device two section as well");
			}
			
			if(btn_vieworderpage_related_tab_device_refresh.isCurrentlyVisible() && btn_vieworderpage_related_tab_device_refresh.isCurrentlyEnabled()){
				slf4jLogger.info("Device Refresh button is enabled");
			}
			
		} else if(!lbl_vieworderpage_order_status.getText().contains("COMPLETED")){
			column_count=search_hearder_excel(sheetname,"OLT Device");
			for(int i=0;i<6;i++){
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count++, lbl_alert_message_no_data_related_tabs.getText()+"-As expected since Order status:"+lbl_vieworderpage_order_status.getText());
			}
			
		} else {
			column_count=search_hearder_excel(sheetname,"OLT Device");
			for(int i=0;i<6;i++){
				gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count++, "Fail");
			}
		}
			if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search()))){
			gfast_Automation_status_update("GFast-Sheet", sheetname);
			if(DSLAM_Check.equals("Fail")){
				throw new Error("No DSlam Device present");
			}
			}
			}

		//@SuppressWarnings("null")
		 
		public String related_tab_device_section_validation() throws Throwable{
			if(lbl_vieworderpage_related_tab_active_tab_devicename.getText().replaceAll("\\s","").contains(lbl_vieworderpage_related_tab_active_device_name_hyperlink.getText().replaceAll("\\s",""))){
				slf4jLogger.info(lbl_vieworderpage_related_tab_active_tab_devicename.getText()+"=Tab name is matching Device name="+lbl_vieworderpage_related_tab_active_device_name_hyperlink.getText());
			} else {
				slf4jLogger.info(lbl_vieworderpage_related_tab_active_tab_devicename.getText()+"=Tab name is not matching Device name="+lbl_vieworderpage_related_tab_active_device_name_hyperlink.getText());
			}
			
			if(lbl_vieworderpage_related_tab_active_device_name_hyperlink.isCurrentlyEnabled()){
				slf4jLogger.info("Device hyperlink in enabled");
			}
			
			String[] device_full_name=lbl_vieworderpage_related_tab_active_device_fullname.getText().split("-");
			String device_role=device_full_name[device_full_name.length-1].replaceAll("\\s","");
			
			String[] device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().split("\\\"");
			
			for(int i=0;i<device_network_role.length;i++){
				if(device_role.equals(device_network_role[i].replaceAll("\\s",""))){
					slf4jLogger.info(device_role+"=Matches with the role="+device_network_role[i].replaceAll("\\s",""));
					break;
				} 
			}
			
			String devicename = null;
			
			devicename=lbl_vieworderpage_related_tab_active_device_name_hyperlink.getText().replaceAll("\\s","");
			if(lbl_vieworderpage_related_tab_active_device_Provision_status.getText().isEmpty()){
				devicename=devicename+"'"+"Provision Status is not displayed";
			} else {
				devicename=devicename+"'"+lbl_vieworderpage_related_tab_active_device_Provision_status.getText();
			}
			
			if(lbl_vieworderpage_related_tab_active_device_Functinal_status.getText().isEmpty()){
				devicename=devicename+"'"+"Functional Status is not displayed";
			} else {
				devicename=devicename+"'"+lbl_vieworderpage_related_tab_active_device_Functinal_status.getText();
			}
			
			
			
			//compare_filed_values_with_expected(lbl_vieworderpage_related_tab_active_device_Provision_status.getText(),"In Service","Provision_status");
			//compare_filed_values_with_expected(lbl_vieworderpage_related_tab_active_device_Functinal_status.getText(),"Monitored","Functinal_status");
			
			slf4jLogger.info(devicename);
			return devicename;
			/*if(device_role.contains(lbl_vieworderpage_related_tab_active_device_networkrole.getText().replaceAll("\\s",""))){
				slf4jLogger.info(device_role+"=Device role is present in="+lbl_vieworderpage_related_tab_active_device_networkrole.getText());
			} else {
				slf4jLogger.info(device_role+"=Device role not present in="+lbl_vieworderpage_related_tab_active_device_networkrole.getText());
			} */
 		} 
		


	public void	serach_Device_related_tab_based_on_role(String ntwrole) throws Throwable{
		
		switch(ntwrole){
		case "DSLAM": if(btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){
			
							if(lbl_vieworderpage_related_tab_active_tab_devicename.isCurrentlyVisible()){
								//String device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().replaceAll("[]\"", "").replace("\"", "");
								String[] device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().split("\\\"");
								slf4jLogger.info(device_network_role[1].replaceAll("\\s",""));
								
								if(ntwrole.equals((device_network_role[1].replaceAll("\\s",""))) && lbl_RT_GFAST_DSLAM_Device_type.isCurrentlyVisible()){
									slf4jLogger.info("Found the specific role:"+ntwrole);		
									
									} else if(lbl_vieworderpage_related_tab_non_active_tab_device.isCurrentlyVisible()){
										jsClick(lbl_vieworderpage_related_tab_non_active_tab_device);
												waitForElement(lbl_vieworderpage_related_tab_active_device_name_hyperlink);
												device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().split("\\\"");
												slf4jLogger.info(device_network_role[1].replaceAll("\\s",""));
												if(ntwrole.equals(device_network_role[1].replaceAll("\\s","")) && lbl_RT_GFAST_DSLAM_Device_type.isCurrentlyVisible()){
													slf4jLogger.info("Found the specific role"+ntwrole);		
												}				
											}
							}
					} else  if(devcreatepage.tab_serach_device_Device_details.isCurrentlyVisible()){
						
						slf4jLogger.info("Device Tab is Displayed"+ntwrole);
					} else throw new Error("Invalid role is diplayed");
					
					slf4jLogger.info("Existed from the Role check");break;
					

		case "DSLAM/OLT": if(lbl_vieworderpage_related_tab_active_tab_devicename.isCurrentlyVisible()){
							Thread.sleep(5000);
							//String device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().replaceAll("[]\"", "").replace("\"", "");
							String[] device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().split("\\\"");
							slf4jLogger.info(device_network_role[1].replaceAll("\\s",""));
							
							if("DSLAM".equals((device_network_role[1].replaceAll("\\s","")))){
								slf4jLogger.info("Found the specific role:"+ntwrole);		
								
								} else if(lbl_vieworderpage_related_tab_non_active_tab_device.isCurrentlyVisible()){
									jsClick(lbl_vieworderpage_related_tab_non_active_tab_device);
											waitForElement(lbl_vieworderpage_related_tab_active_device_name_hyperlink);
											device_network_role=lbl_vieworderpage_related_tab_active_device_networkrole.getText().split("\\\"");
											slf4jLogger.info(device_network_role[1].replaceAll("\\s",""));
											if(ntwrole.equals(device_network_role[1].replaceAll("\\s","")) && lbl_RT_GFAST_DSLAM_Device_type.isCurrentlyVisible()){
												slf4jLogger.info("Found the specific role"+ntwrole);		
											}				
										}
						}
							break;
						}

		
		
	}
	
	public void	click_Device_related_tab_device_hyperlink()throws Throwable{
		slf4jLogger.info("Checking for Hyperlink in Order Related Tab");
		if(devcreatepage.tab_serach_device_Device_details.isCurrentlyVisible()){
			slf4jLogger.info("Already Displayed");
		} else 
		if(!devcreatepage.btn_Edit.isCurrentlyVisible()){
			
		waitForElement(lbl_vieworderpage_related_tab_active_device_name_hyperlink);
		String device_name=lbl_vieworderpage_related_tab_active_device_name_hyperlink.getText().replaceAll("\\s","");
		jsClick(lbl_vieworderpage_related_tab_active_device_name_hyperlink);
		waitForElement(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+device_name+"')]")));
		waitForElement(devcreatepage.btn_Edit);
		}		
	}
	
	
	
	public void order_search_page_service_hyperlink(String hyperlinkType) throws Throwable{
		//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
		switch(hyperlinkType){
		case "HSI Service":
			
			
			break;
		case "HSI": //waitForElement(lbl_vieworderpage_HSI_Service_sec_Service_Id);	
			waitForElement(btn_dispatch);
			Thread.sleep(5000);
			if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
				@SuppressWarnings("unused")
				String hsi_service=lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
				slf4jLogger.info(lbl_vieworderpage_HSI_Service_sec_Service_Id.getText());
				jsClick(lbl_vieworderpage_HSI_Service_sec_Service_Id);
			} else {
				/*tab_services);
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='subscriber_loader']")));
				  3*/
				int i=2;
				while(i!=0){
					jsClick(tab_order_advance_search_result);
					
					jsClick(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
					waitForElement(btn_dispatch);
					if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
						jsClick(lbl_vieworderpage_HSI_Service_sec_Service_Id);
						break;
					}
					slf4jLogger.info("Didnt find the link");
					i++;
				}
				
				
			}
					
					//waitForElement(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+hsi_service+"')]"))); 
					waitForElement(btn_editservicepage);
					break;
					
		case "IPTV": //waitForElement(lbl_vieworderpage_IPTV_Service_sec_Service_Id);	
			waitForElement(btn_dispatch);
			Thread.sleep(5000);
			if(lbl_vieworderpage_IPTV_Service_sec_Service_Id.isCurrentlyVisible()){
				@SuppressWarnings("unused")
				String IPTV_service=lbl_vieworderpage_IPTV_Service_sec_Service_Id.getText().replaceAll("\\s","");
				slf4jLogger.info(lbl_vieworderpage_IPTV_Service_sec_Service_Id.getText());
				jsClick(lbl_vieworderpage_IPTV_Service_sec_Service_Id);
			} else {
				/*tab_services);
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='subscriber_loader']")));
				  3*/
				int i=2;
				while(i!=0){
					jsClick(tab_order_advance_search_result);
					
					jsClick(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
					waitForElement(btn_dispatch);
					if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
						jsClick(lbl_vieworderpage_IPTV_Service_sec_Service_Id);
						break;
					}
					i++;
				}
				
				
			}
					
					//waitForElement(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+IPTV_service+"')]"))); 
					waitForElement(btn_editservicepage);
					break;
					
		case "IPTV-Unicast"://waitForElement(lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id);	
			//waitForElement(btn_dispatch);
			Thread.sleep(5000);
			if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
				@SuppressWarnings("unused")
				String IPTV_Unicast_service=lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id.getText().replaceAll("\\s","");
				slf4jLogger.info(lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id.getText());
				jsClick(lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id);
				//waitForElement(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+IPTV_Unicast_service+"')]")));
			}
							
							else {
								/*tab_services);
								  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='subscriber_loader']")));
								  3*/
								int i=2;
								while(i!=0){
									jsClick(tab_order_advance_search_result);
									
									jsClick(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
									waitForElement(btn_dispatch);
									if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
										jsClick(lbl_vieworderpage_IPTV_Service_sec_Unicast_service_id);
										break;
									}
									i++;
								}
								
								
							}
							waitForElement(btn_editservicepage);
							break;
		}
	/*	waitForElement(lbl_vieworderpage_HSI_Service_sec_Service_Id);	
		String hsi_service=lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
		slf4jLogger.info(lbl_vieworderpage_HSI_Service_sec_Service_Id.getText());
		lbl_vieworderpage_HSI_Service_sec_Service_Id);
		waitForElement(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+hsi_service+"')]")));*/
		//waitFor(servicedetailpage.btn_edit_service_viewpage);
		
		
	}
	
	public void search_with_excel_value(String service_section) throws Throwable{
		
		clear_all_the_values_slider();	
		
		switch(service_section){
		
		case "Ensemble Order ID": actvtnpage.tbx_ensembleOrderNumber.sendKeys(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId"))); 
		FileIOTest.writeFile("Ensemble_orderno", gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId")));
		
		break;
		case "Ensemble Order & Customer Name": actvtnpage.tbx_ensembleOrderNumber.sendKeys(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","orderId"))); actvtnpage.tbx_customerName.sendKeys(gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustLastName")).toUpperCase().replaceAll("\\s","")+", "+gfast_get_excel_data_from("GFast-Sheet","GfastTest",search_hearder_excel_gfasttestsheet("GfastTest","CustFirstName")).toUpperCase().replaceAll("\\s","")); break;
		
			
		
		}
	}
	
	public int search_hearder_excel_gfasttestsheet(String sheetname,String validation) throws Throwable{
		excel_access.ExcelReader(Page.envData.getFieldValue("GFast-Sheet"));
		
		 ArrayList<String> headerdata = excel_access.getRowContent(sheetname,0);
		 int col_auto;
		// slf4jLogger.info("Sheetname:"+sheetname);
		// slf4jLogger.info("Header value:"+headerdata);
		 for(col_auto=0;col_auto<headerdata.size();col_auto++){
			 if(headerdata.get(col_auto).equals(validation)){
				// slf4jLogger.info("Automation status header found in:"+col_auto);
				 break;
			 }
		 }
		
		return col_auto;
	}
	
	public int search_hearder_excel(String sheetname,String validation) throws Throwable{
		excel_access.ExcelReader(Page.envData.getFieldValue("GFast-Sheet"));
		
		 ArrayList<String> headerdata = excel_access.getRowContent(sheetname,1);
		 int col_auto;
		// slf4jLogger.info("Sheetname:"+sheetname);
		// slf4jLogger.info("Header value:"+headerdata);
		 for(col_auto=0;col_auto<headerdata.size();col_auto++){
			 if(headerdata.get(col_auto).equals(validation)){
				// slf4jLogger.info("Automation status header found in:"+col_auto);
				 break;
			 }
		 }
		
		return col_auto;
	}
	
	public String gfast_order_id_search() throws Throwable{
		int i;
		//orderpage.gfast_Automation_status_update("GFast-Sheet", fileiotest.readFile("Sheet_name"));
		//slf4jLogger.info("Column:"+search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column"));
		//slf4jLogger.info("Column Contents:"+excel_access.getColumnContent("GFast_BaseSanity", search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")));
		 ArrayList<String> data =excel_access.getColumnContent("GFast_BaseSanity", search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column"));
		//slf4jLogger.info("Column Size:"+excel_access.getColumnContent("GFast_BaseSanity", search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).get(excel_access.getColumnContent("GFast_BaseSanity", search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).size()-1));
		for(i=0;i<data.size();i++){
			 if((data.get(i).length()<1)||(data.get(i).isEmpty())){
				break;
			 }
		 }
		
		
		
		//slf4jLogger.info("Order ID:"+excel_access.getColumnContent("GFast_BaseSanity", search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).get(i-1));
		
		return excel_access.getColumnContent("GFast_BaseSanity", search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).get(i-1);
		
	}
	
	
	public String gfast_Automation_status_update(String excelname,String sheetname) throws Throwable{
		
		excel_access.ExcelReader(Page.envData.getFieldValue(excelname));
		
		int rowNum =0; int comment=0;int Timestamp=0;int col_automationstatus=0;
		
		ArrayList<String> column_data = excel_access.getColumnContent(sheetname,0);
		 slf4jLogger.info("column_data Present:"+column_data);
		
		for(rowNum=0;rowNum<column_data.size();rowNum++){
			 if(column_data.get(rowNum).length()<1){
				 slf4jLogger.info("Row Position:"+(--rowNum));
				 break;
			 }
			 
			// slf4jLogger.info("Column Data in Pos:"+rowNum+"="+column_data.get(rowNum));
		 }
		
		
		
		 
		 int  col_auto=2, validation=0;
		 
		 slf4jLogger.info("Row count="+rowNum);
		 if(sheetname.equals("GFast_BaseSanity")){
			// rowNum--;
			 slf4jLogger.info("GFast Base sanity Data written");
		 }
		 
		 int col_count=excel_access.getRowCellCount(sheetname,rowNum);
		 
		 slf4jLogger.info("Column count="+col_count);
		 
		 
		 ArrayList<String> data = excel_access.getRowContent(sheetname,rowNum);
		 slf4jLogger.info("Data Present:"+data);
		 
		 ArrayList<String> headerdata = excel_access.getRowContent(sheetname,1);
		// slf4jLogger.info("Headerdata Present:"+headerdata);
		  
		 for(col_auto=0;col_auto<headerdata.size();col_auto++){
			 switch(headerdata.get(col_auto)){
			 
			 case "Automation Result": col_automationstatus=col_auto; break;
			 case "TimeStamp":Timestamp=col_auto; break;
			 case "Comment":comment=col_auto; break;
			 
			 }
			 if(headerdata.get(col_auto).contains("Automation Result")){
				 slf4jLogger.info("Automation status header found in:"+col_auto);
				 col_automationstatus=col_auto;
			 }
		 }
		
		
		 
		 for(int i=6;i<data.size();i++){
			 
			if(data.get(i).contains("Fail")){
				 
				 slf4jLogger.info("Failed in section:"+i+" for reason"+data.get(i));
				 gfast_write_data_inexcel(excelname,sheetname, col_automationstatus, "Fail"); 
								 
				 excel_access.setcelldata(excelname, sheetname, rowNum, comment, data.get(i));
				 
				 
				 validation=1;
				 break;
				
			 } 
			 
		 }
		 for(int i=search_hearder_excel(sheetname,"Comment")+2;i<data.size();i++){
			 if((data.get(i).length()<1)||(data.get(i).isEmpty())){
				 gfast_write_data_inexcel(excelname,sheetname, i, "NA");
			 }
		 }
		  
		 
		 if(validation==0){
			 gfast_write_data_inexcel(excelname,sheetname, col_automationstatus, "Pass");
		 }
		 
		 gfast_write_data_inexcel(excelname,sheetname, Timestamp, "'"+Page.getDate("MM-dd-yyyy HH:mm:ss"));
		 return sheetname;		
	}
	
	/*public String gfast_Automation_status_update_NA(String excelname,String sheetname) throws Throwable{
		
		excel_access.ExcelReader(Page.envData.getFieldValue(excelname));
		
		
		// FInd the Row Position
		int rowNum =0;
		
		ArrayList<String> column_data = excel_access.getColumnContent(sheetname,0);
		 slf4jLogger.info("column_data Present:"+column_data);
		
		for(rowNum=0;rowNum<column_data.size();rowNum++){
			 if((column_data.get(rowNum).length()<1) || (column_data.get(rowNum).contains(""))){
				// slf4jLogger.info("Row Position:"+(rowNum));
				 break;
			 }
		 }
		
		 
		// Find the Column Postion
		int col_auto=2;
		
		ArrayList<String> headerdata = excel_access.getRowContent(sheetname,1);
		 
		 for(col_auto=0;col_auto<headerdata.size();col_auto++){
			 if(headerdata.get(col_auto).contains("Automation Result")){
				 //slf4jLogger.info("Automation status header found in:"+col_auto);
				 break;
			 }
		 }
		
		
		 col_auto+=3;
		 
		
		
		 //int rowNum =excel_access.getColumnCellCount(sheetname)-1;
		 
		 //int col_count=excel_access.getRowCellCount(sheetname,rowNum);
		 
		 //slf4jLogger.info("Column count="+col_count);
		 //slf4jLogger.info("Row count="+rowNum);
		 
		 ArrayList<String> data = excel_access.getRowContent(sheetname,rowNum);
		 
		 
		 
		 slf4jLogger.info("Data Present:"+data);
		 
		 for(int i=0;i<data.size();i++){
			 
			if((data.get(i).length()<1) || (data.get(i).contains(""))){
				 
				 gfast_write_data_inexcel(excelname,sheetname, i, "NA");
				 slf4jLogger.info(i+"Position is Blank");
			 }	
			 
		 }
		 
		return sheetname;
		 
	}*/
	
public String gfast_sheet_update(String excelname, String sheetname, String Autostatus,String Commentvalue) throws Throwable{
		
		excel_access.ExcelReader(Page.envData.getFieldValue(excelname));
		
		int rowNum =0; int comment=0;int Timestamp=0;int col_automationstatus=0;
		
		ArrayList<String> column_data = excel_access.getColumnContent(sheetname,0);
		// slf4jLogger.info("column_data Present:"+column_data);
		
		for(rowNum=0;rowNum<column_data.size();rowNum++){
			 if(column_data.get(rowNum).length()<1){
				 --rowNum;
				 //slf4jLogger.info("Row Position:"+(rowNum));
				 break;
			 }
			 
			//slf4jLogger.info("Column Data in Pos:"+rowNum+"="+column_data.get(rowNum));
		 }
		
		
		
		 
		 int col_auto=2;
		 
		 //slf4jLogger.info("Row count="+rowNum);
		 if(sheetname.equals("GFast_BaseSanity")){
			// rowNum--;
			// slf4jLogger.info("GFast Base sanity Data written");
		 }
		 
		// int col_count=excel_access.getRowCellCount(sheetname,rowNum);
		 
		 //slf4jLogger.info("Column count="+col_count);
		 
		 
		 ArrayList<String> data = excel_access.getRowContent(sheetname,rowNum);
		//slf4jLogger.info("Data Present:"+data);
		 
		 ArrayList<String> headerdata = excel_access.getRowContent(sheetname,1);
		 //slf4jLogger.info("Headerdata Present:"+headerdata);
		  
		 for(col_auto=0;col_auto<headerdata.size();col_auto++){
			 switch(headerdata.get(col_auto)){
			 
			 case "Automation Result": col_automationstatus=col_auto; break;
			 case "TimeStamp":Timestamp=col_auto; break;
			 case "Comment":comment=col_auto; break;
			 
			 }
			 if(headerdata.get(col_auto).contains("Automation Result")){
			//	 slf4jLogger.info("Automation status header found in:"+col_auto);
				 col_automationstatus=col_auto;
			 }
		 }
		
		
		 
		
		 		gfast_write_data_inexcel(excelname,sheetname, col_automationstatus, Autostatus);				 
				 excel_access.setcelldata(excelname, sheetname, rowNum, comment, Commentvalue);
				 
		//slf4jLogger.info("Row: "+rowNum+" Column: "+comment);
			 
		  for(int i=6;i<data.size();i++){
			 if((data.get(i).length()<1)||(data.get(i).isEmpty())){
				 gfast_write_data_inexcel(excelname,sheetname, i, "NA");
			 }
		 }
		  
		 
		
			
		 
		 
		 gfast_write_data_inexcel(excelname,sheetname, Timestamp, "'"+Page.getDate("MM-dd-yyyy HH:mm:ss"));
		 return sheetname;		
	}
	
	public String gfast_get_excel_data_from(String excelname,String sheetname,int column) throws Throwable{
		excel_access.ExcelReader(Page.envData.getFieldValue(excelname));
		//slf4jLogger.info(excel_access+"Excel Share path");
		
		 //String GDB_Sheet = Page.envData.getFieldValue("GFast-Sheet");
		 //FileInputStream file = new FileInputStream(new File(GDB_Sheet));
		 
		 //HSSFWorkbook workbook = new HSSFWorkbook(file);
         
	       //Get first sheet from the workbook
	         //HSSFSheet sheet = workbook.getSheetAt(0);
	                     
	           //int rowNum = sheet.getLastRowNum();
	           
	           int rowNum =excel_access.getColumnCellCount(sheetname)-1;
	           
	          // slf4jLogger.info("ROw:"+rowNum);
	           
	           return(excel_access.getCellData(sheetname, rowNum, column));	 
	}
	
	public void gfast_write_data_inexcel(String excelname,String sheetname, int column, String val2write) throws Throwable{
		
		excel_access.ExcelReader(Page.envData.getFieldValue(excelname));
		//slf4jLogger.info(excel_access+"Excel Share path");
		ArrayList<String> col;
		int row=1,j=1;
		col=excel_access.getColumnContent(sheetname,column);
		//slf4jLogger.info("Size of cole="+col.size());
		j=col.size();
		for(int i=0;i<col.size();i++){
			//slf4jLogger.info("Column Values present in pos:"+i+"="+col.get(i));
			if(col.get(i).length()<1){
				//slf4jLogger.info("Its Blank in POS:"+i);
				j=i;
				break;
			}
		}
		
			
		row=j;
			
			if((val2write.length()<1) || val2write.isEmpty()){
				val2write="No Data is available";
			}
		
		//while(!excel_access.getColumnContent(sheetname,row).isEmpty()){
		
		 
		
		excel_access.setcelldata(excelname,sheetname,row,column,val2write);  
	           
		
		
		
	}
	

	
	
	public void clear_all_the_values_slider() throws Throwable{
		actvtnpage.tbx_orderId.clear();
		actvtnpage.tbx_DTN.clear();
		actvtnpage.tbx_customerName.clear();
		actvtnpage.tbx_ensembleOrderNumber.clear();
	}
		
	public boolean compare_filed_values_with_expected(String fieldvalue,String expectedvalue, String fieldname){
		if(fieldvalue.equals(expectedvalue)){
			slf4jLogger.info(fieldname+" is displayed "+fieldvalue);
			return true;
		} else {
			slf4jLogger.info(fieldname+" is not displayed "+fieldvalue);
			return false;
		}
		
	}
	
	
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}
	
	public WebElement waitForElementclickable(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),300);	
	    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	    
		
	    return element;
	}
	
	public String waitForElementclickable_gfast(WebElement elementToBeLoaded)  throws TimeoutException{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),300);	
	    try {
	    	 wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
	 		
	 	    return "Pass";
	    }
	    catch (TimeoutException e) {
	    	
	 	    return "Fail";
	}
	
	}
	
	public String header_name_search_with_tab_name(String tabname){
		String headername=null;
		
		switch(tabname){
		case "Services": headername="Services Related Tab";break;
		case "Orders": headername="Order Related Tab";break;
		case "Contacts": headername="Contact Related Tab";break;
		case "BAM Report":  headername="BAM Related Tab";break;
		case "Activations": headername=null;break;
		case "Devices": headername="Devices Related Tab";break;
		case "Tasks": headername="Tasks Related Tab";break;
		case "Locations": headername="Locations Related Tab";break;
		case "Circuits": headername="Circuits Related Tab";break;
		case "Subscribers": headername="Subscribers Related Tab";break;
		case "Device Ports": headername="Device Ports Related Tab";break;
		case "Service Areas": headername="Service Area Related Tab";break;
		case "TIRKS": headername="TIRKS Related Tab";break;
		case "Performance": headername="Performance Related Tab";break;
		case "Virtual Ports": headername="Virtual Ports Related Tab";break;
		}
		return headername;
	}
	
	public int header_name_search_with_sheetname_scenario(String scenario, String sheetname){
		int return_value=0;
		if(sheetname.equals("GFast_DeviceViewRT")){
			switch(scenario){
			case "BAM Report Related Tab":return_value=7; break;
			case "Circuits Related Tab": return_value=10; break;
			case "Device Ports Related Tab":return_value=21; break;
			case "Locations Related Tab":return_value=25; break;
			case "Contacts Related Tab":return_value=84; break;
			case "Orders Related Tab":return_value=36; break;
			case "Services Related Tab":return_value=53; break;
			case "Subscribers Related Tab":return_value=62; break;
			case "Tasks Related Tab":return_value=78; break;
			}
			
		} else if(sheetname.equals("GFast_ServiceViewRT")){
			switch(scenario){
			
			case "BAM Report Related Tab":return_value=7; break;
			case "Locations Related Tab":return_value=10; break;
			case "Orders Related Tab":return_value=21; break;
			case "Subscribers Related Tab":return_value=38; break;
			case "Tasks Related Tab":return_value=49; break;
			case "Devices Related Tab":return_value=55; break;			
			case "Circuits Related Tab": return_value=64; break;
			case "Service Area Related Tab": return_value=75; break;
			case "Tirks Related Tab": return_value=82; break;
			case "Performance Related Tab": return_value=86; break;
			case "Virtual Ports Related Tab":	return_value=90; break;
				
			
			}		
		} else if(sheetname.equals("GFast_OrderViewRT")){
			switch(scenario){
			case "BAM Related Tab": return_value=7; break;
			case "Device Related Tab": return_value=10; break;
			case "Services Related Tab": return_value=19; break;
			case "Tasks Related Tab": return_value=28; break;
			case "Tirks Related Tab": return_value=34; break;
			}
		}
		
		return return_value;
		
	}

	public void failure_icon_validation() throws Throwable{
		if(btn_order_tab_search_view_page.isCurrentlyVisible()){
		@SuppressWarnings("unused")
		String tag_name=fileiotest.readFile("Tag_name").replaceAll("\\s","");
    	String scenario=fileiotest.readFile("Scenario");
    	String sheetname=fileiotest.readFile("Sheet_name").replaceAll("\\s","");
    	if(btn_order_tab_search_view_page.getText().contains(("Order Id:"+gfast_order_id_search().replaceAll("\\s","")))){	
    		int column_count = 0;
    		slf4jLogger.info("Tab name:"+tab_selected_360viewpage.getText());
    		slf4jLogger.info("Scenarios:"+scenario);
    		
    	if(lbl_alert_message_no_data_Performance_related_tabs.isCurrentlyVisible()){
    	/*	if(sheetname.equals("GFast_ServiceViewRT")){
    		if(scenario.equals("Performance Related Tab")){
    		column_count=86;
    		} else if(scenario.equals("Circuits Related Tab")){
    			column_count=64;
    		}
    		}
    		else if(sheetname.equals("GFast_DeviceViewRT")){
    			if(scenario.equals("Performance Related Tab")){
    	    		column_count=search_hearder_excel(sheetname, "Performance Related Tab");  86
    	    		} else if(scenario.equals("Circuits Related Tab")){
    	    			column_count=search_hearder_excel(sheetname, "Circuits Related Tab"); 10
    	    		}
    		}*/
    		if(sheetname.equals("GFast_DeviceView360")){
    			gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- Getting this message"+lbl_alert_message_no_data_Performance_related_tabs.getText());
    			throw new Error("No data is displayed showing this message:"+lbl_alert_message_no_data_Performance_related_tabs.getText());
    		}
    		
    		
    		column_count=header_name_search_with_sheetname_scenario(scenario,sheetname);
    		
    		gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail- Getting this message"+lbl_alert_message_no_data_Performance_related_tabs.getText());
    		if(sheetname.equals("GFast_ServiceViewRT")){
    			gfast_Automation_status_update("GFast-Sheet", sheetname);
    			throw new Error("No data is displayed showing this message:"+lbl_alert_message_no_data_Performance_related_tabs.getText());
    		}
    		
    		
    	}  /*if(scenario.equals("SubscribersRelatedTab")){
    		slf4jLogger.info("Subscribers Related Tab in 62, sheetname:"+sheetname);
    		gfast_write_data_inexcel("GFast-Sheet", sheetname, 62, "Fail- Getting this message in Subscriber Tab: "+lbl_alert_message_no_data_related_tabs.getText());
    		
    	}*/ /* else if(scenario.equals("ContactsRelatedTab")){ 
    		slf4jLogger.info("Contacts Related Tab in 79, sheetname:"+sheetname);
    		gfast_write_data_inexcel("GFast-Sheet", sheetname, 79, "Fail- Getting this message"+lbl_alert_message_no_data_related_tabs.getText());
    		
    	}*/ else 
    		//if(!sheetname.equals("GFast_ServiceViewRT")){
    		if(lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
    			column_count=search_hearder_excel(sheetname, header_name_search_with_tab_name(tab_selected_360viewpage.getText()));
        		slf4jLogger.info("Other Related Tab, sheetname:"+sheetname);
        		
        		gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, "Fail- Getting this message in Tab "+tab_selected_360viewpage.getText()+": as- "+lbl_alert_message_no_data_related_tabs.getText());
    		}
    		
    		
    	    		
    	
    	gfast_Automation_status_update("GFast-Sheet", sheetname);
    	}
    	throw new Error("No data is displayed showing this message:"+lbl_alert_message_no_data_related_tabs.getText());
	}
	}
    	
	public String search_order_advancesearch_searchslider(String type) throws Throwable{
		String validationvalue=null;
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
 
		
		if(tab_order_advance_search_result.isCurrentlyVisible()){
			if(type.equals("CSOFID")){
				validationvalue="Order ID";
			} else if(type.equals("Ensemble Order Number")){
				validationvalue="Ensemble Order Number";
			}
		
			int j=1;
			while(j!=0){
				if(loginPage.getDriver().findElement(By.xpath(tableheader+j+"]//span")).getText().contains(validationvalue)){
					validationvalue=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText();
				}
				j++;
				
				if(!loginPage.isElementVisible(By.xpath(tableheader+j+"]//span"))){
					slf4jLogger.info("Break");
					break;
				}
			}
			
		
			
		} else {
			throw new Error("Order Advance Search page is not visible");
		}
		
		return validationvalue;
		
	}
	
	public void search_order_advancesearch_validations_order()  throws Throwable{
		String csofid=null,ensembleordernumber=null,duedate=null,actionvalue=null,orderstatus=null;
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
		String validation=null;
		//int i=1;
		if(tab_order_advance_search_result.isCurrentlyVisible()){
			jsClick(tab_order_advance_search_result);
			
			int j=1;
			while(j!=0){
				//slf4jLogger.info("Header Value:"+loginPage.getDriver().findElement(By.xpath(tableheader+j+"]//span")).getText().replaceAll("\\s",""));
				//slf4jLogger.info("Position:"+j);
				switch(loginPage.getDriver().findElement(By.xpath(tableheader+j+"]//span")).getText().replaceAll("\\s","")){
				case "OrderID": csofid=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found OrderID Position:"+j);break;
								 
				case "EnsembleOrderNumber": ensembleordernumber=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText().replaceAll("\\s",""); slf4jLogger.info("Found EnsembleOrderNumber Position:"+j); break;
				case "Action": actionvalue=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText().replaceAll("\\s",""); slf4jLogger.info("Found Action Position:"+j); break;
				case "Status": orderstatus=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found Status Position:"+j); break;
				case "DueDate": duedate=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found DueDate Position:"+j); break;
				default: break;
				}
				
				
				j++;
				
				if(!loginPage.isElementVisible(By.xpath(tableheader+j+"]//span"))){
					slf4jLogger.info("Break");
					break;
				}
				
			}
			slf4jLogger.info("CSOF ID:"+csofid);
			slf4jLogger.info("Ensemble Order Number:"+ensembleordernumber);
			slf4jLogger.info("Action:"+actionvalue);
			slf4jLogger.info("Status:"+orderstatus);
			slf4jLogger.info("Due Date:"+duedate);
			jsClick(btn_order_tab_search_view_page);
			waitForElement(lbl_vieworderpage_csof_order_no);
			
			if(csofid.equals(lbl_vieworderpage_csof_order_no.getText().replaceAll("\\s",""))){
				slf4jLogger.info("CSOF iD is matching");
			} else {
				slf4jLogger.info("CSOF iD is NOT MATCHING");
			}
			
			if(ensembleordernumber.equals(lbl_vieworderpage_Other_details_sec_Ensemble_order.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Ensemble Order Number is matching");
			} else {
				slf4jLogger.info("Ensemble Order Number is NOT MATCHING");
			}
			
			switch(actionvalue){
			case "N": if(!lbl_orderview_Action_value.getText().contains("ADD")){
					slf4jLogger.info(lbl_orderview_Action_value.getText());
					validation="Fail";
						}
						break;
			case "C": if(!lbl_orderview_Action_value.getText().contains("CHANGE")){
					slf4jLogger.info(lbl_orderview_Action_value.getText());
						//throw new Error("Invalid value is populated");
						validation="Fail";
						}
						break;			
			case "D": if(!lbl_orderview_Action_value.getText().contains("REMOVE")){
					slf4jLogger.info(lbl_orderview_Action_value.getText());
						//throw new Error("Invalid value is populated");
						validation="Fail";
						}		
						break;
			case " ": if(!lbl_orderview_Action_value.getText().contains(" ")){
				slf4jLogger.info(lbl_orderview_Action_value.getText());
						//throw new Error("Invalid value is populated");
				validation="No Action value is updated";
						}
						break;
			}
			
			slf4jLogger.info("Action Status:"+validation);
			slf4jLogger.info("Action value in Order View:"+lbl_orderview_Action_value.getText());
			/*if(validate_actiontype_order_Search_page().contains("Fail")){
				slf4jLogger.info("Action is NOT MATCHING");
			} else {
				slf4jLogger.info("Action is matching");
			}	*/		
			
			if(orderstatus.equals(lbl_vieworderpage_order_status.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Status is matching");
			} else {
				slf4jLogger.info("Status is NOT MATCHING");
			}
			
			if(duedate.equals(lbl_vieworderpage_due_date.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Due Date is matching");
			} else {
				slf4jLogger.info("Due Date is NOT MATCHING");
			}
			
		} else {
			throw new Error("Not applicable for this scenario");
		}
	}
	
	public String getfieldvaluetosearch(String field)throws Throwable{
		String csofid=null,ensembleordernumber=null,customername=null,dtnvalue=null;
		
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
		
		int j=1;
		while(j!=0){
			switch(loginPage.getDriver().findElement(By.xpath(tableheader+j+"]//span")).getText().replaceAll("\\s","")){
			case "OrderID": csofid=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found OrderID Position:"+j);break;
							 
			case "EnsembleOrderNumber": ensembleordernumber=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText().replaceAll("\\s",""); slf4jLogger.info("Found EnsembleOrderNumber Position:"+j); break;
			
			case "Customer": customername=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Customer Position:"+j); break;
			case "DTN": dtnvalue=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("DTN Position:"+j); break;
			default: break;
			}
			
			
			j++;
			
			if(!loginPage.isElementVisible(By.xpath(tableheader+j+"]//span"))){
				slf4jLogger.info("Break");
				break;
			}
		}
		

		jsClick(actvtnpage.tab_closeall_tab);
		Thread.sleep(1000);
		jsClick(actvtnpage.tab_search);
		
		waitForElement(actvtnpage.ddl_searchType);
		//actvtnpage.ddl_orderTypeSearchTab.selectByVisibleText("Customer Orders");
		Thread.sleep(1000);
		
		switch(field){
		
		case "CSOF Order ID": actvtnpage.tbx_orderId.sendKeys(csofid);break;
		case "Ensemble Order ID": actvtnpage.tbx_ensembleOrderNumber.sendKeys(ensembleordernumber);break;
		case "TN": actvtnpage.tbx_dtnorder.sendKeys(dtnvalue);break;
		case "Customer Name": actvtnpage.tbx_customerName.sendKeys(customername);break;
		
				
		
		}
		
		return field;
		
	}
	
	//**********************US171722 - Changes - 7/21/2017 ***************************//
	
	
	public void Network_order_status() throws Throwable {
		
		String msg=lbl_altequip_buildstatus_ordernumber.getText();
		slf4jLogger.info(msg);
		slf4jLogger.info(lbl_altequip_buildstatus.getText());
		msg=lbl_altequip_buildstatus_ordernumber.getText();
		if(msg!=null){
		if(!lbl_altequip_buildstatus_ordernumber.getText().equals(null)){
		//int time=85000;
		while(!lbl_altequip_buildstatus.getText().equals("SUCCESS"))				
    	{
			if(lbl_altequip_buildstatus_ordernumber.getText().trim().equals(null)){
				altdevicecheck_validation();
			}
			Thread.sleep(3000);										// Need to wait still Success
			jsClick(btn_altequip_buildstatus_refresh);
			slf4jLogger.info("Doing Refresh1");        		
    		slf4jLogger.info(lbl_altequip_buildstatus.getText());
			Thread.sleep(2000);
			if(lbl_altequip_buildstatus.getText().equals("Build Submitted")){
				Thread.sleep(3000);
				jsClick(btn_altequip_buildstatus_refresh);
				slf4jLogger.info("Doing Refresh2");        		
        		slf4jLogger.info(lbl_altequip_buildstatus.getText());
        		Thread.sleep(2000);
        		if(lbl_altequip_buildstatus.getText().equals("SUCCESS")){
        			slf4jLogger.info(lbl_altequip_buildstatus.getText());
        			Thread.sleep(2000);
        			break;
        		}
        		if(lbl_altequip_buildstatus.getText().equals("FAILURE")){
        			jsClick(btn_altequip_submitbuild);
					Thread.sleep(3000);getDriver().switchTo().alert().accept();
        		}
			}
			if(lbl_altequip_buildstatus.getText().equals("FAILURE")){
    			altdevicecheck_validation();
    		}
			//Thread.sleep(15000);
			slf4jLogger.info("Doing Refresh");        		
    		slf4jLogger.info(lbl_altequip_buildstatus.getText());
    		//time=time-40000;
    	}
		
		} else {
			slf4jLogger.info("Orders are not getting created");
			return;
		}
			
		msg=lbl_altequip_buildstatus_ordernumber.getText();
		slf4jLogger.info(msg);
		
	}
	msg=msg.replaceAll("[^0-9]", "");	
	}
	
	public void validation_networkorder_status(String statusvalidation) throws Throwable {
		switch(statusvalidation){
		case "Network order status changed to Success": if(lbl_altequip_buildstatus.getText().equals("SUCCESS")){
															slf4jLogger.info("Network Order:"+lbl_altequip_buildstatus_ordernumber.getText()+" -- Succes");
														} else {
															throw new Error("Order got failed");
														} break;
														
		case "Cancel Order button enabled & clickable": if(btn_networkorder_cancelorder.isCurrentlyVisible() && btn_networkorder_cancelorder.isCurrentlyEnabled()){
															slf4jLogger.info("Cancel Order Button is enabled & clickable in Network Order");
														} else {
															throw new Error("Cancel Order Button is not present in Network Order");
														} break;
														
		case "Cancellation request successfully sent to DSP. - Message getting displayed in the Network Order Screen": if(lbl_alertmsg.getText().contains("Cancellation request successfully sent to DSP.")){
																																	slf4jLogger.info("Displaying this Message in the NEtwork order screen:"+lbl_alertmsg.getText());
																																} else {
																																	throw new Error("Wrong message is been displayed in Network Order");
																															}
		}
		
	}

	public void launching_networkorder_altequipscreen() throws Throwable {
		jsClick(lbl_altequip_buildstatus_ordernumber);
		waitForElement(btn_order_tab_search_view_page);
		waitForElement(lbl_networkorder_generalsection);
	}
	
	
	public void Order_create_Sanity_validation() throws Throwable {
		waitForElement(btn_createorder_create);
		Thread.sleep(3000);
		if(!tab_create.isCurrentlyVisible()){
			throw new Error("Create Order form is not displayed");
		}
		
		if(!btn_createorder_create.isCurrentlyVisible() && !btn_createorder_create.isCurrentlyEnabled()){
			throw new Error("Create button is not Visible & enabled in MLTO form");
		}
		
		if(!btn_createorder_reset.isCurrentlyVisible() && !btn_createorder_reset.isCurrentlyEnabled()){
			throw new Error("Reset button is not Visible & enabled in MLTO form");			
		}
		
		if(!lbl_craeteorder_generalsection.isCurrentlyVisible()){
			throw new Error("General Section is not displayed");
		}
		
		if(!lbl_craeteorder_locationdetailssection.isCurrentlyVisible()){
			throw new Error("Location Details Section is not displayed");
		}
		
		if(!btn_craeteorder_locationdetailssection_locationlookup.isCurrentlyVisible() && !btn_craeteorder_locationdetailssection_locationlookup.isCurrentlyEnabled()){
			throw new Error("Location Lookup button is not Visible & enabled in MLTO form");			
		}
		
		
		if(!lbl_craeteorder_servicedetails.isCurrentlyVisible()){
			throw new Error("Service Details Section is not displayed");
		}
		
		if(!lbl_craeteorder_dispatchdetails.isCurrentlyVisible()){
			throw new Error("Dispatch Details Section is not displayed");
		}		
		
		ArrayList<String> orderAttributes = new ArrayList<String>();

		orderAttributes.add(0, "Order # *");
		orderAttributes.add(1, "Customer First Name *");
		orderAttributes.add(2, "Customer Last Name *");
		orderAttributes.add(3, "BAN");
		orderAttributes.add(4, "Customer type *");
		orderAttributes.add(5, "Customer Subtype *");
		orderAttributes.add(6, "Account Type *");	
		orderAttributes.add(7, "Service Address *");	
		orderAttributes.add(8, "Address Line 2");	
		orderAttributes.add(9, "Wire Center CLLI *");	
		orderAttributes.add(10, "Latitude *");	
		orderAttributes.add(11, "Longitude *");	
		orderAttributes.add(12, "Remarks");	
		orderAttributes.add(13, "DTN *");	
		orderAttributes.add(14, "Reason Code *");	
		orderAttributes.add(15, "Service Type *");	
		orderAttributes.add(16, "Down Speed *");	
		orderAttributes.add(17, "Up Speed *");	
		orderAttributes.add(18, "Action *");	
		orderAttributes.add(19, "Test Order *");	
		orderAttributes.add(20, "Feature Code Collection");	
		orderAttributes.add(21, "Feature Code Remark");	
		orderAttributes.add(22, "Appointment Start Date *");	
		orderAttributes.add(23, "Appointment Start Time *");	
		orderAttributes.add(24, "Appointment End Date *");	
		orderAttributes.add(25, "Appointment End Time *");	
		orderAttributes.add(26, "Requested Due Date *");	
		orderAttributes.add(27, "Remark");			
		
		
		List<WebElementFacade> Ordercreatelist = devcreatepage.lbl_allXapath;
		ArrayList<String> OrderatributesOfPage=new ArrayList<String>();
		slf4jLogger.info("Step one done");
		
		for(int j=0;j<Ordercreatelist.size();j++){			
			OrderatributesOfPage.add(j, Ordercreatelist.get(j).getText());				
		}
		
		for(int i=0;i<OrderatributesOfPage.size();i++){
			if(!OrderatributesOfPage.get(i).equals(orderAttributes.get(i))){
				slf4jLogger.info("OrderatributesOfPage="+OrderatributesOfPage.get(i));
				slf4jLogger.info("orderAttributes="+orderAttributes.get(i)+" Not matching");
				throw new Error("Fields are not matching in MLTO Create form");
			}
		}
		slf4jLogger.info("Order Create field attributes are expected");
		
		WaitForPageToLoad(500);
		ddl_customerType.selectByIndex(1);
		ddl_customerSubtype.selectByIndex(2);
		ddl_accountType.selectByIndex(0);
		ddl_serviceType_MLTO.selectByIndex(2);
		waitFor(ddl_hdStreams_MLTO);
		ddl_hdStreams_MLTO.selectByIndex(4);
		ddl_downSpeed_MLTO.selectByIndex(17);
		ddl_upSpeed_MLTO.selectByIndex(17);
	}
	
	public void Order_search_Sanity_validation() throws Throwable {
		
		waitForElement(btn_order_tab_search_view_page);
		Thread.sleep(3000);
		if(!btn_order_tab_search_view_page.isCurrentlyVisible()){
			throw new Error("Order Tab is not displayed");			
		}
		
		if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){

		if(!btn_order_tab_search_view_page.getText().replaceAll("\\s","").contains(lbl_vieworderpage_csof_order_no.getText())){
			throw new Error("Order Tab is not & field value is not matching");			
		}
		
		if(!tab_Searchorder_Relatedorders.isCurrentlyVisible()){
			throw new Error("Related Order Tab is not displayed for GPON Orders");			
		}
		
		
		} else {
			
			if(!btn_order_tab_search_view_page.getText().replaceAll("\\s","").equals(lbl_orderno_details.getText().replaceAll("[^\\d]", "").replaceAll("\\s",""))){
				throw new Error("Order Tab is not & field value is not matching");			
			}
			if(!btn_order_tab_search_view_page.getText().replaceAll("\\s","").equals(lbl_vieworderpage_csof_order_no.getText())){
				throw new Error("Order Tab is not & field value is not matching");			
			}
			
			 if(!btn_editmltoorder.isCurrentlyVisible() && !btn_editmltoorder.isCurrentlyEnabled()){
					throw new Error("Edit Order button is not Visible & enabled");			
				}
			 
			 if(!btn_cancelmltoorder.isCurrentlyVisible() && !btn_cancelmltoorder.isCurrentlyEnabled()){
					throw new Error("Cancel Order button is not Visible & enabled");			
				}
		}
		
		if(!btn_dispatch.isCurrentlyVisible() && !btn_dispatch.isCurrentlyEnabled()){
			throw new Error("Dispatch button is not Visible & enabled");			
		}
		
		if(!btn_improv.isCurrentlyVisible() && !btn_improv.isCurrentlyEnabled()){
			throw new Error("IMPROV button is not Visible & enabled");				
		}
		
		if(!btn_isatcreate.isCurrentlyVisible() && !btn_isatcreate.isCurrentlyEnabled()){
			throw new Error("ISAT Create button is not Visible & enabled");			
		}
		
		if(!btn_isatmodify.isCurrentlyVisible() && !btn_isatmodify.isCurrentlyEnabled()){
			throw new Error("ISAT Modify button is not Visible & enabled");			
		}
		
		if(!tab_Searchorder_Auditlogs.isCurrentlyVisible()){
			throw new Error("Audit Logs Tab is not displayed for Orders");			
		}
		
		if(!tab_Searchorder_Ordernotes.isCurrentlyVisible()){
			throw new Error("Order Notes Tab is not displayed for Orders");			
		}
		
		if(!tab_Searchorder_Orderdetails.isCurrentlyVisible()){
			throw new Error("Order Details Tab is not displayed for Orders");			
		}
		
		if(!tab_Searchorder_Orderxmlview.isCurrentlyVisible()){
			throw new Error("Order XML Tab is not displayed for Orders");			
		}
		
		if(!tab_Searchorder_Orderhistory.isCurrentlyVisible()){
			throw new Error("Order History Tab is not displayed for Orders");			
		}
		
		if(!tab_Searchorder_Orderdifference.isCurrentlyVisible()){
			throw new Error("Order Difference Tab is not displayed for Orders");			
		}	
		
		//#################################		Related Tab validations  ###############################################//
		
		//################################ Related Tabs Validations in Circuit view ############################################//	
		
		
		if(!tab_bamreport.isCurrentlyVisible() ){
			throw new Error("BAM Report Related tab is missing in the Orders view page");
		}		
		
		if(!tab_Devices.isCurrentlyVisible()  ){
			throw new Error("Devices Related Tab is missing in the Orders view page");
		}	
		
		if(!tab_services.isCurrentlyVisible()){
			throw new Error("Services Related Tab is missing in the Orders view page");
		}		
				
		if(!tab_Tasks.isCurrentlyVisible()){
			throw new Error("Task Related Tab is missing in the Orders view page");
		}
		
		if(!tab_TIRKS.isCurrentlyVisible() ){
			throw new Error("TIRKS Related Tab is missing in the Orders view page");
		}
				
						
		//################################ Related Tabs should not be displayed Circuit view ############################################//
		
		if(tab_Activations.isCurrentlyVisible() ){
			throw new Error("Activation Related Tab is Displayed in the Orders view page");
		}
		
		if(tab_Armor.isCurrentlyVisible() ){
			throw new Error("ARMOR Related Tab is Displayed in the Orders view page");
		}
		
		if(tab_circuitdetails.isCurrentlyVisible() ){
			throw new Error("Circuit Details Related tab is Displayed in the Orders view page");
		}
		
		if(tab_Circuits.isCurrentlyVisible()){
			throw new Error("Circuit Related Tab is Displayed in the Orders view page");
		}
		

		if(tab_facilities.isCurrentlyVisible()  ){
			throw new Error("Facilities Related Tab is Displayed in the Orders view page");
		}
		
		if(tab_Locations.isCurrentlyVisible()){
			throw new Error("Location Related tab is Displayed in the Orders view page");
		}
		
		if(tab_orders.isCurrentlyVisible()){
			throw new Error("Orders Related Tab is Displayed in the Orders view page");
		}
		
		if(tab_Service_Areas.isCurrentlyVisible()){
			throw new Error("Service Area Related Tab is Displayed in the Orders view page");
		}
		
		if(tab_Subscriber.isCurrentlyVisible()){
			throw new Error("Subscriber Related Tab is Displayed in the Orders view page");
		}
				
				if(tab_ctag.isCurrentlyVisible()){
					throw new Error("CTAG Related Tab is Displayed in the Orders view page");
				}		
				
				if(tab_contact.isCurrentlyVisible()){
					throw new Error("Contact Related Tab is Displayed in the Orders view page");
				}
				
				if(tab_Device_ports.isCurrentlyVisible()){
					throw new Error("Audit Logs Tab is Displayed in the Orders view page");
				}				
				
				
				if(tab_Performance.isCurrentlyVisible()){
					throw new Error("Performance Related Tab is Displayed in the Orders view page");
				}
				
				if(tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is Displayed in the Orders view page");
				}	
		
		
	}
	
	public void searchmltoorder_result(){
		try {
		int j=1;
		String status=null;
		while(j!=0){
			int i=0;
			while(j!=0){
				if(btn_editmltoorder.isCurrentlyVisible()){
					status="Pass";
					slf4jLogger.info("Order page is displayed");
					break;
				}
				String viewxpath="//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input";
				jsClick(getDriver().findElement(By.xpath(viewxpath)));
				Thread.sleep(7000);
				if(btn_editmltoorder.isCurrentlyVisible() && btn_editmltoorder.isCurrentlyEnabled()){
					status="Pass";
					break;
				}
				i++;
				jsClick(tab_search_result_page);
				
				if(!isElementVisible(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input"))){
					jsClick(btn_search_result_next);
					
						Thread.sleep(2000);
					
					break;
				}
			}
			if(status.equals("Pass")){
				break;
			}
			
			
		}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Editform_attribute_validation(){
		waitForElement(btn_Save_editmltoorder);
		List<WebElementFacade> Ordereditlist = lbl_EditpageOrderxpath;
		ArrayList<String> OrderatributesOfeditPage=new ArrayList<String>();
		for(int j=0;j<Ordereditlist.size();j++){
			
			OrderatributesOfeditPage.add(j, Ordereditlist.get(j).getText().trim());
		
			}
		for(int i=0;i<OrderatributesOfeditPage.size();i++){
			//slf4jLogger.info(atributesOfPage.get(i));
			
			if(OrderatributesOfeditPage.get(i).equals("V and H coordinates")){
				throw new Error("V and H coordinates is present");
			} 
		}
		
		// editfieldvalidation();
		
	}
	public void action_button_MLTO_Search(String action) throws InterruptedException{
		 WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 10);
		switch(action){
		case "Cancel":jsClick(btn_cancel_Editmltoorder);waitForElement(btn_editmltoorder);break;
		case "Edit Order": jsClick(btn_editmltoorder); Thread.sleep(2000);waitForElement(btn_Save_editmltoorder);
							Thread.sleep(2000);
							break;
		case "Save":jsClick(btn_Save_editmltoorder); Thread.sleep(2000); waitForElement(btn_editmltoorder);break;
		case "Cancel Order":jsClick(btn_cancelmltoorder); 
							 wait.until(ExpectedConditions.alertIsPresent());
						        Alert alertDialog = loginPage.getDriver().switchTo().alert();
								String msg=alertDialog.getText();
								 Thread.sleep(5000);
								alertDialog.accept();
								slf4jLogger.info(msg);break;
		case "Audit Log": 	waitForElement(tab_Searchorder_Auditlogs);jsClick(tab_Searchorder_Auditlogs); Thread.sleep(2000);
							waitForElement(tab_Searchorder_Auditlogs_omnivueauditlog);jsClick(tab_Searchorder_Auditlogs_omnivueauditlog); Thread.sleep(2000);
							waitForElement(btn_Searchorder_Auditlogs_omnivueauditlog_getlog);jsClick(btn_Searchorder_Auditlogs_omnivueauditlog_getlog); Thread.sleep(2000);
							
							waitForElement(btn_Searchorder_Auditlogs_omnivueauditlog_getlog);	break;
		}

	}
	
	public void order_screenvalidation(String validation) throws Throwable{
		switch(validation){
		
		case "Order Notes Tab":	waitForElement(tab_Searchorder_Ordernotes); Thread.sleep(2000); jsClick(tab_Searchorder_Ordernotes); Thread.sleep(2000); break;
		case "Save button on Order Notes Tab":waitForElement(btn_Searchorder_ordernotes_save); jsClick(btn_Searchorder_ordernotes_save); Thread.sleep(2000); break;
		case "Audit Logs Tab":action_button_MLTO_Search("Audit Log");break;
		case "Order History Tab": waitForElement(tab_Searchorder_Ordernotes); Thread.sleep(2000); jsClick(tab_Searchorder_Orderhistory); Thread.sleep(2000); break;
		}
	}
	
	
	
	public void verify_validation(String validation) { try {
		String Message=null;int i=0;
		switch(validation){
		case "Configuration column, Refresh icon, Excel export & Print Icon is displayed in Task Related Tab":
			
						waitForElement(btn_TaskRT_GO); Thread.sleep(2000);
						
						
						if(!btn_TaskRT_exportexcelicon.isCurrentlyVisible() && !btn_TaskRT_exportexcelicon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
							slf4jLogger.error("Excel export Icon button is not displayed in the Task Related Tab");
							throw new Error("Excel export Icon button is not displayed in the Task Related Tab");
						}
						
			
						if(!btn_ServiceRT_printicon.isCurrentlyVisible() && !btn_ServiceRT_printicon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
							slf4jLogger.error("Print Icon button is not displayed in the Task Related Tab");
							throw new Error("Print Icon button is not displayed in the Task Related Tab");
						}
						
			
						if(!btn_TaskRT_Configicon.isCurrentlyVisible() && !btn_TaskRT_Configicon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
							slf4jLogger.error("Configuration Icon button is not displayed in the Task Related Tab");
							throw new Error("Configuration Icon button is not displayed in the Task Related Tab");
						}
						
			
						if(!btn_TaskRT_refreshicon.isCurrentlyVisible() && !btn_TaskRT_refreshicon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
							slf4jLogger.error("Refresh Icon button is not displayed in the Task Related Tab");
							throw new Error("Refresh Icon button is not displayed in the Task Related Tab");
						}			
						break;
			
		case "Refresh Icon, Excel export & Print Icon is displayed in Service Related Tab":
					waitForElement(btn_Orderresultpage_taskRT_view); Thread.sleep(2000);
					
					if(!btn_ServiceRT_excelexporticon.isCurrentlyVisible() && !btn_ServiceRT_excelexporticon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
						slf4jLogger.error("Excel export Icon button is not displayed in the Services Related Tab");
						throw new Error("Excel export Icon button is not displayed in the Services Related Tab");
					}
					
					if(!btn_ServiceRT_printicon.isCurrentlyVisible() && !btn_ServiceRT_printicon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
						slf4jLogger.error("Print Icon button is not displayed in the Services Related Tab");
						throw new Error("Print Icon button is not displayed in the Services Related Tab");
					}
					
					if(!btn_ServiceRT_refreshicon.isCurrentlyVisible() && !btn_ServiceRT_refreshicon.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
						slf4jLogger.error("Refresh Icon button is not displayed in the Services Related Tab");
						throw new Error("Refresh Icon button is not displayed in the Services Related Tab");
					}
					
								
								break;
		case "Refresh icon, Edit button & Revert button is displayed in Device Related Tab":

			waitForElement(btn_deviceRT_refreshicon); Thread.sleep(3000);
			
			if(!btn_deviceRT_edit.isCurrentlyVisible() && !btn_deviceRT_edit.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				slf4jLogger.error("Edit button is not displayed in the Device Related Tab");
				throw new Error("Edit button is not displayed in the Device Related Tab");
			}
			
			if(!btn_deviceRT_revert.isCurrentlyVisible() && !btn_deviceRT_revert.isCurrentlyEnabled()){
				slf4jLogger.error("Revert button is not displayed in the Device Related Tab");
				throw new Error("Revert button is not displayed in the Device Related Tab");
			}
			
			break;
		case "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen":
				waitForElement(tab_Searchorder_Auditlogs);
				
				if(!tab_Searchorder_Orderhistory.isCurrentlyVisible()){
					slf4jLogger.error("Order History header is not displayed in Order page");
					throw new Error("Order History header is not displayed in Order page");
				}
				
				
				if(!tab_Searchorder_Orderxmlview.isCurrentlyVisible()){
					slf4jLogger.error("Order XML View header is not displayed in Order page");
					throw new Error("Order XML View header is not displayed in Order page");
				}
				
				
				if(!tab_Searchorder_Orderdetails.isCurrentlyVisible()){
					slf4jLogger.error("Order Details header is not displayed in Order page");
					throw new Error("Order Details header is not displayed in Order page");
				}
				
				
				if(!tab_Searchorder_Ordernotes.isCurrentlyVisible()){
					slf4jLogger.error("Order Notes header is not displayed in Order page");
					throw new Error("Order Notes header is not displayed in Order page");
				}
							
				     
							break;
		case "Order history table should be displayed in Order screen":
			waitForElement(lbl_orderhistory_Header);
			
			    
			if(!lbl_orderhistory_ordernumber.isCurrentlyVisible()){
				slf4jLogger.error("Order History header is not displayed in Order page");
				throw new Error("Order History header is not displayed in Order page");
			}
			
				if(!lbl_orderhistory_orderversion.isCurrentlyVisible()){
					slf4jLogger.error("ORDER VERSION header is not displayed in Order page");
					throw new Error("ORDER VERSION header is not displayed in Order page");	
							}
				
				if(!lbl_orderhistory_statuscode.isCurrentlyVisible()){
					slf4jLogger.error("STATUS CODE header is not displayed in Order page");
					throw new Error("STATUS CODE header is not displayed in Order page");
				}
				
				if(!lbl_orderhistory_completiondate.isCurrentlyVisible()){
					slf4jLogger.error("COMPLETION DATE header is not displayed in Order page");
					throw new Error("COMPLETION DATE header is not displayed in Order page");
				}
				
				if(!lbl_orderhistory_orderaction.isCurrentlyVisible()){
					slf4jLogger.error("ORDER ACTION header is not displayed in Order page");
					throw new Error("ORDER ACTION header is not displayed in Order page");
				}
							
			break;
		case "search for the Order using DTN in advance search screen":
									waitForElement(lbl_vieworderpage_HSI_Service_sec_Service_Id);		
									String []dtn=lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().split("-");
									jsClick(btn_tabactive_close); Thread.sleep(2000);
									while(!tabactive.getText().trim().contains("Orders Advanced Search")){
										jsClick(btn_tabactive_close);Thread.sleep(2000);
									}
									waitForElement(tbx_adsearchorder_DTN);
									
									tbx_adsearchorder_DTN.type(dtn[0]);
									
									
										Advance_Search_button_action("Orders");
									
									break;
									
		case "Configuration column, Refresh icon, Excel export, Print Icon, Get Logs & From Archieve checkbox is displayed":

						if(!btn_Orderresultpage_configurecolumn.isCurrentlyVisible()){
							slf4jLogger.error("Configuration column is missing for BAM Reports Tab in Order page");
							throw new Error("Configuration column is missing for BAM Reports Tab in Order page");
						}
						
						if(!btn_vieworderpage_related_tab_BAM_Refresh.isCurrentlyVisible()){
							slf4jLogger.error("Refresh Icon is missing for BAM Reports Tab in Order page");
							throw new Error("Refresh Icon is missing for BAM Reports Tab in Order page");
									}
						
						if(!btn_vieworderpage_related_tab_BAM_Excel.isCurrentlyVisible()){
							slf4jLogger.error("Excel Icon is missing for BAM Reports Tab in Order page");
							throw new Error("Excel Icon is missing for BAM Reports Tab in Order page");
						}
						
						if(!btn_vieworderpage_related_tab_BAM_Print.isCurrentlyVisible()){
							slf4jLogger.error("Print Icon is missing for BAM Reports Tab in Order page");
							throw new Error("Print Icon is missing for BAM Reports Tab in Order page");
						}
						
						if(!btn_vieworderpage_related_tab_BAM_getlogs.isCurrentlyVisible()){
							slf4jLogger.error("Get logs button is missing for BAM Reports Tab in Order page");
							throw new Error("Get logs button is missing for BAM Reports Tab in Order page");
						}
						
						if(!cbx_vieworderpage_related_tab_BAM_fromarchieve.isCurrentlyVisible()){
							slf4jLogger.error("From Archieve checkbox is missing for BAM Reports Tab in Order page");
							throw new Error("From Archieve checkbox is missing for BAM Reports Tab in Order page");
						}					
						
						break;
			
		case "fallout tasks is getting updated in BAM Report on Orders":
			waitForElement(lbl_order_result_page_search_parameters_CSOF_Order_ID);			
		//	osrdb.bam_reportvalidation(lbl_order_result_page_search_parameters_CSOF_Order_ID.getText().trim());
			break;
			
		case "ISAT Create Log is captured in the Omnivue Audit log tab":action_button_MLTO_Search("Audit Log");
								if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
									slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
									throw new Error("Update logs is not captured under the Audit logs section in Order page");
								}
								if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]"))){
									slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
									throw new Error("Update logs is not captured under the Audit logs section in Order page");
								}
								if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
									slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
									throw new Error("Update logs is not captured under the Audit logs section in Order page");
								}
								
								if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../following-sibling::div/div[1])[1]")).getText().trim().contains("ISAT Create action submitted successfully.")){
									slf4jLogger.error("Invalid logs is not captured under the Audit logs section in Order page");
									throw new Error("Update logs is not captured under the Audit logs section in Order page");
								}
								break;
		case "DISPATCH Log is captured in the Omnivue Audit log tab":action_button_MLTO_Search("Audit Log");
											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
												slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
												throw new Error("Update logs is not captured under the Audit logs section in Order page");
											}
											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]"))){
												slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
												throw new Error("Update logs is not captured under the Audit logs section in Order page");
											}
											if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
												slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
												throw new Error("Update logs is not captured under the Audit logs section in Order page");
											}
											
											if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../following-sibling::div/div[1])[1]")).getText().trim().contains("Dispatch action submitted successfully.")){
												slf4jLogger.error("Invalid logs is not captured under the Audit logs section in Order page");
												throw new Error("Update logs is not captured under the Audit logs section in Order page");
											}
											break;
		
		
		case "IMPROV Log is captured in the Omnivue Audit log tab":action_button_MLTO_Search("Audit Log");
										if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
											slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
											throw new Error("Update logs is not captured under the Audit logs section in Order page");
										}
										if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]"))){
											slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
											throw new Error("Update logs is not captured under the Audit logs section in Order page");
										}
										if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
											slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
											throw new Error("Update logs is not captured under the Audit logs section in Order page");
										}
										
										if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../following-sibling::div/div[1])[1]")).getText().trim().contains("IMPROV action submitted successfully.")){
											slf4jLogger.error("Invalid logs is not captured under the Audit logs section in Order page");
											throw new Error("Update logs is not captured under the Audit logs section in Order page");
										}
										break;
		
		case "ISAT Modify Log is captured in the Omnivue Audit log tab":action_button_MLTO_Search("Audit Log");
									if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
										slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
										throw new Error("Update logs is not captured under the Audit logs section in Order page");
									}
									if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]"))){
										slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
										throw new Error("Update logs is not captured under the Audit logs section in Order page");
									}
									if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
										slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
										throw new Error("Update logs is not captured under the Audit logs section in Order page");
									}
									
									if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../following-sibling::div/div[1])[1]")).getText().trim().contains("ISAT Modify action submitted successfully.")){
										slf4jLogger.error("Invalid logs is not captured under the Audit logs section in Order page");
										throw new Error("Update logs is not captured under the Audit logs section in Order page");
									}
									break;
		
		case "Order Note History section displays the save note details":
						waitForElement(lbl_Searchorder_ordernotes_history);
						break;
		case "enter a log inside the notes section in order screen":
							waitForElement(tbx_Searchorder_ordernotes_notes);
							tbx_Searchorder_ordernotes_notes.type("Automation Test");			
							break;
		case "Cancel Order option on GPON Order Detail page":
						waitForElement(btn_cancelmltoorder);
						break;
		case "Cancel Order option on Ethernet order detail page":		
							waitForElement(btn_networkorder_cancelorder);
							break;
			
		case "click on the view task button in the Orders details screen":
						waitForElement(btn_Orderresultpage_taskRT_view); jsClick(btn_Orderresultpage_taskRT_view); Thread.sleep(2000);
						waitForElement(lbl_tab_task);Thread.sleep(2000);
						waitForElement(tab_orders);
								
						break;
						
		case "Order Cancel audit log should get displayed in Order details page" : Thread.sleep(2000);

						if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(text(),'Cancellation action initiated for Order')]"))){
							slf4jLogger.error("Order cancel logs is not captured under the Audit logs section in Order page");
							throw new Error("Order cancel logs is not captured under the Audit logs section in Order page");
						}
									break;
		case "Update Log is captured in the Omnivue Audit log tab":
			
			waitForElement(tab_Searchorder_Auditlogs);jsClick(tab_Searchorder_Auditlogs); Thread.sleep(2000);
			waitForElement(tab_Searchorder_Auditlogs_omnivueauditlog);jsClick(tab_Searchorder_Auditlogs_omnivueauditlog); Thread.sleep(2000);
			waitForElement(btn_Searchorder_Auditlogs_omnivueauditlog_getlog);jsClick(btn_Searchorder_Auditlogs_omnivueauditlog_getlog); Thread.sleep(2000);
			
			waitForElement(btn_Searchorder_Auditlogs_omnivueauditlog_getlog);			
			
			
			if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
				slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
				throw new Error("Update logs is not captured under the Audit logs section in Order page");
			}
			if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]"))){
				slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
				throw new Error("Update logs is not captured under the Audit logs section in Order page");
			}
			if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
				slf4jLogger.error("Update logs is not captured under the Audit logs section in Order page");
				throw new Error("Update logs is not captured under the Audit logs section in Order page");
			}
			
					break;
		case "Success message is displayed on the Order Screen":	waitForElement(btn_editmltoorder); Thread.sleep(2000);
							waitForElement(lbl_alertmsg);
							Message=lbl_alertmsg.getText().trim();
							//Message = Message.toString().substring(1);		
							//Message = Message.trim(); 
							if(!Message.contains("Order Updated Successfully")){
								throw new Error("Invalid message on Save is displayed."+Message);
							}jsClick(btn_alertmsg_clsicon); break;			
			
		case "enter the customer name as Infrastructure in order advance search":
			jsClick(lbl_adsearchorder_customerparameter); waitForElement(tbx_adsearchorder_customerparameter_custombername); Thread.sleep(1000);
			tbx_adsearchorder_customerparameter_custombername.type("%Infrastructure%");
			break;
			
		case "Apply default button in the configure column":Thread.sleep(2000);
								waitForElement(btn_Orderresultpage_configurecolumn);
								jsClick(btn_Orderresultpage_configurecolumn); Thread.sleep(2000);	
								waitForElement(btn_Orderresultpage_configurecolumn_apply);
								jsClick(btn_Orderresultpage_configurecolumn_applydefault);Thread.sleep(4000);				
								break;
								
		case "PON header is displayed at the first column result page":
								Thread.sleep(5000);
								if(!getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[contains(@id,'columntablejqxGrid')]/div[2]//span")).getText().trim().contains("PON")){
									slf4jLogger.debug("Header didnt get reflect in Configure column");
									throw new Error("Header didnt get reflect in Configure column");
								}		
								break;
								
		case "move the PON header to the top list & click on the apply button":
								waitForElement(ddl_Orderresultpage_configurecolumn_list);
								ddl_Orderresultpage_configurecolumn_list.selectByVisibleText("PON");
								for(i=0;i<14;i++){
									jsClick(btn_Orderresultpage_configurecolumn_up);Thread.sleep(2000);
								}
								
								jsClick(btn_Orderresultpage_configurecolumn_apply);
								break;
		case "Configure column button in the order result page": waitForElement(btn_view);
										Thread.sleep(2000);										
										waitForElement(btn_Orderresultpage_configurecolumn);
										jsClick(btn_Orderresultpage_configurecolumn); Thread.sleep(2000);	
										waitForElement(btn_Orderresultpage_configurecolumn_apply);
										break;
										
		case "Configure column attributes been displayed":waitForElement(btn_Orderresultpage_configurecolumn_apply);Thread.sleep(2000);
								if(!btn_Orderresultpage_configurecolumn_apply.isCurrentlyVisible()){
									slf4jLogger.debug("Configure column apply button is not displayed");
									throw new Error("Configure column apply button is not displayed");
								}
								if(!btn_Orderresultpage_configurecolumn_applydefault.isCurrentlyVisible()){
									slf4jLogger.debug("Configure column apply Default button is not displayed");
									throw new Error("Configure column apply Default button is not displayed");
								}
								if(!ddl_Orderresultpage_configurecolumn_list.isCurrentlyVisible()){
									slf4jLogger.debug("Configure column List is not displayed");
									throw new Error("Configure column List is not displayed");
								}			
								break;
								
								
		
		}
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void order_action_fuctionality(String action) throws Throwable {
		waitForElement(btn_editmltoorder);
		action_button_MLTO_Search(action);
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
	
}
