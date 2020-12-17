package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row; 
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
//import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.Excel_Read;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class OVCreateGDBPage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	OVLoginPage loginPage;
	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	OVSearchDevicePage searchdevicepage;
	OVOrderPage orderpage;
	OmnivueDB ovdb;

	static String Fiberlink;
	Excel_Read excel_access = new Excel_Read();
	
	 //Create FireFox Profile object
	//FirefoxProfile profile = new FirefoxProfile();
	
	//Network Build for create device--Sairam	
	
		//Start of Netwrok Device creation
	
	@FindBy(xpath=".//tab-heading[contains(text(),'GPON Device Build:')]")
			public WebElementFacade tab_GDB;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Gpon Network Result')]")
			public WebElementFacade tab_Gpon_Ntw_search_result;
		
		@FindBy(xpath="//span[contains(text(),'OLT')]")
		public WebElementFacade btn_gpon_OLT;		
		
		@FindBy(xpath="//span[contains(text(),'Splitter')]")
		public WebElementFacade btn_gpon_Splitter;
		
		@FindBy(xpath="//span[contains(text(),'FDP')]")
		public WebElementFacade btn_gpon_FDP;		
		
		@FindBy(xpath="//span[contains(text(),'MST')]")
		public WebElementFacade btn_gpon_MST;		
		
		@FindBy(xpath="//span[contains(text(),'MDU')]")
		public WebElementFacade btn_gpon_MDU;	
		
		@FindBy(xpath="//span[contains(text(),'Service Area')]")
		public WebElementFacade btn_gpon_servicearea;
		
		@FindBy(xpath="//span[contains(text(),'FDH')]")
		public WebElementFacade btn_gpon_FDH;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ng-click='exportGDBToExcel();']")
		public WebElementFacade btn_GDB_save2excel;		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='getAuditLogs();']")
		public WebElementFacade btn_GDB_getauditlogs;		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='getStatusLogs();']")
		public WebElementFacade btn_GDB_getstatushistory;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Build ID')]")
		public WebElementFacade lbl_GDB_buildid;
		
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='openTemplateClonePopup();']")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span [@ng-click='openTemplateClonePopup();']")
		public WebElementFacade btn_GDB_buildid_clone;		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Build ID')]/following-sibling::div")
		public WebElementFacade lbl_GDB_buildid_value;
		
		//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Eng. Order Id')]")
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Eng. Order Id')]")
		public WebElementFacade lbl_GDB_eng_orderid;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Eng. Order Id')]/following-sibling::div")
		public WebElementFacade lbl_GDB_eng_orderid_value;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Initiated By')]")
		public WebElementFacade lbl_GDB_initiatedby;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Initiated By')]/following-sibling::div")
		public WebElementFacade lbl_GDB_initiatedby_value;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Last Updated By')]")
		public WebElementFacade lbl_GDB_lastupdatedby;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Last Updated By')]/following-sibling::div")
		public WebElementFacade lbl_GDB_lastupdatedby_value;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Status')]")
		public WebElementFacade lbl_GDB_status;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='getHeaderData()']/preceding-sibling::i")
		public WebElementFacade btn_GDB_status_refresh;		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Status')]/following-sibling::div")
		public WebElementFacade lbl_GDB_status_value;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Serving Wire Center')]")
		public WebElementFacade lbl_GDB_servingWC;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Serving Wire Center')]/following-sibling::div")
		public WebElementFacade lbl_GDB_servingWC_value;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Initiated Date')]")
		public WebElementFacade lbl_GDB_intiateddate;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Initiated Date')]/following-sibling::div")
		public WebElementFacade lbl_GDB_intiateddate_value;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Last Updated Date')]")
		public WebElementFacade lbl_GDB_last_updateddate;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Last Updated Date')]/following-sibling::div")
		public WebElementFacade lbl_GDB_last_updateddate_value;
		
		@FindBy(xpath=".//*[@role='tablist']/li[7]")
		public WebElementFacade btn_gpon_FDH_second;
		
		@FindBy(xpath="//span[text()=' ONT']")
		public WebElementFacade btn_gpon_ONT;		
		
		//Working on only one Netwrok device.
		
		@FindBy(xpath=".//*[@id='tab:0']")
		public WebElementFacade btn_gpon_tab0;
		
		@FindBy(xpath="(.//button[@value='+'])[1]")
		public WebElementFacade btn_gpon_SA_expand;
		
		@FindBy(xpath="(.//*[@value='+'])[1]")
		public WebElementFacade btn_gpon_expand;
		
		@FindBy(xpath=".//*[@value='-']")
		public WebElementFacade btn_gpon_shrink;
		
		/*@FindBy(xpath=".//*[@id='expandAllDevices' and @value='+']")
		public WebElementFacade btn_GDB_expandall;
		
		@FindBy(xpath=".//*[@id='expandAllDevices' and @value='-']")
		public WebElementFacade btn_GDB_shrinkall;*/
		
		@FindBy(xpath=".//*[@infinite-scroll='loadMore()']/table/tbody/tr[1]/td[2]/input[@value='+']")
		public WebElementFacade btn_gpon_expand_slot1;
		
		@FindBy(xpath=".//*[@infinite-scroll='loadMore()']/table/tbody/tr[1]/td[9]/button/span")
		public WebElementFacade btn_gpon_delete_slot1;
		
		@FindBy(xpath=".//*[@infinite-scroll='loadMore()']/table/tbody/tr[1]/td[1]/label/input")
		public WebElementFacade cbk_gpon_select_slot1;
		
		@FindBy(xpath=".//*[@infinite-scroll='loadMore()']/table/tbody/tr[1]/td[8]/span")
		public WebElementFacade btn_gpon_remove_slot1;
		
		@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[3]/td[text()='Success']")
		public WebElementFacade lbl_gpon_slot2_success_msg;
		
		
		@FindBy(xpath=".//*[@ng-show='showDeviceForm']//./h4[@class='ng-binding']")
		public WebElementFacade lbl_gpon_devicecheck;
		
		@FindBy(xpath=".//*[@ng-model='aDevice.chkValue']")
		public WebElementFacade rdbtn_gpon_select;
		
		
		
		@FindBy(xpath=".//label")
		public List<WebElementFacade> lbl_gpon_create_fields;
		//public static String lbl_gpon_create_fields="//*[@alt='OLT']/div";
		
		@FindBy(className="badge")
		public List<WebElementFacade> btn_gpon_device_tab;
				
		@FindBy(className="ng-binding")
		public WebElementFacade btn_gpon_device_select;
				
			
			@FindBy(xpath= "//h4[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center']/button[7]")
			public WebElementFacade btn_NB_device;
			
			@FindBy(xpath= "//button[@id='tab:0']")
			public WebElementFacade btn_NB_device_box;
			
			@FindBy(xpath="//input[@class='cmdButton']")
			public WebElementFacade btn_NB_Expend;
			
			@FindBy(xpath="//select[@id='deviceType']")
			public WebElementFacade ddl_NB_deviceType;//1
			
			@FindBy(xpath="//select[@id='deviceSubType']")
			public WebElementFacade ddl_NB_deviceSubType;//2
		
		//End of network build
			
			@FindBy(xpath="//tbody/tr[@ng-repeat-start='aDevice in loaddata track by $index'][1]/td[@data-toggle='tooltip']/button")
			public WebElementFacade btn_NB_Deleteicons;
			
		
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@value='gponDeviceObj.NODE2TOPOLOGY']")
			public WebElementFacade tbx_NB_Topologyfield;
			
			
			//****  Sairam Changes -for chrome
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//*[@ng-click=\"openTopologyLookUp('GPON');\"]")
			@FindBy(xpath=".//*[@ng-click=\"openTopologyLookUp('GPON');\"]")
			public WebElementFacade btn_NB_Topologylookup;
			
			@FindBy(xpath="//input[@ng-click=\"openFdhClliLookUp('Fdh');\"]")
			public WebElementFacade btn_NB_FDHlookup;
			
			@FindBy(xpath="//*[@ng-model=\"invServiceDevLookUp.deviceClli\"]")
			public WebElementFacade tbx_NB_DeviceCLLI;
			
			@FindBy(xpath="//input[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_NB_DeviceCLLILookup;
			
			@FindBy(xpath=".//*[@id='row0createDevLookUpId']/div[1]/div/a")
			public WebElementFacade link_NB_Device_name;
			
			@FindBy(xpath="//input[@name='location']")
			public WebElementFacade tbx_NB_Location;
			
			@FindBy(xpath="(//input[@name='location'])[1]")
			public WebElementFacade tbx_NB_Location1;
					
			@FindBy(xpath="(//input[@name='location'])[2]")
			public WebElementFacade tbx_NB_Location2;
			
			//-------------GDB-Service Area-Associated Addresses ----------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//button[@ng-click='addMoreAdress(serviceArea.GDB_SERV_AREA_ID)']")
			public WebElementFacade btn_NB_serviceare_searchaddresses;
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//button[@ng-click='searchLocations()']")
			public WebElementFacade btn_NB_serviceare_searchaddresses_srchlcnicon;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//input[@ng-model='lookUp.BuildingCLLI']")
			public WebElementFacade tbx_NB_serviceare_searchaddresses_buildingclli;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'lookUpArea')]//div[starts-with(@id,'contenttablelookUpArea')]//div[starts-with(@id,'jqxWidget')]/div)[1]")
			public WebElementFacade cbx_NB_serviceare_searchaddresses_result1;
			
			
			
					
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//button[@ng-click='associateAddressToServiceArea()']")
			public WebElementFacade btn_NB_serviceare_searchaddresses_associtelcnicon;
					
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//span[@class='glyphicon glyphicon-cloud-upload ng-scope'])[1]")
			public WebElementFacade btn_NB_serviceare_searchaddresses_associteSAicon;
					
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//input[@ng-model='sAddress.GDB_SERV_ADDR_LOC_RANK']")
			public WebElementFacade tbx_NB_serviceare_searchaddresses_rank;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//td[@ng-bind='sAddress.GDB_SERV_ADDR_LOC_RANK']")
			public WebElementFacade lbl_NB_serviceare_searchaddresses_afterassociationrank;
					
				
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'lookUpArea')]//div[starts-with(@id,'columntablelookUpArea')]//div[starts-with(@id,'jqxWidget')]/div")
			public WebElementFacade cbx_NB_serviceare_searchaddresses_resultall;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//button[text()='Associate']")
			public WebElementFacade btn_NB_serviceare_searchaddresses_associateall;
			
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//div[@class='ng-binding ng-scope alert alert-danger']")
			public WebElementFacade lbl_NB_serviceare_searchaddresses_alertmsg;
			
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//button[contains(@ng-click,'removeIndividualServiceAreaBulk')])[1]")
					public WebElementFacade btn_NB_servicearea_associate_removeicon;
					
			@FindBy(xpath="(//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablelookUpArea')]//div[@tabindex='0'])[1]/div[1]")
            public WebElementFacade chk_NB_serviceare_searchaddresses_result1;

			@FindBy(xpath="//div[@ng-show='sAddress.rankMsg']/em")
            public WebElementFacade lbl_NB_servicearea_searchaddresses_rank_Error_message;
		
			//-----------		Alert Message Validation  -----------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]/button[@ng-disabled='disablePageMode']/..")
            public WebElementFacade lbl_NB_GDB_alert_msg;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]/button[@ng-disabled='disablePageMode']")
            public WebElementFacade btn_NB_GDB_alert_msg_icon;
					
					
			//---------------------------------------------------------------------------------------------------------------------------//
		
			//--------------	Location Look up 	--------------------//
			
			@FindBy(xpath=".//*[@id='loclkp' and @ng-click='init(aDevice.DEVICE_ID);toggleModal();setDeviceIdForGDB(aDevice.DEVICE_ID);']")
			public WebElementFacade btn_NB_Location_view;
			
			@FindBy(xpath="//input[@ng-model='locationlkp.AddressLine1']")
			public WebElementFacade tbx_NB_Location_address;
			
			@FindBy(xpath="//select[@ng-model='locationlkp.STATE']")
			public WebElementFacade ddl_NB_Location_state;		
			
			@FindBy(xpath="//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/a")
			public WebElementFacade lnk_addlcn;
			
			@FindBy(xpath="//div[contains(text(),'-10 of')]")
			public WebElementFacade lbl_NB_Location_lookupresultmorethan10;
			
			
			@FindBy(xpath=".//*[@id='loclkp' and @ng-click='init();toggleModal();setCurrentAddress(serviceAddress.GDB_SERV_ADDR_ID,$index);']")
			public WebElementFacade btn_SA_NB_Location_view;
			
			@FindBy(xpath="//div[@ng-show='emptyTable' and @class='ng-scope']")
			public WebElementFacade lbl_NB_Location_lookup_errorMsg;
			
			@FindBy(xpath="//locationlookupforgpon//button[@data-dismiss='modal']")
			public WebElementFacade btn_NB_Location_lookup_close;
			
			@FindBy(xpath=".//*[@ng-click='init();toggleModal();']/i")
			public WebElementFacade btn_NB_commonarea_Location_view;
			
			@FindBy(xpath=".//*[@value='gponDeviceObj.FULLADDRESS']//button[text()='Look Up' and @ng-click='searchLocation();']")
			public WebElementFacade btn_NB_commonarea_Location_lookup;
			
			@FindBy(xpath=".//*[@value='gponDeviceObj.FULLADDRESS']//*[@id='buildingCLLI']")
			public WebElementFacade tbx_NB_commonarea_buildclli;
			
			@FindBy(xpath=".//*[@ ng-click='addMoreAdress(serviceArea.GDB_SERV_AREA_ID)']")
			public WebElementFacade btn_NB_SA_Location_lookup;
			
			@FindBy(xpath=".//*[@ng-click='searchLocations()']")
			public WebElementFacade btn_NB_SA_association_Location_search;
			
			@FindBy(xpath=".//div[contains(@id,'contentlookUpArea')]/div[2]/div[1]/div[1]/div[1]/div/div/div")
			public WebElementFacade cbx_NB_SA_association_Location_select;
			
			@FindBy(xpath=".//*[@ng-controller='serviceAreaLocationSearchCtrl']//*[@ng-show='acti_deviceLookup_loader]")
			public WebElementFacade lbl_NB_SA_association_Location_loader;
			
			@FindBy(xpath=".//*[@ng-click='associateAddressToServiceArea()']")
			public WebElementFacade btn_NB_SA_associate_address_create;
			
			@FindBy(xpath=".//*[@ng-model='sAddress.GDB_SERV_ADDR_LOC_RANK']")
			public WebElementFacade tbx_NB_SA_associate_address_rank;
			
			@FindBy(xpath=".//*[@ng-click='associateServiceAreas(serviceArea,sAddress)']")
			public WebElementFacade btn_NB_SA_associate_address_location;
			
			@FindBy(xpath=".//*[@ng-model='lookUp.BuildingCLLI']")
			public WebElementFacade tbx_NB_SA_association_Locationclli;
			
			
			@FindBy(xpath="//select[@id='selfTechInstall']")
			public WebElementFacade ddl_NB_selfTechInstall;
			
			@FindBy(xpath="//input[@ng-model='aDevice.gponDeviceObj.RONTAID ']")
			public WebElementFacade tbx_NB_Rontaid;
			
			@FindBy(xpath=".//*[@value='Shared']")
			public WebElementFacade rbt_NB_sharedFlag;
			
			@FindBy(xpath=".//*[@value='Dedicated']")
			public WebElementFacade rbt_NB_dedicatedFlag;
			
			@FindBy(xpath="//input[@name='clli']")
			public WebElementFacade tbx_NB_CLLI;
			@FindBy(xpath="//input[@name='location']")
			public WebElementFacade tbx_NB_location_device;
			
			
			@FindBy(xpath=".//*[@ng-model='aDevice.gponDeviceObj.DEVICE_DESIGNATOR']")
			public WebElementFacade tbx_NB_Location_Designator;
			
			@FindBy(xpath="//select[@id='aerialBuried']")
			public WebElementFacade ddl_NB_aerialBuried;
			
			@FindBy(xpath="//select[@id='buildType']")
			public WebElementFacade ddl_NB_buildType;
			
			@FindBy(xpath=".//locationlookupforgpon//*[@id='buildingCLLI']")
			public WebElementFacade tbx_NB_buildclli;
			
			
			@FindBy(xpath="//tbody/tr[@ng-repeat-start='aDevice in loaddata track by $index'][1]/td[@class='nowrap-data ng-binding'][2]")
			public WebElementFacade lbl_device_status;
			
			@FindBy(xpath=".//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3]")
			public WebElementFacade lbl_oltdeviceGDB;
			
			@FindBy(xpath=".//*[@id='wcli']/following-sibling::td[3]")
			public WebElementFacade lbl_fiberlinkGDB;
			
			@FindBy(xpath="//select[@id='indoorOutdoor']")
			public WebElementFacade ddl_NB_indoorOutdoor;
			
			@FindBy(xpath="//select[@id='nosaCertificate']")
			public WebElementFacade ddl_NB_nosaCertificate;
			
			@FindBy(xpath="//select[@id='isDiverse']")
			public WebElementFacade ddl_NB_isDiverse;
			
			@FindBy(xpath="//*[@ng-model='aDevice.gponDeviceObj.RELAYRACK']")
			public WebElementFacade tbx_NB_RelayRack;
			
			@FindBy(xpath=".//*[@value='gponDeviceObj.NODE2TOPOLOGY']")
			public WebElementFacade tbx_gdb_topologyfield;
			
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='commonSection']//span[@class='glyphicon glyphicon-cloud-upload selected pointer ng-scope']")
			@FindBy(xpath="//table//tbody/tr[1]/td[7]/span")
			//@FindBy(xpath="(//table//span[@ng-show='showEditFiber' and contains(@ng-click,'createFiberLink')])[1]")
			public WebElementFacade btn_NB_Createicon;
			
			@FindBy(xpath="//span[@class='glyphicon glyphicon-remove ng-scope']")
			//@FindBy(xpath="(//span[contains(@ng-click,'deleteDeviceFromDeviceGroupConfirm')])[1]")
			public WebElementFacade btn_NB_removeicon;
			
			@FindBy(xpath="//input[@ng-model='aDevice.gponDeviceObj.SPLITTERGROUPNUMBER']")
			public WebElementFacade tbx_NB_SplitterNumber;
			
			@FindBy(xpath="//input[@ng-model='aDevice.gponDeviceObj.SPLITTERSTARTPORTNUMBER']")
			public WebElementFacade tbx_NB_Splitterport;
			
			@FindBy(xpath="//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-6'][1]/div[@class='form-control-static ng-binding']")
			public WebElementFacade NB_Build_Id;
		
			//Start of Netwrok Device creation
			
				
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'OLT')]")
			public WebElementFacade btn_gpon_OLT_box;
			
			
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'Splitter')]")
			public WebElementFacade btn_gpon_Splitter_box;
			
		
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'FDP')]")
			public WebElementFacade btn_gpon_FDP_box;

			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'MST')]")
			public WebElementFacade btn_gpon_MST_box;
			
	
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'MDU')]")
			public WebElementFacade btn_gpon_MDU_box;
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'Service Areas')]")
			public WebElementFacade btn_gpon_servicearea_box;
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'FDH')]")
			public WebElementFacade btn_gpon_FDH_box;
			
	
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'ONT')]")
			public WebElementFacade btn_gpon_ONT_box;
			
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'OLT')]/../..")
			public WebElementFacade btn_gpon_OLT_box1;
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'Splitter')]/../..")
			public WebElementFacade btn_gpon_Splitter_box1;
			
			@FindBy(xpath=".//*[contains(@ng-click,'openFdhClliLookUp(')]")
			public WebElementFacade btn_gpon_ONT_FDN4linkmst;
			
			@FindBy(xpath=".//*[@ng-controller='networkFdhClliLookupCtrl']//*[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_FDNdeviceloopup;
			
			@FindBy(xpath=".//*[@ng-controller='networkFdhClliLookupCtrl']//*[@value='LookUp']")
			public WebElementFacade btn_gpon_FDNdevicelookup;
			
			@FindBy(xpath=".//*[@id='dropdownlistArrowgridpagerlistcreateDevLookUpId']/div")
			public WebElementFacade ddl_gpon_FDNselectdevicelist;
			
			@FindBy(xpath=".//*[@ng-controller='networkFdhClliLookupCtrl']//*[@title='next']/div")
			public WebElementFacade btn_gpon_FDNdevicenext;
			
			@FindBy(xpath=".//*[@id='pagercreateDevLookUpId']//*[@title='previous']/div")
			public WebElementFacade btn_gpon_FDNdeviceprv;
			
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberDistNode_')]")
			public WebElementFacade ddl_gpon_ONTFDNMSTport;
			
			@FindBy(xpath="//select[starts-with(@id,'fiberDistNode_')]/option")
			public List<WebElement> ddl_gpon_ONTFDNMSTport_values;
			
			@FindBy(xpath=".//*[@name='fiberDistNode']")
			public WebElementFacade ddl_gpon_ONTFDNMSTport_Newchange;
			
			@FindBy(xpath=".//*[@id='fiberDistNode']")
			public List<WebElementFacade> ddl_gpon_ONTFDNMSTportlist;
			
			//########################################   MDU Device ##############################################//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click=\"openFdhClliLookUp('Fdh');\"]")
			public WebElementFacade btn_gpon_mdutab_fdhlookup;
			
			
			@FindBy(xpath=".//*[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_gpon_mdutab_fdhlookup_deviceclli;
			
			@FindBy(xpath=".//*[@ng-controller='networkFdhClliLookupCtrl']//*[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_gpon_mdutab_fdhlookup_lookup;
			
			@FindBy(xpath=".//*[@ng-controller='networkFdhClliLookupCtrl']//*[@title='previous']")
			public WebElementFacade btn_gpon_mdutab_fdhlookup_lookup_previous;
			
			
		/*	@FindBy(id="tab:1")
			public WebElementFacade btn_fiberlink1;
			
			@FindBy(id="tab:3")
			public WebElementFacade btn_fiberlink2;
			
			@FindBy(id="tab:5")
			public WebElementFacade btn_fiberlink3;
			
			@FindBy(id="tab:7")
			public WebElementFacade btn_fiberlink4;
			
			@FindBy(id="tab:9")
			public WebElementFacade btn_fiberlink5;
			
			@FindBy(id="tab:11")
			public WebElementFacade btn_fiberlink6;*/
			
			@FindBy(xpath=".//select[@id='start_node_id']")
			public WebElementFacade ddl_flgdbstartid;
			
			@FindBy(xpath=".//select[@id='end_node_id']")
			public WebElementFacade ddl_flgdbendid;
			
			//#############################   Fiber Link Validation ################################################################//
			
			
			@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//input[@ng-click='addSelectedDeviceId(aDevice.chkValue, aDevice.DEVICE_ID,aDevice.DEVICE_STATUS,aDevice.DEVICE_NM)'])[1]")
			public WebElementFacade cbx_NB_fiberlinkfirst;
			
			@FindBy(xpath="//tbody//td[4]//span[@ng-show='showEditFiber']")
			public List<WebElementFacade> lbl_CableIDList;
			
			@FindBy(xpath="//tbody//td[5]//span[@ng-show='showEditFiber']")
			public List<WebElementFacade> lbl_StartStrandNoList;
			
			//#############################   Device A 	Fiber Link		 ################################################################//
			
			@FindBy(xpath=".//*[@value='shelf=1/slot=1/port=1']")
			public WebElementFacade cbx_OLT_deviceAport1;
			
			@FindBy(xpath=".//*[@value='shelf=1/slot=1/port=2']")
			public WebElementFacade cbx_OLT_deviceAport2;
			
			@FindBy(xpath=".//*[@value='shelf=1/slot=1/port=3']")
			public WebElementFacade cbx_OLT_deviceAport3;		
			
			@FindBy(xpath=".//*[@value='1/2/1']")
			public WebElementFacade cbx_deviceAshelf1slot2port1;
			
			@FindBy(xpath=".//*[@value='1/2/2']")
			public WebElementFacade cbx_deviceAshelf1slot2port2;
			
			@FindBy(xpath=".//*[@value='1/2/3']")
			public WebElementFacade cbx_deviceAshelf1slot2port3;
			
			
			/********************New Changes on Fiber Link 7/2/17										********************************************/
	
			
			//@FindBy(xpath=".//*[@value='1/1/1']")
			@FindBy(xpath=".//input[@value='1/1/1']")
			public WebElementFacade cbx_deviceZshelf1slot1port1_Newport;
			
			@FindBy(xpath=".//*[@value='port=0']")
			public WebElementFacade cbx_deviceZshelf1slot1port1_ONT;
			
			@FindBy(xpath=".//*[@ng-click='openWireCenterCLLILookUp();']")
			public WebElementFacade btn_GDBFB_wirecenterclli_lookup;
			
			@FindBy(xpath=".//*[@ng-show='showTableAlert']/button")
			public WebElementFacade btn_alertmsg_GDBFB;
			
			@FindBy(xpath=".//*[@ng-click='selectMatch($index)' and contains(@id,'option-0')]")
			public WebElementFacade lbl_gdb_selectop0;
			
			@FindBy(xpath="//input[@ng-show='showSelectA']")
			public WebElementFacade cbk_selectAll_Aside_Fiberlink;
		
			@FindBy(xpath="//input[@ng-show='showSelectZ']")
			public WebElementFacade cbk_selectAll_Zside_Fiberlink;
			
			/************************************************************************************************************************************/
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//i[@ng-click='exportGDBToExcel();']")
			public WebElementFacade btn_altequitbuild_GDBexportexcel;
	
			
			@FindBy(xpath=".//*[contains(@ng-click,'searchGponNetworkGridSettings.openCreateGponPage')]")
			public WebElementFacade lbl_gdbsearchselect;
			
			@FindBy(xpath=".//*[@ng-model='networkFiberLinkData.cableId']")
			public WebElementFacade lbl_fibergdbcableid;
			
			@FindBy(xpath=".//*[@ng-model='gponDeviceObj.CABLEID']")
			public WebElementFacade tbx_fibergdbcableid;
			
			@FindBy(xpath=".//*[@ng-model='networkFiberLinkData.startStrandNo']")
			public WebElementFacade lbl_fibergdbstrtstrandid;
			
			
			@FindBy(xpath=".//*[@ng-model='networkFiberLinkData.arielOrBuried']")
			public WebElementFacade ddl_fibergdbaerialburied;
			
			@FindBy(xpath=".//*[@name='ProvisioningStatus' or @ng-model='networkFiberLinkData.PROVISIONINGSTATUS']")
			public WebElementFacade ddl_fibergdbprovisionstatus;
			
			@FindBy(xpath=".//*[@id='commonItems']//span[@ng-show='showEditFiber' and contains(@ng-click,'createFiberLink')]")
			public WebElementFacade btn_fibercreate;
			
			//@FindBy(xpath=".//*[@class='glyphicon glyphicon-remove ng-scope']")
			@FindBy(xpath=".//*[@id='commonItems']//span[@class='glyphicon glyphicon-remove warning pointer ng-scope']")
			public WebElementFacade btn_fiberremoveicon;
			
			@FindBy(xpath=".//*[@class='refreshicon glyphicon glyphicon-refresh ng-scope']")
			public WebElementFacade btn_fiberrefresh;
			
			@FindBy(xpath=".//*[@ng-click='removeLinkFromInventoryIndividualConfirm(altDeviceAttrForm.DEVICE_GROUP_ID,aDevice.DEVICE_ID,aDevice.DEVICE_STATUS,altDeviceAttrForm.DEVICE_GROUP_NM,aDevice.DEVICE_NM);']")
			public WebElementFacade btn_fiberlink_Deleteicon;
			
			@FindBy(xpath=".//*[@class='wrap-data ng-binding']")
			public WebElementFacade lbl_fibernotes;
			
			@FindBy(xpath=".//*[@class='glyphicon glyphicon-share floatL' and @id='cableID']")
			public WebElementFacade btn_fiber_cascade_cableid;
			
			@FindBy(xpath=".//*[@class='glyphicon glyphicon-share floatL' and @id='strandNumber']")
			public WebElementFacade btn_fiber_cascade_startstrandid;
			
			@FindBy(xpath=".//*[@class='glyphicon glyphicon-share floatL' and @id='aerialBuried']")
			public WebElementFacade btn_fiber_cascade_aerial;
			
			@FindBy(xpath=".//*[@id='provisioningStatus' and @class='glyphicon glyphicon-share floatL']")
			public WebElementFacade btn_fiber_cascade_provisionstatus;
			
			// GDB Top Action Buttons
			
			@FindBy(xpath=".//*[contains(@ng-hide,'networkDeviceGroupInfo.currentDeviceNm')]/label")
			public WebElementFacade lbl_gdb_devicelabelnum;
			
			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Add']")
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Add']")
			public WebElementFacade btn_gdb_adddevicecount;
			
			@FindBy(id="addDeviceAmount")
			public WebElementFacade tbx_gdb_adddevicecount;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Create']")
			public WebElementFacade btn_gdb_createall;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Create']/../..//*[@class='ov-button-warning']")
			public WebElementFacade btn_gdb_removeall;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Create']/../..//button[@class='ov-button-danger']")
			public WebElementFacade btn_gdb_deleteall;

			//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Create']/../..//*[@data-toggle='tooltip']")
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Create']/../..//i[@data-toggle='tooltip']")
			public WebElementFacade btn_gdb_refresh;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Device type')]")
			public WebElementFacade lbl_gdb_toprow_devicetype;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Device SubTypes')]")
			public WebElementFacade lbl_gdb_toprow_devicesubtypes;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Functional Status')]")
			public WebElementFacade lbl_gdb_toprow_funcstatus;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Functional Status')]/following-sibling::select")
			public WebElementFacade ddl_gdb_toprow_funcstatus;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Functional Status')]/following-sibling::span[text()='Please Select it']")
			public WebElementFacade lbl_gdb_toprow_funcstatus_errormsg;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Provisioning Status')]")
			public WebElementFacade lbl_gdb_toprow_provstatus;
			
			@FindBy(xpath=".//*[@id='commonItems']//*[contains(@ng-if,'networkDeviceGroupInfo.currentDeviceNm')]//*[@ class='col-lg-3 col-md-3 col-sm-6 col-xs-12']//*[contains(text(),'Topology')]")
			public WebElementFacade lbl_gdb_toprow_topology;
			
			
			@FindBy(xpath=".//*[@name='checkBoxSelect' and @ng-model='select.selectAll']")
			public WebElementFacade cbk_gdb_selectall;
			
			@FindBy(xpath=".//*[@alt='OLT']//*[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/div/label")
			public List<WebElementFacade> lbl_gdb_olt;		

			@FindBy(xpath=".//*[contains(text(),'Location Address')]")
			public WebElementFacade lbl_gdb_location;
			
			@FindBy(xpath=".//*[@class='alwaysshowme text-left']//*[contains(text(),'CLLI')]")
			public WebElementFacade lbl_gdb_clli;
			
			@FindBy(xpath=".//*[@ng-model='aDevice.gponDeviceObj.STRANDID']")
			public WebElementFacade tbx_gdb_ont_strandid;
			
			@FindBy(xpath=".//*[@ng-model='aDevice.gponDeviceObj.CHILDCABLEID']")
			public WebElementFacade tbx_gdb_ont_cableid;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody//td[10]")
			public WebElementFacade lbl_gdb_notes;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody//td[3]")
			public List<WebElementFacade> lbl_device_name;	
			
			
			
			//-------------			Fiber Link Audit Logs	---------------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='getFiberAuditLogs();']")
			public WebElementFacade btn_fiber_auditlogs;
			
			@FindBy(xpath=".//tab-heading[contains(text(),'Fiber audit Logs')]")
			public WebElementFacade tab_fiber_auditlogs;
			
			@FindBy(xpath=".//tab-heading[contains(text(),'Fiber audit Logs')]/a")
			public WebElementFacade btn_tab_fiber_auditlogs_clsicon;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Create']/../following-sibling::div/div[contains(text(),'Created Fiber Link :')]")
			public WebElementFacade lbl_fiber_auditlogs_createlog;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Delete']/../following-sibling::div/div[contains(text(),'Deleted Fiber link')]")
			public WebElementFacade lbl_fiber_auditlogs_deletelog;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[text()='Update']/../following-sibling::div/div[contains(text(),'Updated Fiber Link Attribute:')])[1]")
					public WebElementFacade lbl_fiber_auditlogs_updatelog;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[text()='Remove']/../following-sibling::div/div[contains(text(),'Removed Fiber Link :')])[1]")
					public WebElementFacade lbl_fiber_auditlogs_removelog;
			
			// ####################################################################################################################################################//
			//Cascade buttons on the GDb Screen .
			// ####################################################################################################################################################//
			
			@FindBy(xpath=".//*[starts-with(@id,'devType_')]")
			public WebElementFacade btn_gdb_cascade_devtype;
			
			@FindBy(xpath=".//*[starts-with(@id,'devSubType_')]")			
			public WebElementFacade btn_gdb_cascade_devsubtype;
			
			@FindBy(xpath=".//*[starts-with(@id,'provStatus_')]")			
			public WebElementFacade btn_gdb_cascade_provstatus;
			
			@FindBy(xpath=".//*[starts-with(@id,'sharedFlag_')]")			
			public WebElementFacade btn_gdb_cascade_shrdflag;
			
			@FindBy(xpath=".//*[starts-with(@id,'stackSeq_')]")		
			public WebElementFacade btn_gdb_cascade_stackSeq;
			
			@FindBy(xpath=".//*[starts-with(@id,'shelfIndicator_')]")		
			public WebElementFacade btn_gdb_cascade_shelfIndicator;
			
			@FindBy(xpath=".//*[starts-with(@id,'buildTemp_')]")				
			public WebElementFacade btn_gdb_cascade_buildTemp;
			
			@FindBy(xpath=".//*[starts-with(@id,'isDiverse_')]")		
			public WebElementFacade btn_gdb_cascade_isDiverse;
			
			@FindBy(xpath=".//*[starts-with(@id,'locationAdd_')]")				
			public WebElementFacade btn_gdb_cascade_locationAdd;
			
			@FindBy(xpath=".//*[starts-with(@id,'clli_')]")				
			public WebElementFacade btn_gdb_cascade_clli;
			
			@FindBy(xpath=".//*[starts-with(@id,'rackShelf_')]")		
			public WebElementFacade btn_gdb_cascade_rackShelf;
			
			@FindBy(xpath=".//*[starts-with(@id,'relayShelf_')]")		
			public WebElementFacade btn_gdb_cascade_rackShelf_ont;
			
			@FindBy(xpath=".//*[starts-with(@id,'devTemp_')]")				
			public WebElementFacade btn_gdb_cascade_devTemp;
			
			@FindBy(xpath=".//*[starts-with(@id,'mgmtVlan_')]")				
			public WebElementFacade btn_gdb_cascade_mgmtVlan;
			
			@FindBy(xpath=".//*[starts-with(@id,'gbIndicator_')]")		
			public WebElementFacade btn_gdb_cascade_gbIndicator;
			
			@FindBy(xpath=".//*[starts-with(@id,'nosaCert_')]")	
			public WebElementFacade btn_gdb_cascade_nosaCert;
			
			@FindBy(xpath=".//*[starts-with(@id,'ntwkNode_')]")				
			public WebElementFacade btn_gdb_cascade_ntwkNode;
			
			@FindBy(xpath=".//*[starts-with(@id,'elemNote_')]")				
			public WebElementFacade btn_gdb_cascade_elemNote;
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberIn_')]")				
			public WebElementFacade btn_gdb_cascade_fiberin; 
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberOut_')]")				
			public WebElementFacade btn_gdb_cascade_fiberout;
			
			@FindBy(xpath=".//*[starts-with(@id,'splitterNumber_')]")				
			public WebElementFacade btn_gdb_cascade_splitternumber; 
			
			@FindBy(xpath=".//*[starts-with(@id,'splitterStartPort_')]")				
			public WebElementFacade btn_gdb_cascade_splitterstartport;
			
			@FindBy(xpath=".//*[starts-with(@id,'rontaId_')]")				
			public WebElementFacade btn_gdb_cascade_ronatid; 
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberNode_')]")				
			public WebElementFacade btn_gdb_cascade_fibernode; 
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberNodePort_')]")				
			public WebElementFacade btn_gdb_cascade_fibernodeport; 
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberStrandId_')]")				
			public WebElementFacade btn_gdb_cascade_fiberstrandid;
			
			@FindBy(xpath=".//*[starts-with(@id,'fiberCable_')]")				
			public WebElementFacade btn_gdb_cascade_fibercable; 
			
			@FindBy(xpath=".//*[starts-with(@id,'techInstall_')]")				
			public WebElementFacade btn_gdb_cascade_techinstall;
			
			@FindBy(xpath=".//*[starts-with(@id,'ontId_')]")				
			public WebElementFacade btn_gdb_cascade_ontid;
			
			
			
//############################################### FIber Link Validation #################################################################################//
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[17]")
			public WebElementFacade btn_fiberlink_notes_slot1;
			
			@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//*[@ng-show='showEditFiber'])[11]")
			public WebElementFacade btn_fiberlink_edit_slot11;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-show='showSaveFiber'])[2]")
			public WebElementFacade btn_fiberlink_save_slot2;
			
			//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-show='showEditFiber'])[1]")
			@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//i[@ng-show='showEditFiber'])[1]")
			public WebElementFacade btn_fiberlink_edit_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[1]/label[1]/input")
			public WebElementFacade cbk_fiberlink_edit_slot1;
			
			//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-show='showEditFiber'])[2]")
			@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//*[@ng-show='showEditFiber'])[2]")
			public WebElementFacade btn_fiberlink_edit_slot2;
			
			//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-show='showEditFiber'])[3]")
			@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//*[@ng-show='showEditFiber'])[2]")
			public WebElementFacade btn_fiberlink_edit_slot3;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-show='showSaveFiber'])[1]")
			public WebElementFacade btn_fiberlink_save_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[text()='Fiber Link created successfully.']")
			public WebElementFacade btn_fiberlink_slot1_successmsg;
			
			@FindBy(xpath=".//*[@id='wcli']/input")
			public WebElementFacade tbx_fiberlink_wireclli_edit_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[10]/span")
			public WebElementFacade lbl_fiberlink_cableid_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[14]/span")
			public WebElementFacade btn_fiberlink_create_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[3]/td[10]//span")
			public WebElementFacade lbl_fiberlink_cableid_slot2;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr/td[10]/div/input")
			public WebElementFacade tbx_fiberlink_cableid_edit_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr/td[10]/div/span[@class='glyphicon glyphicon-share floatL']")
			public WebElementFacade btn_fiberlink_cableid_edit_cascade_slot1;			
			
			
			@FindBy(xpath=".//*[@id='strand']/label")
			public WebElementFacade lbl_fiberlink_strandnum_slot1;
			
			@FindBy(xpath=".//*[@id='strand']/div/input")
			public WebElementFacade tbx_fiberlink_strandnum_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]//*[@id='strand']//input")
			public WebElementFacade tbx_fiberlink_strandnum_edit_slot1;
			
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[3]/td[11]//span")
			public WebElementFacade lbl_fiberlink_strandnum_slot2;
			
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[11]/div/span[@class='glyphicon glyphicon-share floatL']")
			public WebElementFacade btn_fiberlink_strandnum_edit_cascade_slot1;
			
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]//*[@id='arial']//select")
			public WebElementFacade ddl_fiberlink_edit_aerial_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]//*[@id='arial']//span[@id='aerialBuried']")
			public WebElementFacade btn_fiberlink_aerial_edit_cascade_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[3]/td[12]//span")
			public WebElementFacade lbl_fiberlink_aerial_slot2;
			
			@FindBy(xpath=".//*[@id='arial']/span")
			public WebElementFacade lbl_fiberlink_aerial_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr/td[13]/span")
			public WebElementFacade lbl_fiberlink_provisionstatus_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]//select[contains(@id,'ProvisioningStatus')]")
			public WebElementFacade ddl_fiberlink_edit_provision_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]//span[contains(@id,'provisioningStatus')]")
			public WebElementFacade btn_fiberlink_provision_edit_cascade_slot1;
			
			@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[3]/td[13]//span")
			public WebElementFacade lbl_fiberlink_provision_slot2;

			//@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[1]//input")
			//@FindBy(xpath=".//*[@class='table_row table-responsive ov-lookup-result-block-scroll']//tbody//tr[1]//td//input")
			@FindBy(xpath="//b[contains(text(),'Device A')]/../../following-sibling::div[1]/input")
			public WebElementFacade cbk_fiberlink_checkbox_slot1;
			
		    //@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[15]/span")
			//@FindBy(xpath=".//*[@class='table_row table-responsive ov-lookup-result-block-scroll']//tbody/tr[1]/td[15]/span[1]")
			//@FindBy(xpath="//div[@class='table_row table-responsive ov-lookup-result-block-scroll']//tbody/tr[1]/td[15]/span[1]")
			//@FindBy(xpath="(//span[@class='glyphicon glyphicon-remove warning pointer ng-scope'])[1]")
			@FindBy(xpath=".//table[@id='demo-table']//tbody//td/span[contains(@class,'remove pointer')]")
			public WebElementFacade btn_fiberlink_remove_slot1;
			
			@FindBy(xpath="(//table[@id='demo-table']//tbody//td[@data-toggle='tooltip']/span[@ng-if=\"aDevice.DEVICE_STATUS == 'Success'\"])[1]")
			public WebElementFacade btn_created_fiberlink_remove_slot1;
			
			@FindBy(xpath="//*[@id=\"demo-table\"]/tbody//td[@data-toggle='tooltip']//span")
			public WebElementFacade btn_created_fiberlink_remove_slot01;
			
			//@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[3]/td[1]//input")
			@FindBy(xpath="//b[contains(text(),'Device A')]/../../following-sibling::div[1]/input")
			public WebElementFacade cbk_fiberlink_checkbox_slot2;
			
			//@FindBy(xpath="//*[@class='table_row table-responsive']//tbody/tr[3]/td[15]/span")
			@FindBy(xpath="(//span[@class='glyphicon glyphicon-remove warning pointer ng-scope'])[2]")
			public WebElementFacade btn_fiberlink_remove_slot2;
			
			@FindBy(xpath=".//div[@class='table_row table-responsive ov-lookup-result-block-scroll']//tbody/tr[1]/td[14]/span")
			public WebElementFacade btn_fibercreate_slot1;
			
			//@FindBy(xpath=".//*[@class='table_row table-responsive']//tbody/tr[1]/td[16]/span")
			@FindBy(xpath="//div[@class='table_row table-responsive ov-lookup-result-block-scroll']//tbody/tr[1]/td[16]/span[1]")
			public WebElementFacade btn_fiber_refresh_slot1;
			

			
			@FindBy(xpath=".//*[@ng-click='refreshAllFiberLinks(pageContentKey, currentGroupId);']")
			public WebElementFacade btn_fiber_refresh_all;
			
			@FindBy(xpath=".//*[@ng-model='select.selectAll']")
			public WebElementFacade btn_fiber_select_all;
			
			@FindBy(xpath=".//*[contains(@ ng-click,'deleteSelectedDeviceConfirm')]")
			public WebElementFacade btn_fiber_remove_all;			
			
			@FindBy(xpath="//legend/..//table//tr[1]//td[6]")
			public WebElementFacade lbl_Fiberlink;
		


			
