package com.ctl.it.qa.omnivue.tools.pages.common;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
 

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVTaskrenderingpage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	OVLoginPage loginPage;
	ARMDB armdb;
	OmnivueDB ovdb;
	
	
	//**********************************************		Task Result		****************************************************************//
	
	@FindBy(xpath="(.//*[@title='View DSP Task'])[1]")
	public WebElementFacade btn_DSPview_task;
	
	@FindBy(xpath="(.//*[@title='Edit DSP Task'])[1]")
	public WebElementFacade btn_DSPedit_task;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail(') and @title='View Task'])[1]")
	public WebElementFacade btn_view_task;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.editTaskDetail(') and @title='Edit Task'])[1]")
	public WebElementFacade btn_edit_task;
	
	@FindBy(xpath=".//*[@ng-click='initAction(tab.id);']")
	public WebElementFacade btn_Task_search_result_go;
	
	//@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttabletaskGrid')]//div[contains(@id,'row0taskGrid')]//input[contains(@ng-click,'gridSettings.viewTaskDetailDsp(')]/parent::div/parent::div/parent::div/div)[1]")
	@FindBy(xpath="//div[contains(@id,'contenttabletaskGrid')]/div[1]/div[1]")
	public WebElementFacade btn_Task_search_result_arrowbutton;
	
	//---------------------------------------	Autoform API View Task Result screen 	---------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='General Task Details']")
	public WebElementFacade lbl_Task_search_result_autoformtask_arrowbutton_generaltaskdetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Task ID:']/following-sibling::label")
	public WebElementFacade lbl_Task_search_result_autoformtask_arrowbutton_taskid;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Created By:']/following-sibling::label")
	public WebElementFacade lbl_Task_search_result_autoformtask_arrowbutton_createdby;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Create Date:']/following-sibling::label")
	public WebElementFacade lbl_Task_search_result_autoformtask_arrowbutton_createddate;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Task Status:']/following-sibling::label")
	public WebElementFacade lbl_Task_search_result_autoformtask_arrowbutton_taskstatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-click='completeTaskAction(task)']")
	public WebElementFacade btn_Task_search_result_autoformtask_complete;
	//IFrame view
	
	@FindBy(xpath=".//iframe[@class='ng-scope']")
	public WebElementFacade lbl_iframeview;
	
	//****************************************************************************************************************************************//
	//API Task Fields
	
	
	//@FindBy(xpath=".//*[@ng-controller='dspTaskDetailCtrl']")
	//@FindBy(xpath=".//*[@ng-controller='dspTaskDetailCtrl']/div[3]/div")
	
	@FindBy(xpath=".//*[@ng-controller='dspTaskDetailCtrl']/div[3]/div[@class='row']//*[contains(@class,'control-label')]")
	public List<WebElementFacade> lbl_General_task_list;
	
	@FindBy(xpath=".//*[@ng-controller='dspTaskDetailCtrl']//*[contains(@class,'col-sm-3 control-label')]")
	public List<WebElementFacade> lbl_task_specific_list;
	
	@FindBy(xpath=".//*[text()='Ensemble Order Number/ID:']")
	public WebElementFacade lbl_Taskspecific_ensembleorder;
	
	@FindBy(xpath=".//*[text()='CSOF ID:']")
	public WebElementFacade lbl_Taskspecific_csofid;
	
	@FindBy(xpath=".//*[text()='Customer DTN:']")
	public WebElementFacade lbl_Taskspecific_custdtn;
	
	@FindBy(xpath=".//*[text()='Customer Name:']")
	public WebElementFacade lbl_Taskspecific_custname;
	
	@FindBy(xpath=".//*[text()='GPON Wiki URL Link:']")
	public WebElementFacade lbl_Taskspecific_gponwikilink;
	
	// General Task
	//Task Actions Sections
	
	@FindBy(xpath=".//*[@id='row0taskGrid_0']/div[1]")
	public WebElementFacade btn_Task_arrow;
	
	
	@FindBy(xpath=".//*[text()='Task Name:']/following-sibling::label")
	public WebElementFacade lbl_Task_actions;
	
	//************************************************************************************************************************************************************//
	
	//###############################################################		Search Task View Sanity Validation  #######################################################//
		
	//--------------------------------------------------------------		Search Task Tab ---------------------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Task ID:']/following-sibling::label")
	public WebElementFacade lbl_tasksearch_taskid;	
	
	@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab_search_result_details; 	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'DSP Task Details')]")
	public WebElementFacade tab_Taskview_dsp_task_details;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_Taskview_Auditlogs; 	
	
	
	//--------------------------------------------------------------		General Section Search Task  ---------------------------------------------------------------------------//	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='General Task Details']")
	public WebElementFacade lbl_General_task_details;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Task ID:']/following-sibling::label")
	public WebElementFacade lbl_General_task_details_taskid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Created By:']/following-sibling::label")
	public WebElementFacade lbl_General_task_details_createdby;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Create Date:']/following-sibling::label")
	public WebElementFacade lbl_General_task_details_createddate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Task Status:']/following-sibling::label")
	public WebElementFacade lbl_General_task_details_Taskstatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='WorkGroup:']/following-sibling::label")
	public WebElementFacade lbl_General_task_details_workgrp;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Due Date:']/following-sibling::label)[1]")
			public WebElementFacade lbl_General_task_details_duedate;
			
	@FindBy(xpath="	.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Assigned To:']/following-sibling::label")
			public WebElementFacade lbl_General_task_details_assignedto;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Completed By:']")
	public WebElementFacade lbl_General_task_details_completedby;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Completed By:']/following-sibling::label")
			public WebElementFacade lbl_General_task_details_completedby_value;
	
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Completed Date:']")
	public WebElementFacade lbl_General_task_details_completeddate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Completed Date:']/following-sibling::label")
			public WebElementFacade lbl_General_task_details_completeddate_value;
			
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Task Name:']/following-sibling::label")
			public WebElementFacade lbl_General_task_details_taskname;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Task Type:']/following-sibling::label")
			public WebElementFacade lbl_General_task_details_tasktype;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Task Description:']/following-sibling::label")
			public WebElementFacade lbl_General_task_details_taskdescription;
	
	@FindBy(xpath=".//input[@id='DSP_CORRELATION_ID ']")
	public WebElementFacade lbl_tasks_dsp_correlation_id;
	
	@FindBy(xpath=".//input[@id='EVC_ID ']")
	public WebElementFacade lbl_evc_id;
	
	@FindBy(xpath=".//input[@id='MSTO_DEVICE_NAME ']")
	public WebElementFacade lbl_tasks_MSTO_DEVICE_NAME;
	
			
	//--------------------------------------------------------------	Action	Search Task  ---------------------------------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Actions']")
	public WebElementFacade lbl_Actions;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='retryTaskAction(task)']")
	public WebElementFacade btn_taskaction_retry; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='fetchWorkgroups(task)']")
	public WebElementFacade btn_taskaction_reassign; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='completeTaskAction(task)']")
	public WebElementFacade btn_taskaction_complete;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='SaveDSPTask(task,spectificTaskInfo)']")
	public WebElementFacade btn_taskaction_save;
	
	
	//--------------------------------------------------------------	Task Specific Info Search Task  ---------------------------------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task Specific Info']")
	public WebElementFacade lbl_Task_specific_info;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Error Details:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_errordetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Ensemble Order ID:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_ensembleorderid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task Specific Info']/following-sibling::div//label[text()='Due Date:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_duedate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task Specific Info']/following-sibling::div//label[text()='CSOF ID:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_csofid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task Specific Info']/following-sibling::div//label[text()='Customer DTN:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_dtn;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task Specific Info']/following-sibling::div//label[text()='Customer Name:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_customername;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task Specific Info']/following-sibling::div//label[text()='BAN:']/following-sibling::label")
	public WebElementFacade lbl_Task_specific_info_ban;
	
	//--------------------------------------------------------------	Task Workflow Search Task  ---------------------------------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task WorkFlow']")
	public WebElementFacade lbl_Task_workflow;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Task WorkFlow']/following-sibling::div/iframe")
	public WebElementFacade img_Task_workflow;
	
	//************************************************************************************************************************************************************//
	
	//-------------------------------------------------------------- Task Related Tabs Section ---------------------------------------------------------------------------//
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
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
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='RMA']")
		public WebElementFacade tab_RMA;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='RMA_Rehome']")
		public WebElementFacade tab_RMA_rehome;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='WFA/C']")
		public WebElementFacade tab_wfac;
		
		@FindBy(xpath="(//label[text()='GETO']/following-sibling::div//input)[1]")
		public WebElementFacade tbx_GETO_value; 
	   
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains (@id,'dropdownlistArrowgetojqxComboBox')] /div")
        public WebElementFacade ddl_GETO_value;
		
		//@FindBy(xpath="//div[@id='listBoxContentinnerListBoxjqxWidget9af4841d']/div[@style='outline: none 0px; overflow: hidden; width: 409px; position: relative; height: 404px;']")
		@FindBy(xpath="//span[text()='B']/../..//span")
		public WebElement ddl_GETO_value_list;
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
//************************************************************************************************************************************************************//

