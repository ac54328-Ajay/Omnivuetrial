package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OVfillmandatoryfields;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OSRDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.FileIOTest;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


public class OVSearchDevicePage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	public String log=null;
	
	UserSteps enduser;
	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	OVLoginPage loginPage;
	OVSearchServicePage servicepage;
	OVCreateContactPage ovcreatecontactpage;
	OVOrderPage orderpage;
	FileIOTest fileiotest;
	OVSearchCircuitpage searchcircuit;
	ARMDB armdb;
	OmnivueDB ovdb;
	OSRDB osrdb;
	OVfillmandatoryfields fillfieldscls;

	
	@FindBy(xpath=".//*[contains(@class,'main-tab')]//li[@class='ng-isolate-scope active']/preceding-sibling::li[1]//tab-heading")
	public WebElementFacade tab_activescreen_prvioussibling;
	
	@FindBy(xpath="(.//div[@src='tab.url']//div[@ng-show='noData'])[2]")
	public WebElementFacade tab_sbcr_noData;
	
	@FindBy(xpath=".//*[contains(@class,'main-tab')]//li[@class='ng-isolate-scope active']/following-sibling::li[1]//tab-heading/a/..")
	public WebElementFacade tab_activescreen_forwardsibling;
	
	@FindBy(xpath=".//*[text()='Close All Tabs']/../preceding-sibling::li[1]//tab-heading")
	public WebElementFacade tab_lasttab;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Service Circuit Design']")
	public WebElementFacade tab_services_circuitdesign; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Services']")
	public WebElementFacade tab_services; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='CTag Pool']")
	public WebElementFacade tab_ctag;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Orders']")
	public WebElementFacade tab_orders;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Contacts']")
	public WebElementFacade tab_contact;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='BAM Report']")
	public WebElementFacade tab_bamreport;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Circuit Details']")
	public WebElementFacade tab_circuitdetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Activations']")
	public WebElementFacade tab_Activations;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='ARMOR']")
	public WebElementFacade tab_Armor;
	
	//Newly Added By MOHIT
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Subscribers']")
	public WebElementFacade tab_Subscriber;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Circuits']")
	public WebElementFacade tab_Circuits;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Circuit']")
	public WebElementFacade tab_Circuit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Tasks']")
	public WebElementFacade tab_Tasks;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Locations']")
	public WebElementFacade tab_Locations;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Devices']")
	public WebElementFacade tab_Devices;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='Facilities']")
	public WebElementFacade tab_facilities;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='Device Ports']")
	public WebElementFacade tab_Device_ports;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='Service Areas']")
	public WebElementFacade tab_Service_Areas;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='TIRKS']")
	public WebElementFacade tab_TIRKS;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='Performance Monitoring']")
	public WebElementFacade tab_Performance;	
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Virtual Ports']")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='VLAN / Virtual Ports']")
	public WebElementFacade tab_Virtual_Ports;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='Topology View']")
	public WebElementFacade tab_Topologyview;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='Vectoring Info']")
	public WebElementFacade tab_Vectoringinfo;
	
	@FindBy(xpath="//div[@ng-if='!passiveDevice']/input[@ng-model='deviceDetail.MGMTVLAN']")
    public WebElementFacade tbx_management_VLAN_edit_page;


	
	
	//olt
	//ont
	//mst
	//mdu
	//splitter
	
	//New changes--9/23
	
	
		
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']")
	public By lbl_attributes;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//th[text()='Device Name']/parent::tr/parent::thead/parent::table/tbody[1]//td[2]")
	public WebElementFacade lbl_deviceName;
	
	//New updates--9/23
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//thead[tr[th[text()='Subscriber Type']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SubscriberType;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//thead[tr[th[text()='Subscriber Name']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_SubscriberName;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//thead[tr[th[text()='Subscriber Name']]]/following-sibling::tbody[1]/tr/td[4]")
	public WebElementFacade lbl_SubscriberNameOLT;
	
	@FindBy(xpath="//input[@value='Edit Device Details']")
	public WebElementFacade btn_EditDeviceDetailbtn;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//input[@value='Save'])[1]")
	public WebElementFacade btn_saveDeviceDetail;
	
	@FindBy(xpath="//*[@id=\"left-content-tab\"]//span[@ng-click='openSubscriberLookUp()']")
	public WebElementFacade btn_subscriberlookup_edit;
	
	
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SerialName;
	
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_VendorPartName;
	
	@FindBy(xpath="(//div[@class='container']/div[4]//tbody/tr[1]/td[2])[3]")
	public WebElementFacade lbl_DeviceName;
	
	@FindBy(xpath="//div[@class='device-detail-group'][7]/div[2]/span/label[1]")
	public WebElementFacade lbl_ServiceDeviceName;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElementFacade btn_NDSaveButton;
	
	@FindBy(xpath="//a[text()='Task Details']")
	public WebElementFacade tag_taskDetails;
	
	@FindBy(xpath="//a[text()='Associated Circuits']")
	public WebElementFacade tag_circuitDetails;
	
	@FindBy(xpath="//a[text()='Associated Locations']")
	public WebElementFacade tag_LocationDetails;
	
	@FindBy(xpath="//a[text()='Device Details']")
	public WebElementFacade tag_deviceDetails;
	//end of new updates
	
	@FindBy(xpath="/.//*[@class='col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label']")
	public List<WebElementFacade> lbl_Editdevicepage;
	
	@FindBy(xpath=".//*[@ng-model='deviceDetail.MAXSUBSCRIBERBWOFFERED']")
	public WebElementFacade tbx_maxsubscbandwidth;
	
	@FindBy(xpath=".//*[@ng-model='deviceDetail.MAXSUBSCRIBERUPBWOFFERED']")
	public WebElementFacade tbx_maxsubscbandwidth_up;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='deviceDetail.DOWNSTREAM_BW_UNIT']")
	public WebElementFacade tbx_maxsubscbandwidth_unit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='deviceDetail.UPSTREAM_BW_UNIT']")
	public WebElementFacade tbx_maxsubscbandwidth_upunit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedAffliate']")
	public WebElementFacade tbx_Affliate_owner;
	
	
	@FindBy(xpath=".//label[text()='Max Subscriber Downstream Bandwidth']")
	public WebElementFacade lbl_maxsubscbandwidth;
	
	@FindBy(xpath=".//li[@class='ng-isolate-scope active']//a[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade btn_closeactivetab_clsicon ;
	

	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Delete' and @ng-show='displayDeleteBtn']")
	@FindBy(xpath=".//button[@ng-click='openDeviceDeleteDlgBx()']")
	public WebElementFacade btn_deletebutton;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[@ng-click='refreshDeviceFields(deviceDetail.NODEID)']")
	public WebElementFacade btn_Refresh_button;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='openRevertDeviceLookUp()']")
	public WebElementFacade btn_Revert_button;
	
	
	//********************************************  Action buttons in Device view page  *************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_device_Editbtn;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save'][@value='Save']")
	public WebElementFacade btn_device_edit_save;
	
	//********************************************   Network Tab Validation *************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit Device Details']")
	public WebElementFacade btn_device_Networkstab_edit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[contains(@ng-click,'showErrorForSNMPFields')]")	
	public WebElementFacade btn_device_Networkstab_save;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Cancel']")
	public WebElementFacade btn_device_Networkstab_cancel;
	
	@FindBy(xpath=".//th[contains(text(),'MAC Address')]")
	public WebElementFacade lbl_serach_device_netwrok_tab_mac_addres;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Management IP Subnet Mask']/../../following-sibling::tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_netwrok_tab_mngtipsubnetmask;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Management IP Subnet Mask']/../../following-sibling::tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_netwrok_tab_deftgateway;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Vectoring Type']/../../following-sibling::tbody//td)[2]")
			public WebElementFacade lbl_serach_device_netwrok_tab_vectoringtype;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Vectoring Topology']/../../following-sibling::tbody//td)[3]")
					public WebElementFacade lbl_serach_device_netwrok_tab_vectoringtopology;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Vectoring Type']/../../following-sibling::tbody//td)[5]")
	public WebElementFacade lbl_search_device_olt_vectoringtype;
	
@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Vectoring Topology']/../../following-sibling::tbody//td)[6]")
			public WebElementFacade lbl_search_device_olt_vectoringtopology;
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Network Identifier']/../../following-sibling::tbody//td)[2]")
			public WebElementFacade lbl_serach_device_netwrok_tab_networkidentifier;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Platform ID']/../../following-sibling::tbody//td[4])[1]")
			public WebElementFacade lbl_serach_device_netwrok_tab_platformid;
	
	@FindBy(xpath="//a[@class='accordion-toggle']/div/span/span[starts-with(.,'Child')]")
    public WebElementFacade tab_accordian_child_card_edit;     
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[@class='accordion-toggle']/div/span/input[@value='Edit Child Card Details']")
    public WebElementFacade btn_edit_card_device_details_page;

    
    @FindBy(xpath=".//div[@ng-if='editChCarddetails']/div/select[@ng-model='cardCardDetail.SLOTNUMBER']")
    public WebElementFacade ddl_slot_number_child_card_edit;   
    
    @FindBy(xpath=".//div[@ng-if='editChCarddetails']/div/input[@ng-model='cardCardDetail.HARDWAREVERSION']")
    public WebElementFacade tbx_Hardware_version_child_card_edit;  
    
    @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[contains(text(),'Save Details')]")
    public WebElementFacade btn_save_details_child_card_edit;

    @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[@class='accordion-toggle']/div/span/input[@value='Delete Card']")
    public WebElementFacade btn_delete_card_device_details_page;
    
   @FindBy(xpath=".//li[@ng-click='refreshDetails()']/a[@ng-click='select()']/tab-heading/div/i[@class='fa fa-refresh fa-lg ov-refresh-icon']")
    public WebElementFacade btn_refresh_device_details_page;


	
	//********************************************   Device Edit page *************************************//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@ng-change='onSelectRole(edit.object)']")
			public WebElementFacade ddl_serach_editdevice_devicerole;
	
	
	//********************************************   Network Tab Edit page *************************************//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/..//*[@ng-model='deviceDetail.MGMT_IP_SUBNET_MASK']")
	public WebElementFacade tbx_edit_device_netwrok_tab_mngtipsubnetmask;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/..//*[@ng-model='deviceDetail.MGMT_IP_DEFAULT_GATEWAY']")
	public WebElementFacade tbx_edit_device_netwrok_tab_deftgateway;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-model='deviceDetail.SNMP_PORT_ID']")
	public WebElementFacade tbx_edit_device_netwrok_tab_snmpportnumber;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='SNMP_VERSION']")
	public WebElementFacade ddl_edit_device_netwrok_tab_snmpversion;
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='vectoringType'])[1]")
			public WebElementFacade ddl_edit_device_netwrok_tab_vectoringtype;
			
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='vectoringTopology'])[1]")
					public WebElementFacade ddl_edit_device_netwrok_tab_vectoringtopology;
	
	@FindBy(xpath = ".//div[contains(@id,'vectoringEditTopology')]//input[@ng-model='vectoringTopologyData.Vectoring_Topology_Name']")
    public WebElementFacade tbx_edit_device_Newvectortopolgy;
	
	@FindBy(xpath = ".//div[contains(@id,'vectoringEditTopology')]//textarea[@id = 'topologyNotes']")
    public WebElementFacade tbx_edit_device_vectortopolgyNote;
	
	
	@FindBy(xpath = ".//div[contains(@id,'vectoringEditTopology')]//button[contains(@ng-click,'createVectoringTopology')]/i")
    public WebElementFacade button_edit_device__Newvectortopolgy;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceDetail.NETWORKIDENTIFIER']")
	public WebElementFacade ddl_edit_device_netwrok_tab_networkidentifier;
	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//h4[text()='Topology Create']")
	public WebElementFacade lbl_edit_device_netwrok_tab_craetetopologyheader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//textarea[@id='topologyNotes']")
	public WebElementFacade tbx_edit_device_netwrok_tab_craetetopology_Notes;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[contains(@ng-click,'createVectoringTopology')]")
	public WebElementFacade btn_edit_device_netwrok_tab_craetetopology_save;
	
	
	
	
	//*************************************************************************************************************//
	
	//*****************************************************Device ADvance Search page*****************************************************************///
	@FindBy(xpath="//input[@ng-model='invSearchValues.deviceLctnAddress']")
    public WebElementFacade tbx_advance_search_deviceLctnAddress;
    
    @FindBy(xpath="(//input[@ng-model='invSearchValues.deviceLctnAddress']/..//a)[1]")
    public WebElementFacade ddl_advance_search_deviceLctnAddress_solr1;
    
    @FindBy(xpath="//li[@class='ng-isolate-scope active']//tab-heading")
    public WebElementFacade tab_device_search_active_page;
    
    @FindBy(xpath="//input[@ng-model='invSearchValues.deviceName']")
    public WebElementFacade tbx_devicename_advancesearch;
@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
    public WebElementFacade lbl_device_resultpage_errormsg;

@FindBy(xpath="//input[@ng-model='searchParam.deviceName']")
public WebElementFacade tbx_devicename;