//##################################################################################################################################################//
			
//############################################### GDB Fiber Link Edit screen #################################################################################//
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.WIRECENTERCLLI'])[1]")
			public WebElementFacade tbx_fiberlink_edit_wireclli1;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.CableId'])[1]")
			public WebElementFacade tbx_fiberlink_edit_cableid1;
					
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.StartStrandNo'])[1]")
			public WebElementFacade tbx_fiberlink_edit_startstrandno1;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.AerialOrBuried'])[1]")
			public WebElementFacade ddl_fiberlink_edit_aerialrburried1;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.aDeviceClli'])[1]")
			public WebElementFacade ddl_fiberlink_edit_Adeviceclli1;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='APORT'])[1]")
			public WebElementFacade ddl_fiberlink_edit_Adeviceport1;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.zDeviceClli'])[1]")
			public WebElementFacade ddl_fiberlink_edit_Zdeviceclli1;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='ZPORT'])[1]")
			public WebElementFacade ddl_fiberlink_edit_Zdeviceport1;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-model='aDevice.ProvisioningStatus'])[1]")
			public WebElementFacade ddl_fiberlink_edit_provisionstatus1;	
	
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//*[@id='commonItems']//input[@ng-model='select.selectAll']")
	public WebElementFacade btn_fiberlink_selectall_checkbox;	

			
//##################################################################################################################################################//
//############################################### GDB Service area #################################################################################//

	
			
			//@FindBy(xpath="//*[@ng-model='chkall']")
			
			@FindBy(xpath="//input[starts-with(@id,\"selectAllSA\")]")
			public WebElementFacade cbx_SA_all;
			

			
			@FindBy(xpath="//div[@class='ng-binding alert alert-danger']")
			public WebElementFacade lbl_SA_Delete_error;
	
			@FindBy(xpath="//span[text()=' Service Area']")
			public WebElementFacade btn_gpon_Servicearea;
			
			@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'Service Area')]")
			public WebElementFacade btn_gpon_Servicearea_box;
			
			@FindBy(xpath=".//*[@ng-model='serviceArea.DEVICE_NM']")
			public WebElementFacade tbx_NB_SA_device_name;
			
			@FindBy(xpath=".//input[@ng-model='serviceArea.GDB_SERV_AREA_LOCATION']")
			public WebElementFacade tbx_NB_SA_device_Location;
			
			@FindBy(xpath="(.//*[@id='commonItems']//td[starts-with(@ng-if,\"serviceArea.GDB_SERV_AREA_STATUS == 'Success'\")])[1]")
			public WebElementFacade tbx_serviceareaname; 			
			
			@FindBy(xpath=".//*[@ng-click='selectMatch($index)' and @class='ng-scope active']/a")
			public WebElementFacade lbl_NB_SA_device_name_select;
			
			@FindBy(xpath=".//*[@id='deviceLocation']")
			public WebElementFacade ddl_NB_SA_device_Location;// need to work on again after changes done in UI
		
			@FindBy(xpath="(//input[@id='serviceArea'])[1]")
			public WebElementFacade tbx_NB_SA_name;
			
			@FindBy(xpath="//button[@ng-click='addDeviceToDeviceGroup(networkDeviceGroupInfo.groupId, networkDeviceGroupInfo.groupNm, addDeviceAmount)']")
			public WebElementFacade btn_NB_SA_Add;
			
	        @FindBy(xpath="//input[@ng-model='addDeviceAmount']")
	        public WebElementFacade tbx_NB_SA_Add;
			
			@FindBy(xpath=".//*[@class='glyphicon glyphicon-cloud-upload ng-scope' and contains(@ng-if,'serviceArea.GDB_SERV_AREA_STATUS ==')]")// it will click only first create icon
			public WebElementFacade btn_NB_SACreateicon;
			
			@FindBy(xpath=".//*[@class='glyphicon glyphicon-cloud-upload ng-scope' and contains(@ng-if,'serviceAddress.GDB_SERV_ADDR_STATUS ==')]")
	        public WebElementFacade btn_NB_SA_Add_associate;
			
			@FindBy(xpath=".//*[@ng-click='associateServiceAreas(serviceArea)']")
	        public WebElementFacade btn_NB_SA_Address_associate_all;
			
			@FindBy(xpath=".//td[contains(@ng-if,'sAddress.GDB_SERV_ADDR_STATUS')]")
	        public WebElementFacade lbl_NB_SA_Add_associate_rank;
			
			@FindBy(xpath="//button[@ng-click=\"createServiceArea('createSelected',serviceAreas);\"]")
			public WebElementFacade btn_NB_SA_CreateAll;
			
			@FindBy(xpath=".//*[@class='glyphicon glyphicon-remove warning pointer ng-scope' and contains(@ng-if,'serviceArea.GDB_SERV_AREA_STATUS ==' )]")
			public WebElementFacade btn_NB_SA_Removeicon;
			
			@FindBy(xpath="//button[@ng-click=\"removeMultipleServiceAreaBulk('SERVICE_AREA_REMOVE',networkDeviceGroupInfo.groupId)\"]")
			public WebElementFacade btn_NB_SA_RemoveAll;
			
			
			 
			//@FindBy(xpath=".//*[@class='glyphicon glyphicon-trash']")
			@FindBy(xpath="(.//*[@class='warning fa fa-trash-o fa-lg'])[1]")
			public WebElementFacade btn_GDB_SA_Deleteicon;
			
			@FindBy(xpath="(.//*[@class='warning fa fa-trash-o fa-lg'])[2]")
			public WebElementFacade btn_GDB_SA_Deleteicon1;
			@FindBy(xpath="//button[@ng-click=\"removeMultipleServiceAreaBulk('SERVICE_AREA_DELETE',networkDeviceGroupInfo.groupId);\"]")
			public WebElementFacade btn_NB_SA_DeleteAll;
			
			@FindBy(xpath="//*[@ng-if=\"networkDeviceGroupInfo.currentDeviceNm == 'SERVICE_AREA'\"]//*[@ng-click=\"refreshAllDevices(networkDeviceGroupInfo.groupId,'serviceArea');\"]")
			public WebElementFacade btn_NB_SA_Refresh;
			
			@FindBy(xpath="//div[@ng-show='gdbLoader']")
			public WebElementFacade lbl_GDB_SA_Loader;
			
			@FindBy(xpath="//div[@class='ng-binding alert alert-success'] ")
			public WebElementFacade lbl_GDB_SA_Successmsg;
			
		    @FindBy(xpath=".//div[@infinite-scroll=\"loadMore('SERVICE_AREA')\"]//th[@class='table-rowHeader']")
		    public List<WebElementFacade> lbl_SA_Hearders;
		    
			@FindBy(xpath="//div[@infinite-scroll=\"loadMore('Service_Addresses')\"]//th[@class=\"table-rowHeader\"]")
			public List<WebElementFacade> lbl_SA_Associate_Hearders;
			
			@FindBy(xpath="//button[@ng-click=\"addDeviceToDeviceGroup(networkDeviceGroupInfo.groupId,'SERVICE_ADDRESS',addAddressesAmount)\"]")
			public WebElementFacade btn_SA_Associate_Add;
			
			@FindBy(xpath="//*[@ng-model='addAddressesAmount']")
			public WebElementFacade tbx_SA_Associate_Add;
			
			@FindBy(xpath="//button[@ng-click='associateServiceAreas(pageContentKey, networkDeviceGroupInfo.groupId, networkDeviceGroupInfo.groupNm);']")
			public WebElementFacade btn_SA_AssociateAll;
			
			@FindBy(xpath="//button[@ng-click=\"removeMultipleServiceAreaBulk('SERVICE_ADDRESS',networkDeviceGroupInfo.groupId);\"]")
			public WebElementFacade btn_SA_Associate_RemoveAll;
			
			@FindBy(xpath="//button[@ng-click=\"refreshAllDevices(networkDeviceGroupInfo.groupId,'serviceAddress');\"]")
			public WebElementFacade btn_SA_Associate_Refresh;
			
			@FindBy(xpath=".//td[@ng-if=\"serviceArea.GDB_SERV_AREA_STATUS == 'Success'\"][1]")
			public WebElementFacade lbl_serviceareaname;
			
			@FindBy(xpath="//div[@infinite-scroll=\"loadMore('SERVICE_AREA')\"]/table[@class='table table-bordered table1 table2']/tbody/tr")
			public List<WebElementFacade>  GDB_SA_Rowcount;
			
		//	@FindBy(xpath="//table[@class='table table-bordered table1 table2']//tr[1]//input[@id='loclkp']")
			@FindBy(xpath="//button[@ng-click='addMoreAdress(serviceArea.GDB_SERV_AREA_ID)']")
			public WebElementFacade  btn_GDB_SA_Associatelookup;
			
			//@FindBy(xpath="//*[@ng-repeat='serviceAddress in serviceAddresses track by $index'][1]//select[@id='state']")
			@FindBy(xpath="//h4[text()='Search Service Address(es)']/../..//label[text()='State']/following-sibling::select")
			public WebElementFacade  ddl_GDB_SA_adress_state;
			
			@FindBy(xpath="//button[@ng-click='searchLocation();']")
			public WebElementFacade  btn_GDB_SA_Locationlookup;
			
			@FindBy(xpath="//*[@id=\"fiberExistModal\"]//h5")
			public WebElementFacade  lbl_fiber_exists;
			
			@FindBy(xpath="//*[@id=\"fiberExistModal\"]//button//span")
			public WebElementFacade  btn_fiber_exists_ok;
			
			@FindBy(xpath=".//*[@id='startStrandNum']")
			public WebElementFacade btn_fiber_cascade_startstrandnum;
			
			@FindBy(xpath=".//*[@id='cableID']")
			public WebElementFacade btn_fiber_cascade_cableid_first;
			
			@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//td[contains(text(),'already')])")
			public WebElementFacade lbl_fiberlink_exist_error;
			
			
			@FindBy(xpath="//div[starts-with(@id,\"row0jqxGrid\")]/div[1]/div/a")
			public WebElementFacade  GDB_SA_Address;
			
			@FindBy(xpath="//div[@infinite-scroll=\"loadMore('Service_Addresses')\"]//tbody//td[6]/input")
			public WebElementFacade  tbx_SA_AssociateAddress_Rank;
			
			@FindBy(xpath="//div[@infinite-scroll=\"loadMore('Service_Addresses')\"]//tbody//td[7]/select")
			public WebElementFacade  ddl_AssociateAddress_SAName;
			
			@FindBy(xpath="//div[@infinite-scroll=\"loadMore('Service_Addresses')\"]//tbody//td[10]/button/span")
			public WebElementFacade  btn_SA_Associateicon;
			
			@FindBy(xpath="//div[@infinite-scroll=\"loadMore('Service_Addresses')\"]//tbody//td[11]/button/span")
			public WebElementFacade  btn_SA_Associate_Removeicon;
			
			@FindBy(xpath="//input[@ng-true-value=\"'New'\" and @checked='checked']")
			public WebElementFacade  cbx_GDB_New_device;
			
			
			@FindBy(xpath="//input[@ng-true-value=\"'Existing'\"]")
			public WebElementFacade  cbx_GDB_Existing_device;
			@FindBy(xpath="(.//input[@ng-model='aDevice.EXISTING'])[2]")
			public WebElementFacade  cbx_GDB_Existing_device1;
			
			@FindBy(xpath="//div[@id='mydeviceLookupModal']//input[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_GDB_DeviceCLLI;
			
			@FindBy(xpath="//div[@id='mydeviceLookupModal']//button[@ng-click='closeModal()']")
			public WebElementFacade btn_GDB_existingdevicelookup_clsicon;
			
			@FindBy(xpath="//div[@id='mydeviceLookupModal']//input[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_GDB_Device_lookup;
			
			@FindBy(xpath="//a[@ng-click='lookupGridSettings.selLukupValue(0)']")
			public WebElementFacade link_GDB_Devicename;
			
            
			//----------------  GDB Audit Logs ---------------------//
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[text()='Action Type']")
			public WebElementFacade lbl_gdbauditlogs_actiontypeheader;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Create']/../following-sibling::div/div[contains(text(),'Service Area with service area IDs')]")
			public WebElementFacade lbl_gdbauditlogs_serviceareacreatelog;			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Update']/../following-sibling::div/div[contains(text(),'Associated Service Addresse(s)')]")
			public WebElementFacade lbl_gdbauditlogs_serviceareaassociationlog;
			
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[text()='Update']/../following-sibling::div/div[contains(text(),'Removed Service Addresse(s) having Engg OrderID:')])[1]")
					public WebElementFacade lbl_gdbauditlogs_servicearearemovelog;
			
			//GDB Common attributes 
			
			
			@FindBy(xpath="//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-6']/label")
			public List<WebElementFacade> lbl_common_fields;
			
			@FindBy(xpath="//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-6']/div")
			public List<WebElementFacade> lbl_common_fields_values;
			
			@FindBy(xpath=".//a[@ng-click='exportGDBToExcel();']")
			public WebElementFacade btn_excel;
			
			@FindBy(xpath="//button[@ng-click='getAuditLogs();']")
			public WebElementFacade btn_getAuditLogs;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='GetLog']")
			public WebElementFacade btn_GDBauditlogs_getlogs;
			
			@FindBy(xpath=".//tab-heading[contains(text(),'Fiber audit Logs')]/a")
			public WebElementFacade icon_auditlogs_refresh;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Audit Log')]")
			public WebElementFacade lbl_GDBAuditlogs_Auditlog;
			
			@FindBy(xpath=".//i[@class='fa fa-refresh fa-2x ov-refresh-icon']")
			public WebElementFacade btn_refreshIconOfAuditLogs;
			
			@FindBy(xpath="//div[starts-with(@id, 'row0jqxGrid')]/div[2]/div")
			public WebElementFacade tbx_detailsTab;
			 
			@FindBy(xpath="//div[starts-with(@id, 'row0jqxGrid')]/div[1]/div")
			public WebElementFacade tbx_actionTypeTab;
			
			@FindBy(xpath="//div[starts-with(@id, 'row0jqxGrid')]/div[4]/div")
			public WebElementFacade tbx_eventDateTab;
			
			@FindBy(xpath="//tr[@ng-repeat-start='aDevice in loaddata track by $index']//td[4]")
            public WebElementFacade GDB_Device_Status;
			
			@FindBy(xpath=".//*[@ng-repeat-start='aDevice in loaddata track by $index']/td[3]")
			public WebElementFacade lbl_deviceGDB;	
			
			@FindBy(xpath=".//*[@ng-repeat='serviceArea in serviceAreas track by $index']/td[2]")
			public WebElementFacade tbx_serviceAreaName;
			
			@FindBy(xpath="//*[@ng-show='showDeviceForm']//label/h4")
			public WebElementFacade lbl_GDB_toprow;
			
			
			@FindBy(xpath=".//img[@title='Save as Excel']")
			public WebElementFacade btn_GDB_excel_download;
			
			@FindBy(xpath=".//*[@title='Look Up' and @ng-click='searchLocation();']")
			public WebElementFacade btn_gdb_locationlookUp;
			
			@FindBy(xpath=".//*[@ng-show='showData']//*[@title='previous']/div")
			public WebElementFacade btn_gdb_locationlookUp_previous;
			
			@FindBy(xpath=".//*[@ng-model='serviceAddress.GDB_SERV_ADDR_LOC_RANK']")
			public WebElementFacade tbx_GDB_SA_Rank;
			
			
			@FindBy(xpath=".//*[text()='Initiated Date']/following-sibling::div")
			public WebElementFacade lbl_GDB_Initialteddate;
			
			@FindBy(xpath=".//*[@ng-init='currentIndex=$index']/td[3]")
			public WebElementFacade lbl_GDB_serviceAreaName;
			
			@FindBy(xpath=".//*[@ng-click='createFiberLinks(gponPositionDevices[0].DEVICE_GROUP_ID);']")
			public WebElementFacade btn_GDB_fiberlink_createall;
			
			@FindBy(xpath=".//*[@id='topologylookup']/div[3]/div[1]/input")
			public WebElementFacade tbx_GDB_Topologyname;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='deleteLinksFromInventoryConfirm(altDeviceAttrForm.DEVICE_GROUP_ID,aDevice.DEVICE_ID,altDeviceAttrForm.DEVICE_GROUP_NM,networkDeviceGroupInfo.deviceCount);']")
			public WebElementFacade btn_GDB_fiberlink_deleteall;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click=\"deleteSelectedDeviceConfirm('fiber',altDeviceAttrForm.DEVICE_GROUP_ID,loadgponPositionDevices);hideAllDevice();\"]")
			public WebElementFacade btn_GDB_fiberlink_removeall;
			
			@FindBy(xpath= "//*[@class='tab-pane ng-scope active']//DIV[@ng-show='auditGrid']/../..//i[@data-toggle='tooltip' and @ng-click='init()']")
			public WebElementFacade btn_GDB_Auditlogs_refresh;
			
			//Working on only one Netwrok device.
			