//-------------------------------------------------------------- Audit logs Tabs Section ---------------------------------------------------------------------------//
		
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@ng-click='exportToExcel()']/parent::div/following-sibling::div//*[@ng-click='fetchLogsFromArchive();' and text()='Get Logs']")
	public WebElementFacade btn_task_auditlogs_getlogs;
		
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@ng-click='exportToExcel()']/parent::div/following-sibling::div//*[@ng-model='getLogsFromArchive']")
	public WebElementFacade cbk_task_auditlogs_fromarchive;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='No Audit Logs to display']")
	public WebElementFacade lbl_task_auditlogs_nologsmsg;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='No Audit Logs to display']/parent::div/preceding-sibling::div//*[@ng-click='fetchLogsFromArchive();' and text()='Get Logs']")
	public WebElementFacade btn_task_auditlogs_nologsmsg_getlogs;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='No Audit Logs to display']/parent::div/preceding-sibling::div//*[@ng-model='getLogsFromArchive']")
	public WebElementFacade cbk_task_auditlogs_nologsmsg_fromarchive;
	
	@FindBy(xpath="//*[@ng-show='auditLoader' and @class='loader_div_left ng-binding']")
	public String lbl_auditlogs_loader;
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	//-------------------------------------------------------------- 	Defect Task  -------------------------------------------------------------- //
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Apply Default']")
	public WebElementFacade btn_resultpage_configurecolumn_applydefault;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='moveRightList']")
	public WebElementFacade ddl_resultpage_configurecolumn_list;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='upButton']")
	public WebElementFacade btn_resultpage_configurecolumn_up;
	
	
	@FindBy(xpath="//button[@ng-click='generateReport();']")
	public WebElementFacade btn_defecttask_generateReport;
	
	@FindBy(xpath="(//tab-heading[@ng-click='onClickTab(tab)' and contains(text(),'Defect Task Report')])[2]")
	public WebElementFacade tab_defecttask_Report;
	
	@FindBy(xpath="//tbody[@ng-repeat='taskTypeData in byTaskTypesData'][1]/tr[1]/td[2]/a")
	public WebElementFacade lnk_defecttask_Tasktype;
	
	@FindBy(xpath="//tbody[@ng-repeat='taskTypeData in byTaskTypesData'][1]/tr[1]/td[3]/a")
	public WebElementFacade lnk_defecttask_countcompleted;
	
	@FindBy(xpath="//tbody[@ng-repeat='taskTypeData in byTaskTypesData'][1]/tr[1]/td[5]/a")
	public WebElementFacade lnk_defecttask_countIncompleted;
	
	@FindBy(xpath="//tbody[@ng-repeat='taskTypeData in byTaskTypesData'][1]/tr[1]/td[6]/a")
	public WebElementFacade lnk_defecttask_Totaltasksdetected;
	
	@FindBy(xpath="(//div[@class='tab-pane ng-scope active'])[2]//h2")
	public WebElementFacade lbl_defecttask_subtab;
	
	@FindBy(xpath= "//div[@ng-controller='defectTaskAdvanceSearchCtrl']//label")
	public List<WebElementFacade> lbl_Advanced_defect_tasks_fields;
	
	@FindBy(xpath="//button[@ng-click='clearfield()']")
	public WebElementFacade btn_Advanced_defect_task_clear;
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	//-------------------------------------------------------------- 	Defect Task  -------------------------------------------------------------- //
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Defect Task Results')]")
	public WebElementFacade tab_DefecttaskResults;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Content']")
	public WebElementFacade btn_DefecttaskResults_configurecolumn;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Configure Columns']")
	public WebElementFacade lbl_DefecttaskResults_configurecolumn;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Apply']")
	public WebElementFacade btn_DefecttaskResults_configurecolumn_apply;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Apply Default']")
	public WebElementFacade btn_DefecttaskResults_configurecolumn_applydefault;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Cancel']")
	public WebElementFacade btn_DefecttaskResults_configurecolumn_cancel;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@title='View Task'])[1]")
	public WebElementFacade btn_defecttask_viewtask;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@title='Edit Task'])[1]")
	public WebElementFacade btn_defecttask_edittask;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveDefectTaskDetails();']")
	public WebElementFacade btn_defecttask_Save;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='submitDefectTaskDetails();']")
	public WebElementFacade btn_defecttask_Complete; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-class='alert.className']")
	public WebElementFacade lbl_Defecttaskmsg; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-class='alert.className']/button")
	public WebElementFacade btn_Defecttaskmsg_close; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='Claim']")
	public WebElementFacade btn_defecttask_claim; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='Release']")
	public WebElementFacade btn_defecttask_release; 
	
	@FindBy(xpath=".//*[@id='left-content-tab']//label[starts-with(text(),'MCO:')]/following-sibling::div/select")
	public WebElementFacade ddl_defecttask_mcofield; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[starts-with(text(),'Task Status:')]/following-sibling::label")
	public WebElementFacade lbl_Defecttask_taskstatus;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[starts-with(text(),'Assigned To:')]/following-sibling::label")
	public WebElementFacade lbl_Defecttask_assignedto;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[starts-with(text(),'Task ID:')]/following-sibling::label")
	public WebElementFacade lbl_Defecttask_taskid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttabletaskGrid')]/div[1]/div[1]/div/div/div")
	public WebElementFacade cbk_defecttask_select;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-model='action']")
	public WebElementFacade ddl_defecttask_action;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Go']")
	public WebElementFacade btn_defecttask_action_go;
	
	//---- Selecting a Tag value in Defect tasks
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tags']/following-sibling::div//*[@id='dropdownlistArrowtagsjqxComboBox']")
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='dropdownlistContenttagsjqxComboBox']")
	public WebElementFacade btn_defecttask_tags_dropdown;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='dropdownlistContenttagsjqxComboBox']//input")
	public WebElementFacade btn_defecttask_tags_Edit;
	
	@FindBy(xpath=".//*[text()='Test_pop']")
	public WebElementFacade lbl_defecttask_tags_dropdown_value;
	
	@FindBy(xpath=".//span[text()='Tag-TC236840']")
	public WebElementFacade lbl_defecttask_tags_auto_dropdown_value;
	
	@FindBy(xpath="(.//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='Tags']/following-sibling::div//div[@ng-repeat='tagValue in selectedItemsData'])[2]")
	public WebElementFacade lbl_defecttask_tags_view_tagvalue;
	
	@FindBy(xpath="//*[@data-ng-click='deleteTag(tagValue)']/..")
	public WebElementFacade lbl_defecttask_tags_view_tagvalue1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@data-ng-click='deleteTag(tagValue)']")
	public WebElementFacade btn_defecttask_tags_removetags;
	
	
	@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[starts-with(text(),'Default Gateway:')]")
	public WebElementFacade lbl_defecttask_tags_defaultgateway;
	
	
	@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[starts-with(text(),'Default Gateway:')]/following-sibling::div//input")
	public WebElementFacade tbx_defecttask_tags_defaultgateway;
	
	
	//**********************************************		Advance Task Search ****************************************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='taskSearch();']")
	public WebElementFacade btn_task_advanced_search;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@name='projectID']")
	public WebElementFacade tbx_projectid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@for='projectID']")
	public WebElementFacade lbl_projectid;
	
	//###############################################		Orders Related Tab 		#############################################################################//
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@value='Dispatch']")
	public WebElementFacade btn_OrderRT_dispatch;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='cancelDeviceOrder();']")
	public WebElementFacade btn_taskresultpage_orderRT_cancelorder;
	
	//###############################################	Search slider and Advance Task search #############################################################################//
	
	@FindBy(xpath="//label[@for='taskStatus']/..//div[@role='button']")
	public WebElementFacade btn_task_status_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[1]//span")
	public List<WebElementFacade> lbl_task_status_values;
	
	@FindBy(xpath="//label[@for='workgroup']/..//div[@role='button']")
	public WebElementFacade btn_workgroup_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[2]//span")
	public List<WebElementFacade> lbl_workgroup_values;
	
	@FindBy(xpath="//label[@for='taskName']/..//div[@role='button']")
	public WebElementFacade btn_taskname_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[3]//span")
	public List<WebElementFacade> lbl_taskname_values;
	
	@FindBy(xpath="//select[@id='lata']")
	public WebElementFacade ddl_lata_tasksearch;
	
	@FindBy(xpath="//select[@id='lata']/option")
	public List<WebElementFacade> lbl_lata_values;
	
	@FindBy(xpath="//select[@id='state']")
	public WebElementFacade ddl_state_tasksearch;
	
	@FindBy(xpath="//select[@id='state']/option")
	public List<WebElementFacade> lbl_state_values;
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='taskStatus']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_task_status_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[6]//span")
	public List<WebElementFacade> lbl_Advancesearch_task_status_values;
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='workgroup']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_workgroup_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[4]//span")
	public List<WebElementFacade> lbl_Advancesearch_workgroup_values;
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='taskName']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_taskName_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[5]//span")
	public List<WebElementFacade> lbl_Advancesearch_taskName_values;
	
	/*@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='componentStatus']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_componentStatus_dropdown;
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='taskStatus']/..//div[@role='button']")
	public List<WebElementFacade> lbl_Advancesearch_componentStatus_values;*/
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='componentType']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_componentType_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[8]//span")
	public List<WebElementFacade> lbl_Advancesearch_componentType_values;
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='Error Reason']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_Error_Reason_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[9]//span")
	public List<WebElementFacade> lbl_Advancesearch_Error_Reason_values;
	
	@FindBy(xpath="//div[@ng-controller='taskAdvSearchctrl']//label[@for='lata']/..//div[@role='button']")
	public WebElementFacade btn_Advancesearch_lata_dropdown;
	
	@FindBy(xpath="(//div[contains(@id,'listBoxContentinnerListBox')]/div)[10]//span")
	public List<WebElementFacade> lbl_Advancesearch_lata_values;
	
	@FindBy(xpath="//div[@id='dropdownlistContenttaskStatusjqxComboBox']/input")
	public WebElementFacade ddl_searchtab_taskstatus;
	
	@FindBy(xpath="//div[@id='dropdownlistContentworkgroupjqxComboBox']/input")
	public WebElementFacade ddl_searchtab_workgroup;
	
	@FindBy(xpath="//div[@id='dropdownlistContenttaskNamejqxComboBox']/input")
	public WebElementFacade ddl_searchtab_taskname;
	
	@FindBy(xpath="(.//*[@ng-click='searchTask();'])[1]")
	public WebElementFacade btn_tasksearch;
	
	@FindBy(xpath="//*[contains(@id,'dropdownlistContent')]/div/div/div")
	public WebElementFacade btn_drodown_values_closeicon;
	
	@FindBy(xpath="(.//*[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//b)[1]")
	public WebElementFacade lbl_searchtab_value;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContenttaskStatusjqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_taskstatus;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContentworkgroupjqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_workgroup;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContenttaskNamejqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_taskname;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContenttaskStatejqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_State;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContentcompTypejqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_ComponentType;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContentcompStatusjqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_ComponentStatus;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContenterrorReasonjqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_ErrorReason;
	
	@FindBy(xpath="//form[@name='TaskSearch']//div[contains(@id,'dropdownlistContentLATAjqxComboBox')]/input")
	public WebElementFacade ddl_Advancesearch_Lata;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Task Results')]")
	public WebElementFacade tab_taskResults;
	
	@FindBy(xpath=".//div[@title='previous']/div")
	public WebElementFacade btn_taskResults_previous;
	
	@FindBy(xpath="//button[@ng-click='taskSearch();']")
	public WebElementFacade btn_task_advancesearch_search;
	
	@FindBy(xpath=".//*[@ng-click='removeAllTabs()']")
	public WebElementFacade tab_closeall_tab;
	
	@FindBy(xpath="(//div[@ng-controller='taskAdvSearchctrl']//div[@ng-show='showAlert'])[1]")
	public WebElementFacade lbl_Alert_message;
	
	@FindBy(xpath ="//div[contains(text(),' of ')]")
	public WebElementFacade lbl_results_count;
	
	////////////Disconnect task UI/////////////
	
	
	@FindBy(xpath=".//div[@id='taskssearch']/div//button[@type='button']")
	public WebElementFacade ddl_searchtab_searchbtn_task;
	
	@FindBy(xpath=".//button[contains(@ng-click,'proceed')]")
	public WebElementFacade ddl_discnttask_proceedbtn;
	
	@FindBy(xpath=".//button[contains(@ng-click,'abort')]")
	public WebElementFacade ddl_discnttask_abortbtn;
	
	
	@FindBy(xpath=".//*[text()='Workgroup:']//following-sibling::label")
	public WebElementFacade ddl_discnttask_wrkgrp;
	
	
	@FindBy(xpath=".//label[@for='DSP_CORRELATION_ID']//following-sibling::input")
	public WebElementFacade ddl_discnttask_cid;
	//////////////////////////////
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_view_task;
	}
				
	public WebElementFacade ViewDSPtaskclick(){
		jsClick(btn_DSPview_task);
		return lbl_General_task_details;		
	}
	
	public WebElementFacade EditDSPtaskclick(){
		String taskpath=".//*[@ng-click='gridSettings.editTaskDetailDsp(";
		for(int i=0;i<5;i++){
			String edittaskpath=taskpath+i+")' and @title='Edit DSP Task']";
			String taskstatuspath=".//*[contains(@id,'row"+i+"taskGrid_')]/div[7]/div";
			if(loginPage.getDriver().findElement(By.xpath(taskstatuspath)).getText().equals("Open")||loginPage.getDriver().findElement(By.xpath(taskstatuspath)).getText().equals("Assigned")){
				jsClick(loginPage.getDriver().findElement(By.xpath(edittaskpath)));
				break;
			}
		}
		slf4jLogger.info("Found an open task");
		//btn_DSPedit_task);
		return lbl_General_task_details;		
	}
	
	public WebElementFacade ViewcompletedDSPtaskclick(){
		
		String viewtaskpath=".//*[@ng-click='gridSettings.viewTaskDetailDsp(";
		for(int i=0;i<5;i++){
			String viewcompletedtaskpath=viewtaskpath+i+")' and @title='View DSP Task']";
			String taskstatuspath=".//*[contains(@id,'row"+i+"taskGrid_')]/div[7]/div";
			if(loginPage.getDriver().findElement(By.xpath(taskstatuspath)).getText().equals("Completed")){
				jsClick(loginPage.getDriver().findElement(By.xpath(viewcompletedtaskpath)));
				slf4jLogger.info("Found the completed Task");
				break;
			}
		}
		return lbl_General_task_details;
	}
	
	public WebElementFacade fallouttaskclick(){
		jsClick(btn_view_task);
		return lbl_iframeview;
	}
	public void ViewDSPtask(){
		int i=0;
			while(!lbl_General_task_details.isPresent()){
				String Title = loginPage.getDriver().findElement(By.xpath("//*[@id='row"+i+"taskGrid_0']/div[3]/div/input")).getAttribute("title");
				System.out.println(Title);
				if(Title.contains("View DSP Task")){
					jsClick(loginPage.getDriver().findElement(By.xpath(".//*[@id='row"+i+"taskGrid_0']/div[1]")));
				}
				i=i++;
			}
	}
	public void taskviewvalidation(String viewtask){
		if(viewtask.equals("API View")){
			if(lbl_General_task_details.isDisplayed() && lbl_Actions.isDisplayed() && lbl_Task_specific_info.isDisplayed() && lbl_Task_workflow.isDisplayed()){
				slf4jLogger.info("Able to see the API view for the Autoform task");
			} else throw new Error("API View is not displayed");
		} else if(viewtask.equals("Iframe View")){	
			if(lbl_iframeview.isDisplayed()){
				slf4jLogger.info("Able to see the Iframe view for the Fallout task");
			} else throw new Error("Iframe View is not displayed");
			loginPage.getDriver().switchTo().defaultContent();
		}
	}
	public void APIsectionvalidation(String tasksec){
		
		if(lbl_Task_actions.getText().equals("ALU7750 BRAS Configuration")||lbl_Task_actions.getText().equals("Clean up Network in Inventory Fallout")||lbl_Task_actions.getText().equals("Confirm Inventory Speed Change")||lbl_Task_actions.getText().equals("Create FiberLink Fallout")||lbl_Task_actions.getText().equals("Create HSI Fallout")||lbl_Task_actions.getText().equals("Create ONT")||lbl_Task_actions.getText().equals("Create OVC VLAN Association Fallout")||lbl_Task_actions.getText().equals("Create PON Fallout")||lbl_Task_actions.getText().equals("DeactivateCustomerService")||lbl_Task_actions.getText().equals("Define PON Route")||lbl_Task_actions.getText().equals("Design and assign HSI service fallout")||lbl_Task_actions.getText().equals("DGWFallout")||lbl_Task_actions.getText().equals("Clean up Network in Inventory Fallout")||lbl_Task_actions.getText().equals("Identify And Assign CTag")||lbl_Task_actions.getText().equals("Identify Service Area Terminal")||lbl_Task_actions.getText().equals("IMPROV Integration fallout task")||lbl_Task_actions.getText().equals("Incorrect or Missing Platform ID")||lbl_Task_actions.getText().equals("ISAT Activation Fallout Task")||lbl_Task_actions.getText().equals("Revert IPTV Manual Task")||lbl_Task_actions.getText().equals("HSI/HIS+IPTV Supp-Manual fallout")||lbl_Task_actions.getText().equals("Manual Jeopardy Task")||lbl_Task_actions.getText().equals("Manually Design And Assign Fallout Task")||lbl_Task_actions.getText().equals("Manual task invalid state for NEWHSI")||lbl_Task_actions.getText().equals("Manual task SLA breach for NEWHSI")||lbl_Task_actions.getText().equals("Notification to IMPROV Failure")||lbl_Task_actions.getText().equals("OLT Can Not Support Service")||lbl_Task_actions.getText().equals("ONT Out Of Capacity")||lbl_Task_actions.getText().equals("Splitter Out Of Capacity")||lbl_Task_actions.getText().equals("Manually Design And Assign Fallout Task")||lbl_Task_actions.getText().equals("UpdateInventoryForCancelOfInstall")||lbl_Task_actions.getText().equals("MLTO Dispatch Successful, Cancel MLTO")||lbl_Task_actions.getText().equals("Structure Loader ICL manual falloutForCreateHSI")||lbl_Task_actions.getText().equals("Structure Loader Create HSI fallout task IPTV")||lbl_Task_actions.getText().equals("DeactiveOrderInEMS/CMS")||lbl_Task_actions.getText().equals("DeaactiveOrderInCBRASforIMPROV")||lbl_Task_actions.getText().equals("Structure Loader ICL manual falloutForCPELocation")||lbl_Task_actions.getText().equals("AddHSI to IMPROV fallout task")||lbl_Task_actions.getText().equals("ICLUpdateServiceFailure")||lbl_Task_actions.getText().equals("Update Inv-Disconnect Location For IPTV")||lbl_Task_actions.getText().equals("Assign and Design for Default Change")||lbl_Task_actions.getText().equals("Update Inventory For Default Change")||lbl_Task_actions.getText().equals("Assign And Design For To Location")||lbl_Task_actions.getText().equals("Update Inv disconnect From Location")||lbl_Task_actions.getText().equals("Manually Select Location")||lbl_Task_actions.getText().equals("Manual fallout for select subscriber")||lbl_Task_actions.getText().equals("Create Subscriber and/or Location in CLC Fallout")||lbl_Task_actions.getText().equals("Manually create location")){
		
			slf4jLogger.info("Autoform task");
			if(tasksec.equals("GPON General Task Details Area")){
				slf4jLogger.info("GPON General Task validations");
		
			List<WebElementFacade> generaltasklist = lbl_General_task_list;
			ArrayList<String> generaltaskatributesOfPage=new ArrayList<String>();
			//slf4jLogger.info("Step one done");
		
			for(int j=0;j<generaltasklist.size();j++){
			
				generaltaskatributesOfPage.add(j, generaltasklist.get(j).getText());
			
			//slf4jLogger.info("Step Two done");
			//slf4jLogger.info(atributesOfPage.get(j));
		}
			ArrayList<String> taskAttributestobepresent = new ArrayList<String>();

			taskAttributestobepresent.add(0, "Task ID:");
			taskAttributestobepresent.add(1, "Created By:");
			taskAttributestobepresent.add(2, "Create Date:");
			taskAttributestobepresent.add(3, "Task Status:");
			taskAttributestobepresent.add(4, "WorkGroup:");
			taskAttributestobepresent.add(5, "Due Date:");
			taskAttributestobepresent.add(6, "Assigned To:");
			taskAttributestobepresent.add(7, "Completed By:");
			taskAttributestobepresent.add(8, "Completed Date:");			
			taskAttributestobepresent.add(9, "Task Name:");			
			taskAttributestobepresent.add(10, "Task Type:");
			taskAttributestobepresent.add(11, "Task Description:");
		
			System.out.println(generaltaskatributesOfPage);
			
			for(int i=0;i<generaltaskatributesOfPage.size();i++){
				if(generaltaskatributesOfPage.get(i).equals(taskAttributestobepresent.get(i))){
					slf4jLogger.info("All the attributes are present in GPON General Task Details Area");								
				} else throw new Error("Atrributes are mismatching in GPON General Task Details Area");	
				
				
			}
			
				
		} else if(tasksec.equals("GPON Task Specific Details Area")){
			
			slf4jLogger.info("GPON Task Specific validations Starts from here");
			
			/*List<WebElementFacade> specifictasklist = lbl_task_specific_list;
			ArrayList<String> specifictaskatributesOfPage=new ArrayList<String>();
			//slf4jLogger.info("Step one done");
		
			for(int j=0;j<specifictasklist.size();j++){
			
				specifictaskatributesOfPage.add(j, specifictasklist.get(j).getText());
			
			//slf4jLogger.info("Step Two done");
			//slf4jLogger.info(atributesOfPage.get(j));
		}*/
			/*ArrayList<String> taskspecificAttributestobepresent = new ArrayList<String>();

			taskspecificAttributestobepresent.add(0, "Ensemble Order Number/ID:");
			taskspecificAttributestobepresent.add(1, "CSOF ID:");
			taskspecificAttributestobepresent.add(2, "Customer DTN:");
			taskspecificAttributestobepresent.add(3, "Customer Name:");
			taskspecificAttributestobepresent.add(4, "GPON Wiki URL Link:");
			*/
		
			//slf4jLogger.info(specifictaskatributesOfPage);
			
			if(lbl_Taskspecific_ensembleorder.isDisplayed() && lbl_Taskspecific_csofid.isDisplayed() && lbl_Taskspecific_custdtn.isDisplayed() && lbl_Taskspecific_custname.isDisplayed() && lbl_Taskspecific_gponwikilink.isDisplayed()){
				slf4jLogger.info("Task Specific details are seen as expected");
			} else throw new Error("Task specific details are not seen");	
				
		
		} else if(tasksec.equals("Field in General Task Details")) {
			slf4jLogger.info("Field in General Task Details");
			
		}
		
		} else throw new Error("Not a Autoform Task");	
	}
	
	
	public void taskactionbuttonvalidation(String viewtask){
		
		if(lbl_Actions.isPresent()){
				if (viewtask.equals("View Action")){
					if(btn_taskaction_retry.isEnabled() && btn_taskaction_reassign.isEnabled() && btn_taskaction_complete.isEnabled() && btn_taskaction_save.isEnabled()){
						throw new Error("Task actions are enabled for the View Task");	
					}			
				} else if (viewtask.equals("Edit Action")){
					// Save button Validation
					if(btn_taskaction_save.isEnabled()){
					if(lbl_Task_actions.getText().equals("Identify Service Area Terminal")||lbl_Task_actions.getText().equals("Manually Select Location")||lbl_Task_actions.getText().equals("Manual fallout for select subscriber")||lbl_Task_actions.getText().equals("Manually create location")){
						slf4jLogger.info("Save button is enabled for the task");
					} else throw new Error("Save button is enabled for the wrong autoform task");	
					} 
					if(btn_taskaction_retry.isEnabled()){
						if(lbl_Task_actions.getText().equals("Create FiberLink Fallout")||lbl_Task_actions.getText().equals("Create HSI Fallout")||lbl_Task_actions.getText().equals("Create ONT")||lbl_Task_actions.getText().equals("Create OVC VLAN Association Fallout")||lbl_Task_actions.getText().equals("Create PON Fallout")||lbl_Task_actions.getText().equals("DGWFallout")||lbl_Task_actions.getText().equals("Identify And Assign CTag")||lbl_Task_actions.getText().equals("Identify Service Area Terminal")||lbl_Task_actions.getText().equals("ISAT Activation Fallout Task")||lbl_Task_actions.getText().equals("Notification to IMPROV Failure")||lbl_Task_actions.getText().equals("OLT Can Not Support Service")||lbl_Task_actions.getText().equals("ONT Out Of Capacity")||lbl_Task_actions.getText().equals("Splitter Out Of Capacity")||lbl_Task_actions.getText().equals("Manually Design And Assign Fallout Task")){
							slf4jLogger.info("Re-try button is enabled for the task");
						} else throw new Error("Re-try button is enabled for the wrong autoform task");						
					}
					if(btn_taskaction_reassign.isEnabled() && btn_taskaction_complete.isEnabled()){
						slf4jLogger.info("Re-Assign & Complete button is enabled for the task");
					} else throw new Error("Re-Assign & Complete button are in Disabled state");	
					
				}
		}
	}
	
	
	public void Validation_Gfast_order_Task() {
		loginPage.waitFor(btn_Task_search_result_go);
		
		String task_columnheader=".//*[contains(@id,'columntabletaskGrid_')]/div[";			
				
		String task_content_row=".//*[contains(@id,'contenttabletaskGrid_')]/div[";
		int pos_header_col=3;
		while(!loginPage.getDriver().findElement(By.xpath(task_columnheader+pos_header_col+"]/div/div[1]")).getText().equals("Task Status")){
			slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(task_columnheader+pos_header_col+"]/div/div[1]")).getText());
			pos_header_col++;
		}
		
		int pos_row_sec=1;
		while(pos_row_sec!=0){
			slf4jLogger.info(loginPage.getDriver().findElement(By.xpath(task_content_row+pos_row_sec+"]/div["+pos_header_col+"]/div")).getText());
			pos_row_sec++;
			if(!loginPage.isElementVisible(By.xpath(task_content_row+pos_row_sec+"]/div["+pos_header_col+"]/div"))){
				slf4jLogger.info("Only That many Task");
				break;
			}
		}
			
	}
	
	
	public void Tasktab_namevalidation() throws Throwable {
		waitForElement(tab_Taskview_dsp_task_details);
		Thread.sleep(3000);
		 
		 String Taskid=tab_search_result_details.getText().replaceAll("\\s","");
			if(lbl_tasksearch_taskid.isCurrentlyVisible()){
				if(Taskid.contains(lbl_tasksearch_taskid.getText().replaceAll("\\s","").trim())){
					slf4jLogger.info("Task Tab Name is matching with the Task id Text field");
				} else throw new Error("Task id name is not matching with Tab name");
			}
		
	}
	
	
	public void Sanity_Task_validations() throws Throwable {		
		
		Tasktab_namevalidation();
		
		if(!tab_Taskview_dsp_task_details.isCurrentlyVisible()){
			throw new Error("DSP Task Details Tab is not displayed in Task View page");
		}
		
		if(!tab_Taskview_Auditlogs.isCurrentlyVisible()){
			throw new Error("Audit logs Tab is not displayed in Task View page");
		}	
		
		if(lbl_tasksearch_taskid.isCurrentlyVisible()){
			
			
			
			if(!lbl_General_task_details.isCurrentlyVisible()){
				throw new Error("General Task Details is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_taskid.isCurrentlyVisible()){
				throw new Error("General Task Details-Task ID is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_createdby.isCurrentlyVisible()){
				throw new Error("General Task Details-Created By is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_createddate.isCurrentlyVisible()){
				throw new Error("General Task Details-Created Date is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_Taskstatus.isCurrentlyVisible()){
				throw new Error("General Task Details-Task Status is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_workgrp.isCurrentlyVisible()){
				throw new Error("General Task Details-Workgroup is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_duedate.isCurrentlyVisible()){
				throw new Error("General Task Details-Due Date is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_assignedto.isCurrentlyVisible()){
				throw new Error("General Task Details-Assigned to is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_completedby.isCurrentlyVisible()){
				throw new Error("General Task Details-Completed by is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_completeddate.isCurrentlyVisible()){
				throw new Error("General Task Details-Completed Date is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_taskname.isCurrentlyVisible()){
				throw new Error("General Task Details-Task Name is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_tasktype.isCurrentlyVisible()){
				throw new Error("General Task Details-Task Type is not displayed in Task View page");
			}
			
			if(!lbl_General_task_details_taskdescription.isCurrentlyVisible()){
				throw new Error("General Task Details-Task Description is not displayed in Task View page");
			}
			
			if(!btn_taskaction_retry.isCurrentlyVisible() && btn_taskaction_retry.isCurrentlyEnabled()){
				throw new Error("Retry button is not displayed in Task View page");
			}
			
			if(!btn_taskaction_reassign.isCurrentlyVisible() && btn_taskaction_reassign.isCurrentlyEnabled()){
				throw new Error("Re-Assign button is not displayed in Task View page");
			}
			
			if(!btn_taskaction_complete.isCurrentlyVisible() && btn_taskaction_complete.isCurrentlyEnabled()){
				throw new Error("Complete button is not displayed in Task View page");
			}
			
			if(!btn_taskaction_save.isCurrentlyVisible() && btn_taskaction_save.isCurrentlyEnabled()){
				throw new Error("Save button is not displayed in Task View page");
			}
			
			
			
		}


		
		
		//#################################		Related Tab validations  ###############################################//
		
		//################################ Related Tabs Validations in Task view ############################################//	  
				
		
				
		if(!tab_Armor.isCurrentlyVisible() ){
			throw new Error("ARMOR Related Tab is missing in Task View page");
		}
				
		if(!tab_bamreport.isCurrentlyVisible() ){
			throw new Error("BAM Report Related tab is missing in Task View page");
		}		
			
		if(!tab_Devices.isCurrentlyVisible()  ){
			throw new Error("Devices Related Tab is missing in Task View page");
		}
				
		if(!tab_Locations.isCurrentlyVisible()){
			throw new Error("Location Related tab is missing in Task View page");
		}
				
		if(!tab_orders.isCurrentlyVisible()){
			throw new Error("Orders Related Tab is missing in Task View page");
		}		
				
		if(!tab_Subscriber.isCurrentlyVisible()){
			throw new Error("Subscriber Related Tab is missing in Task View page");
		}
						
		
				
		if(!tab_TIRKS.isCurrentlyVisible() ){
			throw new Error("TIRKS Related Tab is missing in Task View page");
		}
		
		if(!tab_RMA.isCurrentlyVisible() ){
			throw new Error("RMA Related Tab is missing in Task View page");
		}
		
		if(!tab_RMA_rehome.isCurrentlyVisible() ){
			throw new Error("RMA_Rehome Related Tab is missing in Task View page");
		}
		
		if(!tab_wfac.isCurrentlyVisible() ){
			throw new Error("WFA/C Related Tab is missing in Task View page");
		}
		
		
						
					
		//################################ Related Tabs should not be displayed Task view ############################################//
		
		if(tab_Tasks.isCurrentlyVisible()){
			   throw new Error("Task Related Tab is Displayed in Task View page");
			}
		
		if(tab_Activations.isCurrentlyVisible() ){
			throw new Error("Activation Related Tab is Displayed in Task View page");
		}
		
		
		if(tab_circuitdetails.isCurrentlyVisible() ){
			throw new Error("Circuit Details Related tab is Displayed in Task View page");
		}
				
		if(tab_Circuits.isCurrentlyVisible()){
			throw new Error("Circuit Related Tab is Displayed in Task View page");
		}
		
		if(tab_facilities.isCurrentlyVisible()  ){
			throw new Error("Facilities Related Tab is Displayed in Task View page");
		}
		
		if(tab_Service_Areas.isCurrentlyVisible()){
			throw new Error("Service Area Related Tab is Displayed in Task View page");
		}
				
		if(tab_services.isCurrentlyVisible()){
			throw new Error("Services Related Tab is Displayed in Task View page");
		}			
						
		if(tab_ctag.isCurrentlyVisible()){
			throw new Error("CTAG Related Tab is Displayed in Task View page");
		}		
					
		if(tab_contact.isCurrentlyVisible()){
			throw new Error("Contact Related Tab is Displayed in Task View page");
		}
						
		if(tab_Device_ports.isCurrentlyVisible()){
			throw new Error("Audit Logs Tab is Displayed in Task View page");
		}				
								
		if(tab_Performance.isCurrentlyVisible()){
			throw new Error("Performance Related Tab is Displayed in Task View page");
		}
						
		if(tab_Virtual_Ports.isCurrentlyVisible()){
			throw new Error("Virtual VLAN Ports Related Tab is Displayed in Task View page");
		}	
	}
	
	//#################################################   End Of Sanity #################################################################//
	
	public WebElementFacade Auditlogstabclick() {
		
		jsClick(tab_Taskview_Auditlogs);
		if(!lbl_task_auditlogs_nologsmsg.isCurrentlyVisible()){
			waitForElement(btn_task_auditlogs_getlogs);
			return btn_task_auditlogs_getlogs;
		} else {
			waitForElement(btn_task_auditlogs_nologsmsg_getlogs);
			return btn_task_auditlogs_nologsmsg_getlogs;
		}
		
	}
	
	public void Validate_FROM_Archie_Auditlog(String place){
		if(!lbl_task_auditlogs_nologsmsg.isCurrentlyVisible()){
			waitForElement(btn_task_auditlogs_getlogs);
			if(!cbk_task_auditlogs_fromarchive.isCurrentlyVisible()) {
				throw new Error("From Archive check box in Audit logs is missing in "+place);
			}
		} else {
			waitForElement(btn_task_auditlogs_nologsmsg_getlogs);
			if(!cbk_task_auditlogs_nologsmsg_fromarchive.isCurrentlyVisible()) {
				throw new Error("From Archive check box in Audit logs is missing in "+place);
			}
		}	
		
	}
	
	public void Auditlogs_witharchive_validation() throws Throwable {
		if(!lbl_task_auditlogs_nologsmsg.isCurrentlyVisible()){
			jsClick(cbk_task_auditlogs_fromarchive);
			jsClick(btn_task_auditlogs_getlogs);			
		} else {
			jsClick(cbk_task_auditlogs_nologsmsg_fromarchive);
			jsClick(btn_task_auditlogs_nologsmsg_getlogs);
		}
		
		//waitForAbsenceOf(lbl_auditlogs_loader);
		Thread.sleep(5000);
	}
	
	public void Validate_Auditlog_witharchieve(){
		if(lbl_task_auditlogs_nologsmsg.isCurrentlyVisible()){
			slf4jLogger.info("Validate with the ARM DB");
		} else {
			slf4jLogger.info("Able to see the logs");
		}
	}
	
	public void Validate_defecttask_button() throws Throwable {
		waitForElement(btn_defecttask_edittask);
		if(btn_defecttask_edittask.isCurrentlyVisible() && btn_defecttask_edittask.isCurrentlyEnabled()){
			slf4jLogger.info("Edit button is enabled for the Defect Task as expected");
		}else throw new Error("Edit button is not enabled for the Defect Task");
	}
	
	
	public void click_edit_open_defectTask(String action) throws Throwable {
		switch (action){
		case "Test Auto value from Tags dropdown":jsClick(btn_defecttask_tags_dropdown);
												btn_defecttask_tags_Edit.type("AUTO Test");	Thread.sleep(1000);
												//btn_defecttask_tags_dropdown.type("TEST234");
														
												waitForElement(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));
												Thread.sleep(2000);
												jsClick(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));
													
													
													break;
			
		case "View":jsClick(btn_defecttask_viewtask);waitForElement(btn_defecttask_Save); break;
		case "Edit":jsClick(btn_defecttask_edittask);
					waitForElement(btn_defecttask_Save); break;
		case "Save":if(ddl_defecttask_mcofield.isCurrentlyVisible()){
							ddl_defecttask_mcofield.selectByVisibleText("NATLIPNMCEQCTL"); 
						}jsClick(btn_defecttask_Save); waitForElement(lbl_Defecttaskmsg);break;
		case "Complete":jsClick(btn_defecttask_Complete);  waitForElement(lbl_Defecttaskmsg);break;
		case "Claim": jsClick(btn_defecttask_claim); waitForElement(lbl_Defecttaskmsg);break;
		case "Release": jsClick(btn_defecttask_release); waitForElement(lbl_Defecttaskmsg);break;
		case "Test_pop value from Tags dropdown": jsClick(btn_defecttask_tags_dropdown);
		btn_defecttask_tags_Edit.type("Test_pop");
		Thread.sleep(1000);
		//waitForElement(lbl_defecttask_tags_dropdown_value);
		jsClick(lbl_defecttask_tags_dropdown_value);
		break;
		case "Remove the assigned Tag":jsClick(btn_defecttask_tags_removetags); waitForElement(lbl_Defecttaskmsg);validate_defecttask_message("Un-assigning the tag from task"); break;
		case "Save Action":
			jsClick(btn_defecttask_Save); 
		waitForElement(lbl_Defecttaskmsg);
		validate_defecttask_message("Save");break;
		case "Tag-TC236840":jsClick(btn_defecttask_tags_dropdown);waitForElement(lbl_defecttask_tags_auto_dropdown_value);jsClick(lbl_defecttask_tags_auto_dropdown_value);break;
		
	
		}
		
	}
	
	public String Validate_defecttask_status_assigned() throws Throwable {
		 
		
		
		if(lbl_Defecttask_taskstatus.getText().trim().equals("Assigned")){
			slf4jLogger.info("Task Status is updated as Assigned as expected");
		} else throw new Error("Task Status is Wrongly updated as"+lbl_Defecttask_taskstatus.getText().trim());
		
		if(lbl_Defecttask_assignedto.getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
			slf4jLogger.info("Assigned to field is updated as"+lbl_Defecttask_assignedto.getText().trim()+" as expected");
		} else throw new Error("Assigned tos is Wrongly updated as"+lbl_Defecttask_assignedto.getText().trim());
		
		
		return lbl_Defecttask_taskid.getText().trim();
		
	}
	
	public String validate_defecttask_message(String status)  throws Throwable {
		String Message = lbl_Defecttaskmsg.getText();
		Message = Message.toString().substring(1);
		
		Message = Message.trim(); 
		
		switch(status){
		case "Save": if (Message.equals("Defect task details saved successfully")) {
			
			slf4jLogger.info("DefectTask_Message ="+lbl_Defecttaskmsg.getText());
			
			slf4jLogger.info("Success");
			
		} else throw new Error("Invalid message is dispalyed as "+Message); break;
		
		case "Complete": if (Message.equals("Defect task details submitted successfully")) {
			
							slf4jLogger.info("DefectTask_Message ="+lbl_Defecttaskmsg.getText());
							
							slf4jLogger.info("Success");
							
						} else throw new Error("Invalid message is dispalyed as "+Message); break;
						
		case "Already assigned": if(!Message.equals("The defect task is already assigned to you.")){
										throw new Error("Wrong status message is been displayed: "+lbl_Defecttaskmsg.getText().trim());
									} break;
									
		case "Assigned": if(!Message.equals("Defect task claimed successfully.")){
								throw new Error("Wrong status message is been displayed: "+lbl_Defecttaskmsg.getText().trim());
							}  break;
							
		case "Release":if(!Message.equals("Defect task released successfully.")){
							throw new Error("Wrong status message is been displayed: "+lbl_Defecttaskmsg.getText().trim());
						} break;
						
		case "Un-assigning the tag from task":if(!Message.equals("Tag association from this task has been deleted successfully")){
												throw new Error("Wrong status message is been displayed: "+lbl_Defecttaskmsg.getText().trim());
											} break;
									
									
		}
		
		
		
		return lbl_Defecttask_taskid.getText().trim();
	}
	
	public String search_defecttaskby(String criteria) throws Throwable {
		
		waitForElement(tab_DefecttaskResults);
		
		int i=2;
		
		while(i!=0){
			if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'columntabletaskGrid')]/div["+i+"]//span")).getText().equals("Task Name")){
				
				break;
			}
			i++;
		}
		
		int j=1;
		while(j!=0){
			if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim().length()>0){
				break;
			}
			j++;
		}	
		String Taskname=getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim();	
		return Taskname;	
	}
	public void click_task_searchbtn() throws Throwable{
		jsClick(btn_tasksearch); 
		Thread.sleep(5000);
		if(tab_taskResults.isCurrentlyVisible()){
			Thread.sleep(2000);
			String results_count[] = lbl_results_count.getText().split(" of ");
			System.out.println("Results count "+results_count[1]);
			//jsClick(btn_taskResults_previous);Thread.sleep(2000);
		}else{
			System.out.println("No Data Found");
		}
	}
	public void click_task_searchbtn_advancesearch_page() throws Throwable{
		jsClick(btn_task_advancesearch_search); //waitForElement(tab_closeall_tab); 
		Thread.sleep(5000);
		if(tab_taskResults.isCurrentlyVisible()){
			Thread.sleep(2000);
			String results_count[] = lbl_results_count.getText().split(" of ");
			System.out.println("Results count "+results_count[1]);
			//jsClick(btn_taskResults_previous);Thread.sleep(2000);
		}else{
			lbl_Alert_message.shouldBeCurrentlyVisible();
			System.out.println(lbl_Alert_message.getText());
		}
	}
	public void task_search_select_value_from_dropdown(String value, String dropdown)throws Throwable{
		waitForElement(btn_tasksearch);
		if(btn_drodown_values_closeicon.isCurrentlyVisible()){
			jsClick(btn_drodown_values_closeicon);
		}
		switch(dropdown){
		case "TaskStatus": 
			ddl_searchtab_taskstatus.type(value);	Thread.sleep(1000);ddl_searchtab_taskstatus.type(value);
			
			waitForElement(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));
			Thread.sleep(2000);
			jsClick(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));

			/*ddl_searchtab_taskstatus.sendKeys(value);;	
				Thread.sleep(3000);	    
				 if(lbl_searchtab_value.isCurrentlyVisible()){
					 jsClick(lbl_searchtab_value); Thread.sleep(2000); */
					 break;
				// }
		case "Workgroup":
				ddl_searchtab_workgroup.type(value);	
				Thread.sleep(3000);	    
				 if(lbl_searchtab_value.isCurrentlyVisible()){
					 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
					 break;
				 }

		case "TaskName":
			ddl_searchtab_taskname.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		case "Lata":
			ddl_lata_tasksearch.selectByVisibleText(value);
			 break;
		case "State":
			ddl_state_tasksearch.selectByVisibleText(value);
			 break;
		}
	}
	public void task_advancesearch_select_value_from_dropdown(String value, String dropdown)throws Throwable{
		//waitForElement(btn_tasksearch);
		if(btn_drodown_values_closeicon.isCurrentlyVisible()){
			jsClick(btn_drodown_values_closeicon);
		} 
		switch(dropdown){
		case "TaskStatus": 
			ddl_Advancesearch_taskstatus.type(value); Thread.sleep(1000);ddl_Advancesearch_taskstatus.type(value);
			
			waitForElement(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));
			Thread.sleep(2000);
			jsClick(getDriver().findElement(By.xpath(".//*[contains(@id,'innerListBoxjqxWidget')]//div[contains(@id,'listBoxContentinnerListBoxjqxWidget')]//span[contains(@class,'jqx-fill-state-pressed')]")));
				/*Thread.sleep(3000);	    
				 if(lbl_searchtab_value.isCurrentlyVisible()){
					 jsClick(lbl_searchtab_value); Thread.sleep(2000);
					 } */
			 break;

		case "Workgroup":
			ddl_Advancesearch_workgroup.type(value);	
				Thread.sleep(3000);	    
				 if(lbl_searchtab_value.isCurrentlyVisible()){
					 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
					 break;
				 }
		case "TaskName":
			ddl_Advancesearch_taskname.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		case "Lata":
			ddl_Advancesearch_Lata.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		case "State":
			ddl_Advancesearch_State.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		case "ComponentType":
			ddl_Advancesearch_ComponentType.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		case "ErrorReason":
			ddl_Advancesearch_ErrorReason.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		case "ComponentStatus":
			ddl_Advancesearch_ComponentStatus.type(value);
			Thread.sleep(3000);	    
			 if(lbl_searchtab_value.isCurrentlyVisible()){
				 jsClick(lbl_searchtab_value); Thread.sleep(2000); 
				 break;
			 }
		}
	}
	public void validate_task_search_dropdown(String field) throws Throwable{
		@SuppressWarnings("static-access")
		List<String> db_values =ovdb.Task_search_dropdown_values(field);
		List<String> ov_values = new ArrayList<String>();
		System.out.println("Database values = "+db_values);
		Thread.sleep(2000);
		switch(field){
		case "Task Status":
			btn_task_status_dropdown.click();
			Thread.sleep(1000);
			for(int i=0; i<=4; i++){
				ov_values.add(lbl_task_status_values.get(i).getText());
			}
			break;
		case "Workgroup":
			btn_workgroup_dropdown.click();
			Thread.sleep(1000);
			for(int i=0; i<=4; i++){
				ov_values.add(lbl_workgroup_values.get(i).getText());
			}
			btn_workgroup_dropdown.click();
			break;
		case "Task Name":
			btn_taskname_dropdown.click();
			Thread.sleep(1000);
			for(int i=1; i<=5; i++){
				ov_values.add(lbl_taskname_values.get(i).getText());
			}
			btn_taskname_dropdown.click();
			break;
		case "lata":
			ddl_lata_tasksearch.click();
			Thread.sleep(1000);
			for(int i=1; i<=5; i++){
				String lata = lbl_lata_values.get(i).getText();
				String lataname[] = lata.split(" ");
				ov_values.add(lataname[2]);
			}
			break;
		}
		System.out.println("OV values = "+ov_values);
		
		for(int j = 0;j<=db_values.size()-1;j++){
			for(int k = 0; k<=ov_values.size(); k++){
				if(db_values.get(j).contains(ov_values.get(k))){
					System.out.println(field+" dropdown value "+db_values.get(j)+" is avaliable in both db and OV");
					break;
				}
			}
		}
	}
	public void validate_task_advance_search_dropdown(String field) throws Throwable{
		@SuppressWarnings("static-access")
		List<String> db_values =ovdb.Task_search_dropdown_values(field);
		List<String> ov_values = new ArrayList<String>();
		System.out.println("Database values = "+db_values);
		Thread.sleep(2000);
		switch(field){
		case "Task Status":
			btn_Advancesearch_task_status_dropdown.click();
			Thread.sleep(2000);
			for(int i=0; i<=4; i++){
				ov_values.add(lbl_Advancesearch_task_status_values.get(i).getText());
			}
			btn_Advancesearch_task_status_dropdown.click();
			break;
		case "Workgroup":
			btn_Advancesearch_workgroup_dropdown.click();
			Thread.sleep(1000);
			for(int i=0; i<=4; i++){
				ov_values.add(lbl_Advancesearch_workgroup_values.get(i).getText());
			}
			btn_Advancesearch_workgroup_dropdown.click();
			break;
		case "Task Name":
			btn_Advancesearch_taskName_dropdown.click();
			Thread.sleep(1000);
			for(int i=1; i<=5; i++){
				ov_values.add(lbl_Advancesearch_taskName_values.get(i).getText());
			}
			btn_Advancesearch_taskName_dropdown.click();
			break;
		case "lata":
			btn_Advancesearch_lata_dropdown.click();
			Thread.sleep(1000);
			for(int i=0; i<=4; i++){
				String lata = lbl_Advancesearch_lata_values.get(i).getText();
				String lataname[] = lata.split("- ");
				ov_values.add(lataname[1]);
			}
			btn_Advancesearch_lata_dropdown.click();
			break;
		case "Error Reason":
			btn_Advancesearch_Error_Reason_dropdown.click();
			Thread.sleep(1000);
			for(int i=0; i<=4; i++){
				ov_values.add(lbl_Advancesearch_Error_Reason_values.get(i).getText());
			}
			btn_Advancesearch_Error_Reason_dropdown.click();
			break;
		case "Component Type":
			btn_Advancesearch_componentType_dropdown.click();
			Thread.sleep(1000);
			for(int i=0; i<=4; i++){
				ov_values.add(lbl_Advancesearch_componentType_values.get(i).getText());
			}
			btn_Advancesearch_componentType_dropdown.click();
			break;
		/*case "Component Status":
			btn_Advancesearch_componentStatus_dropdown.click();
			Thread.sleep(1000);
			for(int i=1; i<=5; i++){
				ov_values.add(lbl_taskname_values.get(i).getText());
			}
			btn_Advancesearch_componentStatus_dropdown.click();
			break;*/
		}
		System.out.println("OV values = "+ov_values);
		for(int j = 0;j<=db_values.size()-1;j++){
			for(int k = 0; k<=ov_values.size()-1; k++){
				if(db_values.get(j).contains(ov_values.get(k))){
					System.out.println("Task Advance search page "+field+" dropdown value "+db_values.get(j)+" is avaliable in both db and OV");
					break;
				}
			}
		}
	}
	public void verify_validation(String validation) throws Throwable {		
		int i=0;
		switch(validation){
		case "Task search slider dropdown values":
			Thread.sleep(3000);
			validate_task_search_dropdown("Task Status");
			validate_task_search_dropdown("Workgroup");
			validate_task_search_dropdown("Task Name");
			validate_task_search_dropdown("lata");
			break;
		case "Task Advance search dropdown values":
			Thread.sleep(3000);
			validate_task_advance_search_dropdown("Task Status");
			validate_task_advance_search_dropdown("Workgroup");
			validate_task_advance_search_dropdown("Task Name");
			validate_task_advance_search_dropdown("Error Reason");
			validate_task_advance_search_dropdown("Component Type");
			validate_task_advance_search_dropdown("lata");
			break;
		case "Defect Task Reports all sections":
						waitForElement(btn_defecttask_generateReport);
						jsClick(btn_defecttask_generateReport);
						Thread.sleep(3000);
						for(int j=2; j<=4; j++){
							String section_name = loginPage.getDriver().findElement(By.xpath("//div[@ng-if='!reportChartView']/div["+j+"]/div[1]")).getText();
							System.out.println(section_name+" section is avaliable in Defect task reports page");		 
							List<WebElement> sectionfields = loginPage.getDriver().findElements(By.xpath("//div[@ng-if='!reportChartView']/div["+j+"]/div[3]//strong"));
							System.out.println(section_name+" is has below fields:");
							for(int k=1; k<=sectionfields.size()-1; k++){
								System.out.println(sectionfields.get(k).getText());
						 }
						}
						break;
		case "All the fields in the advanced defect task search":
						@SuppressWarnings({ "unchecked", "rawtypes" }) List<String> Advance_Defect_task_fields_source = new ArrayList(Arrays.asList("Task Status", "Defect Task ID", "Device CLLI%","Device Name","Workgroup","Tag Name","Task Start & End Date","Task Creation Date",
			            "Task Completion Date", "Field Names", "Task Name", "Source System Name", "Inventory Source"));
						List<WebElementFacade> Advance_Defect_task_fields_in_ov = lbl_Advanced_defect_tasks_fields;
						if(Advance_Defect_task_fields_source.size()==Advance_Defect_task_fields_in_ov.size()){
							System.out.println("Validating the Advanced defect task fields");
						}else throw new Error("Actual and Expected fileds are not equal");
						
						for(int j = 0; j<= Advance_Defect_task_fields_source.size()-1; j++){
							for(int k = 0; k<= Advance_Defect_task_fields_in_ov.size()-1; k++){
								if(Advance_Defect_task_fields_source.get(j).equalsIgnoreCase(Advance_Defect_task_fields_in_ov.get(k).getText())){
									System.out.println(Advance_Defect_task_fields_source.get(j)+" field is avaliable in Advanced search defect task page");
									int l =k+1;
									loginPage.getDriver().findElement(By.xpath("(//div[@ng-controller='defectTaskAdvanceSearchCtrl']//label/..//input[@type='text' or @type='textarea'])["+l+"]")).sendKeys("Test data");
									break;
								}
							}
						}
							jsClick(btn_Advanced_defect_task_clear);
						break;	    		
		case "Task Type hyperlinks in Defect Task Report":
						waitForElement(btn_defecttask_generateReport);
						jsClick(btn_defecttask_generateReport);
						Thread.sleep(3000);
						jsClick(lnk_defecttask_Tasktype);
						waitForElement(lbl_defecttask_subtab);
						System.out.println(lbl_defecttask_subtab.getText()+" subtab is opened ");
						jsClick(tab_defecttask_Report);
						jsClick(lnk_defecttask_countcompleted);
						waitForElement(lbl_defecttask_subtab);
						System.out.println(lbl_defecttask_subtab.getText()+" subtab is opened ");
						jsClick(tab_defecttask_Report);
						jsClick(lnk_defecttask_countIncompleted);
						waitForElement(lbl_defecttask_subtab);
						System.out.println(lbl_defecttask_subtab.getText()+" subtab is opened ");
						jsClick(tab_defecttask_Report);
						jsClick(lnk_defecttask_Totaltasksdetected);
						waitForElement(lbl_defecttask_subtab);
						System.out.println(lbl_defecttask_subtab.getText()+" subtab is opened ");
						break;
		case "Cancel button is displayed in ethernet Order Related Tab of Task details screen":
							waitForElement(btn_taskresultpage_orderRT_cancelorder);			
							break; 
		case "All the action buttons displayed in the Action section of Autoform task API Screen":
								waitForElement(btn_taskaction_complete);
								if(!btn_taskaction_save.isCurrentlyVisible()){
									slf4jLogger.debug("Save button is missing for Autoform Task");
									throw new Error("Save button is missing for Autoform Task");
								}
								if(!btn_taskaction_complete.isCurrentlyVisible()){
									slf4jLogger.debug("Complete button is missing for Autoform Task");
									throw new Error("Complete button is missing for Autoform Task");
								}
								if(!btn_taskaction_retry.isCurrentlyVisible()){
									slf4jLogger.debug("Retry button is missing for Autoform Task");
									throw new Error("Retry button is missing for Autoform Task");
								}
								if(!btn_taskaction_reassign.isCurrentlyVisible()){
									slf4jLogger.debug("Re-Assign button is missing for Autoform Task");
									throw new Error("Re-Assign button is missing for Autoform Task");
								}
								
								break; 
		case "Completed field is updated in Task Specific Info section on the completed autoform tasks" :
							verify_validation("General Task Details on the completed autoform tasks");
							
							break; 
		case "Task Specific Info section on the Autoform tasks":
								waitForElement(btn_taskaction_complete);	
								
								if(!lbl_Task_specific_info.isCurrentlyVisible()){
									slf4jLogger.debug("Task Specific Info is missing for Autoform Task");
									throw new Error("Task Specific Info is missing for Autoform Task");
								}
								if(!lbl_Task_specific_info_errordetails.isCurrentlyVisible()){
									slf4jLogger.debug("Error Details is missing in Task Specific Info for Autoform Task");
									throw new Error("Error Details is missing in Task Specific Info for Autoform Task");
								}
								
								if(!lbl_Task_specific_info_ensembleorderid.isCurrentlyVisible() || lbl_Task_specific_info_ensembleorderid.getText().length()<2){
									slf4jLogger.debug("Ensemble Order ID details is missing in Task Specific Info for Autoform Task");
									throw new Error("Ensemble Order ID details is missing in Task Specific Info for Autoform Task");
								}
								
								if(!lbl_Task_specific_info_duedate.isCurrentlyVisible() || lbl_Task_specific_info_duedate.getText().length()<2){
									slf4jLogger.debug("Due date details is missing in Task Specific Info for Autoform Task");
									throw new Error("Due date details is missing in Task Specific Info for Autoform Task");
								}
								
								if(!lbl_Task_specific_info_csofid.isCurrentlyVisible() || lbl_Task_specific_info_csofid.getText().length()<2){
									slf4jLogger.debug("CSOF ID details is missing in Task Specific Info for Autoform Task");
									throw new Error("CSOF ID details is missing in Task Specific Info for Autoform Task");
								}
								
								if(!lbl_Task_specific_info_dtn.isCurrentlyVisible() || lbl_Task_specific_info_dtn.getText().length()<2){
									slf4jLogger.debug("DTN details is missing in Task Specific Info for Autoform Task");
									throw new Error("DTN details is missing in Task Specific Info for Autoform Task");
								}
								
								if(!lbl_Task_specific_info_customername.isCurrentlyVisible() || lbl_Task_specific_info_customername.getText().length()<2){
									slf4jLogger.debug("Customer Name details is missing in Task Specific Info for Autoform Task");
									throw new Error("Customer Name details is missing in Task Specific Info for Autoform Task");
								}
								
								if(!lbl_Task_specific_info_ban.isCurrentlyVisible() || lbl_Task_specific_info_ban.getText().length()<2){
									slf4jLogger.debug("BAN details is missing in Task Specific Info for Autoform Task");
									throw new Error("BAN details is missing in Task Specific Info for Autoform Task");
								}
							
								break;		
			
			
		case "Order details":
						waitForElement(btn_OrderRT_dispatch);Thread.sleep(3000);
					
					break;
		case "API View is displayed for Autofomr Task Screen":
			waitForElement(btn_Task_search_result_autoformtask_complete); Thread.sleep(2000);
			
			break;
		case "Iframe view in displayed for the Non-Autoform task":

							waitForElement(lbl_iframeview);
							break;
							
		case "API view in the Task result screen":
							waitForElement(btn_Task_search_result_autoformtask_complete);
							if(!lbl_Task_search_result_autoformtask_arrowbutton_generaltaskdetails.isCurrentlyVisible()){
								slf4jLogger.debug("General Task Details Label is missing below the Task Result");
								throw new Error("General Task Details Label is missing below the Task Result");
							}
							
							if(!lbl_Task_search_result_autoformtask_arrowbutton_taskid.isCurrentlyVisible()){
								slf4jLogger.debug("Task ID is missing below the Task Result");
								throw new Error("Task ID is missing below the Task Result");
							}
							
							if(!lbl_Task_search_result_autoformtask_arrowbutton_createdby.isCurrentlyVisible()){
								slf4jLogger.debug("Created By is missing below the Task Result");
								throw new Error("Created By is missing below the Task Result");
							}
							
							if(!lbl_Task_search_result_autoformtask_arrowbutton_createddate.isCurrentlyVisible()){
								slf4jLogger.debug("Created Date is missing below the Task Result");
								throw new Error("Created Date is missing below the Task Result");
							}
							
							if(!lbl_Task_search_result_autoformtask_arrowbutton_taskstatus.isCurrentlyVisible()){
								slf4jLogger.debug("Task Status is missing below the Task Result");
								throw new Error("Task Status is missing below the Task Result");
							}
							if(!btn_Task_search_result_autoformtask_complete.isCurrentlyVisible()){
								slf4jLogger.debug("Task Complete button is missing below the Task Result");
								throw new Error("Task Complete button is missing below the Task Result");
							}			
							break;
				
		case "Arrow button in Task result":
					waitForElement(btn_Task_search_result_arrowbutton);
					jsClick(btn_Task_search_result_arrowbutton);
					btn_Task_search_result_arrowbutton.click();
					
					waitForElement(btn_Task_search_result_autoformtask_complete); Thread.sleep(3000);
					break;
		case "Task Specific Info section on the completed autoform tasks":
								waitForElement(btn_taskaction_complete);	
								
								if(!lbl_Task_specific_info.isCurrentlyVisible()){
									slf4jLogger.debug("Task Specific Info is missing for completed Task");
									throw new Error("Task Specific Info is missing for completed Task");
								}
								if(!lbl_Task_specific_info_errordetails.isCurrentlyVisible()){
									slf4jLogger.debug("Error Details is missing in Task Specific Info for completed Task");
									throw new Error("Error Details is missing in Task Specific Info for completed Task");
								}
								
								if(!lbl_Task_specific_info_ensembleorderid.isCurrentlyVisible() || lbl_Task_specific_info_ensembleorderid.getText().length()<2){
									slf4jLogger.debug("Ensemble Order ID details is missing in Task Specific Info for completed Task");
									throw new Error("Ensemble Order ID details is missing in Task Specific Info for completed Task");
								}
								
								if(!lbl_Task_specific_info_duedate.isCurrentlyVisible() || lbl_Task_specific_info_duedate.getText().length()<2){
									slf4jLogger.debug("Due date details is missing in Task Specific Info for completed Task");
									throw new Error("Due date details is missing in Task Specific Info for completed Task");
								}
								
								if(!lbl_Task_specific_info_csofid.isCurrentlyVisible() || lbl_Task_specific_info_csofid.getText().length()<2){
									slf4jLogger.debug("CSOF ID details is missing in Task Specific Info for completed Task");
									throw new Error("CSOF ID details is missing in Task Specific Info for completed Task");
								}
								
								if(!lbl_Task_specific_info_dtn.isCurrentlyVisible() || lbl_Task_specific_info_dtn.getText().length()<2){
									slf4jLogger.debug("DTN details is missing in Task Specific Info for completed Task");
									throw new Error("DTN details is missing in Task Specific Info for completed Task");
								}
								
								if(!lbl_Task_specific_info_customername.isCurrentlyVisible() || lbl_Task_specific_info_customername.getText().length()<2){
									slf4jLogger.debug("Customer Name details is missing in Task Specific Info for completed Task");
									throw new Error("Customer Name details is missing in Task Specific Info for completed Task");
								}
								
								if(!lbl_Task_specific_info_ban.isCurrentlyVisible() || lbl_Task_specific_info_ban.getText().length()<2){
									slf4jLogger.debug("BAN details is missing in Task Specific Info for completed Task");
									throw new Error("BAN details is missing in Task Specific Info for completed Task");
								}
							
								break;
								
		case "General Task Details on the completed autoform tasks":
											waitForElement(btn_taskaction_complete);	
											if(!lbl_General_task_details_taskid.isCurrentlyVisible() || lbl_General_task_details_taskid.getText().length()<2){
												slf4jLogger.debug("Task ID is not displayed on completed Task");
												throw new Error("Task ID is not displayed on completed Task");
											}
											
									if(!lbl_General_task_details_createdby.isCurrentlyVisible()){
										slf4jLogger.debug("Task Create by is not displayed on completed Task");
										throw new Error("Task Create by is not displayed on completed Task");
											}
									if(!lbl_General_task_details_createddate.isCurrentlyVisible() || lbl_General_task_details_createddate.getText().length()<2){
										slf4jLogger.debug("Task Created date is not displayed on completed Task");
										throw new Error("Task Created date is not displayed on completed Task");
									}
									
									if(!lbl_General_task_details_Taskstatus.getText().contains("Completed")){
										slf4jLogger.debug("Task Status is not completed");
										throw new Error("Task Status is not completed");
									}
									
									
									if(!lbl_General_task_details_workgrp.isCurrentlyVisible() || lbl_General_task_details_workgrp.getText().length()<2){
										slf4jLogger.debug("Task Workgroup is not displayed on completed Task");
										throw new Error("Task Workgroup is not displayed on completed Task");
									}
									
									if(!lbl_General_task_details_duedate.isCurrentlyVisible()){
										slf4jLogger.debug("Task Due date is not displayed on completed Task");
										throw new Error("Task Due date is not displayed on completed Task");
									}
									if(!lbl_General_task_details_assignedto.isCurrentlyVisible() || lbl_General_task_details_assignedto.getText().length()<2){
										slf4jLogger.debug("Task Assigned to is not displayed on completed Task");
										throw new Error("Task Assigned to is not displayed on completed Task");
									}
									if(!lbl_General_task_details_completedby_value.isCurrentlyVisible() || lbl_General_task_details_completedby_value.getText().length()<2){
										slf4jLogger.debug("Task Completed by is not displayed on completed Task");
										throw new Error("Task Completed by is not displayed on completed Task");
									}
									if(!lbl_General_task_details_completeddate_value.isCurrentlyVisible() || lbl_General_task_details_completeddate_value.getText().length()<2){
										slf4jLogger.debug("Task Completed date is not displayed on completed Task");
										throw new Error("Task Completed date is not displayed on completed Task");
									}
									if(!lbl_General_task_details_taskname.isCurrentlyVisible() || lbl_General_task_details_taskname.getText().length()<2){
										slf4jLogger.debug("Task Name is not displayed on completed Task");
										throw new Error("Task Name is not displayed on completed Task");
									}
									if(!lbl_General_task_details_tasktype.isCurrentlyVisible()){
										slf4jLogger.debug("Task Type is not displayed on completed Task");
										throw new Error("Task Type is not displayed on completed Task");
									}
									if(!lbl_General_task_details_taskdescription.isCurrentlyVisible()){
										slf4jLogger.debug("Task Description is not displayed on completed Task");
										throw new Error("Task Description is not displayed on completed Task");
									}			break;
									
		case "Task Workflow on completed the autoform tasks":waitForElement(btn_taskaction_complete);		
								if(!lbl_General_task_details_Taskstatus.getText().contains("Completed")){
									slf4jLogger.debug("Task Status is not completed");
									throw new Error("Task Status is not completed");
								}
								if(!lbl_Task_workflow.isCurrentlyVisible() || !img_Task_workflow.isCurrentlyVisible()){
									slf4jLogger.debug("Task Workflow is not displayed on completed Task");
									throw new Error("Task Workflow is not displayed on completed Task");
								}
								break;
		case "API view needs to be displayed for the task selected":
								waitForElement(btn_taskaction_complete);
								
								break;
		case "projectID value is displayed in the Task Result screen":
								waitForElement(btn_DefecttaskResults_configurecolumn);
								jsClick(btn_DefecttaskResults_configurecolumn);
								waitForElement(btn_DefecttaskResults_configurecolumn_apply);
								
								waitForElement(ddl_resultpage_configurecolumn_list);
								ddl_resultpage_configurecolumn_list.selectByVisibleText("Project ID");
								for(i=0;i<11;i++){
									jsClick(btn_resultpage_configurecolumn_up);Thread.sleep(2000);
								}
								
								jsClick(btn_DefecttaskResults_configurecolumn_apply);
								
								Thread.sleep(5000);
								
								loginPage.getDriver().findElement(By.xpath("(//div[contains(text(),'EVPL812')])[1]")).isDisplayed();	
								
								jsClick(btn_DefecttaskResults_configurecolumn);
								waitForElement(btn_DefecttaskResults_configurecolumn_apply);
								
								jsClick(btn_resultpage_configurecolumn_applydefault);
								Thread.sleep(3000);
								break;
		case "enter EVPL812 value inside project ID field in Task Advance Search screen":
							waitForElement(lbl_projectid);
							tbx_projectid.sendKeys("EVPL812");
							
							break;
		case "Project ID column is displayed in Task Result screen":
							/*Thread.sleep(3000);
							waitForElement(lbl_projectid);
							lbl_projectid.shouldBePresent();*/ //Sairam is working on this 4/3/2018
								break;
		case "projectID field is displayed in the Task Advance Search screen": waitForElement(btn_task_advanced_search);
							Thread.sleep(3000);
							waitForElement(lbl_projectid);
							lbl_projectid.shouldBePresent();
											break;
							
		case "Defect task details saved successfully":  validate_defecttask_message("Save");jsClick(btn_Defecttaskmsg_close); break;
		
		case "Assigned To & Task Status should get updated to Assigned state": waitForElement(btn_defecttask_Save);
														if(!lbl_Defecttask_assignedto.getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
															slf4jLogger.error("Invalid User is updated as"+lbl_Defecttask_assignedto.getText());
															throw new Error("Invalid User is updated as"+lbl_Defecttask_assignedto.getText());
														}
														if(!lbl_Defecttask_taskstatus.getText().trim().equals("Assigned")){
															slf4jLogger.error("Invalid Status is updated as"+lbl_Defecttask_taskstatus.getText());
															throw new Error("Invalid Status is updated as"+lbl_Defecttask_taskstatus.getText());
														}break;
														
		case "User should be presented  with Task details screen": if(btn_defecttask_Save.isCurrentlyVisible()) {
																	slf4jLogger.info("User should be presented  with Task details screen");
																	}
																	else {
																		throw new Error("Task details screen is not displayed ");
																	} 
																	break;
		case "Assigned To should be updated to logged in user & Task Status should get updated to Assigned":	if(!lbl_Defecttask_assignedto.getText().trim().equals("")){
														slf4jLogger.error("User is not removed as"+lbl_Defecttask_assignedto.getText());
														throw new Error("User is not removed as"+lbl_Defecttask_assignedto.getText());
														}
													if(!lbl_Defecttask_taskstatus.getText().trim().equals("Open")){
															slf4jLogger.error("Invalid Status is updated as"+lbl_Defecttask_taskstatus.getText());
															throw new Error("Invalid Status is updated as"+lbl_Defecttask_taskstatus.getText());
														}break;
			
			
		case "Assigned To & Task Status should get updated to open state":	if(!lbl_Defecttask_assignedto.getText().trim().equals("")){
														slf4jLogger.error("User is not removed as"+lbl_Defecttask_assignedto.getText());
														throw new Error("User is not removed as"+lbl_Defecttask_assignedto.getText());
													}
													if(!lbl_Defecttask_taskstatus.getText().trim().equals("Open")){
														slf4jLogger.error("Invalid Status is updated as"+lbl_Defecttask_taskstatus.getText());
														throw new Error("Invalid Status is updated as"+lbl_Defecttask_taskstatus.getText());
													}break;
		
		case "Search result contains same Task name": waitForElement(tab_DefecttaskResults);
											 i=2;
								
											while(i!=0){
												if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'columntabletaskGrid')]/div["+i+"]//span")).getText().equals("Task Name")){
													
													break;
												}
												i++;
											}
											
											int j=1;
											
											String Taskname=getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]/div")).getText().trim();
											slf4jLogger.info("Task Name to compare:"+Taskname);
											while(j!=0){
												if(!getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]/div")).getText().trim().equals(Taskname)){
													throw new Error(getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]/div")).getText().trim()+" Task name is not matching with "+Taskname);
													}
												j++;
												
												if(!isElementVisible(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]/div"))){
													break;
												}
											} break;
											
		case "Task Status is updated as Assigned & Assigned to field is updated with logged in user": if(!lbl_Defecttask_taskstatus.getText().trim().equals("Assigned")){
																											throw new Error("Task status is wrongly assigned: "+lbl_Defecttask_taskstatus.getText().trim());
																											}
																										if(!lbl_Defecttask_assignedto.getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
																											throw new Error("CUID is wrongly assigned: "+lbl_Defecttask_assignedto.getText().trim());
																											} break;
		
				
		case "Task Status is updated as Open & Assigned to field is blank": if(!lbl_Defecttask_taskstatus.getText().trim().equals("Open")){
																				throw new Error("Task status is wrongly assigned: "+lbl_Defecttask_taskstatus.getText().trim());
																				}
																			if(!lbl_Defecttask_assignedto.getText().trim().equals("")){
																				throw new Error("CUID is wrongly assigned: "+lbl_Defecttask_taskstatus.getText().trim());
																				} break;
																				
		case "The defect task is already assigned to you message": validate_defecttask_message("Already assigned");jsClick(btn_Defecttaskmsg_close); break;
			
			
															
		case "Defect task released successfully message": validate_defecttask_message("Release");jsClick(btn_Defecttaskmsg_close); break;
			
															
		case "Defect task claimed successfully message":validate_defecttask_message("Assigned");jsClick(btn_Defecttaskmsg_close); click_edit_open_defectTask("Release"); break;
		
		case "Confiurecolumnslider and related Action buttons like Apply, Apply Default & Cancel inside configuration icon":
														if(!btn_DefecttaskResults_configurecolumn.isCurrentlyVisible()){
															throw new Error("Configure column icon is missing in the Defect Task Result page");
														}
														jsClick(btn_DefecttaskResults_configurecolumn);
														waitForElement(btn_DefecttaskResults_configurecolumn_apply);
														if(!lbl_DefecttaskResults_configurecolumn.isCurrentlyVisible()){
															throw new Error("Configure column Header text missing in the Defect Task Result page");
														}
														if(!btn_DefecttaskResults_configurecolumn_apply.isCurrentlyVisible()){
															throw new Error("Apply button under Configure column icon is missing in the Defect Task Result page");
														}
														if(!btn_DefecttaskResults_configurecolumn_applydefault.isCurrentlyVisible()){
															throw new Error("Apply Default button under Configure column icon is missing in the Defect Task Result page");
														}
														if(!btn_DefecttaskResults_configurecolumn_cancel.isCurrentlyVisible()){
															throw new Error("Cancel button under Configure column icon is missing in the Defect Task Result page");
														} break;
														
		case "Apply Default in the configuration column": 			
														ArrayList<String> DefecttaskheaderAttributes = new ArrayList<String>();
												
														
														DefecttaskheaderAttributes.add(0, "View");
														DefecttaskheaderAttributes.add(1, "Edit");
														DefecttaskheaderAttributes.add(2, "Defect Task Id");
														DefecttaskheaderAttributes.add(3, "Defect Status");
														DefecttaskheaderAttributes.add(4, "Task Creation Date");
														DefecttaskheaderAttributes.add(5, "Workgroup");
														DefecttaskheaderAttributes.add(6, "Task Name");
														DefecttaskheaderAttributes.add(7, "CUID");
														DefecttaskheaderAttributes.add(8, "Task Completion Date");
														DefecttaskheaderAttributes.add(9, "Device Name");
														DefecttaskheaderAttributes.add(10, "Tags");
														DefecttaskheaderAttributes.add(11, "Notes");
														if(!btn_defecttask_edittask.isCurrentlyVisible()){
															Actions action=new Actions(getDriver());
															 action.sendKeys(Keys.ARROW_LEFT).build().perform();
															 Thread.sleep(1000);
														}
													
														
														ArrayList<String> headeratributes=new ArrayList<String>();
														
														for(j=1;j!=0;j++){
															headeratributes.add(j-1, getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'columntabletaskGrid')]//span[text()!=''])["+j+"]")).getText().trim());
														if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'columntabletaskGrid')]//span[text()!=''])["+(j+1)+"]"))){
															break;
														}
														}
														
														jsClick(btn_DefecttaskResults_configurecolumn_applydefault); Thread.sleep(2000);
														
														if (headeratributes.containsAll(DefecttaskheaderAttributes)) {
															slf4jLogger.info("pass");
														} else throw new Error("fail Headers are not Matching"+headeratributes); 
														break;
														
		case "Updated Tag name is displayed in Defect task":if(!lbl_defecttask_tags_view_tagvalue.getText().trim().equals("Test_pop")){
																throw new Error("Tag name not Matching its displayed as "+lbl_defecttask_tags_view_tagvalue.getText().trim()); 
																} 
		
															jsClick(tab_DefecttaskResults);
															click_edit_open_defectTask("Edit");
															click_edit_open_defectTask("Remove the assigned Tag");
															click_edit_open_defectTask("Release");break;
		
		case "Default Gateway field is displayed along with value in Defect Task Details": if(!lbl_defecttask_tags_defaultgateway.isCurrentlyVisible()){
																								throw new Error("Default Gateway field is not displayed in Defect Task details");
																								}
		
																							if(!tbx_defecttask_tags_defaultgateway.getAttribute("id").trim().equals("90.234.12.67")){
																								throw new Error("Default Gateway value is not matching in Defect Task details:"+tbx_defecttask_tags_defaultgateway.getAttribute("id").trim());
																							} break;
																							
		case "Network Identifier column has to be added to defect task result list view": waitForElement(btn_defecttask_viewtask);
																						List<WebElement> listheaderarray = getDriver().findElements(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'columntabletaskGrid')]//span"));
																						
														
																							ArrayList<String> listheaderarrayvalue=new ArrayList<String>();
																							for(j=0;j<listheaderarray.size();j++){										
																								listheaderarrayvalue.add(j, listheaderarray.get(j).getText());												
																							}
																							if(!listheaderarrayvalue.contains("Network Identifier")){
																								slf4jLogger.info("Network Identifier column is not displayed defect task result list view");
																								throw new Error("Network Identifier column is not displayed defect task result list view");
																							}break;
																							
		}
		
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
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
	public void update_defecttask_tag(String arg1) throws InterruptedException {
		
		jsClick(btn_defecttask_tags_dropdown);
		//btn_defecttask_tags_Edit.type(arg1);
		btn_defecttask_tags_Edit.typeAndEnter(arg1); 
		Thread.sleep(1000);
		jsClick(getDriver().findElement(By.xpath(".//*[text()='"+arg1+"']")));
		
		
		/*jsClick(btn_defecttask_tags_dropdown);
		btn_defecttask_tags_Edit.type("Test_pop");
		Thread.sleep(1000);
		//waitForElement(lbl_defecttask_tags_dropdown_value);
		jsClick(lbl_defecttask_tags_dropdown_value);*/
		
	
	}
	
	
	