@FindBy(xpath="(//input[@ng-model='searchParam.deviceName']/..//a)[1]")
public WebElementFacade ddl_devicename_solr1; 

	

	
	
	//*************************************************************************************************************//
	
	//********************************************   Device view page section Validation *************************************//
	
	//********************************************   Status Information section Validation *************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Provision Status']/parent::tr/parent::thead/following-sibling::tbody//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_information_sec_Provision_status;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Functional Status']/parent::tr/parent::thead/following-sibling::tbody//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_information_sec_Functional_status;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Network Element Note']/parent::tr/parent::thead/following-sibling::tbody//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_information_sec_Network_element_status;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Restricted Status Notes']/parent::tr/parent::thead/following-sibling::tbody//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_information_sec_Restricted_note_status;
	
	//*************************************************************************************************************//
	
	//********************************************  Identifiers section Validation *************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Device CLLI']/parent::tr/parent::thead/following-sibling::tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_identifier_sec_device_clli;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Device Name']/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_identifier_sec_device_name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Device Full Name']/parent::tr/parent::thead/following-sibling::tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_identifier_sec_device_full_name;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Network Roles']/parent::tr/parent::thead/following-sibling::tbody[1]//td[4]")
	@FindBy(xpath="(.//*[contains(text(),'Identifiers')]/following-sibling::div[1]//td[4])[1]")
	public WebElementFacade lbl_devicerole;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Alias1']/parent::tr/parent::thead/following-sibling::tbody//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_identifier_sec_alias1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Relay Rack Shelf']/parent::tr/parent::thead/following-sibling::tbody//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_identifier_sec_relay_rack_shelf;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Alias2']/parent::tr/parent::thead/following-sibling::tbody//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_identifier_sec_alias2;
	
	@FindBy(xpath=".//*[@data-ng-change='generateNwId(edit.object);enableDisableOffnetIndicator()']")
	public WebElementFacade ddl_Edit_device_device_details_identifier_networkrole;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedMCO']")
	public WebElementFacade ddl_Edit_device_device_details_MCO;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Functional Status']/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]")
	public WebElementFacade ddl_search_device_device_details_functinalStatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedAffliate']")
	public WebElementFacade ddl_Edit_device_device_details_affliateowner;
	//*************************************************************************************************************//
	
	//********************************************   Device Type section Validation *************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Device Type']/parent::tr/parent::thead/following-sibling::tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Device_type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Device Sub Type']/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Device_sub_type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Device ID']/parent::tr/parent::thead/following-sibling::tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Device_ID;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Device HECIG']/parent::tr/parent::thead/following-sibling::tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Device_HECIG;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Vendor Name']/parent::tr/parent::thead/following-sibling::tbody//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Vendor_Name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Vendor Part Number']/parent::tr/parent::thead/following-sibling::tbody//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Vendor_Part_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Part Type']/parent::tr/parent::thead/following-sibling::tbody//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Part_Type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Manfacturer Part Number']/parent::tr/parent::thead/following-sibling::tbody//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_device_type_sec_Manfacturer_Part_Number;	
	
	
	//*************************************************************************************************************//
	
	
	//******************************************** IP Information section Validation *************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'IPV4 Mgm Router ID')]/parent::tr/parent::thead/following-sibling::tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_IPV4_mgm_router_id;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'IPV4 Mgm Router ID')]/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Console_1 ;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'IPV4 Mgm Router ID')]/parent::tr/parent::thead/following-sibling::tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Console_2;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'IPV4 Mgm Router ID')]/parent::tr/parent::thead/following-sibling::tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Selection;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Can Auto Translate')]/parent::tr/parent::thead/following-sibling::tbody//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_Can_Auto_Translate;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Can Auto Translate')]/parent::tr/parent::thead/following-sibling::tbody//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_Shared_Flag;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[contains(text(),'Can Auto Translate')]/parent::tr/parent::thead/following-sibling::tbody//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_Management_VLAN;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//th[text()='Is Diverse']/parent::tr/parent::thead/following-sibling::tbody//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_ip_information_sec_Is_Diverse;	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//th[text()='Is Diverse']/parent::tr/parent::thead/following-sibling::tbody//td[4]")
	public WebElementFacade ddl_IsDiversed;	
	
	
	//*************************************************************************************************************//
	
	//********************************************  Subscriber Information *******************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Shared Flag']/parent::tr/parent::thead/following-sibling::tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_subscriber_id;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Shared Flag']/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_Type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Shared Flag']/parent::tr/parent::thead/following-sibling::tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_Name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Affiliate Owner']/parent::tr/parent::thead/following-sibling::tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_Affiliate_Owner;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Affiliate Owner']/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_Location_Name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Affiliate Owner']/parent::tr/parent::thead/following-sibling::tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_MCO;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Affiliate Owner']/parent::tr/parent::thead/following-sibling::tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_MEN_ID;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Is Offnet']/parent::tr/parent::thead/following-sibling::tbody//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_isoffset;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Opti Tap']/parent::tr/parent::thead/following-sibling::tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_optitap;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Installation Date']/parent::tr/parent::thead/following-sibling::tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_installationdate;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Shared Flag']/parent::tr/parent::thead/following-sibling::tbody[1]//td[2]/a")
	public WebElementFacade lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_id_update;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-model='deviceDetail.SUBSCRIBERNAME']")
	public WebElementFacade tbx_serach_device_device_details_tab_subscriber;
	
	
	
	//*************************************************************************************************************//
	
	//********************************************  Qualification  Information *******************************************//
	
	@FindBy(xpath=".//*[@ng-show='gponOLTDevice || dslamOnly']/div[2]//tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_Qualification_information_sec_max_sub_dwn_bwd;	
	
	@FindBy(xpath=".//*[@ng-show='gponOLTDevice || dslamOnly']/div[2]//tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_Qualification_information_sec_max_sub_up_bwd;	
	
	@FindBy(xpath=".//*[@ng-show='gponOLTDevice || dslamOnly']/div[2]//tbody[2]//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_Qualification_information_sec_1gps_inc;	
	
	//@FindBy(xpath=".//*[@ng-show='gponOLTDevice || dslamOnly']/div[2]//tbody[2]//td[3]")
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='PRISM NOSA Certification']/../../following-sibling::tbody//td)[3]")
	public WebElementFacade lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert;	
	
	//*************************************************************************************************************//
	
	//********************************************  Topology  Section *******************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Topology Name']/parent::tr/parent::thead/following-sibling::tbody//td[1]")
	public WebElementFacade lbl_serach_device_device_details_tab_Topology_sec_Topology_Name;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[text()='Topology Name']/parent::tr/parent::thead/following-sibling::tbody//td[2]")
	public WebElementFacade lbl_serach_device_device_details_tab_Topology_sec_Topology_Type;
	
	//*************************************************************************************************************//
	//*************************************** Headers Tab section in Device view page **********************************************//
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Device Details')]")
	public WebElementFacade tab_serach_device_Device_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Networking Details')]")
	public WebElementFacade tab_serach_device_Networking_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Audit Log')]")
	public WebElementFacade tab_serach_device_Audit_logs; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Transport Details')]")
	public WebElementFacade tab_serach_device_Transport_details;
	
	

	//********************************************  Network Tab  Section *******************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit Device Details']")
	public WebElementFacade btn_serach_device_network_details_tab_edit_device_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[contains(@ng-click,'refreshDeviceFields')]")
	public WebElementFacade btn_serach_device_network_details_tab_refresh_icon;
	
	//***************************************************** Network Information 1 ************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Source System']/../../../tbody//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_Source_System;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Source System']/../../../tbody//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_RO_Community_String;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Source System']/../../../tbody//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_Part_Type;
	
	//**************************************************************************************************************************//
	
	//***************************************************** Manufacturer Information ************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Chassis_Serial_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Serial_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Vendor_Part_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Manufacturer_Part_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[2]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Hardware_Version;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[2]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Software_Version;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[2]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Management_IP_Subnet_Mask;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[2]//td[4]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Defaultgateway;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[3]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Socket_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[3]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Revision;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[3]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Discontinue_Date;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/../div//th[text()='Chassis Serial Number']/../../../tbody[3]//td[4]")
	public WebElementFacade lbl_serach_device_network_details_tab_Manufacturer_Information_Discontinue_Reason;
	
	//**************************************************************************************************************************//
	//***************************************************** Network Information 2 ************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='MAC Address']/../../../tbody[1]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_MAC_Address;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='MAC Address']/../../../tbody[1]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Object_ID;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='MAC Address']/../../../tbody[1]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='MAC Address']/../../../tbody[1]//td[4]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Monitoring_Type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[2]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Firmware_Version;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[2]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_NMS_Type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[2]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_NMS_Host_Name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[2]//td[4]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_NMS_Description;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[3]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Network_Identifier;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[3]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Network_Name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[3]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Can_Auto_Translate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[3]//td[4]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Platform_ID;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[4]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Version;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[6]//td[1]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Network_Node;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[6]//td[2]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Stack_Ring_Sequence;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='Network Information']/../div//th[text()='Firmware Version']/../../../tbody[6]//td[3]")
	public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_2_Stack_Ring_Shelf_Identifier;
	
	
	//**************************************************************************************************************************//
	
	//**************************************************************************************************************************//
	
	//***************************************************** Audit logs tab section ************************************************//
		
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[contains(text(),'ARM Audit Logs')]")
	public WebElementFacade tab_serach_device_audit_log_arm_audit_log;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='ng-isolate-scope active']//*[contains(text(),'ARM Audit Logs')]")
	public WebElementFacade tab_serach_device_audit_log_arm_audit_log_Active;
		
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-click='getDeviceAuditLog()']")
	public WebElementFacade btn_serach_device_Audit_log_tab_getlog;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[@ng-show='arm_audit_loader']")
	public WebElementFacade lbl_serach_device_Audit_log_tab_getlog_loader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-controller='viewAuditLogCtrl']//*[@ng-model='auditLogRequest.getLogsFromArchive']")
	public WebElementFacade cbx_serach_device_ARM_Audit_log_FromArchive;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='viewAuditLogCtrl']//*[@ng-click='exportToExcel()']")
	public WebElementFacade btn_serach_device_audit_log_arm_arm_log_excel;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-controller='viewAuditLogCtrl']//*[@ng-click='printGridData()']")
	public WebElementFacade btn_serach_device_audit_log_arm_arm_log_print;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[contains(text(),'OmniVue Audit Logs')]")
	public WebElementFacade tab_serach_device_audit_log_omnivue_audit_log;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='ng-isolate-scope active']//*[contains(text(),'OmniVue Audit Logs')]")
	public WebElementFacade tab_serach_device_audit_log_omnivue_audit_log_Active; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-controller='auditLogCtrl']//i[@ng-click='printGridData()']")
	public WebElementFacade btn_serach_device_audit_log_arm_omnivue_log_print;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='auditLogCtrl']//*[@title='Save as Excel']/img")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@ng-controller='auditLogCtrl']//i[@ng-click='exportToExcel()']")
	public WebElementFacade btn_serach_device_audit_log_arm_omnivue_log_excel;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='auditLogCtrl']//*[@title='Save as Excel']/following-sibling::i")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@ng-controller='auditLogCtrl']//i[@ng-click='init()']")
	public WebElementFacade btn_serach_device_audit_log_arm_omnivue_log_refresh;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_serach_device_Omnivue_Audit_log_tab_getlog; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[@ng-controller='auditLogCtrl']//label[text()='From Archive']/preceding-sibling::input")
	public WebElementFacade cbx_serach_device_Omnivue_Audit_log_tab_FromArchive;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[@ng-show='init_loader']")
	public WebElementFacade lbl_serach_device_Omnivue_Audit_log_tab_getlog_loader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[text()='No Audit Logs.']")
	public WebElementFacade lbl_serach_device_Audit_log_tab_errormsg;
	
	
	//**************************************************************************************************************************//
	
	
	
	//**************************************************************************************************************************//
	
	//##############		Device Ports Validations		#################################//
	

	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Add Card']")
	public WebElementFacade btn_deviceportRT_shelfexpand_Addcard;		
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[@ng-model='addCard.bulkCardType']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_Addcard_deviceaddcardtype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@ng-model='addCard.noOfCardds']")
	public WebElementFacade tbx_deviceportRT_shelfexpand_Addcard_deviceaddcardcount;
	

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@ng-click='addCardDetails()']")
	public WebElementFacade btn_deviceportRT_shelfexpand_Addcard_addcarddetails;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[contains(@ng-model,'addCard.slotNumber')]")
	public WebElementFacade ddl_deviceportRT_shelfexpand_Addcard_slotno;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@ng-show='showDiv']//button[@value='Save Card Details']")
	public WebElementFacade btn_deviceportRT_shelfexpand_Addcard_addcardsavecarddetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Add Contained Devices']")
	public WebElementFacade btn_deviceportRT_shelfexpand_add_containeddevice;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//button[@value='Search Device']")
	public WebElementFacade btn_deviceportRT_shelfexpand_add_containeddevice_searchdevice;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@ng-model='searchDeviceDetail.DEVNAME']")
	public WebElementFacade tbx_deviceportRT_shelfexpand_add_containeddevice_devicename;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[@ng-model='searchDeviceDetail.DEVICETYPE']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_add_containeddevice_devicetype;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[@ng-model='searchDeviceDetail.DEVICESUBTYPE']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_add_containeddevice_subdevicetype;		
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceSelectData.selected'])[1]")
	public WebElementFacade cbx_deviceportRT_shelfexpand_add_containeddevice_searchdevice_result;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//button[@value='Associate Devices']")
	public WebElementFacade btn_deviceportRT_shelfexpand_add_containeddevice_searchdevice_associate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//td[text()='GENERIC FDP']")
	public WebElementFacade lbl_deviceportRT_shelfexpand_add_containeddevice_afterassociation;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//i[contains(@ng-click,'deleteDeviceData')]")
	public WebElementFacade btn_deviceportRT_shelfexpand_add_containeddevice_removeassociateddevice;
			
	//---	Child card
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//td[text()='7750 SR 20G Input Output Module (IOM2) Baseboard']/preceding-sibling::td/input)[1]")
	public WebElementFacade btn_deviceportRT_childcard_shelfexpand;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Add Child Cards']")
	public WebElementFacade btn_deviceportRT_shelfexpand_addchildcard;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[@ng-model='addCCard.bulkCardType']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_addchildcard_childcardtype;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@ng-model='addCCard.numOfCardds']")
	public WebElementFacade tbx_deviceportRT_shelfexpand_addchildcard_noofcards;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Add Child Card Details']")
	public WebElementFacade btn_deviceportRT_shelfexpand_addchildcard_addcarddetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[@ng-model='addCCard.slotNumber[$index]']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_addchildcard_addcarddetails_slot;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//button[@value='Save Child Card Details']")
	public WebElementFacade btn_deviceportRT_shelfexpand_addchildcard_addcarddetails_savecarddetails;
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//td[text()='7750 SR 20G Input Output Module (IOM2) Baseboard']/following-sibling::td[@title])[1]")
	public WebElementFacade lbl_deviceportRT_shelfexpand_addchildcard_status;
	
	
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//td[text()='7750 SR 20G Input Output Module (IOM2) Baseboard']/following-sibling::td/a)[1]")
	public WebElementFacade lbl_deviceportRT_shelfexpand_addchildcard_circuitdetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//span[contains(text(),'Pluggable.1.1/1.1')]/following-sibling::span")
	public WebElementFacade lbl_deviceportRT_shelfexpand_addchildcard_pluggable;	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//span[contains(text(),'Layer 2/3 Associations')]")
	public WebElementFacade lbl_deviceportRT_shelfexpand_addchildcard_layerassociation;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//a[contains(@ng-click,'executeCircuitSearch(circuit[')]")
	public WebElementFacade lbl_deviceportRT_shelfexpand_addchildcard_circuitassociated;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@is-open='status.open1']//span[@ng-click='changeStatus(accordionOpen)']")
	public WebElementFacade lbl_deviceportRT_shelfexpand;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Reserve Port']/../../parent::a[@ng-click='toggleOpen()']")
	public WebElementFacade lbl_deviceportRT_shelfexpand_expand;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Edit Port Details']")
	public WebElementFacade btn_deviceportRT_shelfexpand_editportdetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//button[@value='save']")
	public WebElementFacade btn_deviceportRT_shelfexpand_editportdetails_save;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//select[@ng-model='portProvisionStatus']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_editportdetails_provisionstatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Reserve Port']")
	public WebElementFacade btn_deviceportRT_shelfexpand_reserveport;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//button[contains(@ng-click,'savePortReservationForCreate')]")
	public WebElementFacade btn_deviceportRT_shelfexpand_reserveport_Save;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//input[@ng-model='invPort.NAME']")
	public WebElementFacade tbx_deviceportRT_shelfexpand_reserveport_name;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//label[text()='Provision Status']/following-sibling::select[@id='shelfType']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_reserveport_provisionstatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//label[text()='Reservation Type']/following-sibling::select[@id='shelfType']")
	public WebElementFacade ddl_deviceportRT_shelfexpand_reserveport_Reservationtype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//input[@ng-model='invPort.TIMETOLIVE']")
	public WebElementFacade tbx_deviceportRT_shelfexpand_reserveport_time;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//textarea[@ng-model='invPort.DESCRIPTION']")
	public WebElementFacade tbx_deviceportRT_shelfexpand_reserveport_descriptions;			
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//button[@value='Delete']")
	public WebElementFacade btn_deviceportRT_shelfexpand_reserveport_Delete;
	

	@FindBy(xpath="(//div[@class='ng-binding alert alert-success'])[1]")
	public WebElementFacade btn_deviceportRT_shelfexpand_editreserveport_success_msg;
	
	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[@aria-hidden='false']//button[@value='Cancel']")
	public WebElementFacade btn_deviceportRT_shelfexpand_reserveport_cancel;	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Manage Port Reservation']")
	public WebElementFacade btn_deviceportRT_shelfexpand_Manageportreservation;
	
	/*@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Add Child Cards']")
	public WebElementFacade btn_deviceportRT_shelfexpand_addchildcard;*/
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Edit Card Details']")
	public WebElementFacade btn_deviceportRT_shelfexpand_editchildcard;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Swap Card']")
	public WebElementFacade btn_deviceportRT_shelfexpand_swapcard;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Move Card']")
	public WebElementFacade btn_deviceportRT_shelfexpand_movecard;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Migrate Card']")
	public WebElementFacade btn_deviceportRT_shelfexpand_migratecard;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Delete Card']")
	public WebElementFacade btn_deviceportRT_shelfexpand_deletecard;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//*[@value='Bulk Port Update']")
	public WebElementFacade btn_deviceportRT_bulkportupdate;	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Bulk Port Update')]")
	public WebElementFacade tab_bulkportupdate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Show Ports']")
	public WebElementFacade btn_bulkportupdate_showports;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@role='checkbox']")
	public WebElementFacade cbx_bulkportupdate_select;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='selProvisionSts']")
	public WebElementFacade ddl_bulkportupdate_provisionstatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='savePortsDetails();']")
	public WebElementFacade btn_bulkportupdate_showports_Save;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert') and @ng-show='showAlert']")
	public WebElementFacade lbl_bulkportupdate_showports_alertmsg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert') and @ng-show='showAlert']/button")
	public WebElementFacade btn_bulkportupdate_showports_alertmsg_clsicon;	
	
	

	
	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Bulk Port Update')]/../../preceding-sibling::li[1]//tab-heading")
	public WebElementFacade tab_bulkportupdate_previoustab;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//li[@ng-click='refreshDetails()']/a")
	public WebElementFacade btn_deviceportRT_refreshicon;
	
	public static String allsearchXapath="header-label"; // Have to find alternate to findelements
	
	
	@FindBy(xpath=".//*[@class='split-handler']/img[1]")
	public WebElementFacade btn_expandleftscreen;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])[1]")
	public WebElementFacade btn_shelfexpand;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])[2]")
	public WebElementFacade btn_shelfexpand2;
	
	@FindBy(xpath=".//*[@value='Add Card']")
	public WebElementFacade btn_deviceaddcard;
	
	

	
	@FindBy(xpath=".//*[@id='mainTab']/div[1]/ul/li[3]//*[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade btn_closeactivetab2;
	
	@FindBy(xpath=".//*[@id='mainTab']/div[1]/ul/li[2]//*[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade btn_closeactivetab1;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'GPON Device Build')]")
	public WebElementFacade lbl_GDBcreatetab;
	
	//Device Delete Actions
	
	@FindBy(xpath=".//*[@class='modal deviceDeleteConf in']//label[@id='warnMsgId']")
	public WebElementFacade lbl_Device_delete_confirmation_msg;  //Are you sure you want to delete this device.  It's permanent Yo!
	
	@FindBy(xpath=".//*[@ng-click='warnOk()'and @value='Yes']/i")
	public WebElementFacade btn_Device_delete_Yes;
	
	@FindBy(xpath=".//*[@ng-click='warnCancel()']")
	public WebElementFacade btn_Device_delete_cancel;
	
	@FindBy(xpath=".//*[text()='Success']")
	public WebElementFacade lbl_Device_delete_success_window;
	
	@FindBy(xpath=".//*[@class='modal deviceDeleteSuccess in']//label[@id='warnMsgId']")
	public WebElementFacade lbl_Device_delete_success_msg;		//Device has been deleted successfully. The Device Details tab will be closed now.	
	
	@FindBy(xpath="//div[@ng-class='alert.className'][contains(.,'GPON Workers present for device')]")
	public WebElementFacade lbl_Device_delete_WarnMsg_Workers_present;
 	
	@FindBy(xpath=".//*[@ng-click='closeDeviceDetailsTab()']")
	public WebElementFacade btn_Device_delete_success_ok;
	
	@FindBy(xpath=".//*[contains(text(),'No data found for search criteria')]")
	public WebElementFacade lbl_Device_search_deleted;
	
	
	//Advance Search
	
	@FindBy(id="deviceRole")
	public WebElementFacade ddl_devicerole;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='deviceType']")
	public WebElementFacade ddl_Deviceadvcsearch_devicetype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='deviceSubtype']")
	public WebElementFacade ddl_Deviceadvcsearch_devicesubtype;
	
	@FindBy(id="provStatus")
	public WebElementFacade ddl_deviceadvcsearch_provisionstatus;
	
	
	@FindBy(xpath=".//*[@ng-click='inDeviceAdvncSearch()']")
	public WebElementFacade btn_advance_device_search;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invSearchValues.MCO']")
	public WebElementFacade tbx_advance_device_search_mco;
	
	
	
	//*****************************************************************************************************************************//
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading[contains(text(),'Order Id:')]")
	public WebElementFacade btn_order_ACTIVE_tab_search_view_page;
	
	@FindBy(xpath=".//[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'-HSI')]")
	public WebElementFacade lbl_HSI_service_tab_Active;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[text()='Devices Details']")
	public WebElementFacade tab_relatedtab_devicedetails_tab;
	
	@FindBy(xpath="(.//*[contains(@id,'contenttablejqxgridBulk')]/div[@role='row'])[2]//span/../..")
	public WebElementFacade cbx_bulkportupdate_select_2;
	
	//*****************************************************************************************************************************//
	
	//*****************************************************Related Tab Loaders  ************************************************//
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='related_device_loader']")
		public WebElementFacade lbl_Device_RT_loader;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='bamLoader']")
		public WebElementFacade lbl_BAM_RT_loader;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='subscriber_loader']")
		public WebElementFacade lbl_Services_RT_loader;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='task_loader']")
		public WebElementFacade lbl_Task_RT_loader;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='tirksLoader']")
		public WebElementFacade lbl_Tirks_RT_loader;
		
		//*****************************************************************************************************************************//	
	
	@FindBy(xpath = "//*[@ng-click='onClickTab(tab)' and contains(text(),'Device Search Results')]")
			public WebElementFacade tab_Device_advance_search_result;
	
	
	//*****************************************************************************************************************************//
    //********************************* Harsha DSL OVC Changes ******************************//
    
    @FindBy(xpath = ".//*[@ng-show='ServiceType1show']/label")
    public WebElementFacade lbl_Servicetype_search_icon ;
    
    
    @FindBy(xpath = ".//*[@ng-show='ServiceType1show'][3]")
    public WebElementFacade lbl_Servicevalue_search_icon ;
    
    
    
    @FindBy(xpath = ".//*[@ng-click='onClickTab(tab)' and contains(text(),'Service Search Results')]")
    public WebElementFacade tab_service_advance_search_result;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='savePoolRange()']")
    public WebElementFacade btn_RT_Ctag_Save;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert-danger')]")
    public WebElementFacade lbl_RT_ctag_errormsg;
    
    
  //*****************************************************************************************************************************//
    
    //*************************************  Message  Device Page *******************************************************//
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(@class,'alert alert')]")
    public WebElementFacade lbl_device_successmsg; 
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
    public WebElementFacade lbl_device_errormsg; 
    
    @FindBy(xpath="//div[@class='ng-binding alert alert-danger']")
    public WebElementFacade lbl_device_warningmsg; 
    
    @FindBy(xpath=".//button[@ng-click='warnOk()']")
    public WebElementFacade btn_device_delete_comfirmation;
    
    @FindBy(xpath=".//Input[@ng-click='closeDeviceDetailsTab()']")
    public WebElementFacade btn_device_delete_ok;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-show='showAlert' and @class='ng-binding alert alert-danger']/button")
    public WebElementFacade btn_device_errormsg_clsicon; 
    
	

    
    //*****************************************************************************************************************************//
    //*************************************  EDIT Device Page *******************************************************//
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='row form-group-device']//label")
    public List<WebElementFacade> lbl_devicepage_edit_fields ;
    
    @FindBy(xpath = " .//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()[normalize-space() ='Functional Status']]/../following-sibling::div//select[@ng-model='edit.selectedFunction']")
    public WebElementFacade tbx_devicepage_edit_functionalstatus ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.DESCRIPTION']")
    public WebElementFacade tbx_devicepage_edit_netwrkelemntnode ;
    
    @FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@ng-model='edit.selectedProvision']")
    public WebElementFacade ddl_devicepage_edit_provisionstatus ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Subscriber	Name')]")
    public WebElementFacade lbl_devicepage_edit_subscribername ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-click='openSubscriberLookUp()']")
    public WebElementFacade btn_devicepage_edit_subscriberlookup ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.SUBSCRIBERNAME']")
    public WebElementFacade tbx_devicepage_edit_subscriberlookupfield ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.SUBSCRIBERNAME']/..//*[@ng-click='selectMatch($index)']")
    public WebElementFacade lbl_devicepage_edit_subscriberlookupfield ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='edit.selectedAffliate']")
    public WebElementFacade ddl_devicepage_edit_affliateowner ;
    
    @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-model='edit.selectedArielOrBuried']")
    public WebElementFacade ddl_devicepage_edit_aerialrburied ;    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.NODE2NODETYPE']")
    public WebElementFacade ddl_devicepage_edit_devicetype ;
    
    @FindBy(xpath = " .//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.NODE2NODEDEF']")
    public WebElementFacade ddl_devicepage_edit_devicesubtype ;
    
    @FindBy(xpath = " .//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.MAXSUBSCRIBERBWOFFERED']")
    public WebElementFacade tbx_devicepage_edit_otherdev_maxdwnspd ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-model='deviceDetail.MAXSUBSCRIBERUPBWOFFERED']")
    public WebElementFacade tbx_devicepage_edit_otherdev_maxupspd ;    		
    	
    @FindBy(xpath = " .//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-model='deviceDetail.MAXSUBSCRIBERBWOFFERED']")
    public WebElementFacade tbx_devicepage_edit_maxdwnspd ;
    
    @FindBy(xpath = " .//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='deviceDetail.DOWNSTREAM_BW_UNIT']")
    public WebElementFacade ddl_devicepage_edit_maxdwnspd ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-model='deviceDetail.MAXSUBSCRIBERUPBWOFFERED']")
    public WebElementFacade tbx_devicepage_edit_maxupspd ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='deviceDetail.UPSTREAM_BW_UNIT']")
    public WebElementFacade ddl_devicepage_edit_maxupspd ;
    
    @FindBy(xpath = " .//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@ng-model='edit.selectedNosaCertification']")
    public WebElementFacade ddl_devicepage_edit_nosacert ;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Power	Supply']/../following-sibling::div//input[@ng-model='deviceDetail.POWERSUPPLY']")
    public WebElementFacade ddl_devicepage_edit_powersupply ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@id='locationName']")
    public WebElementFacade tbx_devicepage_edit_locationname ;    
    
    @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@id='locationName']/following-sibling::ul//a)[1]")
    	    public WebElementFacade lbl_devicepage_edit_locationresult;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedMCO']")
    public WebElementFacade ddl_devicepage_edit_MCO ;   
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@id='deviceCLLI']")
    public WebElementFacade tbx_devicepage_edit_deviceclli ;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[@id='cllilookup']")
    public WebElementFacade btn_devicepage_edit_cllilookup ;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-model='deviceCLLIlkup.deviceName']")
    public WebElementFacade tbx_devicepage_edit_cllilookup_devicename ;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@ng-click='searchDeviceCLLI()']")
    public WebElementFacade btn_devicepage_edit_cllilookup_lookupicon ;
    
    @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a/strong)[1]")
    	    public WebElementFacade lbl_devicepage_edit_cllilookup_resultdropdown ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[contains(@ng-click,'lookupGridSettings.selLukupValue(')]")
    public WebElementFacade lbl_devicepage_edit_cllilookup_result ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@ng-model='edit.selectedOptiTap']")
    public WebElementFacade tbx_devicepage_edit_optitap ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceDetail.INSTALLDATE']")
    public WebElementFacade tbx_devicepage_edit_installdate ;
    
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[@id='loclkp']")
    public WebElementFacade btn_devicepage_edit_locnLookup ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='address']")
    public WebElementFacade tbx_devicepage_edit_locnLookup_address ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@ng-model='locationlkp.STATE']")
    public WebElementFacade ddl_devicepage_edit_locnLookup_state ;
  
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='searchLocation()']")
    public WebElementFacade btn_devicepage_edit_locnLookup_searchlookupicon ;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//a[@ng-click='lookupGridSettings.selLukupValue(0)']")
    public WebElementFacade lbl_devicepage_edit_locnLookup_result ;
    
    
  //*****************************************************************************************************************************//
    
    //*************************************  EDIT Network Details Page *******************************************************//
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceDetail.SNMP_PORT_ID']")
    public WebElementFacade tbx_devicepage_edit_networkdetails_snmpportnumber;
    
   
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='SNMP_VERSION']")
    public WebElementFacade ddl_devicepage_edit_networkdetails_snmpversion;
    
    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceDetail.SNMPOBJECTID']")
    public WebElementFacade tbx_devicepage_edit_networkdetails_snmpobject;
    
  //*****************************************************************************************************************************//
	//###########################################################	Activations related tab ################################################################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//li[@ng-click='refreshActivationResults()']/a")
	public WebElementFacade btn_Device_RT_activation_refreshicon;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//input[@value='+'])[1]")
			public WebElementFacade btn_Device_RT_activation_valueplus_cion;
			
			
	
	 //*****************************************************************************************************************************//
	
	//###########################################################	Related tab  Actions ################################################################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
	public WebElementFacade btn_RT_view;
    
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail(')])[1]")				
			public WebElementFacade btn_RT_Task_view;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Subscriber'])[1]")	
			public WebElementFacade btn_RT_subscriber_view;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')])[1]")	
			public WebElementFacade lbl_RT_alertmsg;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]/button)[1]")	
	public WebElementFacade btn_RT_alertmsg_clsicon;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'columntabletaskGrid')]//span[contains(text(),'Task ID')]/../../../preceding-sibling::*")
	public List<WebElement> lbl_device_RT_task_count;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//img[contains(@class,'expandButton expandLeftButton')]")
	public WebElementFacade btn_device_leftarrow;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'columntabletaskGrid')]//span[contains(text(),'Task Name')]/../../../preceding-sibling::*")
	public List<WebElement> lbl_device_RT_task_name_count;

			
	
	 //*****************************************************************************************************************************//
	
	//###########################################################	Contact Related tab  ################################################################//
	
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[text()='Add Contact'])[1]")				//change the row to 0
	public WebElementFacade btn_ContactRT_ADDContact_nodata;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[text()='Add Contact'])[2]")				//change the row to 0
	public WebElementFacade btn_ContactRT_ADDContact_Withdata;
	
	//---------------------		Contact Create Screen ---------------------//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Create Contact')]")
	public WebElementFacade tab_createcontact;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Create Contact')]/../../preceding-sibling::li[1]//tab-heading")
	public WebElementFacade tab_createcontact_precedingsibling;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Create Contact')]/../../following-sibling::li[1]//tab-heading")
	public WebElementFacade tab_createcontact_followingsibling;
	
	@FindBy(id="firstName")
	public WebElementFacade tbx_createcontact_firstname;
	
	@FindBy(id="lastName")
	public WebElementFacade tbx_createcontact_lastname;	
	
	@FindBy(id="contactCategory")
	public WebElementFacade ddl_createcontact_contactcategory;	
	
	@FindBy(id="contactType")
	public WebElementFacade ddl_createcontact_contacttype;
	
	@FindBy(xpath="(.//input[@id='ContactRole'])[1]")
	public WebElementFacade cbx_createcontact_account;
	
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_createcontact_home_filed1;
			
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_createcontact_home_filed2;
					
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_createcontact_home_filed3;
	
	@FindBy(xpath="(.//*[@id='allDay']/..)[contains(text(),'Home')]/input")
	public WebElementFacade cbx_home;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createContact();']")
	public WebElementFacade btn_contact_create;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='deleteContact(tab.content);']")
	public WebElementFacade btn_contactview_delete;	
	
	 //*****************************************************************************************************************************//
	
	//###########################################################	Device Advance search  ################################################################//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Device Search Results')]")
	public WebElementFacade tab_Devicesearchresult;	
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail(')])[1]")
	public WebElementFacade btn_result_view;	
	
	


	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(text(),' of ')]")
    public WebElementFacade lbl_device_search_count;
	
	
	//#################################################################################################################################################################################//
	
	//###########################################################	GDB Validation  ################################################################//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'GPON Device Build:')]")
	public WebElementFacade tab_GDB;
	
	@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'FDP')]")
	public WebElementFacade btn_gpon_FDP_box;
	
	@FindBy(xpath="//span[@class='badge']/h5[contains(text(), 'FDH')]")
	public WebElementFacade btn_gpon_FDH_box;
	
	@FindBy(xpath=".//tr[@ng-repeat-start='aDevice in loaddata track by $index']/td[3]")
	public WebElementFacade lbl_oltdeviceGDB;
	
	//#################################################################################################################################################################################//
	@FindBy(xpath="//div[contains(@id,'dropdownlistArrowgridpagerlistjqxGrid')]")
	public WebElementFacade btn_device_row_option;
	
	@FindBy(xpath="//div[@role='option']/span[contains(text(),'100')]")
	public WebElementFacade lbl_device_row_option_100;
	
	@FindBy(xpath="//div[@role='option']/span[contains(text(),'500')]")
	public WebElementFacade lbl_device_row_option_500;
	
	@FindBy(xpath="//div[@title='next']/div")
	public WebElementFacade btn_next_device_list;
	
	@FindBy(xpath="(//div[@role='row']/div[@role='gridcell'][5]/div)[1]")
	public WebElementFacade lbl_first_devicename_list;
	
	@FindBy(xpath="(//div[@role='row']/div[@role='gridcell'][5]/div)[last()]")
	public WebElementFacade lbl_last_devicename_list;
	
	@FindBy(xpath="//div[contains(@id,'jqxScrollThumbverticalScrollBarjqxGrid')]")
	public WebElementFacade bar_devicelist_page;
	
	@FindBy(xpath="//div[contains(@id,'jqxScrollBtnDownverticalScrollBarjqxGrid')]")
	public WebElementFacade btn_down_arrow;
	
	@FindBy(xpath="//div[@ng-show='service_inventory_loader && !isWidget']")
	public WebElementFacade img_loader_devicelist;
	
	
	
	
	
	
	
	//###########################################################################Transport path tab#############################
	
	
	
	@FindBy(xpath ="(.//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'getTransData')])[1]/label")
	public WebElementFacade lbl_route_name;
	
	
			
	@FindBy(xpath ="((//label[@class = 'deviceMarginAlign'])[1]/../span)[1]")
	public WebElementFacade lbl_start_device_tp;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[contains(text(),' of ')]")
    public WebElementFacade lbl_relatedtab_count;
	
	//###############################################################################################################################
	
	@FindBy(xpath="//table[@id='facilityDeviceDetail']//tr[2]/td[2]")
	public WebElementFacade lbl_passive_devicename;
	
	public void devicetype_in_device_search_slider(String type) throws InterruptedException{
		try {
			waitForElement(actvtnpage.ddl_deviceType);
			actvtnpage.ddl_deviceType.selectByVisibleText(type);
			slf4jLogger.info("ddl_deviceType: "+type);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_services;
	}
	
	public void click_Device_related_tab(String tab) throws Throwable {
		//tab_ctag);
		//Thread.sleep(5000);
		//slf4jLogger.info("Executed the line"+tab);
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
		String devicename = lbl_deviceName.getText();
		switch(tab){
		case "Service Circuit Design":jsClick(tab_services_circuitdesign);Thread.sleep(5000); break; 
		case "Services": jsClick(tab_services);Thread.sleep(5000);
					        if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){ 
					            Thread.sleep(3000);
					            waitForElement(orderpage.btn_related_tab_refresh_icon);
					            String list = lbl_relatedtab_count.getText();
					            String count[] = list.split(" of ");
					            int OV_Count =Integer.parseInt(count[1]);
					            List<WebElement> OV_Services_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div/div[2]/div"));
					            List<String> DB_Services_list = ARMDB.device_RT_Servicesvalidation(devicename.trim());
					            System.out.println("No of Services in OV: "+OV_Count);
					            System.out.println("No of Services in Database: "+DB_Services_list.size());
					 if(DB_Services_list.size()==OV_Count){
					        System.out.println("OV and Database services count is same");
					            for(int i=0; i<=DB_Services_list.size()-1; i++){
					                          if(OV_Services_list.get(0).getText().trim().contains(DB_Services_list.get(i).trim())){
					                                 System.out.println(OV_Services_list.get(0).getText()+" Service is avaliable in database");
					                                 break;
					                          }
					                   }     
					     }else{
					     throw new Error("OV Services are not equal to Database Circuits");
					            }
					     } else {
					     //     orderpage.failure_icon_validation();
					            System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
					     }
					     break;

		/*  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='subscriber_loader']")));

		  System.out.print("Loader Diappered"); 
		  if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
		  if(orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			  if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				  orderpage.failure_icon_validation();
			  }
			  throw new Error("Getting this message:"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
			 
		  }
		  if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
		  if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			  if(servicepage.lbl_HSI_service_tab.isCurrentlyVisible()){
					waitForElement(orderpage.btn_related_tab_excel_icon);
				} else
				if(!orderpage.btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){
					waitForElement(orderpage.lbl_Service_RT_Name_column);
				} else {
					waitForElement(orderpage.btn_related_tab_excel_icon);
				}
		  } } } else {
			  waitForElement(orderpage.btn_related_tab_excel_icon);
		  } */ //	Find another way to handle the FTT out of the scripts
		  
		case "CTag": jsClick(tab_ctag);Thread.sleep(2000); break;
		
		case "Orders": jsClick(tab_orders); Thread.sleep(5000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								/*// waitForElement(orderpage.btn_related_tab_excel_icon); 
								
							} else {
								//orderpage.failure_icon_validation();
*/							} break;		
							
		case "Contacts":  jsClick(tab_contact); Thread.sleep(5000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								 //waitForElement(orderpage.btn_related_tab_excel_icon); 
							} else {
								//orderpage.failure_icon_validation();
							} break;
		
		case "BAM Report": 
			jsClick(tab_bamreport); Thread.sleep(5000);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='bamLoader']")));                                      
                                            System.out.println("Loader Diappered");   
                                            //String devicename = lbl_deviceName.getText();
                                            if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
                                                   waitForElement(orderpage.btn_related_tab_excel_icon);
                                                   String list = lbl_relatedtab_count.getText();
                                                          String count[] = list.split(" of ");
                                                          int OV_Count =Integer.parseInt(count[1]);
                                                   List<WebElement> OV_Bamevents_list = loginPage.getDriver().findElements(By.xpath("//div[contains(@id,'contenttablebamGrid')]/div[@role='row']/div[2]/div"));
                                                   List<String> DB_Bamevents_list = OSRDB.device_bam_reportvalidation(devicename.trim());
                                                   System.out.println("No of Bam reports ID in OV: "+OV_Count);
                                                   System.out.println("No of Bam reports ID in Database: "+DB_Bamevents_list.size());
                                                   if(DB_Bamevents_list.size()==OV_Count){
                                                          System.out.println("OV and Database BAM Reports count is same");
                                                   for(int i=0; i<=DB_Bamevents_list.size()-1; i++){
                                                                 if(OV_Bamevents_list.get(0).getText().contains(DB_Bamevents_list.get(i))){
                                                                        System.out.println(OV_Bamevents_list.get(0).getText()+" BAM Event Row Id is avaliable in database");
                                                                       break;
                                                                 }
                                                          }
                                                   }else{
                                                          throw new Error("OV BAM Events are not equal to Database BAM Events");
                                                   }
                                            } else {
                                            //     orderpage.failure_icon_validation();
                                                   System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
                                            } break;
							
 		case "Devices": if(btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible() || !tab_Device_ports.isCurrentlyVisible() || lbl_HSI_service_tab_Active.isCurrentlyVisible()){ 
			//if(!tab_Device_ports.isCurrentlyVisible()){	
			jsClick(tab_Devices); 
				Thread.sleep(3000);
				
				  //Wait for element invisible
				  
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='related_device_loader']")));

				  System.out.print("Loader Diappered");   
				  
				/*  if(!orderpage.lbl_vieworderpage_related_tab_non_active_tab_device.isCurrentlyVisible()){
					  if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
				//	  if(orderpage.btn_vieworderpage_related_tab_device_refresh.isCurrentlyVisible()){						 							
								orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- Devices are neither displayed nor any message");
				    			throw new Error("Fail- Devices are neither displayed nor any message");														
					//  		}
					  } else {
						  orderpage.failure_icon_validation();
						  break;
					  }
				  }		*/							// Re-check on this conditions
				waitForElement(orderpage.btn_vieworderpage_related_tab_device_refresh);
				
				
				
			/*	} else {
					orderpage.failure_icon_validation();
				}*/
			//	}
		} else {
			jsClick(tab_Devices); 
			waitForElement(orderpage.btn_vieworderpage_related_tab_device_refresh);
			Thread.sleep(3000);
		}
			break;
		
		
		case "Tasks": jsClick(tab_Tasks); Thread.sleep(2000); 
		
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='task_loader']")));

				  System.out.print("Loader Diappered");   
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							waitForElement(servicepage.lbl_taskresulttable);
						} else {
						//	orderpage.failure_icon_validation();
						} break;

		case "Locations": 
			jsClick(tab_Locations); Thread.sleep(3000);
            if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){ 
                          Thread.sleep(3000);
                          
                          waitForElement(orderpage.btn_related_tab_refresh_icon);
                          
                          String list = lbl_relatedtab_count.getText();
                                 String count[] = list.split(" of ");
                                 int OV_Count =Integer.parseInt(count[1]);
                          List<WebElement> OV_Location_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[3]/div"));
                          List<String> DB_Location_list = ARMDB.device_RT_locationsvalidation(devicename.trim());
                          System.out.println("No of Locations in OV: "+OV_Count);
                          System.out.println("No of Locations in Database: "+DB_Location_list.size());
               if(DB_Location_list.size()==OV_Count){
                      System.out.println("OV and Database Locations count is same");
                      for(int i=0; i<=DB_Location_list.size()-1; i++){                  
                                        if(OV_Location_list.get(0).getText().trim().contains(DB_Location_list.get(i).trim())){
                                               System.out.println(OV_Location_list.get(i).getText()+" Location is avaliable in database");
                                              break;
                                        }
                                 }
                                
                          }else{
                          throw new Error("OV Locations are not equal to Database Circuits");
                                 }
                   }else{
                   //     orderpage.failure_icon_validation();
                          System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
                   }
                   break;

		case "Circuits":jsClick(tab_Circuits);Thread.sleep(3000);                                       
                   if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){ 
                          Thread.sleep(3000);
                          
                          waitForElement(orderpage.btn_related_tab_refresh_icon);       
                          
                          String list = lbl_relatedtab_count.getText();
                          String count[] = list.split(" of ");
                          int OV_Count =Integer.parseInt(count[1]);
                          
                          List<WebElement> OV_Circuits_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
                          List<String> DB_Circuits_list = ARMDB.device_RT_Circuitvalidation(devicename.trim());
                          System.out.println("No of Circuits in Database: "+DB_Circuits_list.size());
                          System.out.println("No of Circuits in OV: "+OV_Count);
               if(DB_Circuits_list.size()==OV_Count){
                      System.out.println("OV and Database Circuits count is same");
                          for(int i=0; i<=OV_Circuits_list.size()-1; i++){              
                                        if(OV_Circuits_list.get(0).getText().trim().contains(DB_Circuits_list.get(i).trim())){
                                               System.out.println(OV_Circuits_list.get(i).getText()+" Circuit is avaliable in database");
                                              break;
                                        }
                                 }
                                
                   }else{
                   throw new Error("OV Circuits are not equal to Database Circuits");
                          }
                   } else {
                   //     orderpage.failure_icon_validation();
                          System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
                   }
                   break;

						
		case "Circuit":jsClick(tab_Circuit);Thread.sleep(3000);
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							waitForElement(orderpage.btn_related_tab_refresh_icon);
						}break;
		
		case "Subscribers": jsClick(tab_Subscriber); Thread.sleep(5000);
						//if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								//waitForElement(orderpage.btn_related_tab_refresh_icon);
								waitForElement(btn_RT_subscriber_view);
							} //else {
								//orderpage.failure_icon_validation();
							//	throw new Error("No Data Displayed Getting this message:"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
						//	}} waitForElement(orderpage.btn_related_tab_refresh_icon);
							break;
		
		
		
		case "Device Ports": jsClick(tab_Device_ports); Thread.sleep(2000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								 waitForElement(btn_shelfexpand); 
							} else {
							//	orderpage.failure_icon_validation();
							} break;
		
		case "Service Areas": jsClick(tab_Service_Areas); Thread.sleep(3000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								waitForElement(orderpage.btn_related_tab_excel_icon); 
							} else {
								//orderpage.failure_icon_validation();
							} break;
		
		case "TIRKS":jsClick(tab_TIRKS); Thread.sleep(5000);
										if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible() || !orderpage.lbl_alert_message_no_data_tirks_CD.isCurrentlyVisible()){
											waitForElement(orderpage.btn_related_tab_refresh_icon);
											slf4jLogger.info("Tirks Tab got selected & refresh enabled");
									} else {
										//orderpage.validate_Tirks_related_tab();
										slf4jLogger.info("Tirks Tab validations");
									} break;
		
		case "Performance":jsClick(tab_Performance); Thread.sleep(3000); 
								if(!orderpage.lbl_alert_message_no_data_Performance_related_tabs.isCurrentlyVisible()){
									waitForElement(orderpage.btn_related_tab_refresh_icon);
								} else {
									//orderpage.failure_icon_validation();
								} break;
		
		case "Virtual Ports":jsClick(tab_Virtual_Ports); Thread.sleep(3000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								waitForElement(orderpage.btn_related_tab_refresh_icon);
							} else {
								//orderpage.failure_icon_validation();
							} break;
							
		case "Audit logs":device_serach_page_tab("Audit Log");break;
		
		case "Topology View":jsClick(tab_Topologyview);break;
		
		
		}
		
		slf4jLogger.info("Selected "+tab+" in 360 view");
						
	}
	
	
	public void click_servicetab(String tab) throws Throwable {
		//tab_ctag);
		//Thread.sleep(5000);
		//slf4jLogger.info("Executed the line"+tab);
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
		switch(tab){
		case "Members":jsClick(servicepage.tab_ovcmembers);Thread.sleep(500); break;  
		
		
		case "Service Circuit Design":jsClick(tab_services_circuitdesign);Thread.sleep(5000); break; 
		case "Services": jsClick(tab_services);Thread.sleep(5000);
		
		/*  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='subscriber_loader']")));

		  System.out.print("Loader Diappered"); 
		  if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
		  if(orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			  if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				  orderpage.failure_icon_validation();
			  }
			  throw new Error("Getting this message:"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
			 
		  }
		  if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
		  if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			  if(servicepage.lbl_HSI_service_tab.isCurrentlyVisible()){
					waitForElement(orderpage.btn_related_tab_excel_icon);
				} else
				if(!orderpage.btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){
					waitForElement(orderpage.lbl_Service_RT_Name_column);
				} else {
					waitForElement(orderpage.btn_related_tab_excel_icon);
				}
		  } } } else {
			  waitForElement(orderpage.btn_related_tab_excel_icon);
		  } */ //	Find another way to handle the FTT out of the scripts
		  
		  					break; 
		
		case "CTag": jsClick(tab_ctag);Thread.sleep(2000); break;
		
		case "Orders": jsClick(tab_orders); Thread.sleep(5000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								/*// waitForElement(orderpage.btn_related_tab_excel_icon); 
								
							} else {
								//orderpage.failure_icon_validation();
*/							} break;		
							
		case "Contacts":  jsClick(tab_contact); Thread.sleep(5000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								 //waitForElement(orderpage.btn_related_tab_excel_icon); 
							} else {
								//orderpage.failure_icon_validation();
							} break;
		
		case "BAM Report": jsClick(tab_bamreport); Thread.sleep(5000);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='bamLoader']")));

		  System.out.print("Loader Diappered");   
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								 waitForElement(orderpage.btn_related_tab_excel_icon); 
							} else {
							//	orderpage.failure_icon_validation();
							} break;
							
 		case "Devices": if(btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible() || !tab_Device_ports.isCurrentlyVisible() || lbl_HSI_service_tab_Active.isCurrentlyVisible()){ 
			//if(!tab_Device_ports.isCurrentlyVisible()){	
			jsClick(tab_Devices); 
				Thread.sleep(3000);
				
				  //Wait for element invisible
				  
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='related_device_loader']")));

				  System.out.print("Loader Diappered");   
				  
				/*  if(!orderpage.lbl_vieworderpage_related_tab_non_active_tab_device.isCurrentlyVisible()){
					  if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
				//	  if(orderpage.btn_vieworderpage_related_tab_device_refresh.isCurrentlyVisible()){						 							
								orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- Devices are neither displayed nor any message");
				    			throw new Error("Fail- Devices are neither displayed nor any message");														
					//  		}
					  } else {
						  orderpage.failure_icon_validation();
						  break;
					  }
				  }		*/							// Re-check on this conditions
				waitForElement(orderpage.btn_vieworderpage_related_tab_device_refresh);
				
				
				
			/*	} else {
					orderpage.failure_icon_validation();
				}*/
			//	}
		} else {
			jsClick(tab_Devices); 
			waitForElement(orderpage.btn_vieworderpage_related_tab_device_refresh);
			Thread.sleep(3000);
		}
			break;
		
		
		case "Tasks": jsClick(tab_Tasks); Thread.sleep(5000); 
		
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='task_loader']")));
				//Thread.sleep(3000);
				  System.out.print("Loader Diappered");   
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							waitForElement(servicepage.lbl_taskresulttable);
						} else {
						//	orderpage.failure_icon_validation();
						} break;
		

		
		case "Locations": jsClick(tab_Locations); Thread.sleep(3000);
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							waitForElement(orderpage.btn_related_tab_print_icon);
						} else {
						//	orderpage.failure_icon_validation();
						} break;
		
	
		
		case "Circuits":jsClick(tab_Circuits);Thread.sleep(3000);
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							waitForElement(orderpage.btn_related_tab_refresh_icon);
						}else {
						//	orderpage.failure_icon_validation();
						} break;
						
		case "Circuit":jsClick(tab_Circuit);Thread.sleep(3000);
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							waitForElement(orderpage.btn_related_tab_refresh_icon);
						}break;
		
		case "Subscribers": jsClick(tab_Subscriber); Thread.sleep(5000);
						//if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								//waitForElement(orderpage.btn_related_tab_refresh_icon);
								waitForElement(btn_RT_subscriber_view);
							} //else {
								//orderpage.failure_icon_validation();
							//	throw new Error("No Data Displayed Getting this message:"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
						//	}} waitForElement(orderpage.btn_related_tab_refresh_icon);
							break;
		
		
		
		case "Device Ports": jsClick(tab_Device_ports); Thread.sleep(2000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								 waitForElement(btn_shelfexpand); 
							} else {
							//	orderpage.failure_icon_validation();
							} break;
		
		case "Service Areas": jsClick(tab_Service_Areas); Thread.sleep(3000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								waitForElement(orderpage.btn_related_tab_excel_icon); 
							} else {
								//orderpage.failure_icon_validation();
							} break;
		
		case "TIRKS":jsClick(tab_TIRKS); Thread.sleep(5000);
										if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible() || !orderpage.lbl_alert_message_no_data_tirks_CD.isCurrentlyVisible()){
											waitForElement(orderpage.btn_related_tab_refresh_icon);
											slf4jLogger.info("Tirks Tab got selected & refresh enabled");
									} else {
										//orderpage.validate_Tirks_related_tab();
										slf4jLogger.info("Tirks Tab validations");
									} break;
		
		case "Performance":jsClick(tab_Performance); Thread.sleep(3000); 
								if(!orderpage.lbl_alert_message_no_data_Performance_related_tabs.isCurrentlyVisible()){
									waitForElement(orderpage.btn_related_tab_refresh_icon);
								} else {
									//orderpage.failure_icon_validation();
								} break;
		
		case "Virtual Ports":jsClick(tab_Virtual_Ports); Thread.sleep(3000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								waitForElement(orderpage.btn_related_tab_refresh_icon);
							} else {
								//orderpage.failure_icon_validation();
							} break;
							
		case "Audit logs":device_serach_page_tab("Audit Log");break;
		
		case "Topology View":jsClick(tab_Topologyview);break;
		
		
		}
		/*if(tab.equals("Services")){
			tab_services);
			Thread.sleep(35000);
		}
		else if(tab.equals("CTag")){
			tab_ctag);
			
		}
		else if(tab.equals("Orders")){
			tab_orders);
			
		}
		else if(tab.equals("Contacts")){
			 tab_contact);
			
		}
		else if(tab.equals("BAM Report")){
			tab_bamreport);
			
		}
		else if(tab.equals("Activations")){
			tab_Activations);
			
		}
		//newly added by MOHIT
		else if(tab.equals("Devices")){
			tab_Devices);
			
		}
		else if(tab.equals("Tasks")){
			tab_Tasks);
			
		}
		else if(tab.equals("Locations")){
			tab_Locations);
			
		}
		else if(tab.equals("Circuits")){
			tab_Circuits);
			
		}
		else if(tab.equals("Subscribers")){
			tab_Subscriber);
			
		}*/
		//Thread.sleep(35000);
		slf4jLogger.info("Selected "+tab+" in 360 view");
						
	}
	
	public void attribute_field() throws Exception {
		Thread.sleep(3000);
		//String txtfields=enduser.getDriver().findElements(By.xpath(".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']"));
		//slf4jLogger.info(lbl_attributes.getText());
		
	}
	
	//New updates-9/23
	public void validateDeviceDetail(String template){
		try {
			String sSubscriberType = lbl_SubscriberType.getText();
			String sSubscriberName = lbl_SubscriberName.getText();
			
			slf4jLogger.info("sSubscriberType ="+sSubscriberType);
			slf4jLogger.info("sSubscriberName ="+sSubscriberName);
			UserSteps enduser = new UserSteps();
			
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template).getContainer("SubscriberName");
			String fieldValue = datacontainer.getFieldValue("ddl_SubscriberType");
			String fieldValue1 = datacontainer.getFieldValue("tbx_Subscribername");
			
			slf4jLogger.info("fieldValue ="+fieldValue);
			slf4jLogger.info("fieldValue1 ="+fieldValue1);
			
			String FielsString[] = fieldValue.split(":");
			String actualSubscriberTypeFieldvalue = FielsString[1];
			slf4jLogger.info("actualSubscriberTypeFieldvalue= "+actualSubscriberTypeFieldvalue);
			
			
			String FielsString1[] = fieldValue1.split(":");
			String actualSubscriberNameFieldvalue = FielsString1[1];
			slf4jLogger.info("actualSubscriberNameFieldvalue= "+actualSubscriberNameFieldvalue);
			
			Boolean flag = sSubscriberType.equalsIgnoreCase(actualSubscriberTypeFieldvalue);
			Assert.assertTrue("Subscriber Type is not same", flag);
//			Assert.assertEquals("Subscriber Type is not same", sSubscriberType, actualSubscriberTypeFieldvalue);
			slf4jLogger.info("Subscriber Type is same");
			
			
			Boolean flag1 = sSubscriberName.equalsIgnoreCase(actualSubscriberNameFieldvalue);
			Assert.assertTrue("Subscriber Name is not same", flag1);
//			Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
			slf4jLogger.info("Subscriber Name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void verify_buttons_related_tabs(String buttons) throws Throwable {
		orderpage.support_icons_related_tabs();
	}
	
	
	
	public void tabNetworkDetail(){
		jsClick(tab_serach_device_Networking_details);
	}
	
	public void click_EditDeviceDetailbtn(String button) throws InterruptedException {
		if(button.equals("Edit")){
			jsClick(btn_EditDeviceDetailbtn);
		}
		else if(button.equals("Save")){
			jsClick(btn_NDSaveButton);
			}
		Thread.sleep(5000);
	}
	
	public void saveNetworkingDetails() throws InterruptedException{
		jsClick(btn_saveDeviceDetail);//Rework
		Thread.sleep(5000);
	}
	
	public void validateNetworkDetail(String template){
		try {
			String sSerialName = lbl_SerialName.getText();
			String actualSerialName = sSerialName.trim();
			slf4jLogger.info("actualSerialName= "+actualSerialName);
			
			String sVendorPartName = lbl_VendorPartName.getText();
			String actualVendorPartName = sVendorPartName.trim();
			slf4jLogger.info("actualVendorPartName= "+actualVendorPartName);
			
			slf4jLogger.info("sSerialName ="+sSerialName);
			slf4jLogger.info("sVendorPartName ="+sVendorPartName);
			UserSteps enduser = new UserSteps();
			
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template);
			String fieldValue = datacontainer.getFieldValue("tbx_serialNumber");
			String fieldValue1 = datacontainer.getFieldValue("tbx_vendorPartNumber");
			
			slf4jLogger.info("fieldValue ="+fieldValue);
			slf4jLogger.info("fieldValue1 ="+fieldValue1);
			
			String FielsString[] = fieldValue.split(":");
			String expectSerialNameFieldvalue = FielsString[1];
			slf4jLogger.info("actualSerialNameFieldvalue= "+expectSerialNameFieldvalue);
			
			
			String FielsString1[] = fieldValue1.split(":");
			String expectVendorPartNameFieldvalue = FielsString1[1];
			slf4jLogger.info("actualVendorPartNameFieldvalue= "+expectVendorPartNameFieldvalue);
			
			Assert.assertEquals("Serial Name is not same", expectSerialNameFieldvalue, actualSerialName);
			slf4jLogger.info("Serial Name is same");
			
			Assert.assertEquals("Vendor Part Name is not same", expectVendorPartNameFieldvalue, actualVendorPartName);
			slf4jLogger.info("Vendor Part Name is same");
			


		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	
	public void validate_DeviceNameValue() throws InterruptedException {
		Thread.sleep(15000);
		String deviceName = lbl_DeviceName.getText();
		slf4jLogger.info(deviceName);
		String serviceDeviceName = lbl_ServiceDeviceName.getText();
		slf4jLogger.info(serviceDeviceName);
		Assert.assertEquals("device name is not same", serviceDeviceName, deviceName);
		slf4jLogger.info("device name is same");
}
	
	public void verfiy_relatedTabPage(String Tab) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(getDriver(), 180);
		if(Tab.equals("Tasks")){
			wait.until(ExpectedConditions.visibilityOf(tag_taskDetails));
			Assert.assertTrue(tag_taskDetails.isDisplayed());
		}
		
		else if(Tab.equals("Locations")){
			wait.until(ExpectedConditions.visibilityOf(tag_LocationDetails));
			slf4jLogger.info("location wait done");
			Assert.assertTrue(tag_LocationDetails.isDisplayed());
		}
		
		else if(Tab.equals("Circuits")){
			wait.until(ExpectedConditions.visibilityOf(tag_circuitDetails));
			slf4jLogger.info("Circuit wait done");
			Assert.assertTrue(tag_circuitDetails.isDisplayed());
		}
		
		else if(Tab.equals("Devices")){
			wait.until(ExpectedConditions.visibilityOf(tag_deviceDetails));
			slf4jLogger.info("Device wait done");
			Assert.assertTrue(tag_deviceDetails.isDisplayed());
		}
		
		Thread.sleep(3000);		
		
	}
	
	public void delebuttonvalidation(String buttons) throws Throwable{
		
		waitForElement(devcreatepage.btn_Edit);
		switch(buttons){
		case "Delete":slf4jLogger.info(lbl_devicerole.getText());
						if(lbl_devicerole.getText().contains("TD") || lbl_devicerole.getText().contains("UPS") || lbl_devicerole.getText().contains("BRIX") || lbl_devicerole.getText().contains("DSLAM") || lbl_devicerole.getText().contains("NPE") || lbl_devicerole.getText().contains("NID") || lbl_devicerole.getText().contains("BRAS") || lbl_devicerole.getText().contains("AGG") || lbl_devicerole.getText().contains("CLIENT") || lbl_devicerole.getText().contains("HOST") || lbl_devicerole.getText().contains("MSAP")){
							if(!btn_deletebutton.isPresent()){
								throw new Error("Delete button is enabled for Ethernet device"+lbl_devicerole.getText());
							} 
						}else slf4jLogger.info("Delete button is enabled for GPON & passive only device"+lbl_devicerole.getText()); break;
		
		case "Refresh" : if(btn_Refresh_button.isCurrentlyVisible() && btn_Refresh_button.isCurrentlyEnabled()){
								slf4jLogger.info("Refresh is visible & clickable");
							} else {
								slf4jLogger.info("Refresh is not visible");
							} break;
		
		case "Edit":  if(devcreatepage.btn_Edit.isCurrentlyVisible() && devcreatepage.btn_Edit.isCurrentlyEnabled()){
							slf4jLogger.info("Edit is visible & clickable");
						} else {
							slf4jLogger.info("Edit is not visible");
						} 
		
		if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			//orderpage.gfast_write_data_inexcel("GFast-Sheet", "GFast_DeviceView360", 2, "Pass");
			slf4jLogger.info("Entered into the Excel write");
			orderpage.gfast_Automation_status_update("GFast-Sheet", "GFast_DeviceView360");	
		} break;
		
		case "Revert":  if(btn_Revert_button.isCurrentlyVisible() && btn_Revert_button.isCurrentlyEnabled()){
							slf4jLogger.info("Revert is visible & clickable");
						} else {
							slf4jLogger.info("Revert is not visible");
						}break;
		
		}
		
		
	}
	
	public void advance_devicetype_search(String type,String subtype) throws InterruptedException{
		try {
			waitForElement(ddl_Deviceadvcsearch_devicetype);
			ddl_Deviceadvcsearch_devicetype.selectByVisibleText(type);
			Thread.sleep(1500);
			ddl_Deviceadvcsearch_devicesubtype.selectByVisibleText(subtype);
			slf4jLogger.info("ddl_Deviceadvcsearch_devicetype:"+type+"ddl_Deviceadvcsearch_devicesubtype:"+subtype);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void advance_device_search_status(String status) throws InterruptedException{
		try {
			
		waitForElement(ddl_devicerole);
		
		ddl_deviceadvcsearch_provisionstatus.selectByVisibleText(status);Thread.sleep(1000);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void advance_device_search(String role) throws InterruptedException{
		try {
			waitForElement(ddl_devicerole);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ddl_devicerole.selectByVisibleText(role);
		Thread.sleep(2000);	
		/*btn_advance_device_search);
		Thread.sleep(3000);	
		loginPage.waitFor(actvtnpage.btn_view);
		Thread.sleep(2000);	*/
	}
	
	
	
	public void advance_device_search_mco(String mco_val) throws InterruptedException{
		try {
			waitForElement(tbx_advance_device_search_mco);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tbx_advance_device_search_mco.sendKeys(mco_val);
		Thread.sleep(2000);	
		/*btn_advance_device_search);
		Thread.sleep(3000);	
		loginPage.waitFor(actvtnpage.btn_view);
		Thread.sleep(2000);	*/
	}
	
	public void validate_message_device_Details(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		if(devcreatepage.success_alert.getText().contains(" Device Updated successfully.")){
			slf4jLogger.info("Working as expected");
		}
	}
	
	public void validate_message_network_Details(){
		if(devcreatepage.success_alert_edit.getText().contains(" Device Edited successfully.")){
			slf4jLogger.info("Working as expected");
		}
	}
	
	public void  device_edit_field_modification(String devicefield){
		if(lbl_maxsubscbandwidth.getText().contains("Max Subscriber Downstream Bandwidth*")){
			tbx_maxsubscbandwidth.clear();
		} else throw new Error("Invalid field Max subscriber downstream BW");
		
	}
	
	public void devicedetailpage_maxsubsfill(){
		tbx_maxsubscbandwidth.type("1000");
	}
	public void delete_confirmation_msg(){ try {WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),100);	
	
			slf4jLogger.info(lbl_Device_delete_confirmation_msg.getText()+"This msg is displayed");
			if(lbl_Device_delete_confirmation_msg.getText().contains("Are you sure you want to delete this device.  It's permanent Yo!")){
				slf4jLogger.info("Working as expected for initial confirmation");			
			}
			jsClick(btn_Device_delete_Yes);
				Thread.sleep(3000);
		  //wait.until(ExpectedConditions.visibilityOf(lbl_Device_delete_success_msg));
		   if (lbl_Device_delete_WarnMsg_Workers_present.isCurrentlyVisible() && lbl_Device_delete_WarnMsg_Workers_present.getText().contains("Workers present")) {
			   slf4jLogger.info("Workers present");
			   
		   }
		  // slf4jLogger.info(lbl_Device_delete_success_msg.getText()+"This msg is displayed in success popup");
		   else  if(lbl_Device_delete_success_msg.getText().contains("Device has been deleted successfully")){
			   slf4jLogger.info("Working as expected for initial confirmation");		
			   jsClick(btn_Device_delete_success_ok);
		    }
		 	
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void delete_device_inventory(){
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),100);	
		
		slf4jLogger.info(lbl_Device_delete_success_window.getText()+"This Success msg");
		if(lbl_Device_delete_success_window.getText().contains("Success")){
			slf4jLogger.info("Working as expected getting Success msg");	
		}
		
		slf4jLogger.info(lbl_Device_delete_success_msg.getText()+"Success msg Displayed");
		
		if(lbl_Device_delete_success_msg.getText().contains("Device has been deleted successfully. The Device Details tab will be closed now.")){
			slf4jLogger.info("Working as expected getting Right Success msg");	
		}
		jsClick(btn_Device_delete_success_ok);
		wait.until(ExpectedConditions.visibilityOf(devcreatepage.btn_Create));
		
	}
	
	//******************************************* G.FAST Validations ****************************************//
	public void Device_role_validation() throws Throwable{
		if(lbl_devicerole.isCurrentlyVisible()){
		if(lbl_devicerole.getText().contains("DSLAM")){
			slf4jLogger.info("DSLAM Device is opened"+lbl_devicerole.getText());			
		} else {
			slf4jLogger.info("Not DSLAM Device"+lbl_devicerole.getText());
		}
		} else if(tab_serach_device_Device_details.isCurrentlyVisible()){
			// Whether its in Device View page
			slf4jLogger.info("Its in the Device View Page");
			if(btn_serach_device_audit_log_arm_omnivue_log_refresh.isCurrentlyVisible()){
				jsClick(tab_serach_device_Device_details);
			}
		}
		
	}
	
	
	public void device_serach_page_tab(String device_tab) throws Throwable{
		//loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+device_tab+"')]")));
		switch(device_tab){
		case "Device Details":jsClick(tab_serach_device_Device_details);	waitForElement(devcreatepage.btn_Edit);break;
		case "Networking Details":jsClick(tab_serach_device_Networking_details);waitForElement(btn_serach_device_network_details_tab_edit_device_details);break;
		case "Audit Log": jsClick(tab_serach_device_Audit_logs);waitForElement(tab_serach_device_audit_log_arm_audit_log);break;
		case "Transport Details": jsClick(tab_serach_device_Transport_details); break;
			
		}
	}
	
	public void search_Device_section_validation(String device_section) throws Throwable{
		
		String excel_Write="Yes";
		if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			int column=0;
		switch(device_section){
		case "Information" :column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Provision_status");
							slf4jLogger.info("Column position is:"+column);
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_information_sec_Provision_status.getText(), "In Service", "Provision_status");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_information_sec_Provision_status.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_information_sec_Functional_status.getText(), "Monitored", "Functional_status");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_information_sec_Functional_status.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_information_sec_Network_element_status.getText(), " ", "Network_element");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_information_sec_Network_element_status.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_information_sec_Restricted_note_status.getText(), " ", "Restricted_note_status"); 
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_information_sec_Restricted_note_status.getText());break;
		
		case "Identifiers": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Device_CLLI");
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_identifier_sec_device_clli.getText(), "GFASTEGGHUN", "Device_clli");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_identifier_sec_device_clli.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_identifier_sec_device_name.getText(), "GFASTEGGHUN-T.01", "Device_name");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_identifier_sec_device_name.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_identifier_sec_device_full_name.getText(), "GFASTEGGHUN-CA316-DSLAM", "Device_full_name");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_identifier_sec_device_full_name.getText());
							//orderpage.compare_filed_values_with_expected(lbl_devicerole.getText(), "DSLAM", "Device role");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_devicerole.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_identifier_sec_alias1.getText(), " ", "Alias1");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_identifier_sec_alias1.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_identifier_sec_relay_rack_shelf.getText(), "T.01", "Relay_rack_shelf");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_identifier_sec_relay_rack_shelf.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_identifier_sec_alias2.getText(), " ", "Alias2"); 
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_identifier_sec_alias2.getText());
							break;
							
		case "Device Type": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Device_Type");
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Device_type.getText(), "Calix E3 Gfast Series", "Device_type");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Device_type.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Device_sub_type.getText(), "Calix E3-16F", "Device_sub_type");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Device_sub_type.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Device_ID.getText(), "350975", "Device_ID");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Device_ID.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Device_HECIG.getText(), " ", "Device_HECIG");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Device_HECIG.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Vendor_Name.getText(), " ", "Vendor_Name");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Vendor_Name.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Vendor_Part_Number.getText(), " ", "Part_Number");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Vendor_Part_Number.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Part_Type.getText(), " ", "Part_Type");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Part_Type.getText());
							//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_device_type_sec_Manfacturer_Part_Number.getText(), " ", "Part_Number"); 
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_device_type_sec_Manfacturer_Part_Number.getText()); break;
		
		case "IP Information": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"IPV4 mgm router id"); 
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_IPV4_mgm_router_id.getText(), " ", "IPV4_mgm_router_id");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_IPV4_mgm_router_id.getText().replaceAll("\\s",""));
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Console_1.getText(), " ", "IPV4_Console_1");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Console_1.getText());
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Console_2.getText(), " ", "IPV4_Console_2");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Console_2.getText());
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Selection.getText(), "IPV4", "IPV4_Selection");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_IPV4_Selection.getText());
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_Can_Auto_Translate.getText(), "No", "Can_Auto_Translate");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_Can_Auto_Translate.getText());
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_Shared_Flag.getText(), "Shared", "Shared_Flag");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_Shared_Flag.getText());
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_Management_VLAN.getText(), " ", "Management_VLAN");
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_Management_VLAN.getText());
								//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_ip_information_sec_Is_Diverse.getText(), "No", "Is_Diverse"); 
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_ip_information_sec_Is_Diverse.getText());break;
								
								
		case "Subscriber Information" : column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Subscriber id"); 
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_subscriber_id.getText(), "A001058", "Subscriber_id");
										
										if(lbl_serach_device_device_details_tab_subscriber_information_sec_subscriber_id.isCurrentlyEnabled()){
											slf4jLogger.info("Subscriber ID is enabled");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_subscriber_id.getText());
										} else {
											slf4jLogger.info("Not is enabled for subscriber id");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, "Fail- Subcriber ID is not enabled"+lbl_serach_device_device_details_tab_subscriber_information_sec_subscriber_id.getText());
										}
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_Type.getText(), "Internal", "Subscriber_Type");
										orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_Type.getText());
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_Name.getText(), "CTL INFRASTRUCTURE", "Subscriber_Name");
										orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_Name.getText());
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_Affiliate_Owner.getText(), "LOCAL", "Affiliate_Owner");
										orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_Affiliate_Owner.getText());
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_Location_Name.getText(), "154861", "Location_Name");
										
										if(lbl_serach_device_device_details_tab_subscriber_information_sec_Location_Name.isCurrentlyEnabled()){
											slf4jLogger.info("Location_Name is enabled");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_Location_Name.getText());
										} else {
											slf4jLogger.info("Not is enabled for Location_Name");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, "Fail- Location naem is not enabled"+lbl_serach_device_device_details_tab_subscriber_information_sec_Location_Name.getText());
										}
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText(), "WNPKFLDSLM", "MCO");
										orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText());
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_subscriber_information_sec_MEN_ID.getText(), "LAS VEGAS", "MEN_ID");
										orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_subscriber_information_sec_MEN_ID.getText()); break;
		
		case "Qualification Information": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Max Subscriber Downstream Bandwidth"); 
										//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Qualification_information_sec_max_sub_dwn_bwd.getText(), "500 MB", "Max Subscriber Downstream Bandwidth");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_Qualification_information_sec_max_sub_dwn_bwd.getText());
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Qualification_information_sec_max_sub_up_bwd.getText(), "200 MB", "Max Subscriber Upstream Bandwidth");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_Qualification_information_sec_max_sub_up_bwd.getText());
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Qualification_information_sec_1gps_inc.getText(), "Yes", "1 Gbps Indicator");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_Qualification_information_sec_1gps_inc.getText());
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText(), "Yes", "PRISM NOSA Certification"); 
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText());break;
			
		case "Topology MemberShip": JavascriptExecutor jse = (JavascriptExecutor)loginPage.getDriver();
									jse.executeScript("window.scrollBy(0,250)", "");
									column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Topology Name");
									if(lbl_serach_device_device_details_tab_Topology_sec_Topology_Name.isCurrentlyVisible()){
									//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Topology_sec_Topology_Name.getText(), " ", "Topology_Name");
									orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_Topology_sec_Topology_Name.getText());
									//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Topology_sec_Topology_Type.getText(), " ", "Topology_Type");
									orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_device_details_tab_Topology_sec_Topology_Type.getText());
									jse.executeScript("scroll(0, -250);");
										} else {
											slf4jLogger.info("No topology is present");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, "Pass- DSLAM has both GPON & Etherent role, hence no topology");
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_device_details_tab_Topology_sec_Topology_Type.getText(), " ", "Topology_Type");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, "Pass- DSLAM has both GPON & Etherent role, hence no topology");
										} break;
										
		//***************************************************** Network Tab Validations in Search Device page ************************************************//
										
		case "Network Information": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Source System");
									//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_Source_System.getText(), " ", "Source System");
									orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_Source_System.getText().replaceAll("\\s",""));
									//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_RO_Community_String.getText(), " ", "RO Community String");
									orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_RO_Community_String.getText().replaceAll("\\s",""));
									//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_Part_Type.getText(), " ", "Part Type"); 
									orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_Part_Type.getText().replaceAll("\\s","")); break;
									
									
		case "Manufacturer Information": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Chassis Serial Number");
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Chassis_Serial_Number.getText(), " ", "Chassis Serial Number");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Chassis_Serial_Number.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Serial_Number.getText(), " ", "Serial Number");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Serial_Number.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Vendor_Part_Number.getText(), " ", "Vendor Part Number");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Vendor_Part_Number.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Manufacturer_Part_Number.getText(), " ", "Manufacturer Part Number");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Manufacturer_Part_Number.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Socket_Number.getText(), " ", "Socket Number");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Socket_Number.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Hardware_Version.getText(), " ", "Hardware Version");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Hardware_Version.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Software_Version.getText(), " ", "Software Version");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Software_Version.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Management_IP_Subnet_Mask.getText(), " ", "Management IP Subnet Mask");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Management_IP_Subnet_Mask.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Revision.getText(), " ", "Revision");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Revision.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Discontinue_Date.getText(), " ", "Discontinue Date");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Discontinue_Date.getText().replaceAll("\\s",""));
											//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Manufacturer_Information_Discontinue_Reason.getText(), " ", "Discontinue Reason 	");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Manufacturer_Information_Discontinue_Reason.getText().replaceAll("\\s",""));
											break;
		
		case "Network Information Section 2": column=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"MAC Address");
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_MAC_Address.getText(), " ", "MAC Address");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_MAC_Address.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Object_ID.getText(), " ", "SNMP Object ID");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Object_ID.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText(), " ", "SNMP Port Number");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Monitoring_Type.getText(), " ", "Monitoring Type");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Monitoring_Type.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Firmware_Version.getText(), " ", "Firmware Version");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Firmware_Version.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_NMS_Type.getText(), " ", "NMS Type");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_NMS_Type.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_NMS_Host_Name.getText(), "Activate - Test/Dev", "NMS Host Name");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_NMS_Host_Name.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_NMS_Description.getText(), " ", "NMS Description");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_NMS_Description.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Network_Identifier.getText(), " ", "Network Identifier");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Network_Identifier.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Network_Name.getText(), "FAKE4TEST ", "Network Name");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Network_Name.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Can_Auto_Translate.getText(), "No", "Can Auto Translate");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Can_Auto_Translate.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Platform_ID.getText(), "CNV_LSVG", "Platform ID");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Platform_ID.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Version.getText(), " ", "SNMP Version");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Version.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Network_Node.getText(), " ", "Network Node #");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Network_Node.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Stack_Ring_Sequence.getText(), " ", "Stack Ring Sequence #");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Stack_Ring_Sequence.getText().replaceAll("\\s",""));
												//orderpage.compare_filed_values_with_expected(lbl_serach_device_network_details_tab_Network_Information_2_Stack_Ring_Shelf_Identifier.getText(), " ", "Stack Ring Shelf Identifier");
												orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", column++, lbl_serach_device_network_details_tab_Network_Information_2_Stack_Ring_Shelf_Identifier.getText().replaceAll("\\s",""));
												break;
												
	//************************************** Related Tab Device View Page **************************************************//
												
		case "Location Tab": jsClick(servicepage.btn_expandbutton_left);
									Thread.sleep(2000);
									location_related_tab_search_device_table_validations(); 
									jsClick(servicepage.btn_expandbutton_right);
									waitForElement(servicepage.btn_expandbutton_left);
									excel_Write="No";
									break;	
									
		case "Orders Tab": jsClick(servicepage.btn_expandbutton_left);
							Thread.sleep(2000);
							orders_related_tab_search_device_table_validations();
							jsClick(servicepage.btn_expandbutton_right);
							waitForElement(servicepage.btn_expandbutton_left);
							excel_Write="No";
							break;	
							
		case "Contacts Tab": jsClick(servicepage.btn_expandbutton_left);
								Thread.sleep(2000);
								contacts_related_tab_search_table_validations();
								jsClick(servicepage.btn_expandbutton_right);
								waitForElement(servicepage.btn_expandbutton_left);
								excel_Write="No";
								break;
		}
		
		//orderpage.gfast_write_data_inexcel("GFast-Sheet", "GFast_DeviceView360", 2, "Pass");
		if(excel_Write.equals("Yes")){
		orderpage.gfast_Automation_status_update("GFast-Sheet", "GFast_DeviceView360");	
		}
	} 
	}
	
	
	public void contacts_related_tab_search_table_validations() throws Throwable{
		
		String[] contact_header_column={"View","First/LastName","Category","RoleType","RolePreference"};
	
	String contact_name=null,contact_category=null,contact_role_type=null,view_validation=null,contact_role_preference=null;
	int i=1,contact_name_column=0,contact_category_colummn=0,contact_role_type_colummn=0,contact_role_preference_column=0,view_column=0;
	
	String sheetname=orderpage.search_type_sheet();
	
	int column=orderpage.search_hearder_excel(orderpage.search_type_sheet(),"Contact Related Tab");
	
	if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){			
	
	while(i!=0){
		switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
		case "First/LastName":contact_name_column=i; break;
		case "Category": contact_category_colummn=i; break;
		case "RoleType": contact_role_type_colummn=i; break;
		case "RolePreference": contact_role_preference_column=i; break;		
		case "View": view_column=i; break;
		
		}
		
		slf4jLogger.info("First/LastName="+contact_name_column+"Category="+contact_category_colummn+"RoleType="+contact_role_type_colummn+"RolePreference="+contact_role_preference_column+"View="+view_column);

		if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").equals(contact_header_column[i-1])){
			slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
		} else {
			slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
		}
		i++;
		if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span"))){
			slf4jLogger.info("Not visible");
			break;
		}
	}
	
	i=1;
	while(i!=0){
		
	slf4jLogger.info("First/LastName="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_name_column+"]/div")).getText());
	
	slf4jLogger.info("Category="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_category_colummn+"]/div")).getText());
	slf4jLogger.info("RoleType="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_role_type_colummn+"]/div")).getText());
	slf4jLogger.info("RolePreference="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_role_preference_column+"]/div")).getText());
	

	if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+view_column+"]/div")).isEnabled()){
		view_validation="Pass";
	} else {
		view_validation="Fail- View Icon is not Enabled";
	}
	if(contact_name!=null){
		contact_name+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_name_column+"]/div")).getText();
		contact_category+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_category_colummn+"]/div")).getText();
		contact_role_type+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_role_type_colummn+"]/div")).getText();		
		contact_role_preference+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_role_preference_column+"]/div")).getText();
	} else {
		contact_name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_name_column+"]/div")).getText();
		contact_category=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_category_colummn+"]/div")).getText();
		contact_role_type=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_role_type_colummn+"]/div")).getText();		
		contact_role_preference=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_role_preference_column+"]/div")).getText();
	}
	i++;
	
	if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+contact_name_column+"]/div"))){
		slf4jLogger.info("Reached last section");
		break;
	}
	}
	if(contact_name!=null){
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Pass");
		column++;column++;
		
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column,view_validation);
		column++;		
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, contact_name);
		column++;
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, contact_category);
		column++;
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, contact_role_type);
		column++;		
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column,contact_role_preference);
		column++;
	}
	
	
	} else {
		orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Fail-Contact Details are not diaplayed showing this error"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
	}
	
	orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);	
	
	}
	
	public void orders_related_tab_search_device_table_validations()  throws Throwable{
		
		String[] order_header_column={"View","MRID","OrderID","EnsembleOrderNumber","Action","Customer","Location","Status","TaskAssigned","ACNA","DueDate","WorkItem","PTD","ProductType"};
		
		int i=1,order_id_column=0,action_column=0,customer_column=0,status_column=0,due_date_column=0,view_column=0,EnsembleOrderNumber_column=0,Location_column=0,TaskAssigned_column=0,ACNA_column=0,WorkItem_column=0,MRID_column=0,PTD_column=0,ProductType_column=0;
		
		String csof_id=null,action=null,duedate=null,orderstatus=null,customername=null,viewiconval=null;;
		
		String sheetname=orderpage.search_type_sheet();
		
		int column=orderpage.search_hearder_excel(orderpage.search_type_sheet(),"Order Related Tab");
		
		if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){		
		
		// ************************************************* Check if the Order Tab is present ****************************************************************************//
		if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
			
			
			String device_tab=loginPage.getDriver().findElement(By.xpath(".//*[@class='ng-isolate-scope active']//*[@draggable='true']//tab-heading")).getText().replaceAll("\\s","");
			slf4jLogger.info("Device Tab name:"+device_tab);
			
			jsClick(orderpage.btn_order_tab_search_view_page);
			
			waitForElement(orderpage.btn_dispatch);
			csof_id=orderpage.lbl_vieworderpage_csof_order_no.getText().replaceAll("\\s","");
			action=orderpage.lbl_vieworderpage_action.getText().replaceAll("\\s","");
			duedate=orderpage.lbl_vieworderpage_due_date.getText().replaceAll("\\s","");
			orderstatus=orderpage.lbl_vieworderpage_order_status.getText().replaceAll("\\s","");
			customername=orderpage.lbl_vieworderpage_cust_sec_subscriber.getText().replaceAll("\\s","");
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				slf4jLogger.info("Header value matching");
			}
			
			slf4jLogger.info("csof_id="+csof_id+"action="+action+"duedate="+duedate+"orderstatus="+orderstatus+"customername="+customername);
			
			jsClick(loginPage.getDriver().findElement(By.xpath(".//*[@class='ng-isolate-scope']//tab-heading[contains(text(),'"+device_tab+"')]")));
			waitForElement(servicepage.btn_expandbutton_right);
			
		}
		
		//*************************************************  Continuing with order values validation *******************************************************************//
		//*************************************************  Finding the column header positons *******************************************************************//
		
		/*orderpage.btn_related_tab_refresh_icon);
		waitForElement(orderpage.btn_related_tab_excel_icon);*/
		while(i!=0){
			switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
			case "View":view_column=i; break;
			case "OrderID":order_id_column=i; break;
			case "Customer": customer_column=i; break;
			case "Action": action_column=i; break;
			case "Status": status_column=i; break;	
			case "DueDate": due_date_column=i; break;	
			case "EnsembleOrderNumber":EnsembleOrderNumber_column=i; break;
			case "Location":Location_column=i; break;
			case "TaskAssigned": TaskAssigned_column=i; break;
			case "ACNA":ACNA_column=i; break;
			case "WorkItem":WorkItem_column=i; break;
			case "MRID":MRID_column=i; break;
			case "PTD":PTD_column=i; break;
			case "ProductType":ProductType_column=i; break;
			}
			
			
			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").equals(order_header_column[i-1])){
				slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
			} else {
				slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
			}
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span"))){
				slf4jLogger.info("Not visible");
				break;
			}
			
		}
		slf4jLogger.info("OrderID="+order_id_column+"Customer="+customer_column+"Action="+action_column+"Status="+status_column+"DueDate"+due_date_column);
		slf4jLogger.info("Done with Header search");
		//*************************************************  Finding Order positons *******************************************************************//
		i=1;
		
		while(i!=0){
			slf4jLogger.info("i positon="+i+" :Order:"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+order_id_column+"]/div")).getText().replaceAll("\\s",""));
			slf4jLogger.info("Order in Excel:"+orderpage.gfast_order_id_search().replaceAll("\\s",""));
			
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+order_id_column+"]/div")).getText().replaceAll("\\s","").equals(csof_id)){
				slf4jLogger.info("Order matched in row="+i+"= for order"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+order_id_column+"]/div")).getText().replaceAll("\\s",""));
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+view_column+"]/div")).isEnabled()){
					viewiconval="Pass";
				}
				
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+customer_column+"]/div")).getText().replaceAll("\\s","").equals(customername)){
					slf4jLogger.info("customer matched in row="+i+"= for customer"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+customer_column+"]/div")).getText().replaceAll("\\s",""));
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+status_column+"]/div")).getText().replaceAll("\\s","").equals(orderstatus)){
					slf4jLogger.info("status matched in row="+i+"= for status"+loginPage.getDriver().findElement(By.xpath(".//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+status_column+"]/div")).getText().replaceAll("\\s",""));
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+due_date_column+"]/div")).getText().replaceAll("\\s","").equals(duedate)){
					slf4jLogger.info("due_date matched in row="+i+"= for due_date"+loginPage.getDriver().findElement(By.xpath(".//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+due_date_column+"]/div")).getText().replaceAll("\\s",""));
				}
				
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")){
				case "N": if(action.equals("ADD")){
							slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")+"Matched Action Type");
							
							} else {
								slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")+"Didnt Match Action Type ");	
							}
							break;
							
				case "C": if(action.equals("CHANGE")){
								slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")+"Matched Action Type");
								
							} else {
								slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")+"Didnt Match Action Type ");	
							}
							break;		
				case "D": if(action.equals("REMOVE")){
									slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")+"Matched Action Type");
									
								} else {
									slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText().replaceAll("\\s","")+"Didnt Match Action Type ");	
								}
								break;				
				}
				
				break;
				
			}
			
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+order_id_column+"]/div"))){
				slf4jLogger.info("Not visible");
				i--;
				break;
			}
			
			
		}
		
		if(viewiconval!=null){
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Pass");
			column++;column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Pass");
			column++;
			
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+MRID_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+order_id_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+EnsembleOrderNumber_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+action_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+customer_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Location_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+status_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+TaskAssigned_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ACNA_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+due_date_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+WorkItem_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+PTD_column+"]/div")).getText());
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-controller='orderSearchCtrl']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ProductType_column+"]/div")).getText());
		} else {
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Fail");
			column++;column++;column++;column++;column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Fail");
		}
		} else {
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Fail-Location Details are not diaplayed showing this error"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
		}
		orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);	
	}
	
	public void location_related_tab_search_device_table_validations() throws Throwable{
		
		String[] locn_header_column={"View","LocationFullName","LocationName","Address1","Address2","City","State","Zip"};
		
		String locn_name=null,addrs1=null,addrs2=null,city=null,state=null,zip=null,view_validation=null,LocationFullName=null;
		int i=1,locn_name_column=0,addrs_colummn1=0,addrs_colummn2=0,city_column=0,state_column=0,zip_column=0,view_column=0,LocationFullName_column=0;
		
		String sheetname=orderpage.search_type_sheet();
		
		int column=orderpage.search_hearder_excel(orderpage.search_type_sheet(),"Locations Related Tab");
		
		if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){			
		
		while(i!=0){
			switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
			case "LocationName":locn_name_column=i; break;
			case "Address1": addrs_colummn1=i; break;
			case "Address2": addrs_colummn2=i; break;
			case "City": city_column=i; break;
			case "State": state_column=i; break;	
			case "Zip": zip_column=i; break;	
			case "View": view_column=i; break;
			case "LocationFullName":LocationFullName_column=i; break;
			}
			
			slf4jLogger.info("locn_name_column="+locn_name_column+"addrs_colummn="+addrs_colummn1+"addrs_colummn="+addrs_colummn2+"city_column="+city_column+"state_column="+state_column+"zip_column"+zip_column);
	
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").equals(locn_header_column[i-1])){
				slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
			} else {
				slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
			}
			i++;
			if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span"))){
				slf4jLogger.info("Not visible");
				break;
			}
		}
		
		i=1;
		while(i!=0){
			
		slf4jLogger.info("Location Name="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+locn_name_column+"]/div")).getText());
		
		slf4jLogger.info("Address 1="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div[1]/div["+addrs_colummn1+"]/div")).getText());
		slf4jLogger.info("Address 1="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div[1]/div["+addrs_colummn2+"]/div")).getText());
		slf4jLogger.info("City="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div[1]/div["+city_column+"]/div")).getText());
		slf4jLogger.info("State="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div[1]/div["+state_column+"]/div")).getText());
		slf4jLogger.info("ZIP="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div[1]/div["+zip_column+"]/div")).getText());
	
		if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div[1]/div["+view_column+"]/div")).isEnabled()){
			view_validation="Pass";
		}
		if(locn_name!=null){
			locn_name+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+locn_name_column+"]/div")).getText();
			addrs1+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+addrs_colummn1+"]/div")).getText();
			addrs2+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+addrs_colummn2+"]/div")).getText();
			city+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+city_column+"]/div")).getText();
			state+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+state_column+"]/div")).getText();
			zip+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+zip_column+"]/div")).getText();
			LocationFullName+=":"+"\n"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+LocationFullName_column+"]/div")).getText();
		} else {
			locn_name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+locn_name_column+"]/div")).getText();
			addrs1=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+addrs_colummn1+"]/div")).getText();
			addrs2=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+addrs_colummn2+"]/div")).getText();
			city=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+city_column+"]/div")).getText();
			state=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+state_column+"]/div")).getText();
			zip=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+zip_column+"]/div")).getText();
			LocationFullName=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+LocationFullName_column+"]/div")).getText();
		}
		i++;
		
		if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@ng-hide='errorMessageForServiceLocations']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+locn_name_column+"]/div"))){
			slf4jLogger.info("Reached last section");
			break;
		}
		}
		if(locn_name!=null){
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Pass");
			column++;column++;
			
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column,view_validation);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column,LocationFullName);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, locn_name);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, addrs1);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, addrs2);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, city);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, state);
			column++;
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, zip);
					
		}
		
		
		} else {
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Fail-Location Details are not diaplayed showing this error"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
		}
		
		orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);	
		
	}
	
	
	public void device_serach_page_network_tab_icon() throws Throwable{
		if(btn_serach_device_network_details_tab_edit_device_details.isCurrentlyVisible() && btn_serach_device_network_details_tab_edit_device_details.isCurrentlyEnabled()){
			slf4jLogger.info("Edit button in enabled");			
		} else {
			slf4jLogger.info("Edit button not enabled");
		}
		
		if(btn_serach_device_network_details_tab_refresh_icon.isCurrentlyVisible() && btn_serach_device_network_details_tab_refresh_icon.isCurrentlyEnabled()){
			slf4jLogger.info("Refresh button in enabled");			
		} else {
			slf4jLogger.info("Refresh button not enabled");
		}
	}
	
	public void search_Device_section_audit_logs_button(String Auditlog_btn) throws Throwable{
		switch(Auditlog_btn){
		
		case "ARM Audit Logs":jsClick(tab_serach_device_audit_log_arm_audit_log);
								waitForElement(btn_serach_device_Audit_log_tab_getlog);break;
								
		case "OMNIVUE Audit Logs": jsClick(tab_serach_device_audit_log_omnivue_audit_log);
									Thread.sleep(2500);
								waitForElement(btn_serach_device_audit_log_arm_omnivue_log_print);break;
		}
	}
	
	public void device_viewpage_auditlog_armlog_getlog() throws Throwable{
		jsClick(btn_serach_device_Audit_log_tab_getlog);
		waitForElement(btn_serach_device_audit_log_arm_arm_log_excel);
	}
	
	public void device_viewpage_auditlog_armlog_icons_validation() throws Throwable{
		if(btn_serach_device_audit_log_arm_arm_log_excel.isCurrentlyVisible() && btn_serach_device_audit_log_arm_arm_log_excel.isCurrentlyEnabled()){
			slf4jLogger.info("Excel icon is enabled in ARM audit log");
		} else {
			slf4jLogger.info("Excel icon is not enabled in ARM audit log");
		}
		
		if(btn_serach_device_audit_log_arm_arm_log_print.isCurrentlyVisible() && btn_serach_device_audit_log_arm_arm_log_print.isCurrentlyEnabled()){
			slf4jLogger.info("Print icon is enabled in ARM audit log");
		} else {
			slf4jLogger.info("Print icon is not enabled in ARM audit log");
		}
	}
	
	public void device_viewpage_auditlog_armlog_table_displayed(String Auditlog) throws Throwable{
		int colum_header=0;
		String sheetname=null;String header_search=null; String validation_status=null;
		String[] armtable={"Date","CUID","Description","Impacted Orders"};
		String[] omnivuetable={"Action Type","Details","User Name","Event Date"};
		switch(Auditlog){
		case "ARM Audit Logs": for(int i=1;i<=4;i++){
								if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='invAuditLogCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().contains(armtable[i-1])){
									slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='invAuditLogCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText()+"=Displayed correctly");
									validation_status="Pass";
								} else {
									slf4jLogger.info("Not correct format="+i);
									slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='invAuditLogCtrl']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText()+"= Not Displayed correctly");
									validation_status="Fail-No ARM Audit logs is getting displayed";
								} header_search="ARM Audit Log Validation";
								}break;
								
		case "Omnivue Audit Logs": for(int i=1;i<=4;i++){
									if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().contains(omnivuetable[i-1])){
										slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText()+"=Displayed correctly");
										validation_status="Pass";									
									} else {
										slf4jLogger.info("Not correct format="+i);
										slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText());
										if(btn_serach_device_Omnivue_Audit_log_tab_getlog.isCurrentlyVisible()){
											validation_status="Pass";
										} else {
											validation_status="Fail-No Omnivue Audit logs is getting displayed";
										}
										
									} header_search="Omnivue Audit Log Validation";
									}break;
		}
		if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
		if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			if(loginPage.getDriver().findElement(By.xpath(".//*[@class='ng-isolate-scope active']//*[@draggable='true']//tab-heading")).getText().replaceAll("\\s","").contains("-HSI")){
				sheetname="GFast_ServiceView360";
			} else {
				sheetname="GFast_DeviceView360";
			}
			colum_header=orderpage.search_hearder_excel(sheetname,header_search);
			
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, colum_header, validation_status);
			orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);
		}
		}
	}
	
	public void device_viewpage_auditlog_omnivuelog_icon() throws Throwable{
		
		if(btn_serach_device_audit_log_arm_omnivue_log_print.isCurrentlyVisible() && btn_serach_device_audit_log_arm_omnivue_log_print.isCurrentlyEnabled()){
			slf4jLogger.info("Print icon is enabled in Omnivue audit log");
		} else {
			slf4jLogger.info("Print icon is not enabled in Omnivue audit log");
		}
		
		if(btn_serach_device_audit_log_arm_omnivue_log_excel.isCurrentlyVisible() && btn_serach_device_audit_log_arm_omnivue_log_excel.isCurrentlyEnabled()){
			slf4jLogger.info("Excel icon is enabled in Omnivue audit log");
		} else {
			slf4jLogger.info("Excel icon is not enabled in Omnivue audit log");
		}
		
		if(btn_serach_device_audit_log_arm_omnivue_log_refresh.isCurrentlyVisible() && btn_serach_device_audit_log_arm_omnivue_log_refresh.isCurrentlyEnabled()){
			slf4jLogger.info("Refresh icon is enabled in Omnivue audit log");
		} else {
			slf4jLogger.info("Refresh icon is not enabled in Omnivue audit log");
		}
	}
	
	public void keyboard_action_down(int count) throws AWTException{
		Robot robot = new Robot();
				while(count!=0){
		          robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
					
					robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
								
					robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
					
					count--;
				}
	}
	
	public String device_advancesearch_searchslider(String searchwith)throws Throwable{
		
		String validationvalue=null;
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
		
		if(searchwith.equals("Device Name")){
			validationvalue="Name";
		}
		
		if(tab_Device_advance_search_result.isCurrentlyVisible()){
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
		throw new Error("Device Advance Search page is not visible");
	}
	
	return validationvalue;		
	}

	public void tabname_validations() throws Throwable{
		waitForElement(devcreatepage.btn_Edit);
		
		String Devicename=searchcircuit.tab_search_result_details.getText().replaceAll("\\s","");
		
		if(lbl_deviceName.getText().replaceAll("\\s","").contains(Devicename)){
			slf4jLogger.info("Device Tab Name is matching with the Device Text field");
		} else throw new Error("Device name is not matching with Tab name");
		
		
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) throws TimeoutException,Throwable{
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),600);	
	    try {
	    	/* WebElement element =*/ wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
	 		
	 	   // return element ;
	    }
	    catch (TimeoutException e) {
	    	Thread.sleep(2000);
	    	/*if(orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
	    		if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
	    			orderpage.failure_icon_validation();
	    		}
	    		  throw new Error("No data displayed, getting message as "+e+":"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
	    	} else {
	    		if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
	    			orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- Devices are neither displayed nor any message");
	    			
	    		}
	    		throw new Error("Fail- Information are neither displayed nor any message");	
	    	}*/
	    	
	    	 
	      
	}
		return elementToBeLoaded;
	}
	
	//**************************  US33620 - TC18903  Changes 28/7/17  *********************************//
	
	public void search_service_resultpage(String ServiceName) throws Throwable {
		waitForElement(lbl_Servicetype_search_icon);
		
		int i=1;
		while(i!=0){
			
			jsClick(tab_service_advance_search_result);
			waitForElement(actvtnpage.btn_view);
			
			jsClick(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+(i-1)+"jqxGrid')]/div[1]/div/input")));
			Thread.sleep(2000);
			
			
			waitForElement(devcreatepage.btn_Edit);
			
		if(!ServiceName.equals("DSL OVC with no CTAG Associated")){
			
			jsClick(tab_Devices);
			Thread.sleep(5000);
			waitForElement(orderpage.lbl_vieworderpage_related_tab_active_device_name_hyperlink);
			
			 if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			if(orderpage.lbl_vieworderpage_related_tab_active_device_name_hyperlink.isCurrentlyVisible()){
				jsClick(orderpage.lbl_vieworderpage_related_tab_active_device_name_hyperlink);
				Thread.sleep(2000);
				waitForElement(devcreatepage.btn_Edit);
				break;
			}
			
			 }
		} else {
			
			jsClick(tab_ctag);
			Thread.sleep(5000);
			waitForElement(btn_RT_Ctag_Save);
			
			if(lbl_RT_ctag_errormsg.isCurrentlyVisible()){
				break;
			}
		}
			
			/*if(ServiceName.equals("DSL OVC")){
				
				if(lbl_Servicevalue_search_icon.equals(ServiceName)){
					
					
					
				}
			}
			*/
			/*
			if(lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
				lbl_vieworderpage_HSI_Service_sec_Service_Id);
				break;
			}
			slf4jLogger.info("Didnt find the link");*/
			i++;
		}
		
		
	}
	
	public void Device_search_Sanity_validation() throws Throwable {
		
		slf4jLogger.info("Left Side validation");
		
		tabname_validations();
		
		//################################ Tabs validations in Device view ############################################//
		   			
			if(!tab_serach_device_Device_details.isCurrentlyVisible() && !tab_serach_device_Device_details.isCurrentlyEnabled()){
				throw new Error("Device Details Tab is missing in the Device view page");
			}
			
			if(!tab_serach_device_Networking_details.isCurrentlyVisible() && !tab_serach_device_Networking_details.isCurrentlyEnabled()){
				throw new Error("Network Details Tab is missing in the Device view page");
			}
			
			if(!tab_serach_device_Audit_logs.isCurrentlyVisible() && !tab_serach_device_Audit_logs.isCurrentlyEnabled() ){
				throw new Error("Audit Logs Tab is missing in the Device view page");
			}
			
			if(!tab_serach_device_Transport_details.isCurrentlyVisible() && !tab_serach_device_Transport_details.isCurrentlyEnabled() ){
				throw new Error("Transport Details tab is missing in the Device view page");
			}
		
			
		//################################ Buttons validations in Device view ############################################//
			
		if(!devcreatepage.btn_Edit.isCurrentlyVisible() && !devcreatepage.btn_Edit.isCurrentlyEnabled()){
			throw new Error("Edit button is missing in the Device view page");
		}
		
		if(!btn_Revert_button.isCurrentlyVisible() && !btn_Revert_button.isCurrentlyEnabled()){
			throw new Error("Revert button is missing in the Device view page");
		}
		
		if(!btn_Refresh_button.isCurrentlyVisible() && !btn_Refresh_button.isCurrentlyEnabled() ){
			throw new Error("Refresh button is missing in the Device view page");
		}
				
		if(btn_deletebutton.isCurrentlyVisible()){
			delebuttonvalidation("Delete");
		}
		
		slf4jLogger.info("Right Side validation");
		
		//################################ Related Tabs Validations in Device view ############################################//
			  
				
		if(!tab_services.isCurrentlyVisible() && !tab_services.isCurrentlyEnabled()){
			throw new Error("Services Related Tab is missing in the Device view page");
		}
		
		if(!tab_Activations.isCurrentlyVisible() && !tab_Activations.isCurrentlyEnabled()){
			throw new Error("Activation Related Tab is missing in the Device view page");
		}
		
		if(!tab_orders.isCurrentlyVisible() && !tab_orders.isCurrentlyEnabled() ){
			throw new Error("Orders Related Tab is missing in the Device view page");
		}
		
		if(!tab_bamreport.isCurrentlyVisible() && !tab_bamreport.isCurrentlyEnabled() ){
			throw new Error("BAM Report Related tab is missing in the Device view page");
		}
		
		if(!tab_Circuits.isCurrentlyVisible() && !tab_Circuits.isCurrentlyEnabled()){
			throw new Error("Circuit Related Tab is missing in the Device view page");
		}
		
		if(!tab_contact.isCurrentlyVisible() && !tab_contact.isCurrentlyEnabled()){
			throw new Error("Contact Related Tab is missing in the Device view page");
		}
		
		if(!tab_Device_ports.isCurrentlyVisible() && !tab_Device_ports.isCurrentlyEnabled() ){
			throw new Error("Audit Logs Tab is missing in the Device view page");
		}
		
		if(!tab_Locations.isCurrentlyVisible() && !tab_Locations.isCurrentlyEnabled() ){
			throw new Error("Location Related tab is missing in the Device view page");
		}
		
		if(!tab_Subscriber.isCurrentlyVisible() && !tab_Subscriber.isCurrentlyEnabled()){
			throw new Error("Subscriber Related Tab is missing in the Device view page");
		}
		
		if(!tab_Tasks.isCurrentlyVisible() && !tab_Tasks.isCurrentlyEnabled()){
			throw new Error("Task Related Tab is missing in the Device view page");
		}
		
		if(!tab_Vectoringinfo.isCurrentlyVisible() && !tab_Vectoringinfo.isCurrentlyEnabled()){
			throw new Error("Vectoring Info Related Tab is missing in the Device view page");
		}
		
		
		
		//################################ Related Tabs should not be displayed Device view ############################################//
		
		if(tab_ctag.isCurrentlyVisible() && tab_ctag.isCurrentlyEnabled() ){
			throw new Error("CTAG Related Tab is Displayed in the Device view page");
		}		
		
		if(tab_Devices.isCurrentlyVisible() && tab_Devices.isCurrentlyEnabled() ){
			throw new Error("Devices Related Tab is Displayed in the Device view page");
		}
		
		if(tab_TIRKS.isCurrentlyVisible() && tab_TIRKS.isCurrentlyEnabled() ){
			throw new Error("TIRKS Related Tab is Displayed in the Device view page");
		}
		
		if(tab_Performance.isCurrentlyVisible() && tab_Performance.isCurrentlyEnabled() ){
			throw new Error("Performance Related Tab is Displayed in the Device view page");
		}
		
		if(tab_Virtual_Ports.isCurrentlyVisible() && tab_Virtual_Ports.isCurrentlyEnabled() ){
			throw new Error("Virtual VLAN Ports Related Tab is Displayed in the Device view page");
		}
		
		
		waitForElement(devcreatepage.btn_Edit); 
        jsClick(devcreatepage.btn_Edit);
        waitForElement(ddl_devicepage_edit_provisionstatus);
        ddl_devicepage_edit_provisionstatus.selectByIndex(2); 
        
        if(ddl_devicepage_edit_aerialrburied.isCurrentlyVisible()){
        ddl_devicepage_edit_aerialrburied.selectByIndex(1);
        }
		
	}
	
	//################################ Validate_FROM_Archie_DeviceAuditlog  TC189906 ############################################//
	
	public void Validate_FROM_Archie_DeviceAuditlog(){
		 
		if(tab_serach_device_audit_log_arm_audit_log_Active.isCurrentlyVisible()){
			if(!cbx_serach_device_ARM_Audit_log_FromArchive.isCurrentlyVisible()){
				throw new Error("From Archive button is not displayed in the ARM Audit logs tab in Device view page");
			}
		} else if(tab_serach_device_audit_log_omnivue_audit_log_Active.isCurrentlyVisible()){
			if(!cbx_serach_device_Omnivue_Audit_log_tab_FromArchive.isCurrentlyVisible()){
				throw new Error("From Archive button is not displayed in the Omnivue Audit logs tab in Device view page");
			}
		}
		slf4jLogger.info("Able to see From Archive check box in Audit logs tab");
	}
	
	
	public void Validate_FROM_Archie_Auditlog() {
		if(tab_serach_device_audit_log_arm_audit_log_Active.isCurrentlyVisible()){
			jsClick(cbx_serach_device_ARM_Audit_log_FromArchive);
			jsClick(btn_serach_device_Audit_log_tab_getlog);
			waitForinvisibleElement(lbl_serach_device_Audit_log_tab_getlog_loader.getText());
		} else if(tab_serach_device_audit_log_omnivue_audit_log_Active.isCurrentlyVisible()){
			
			jsClick(cbx_serach_device_Omnivue_Audit_log_tab_FromArchive);
			jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);
			waitForinvisibleElement(lbl_serach_device_Omnivue_Audit_log_tab_getlog_loader.getText());
		}
	}
	
	public void Validate_Auditlog_witharchieve() {
		if(!lbl_serach_device_Audit_log_tab_errormsg.isCurrentlyVisible()){
			slf4jLogger.info("Able to see logs");
		} else {
			slf4jLogger.info("Check ARM DB whether the"+searchcircuit.tab_search_result_details.getText().trim()+"device has logs");
		}
	}
	
	//########################################################################################################################//
	
	public Boolean waitForinvisibleElement(String text) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
	    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    Boolean element2 = wait.until(ExpectedConditions.invisibilityOfElementLocated((By.partialLinkText(text))));
	    
		
	    return element2;
	}
	
	public WebElement waitForElementclickable(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
	    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	    
		
	    return element;
	}
	
	public Boolean waitForinvisibleElement(By elementToBeinvisible) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
	    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    Boolean element1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(elementToBeinvisible));
	    return element1;
	}
	
	//############################ TC223190 - 9/5/2017 #######################################//
	
	public void device_role_change(String arg) throws Throwable{
		switch(arg){
		case"Device role to GPON in Network section": ddl_Edit_device_device_details_identifier_networkrole.selectByVisibleText("OLT"); break;
		case "Installation date & Opti tap field in Device screen":  break;
		case "Installation date & Opti tap field is updated in Device screen":  break;
		case "MCO attribute is having New option as NOT_REQUIRED": ddl_Edit_device_device_details_MCO.selectByVisibleText("NOT_REQUIRED"); break;
		case "select MCO field with --Select-- value":ddl_Edit_device_device_details_MCO.selectByVisibleText("--Select--");break;
		case "MCO field is updated with null value & also verify in DB": if(!lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim().isEmpty()){
																			throw new Error("MCO field is wrongly updated:"+lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim());
																			} break;
		case "select Affiliate Owner field with --Select-- value": ddl_Edit_device_device_details_affliateowner.selectByVisibleText("--Select--"); break;
		case "Affiliate Owner field is updated with null value & also verify in DB": if(!lbl_serach_device_device_details_tab_subscriber_information_sec_Affiliate_Owner.getText().isEmpty()){
																					throw new Error("MCO field is wrongly updated"+lbl_serach_device_device_details_tab_subscriber_information_sec_Affiliate_Owner.getText().trim());
																					} break;
		}	
	}
	//########################################################################################################################//
	@Step
	public void fieldvalidations(String value) throws Throwable{
		
		//------------------------------  Is-Diverse Check  ---------------------------------------------//
		slf4jLogger.info("XML Value="+value);
		if(lbl_serach_device_device_details_tab_ip_information_sec_Is_Diverse.getText().trim().equals(value)){
			slf4jLogger.info("Is-Diverse Field is updated as per the input");
		}else throw new Error("Is-Diverse field is not wrongly updated as "+lbl_serach_device_device_details_tab_ip_information_sec_Is_Diverse.getText().trim());
	}
	
	@Step
	public void select_row_option(String rows) throws Throwable{
		//enduser.browser_zoom_in();
		JavascriptExecutor jse = (JavascriptExecutor)loginPage.getDriver();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)", "");
		btn_device_row_option.click();
		switch(rows){
		case "100":
			lbl_device_row_option_100.click();
			break;
		case "500":
			if(lbl_device_row_option_500.isDisplayed()){
			lbl_device_row_option_500.click();
			break;
			} else throw new Error("500 Records are not avaliable");
		}
	}
	@SuppressWarnings("unused")
	@Step
	public void verify_validation(String changes) throws Throwable{ try {
		String Message;int i=0,j=0; int count=0;String[] support = new String[20];
		List<WebElement> deivceattributetocompare = null;
		List<WebElementFacade> deivce_attribute = null;
		ArrayList<String> deivce_Fieldattributelist=new ArrayList<String>();
		ArrayList<String> List2compare_deivce_Fieldattributelist=new ArrayList<String>();
		String value;
		String str_device_name;
		List<String> deivce_details_db_attributes;
		
		switch(changes){
		case "1st page 100 device list with 2nd page device list":		
			String firstdevicename1_100 = lbl_first_devicename_list.getText();
			System.out.println("1st page first dvice name = "+firstdevicename1_100);
			waitForinvisibleElement(By.xpath("//div[@ng-show='service_inventory_loader && !isWidget']"));
			for(int x=0; x<=100; x++){
				btn_down_arrow.click();
				}
			String lastdevicename1 = lbl_last_devicename_list.getText();
			System.out.println("1st page last dvice name = "+lastdevicename1);
			btn_next_device_list.click();
			waitForinvisibleElement(By.xpath("//div[@ng-show='service_inventory_loader && !isWidget']"));
			Thread.sleep(4000);
			String firstdevicename2_100 = lbl_first_devicename_list.getText();
			System.out.println("2nd page first dvice name = "+firstdevicename2_100);
			for(int x=0; x<=100; x++){
				btn_down_arrow.click();
				}
			String lastdevicename2 = lbl_last_devicename_list.getText();
			System.out.println("2nd page last dvice name = "+lastdevicename2);
			if(firstdevicename1_100.equals(firstdevicename2_100)){
			System.out.println("1st page device is displaying in 2nd page");
			} else {
			System.out.println("1st and 2nd page devices are not same");
			}
			break; 
		case "1st page 500 device list with 2nd page device list":		
			//String firstdevicename1 = lbl_first_devicename_list.getText();
			System.out.println("1st page first dvice name = "+lbl_first_devicename_list.getText());
			//Thread.sleep(8000);
			//waitforisnotdisplayelement(img_loader_devicelist);
			waitForinvisibleElement(By.xpath("//div[@ng-show='service_inventory_loader && !isWidget']"));
			btn_next_device_list.click();
			//Thread.sleep(8000);
			//waitforisnotdisplayelement(img_loader_devicelist);
			waitForinvisibleElement(By.xpath("//div[@ng-show='service_inventory_loader && !isWidget']"));
			Thread.sleep(8000);
			String firstdevicename2 = lbl_first_devicename_list.getText();
			System.out.println("2nd page first dvice name = "+firstdevicename2);
			if(lbl_first_devicename_list.getText().equals(firstdevicename2)){
			System.out.println("1st page device is displaying in 2nd page");
			} else {
			System.out.println("1st and 2nd page devices are not same");
			}
			break; 
		  
		case "OMNIVue Audit logs in both OV and Database":	
			Thread.sleep(4000);
			String Devicename = lbl_deviceName.getText().trim();
			Thread.sleep(2500);
			jsClick(tab_serach_device_Audit_logs);
			waitForElement(tab_serach_device_audit_log_omnivue_audit_log);
			jsClick(tab_serach_device_audit_log_omnivue_audit_log);
			Thread.sleep(2500);
			List<String> OV_auditlogs_list = new ArrayList<String>();
			for(int k=1; k<=2;k++){
				OV_auditlogs_list.add(loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[@ng-if='auditGrid']//div[contains(@id,'contenttablejqxGrid')]//div[contains(@id,'row1jqxGrid')]/div["+k+"]/div")).getText());		
			}
			System.out.println(OV_auditlogs_list);
				List<String> omnivue_db_logs = OmnivueDB.device_auditlogs(Devicename);
				System.out.println(omnivue_db_logs);
				
				for(int p=0; p<=OV_auditlogs_list.size()-1; p++){
					for(int q=0; q<=OV_auditlogs_list.size()-1; q++){
						if(OV_auditlogs_list.get(p).equalsIgnoreCase(omnivue_db_logs.get(q))){
							System.out.println(OV_auditlogs_list.get(p)+" value is avaliable in Database");
						}
					}
				}		
			break;
		case "change the location details in device edit screen":
					waitForElement(btn_device_edit_save); Thread.sleep(2000);			
					
					jsClick(btn_devicepage_edit_locnLookup);Thread.sleep(2000);	
					
					waitForElement(btn_devicepage_edit_locnLookup_searchlookupicon) ;
					
					tbx_devicepage_edit_locnLookup_address.type("123");
					
					ddl_devicepage_edit_locnLookup_state.selectByVisibleText("FL-Florida");			
					
					jsClick(btn_devicepage_edit_locnLookup_searchlookupicon);			
					waitForElement(lbl_devicepage_edit_locnLookup_result);
					jsClick(lbl_devicepage_edit_locnLookup_result);
					
					
					break;
	       case "changed the role from GPON to Ethernet in device page":                     
               waitForElement(btn_device_edit_save); Thread.sleep(2000);                         
               ddl_serach_editdevice_devicerole.selectByVisibleText("NID");
         //     verify_validation("update Max Down Speed & Max Up Speed on the device");
               tbx_devicepage_edit_subscriberlookupfield.type("TEST - JANET");
               waitForElement(lbl_devicepage_edit_subscriberlookupfield);
               jsClick(lbl_devicepage_edit_subscriberlookupfield);
               tbx_devicepage_edit_otherdev_maxdwnspd.type("45");
               ddl_Edit_device_device_details_affliateowner.selectByVisibleText("LOCAL");
               break;

				
		case "search for the FDP device & associate the device to the FDH device in inventory":
			//waitForElement(btn_deviceportRT_shelfexpand_add_containeddevice_searchdevice);
			
			if(tab_GDB.isCurrentlyVisible()){
				
				jsClick(tab_GDB);Thread.sleep(2000);
				waitForElement(btn_gpon_FDP_box);
				jsClick(btn_gpon_FDP_box);Thread.sleep(2000);
				
				Message=lbl_oltdeviceGDB.getText().trim();
				
				jsClick(btn_gpon_FDH_box);Thread.sleep(2000);
				
				jsClick(tab_activescreen_forwardsibling);
				waitForElement(btn_device_Editbtn);
				click_Editbtn("Device port2 Expand");
				click_Editbtn("Add Contained Devices");
				
				
				waitForElement(tbx_deviceportRT_shelfexpand_add_containeddevice_devicename);
				tbx_deviceportRT_shelfexpand_add_containeddevice_devicename.type(Message);
				
				
			}else {
				ddl_deviceportRT_shelfexpand_add_containeddevice_devicetype.selectByVisibleText("GENERIC FDP");
				
				ddl_deviceportRT_shelfexpand_add_containeddevice_subdevicetype.selectByVisibleText("144-PORT FDP");
			}
			
		
			jsClick(btn_deviceportRT_shelfexpand_add_containeddevice_searchdevice);Thread.sleep(2000);
			waitForElement(cbx_deviceportRT_shelfexpand_add_containeddevice_searchdevice_result);
			jsClick(cbx_deviceportRT_shelfexpand_add_containeddevice_searchdevice_result);Thread.sleep(2000);			
			jsClick(btn_deviceportRT_shelfexpand_add_containeddevice_searchdevice_associate);Thread.sleep(2000);	
			waitForElement(lbl_deviceportRT_shelfexpand_add_containeddevice_afterassociation);Thread.sleep(2000);
			waitForElement(btn_deviceportRT_shelfexpand_add_containeddevice_removeassociateddevice);
			break;
			
		case "Installation Date and Opti Tap field on Device Details screen for ONT Devices":
			waitForElement(btn_device_Editbtn); Thread.sleep(2000);
			
			if(!lbl_serach_device_device_details_tab_subscriber_information_sec_optitap.isCurrentlyVisible()){
				slf4jLogger.debug("Opti Tap field is not displayed on Device Details screen for ONT Devices");
				throw new Error("Opti Tap field is not displayed on Device Details screen for ONT Devices");
			}
			
			if(!lbl_serach_device_device_details_tab_subscriber_information_sec_installationdate.isCurrentlyVisible() ){
				slf4jLogger.debug("Installation Date field is not displayed on Device Details screen for ONT Devices");
				throw new Error("Installation Date field is not displayed on Device Details screen for ONT Devices");
			}			
			break;
			
		case "Installation Date and Opti Tap field on Edit Device Details screen for ONT Devices":
			waitForElement(btn_device_edit_save);			Thread.sleep(2000);
			
			if(!tbx_devicepage_edit_optitap.isCurrentlyVisible() && !tbx_devicepage_edit_optitap.isCurrentlyEnabled()){
				slf4jLogger.debug("Opti Tap field is not displayed on Edit Device Details screen for ONT Devices");
				throw new Error("Opti Tap field is not displayed on Edit Device Details screen for ONT Devices");
			}
			
			if(!tbx_devicepage_edit_installdate.isCurrentlyVisible() && !tbx_devicepage_edit_installdate.isCurrentlyEnabled()){
				slf4jLogger.debug("Installation Date field is not displayed on Edit Device Details screen for ONT Devices");
				throw new Error("Installation Date field is not displayed on Edit Device Details screen for ONT Devices");
			}
			break;
		case "Platform ID field should be displayed in the device screen":
							waitForElement(btn_device_Networkstab_edit); Thread.sleep(2000);
							
							if(!lbl_serach_device_netwrok_tab_platformid.isCurrentlyVisible()){
								slf4jLogger.debug("Platform ID field is not displayed in the device screen");
								throw new Error("Platform ID field is not displayed in the device screen");
							}			
							break;
			
		case "Device serach result should display only 20 records from ICL in OV Screen":

						waitForElement(tab_Devicesearchresult); Thread.sleep(2000);
						
						waitForElement(btn_result_view); Thread.sleep(2000);
						
						for(i=1;i<=20;i++){
							if(!isElementVisible(By.xpath("(.//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail(')])["+i+"]"))){
								slf4jLogger.debug("Device serach result is not displaying 20 records from ICL in OV Screen");
								throw new Error("Device serach result is not displaying 20 records from ICL in OV Screen");
							}
						}
						
						break;
			
		case "Device Clli is not editable field in Device edit screen for Ethernet":
					waitForElement(btn_device_edit_save);						
					if(tbx_devicepage_edit_deviceclli.isCurrentlyEnabled()){
						slf4jLogger.debug("Device Clli is enabled in Device edit screen for Ethernet");
						throw new Error("Device Clli is enabled in Device edit screen for Ethernet");		
					}				
					break;
			
		case "Device Clli is an editable field in Device edit screen for Passive":
						waitForElement(btn_device_edit_save);						
						if(!tbx_devicepage_edit_deviceclli.isCurrentlyEnabled()){
							slf4jLogger.debug("Device Clli is not enabled in Device edit screen for Passive");
							throw new Error("Device Clli is not enabled in Device edit screen for Passive");		
						}				
						break;
			
		case "Device Clli is an editable field in Device edit screen for GPON":
						waitForElement(btn_device_edit_save);						
						if(!tbx_devicepage_edit_deviceclli.isCurrentlyEnabled()){
							slf4jLogger.debug("Device Clli is not enabled in Device edit screen for GPON");
							throw new Error("Device Clli is not enabled in Device edit screen for GPON");		
						}						
						break;	
						
		case "Device CLLI attribute is in Device edit screen for GPON":
							waitForElement(btn_device_edit_save);		
							
							jsClick(btn_devicepage_edit_cllilookup);
							
							waitForElement(btn_devicepage_edit_cllilookup_lookupicon);
							
							tbx_devicepage_edit_cllilookup_devicename.type("-"); Thread.sleep(2000);
							
							waitForElement(lbl_devicepage_edit_cllilookup_resultdropdown);
							
							jsClick(lbl_devicepage_edit_cllilookup_resultdropdown);Thread.sleep(2000);
							
							jsClick(btn_devicepage_edit_cllilookup_lookupicon);
							Thread.sleep(2000);
							waitForElement(lbl_devicepage_edit_cllilookup_result);
							
							jsClick(lbl_devicepage_edit_cllilookup_result);	Thread.sleep(2000);		
							
							break;
							
		case "MCO field on Edit Device Details screen for ONT Devices":
						waitForElement(btn_device_edit_save);			
						if(!ddl_devicepage_edit_MCO.isCurrentlyEnabled()){
							slf4jLogger.debug("MCO field is not enabled on Edit Device Details screen for ONT Devices");
							throw new Error("MCO field is not enabled on Edit Device Details screen for ONT Devices");		
						}			
						break;
						
		case "solar ARM indexing on location field in device edit screen":
						waitForElement(btn_device_edit_save);			
						tbx_devicepage_edit_locationname.type("123");Thread.sleep(2000);			
						waitForElement(lbl_devicepage_edit_locationresult);Thread.sleep(2000);
						jsClick(lbl_devicepage_edit_locationresult);Thread.sleep(1000);
						break;
						
		case "Subscriber attribute is mandatory field in Device edit screen for Ethernet":
			if(!lbl_devicepage_edit_subscribername.getText().trim().contains("*")){
				slf4jLogger.debug("Subscriber name attribute is not mandatory for Ethernet");
				throw new Error("Subscriber name attribute is not mandatory for Ethernet");				
			}			
			break;
			
		case "Subscriber attribute is not mandatory field in Device edit screen for Passive":
						verify_validation("Subscriber attribute is not mandatory field in Device edit screen for GPON");
						
						break;
		case "Subscriber attribute is not mandatory field in Device edit screen for GPON":
							waitForElement(btn_device_edit_save);			
						if(lbl_devicepage_edit_subscribername.getText().trim().contains("*")){
							slf4jLogger.debug("Subscriber name attribute is mandatory for ONT device screen");
							throw new Error("Subscriber name attribute is mandatory for ONT device screen");				
						}			
						break;
						
		case "Power	Supply attribute is not mandatory field in Device edit screen for ONT role":
			waitForElement(btn_device_edit_save);
			
			if(!ddl_devicepage_edit_powersupply.isCurrentlyVisible()){
				slf4jLogger.debug("Power supply attribute is mandatory for ONT device screen");
				throw new Error("Power supply attribute is mandatory for ONT device screen");
				
			}
			
			break;
		case "child port is freed by circuit":
			waitForElement(btn_device_Editbtn);
			jsClick(btn_deviceportRT_refreshicon);Thread.sleep(2000);
			waitForElement(btn_shelfexpand);Thread.sleep(2000);
			waitForElement(btn_deviceportRT_childcard_shelfexpand);
			
			if(!lbl_deviceportRT_shelfexpand_addchildcard_status.getText().trim().contains("P")){
				slf4jLogger.debug("Child port didn't get freed from circuit in the device screen");
				throw new Error("Child port didn't get consumed in the device screen");
				
			}				
			
			break;
			
		case "child port is consumed by circuit": 
			waitForElement(btn_device_Editbtn);
			jsClick(btn_deviceportRT_refreshicon);Thread.sleep(2000);
			waitForElement(btn_shelfexpand);Thread.sleep(2000);
			waitForElement(btn_deviceportRT_childcard_shelfexpand);
			
			if(!lbl_deviceportRT_shelfexpand_addchildcard_status.getText().trim().contains("IS")){
				slf4jLogger.debug("Child port didn't get consumed in the device screen");
				throw new Error("Child port didn't get consumed in the device screen");
				
			}
			

			if(!lbl_deviceportRT_shelfexpand_addchildcard_circuitdetails.getText().trim().contains(tab_lasttab.getText().trim())){
				slf4jLogger.debug("Child port didn't get consumed in the device screen");
				throw new Error("Child port didn't get consumed in the device screen");
				
			}	
			
			jsClick(btn_deviceportRT_childcard_shelfexpand);
			
			waitForElement(btn_deviceportRT_shelfexpand_Addcard); Thread.sleep(2000);
			
			waitForElement(lbl_deviceportRT_shelfexpand_addchildcard_pluggable);
			
			if(!lbl_deviceportRT_shelfexpand_addchildcard_pluggable.getText().trim().contains("In Service")){
				slf4jLogger.debug("Child port status is not updated in the device screen");
				throw new Error("Child port didn't is not updated in the device screen");
			}
			
			jsClick(lbl_deviceportRT_shelfexpand_addchildcard_layerassociation);Thread.sleep(4000);
			
			waitForElement(lbl_deviceportRT_shelfexpand_addchildcard_circuitassociated);
			
			if(!lbl_deviceportRT_shelfexpand_addchildcard_circuitassociated.getText().trim().contains(tab_lasttab.getText().trim())){
				slf4jLogger.debug("Child port didn't get consumed in the device screen");
				throw new Error("Child port didn't get consumed in the device screen");
				
			}		
			
			break;
			
		case "on bulk port update is updating the port status of the device":
			
			
			support[0]="In Service";
			support[1]="Planned";
			support[2]="Restricted";
			
			//for(i=0;i<3;i++){
				
				waitForElement(btn_bulkportupdate_showports);
				//click_Editbtn("Show Ports");Thread.sleep(1000);
				cbx_bulkportupdate_select_2.click();Thread.sleep(2000);
				ddl_bulkportupdate_provisionstatus.selectByVisibleText(support[i]);
				click_Editbtn("Save Bulk Ports");
				if(!lbl_bulkportupdate_showports_alertmsg.getText().trim().contains("Record updated sucessfully")){
					slf4jLogger.debug("Invalid messgae is displayed on Bulk Port Update");
					throw new Error("Invalid messgae is displayed on Bulk Port Update");			
				}
				jsClick(btn_bulkportupdate_showports_alertmsg_clsicon);
				
				jsClick(tab_bulkportupdate_previoustab); Thread.sleep(2000);
				
				jsClick(btn_deviceportRT_refreshicon);Thread.sleep(2000);
				
				waitForElement(btn_shelfexpand);Thread.sleep(2000);
				
				if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//td[@title='"+support[i]+"'])[1]"))){
					slf4jLogger.debug("on bulk port update port status is not getting changed of the device");
					throw new Error("on bulk port update port status is not getting changed of the device");
				}
				
				jsClick(tab_bulkportupdate);
			
			
			break;
		case "Bulk Port update tab is displayed":
							waitForElement(tab_bulkportupdate);
							
							if(!ddl_bulkportupdate_provisionstatus.isCurrentlyVisible() || !btn_bulkportupdate_showports_Save.isCurrentlyVisible() || !btn_bulkportupdate_showports.isCurrentlyVisible() ){
								slf4jLogger.debug("Bulk Port Update tab is not displayed");
								throw new Error("Bulk Port Update tab is not displayed");				
							}			
							break;
		case "Port Status on the New Device":
							waitForElement(btn_deviceportRT_shelfexpand_reserveport);
							
							jsClick(lbl_deviceportRT_shelfexpand_expand);Thread.sleep(2000);
							
							
							jsClick(btn_deviceportRT_shelfexpand_editportdetails);Thread.sleep(2000);
							waitForElement(btn_deviceportRT_shelfexpand_editportdetails_save);
							
							ddl_deviceportRT_shelfexpand_editportdetails_provisionstatus.selectByVisibleText("Restricted");Thread.sleep(2000);
							
							ddl_deviceportRT_shelfexpand_editportdetails_provisionstatus.selectByVisibleText("Planned");
							
							jsClick(btn_deviceportRT_shelfexpand_editportdetails_save);Thread.sleep(2000);
							
							
							break;
		case "Services table in Device screen":
			Thread.sleep(3000);
			if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
				waitForElement(btn_RT_view);
				Message=tab_activescreen_prvioussibling.getText().replaceAll("\\D+","").replaceAll("\\s","").trim();
				if(!isElementVisible(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
					slf4jLogger.debug("Service name is not matching With:"+Message);
					throw new Error("Service name is not matching With:"+Message);
					
				}
			}break;	

		case "a manual task gets added on selecting activation task in the device screen":			
						waitForElement(btn_RT_Task_view);			
						break;
		case "Network Identifiers field should be updated with new value in Device details screen":
			waitForElement(lbl_serach_device_netwrok_tab_networkidentifier);	
			if(!lbl_serach_device_netwrok_tab_networkidentifier.getText().trim().contains("TEST AUTO")){
				slf4jLogger.debug("Network Identifiers value is not updated in Device screen:"+lbl_serach_device_netwrok_tab_networkidentifier.getText().trim());
				throw new Error("Network Identifiers value is not updated in Device screen:"+lbl_serach_device_netwrok_tab_networkidentifier.getText().trim());
			}
			
			break;
		case "update the Network Identifiers in Device details screen":
								waitForElement(ddl_edit_device_netwrok_tab_networkidentifier);
								ddl_edit_device_netwrok_tab_networkidentifier.type("TEST AUTO");			
								break;
								
		case "Network Identifiers field should be displayed in Device details screen":
								waitForElement(lbl_serach_device_netwrok_tab_networkidentifier);			
								log=lbl_serach_device_netwrok_tab_networkidentifier.getText().trim();			
								break;
			
		case "updated Qualification Information section in Device screen is getting reflected in the another tab":

								jsClick(tab_activescreen_forwardsibling);Thread.sleep(3000);waitForElement(btn_device_Editbtn); 
								
								jsClick(btn_Refresh_button);Thread.sleep(3000);
								
								if(!lbl_SubscriberNameOLT.getText().trim().contains("TEST - JANET")){
									slf4jLogger.debug("Subscriber name is not updated in Device screen:"+lbl_SubscriberNameOLT.getText().trim());
									throw new Error("Subscriber name is not updated in Device screen:"+lbl_SubscriberNameOLT.getText().trim());
								}
								
								if(!lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText().trim().contains("Yes")){
									slf4jLogger.debug("PRISM NOSA Certification is not updated in Device screen:"+lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText().trim());
									throw new Error("PRISM NOSA Certification is not updated in Device screen:"+lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText().trim());
								}
								
								break;
		case "update the Qualification Information section in Device screen":
									waitForElement(btn_device_edit_save);			
									ddl_devicepage_edit_nosacert.selectByVisibleText("Yes");
									verify_validation("update Max Down Speed & Max Up Speed on the device");			
									tbx_devicepage_edit_subscriberlookupfield.type("TEST - JANET");waitForElement(lbl_devicepage_edit_subscriberlookupfield);jsClick(lbl_devicepage_edit_subscriberlookupfield);			
									break;
			
		case "Functional status is not mandatory":waitForElement(btn_device_Editbtn); jsClick(btn_device_Editbtn); waitForElement(btn_device_edit_save); Thread.sleep(3000);
		
								if(!tbx_devicepage_edit_functionalstatus.isCurrentlyVisible()){
									slf4jLogger.debug("Functional Status is mandatory check again");
									throw new Error("Functional Status is mandatory check again");
								}
								
								tbx_devicepage_edit_functionalstatus.selectByIndex(3);
														break;
		case "when the user opens up the expand area of a given activation, the system should display the logs related to the activation ID in the selected Row":
															waitForElement(btn_Device_RT_activation_refreshicon);jsClick(btn_Device_RT_activation_refreshicon);
															
															Thread.sleep(2000); waitForElement(btn_Device_RT_activation_valueplus_cion);
															
															
															jsClick(btn_Device_RT_activation_valueplus_cion);
															
															
															break;
		case "Prism Nosa Certification is updated as No in the Device view screen":								
							
							waitForElement(btn_device_Editbtn); Thread.sleep(3000);			
							if(!lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText().trim().contains("No")){
								slf4jLogger.debug("Prism Nosa Certification is not updated as No in the Device view screen");
								throw new Error("Prism Nosa Certification is not updated as No in the Device view screen");				
							}			
							
							break;
		case "change the Prism Nosa Certification status to No in Device details page":
			
			waitForElement(ddl_devicepage_edit_nosacert);
			ddl_devicepage_edit_nosacert.selectByVisibleText("No");
			verify_validation("update Max Down Speed & Max Up Speed on the device");	
			
			tbx_devicepage_edit_subscriberlookupfield.type("TEST - JANET");waitForElement(lbl_devicepage_edit_subscriberlookupfield);jsClick(lbl_devicepage_edit_subscriberlookupfield);
			
			break;
			
		case "Prism Nosa Certification is updated as Yes in the Device view screen":
										waitForElement(btn_device_Editbtn); Thread.sleep(3000);			
										if(!lbl_serach_device_device_details_tab_Qualification_information_sec_prism_nosa_cert.getText().trim().contains("Yes")){
											slf4jLogger.debug("Prism Nosa Certification is not updated as Yes in the Device view screen");
											throw new Error("Prism Nosa Certification is not updated as Yes in the Device view screen");				
										}			
										break;
										
		case "SNMP Port Number field should be updated with 2556 in device view screen":
								waitForElement(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number); Thread.sleep(2000);
										
										//System.out.println("lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number:"+lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText());
										if(!lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText().trim().equals("2556")){
											slf4jLogger.debug("SNMP Port Number is not updated in Device view screen");
											throw new Error("SNMP Port Number is not updated in Device view screen");
										}		
										break;		
		
		case "update the SNMP Port number with 2556 in the Network detail edit screen":
									waitForElement(btn_device_Networkstab_save); Thread.sleep(2000);
									waitForElement(tbx_devicepage_edit_networkdetails_snmpportnumber);
									
									tbx_devicepage_edit_networkdetails_snmpportnumber.type("2556");		Thread.sleep(1000);	
									
									ddl_devicepage_edit_networkdetails_snmpversion.selectByVisibleText("V1"); Thread.sleep(1000);	
									break;
									
		case "by default SNMP Port Number field should not get updated in device view screen":
			
									waitForElement(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number); Thread.sleep(2000);
									
								//	System.out.println("lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number:"+lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText());
									if(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText().trim().equals("161")){
										slf4jLogger.debug("SNMP Port Number is updated with default value 161 in Device view screen");
										throw new Error("SNMP Port Number is updated with default value 161 in Device view screen");
									}		
									break;
									
		case "by default SNMP Port Number field should be updated with default value 161 in device view screen":
			
							waitForElement(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number); Thread.sleep(2000);
							
						//	System.out.println("lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number:"+lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText());
							if(!lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText().trim().equals("161")){
								slf4jLogger.debug("SNMP Port Number is not updated with default value 161 in Device view screen");
								throw new Error("SNMP Port Number is not updated with default value 161 in Device view screen");
							}		
							break;
			
		case "Migrate card button is available in the device port related system tab in Device screen":
								waitForElement(btn_shelfexpand); jsClick(btn_shelfexpand);Thread.sleep(2000);
								waitForElement(btn_deviceportRT_shelfexpand_addchildcard); 
								if(!btn_deviceportRT_shelfexpand_migratecard.isCurrentlyVisible()){
									slf4jLogger.debug("Migrate card button is not available in the Device port related Tab");
									throw new Error("Migrate card button is not available in the Device port related Tab");
								}
								Thread.sleep(1000);break;			
			
		case "the Move card button is available in the device port related system tab with the child card information for a new device":
								waitForElement(btn_shelfexpand); jsClick(btn_shelfexpand);Thread.sleep(4000);
								if(!btn_deviceportRT_shelfexpand_addchildcard.isCurrentlyVisible()){
									verify_validation("Add a card to device port");
									waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody//td[text()='M20-FPC1-EP']/preceding-sibling::td/input[@value='+']")));
									
									jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody//td[text()='M20-FPC1-EP']/preceding-sibling::td/input[@value='+']")));
								}
								waitForElement(btn_deviceportRT_shelfexpand_addchildcard); 
								if(!btn_deviceportRT_shelfexpand_movecard.isCurrentlyVisible()){
									slf4jLogger.debug("Move button is not available in the Device port related Tab");
									throw new Error("Move button is not available in the Device port related Tab");
								}
								Thread.sleep(1000);break;
		case "tool tip information hovering on the Swap card button, Move card button & Migrate card button in Device screen":
										waitForElement(btn_shelfexpand); jsClick(btn_shelfexpand);Thread.sleep(2000);
										waitForElement(btn_deviceportRT_shelfexpand_addchildcard); 
										
										jshoveraction(btn_deviceportRT_shelfexpand_swapcard);Thread.sleep(1000);
										jshoveraction(btn_deviceportRT_shelfexpand_movecard);Thread.sleep(1000);
										jshoveraction(btn_deviceportRT_shelfexpand_migratecard);Thread.sleep(1000);			
										break;
			
		case "Card Details Saved Successfully. message should be displayed in Device Details page":
									waitForElement(lbl_RT_alertmsg);
									
									Message = lbl_RT_alertmsg.getText();
									Message = Message.toString().substring(1);
									
											Message = Message.trim(); 
										if(!Message.contains("Card Details Saved Successfully.")){					
												throw new Error("Invalid message is displayed as:"+Message);
												
											
										}jsClick(btn_RT_alertmsg_clsicon); 
									
									break;
		case "Add a card to device port":
									click_Editbtn("Add Card");ddl_deviceportRT_shelfexpand_Addcard_deviceaddcardtype.selectByVisibleText("M20-FPC1-EP");
									tbx_deviceportRT_shelfexpand_Addcard_deviceaddcardcount.type("1"); Thread.sleep(1000);
									jsClick(btn_deviceportRT_shelfexpand_Addcard_addcarddetails); Thread.sleep(1000);
									
									waitForElement(ddl_deviceportRT_shelfexpand_Addcard_slotno);
									ddl_deviceportRT_shelfexpand_Addcard_slotno.selectByIndex(1);
									
									
									
										jsClick(btn_deviceportRT_shelfexpand_Addcard_addcardsavecarddetails);
									break;
									
		case "add the child card to the added card in device port":
			waitForElement(btn_deviceportRT_childcard_shelfexpand);
			jsClick(btn_deviceportRT_childcard_shelfexpand); Thread.sleep(1000);
			
			waitForElement(btn_deviceportRT_shelfexpand_addchildcard);Thread.sleep(1000);
			
			jsClick(btn_deviceportRT_shelfexpand_addchildcard);Thread.sleep(1000);
			
			waitForElement(btn_deviceportRT_shelfexpand_addchildcard_addcarddetails);Thread.sleep(1000);
			
			ddl_deviceportRT_shelfexpand_addchildcard_childcardtype.selectByVisibleText("1-port 10GBASE + 10-port GIGE MDA");
			
			tbx_deviceportRT_shelfexpand_addchildcard_noofcards.type("1");
			
			jsClick(btn_deviceportRT_shelfexpand_addchildcard_addcarddetails);Thread.sleep(1000);

			waitForElement(btn_deviceportRT_shelfexpand_addchildcard_addcarddetails_savecarddetails);
						
			ddl_deviceportRT_shelfexpand_addchildcard_addcarddetails_slot.selectByVisibleText("1");
			
			jsClick(btn_deviceportRT_shelfexpand_addchildcard_addcarddetails_savecarddetails);Thread.sleep(2000);			
			
			break;
									
		case "select the card details and Click on Add Card":
										waitForElement(btn_deviceportRT_shelfexpand_Addcard_addcarddetails);
										ddl_deviceportRT_shelfexpand_Addcard_deviceaddcardtype.selectByVisibleText("7750 SR 20G Input Output Module (IOM2) Baseboard");
										tbx_deviceportRT_shelfexpand_Addcard_deviceaddcardcount.type("1"); Thread.sleep(1000);
										jsClick(btn_deviceportRT_shelfexpand_Addcard_addcarddetails); Thread.sleep(1000);
										
										waitForElement(ddl_deviceportRT_shelfexpand_Addcard_slotno);
										ddl_deviceportRT_shelfexpand_Addcard_slotno.selectByVisibleText("1");
										
										
										
											jsClick(btn_deviceportRT_shelfexpand_Addcard_addcardsavecarddetails);
										
										break;
		case "Add the card details and Click on Add Card":waitForElement(btn_deviceportRT_shelfexpand_Addcard_addcarddetails);
		
															ddl_deviceportRT_shelfexpand_Addcard_deviceaddcardtype.selectByIndex(1);
															tbx_deviceportRT_shelfexpand_Addcard_deviceaddcardcount.type("1"); Thread.sleep(1000);
															jsClick(btn_deviceportRT_shelfexpand_Addcard_addcarddetails); Thread.sleep(1000);
															
															waitForElement(ddl_deviceportRT_shelfexpand_Addcard_slotno);
															ddl_deviceportRT_shelfexpand_Addcard_slotno.selectByIndex(1);
															
															
															
																jsClick(btn_deviceportRT_shelfexpand_Addcard_addcardsavecarddetails);
																break;
		case "a warning message should be displayed stating device is being used in Device Screen":
												waitForElement(btn_device_Editbtn);
												waitForElement(lbl_device_errormsg);
												Message = lbl_device_errormsg.getText();
												Message = Message.toString().substring(1);
												
														Message = Message.trim(); 
													if(!Message.contains("GPON Workers present for device")){
														if(!Message.contains("The port cannot be deleted as it is used by a circuit")){
															throw new Error("Invalid message is displayed as:"+Message);
															}
														
													}jsClick(btn_device_errormsg_clsicon); 
													
													if(tab_activescreen_prvioussibling.isCurrentlyVisible()){
														jsClick(tab_activescreen_prvioussibling);
													}
													break;
			
		case "Circuit details should be displayed in the Device Screen":Thread.sleep(3000);
		
														if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
															waitForElement(btn_RT_view);
															
															Message=tab_activescreen_prvioussibling.getText().trim();
															
															if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
																slf4jLogger.debug("Circuit data not displayed please check the data");
																throw new Error("Circuit data not displayed please check the data");
															}
															
															
														}
															
															
															
															break;
		case "Contact data is displayed in the Device Screen": 
			Thread.sleep(5000);
			
													if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
														waitForElement(btn_ContactRT_ADDContact_Withdata);
														
														if(!btn_RT_view.isCurrentlyVisible()){
															slf4jLogger.debug("Contact Table not displayed please check the data");
															throw new Error("Contact Table not displayed please check the data");
														}
													} else {
														jsClick(btn_ContactRT_ADDContact_nodata);
														
														waitForElement(tbx_createcontact_firstname);
														tbx_createcontact_firstname.type("Automation");
														tbx_createcontact_lastname.type("Test");
														ddl_createcontact_contactcategory.selectByVisibleText("HELP DESK");
														ddl_createcontact_contacttype.selectByVisibleText("ALCON");
														jsClick(cbx_createcontact_account);
														tbx_createcontact_home_filed1.type("325");
														tbx_createcontact_home_filed2.type("456");
														tbx_createcontact_home_filed3.type("1254");
														jsClick(cbx_home);
														Thread.sleep(2000);
														jsClick(btn_contact_create);
														
														waitForElement(btn_contactview_delete);
														jsClick(tab_createcontact_precedingsibling);Thread.sleep(2000);
														waitForElement(btn_ContactRT_ADDContact_nodata);
														jsClick(orderpage.btn_related_tab_refresh_icon);
														Thread.sleep(2000);
														jsClick(orderpage.btn_related_tab_refresh_icon);
														Thread.sleep(2000);
														
														if(!btn_RT_view.isCurrentlyVisible()){
															slf4jLogger.debug("Contact Table not displayed please check the data");
															throw new Error("Contact Table not displayed please check the data");
														}
														
														jsClick(tab_createcontact_followingsibling);
														waitForElement(btn_contactview_delete);
														jsClick(btn_contactview_delete);       	
														getDriver().switchTo().alert().accept();
														waitForElement(lbl_device_successmsg); 
															Thread.sleep(2000);
															jsClick(tab_createcontact_precedingsibling);Thread.sleep(2000);
															waitForElement(btn_ContactRT_ADDContact_Withdata);
															jsClick(orderpage.btn_related_tab_refresh_icon);
															Thread.sleep(2000);
															jsClick(orderpage.btn_related_tab_refresh_icon);
															Thread.sleep(2000);
															
															if(orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																slf4jLogger.debug("Contact Table didnot get removed please check the data");
																throw new Error("Contact Table didnot get removed  please check the data");
															}
														
														
													}
													
													
													break;
		case "Contact data is displayed in the Device Screen and validate the view icon": 
														Thread.sleep(5000);
			
														waitForElement(btn_contactview_delete);
														jsClick(tab_createcontact_precedingsibling);Thread.sleep(2000);
														//waitForElement(btn_ContactRT_ADDContact_nodata);
														jsClick(orderpage.btn_related_tab_refresh_icon);
														Thread.sleep(2000);
														jsClick(orderpage.btn_related_tab_refresh_icon);
														Thread.sleep(2000);
														
														if(!btn_RT_view.isCurrentlyVisible()){
															slf4jLogger.debug("Contact Table not displayed please check the data");
															throw new Error("Contact Table not displayed please check the data");
														}
																												
														jsClick(btn_RT_view);
														waitForElement(btn_contactview_delete);
														if(servicepage.contact_label.isVisible()){
																												
															slf4jLogger.info("Contact page is displaed");
															Thread.sleep(3000);
														}
														jsClick(btn_contactview_delete);       	
														getDriver().switchTo().alert().accept();
														waitForElement(lbl_device_successmsg); 
															Thread.sleep(2000);
															jsClick(tab_createcontact_precedingsibling);Thread.sleep(2000);
															waitForElement(btn_ContactRT_ADDContact_Withdata);
															jsClick(orderpage.btn_related_tab_refresh_icon);
															Thread.sleep(2000);
															jsClick(orderpage.btn_related_tab_refresh_icon);
															Thread.sleep(2000);
														
													
													
													
													break;
		case "Impacted Subscribers table is displayed in Device screen": 
														Thread.sleep(5000);
														
														if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
															waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//span[text()='Port']")));
															slf4jLogger.info("Subscriber Table is displayed");
															
														} else {
															slf4jLogger.debug("Subscriber details not displayed please check the data");
															throw new Error("Subscriber details not displayed please check the data");
														}
														
														
														break;
		case "Order table in Device screen":	Thread.sleep(3000);
											if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
												waitForElement(btn_RT_view);
												Message=orderpage.btn_order_tab_search_view_page.getText().replaceAll("\\D+","").replaceAll("\\s","").trim();
												if(!isElementVisible(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
													slf4jLogger.debug("Task Order number is not matching With Order ID");
													throw new Error("TaskOrder number is not matching With Order ID");
													
												}
											}break;	
		case "Location data is displayed": 			
													waitForElement(btn_RT_view);
													if(!lbl_serach_device_device_details_tab_subscriber_information_sec_Location_Name.getText().trim().contains(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[3]")).getText().trim())){
														slf4jLogger.error("Location details are wrongly displayed in Device page");
														throw new Error("Location details are wrongly displayed in Device page");
													}
													
													
													break;
		case "Update action type is registered under the Audit logs section in Device page": 
															waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog);jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);Thread.sleep(2000);
															waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
															if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
																slf4jLogger.error("Update logs is not captured under the Audit logs section in Device page");
																throw new Error("Update logs is not captured under the Audit logs section in Device page");
															}
															if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]"))){
																slf4jLogger.error("Update logs is not captured under the Audit logs section in Device page");
																throw new Error("Update logs is not captured under the Audit logs section in Device page");
															}
															if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
																slf4jLogger.error("Update logs is not captured under the Audit logs section in Device page");
																throw new Error("Update logs is not captured under the Audit logs section in Device page");
															}
															break;
															
		case "Create action type is registered under the Audit logs section in Device page": 
			waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog);jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);Thread.sleep(2000);
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
			if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE']"))){
				slf4jLogger.info("CREATE logs is  captured under the Audit logs section in Device page");
				//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			} else if (isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']"))){
				slf4jLogger.info("CREATE logs is  captured under the Audit logs section in Device page");
				
			}else {
				slf4jLogger.info("CREATE logs is not captured under the Audit logs section in Device page");
				throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			}
			
			break;
		case "Update action log is registered under the Audit logs section in Device page": 
			waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog);jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);Thread.sleep(2000);
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
			if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']"))){
				slf4jLogger.error("UPDATE logs is not captured under the Audit logs section in Device page");
				throw new Error("UPDATE log is not captured under the Audit logs section in Device page");
			}
			else if (isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update']"))){
				slf4jLogger.info("Update log is  captured under the Audit logs section in Device page");
				
			}else {
				slf4jLogger.info("Update logs is not captured under the Audit logs section in Device page");
				throw new Error("Update logs is not captured under the Audit logs section in Device page");
			}
			
			break;
		case "Activation log must be registered with Activation ID and circuit type in Device view related tab" :			
																				
																					waitForElement(btn_Device_RT_activation_refreshicon);jsClick(btn_Device_RT_activation_refreshicon);
																	
																		Thread.sleep(2000);
																	waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//th[text()='Activation ID']")));
																					if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//th[text()='Activation ID']/../../following-sibling::tbody//td[3])[1]"))){
																						slf4jLogger.error("Activations logs are not displayed");
																						throw new Error("Activations logs are not displayed");
																					}
																
																			
																			break;
		case "Port status should change back to Planned in Device Screen":
														waitForElement(btn_deviceportRT_shelfexpand_reserveport);
														Thread.sleep(3000);
														
														if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Reserve Port']/../../..//span[contains(text(),'Planned')]"))){
															slf4jLogger.debug("Port Status didn't get changed edit Device details screen");
															throw new Error("Port Status didn't get changed edit Device details screen");
														}
														
														if(!getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='-']/../../td[8]")).getText().trim().equalsIgnoreCase("P")){
															slf4jLogger.debug("Port Status didn't get changed edit Device details screen");
															throw new Error("Port Status didn't get changed edit Device details screen");
														}
														break;
			
		case "remove the reserved port in Device Detail Page":
																waitForElement(btn_deviceportRT_shelfexpand_reserveport_Delete);
																jsClick(btn_deviceportRT_shelfexpand_reserveport_Delete);Thread.sleep(2000);
															getDriver().switchTo().alert().accept(); 
																Thread.sleep(3000);
																//waitForElement(btn_deviceportRT_shelfexpand_editreserveport_success_msg);
																jsClick(btn_deviceportRT_shelfexpand_reserveport_cancel);
																
																break;
		case "Port status is updated as In-Service in Device Screen": 
			
										waitForElement(btn_deviceportRT_shelfexpand_Manageportreservation);
										
										if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='Manage Port Reservation']/../../..//span[contains(text(),'In Service')]"))){
											slf4jLogger.debug("Port Status didn't get changed edit Device details screen");
											throw new Error("Port Status didn't get changed edit Device details screen");
										}
										
										if(!getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='-']/../../td[8]")).getText().trim().equals("IS")){
											slf4jLogger.debug("Port Status didn't get changed edit Device details screen");
											throw new Error("Port Status didn't get changed edit Device details screen");
										}
										break;
		case "fill all the mandatory fields in the Reserve port pop up window in Device Screen": 
																			waitForElement(btn_deviceportRT_shelfexpand_reserveport_Save);
																			
																			tbx_deviceportRT_shelfexpand_reserveport_name.type("Auto");
																			ddl_deviceportRT_shelfexpand_reserveport_provisionstatus.selectByVisibleText("Active");
																			ddl_deviceportRT_shelfexpand_reserveport_Reservationtype.selectByVisibleText("Hard");
																			tbx_deviceportRT_shelfexpand_reserveport_time.type("10");
																			tbx_deviceportRT_shelfexpand_reserveport_descriptions.type("Automation Test");
																			jsClick(btn_deviceportRT_shelfexpand_reserveport_Save);
																			waitForElement(btn_deviceportRT_shelfexpand_reserveport_Delete);
																			
																			Thread.sleep(2000);
																			jsClick(btn_deviceportRT_shelfexpand_reserveport_cancel);
																			
																			
																			break;
		case "expand the shelf having status as Planned in Device Screen":
																			waitForElement(btn_shelfexpand); 		
																																						
																			
																			i=1;
																			
																			while(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])["+i+"]"))){
																				count=i;
																				if(i!=1){ 
																				if( i % 2 == 0){
																					
																                      i++;
																                }
																				}
																				
																				slf4jLogger.info("Slot"+i+":"+getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody/tr["+i+"]/td[8]")).getText().trim());
																				
																				if(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody/tr["+i+"]/td[8]")).getText().trim().equals("P")){
																					if(i!=1){ 
																						i=count;
																					}
																					
																					jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])["+i+"]")));
																					waitForElement(btn_deviceportRT_shelfexpand_Addcard);		
																																			
																					
																				
																					
																					break;
																				}
																				
																				if(i!=1){
																				i=count;
																				}
																				
																				i++;
																			}
																			
																			
																			break;
		case "Topology Create Pop window should display in Device details screen":			
																				waitForElement(lbl_edit_device_netwrok_tab_craetetopologyheader);			
																				if(!tbx_edit_device_netwrok_tab_craetetopology_Notes.isCurrentlyEnabled()){
																					slf4jLogger.debug("Topology Notes is not displayed in edit Device details screen");
																					throw new Error("Topology Notes is not displayed in edit Device details screen");
																				}
																				
																				if(!btn_edit_device_netwrok_tab_craetetopology_save.isCurrentlyEnabled() && !btn_edit_device_netwrok_tab_craetetopology_save.isCurrentlyVisible()){
																					slf4jLogger.debug("Create Topology Save button is not displayed in edit Device details screen");
																					throw new Error("Create Topology Save button is not displayed in edit Device details screen");
																				}
																				
																				break;
		case "select Vectoring field as External & Vectoring Topology as Create Vectoring Topology in Device details screen": 			
																									ddl_edit_device_netwrok_tab_vectoringtype.selectByVisibleText("384 External");Thread.sleep(1000);
																									ddl_edit_device_netwrok_tab_vectoringtopology.selectByVisibleText("Create Vectoring Topology");Thread.sleep(1000);			
																									break;
		case "user should be able to select Internal & external drop down values under Vectoring field": waitForElement(btn_device_Networkstab_save);
																									Select dropdown = new Select(ddl_edit_device_netwrok_tab_vectoringtype);
																							List<WebElement> dd = dropdown.getOptions();
																					
																						    //Get the length
																						    System.out.println(dd.size());
																					
																						    // Loop to print one by one
																						    for (int k = 0; j < dd.size(); j++) {
																						        System.out.println(dd.get(j).getText());
																						        ddl_edit_device_netwrok_tab_vectoringtype.selectByIndex(k);
																					
																						    }
			
																								/*	ddl_edit_device_netwrok_tab_vectoringtype.selectByVisibleText("192 Internal");Thread.sleep(1000);
																									ddl_edit_device_netwrok_tab_vectoringtype.selectByVisibleText("384 Internal");Thread.sleep(1000);
																									ddl_edit_device_netwrok_tab_vectoringtype.selectByVisibleText("384 External");Thread.sleep(1000);*/
																										
																										
																										break;
		case "Vectoring field & Vectoring Topology should be editable in Device details screen": waitForElement(btn_device_Networkstab_save);
		
																				if(!ddl_edit_device_netwrok_tab_vectoringtype.isCurrentlyEnabled()){
																					slf4jLogger.debug("Vectoring Type is not enabled in edit Device details screen");
																					throw new Error("Vectoring Type is not enabled in edit Device details screen");
																				}
																				
																				if(!ddl_edit_device_netwrok_tab_vectoringtopology.isCurrentlyEnabled()){
																					slf4jLogger.debug("Vectoring Topology is not enabled in edit Device details screen");
																					throw new Error("Vectoring Topology is not enabled in edit Device details screen");
																				}
																				
																				
																				break;
		case "Vectoring field & Vectoring Topology should be displayed in Device details screen": 			
																						if(!lbl_serach_device_netwrok_tab_vectoringtype.isCurrentlyVisible()){
																							slf4jLogger.debug("Vectoring Type is not displayed in Device details screen");
																							throw new Error("Vectoring Type is not displayed in Device details screen");
																						}
																								
																								if(!lbl_serach_device_netwrok_tab_vectoringtopology.isCurrentlyVisible() ){
																									slf4jLogger.debug("Vectoring Topology is not displayed in Device details screen");
																									throw new Error("Vectoring Topology is not displayed in Device details screen");
																							
																								}																	
																						
																						break;
		case "for the ports having parent card, should display a new button as move card in Device port related tab" :
																			if(btn_deviceportRT_shelfexpand_Addcard.isCurrentlyVisible()){
																																				if(!btn_deviceportRT_shelfexpand_movecard.isCurrentlyVisible()){
																																					slf4jLogger.debug("Move card Button is not displayed");
																																					throw new Error("Move card Button is not displayed");
																																				}
																			} else {
																				slf4jLogger.debug("No Parent card is displayed on this device");
																			}
																														
																														break;
		case "should be seeing the Parent card action buttons Add Child Cards, Edit Card Details, Swap Card, Move Card, Delete Card in this format under Device port": 
																			waitForElement(btn_shelfexpand); 		
																			ArrayList<String> comparisonlist=new ArrayList<String>();
																			comparisonlist.add(0, "Add Child Cards");
																			comparisonlist.add(1, "Edit Card Details");
																			comparisonlist.add(2, "Swap Card");
																			comparisonlist.add(3, "Move Card");
																			comparisonlist.add(4, "Migrate Card");
																			comparisonlist.add(5, "Delete Card");
																			
																			
																			i=1;
																			
																			while((isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])["+i+"]"))) && i<2){
																			
																				if(i!=1){ 
																				if( i % 2 == 0){
																					
														                              i++;
														                        }
																				}
																				
																				slf4jLogger.info("Slot"+i+":"+getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody/tr["+i+"]/td[4]")).getText().trim());
																				int len=getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody/tr["+i+"]/td[4]")).getText().trim().length();
																				System.out.println(len);
																				if(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//th[text()='Parent Card Name']/../../../tbody/tr["+i+"]/td[4]")).getText().trim().length()>1){
																					if(i!=1){ 
																						i=count;
																					}
																					
																					jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])["+i+"]")));
																					waitForElement(btn_deviceportRT_shelfexpand_addchildcard);		
																					
																					
																					List<WebElement> ButtonList = getDriver().findElements(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//span[@ng-if='!cardButtonDisabled']//input[contains(@value,'Card')]"));
																					ArrayList<String> Orderatributes=new ArrayList<String>();
																					for(j=0;j<ButtonList.size();j++){										
																						Orderatributes.add(j, ButtonList.get(j).getAttribute("value").trim());											
																					}
																					slf4jLogger.info("Orderatributes:"+Orderatributes);
																					j=0;
																					
																					for(i=0;i<Orderatributes.size();i++){
																						if(!comparisonlist.get(i).equals(Orderatributes.get(i))){
																							slf4jLogger.debug("comparisonlist value:"+comparisonlist.get(i)+" is not matching with Orderatributes:"+Orderatributes.get(i));
																							throw new Error("comparisonlist value:"+comparisonlist.get(i)+" is not matching with Orderatributes:"+Orderatributes.get(i));
																						}
																						
																					}
																					
																					break;
																				}
																				
																				if(i!=1){
																				i=count;
																				}
																				
																				i++;
																			}
																			
																			
																			
																			
																			break;
		case "search for device having DSL OVC displayed in Services related tab":count=1;
			
													while(count!=0){
														waitForElement(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
														
														
														jsClick(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
														waitForElement(btn_device_Editbtn);
														
														jsClick(tab_services);
														
														Thread.sleep(20000);
														
														if(isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Task'])[1]"))){					
															
															
															if(!isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='DSL OVC'])[1]"))){
																jsClick(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='next']/div")));
															}
															Thread.sleep(1000);
															
															if(!isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='DSL OVC'])[1]"))){
																jsClick(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='next']/div")));
															}
															
															if(isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='DSL OVC'])[1]"))){
																if(isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='IPTV-DATA'])[1]"))){
																	break;
																}
															
															}
															
															Thread.sleep(1000);
														}
														
														jsClick(btn_closeactivetab_clsicon);
														
														Thread.sleep(2000);
														
														i++;
														
														if(!isElementVisible(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input"))){
															
															i=0;
															
															jsClick(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@title='next']/div")));
															Thread.sleep(2000);
														}
														
														
														
														
													}
													
												break;
			
			
			
		case "search for device having MEF EVC displayed in Services related tab": count=1;i=0;
															while(count!=0){
																waitForElement(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
																
																
																jsClick(getDriver().findElement(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
																waitForElement(btn_device_Editbtn);
																
																jsClick(tab_services);
																
																Thread.sleep(20000);
																
																if(isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Task'])[1]"))){					
																	
																	
																	if(!isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='MEF EVC'])[1]"))){
																		jsClick(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='next']/div")));
																	}
																	Thread.sleep(1000);
																	
																	if(!isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='MEF EVC'])[1]"))){
																		jsClick(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='next']/div")));
																	}
																	
																	if(isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='MEF EVC'])[1]"))){
																		if(isElementVisible(By.xpath("(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='HSI + IPTV Unicast'])[1]"))){
																			break;
																		}
																	
																	}
																	
																	Thread.sleep(1000);
																}
																
																jsClick(btn_closeactivetab_clsicon);
																
																Thread.sleep(2000);
																
																i++;
																
																if(!isElementVisible(By.xpath("//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input"))){
																	
																	i=0;
																	
																	jsClick(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@title='next']/div")));
																	Thread.sleep(2000);
																}
																
																
																
																
															}
															
														break;
		case "change the provision status in Device details page": waitForElement(btn_device_edit_save);
			
																ddl_devicepage_edit_provisionstatus.selectByVisibleText("Configured");
																	break;
		
		case "changed the Device Type & Subtype on the ONT Device":
			ddl_devicepage_edit_devicetype.selectByVisibleText("Calix 700GE Series ONT").click();
			Thread.sleep(1000);
			ddl_devicepage_edit_devicesubtype.selectByVisibleText("Calix 712GE").click();
			Thread.sleep(1000);verify_validation("update Max Down Speed & Max Up Speed on the device");break;
			
		case "update Max Down Speed & Max Up Speed on the device":tbx_devicepage_edit_maxdwnspd.type("123");
								ddl_devicepage_edit_maxdwnspd.selectByVisibleText("MB-Megabyte").click();
								tbx_devicepage_edit_maxupspd.type("123");
								ddl_devicepage_edit_maxupspd.selectByVisibleText("MB-Megabyte").click();break;
								
		case "updated the Network element role, Provision Status in Device Detail Page":
			waitForElement(tbx_devicepage_edit_netwrkelemntnode);
			tbx_devicepage_edit_netwrkelemntnode.type("Testing Automation");
			ddl_devicepage_edit_provisionstatus.selectByVisibleText("In Service");
			
			if(btn_devicepage_edit_subscriberlookup.isCurrentlyVisible()){
				tbx_devicepage_edit_subscriberlookupfield.type("TEST - JANET");waitForElement(lbl_devicepage_edit_subscriberlookupfield);jsClick(lbl_devicepage_edit_subscriberlookupfield);
			}
			if(ddl_devicepage_edit_affliateowner.isCurrentlyVisible()){
				ddl_devicepage_edit_affliateowner.selectByVisibleText("IXC");
			}
			
			if(tbx_devicepage_edit_maxdwnspd.isCurrentlyVisible()){
				verify_validation("update Max Down Speed & Max Up Speed on the device");
			}
			
			if(tbx_devicepage_edit_otherdev_maxdwnspd.isCurrentlyVisible()){
				tbx_devicepage_edit_otherdev_maxdwnspd.type("123");
				ddl_devicepage_edit_maxdwnspd.selectByVisibleText("MB-Megabyte");
				tbx_devicepage_edit_otherdev_maxupspd.type("123");
				ddl_devicepage_edit_maxupspd.selectByVisibleText("MB-Megabyte");
			}
			
			/*List<WebElementFacade> device_edit_attribute = lbl_devicepage_edit_fields;
			
			ArrayList<String> device_edit_Fieldattributelist=new ArrayList<String>();
				for(int j=0;j<device_edit_attribute.size();j++){
					device_edit_Fieldattributelist.add(j, device_edit_attribute.get(j).getText().trim());						
					}
				for(int i=0;i<device_edit_Fieldattributelist.size();i++){
					switch(device_edit_Fieldattributelist.get(i)){
					case "Affiliate Owner*":ddl_devicepage_edit_affliateowner.selectByVisibleText("IXC");break;
					case "Subscriber Name*":tbx_devicepage_edit_subscriberlookupfield.type("TEST _ JANET");waitForElement(lbl_devicepage_edit_subscriberlookupfield);lbl_devicepage_edit_subscriberlookupfield);break;
					case "Max Subscriber Downstream Bandwidth*":verify_validation("update Max Down Speed & Max Up Speed on the device");break;		
					}
							
				}*/ break;
				
		case "Management IP Subnet Mask & default gateway values are displayed in Device details page and validated in Database"  :
			jsClick(tab_serach_device_Networking_details);
			waitForElement(lbl_serach_device_netwrok_tab_mngtipsubnetmask);
			
			if(!lbl_serach_device_netwrok_tab_mngtipsubnetmask.getText().trim().equals("127.1.1.254")){
				throw new Error(lbl_serach_device_netwrok_tab_mngtipsubnetmask.getText().trim()+":Management IP Subnet mask is not matching with 127.1.1.254");
			}
			
			if(!lbl_serach_device_netwrok_tab_deftgateway.getText().trim().equals("127.1.1.255")){
				throw new Error(lbl_serach_device_netwrok_tab_deftgateway.getText().trim()+":Default gateway is not matching with 127.1.1.255");
			}
			List<String> OV_device_Networkdetails = new ArrayList<String>();
			OV_device_Networkdetails.add(lbl_serach_device_netwrok_tab_mngtipsubnetmask.getText().trim());
			OV_device_Networkdetails.add(lbl_serach_device_netwrok_tab_deftgateway.getText().trim());
			
			jsClick(tab_serach_device_Device_details);
			Thread.sleep(2000);
			str_device_name = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			List<String> DB_device_Networkdetails = ARMDB.update_ethernet_device_ManagementIPSubnetMask_defaultgateway_values(str_device_name.trim());
			System.out.println("OMNIVue Networkdetails values are "+OV_device_Networkdetails);
			if(OV_device_Networkdetails.containsAll(DB_device_Networkdetails)){
				System.out.println("OV Networkdetails attributes values are avaliable in database");	
			}else{
				System.out.println("OV Networkdetails attributes values are not avaliable in database");
			}
			System.out.println("Database Networkdetails values are "+DB_device_Networkdetails);
			if(DB_device_Networkdetails.containsAll(OV_device_Networkdetails)){
				System.out.println("Database attributes values are avaliable in Omnivue Device network details page");	
			}else{
				System.out.println("Database attributes values are not avaliable in Omnivue Device network details page");
			}
			break;
			
		case "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Device view":
								i=1;
								do{
									if(!getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contentjqxGrid')]//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div[9]/div")).getText().trim().isEmpty()){
										Message=getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contentjqxGrid')]//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div[9]/div")).getText().trim();
										jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contentjqxGrid')]//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]//input")));
										waitForElement(btn_device_Editbtn);
										Message=lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim();
										
										jsClick(btn_device_Editbtn);waitForElement(btn_device_edit_save);
										ddl_Edit_device_device_details_MCO.selectByVisibleText("WNPKFLDSLM");
										if(tbx_devicepage_edit_maxdwnspd.isCurrentlyVisible()){
											verify_validation("update Max Down Speed & Max Up Speed on the device");
										}
										jsClick(btn_device_edit_save);	waitForElement(btn_device_Editbtn);
										if(!lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim().equals("WNPKFLDSLM")){
											throw new Error("WNPKFLDSLM value is not getting updated in MCO field for Devices");
										}
										
										jsClick(btn_device_Editbtn);waitForElement(btn_device_edit_save);
										ddl_Edit_device_device_details_MCO.selectByVisibleText("MPLSMNDSLM");
										jsClick(btn_device_edit_save);	waitForElement(btn_device_Editbtn);
										if(!lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim().equals("MPLSMNDSLM")){
											throw new Error("WNPKFLDSLM value is not getting updated in MCO field for Devices");
										}
										
										jsClick(btn_device_Editbtn);waitForElement(btn_device_edit_save);
										ddl_Edit_device_device_details_MCO.selectByVisibleText("WPKFLETHEQ");
										jsClick(btn_device_edit_save);	waitForElement(btn_device_Editbtn);
										if(!lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim().equals("WPKFLETHEQ")){
											throw new Error("WNPKFLDSLM value is not getting updated in MCO field for Devices");
										}
										
										jsClick(btn_device_Editbtn);waitForElement(btn_device_edit_save);
										ddl_Edit_device_device_details_MCO.selectByVisibleText("MPLSMNETHQ");
										jsClick(btn_device_edit_save);	waitForElement(btn_device_Editbtn);
										if(!lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim().equals("MPLSMNETHQ")){
											throw new Error("WNPKFLDSLM value is not getting updated in MCO field for Devices");
										}
										
										jsClick(btn_device_Editbtn);waitForElement(btn_device_edit_save);
										ddl_Edit_device_device_details_MCO.selectByVisibleText(Message);
										jsClick(btn_device_edit_save);	waitForElement(btn_device_Editbtn);
										
										}
									i++;
									if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contentjqxGrid')]//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]//input"))){
										break;
									}
									
								}while(i!=0);break;
								
								

		case "Management IP Subnet Mask & default gateway values should display blank in Device details page":
						jsClick(tab_serach_device_Networking_details);
							waitForElement(lbl_serach_device_netwrok_tab_mngtipsubnetmask);
						if(!lbl_serach_device_netwrok_tab_mngtipsubnetmask.getText().trim().isEmpty()){
							throw new Error(lbl_serach_device_netwrok_tab_mngtipsubnetmask.getText().trim()+":Management IP Subnet mask is not blank");
						}
						
						if(!lbl_serach_device_netwrok_tab_deftgateway.getText().trim().isEmpty()){
							throw new Error(lbl_serach_device_netwrok_tab_deftgateway.getText().trim()+":Default gateway is not blank");
						}jsClick(tab_serach_device_Device_details); waitForElement(btn_device_Editbtn);
						break;
						
		case "change the Provision status to In-Service in Device details page":
							waitForElement(btn_device_Editbtn);
							Message=lbl_serach_device_device_details_tab_information_sec_Provision_status.getText().trim();
							
							jsClick(btn_device_Editbtn);waitForElement(ddl_devicepage_edit_provisionstatus);
							ddl_devicepage_edit_provisionstatus.selectByVisibleText("In Service");
							
							if(tbx_devicepage_edit_maxdwnspd.isCurrentlyVisible()){
								verify_validation("update Max Down Speed & Max Up Speed on the device");
							}
				
							jsClick(btn_device_edit_save);waitForElement(btn_device_Editbtn);
							break;
							
		case "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask in Device view page":
			if(!btn_device_Networkstab_save.isCurrentlyVisible()){
				jsClick(btn_device_Networkstab_edit);
			}
			waitForElement(btn_device_Networkstab_save);
			
			tbx_edit_device_netwrok_tab_mngtipsubnetmask.type("OMNIVUE123");
			tbx_edit_device_netwrok_tab_snmpportnumber.type("");
			ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");
			jsClick(btn_device_Networkstab_save);waitForElement(lbl_device_errormsg);
			Message = lbl_device_errormsg.getText();
			Message = Message.toString().substring(1);
			
					Message = Message.trim(); 
				if(!Message.contains("Please enter valid data for - Management IP Subnet Mask.")){
					throw new Error("Invalid message is displayed as:"+Message);
				}jsClick(btn_device_errormsg_clsicon);
				
				tbx_edit_device_netwrok_tab_mngtipsubnetmask.type("1.1.1.1.1");
				tbx_edit_device_netwrok_tab_snmpportnumber.type("");
				ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");
				jsClick(btn_device_Networkstab_save);waitForElement(lbl_device_errormsg);
				Message = lbl_device_errormsg.getText();
				Message = Message.toString().substring(1);
				
						Message = Message.trim(); 
					if(!Message.contains("Please enter valid data for - Management IP Subnet Mask.")){
						throw new Error("Invalid message is displayed as:"+Message);
					}jsClick(btn_device_errormsg_clsicon);
					
					tbx_edit_device_netwrok_tab_mngtipsubnetmask.type("256.256.256.256");
					tbx_edit_device_netwrok_tab_snmpportnumber.type("");
					ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");
					jsClick(btn_device_Networkstab_save);waitForElement(lbl_device_errormsg);
					Message = lbl_device_errormsg.getText();
					Message = Message.toString().substring(1);
					
							Message = Message.trim(); 
						if(!Message.contains("Please enter valid data for - Management IP Subnet Mask.")){
							throw new Error("Invalid message is displayed as:"+Message);
						}jsClick(btn_device_errormsg_clsicon); jsClick(btn_device_Networkstab_cancel); getDriver().switchTo().alert().accept();	waitForElement(btn_device_Networkstab_edit);break;
						
		case "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway in Device view page":
			if(!btn_device_Networkstab_save.isCurrentlyVisible()){
				jsClick(btn_device_Networkstab_edit);
			}
			waitForElement(btn_device_Networkstab_save);
			
			tbx_edit_device_netwrok_tab_deftgateway.type("OMNIVUE123");
			tbx_edit_device_netwrok_tab_snmpportnumber.type("");
			ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");
			jsClick(btn_device_Networkstab_save);waitForElement(lbl_device_errormsg);
			Message = lbl_device_errormsg.getText();
			Message = Message.toString().substring(1);
			
					Message = Message.trim(); 
				if(!Message.contains("Please enter valid data for - Default Gateway.")){
					throw new Error("Invalid message is displayed as:"+Message);
				}jsClick(btn_device_errormsg_clsicon);
				
				tbx_edit_device_netwrok_tab_deftgateway.type("1.1.1.1.1");
				tbx_edit_device_netwrok_tab_snmpportnumber.type("");
				ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");
				jsClick(btn_device_Networkstab_save);waitForElement(lbl_device_errormsg);
				Message = lbl_device_errormsg.getText();
				Message = Message.toString().substring(1);
				
						Message = Message.trim(); 
					if(!Message.contains("Please enter valid data for - Default Gateway.")){
						throw new Error("Invalid message is displayed as:"+Message);
					}jsClick(btn_device_errormsg_clsicon);
					
					tbx_edit_device_netwrok_tab_deftgateway.type("256.256.256.256");
					tbx_edit_device_netwrok_tab_snmpportnumber.type("");
					ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");
					jsClick(btn_device_Networkstab_save);waitForElement(lbl_device_errormsg);
					Message = lbl_device_errormsg.getText();
					Message = Message.toString().substring(1);
					
							Message = Message.trim(); 
						if(!Message.contains("Please enter valid data for - Default Gateway.")){
							throw new Error("Invalid message is displayed as:"+Message);
						}jsClick(btn_device_errormsg_clsicon); 
						jsClick(btn_device_Networkstab_cancel); 
						getDriver().switchTo().alert().accept();	
						waitForElement(btn_device_Networkstab_edit);
						break;
						
		case "enter valid Management IP subnet mask & Default gateway in Device view page":
			 Thread.sleep(2000);
			/*tbx_edit_device_netwrok_tab_mngtipsubnetmask.type("127.1.1.254"); 
			tbx_edit_device_netwrok_tab_deftgateway.type("127.1.1.255");*/
							System.out.println("Wait for edit");
			                Thread.sleep(2000);
							/*if(!btn_device_Networkstab_save.isCurrentlyVisible()){
								System.out.println("before clicking on edit button");
								jsClick(btn_device_Networkstab_edit);
							}*/
							waitForElement(btn_device_Networkstab_save);
							Thread.sleep(1000);
							enduser.fillMandatoryFields(fillfieldscls,enduser.get_container_from_xml("OVSearchDevicePage","TC246190","Update_networktab"));
							/*tbx_edit_device_netwrok_tab_mngtipsubnetmask.type("127.1.1.254"); 
							tbx_edit_device_netwrok_tab_deftgateway.type("127.1.1.255");
							tbx_edit_device_netwrok_tab_snmpportnumber.type("");
							ddl_edit_device_netwrok_tab_snmpversion.selectByVisibleText("--Select--");*/
							break;
							
		case "Device details and validate database":
			jsClick(tab_lasttab);
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
			Thread.sleep(2000);
			
		//	List<String> location_range_db_attributes = DBConnections.location_range_attributes_values(Range_id);
			deivce_details_db_attributes = ARMDB.device_details_attributes_values(str_device_name.trim());
			//System.out.println(deivce_details_db_attributes);
			//Thread.sleep(3000);
			for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
				for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
					if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
						slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
						
					}
				}
			}
		   break;
			
		case "Updated Device details and validate database":  
			str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			
			str_device_name.trim();
			System.out.println(str_device_name);
			
			deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_subscriber_information_sec_MCO.getText().trim());
			
			
			//deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_subscriber_information_sec_Affiliate_Owner.getText().trim());
			
			deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_id_update.getText().trim());
			//deivce_Fieldattributelist.add(tbx_maxsubscbandwidth.getText());
			//deivce_Fieldattributelist.add(tbx_maxsubscbandwidth_up.getText());
			deivce_details_db_attributes = ARMDB.update_ethernet_device_details_attributes_values(str_device_name.trim());
			


			for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
				for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
					if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
						slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
						
					}
				}
			}
			
			
			break;

		case "Updated Network details and validate database":
			
			
			
			deivce_Fieldattributelist.add(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Object_ID.getText().trim());
			
			
			deivce_Fieldattributelist.add(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Port_Number.getText().trim());
			
			deivce_Fieldattributelist.add(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Version.getText().trim());
			
			jsClick(tab_serach_device_Device_details);
			waitForElement(devcreatepage.btn_Edit);
			waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
			/*String str_device_name1 = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			str_device_name1.trim();*/
			
			str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			
			str_device_name.trim();
			System.out.println(str_device_name);
			
			//deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_subscriber_information_sec_Subscriber_id_update.getText().trim());
			//deivce_Fieldattributelist.add(tbx_maxsubscbandwidth.getText());
			//deivce_Fieldattributelist.add(tbx_maxsubscbandwidth_up.getText());
			deivce_details_db_attributes = ARMDB.update_ethernet_device_networkk_details_attributes_values(str_device_name.trim());
			
			for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
				for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
					if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
						slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
						
					}
				}
			}
			
			
			
			break;
			
