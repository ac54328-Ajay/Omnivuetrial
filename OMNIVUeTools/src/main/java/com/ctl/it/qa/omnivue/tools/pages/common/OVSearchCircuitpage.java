package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OSRDB;
//import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchCircuitpage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	OVOrderPage orderpage;
	OVLoginPage loginPage;
	OVCreateDevicePage devcreatepage;
	ARMDB armdb;
	OSRDB osrdb;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
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
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='circuitToCircuitType']")
			public WebElementFacade ddl_advance_circuit_Search_circuittype;
	
	@FindBy(xpath = "//*[@ng-click='onClickTab(tab)' and contains(text(),'Circuit Search Results')]")
			public WebElementFacade tab_circuit_advance_search_result;
	
	@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']")
			public WebElementFacade tab_search_result_details; 
	
	@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']/../../preceding-sibling::li[1]//tab-heading")
	public WebElementFacade tab_search_result_details_previous; 
	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading[contains(text(),'Circuit Advanced Search')]")
	public WebElementFacade tab_circuit_advance_search;
	
	@FindBy(xpath = ".//label[text()='Name %']/following-sibling::input[@ng-model='searchParam.circuitName']")
    public WebElementFacade lbl_search_circuit_name;

	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'contenttablejqxGrid')]/div[1]/div[5]/div")
	public WebElementFacade lbl_search_result_startdevice; 
	
	//*********************************************		Advance circuit searh  ***************************************//
	
	@FindBy(xpath = ".//label[text()='Device Name %']/..//*[@id='deviceNameForCircuit']")
	public WebElementFacade tbx_advancesearch_devicename; 
	
	//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='2']//button[@value='Search']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@value='Search']")
	public WebElementFacade btn_advancesearch_Search; 
	
	//*************************************************** Circuit General Sections *****************************************************************************//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Name']/../../following-sibling::span//label")
			public WebElementFacade lbl_circuitsearch_circuitname;
	
	@FindBy(xpath = "(//*[@ng-click='onClickTab(tab)'])[2]")
	public WebElementFacade tab_circuitCreate_circuitname;

	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Circuit Type']/../../following-sibling::span//label")
			public WebElementFacade lbl_circuitsearch_circuittype;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Provision Status']/../../following-sibling::span//label")
			public WebElementFacade lbl_circuitsearch_provisionstatus;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Start Device Name']/../../following-sibling::span//a")
			public WebElementFacade lbl_circuitsearch_startdevicename;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='End Device Name']/../../following-sibling::span//a")
	public WebElementFacade lbl_circuitsearch_enddevicename; 
	
	@FindBy(xpath="//label[contains(text(), 'Available Bandwidth(Mbps)')]/../../..//div/label")
	public WebElementFacade lbl_viewcircuit_AvailableBandwidth; 
	
	@FindBy(xpath="//label[contains(text(), 'Provisioned Bandwidth(Mbps)')]/../../..//div/label")
	public WebElementFacade lbl_viewcircuit_ProvisionedBandwidth; 
	
	@FindBy(xpath="//label[contains(text(), 'Available Bandwidth(Mbps)')]/../../..//input")
	public WebElementFacade tbx_editcircuit_AvailableBandwidth; 
	
	@FindBy(xpath="//label[contains(text(), 'Provisioned Bandwidth(Mbps)')]/..//input")
	public WebElementFacade tbx_editcircuit_ProvisionedBandwidth; 
	
	//************************************************************************************************************************************************************//
	
	//###############################################################		Search Circuit View Sanity Validation  #######################################################//
	
	//--------------------------------------------------------------		Search Circuit Tab ---------------------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Circuit Details')]")
	public WebElementFacade tab_circuitview_circuitdetails;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_circuitview_auditlogs; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[text()='ARM Audit Logs']")
	public WebElementFacade tab_circuitview_auditlogs_ARM_auditlogs;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getDeviceAuditLog()']")	
	public WebElementFacade btn_serach_Circuit_Audit_log_tab_ARM_getlog;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//li[@class='ng-isolate-scope active']//a[text()='ARM Audit Logs']")
	public WebElementFacade tab_circuitview_auditlogs_ARM_auditlogs_Active;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")	
	public WebElementFacade btn_serach_Circuit_Audit_log_tab_getlog;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-show='arm_audit_loader']")
	public WebElementFacade lbl_serach_Circuit_Audit_log_tab_getlog_loader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-controller='viewAuditLogCtrl']//input[@ng-model='auditLogRequest.getLogsFromArchive']")
	public WebElementFacade cbx_serach_Circuit_ARM_Audit_log_FromArchive;
	
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[text()='OmniVue Audit Logs']")
	public WebElementFacade tab_circuitview_auditlogs_OMNIVUE_auditlogs;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//li[@class='ng-isolate-scope active']//a[text()='OmniVue Audit Logs']")
	public WebElementFacade tab_circuitview_auditlogs_OMNIVUE_auditlogs_Active; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-controller='auditLogCtrl']//i[@ng-click='printGridData()']")
	public WebElementFacade btn_serach_circuitview_audit_log_arm_omnivue_log_print;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-controller='auditLogCtrl']//i[@ng-click='exportToExcel()']")
	public WebElementFacade btn_serach_circuitview_audit_log_arm_omnivue_log_excel;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-controller='auditLogCtrl']//i[@ng-click='init()']")
	public WebElementFacade btn_serach_circuitview_audit_log_arm_omnivue_log_refresh;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_serach_circuitview_Omnivue_Audit_log_tab_getlog; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-controller='auditLogCtrl']//label[contains(text(),'From')]/preceding-sibling::input")
	public WebElementFacade cbx_serach_circuitview_Omnivue_Audit_log_tab_FromArchive;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[@ng-show='init_loader']")
	public WebElementFacade lbl_serach_circuitview_Omnivue_Audit_log_tab_getlog_loader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[text()='No Audit Logs.']")
	public WebElementFacade lbl_serach_circuitview_Audit_log_tab_errormsg;
	@FindBy(xpath="//*[@ng-show='showNoDataDiv']")
	public WebElementFacade lbl_arm_nodata_errormsg;
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	//--------------------------------------------------------------		Search Circuit Actions  ---------------------------------------------------------------------------//
	
	//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-click='switchToEditCircuit();']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditCircuit();']")
	public WebElementFacade btn_circuitview_edit;
	
	//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-click='openDeleteCircuit();']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='openDeleteCircuit();']")
	public WebElementFacade btn_circuitview_delete; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveCircuit();']")
	public WebElementFacade btn_circuitview_save; 
	
	
	
	/*@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='CIRCUIT2PROVISIONSTATUS']")
	public WebElementFacade ddl_ProvisionStatus_EditEthernetBearer;*/ 
	
	/*@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='CIRCUIT2PROVISIONSTATUS']")
	public WebElementFacade ddl_mco_EditEthernetBearer;*/
	
	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='CIRCUITSERVICETYPE']")
	public WebElementFacade ddl_CIRCUITSERVICETYPE_EditEthernetBearer;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='CIRCUIT2PROVISIONSTATUS']")
	public WebElementFacade ddl_ProvisionStatus_EditOpticalBearer; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='MCO']")
	public WebElementFacade ddl_MCO_EditOpticalBearer; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='resetCircuit();']/i")
	public WebElementFacade btn_circuitview_cancel; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='CIRCUIT2PROVISIONSTATUS']")
	public WebElementFacade ddl_ProvisionStatus_EditEthernetBearer; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='mco']")
	public WebElementFacade ddl_mco_EditEthernetBearer;
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	//############################################		Circuit View page ###########################################################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[text()='MCO']/../../following-sibling::span//label")
	public WebElementFacade lbl_circuitview_mco; 
	
	
	
	//#######################################################################################################################//	
	//############################################		Circuit Edit page ###########################################################//
	

	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='NAME']")
	public WebElementFacade tbx_circuit_editview_name; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS1']")
	public WebElementFacade tbx_circuit_editview_alias1; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS2']")
	public WebElementFacade tbx_circuit_editview_alias2; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@id='MCO']")
	public WebElementFacade ddl_circuit_editview_mco; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@id='mco']")
	public WebElementFacade ddl_circuit_editview_mco_2; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='BW']")
	public WebElementFacade tbx_circuit_editview_bandwidth; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='BANDWIDTH']")
	public WebElementFacade tbx_circuit_editview_provisionbandwidth; 
	 
	//#######################################################################################################################//	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
	public WebElementFacade tab_services; 
	
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
	
	//Newly Added By MOHIT
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
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	//#####################################################################		Transport Path page ###########################################################//
	
	
	@FindBy(xpath=".//*[text()='Start Device Name']/../../following-sibling::span//a")
	public WebElementFacade lbl_TPView_startdevicename_hyperlink;
	
	@FindBy(xpath=".//*[text()='Start Device Full Name']/../../following-sibling::span//label")
	public WebElementFacade lbl_TPView_startdevice_fullname;
	
	
	//################################################################################################################################################//
	
	//#####################################################################		Alert message on the left side  ###########################################################//
	
	 @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
	    public WebElementFacade lbl_alertmsg; 
	    
	 @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]/button")
	    public WebElementFacade btn_alertmsg_closeicon; 
	    
	  //################################################################################################################################################//	
	 
	 
	 //##############################################Device Related tab###################################
	
			 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'select()')])[1]")
			    public WebElementFacade tab_device_one; 
			 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'select()')])[2]")
			    public WebElementFacade tab_device_two;
			 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'openDeviceDetails()')])[1]")
			    public WebElementFacade lbl_devicename_one; 
			 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'openDeviceDetails()')])[2]")
			    public WebElementFacade lbl_devicename_two;
	 
	
	//#####################################################################		Circuits Related Tab   ###########################################################//
	 
	 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input)[1]")
	 public WebElementFacade btn_RT_view;    
	 
	 
	 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input/../../../div[2]/div)[1]")
	 public WebElementFacade lbl_Circuit_RT_name; 
	 
	