//************************************* Expand All functionality Declarations *************************************//
			
			@FindBy(xpath=".//*[@ng-show='showDeviceForm']//*[@infinite-scroll='loadMore()']//tbody/tr[3]/td/input")
			public WebElementFacade btn_GDB_expand2;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'devType_')]")
			public WebElementFacade btn_GDB_device1_devicetype_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'devSubType_')]")
			public WebElementFacade btn_GDB_device1_devicesubtype_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'provStatus_')]")
			public WebElementFacade btn_GDB_device1_provstatus_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'sharedFlag_')]")
			public WebElementFacade btn_GDB_device1_sharedflag_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'isDiverse_')]")
			public WebElementFacade btn_GDB_device1_isDiverse_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'locationAdd_')]")
			public WebElementFacade btn_GDB_device1_locnaddr_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'clli_')]")
			public WebElementFacade btn_GDB_device1_deviceclli_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'rackShelf_')]")
			public WebElementFacade btn_GDB_device1_rackShelf_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'gbIndicator_')]")
			public WebElementFacade btn_GDB_device1_olt_gbindicator_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'nosaCert_')]")
			public WebElementFacade btn_GDB_device1_olt_nosacert_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'techInstall_')]")
			public WebElementFacade btn_GDB_device1_ont_techinstall_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'rontaId_')]")
			public WebElementFacade btn_GDB_device1_ont_rontaid_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'splitterNumber_')]")
			public WebElementFacade btn_GDB_device1_splitter_splitterno_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//span[contains(@id,'splitterStartPort_')]")
			public WebElementFacade btn_GDB_device1_splitter_splitterstartport_cascade;
			
			@FindBy(xpath=".//*[@infinite-scroll='loadMore()']//tbody/tr[2]//*[@class='ng-scope' and contains(@ng-if,'openDeviceForm')]//input[@value='aDevice.gponDeviceObj.FULLADDRESS']")
			public WebElementFacade lbl_GDB_device1_locationfield;
			
			
			//******************************************************************************************************************//
			
			//************************************* 22/2/2017 -- Manually adding the device ***********************************//
			
			@FindBy(xpath=".//*[@ng-model='aDevice.EXISTING' and @ng-model='aDevice.EXISTING' and @class='existingChkbox ng-pristine ng-untouched ng-valid']")
			public WebElementFacade cbx_GDB_existing_device_select;
			
			@FindBy(xpath=".//*[@ng-model='invServiceDevLookUp.deviceClli']")
			public WebElementFacade tbx_GDB_existing_device_deviceclli;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='lookUpDeviceDetails()']")
			public WebElementFacade btn_GDB_existing_device_lookup;
			
			@FindBy(xpath=".//*[@ng-click='lookupGridSettings.selLukupValue(1)']")
			public WebElementFacade lbl_GDB_existing_device_selct_device1;
			
			
			//******************************************************************************************************************//
			
			
			//***********************************US60475 - Changes - 7/10/2017 **********************************************//
			
			@FindBy(id ="tab:1")
			public WebElementFacade lbl_GDB_first_fiberlink;
			
			
			@FindBy(xpath=".//*[text()='Initiated By']//following-sibling::input")
			public WebElementFacade tbx_SearchTabGDB_Initialtedby;
			
			//******************************************************************************************************************//
			
			
			//***********************************	Loader Validations  **********************************************//
			
			@FindBy(xpath=".//div[@class='main-tab ng-isolate-scope']//div[@ng-show='submit_build_loader']")
			public WebElementFacade lbl_loader_gdbdevices;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='gdbLoader']")
			public WebElementFacade lbl_loader_servicearea;
			
			@FindBy(xpath="//div[contains(@id,'dropdownlistWrappergridpagerlistlookUpArea')]")
			public WebElementFacade btn_row_selector;
			
			@FindBy(xpath="//div[@role='option']/span[contains(text(),'20')]")
			public WebElementFacade lbl_device_row_option_20;
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ng-click='init()']")
			public WebElementFacade btn_refresh;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='acti_deviceLookup_loader'])[1]")
			public WebElementFacade lbl_loader_servicearea_lookup;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='port_loader']")
			public WebElementFacade lbl_loader_fiber;
			
			//******************************************************************************************************************//
			
			
			//*****************************Progress bar******************
			
			@FindBy(xpath="//div[@role='progressbar'][1]")
			public WebElementFacade lbl_progressbar_create;
			@FindBy(xpath="//div[@role='progressbar'][2]")
			public WebElementFacade lbl_progressbar_failed;
			@FindBy(xpath="//div[@role='progressbar'][3]")
			public WebElementFacade lbl_progressbar_notcreated;
			@FindBy(xpath="//span[@ng-click='openTemplateClonePopup();']/../following-sibling::div")
			public WebElementFacade lbl_build_id;
			
			
			//******************************************************************************************************************//
			
			//**************************************************************************************************************
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Delete']")
			public WebElementFacade lbl_gdb_audit_log_delete;
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Create']")
			public WebElementFacade lbl_gdb_audit_log_create;
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Update']")
			public WebElementFacade lbl_gdb_audit_log_update;
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Remove']")
			public WebElementFacade lbl_gdb_audit_log_remove;
			
			
			
			@Override
			public WebElementFacade getUniqueElementInPage() {
				// TODO Auto-generated method stub
				return null;
			}
	
			public void GDB_viewresultsearch(){				
				jsClick(lbl_gdbsearchselect);
				//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
				//WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_OLT));
			}
	
	//GPON Netwrok Build steps below
	
	public void gpon_ntwdevice_select(String devicetype) throws InterruptedException{
		//slf4jLogger.info(devicetype);
		waitForElement(btn_gpon_OLT); Thread.sleep(3000);
		switch(devicetype){
		case "OLT": jsClick(btn_gpon_OLT);					
					waitForElement(btn_gpon_OLT_box);
					jsClick(btn_gpon_OLT_box); break;
					
		case "ONT":	jsClick(btn_gpon_ONT);		
					waitForElement(btn_gpon_ONT_box);		
					jsClick(btn_gpon_ONT_box);break;
					
		case "FDP-12port": jsClick(btn_gpon_FDP);							
							waitForElement(btn_gpon_FDP_box);
							jsClick(btn_gpon_FDP_box);break;
							
		case "FDP-144port": jsClick(btn_gpon_FDP);							
							waitForElement(btn_gpon_FDP_box);
							jsClick(btn_gpon_FDP_box);break; 
			
		case "FDP": jsClick(btn_gpon_FDP);							
							waitForElement(btn_gpon_FDP_box);
							jsClick(btn_gpon_FDP_box);break; 
							
		case "SPLITTER": jsClick(btn_gpon_Splitter);						
						waitForElement(btn_gpon_Splitter_box);
						jsClick(btn_gpon_Splitter_box); break; 
						
		case "MST": jsClick(btn_gpon_MST);		
					waitForElement(btn_gpon_MST_box);
					jsClick(btn_gpon_MST_box);  break; 
					
		case "FDH":jsClick(btn_gpon_FDH);
					waitFor(btn_gpon_FDH_box);
					jsClick(btn_gpon_FDH_box); break; 
					
		case "MDU": 	jsClick(btn_gpon_MDU);
						waitFor(btn_gpon_MDU_box);
						jsClick(btn_gpon_MDU_box);break; 
						
		case "Service Area": jsClick(btn_gpon_servicearea);
							Thread.sleep(2000);
							waitForElement(btn_gpon_servicearea_box);
							jsClick(btn_gpon_servicearea_box); break; 
			}
			
	/*		if(devicetype.equals("ONT")){
				
				btn_gpon_ONT);
				//Thread.sleep(2000);	
				waitForElement(btn_gpon_ONT_box);
				
				btn_gpon_ONT_box);
				
			}else if(devicetype.equals("OLT")){
				
				btn_gpon_OLT);
				//Thread.sleep(2000);	
				waitForElement(btn_gpon_OLT_box);
				btn_gpon_OLT_box);
				
			}else if(devicetype.contains("FDP")){
				
				btn_gpon_FDP);
				//Thread.sleep(2000);
				waitForElement(btn_gpon_FDP_box);
				btn_gpon_FDP_box);
				
			}else if(devicetype.equals("SPLITTER")){
				
				btn_gpon_Splitter);
				//Thread.sleep(2000);
				waitForElement(btn_gpon_Splitter_box);
				btn_gpon_Splitter_box);
				
			}else if(devicetype.equals("MST")){
				
				btn_gpon_MST);
				Thread.sleep(2000);
				waitForElement(btn_gpon_MST_box);
				btn_gpon_MST_box);
				
			}else if(devicetype.equals("FDH")){
				
				btn_gpon_FDH);
				Thread.sleep(2000);
				btn_gpon_FDH_box);
				
			}else if(devicetype.equals("MDU")){
				
				btn_gpon_MDU);
				Thread.sleep(2000);
				btn_gpon_MDU_box);
				
			} else if(devicetype.equals("Service Area")){
				
				btn_gpon_servicearea);
				Thread.sleep(2000);
				waitForElement(btn_gpon_servicearea_box);
				btn_gpon_servicearea_box);
			} */
			Thread.sleep(5000);
			//btn_gpon_OLT_box);
			//Thread.sleep(2000);
			//rdbtn_gpon_select);
			/*if(btn_gpon_expand.isPresent()){
			btn_gpon_expand);
			Thread.sleep(2000);
			waitForElement(btn_gpon_shrink);
			}*/
			
			slf4jLogger.info(devicetype);
		} 
	
	public void createtab_GDB_excel(String devsubtype) throws Throwable {
		excel_access.ExcelReader(Page.envData.getFieldValue("GDB-Sheet"));
		slf4jLogger.info(excel_access+"Excel Share path");
		/*int RowCount = excel_access.getColumnCellCount("Input_Sheet");
		slf4jLogger.info("The Number of Rows is = " + RowCount);*/
		String wireclli=excel_access.getCellData("Input_Sheet", 1, 2);
		//slf4jLogger.info(Splitterport);
		String[] wireclli_parts = wireclli.split("\\.");				
		String wireclli_parts1 = wireclli_parts[0];
		// slf4jLogger.info(Splitterport_parts1+Splitterport_parts[1]);
		
		wireclli = excel_access.getCellData("Input_Sheet", 1, 1);
		//int orderid = Integer.parseInt(excel_access.getCellData("Input_Sheet", 1, 2));
		
		//slf4jLogger.info(wireclli+"Wireclli"+orderid+"orderid");
		if(actvtnpage.tbx_SWCCLLI.isCurrentlyVisible()){
		
		actvtnpage.tbx_SWCCLLI.sendKeys(excel_access.getCellData("Input_Sheet", 1, 1));
		actvtnpage.tbx_EngOrdId.sendKeys(wireclli_parts1);
		
		}		
		
	}
	
	public void GDB_Device_select(String devicetype) throws Throwable {
		switch(devicetype){
		
		case "OLT":	jsClick(btn_gpon_OLT_box); break;
		
		case "FDP-12port":	jsClick(btn_gpon_FDP_box); break;
		case "FDP-144port":	if(btn_gpon_FDH_second.isCurrentlyVisible()){
									jsClick(btn_gpon_FDH_second);
							} else {
								jsClick(btn_gpon_FDP_box);
							} break;
		case "SPLITTER":	jsClick(btn_gpon_Splitter_box); break;
		case "MST":			jsClick(btn_gpon_MST_box); break;
		case "ONT":			jsClick(btn_gpon_ONT_box); break;
		case "Service Area":	jsClick(btn_gpon_servicearea_box); break;
		case "GDB_SERVICEAREA": gpon_ntwrk_servicearea(); break;
		case "MDU": jsClick(btn_gpon_MDU_box); break;
		case "FDH":jsClick(btn_gpon_FDH_box);break;
		}
	/*	if(devicetype.equals("OLT")){
			
			btn_gpon_OLT_box);
						
		} else if(devicetype.equals("FDP-12port")){
			
			btn_gpon_FDP_box);
			
		} else if(devicetype.equals("FDP-144port")){
			if(btn_gpon_FDH_second.isCurrentlyVisible()){
				btn_gpon_FDH_second);
			} else {
				btn_gpon_FDP_box);
			}
			
			
		} else if(devicetype.equals("SPLITTER")){
			
			btn_gpon_Splitter_box);
			
		} else if(devicetype.equals("MST")){
			
			btn_gpon_MST_box);
			
		} else if(devicetype.equals("ONT")){
			
			btn_gpon_ONT_box);
			
		} else if(devicetype.equals("Service Area")){
			
			btn_gpon_servicearea_box);
			
		}*/
		
		Thread.sleep(2000);	
		waitForElement(btn_gpon_expand);
	}
	
	public void gpon_ntwrk_servicearea() throws Throwable{
		//gdbcreatepage.gpon_ntwdevice_select(component);
		String Devicename = lbl_deviceGDB.getText();
		System.out.println("Device name "+Devicename);
		long l = System.currentTimeMillis();
		int Time = (int) (l/2);
		
		jsClick(btn_gpon_Servicearea);
			Thread.sleep(2000);
			jsClick(btn_gpon_Servicearea_box);
		    /*if(gdbcreatepage.btn_GDB_SA_Deleteicon.isEnabled()){  
		    	throw new Error("Service Area delete icon is Enable before Creation");
		    }*/
			Thread.sleep(5000);
			tbx_NB_SA_device_name.type(Devicename);
			waitForElement(getDriver().findElement(By.xpath(".//strong[text()='"+Devicename+"']")));
			Thread.sleep(1000);
			//tbx_NB_SA_device_name.sendKeys(Keys.ENTER);
			jsClick(getDriver().findElement(By.xpath(".//strong[text()='"+Devicename+"']")));
			tbx_NB_SA_device_Location.typeAndEnter("7");
			//waitForElement(getDriver().findElement(By.xpath(".//strong")));
			//tbx_NB_SA_device_Location.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			//tbx_NB_SA_device_name.sendKeys(Keys.ENTER);
			//jsClick(getDriver().findElement(By.xpath(".//strong")));
			tbx_NB_SA_name.clear();
			Thread.sleep(2000);
			tbx_NB_SA_name.sendKeys("SA_"+loginPage.getDate("HH:mm:ss").replaceAll(":", ""));
		    //fill_fields_from("OVCreateGDBPage","GDB-Device create","GPONSA");
		    //fill_fields_from("OVActivationPage","GDB-Device create","GPONSA");
		    Thread.sleep(2000);
		    jsClick(btn_NB_SACreateicon);
		    waitForElement(lbl_loader_servicearea);
		    if(!lbl_loader_servicearea.getText().trim().contains("Creating Service Area")){
		    	slf4jLogger.debug("Service Area loader is not displayed for create");
		    }
			waitForElement(tbx_serviceareaname);
			/*if(!gdbcreatepage.btn_GDB_SA_Deleteicon.isEnabled()){  
		    	throw new Error("Service Area delete icon is not Enable after Creation");
		    }*/
			//gdbcreatepage.btn_GDB_SA_Deleteicon.shouldBeEnabled();	
			slf4jLogger.info("Service Area created sucessfully");
			slf4jLogger.info("Service Area name is "+tbx_serviceareaname.getText());
	} 
	
	public void gdbfiberlink_newapproach() throws Throwable{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		int col=0,row=excel_access.getColumnCellCount("Sheet1");
		slf4jLogger.info(row+"Last row");
		
		int i=1;
		do {		
			
			
			String box1=loginPage.getDriver().findElement(By.id("tab:"+(i-1))).getText();
			
			String gdbbox1=lbl_gpon_devicecheck.getText();
			slf4jLogger.info(gdbbox1+"GDB box1 name");
			String[] gdbdeviceparts=gdbbox1.split("\\(");
			gdbbox1 = gdbdeviceparts[0].replaceAll("\\s+","");
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i-1))));
			Thread.sleep(3000);
			while(!lbl_GDB_toprow.getText().equals(box1)){
				Thread.sleep(1000);
				slf4jLogger.info(box1+lbl_GDB_toprow.getText());
			}
						
			String deviceA=lbl_oltdeviceGDB.getText();
			
			
			String box2=loginPage.getDriver().findElement(By.id("tab:"+(i+1))).getText();
			
			String gdbbox2=lbl_gpon_devicecheck.getText();
			slf4jLogger.info(gdbbox2+"GDB box1 name");
			String[] gdbdeviceparts2=gdbbox2.split("\\(");
			gdbbox2 = gdbdeviceparts2[0].replaceAll("\\s+","");
			
			slf4jLogger.info(box2);
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
			Thread.sleep(5000);
			while(!lbl_GDB_toprow.getText().equals(box2)){
				Thread.sleep(1500);
				slf4jLogger.info(box2+lbl_GDB_toprow.getText());
			}
			
			String deviceZ=lbl_oltdeviceGDB.getText();
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(ddl_flgdbstartid));
			
		
			ddl_flgdbstartid.selectByValue(deviceA);
			Thread.sleep(8000);
			waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
			ddl_flgdbendid.selectByValue(deviceZ);
			Thread.sleep(5000);
			waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
				jsClick(cbx_deviceAshelf1slot2port1);
				
			} else if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
				jsClick(cbx_OLT_deviceAport1);
				
			} 	 
			
			Thread.sleep(2000);
			
		
			
			if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
			Thread.sleep(2000);			
			
				
				
	
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		 
	
		
		
		ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
		Thread.sleep(1000);	
				
		
		
		ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
		Thread.sleep(1000);
		
		
		
		lbl_fibergdbcableid.sendKeys(date1+i);
		Thread.sleep(3000);
		lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
		Thread.sleep(3000);
			
		//btn_fiber_cascade_startstrandid);
		//Thread.sleep(2000);
		
		if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
			jsClick(btn_alertmsg_GDBFB);
			Thread.sleep(2000);
			lbl_fibergdbstrtstrandid.sendKeys("100");
			Thread.sleep(3000);
			jsClick(btn_fiber_cascade_startstrandid);
			Thread.sleep(2000);
			
		}
		
		
		
		jsClick(btn_GDB_fiberlink_createall);
			Thread.sleep(6000);
			
			switch(gdbbox1){
			
			case "OLT": switch(gdbbox2){
							case "FDP": col=4; break;			
							}
			
			case "FDP": switch(gdbbox2){
						case "Splitter": col=8; break;			
						}
							col=16; break;	
			
			case "Splitter": col=12; break;		
			
			case "MST" :col=20; break;			
			
			}
			
			excel_access.setcelldata("GDB-Sheet","Sheet1", row, col, lbl_fiberlinkGDB.getText());
			
		i=i+2;
		if(!loginPage.isElementVisible(By.id("tab:"+(i)))){
			slf4jLogger.info("Not visible or MST device is Present");
			break;
		}

		
		} while(i!=0);
		
	}
	
	
	public void gdbfiberlink() throws Throwable{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		//String tabclick=;8
		
		int i=1;
		
		
		do {		
			
			
			String box1=loginPage.getDriver().findElement(By.id("tab:"+(i-1))).getText();
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i-1))));
			Thread.sleep(3000);
			while(!lbl_GDB_toprow.getText().equals(box1)){
				Thread.sleep(1000);
				slf4jLogger.info(box1+lbl_GDB_toprow.getText());
			}
						
			String deviceA=lbl_oltdeviceGDB.getText();
			
			
			String box2=loginPage.getDriver().findElement(By.id("tab:"+(i+1))).getText();
			slf4jLogger.info(box2);
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
			Thread.sleep(5000);
			while(!lbl_GDB_toprow.getText().equals(box2)){
				Thread.sleep(1500);
				slf4jLogger.info(box2+lbl_GDB_toprow.getText());
			}
			
			String deviceZ=lbl_oltdeviceGDB.getText();
			
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(ddl_flgdbstartid));
			
			if(btn_fiber_refresh_all.isEnabled() || btn_fiber_remove_all.isEnabled() || btn_fiber_select_all.isEnabled() || btn_gdb_createall.isEnabled() || btn_fiber_auditlogs.isEnabled() ){
			
			//*************************** New Changes to over come the delay 8/3/17
				ddl_flgdbstartid.selectByValue(deviceA);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for start device");
				}
				Thread.sleep(8000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
				ddl_flgdbendid.selectByValue(deviceZ);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for end device");
				}
				Thread.sleep(5000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
				jsClick(cbx_OLT_deviceAport1);
			} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
				jsClick(cbx_deviceAshelf1slot2port1);
					
			} 	 
			
						
			Thread.sleep(2000);			
	
			
			if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
			Thread.sleep(2000);			
			
				
				
	
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		 
		
		 
		
		
		ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
		Thread.sleep(1000);	
				
		
		
		ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
		Thread.sleep(1000);
		
		
		
		lbl_fibergdbcableid.sendKeys(date1+i);
		Thread.sleep(3000);
		lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
		Thread.sleep(3000);
			
		
		if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
			jsClick(btn_alertmsg_GDBFB);
			Thread.sleep(2000);
			lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
			Thread.sleep(3000);
			jsClick(btn_fiber_cascade_startstrandid);
			Thread.sleep(2000);
			
		}
		
		
		
		jsClick(btn_GDB_fiberlink_createall);
			Thread.sleep(6000);
			
		
		i=i+2;
		if(!loginPage.isElementVisible(By.id("tab:"+(i)))/*|| loginPage.getDriver().findElement(By.id("tab:"+(i-1))).getText().contains("MST")*/){
			slf4jLogger.info("Not visible or MST device is Present");
			break;
		}
			}
		
		} while(i!=0);
	}
	public void gdbAll_links_establish(){ try {
		int i=1;
			String box1=loginPage.getDriver().findElement(By.id("tab:"+(i-1))).getText();		
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i-1))));
			Thread.sleep(3000);		
			while(!lbl_GDB_toprow.getText().equals(box1)){
				Thread.sleep(1000);
				slf4jLogger.info(box1+lbl_GDB_toprow.getText());
			}
						
			String deviceA=lbl_oltdeviceGDB.getText();
			String box2=loginPage.getDriver().findElement(By.id("tab:"+(i+1))).getText();
			slf4jLogger.info(box2);
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
			Thread.sleep(5000);
			while(!lbl_GDB_toprow.getText().equals(box2)){
				Thread.sleep(1500);
				slf4jLogger.info(box2+lbl_GDB_toprow.getText());
			}
			
			String deviceZ=lbl_oltdeviceGDB.getText();	
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
			Thread.sleep(2000);
			waitForElement(ddl_flgdbstartid);
			
			if(btn_fiber_refresh_all.isEnabled() || btn_fiber_remove_all.isEnabled() || btn_fiber_select_all.isEnabled() || btn_gdb_createall.isEnabled() || btn_fiber_auditlogs.isEnabled() ){
			
			//*************************** New Changes to over come the delay 8/3/17
				ddl_flgdbstartid.selectByValue(deviceA);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for start device");
				}
				Thread.sleep(8000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
				ddl_flgdbendid.selectByValue(deviceZ);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for end device");
				}
				Thread.sleep(5000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbk_selectAll_Aside_Fiberlink.isCurrentlyVisible()){
				jsClick(cbk_selectAll_Aside_Fiberlink);		
			} else throw new Error("A side Fiberlink select all check box is not avaliable");
			
			Thread.sleep(5000);			
			if(cbk_selectAll_Zside_Fiberlink.isCurrentlyVisible()){
				jsClick(cbk_selectAll_Zside_Fiberlink);
			} else throw new Error("Z side Fiberlink select all check box is not avaliable");  
			
			Thread.sleep(2000);
		 DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		 
		ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
		Thread.sleep(1000);	

		ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
		Thread.sleep(1000);
	
		lbl_fibergdbcableid.sendKeys(date1+i);
		Thread.sleep(3000);
		lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
		Thread.sleep(3000);
			if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
			jsClick(btn_alertmsg_GDBFB);
			Thread.sleep(2000);
			lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
			Thread.sleep(3000);
			jsClick(btn_fiber_cascade_startstrandid);
			
				Thread.sleep(2000);
		}
			
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	public void gdblinkestablish(){ try {
		int i=1;
			String box1=loginPage.getDriver().findElement(By.id("tab:"+(i-1))).getText();		
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i-1))));
			Thread.sleep(3000);		
			while(!lbl_GDB_toprow.getText().equals(box1)){
				Thread.sleep(1000);
				slf4jLogger.info(box1+lbl_GDB_toprow.getText());
			}
						
			String deviceA=lbl_oltdeviceGDB.getText();
			String box2=loginPage.getDriver().findElement(By.id("tab:"+(i+1))).getText();
			slf4jLogger.info(box2);
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
			Thread.sleep(5000);
			while(!lbl_GDB_toprow.getText().equals(box2)){
				Thread.sleep(1500);
				slf4jLogger.info(box2+lbl_GDB_toprow.getText());
			}
			
			String deviceZ=lbl_oltdeviceGDB.getText();	
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
			Thread.sleep(2000);
			waitForElement(ddl_flgdbstartid);
			
			if(btn_fiber_refresh_all.isEnabled() || btn_fiber_remove_all.isEnabled() || btn_fiber_select_all.isEnabled() || btn_gdb_createall.isEnabled() || btn_fiber_auditlogs.isEnabled() ){
			
			//*************************** New Changes to over come the delay 8/3/17
				ddl_flgdbstartid.selectByValue(deviceA);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for start device");
				}
				Thread.sleep(8000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
				ddl_flgdbendid.selectByValue(deviceZ);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for end device");
				}
				Thread.sleep(5000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
				jsClick(cbx_OLT_deviceAport1);
			} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
				jsClick(cbx_deviceAshelf1slot2port1);
					
			} 	 		
			Thread.sleep(2000);			
			if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
			Thread.sleep(2000);
		 DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		
		ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
		Thread.sleep(1000);	

		ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
		Thread.sleep(1000);
	
		lbl_fibergdbcableid.sendKeys(date1+i);
		Thread.sleep(3000);
		lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
		Thread.sleep(3000);
			if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
			jsClick(btn_alertmsg_GDBFB);
			Thread.sleep(2000);
			lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
			Thread.sleep(3000);
			jsClick(btn_fiber_cascade_startstrandid);
			
				Thread.sleep(2000);
		}
			
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	public void gdb2ndlinkestablish(){ try {
		int i=3;
			String box1=loginPage.getDriver().findElement(By.id("tab:"+(i-1))).getText();		
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i-1))));
			Thread.sleep(3000);		
			while(!lbl_GDB_toprow.getText().equals(box1)){
				Thread.sleep(1000);
				slf4jLogger.info(box1+lbl_GDB_toprow.getText());
			}
						
			String deviceA=lbl_oltdeviceGDB.getText();
			String box2=loginPage.getDriver().findElement(By.id("tab:"+(i+1))).getText();
			slf4jLogger.info(box2);
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
			Thread.sleep(5000);
			while(!lbl_GDB_toprow.getText().equals(box2)){
				Thread.sleep(1500);
				slf4jLogger.info(box2+lbl_GDB_toprow.getText());
			}
			
			String deviceZ=lbl_oltdeviceGDB.getText();	
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
			Thread.sleep(2000);
			waitForElement(ddl_flgdbstartid);
			
			if(btn_fiber_refresh_all.isEnabled() || btn_fiber_remove_all.isEnabled() || btn_fiber_select_all.isEnabled() || btn_gdb_createall.isEnabled() || btn_fiber_auditlogs.isEnabled() ){
			
			//*************************** New Changes to over come the delay 8/3/17
				ddl_flgdbstartid.selectByValue(deviceA);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for start device");
				}
				Thread.sleep(8000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
				ddl_flgdbendid.selectByValue(deviceZ);
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for end device");
				}
				Thread.sleep(5000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
				jsClick(cbx_OLT_deviceAport1);
			} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
				jsClick(cbx_deviceAshelf1slot2port1);
					
			} 	 		
			Thread.sleep(2000);			
			if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
			Thread.sleep(2000);
		 DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		
		ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
		Thread.sleep(1000);	

		ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
		Thread.sleep(1000);
	
		lbl_fibergdbcableid.sendKeys(date1+i);
		Thread.sleep(3000);
		lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
		Thread.sleep(3000);
			if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
			jsClick(btn_alertmsg_GDBFB);
			Thread.sleep(2000);
			lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
			Thread.sleep(3000);
			jsClick(btn_fiber_cascade_startstrandid);
			
				Thread.sleep(2000);
		}
			
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
		
	
		
	public void gdblinkestablish(int count){ try {
		int i=1;
		String deviceA=null;	
		String deviceZ=null;	
			System.out.println(count);
			while(i<=count){
				System.out.println(i);
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:0")));
			Thread.sleep(3000);
		
				if(lbl_oltdeviceGDB.isCurrentlyVisible()){
					deviceA=lbl_oltdeviceGDB.getText();
				} if(isElementVisible(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])["+i+"]"))){
					deviceA=getDriver().findElement(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])["+i+"]")).getText().trim();
				}
			
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:2")));
			Thread.sleep(5000);			
			
			deviceZ=lbl_oltdeviceGDB.getText();
			if(lbl_oltdeviceGDB.isCurrentlyVisible()){
				deviceZ=lbl_oltdeviceGDB.getText();
			} if(isElementVisible(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])["+i+"]"))){
				deviceZ=getDriver().findElement(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])["+i+"]")).getText().trim();
			}
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:1")));
			Thread.sleep(2000);
			waitForElement(ddl_flgdbstartid);
			
			if(btn_fiber_refresh_all.isEnabled() || btn_fiber_remove_all.isEnabled() || btn_fiber_select_all.isEnabled() || btn_gdb_createall.isEnabled() || btn_fiber_auditlogs.isEnabled() ){
			
			
				ddl_flgdbstartid.selectByValue(deviceA);
				//waitForElement(lbl_loader_fiber);
				/*if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for start device");
				}*/
				Thread.sleep(8000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
				ddl_flgdbendid.selectByValue(deviceZ);
				//waitForElement(lbl_loader_fiber);
				/*if(!lbl_loader_fiber.getText().trim().contains("Loading Ports.")){
					slf4jLogger.debug("Device port loader is not displayed for end device");
				}*/
				Thread.sleep(5000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
				jsClick(cbx_OLT_deviceAport1);
			} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
				jsClick(cbx_deviceAshelf1slot2port1);
					
			} 	 
			
						
			Thread.sleep(2000);			
	
			
			if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
			Thread.sleep(2000);	
			
		}
			
			i=i+1;}
			
			DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
			Date date = new Date();
			 String date1= dateFormat.format(date);
			 slf4jLogger.info(date1);
			 
			
			 
			
			
			ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
			Thread.sleep(1000);	
					
			
			
			ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
			Thread.sleep(1000);
			
			
			
			lbl_fibergdbcableid.sendKeys(date1+i);
			Thread.sleep(3000);
			lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
			Thread.sleep(3000);
				
			
			if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
				jsClick(btn_alertmsg_GDBFB);
				Thread.sleep(2000);
				lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
				Thread.sleep(3000);
				jsClick(btn_fiber_cascade_startstrandid);
				
					Thread.sleep(2000);
				
				
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	public void top_section_GDBvalidation(String device){
		String devicelabel=".//*[@ng-show='showDeviceForm']//*[contains(text(),'"+device+" (1)')]";
		if(loginPage.getDriver().findElement(By.xpath(devicelabel)).isDisplayed()){
			if(btn_gdb_adddevicecount.isEnabled() && tbx_gdb_adddevicecount.isPresent() && btn_gdb_createall.isEnabled() && btn_gdb_removeall.isEnabled() && btn_gdb_deleteall.isEnabled() && btn_gdb_refresh.isEnabled()){
				if(lbl_gdb_toprow_devicetype.isPresent() && lbl_gdb_toprow_devicesubtypes.isPresent()
						&& lbl_gdb_toprow_funcstatus.isPresent()
						&& lbl_gdb_toprow_provstatus.isPresent()
						&& lbl_gdb_toprow_topology.isPresent())
				slf4jLogger.info("pass");
			} else throw new Error("fail");
			
		} else throw new Error("fail");
	}
	
	public void down_section_GDBvalidation(String str1){
		if(!cbk_gdb_selectall.isEnabled() && btn_NB_Createicon.isEnabled() && btn_NB_removeicon.isCurrentlyEnabled() && !btn_NB_Deleteicons.isEnabled()){
			slf4jLogger.info("pass");
		} else throw new Error("fail");
	}
	
	public void cascadebuttonvalidation(String str1){
		if(str1.equals("OLT")){
			if(btn_gdb_cascade_devtype.isEnabled() && btn_gdb_cascade_devsubtype.isEnabled()
					&& btn_gdb_cascade_provstatus.isEnabled()
					&& btn_gdb_cascade_shrdflag.isEnabled()
					&& btn_gdb_cascade_stackSeq.isEnabled()
					&& btn_gdb_cascade_shelfIndicator.isEnabled()
					&& btn_gdb_cascade_buildTemp.isEnabled()
					&& btn_gdb_cascade_isDiverse.isEnabled()
					&& btn_gdb_cascade_locationAdd.isEnabled()
					&& btn_gdb_cascade_clli.isEnabled()
					&& btn_gdb_cascade_rackShelf.isEnabled()
					&& btn_gdb_cascade_devTemp.isEnabled()
					&& btn_gdb_cascade_mgmtVlan.isEnabled()
					&& btn_gdb_cascade_gbIndicator.isEnabled()
					&& btn_gdb_cascade_nosaCert.isEnabled()
					&& btn_gdb_cascade_ntwkNode.isEnabled()
					&& btn_gdb_cascade_elemNote.isEnabled()){
				slf4jLogger.info("pass");
				
			}else throw new Error("fail");
		}
	}
	
	public void add_moredevice(String addcount) throws InterruptedException{	
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 500);
		
		tbx_gdb_adddevicecount.type(addcount);
		jsClick(btn_gdb_adddevicecount);
		//wait.until(ExpectedConditions.visibilityOf(loginPage.getDriver().findElement(By.xpath(".//*[@ng-show='showDeviceForm']//*[@infinite-scroll='loadMore()']//tbody/tr["+(Integer.parseInt(addcount)+2)+"]/td/input"))));
		wait.until(ExpectedConditions.visibilityOf(loginPage.getDriver().findElement(By.xpath(".//*[@ng-show='showDeviceForm']//tbody/tr["+(Integer.parseInt(addcount)+1)+"]/td/input"))));
	}
	
	public void GDB_functionality_validation(String action) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		
		switch(action){
		case "Delete 2nd Device component":
			jsClick(loginPage.getDriver().findElement(By.id("tab:2")));
			Thread.sleep(3000);
			jsClick(btn_gpon_delete_slot1);
            Thread.sleep(1000);
			String msg1=loginPage.getDriver().switchTo().alert().getText();
			if(loginPage.getDriver().switchTo().alert().getText().contains("You are about to delete the device from the Inventory. Are you sure?")){
			loginPage.getDriver().switchTo().alert().accept();			
			} else throw new Error("Invalid delete message"+msg1);
			
			waitForElement(lbl_loader_gdbdevices);
			
			if(!lbl_loader_gdbdevices.getText().contains("Loading...")){
				slf4jLogger.info("Device delete loader is not displayed");
			}							
			
			Thread.sleep(3000);
			
			 break;
		case "Create fibre link":jsClick(btn_fibercreate); 
							Thread.sleep(6000); break;
		case "Refresh all":jsClick(btn_gdb_refresh); Thread.sleep(3000); break;
		case "Fiber-Delete": jsClick(btn_fiberlink_Deleteicon);
							Alert alertwindow = getDriver().switchTo().alert();
							slf4jLogger.info(alertwindow.getText());
							alertwindow.accept();
							Thread.sleep(2000);	
							waitForElement(devcreatepage.success_alert);
							if(devcreatepage.success_alert.getText().contains("Fiber Link(s) deleted successfully!!")){
								slf4jLogger.info("This message is displayed:"+devcreatepage.success_alert.getText());
							} else {
								slf4jLogger.info("Wrong message is displayed:"+devcreatepage.success_alert.getText());
							}
							
							break;
		
		case "Expand all":	/*if(btn_GDB_expandall.isPresent()){
							btn_GDB_expandall);
							wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_shrinkall));
							Thread.sleep(3000);
							if(btn_gpon_expand.isPresent()){
								throw new Error("Expand button is not present");
							}
							slf4jLogger.info("Expand all is working as expected");
						} else throw new Error("Expand all is not present");*/ break;    // Need to rework on new idea
		
		case "Cascade all button":	jsClick(btn_gpon_expand_slot1);
									if(btn_gpon_expand_slot1.isPresent()){
										jsClick(btn_gpon_expand_slot1);
									}
									
									jsClick(btn_gdb_cascade_devtype); Thread.sleep(3000);
									jsClick(btn_gdb_cascade_devsubtype); Thread.sleep(3000);
									jsClick(btn_gdb_cascade_provstatus);Thread.sleep(3000);
									jsClick(btn_gdb_cascade_locationAdd);Thread.sleep(3000);
									jsClick(btn_gdb_cascade_clli);Thread.sleep(3000);									
									jsClick(btn_gdb_cascade_shrdflag);Thread.sleep(3000);
									jsClick(btn_gdb_cascade_elemNote);Thread.sleep(3000); 
									
									switch(lbl_gpon_devicecheck.getText().replaceAll("[^A-Za-z]+", "").replaceAll("\\s+","").trim()){
									
									case "OLT": 	jsClick(btn_gdb_cascade_stackSeq);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_shelfIndicator);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_buildTemp);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_isDiverse);Thread.sleep(3000);
																
													jsClick(btn_gdb_cascade_rackShelf);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_devTemp);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_mgmtVlan);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_gbIndicator);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_nosaCert);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_ntwkNode);Thread.sleep(3000); 	break;
												
												
									case "FDP":  jsClick(btn_gdb_cascade_rackShelf);Thread.sleep(3000);								
													jsClick(btn_gdb_cascade_fiberin);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_fiberout);Thread.sleep(3000);break;
												
									case "Splitter": 	jsClick(btn_gdb_cascade_rackShelf);Thread.sleep(3000);								
														jsClick(btn_gdb_cascade_fiberin);Thread.sleep(3000);
														jsClick(btn_gdb_cascade_fiberout);Thread.sleep(3000);														
														jsClick(btn_gdb_cascade_splitternumber);Thread.sleep(3000);
														jsClick(btn_gdb_cascade_splitterstartport);Thread.sleep(3000);break;
													
									case "MST":   jsClick(btn_gdb_cascade_rackShelf);Thread.sleep(3000);								
													jsClick(btn_gdb_cascade_fiberin);Thread.sleep(3000);
													jsClick(btn_gdb_cascade_fiberout);Thread.sleep(3000);break;
													
									case "ONT": jsClick(btn_gdb_cascade_rackShelf_ont);Thread.sleep(3000);	
													jsClick(btn_gdb_cascade_ronatid);Thread.sleep(3000);	
													jsClick(btn_gdb_cascade_fibernode);Thread.sleep(3000);	
													jsClick( btn_gdb_cascade_fibernodeport);Thread.sleep(3000);	
													jsClick(btn_gdb_cascade_fiberstrandid);Thread.sleep(3000);	
													jsClick(btn_gdb_cascade_fibercable);Thread.sleep(3000);	
													jsClick(btn_gdb_cascade_techinstall);Thread.sleep(3000);	
													jsClick(btn_gdb_cascade_ontid);Thread.sleep(3000);	break;
									
									}
									
									
									 break;
			// Validating the did the field values got cascaded
		case "Create all button":	Thread.sleep(5000);
								jsClick(btn_gdb_createall);
										//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
						
										wait.until(ExpectedConditions.visibilityOf(lbl_gpon_slot2_success_msg));		
										/*Thread.sleep(10000);
										if(!lbl_gpon_success_msg.getText().equals("Success")){
											btn_gdb_createall);
											
											WebElement target = loginPage.getDriver().findElement(By.xpath(".//*[@class='btn btn-success']//*[text()='Create']"));
											((JavascriptExecutor) loginPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
											Thread.sleep(500); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
											target);
											slf4jLogger.info("Again clicked");
											
										}
										Thread.sleep(10000);
										 element = wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_expand_slot1));		
										 Thread.sleep(20000);*/ break;
			
		case "Delete indiviual button":	jsClick(btn_gpon_delete_slot1);
		                                Thread.sleep(1000);
										String msg=loginPage.getDriver().switchTo().alert().getText();
										if(loginPage.getDriver().switchTo().alert().getText().contains("You are about to delete the device from the Inventory. Are you sure?")){
										loginPage.getDriver().switchTo().alert().accept();			
										} else throw new Error("Invalid delete message"+msg);
										
										waitForElement(lbl_loader_gdbdevices);
										
										if(!lbl_loader_gdbdevices.getText().contains("Loading...")){
											slf4jLogger.info("Device delete loader is not displayed");
										}							
										
										Thread.sleep(3000);
										 wait.until(ExpectedConditions.elementToBeClickable(devcreatepage.success_alert));			
										if(devcreatepage.success_alert.getText().contains("Device(s) deleted successfully!!")){
											slf4jLogger.info("Deleted"+devcreatepage.success_alert.getText());
											Thread.sleep(3000);
											jsClick(devcreatepage.success_alert_close);
											Thread.sleep(3000);
										} else throw new Error("Invalid message"); break;
										
		case "Select & Remove individual button": if(cbk_gpon_select_slot1.isEnabled()){
													jsClick(cbk_gpon_select_slot1);
													} else throw new Error("Select button are not enabled");
													if(cbk_gpon_select_slot1.isSelected()){
														slf4jLogger.info("Selected the first device");
													} else throw new Error("Select button is not getting selected");
													jsClick(btn_gpon_remove_slot1);
													//loginPage.getDriver().switchTo().alert().accept();
													
													waitForElement(lbl_loader_gdbdevices);
													
													if(!lbl_loader_gdbdevices.getText().contains("Loading...")){
														slf4jLogger.info("Device Remove loader is not displayed");
													}	
													wait.until(ExpectedConditions.elementToBeClickable(devcreatepage.success_alert));			
													if(devcreatepage.success_alert.getText().contains("Device(s) removed successfully!!")){
														slf4jLogger.info("Removed"+devcreatepage.success_alert.getText());
														Thread.sleep(3000);
														jsClick(devcreatepage.success_alert_close);
														Thread.sleep(3000);
													} else throw new Error("Invalid message"+devcreatepage.success_alert.getText()); break;
													
		case "Refresh button":	jsClick(btn_gpon_expand_slot1);
								wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_shrink));	
								jsClick(btn_gdb_refresh);
								Thread.sleep(10000);
								wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_expand_slot1));	break;
			
		case "Select all button":	jsClick(cbk_gdb_selectall);
									Thread.sleep(5000);
									String count=lbl_gdb_devicelabelnum.getText();
									count=count.replaceAll("[^0-9]", "");
									for(int i=1;i<=(Integer.parseInt(count)*2);i=i+2){
										String slots=".//*[@infinite-scroll='loadMore()']/table/tbody/tr["+i+"]/td[1]/label/input";
										if(loginPage.getDriver().findElement(By.xpath(slots)).isSelected()){
											Thread.sleep(3000);
										} else slf4jLogger.info("Device is not selected"+i);
									}	break;
									
		case "Delete all button":	jsClick(btn_gdb_deleteall);
									loginPage.getDriver().switchTo().alert().accept();
									Thread.sleep(10000);
									//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@infinite-scroll='loadMore()']/table/tbody/tr[1]/td[1]/label/input")));	
									Thread.sleep(5000);
									if(btn_gdb_deleteall.isPresent()){
										slf4jLogger.info("Device didnt delete all");
									}	break;										
		
		case "on entering the Splitter number, relay rack shelf should get autopopulated for splitter":		if(btn_gpon_expand.isPresent()){
																												jsClick(btn_gpon_expand);
																												Thread.sleep(5000);
																												}
																											tbx_NB_SplitterNumber.type("1235");
																											
																											Thread.sleep(3000);
																											if(tbx_NB_RelayRack.getText().equals("OFS-"+tbx_NB_SplitterNumber.getText())){
																												slf4jLogger.info("getting updated as expecetd");
																												Thread.sleep(5000);
																											} else slf4jLogger.info("not getting updated for splitter relay rack"+tbx_NB_RelayRack.getText()); break;	
																											
		case "Partial Topology name search":	if(btn_gpon_expand.isPresent()){
			jsClick(btn_gpon_expand);
												}
												waitForElement(btn_gpon_shrink);
												Thread.sleep(3000);
												jsClick(btn_NB_Topologylookup);
												Thread.sleep(3000);
												actvtnpage.ddl_Topologytype.selectByValue("PON Network");
												Thread.sleep(2000);
												actvtnpage.tbx_Topologyname.sendKeys("NV%");
												Thread.sleep(2000);
												devcreatepage.topology_fill();
												if(!tbx_gdb_topologyfield.isEnabled()){
													slf4jLogger.info("Working as expeceted");
												} else throw new Error("Not getting updated in topology search"); break;
								
		case "Fiber Distribution Node Port dropdown of ONT": 
			jsClick(btn_NB_Deleteicons);
			Thread.sleep(3000);
			Alert deviceDeleteIcon= loginPage.getAlert();
			deviceDeleteIcon.accept();
			Thread.sleep(3000);
			jsClick(btn_GDB_expand2);
			Thread.sleep(3000);
			List<String> ddl_fdnportValues_afterdeleteONT = new ArrayList<String>();
				for(int i=0;i<ddl_gpon_ONTFDNMSTport_values.size()-1; i++){
					ddl_fdnportValues_afterdeleteONT.add(ddl_gpon_ONTFDNMSTport_values.get(i).getText());
					}
				System.out.println(ddl_fdnportValues_afterdeleteONT);
				if(ddl_fdnportValues_afterdeleteONT.contains("OFC.1.2.1")){
					System.out.println("Fiber node port OFC.1.2.1 is released as expected, After deleted ONT");
				}else{
					System.out.println("OFC.1.2.1 port is not displaying in fdn port list, After deleted ONT");
				}
				break;
		
		case "Create icon button":jsClick(btn_NB_Createicon); Thread.sleep(3000); waitForElement(btn_gpon_expand); Thread.sleep(2000);  break;
			
		case "Existing icon button":jsClick(cbx_GDB_Existing_device);	Thread.sleep(1000); waitForElement(tbx_GDB_DeviceCLLI);break;
		}
		/*if(action.equals("Expand all")){
			if(btn_GDB_expandall.isPresent()){
				btn_GDB_expandall);
				wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_shrinkall));
				Thread.sleep(3000);
				if(btn_gpon_expand.isPresent()){
					throw new Error("Expand button is not present");
				}
				slf4jLogger.info("Expand all is working as expected");
			} else throw new Error("Expand all is not present");
		}
		else if(action.equals("Cascade all button")){
			btn_gpon_expand_slot1);
			if(btn_gpon_expand_slot1.isPresent()){
				btn_gpon_expand_slot1);
			}
			
			if(lbl_gpon_devicecheck.getText().contains("OLT")){
				btn_gdb_cascade_devtype);
				Thread.sleep(3000);
				btn_gdb_cascade_devsubtype); Thread.sleep(3000);
				btn_gdb_cascade_provstatus);Thread.sleep(3000);
				btn_gdb_cascade_shrdflag);Thread.sleep(3000);
				btn_gdb_cascade_stackSeq);Thread.sleep(3000);
				btn_gdb_cascade_shelfIndicator);Thread.sleep(3000);
				btn_gdb_cascade_buildTemp);Thread.sleep(3000);
				btn_gdb_cascade_isDiverse);Thread.sleep(3000);
				btn_gdb_cascade_locationAdd);Thread.sleep(3000);
				btn_gdb_cascade_clli);Thread.sleep(3000);
				btn_gdb_cascade_rackShelf);Thread.sleep(3000);
				btn_gdb_cascade_devTemp);Thread.sleep(3000);
				btn_gdb_cascade_mgmtVlan);Thread.sleep(3000);
				btn_gdb_cascade_gbIndicator);Thread.sleep(3000);
				btn_gdb_cascade_nosaCert);Thread.sleep(3000);
				btn_gdb_cascade_ntwkNode);Thread.sleep(3000);
				btn_gdb_cascade_elemNote);Thread.sleep(3000);
			}
			// Validating the did the field values got cascaded
			
			
		} else if(action.equals("Create all button")){
			Thread.sleep(5000);
			btn_gdb_createall);
				//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);

				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_expand_slot1));		
				Thread.sleep(10000);
				if(!lbl_gpon_success_msg.getText().equals("Success")){
					btn_gdb_createall);
					
					WebElement target = loginPage.getDriver().findElement(By.xpath(".//*[@class='btn btn-success']//*[text()='Create']"));
					((JavascriptExecutor) loginPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
					Thread.sleep(500); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
					target);
					slf4jLogger.info("Again clicked");
					
				}
				Thread.sleep(10000);
				 element = wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_expand_slot1));		
				 Thread.sleep(20000);
			
		}else if(action.equals("Delete indiviual button")){
			
			btn_gpon_delete_slot1);
			String msg=loginPage.getDriver().switchTo().alert().getText();
			if(loginPage.getDriver().switchTo().alert().getText().contains("You are about to delete the device from the Inventory. Are you sure?")){
			loginPage.getDriver().switchTo().alert().accept();			
			} else throw new Error("Invalid delete message"+msg);
			Thread.sleep(3000);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(devcreatepage.success_alert));			
			if(devcreatepage.success_alert.getText().contains("Device(s) deleted successfully!!")){
				slf4jLogger.info("Deleted"+devcreatepage.success_alert.getText());
				Thread.sleep(3000);
				devcreatepage.success_alert_close);
				Thread.sleep(3000);
			} else throw new Error("Invalid message");
			
		} else if(action.equals("Select & Remove individual button")){
			if(cbk_gpon_select_slot1.isEnabled()){
			cbk_gpon_select_slot1);
			} else throw new Error("Select button are not enabled");
			if(cbk_gpon_select_slot1.isSelected()){
				slf4jLogger.info("Selected the first device");
			} else throw new Error("Select button is not getting selected");
			btn_gpon_remove_slot1);
			loginPage.getDriver().switchTo().alert().accept();
			
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(devcreatepage.success_alert));			
			if(devcreatepage.success_alert.getText().contains("Device(s) removed successfully!!")){
				slf4jLogger.info("Removed"+devcreatepage.success_alert.getText());
				Thread.sleep(3000);
				devcreatepage.success_alert_close);
				Thread.sleep(3000);
			} else throw new Error("Invalid message"+devcreatepage.success_alert.getText());
			
		}  else if(action.equals("Refresh button")){
			btn_gpon_expand_slot1);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_shrink));	
			btn_gdb_refresh);
			Thread.sleep(10000);
			 element = wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_expand_slot1));	
			
		}  else if(action.equals("Select all button")){
			cbk_gdb_selectall);
			Thread.sleep(5000);
			String count=lbl_gdb_devicelabelnum.getText();
			count=count.replaceAll("[^0-9]", "");
			for(int i=1;i<=(Integer.parseInt(count)*2);i=i+2){
				String slots=".//*[@infinite-scroll='loadMore()']/table/tbody/tr["+i+"]/td[1]/label/input";
				if(loginPage.getDriver().findElement(By.xpath(slots)).isSelected()){
					Thread.sleep(3000);
				} else slf4jLogger.info("Device is not selected"+i);
			}			
			
		} else if(action.equals("Delete all button")){
			btn_gdb_deleteall);
			loginPage.getDriver().switchTo().alert().accept();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@infinite-scroll='loadMore()']/table/tbody/tr[1]/td[1]/label/input")));	
			Thread.sleep(5000);
			if(btn_gdb_deleteall.isPresent()){
				slf4jLogger.info("Device didnt delete all");
			}
			
		} else if(action.equals("on entering the Splitter number, relay rack shelf should get autopopulated for splitter")){
			if(btn_gpon_expand.isPresent()){
				btn_gpon_expand);
				Thread.sleep(5000);
				}
			tbx_NB_SplitterNumber.sendKeys("1");
			
			Thread.sleep(5000);
			if(tbx_NB_RelayRack.getText().equals("OFS-"+tbx_NB_SplitterNumber.getText())){
				slf4jLogger.info("getting updated as expecetd");
				Thread.sleep(5000);
			} else slf4jLogger.info("not getting updated for splitter relay rack"+tbx_NB_RelayRack.getText());
			
		} else if(action.equals("Topology lookup")){
			btn_NB_Topologylookup);
			Thread.sleep(3000);
			actvtnpage.ddl_TopologyType.selectByValue("PON Network");
			Thread.sleep(2000);
			actvtnpage.tbx_Topologyname.sendKeys("NV%");
			Thread.sleep(2000);
			devcreatepage.topology_fill();
			if(!tbx_gdb_topologyfield.getText().isEmpty()){
				slf4jLogger.info("Working as expeceted");
			} else slf4jLogger.info("Not getting updated in topology search");
		}
		else if(action.equals("Fiber Distribution Node Port dropdown of ONT")){
			
		}*/
		
	}
	
	public void popup_msgvalidationon_selecting_Zportfirst_fiberlink(String action) throws InterruptedException{
		//WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		int i=1;
		
		switch(action){
		
		case "POP-UP message is getting displayed on selecting Z port before selecting A port": jsClick(getDriver().findElement(By.id("tab:"+(i+1))));
																								String deviceZ=lbl_oltdeviceGDB.getText();
																								Thread.sleep(3000);
																								jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
																								ddl_flgdbendid.selectByValue(deviceZ);
																								Thread.sleep(5000);
																								waitForElement(getDriver().findElement(By.xpath(".//div[contains(@ng-repeat,'zEndPortList')]")));
																								 if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
																									 jsClick(cbx_deviceZshelf1slot1port1_Newport);
																									} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
																										jsClick(cbx_deviceZshelf1slot1port1_ONT);
																									
																									}  
																								 Thread.sleep(5000);
																								 Alert alertDialog = loginPage.getDriver().switchTo().alert();
																								 String msg=alertDialog.getText();
																								 slf4jLogger.info("POP up message"+msg);
																									alertDialog.accept();
																									if(msg.equals("Please select A end port first.")){
																										slf4jLogger.info("Working as expected getting warning message");
																									} else throw new Error("Not dispalying any message"); break;
																									
		case "Edit button is enabled on establishing the link by selecting ports":	i=1; jsClick(getDriver().findElement(By.id("tab:"+(i-1))));
																					Thread.sleep(3000);
																					String deviceA=lbl_oltdeviceGDB.getText();
																					jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
																					Thread.sleep(3000);
																					deviceZ=lbl_oltdeviceGDB.getText();
																					jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
																					Thread.sleep(8000);
																					ddl_flgdbstartid.selectByValue(deviceA);
																					Thread.sleep(8000);
																					waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
																					ddl_flgdbendid.selectByValue(deviceZ);
																					Thread.sleep(5000);
																					waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
																					if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
																						jsClick(cbx_deviceAshelf1slot2port1);																						
																					} else if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
																						jsClick(cbx_OLT_deviceAport1);																						
																						
																					}	
																					Thread.sleep(3000);
																				
																					 if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
																						 jsClick(cbx_deviceZshelf1slot1port1_Newport);
																						} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
																							jsClick(cbx_deviceZshelf1slot1port1_ONT);
								
																						} 
																						Thread.sleep(3000);
																						if(btn_fiberlink_edit_slot1.isEnabled()){
																							slf4jLogger.info("Edit buttons are enabled");
																						} else throw new Error("Edit button is disabled");	break;	
		
		case "Strand ID, Cable Id, Aerial/Buried and provisioning status is getting cascaded": DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
																								Date date = new Date();
																								 String date1= dateFormat.format(date);																 
																								
																								
																								ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
																								Thread.sleep(1000);	
																										
																								
																								
																								ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
																								Thread.sleep(1000);
																								
																								
																								
																								lbl_fibergdbcableid.sendKeys(date1+i);
																								Thread.sleep(3000);
																								lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
																								Thread.sleep(3000);
																									
																								
																								if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
																									jsClick(btn_alertmsg_GDBFB);
																									Thread.sleep(2000);
																									lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
																									Thread.sleep(3000);
																									jsClick(btn_fiber_cascade_startstrandid);
																									Thread.sleep(2000);
																									
																								}					
																								
																								
																								jsClick(btn_GDB_fiberlink_createall);break;
																									//waitForElement(btn_fiberlink_slot1_successmsg); break;
				
		
																									
		case "Select,Refresh & Remove on indiviual": jsClick(cbk_fiberlink_checkbox_slot1);
														Thread.sleep(3000);
														if(cbk_fiberlink_checkbox_slot1.isSelected()){
															Thread.sleep(3000);
															jsClick(btn_fiberlink_remove_slot1);
															Thread.sleep(3000);
															 alertDialog = loginPage.getDriver().switchTo().alert();
															 msg=alertDialog.getText();
															 slf4jLogger.info("POP up message"+msg);
																alertDialog.accept();
																if(msg.equals("You are about to remove 1 fiber link(s) from this group. Are you sure?")){
																	slf4jLogger.info("Working as expected getting warning message on Remove");
																} else throw new Error("Not dispalying any message on remove"+msg);
																if(devcreatepage.success_alert.getText().contains("Fiber link(s) removed successfully!!")){
																	slf4jLogger.info("Able to see remove fiber link message on individual"+devcreatepage.success_alert.getText());
																} else throw new Error("Failed not able to see remove fiber link message on individual"+devcreatepage.success_alert.getText()); 	
																Thread.sleep(3000);
																jsClick(devcreatepage.success_alert_close);
																Thread.sleep(3000);
																/*btn_fiber_refresh_slot1);
																Thread.sleep(2000);*/
																/*if(lbl_fiber_refresh_loader.isDisplayed())
																{
																	slf4jLogger.info("loader is displayed");
																	Thread.sleep(6000);
																} else slf4jLogger.info("loader is not displayed");*/
																
																/*if(cbk_fiberlink_checkbox_slot1.isCurrentlyVisible()){
																	throw new Error("Fiber link didn't get removed");
																}*/
																
														} else throw new Error("Checkbox is not working for fiber link"); break;
					
		case "Refresh & Remove all functionality":	i=1; jsClick(getDriver().findElement(By.id("tab:"+(i-1))));
												Thread.sleep(3000);
												deviceA=lbl_oltdeviceGDB.getText();
												jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
												Thread.sleep(3000);
												deviceZ=lbl_oltdeviceGDB.getText();
												jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
												Thread.sleep(8000);
												ddl_flgdbstartid.selectByValue(deviceA);
												Thread.sleep(8000);
												waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
												ddl_flgdbendid.selectByValue(deviceZ);
												Thread.sleep(5000);
												waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
												
												if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
													jsClick(cbx_deviceAshelf1slot2port1);
													jsClick(cbx_deviceAshelf1slot2port2);
													jsClick(cbx_deviceAshelf1slot2port3);
													
													
												} else if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
													jsClick(cbx_OLT_deviceAport1);
													jsClick(cbx_OLT_deviceAport2);
													jsClick(cbx_OLT_deviceAport3);
													
												}																				
													Thread.sleep(5000);	
										
										if(btn_fiberlink_edit_slot1.isEnabled() /*&& btn_fiberlink_edit_slot2.isEnabled() && btn_fiberlink_edit_slot3.isEnabled()*/){
											jsClick(btn_fiberlink_edit_slot1);
												} else throw new Error("Edit button is disabled");
										
										jsClick(cbk_fiberlink_checkbox_slot2);
										if(cbk_fiberlink_checkbox_slot2.isSelected()){
											jsClick(btn_fiberlink_remove_slot2);
										}
										Thread.sleep(3000);
										 alertDialog = loginPage.getDriver().switchTo().alert();
										 msg=alertDialog.getText();
										 slf4jLogger.info("POP up message"+msg);
											alertDialog.accept();
											if(msg.equals("You are about to remove 1 fiber link(s) from this group. Are you sure?")){
												slf4jLogger.info("Working as expected getting warning message on Remove");
											} else throw new Error("Not dispalying any message on remove"+msg);
											if(devcreatepage.success_alert.getText().contains("Fiber link(s) removed successfully!!")){
												slf4jLogger.info("Able to see remove fiber link message on individual"+devcreatepage.success_alert.getText());
											} else throw new Error("Failed not able to see remove fiber link message on individual"+devcreatepage.success_alert.getText()); 	
											Thread.sleep(3000);
											jsClick(devcreatepage.success_alert_close);
											Thread.sleep(3000);
											jsClick(btn_fiber_refresh_slot1); break;			
		
																				
		case "Remove functionlity":	i=1; jsClick(getDriver().findElement(By.id("tab:"+(i-1))));
									Thread.sleep(3000);
									deviceA=lbl_oltdeviceGDB.getText();
									jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
									Thread.sleep(3000);
									deviceZ=lbl_oltdeviceGDB.getText();
									jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
									Thread.sleep(8000);
									ddl_flgdbstartid.selectByValue(deviceA);
									Thread.sleep(8000);
									waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
									ddl_flgdbendid.selectByValue(deviceZ);
									Thread.sleep(5000);
									waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
									
									if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
										jsClick(cbx_deviceAshelf1slot2port1);
										jsClick(cbx_deviceAshelf1slot2port2);
										jsClick(cbx_deviceAshelf1slot2port3);
										
										
									} else if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
										jsClick(cbx_OLT_deviceAport1);
										jsClick(cbx_OLT_deviceAport2);
										jsClick(cbx_OLT_deviceAport3);
										
									}																				
										
									
									
										Thread.sleep(5000);	
					
							if(btn_fiberlink_edit_slot1.isEnabled() && btn_fiberlink_edit_slot2.isEnabled() && btn_fiberlink_edit_slot3.isEnabled()){
								jsClick(btn_fiberlink_edit_slot1);
									} else throw new Error("Edit button is disabled");
							
							jsClick(cbk_fiberlink_checkbox_slot2);
							if(cbk_fiberlink_checkbox_slot2.isSelected()){
								jsClick(btn_fiberlink_remove_slot2);
							}
							Thread.sleep(3000);
							 alertDialog = loginPage.getDriver().switchTo().alert();
							 msg=alertDialog.getText();
							 slf4jLogger.info("POP up message"+msg);
								alertDialog.accept();
								if(msg.equals("You are about to remove 1 fiber link(s) from this group. Are you sure?")){
									slf4jLogger.info("Working as expected getting warning message on Remove");
								} else throw new Error("Not dispalying any message on remove"+msg);
								if(devcreatepage.success_alert.getText().contains("Fiber link(s) removed successfully!!")){
									slf4jLogger.info("Able to see remove fiber link message on individual"+devcreatepage.success_alert.getText());
								} else throw new Error("Failed not able to see remove fiber link message on individual"+devcreatepage.success_alert.getText()); 	
								Thread.sleep(3000);
								jsClick(devcreatepage.success_alert_close);
								Thread.sleep(3000);
								jsClick(btn_fiber_refresh_slot1); break;
							
							} 
		
	}
	
	public void gdb_device_name_change() throws InterruptedException{
		if(btn_gpon_expand.isPresent()){
			jsClick(btn_gpon_expand);
			Thread.sleep(3000);
			}
		
		String relayrackdetails=tbx_NB_RelayRack.getText();
		slf4jLogger.info("This is the old data"+tbx_NB_RelayRack.getText());
		int i=0;
		while(lbl_device_status.getText().contains("Failed")){
			if(btn_gpon_expand.isPresent()){
				jsClick(btn_gpon_expand);
				Thread.sleep(5000);
				}
			if(lbl_gdb_notes.getText().contains("Fiber drop name is already in use") && tbx_gdb_ont_strandid.isPresent() && tbx_gdb_ont_cableid.isPresent()){
								
				tbx_gdb_ont_strandid.sendKeys("1"+i);
				tbx_gdb_ont_cableid.sendKeys("1"+i);
				jsClick(btn_NB_Createicon);
				Thread.sleep(5000);
				i=i+1;
				
			} else 
			tbx_NB_RelayRack.clear();
			Thread.sleep(5000);
			tbx_NB_RelayRack.sendKeys(relayrackdetails+i);
			Thread.sleep(5000);
			jsClick(btn_NB_Createicon);
			Thread.sleep(5000);			
			i=i+1;
		}
	}
	
	
	
	public void gpon_fiberlink_validation() throws InterruptedException{
		String idfdh=btn_gpon_FDH_box.getAttribute("id");
		String idsa=btn_gpon_servicearea_box.getAttribute("id");
		int id_fdh=Integer.parseInt(idfdh.replaceAll("[^0-9]", ""));	
		int id_sa=Integer.parseInt(idsa.replaceAll("[^0-9]", ""));	
		slf4jLogger.info("FDH Pos="+id_fdh+"Service area POS="+id_sa);
		jsClick(btn_gpon_FDH_box);
		Thread.sleep(5000);	
		if(loginPage.getDriver().findElement(By.id("tab:"+(id_fdh-1))).getText().equals("Fiber Link") && loginPage.getDriver().findElement(By.id("tab:"+(id_fdh-1))).isEnabled()){
			slf4jLogger.info("Left side is clickable & have text displayed as Fiber link");
		if(loginPage.getDriver().findElement(By.id("tab:"+(id_fdh+1))).getText().equals("No Links") && !loginPage.getDriver().findElement(By.id("tab:"+(id_fdh-1))).isEnabled()){
			slf4jLogger.info("Right side is not clickable & have text displayed as No link");
		}slf4jLogger.info("Not working as expected");
		}slf4jLogger.info("Not working as expected");
		Thread.sleep(5000);	
		jsClick(btn_gpon_servicearea_box);
		if(loginPage.getDriver().findElement(By.id("tab:"+(id_sa-1))).getText().equals("No Links") && !loginPage.getDriver().findElement(By.id("tab:"+(id_sa-1))).isEnabled()){
			slf4jLogger.info("Left side is not clickable & have text displayed as No link");
		if(loginPage.getDriver().findElement(By.id("tab:"+(id_sa+1))).getText().equals("No Links") && !loginPage.getDriver().findElement(By.id("tab:"+(id_sa-1))).isEnabled()){
			slf4jLogger.info("Right side is not clickable & have text displayed as No link");
		}slf4jLogger.info("Not working as expected");
		}slf4jLogger.info("Not working as expected");
	}

	public void gdb_build_excel_download() throws Throwable{
		
		FileInputStream file;
		FileOutputStream os;
		
		
		int i=0;
		ArrayList<String> GDBcomponent = new ArrayList<String>(50);
		
		GDBcomponent.add(0, NB_Build_Id.getText());
		GDBcomponent.add(1, lbl_GDB_Initialteddate.getText());
		
		int j=0;
		slf4jLogger.info(GDBcomponent.size() +"Size of the arraylist");
		while(loginPage.isElementVisible(By.id("tab:"+(i))))
		{	
			if(j==25){
				j=j-2;
			}
			j=j+i+2;
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i))));
			Thread.sleep(5000);
			
			slf4jLogger.info(i+"=Value of i");
			
			if(loginPage.getDriver().findElement(By.id("tab:"+(i))).getText().contains("No Links")){
				
				
			} else if(lbl_oltdeviceGDB.isCurrentlyVisible()){
				
				if(!lbl_device_status.getText().equals("Success")){
					
				}
				
				slf4jLogger.info(lbl_oltdeviceGDB.getText()+"=GDB Device");
				
				GDBcomponent.add(j, lbl_oltdeviceGDB.getText());
				GDBcomponent.add(j+1, null);
				j=i+1;
						
			} else if(lbl_fiberlinkGDB.isCurrentlyVisible()){				
				
					slf4jLogger.info(lbl_fiberlinkGDB.getText()+"=GDB Fiberlink");
					GDBcomponent.add(j, lbl_fiberlinkGDB.getText());	
					GDBcomponent.add(j+1, null);
					j=i+1;
				
			} else if(lbl_GDB_serviceAreaName.isCurrentlyVisible()){
				j=24;
				slf4jLogger.info(lbl_GDB_serviceAreaName.getText()+"=Service area");
				
				GDBcomponent.add(j, lbl_GDB_serviceAreaName.getText());
				GDBcomponent.add(j+1, null);
				
			}
			
			
		/*	if(loginPage.getDriver().findElement(By.id("tab:"+(i))).getText().contains("No Links")){
			
							
			} else if(lbl_oltdeviceGDB.isPresent()){
				
				slf4jLogger.info(lbl_oltdeviceGDB.getText()+"=GDB Device");
				
				GDBcomponent.add(j, lbl_oltdeviceGDB.getText());
				GDBcomponent.add(j+1, " ");
				j=i+1;
						
			} else if(lbl_fiberlinkGDB.isPresent()){				
				
					slf4jLogger.info(lbl_fiberlinkGDB.getText()+"=GDB Fiberlink");
					GDBcomponent.add(j, lbl_fiberlinkGDB.getText());	
					GDBcomponent.add(j+1, " ");
					j=i+1;
				
			} else if(lbl_GDB_serviceAreaName.isPresent()){
				j=24;
				slf4jLogger.info(lbl_GDB_serviceAreaName.getText()+"=Service area");
				
				GDBcomponent.add(j, lbl_GDB_serviceAreaName.getText());
				GDBcomponent.add(j+1, " ");
				
			} else {
				GDBcomponent.add(j, "No fiber link- added in FDN-Port");
				slf4jLogger.info("No fiber link- added in FDN-Port"+(i+2));
				j=i;
			}*/
			
			
			i++;			

		} 
		
		 try {
			 
		/*	 if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
				 
				
					
					file = new FileInputStream(new File("C://OSSPROV/Common_FlowThru/GDB_Device_sheet.xls"));
					//file = new FileInputStream(new File("C://FTT/Common_FlowThru/Common_FTT_CI_E2E.xls"));
					
				} else {
							        	
		        file = new FileInputStream(new File("C://OSSPROV/Common_FlowThru/GDB_Device_sheet.xls"));
				}*/
			 
			 //Make it Copy from Share path--31/1/2017
			 
			 String GDB_Sheet = Page.envData.getFieldValue("GDB-Sheet");
			 // String FTT_Sheet = Page.envData.getFieldValue("FTT-Sheet");
			 
			 file = new FileInputStream(new File(GDB_Sheet));
				
		          HSSFWorkbook workbook = new HSSFWorkbook(file);
		          
		        //Get first sheet from the workbook
		          HSSFSheet sheet = workbook.getSheetAt(0);
		             
		            
		            //sheet.shiftRows(1, sheet.getLastRowNum(), 1, true,true);
		            
		           // Row row1 = sheet.getRow(i);
		            
		            int rowNum = sheet.getLastRowNum() + 1;
		            //int colNum = sheet.getRow(0).getLastCellNum();
		            
		           // System.out.print(rowNum+"-Rolw-"+colNum);
		            
		           /* Row row = sheet.createRow(rowNum);
		            row.createCell(0).setCellValue(Integer.parseInt(msg));  
		            slf4jLogger.info("About to write on Excel file ..."+Integer.parseInt(msg));*/
		            Row row = sheet.createRow(rowNum);
		            
		            int size=GDBcomponent.size();
		            //size=size+11;
		            
		            for (j=0;j<size;j++) {
		    	    	
		    	    	//Fill data in rowa

		            	row.createCell(j).setCellValue(GDBcomponent.get(j)); 

		    			//slf4jLogger.info(GDBcomponent.get(j)+"Arraylist pos"+j);
		            	/*if(j>2){
		                	if(j!=20 || j!=23){
		                		k=j+1;	
		                	} else {
		                		k=j;
		                	}*/
		    			
		                slf4jLogger.info("About to write on Excel file ..."+GDBcomponent.get(j));
		                
		                
		                	
		            //    }
		                
		    		}	
		            
		            // open an OutputStream to save written data into Excel file
		            
		          /*  if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
		    			
		            	//os = new FileOutputStream(new File("C://FTT/Common_FlowThru/Common_FTT_CI_E2E.xls"));
		            	os = new FileOutputStream(new File("C://OSSPROV/Common_FlowThru/GDB_device.xls"));
		    			
		    		} else {
		    					        	
		    			 os = new FileOutputStream(new File("C://OSSPROV/Common_FlowThru/GDB_device.xls"));
		    		}*/
		            
		            //Make it Copy from Share path--31/1/2017				
				
					 
		            os = new FileOutputStream(new File(GDB_Sheet));
		            
		          //  os = new FileOutputStream(new File("C://Users/AB52523/Desktop/MLTo/Common_FTT_CI - OV.xls"));
		            workbook.write(os);
		            slf4jLogger.info("Writing on Excel file Finished ...");

		            // Close workbook, OutputStream and Excel file to prevent leak
		            os.flush();
		            os.close();
		            //workbook.close();
		            file.close();
		            Thread.sleep(30000);
		
		/*if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
			
			file = new FileInputStream(new File("C:\\Users\\AB52523\\Desktop\\Automation_Work\\FTT_GPON-G.Fast\\GDB Device_OV-E2E.xlsx"));
			os = new FileOutputStream(new File("C:\\Users\\AB52523\\Desktop\\Automation_Work\\FTT_GPON-G.Fast\\GDB Device_OV-E2E.xlsx"));
			slf4jLogger.info("E2E sheet");
			
		} else {
					        	
        file = new FileInputStream(new File("C://Users/AB52523/Desktop/MLTo/GDB/GFast_Device_sheet_ITV1.xls"));
       os = new FileOutputStream(new File("C://Users/AB52523/Desktop/MLTo/GDB/GFast_Device_sheet_ITV1.xls"));
        slf4jLogger.info("Test1 sheet");
		}
		
		// Workbook workbook = new HSSFWorkbook(file);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//Read excel sheet by sheet name    

		    Sheet sheet = workbook.getSheet("GDB component");
          
		//Get the current count of rows in excel file

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        
		//Get the first row from the sheet

	    Row row = sheet.getRow(0);

	  //Create a new row and append it at last of sheet

	    Row newRow = sheet.createRow(rowCount+1);
	    
	    
	    for (int j=0;j<GDBcomponent.size();j++) {
	    	
	    	//Fill data in row

	        Cell cell = newRow.createCell(j);

	        cell.setCellValue(GDBcomponent.get(j));

			//slf4jLogger.info(GDBcomponent.get(j)+"Arraylist pos"+j);
			
            slf4jLogger.info("About to write on Excel file ..."+GDBcomponent.get(j));
            
		}	
	    
	    //Close input stream

	    file.close();
	    
	  //write data in the excel file

	    workbook.write(os);

	    //close output stream

	    os.close();

	   

	    
		
		//Get first sheet from the workbook
          HSSFSheet sheet = workbook.getSheetAt(0);
             
            
            //sheet.shiftRows(1, sheet.getLastRowNum(), 1, true,true);
            
           // Row row1 = sheet.getRow(i);
            
            int rowNum = sheet.getLastRowNum() + 1;
            Row row = sheet.createRow(rowNum);
            
		
		slf4jLogger.info(GDBcomponent.size()+"Size of the array list");
		for (int j=0;j<GDBcomponent.size();j++) {
			slf4jLogger.info(GDBcomponent.get(j)+"Arraylist pos"+j);
			row.createCell(j).setCellValue(GDBcomponent.get(j));  
            slf4jLogger.info("About to write on Excel file ..."+GDBcomponent.get(j));
            
		}		
		
		if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
			
			//file = new FileInputStream(new File("C://Users/AB52523/Desktop/MLTo/Common_FTT_CI - OV.xls"));
			os = new FileOutputStream(new File("C://Users/AB52523/Desktop/MLTo/GDB/Common_FTT_CI - OV.xls"));
			slf4jLogger.info("E2E sheet");
			
		} else {
					        	
      //  file = new FileInputStream(new File("C://Users/AB52523/Desktop/MLTo/GDB/GFast_Device_sheet_ITV1.xls"));
        os = new FileOutputStream(new File("C://Users/AB52523/Desktop/MLTo/GDB/GFast_Device_sheet_ITV1.xls"));
        slf4jLogger.info("Test1 sheet");
		}
		
		workbook.write(os);
        slf4jLogger.info("Writing on Excel file Finished ...");
		

         // Close workbook, OutputStream and Excel file to prevent leak
         os.flush();
         os.close();
         //workbook.close();
         file.close();
         //Thread.sleep(30000);
*/		 } catch (FileNotFoundException fe) {
	            fe.printStackTrace();
	        } catch (IOException ie) {
	            ie.printStackTrace();
	        }
	}
	
	
	public void gdb_build_excel_write_device() throws Throwable{
		String GDBdevice=lbl_gpon_devicecheck.getText();
		slf4jLogger.info(GDBdevice+"GDB Device name");
		String[] gdbdeviceparts=GDBdevice.split("\\(");
		String search_part = gdbdeviceparts[0].replaceAll("\\s+","");
		slf4jLogger.info(search_part+"New search");
		
		int col=0,row=excel_access.getColumnCellCount("Sheet1");
		slf4jLogger.info(row+"Last row");
		
		switch(search_part){
		
		case "OLT": col=2; break;
		case "FDP": if(excel_access.getCellData("Sheet1", row, 6).contains("")){
						col=6;
						} else {
							col=14;
						}
						break;
		case "Splitter": col=10; break;
		case "MST": col=18; break;
		case "ONT": col=22; break;
		
			
		}
		
		excel_access.setcelldata("GDB-Sheet","Sheet1", row, col, lbl_oltdeviceGDB.getText());
	}
	
	public void gdb_build_excel_download_newversion() {
		
		
	}

	
	public void GDB_associate_SA() throws Throwable{
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
				DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
				Date date = new Date();
				String date1= dateFormat.format(date);
				slf4jLogger.info(date1);
		
				jsClick(btn_gpon_MST_box);
		wait.until(ExpectedConditions.visibilityOf(lbl_oltdeviceGDB));
		String GDBMST=lbl_oltdeviceGDB.getText();
		//Thread.sleep(1000);
		slf4jLogger.info(GDBMST+"MST Device");
		jsClick(btn_gpon_servicearea_box);
		wait.until(ExpectedConditions.visibilityOf(tbx_NB_SA_name));
		
		if(btn_GDB_SA_Deleteicon.isEnabled()){
			slf4jLogger.info("Delete Icon is enabled");
		}
		
		tbx_NB_SA_name.clear();
		tbx_NB_SA_name.sendKeys("SA_"+date1);
		
		tbx_NB_SA_device_name.sendKeys(GDBMST);
		//ddl_NB_SA_device_Location.selectByIndex(1);

		jsClick(btn_NB_SACreateicon);
		wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_SA_Deleteicon));
		Thread.sleep(3000);
		//btn_GDB_SA_Deleteicon.shouldBeEnabled();	
	/*	if(btn_GDB_SA_Deleteicon.isEnabled()){
			slf4jLogger.info("Delete Icon is enabled after create");
		}
		*/
		
		slf4jLogger.info("Service Area created sucessfully");
		//slf4jLogger.info("Service Area name is "+tbx_serviceareaname.getText());		
		
	}
	
	public void  GDB_associate_SA_exceldata() throws Throwable{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		excel_access.ExcelReader(Page.envData.getFieldValue("GDB-Sheet"));
		
		jsClick(btn_gpon_MST_box);
		wait.until(ExpectedConditions.visibilityOf(lbl_oltdeviceGDB));
		String GDBMST=lbl_oltdeviceGDB.getText();
		//Thread.sleep(1000);
		slf4jLogger.info(GDBMST+"MST Device");
		jsClick(btn_gpon_servicearea_box);
		wait.until(ExpectedConditions.visibilityOf(tbx_NB_SA_name));
		
		if(btn_GDB_SA_Deleteicon.isEnabled()){
			slf4jLogger.info("Delete Icon is enabled");
		}
		
		tbx_NB_SA_name.clear();
		tbx_NB_SA_name.sendKeys(excel_access.getCellData("Input_Sheet", 8, 21));
		
		tbx_NB_SA_device_name.sendKeys(GDBMST);
		//ddl_NB_SA_device_Location.selectByIndex(1);

		jsClick(btn_NB_SACreateicon);
		wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_SA_Deleteicon));
		Thread.sleep(3000);
		//btn_GDB_SA_Deleteicon.shouldBeEnabled();	
		/*if(btn_GDB_SA_Deleteicon.isEnabled()){
			slf4jLogger.info("Delete Icon is enabled after create");
		}*/
		
		
		slf4jLogger.info("Service Area created sucessfully");
		//slf4jLogger.info("Service Area name is "+tbx_serviceareaname.getText());
		
	}
	
	public void GDB_Associate_SA_address_exceldata() throws Throwable{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		excel_access.ExcelReader(Page.envData.getFieldValue("GDB-Sheet"));
		
		jsClick(btn_gpon_expand);
		waitForElement(btn_NB_SA_Location_lookup);
		browser_zoom_in(4);
		Thread.sleep(1000);
		jsClick(btn_NB_SA_Location_lookup);
		
		waitForElement(btn_NB_SA_association_Location_search);
		
		
		//String parentwin=devcreatepage.window_switch();
		//fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
		
		tbx_NB_SA_association_Locationclli.sendKeys(excel_access.getCellData("Input_Sheet", 6, 5));
		
		jsClick(btn_NB_SA_association_Location_search);
		
		//waitForInvisibility(lbl_NB_SA_association_Location_loader);
		
		waitForElement(cbx_NB_SA_association_Location_select);
		//cbx_NB_SA_association_Location_select);
		
		if(!cbx_NB_SA_association_Location_select.isSelected()){
			cbx_NB_SA_association_Location_select.click();
			Thread.sleep(2000);
		}
		jsClick(btn_NB_SA_associate_address_create);
		
		Thread.sleep(2000);
		
		browser_zoom_out(4);
		//waitForInvisibility(cbx_NB_SA_association_Location_select);
		tbx_NB_SA_associate_address_rank.clear();
		tbx_NB_SA_associate_address_rank.sendKeys("1");
		
		jsClick(btn_NB_SA_Address_associate_all);
		Thread.sleep(2000);
		loginPage.getDriver().switchTo().alert().accept();
		Thread.sleep(5000);
		waitForElement(lbl_NB_SA_Add_associate_rank);
	}
	
	public void GDB_component_action(String action) throws Throwable{
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 50);
		switch(action){
			
		case "Expand all" :/* btn_GDB_expandall);
							wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_shrinkall));*/
							break;									
		
		case "Cascade all": cascade_functinality();
							break;
							
		case "Create all": jsClick(btn_gdb_createall);
							//wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_shrinkall));
							Thread.sleep(3000);
							
							break;
							
		case "Remove all": jsClick(btn_gdb_removeall);
							Thread.sleep(2000);
							//String msg=loginPage.getDriver().switchTo().alert().getText();
							/*if(loginPage.getDriver().switchTo().alert().getText().contains("You are about to remove selected device(s). NOTE :- Those device(s) which are created successfully won't be removed. Are you sure you want to continue?")){
								loginPage.getDriver().switchTo().alert().accept();			
								} else throw new Error("Invalid Remove message"+msg);*/
							//wait.until(ExpectedConditions.visibilityOf(devcreatepage.success_alert));							
							break;

			
		case "Delete all": 	jsClick(btn_gdb_deleteall);		
						Thread.sleep(2000);
						//String msg=loginPage.getDriver().switchTo().alert().getText();
						if(loginPage.getDriver().switchTo().alert().getText().contains("Are you sure you want to delete this device.  It's permanent.")){
							loginPage.getDriver().switchTo().alert().accept();			
							} else throw new Error("Invalid delete message"+loginPage.getDriver().switchTo().alert().getText());
						wait.until(ExpectedConditions.visibilityOf(devcreatepage.success_alert));	
						break;
						
		case "Shrink all": /*btn_GDB_shrinkall);
							wait.until(ExpectedConditions.elementToBeClickable(btn_GDB_expandall));*/
							break;   // Neeed to work on this
							
		case "Edit icon in fiber link":jsClick(btn_fiberlink_edit_slot1);waitForElement(btn_fiberlink_save_slot1);break;
		}
		Thread.sleep(3000);
	}
	