case "Internal Vectoring  details and validate database":
			
			if(lbl_serach_device_netwrok_tab_vectoringtype.getText().trim().isEmpty()) {
				deivce_Fieldattributelist.add(lbl_search_device_olt_vectoringtype.getText().trim());
				//lbl_serach_device_netwrok_tab_vectoringtype.getText().trim().isEmpty();
				System.out.println("................."+lbl_search_device_olt_vectoringtype.getText().trim());
				
			}	
			else {
				
				deivce_Fieldattributelist.add(lbl_serach_device_netwrok_tab_vectoringtype.getText().trim());
				System.out.println("___________"+lbl_serach_device_netwrok_tab_vectoringtype.getText().trim());
			}
			
		//	deivce_Fieldattributelist.add(lbl_search_device_olt_vectoringtype.getText().trim());
			
			
			jsClick(tab_serach_device_Device_details);
			waitForElement(devcreatepage.btn_Edit);
				waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
				
				
				str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
				
				
				System.out.println(str_device_name);
				String deivce_name=str_device_name.trim();
				deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim());
				
				
				
				//hmap.put(deivce_vectoring_type, deivce_name);
				deivce_details_db_attributes=armdb.vectoring_type_validation_internal(deivce_name,"INTERNAL");
				
			//deivce_Fieldattributelist.equals(deivce_details_db_attributes);
				
			for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
					for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
						if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
							slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in GUI");
							slf4jLogger.info(deivce_Fieldattributelist.get(q)+" value is avaliable in Database");
						//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
							
						}
					}
				}
			if(!deivce_Fieldattributelist.equals(deivce_details_db_attributes)) {
				slf4jLogger.info("Values in DB and UI not matched ");
				throw new Error("Vectoring Values in DB and device details  page did not  match ");
				
			}
				
			
				
				break;	