//################################################################################################################################################//
	 
//#####################################################################		Service Related Tab   ###########################################################//
	 
		 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Service'])[1]")
		 public WebElementFacade btn_Service_RT_view;    
		 
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
			public WebElementFacade btn_edit_service_viewpage;
			
			
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='previous']/div")
			public WebElementFacade btn_Service_RT_previous;
			
					
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'select()')])[2]")
			public WebElementFacade btn_Service_refresh;
		
//################################################################################################################################################//
		 

//#####################################################################		Service Related Tab   ###########################################################//
			 
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Subscriber']")
	public WebElementFacade btn_Subscriber_RT_view;    
			 
			
//################################################################################################################################################//
	
//#####################################################################		Advance circuit screen   ###########################################################//	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='circuitRequest.userIdForAudit']")
	public WebElementFacade tbx_advanceCircuit_createdid;   
	 
	 
	 
	public void advance_circuit_search(String circuittype)throws Throwable{
	//	orderpage.waitForElement(elementToBeLoaded);
		ddl_advance_circuit_Search_circuittype.selectByVisibleText(circuittype);
	}
	
	public String circuit_advancesearch_searchslider(String circuitsearch) throws Throwable{
		String validationvalue=null;
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
	//	int i=1;
		
		if(tab_circuit_advance_search_result.isCurrentlyVisible()){
			if(circuitsearch.equals("Circuit Name")){
				validationvalue="Name";
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
			throw new Error("Circuit Advance Search page is not visible");
		}
		
		return validationvalue;
	}

	
	public void tabname_validations() throws Throwable {
		if(devcreatepage.btn_Edit.isCurrentlyVisible()){
			if(tab_search_result_details.getText().replaceAll("\\s+$", "").equals(lbl_circuitsearch_circuitname.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Circuit Name & Tab name is matching");
				} else {
					throw new Error("Circuit Name is not matching");
				}
		}
		
	}
	
	public void search_tab_validations_with_Advancesearch() throws Throwable {
		String name=null,provisioningstatus=null,circuittype=null,startdevice=null,enddevice=null;
		String tableheader=".//*[contains(@id,'contentjqxGrid')]/div[1]/div[1]/div[";
		String fieldvalue=".//*[contains(@id,'contenttablejqxGrid')]/div[1]/div[";
		//String validation=null;
		
 
		if(tab_circuit_advance_search_result.isCurrentlyVisible()){
			
			String circuitname=tab_search_result_details.getText().replaceAll("\\s","");
			
			
			jsClick(tab_circuit_advance_search_result);
			
			int j=1;
			while(j!=0){
				switch(loginPage.getDriver().findElement(By.xpath(tableheader+j+"]//span")).getText().replaceAll("\\s","")){
				case "Name": name=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found Name Position:"+j);break;
								 
				case "ProvisioningStatus": provisioningstatus=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText().replaceAll("\\s",""); slf4jLogger.info("Found ProvisioningStatus Position:"+j); break;
				case "CircuitType": circuittype=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText().replaceAll("\\s",""); slf4jLogger.info("Found CircuitType Position:"+j); break;
				case "StartDevice": startdevice=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found StartDevice Position:"+j); break;
				case "EndDevice": enddevice=loginPage.getDriver().findElement(By.xpath(fieldvalue+j+"]/div")).getText(); slf4jLogger.info("Found EndDevice Position:"+j); break;
				default: break;
				}
				
				
				j++;
				
				if(!loginPage.isElementVisible(By.xpath(tableheader+j+"]//span"))){
					slf4jLogger.info("Break");
					break;
				}
				
			}
			slf4jLogger.info("Name:"+name);
			slf4jLogger.info("ProvisioningStatus:"+provisioningstatus);
			slf4jLogger.info("CircuitType:"+circuittype);
			slf4jLogger.info("StartDevice:"+startdevice);
			slf4jLogger.info("EndDevice:"+enddevice);
			
			jsClick(loginPage.getDriver().findElement(By.xpath(".//*[@class='nav nav-tabs']//*[@ng-repeat='tab in tabs']//*[@ng-click='onClickTab(tab)' and contains(text(),'"+circuitname+"')]")));
			
			orderpage.waitForElement(devcreatepage.btn_Edit);
			
			
			if(name.equals(lbl_circuitsearch_circuitname.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Circuit name is matching");
			} else {
				throw new Error("Circuit name is not matching");
			}			 
			
			if(provisioningstatus.equals(lbl_circuitsearch_provisionstatus.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Provisioning Status is matching");
			} else {
				throw new Error("Provisioning Status is not matching");
			}
			
			if(circuittype.equals(lbl_circuitsearch_circuittype.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Circuit Type is matching");
			} else {
				throw new Error("Circuit Type is not matching");
			}
			
			if(startdevice.equals(lbl_circuitsearch_startdevicename.getText().replaceAll("\\s",""))){
				slf4jLogger.info("Start Device name is matching");
			} else {
				throw new Error("Start Device name is not matching");
			}
			
			if(enddevice.equals(lbl_circuitsearch_enddevicename.getText().replaceAll("\\s",""))){
				slf4jLogger.info("End Device name is matching");
			} else {
				throw new Error("End Device name is not matching");
			}
		}
		
	}
	
	public void Circuittab_namevalidation() throws Throwable {
		waitForElement(lbl_circuitsearch_circuitname);
		
		 
		 String Circuitname=tab_search_result_details.getText().replaceAll("\\s+$", "");
			waitForElement(lbl_circuitsearch_circuitname); Thread.sleep(2000);
			if(lbl_circuitsearch_circuitname.getText().replaceAll("\\s+$", "").contains(Circuitname)){
				slf4jLogger.info("Circuit Tab Name "+Circuitname+" is matching with the Service Text field");
			} else throw new Error("Circuit name "+lbl_circuitsearch_circuitname.getText().replaceAll("\\s+$", "")+" is not matching with Tab name "+Circuitname);
	}
	
	public void Circuit_search_Sanity_Validation() throws Throwable {
		waitForElement(btn_circuitview_edit); Thread.sleep(2000);
		Circuittab_namevalidation();
		
		if(!tab_circuitview_circuitdetails.isCurrentlyVisible()){
			throw new Error("Circuit details tab is not displayed in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_circuitview_auditlogs.isCurrentlyVisible()){
			throw new Error("Circuit Audit logs tab is not displayed in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!btn_circuitview_edit.isCurrentlyVisible() && !btn_circuitview_edit.isCurrentlyEnabled()){
			throw new Error("Edit button in circuit is not displayed in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!btn_circuitview_delete.isCurrentlyVisible() && !btn_circuitview_delete.isCurrentlyEnabled()){
			throw new Error("Delete button in circuit is not displayed in "+lbl_circuitsearch_circuittype.getText());
		}
		
		 
		//#################################		Related Tab validations  ###############################################//
		
		//################################ Related Tabs Validations in Circuit view ############################################//
		  
		
		if(!tab_Activations.isCurrentlyVisible() ){
			throw new Error("Activation Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_Armor.isCurrentlyVisible() ){
			throw new Error("ARMOR Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_bamreport.isCurrentlyVisible() ){
			throw new Error("BAM Report Related tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_circuitdetails.isCurrentlyVisible() ){
			throw new Error("Circuit Details Related tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_Circuits.isCurrentlyVisible()){
			throw new Error("Circuit Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_Devices.isCurrentlyVisible()  ){
			throw new Error("Devices Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_facilities.isCurrentlyVisible()  ){
			throw new Error("Facilities Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_Locations.isCurrentlyVisible()){
			throw new Error("Location Related tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_orders.isCurrentlyVisible()){
			throw new Error("Orders Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_Service_Areas.isCurrentlyVisible()){
			throw new Error("Service Area Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_services.isCurrentlyVisible()){
			throw new Error("Services Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}		
		
		if(!tab_Subscriber.isCurrentlyVisible()){
			throw new Error("Subscriber Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
				
		if(!tab_Tasks.isCurrentlyVisible()){
			throw new Error("Task Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
		
		if(!tab_TIRKS.isCurrentlyVisible() ){
			throw new Error("TIRKS Related Tab is missing in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
		}
				
						
				//################################ Related Tabs should not be displayed Circuit view ############################################//
				
				if(tab_ctag.isCurrentlyVisible()){
					throw new Error("CTAG Related Tab is Displayed in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
				}		
				
				if(tab_contact.isCurrentlyVisible()){
					throw new Error("Contact Related Tab is Displayed in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
				}
				
				if(tab_Device_ports.isCurrentlyVisible()){
					throw new Error("Audit Logs Tab is Displayed in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
				}				
				
				
				if(tab_Performance.isCurrentlyVisible()){
					throw new Error("Performance Related Tab is Displayed in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
				}
				
				if(tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is Displayed in the Circuit view page in "+lbl_circuitsearch_circuittype.getText());
				}	
				
				String circuittype=lbl_circuitsearch_circuittype.getTextValue().trim();
				
				  waitForElement(btn_circuitview_edit); 
                  jsClick(btn_circuitview_edit); Thread.sleep(2000);
                 
				
				switch(circuittype){	              
	              case "Unrouted Ethernet Bearer":	    
		            	  waitForElement(ddl_ProvisionStatus_EditEthernetBearer);
		                      ddl_ProvisionStatus_EditEthernetBearer.selectByIndex(2); 	                     
	                      ddl_CIRCUITSERVICETYPE_EditEthernetBearer.selectByIndex(1);
	                    break;
	               
	              case "Link Aggregation Group":	                  
	                      waitForElement(ddl_ProvisionStatus_EditEthernetBearer);
	                      ddl_ProvisionStatus_EditEthernetBearer.selectByIndex(2); 
	                      ddl_mco_EditEthernetBearer.selectByIndex(1);
	                      	break;
	              case "Optical Bearer":	                    
	                      waitForElement(ddl_ProvisionStatus_EditOpticalBearer);
	                      ddl_ProvisionStatus_EditOpticalBearer.selectByIndex(2); 
	                      ddl_MCO_EditOpticalBearer.selectByIndex(1);
	                      break;
	              case " PON Circuit (T)":	                     
	                      waitForElement(ddl_ProvisionStatus_EditOpticalBearer);
	                      ddl_ProvisionStatus_EditOpticalBearer.selectByIndex(2); 
	                      ddl_MCO_EditOpticalBearer.selectByIndex(1);
	                      break;
	              case "PW Unrouted (Path)":	                     
	                      waitForElement(ddl_ProvisionStatus_EditEthernetBearer);
	                      ddl_ProvisionStatus_EditEthernetBearer.selectByIndex(2); 
	                      ddl_mco_EditEthernetBearer.selectByIndex(1);
	                      break;
	             
	              case "Topology Virtual Connection":	                     
	                      waitForElement(ddl_ProvisionStatus_EditEthernetBearer);
	                      ddl_ProvisionStatus_EditEthernetBearer.selectByIndex(2); 
	                      break;
	              case "Transport Path":	                    
	                      waitForElement(ddl_ProvisionStatus_EditEthernetBearer);
	                      ddl_ProvisionStatus_EditEthernetBearer.selectByIndex(2); 
	                      ddl_mco_EditEthernetBearer.selectByIndex(1);
	                      break;
	                
	              case "VLAN Segment":	                     
			               waitForElement(ddl_ProvisionStatus_EditEthernetBearer);
			               ddl_ProvisionStatus_EditEthernetBearer.selectByIndex(2); 
			               		break;
	              }

		
	}
	
	//################################ Validate_FROM_Archie_DeviceAuditlog  TC189906 ############################################//
	
	public void Circuit_viewpage_tabaction(String tabaction) throws Throwable {
		waitForElement(tab_circuitview_circuitdetails);
		
		switch(tabaction){
		case "Audit Log": jsClick(tab_circuitview_auditlogs); waitForElement(tab_circuitview_auditlogs_OMNIVUE_auditlogs); break;
			
		}
		
	}
	
	
	
		public void Validate_FROM_Archie_CircuitAuditlog(){
			
			if(tab_circuitview_auditlogs_ARM_auditlogs_Active.isCurrentlyVisible()){
				if(!cbx_serach_Circuit_ARM_Audit_log_FromArchive.isCurrentlyVisible()){
					throw new Error("From Archive button is not displayed in the ARM Audit logs tab in Circuit view page");
				}
			} else if(tab_circuitview_auditlogs_OMNIVUE_auditlogs_Active.isCurrentlyVisible()){
				if(!cbx_serach_circuitview_Omnivue_Audit_log_tab_FromArchive.isCurrentlyVisible()){
					throw new Error("From Archive button is not displayed in the Omnivue Audit logs tab in Circuit view page");
				}
			}
			slf4jLogger.info("Able to see From Archive check box in Audit logs tab");
		}
		 
		
		public void Validate_FROM_Archie_Auditlog() {
			if(tab_circuitview_auditlogs_ARM_auditlogs_Active.isCurrentlyVisible()){
				jsClick(cbx_serach_Circuit_ARM_Audit_log_FromArchive);
				jsClick(btn_serach_Circuit_Audit_log_tab_ARM_getlog);
				waitForinvisibleElement(lbl_serach_Circuit_Audit_log_tab_getlog_loader.getText());
			} else if(tab_circuitview_auditlogs_OMNIVUE_auditlogs_Active.isCurrentlyVisible()){
				
				jsClick(cbx_serach_circuitview_Omnivue_Audit_log_tab_FromArchive);
				jsClick(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
				waitForinvisibleElement(lbl_serach_circuitview_Omnivue_Audit_log_tab_getlog_loader.getText());
			}
		}
		
		public void Validate_Auditlog_witharchieve() {
			if(!lbl_serach_circuitview_Audit_log_tab_errormsg.isCurrentlyVisible()){
				slf4jLogger.info("Able to see logs in Circuit view page");
			} else {
				slf4jLogger.info("Check ARM DB whether the"+tab_search_result_details.getText().trim()+" Circuit has logs");
			}
		}
		
		@SuppressWarnings("static-access")
		public String verify_validation(String validation) throws Throwable{
			String returnval=null,Message=null;
			
			int i=0; @SuppressWarnings("unused")
			int count=0;@SuppressWarnings("unused")
			String[] support = new String[20];
			@SuppressWarnings("unused")
			List<WebElement> deivceattributetocompare = null;
			@SuppressWarnings("unused")
			List<WebElementFacade> deivce_attribute = null;
			ArrayList<String> deivce_Fieldattributelist=new ArrayList<String>();
			@SuppressWarnings("unused")
			ArrayList<String> List2compare_deivce_Fieldattributelist=new ArrayList<String>();
			//String value;
			String str_circuit_name;
			List<String> deivce_details_db_attributes;
			
			List<String> comparelist = new ArrayList<String>();
			switch(validation){
			
			case "Updated fields in DB for circuit":  
				  str_circuit_name=tbx_circuit_editview_name.getTextValue();
				
				str_circuit_name.trim();
				System.out.println("-----------------"+str_circuit_name);
				
				deivce_Fieldattributelist.add(tbx_circuit_editview_name.getTextValue().trim());
				deivce_Fieldattributelist.add(tbx_circuit_editview_alias2.getTextValue().trim());
				 
				 
				
				
				  
				deivce_details_db_attributes = armdb.update_circuit_details_attributes_values(str_circuit_name.trim());
				
				for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
					for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
						if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
							slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
						//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
							
						}
					}
				}
				
				
				break;
			case "Circuit view page": 
				waitForElement(btn_circuitview_edit); Thread.sleep(2000);
				break;
			case "search with User ID criteria":
						waitForElement(tbx_advanceCircuit_createdid); Thread.sleep(2000);
						tbx_advanceCircuit_createdid.type(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));
						
						break;
						
			case "modify the Bandwidth and Provisioned Bandwidth value to null on the Circuit page":
				waitForElement(btn_circuitview_save); Thread.sleep(2000);
				
				tbx_circuit_editview_bandwidth.clear();
				tbx_circuit_editview_provisionbandwidth.clear();
				
				break;
			case "modify the Bandwidth and Provisioned Bandwidth on the Circuit page":
				waitForElement(btn_circuitview_save); Thread.sleep(2000);
				
				tbx_circuit_editview_bandwidth.type("1256");
				tbx_circuit_editview_provisionbandwidth.type("1256");
				break;
			case "the Bandwidth and Provisioned Bandwidth is updated as null on OMNIVue GUI and Database on the Circuit page":
				waitForElement(btn_circuitview_edit); Thread.sleep(2000);
				if(!(lbl_viewcircuit_AvailableBandwidth.getText().trim().length()<2)){
					slf4jLogger.error("Bandwidth data is not updated to null with Circuit page");
					throw new Error("Bandwidth data is not updated to null with Circuit page");
				}
				
				if(!(lbl_viewcircuit_ProvisionedBandwidth.getText().trim().length()<2)){
					slf4jLogger.error("Provisioned Bandwidth data is not matching with Circuit page");
					throw new Error("Provisioned Bandwidth data is not matching with Circuit page");
				}
				
				break;
				
				
			case "the Bandwidth and Provisioned Bandwidth on OMNIVue GUI and Database on the Circuit page":
				
				waitForElement(btn_circuitview_edit); Thread.sleep(2000);
				if((lbl_viewcircuit_AvailableBandwidth.getText().trim().length()<2)){
					slf4jLogger.error("Bandwidth data is not matching with Circuit page");
					throw new Error("Bandwidth data is not matching with Circuit page");
				}
				
				if((lbl_viewcircuit_ProvisionedBandwidth.getText().trim().length()<2)){
					slf4jLogger.error("Provisioned Bandwidth data is not matching with Circuit page");
					throw new Error("Provisioned Bandwidth data is not matching with Circuit page");
				}
				
				System.out.println("lbl_circuitsearch_circuitname="+lbl_circuitsearch_circuitname.getText().trim());
				comparelist=armdb.circuit_Ethernet_bandwidth(lbl_circuitsearch_circuitname.getText().trim());
				
				if(!lbl_viewcircuit_AvailableBandwidth.getText().trim().contains(comparelist.get(0))){
					slf4jLogger.error("Bandwidth data is not matching with DB");
					throw new Error("Bandwidth data is not matching with DB");
				}
				
				if(!lbl_viewcircuit_ProvisionedBandwidth.getText().trim().contains(comparelist.get(1))){
					slf4jLogger.error("Provisioned Bandwidth data is not matching with DB");
					throw new Error("Provisioned Bandwidth data is not matching with DB");
				}
				break;
				
			case "data displayed in the Subscribers Related Tab of Service Screen is matching with the circuit":

								waitForElement(btn_Subscriber_RT_view);
								
								jsClick(btn_Subscriber_RT_view); Thread.sleep(2000);
								
								waitForElement(btn_edit_service_viewpage);Thread.sleep(2000);
								
								
								waitForElement(tab_services);
								
								jsClick(tab_services);
								
								waitForElement(btn_Service_RT_view); Thread.sleep(2000);
								
								while(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttable')]//div[contains(text(),'"+tab_search_result_details_previous.getText().trim()+"')]"))){
									jsClick(btn_Service_RT_previous); Thread.sleep(3000);
									i++;
									if(i==20){
										break;
									}
								}
								
								
								
								break;
			case "data displayed in the Circuits Related Tab of Service Screen is matching with the Ethernet Bearer circuit":

				waitForElement(btn_RT_view); Thread.sleep(2000);
				
				while(i!=0){
					
					if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttable')]//div[contains(text(),'Ethernet Bearer')])[1]"))){
					jsClick(btn_RT_view);	Thread.sleep(2000);
					waitForElement(btn_circuitview_edit);	Thread.sleep(2000);
					waitForElement(tab_Circuits);	Thread.sleep(1000);
					jsClick(tab_Circuits);
					waitForElement(btn_RT_view); Thread.sleep(2000);
					
					} else
					if(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttable')]//div[contains(text(),'Ethernet Bearer')])[1]"))){
						
						verify_validation("view icon of the ethernet bearer in the Circuit related tab");
						jsClick(tab_services);
						
						waitForElement(btn_Service_RT_view); Thread.sleep(2000);
						
						jsClick(btn_Service_RT_view);Thread.sleep(2000);

						waitForElement(btn_edit_service_viewpage);Thread.sleep(2000);
						
						jsClick(tab_Circuits);
						waitForElement(btn_RT_view); Thread.sleep(2000);
						
						if(!lbl_Circuit_RT_name.getText().trim().contains(tab_search_result_details_previous.getText().trim())){
							slf4jLogger.error("Service data is not matching with Circuit page");
							throw new Error("Service data is not matching with Circuit page");
						}
						break;
						
					}
					
					
				}
				
				
				
				break;
			case "LAG circuit is displayed in the Circuit related tab":

				waitForElement(btn_RT_view); Thread.sleep(2000);
				
				if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttable')]//div[contains(text(),'Link Aggregation Group')])[1]"))){
					slf4jLogger.error("LAG circuit is not displayed in Circuit page");
					throw new Error("LAG circuit is not displayed in Circuit page");
				}
				
				break;
			case "view icon of the ethernet bearer in the Circuit related tab":
								jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttable')]//div[contains(text(),'Ethernet Bearer')]/../..//input)[1]")));
								Thread.sleep(2000);
								
								waitForElement(btn_circuitview_edit);				
								break;
				
			case "Ethernet Bearer circuit is displayed in the Circuit related tab":
							waitForElement(btn_RT_view); Thread.sleep(2000);
							
							if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttable')]//div[contains(text(),'Ethernet Bearer')])[1]"))){
								slf4jLogger.error("Ethernet Bearer circuit is not displayed in Circuit page");
								throw new Error("Ethernet Bearer circuit is not displayed in Circuit page");
							}
							
							
							
							break;
			case "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action":
									jsClick(tab_circuitview_auditlogs); 
									waitForElement(tab_circuitview_auditlogs_OMNIVUE_auditlogs);
									jsClick(tab_circuitview_auditlogs_OMNIVUE_auditlogs);
									waitForElement(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
									Thread.sleep(2000);
									jsClick(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
									Thread.sleep(2000);
									
									waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
									if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete'])[1]"))){
										slf4jLogger.info("Delete logs is  captured under the Audit logs section in Device page");
										//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
									} else if (isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete']"))){
										slf4jLogger.info("Delete logs is  captured under the Audit logs section in circuit page");
										
									}else {
										slf4jLogger.info("Delete logs is not captured under the Audit logs section in Device page");
										throw new Error("Delete logs is not captured under the Audit logs section in circuit page");
									}
									
//									if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete'])[1]"))){
//										slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//										throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
//									}
//									if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete']/../..//div[3])[1]"))){
//										slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//										throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
//									}
//									if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete']/../..//div[3])[1]")).getText().trim().toUpperCase().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx").toUpperCase())){
										//slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
										//throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
									//}	
									jsClick(tab_circuitview_circuitdetails);		
									
									break;
				
			case "Circuit Deleted Successfully.-message should be displayed in the circuit page":
									waitForElement(lbl_alertmsg);
									
									 Message = lbl_alertmsg.getText();
										Message = Message.toString().substring(1);		
										Message = Message.trim(); 
										if(!Message.contains("Circuit Deleted Successfully.")){
											throw new Error("Invalid message on Save is displayed."+Message);
										}jsClick(btn_alertmsg_closeicon);
									
									break;
			case "change the name in the circuit edit screen":
									waitForElement(btn_circuitview_save);
									if(tbx_circuit_editview_name.isCurrentlyEnabled()){
										tbx_circuit_editview_name.type("011/GR2/AUTOMATI111/CHANGEIT222");
									}
									
									tbx_circuit_editview_alias1.type("Modification-Auto");
									tbx_circuit_editview_alias2.type("Modification-Auto");				
								break;
			case "Update editable fields in the circuit edit screen":
				long time = System.currentTimeMillis()/100;
				long nanoTime = System.nanoTime();
				waitForElement(btn_circuitview_save);
				if(ddl_circuit_editview_mco_2.isCurrentlyEnabled()){
					ddl_circuit_editview_mco_2.selectByIndex(2);
					break;
				}
				else if (ddl_circuit_editview_mco.isCurrentlyEnabled())
				{
					ddl_circuit_editview_mco.selectByIndex(2);
					break;
				}
				
				tbx_circuit_editview_alias1.type("Modif"+time);
				tbx_circuit_editview_alias2.type(nanoTime+"");			 
			break;
			case "Log is captured for the Create functionality in Circuit screen":
							jsClick(tab_circuitview_auditlogs); 
							waitForElement(tab_circuitview_auditlogs_OMNIVUE_auditlogs);
							jsClick(tab_circuitview_auditlogs_OMNIVUE_auditlogs);
							waitForElement(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
							Thread.sleep(2000);
							jsClick(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
							Thread.sleep(2000);
							
							waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
							
							
							if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create'])[1]"))){
								slf4jLogger.info("CREATE logs is  captured under the Audit logs section in Device page");
								//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
							} else if (isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']"))){
								slf4jLogger.info("CREATE logs is  captured under the Audit logs section in Device page");
								
							}else {
								slf4jLogger.info("CREATE logs is not captured under the Audit logs section in Device page");
								throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
							}
//							if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create'])[1]"))){
//								slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//								throw new Error("Create  logs is not captured under the Audit logs section in Circuit page");
//							}
//							if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']/../..//div[3])[1]"))){
//								slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//								throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
//							}
//							if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
//								slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//								throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
//							}
								


							//// To capture created User ID
							if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']/../..//div[3])[1]")).getText().trim().toUpperCase().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx").toUpperCase())){
								slf4jLogger.error("Username is not captured under the Audit logs section in Circuit page");
								throw new Error("Username is not captured under the Audit logs section in Circuit page");
							}jsClick(tab_circuitview_circuitdetails);									
							
							break;
			case "Start & End device details is displayed in Related System Devices section in the Circuit Screen":
									waitForElement(btn_circuitview_edit); Thread.sleep(2000);
									
									if(!lbl_circuitsearch_startdevicename.isCurrentlyVisible()){
										slf4jLogger.debug("Start Device details is not displayed in the Related System Devices section");
										throw new Error("Start Device details is not displayed in the Related System Devices section");
									}
									
									if(!lbl_circuitsearch_enddevicename.isCurrentlyVisible()){
										slf4jLogger.debug("End Device details is not displayed in the Related System Devices section");
										throw new Error("End Device details is not displayed in the Related System Devices section");
									}	
									Thread.sleep(5000);
									
									if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//li/a[text()='"+lbl_circuitsearch_startdevicename.getText().trim()+"']"))){
										slf4jLogger.debug("Start Device is not displayed in the Related System Devices section");
										throw new Error("Start Device is not displayed in the Related System Devices section");
									}
									
									if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//li/a[text()='"+lbl_circuitsearch_enddevicename.getText().trim()+"']"))){
										slf4jLogger.debug("End Device is not displayed in the Related System Devices section");
										throw new Error("End Device is not displayed in the Related System Devices section");
									}
									
									break;
							
			case "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action":
											jsClick(tab_circuitview_auditlogs); 
											waitForElement(tab_circuitview_auditlogs_OMNIVUE_auditlogs);
											jsClick(tab_circuitview_auditlogs_OMNIVUE_auditlogs);
											waitForElement(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
											Thread.sleep(2000);
											jsClick(btn_serach_circuitview_Omnivue_Audit_log_tab_getlog);
											Thread.sleep(2000);
											
											waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update'])[1]"))){
												slf4jLogger.error("UPDATE logs is not captured under the Audit logs section in Device page");
												throw new Error("UPDATE log is not captured under the Audit logs section in Device page");
											}
											else if (isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update']"))){
												slf4jLogger.info("Update log is  captured under the Audit logs section in Device page");
												
											}else {
												slf4jLogger.info("Update logs is not captured under the Audit logs section in Device page");
												throw new Error("Update logs is not captured under the Audit logs section in Device page");
											}
											
//											
//											
//											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update'])[1]"))){
//												slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//												throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
//											}
//											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update']/../..//div[3])[1]"))){
//												slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page");
//												throw new Error("Update logs is not captured under the Audit logs section in Circuit page");
//											}
//											
											if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update']/../..//div[3])[1]")).getText().trim().toUpperCase().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx").toUpperCase())){
												slf4jLogger.error("Update logs is not captured under the Audit logs section in Circuit page3");
												throw new Error("Update logs is not captured under the Audit logs section in Circuit page3");
											}
											jsClick(tab_circuitview_circuitdetails);				
											
											break;
				
			case "Circuit edit Successfully-message should be displayed in the circuit page":
									waitForElement(lbl_alertmsg);
								
									 Message = lbl_alertmsg.getText();
										Message = Message.toString().substring(1);		
										Message = Message.trim(); 
										if(!Message.contains("Circuit edit Successfully")){
											throw new Error("Invalid message on Save is displayed."+Message);
										}jsClick(btn_alertmsg_closeicon);
								break;
								
			case "update the Alias fields in the circuit screen":
								waitForElement(btn_circuitview_save); 
								
								tbx_circuit_editview_alias1.type("Automation Test");
								tbx_circuit_editview_alias2.type("Automation Test");
								
								break;
			case "Start device details is displayed in Related System Devices section":
				
							waitForElement(btn_circuitview_edit); Thread.sleep(2000);
							
							if(!lbl_circuitsearch_startdevicename.isCurrentlyVisible()){
								slf4jLogger.debug("Start Device details is not displayed in the Related System Devices section");
								throw new Error("Start Device details is not displayed in the Related System Devices section");
							}
							
							if(!lbl_circuitsearch_enddevicename.isCurrentlyVisible()){
								slf4jLogger.debug("End Device details is not displayed in the Related System Devices section");
								throw new Error("End Device details is not displayed in the Related System Devices section");
							}				
							
							break;
							
			case "validate the Avaliable Bandwidth and Provisioned Bandwidth in Ethernet Bearer circuit View/Edit page":
							waitForElement(btn_circuitview_edit); Thread.sleep(2000);
							String viewavaliablebandwidth  = lbl_viewcircuit_AvailableBandwidth.getTextValue();
							System.out.println("viewavaliablebandwidth = "+viewavaliablebandwidth);
							Thread.sleep(5000);
							String viewprovisionbandwidth  = lbl_viewcircuit_ProvisionedBandwidth.getTextValue();
							System.out.println("viewprovisionbandwidth = "+viewprovisionbandwidth);
							jsClick(btn_circuitview_edit);Thread.sleep(2000);
							waitForElement(btn_circuitview_save);Thread.sleep(2000);
							jsClick(btn_circuitview_save);Thread.sleep(2000);waitForElement(btn_circuitview_edit);
							System.out.println("Editavaliablebandwidth = "+lbl_viewcircuit_AvailableBandwidth.getTextValue());
							System.out.println("Editprovisionbandwidth = "+lbl_viewcircuit_ProvisionedBandwidth.getTextValue());
							if(viewavaliablebandwidth.equalsIgnoreCase(lbl_viewcircuit_AvailableBandwidth.getTextValue())){
								System.out.println("View and Edit avaliable bandwidth is equal");
							}else throw new Error("Avaliable bandwidth is not matching");
							Thread.sleep(5000);
							if(viewprovisionbandwidth.equalsIgnoreCase(lbl_viewcircuit_ProvisionedBandwidth.getTextValue())){
								System.out.println("View and Edit avaliable bandwidth is equal");
							}else throw new Error("Provision bandwidth is not matching");
				
								break;
			case "click on the Device hyperlink displayed in the Circuit Screen": 
										waitForElement(lbl_circuitsearch_startdevicename);
										jsClick(lbl_circuitsearch_startdevicename);Thread.sleep(2000);
										
										break;
			case "Circuit Search Result": waitForElement(tab_circuit_advance_search_result);returnval="True";break;
			case "Advance Search the Circuit with Device name field":returnval=lbl_search_result_startdevice.getText().trim();break;
			case "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Circuit view":				
									waitForElement(btn_circuitview_edit);
									
									returnval=lbl_circuitview_mco.getText().trim();
									
									jsClick(btn_circuitview_edit);waitForElement(btn_circuitview_save);	Thread.sleep(3000);
										if(ddl_circuit_editview_mco.isCurrentlyVisible()){
											ddl_circuit_editview_mco.selectByVisibleText("WNPKFLDSLM");
										} else 
										if(ddl_circuit_editview_mco_2.isCurrentlyVisible()){
											ddl_circuit_editview_mco_2.selectByVisibleText("WNPKFLDSLM");
										}										
										jsClick(btn_circuitview_save);
										waitForElement(btn_circuitview_edit);
										if(!lbl_circuitview_mco.getText().trim().equals("WNPKFLDSLM")){
											throw new Error("WNPKFLDSLM value is not getting updated in Circuit view");
										}
									
										jsClick(btn_circuitview_edit);waitForElement(btn_circuitview_save);	Thread.sleep(3000);
										if(ddl_circuit_editview_mco.isCurrentlyVisible()){
											ddl_circuit_editview_mco.selectByVisibleText("MPLSMNDSLM");
										} else 
										if(ddl_circuit_editview_mco_2.isCurrentlyVisible()){
											ddl_circuit_editview_mco_2.selectByVisibleText("MPLSMNDSLM");
										}											
										
										jsClick(btn_circuitview_save);
										waitForElement(btn_circuitview_edit);
										if(!lbl_circuitview_mco.getText().trim().equals("MPLSMNDSLM")){
											throw new Error("MPLSMNDSLM value is not getting updated in Circuit view");
										}
										
										
										jsClick(btn_circuitview_edit);waitForElement(btn_circuitview_save);	Thread.sleep(3000);
										if(ddl_circuit_editview_mco.isCurrentlyVisible()){
											ddl_circuit_editview_mco.selectByVisibleText("WPKFLETHEQ");
										} else 
										if(ddl_circuit_editview_mco_2.isCurrentlyVisible()){
											ddl_circuit_editview_mco_2.selectByVisibleText("WPKFLETHEQ");
										}											
									
										jsClick(btn_circuitview_save);
										waitForElement(btn_circuitview_edit);
										if(!lbl_circuitview_mco.getText().trim().equals("WPKFLETHEQ")){
											throw new Error("WPKFLETHEQ value is not getting updated in Circuit view");
										}
										
										
										jsClick(btn_circuitview_edit);waitForElement(btn_circuitview_save);	Thread.sleep(3000);
										if(ddl_circuit_editview_mco.isCurrentlyVisible()){
											ddl_circuit_editview_mco.selectByVisibleText("MPLSMNETHQ");
										} else 
										if(ddl_circuit_editview_mco_2.isCurrentlyVisible()){
											ddl_circuit_editview_mco_2.selectByVisibleText("MPLSMNETHQ");
										}												
										
										jsClick(btn_circuitview_save);
										waitForElement(btn_circuitview_edit);
										
										if(!lbl_circuitview_mco.getText().trim().equals("MPLSMNETHQ")){
											throw new Error("MPLSMNETHQ value is not getting updated in Circuit view");
										}		
										jsClick(btn_circuitview_edit);waitForElement(btn_circuitview_save);	Thread.sleep(3000);
										if(!returnval.isEmpty()){										
									
										if(ddl_circuit_editview_mco.isCurrentlyVisible()){
											ddl_circuit_editview_mco.selectByVisibleText(returnval);
										} else 
										if(ddl_circuit_editview_mco_2.isCurrentlyVisible()){
											ddl_circuit_editview_mco_2.selectByVisibleText(returnval);
										}									
										
										}else{
											if(ddl_circuit_editview_mco.isCurrentlyVisible()){
												ddl_circuit_editview_mco.selectByVisibleText("-Select-");
											} else 
											if(ddl_circuit_editview_mco_2.isCurrentlyVisible()){
												ddl_circuit_editview_mco_2.selectByVisibleText("-Select-");
											}
										}
										
										jsClick(btn_circuitview_save);
										waitForElement(btn_circuitview_edit);	
										break;			
				
			}
			return returnval;
		}
		public void validate_circuit_in_database() throws InterruptedException{
            String OV_Circuitname = tab_circuitCreate_circuitname.getText();
            Thread.sleep(5000);
            System.out.println("................................OV_Circuitname......."+OV_Circuitname);
            @SuppressWarnings("static-access")
			String DB_Circuitname = armdb.validate_circuitname_in_database(OV_Circuitname.trim());
            System.out.println("................................DB_Circuitname......."+DB_Circuitname);

           // if(OV_Circuitname.trim().contains(DB_Circuitname.trim()))
            	if(OV_Circuitname.trim().equalsIgnoreCase(DB_Circuitname))
            {
                   System.out.println(OV_Circuitname+" is avaliable in Database");
            }
            else{
                   System.out.println(OV_Circuitname+" is not avaliable in Database");
            }
         }

		public void Circuit_actions (String action) throws Throwable { try{
			
			switch(action){
			case "Edit":waitForElement(btn_circuitview_edit);jsClick(btn_circuitview_edit); Thread.sleep(2000); waitForElement(btn_circuitview_save);break;
			case "Delete":jsClick(btn_circuitview_delete);getDriver().switchTo().alert().accept();getDriver().switchTo().alert().accept();			
					break;
			case "Save":waitForElement(btn_circuitview_save);jsClick(btn_circuitview_save);Thread.sleep(4000);break;
			case "Cancel button":	waitForElement(btn_circuitview_save);
								jsClick(btn_circuitview_cancel);Thread.sleep(2000);getDriver().switchTo().alert().accept(); Thread.sleep(2000);waitForElement(btn_circuitview_edit); break;
			}	
		}catch (NoAlertPresentException ex) {
			   // Alert not present
			   ex.printStackTrace();
			  }
	}
		
		//########################################################################################################################//
	
		
	public Boolean waitForinvisibleElement(String text) {
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
		    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		    Boolean element2 = wait.until(ExpectedConditions.invisibilityOfElementLocated((By.partialLinkText(text))));
		    
			
		    return element2;
	}
		
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),5000);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	public void jsClick(WebElement element) {
		try {
			Thread.sleep(10000);
			JavascriptExecutor executor = (JavascriptExecutor)getDriver();
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("unable to click by java script");
			element.click();
		}

	}
	  public void verify_circuit_related_tab(String tab) throws Throwable {
			//tab_ctag);
			//Thread.sleep(5000);
			//slf4jLogger.info("Executed the line"+tab);
		  ArrayList<String> circuit_Fieldattributelist=new ArrayList<String>();
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='circuit_specific_loader']")));
			waitForElement(lbl_circuitsearch_circuitname);
			Thread.sleep(6000);
			String circuitname = lbl_circuitsearch_circuitname.getText();
			System.out.println(circuitname);
			switch(tab){
			//case "Service Circuit Design":jsClick(tab_services_circuitdesign);Thread.sleep(5000); break; 
			case "Services": jsClick(tab_services);Thread.sleep(5000);
						if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
								Thread.sleep(3000);
								//waitForElement(orderpage.btn_related_tab_refresh_icon);
								jsClick(btn_Service_refresh);
								wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@id='ajax_loader' and @ng-show='contact_service_loader']")));
								Thread.sleep(3000); 
								List<WebElement> OV_Services_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
								 @SuppressWarnings("static-access")
								List<String> DB_Services_list = armdb.circuit_RT_Servicesvalidation(circuitname.trim());
								 System.out.println("No of Services in Database: "+DB_Services_list.size());
								 System.out.println("No of Services in OV: "+OV_Services_list.size());
						   if(DB_Services_list.size()==OV_Services_list.size()){
								 for(int i=0; i<=OV_Services_list.size()-1; i++){
									 //System.out.println(OV_Bamevents_list.get(i).getText());
									 for(int j=0; j<=OV_Services_list.size()-1; j++){
										if(OV_Services_list.get(i).getText().trim().contains(DB_Services_list.get(j).trim())){
											System.out.println(OV_Services_list.get(i).getText()+" Service is avaliable in database");
										}
									 }
								 }	
							}
							} else {
							//	orderpage.failure_icon_validation();
								System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
							}
							break;
			
			
			case "Orders": jsClick(tab_orders); Thread.sleep(5000);
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									/*// waitForElement(orderpage.btn_related_tab_excel_icon); 
									
								} else {
									//orderpage.failure_icon_validation();
	*/							} break;		
								
			case "Devices":  jsClick(tab_Devices); Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='related_device_loader']")));
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									Thread.sleep(3000);
									jsClick(tab_device_one);
									String device1=lbl_devicename_one.getText().trim();
									Thread.sleep(4000);
									jsClick(tab_device_two);
									Thread.sleep(4000);
									waitForElement(lbl_devicename_two);
									String device2=lbl_devicename_two.getText().trim();
									//List<String> OV_device_list = null; 
									//List<String> OV_DB_device_list = null; 
									circuit_Fieldattributelist.add(device1);
									circuit_Fieldattributelist.add(device2);
									 @SuppressWarnings("static-access")
									List<String> OV_DB_device_list = armdb.circuit_RT_devicevalidation(circuitname.trim());
									 System.out.println("No of Devices in Database: "+OV_DB_device_list.size());
									 System.out.println("No of Devices in OV: "+circuit_Fieldattributelist.size());
							   if(OV_DB_device_list.size()==circuit_Fieldattributelist.size()){
									 for(int i=0; i<=circuit_Fieldattributelist.size()-1; i++){
										 //System.out.println(OV_Bamevents_list.get(i).getText());
										 for(int j=0; j<=circuit_Fieldattributelist.size()-1; j++){
											if(circuit_Fieldattributelist.get(i).trim().contains(OV_DB_device_list.get(j).trim())){
												System.out.println(circuit_Fieldattributelist.get(i)+" Device is avaliable in database");
											}
										 }
									 }	
							   }else{
									throw new Error("Devices not matched ");
								 }
									
									 //waitForElement(orderpage.btn_related_tab_excel_icon); 
								} break;
			
			case "BAM Report": jsClick(tab_bamreport); Thread.sleep(5000);
			  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='bamLoader']")));	  					
			  					System.out.println("Loader Diappered");   
			  					//String devicename = lbl_deviceName.getText();
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									 waitForElement(orderpage.btn_related_tab_excel_icon); 
									 List<WebElement> OV_Bamevents_list = loginPage.getDriver().findElements(By.xpath("//div[contains(@id,'contenttablebamGrid')]/div[@role='row']/div[2]/div"));
									 @SuppressWarnings("static-access")
									List<String> DB_Bamevents_list = osrdb.device_bam_reportvalidation(circuitname.trim());
									 System.out.println("No of Bam reports ID in OV: "+OV_Bamevents_list.size());
									 System.out.println("No of Bam reports ID in Database: "+DB_Bamevents_list.size());
									 if(DB_Bamevents_list.size()==OV_Bamevents_list.size()){
									 for(int i=0; i<=OV_Bamevents_list.size()-1; i++){
										 //System.out.println(OV_Bamevents_list.get(i).getText());
										 for(int j=0; j<=OV_Bamevents_list.size()-1; j++){
											if(OV_Bamevents_list.get(i).getText().contains(DB_Bamevents_list.get(j))){
												System.out.println(OV_Bamevents_list.get(i).getText()+" BAM Event Row Id is avaliable in database");
											}
										 }
									 }	
									 }else{
										 throw new Error("OV BAM Events are not equal to Database BAM Events");
									 }
								} else {
								//	orderpage.failure_icon_validation();
									System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
								} break;
								
			/*case "Tasks": jsClick(tab_Tasks); Thread.sleep(2000); 
			
			 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='task_loader']")));

					  System.out.print("Loader Disappered");   
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								waitForElement(servicepage.lbl_taskresulttable);
							} else {
							//	orderpage.failure_icon_validation();
							} break;*/

			case "Locations": jsClick(tab_Locations); Thread.sleep(3000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='location_loader']")));
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
									Thread.sleep(3000);
									
									//waitForElement(orderpage.btn_related_tab_refresh_icon);	
									 List<WebElement> OV_Location_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[3]/div"));
									 @SuppressWarnings("static-access")
									List<String> DB_Location_list = armdb.circuit_RT_locationvalidation(circuitname.trim());
									 System.out.println("No of Locations in OV: "+OV_Location_list.size());
									 System.out.println("No of Locations in Database: "+DB_Location_list.size());
							   if(DB_Location_list.size()==OV_Location_list.size()){
									 for(int i=0; i<=OV_Location_list.size()-1; i++){
										 //System.out.println(OV_Bamevents_list.get(i).getText());
										 for(int j=0; j<=OV_Location_list.size()-1; j++){
											if(OV_Location_list.get(i).getText().trim().contains(DB_Location_list.get(j).trim())){
												System.out.println(OV_Location_list.get(i).getText()+" Location is avaliable in database");
											}
										 }
									 }	
									}else{
									throw new Error("OV Locations are not equal to Database Circuits");
										 }
								}else{
								//	orderpage.failure_icon_validation();
									System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
								}
								break;
			
			case "Circuits":jsClick(tab_Circuits);Thread.sleep(3000);						
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
									Thread.sleep(3000);
									
									
									wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='related_circuit_loader']")));
									//waitForElement(orderpage.btn_related_tab_refresh_icon);	
									 List<WebElement> OV_Circuits_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
									 @SuppressWarnings("static-access")
									List<String> DB_Circuits_list = armdb.circuit_RT_Circuitvalidation(circuitname.trim());
									 System.out.println("No of Circuits in Database: "+DB_Circuits_list.size());
									 System.out.println("No of Circuits in OV: "+OV_Circuits_list.size());
							   if(DB_Circuits_list.size()==OV_Circuits_list.size()){
									 for(int i=0; i<=OV_Circuits_list.size()-1; i++){
										 //System.out.println(OV_Bamevents_list.get(i).getText());
										 for(int j=0; j<=OV_Circuits_list.size()-1; j++){
											if(OV_Circuits_list.get(i).getText().trim().contains(DB_Circuits_list.get(j).trim())){
												System.out.println(OV_Circuits_list.get(i).getText()+" Circuit is avaliable in database");
											}
										 }
									 }	
								}else{
								throw new Error("OV Circuits are not equal to Database Circuits");
									 }
								} else {
								//	orderpage.failure_icon_validation();
									System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
								}
								break;
							
		/*	case "Circuit Details":jsClick(tab_Circuit);Thread.sleep(3000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								waitForElement(orderpage.btn_related_tab_refresh_icon);
							}break;*/
			
			case "Subscribers": jsClick(tab_Subscriber);
			Thread.sleep(5000);
			
			
			if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
				Thread.sleep(9000);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='subscriber_loader']")));
				//waitForElement(orderpage.btn_related_tab_refresh_icon);	
				 List<WebElement> OV_subscriber_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablegenericSubscriberGrid')]/div/div[2]/div"));
				 @SuppressWarnings("static-access")
				List<String> DB_subscriber_list = armdb.circuit_RT_subscribervalidation(circuitname.trim());
				 System.out.println("No of Subscribers in Database: "+DB_subscriber_list.size());
				 System.out.println("No of Subscribers in OV: "+OV_subscriber_list.size());
		   if(DB_subscriber_list.size()==OV_subscriber_list.size()){
				 for(int i=0; i<=OV_subscriber_list.size()-1; i++){
					 //System.out.println(OV_Bamevents_list.get(i).getText());
					 for(int j=0; j<=OV_subscriber_list.size()-1; j++){
						if(OV_subscriber_list.get(i).getText().trim().contains(DB_subscriber_list.get(j).trim())){
							System.out.println(OV_subscriber_list.get(i).getText()+" Circuit is avaliable in database");
						}
					 }
				 }	
			}else{
			throw new Error("Subscribers details not matched ");
				 }
			} else {
			//	orderpage.failure_icon_validation();
				System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
			}
							//if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									//waitForElement(orderpage.btn_related_tab_refresh_icon);
									waitForElement(btn_Subscriber_RT_view);
								} //else {
									//orderpage.failure_icon_validation();
								//	throw new Error("No Data Displayed Getting this message:"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
							//	}} waitForElement(orderpage.btn_related_tab_refresh_icon);
								break;
			
			
			
			case "Facilities": jsClick(tab_facilities); Thread.sleep(2000);
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									 //waitForElement(btn_shelfexpand); 
								} else {
								//	orderpage.failure_icon_validation();
								} break;
			
			case "Service Areas": jsClick(tab_Service_Areas); Thread.sleep(3000);
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									waitForElement(orderpage.btn_related_tab_excel_icon); 
								} else {
									System.out.println("Message displayed"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
									//orderpage.failure_icon_validation();
								} break;
			
			}
			
			slf4jLogger.info("Selected "+tab+" in 360 view");
							
		}
	  
	  
	  
	  public void verify_lagcircuit_circuitrelated_tab() throws Throwable {
		  WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
		  String circuitname = lbl_circuitsearch_circuitname.getText();
		  jsClick(tab_Circuits);Thread.sleep(3000);						
			if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
				Thread.sleep(3000);
				
				
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='related_circuit_loader']")));
				//waitForElement(orderpage.btn_related_tab_refresh_icon);	
				 List<WebElement> OV_Circuits_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
				 @SuppressWarnings("static-access")
				List<String> DB_Circuits_list = armdb.lagcircuit_RT_Circuitvalidation(circuitname.trim());
				 System.out.println("No of Circuits in Database: "+DB_Circuits_list.size());
				 System.out.println("No of Circuits in OV: "+OV_Circuits_list.size());
		   if(DB_Circuits_list.size()==OV_Circuits_list.size()){
				 for(int i=0; i<=OV_Circuits_list.size()-1; i++){
					 //System.out.println(OV_Bamevents_list.get(i).getText());
					 for(int j=0; j<=OV_Circuits_list.size()-1; j++){
						if(OV_Circuits_list.get(i).getText().trim().contains(DB_Circuits_list.get(j).trim())){
							System.out.println(OV_Circuits_list.get(i).getText()+" Circuit is avaliable in database");
						}
					 }
				 }	
			}else{
			throw new Error("OV Circuits are not equal to Database Circuits");
				 }
			} else {
			//	orderpage.failure_icon_validation();
				System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
			}
		  
	  }
	  
	  
	  public void verify_vlancircuit_circuitrelated_tab() throws Throwable {
		  WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
		  String circuitname = lbl_circuitsearch_circuitname.getText();
		  jsClick(tab_Circuits);Thread.sleep(3000);						
			if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
				Thread.sleep(3000);
				
				
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='related_circuit_loader']")));
				//waitForElement(orderpage.btn_related_tab_refresh_icon);	
				 List<WebElement> OV_Circuits_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
				 @SuppressWarnings("static-access")
				List<String> DB_Circuits_list = armdb.vlancircuit_RT_Circuitvalidation(circuitname.trim());
				 System.out.println("No of Circuits in Database: "+DB_Circuits_list.size());
				 System.out.println("No of Circuits in OV: "+OV_Circuits_list.size());
		   if(DB_Circuits_list.size()==OV_Circuits_list.size()){
				 for(int i=0; i<=OV_Circuits_list.size()-1; i++){
					 //System.out.println(OV_Bamevents_list.get(i).getText());
					 for(int j=0; j<=OV_Circuits_list.size()-1; j++){
						if(OV_Circuits_list.get(i).getText().trim().contains(DB_Circuits_list.get(j).trim())){
							System.out.println(OV_Circuits_list.get(i).getText()+" Circuit is avaliable in database");
						}
					 }
				 }	
			}else{
			throw new Error("OV Circuits are not equal to Database Circuits");
				 }
			} else {
			//	orderpage.failure_icon_validation();
				System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
			}
		  
	  }
//Validation of ARM Audit log with out Archive
		public void Validate_arm_Auditlog_circuit() {
			if(tab_circuitview_auditlogs_ARM_auditlogs_Active.isCurrentlyVisible()){
				jsClick(btn_serach_Circuit_Audit_log_tab_ARM_getlog);
				waitForinvisibleElement(lbl_serach_Circuit_Audit_log_tab_getlog_loader.getText());
				Validate_Auditlog_witharchieve();
				if(lbl_arm_nodata_errormsg.isVisible()){
					slf4jLogger.info(lbl_arm_nodata_errormsg.getText());
				}else
				{
					slf4jLogger.info("ARM Logs displayed");	
				}
			}
			else {
				throw new Error("ARM Audit log page is not loaded");
			}
			
			
		}	


}