public void verify_update_defecttask_tag(String arg1) throws Throwable {
	System.out.println(lbl_defecttask_tags_view_tagvalue1.getText().trim().equals(arg1));
		
	if(!lbl_defecttask_tags_view_tagvalue1.getText().trim().contains(arg1)){
		
		//System.out.println(lbl_defecttask_tags_view_tagvalue1.getText().trim().equals(arg1));
		throw new Error("Tag name not Matching its displayed as "+lbl_defecttask_tags_view_tagvalue.getText().trim()); 
		} 
	//getDriver().findElement(By.xpath(".//*[text()='"+arg1+"']")).click();
	
	
	
	jsClick(tab_DefecttaskResults);
	click_edit_open_defectTask("Edit");
	click_edit_open_defectTask("Remove the assigned Tag");
	click_edit_open_defectTask("Release");
		
	
	}

public void verify_GETOvalues_in_Task_advanced_search() {
    
    
   // Assert.assertTrue("GETO value field not displayed", tbx_GETO_value.isDisplayed());
    try {
    String[] expectedvalues = {"B", "D", "F","G", "H", "I","W"};
    Thread.sleep(5000);
    tbx_GETO_value.sendKeys("B");
    Thread.sleep(2000);
    //jsClick(ddl_GETO_value);
    
           //Thread.sleep(10000);
    
    //System.out.println("ddl_GETO_value clicked");
     List<WebElement> GETOvalues=getDriver().findElements(By.xpath("//*[text()='B']/../../..//span"));

    //  (//div[starts-with(@id,'listBoxContentinnerListBox')])[15]
   //span[text()='B']/../..//span
    
        for(String s1:expectedvalues){
           boolean found=false;
           for(WebElement ele1:GETOvalues){
              //  System.out.println(ele1.getText());
                  if(s1.equalsIgnoreCase(ele1.getText()))
                  {
                        found=true;
                        slf4jLogger.info(s1+" GETO value found");
                        break;
                  }
                  
                  
           }
           if(!found)
           {
                  throw new Error("GETO value not found");
           }
    }
        
    } catch (InterruptedException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
    }
    
    
    }

public void verify_disconnect_task_search_options() throws Throwable{
	
	System.out.println("Checking for disconnect task options");
	
	if(!lbl_tasks_dsp_correlation_id.isVisible()&&!lbl_evc_id.isVisible()&&!lbl_tasks_MSTO_DEVICE_NAME.isVisible()){
		throw new Error("Disconnect task options are not being displayed");
	}
	
}

public void click_btn(String buttontype) throws Throwable{
	switch (buttontype){
	case "Abort": jsClick(ddl_discnttask_abortbtn) ;break;	
	case "Proceed": jsClick(ddl_discnttask_proceedbtn) ;break;
	}
	Thread.sleep(3000);
	WebDriver d= getDriver();
	d.switchTo().alert().accept();
	Thread.sleep(2000);
	
	
}

public void i_verify_workgroup_is_added_to_task() throws Throwable{
	if(ddl_discnttask_wrkgrp.getText()!=null){
		System.out.println("Workgroup is : "+ddl_discnttask_wrkgrp.getTextValue());
		
	}
	else{
		throw new Error("Workgroup field is null");
	}
	
}

}