case "External Vectoring  details and validate database":
	
	if(lbl_serach_device_netwrok_tab_vectoringtype.getText().trim().length()<=8) {
		deivce_Fieldattributelist.add(lbl_search_device_olt_vectoringtype.getText().trim());
		deivce_Fieldattributelist.add(lbl_search_device_olt_vectoringtopology.getText().trim());
		//lbl_serach_device_netwrok_tab_vectoringtype.getText().trim().isEmpty();
		
	}	
	else {
		
		deivce_Fieldattributelist.add(lbl_serach_device_netwrok_tab_vectoringtype.getText().trim());
		deivce_Fieldattributelist.add(lbl_serach_device_netwrok_tab_vectoringtopology.getText().trim());
		
	}
	
	//deivce_Fieldattributelist.add(lbl_search_device_olt_vectoringtype.getText().trim());
	//deivce_Fieldattributelist.add(lbl_search_device_olt_vectoringtopology.getText().trim());
	jsClick(tab_serach_device_Device_details);
	waitForElement(devcreatepage.btn_Edit);
		waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
		
		
		str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
		
		
		System.out.println(str_device_name);
		String deivce_name1=str_device_name.trim();
		//hmap10.put(deivce_vectoring_type1, deivce_vectoring_topoloy1);
		deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim());
	
	
	deivce_details_db_attributes=armdb.vectoring_type_validation_internal(deivce_name1,"EXTERNAL");
	
	for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
		for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
			if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
				slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in UI");
				slf4jLogger.info(deivce_Fieldattributelist.get(q)+" value is avaliable in Database");
			//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
				
			}
		}
	}
		
	
	if(!deivce_Fieldattributelist.equals(deivce_details_db_attributes)) {
		slf4jLogger.info("Values in DB and UI not matched ");
		throw new Error("Vectoring Values in DB and device details  page did not  match");
		
	}
	
		break;	
		}
		
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		} 

	}
	
	public void functionalStatus_value_In_DB()
	{
		
		ArrayList<String> deivce_Fieldattributelist=new ArrayList<String>();
		String str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();;
		List<String> deivce_details_db_attributes;
		deivce_Fieldattributelist.add(ddl_search_device_device_details_functinalStatus.getText().trim());
		
		
		deivce_details_db_attributes=armdb.validate_functionalStatusOfDevice_db(str_device_name);
		
		for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
			for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
				if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
					slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
				//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					
				}
			}
		}
			
		
		if(!deivce_Fieldattributelist.equals(deivce_details_db_attributes)) {
			slf4jLogger.info("Values in DB and UI not matched ");
			throw new Error("Vectoring Values in DB and device details  page did not  match");
			
		}
		
	}
	
	public void MGMTVLAN_value_In_DB()
	{
		
		ArrayList<String> deivce_Fieldattributelist=new ArrayList<String>();
		String str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();;
		List<String> deivce_details_db_attributes;
		deivce_Fieldattributelist.add(lbl_serach_device_device_details_tab_ip_information_sec_Management_VLAN.getText().trim());
		
		
		deivce_details_db_attributes=armdb.validate_MGMTVLAN_OfDevice_db(str_device_name);
		
		for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
			for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
				if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
					slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
				//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					
				}
			}
		}
			
		
		if(!deivce_Fieldattributelist.equals(deivce_details_db_attributes)) {
			slf4jLogger.info("Values in DB and UI not matched ");
			throw new Error("Vectoring Values in DB and device details  page did not  match");
			
		}
		
	}
	
	
	
	public void validate_OVER_SUBSCRIPTION_AMOUNT_and_SUPPORTS_OVER_SUBSCRIPTION()
	{
		String Flag ="Y";
		
		ArrayList<String> deivce_Fieldattributelist=new ArrayList<String>();
		String str_device_name=lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();;
		List<String> deivce_details_db_attributes;
		if (Flag.equalsIgnoreCase("Y")) {
			deivce_Fieldattributelist.add("Y");
		}
		else
		{
			deivce_Fieldattributelist.add("N");
		}
		
		
		
		deivce_details_db_attributes=armdb.validate_OVER_SUBSCRIPTION_AMOUNT_and_SUPPORTS_OVER_SUBSCRIPTION_DB(str_device_name);
		
		for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
			for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
				if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
					slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
				//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					
				} 
			}
		}
			
		
		if(!deivce_Fieldattributelist.equals(deivce_details_db_attributes)) {
			slf4jLogger.info("Values in DB and UI not matched ");
			throw new Error("Vectoring Values in DB and device details  page did not  match");
			
		}
		
	}
	public void search_passive_device() throws Throwable{
		Thread.sleep(3000);
		String passivedevice= lbl_passive_devicename.getText();
		actvtnpage.tbx_googlesearchdata.type(passivedevice);
		jsClick(actvtnpage.btn_googlesearchdata_go);
		Thread.sleep(3000);
	}
	
	public void click_Editbtn(String button) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),100);				   
		try {
		//tab_mainTab);
		Thread.sleep(3000);
		switch(button){
		case "Edit": jsClick(btn_device_Editbtn);Thread.sleep(3000);
					 wait.until(ExpectedConditions.visibilityOf(btn_device_edit_save)); break;
		case "Save": jsClick(btn_device_edit_save);Thread.sleep(3000);
					 wait.until(ExpectedConditions.visibilityOf(btn_device_Editbtn)); break;
		case "Delete": waitForElement(btn_device_Editbtn);jsClick(btn_deletebutton);
		 			   wait.until(ExpectedConditions.visibilityOf(btn_Device_delete_Yes));
		 			  
		 			  
		 			   break;
		case "Delete-action":waitForElement(btn_device_Editbtn);jsClick(btn_deletebutton);
		   				waitForElement(btn_Device_delete_Yes);jsClick(btn_Device_delete_Yes); 
		   				Thread.sleep(5000);
		   				
		   				if(!lbl_device_errormsg.isCurrentlyVisible()){
		   				 wait.until(ExpectedConditions.visibilityOf(lbl_Device_delete_success_window));
		   				}
		   				
		   				break;
		case "Network Tab-Edit":
						if(!btn_serach_device_network_details_tab_edit_device_details.isCurrentlyVisible()){
							jsClick(tab_serach_device_Networking_details);
						}			
				waitForElement(btn_serach_device_network_details_tab_edit_device_details);
				jsClick(btn_serach_device_network_details_tab_edit_device_details);
				waitForElement(btn_device_Networkstab_save);
			
						break;
						
		case "Network Tab-Save": jsClick(btn_device_Networkstab_save);
									waitForElement(btn_serach_device_network_details_tab_edit_device_details);break;
		case  "Edit-Network details":waitForElement(btn_serach_device_network_details_tab_edit_device_details);
										jsClick(btn_serach_device_network_details_tab_edit_device_details);
										waitForElement(btn_device_Networkstab_save);break;
										
		case "Reserve Port":jsClick(btn_deviceportRT_shelfexpand_reserveport);
		                  System.out.println("btn_deviceportRT_shelfexpand_reserveport clicked");
							waitForElement(btn_deviceportRT_shelfexpand_reserveport_Save);break;
		case "Managed Port Reservation": jsClick(btn_deviceportRT_shelfexpand_Manageportreservation);
										waitForElement(btn_deviceportRT_shelfexpand_reserveport_Save);
                                         jsClick(btn_deviceportRT_shelfexpand_reserveport_Save);
										break;
		case "Device port Expand":waitForElement(btn_shelfexpand);
									jsClick(btn_shelfexpand);
									waitForElement(btn_deviceportRT_shelfexpand_Addcard);break;
		case "Device port2 Expand": waitForElement(btn_shelfexpand2);
									jsClick(btn_shelfexpand2);
									waitForElement(btn_deviceportRT_shelfexpand_Addcard);break;
		
		case "Add Card":waitForElement(btn_deviceportRT_shelfexpand_Addcard);
							jsClick(btn_deviceportRT_shelfexpand_Addcard);
							waitForElement(btn_deviceportRT_shelfexpand_Addcard_addcarddetails);break;
		case "Bulk Port Update":waitForElement(btn_deviceportRT_bulkportupdate); Thread.sleep(2000); 
								jsClick(btn_deviceportRT_bulkportupdate);Thread.sleep(2000); 
								waitForElement(btn_bulkportupdate_showports); Thread.sleep(1000);break;
		case "Show Ports":waitForElement(btn_bulkportupdate_showports);
							jsClick(btn_bulkportupdate_showports);Thread.sleep(1000);	
							waitForElement(cbx_bulkportupdate_select);	break;
		case "Save Bulk Ports":jsClick(btn_bulkportupdate_showports_Save);Thread.sleep(1000);
								waitForElement(lbl_bulkportupdate_showports_alertmsg);	Thread.sleep(1000);break;
		case "Add Contained Devices":waitForElement(btn_deviceportRT_shelfexpand_add_containeddevice); 
									jsClick(lbl_deviceportRT_shelfexpand);Thread.sleep(2000); 
										jsClick(btn_deviceportRT_shelfexpand_add_containeddevice); Thread.sleep(1000);
										waitForElement(btn_deviceportRT_shelfexpand_add_containeddevice_searchdevice);break;
		}	
		
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
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
	
	public void jshoveraction(WebElement element)  throws Throwable {
		//WebDriverWait wait = new WebDriverWait(getDriver(),100);	
		Actions action = new Actions(getDriver());
		
			action.moveToElement(element).build().perform();
	       
	       
	        Thread.sleep(1000);
	        
		
        
	}
	
	
	public void validatelogs_db(String arg1) throws Throwable {
		String arg01;
		String arg02;
		//String url;
		
		switch(arg1) {
		case "Delete Device":
			arg01="Delete";
			/*url=getDriver().getCurrentUrl();
			if(url.contains("test1")) {
				 arg01="Delete";
			}else {
				 arg01="DELETE";
				
			}*/
			String device=devcreatepage.create_device_successfull_msg();
			//String str_device_name = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			device.trim();
			List<String> deivce_delete_audit_value = OmnivueDB.audit_log_details(device.trim(),arg01);
			if(arg01.equalsIgnoreCase(deivce_delete_audit_value.get(0))){
				slf4jLogger.info(arg01+" Action Type  value is avaliable in Database");
				//System.out.println(arg1+" Action Type  value is avaliable in Database");
			
			}
			
			break;
			
		case "Create Device":
			arg01="Create";
			/* url=getDriver().getCurrentUrl();
			if(url.contains("test1")) {
				 arg01="Create";
				
			}else {
				 arg01="CREATE";
				
			}*/
						
			jsClick(tab_serach_device_Device_details);
			waitForElement(devcreatepage.btn_Edit);
			waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
			String device_name = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			device_name.trim();
			//System.out.println(str_device_name);
			
			List<String> deivce_details_db_attributes = OmnivueDB.audit_log_details(device_name.trim(),arg01);
			/*System.out.println(deivce_details_db_attributes);
			Thread.sleep(3000);
			System.out.println(arg1);
			System.out.println(deivce_details_db_attributes.get(0));*/
					
			if(arg01.equalsIgnoreCase(deivce_details_db_attributes.get(0))){
				slf4jLogger.info(arg1+" Action Type  value is avaliable in Database");
				//System.out.println(arg1+" Action Type  value is avaliable in Database");
			
			}
			break;
		
		
		case "Update Device":
			 arg02="Update";
			/* url=getDriver().getCurrentUrl();
			if(url.contains("test1")) {
				
				
			}else {
				 arg02="UPDATE";
				
			}*/
			
			jsClick(tab_serach_device_Device_details);
			waitForElement(devcreatepage.btn_Edit);
			waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
			String str_device_name1 = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
			str_device_name1.trim();
			//System.out.println(str_device_name);
			
			List<String> deivce_details_db_attributes1 = OmnivueDB.audit_log_details(str_device_name1.trim(),arg02);
			/*System.out.println(deivce_details_db_attributes);
			Thread.sleep(3000);
			System.out.println(arg1);
			System.out.println(deivce_details_db_attributes.get(0));*/
					
			if(arg1.equalsIgnoreCase(deivce_details_db_attributes1.get(0))){
				slf4jLogger.info(arg1+" Action Type  value is avaliable in Database");
				//System.out.println(arg1+" Action Type  value is avaliable in Database");
			
			}
			break;
		
		}
		
	
		
	
	}
	
	
	public  void validate_tp() throws Throwable{
		String route_name=lbl_route_name.getText().trim();
		jsClick(lbl_route_name);
		if(!lbl_route_name.isPresent()) {
			throw new Error("Transport path details is not displayed");
			
		}
		if(!lbl_start_device_tp.isPresent())
		{
			throw new Error("Start device name is not displayed");
		}
		String device =lbl_start_device_tp.getText().trim();
		
		List<String> deivce_details_db_attributes = ARMDB.validate_transport_path_db(device);
		if(route_name.equalsIgnoreCase(deivce_details_db_attributes.get(0))){
			slf4jLogger.info(route_name +"Transport path details matched in DB and UI");
			//System.out.println(arg1+" Action Type  value is avaliable in Database");
		
		}
		
		
		
		}
	
	public void device_vectoring_type(String field) throws Throwable{
		ArrayList<String> deivce_Fieldattributelist=new ArrayList<String>();
		List<String> deivce_details_db_attributes1=null;
		String arg02;
		jsClick(tab_serach_device_Device_details);
		waitForElement(devcreatepage.btn_Edit);
		waitForElement(lbl_serach_device_device_details_tab_identifier_sec_device_name);
		String str_device_name1 = lbl_serach_device_device_details_tab_identifier_sec_device_name.getText();
		str_device_name1.trim();
		deivce_Fieldattributelist.add(str_device_name1.trim());
		
		deivce_Fieldattributelist.add(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Object_ID.getText().trim());
	
		
		switch(field) {
		
		case "Internal":
			 arg02="Internal";
			
			 deivce_details_db_attributes1 = armdb.vectoring_type_validation_internal(str_device_name1.trim(),arg02);
			
			break;
			
		case "External":	
			deivce_Fieldattributelist.add(lbl_serach_device_network_details_tab_Network_Information_2_SNMP_Object_ID.getText().trim());
			arg02="External";
			deivce_details_db_attributes1 = armdb.vectoring_type_validation_internal(str_device_name1.trim(),arg02);
			
			
			break;
		
					}
		
		for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
			for(int q=0; q<=deivce_details_db_attributes1.size()-1; q++){
				if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes1.get(q))){
					slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
				//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
					
				}
			}
		}
		
	
		
		
		
	}
	
	 public  void manual_task_validation_device()throws Throwable{
		 
		 ArrayList<String> deivce_taskattributelist=new ArrayList<String>();
		 
		 jsClick(btn_device_leftarrow);
			Thread.sleep(3000);
			int count1 = lbl_device_RT_task_count.size()+1;
			System.out.println(count1);
			String taskid = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttabletaskGrid')]/div/div["+count1+"]/div")).getText();
			System.out.println(taskid);
			int count2 =lbl_device_RT_task_name_count.size()+1;
			String taskname = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttabletaskGrid')]/div/div["+count2+"]/div")).getText();
			System.out.println(taskname);
			deivce_taskattributelist.add(taskid.trim());
			deivce_taskattributelist.add(taskname.trim());
			List<String> deivce_task_db_values = ovdb.manual_task_validation_db(taskid.trim());
			
			for(int p=0; p<=deivce_taskattributelist.size()-1; p++){
				for(int q=0; q<=deivce_task_db_values.size()-1; q++){
					if(deivce_taskattributelist.get(p).equalsIgnoreCase(deivce_task_db_values.get(q))){
						slf4jLogger.info(deivce_taskattributelist.get(p)+" value is avaliable in Database");
					//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
						
					}
				}
			}
		 
	}
	 
	 public void locationaddress_in_advance_devicesearch(String Location) throws Throwable{
         tbx_advance_search_deviceLctnAddress.type(Location);
         
         waitForElement(ddl_advance_search_deviceLctnAddress_solr1);
         
         ddl_advance_search_deviceLctnAddress_solr1.click();
  }
  public void validate_device_search_results_page() throws Throwable{
         jsClick(btn_advance_device_search);
         Thread.sleep(4000);
         if(!tab_device_search_active_page.getText().contains("Device Advanced Search")){
                if(tab_device_search_active_page.getText().contains("Device Search Results")){
                      Thread.sleep(2000);
                      //waitForElement(actvtnpage.btn_view);
                      if(actvtnpage.btn_view.isCurrentlyVisible()){
                      System.out.println("More than 1 device is avaliable in locations");
                      }else{
                             System.out.println("Getting Error message like - "+lbl_device_resultpage_errormsg.getText());
                      }
                }else{
                      waitForElement(lbl_deviceName);
                      System.out.println("Opend device name is "+lbl_deviceName.getText());
                }
         }else{
                System.out.println("Getting Error in Device Advanced search page");
         }
  }
  public void Enter_devicename_in_advancesearch() throws Throwable{
         tbx_devicename.sendKeys("LSVGNV");
         
         waitForElement(ddl_devicename_solr1);
         
         String devicename = ddl_devicename_solr1.getText();
         
         jsClick(actvtnpage.lnk_Advanced_Search);
         
         tbx_devicename_advancesearch.type(devicename);
         
         jsClick(btn_advance_device_search);
         Thread.sleep(3000);
         
         waitForElement(lbl_deviceName);
         
         if(lbl_deviceName.getText().contains(devicename)){
                System.out.println("Device opened as expected");
         }
  }
  public void Detailtab_Device_Edit_Vectoring_device(String VECTORING_TYPE,String Vectoring_Topology) throws InterruptedException{
		
		ddl_edit_device_netwrok_tab_vectoringtype.selectByVisibleText(VECTORING_TYPE);	
		
			 
		if (VECTORING_TYPE.contains("External")) {
			
			
		   if(Vectoring_Topology.contains("Create Vectoring Topology")) {
			
		ddl_edit_device_netwrok_tab_vectoringtopology.selectByVisibleText(Vectoring_Topology);
				 
				// System.out.println(tbx_edit_device_Newvectortopolgy.getSelectedValue());
				 
			System.out.println("Vectoring: "+tbx_edit_device_Newvectortopolgy.getTextValue());
				 
			   tbx_edit_device_vectortopolgyNote.sendKeys("Test");
				 
			   button_edit_device__Newvectortopolgy.waitUntilClickable();
				 
						 
				// Thread.sleep(5000);s

				 jsClick(button_edit_device__Newvectortopolgy);	   
			   
		}
		 else{
			   Thread.sleep(10000);
			   //ddl_edit_device_netwrok_tab_vectoringtopology.selectByVisibleText(Vectoring_Topology);
			   ddl_edit_device_netwrok_tab_vectoringtopology.selectByIndex(3);
		   }
	
			 
			
		}
			 
		

	}
  public void validate_mco_device_search_db(String mco_val) {
		
		 String list = lbl_device_search_count.getText();
      String count[] = list.split(" of ");
      int OV_Count =Integer.parseInt(count[1]);

      
     // List<WebElement> OV_Services_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttableserviceGrid')]/div/div[2]/div"));
      String DB_device_cnt = ARMDB.device_mco_search(mco_val);
      System.out.println("No of devices displayed in search page in OV: "+OV_Count);
      System.out.println("No of Services in Database: "+DB_device_cnt);
      int db_cnt=Integer.parseInt(DB_device_cnt);
      if(OV_Count==db_cnt) {
     	 System.out.println("Device count matched with database");
      }else throw new Error("Device count not matched with database");


      
     
		
	}	
	
		
	
	
}
