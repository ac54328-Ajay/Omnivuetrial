package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.ExcelXLSXaccess;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVGeariconPage  extends OmniVuePage{
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	ARMDB armdb;
	OmnivueDB ovdb;

	@FindBy(xpath=".//*[@id='omnivue']//a[contains(text(),'Version:')]")
	public WebElementFacade lbl_gearicon_appversion;


	@FindBy(xpath=".//*[@id='omnivue']//a[text()='FAQ']")
	public WebElementFacade lbl_gearicon_faq;

	@FindBy(xpath=".//*[@id='omnivue']//a[text()='User Guide']")
	public WebElementFacade lbl_gearicon_userguide;

	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Administration']/..")
	public WebElementFacade lbl_gearicon_administration;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Manage Users']")
	public WebElementFacade lbl_gearicon_administration_manageusers;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Manage Workgroups']")
	public WebElementFacade lbl_gearicon_administration_manageworkgroups;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Reports']")
	public WebElementFacade lbl_gearicon_reports;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Workgroup Activity']")
	public WebElementFacade lbl_gearicon_reports_Workgroupactivity;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Manage Tags']")
	public WebElementFacade lbl_gearicon_Managetags;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Configure']")
	public WebElementFacade lbl_gearicon_configure;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Defect Task Report']")
	public WebElementFacade lbl_gearicon_defecttaskreports;	

	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Administration']/..")
	public WebElementFacade lbl_gearicon_DSP_administration;
	
	
	@FindBy(xpath=".//*[@id='omnivue']//a[@ng-click='logout();']")
	public WebElementFacade lbl_gearicon_logout;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Get Next Buttons']")
	public WebElementFacade lbl_gearicon_GetNextButtons; 
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='My Dashboard']")
	public WebElementFacade lbl_gearicon_mydashbord;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='My Profile']")
	public WebElementFacade lbl_gearicon_myprofile;	

	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Upload XML']")
	public WebElementFacade lbl_gearicon_upldxml;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Dashboard']/..")
	public WebElementFacade lbl_gearicon_Dashbord;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Dashboard']")
	public WebElementFacade lbl_gearicon_Dashbord_DSPDashboard;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='OV Dashboard']")
	public WebElementFacade lbl_gearicon_Dashbord_OVDashboard;
	
	@FindBy(xpath="//a[contains(text(),'DSP WorkGroup Dashboard')]")
	public WebElementFacade lbl_Title_DSPDashboard;
	
	@FindBy(xpath="//a[contains(text(),'OV WorkGroup Dashboard')]")
	public WebElementFacade lbl_Title_OVDashboard;
	
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='Audit Logs']")
	public WebElementFacade lbl_gearicon_Audit_Logs; 