public void cascade_functinality() throws Throwable{
		
	jsClick(btn_GDB_device1_devicetype_cascade); Thread.sleep(2000);
	jsClick(btn_GDB_device1_devicesubtype_cascade); Thread.sleep(2000);
	jsClick(btn_GDB_device1_provstatus_cascade); Thread.sleep(2000);
	jsClick(btn_GDB_device1_sharedflag_cascade); Thread.sleep(2000);
	jsClick(btn_GDB_device1_locnaddr_cascade); Thread.sleep(2000);
	jsClick(btn_GDB_device1_deviceclli_cascade); Thread.sleep(2000);
		
		
		String GDBdevice=lbl_gpon_devicecheck.getText();
		slf4jLogger.info(GDBdevice+"GDB Device name");
		String[] gdbdeviceparts=GDBdevice.split("\\(");
		String search_part = gdbdeviceparts[0].replaceAll("\\s+","");
		slf4jLogger.info(search_part+"New search");
		
		if(search_part.equals("OLT")){
			slf4jLogger.info("matches");
		} else {
			slf4jLogger.info("Doesnt match");
		}
		
		switch(search_part){
				
			case "OLT": jsClick(btn_GDB_device1_isDiverse_cascade); Thread.sleep(2000);
						jsClick(btn_GDB_device1_olt_gbindicator_cascade); Thread.sleep(2000);
						jsClick(btn_GDB_device1_olt_nosacert_cascade); Thread.sleep(2000);
						jsClick(btn_GDB_device1_rackShelf_cascade); Thread.sleep(2000);
						break;
						
			case "ONT": jsClick(btn_GDB_device1_ont_techinstall_cascade); Thread.sleep(2000);
							jsClick(btn_GDB_device1_ont_rontaid_cascade); Thread.sleep(2000);
						break;	
				
			case "Splitter" : jsClick(btn_GDB_device1_splitter_splitterno_cascade);Thread.sleep(2000);
								jsClick(btn_GDB_device1_rackShelf_cascade); Thread.sleep(2000);
							  break;
						
				
		}
	
	}