//###########################################Audit Log##############################################################
	
	
	
	@FindBy(xpath="//*[@ng-change='updateActionType(focus);']")
	public WebElementFacade ddl_auditlog_activityfocus;
	
	
	
	
	@FindBy(xpath=".//button[@ng-click='getAuditLogs();']")
	public WebElementFacade btn_auditlog;
	
	
	//################################################################################################################## 
	//------------------------------------------  Manage Tags  ------------------------------------------------//
	
	@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Manage GetNext Buttons')]")
	public WebElementFacade tab_ManageGetNextButtons;
	 

	@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Manage Tags')]")
	public WebElementFacade tab_manageTags;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Task Type']")
	public WebElementFacade lbl_manageTags_tasktype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Task Type']/following-sibling::select")
	public WebElementFacade ddl_manageTags_tasktype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Tag Name']")
	public WebElementFacade lbl_manageTags_tagname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Tag Name']/following-sibling::input")
	public WebElementFacade tbx_manageTags_tagname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Search Tags']")
	public WebElementFacade btn_manageTags_searchtags;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Add Tag']")
	public WebElementFacade btn_manageTags_addtags;
	
	@FindBy(xpath="(//Input[contains(@ng-click,'gridSettings.deleteTagDetail')])[1]")
	//*[@class='tab-pane ng-scope active']//*[@ng-click='gridSettings.deleteTagDetail(0)']
	public WebElementFacade btn_managetag_deletetag1_1; 
	
	//###########################################GETO Details Report ##############################################################

    
    @FindBy(xpath="//label[text()='GETO Value ' ]/following-sibling::select[@ng-model='selectedGetoValue']")
    public WebElementFacade ddl_GETO_value; 
    
    @FindBy(xpath="//label[text()='Start Date ']/following-sibling::div[@class='input-group']/input[@ng-model='getoStartDate']")
    public WebElementFacade tbx_Start_Date; 
    
    @FindBy(xpath="//label[text()='End Date ']/following-sibling::div[@class='input-group']/input[@ng-model='getoEndDate']")
    public WebElementFacade tbx_End_Date; 
    
    @FindBy(xpath="//button[@type='submit' and @value='Generate Report']")
    public WebElementFacade btn_Generate_reports; 
    
    @FindBy(xpath="//button[@ng-click='resetReport();' and @value='Reset']")
    public WebElementFacade btn_Reset; 

	
	//////////////////////////////////////Add New Tag Pop up screen   ////////////////////////////////////////////
	
	@FindBy(xpath=".//*[@ng-model='newTagName']")
	public WebElementFacade tbx_manageTags_addtags_tagname;
	
	@FindBy(xpath=".//*[@ng-model='newTagDescription']")
	public WebElementFacade tbx_manageTags_addtags_tagdescription;
	
	@FindBy(xpath=".//*[@ng-click='addNewTag()']")
	public WebElementFacade btn_manageTags_addtags_createtag;
	
	@FindBy(id="popup")
	public WebElementFacade lbl_managetag_duplicatetag;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='View All Tags']")
	public WebElementFacade btn_manageTags_viewalltags;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_manageTags_alertmsg1;
	
	//Sairam changed -8/14/2018
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
	//@FindBy(xpath="((//*[@class='tab-pane ng-scope active']//div[@ng-controller='manageTagsCtrl'])[2])/div[1]")
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//div[@ng-show='showMemAlert']")
	public WebElementFacade lbl_manageTags_alertmsg;
		
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Tags Search Result')]")
	public WebElementFacade tab_Tagsearchresult;
			
	//Sairam changed -8/14/2018
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'columntabletaskGrid')]//span[text()!='']")
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'columntablejqxGrid')]//span")
	public List<WebElementFacade> lbl_allXapath_managetagheader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ng-click='exportToExcel();']")
	public WebElementFacade btn_managetag_excelexport;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ng-click='printGridData()']")
	public WebElementFacade btn_managetag_print;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@title='Delete Tag'])[1]")
	public WebElementFacade btn_managetag_deletetag1;
	
	
	@FindBy(xpath="//*[@id=\"dropdownlistContentdefectTaskTagNamesjqxComboBox\"]/input")
	public WebElementFacade tbx_tag_name;
	
	@FindBy(xpath="//*[@role='row']/div[1]/div")
	public WebElementFacade lbl_tagname_grid;
	
	
	@FindBy(xpath="//*[@id='dropdownlistContentdefectTaskTagNamesjqxComboBox']/input")
	public WebElementFacade tbx_tagname_dropdown_search;
	
	@FindBy(xpath="//*[@id='dropdownlistArrowdefectTaskTagNamesjqxComboBox']")
	public WebElementFacade btn_tagname_dropdown_arrow_search;
	
	//------------------------------------------  Manage Workgroups  ------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Add Workgroup']/i")
	public WebElementFacade btn_manageworkgroup_addwrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Edit Workgroup']/i")
	public WebElementFacade btn_manageworkgroup_editwrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Delete Workgroup']/i")
	public WebElementFacade btn_manageworkgroup_deletewrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='workGroupName']")
	public WebElementFacade tbx_manageworkgroup_searchwrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='leftToRightWorkGroup']")
	public WebElementFacade ddl_manageworkgroup_wrkgrplist;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='View Workgroup Members']")
	public WebElementFacade btn_manageworkgroup_Viewwrkgrpmember;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='CLC_Contact_Create']")
	public WebElementFacade lbl_manageworkgroup_roleprms_clccontctcrt;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='CLC_Contact_Search']")
	public WebElementFacade lbl_manageworkgroup_roleprms_clccontctsrch;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='CLC_Contact_Update']")
	public WebElementFacade lbl_manageworkgroup_roleprms_clccontctupt;
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//##################		Defect Task Reports  #################################//
	
	@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Defect Task Report')]")
	public WebElementFacade tab_gearicon_defecttaskreport;
	
	@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'ASP  Defect Task Report')]")
	public WebElementFacade tab_gearicon_defecttaskreport_ASPDefecttaskreport;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[text()='Workgroup Summary']/following-sibling::label[1]")
	public WebElementFacade lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[text()='Workgroup Summary']/following-sibling::label[contains(text(),'Start Date')]")
	public WebElementFacade lbl_gearicon_defecttaskreport_wrksummy_strtenddate;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'OV Workgroup')]/following-sibling::select")
	public WebElementFacade ddl_gearicon_defecttaskreport_ovwrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Start Date -')]/following-sibling::div//input")
	public WebElementFacade tbx_gearicon_defecttaskreport_startdattime;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='openStartDate($event)']")
	public WebElementFacade btn_gearicon_defecttaskreport_calendarstartdate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='startDate']/following-sibling::ul//button[@ng-click='move(-1)']")
	public WebElementFacade btn_gearicon_defecttaskreport_startdate_previousicon;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@id='startDate']/following-sibling::ul//span[text()='01'])[1]")
	public WebElementFacade btn_gearicon_defecttaskreport_startdate_01;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'End Date -')]/following-sibling::div//input")
	public WebElementFacade tbx_gearicon_defecttaskreport_enddattime;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='endDate']/following-sibling::ul//button[text()='Today']")
	public WebElementFacade btn_gearicon_defecttaskreport_enddate_today;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='openEndDate($event)']")
	public WebElementFacade btn_gearicon_defecttaskreport_calendarenddate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Generate Report']")
	public WebElementFacade btn_gearicon_defecttaskreport_generatereport;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Reset']")
	public WebElementFacade btn_gearicon_defecttaskreport_reset;
	
	@FindBy(xpath="//li/a[text()='GETO Details']")
	public WebElementFacade lbl_GETO_Details;  
	//-------------------------------  Defect Task generated reports -------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'ASP  Defect Task Report')]")
	public WebElementFacade tab_gearicon_defecttaskreport_ASPdtreport;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[@ng-click='exportToExcel()']")
	public WebElementFacade btn_gearicon_defecttaskreport_excelexport;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//*[@ng-click='printGridData()']")
	public WebElementFacade btn_gearicon_defecttaskreport_print;
	
	//____________________________  Open to Completed Task Stats  ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']/../..//strong[text()='Duration Mean']")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mean;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']/../..//strong[text()='Duration Mean']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mean_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']/../..//strong[text()='Duration Mode']")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mode;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']/../..//strong[text()='Duration Mode']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mode_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']/../..//strong[text()='Duration Median']")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Median;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Open to Completed Task Stats']/../..//strong[text()='Duration Median']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Median_value;
	
	//____________________________  Tasks Interaction Stats  ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']/../..//strong[text()='Number of User Touches']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts_nousrtch;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']/../..//strong[text()='Number of User Touches']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts_nousrtch_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']/../..//strong[text()='Number of Status Changes']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts_noststchgs;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']/../..//strong[text()='Number of Status Changes']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts_noststchgs_value;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']/../..//strong[text()='Average Duration Open to Claim/Assign']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts_claimassgn;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Tasks Interaction Stats']/../..//strong[text()='Average Duration Open to Claim/Assign']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_tskintrsts_claimassgn_value;
	
	//____________________________  Volume Summary  ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Total Task']")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_tottsk;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Total Task']/../../following-sibling::td/span/a")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_tottsk_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Tasks Completed']")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_tskcmp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Tasks Completed']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_tskcmp_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Tasks not completed']")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_tskntcmp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Tasks not completed']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_tskntcmp_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Number of Task types']")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_notsktyps;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Number of Task types']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_notsktyps_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Number of Users Touching Tasks']")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_nousrtchtsk;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Volume Summary']/../..//strong[text()='Number of Users Touching Tasks']/../../following-sibling::td/span")
	public WebElementFacade lbl_gearicon_defecttaskreport_vlmsmmy_nousrtchtsk_value;
	
	//____________________________ By Task Type  ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By Task Type']")
	public WebElementFacade lbl_gearicon_defecttaskreport_bytsktype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By Task Type']/../following-sibling::div//button")
	public WebElementFacade btn_gearicon_defecttaskreport_bytsktype_generatereports;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By Task Type']/../../following-sibling::div//input[starts-with(@id,'selectAll')]")
	public WebElementFacade chk_gearicon_defecttaskreport_bytsktype_report;
	
	
	
	//____________________________ By User ID  ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='CUID']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_cuid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='First Name']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_frstnme;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='Last Name']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_lstnme;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='Number of Task Types']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_notstyps;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='Completed']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_cmpt;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='Claimed']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_claimd;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='Total Count']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_totlcnt;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='By User ID']/../following-sibling::div//*[@class='dataTables_scrollHead']//th[text()='Claimed but Released']")
	public WebElementFacade lbl_gearicon_defecttaskreport_byuseridsec_header_clmrlsd;
	
	//____________________________  Task Names Report   ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Task Names Report')]")
	public WebElementFacade tab_gearicon_defecttaskreport_tsknmesrpt;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']")
	public WebElementFacade tab_gearicon_defecttaskreport_tsknmesrpt_header;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='Task Name:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_tsknme;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='Task Name:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_tsknme_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='Work Group:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_wrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='Work Group:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_wrkgrp_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='Start Date & Time:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_strtdate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='Start Date & Time:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_strtdate_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='End Date & Time:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_enddate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Task Names Report']/following-sibling::div//strong[text()='End Date & Time:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_tsknmesrpt_enddate_value;
	
	
	//____________________________  All Tasks Report   ___________________//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'All Tasks')]")
	public WebElementFacade tab_gearicon_defecttaskreport_ALLTasks;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='Task Name:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_tsknme;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='Task Name:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_tsknme_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='Work Group:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_wrkgrp;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='Work Group:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_wrkgrp_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='Start Date & Time:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_strtdate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='Start Date & Time:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_strtdate_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='End Date & Time:']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_enddate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//h2[text()='Task Report: Total Tasks']/following-sibling::div//strong[text()='End Date & Time:']/../following-sibling::div")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_enddate_value;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Sr. No']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_srno;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Defect Task ID']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_dfttskid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Defect Status']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_dftsts;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Task Name']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tsknme;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='CUID']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_cuid;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Task Creation Date and Time']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskcrtdate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Task Claimed Date and Time']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskclaimdate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='defectTaskReportCtrl']//*[text()='Task Completion Date and Time']")
	public WebElementFacade lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskcmpdate;
	
	//--------------------		Manage Users Tab  -------------------------//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Manage User')]")
	public WebElementFacade tab_gearicon_admn_mnguserheader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='FilterBy']/following-sibling::select")
	public WebElementFacade ddl_gearicon_admn_mnguser_filterby;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Filter Text']/following-sibling::input")
	public WebElementFacade tbx_gearicon_admn_mnguser_filtertxt;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[contains(text(),'Search User')]")
	public WebElementFacade btn_gearicon_admn_mnguser_srhusr;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[contains(text(),'Add User')]")
	public WebElementFacade btn_gearicon_admn_mnguser_addusr;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[contains(text(),'View All Users')]")
	public WebElementFacade btn_gearicon_admn_mnguser_viewallusr;	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'User Search Result')]")
	public WebElementFacade tab_gearicon_admn_mnguserheader_usersearchresult;	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'User Search Result')]/a")
	public WebElementFacade btn_gearicon_admn_mnguserheader_usersearchresult_clsicon;	
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[@class='jqx-grid-cell-middle-align'])[6]")
			public WebElementFacade lbl_gearicon_admn_mnguserheader_usersearchresult_role;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(@id,'columntablejqxGrid')]//span")
	public List<WebElementFacade> lbl_allXapath;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail')]")
	public WebElementFacade btn_gearicon_admn_mnguser_result_view;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//label[text()='First Name']/../following-sibling::div/label)[2]")
	public WebElementFacade lbl_gearicon_admn_userview_firstname;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//label[text()='First Name']/../following-sibling::div/label)[3]")
	public WebElementFacade lbl_gearicon_admn_userview_lstname;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//select[@ng-model='ovAvailableWorkGroups']")
	public WebElementFacade ddl_gearicon_admn_mnguser_wrkgrpassignd;
	
	@FindBy(xpath="(.//li[@class='ng-isolate-scope active']//tab-heading/a)[2]")
	public WebElementFacade btn_gearicon_admn_mnguser_result_Userviewclsicon;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='saveProfile();']")
	public WebElementFacade btn_gearicon_admn_mnguser_result_Saveprofile;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.deleteTaskDetail')]")
	public WebElementFacade btn_gearicon_admn_mnguser_result_delete;
	
	
	@FindBy(xpath="(.//div[@ng-show='showAlert']/button)[2]")
			public WebElementFacade btn_gearicon_admn_mnguser_alrt_clsicon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ng-click='exportToExcel()']")
	public WebElementFacade btn_gearicon_admn_mnguser_excelexporticon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ng-click='printGridData()']")
	public WebElementFacade btn_gearicon_admn_mnguser_printicon;
	
	
	//#############################		Manage User Attributes Screen Page  ############################################//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[contains(text(),'User Details')]")
	public WebElementFacade lbl_gearicon_admn_mnguser_resultviewpage_Userdetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Information')]")
	public WebElementFacade lbl_gearicon_admn_mnguser_resultviewpage_Userinform;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Permissions')]")
	public WebElementFacade lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='User']/preceding-sibling::input")
	public WebElementFacade lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson_Userrole;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//label[text()='Administrator']/preceding-sibling::input)[2]")
			public WebElementFacade lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson_Admin;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//label[text()='Super Administrator']/preceding-sibling::input)[3]")
			public WebElementFacade lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson_Superadmin;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='DSP Profile']")
			public WebElementFacade tab_gearicon_admn_mnguser_resultviewpage_DSPProfile;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='User Preferences']")
			public WebElementFacade tab_gearicon_admn_mnguser_resultviewpage_Usrpreference;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Favorite Settings']")
			public WebElementFacade tab_gearicon_admn_mnguser_resultviewpage_fvrsettings;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Manage Hierarchy']")
			public WebElementFacade tab_gearicon_admn_mnguser_resultviewpage_mnghierarchy;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Workgroup Settings']")
			public WebElementFacade tab_gearicon_admn_mnguser_resultviewpage_Wrkgrpsettings;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Employee History']")
			public WebElementFacade tab_gearicon_admn_mnguser_resultviewpage_emphistory;
	
	
	
	//----------------------------------		DSP Profile	----------------------------------------------//
	
	//------------------------------------------------	DSP Administration  ------------------------------------------------//
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Administration']/..//a[text()='Manage DSP']")
	public WebElementFacade lbl_gearicon_DSPAdmin_ManageDSP;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Administration']/..//a[text()='Manage Contact']")
	public WebElementFacade lbl_gearicon_DSPAdmin_ManageContact;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Administration']/..//a[text()='Manage Configuration']")
	public WebElementFacade lbl_gearicon_DSPAdmin_ManageConfiguration;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Administration']/..//a[text()='Manage DSP Workgroup']")
	public WebElementFacade lbl_gearicon_DSPAdmin_ManageDSPWorkgroup;
	
	@FindBy(xpath=".//*[@id='omnivue']//a[text()='DSP Administration']/..//a[text()='Manage DSP Role']")
	public WebElementFacade lbl_gearicon_DSPAdmin_ManageDSPRole;
	
	@FindBy(xpath="//button[@ng-click='loadRoleData();']")
	public WebElementFacade btn_gearicon_DSPAdmin_ManageDSP_AddRole;
	
	@FindBy(xpath="//button[@ng-click='addDspWorkGroup();']")
	public WebElementFacade btn_gearicon_DSPAdmin_ManageDSP_AddWorkgroup;
	
	@FindBy(xpath="//h4[contains(text(),'Create Workgroup')]")
	public WebElementFacade lbl_DSPAdmin_ManageDSP_AddWorkgroup_CreateWorkgroup;
	
	@FindBy(xpath="//h4[contains(text(),'Create DSP Role')]")
	public WebElementFacade lbl_DSPAdmin_ManageDSP_AddRole_CreateDSPRole;
	
	@FindBy(xpath="//button[@ng-click='CreateUserRole();']")
	public WebElementFacade btn_DSPAdmin_ManageDSP_AddRole_CreateRole;
	
	@FindBy(xpath="//div[@class='ng-binding alert alert-danger']")
	public WebElementFacade lbl_Error_message;
	
	@FindBy(xpath="(//div[@class='ng-binding alert alert-danger'])[2]/button")
	public WebElementFacade btn_close_Error_message;
	
	@FindBy(xpath="//input[@ng-model='roleInfo.roleName']")
	public WebElementFacade tbx_DSPAdmin_ManageDSP_AddRole_roleName;
	
	@FindBy(xpath="//input[@ng-model='roleInfo.roleDesc']")
	public WebElementFacade tbx_DSPAdmin_ManageDSP_AddRole_roleDesc;
	
	@FindBy(xpath="//div[@class='ng-binding alert alert-success']")
	public WebElementFacade lbl_create_success_message;
	
	@FindBy(xpath="//button[@ng-click='getDspRoleData(ovDspRole);']")
	public WebElementFacade btn_DSPAdmin_ManageDSPRole_Viewrole;
	
	@FindBy(xpath="//button[@ng-click='deleteDspRoleData(ovDspRole);']")
	public WebElementFacade btn_DSPAdmin_ManageDSPRole_deleterole;
	
	@FindBy(xpath="//div[@class='mart5 ng-binding alert alert-success']")
	public WebElementFacade lbl_delete_success_message;
	
	@FindBy(xpath="//select[@ng-model='ovDspRole']")
	public WebElementFacade ddl_DSPAdmin_ManageDSPRole_DSProles;
	
	//------------------------------------------------------------------------------------------------------//
	//###################################################################################################################//
	
	//#############################		Manage Workgroup Attributes Screen Page  ############################################//
	
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Add Workgroup']")
	public WebElementFacade btn_gearicon_mngwrkgrp_AddWorkgroup;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Edit Workgroup']")
	public WebElementFacade btn_gearicon_mngwrkgrp_editWorkgroup;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Delete Workgroup']")
	public WebElementFacade btn_gearicon_mngwrkgrp_deleteWorkgroup;
	
	@FindBy(id="workGroupName")
			public WebElementFacade tbx_gearicon_mngwrkgrp_selectwrkgrp;
	
	@FindBy(id="leftToRightWorkGroup")
			public WebElementFacade ddl_gearicon_mngwrkgrp_selectwrkgrp;
	
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[text()='Workgroup Information']")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_Wrkgrpinfo;
			
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//h5[text()='Workgroup Name']/following-sibling::input")
			public WebElementFacade tbx_gearicon_mngwrkgrp_editwrkgrp_Wrkgrpname;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//h5[text()='Group Description']/following-sibling::input")
			public WebElementFacade tbx_gearicon_mngwrkgrp_editwrkgrp_grpdescription;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//label[text()='Created By:']/following-sibling::label")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_createdby;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='View Workgroup Members']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_viewwrkgrpmembers;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Save Workgroup']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_savewrkgrp;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Cancel']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_cancel;
			
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[text()='Workgroup Roles']")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_Wrkgrproles;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Add Role']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_addrole;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Edit Role']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_editrole;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Copy Role']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_copyrole;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@value='Delete Role']")
			public WebElementFacade btn_gearicon_mngwrkgrp_editwrkgrp_deleterole;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[text()='Select Workgroup Roles']/../following-sibling::select")
			public WebElementFacade ddl_gearicon_mngwrkgrp_editwrkgrp_wrkgrproles;
			
			
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[contains(text(),'Role Permissions')]")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermission;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[text()='Select Role']/../following-sibling::select")
			public WebElementFacade ddl_gearicon_mngwrkgrp_editwrkgrp_selectrole;		
			
			
			
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[contains(text(),'Role Permissions')]")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[text()='Module']")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_module;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[text()='Read']")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_read;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[text()='Read/Write']")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_update;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//strong[text()='Restricted']")
			public WebElementFacade lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_restricted;
	
	
	
	//###################################################################################################################//
	
	
	//#################################### Workgroup Activity Screen Page  ############################################//
	
	
	@FindBy(xpath=".//label[contains(text(),'DSP Workgroup')]/following-sibling::select")
	public WebElementFacade ddl_gearicon_wrkgrpactivity_dspworkgroup;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@for='startDate']/following-sibling::div//button[@ng-click='openStartDate($event)']")
	public WebElementFacade btn_gearicon_wrkgrpactivity_startdatecalendar;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//label[@for='startDate']/following-sibling::div//table//span[text()='01'])[1]")
			public WebElementFacade btn_gearicon_wrkgrpactivity_startdatecalendar_01;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='Generate Report']")
	public WebElementFacade btn_gearicon_wrkgrpactivity_generatereport;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//i[@ng-click='reportChartView=true']")
	public WebElementFacade btn_gearicon_wrkgrpactivity_piecharticon;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@class='chartContainer']")
	public WebElementFacade lbl_gearicon_wrkgrpactivity_summarychart;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//tab-heading")
	public WebElementFacade tab_gearicon_wrkgrpactivity_reportresult;
	
	//###################################################################################################################//
	ExcelXLSXaccess db;

	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void gearicon_viewmanageusers() {try {	
		
			Thread.sleep(5000);
			
			if(!btn_gearicon_admn_mnguser_alrt_clsicon.isCurrentlyVisible()){
				jsClick(btn_gearicon_admn_mnguser_result_view);
				waitForElement(btn_gearicon_admn_mnguser_result_Saveprofile);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void mnguserfilertext_type(String usrname) {
		int i=0,j=0;
		String Message;
		 // WebDriverWait wait = new WebDriverWait(getDriver(),5);	
		switch(usrname){
		case "My CUID":tbx_gearicon_admn_mnguser_filtertxt.type(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"));break;
		case "Excel":	
			
		
				db=new ExcelXLSXaccess(Page.envData.getFieldValue("ManageUserssheet"));
		
					while(i<db.getRowCount("Userlist")-1){
						j=i+2;					
						System.out.println(i+"."+db.getCellData("Userlist", "CUID", j));
						tbx_gearicon_admn_mnguser_filtertxt.type(db.getCellData("Userlist", "CUID", j));
						jsClick(btn_gearicon_admn_mnguser_srhusr);
						
						try{
							Thread.sleep(5000);
							if(btn_gearicon_admn_mnguser_result_view.isCurrentlyVisible()){
								jsClick(btn_gearicon_admn_mnguser_result_view);
								waitForElement(btn_gearicon_admn_mnguser_result_Saveprofile);
								
								
								Select dropdown= new Select(ddl_gearicon_admn_mnguser_wrkgrpassignd);
								 List<WebElement> alloption = dropdown.getOptions();
								 Message="";
								 for(i=0;i<alloption.size();i++){
									 if(alloption.get(i).getText().trim().contains("null")){
										 Message+=alloption.get(i).getText().replace("null", "")+",";
									 } else {
										 Message+=alloption.get(i).getText()+",";
									 }
									
								 }
								 db.setCellData("Userlist", "Workgroups assigned", j, Message);
								 db.setCellData("Userlist", "First Name", j, lbl_gearicon_admn_userview_firstname.getText().trim());
								 db.setCellData("Userlist", "Last Name", j, lbl_gearicon_admn_userview_lstname.getText().trim());								 
								 
								 jsClick(btn_gearicon_admn_mnguser_result_Userviewclsicon);
								 db.setCellData("Userlist", "Status", j, "Passed");
								 db.setCellData("Userlist", "Role", j, lbl_gearicon_admn_mnguserheader_usersearchresult_role.getText().trim());
								 
								jsClick(btn_gearicon_admn_mnguserheader_usersearchresult_clsicon);
							} else if(btn_gearicon_admn_mnguser_alrt_clsicon.isCurrentlyVisible()){
								db.setCellData("Userlist", "Status", j, "No data present on this User");
								 db.setCellData("Userlist", "Workgroups assigned", j, "No data present on this User");
								 db.setCellData("Userlist", "First Name", j, "No data present on this User");
								 db.setCellData("Userlist", "Last Name", j, "No data present on this User");	
								 db.setCellData("Userlist", "Role", j, "No data present on this User");
								jsClick(btn_gearicon_admn_mnguser_alrt_clsicon);
							}
							Thread.sleep(1000);
							
					} catch(ElementNotVisibleException|NoSuchElementException|InterruptedException e){
						db.setCellData("Userlist", "Status", j, "No data present on this User");
						continue;
					} 
						i++;
					}
			  
		
						System.out.println("No of rows="+db.getRowCount("Userlist"));
							break;
		}
		}
	
	public void mnguserfilerby(String wgrp) {
		waitForElement(ddl_gearicon_admn_mnguser_filterby);
		ddl_gearicon_admn_mnguser_filterby.selectByVisibleText(wgrp);
		
		}
	
	public void manageuser_actions(String type) {
		waitForElement(ddl_gearicon_admn_mnguser_filterby);
		switch(type){
		case "Search User": jsClick(btn_gearicon_admn_mnguser_srhusr); waitForElement(btn_gearicon_admn_mnguser_result_view); break;
		
		}
	}
	
	public void select_gearicon(String type) {try {
		Alert alert;
		 String msg;
		switch(type){
		
		case "Audit Logs": jsClick(lbl_gearicon_Audit_Logs);
		waitForElement(btn_auditlog);
		break;
		case "Delete Created tag":
			tbx_manageTags_tagname.type("AUTO Test");
			jsClick(btn_manageTags_searchtags);
			waitForElement(btn_managetag_deletetag1_1);
			//tab_Manage_Tags.click();
			jsClick(btn_managetag_deletetag1_1); alert = getDriver().switchTo().alert(); msg=alert.getText();slf4jLogger.info(msg);alert.accept(); 
			
			break;
		case "Administration": try { 		
									browser_zoom_in(4);		Thread.sleep(1000);
									mouseHover(lbl_gearicon_administration);
												Thread.sleep(1000);
												
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											} break;
		case "Manage Users":jsClick(lbl_gearicon_administration_manageusers);	waitForElement(btn_gearicon_admn_mnguser_srhusr);		break;						
		case "Manage Tags": jsClick(lbl_gearicon_Managetags); waitForElement(tab_manageTags); break;
		case "View All Tags button": jsClick(btn_manageTags_viewalltags);waitForAlert(getDriver()); waitForElement(tab_Tagsearchresult);break;
		case "Delete tag":jsClick(btn_managetag_deletetag1); alert = getDriver().switchTo().alert(); msg=alert.getText();slf4jLogger.info(msg);alert.dismiss(); break;
		case "Hover Tasks as Task type":ddl_manageTags_tasktype.selectByVisibleText("Hoover Tasks");break;
		case "Accept Delete tag":alert = getDriver().switchTo().alert(); msg=alert.getText();slf4jLogger.info(msg);alert.accept();
								waitForElement(lbl_manageTags_alertmsg);
								String Message = lbl_manageTags_alertmsg.getText();
								Message = Message.toString().substring(1);
								
								Message = Message.trim(); 
								if(!Message.contains("Tag : AUTO Test has been deleted Successfully.")){
									throw new Error("Wrong message is displayed as "+Message);
								} 
								break;
		case "Defect Task Report":jsClick(lbl_gearicon_defecttaskreports);waitForElement(btn_gearicon_defecttaskreport_generatereport);break;
		
		case "Dashboard": 	browser_zoom_in(4);		Thread.sleep(1000);
			                  mouseHover(lbl_gearicon_Dashbord);
			                  Thread.sleep(1000);
		                        break; 
		case "DSP Dashboard":jsClick(lbl_gearicon_Dashbord_DSPDashboard);	waitForElement(lbl_Title_DSPDashboard);
							shouldBeVisible(lbl_Title_DSPDashboard);
							break; 
		case "OV Dashboard":jsClick(lbl_gearicon_Dashbord_OVDashboard);	waitForElement(lbl_Title_OVDashboard);
		                    shouldBeVisible(lbl_Title_OVDashboard);
							break;
		case "Logout":	waitForElement(lbl_gearicon_logout);jsClick(lbl_gearicon_logout); 
				Thread.sleep(3000);
			
						break;
		case "GETO Details":waitForElement(lbl_GETO_Details);jsClick(lbl_GETO_Details);Thread.sleep(2000);break;
						
		case "Configure":waitForElement(lbl_gearicon_logout);jsClick(lbl_gearicon_configure);Thread.sleep(2000);break;
		
		case "My Profile":waitForElement(lbl_gearicon_logout);jsClick(lbl_gearicon_myprofile);Thread.sleep(2000);break;
		
		case "Manage Workgroup":	waitForElement(lbl_gearicon_logout);jsClick(lbl_gearicon_administration_manageworkgroups);Thread.sleep(2000);break;
		case "My Dashboard":waitForElement(lbl_gearicon_logout);jsClick(lbl_gearicon_mydashbord);Thread.sleep(2000);break;   
		case "Reports": waitForElement(lbl_gearicon_logout);browser_zoom_in(4);		Thread.sleep(1000);mouseHover(lbl_gearicon_reports);Thread.sleep(2000); waitForElement(lbl_gearicon_reports_Workgroupactivity);break;
		case "Workgroup Activity":waitForElement(lbl_gearicon_logout);jsClick(lbl_gearicon_reports_Workgroupactivity);Thread.sleep(2000);break;
		case "DSP Administration" :browser_zoom_in(4);		Thread.sleep(1000);mouseHover(lbl_gearicon_DSP_administration);Thread.sleep(2000);break;
		case "Manage DSP" : jsClick(lbl_gearicon_DSPAdmin_ManageDSP); waitForElement(btn_gearicon_DSPAdmin_ManageDSP_AddRole);
							shouldBeVisible(btn_gearicon_DSPAdmin_ManageDSP_AddRole);browser_zoom_out(4);	
							break;
		case "Manage DSP Role" : jsClick(lbl_gearicon_DSPAdmin_ManageDSPRole); waitForElement(btn_DSPAdmin_ManageDSPRole_Viewrole);
							shouldBeVisible(btn_DSPAdmin_ManageDSPRole_Viewrole);browser_zoom_out(4);
							break;
							
		case "Get Next Buttons":  waitForElement(lbl_gearicon_logout);
		if (lbl_gearicon_GetNextButtons.isCurrentlyEnabled()) {
			//lbl_gearicon_GetNextButtons.isPresent();
			slf4jLogger.info("Get Next Buttons link is present in gear icon");
			//lbl_gearicon_GetNextButtons.click();
			jsClick(lbl_gearicon_GetNextButtons);
			Thread.sleep(1000);
			slf4jLogger.info("Clicked on lbl_gearicon_GetNextButtons successfully");
		}
		else throw new Error("Get Next Buttons link is not present in gear icon");
		break;	
		}
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void select_dspworkgroup_wrkgroupactivity(String grpname) {	try {
		waitForElement(ddl_gearicon_wrkgrpactivity_dspworkgroup);Thread.sleep(1000);
		ddl_gearicon_wrkgrpactivity_dspworkgroup.selectByVisibleText(grpname);
	
			Thread.sleep(2000);
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void verify_validation(String validation) throws SQLException { try {
		String Message=null;
		switch(validation){
		
		case "Event Get Next track in TRACK_USER table": 
            
            String userid =Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx") ;
            List<String> actualFocusTab= ovdb.audit_logs_focus(userid);
            slf4jLogger.info("userid...."+userid);
            slf4jLogger.info("actualFocusTab...."+actualFocusTab.get(0));
            
            
            if (actualFocusTab.get(0).equalsIgnoreCase("Get Next")) {
                  slf4jLogger.info("Viewed Manage GetNext buttons page");
            }
            else throw new Error("Audit log not tracked") ;
            break; 

		
		case "Select DSP Role and click on delete button":
								ddl_DSPAdmin_ManageDSPRole_DSProles.selectByVisibleText("AUTO_TEST1");
								jsClick(btn_DSPAdmin_ManageDSPRole_deleterole);
								Thread.sleep(3000);
								String delete_success_message = lbl_delete_success_message.getText();
								System.out.println(delete_success_message);
								
								if(delete_success_message.contains("Role deleted Successfully.")){
									System.out.println(delete_success_message+" success message is displaying in screen");
								}else throw new Error("Success message is not displaying in screen"); 
								break;
		case "Fill the valid data and click on create button":
								Thread.sleep(2000);
								tbx_DSPAdmin_ManageDSP_AddRole_roleName.sendKeys("AUTO_TEST1");
								tbx_DSPAdmin_ManageDSP_AddRole_roleDesc.sendKeys("AUTO_TEST1");
								Thread.sleep(2000);
								jsClick(btn_DSPAdmin_ManageDSP_AddRole_CreateRole);
								Thread.sleep(3000);
								String create_success_message = lbl_create_success_message.getText();
								System.out.println(create_success_message);
								
								if(create_success_message.contains("Role created Successfully")){
									System.out.println(create_success_message+" message is displaying in screen");
								}else throw new Error("Success message is not displaying in screen"); 
								break;
		case "click on the create Role button without data and validate the error message":
								jsClick(btn_DSPAdmin_ManageDSP_AddRole_CreateRole);
								Thread.sleep(2000);
								String error_message = lbl_Error_message.getText();	
								System.out.println(error_message);	
								if(error_message.contains("Please fill all mandatory fields")){
									System.out.println(error_message+" Error message is displaying in screen");
								}else throw new Error("Error message is not displaying in screen"); 
								//btn_close_Error_message.click();
								break;
			
		case "ASP Group Activity Report tab is displayed in workgroup activity report screen":
							waitForElement(tab_gearicon_wrkgrpactivity_reportresult); Thread.sleep(2000);
							if(!tab_gearicon_wrkgrpactivity_reportresult.getText().trim().contains("ASP Group Activity Report")){
								slf4jLogger.debug("ASP Group Activity Report tab is not displayed in workgroup activity report screen:"+tab_gearicon_wrkgrpactivity_reportresult.getText());
								throw new Error("ASP Group Activity Report tab is not displayed in workgroup activity report screen"+tab_gearicon_wrkgrpactivity_reportresult.getText());
							}			
							break;
							
		case "Workgroup Activity Summary pie chart displayed":			
								waitForElement(lbl_gearicon_wrkgrpactivity_summarychart);							
							break;
							
		case "start time & end time in workgroup activity report screen":			
							waitForElement(btn_gearicon_wrkgrpactivity_startdatecalendar);
							jsClick(btn_gearicon_wrkgrpactivity_startdatecalendar); Thread.sleep(1000);
							waitForElement(btn_gearicon_wrkgrpactivity_startdatecalendar_01);
							jsClick(btn_gearicon_wrkgrpactivity_startdatecalendar_01); Thread.sleep(1000);
							
							break;
			
		case "Verify AUTO Test Tag name is displayed in Manage Tags Search result page":

							if(!getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[1]")).isDisplayed() && !getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[2]")).isDisplayed() && !getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[3]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
								throw new Error("Auto Test Tag is not displayed");
							}
							else slf4jLogger.info("Auto Test Tag is displayed");
							
							
							break;
							
		case "Workgroup Activity Tab should be displayed containing DSP Workgroup, Start & End Date - Start Time & Generate report button":

			waitForElement(btn_gearicon_defecttaskreport_generatereport);
			
			if(!ddl_gearicon_wrkgrpactivity_dspworkgroup.isCurrentlyVisible()){
				slf4jLogger.info("DSP Workgroup field is not displayed in the Workgroup Activity screen");
				throw new Error("DSP Workgroup field is not displayed in the Workgroup Activity screen");
			}
			
			ddl_gearicon_wrkgrpactivity_dspworkgroup.selectByIndex(0);
				Thread.sleep(2000);
			
			ddl_gearicon_wrkgrpactivity_dspworkgroup.selectByIndex(1);Thread.sleep(2000);
			ddl_gearicon_wrkgrpactivity_dspworkgroup.selectByIndex(2);Thread.sleep(2000);
			
			if(!tbx_gearicon_defecttaskreport_startdattime.isCurrentlyVisible()){
				slf4jLogger.info("Start Date - Start Time field is not displayed in the Workgroup Activity screen");
				throw new Error("Start Date - Start Time field is not displayed in the Workgroup Activity screen");
			}
			
			if(!btn_gearicon_defecttaskreport_calendarstartdate.isCurrentlyVisible() && !btn_gearicon_defecttaskreport_calendarstartdate.isCurrentlyEnabled()){
				slf4jLogger.info("Start Date button is not displayed in the Workgroup Activity screen");
				throw new Error("Start Date button is not displayed in the Workgroup Activity screen");
			}
			
			if(!tbx_gearicon_defecttaskreport_enddattime.isCurrentlyVisible()){
				slf4jLogger.info("End Date - End Time field is not displayed in the Workgroup Activity screen");
				throw new Error("End Date - End Time field is not displayed in the Workgroup Activity screen");
			}
			
			if(!btn_gearicon_defecttaskreport_calendarenddate.isCurrentlyVisible() && !btn_gearicon_defecttaskreport_calendarenddate.isCurrentlyEnabled()){
				slf4jLogger.info("End Date button is not displayed in the Workgroup Activity screen");
				throw new Error("End Date button is not displayed in the Workgroup Activity screen");
			}
			
			if(!btn_gearicon_defecttaskreport_generatereport.isCurrentlyVisible() && !btn_gearicon_defecttaskreport_generatereport.isCurrentlyEnabled()){
				slf4jLogger.info("Generate Report button is not displayed in the Workgroup Activity screen");
				throw new Error("Generate Report button is not displayed in the Workgroup Activity screen");
			}
			
			if(!btn_gearicon_defecttaskreport_reset.isCurrentlyVisible() && !btn_gearicon_defecttaskreport_reset.isCurrentlyEnabled()){
				slf4jLogger.info("Reset button is not displayed in the Workgroup Activity screen");
				throw new Error("Reset button is not displayed in the Workgroup Activity screen");
			}			
			
			
			break;
		case "OV Dashboard tab":shouldBeVisible(lbl_Title_OVDashboard);		
									break;
		case "DSP Dashboard tab":shouldBeVisible(lbl_Title_DSPDashboard);		
									break;
									
		case "Manage Workgroup attributes":
										if(!btn_gearicon_mngwrkgrp_AddWorkgroup.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_AddWorkgroup.isCurrentlyEnabled()){
											slf4jLogger.info("Add Workgroup button is not displayed in the Manage Workgroup screen");
											throw new Error("Add Workgroup button is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editWorkgroup.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editWorkgroup.isCurrentlyEnabled()){
											slf4jLogger.info("Edit Workgroup button is not displayed in the Manage Workgroup screen");
											throw new Error("Edit Workgroup button is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_deleteWorkgroup.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_deleteWorkgroup.isCurrentlyEnabled()){
											slf4jLogger.info("Delete Workgroup button is not displayed in the Manage Workgroup screen");
											throw new Error("Delete Workgroup button is not displayed in the Manage Workgroup screen");
										}
										
										if(!tbx_gearicon_mngwrkgrp_selectwrkgrp.isCurrentlyVisible()){
											slf4jLogger.info("WorkGroupName field is not displayed in the Manage Workgroup screen");
											throw new Error("WorkGroupName field is not displayed in the Manage Workgroup screen");
										}
										
										if(!ddl_gearicon_mngwrkgrp_selectwrkgrp.isCurrentlyVisible()){
											slf4jLogger.info("WorkGroup drop down is not displayed in the Manage Workgroup screen");
											throw new Error("WorkGroup drop down is not displayed in the Manage Workgroup screen");
										}
													
										tbx_gearicon_mngwrkgrp_selectwrkgrp.type("TEST");
										
										ddl_gearicon_mngwrkgrp_selectwrkgrp.selectByVisibleText("TEST");			
										
										jsClick(btn_gearicon_mngwrkgrp_editWorkgroup);
										
										waitForElement(lbl_gearicon_mngwrkgrp_editwrkgrp_Wrkgrpinfo);
										
										if(!tbx_gearicon_mngwrkgrp_editwrkgrp_Wrkgrpname.isCurrentlyVisible()){
											slf4jLogger.info("WorkGroup Name field is not displayed in the Manage Workgroup screen");
											throw new Error("WorkGroup Name field is not displayed in the Manage Workgroup screen");
										}
										
										if(!tbx_gearicon_mngwrkgrp_editwrkgrp_grpdescription.isCurrentlyVisible()){
											slf4jLogger.info("WorkGroup Description field is not displayed in the Manage Workgroup screen");
											throw new Error("WorkGroup Description field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_createdby.isCurrentlyVisible()){
											slf4jLogger.info("Created By field is not displayed in the Manage Workgroup screen");
											throw new Error("Created By field is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_viewwrkgrpmembers.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_viewwrkgrpmembers.isCurrentlyEnabled()){
											slf4jLogger.info("View Workgroup Members button is not displayed in the Manage Workgroup screen");
											throw new Error("View Workgroup Members button is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_savewrkgrp.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_savewrkgrp.isCurrentlyEnabled()){
											slf4jLogger.info("Save button is not displayed in the Manage Workgroup screen");
											throw new Error("Save button is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_cancel.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_cancel.isCurrentlyEnabled()){
											slf4jLogger.info("Cancel button is not displayed in the Manage Workgroup screen");
											throw new Error("Cancel button is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_Wrkgrproles.isCurrentlyVisible()){
											slf4jLogger.info("Workgroup Roles field is not displayed in the Manage Workgroup screen");
											throw new Error("Workgroup Roles field is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_addrole.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_addrole.isCurrentlyEnabled()){
											slf4jLogger.info("Add Role button is not displayed in the Manage Workgroup screen");
											throw new Error("Add Role button field is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_editrole.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_editrole.isCurrentlyEnabled()){
											slf4jLogger.info("Edit Role button is not displayed in the Manage Workgroup screen");
											throw new Error("Edit Role button field is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_copyrole.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_copyrole.isCurrentlyEnabled()){
											slf4jLogger.info("Copy Role button is not displayed in the Manage Workgroup screen");
											throw new Error("Copy Role button field is not displayed in the Manage Workgroup screen");
										}
										
										if(!btn_gearicon_mngwrkgrp_editwrkgrp_deleterole.isCurrentlyVisible() && !btn_gearicon_mngwrkgrp_editwrkgrp_deleterole.isCurrentlyEnabled()){
											slf4jLogger.info("Delete Role button is not displayed in the Manage Workgroup screen");
											throw new Error("Delete Role button field is not displayed in the Manage Workgroup screen");
										}
										
										if(!ddl_gearicon_mngwrkgrp_editwrkgrp_wrkgrproles.isCurrentlyVisible()){
											slf4jLogger.info("Select Workgroup Roles field is not displayed in the Manage Workgroup screen");
											throw new Error("Select Workgroup Roles field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermission.isCurrentlyVisible()){
											slf4jLogger.info("Role Permissions field is not displayed in the Manage Workgroup screen");
											throw new Error("Role Permissions field is not displayed in the Manage Workgroup screen");
										}
										
										if(!ddl_gearicon_mngwrkgrp_editwrkgrp_selectrole.isCurrentlyVisible()){
											slf4jLogger.info("Select Role field is not displayed in the Manage Workgroup screen");
											throw new Error("Select Role field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader.isCurrentlyVisible()){
											slf4jLogger.info("Role Permissions field is not displayed in the Manage Workgroup screen");
											throw new Error("Role Permissions field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_module.isCurrentlyVisible()){
											slf4jLogger.info("Module Table header field is not displayed in the Manage Workgroup screen");
											throw new Error("Module Table header field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_read.isCurrentlyVisible()){
											slf4jLogger.info("Read Table header field is not displayed in the Manage Workgroup screen");
											throw new Error("Read Table header field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_update.isCurrentlyVisible()){
											slf4jLogger.info("Read/Write Table header field is not displayed in the Manage Workgroup screen");
											throw new Error("Read/Write Table header field is not displayed in the Manage Workgroup screen");
										}
										
										if(!lbl_gearicon_mngwrkgrp_editwrkgrp_rolepermissionHeader_restricted.isCurrentlyVisible()){
											slf4jLogger.info("Restricted Table header field is not displayed in the Manage Workgroup screen");
											throw new Error("Restricted Table header field is not displayed in the Manage Workgroup screen");
										}
										
										break;
		case "My Profile attributes":
										waitForElement(btn_gearicon_admn_mnguser_result_Saveprofile);
										
										if(!lbl_gearicon_admn_mnguser_resultviewpage_Userdetails.isCurrentlyVisible()){				
											slf4jLogger.info("User Details header is not displayed in the My Profile screen");
											throw new Error("User Details header is not displayed in the My Profile screen");
										}
										
										if(!lbl_gearicon_admn_mnguser_resultviewpage_Userinform.isCurrentlyVisible()){				
											slf4jLogger.info("User Information header is not displayed in the My Profile screen");
											throw new Error("User Information header is not displayed in the My Profile screen");
										}
										
										if(!lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson.isCurrentlyVisible()){				
											slf4jLogger.info("User Permission header is not displayed in the My Profile screen");
											throw new Error("User Permission header is not displayed in the My Profile screen");
										}
										
										if(!lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson_Userrole.isCurrentlyVisible()){				
											slf4jLogger.info("In User Permission header, User role is not displayed in the My Profile screen");
											throw new Error("In User Permission header, User role is not displayed in the My Profile screen");
										}
										
										if(!lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson_Admin.isCurrentlyVisible()){				
											slf4jLogger.info("In User Permission header, Administrator role is not displayed in the My Profile screen");
											throw new Error("In User Permission header, Administrator role is not displayed in the My Profile screen");
										}
										
										if(!lbl_gearicon_admn_mnguser_resultviewpage_Userpremisson_Superadmin.isCurrentlyVisible()){				
											slf4jLogger.info("In User Permission header, Super Administrator role is not displayed in the My Profile screen");
											throw new Error("In User Permission header, Super Administrator role is not displayed in the My Profile screen");
										}
										
										if(!tab_gearicon_admn_mnguser_resultviewpage_DSPProfile.isCurrentlyVisible()){				
											slf4jLogger.info("DSP Profile Tab is not displayed in the My Profile screen");
											throw new Error("DSP Profile Tab is not displayed in the My Profile screen");
										}
										
										if(!tab_gearicon_admn_mnguser_resultviewpage_Usrpreference.isCurrentlyVisible()){				
											slf4jLogger.info("User Preference Tab is not displayed in the My Profile screen");
											throw new Error("User Preference Tab is not displayed in the My Profile screen");
										}
										
										if(!tab_gearicon_admn_mnguser_resultviewpage_fvrsettings.isCurrentlyVisible()){				
											slf4jLogger.info("Favorite Settings Tab is not displayed in the My Profile screen");
											throw new Error("Favorite Settings Tab is not displayed in the My Profile screen");
										}
										
										if(!tab_gearicon_admn_mnguser_resultviewpage_mnghierarchy.isCurrentlyVisible()){				
											slf4jLogger.info("Manage Hierarchy Tab is not displayed in the My Profile screen");
											throw new Error("Manage Hierarchy Tab is not displayed in the My Profile screen");
										}
										
										if(!tab_gearicon_admn_mnguser_resultviewpage_Wrkgrpsettings.isCurrentlyVisible()){				
											slf4jLogger.info("Workgroup Settings Tab is not displayed in the My Profile screen");
											throw new Error("Workgroup Settings Tab is not displayed in the My Profile screen");
										}
										
										if(!tab_gearicon_admn_mnguser_resultviewpage_emphistory.isCurrentlyVisible()){				
											slf4jLogger.info("Employee History Tab is not displayed in the My Profile screen");
											throw new Error("Employee History Tab is not displayed in the My Profile screen");
										}
										
										break;
		case "User result screen tab should be displyed with User details under Manage User screen":
									 waitForElement(btn_gearicon_admn_mnguser_result_view); 
									 List<WebElementFacade> userheaders_attribute = lbl_allXapath;
									 
									 ArrayList<String> Fieldattributelist=new ArrayList<String>();
										for(int j=0;j<userheaders_attribute.size();j++){
											Fieldattributelist.add(j, userheaders_attribute.get(j).getText().trim());
												slf4jLogger.info("Fields Present:"+Fieldattributelist.get(j));
											}
									ArrayList<String> List2compare_Fieldattributelist=new ArrayList<String>();
									
									List2compare_Fieldattributelist.add(0, "View");
									List2compare_Fieldattributelist.add(1, "Cuid");
									List2compare_Fieldattributelist.add(2, "First Name");
									List2compare_Fieldattributelist.add(3, "Last Name");
									List2compare_Fieldattributelist.add(4, "Title");
									List2compare_Fieldattributelist.add(5, "Mnet Group");
									List2compare_Fieldattributelist.add(6, "User Role");
									List2compare_Fieldattributelist.add(7, "Delete");
									
									for(int i=0;i<Fieldattributelist.size();i++){
										if(!Fieldattributelist.get(i).equals(List2compare_Fieldattributelist.get(i))){
											slf4jLogger.info("Fieldattributelist="+Fieldattributelist.get(i));
											slf4jLogger.info("List2compare_Fieldattributelist="+List2compare_Fieldattributelist.get(i)+" Not matching");
											throw new Error("Fields are not matching check:"+tab_gearicon_admn_mnguserheader_usersearchresult.getText().replaceAll("\\s+$", ""));
										}
									}
									if(!btn_gearicon_admn_mnguser_result_view.isCurrentlyEnabled() && !btn_gearicon_admn_mnguser_result_view.isCurrentlyVisible()){
										slf4jLogger.info("View icon is not displayed in the User search result page");
										throw new Error("View icon is not displayed in the User search result page");
									}
									if(!btn_gearicon_admn_mnguser_result_delete.isCurrentlyEnabled() && !btn_gearicon_admn_mnguser_result_delete.isCurrentlyVisible()){
										slf4jLogger.info("Delete icon is not displayed in the User search result page");
										throw new Error("Delete icon is not displayed in the User search result page");
									}
									
									if(!btn_gearicon_admn_mnguser_excelexporticon.isCurrentlyEnabled() && !btn_gearicon_admn_mnguser_excelexporticon.isCurrentlyVisible()){
										slf4jLogger.info("Excel export icon is not displayed in the User search result page");
										throw new Error("Excel export icon is not displayed in the User search result page");
									}
									
									if(!btn_gearicon_admn_mnguser_printicon.isCurrentlyEnabled() && !btn_gearicon_admn_mnguser_printicon.isCurrentlyVisible()){
										slf4jLogger.info("Print icon is not displayed in the User search result page");
										throw new Error("Print icon is not displayed in the User search result page");
									}
									
									break;
		
		case "Search Tag, Add Tag and View All Tags action buttons in Manage Tag page is displayed": 
				if(!btn_manageTags_searchtags.isCurrentlyEnabled() && !btn_manageTags_searchtags.isCurrentlyVisible()){
					throw new Error("Search Tag button is not in Enabled state");
				}
				if(!btn_manageTags_addtags.isCurrentlyEnabled() && !btn_manageTags_addtags.isCurrentlyVisible()){
					throw new Error("Add Tag button is not in Enabled state");
				}
				if(!btn_manageTags_viewalltags.isCurrentlyEnabled() && !btn_manageTags_viewalltags.isCurrentlyVisible()){
					throw new Error("View All Tag button is not in Enabled state");
				} break;
				
		case "Task Type and Tag name fields are displayed in Manage Tags page is displayed":
					if(!lbl_manageTags_tasktype.isCurrentlyVisible() && !ddl_manageTags_tasktype.isCurrentlyVisible()){
						throw new Error("Task Type is not Visible");
					}
					if(!lbl_manageTags_tagname.isCurrentlyVisible() && !tbx_manageTags_tagname.isCurrentlyVisible()){
						throw new Error("Tag Name is not Visible");
					} break;
			
		case "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'":
			jsClick(btn_manageTags_searchtags); waitForElement(lbl_manageTags_alertmsg1);
					Message = lbl_manageTags_alertmsg1.getText();
					Message = Message.toString().substring(1);
					
					Message = Message.trim(); 
					if(!Message.contains("Please fill the mandatory fields.")){
						throw new Error("Wrong message is displayed as "+Message);
					} break;
					
		case "Excel & Print Icon displayed in Tag search result page": /*if(!tab_Tagsearchresult.isCurrentlyVisible()){
																			select_gearicon("View All Tags button");
																		}
								if(!btn_managetag_print.isCurrentlyEnabled() && !btn_managetag_print.isCurrentlyVisible()){
									throw new Error("Print icon is not visible in Manage Tags");
								}
								if(!btn_managetag_excelexport.isCurrentlyEnabled() && !btn_managetag_excelexport.isCurrentlyVisible()){
									throw new Error("Excel export icon is not visible in Manage Tags");
								} break;*/
								if(!tab_Tagsearchresult.isCurrentlyVisible()){
									select_gearicon("View All Tags button");
								}
					if(!btn_managetag_print.isCurrentlyEnabled() && !btn_managetag_print.isCurrentlyVisible()){
					throw new Error("Print icon is not visible in Manage Tags");
					}
					if(!btn_managetag_excelexport.isCurrentlyEnabled() && !btn_managetag_excelexport.isCurrentlyVisible()){
					throw new Error("Excel export icon is not visible in Manage Tags");
					} break; 	
			
					
		case "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page":
			
			ArrayList<String> orderAttributes = new ArrayList<String>();

			orderAttributes.add(0, "Tag Name");
			orderAttributes.add(1, "Description");
			orderAttributes.add(2, "Created By");
			orderAttributes.add(3, "Created Date");
			orderAttributes.add(4, "Delete");
			
			List<WebElementFacade> HeaderList = lbl_allXapath_managetagheader;
			ArrayList<String> headeratributes=new ArrayList<String>();
			for(int j=0;j<HeaderList.size();j++){
				headeratributes.add(j, HeaderList.get(j).getText().trim());
			}
			
			if (headeratributes.containsAll(orderAttributes)) {
				slf4jLogger.info("pass");
			} else throw new Error("fail Headers are not Matching");
			break;
			
		case "AUTO Test Tag name are displayed in Manage Tags Search result page": 
			if(!getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[1]")).isDisplayed() && !getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[2]")).isDisplayed() && !getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[3]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
				throw new Error("Auto Test Tag is not displayed");
			}
			
			jsClick(getDriver().findElement(By.xpath("(.//*[text()='AUTO Test'])[1]/../following-sibling::div//input[@title='Delete Tag']")));
			select_gearicon("Accept Delete tag");break;
		
		case "Error Message should be displayed as Tag already exist for tag type 'Hoover Tasks'": 
								waitForElement(lbl_managetag_duplicatetag);
								Message = lbl_managetag_duplicatetag.getText();
								Message = Message.toString().substring(1);
								String tagname= getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'contenttablejqxGrid')]//div[1])[1]/div[1]/div")).getText().trim();
								Message = Message.trim(); 
								slf4jLogger.info("Message:"+Message);
								if(!Message.contains("Tag '"+tagname+"' already exist for tag type 'Hoover Tasks'")){
									throw new Error("Wrong message is displayed as "+Message);
								} break;
		
		case "View All Tags Button is displayed under Manage Tags":if(!btn_manageTags_viewalltags.isCurrentlyEnabled() && !btn_manageTags_viewalltags.isCurrentlyVisible()){
															throw new Error("View All Tag button is not in Enabled state");
														} break;
														
		case "Search Tags Button is displayed under Manage Tags":if(!btn_manageTags_searchtags.isCurrentlyEnabled() && !btn_manageTags_searchtags.isCurrentlyVisible()){
																throw new Error("Search Tag button is not in Enabled state");
															} break;
															
		case "Under Manage Workgroup we should see Add Workgroup, Edit Workgroup, Delete Workgroup & Workgroup list is been displayed":
			if(!btn_manageworkgroup_addwrkgrp.isCurrentlyVisible() && !btn_manageworkgroup_addwrkgrp.isCurrentlyEnabled()){
				throw new Error("Add Workgroup is not displayed under Mange Workgroup");
			}
			if(!btn_manageworkgroup_editwrkgrp.isCurrentlyVisible() && !btn_manageworkgroup_editwrkgrp.isCurrentlyEnabled()){
				throw new Error("Edit Workgroup is not displayed under Mange Workgroup");
			}
			if(!btn_manageworkgroup_deletewrkgrp.isCurrentlyVisible() && !btn_manageworkgroup_deletewrkgrp.isCurrentlyEnabled()){
				throw new Error("Delete Workgroup is not displayed under Mange Workgroup");
			}
			if(!tbx_manageworkgroup_searchwrkgrp.isCurrentlyVisible()){
				throw new Error("Search Workgroup is not displayed under Mange Workgroup");
			}
			if(!ddl_manageworkgroup_wrkgrplist.isCurrentlyVisible()){
				throw new Error("Workgroup List is not displayed under Mange Workgroup");
			} break;
			
		case "Select first workgroup & click on Edit Workgroup button in Manage Workgroup page": ddl_manageworkgroup_wrkgrplist.selectByIndex(0);jsClick(btn_manageworkgroup_editwrkgrp);
					waitForElement(btn_manageworkgroup_Viewwrkgrpmember); break;
					
		case "CLC_Contact_Create, CLC_Contact_Search & CLC_Contact_Update modules are displayed in Role permission":
			if(!lbl_manageworkgroup_roleprms_clccontctcrt.isCurrentlyVisible()){
				throw new Error("CLC_Contact_Create under role permission is not displayed under Mange Workgroup");
			}
			if(!lbl_manageworkgroup_roleprms_clccontctsrch.isCurrentlyVisible()){
				throw new Error("CLC_Contact_Search under role permission is not displayed under Mange Workgroup");
			}
			if(!lbl_manageworkgroup_roleprms_clccontctupt.isCurrentlyVisible()){
				throw new Error("CLC_Contact_Update under role permission is not displayed under Mange Workgroup");
			} break;
			
		case "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed":
			if(!tab_gearicon_defecttaskreport.isCurrentlyVisible()){
				
				slf4jLogger.error("Defect Task Report Tab is not displayed");
				throw new Error("Defect Task Report Tab is not displayed");
			}
			if(!ddl_gearicon_defecttaskreport_ovwrkgrp.isCurrentlyVisible()){
				
				slf4jLogger.error("Work group field in Defect Task Report Tab is not displayed");
				throw new Error("Work group field in Defect Task Report Tab is not displayed");
			}
			
			if(!tbx_gearicon_defecttaskreport_startdattime.isCurrentlyVisible()){
				
				slf4jLogger.error("Start Date field in Defect Task Report Tab is not displayed");
				throw new Error("Start Date field in Defect Task Report Tab is not displayed");
			}
		
			if(!tbx_gearicon_defecttaskreport_enddattime.isCurrentlyVisible()){
				
				slf4jLogger.error("End Date field in Defect Task Report Tab is not displayed");
				throw new Error("End Date field in Defect Task Report Tab is not displayed");
			}
			
			if(!btn_gearicon_defecttaskreport_generatereport.isCurrentlyVisible() && !btn_gearicon_defecttaskreport_generatereport.isCurrentlyEnabled()){
				
				slf4jLogger.error("Generate report button in Defect Task Report Tab is not displayed");
				throw new Error("Generate report button in Defect Task Report Tab is not displayed");
			}
			
			if(!btn_gearicon_defecttaskreport_reset.isCurrentlyVisible() && !btn_gearicon_defecttaskreport_reset.isCurrentlyEnabled()){
				
				slf4jLogger.error("Reset button in Defect Task Report Tab is not displayed");
				throw new Error("Reset button in Defect Task Report Tab is not displayed");
			}break;	
			
		case "OV Workgroup should Single value selected drop down in Defect Task Report Tab":try {
			Select OVworkgroup = new Select(ddl_gearicon_defecttaskreport_ovwrkgrp);
			if(!OVworkgroup.isMultiple()){
				System.out.println("OV Workgroup dropdown is Single selected");
			} else {
				System.out.println("OV Workgroup dropdown is Multiple selected");		
			}
				ddl_gearicon_defecttaskreport_ovwrkgrp.selectByIndex(0);
				System.out.println("No of selected Options = "+ddl_gearicon_defecttaskreport_ovwrkgrp.getSelectOptions().size());
				System.out.println("Selected Option is = "+ddl_gearicon_defecttaskreport_ovwrkgrp.getSelectedVisibleTextValue());
				
				/*ddl_gearicon_defecttaskreport_ovwrkgrp.selectByVisibleText("ASP");
				Thread.sleep(1000);
				ddl_gearicon_defecttaskreport_ovwrkgrp.selectByVisibleText("NST");*/
				Thread.sleep(1000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			break;
			
		case "select start & end date in Defect Task Report": try {
								jsClick(btn_gearicon_defecttaskreport_calendarstartdate);
								waitForElement(btn_gearicon_defecttaskreport_startdate_previousicon);
								jsClick(btn_gearicon_defecttaskreport_startdate_previousicon);
									Thread.sleep(1000);
									jsClick(btn_gearicon_defecttaskreport_startdate_01);
									Thread.sleep(1000);
									jsClick(btn_gearicon_defecttaskreport_calendarenddate);
									waitForElement(btn_gearicon_defecttaskreport_enddate_today);
									jsClick(btn_gearicon_defecttaskreport_enddate_today);Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}break;
								
		case "click on Generate report in Defect Task Report":jsClick(btn_gearicon_defecttaskreport_generatereport);waitForElement(tab_gearicon_defecttaskreport_ASPdtreport);break;
		
		case "under Open to Completed Task Stats section we should be seeing Duration Mean, Duration Mode & Duration Median fields with values been displayed in Defect Task Report":
			waitForElement(lbl_gearicon_defecttaskreport_opn2cmptasksts);
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts.isCurrentlyVisible()){
				slf4jLogger.error("Open to Completed Task Stats header is not displayed");
				throw new Error("Open to Completed Task Stats header is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mean.isCurrentlyVisible()){
				slf4jLogger.error("Duration Mean in Open to Completed Task Stats is not displayed");
				throw new Error("Duration Mean in Open to Completed Task Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mean_value.isCurrentlyVisible()){
				slf4jLogger.error("Duration Mean value in Open to Completed Task Stats is not displayed");
				throw new Error("Duration Mean value in Open to Completed Task Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mode.isCurrentlyVisible()){
				slf4jLogger.error("Duration Mode in Open to Completed Task Stats is not displayed");
				throw new Error("Duration Mode in Open to Completed Task Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Mode_value.isCurrentlyVisible()){
				slf4jLogger.error("Duration Mode value in Open to Completed Task Stats is not displayed");
				throw new Error("Duration Mode value in Open to Completed Task Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Median.isCurrentlyVisible()){
				slf4jLogger.error("Duration Median in Open to Completed Task Stats is not displayed");
				throw new Error("Duration Median in Open to Completed Task Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_opn2cmptasksts_Duration_Median_value.isCurrentlyVisible()){
				slf4jLogger.error("Duration Median value in Open to Completed Task Stats is not displayed");
				throw new Error("Duration Median value in Open to Completed Task Stats is not displayed");
			}break;
			
		case "under Tasks Interaction Stats section we should be seeing Number of User Touches, Number of Status Changes & Average Duration Open to Claim/Assign fields with values been displayed in Defect Task Report":
			waitForElement(lbl_gearicon_defecttaskreport_tskintrsts);
			if(!lbl_gearicon_defecttaskreport_tskintrsts.isCurrentlyVisible()){
				slf4jLogger.error("Tasks Interaction Stats header is not displayed");
				throw new Error("Tasks Interaction Stats header is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tskintrsts_nousrtch.isCurrentlyVisible()){
				slf4jLogger.error("Number of User Touches in Tasks Interaction Stats is not displayed");
				throw new Error("Number of User Touches in Tasks Interaction Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tskintrsts_nousrtch_value.isCurrentlyVisible()){
				slf4jLogger.error("Number of User Touches value in Tasks Interaction Stats is not displayed");
				throw new Error("Number of User Touches value in Tasks Interaction Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tskintrsts_noststchgs.isCurrentlyVisible()){
				slf4jLogger.error("Number of Status Changes in Tasks Interaction Stats is not displayed");
				throw new Error("Number of Status Changes in Tasks Interaction Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tskintrsts_noststchgs_value.isCurrentlyVisible()){
				slf4jLogger.error("Number of Status Changes value in Tasks Interaction Stats is not displayed");
				throw new Error("Number of Status Changes value in Tasks Interaction Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tskintrsts_claimassgn.isCurrentlyVisible()){
				slf4jLogger.error("Average Duration Open to Claim/Assign in Tasks Interaction Stats is not displayed");
				throw new Error("Average Duration Open to Claim/Assign in Tasks Interaction Stats is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tskintrsts_claimassgn_value.isCurrentlyVisible()){
				slf4jLogger.error("Average Duration Open to Claim/Assign value in Tasks Interaction Stats is not displayed");
				throw new Error("Average Duration Open to Claim/Assign value in Tasks Interaction Stats is not displayed");
			}break;
			
		case "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report":
			waitForElement(lbl_gearicon_defecttaskreport_vlmsmmy);
			if(!lbl_gearicon_defecttaskreport_vlmsmmy.isCurrentlyVisible()){
				slf4jLogger.error("Volume Summary header is not displayed");
				throw new Error("Volume Summary header is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tottsk.isCurrentlyVisible()){
				slf4jLogger.error("Total Task in Volume Summary is not displayed");
				throw new Error("Total Task in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tottsk_value.isCurrentlyVisible()){
				slf4jLogger.error("Total Task value in Volume Summary is not displayed");
				throw new Error("Total Task value in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tskcmp.isCurrentlyVisible()){
				slf4jLogger.error("Tasks Completed in Volume Summary is not displayed");
				throw new Error("Tasks Completed in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tskcmp_value.isCurrentlyVisible()){
				slf4jLogger.error("Tasks Completed value in Volume Summary is not displayed");
				throw new Error("Tasks Completed value in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tskntcmp.isCurrentlyVisible()){
				slf4jLogger.error("Tasks not completed in Volume Summary is not displayed");
				throw new Error("Tasks not completed in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tskntcmp_value.isCurrentlyVisible()){
				slf4jLogger.error("Tasks not completed value in Volume Summary is not displayed");
				throw new Error("Tasks not completed value in Volume Summary is not displayed");
			}			
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_notsktyps.isCurrentlyVisible()){
				slf4jLogger.error("Number of Task types in Volume Summary is not displayed");
				throw new Error("Number of Task types in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_notsktyps_value.isCurrentlyVisible()){
				slf4jLogger.error("Number of Task types value in Volume Summary is not displayed");
				throw new Error("Number of Task types value in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_nousrtchtsk.isCurrentlyVisible()){
				slf4jLogger.error("Number of Users Touching Tasks in Volume Summary is not displayed");
				throw new Error("Number of Users Touching Tasks in Volume Summary is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_nousrtchtsk_value.isCurrentlyVisible()){
				slf4jLogger.error("Number of Users Touching Tasks value in Volume Summary is not displayed");
				throw new Error("Number of Users Touching Tasks value in Volume Summary is not displayed");
			}break;
			
		case "click on Total tasks Hyperlink in Defect Task Report":
			
			
			if(!lbl_gearicon_defecttaskreport_vlmsmmy_tottsk_value.isCurrentlyVisible()){
				slf4jLogger.error("Total Task value in Volume Summary is not displayed");
				throw new Error("Total Task value in Volume Summary is not displayed");
			}
			jsClick(lbl_gearicon_defecttaskreport_vlmsmmy_tottsk_value);waitForElement(lbl_gearicon_defecttaskreport_alltsk_tskrrt); break;
			
		case "Total tasks link should launch a new tab and should display all the task details": 
			
			waitForElement(lbl_gearicon_defecttaskreport_alltsk_tskrrt);
			Thread.sleep(20000);
			waitFor(lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_srno);
			if(!btn_gearicon_defecttaskreport_excelexport.isCurrentlyVisible()){
				slf4jLogger.error("Excel Export icon in Task Report: Total Tasks is not displayed");
				throw new Error("Excel Export icon in Task Report: Total Tasks is not displayed");
			}
			
			if(!btn_gearicon_defecttaskreport_print.isCurrentlyVisible()){
				slf4jLogger.error("Print icon in Task Report: Total Tasks is not displayed");
				throw new Error("Print icon in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt.isCurrentlyVisible()){
				slf4jLogger.error("Task Report: Total Tasks header is not displayed");
				throw new Error("Task Report: Total Tasks header is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_tsknme.isCurrentlyVisible()){
				slf4jLogger.error("Task Name: header in Task Report: Total Tasks is not displayed");
				throw new Error("Task Name: header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_tsknme_value.isCurrentlyVisible()){
				slf4jLogger.error("Task Name: value in Task Report: Total Tasks is not displayed");
				throw new Error("Task Name: value in Task Report: Total Tasks is not displayed");
			}
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_wrkgrp.isCurrentlyVisible()){
				slf4jLogger.error("Work Group: header in Task Report: Total Tasks is not displayed");
				throw new Error("Work Group: header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_wrkgrp_value.isCurrentlyVisible()){
				slf4jLogger.error("Work Group: value in Task Report: Total Tasks is not displayed");
				throw new Error("Work Group: value in Task Report: Total Tasks is not displayed");
			}
			String Work_group=lbl_gearicon_defecttaskreport_alltsk_tskrrt_wrkgrp_value.getText();
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_strtdate.isCurrentlyVisible()){
				slf4jLogger.error("Work Group: header in Task Report: Total Tasks is not displayed");
				throw new Error("Work Group: header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_strtdate_value.isCurrentlyVisible()){
				slf4jLogger.error("Start Date & Time: value in Task Report: Total Tasks is not displayed");
				throw new Error("Start Date & Time: value in Task Report: Total Tasks is not displayed");
			}
			String StartdateTime=lbl_gearicon_defecttaskreport_alltsk_tskrrt_strtdate_value.getText();
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_enddate.isCurrentlyVisible()){
				slf4jLogger.error("End Date & Time: header in Task Report: Total Tasks is not displayed");
				throw new Error("End Date & Time: header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_enddate_value.isCurrentlyVisible()){
				slf4jLogger.error("End Date & Time: value in Task Report: Total Tasks is not displayed");
				throw new Error("End Date & Time: value in Task Report: Total Tasks is not displayed");
			}
			String EnddateTime=lbl_gearicon_defecttaskreport_alltsk_tskrrt_enddate_value.getText();
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_srno.isCurrentlyVisible()){
				slf4jLogger.error("Sr. No table header in Task Report: Total Tasks is not displayed");
				throw new Error("Sr. No table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_dfttskid.isCurrentlyVisible()){
				slf4jLogger.error("Defect Task ID table header in Task Report: Total Tasks is not displayed");
				throw new Error("Defect Task ID table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_dftsts.isCurrentlyVisible()){
				slf4jLogger.error("Defect Status table header in Task Report: Total Tasks is not displayed");
				throw new Error("Defect Status table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tsknme.isCurrentlyVisible()){
				slf4jLogger.error("Task Name table header in Task Report: Total Tasks is not displayed");
				throw new Error("Task Name table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_cuid.isCurrentlyVisible()){
				slf4jLogger.error("CUID table header in Task Report: Total Tasks is not displayed");
				throw new Error("CUID table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskcrtdate.isCurrentlyVisible()){
				slf4jLogger.error("Task Creation Date and Time table header in Task Report: Total Tasks is not displayed");
				throw new Error("Task Creation Date and Time table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskclaimdate.isCurrentlyVisible()){
				slf4jLogger.error("Task Claimed Date and Time table header in Task Report: Total Tasks is not displayed");
				throw new Error("Task Claimed Date and Time table header in Task Report: Total Tasks is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskcmpdate.isCurrentlyVisible()){
				slf4jLogger.error("Task Completion Date and Time table header in Task Report: Total Tasks is not displayed");
				throw new Error("Task Completion Date and Time table header in Task Report: Total Tasks is not displayed");
			}
			
			jsClick(tab_gearicon_defecttaskreport_ASPDefecttaskreport);
			waitForElement(lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname);
			if(!lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname.getText().equals(Work_group)){
				slf4jLogger.error(lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname.getText()+" Workgroupname in the Defect task report is not matching with All Task value "+Work_group);
				throw new Error(lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname.getText()+" Workgroupname in the Defect task report is not matching with All Task value "+Work_group);
			}
			System.out.println("Start Date: "+StartdateTime+" - End Date: "+EnddateTime);
			if(!lbl_gearicon_defecttaskreport_wrksummy_strtenddate.getText().equals("Start Date: "+StartdateTime+" - End Date: "+EnddateTime)){
				slf4jLogger.error(lbl_gearicon_defecttaskreport_wrksummy_strtenddate.getText()+" Start & End Datetime is not matching with All Task valueL:"+"Start Date: "+StartdateTime+" - End Date: "+EnddateTime);
				throw new Error(lbl_gearicon_defecttaskreport_wrksummy_strtenddate.getText()+" Start & End Datetime is not matching with All Task valueL:"+"Start Date: "+StartdateTime+" - End Date: "+EnddateTime);
			}
			break;			
		case "Defect Task Report should be displayed under the Gear Icon":
			if(!lbl_gearicon_defecttaskreports.isCurrentlyVisible()){
				slf4jLogger.error("Defect Task Report is not displayed under the Gear Icon");	throw new Error("Defect Task Report is not displayed under the Gear Icon");
				}break;
				
		case "under By User ID section we should see table having CUID, First Name, Last Name, Number of Task Types, Completed, Claimed, Total Count and Claimed but Released headers displyed in Defect Task Report":
			waitForElement(lbl_gearicon_defecttaskreport_byuseridsec);
			if(!lbl_gearicon_defecttaskreport_byuseridsec.isCurrentlyVisible()){
				slf4jLogger.error("By User ID header is not displayed");
				throw new Error("By User ID header is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_cuid.isCurrentlyVisible()){
				slf4jLogger.error("CUID in By User ID is not displayed");
				throw new Error("CUID in By User ID is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_frstnme.isCurrentlyVisible()){
				slf4jLogger.error("First Name in By User ID is not displayed");
				throw new Error("First Name in By User ID is not displayed");
			}		
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_lstnme.isCurrentlyVisible()){
				slf4jLogger.error("Last Name in By User ID is not displayed");
				throw new Error("Last Name in By User ID is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_notstyps.isCurrentlyVisible()){
				slf4jLogger.error("Number of Task Types in By User ID is not displayed");
				throw new Error("Number of Task Types in By User ID is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_cmpt.isCurrentlyVisible()){
				slf4jLogger.error("Completed in By User ID is not displayed");
				throw new Error("Completed in By User ID is not displayed");
			}			
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_claimd.isCurrentlyVisible()){
				slf4jLogger.error("Claimed in By User ID is not displayed");
				throw new Error("Claimed in By User ID is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_totlcnt.isCurrentlyVisible()){
				slf4jLogger.error("Total Count in By User ID is not displayed");
				throw new Error("Total Count in By User ID is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_byuseridsec_header_clmrlsd.isCurrentlyVisible()){
				slf4jLogger.error("Claimed but Released in By User ID is not displayed");
				throw new Error("Claimed but Released in By User ID is not displayed");
			}break;
			
		case "Generate Reports button is disabled under By Task type in Defect Task Report":
			waitForElement(lbl_gearicon_defecttaskreport_bytsktype);
			if(!lbl_gearicon_defecttaskreport_bytsktype.isCurrentlyVisible()){
				slf4jLogger.error("By Task Type header is not displayed");
				throw new Error("By Task Type header is not displayed");
			}
			
			if(!btn_gearicon_defecttaskreport_bytsktype_generatereports.isCurrentlyVisible() && btn_gearicon_defecttaskreport_bytsktype_generatereports.isCurrentlyEnabled()){
				slf4jLogger.error("Generate Reports button in By Task Type is not displayed");
				throw new Error("Generate Reports button in By Task Type is not displayed");
			}
			
			if(!chk_gearicon_defecttaskreport_bytsktype_report.isCurrentlyVisible() && chk_gearicon_defecttaskreport_bytsktype_report.isSelected()){
				slf4jLogger.error("Check box is selected in By Task Type");
				throw new Error("Check box is selected in By Task Type");
			}break;
			
		case "click on the Generate reports under Task type by select generate report in Defect Task Report":
			waitForElement(lbl_gearicon_defecttaskreport_bytsktype);jsClick(chk_gearicon_defecttaskreport_bytsktype_report); try {
				Thread.sleep(1000);
				jsClick(btn_gearicon_defecttaskreport_bytsktype_generatereports);waitForElement(tab_gearicon_defecttaskreport_tsknmesrpt);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}break;
			
		case "all the fields displayed for the Task Report: Task Names in Defect Task Report":
			waitForElement(tab_gearicon_defecttaskreport_tsknmesrpt_header);
			
			if(!btn_gearicon_defecttaskreport_excelexport.isCurrentlyVisible()){
				slf4jLogger.error("Excel Export icon in Task Report: Task Names is not displayed");
				throw new Error("Excel Export icon in Task Report: Task Names is not displayed");
			}
			
			if(!btn_gearicon_defecttaskreport_print.isCurrentlyVisible()){
				slf4jLogger.error("Print icon in Task Report: Task Names is not displayed");
				throw new Error("Print icon in Task Report: Task Names is not displayed");
			}
			
			if(!tab_gearicon_defecttaskreport_tsknmesrpt.isCurrentlyVisible()){
				slf4jLogger.error("Task Names Report tab is not displayed");
				throw new Error("Task Names Report tab is not displayed");
			}
			
			if(!tab_gearicon_defecttaskreport_tsknmesrpt_header.isCurrentlyVisible()){
				slf4jLogger.error("Task Report: Task Names header is not displayed");
				throw new Error("Task Report: Task Names header is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_tsknme.isCurrentlyVisible()){
				slf4jLogger.error("Task Name: header in Task Report: Task Names is not displayed");
				throw new Error("Task Name: header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_tsknme_value.isCurrentlyVisible()){
				slf4jLogger.error("Task Name: value in Task Report: Task Names is not displayed");
				throw new Error("Task Name: value in Task Report: Task Names is not displayed");
			}
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_wrkgrp.isCurrentlyVisible()){
				slf4jLogger.error("Work Group: header in Task Report: Task Names is not displayed");
				throw new Error("Work Group: header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_wrkgrp_value.isCurrentlyVisible()){
				slf4jLogger.error("Work Group: value in Task Report: Task Names is not displayed");
				throw new Error("Work Group: value in Task Report: Task Names is not displayed");
			}
			 Work_group=lbl_gearicon_defecttaskreport_tsknmesrpt_wrkgrp_value.getText();
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_strtdate.isCurrentlyVisible()){
				slf4jLogger.error("Work Group: header in Task Report: Task Names is not displayed");
				throw new Error("Work Group: header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_strtdate_value.isCurrentlyVisible()){
				slf4jLogger.error("Start Date & Time: value in Task Report: Task Names is not displayed");
				throw new Error("Start Date & Time: value in Task Report: Task Names is not displayed");
			}
			StartdateTime=lbl_gearicon_defecttaskreport_tsknmesrpt_strtdate_value.getText();			
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_enddate.isCurrentlyVisible()){
				slf4jLogger.error("End Date & Time: header in Task Report: Task Names is not displayed");
				throw new Error("End Date & Time: header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_tsknmesrpt_enddate_value.isCurrentlyVisible()){
				slf4jLogger.error("End Date & Time: value in Task Report: Task Names is not displayed");
				throw new Error("End Date & Time: value in Task Report: Task Names is not displayed");
			}
			EnddateTime=lbl_gearicon_defecttaskreport_tsknmesrpt_enddate_value.getText();
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_srno.isCurrentlyVisible()){
				slf4jLogger.error("Sr. No table header in Task Report: Task Names is not displayed");
				throw new Error("Sr. No table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_dfttskid.isCurrentlyVisible()){
				slf4jLogger.error("Defect Task ID table header in Task Report: Task Names is not displayed");
				throw new Error("Defect Task ID table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_dftsts.isCurrentlyVisible()){
				slf4jLogger.error("Defect Status table header in Task Report: Task Names is not displayed");
				throw new Error("Defect Status table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tsknme.isCurrentlyVisible()){
				slf4jLogger.error("Task Name table header in Task Report: Task Names is not displayed");
				throw new Error("Task Name table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_cuid.isCurrentlyVisible()){
				slf4jLogger.error("CUID table header in Task Report: Task Names is not displayed");
				throw new Error("CUID table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskcrtdate.isCurrentlyVisible()){
				slf4jLogger.error("Task Creation Date and Time table header in Task Report: Task Names is not displayed");
				throw new Error("Task Creation Date and Time table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskclaimdate.isCurrentlyVisible()){
				slf4jLogger.error("Task Claimed Date and Time table header in Task Report: Task Names is not displayed");
				throw new Error("Task Claimed Date and Time table header in Task Report: Task Names is not displayed");
			}
			
			if(!lbl_gearicon_defecttaskreport_alltsk_tskrrt_table_tskcmpdate.isCurrentlyVisible()){
				slf4jLogger.error("Task Completion Date and Time table header in Task Report: Task Names is not displayed");
				throw new Error("Task Completion Date and Time table header in Task Report: Task Names is not displayed");
			}
			
			jsClick(tab_gearicon_defecttaskreport_ASPDefecttaskreport);
			waitForElement(lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname);
			if(!lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname.getText().equals(Work_group)){
				slf4jLogger.error(lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname.getText()+" Workgroupname in the Defect task report is not matching with Task Report: Task Names "+Work_group);
				throw new Error(lbl_gearicon_defecttaskreport_wrksummy_wrkgrpname.getText()+" Workgroupname in the Defect task report is not matching with Task Report: Task Names "+Work_group);
			}
			System.out.println("Start Date: "+StartdateTime+" - End Date: "+EnddateTime);
			if(!lbl_gearicon_defecttaskreport_wrksummy_strtenddate.getText().equals("Start Date: "+StartdateTime+" - End Date: "+EnddateTime)){
				slf4jLogger.error(lbl_gearicon_defecttaskreport_wrksummy_strtenddate.getText()+" Start & End Datetime is not matching with Task Report: Task Names:"+"Start Date: "+StartdateTime+" - End Date: "+EnddateTime);
				throw new Error(lbl_gearicon_defecttaskreport_wrksummy_strtenddate.getText()+" Start & End Datetime is not matching with Task Report: Task Names:"+"Start Date: "+StartdateTime+" - End Date: "+EnddateTime);
			}	break;			
			
		}
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
	
	
	public void create_tag_ManageTag(String name) {
		switch(name){
		case "a new Tag as AUTO Test":
			jsClick(btn_manageTags_addtags);
			waitForElement(btn_manageTags_addtags_createtag);
			
			typeInto(tbx_manageTags_addtags_tagname, "AUTO Test");
			typeInto(tbx_manageTags_addtags_tagdescription, "AUTO Test");
			jsClick(btn_manageTags_addtags_createtag);
			
			waitForElement(tab_Tagsearchresult); break;
			
		case "Duplicate Manage tag": String tagname= getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'contenttablejqxGrid')]//div[1])[1]/div[1]/div")).getText().trim();
				String Taskdesc=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[starts-with(@id,'contenttablejqxGrid')]//div[1])[1]/div[2]/div")).getText().trim();
				jsClick(btn_manageTags_addtags);
				waitForElement(btn_manageTags_addtags_createtag);
				
				typeInto(tbx_manageTags_addtags_tagname, tagname);
				typeInto(tbx_manageTags_addtags_tagdescription, Taskdesc);
				jsClick(btn_manageTags_addtags_createtag);
				waitForElement(lbl_managetag_duplicatetag); break;
				
		case "Test_pop":
			jsClick(btn_manageTags_addtags);
			waitForElement(btn_manageTags_addtags_createtag);
			
			typeInto(tbx_manageTags_addtags_tagname, name);
			typeInto(tbx_manageTags_addtags_tagdescription, name);
			jsClick(btn_manageTags_addtags_createtag);
				
		}
		
	
	}
	
	public void create_tag_ManageTag1(String name) {
		jsClick(btn_manageTags_addtags);
		waitForElement(btn_manageTags_addtags_createtag);
		
		typeInto(tbx_manageTags_addtags_tagname, name);
		typeInto(tbx_manageTags_addtags_tagdescription, name);
		jsClick(btn_manageTags_addtags_createtag);
		
	}
	
	public void waitForAlert(WebDriver driver) 
	{
	   int i=0;
	   while(i++<5)
	   {
	        try
	        {
	            Alert alert = getDriver().switchTo().alert();
	           	String msg=alert.getText();
	           	Thread.sleep(3000);
	           	alert.accept();
	           	slf4jLogger.info("Accepted popup");
				slf4jLogger.info(msg);
	            break;
	        }
	        catch(NoAlertPresentException |InterruptedException e)
	        {
	          try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	          continue;
	        }
	   }
	}
	
	public void DefectTask_OVworkgroup(String wgrp) {
		waitForElement(btn_gearicon_defecttaskreport_generatereport);
		ddl_gearicon_defecttaskreport_ovwrkgrp.selectByVisibleText(wgrp);
	}
	
	public void action_dspworkgroup_wrkgroupactivity(String action) { try {
		switch(action){
		case "Generate Report": jsClick(btn_gearicon_wrkgrpactivity_generatereport); 
									Thread.sleep(2000);
								 break;
								 
		case "Pie-Chart button":jsClick(btn_gearicon_wrkgrpactivity_piecharticon);Thread.sleep(2000);
								break;
		
		}
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void DSPAdmin_actions(String type) {
		switch(type){
		case "Add Workgroup": jsClick(btn_gearicon_DSPAdmin_ManageDSP_AddWorkgroup); waitForElement(lbl_DSPAdmin_ManageDSP_AddWorkgroup_CreateWorkgroup); break;
		case "Add Role": jsClick(btn_gearicon_DSPAdmin_ManageDSP_AddRole); waitForElement(lbl_DSPAdmin_ManageDSP_AddRole_CreateDSPRole); break;
		}
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}
	
	final long TIME_OUT = 60;
	
	public void mouseHover(WebElement ele) {
		try {
			
			WebDriverWait dWait = new WebDriverWait(getDriver(), TIME_OUT);
			ele = dWait.until(ExpectedConditions.visibilityOf(ele));
			Actions action = new Actions(getDriver());			
			action.moveToElement(ele).perform();
			
			/* JavascriptExecutor js = (JavascriptExecutor) getDriver();
	            js.executeScript("arguments[0].mouseOver()", ele); */
	            
			/*Actions builder = new Actions(getDriver());
			builder.moveToElement(ele).perform();*/
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			throw new Error("Failed mouseHover() with Exception: " + e.getMessage());
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
	
	public void browser_zoom_out(int n) throws InterruptedException{
		slf4jLogger.info("Performing Zoom");
		
		Robot r;
		try {
			r = new Robot();		
	
			for(int i=0;i<n;i++){
			
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_SUBTRACT);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_SUBTRACT);
			
				
				}	
			
			r.keyRelease(KeyEvent.VK_CONTROL);	
		Thread.sleep(1000);
		
		
		
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
	
	  
	public List<String> duplicate_audit_focus() throws InterruptedException
		 {
			boolean flag=false;
	Thread.sleep(5000);
		    Select sel = new Select(ddl_auditlog_activityfocus);
		    List<WebElement> we = sel.getOptions();
		    List<String> ls = new ArrayList<String>();
		    for(WebElement a : we)
		    {
		        if(!a.getText().equals("")){
		            ls.add(a.getText());
		           
		        }
		    }
		    
		    for(int i=0;i<ls.size();i++) {
		    	
		    	System.out.println("List contains -->"+ls.get(i));
		    	
		    	}
		    
		    for(int i=0;i<ls.size();i++) {
		    for(int j=i+1;j<ls.size();j++) {
		    	if(ls.get(i).trim().replaceAll("\\s+","").equalsIgnoreCase(ls.get(j).trim().replaceAll("\\s+","")) && i!=j) {
		    		System.out.println("duplicate value exist "+ls.get(i));
		    		 flag=true;
		    		  		
		    				
		    	}
		    	
		    }
		   }
		    
		 if(flag) {
			 slf4jLogger.error("duplicate value exist " );
	 		throw new Error("duplicate value exist ");
			 
		 }else {
			 slf4jLogger.info("Auto Focus contains unique values" );
			 
		 }   
		    return ls;
		    
		    
		 } 

	
	public void browser_zoom_in(int n) throws InterruptedException{
		slf4jLogger.info("Performing Zoom");
		
		Robot r;
		try {
			r = new Robot();		
	
			for(int i=0;i<n;i++){
			
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ADD);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_ADD);
			
				
				}	
			
			r.keyRelease(KeyEvent.VK_CONTROL);	
		Thread.sleep(1000);
		
		
		
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
	
	public void delete_tag(String arg1) {
		Alert alert;
		 String msg;
		
		tbx_manageTags_tagname.type(arg1);
		jsClick(btn_manageTags_searchtags);
		waitForElement(btn_managetag_deletetag1_1);
		//tab_Manage_Tags.click();
		jsClick(btn_managetag_deletetag1_1); alert = getDriver().switchTo().alert(); msg=alert.getText();slf4jLogger.info(msg);alert.accept(); 
		
		
	}
	
	public boolean validate_GETO_value_in_GETO_Details_report(){
	       
        boolean value=ddl_GETO_value.isDisplayed();
  Select GETOvalues=new Select(ddl_GETO_value);
  
  
  //label[text()='GETO Value ' ]/following-sibling::select[@ng-model='selectedGetoValue']

        List<WebElement>  all_GETO_values = GETOvalues.getOptions();
        for(int i=0;i<all_GETO_values.size();i++){
            System.out.println(all_GETO_values.get(i));
        }
        GETOvalues.selectByIndex(2);
        return value;
        
 }
 
 public boolean validate_startdate_GETO_Details_reportpage(){
        
        boolean value=tbx_Start_Date.isCurrentlyVisible();
        tbx_Start_Date.clear();
        tbx_Start_Date.sendKeys("02-Apr-2019");
        return value;
 }
 
public boolean validate_enddate_GETO_Details_reportpage(){
        
        boolean value=tbx_End_Date.isCurrentlyVisible();
        tbx_End_Date.clear();
        tbx_End_Date.sendKeys("4-Apr-2019");
        return value;
 }

public boolean validate_Generate_report_GETO_reportpage(){
 
 boolean value=btn_Generate_reports.isCurrentlyVisible();
 btn_Generate_reports.click();
 
 btn_Reset.click();
return value;   
}

	
	public void read_tag_all() throws SQLException, InterruptedException {
		//Alert alert;
		// boolean flg=false;
		 String arg1;
		 List<String> tag_details_db_attributes = ovdb.tag_search_result_all();
		 jsClick(btn_tagname_dropdown_arrow_search);
		 for(int q=0; q<=tag_details_db_attributes.size()-1; q++){
			  arg1=tag_details_db_attributes.get(q).trim();
			
			 tbx_tagname_dropdown_search.type(arg1);
				Thread.sleep(1000);
				slf4jLogger.info("tag name present in DB = "+arg1 );
				
				if(!getDriver().findElement(By.xpath(".//*[text()='"+arg1+"']")).isDisplayed()) {
					
					slf4jLogger.error(arg1+ "tag name is not displayed GUI " );
			 		throw new Error(arg1+ "tag name is not displayed GUI" );
					
					
					
					//jsClick(getDriver().findElement(By.xpath(".//*[text()='"+arg1+"']")));
					
				}
		
			}
		/*
		tbx_manageTags_tagname.type();
		jsClick(btn_manageTags_searchtags);
		waitForElement(btn_managetag_deletetag1_1);
		//tab_Manage_Tags.click();
		jsClick(btn_managetag_deletetag1_1); alert = getDriver().switchTo().alert(); msg=alert.getText();slf4jLogger.info(msg);alert.accept(); */
		
		
	}
}