public void GDB_Validation_screen(String validatinGDB)throws Throwable{
	switch(validatinGDB){
	case "Expanded":/* if(!btn_GDB_expandall.isCurrentlyVisible() || !btn_GDB_expand2.isCurrentlyVisible()){
						slf4jLogger.info("Working as expected all are expanded");
							}*/
						break;
	}
}

public void GDB_device_selectbox(String count)throws Throwable{
	if(cbk_gdb_selectall.isCurrentlyVisible()){
	String checkbox1=".//*[@infinite-scroll='loadMore()']//tbody/tr[";					//	1]//input[@ng-model='aDevice.chkValue']";
	String path;
	
		if(count.equals("all")){
			jsClick(cbk_gdb_selectall);
			Thread.sleep(3000);
		} else {
			int c=Integer.parseInt(count);
			int i=1;
			while(c>0){
				path=checkbox1+i+"]//input[@ng-model='aDevice.chkValue']";
				jsClick(loginPage.getDriver().findElement(By.xpath(path)));
				Thread.sleep(1000);
				i=i+2;
				c--;
			}
		}
	
	}
	
}

	public void GDB_device_actionsmsgs() {
			if(devcreatepage.success_alert.getText().contains("Device(s) removed successfully!!") || devcreatepage.success_alert.getText().contains("Device(s) deleted successfully!!")){
				jsClick(devcreatepage.success_alert_close);
			} else throw new Error("Invalid  message"+devcreatepage.success_alert.getText());
		}

	public void GDB_device_select(String gdbdevice){
	
			waitForElement(btn_gpon_OLT_box);
			
			switch(gdbdevice) {
					case "OLT" :jsClick(btn_gpon_OLT_box);
								break;
								
					case "FDP" :jsClick(btn_gpon_FDP_box);
								break;
					
					case "SPLITTER" :jsClick(btn_gpon_Splitter_box);
								break;
					
					case "MST" :jsClick(btn_gpon_MST_box);
								break;
					
					case "ONT" :jsClick(btn_gpon_ONT_box);
								break;
			}
			waitForElement(btn_gpon_expand);
		}

	public void GDB_manually_adding_device() throws Throwable{
	
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		String deviceclli=searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_clli.getText().trim();
		String devicename=searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();
		
		jsClick(searchdevicepage.lbl_GDBcreatetab);
		wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_ONT));
		jsClick(cbx_GDB_Existing_device1);
		//jsClick(cbx_GDB_existing_device_select);
		wait.until(ExpectedConditions.visibilityOf(tbx_GDB_existing_device_deviceclli));
		Thread.sleep(2500);
		
		tbx_GDB_existing_device_deviceclli.sendKeys(deviceclli);
		Thread.sleep(500);
		
		jsClick(btn_GDB_existing_device_lookup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_FDNdeviceprv));
		
		String deviceclick=".//a[text()='"+devicename+"']";
		Thread.sleep(3000);
		
		if(btn_gpon_FDNdeviceprv.isCurrentlyVisible()){
			Thread.sleep(500);
			
			jsClick(btn_gpon_FDNdeviceprv);
			
			Thread.sleep(2000);
		}
		
		if(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible()){
			//Thread.sleep(500);
			jsClick(orderpage.btn_downarrow_devicescroll);
			Thread.sleep(1000);
			jsClick(orderpage.btn_downarrow_devicescroll);
			Thread.sleep(500);
			
		}
		
		Thread.sleep(1000);
		jsClick(getDriver().findElement(By.xpath(deviceclick)));
		
		Thread.sleep(5000);
		
		loginPage.waitForAnyTextToAppear(lbl_device_status,"Success");
		Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.shouldNotBeVisible(btn_NB_Deleteicons));
		
		
		
		
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
	
	public void GDB_delete_icon_validation(String devicetype){
		
		switch(devicetype){
		case "GPON-OLT": if(!btn_NB_Deleteicons.isEnabled()){
							throw new Error("Delete button is not enabled for GPON device");
							}
							break;
							
		case "Ethernet-OLT": 	try {
								if(btn_NB_Deleteicons.isEnabled()){
									jsClick(btn_NB_Deleteicons);
									 Alert alert = loginPage.getDriver().switchTo().alert();
							           	String msg=alert.getText();
							           
											Thread.sleep(2000);
										
							           //	alert.dismiss();
							           	alert.accept();
							           	slf4jLogger.info("Accepted the popup");
							           	Thread.sleep(2000);
							           	if(btn_NB_Deleteicons.isEnabled()){
							           		throw new Error("Delete button is enabled for Ethernet device");
							           	}
							           	
								}
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									
								}	break;
			
		}
	}
	
	/*public void search_gfast_order_excel() {
		FileInputStream file;
		FileOutputStream os;
		Cell cell;
	
		 try {				
					 
					 String GDB_Sheet = Page.envData.getFieldValue("GFast-Sheet");
							 
							// 
					 // String FTT_Sheet = Page.envData.getFieldValue("FTT-Sheet");
					 
					 slf4jLogger.info(GDB_Sheet);
				
					 
					 file = new FileInputStream(new File(GDB_Sheet));
						
				          HSSFWorkbook workbook = new HSSFWorkbook(file);
				          
				        //Get first sheet from the workbook
				          HSSFSheet sheet = workbook.getSheetAt(0);
				          
				          int rownum = sheet.getLastRowNum();
				          
				         // slf4jLogger.info(rownum);
				          
				          XSSFRow row;
				  		  XSSFCell cell1;
				          
				  		//Iterating all the rows in the sheet 
				  		Iterator rows = sheet.rowIterator();
				  		
				  		
				          
				          Iterator rows = sheet.rowIterator();
				          
				          int rownum = sheet.getLastRowNum();
				          
				          Row r = sheet.getRow(rownum);
				          
				          int Cell_value=r.getLastCellNum();
				          
				          slf4jLogger.info(sheet.getLastRowNum()+"Last element");
				          
				          
				            int rowNum = sheet.getLastRowNum() + 1;
				            //int colNum = sheet.getRow(0).getLastCellNum();
				            
				           // System.out.print(rowNum+"-Rolw-"+colNum);
				            
				            Row row = sheet.createRow(rowNum);
				            row.createCell(0).setCellValue(Integer.parseInt(msg));  
				            slf4jLogger.info("About to write on Excel file ..."+Integer.parseInt(msg));
				            Row row = sheet.createRow(rowNum);
				            
				            int size=GDBcomponent.size();
				            //size=size+11;
				            int k;
				            for (j=0;j<size;j++) {
				    	    	
				    	    	//Fill data in rowa

				            	row.createCell(j).setCellValue(GDBcomponent.get(j)); 

				    			//slf4jLogger.info(GDBcomponent.get(j)+"Arraylist pos"+j);
				            	if(j>2){
				                	if(j!=20 || j!=23){
				                		k=j+1;	
				                	} else {
				                		k=j;
				                	}
				    			
				                slf4jLogger.info("About to write on Excel file ..."+GDBcomponent.get(j));
				                
				                
				                	
				            //    }
				                
				    		}	
				            
				            // open an OutputStream to save written data into Excel file
				            
				            if(loginPage.getDriver().getCurrentUrl().contains("https://omnivue-test3.test.intranet/OMNIVue/activation/activation.html")){
				    			
				            	//os = new FileOutputStream(new File("C://FTT/Common_FlowThru/Common_FTT_CI_E2E.xls"));
				            	os = new FileOutputStream(new File("C://OSSPROV/Common_FlowThru/GDB_device.xls"));
				    			
				    		} else {
				    					        	
				    			 os = new FileOutputStream(new File("C://OSSPROV/Common_FlowThru/GDB_device.xls"));
				    		}
				            
				            //Make it Copy from Share path--31/1/2017				
						
							 
				            os = new FileOutputStream(new File(GDB_Sheet));
				            
				          //  os = new FileOutputStream(new File("C://Users/AB52523/Desktop/MLTo/Common_FTT_CI - OV.xls"));
				            workbook.write(os);
				            slf4jLogger.info("Writing on Excel file Finished ...");

				            // Close workbook, OutputStream and Excel file to prevent leak
				            os.flush();
				            os.close();
				            //workbook.close();
				            file.close();
				           // Thread.sleep(30000);
				
					 } catch (FileNotFoundException fe) {
			            fe.printStackTrace();
			        } catch (IOException ie) {
			            ie.printStackTrace();
			        }          
				          
		 }	
	*/
	
	public void gdbdeviceclli(String clli) throws Throwable{
		
		tbx_NB_CLLI.sendKeys(clli);
		Thread.sleep(2000);
		if(lbl_gdb_selectop0.isCurrentlyVisible()){
			jsClick(lbl_gdb_selectop0);
		} else tbx_NB_Location_Designator.sendKeys("55F");
	}
	
	public void gdbtopology_fill(String topologydata,String topologytype) throws Throwable{
		jsClick(btn_NB_Topologylookup);
		waitForElement(actvtnpage.tbx_Topologyname);
		actvtnpage.tbx_Topologyname.sendKeys(topologydata);
		actvtnpage.ddl_Topologytype.selectByVisibleText(topologytype);
		devcreatepage.topology_fill();	
		
	}
	
	
	
	public void gdblocation_fill(String locnclli) throws Throwable{
		jsClick(btn_NB_Location_view);
		String parentwin=devcreatepage.window_switch();
		actvtnpage.tbx_buildingclli.sendKeys(locnclli);
		jsClick(devcreatepage.btn_lookUp);//Rework
		waitForElement(devcreatepage.lnk_addlcn);
		devcreatepage.switch_win(parentwin); 
	}
	
	public void gdb_splitter_location_fill(String locnclli) throws Throwable{
		jsClick(btn_NB_Location_view);
		String parentwin=devcreatepage.window_switch();
		actvtnpage.tbx_buildingclli2.sendKeys(locnclli);
		jsClick(devcreatepage.btn_Location_lookUp2);
		waitForElement(devcreatepage.lnk_addlcn);
		devcreatepage.switch_win(parentwin); 
	}
	public void GDB_service_area_newapproach() throws Throwable{
		int col=24,row=excel_access.getColumnCellCount("Sheet1");
		excel_access.setcelldata("GDB-Sheet","Sheet1", row, col, lbl_GDB_serviceAreaName.getText());
		excel_access.setcelldata("GDB-Sheet","Sheet1", row, 1, lbl_GDB_Initialteddate.getText());
		excel_access.setcelldata("GDB-Sheet","Sheet1", row, 0, NB_Build_Id.getText());
		
	}
	
	public void GDB_location_clli_commonarea(String buildingclli){
		jsClick(btn_NB_commonarea_Location_view);
		String parentwin=devcreatepage.window_switch();
		waitForElement(btn_NB_commonarea_Location_lookup);
		//waitForElement(btn_NB_commonarea_Location_lookup);
		tbx_NB_commonarea_buildclli.sendKeys(buildingclli);
		jsClick(btn_NB_commonarea_Location_lookup);
		waitForElement(devcreatepage.lnk_addlcn);
		devcreatepage.switch_win(parentwin); 
	}
	
	public void GDB_location_clli(String buildingclli) throws Throwable{
		jsClick(btn_NB_Location_view);
		String parentwin=devcreatepage.window_switch();
		waitForElement(btn_gdb_locationlookUp);
		tbx_NB_buildclli.sendKeys(buildingclli);
		
		jsClick(btn_gdb_locationlookUp);//Rework
		Thread.sleep(2000);
		getDriver().switchTo().window(parentwin);
		waitForElement(btn_gdb_locationlookUp_previous);
		//devcreatepage.switch_win(parentwin); 
		//devcreatepage.lnk_addlcn);
		
		jsClick(orderpage.lnk_addlcn);
		Thread.sleep(2000);
		while(orderpage.lnk_addlcn.isCurrentlyVisible()){
			/*String link=orderpage.lnk_addlcn.getText();
			List<WebElement> elements = loginPage.getDriver().findElement(By.linkText(link));
			orderpage.lnk_addlcn);*/
			slf4jLogger.info("Clicked again");
			WebElement target = loginPage.getDriver().findElement(By.linkText(orderpage.lnk_addlcn.getText()));
			((JavascriptExecutor) loginPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
			Thread.sleep(1000); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
			jsClick(target);
		}
		
		/*List<WebElement> elements = loginPage.getDriver().findElement(By.linkText(orderpage.lnk_addlcn.getText()));
				elements.get(0));*/
		Thread.sleep(5000);
		
	}
	
	
	public void GDB_Device_create_excel(String GDBdevicecreate) throws Throwable{
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMHHmmss");
		Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		
		excel_access.ExcelReader(Page.envData.getFieldValue("GDB-Sheet"));
		//slf4jLogger.info(excel_access+"Excel Share path");
	//	int RowCount = excel_access.getColumnCellCount("Input_Sheet");
		int row=0;
		waitForElement(btn_gpon_OLT);
		
		GDB_expand_field(GDBdevicecreate);
		
		if(!btn_NB_Deleteicons.isEnabled()){
			slf4jLogger.info("Delete button is Disabled");
		}else throw new Error("Delete button is Enable before creation ");
		
		switch(GDBdevicecreate){
		case "OLT": row=2;					 					
					tbx_NB_RelayRack.sendKeys(excel_access.getCellData("Input_Sheet", row, 11)+date1);					
					ddl_NB_isDiverse.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 10));
					ddl_NB_nosaCertificate.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 12));
					ddl_NB_indoorOutdoor.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 13)); 
					GDB_location_clli(excel_access.getCellData("Input_Sheet", row, 5));			break;
					
		case "FDP-12port": row=3;
					tbx_NB_RelayRack.sendKeys(excel_access.getCellData("Input_Sheet", row, 11)+date1);
					ddl_NB_aerialBuried.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 14));	
					GDB_location_clli_commonarea(excel_access.getCellData("Input_Sheet", row, 5));	break;
		
		case "SPLITTER": row=4; 
				//tbx_NB_RelayRack.sendKeys(excel_access.getCellData("Input_Sheet", row, 11));
				//tbx_NB_SplitterNumber.sendKeys(excel_access.getCellData("Input_Sheet", row, 15));
				tbx_NB_SplitterNumber.sendKeys(date1);
				/*String Splitterport=excel_access.getCellData("Input_Sheet", row, 16);
				slf4jLogger.info(Splitterport);
				String[] Splitterport_parts = Splitterport.split("\\.");				
				String Splitterport_parts1 = Splitterport_parts[0];
				 slf4jLogger.info(Splitterport_parts1+Splitterport_parts[1]);
				tbx_NB_Splitterport.sendKeys(Splitterport_parts1);*/
				tbx_NB_Splitterport.sendKeys(date1);
				ddl_NB_aerialBuried.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 14));	
				GDB_location_clli_commonarea(excel_access.getCellData("Input_Sheet", row, 5));	break;
				
		case "FDP-144port":row=5;
				tbx_NB_RelayRack.sendKeys(excel_access.getCellData("Input_Sheet", row, 11)+date1);
				ddl_NB_aerialBuried.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 14));	
				GDB_location_clli_commonarea(excel_access.getCellData("Input_Sheet", row, 5));	break;
				
		case "MST":  row=6;
				tbx_NB_RelayRack.sendKeys(excel_access.getCellData("Input_Sheet", row, 11)+date1);
				ddl_NB_aerialBuried.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 14));	
				GDB_location_clli(excel_access.getCellData("Input_Sheet", row, 5));	break;
					
		case "ONT":row=7;
				ddl_NB_aerialBuried.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 14));	
				ddl_NB_selfTechInstall.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 18));
				ddl_NB_buildType.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 19));
				ddl_NB_indoorOutdoor.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 20));
				//tbx_NB_Rontaid.sendKeys(excel_access.getCellData("Input_Sheet", row, 17));
				tbx_NB_Rontaid.sendKeys(date1);
				GDB_location_clli(excel_access.getCellData("Input_Sheet", row, 5));	break;
				}
		
		// Topology section		
		gdbtopology_fill(excel_access.getCellData("Input_Sheet", row, 7),excel_access.getCellData("Input_Sheet", row, 8));
		
		
		//Shared Flag
				switch(excel_access.getCellData("Input_Sheet", row, 9)){
				case "Shared": jsClick(rbt_NB_sharedFlag); break;
				case "Dedicated": jsClick(rbt_NB_dedicatedFlag); break;
				}
		
		//Common fields
		ddl_NB_deviceType.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 3)); 
		ddl_NB_deviceSubType.selectByVisibleText(excel_access.getCellData("Input_Sheet", row, 4));
		
		
		//btn_NB_Topologylookup);//3
		//tbx_GDB_Topologyname.sendKeys();654
		//devcreatepage.topology_fill();	
		
		
		
		
		
		//Device Clli
		//String deviceclli_exceldata=excel_access.getCellData("Input_Sheet", 2, 6);
		//String deviceclli_exceldata_str = excel_access.getCellData("Input_Sheet", row, 6);
		
		/*slf4jLogger.info(deviceclli_exceldata_str);
		int deviceclli_exceldata_length=deviceclli_exceldata_str.length();
		slf4jLogger.info(deviceclli_exceldata_length);
		
		
        char char0 = deviceclli_exceldata_str.charAt(0);//p
        char char1 = deviceclli_exceldata_str.charAt(1);//m
        char char2 = deviceclli_exceldata_str.charAt(2);//p
        char char3 = deviceclli_exceldata_str.charAt(3);//m
        char char4 = deviceclli_exceldata_str.charAt(4);//p
        char char5 = deviceclli_exceldata_str.charAt(5);//m
        char char6 = deviceclli_exceldata_str.charAt(6);//p
        char char7 = deviceclli_exceldata_str.charAt(7);//m
       
        
		if(deviceclli_exceldata_length+1>8){
				String deviceclli=String.valueOf(char0)+String.valueOf(char1)+String.valueOf(char2)+String.valueOf(char3)+String.valueOf(char4)+String.valueOf(char5)+String.valueOf(char6)+String.valueOf(char7);
				slf4jLogger.info(deviceclli);
				tbx_NB_CLLI.sendKeys(deviceclli);
			 char char8 = deviceclli_exceldata_str.charAt(8);//p
		        char char9 = deviceclli_exceldata_str.charAt(9);//m
		        char char10 = deviceclli_exceldata_str.charAt(10);//m
		        String deviceclli_desig=String.valueOf(char8)+String.valueOf(char9)+String.valueOf(char10);
		        slf4jLogger.info(deviceclli_desig);
			tbx_NB_Location_Designator.sendKeys(deviceclli_desig);
			
		} else {
			
			tbx_NB_CLLI.sendKeys(deviceclli_exceldata_str);			
		}		*/

		
		gdbdeviceclli(excel_access.getCellData("Input_Sheet", row, 6));
		
		jsClick(btn_NB_Createicon);
		waitForElement(btn_gpon_expand);
		//loginPage.waitForPresenceOf(btn_gpon_expand);
		Thread.sleep(2000);
		
	    slf4jLogger.info("Device Status: "+lbl_device_status.getText());
	    if(!lbl_device_status.getText().equals("Success")){
			slf4jLogger.info("Failed");
		}
	    slf4jLogger.info("Device Device: "+lbl_oltdeviceGDB.getText());
	    
		//slf4jLogger.info("Device Created Successfully"); 
		
	    if(btn_NB_Deleteicons.isEnabled()){
			slf4jLogger.info("Delete button is Enable After creation");
		}else throw new Error("Delete button is Disable After creation ");
	    
	}
	
	public void GDB_expand_field(String GDBdevicecreate) throws Throwable{
	
		switch(GDBdevicecreate){
		case "OLT": jsClick(btn_gpon_OLT_box); Thread.sleep(2000);break;
		case "ONT": jsClick(btn_gpon_ONT_box); Thread.sleep(2000);break;
		case "FDP-12port": jsClick(btn_gpon_FDP_box); Thread.sleep(2000);break;
		case "FDP-144port": jsClick(btn_gpon_FDH_second); Thread.sleep(2000);break;
		case "SPLITTER": jsClick(btn_gpon_Splitter_box); Thread.sleep(2000);break;
		case "MST": jsClick(btn_gpon_MST_box); Thread.sleep(2000);break;
		case "MDU": jsClick(btn_gpon_MDU_box); Thread.sleep(2000);break;		
		}
		
		waitForElement(btn_gpon_expand);
		
		if(btn_gpon_expand.isCurrentlyVisible()){
		while(btn_gpon_expand.isPresent()){
			jsClick(btn_gpon_expand);
		
			waitForElement(rbt_NB_sharedFlag);
			
			}
		}

	}
	
	public void GDB_Device_dropDow(String devicetype) throws Throwable {
        switch(devicetype){        
        case "OLT":// jsClick(ddl_NB_deviceType);
                        ddl_NB_deviceType.selectByIndex(2);
                        Thread.sleep(2000);
                        //jsClick(ddl_NB_deviceSubType);
                     ddl_NB_deviceSubType.selectByIndex(1);
                     Thread.sleep(2000);
                     //jsClick(ddl_NB_isDiverse);
                     ddl_NB_isDiverse.selectByIndex(1);
                     Thread.sleep(2000);
                     //jsClick(ddl_NB_nosaCertificate);
                     ddl_NB_nosaCertificate.selectByIndex(1);
                     Thread.sleep(2000);
                     break;
        
        case "FDP":   jsClick(ddl_NB_deviceType);
						  ddl_NB_deviceType.selectByIndex(2);
						  jsClick(ddl_NB_deviceSubType);
						  ddl_NB_deviceSubType.selectByIndex(2);
						  jsClick(ddl_NB_isDiverse);
						  ddl_NB_isDiverse.selectByIndex(3); break;
		default: ddl_NB_deviceType.selectByIndex(2);
			        Thread.sleep(2000);
			        //jsClick(ddl_NB_deviceSubType);
			     ddl_NB_deviceSubType.selectByIndex(1);
			     Thread.sleep(2000);
			     //jsClick(ddl_NB_isDiverse);
			     
			     Thread.sleep(2000); break;
        
        }
 }

	
	//**********************US60475 - Changes - 7/10/2017 ***************************//
		
	public void GDB_manually_adding_selected_device(String Devicetype) throws Throwable{
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		
		int i=0,devicename_col=0; String deviceclick=null;
		wait.until(ExpectedConditions.visibilityOf(cbx_GDB_existing_device_select));
		jsClick(cbx_GDB_existing_device_select);
		wait.until(ExpectedConditions.visibilityOf(tbx_GDB_existing_device_deviceclli));
		Thread.sleep(2500);
		
		tbx_GDB_existing_device_deviceclli.sendKeys("TESTYYYY");
		Thread.sleep(500);
		
		jsClick(btn_GDB_existing_device_lookup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_gpon_FDNdeviceprv));
		
		String Devicesearchcolumnheader=".//*[@id='columntablecreateDevLookUpId']/div[";
		
		for(i=1;i<4;){
			if(getDriver().findElement(By.xpath(Devicesearchcolumnheader+i+"]/div/div[1]")).getText().equals("Device Full Name")){
				devicename_col=i;
				break;
			}
			i++;
			if(!getDriver().findElement(By.xpath(Devicesearchcolumnheader+i+"]/div/div[1]")).isDisplayed()){
				break;
			}
		}
		
		if(devicename_col!=0){
			
			String devicename=".//*[@id='contenttablecreateDevLookUpId']/div[";
			
			for(i=1;i>0;){
				if(getDriver().findElement(By.xpath(devicename+i+"]/div["+devicename_col+"]/div")).getText().contains(Devicetype)){
					deviceclick=".//a[text()='"+getDriver().findElement(By.xpath(devicename+i+"]/div[1]/div")).getText()+"']";
					break;
				}
				i++;
				if(!getDriver().findElement(By.xpath(devicename+i+"]/div["+devicename_col+"]/div")).isDisplayed()){
					jsClick(btn_gpon_FDNdevicenext);
					i=1;
				}
				
			}
			
			Thread.sleep(1000);
			jsClick(getDriver().findElement(By.xpath(deviceclick)));
			
			Thread.sleep(5000);
			
			waitForAnyTextToAppear(lbl_device_status,"Success");
			Thread.sleep(3000);
		}
		/*
		
		if(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible()){
			//Thread.sleep(500);
			orderpage.btn_downarrow_devicescroll);
			Thread.sleep(1000);
			orderpage.btn_downarrow_devicescroll);
			Thread.sleep(500);
			
		}*/
		
		
	}
	
	public void validating_GDB_Fiberlink_portstatus(String port,String portstatus) throws Throwable{
		
		switch(port){
		
		case "Consumed":if(portstatus.equals("Disabled")){		
			
			jsClick(getDriver().findElement(By.id("tab:0")));
							Thread.sleep(3000);
							
										
							String deviceA=lbl_oltdeviceGDB.getText();
							
							
							jsClick(getDriver().findElement(By.id("tab:2")));
							Thread.sleep(5000);
							
							
							String deviceZ=lbl_oltdeviceGDB.getText();
							
							jsClick(getDriver().findElement(By.id("tab:1")));
							
							waitForElement(ddl_flgdbstartid);
							
							
						
							ddl_flgdbstartid.selectByValue(deviceA);
							Thread.sleep(8000);
							waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
							ddl_flgdbendid.selectByValue(deviceZ);
							Thread.sleep(5000);
							waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
							
							if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
								 if(cbx_OLT_deviceAport1.isSelected()){
										slf4jLogger.info("Port is been selected of Device A");
									}else {
										throw new Error("Device A Port is NOT selected");
									}
							} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
								 if(cbx_deviceAshelf1slot2port1.isSelected()){
										slf4jLogger.info("Port is been selected of Device A");
									}else {
										throw new Error("Device A Port is NOT selected");
									}									
							} 
							
							 if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
								 if(cbx_deviceZshelf1slot1port1_Newport.isSelected()){
										slf4jLogger.info("Port is been consumed of Device Z");
									}else {
										throw new Error("Device Z Port is NOT selected");
									}
								} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
									 if(cbx_deviceZshelf1slot1port1_ONT.isSelected()){
											slf4jLogger.info("ONT Port is consumed of Device Z");
										}else {
											throw new Error("Device Z Port is NOT selected");
										}
								
								}  							
							
							
						} else if(portstatus.equals("Enabled")){ 
							
							if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
								 if(!cbx_OLT_deviceAport1.isSelected()){
										slf4jLogger.info("Port is Enabled of Device A");
									}else {
										throw new Error("Device A Port is NOT enabled");
									}
							} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
								 if(!cbx_deviceAshelf1slot2port1.isSelected()){
										slf4jLogger.info("Port is Enabled Device A");
									}else {
										throw new Error("Device A Port is NOT enabled");
									}									
							} 
							
							 if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
								 if(!cbx_deviceZshelf1slot1port1_Newport.isSelected()){
										slf4jLogger.info("Port is Enabled of Device Z");
									}else {
										throw new Error("Device Z Port is NOT enabled");
									}
								} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
									 if(!cbx_deviceZshelf1slot1port1_ONT.isSelected()){
											slf4jLogger.info("ONT Port Enabled of Device Z");
										}else {
											throw new Error("Device Z Port is NOT enabled");
										}
								
								}  						
							}	 break;
						
		case "Displayed":   jsClick(getDriver().findElement(By.id("tab:0")));
								Thread.sleep(3000);
								
								
								String deviceA=lbl_oltdeviceGDB.getText();
								
								
								jsClick(getDriver().findElement(By.id("tab:2")));
								Thread.sleep(5000);
								
								
								String deviceZ=lbl_oltdeviceGDB.getText();
								
								jsClick(getDriver().findElement(By.id("tab:1")));
								
								waitForElement(ddl_flgdbstartid);
								
								
							
								ddl_flgdbstartid.selectByValue(deviceA);
								Thread.sleep(8000);
								waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
								ddl_flgdbendid.selectByValue(deviceZ);
								Thread.sleep(5000);
								waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
								
								if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
									
										slf4jLogger.info("OLT Device Port is Following this format:"+cbx_OLT_deviceAport1.getText()+" Which is expected");
													
								} else if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
									
									slf4jLogger.info("Device A Port is Following this format:"+cbx_deviceAshelf1slot2port1.getText()+" Which is expected");
									
								} else {
									throw new Error("Device A Port is NOT Following the correct format as per US57058");
								}
								
								
								if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
									
									slf4jLogger.info("Device Z Port is Following this format:"+cbx_deviceZshelf1slot1port1_Newport.getText()+" Which is expected");
									
								} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
									
									slf4jLogger.info("ONT Device Port is Following this format:"+cbx_deviceZshelf1slot1port1_ONT.getText()+" Which is expected");
									
								
								}else {
									throw new Error("Device Z Port is NOT Following the correct format as per US57058");
								} break;
		
		
		}
		
	}
	
	//*************  US166829 --- Changes	7/12/2017 ********************************************//
	
	public String GDN_MST_ONT_FDN_fiberlink()  throws Throwable{
		String deviceA;
		if(btn_gpon_MST_box.isCurrentlyVisible() && btn_gpon_ONT_box.isCurrentlyVisible() ){
			
			jsClick(btn_gpon_MST_box);
			Thread.sleep(3000);
			deviceA=lbl_oltdeviceGDB.getText();
			
			jsClick(btn_gpon_ONT_box);
			Thread.sleep(3000);
			
			GDB_expand_field("ONT");
			
			
			
			
		} else {
			throw new Error(" In- valid GDB component selection");
		}
		return deviceA;			
				
				
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),50000);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	
	public void waitForInvisibility(WebElement webElement) {
		int maxSeconds=50000;
	    Long startTime = System.currentTimeMillis();
	    try {
	        while (System.currentTimeMillis() - startTime < maxSeconds * 1000 && webElement.isDisplayed()) {}
	    } catch (StaleElementReferenceException e) {
	        return;
	    }
	}
	
	public void GDB_functionalstatus(String fs) throws Throwable {
		if(btn_gpon_expand.isCurrentlyVisible()){
			jsClick(btn_gpon_expand);
			Thread.sleep(2000);
			waitForElement(btn_gpon_shrink);			
		}
		switch(fs){
		case "None":ddl_gdb_toprow_funcstatus.selectByVisibleText("--Select--");break;
		default:ddl_gdb_toprow_funcstatus.selectByVisibleText(fs);break;
		}
		
		
	 }
	
	public void GDB_searchselect_criteria(String criteria) throws Throwable{
		
		switch(criteria){
		
		case "Initiated By": tbx_SearchTabGDB_Initialtedby.sendKeys(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));
							break;
		
		}		
		
	}
	
	public void GDB_Sanity_validations() throws Throwable{
		waitForElement(lbl_GDB_eng_orderid); Thread.sleep(3000);
		if(tab_GDB.isCurrentlyVisible()){
			slf4jLogger.info("GPON Device Build launch screen is displayed");
			if(lbl_GDB_buildid.isCurrentlyVisible()) {
				slf4jLogger.info("Build ID label is displayed with value as:"+lbl_GDB_buildid_value.getText());
				
				if(!btn_GDB_buildid_clone.isCurrentlyVisible()){
					throw new Error("Build ID Clone button is not displayed in GDB Screen");
				
				}
			} else {
				throw new Error("Build ID label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_eng_orderid.isCurrentlyVisible()) {
				slf4jLogger.info("Eng.Order ID label is displayed with value as:"+lbl_GDB_eng_orderid_value.getText());				
				
			} else {
				throw new Error("Eng.Order ID label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_initiatedby.isCurrentlyVisible()) {
				slf4jLogger.info("Initialted By label is displayed with value as:"+lbl_GDB_initiatedby_value.getText());				
				
			} else {
				throw new Error("Initialted By ID label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_lastupdatedby.isCurrentlyVisible()) {
				if(tab_Gpon_Ntw_search_result.isCurrentlyVisible()){
					slf4jLogger.info("Last Updated By label is displayed with value as:"+lbl_GDB_lastupdatedby_value.getText());	
				} else {
					slf4jLogger.info("Last Updated By label is displayed with no value since its a new create launch");	
				}
							
				
			} else {
				throw new Error("Last Updated By label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_status.isCurrentlyVisible()) {
				slf4jLogger.info("Status label is displayed with value as:"+lbl_GDB_status_value.getText());	
				
				if(btn_GDB_status_refresh.isCurrentlyVisible()){
					slf4jLogger.info("Status Refresh button is displayed");	
				}
				
			} else {
				throw new Error("Status label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_servingWC.isCurrentlyVisible()) {
				slf4jLogger.info("Serving Wire center label is displayed with value as:"+lbl_GDB_servingWC_value.getText());				
				
			} else {
				throw new Error("Serving Wire center label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_intiateddate.isCurrentlyVisible()) {
				slf4jLogger.info("Initiated date label is displayed with value as:"+lbl_GDB_intiateddate_value.getText());				
				
			} else {
				throw new Error("Initiated date label is not displayed in GDB Screen");
			}
			
			if(lbl_GDB_last_updateddate.isCurrentlyVisible()) {
				if(tab_Gpon_Ntw_search_result.isCurrentlyVisible()){
					slf4jLogger.info("Last Updated date label is displayed with value as:"+lbl_GDB_last_updateddate_value.getText());		
				} else {
					slf4jLogger.info("Last Updated date label is displayed with no value since its a new create launch");			
				}
						
				
			} else {
				throw new Error("Last Updated date label is not displayed in GDB Screen");
			}	
			
			slf4jLogger.info("GDB Top Row Action button Validations Check");
			
			if(btn_GDB_save2excel.isCurrentlyVisible() && btn_GDB_save2excel.isCurrentlyEnabled()){				
					slf4jLogger.info("Excel Button is Displayed & clickable");				
				
			} else {
				throw new Error("Excel Button is not Displayed & clickable");
				
			}
			
			if(btn_GDB_getauditlogs.isCurrentlyVisible() && btn_GDB_getauditlogs.isCurrentlyEnabled()){				
				slf4jLogger.info("Audit Button is Displayed & clickable");				
			
			} else {
			throw new Error("Audit Button is not Displayed & clickable");
			
			}
			
			if(btn_GDB_getstatushistory.isCurrentlyVisible() && btn_GDB_getstatushistory.isCurrentlyEnabled()){				
				slf4jLogger.info("Get Status History Button is Displayed & clickable");				
			
			} else {
			throw new Error("Get Status History Button is not Displayed & clickable");
			
			}
			
			slf4jLogger.info("GDB Device Check");
			
			if(btn_gpon_OLT.isCurrentlyVisible() && btn_gpon_OLT.isCurrentlyEnabled()){				
				slf4jLogger.info("OLT Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("OLT Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_Splitter.isCurrentlyVisible() && btn_gpon_Splitter.isCurrentlyEnabled()){				
				slf4jLogger.info("Splitter Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("Splitter Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_FDP.isCurrentlyVisible() && btn_gpon_FDP.isCurrentlyEnabled()){				
				slf4jLogger.info("FDP Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("FDP Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_MST.isCurrentlyVisible() && btn_gpon_MST.isCurrentlyEnabled()){				
				slf4jLogger.info("MST Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("MST Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_MDU.isCurrentlyVisible() && btn_gpon_MDU.isCurrentlyEnabled()){				
				slf4jLogger.info("MDU Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("MDU Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_servicearea.isCurrentlyVisible() && btn_gpon_servicearea.isCurrentlyEnabled()){				
				slf4jLogger.info("Service Area Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("Service Area Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_FDH.isCurrentlyVisible() && btn_gpon_FDH.isCurrentlyEnabled()){				
				slf4jLogger.info("FDH Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("FDH Box Button is not Displayed & clickable");
			
				}
			
			if(btn_gpon_ONT.isCurrentlyVisible() && btn_gpon_ONT.isCurrentlyEnabled()){				
				slf4jLogger.info("ONT Box Button is Displayed & clickable");				
			
				} else {
					throw new Error("ONT Box Button is not Displayed & clickable");
			
				}
			
		}
		
	}
	
	public void validate_SA_section()throws Throwable{
		//gdbcreatepage.btn_gpon_Servicearea);
		Thread.sleep(2000);
		jsClick(btn_gpon_Servicearea_box);
		btn_NB_SA_Add.shouldBePresent();
		btn_NB_SA_CreateAll.shouldBePresent();
		btn_NB_SA_DeleteAll.shouldBePresent();
		btn_NB_SA_RemoveAll.shouldBePresent();
		String GDB_SA[] ={"Service Area Name*","Device Name*","Device Location*","Create","Remove","Delete","Notes"};
		for(int i=0; i<=GDB_SA.length-1;i++){
		for(int j=0; j<=lbl_SA_Hearders.size()-1;j++){
			if(GDB_SA[i].equals(lbl_SA_Associate_Hearders.get(j).getText()))
				slf4jLogger.info(lbl_SA_Hearders.get(j).getText());
			}}
			Thread.sleep(2000);
			slf4jLogger.info("Validated Service area section in GDB");
		}
	
	public void validate_Add_SA()throws Throwable{
		int count = GDB_SA_Rowcount.size();
		tbx_NB_SA_Add.sendKeys("50");
		jsClick(btn_NB_SA_Add);
		Thread.sleep(2000);
		int AfterAddcount = GDB_SA_Rowcount.size()+50;
		//int count = gdbcreatepage.GDB_SA_Rowcount.size();	
		//slf4jLogger.info(count);
		if(AfterAddcount == (count+50)){
			slf4jLogger.info("Successfully Added service area rows");
		}else throw new Error("Service area rows are not added");		
	}
	public boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        getDriver().switchTo().alert();
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	} 
	public void verify_validation(String changes) throws Throwable{
		int i;
		switch(changes){
		case "select a port from Device z and verify the warning message": verify_port_warning_popup();break;
		case "Exiting Check bos is disabled":
			if(!cbx_GDB_Existing_device.isEnabled()) {
				System.out.println("Existing check box is disabled as expected");
				}else throw new Error("Existing check box is enabled ");
			break;
			
		case "all the fields are populated":
			jsClick(btn_gpon_OLT_box); Thread.sleep(2000);
			jsClick(btn_gpon_expand);Thread.sleep(2000);
			String devcice=tbx_NB_CLLI.getText();
			String location=tbx_NB_location_device.getText();
			if(devcice!=null && location!=null) {
				System.out.println("fields are populated in gdb device page for existing device");
				
			}else {
				System.out.println("Device details are not populated for existing device");
				throw new Error("Device details are not populated for existing device");
				
			}break;
		
		case "Remove icon for created Fiberlink in GDB":
			Thread.sleep(4000); 
			waitForElement(btn_created_fiberlink_remove_slot01);Thread.sleep(5000); 
			if(btn_created_fiberlink_remove_slot01.isCurrentlyEnabled()){
				jsClick(btn_created_fiberlink_remove_slot01);
				Thread.sleep(2000);
				if(isAlertPresent()){
					throw new Error("Remove icon is Enable After Fiberlink creation");
				}
			
		  System.out.println("Remove icon is disable after FiberLink Creation");
			}
			break;

		case "all fiber link got created in gdb screen":
			waitForElement(btn_fiberlink_edit_slot1);
				i=1;
				while((isElementVisible(By.xpath("(//div[@class='tab-pane ng-scope active']//i[@ng-show='showEditFiber'])["+i+"]")) && i<=4 )){
					if(!isElementVisible(By.xpath("(//div[@class='tab-pane ng-scope active']//td[text()='Fiber Link created successfully.'])["+i+"]"))){
						slf4jLogger.debug("Fiber link didnt get created successfully for slot:"+i);
						throw new Error("Fiber link didnt get created successfully for slot:"+i);
					}
					
					System.out.println("Link no"+i);
					i++;
				}
				
				break;
				
		case "add 200 more Service area component on GDB Screen":
			waitForElement(tbx_NB_SA_Add);
			tbx_NB_SA_Add.type("200");
			jsClick(btn_NB_SA_Add);
			Thread.sleep(2000);
			break;
			
		case "fill all the mandatory fields present for Service area in GDB screen":
			jsClick(btn_gpon_MST_box);Thread.sleep(2000);
			waitForElement(lbl_deviceGDB);
			String Devicename = lbl_deviceGDB.getText();
			
			jsClick(btn_gpon_servicearea_box);
			
			waitForElement(tbx_NB_SA_name); 
			i=1;
			while(isElementVisible(By.xpath("(//input[@id='serviceArea'])["+i+"]"))){
				
				getDriver().findElement(By.xpath("(.//input[@id='serviceArea'])["+i+"]")).sendKeys("SA_"+i);
				
				getDriver().findElement(By.xpath("(.//*[@ng-model='serviceArea.DEVICE_NM'])["+i+"]")).sendKeys(Devicename);
				
				waitForElement(getDriver().findElement(By.xpath(".//strong[text()='"+Devicename+"']")));
				Thread.sleep(1000);				
				jsClick(getDriver().findElement(By.xpath(".//strong[text()='"+Devicename+"']")));
				
				//getDriver().findElement(By.xpath("(.//input[@ng-model='serviceArea.GDB_SERV_AREA_LOCATION'])["+i+"]")).sendKeys("7");
				
			//	waitForElement(getDriver().findElement(By.xpath(".//strong")));
				
				Thread.sleep(1000);
				//tbx_NB_SA_device_name.sendKeys(Keys.ENTER);
				//jsClick(getDriver().findElement(By.xpath(".//strong")));
				
				i++;
			}			
			
			break;
			
		case "delete button is disabled in the GDB Screen on changing the device role to Ethernet":
					jsClick(tab_GDB);Thread.sleep(2000);
					waitForElement(btn_gpon_delete_slot1);
					jsClick(btn_gdb_refresh);
					Thread.sleep(2000);			
					jsClick(btn_gpon_delete_slot1);
					Thread.sleep(2000);
					if(!getDriver().switchTo().alert().getText().contains("Ethernet devices are not allowed to be deleted.")){
						slf4jLogger.debug("Device is not getting changed please check");
						throw new Error("Device is not getting changed please check");
					}
					getDriver().switchTo().alert().accept();
					
					if(!btn_gpon_delete_slot1.isCurrentlyEnabled()){
						slf4jLogger.debug("Delete icon button is not getting disabled");
						throw new Error("Delete icon button is not getting disabled");
					}			
					break;
			
		case "error while deleting FDH from GDB which contains FDP/Splitter":
			
						jsClick(tab_GDB);Thread.sleep(2000);
						waitForElement(btn_gpon_delete_slot1);
						jsClick(btn_gpon_delete_slot1);Thread.sleep(2000);
						getDriver().switchTo().alert().accept();Thread.sleep(2000);
						
						
						waitForElement(lbl_NB_GDB_alert_msg);
						
						if(!lbl_NB_GDB_alert_msg.getText().trim().contains("Failed to Delete, FDH Contains devices")){
							slf4jLogger.debug("Invalid message is displayed on the delete action on FDH"+lbl_NB_GDB_alert_msg.getText().trim());
							throw new Error("Invalid message is displayed on the delete action on FDH"+lbl_NB_GDB_alert_msg.getText().trim());
						}		
						
						break;
			
		case "first fiber link is created only in gdb screen":

					if(!isElementVisible(By.xpath("(//div[@class='tab-pane ng-scope active']//td[text()='Fiber Link created successfully.'])[1]"))){
						slf4jLogger.debug("Fiber link didnt get created successfully");
						throw new Error("Fiber link didnt get created successfully");
					}
					
					if(isElementVisible(By.xpath("(//div[@class='tab-pane ng-scope active']//td[text()='Fiber Link created successfully.'])[2]"))){
						slf4jLogger.debug("Fiber link got created successfully for second link on Create all");
						throw new Error("Fiber link got created successfully for second link on Create all");
					}
					
					break;
		case "select the first link checkbox in GDB fiber screen":

			jsClick(cbx_NB_fiberlinkfirst); Thread.sleep(2000);
			break;
		
		case "adresses in Location look up for GDB device":
						while(btn_gpon_expand.isPresent()){
							jsClick(btn_gpon_expand);
							Thread.sleep(5000);
						}
						
						jsClick(btn_NB_Location_view);
						
						waitForElement(btn_GDB_SA_Locationlookup);
						
						tbx_NB_Location_address.type("123");
						
						ddl_NB_Location_state.selectByVisibleText("FL-Florida");
						
						jsClick(btn_GDB_SA_Locationlookup);
						
						waitForElement(lnk_addlcn);
						if(!lbl_NB_Location_lookupresultmorethan10.isCurrentlyVisible()){
							slf4jLogger.debug("Location result is not more than 10");
						}
						break;
		case "select multiple ports from Device A and Device Z in GDB fiber link screen":
			gdblinkestablish(4);			
			break;
			
		case "Audit logs for the fiber link remove functionality":
						jsClick(btn_fiber_auditlogs);			
						waitForElement(btn_GDBauditlogs_getlogs);	
						jsClick(icon_auditlogs_refresh);
						Thread.sleep(5000);	
						//jsClick(btn_GDBauditlogs_getlogs);			
						//Thread.sleep(2000);			
						waitForElement(lbl_gdbauditlogs_actiontypeheader);	
						
						
						
						if(!lbl_fiber_auditlogs_removelog.isCurrentlyVisible()){
							slf4jLogger.debug("Fiber log Remove log is not displayed in audit log of GDB screen");
							throw new Error("Fiber log Remove log is not displayed in audit log of GDB screen");				
						}	
						jsClick(btn_tab_fiber_auditlogs_clsicon);			
						break;
			
		case "Audit logs for the fiber link delete functionality":			
					jsClick(btn_fiber_auditlogs);			
					waitForElement(btn_GDBauditlogs_getlogs);	
					jsClick(icon_auditlogs_refresh);
					Thread.sleep(5000);
					//jsClick(btn_GDBauditlogs_getlogs);			
					Thread.sleep(2000);			
					waitForElement(lbl_gdbauditlogs_actiontypeheader);	
					
					
					
					if(!lbl_fiber_auditlogs_deletelog.isCurrentlyVisible()){
						slf4jLogger.debug("Fiber log Delete log is not displayed in audit log of GDB screen");
						throw new Error("Fiber log Delete log is not displayed in audit log of GDB screen");				
					}	
					jsClick(btn_tab_fiber_auditlogs_clsicon);
					break;
		case "Audit logs for the fiber link update functionality":
						jsClick(btn_fiber_auditlogs);			
						waitForElement(btn_GDBauditlogs_getlogs);			
						//jsClick(btn_GDBauditlogs_getlogs);			
						Thread.sleep(2000);			
						waitForElement(lbl_gdbauditlogs_actiontypeheader);	
						
						
						
						if(!lbl_fiber_auditlogs_updatelog.isCurrentlyVisible()){
							slf4jLogger.debug("Fiber log Update log is not displayed in audit log of GDB screen");
							throw new Error("Fiber log Update log is not displayed in audit log of GDB screen");				
						}	
						jsClick(btn_tab_fiber_auditlogs_clsicon);
						break;
		case "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen":
					tbx_fiberlink_edit_cableid1.type("1234456");
					tbx_fiberlink_edit_startstrandno1.type("1234456");
					ddl_fiberlink_edit_aerialrburried1.selectByVisibleText("Buried");
					
					break;
					
		case "Change the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen":
			tbx_fiberlink_edit_cableid1.type("1234456");
			tbx_fiberlink_edit_startstrandno1.type("1234456");
			ddl_fiberlink_edit_aerialrburried1.selectByVisibleText("Buried");
			break;			
		
		case "select ports from Device A and Device Z in GDB fiber link screen":
			gdblinkestablish();			
			break;
		case "select ports from Device A and Device Z in 2nd GDB fiber link screen":
			gdb2ndlinkestablish();			
			break;
			
		case "select all ports from Device A and Device Z in GDB fiber link screen":
			gdbAll_links_establish();			
			break;
			
		case "Validate cable id & StartStrand ID casecade functionality":
			boolean flag=false;
			Set <String> cableIdSet = new HashSet<String>();
			List <Integer> StartStrandList = new ArrayList<Integer>();
			for(int j=0; j<=lbl_CableIDList.size()-1; j++){
				cableIdSet.add(lbl_CableIDList.get(j).getText());
			}
			if(cableIdSet.size()==1){
				System.out.println("cable id of fiberlink is casecaded as same");
			}else{
				System.out.println("cable id of fiberlink is not casecaded as same");
			}
			Thread.sleep(2000);	
			for(int k=0; k<=lbl_StartStrandNoList.size()-1; k++){
				System.out.println("StartStrand string value is = "+lbl_StartStrandNoList.get(k).getText());
				Integer num = Integer.parseInt(lbl_StartStrandNoList.get(k).getText());
				System.out.println("StartStrand int value is =  "+num);
				StartStrandList.add(num);
			}	
			System.out.println(StartStrandList);
			 for(int m=0;m<StartStrandList.size()-1;m++) {
				 System.out.println("Startstrand is "+StartStrandList.get(m));	 
					if(StartStrandList.get(m)==(StartStrandList.get(m+1))-1) {
						flag=true;
				System.out.println(StartStrandList.get(m));
					}else flag=false;
				 } 
				 if(flag==false){				 
					 System.out.println("StartStrand Id of fiberLinks are not created in sequence"); 
				 }else { 
					 System.out.println("StartStrand Id of fiberLinks are created in sequence");
				 }
			break;
		case "Audit logs for the fiber link create functionality":
					jsClick(btn_fiber_auditlogs);			
					waitForElement(btn_GDBauditlogs_getlogs);			
					jsClick(btn_GDBauditlogs_getlogs);			
					Thread.sleep(2000);			
					waitForElement(lbl_gdbauditlogs_actiontypeheader);	
					
					
					
					if(!lbl_fiber_auditlogs_createlog.isCurrentlyVisible()){
						slf4jLogger.debug("Fiber log Create log is not displayed in audit log of GDB screen");
						throw new Error("Fiber log Create log is not displayed in audit log of GDB screen");				
					}	
					jsClick(btn_tab_fiber_auditlogs_clsicon);
					break;
			
		case "remove the associated address in GDB Service area":
			browser_zoom_in(4);
			Thread.sleep(1000);
			if(btn_gpon_expand.isPresent()){
				jsClick(btn_gpon_expand);
			
			}
			waitForElement(btn_NB_serviceare_searchaddresses);
			
			jsClick(btn_NB_serviceare_searchaddresses);
			waitForElement(btn_NB_serviceare_searchaddresses_srchlcnicon);
			tbx_NB_serviceare_searchaddresses_buildingclli.type("LSVGNV01");
			jsClick(btn_NB_serviceare_searchaddresses_srchlcnicon);												
			waitForElement(btn_NB_serviceare_searchaddresses_associtelcnicon);
			
			
			waitForElement(cbx_NB_serviceare_searchaddresses_resultall);
			cbx_NB_serviceare_searchaddresses_resultall.click();
			Thread.sleep(1000);
			//jsClick(cbx_NB_serviceare_searchaddresses_resultall);
		/*	if(cbx_NB_serviceare_searchaddresses_resultall.isCurrentlyVisible()){													
				slf4jLogger.info("Clicked again");
				WebElement target = getDriver().findElement(By.linkText(cbx_NB_serviceare_searchaddresses_resultall.getText()));
				((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
				Thread.sleep(500); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
				target);
			} */
			Thread.sleep(1000);
			jsClick(btn_NB_serviceare_searchaddresses_associtelcnicon);
			waitForElement(lbl_loader_servicearea);
			  if(!lbl_loader_servicearea.getText().trim().contains("Associating Service Addresses..")){
			    	slf4jLogger.debug("Associating Service loader is not displayed");
			    }
			waitForElement(btn_NB_serviceare_searchaddresses_associteSAicon);
			Thread.sleep(1000);
			
			jsClick(btn_NB_servicearea_associate_removeicon);
			Thread.sleep(1000);
			getDriver().switchTo().alert().accept();
			
			waitForElement(lbl_loader_servicearea);
			  if(!lbl_loader_servicearea.getText().trim().contains("Removing Service Addresses..")){
			    	slf4jLogger.debug("Removing Service loader is not displayed");
			    }
			
			
			browser_zoom_out(4);
			Thread.sleep(1000);
		
			break;
			
		case "Audit logs for the GDB Service area remove actions":		
			jsClick(btn_GDB_getauditlogs);			
			waitForElement(btn_GDBauditlogs_getlogs);			
			jsClick(btn_GDBauditlogs_getlogs);			
			Thread.sleep(2000);			
			waitForElement(lbl_gdbauditlogs_actiontypeheader);	
			
			if(!lbl_gdbauditlogs_servicearearemovelog.isCurrentlyVisible()){
				slf4jLogger.debug("Service Area remove log is not displayed in audit log of GDB screen");
				throw new Error("Service Area remove log is not displayed in audit log of GDB screen");				
			}	
			
			break;
		case "Audit logs for the GDB Service area Creation & Association actions":		
						jsClick(btn_GDB_getauditlogs);			
						waitForElement(btn_GDBauditlogs_getlogs);			
						jsClick(btn_GDBauditlogs_getlogs);	
						jsClick(btn_refresh);
						Thread.sleep(2000);			
						waitForElement(lbl_gdbauditlogs_actiontypeheader);	
						
						
						
						if(!lbl_gdbauditlogs_serviceareacreatelog.isCurrentlyVisible()){
							slf4jLogger.debug("Service Area Create log is not displayed in audit log of GDB screen");
							throw new Error("Service Area Create log is not displayed in audit log of GDB screen");				
						}			
						if(!lbl_gdbauditlogs_serviceareaassociationlog.isCurrentlyVisible()){
							slf4jLogger.debug("Service Area Association log is not displayed in audit log of GDB screen");
							throw new Error("Service Area Association log is not displayed in audit log of GDB screen");				
						}
						
						break;
		case "Audit logs for the GDB Service area Creation":		
			jsClick(btn_GDB_getauditlogs);			
			waitForElement(btn_GDBauditlogs_getlogs);			
			jsClick(btn_GDBauditlogs_getlogs);	
			jsClick(btn_refresh);
			Thread.sleep(2000);			
			waitForElement(lbl_gdbauditlogs_actiontypeheader);	
			
			if(!lbl_gdbauditlogs_serviceareacreatelog.isCurrentlyVisible()){
				slf4jLogger.debug("Service Area Create log is not displayed in audit log of GDB screen");
				throw new Error("Service Area Create log is not displayed in audit log of GDB screen");				
			}			
			
			break;
		case "Excel icon button on top of GDB create page":			
			if(!btn_altequitbuild_GDBexportexcel.isCurrentlyVisible()){
				slf4jLogger.debug("Excel Icon is not visisble in GDB screen");
				throw new Error("Excel Icon is not visisble in GDB screen");
			}
			break;
		
		case "search functionality of GDB from Search slider":
						waitForElement(lbl_GDB_buildid); 
							Thread.sleep(2000);			
						break;
		case "on closing the device name look up new checkbox is selected":
			waitForElement(tbx_GDB_DeviceCLLI);
			
			
			
			for(i=0;i<3;i++){
				jsClick(btn_GDB_existingdevicelookup_clsicon);
				Thread.sleep(1000); 
				
				if(!cbx_GDB_New_device.isCurrentlyVisible()){
					slf4jLogger.debug("New Check box is not selected in GDB");
					throw new Error("New Check box is not selected in GDB");
				}
				
				jsClick(cbx_GDB_Existing_device);
				Thread.sleep(2000); 
				
			}
			

			//jsClick(cbx_GDB_Existing_device);	Thread.sleep(1000); 
			
			
			break;
		case "error message should be displayed to select functional status in GPON Device build":
			jsClick(btn_NB_Createicon); Thread.sleep(1000);
			waitForElement(ddl_gdb_toprow_funcstatus);
			if(!lbl_gdb_toprow_funcstatus_errormsg.isCurrentlyEnabled()){
				slf4jLogger.debug("error message is not displayed for not selecting functional status");
				throw new Error("error message is not displayed for not selecting functional status");
			}
			break;
		case "Solr suggestions are getting displayed with a look up option for the Splitter in create page of GPON Device Page":
			while(btn_gpon_expand.isPresent()){
				jsClick(btn_gpon_expand);
				Thread.sleep(5000);
			}
			waitForElement(tbx_NB_Location2);
			tbx_NB_Location1.type("123"); Thread.sleep(2000);
			
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//li[@class='ng-scope active']")));
			
			jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//li[@class='ng-scope active']")));
			Thread.sleep(2000);
			
			tbx_NB_Location2.type("789"); Thread.sleep(2000);
			
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//li[@class='ng-scope active']")));
			
			jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//li[@class='ng-scope active']")));
			
			
			break;
		
		case "Validate GDB Location Look Up":
			
			jsClick(btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			actvtnpage.tbx_buildingclli2.sendKeys("123");
			jsClick(devcreatepage.btn_Location_lookUp2);
			Thread.sleep(3000);
			if(lbl_NB_Location_lookup_errorMsg.isDisplayed()){
				System.out.println("Error Message is Displayed as "+lbl_NB_Location_lookup_errorMsg.getText().trim());
			} else {
				System.out.println("Not Displaying Error message (or) Displaying Loctaion list in popup");
			}
			Thread.sleep(2000);
			jsClick(btn_NB_Location_lookup_close);
			Thread.sleep(2000);
			gdb_splitter_location_fill("LSVGNVXB");
			
			/*String parentwin=devcreatepage.window_switch();
			fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(gdbcreatepage.btn_GDB_SA_Locationlookup);//Rework 
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); */

			break;
		case "Associate 1 address in GDB Service area": /*waitForElement(tbx_serviceareaname); 
													        if(btn_gpon_expand.isPresent()){
													            jsClick(btn_gpon_expand);                                     
													     }
													     waitForElement(btn_NB_serviceare_searchaddresses);
													     jsClick(btn_NB_serviceare_searchaddresses);
													     waitForElement(btn_NB_serviceare_searchaddresses_srchlcnicon);
													     tbx_NB_serviceare_searchaddresses_buildingclli.type("MPLSMNCD");
													     jsClick(btn_NB_serviceare_searchaddresses_srchlcnicon);
													     waitForElement(btn_NB_serviceare_searchaddresses_associtelcnicon);
													     Thread.sleep(5000);
													     chk_NB_serviceare_searchaddresses_result1.click();
													     Thread.sleep(1000);
													     jsClick(btn_NB_serviceare_searchaddresses_associtelcnicon);
													     waitForElement(btn_NB_serviceare_searchaddresses_associteSAicon);
													     tbx_NB_serviceare_searchaddresses_rank.type("0");
													     jsClick(btn_NB_serviceare_searchaddresses_associteSAicon);
													     if(lbl_NB_servicearea_searchaddresses_rank_Error_message.getText().contains("Please enter a value between 1-99")){
													            System.out.println("Error message = "+lbl_NB_servicearea_searchaddresses_rank_Error_message.getText());
													     } else throw new Error("Not getting Error message (or) Error message is not correct");                                                                           
													     tbx_NB_serviceare_searchaddresses_rank.type("1");
													     jsClick(btn_NB_serviceare_searchaddresses_associteSAicon);
													     waitForElement(lbl_NB_serviceare_searchaddresses_afterassociationrank);break;*/
														waitForElement(tbx_serviceareaname); 
																	if(btn_gpon_expand.isPresent()){
																		jsClick(btn_gpon_expand);						
																	}
																	
																	waitForElement(btn_NB_serviceare_searchaddresses);
																	browser_zoom_in(4);
																	Thread.sleep(1000);
																	
																	jsClick(btn_NB_serviceare_searchaddresses);
																	waitForElement(btn_NB_serviceare_searchaddresses_srchlcnicon);
																	tbx_NB_serviceare_searchaddresses_buildingclli.type("MPLSMNCD");
																	jsClick(btn_NB_serviceare_searchaddresses_srchlcnicon);
																	waitForElement(btn_NB_serviceare_searchaddresses_associtelcnicon);
																	Thread.sleep(5000);
																	chk_NB_serviceare_searchaddresses_result1.click();
																	Thread.sleep(1000);
																	jsClick(btn_NB_serviceare_searchaddresses_associtelcnicon);
																	waitForElement(btn_NB_serviceare_searchaddresses_associteSAicon);
																	
																	browser_zoom_out(4);
																	Thread.sleep(1000);
																	tbx_NB_serviceare_searchaddresses_rank.type("0");
																	jsClick(btn_NB_serviceare_searchaddresses_associteSAicon);
																	if(lbl_NB_servicearea_searchaddresses_rank_Error_message.getText().contains("Please enter a value between 1-99")){
																		System.out.println("Error message = "+lbl_NB_servicearea_searchaddresses_rank_Error_message.getText());
																	} else throw new Error("Not getting Error message (or) Error message is not correct");											
																	tbx_NB_serviceare_searchaddresses_rank.type("1");
																	jsClick(btn_NB_serviceare_searchaddresses_associteSAicon);
																	waitForElement(lbl_NB_serviceare_searchaddresses_afterassociationrank);


																	


																	jsClick(btn_gdb_refresh);
																	Thread.sleep(2000);
																	jsClick(btn_gpon_expand);
																	Thread.sleep(1000);
																	break; 
													
		case "Associate multiple address in GDB Service area": waitForElement(tbx_serviceareaname); 
												browser_zoom_in(2);
												Thread.sleep(1000);
												if(btn_gpon_expand.isPresent()){
													jsClick(btn_gpon_expand);
												
												}
												waitForElement(btn_NB_serviceare_searchaddresses);
												browser_zoom_in(2);
												Thread.sleep(1000);
												jsClick(btn_NB_serviceare_searchaddresses);
												waitForElement(btn_NB_serviceare_searchaddresses_srchlcnicon);
												tbx_NB_serviceare_searchaddresses_buildingclli.type("LSVGNV01");
												jsClick(btn_NB_serviceare_searchaddresses_srchlcnicon);												
												//waitForElement(btn_NB_serviceare_searchaddresses_associtelcnicon);
												//waitForElement(lbl_loader_servicearea_lookup);
												
												WebDriverWait wait1 = new WebDriverWait(loginPage.getDriver(), 1000);
												 wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-show='acti_deviceLookup_loader'])[1]")));
												Thread.sleep(10000);
												
												
												if(btn_row_selector.isDisplayed()) {
													System.out.println("Pagination is present");
												}else {
													throw new Error("Pagination is not displayed in lookup"); 
												}
												
												btn_row_selector.click();
												Thread.sleep(1000);
												lbl_device_row_option_20.click();
												wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-show='acti_deviceLookup_loader'])[1]")));
												Thread.sleep(10000);
												waitForElement(cbx_NB_serviceare_searchaddresses_resultall);
												
												cbx_NB_serviceare_searchaddresses_resultall.click();
												
												Thread.sleep(1000);
												//jsClick(cbx_NB_serviceare_searchaddresses_resultall);
											/*	if(cbx_NB_serviceare_searchaddresses_resultall.isCurrentlyVisible()){													
													slf4jLogger.info("Clicked again");
													WebElement target = getDriver().findElement(By.linkText(cbx_NB_serviceare_searchaddresses_resultall.getText()));
													((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
													Thread.sleep(500); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
													target);
												} */
												Thread.sleep(1000);
												jsClick(btn_NB_serviceare_searchaddresses_associtelcnicon);
												waitForElement(lbl_loader_servicearea);
												
												  /*if(!lbl_loader_servicearea.getText().trim().contains("Associating Service Addresses..")){
												    	slf4jLogger.debug("Associating Service loader is not displayed");
												    }*/

												waitForElement(btn_NB_serviceare_searchaddresses_associteSAicon);
												Thread.sleep(1000);
												browser_zoom_out(2);
												Thread.sleep(1000);
												i=1;
												while(i!=0){
													getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//input[@ng-model='sAddress.GDB_SERV_ADDR_LOC_RANK'])["+i+"]")).clear();
													getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//input[@ng-model='sAddress.GDB_SERV_ADDR_LOC_RANK'])["+i+"]")).sendKeys(Integer.toString(i));
													i++;
													if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='commonItems']//tr[@ng-if='serviceArea.isExpanded']//input[@ng-model='sAddress.GDB_SERV_ADDR_LOC_RANK'])["+i+"]"))){
														break;
													}
												}
												jsClick(btn_NB_serviceare_searchaddresses_associateall);
												getDriver().switchTo().alert().accept();
												waitForElement(lbl_NB_serviceare_searchaddresses_afterassociationrank);break;
												
		case "On associating the same address in GDB Service area are we seeing Duplicate address(es) present in selection, duplicate address(es) will not be added to service area. message getting displayed":
											waitForElement(tbx_serviceareaname); 

							
											waitForElement(btn_NB_serviceare_searchaddresses);
											browser_zoom_in(4);
											jsClick(btn_gpon_MST_box);
											Thread.sleep(2000);
											jsClick(btn_gpon_Servicearea_box);
											Thread.sleep(1000);
											jsClick(btn_gdb_refresh);
											Thread.sleep(2000);
											jsClick(btn_gpon_expand);
											Thread.sleep(1000);
											jsClick(btn_NB_serviceare_searchaddresses);
											waitForElement(btn_NB_serviceare_searchaddresses_srchlcnicon);
											tbx_NB_serviceare_searchaddresses_buildingclli.type("LSVGNV01");
											jsClick(btn_NB_serviceare_searchaddresses_srchlcnicon);	
											Thread.sleep(10000);
											waitForElement(btn_NB_serviceare_searchaddresses_associtelcnicon);
											waitForElement(cbx_NB_serviceare_searchaddresses_resultall);

											Thread.sleep(2000);
											cbx_NB_serviceare_searchaddresses_resultall.click();
											Thread.sleep(1000);
											//jsClick(cbx_NB_serviceare_searchaddresses_resultall);	
											Thread.sleep(1000);
											jsClick(btn_NB_serviceare_searchaddresses_associtelcnicon);
											browser_zoom_out(4);
											
											Thread.sleep(1000);
											waitForElement(lbl_NB_serviceare_searchaddresses_alertmsg);
											String Message=lbl_NB_serviceare_searchaddresses_alertmsg.getText();
											Message = Message.toString().substring(1);
											
											Message = Message.trim(); 
											if(!Message.contains("Duplicate address(es) present in selection, duplicate address(es) will not be added to service area.")){
												throw new Error("Wrong message is displayed as "+Message);
											}break;
											
		case "switch back to GPON Device Build page & click on Refresh button":
												jsClick(tab_GDB);
												jsClick(btn_gdb_refresh);
											Thread.sleep(2000);
											jsClick(btn_gpon_expand);
											Thread.sleep(2000);break;
		case "updated Network element role, Provision Status is also updated in the GDB page": slf4jLogger.info("Working as expected");break;
		
		case "select a port in each GDB component to initiate fiber link": 
			selectaportgdb(1);break;
			
		case "fields displayed in edit view of fiber links": 
				if(!tbx_fiberlink_edit_wireclli1.isCurrentlyVisible()){
					throw new Error("Wireclli field is missing in Fiber link edit view");
				}
				if(!tbx_fiberlink_edit_cableid1.isCurrentlyVisible()){
					throw new Error("Cable ID field is missing in Fiber link edit view");
				}
				
				if(!tbx_fiberlink_edit_cableid1.isCurrentlyVisible()){
					throw new Error("Cable ID field is missing in Fiber link edit view");
				}
				
				if(!tbx_fiberlink_edit_startstrandno1.isCurrentlyVisible()){
					throw new Error("Starts Strand ID field is missing in Fiber link edit view");
				}
				
				if(!ddl_fiberlink_edit_aerialrburried1.isCurrentlyVisible()){
					throw new Error("Aerial or Buried field is missing in Fiber link edit view");
				}
				
				if(!ddl_fiberlink_edit_Adeviceclli1.isCurrentlyVisible()){
					throw new Error("Start Device Clli field is missing in Fiber link edit view");
				}
				
				if(!ddl_fiberlink_edit_Adeviceport1.isCurrentlyVisible()){
					throw new Error("Start Device port field is missing in Fiber link edit view");
				}
				
				if(!ddl_fiberlink_edit_Zdeviceclli1.isCurrentlyVisible()){
					throw new Error("End Device Clli field is missing in Fiber link edit view");
				}
				
				if(!ddl_fiberlink_edit_Zdeviceport1.isCurrentlyVisible()){
					throw new Error("End Device port field is missing in Fiber link edit view");
				}
				
				if(!ddl_fiberlink_edit_provisionstatus1.isCurrentlyVisible()){
					throw new Error("Provision status field is missing in Fiber link edit view");
				}break;
				
		}
	}
	
	public void selectaportgdb(int i)  throws Throwable{
		
		do {		
			
			
			String box1=getDriver().findElement(By.id("tab:"+(i-1))).getText();
			
			String gdbbox1=lbl_gpon_devicecheck.getText();
			slf4jLogger.info(gdbbox1+"GDB box1 name");
			String[] gdbdeviceparts=gdbbox1.split("\\(");
			gdbbox1 = gdbdeviceparts[0].replaceAll("\\s+","");
			
			jsClick(getDriver().findElement(By.id("tab:"+(i-1))));
			Thread.sleep(3000);
			while(!lbl_GDB_toprow.getText().equals(box1)){
				Thread.sleep(1000);
				slf4jLogger.info(box1+lbl_GDB_toprow.getText());
			}
						
			String deviceA=lbl_oltdeviceGDB.getText();
			
			
			String box2=getDriver().findElement(By.id("tab:"+(i+1))).getText();
			
			String gdbbox2=lbl_gpon_devicecheck.getText();
			slf4jLogger.info(gdbbox2+"GDB box1 name");
			String[] gdbdeviceparts2=gdbbox2.split("\\(");
			gdbbox2 = gdbdeviceparts2[0].replaceAll("\\s+","");
			
			slf4jLogger.info(box2);
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+(i+1))));
			Thread.sleep(5000);
			while(!lbl_GDB_toprow.getText().equals(box2)){
				Thread.sleep(1500);
				slf4jLogger.info(box2+lbl_GDB_toprow.getText());
			}
			
			String deviceZ=lbl_oltdeviceGDB.getText();
			jsClick(loginPage.getDriver().findElement(By.id("tab:"+i)));
			Thread.sleep(2000);			
			waitForElement(ddl_flgdbstartid);
		
			ddl_flgdbstartid.selectByValue(deviceA);
			Thread.sleep(8000);
			waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
			ddl_flgdbendid.selectByValue(deviceZ);
			Thread.sleep(5000);
			waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
			
			if(cbx_deviceAshelf1slot2port1.isCurrentlyVisible()){
				jsClick(cbx_deviceAshelf1slot2port1);
				
			} else if(cbx_OLT_deviceAport1.isCurrentlyVisible()){
				jsClick(cbx_OLT_deviceAport1);
				
			} 	 
			
			Thread.sleep(2000);
			
		
			
			if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
			Thread.sleep(2000);			
			
				
				
	
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		Date date = new Date();
		 String date1= dateFormat.format(date);
		 slf4jLogger.info(date1);
		 
	
		
		
		ddl_fibergdbprovisionstatus.selectByVisibleText("Planned");
		Thread.sleep(1000);	
				
		
		
		ddl_fibergdbaerialburied.selectByVisibleText("Aerial");
		Thread.sleep(1000);
		
		
		
		lbl_fibergdbcableid.sendKeys(date1+i);
		Thread.sleep(3000);
		lbl_fibergdbstrtstrandid.sendKeys(NB_Build_Id.getText());
		Thread.sleep(3000);
			
		//btn_fiber_cascade_startstrandid);
		//Thread.sleep(2000);
		
		if(btn_alertmsg_GDBFB.isCurrentlyVisible()){
			jsClick(btn_alertmsg_GDBFB);
			Thread.sleep(2000);
			lbl_fibergdbstrtstrandid.sendKeys("100");
			Thread.sleep(3000);
			jsClick(btn_fiber_cascade_startstrandid);
			Thread.sleep(2000);
			
		}	
			
			
		i=i+2;
		if(!isElementVisible(By.id("tab:"+(i)))){
			slf4jLogger.info("Not visible or MST device is Present");
			break;
		}

		
		} while(i!=0);
		
		
	}
	
	 public void gdb_actionmethods(String GDBcomponent) throws Throwable {
			switch(GDBcomponent){
			case "Second Fiber link Save button": jsClick(btn_fiberlink_save_slot2);			
			waitForElement(btn_fiberlink_edit_slot1);	
			break;
			case "Second Fiber link edit button":
				jsClick(btn_fiberlink_edit_slot11);				
				waitForElement(lbl_loader_fiber);
				if(!lbl_loader_fiber.getText().trim().contains("Loading Ports")){
					slf4jLogger.debug("Loader is not displayed");
				}				
				waitForElement(btn_fiberlink_save_slot2);
				break;	
			case "Fiber link Remove all button": 				
							jsClick(btn_GDB_fiberlink_removeall);Thread.sleep(1000);
							getDriver().switchTo().alert().accept();				
							Thread.sleep(2000);			
							break;
			case "Fiber link Delete all button":				
				jsClick(btn_GDB_fiberlink_deleteall);Thread.sleep(2000);
				getDriver().switchTo().alert().accept();				
				Thread.sleep(2000);
				waitForElement(lbl_GDB_SA_Successmsg);
				if(!lbl_GDB_SA_Successmsg.getText().trim().contains("Fiber Link(s) deleted successfully!!")){
					slf4jLogger.debug("Invalid message is displayed for delete action as:"+lbl_GDB_SA_Successmsg.getText().trim());
				}
				break;
				
			case "Fiber link edit button":  
								jsClick(btn_fiberlink_edit_slot1);				
								waitForElement(lbl_loader_fiber);
								if(!lbl_loader_fiber.getText().trim().contains("Loading Ports")){
									slf4jLogger.debug("Loader is not displayed");
								}				
								waitForElement(btn_fiberlink_save_slot1);				
								break;
			case "Fiber link Save button": jsClick(btn_fiberlink_save_slot1);				
									//waitForElement(lbl_loader_fiber);
									/*if(!lbl_loader_fiber.getText().trim().contains("Loading Ports")){
										slf4jLogger.debug("Loader is not displayed");
									}				*/
									waitForElement(btn_fiberlink_edit_slot1);	
									
									
									break;
									
			case "Fiber link Delete icon button":waitForElement(btn_fiberlink_Deleteicon);
												jsClick(btn_fiberlink_Deleteicon); Thread.sleep(1000);
												getDriver().switchTo().alert().accept();
												waitForElement(lbl_loader_fiber);
												
												waitForElement(lbl_GDB_SA_Successmsg);
												
												if(!lbl_GDB_SA_Successmsg.getText().trim().contains("Fiber Link(s) deleted successfully!!")){
													slf4jLogger.debug("Invalid message is displayed for delete action as:"+lbl_GDB_SA_Successmsg.getText().trim());
												} break;
												
			case "Fiber link Remove icon button":					
											waitForElement(btn_fiberremoveicon);
											jsClick(btn_fiberremoveicon);
											getDriver().switchTo().alert().accept();
											waitForElement(lbl_loader_fiber);	waitForElement(lbl_GDB_SA_Successmsg);
											if(!lbl_GDB_SA_Successmsg.getText().trim().contains("Fiber link(s) removed successfully!!")){
												slf4jLogger.debug("Invalid message is displayed for remove action as:"+lbl_GDB_SA_Successmsg.getText().trim());
											}
											break;
											
			case "Fiber link Create all button":waitForElement(btn_GDB_fiberlink_createall); jsClick(btn_GDB_fiberlink_createall);Thread.sleep(6000);
								
			Fiberlink = lbl_Fiberlink.getText();		
			break;
			
			case "Select all check box in fiber link page": jsClick(btn_fiberlink_selectall_checkbox);
					Thread.sleep(2000);;			
					break;
			}
		 }
	 public String Fiberlink(){
		  
			return Fiberlink;
			 
		 }
	
	
	public void browser_zoom_in(int n) throws InterruptedException {
		slf4jLogger.info("Performing Zoom");

		Robot r;
		try {
			r = new Robot();

			for (int i = 0; i < n; i++) {
				// loginPage.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,
				// Keys.SUBTRACT));
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ADD);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_ADD);
				
				
			}
			r.keyRelease(KeyEvent.VK_CONTROL);
			// r.keyRelease(KeyEvent.VK_SUBTRACT);
			// r.keyRelease(KeyEvent.VK_CONTROL);
			// getDriver().navigate().refresh();

			Thread.sleep(1000);

			// slf4jLogger.info("Done with screen sizing");
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void browser_zoom_out(int n) throws InterruptedException {
		slf4jLogger.info("Performing Zoom Out");

		Robot r;
		try {
			r = new Robot();

			for (int i = 0; i < n; i++) {
				// loginPage.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,
				// Keys.SUBTRACT));
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_SUBTRACT);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_SUBTRACT);
			
				
			}
			r.keyRelease(KeyEvent.VK_CONTROL);
			// r.keyRelease(KeyEvent.VK_SUBTRACT);
			// r.keyRelease(KeyEvent.VK_CONTROL);
			// getDriver().navigate().refresh();

			Thread.sleep(1000);

			// slf4jLogger.info("Done with screen sizing");
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	 public void validating_GDB_progressbar() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 1000);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//div[@class='main-tab ng-isolate-scope']//div[@ng-show='submit_build_loader']")));	
  	   
		 System.out.println(lbl_progressbar_create.getText());
		 Thread.sleep(1000);
		 System.out.println(lbl_progressbar_create.getTextValue());
  	   
     }
	 
	 public void validating_GDB_device_in_db() throws InterruptedException {
		 List<String> deivce_details_db_attributes;
		 String deivce_details_db_attributes1;
		 String device_count=lbl_progressbar_create.getText();
		 System.out.println(device_count);
		 /*jsClick(tab_lasttab);
			waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
			//tab_serach_device_Device_details.click();
			 str_device_name = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			str_device_name.trim();
			System.out.println(str_device_name);
			for(int k=2;k<=3;k++){
				value=getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Device Name']/parent::tr/parent::thead/following-sibling::tbody[1]//td["+k+"]")).getText();
				
				deivce_Fieldattributelist.add(value.trim());
				
			}
			System.out.println(deivce_Fieldattributelist);
			Thread.sleep(2000);*/
			
		//	List<String> location_range_db_attributes = DBConnections.location_range_attributes_values(Range_id);
			//deivce_details_db_attributes = ovdb.gdb_device_db_validations(lbl_build_id.getText());
			deivce_details_db_attributes1=ovdb.gdb_device_db_validations(lbl_build_id.getText());
			
			if(device_count.contains(deivce_details_db_attributes1)) {
				slf4jLogger.info(device_count+" are available in data base");
				
			}
			else {
				slf4jLogger.error(device_count+" are not available in data base");
				throw new Error(device_count+" are not available in data base");
			}
			
			
  	   
     }
	 public void verify_sequence() {
		 boolean flag=false;
		 
		 List <Integer> number_list = new ArrayList<Integer>();
		 
		 for(int i=0;i<=lbl_device_name.size()-1;i++) {
			 
			 String str=lbl_device_name.get(i).getText();
	 
			 String[] stringArray = str.split("-");
			 
			 
			 String number = stringArray[2];
			 
			 int sequence_num = Integer.parseInt(number);
		    
		    number_list.add(sequence_num);
			 
		      /*int[] intArray = new int[stringArray.length];
		      for (int j = 0; j < stringArray.length; j++) {
		    	  
		         String numberAsString = stringArray[j];
		         intArray[j] = Integer.parseInt(numberAsString);
		         
		      }*/ 
		 }
		 System.out.println(number_list);
		 
		 for(int i=0;i<number_list.size()-1;i++) {
			if(number_list.get(i)==(number_list.get(i+1))-1) {
				flag=true;
		System.out.println(number_list.get(i));
			}else flag=false;
		 }
		 
		 if(flag==false) {
			 
			 System.out.println("Devices are not created in sequence");
			 
			 
		 }else { 
			 System.out.println("Devices are  created in sequence");
			 
		 }
		 
		 
		 
	 }
	 
	 public void verify_gdb_audit_log_device(String log) throws InterruptedException {
		switch(log) { 
	 case "GDB Create and Delete functionality": 
		 	jsClick(btn_getAuditLogs);
		 
			Thread.sleep(2000);
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
			
			
			if(lbl_gdb_audit_log_create.isCurrentlyVisible()){
				slf4jLogger.info("CREATE logs is  captured under the Audit logs section in GDB page");
				//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			} else {
				slf4jLogger.info("CREATE logs is not captured under the Audit logs section in GDB page");
				throw new Error("CREATE logs is not captured under the Audit logs section in GDB page");
			}
			if(lbl_gdb_audit_log_delete.isCurrentlyVisible()){
				slf4jLogger.info("Delete logs is  captured under the Audit logs section in GDB page");
				//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			} else {
				slf4jLogger.info("Delete logs is not captured under the Audit logs section in GDB page");
				throw new Error("Delete logs is not captured under the Audit logs section in GDB page");
			}
			
	 case "GDB Remove": 
		 	jsClick(btn_getAuditLogs);
		 
			Thread.sleep(2000);
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
			
			
			if(lbl_gdb_audit_log_remove.isCurrentlyVisible()){
				slf4jLogger.info("CREATE logs is  captured under the Audit logs section in GDB page");
				//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			} else {
				slf4jLogger.info("CREATE logs is not captured under the Audit logs section in GDB page");
				throw new Error("CREATE logs is not captured under the Audit logs section in GDB page");
			}
			break;  
			
	 
			}
		 
		 
		 
		 
	 }
	 public void draganddrop() throws InterruptedException {
		 Actions act=new Actions(loginPage.getDriver());
		 String olt=btn_gpon_OLT_box1.getText();
		 System.out.println(olt);
		 String spl=btn_gpon_Splitter_box1.getText();
		 System.out.println(spl);
		 act.clickAndHold(btn_gpon_OLT_box1).build().perform();
		 //act.moveToElement(btn_gpon_Splitter_box1).build().perform();
		 act.release(btn_gpon_Splitter_box1).build().perform();
		
		// act.dragAndDrop(btn_gpon_OLT_box1, btn_gpon_Splitter_box1).build().perform();
		 Thread.sleep(2000);
		 
		 
	 }
	 public void fiber_errorpopup_validation() throws InterruptedException {
		 Actions act=new Actions(loginPage.getDriver());
		 String olt=btn_gpon_OLT_box1.getText();
		 System.out.println(olt);
		 String spl=btn_gpon_Splitter_box1.getText();
		 System.out.println(spl);
		 act.clickAndHold(btn_gpon_OLT_box1).build().perform();
		 //act.moveToElement(btn_gpon_Splitter_box1).build().perform();
		 act.release(btn_gpon_Splitter_box1).build().perform();
		
		// act.dragAndDrop(btn_gpon_OLT_box1, btn_gpon_Splitter_box1).build().perform();
		 Thread.sleep(2000);
		 String Parent_Window = getDriver().getWindowHandle();
		 System.out.println("PARENT WINDOW"+Parent_Window);
		 //String parentwin=devcreatepage.window_switch();
		//btn_locationLookup);
			try {			
				//Thread.sleep(5000);
				//slf4jLogger.info("cliked on location lookup");
				Thread.sleep(3000);
				Set<String> allWindowHandles = getDriver().getWindowHandles();
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
			String err_msg=lbl_fiber_exists.getText();
			if(err_msg.contains("Fiber Link Already Exists between devices, you can not reorder these devices") ) {
				slf4jLogger.info("Error message displayed as expected");
				
			}else {
				throw new Error("Service Area delete icon is Enable before Creation");
			}
			//System.out.println(lbl_fiber_exists.getText());
			jsClick(btn_fiber_exists_ok);
			//devcreatepage.switch_win(Parent_Window); 
		 
	 }
	 
	 public void cascade_fibrelink() throws Throwable {
		 jsClick(btn_fiber_cascade_startstrandnum);
		 Thread.sleep(3000);
		 jsClick(btn_fiber_cascade_cableid_first);
		 
	 }
	 public void fibrelink_already_exists_error() throws Throwable {
		 System.out.println(lbl_fiberlink_exist_error.getValue());
		 
		 if(lbl_fiberlink_exist_error.isVisible()){
			 
			System.out.println("Link already exists "+lbl_fiberlink_exist_error.getText()); 
		 }
		 else {
			 throw new Error("Error message -A link with the specifed name is already present in inventory, is not displayed");
			 
		 }
		 
	 }
	 public void verify_port_warning_popup() throws InterruptedException {
		 String deviceA=null;	
			String deviceZ=null;
		 
		 jsClick(loginPage.getDriver().findElement(By.id("tab:0")));
			Thread.sleep(3000);
		
				if(lbl_oltdeviceGDB.isCurrentlyVisible()){
					deviceA=lbl_oltdeviceGDB.getText();
				} if(isElementVisible(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])[1]"))){
					deviceA=getDriver().findElement(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])[1]")).getText().trim();
				}
			
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:2")));
			Thread.sleep(5000);			
			
			deviceZ=lbl_oltdeviceGDB.getText();
			if(lbl_oltdeviceGDB.isCurrentlyVisible()){
				deviceZ=lbl_oltdeviceGDB.getText();
			} if(isElementVisible(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])[1]"))){
				deviceZ=getDriver().findElement(By.xpath("(.//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3])[1]")).getText().trim();
			}
			
			jsClick(loginPage.getDriver().findElement(By.id("tab:1")));
			Thread.sleep(2000);
			waitForElement(ddl_flgdbstartid);
			
			if(btn_fiber_refresh_all.isEnabled() || btn_fiber_remove_all.isEnabled() || btn_fiber_select_all.isEnabled() || btn_gdb_createall.isEnabled() || btn_fiber_auditlogs.isEnabled() ){
			
			
				ddl_flgdbstartid.selectByValue(deviceA);
				
				Thread.sleep(8000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'aEndPortList')])[1]")));
				ddl_flgdbendid.selectByValue(deviceZ);
				
				Thread.sleep(5000);
				waitForElement(getDriver().findElement(By.xpath("(.//div[contains(@ng-repeat,'zEndPortList')])[1]")));
			
				if(cbx_deviceZshelf1slot1port1_Newport.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_Newport);
			} else if(cbx_deviceZshelf1slot1port1_ONT.isCurrentlyVisible()){
				jsClick(cbx_deviceZshelf1slot1port1_ONT);
			
			}  
		
			
						
			Thread.sleep(2000);		
			Alert ale=getDriver().switchTo().alert();
			String alert_text=ale.getText();
			if(alert_text.contains("Please select A end port first.")) {
				System.out.println("Expected message " +alert_text+ "is displayed");
			}else {
				System.out.println("Expected message " +alert_text+ "is not displayed");
			}
			ale.accept();
			Thread.sleep(1000);	
		}
		 
		 
	 }

	 public void add_sa_gdb(String cnt) throws InterruptedException {
		 int count = GDB_SA_Rowcount.size();
			tbx_NB_SA_Add.sendKeys(cnt);
			jsClick(btn_NB_SA_Add);
			Thread.sleep(2000);
			int AfterAddcount = GDB_SA_Rowcount.size()+50;
			//int count = gdbcreatepage.GDB_SA_Rowcount.size();	
			//slf4jLogger.info(count);
			if(AfterAddcount == (count+50)){
				slf4jLogger.info("Successfully Added service area rows");
			}else throw new Error("Service area rows are not added");
		 
	 }
	 
	 public void gpon_ntwrk_servicearea_add_one() throws Throwable{
			//gdbcreatepage.gpon_ntwdevice_select(component);
		 	jsClick(btn_gpon_MST_box);
		 	waitForElement(lbl_deviceGDB);
		 	Thread.sleep(1000);
		 	String Devicename = lbl_deviceGDB.getText();
			System.out.println("Device name "+Devicename);
			long l = System.currentTimeMillis();
			int Time = (int) (l/2);
				jsClick(btn_gpon_Servicearea_box);
			    /*if(gdbcreatepage.btn_GDB_SA_Deleteicon.isEnabled()){  
			    	throw new Error("Service Area delete icon is Enable before Creation");
			    }*/
				Thread.sleep(5000);
				tbx_NB_SA_device_name.type(Devicename);
				waitForElement(getDriver().findElement(By.xpath(".//strong[text()='"+Devicename+"']")));
				Thread.sleep(1000);
				//tbx_NB_SA_device_name.sendKeys(Keys.ENTER);
				jsClick(getDriver().findElement(By.xpath(".//strong[text()='"+Devicename+"']")));
				tbx_NB_SA_device_Location.typeAndEnter("7");
				//waitForElement(getDriver().findElement(By.xpath(".//strong")));
				//tbx_NB_SA_device_Location.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				//tbx_NB_SA_device_name.sendKeys(Keys.ENTER);
				//jsClick(getDriver().findElement(By.xpath(".//strong")));
				tbx_NB_SA_name.clear();
				Thread.sleep(2000);
				tbx_NB_SA_name.sendKeys("SA_"+loginPage.getDate("HH:mm:ss").replaceAll(":", ""));
			    //fill_fields_from("OVCreateGDBPage","GDB-Device create","GPONSA");
			    //fill_fields_from("OVActivationPage","GDB-Device create","GPONSA");
			    Thread.sleep(2000);
			    jsClick(btn_NB_SA_CreateAll);
			    waitForElement(lbl_loader_servicearea);
			    if(!lbl_loader_servicearea.getText().trim().contains("Creating Service Area")){
			    	slf4jLogger.debug("Service Area loader is not displayed for create");
			    }
				waitForElement(tbx_serviceareaname);
				/*if(!gdbcreatepage.btn_GDB_SA_Deleteicon.isEnabled()){  
			    	throw new Error("Service Area delete icon is not Enable after Creation");
			    }*/
				//gdbcreatepage.btn_GDB_SA_Deleteicon.shouldBeEnabled();	
				slf4jLogger.info("Service Area created sucessfully");
				slf4jLogger.info("Service Area name is "+tbx_serviceareaname.getText());
		} 
	 
	 public void delete_sa_gdb() throws InterruptedException {
		 browser_zoom_in(4);
		 jsClick(cbx_SA_all);
		 Thread.sleep(2000);
		 jsClick(btn_NB_SA_DeleteAll);
		 Thread.sleep(2000);
		 if(lbl_SA_Delete_error.isVisible()) {
			 System.out.println("1-->"+lbl_SA_Delete_error.getText());
		 }else 	 throw new Error( "Error message did not appear ");
		 
	 }



}
