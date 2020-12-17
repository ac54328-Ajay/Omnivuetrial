package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
import net.thucydides.core.annotations.findby.By;

@SuppressWarnings("deprecation")
public class OVSearchCLCContactPage extends OmniVuePage{
	OVActivationPage actvtnpage;
	 ARMDB armdb;
	 OmnivueDB ovdb;
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	//###################CLC Advance search page################
		@FindBy(xpath = ".//*[@id='mainTab']//*[contains(text(),'CLC Contact Advanced Search')]")
		public WebElementFacade tab_CLCcontact_advsearch;	
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//input[@id='firstName']")
		public WebElementFacade tbx_advclccontactsearch_fname;
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//input[@id='lastName']")
		public WebElementFacade tbx_advclccontactsearch_lname;
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//input[@id='email']")
		public WebElementFacade tbx_advclccontactsearch_email;
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//button[@ng-click='clcContactAdvSearch()']")
		public WebElementFacade btn_advclccontactsearch_search;

	//###############	Search Result CLC Contact page ###################//
	
	@FindBy(xpath = ".//*[@id='mainTab']//li[@class='ng-isolate-scope active']//*[contains(text(),'CLC Contact Search Results')]")
	public WebElementFacade tab_CCLcontact_searchresult;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='printGridData()']")
	public WebElementFacade btn_CCLcontact_searchresult_print;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-click='openExportModal();']")
	public WebElementFacade btn_CCLcontact_searchresult_excel;
	
	//###############	CLC Contact page ###################//
	
	@FindBy(xpath = ".//*[@id='mainTab']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading")
	public WebElementFacade tab_CCLcontact_activepage;	
	
	
	@FindBy(xpath = ".//*[@id='mainTab']//*[@class='ng-isolate-scope active']//tab-heading/a")
	public WebElementFacade btn_CCLcontact_activepage_clsicon;	
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//tab-heading[text()='Contact']")
	public WebElementFacade tab_CCLcontact_searchpage_Contactdetails;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//tab-heading[text()='Audit Logs']")
	public WebElementFacade tab_CCLcontact_searchpage_auditlogs;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//tab-heading[text()='Bulk Contact Upload']")
	public WebElementFacade tab_CCLcontact_searchpage_bulkupload;
	
	//--------------	Audit Logs ---------------------------//
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_CCLcontact_searchpage_auditlogs_getlogs;
	
	@FindBy(xpath = ".//*[starts-with(@id,'columntablejqxGrid')]//span[text()='Action Type']")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_header_actiontype;
	
	@FindBy(xpath = ".//*[starts-with(@id,'columntablejqxGrid')]//span[text()='Details']")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_header_details;
	
	@FindBy(xpath = ".//*[starts-with(@id,'columntablejqxGrid')]//span[text()='User Name']")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_header_username;
	
	@FindBy(xpath = ".//*[starts-with(@id,'columntablejqxGrid')]//span[text()='Event Date']")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_header_eventdate;
	
	@FindBy(xpath = ".//*[starts-with(@id,'contenttablejqxGrid')]//div[text()='Update']")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_Updateaction;
	
	@FindBy(xpath = "(.//*[starts-with(@id,'contenttablejqxGrid')]//div[text()='Update']/../following-sibling::div/div[1])[1]")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_updatedetails;
	
	@FindBy(xpath = ".//*[starts-with(@id,'contenttablejqxGrid')]//div[text()='Delete']")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_Deleteaction;
	
	@FindBy(xpath = "(.//*[starts-with(@id,'contenttablejqxGrid')]//div[text()='Delete']/../following-sibling::div)[1]/div")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_deletedetails;			
	
	@FindBy(xpath = "(.//*[text()='Company/Customer Name']/../div//*[contains(@id,'jqxButton')])[1]")
	public WebElementFacade lbl_allXapath_subscriber1;
	
	@FindBy(xpath = "(.//*[text()='Company/Customer Name']/../div//*[contains(@id,'jqxButton')])[2]")
	public WebElementFacade lbl_allXapath_subscriber2;
			
	@FindBy(xpath = "(.//*[starts-with(@id,'contenttablejqxGrid')]//div[text()='AB52523'])[1]")
	public WebElementFacade lbl_CCLcontact_searchpage_auditlogs_userids;
	
	//--------------		CLC Contact page ---------------------//
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_CCLcontact_searchpage_edit;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Delete']")
	public WebElementFacade btn_CCLcontact_searchpage_delete;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']/div[1]")
	public WebElementFacade lbl_CCLcontact_searchpage_Generalattributes;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='First Name']/following-sibling::label")
	public WebElementFacade lbl_CCLcontact_searchpage_firstname;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[contains(text(),'Last Name')]/following-sibling::label")
	public WebElementFacade lbl_CCLcontact_searchpage_lastname;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='Email']/following-sibling::label")
	public WebElementFacade lbl_CCLcontact_searchpage_email;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='Telephone Number']/following-sibling::label")
	public WebElementFacade lbl_CCLcontact_searchpage_telephonenumber;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='Company/Customer Name']/following-sibling::div/div")
	public WebElementFacade lbl_CCLcontact_searchpage_customername;
	
	//----------------   Related Tab -----------------------//
	
	@FindBy(xpath = ".//*[@id='right-content']//li[@ng-repeat='tab in circuitTabs']/a[text()='Circuit Details']")
	public WebElementFacade tab_CCLcontact_searchpage_relatedtab_circuitdetails;
	
	
	@FindBy(xpath = ".//*[@id='right-content']//li[@ng-repeat='tab in circuitTabs']/../following-sibling::div//button[@ng-click='addCircuitToTirkContact();']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit;
	
	//-----------  CLC Add circuit validations  --------------//
	
	@FindBy(xpath = ".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='lookUpCircuit()']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_lookup;
	
	@FindBy(xpath = ".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//label[text()='Region']/../select")
	public WebElementFacade ddl_CCLcontact_searchpage_relatedtab_circuit_addcircuit_region;
	
	@FindBy(xpath = ".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//label[text()='CAC']/..//input[@ng-model='lookUp.cac']")
	public WebElementFacade tbx_CCLcontact_searchpage_relatedtab_circuit_addcircuit_cac;
	
	@FindBy(xpath = ".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@value='CAC']")
	public WebElementFacade rdn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_cac;
	
	@FindBy(xpath = ".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@value='Circuit']")
	public WebElementFacade rdn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_circuit;
	
	@FindBy(xpath = ".//*[@id='right-content']//li[@ng-repeat='tab in circuitTabs']/../following-sibling::div//button[@ng-click='deleteAllCircuits();']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_deleteallcircuit;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlertForCircuitLookUp']")
	public WebElementFacade lbl_CCLcontact_searchpage_relatedtab_circuit_alertmsg;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlertForCircuitLookUp']/button")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_alertmsg_closeicon;
	
	@FindBy(xpath = ".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Close']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_closewindow;
	
	//----------------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@ng-repeat='tab in circuitTabs']/../following-sibling::div//*[@ng-click='gridSettings.viewTaskDetail(0)']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_view;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@ng-repeat='tab in circuitTabs']/../following-sibling::div//i[@ng-click='printGridData()']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_print;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@ng-repeat='tab in circuitTabs']/../following-sibling::div//i[@ng-click='exportToExcel()']")
	public WebElementFacade btn_CCLcontact_searchpage_relatedtab_circuit_exportexcel;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@ng-repeat='tab in circuitTabs']/../following-sibling::div//*[starts-with(@id,'columntablejqxGrid')]//span")
	public List<WebElementFacade> lbl_allXapath;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_alertmsg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//div[@ng-show='showAlert']/button")
	public WebElementFacade btn_alertmsg_closicon;
	
	// -----------------------------	Edit CLC Contact Page  -----------------------------//
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save']")
	public WebElementFacade btn_CCLcontact_editpage_save;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Cancel']")
	public WebElementFacade btn_CCLcontact_editpage_cancel;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='firstName']")
	public WebElementFacade tbx_CCLcontact_editpage_firstname;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='lastName']")
	public WebElementFacade tbx_CCLcontact_editpage_lastname;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='email']")
	public WebElementFacade tbx_CCLcontact_editpage_email;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='editContact.area']")
	public WebElementFacade tbx_CCLcontact_editpage_telephon1;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='editContact.prefix']")
	public WebElementFacade tbx_CCLcontact_editpage_telephon2;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='editContact.lineNmbr']")
	public WebElementFacade tbx_CCLcontact_editpage_telephon3;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Company/Customer Name')]/..//input[@ng-model='selectedCustomerFromSolr.ID']")
	public WebElementFacade tbx_CCLcontact_editpage_customername;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'jqxButton')]/button/..")
	public WebElementFacade lbl_CCLcontact_editpage_subscriber;
	
	@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'jqxButton')]/button")
	public WebElementFacade btn_CCLcontact_editpage_removesubscriber;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//p[@class='warning ng-binding']")
	public WebElementFacade lbl_CCLcontact_editpage_fillmandatoryfield4Customername;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//span[contains(@ng-click,'openSubscriberLookUp();')]/i")
	public WebElementFacade btn_CCLcontact_editpage_subcriberlookup;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//button[@value='LookUp']")
	public WebElementFacade btn_CCLcontact_editpage_subcriberlookup_icon;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//button[@value='Close']")
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//button[@ng-click='closeModal()']")
	public WebElementFacade btn_CCLcontact_editpage_subcriberlookup_cancel;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//input[@ng-model='invSubscriber.subscriberName']")
	public WebElementFacade tbx_CCLcontact_editpage_subcriberlookup_subscribername;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//a[@ng-click='lookupData(subscriberLookupData);'])[1]")
			public WebElementFacade lbl_CCLcontact_editpage_subcriberlookup_subscribername;
	
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='clcContactDetailsLeftCtrl']//div[@ng-show='showAlertForSubscriber']")
			public WebElementFacade lbl_CCLcontact_editpage_subcriberlookup_alertmsg;
			
	
	//############################################################	Bulk Upload Tab  ####################################################################//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Bulk Contact Upload']")
	public WebElementFacade lbl_CCLcontact_searchpage_bulkuploadtab_tab;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//a[text()='Download']")
	public WebElementFacade lnk_CCLcontact_searchpage_bulkuploadtab_downloadtemplate;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Choose file']/..")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_choosefile;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-change='checkfieldValues();']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_grpname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='submitFile();']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_submit;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkContactCtrl']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_CCLcontact_searchpage_bulkuploadtab_alertmsg;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkContactCtrl']//div[@ng-show='showAlert']/button")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_alertmsg_clsicon;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@ng-repeat='tab in circuitTabs']/../following-sibling::div//*[starts-with(@id,'columntablejqxGrid')]//span")
	public List<WebElementFacade> lbl_allXapath_bulkuploadtable;
			
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='deleteSelectedContacts();']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_deleteselected;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[@ng-click='refreshCLCContactList();']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_refresh;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[@ng-click='exportToExcel();']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_excelexport;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[@ng-click='printGridData()']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_printdata;
	
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@title='Edit CLC Contact'])[1]")
			public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_editicon;

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
		
		@FindBy(xpath="//button[@ng-click='searchInventory();' and @ng-hide='isForWidgetCreate']")
		public WebElementFacade btn_clccontact_search;
		
		@FindBy(xpath="//div[@ng-controller='bulkCLCContactResultCtrl']//div[1][@class='col-md-4']//td")
		public List<WebElement> lbl_step1_clccontact_values;
		
		@FindBy(xpath="//div[@ng-controller='bulkCLCContactResultCtrl']//div[1][@class='col-md-4']//tr[2]//td")
		public WebElementFacade lbl_step1_clccontact_Groupname;
		
		@FindBy(xpath="//div[@ng-controller='bulkCLCContactResultCtrl']//div[1][@class='col-md-4']//tr[3]//td")
		public WebElementFacade lbl_step1_clccontact_Groupid;
		
		@FindBy(xpath="//div[@ng-controller='bulkCLCContactResultCtrl']//div[1][@class='col-md-4']//tr[4]//td")
		public WebElementFacade lbl_step1_clccontact_CUID;
		
		@FindBy(xpath="//div[@ng-controller='bulkCLCContactResultCtrl']//div[1][@class='col-md-4']//tr[5]//td")
		public WebElementFacade lbl_step1_clccontact_Total;
		
		@FindBy(xpath="//label[contains(text(),'First Name')]/../label[2]")
		public WebElementFacade tbx_clccontact_searchfield_FirstName_value;
		
		@FindBy(xpath="//button[@ng-click='addCircuitToTirkContact();']")
		public WebElementFacade btn_clccontact_addcircuit;
		
		@FindBy(xpath="//input[@ng-model='lookUp.filterBy' and @value='CAC']")
		public WebElementFacade rbn_clccontact_CAC;
		
		@FindBy(xpath="//input[@ng-model='lookUp.filterBy' and @value='Circuit']")
		public WebElementFacade rbn_clccontact_Circuit;
		
		@FindBy(xpath="//input[@ng-model='lookUp.cac']")
		public WebElementFacade tbx_clccontact_CAC;
		
		@FindBy(xpath="//input[@ng-model='lookUp.circuitName']")
		public WebElementFacade tbx_clccontact_Circuitname;
		
		@FindBy(xpath="//button[@ng-click='lookUpCircuit()']")
		public WebElementFacade btn_lookup_Circuitlookup;
		
		@FindBy(xpath="(//label[text()='Customer Name'])[2]")
		public WebElementFacade lbl_customername_addcircuitlookup;
		
		@FindBy(xpath="(//label[text()='Customer Name'])[2]/../select")
		public WebElementFacade ddl_customername_addcircuitlookup;
		
		@FindBy(xpath="//button[@ng-click='associateCircuitsToContact();']")
		public WebElementFacade btn_clccontact_assoaciatecircuit;
		
		@FindBy(xpath="//div[@id='contenttablecircuitsGrid']//span/..")
		public WebElementFacade ckb_Circuitgird_addcircuit;
		
		@FindBy(xpath="//i[@ng-click='refreshCircuitList();']")
		public WebElementFacade btn_refresh_circuitlist;
		
		@FindBy(xpath="//a[@ng-click='circuitLookupgridSettings.viewTaskDetail(0)']")
		public WebElementFacade lbl_circuithyperlink;
		
		@FindBy(xpath="//tab-heading[text()='Tirks Circuit']")
		public WebElementFacade lbl_tirkscircuit_subtab;
		
		@FindBy(xpath="//div[@role='columnheader']//span[text() = 'Customer']")
		public WebElementFacade lbl_customer_columnheader;
		
		@FindBy(xpath="//div[@role='columnheader']//span[text()='CONTACTID']")
		public WebElementFacade lbl_CONTACTID_columnheader;
		
		@FindBy(xpath="//div[@role='columnheader']//span[text()='CAC_RETURNED']")
		public WebElementFacade lbl_columnheader_CAC_RETURNED;
		
		@FindBy(xpath="//div[@role='columnheader']//span[text()='CKT_FORMAT_RETURNED']")
		public WebElementFacade lbl_CKT_FORMAT_RETURNED_columnheader;
		
		@FindBy(xpath="//div[@role='columnheader']//span[text()='CKT_RETURNED']")
		public WebElementFacade lbl_CKT_RETURNED_columnheader;
		
		@FindBy(xpath="//div[@id='row0jqxgridCLCBulkContact']//input[@title='View CLC Contact']")
		public WebElementFacade btn_view_1st_clccontact;
	
		@FindBy(xpath="//div[@ng-controller='invGridListViewCtrl']//input[@ng-click='gridSettings.viewTaskDetail(0)']")
		public WebElementFacade btn_clc_view_icon; 
	//-----------		Edit Contact details Window fields ------------------------//
	
	@FindBy(xpath = ".//h4[text()='Contact Details']")
	public WebElementFacade lbl_CCLcontact_searchpage_bulkuploadtab_edit_header;
	
	
	@FindBy(xpath = ".//label[text()='Step 1:']/following-sibling::label[text()='Enter Contact Details']")
	public WebElementFacade lbl_CCLcontact_searchpage_bulkuploadtab_edit_step1header;
	
	
	@FindBy(xpath = ".//label[text()='Step 2:']/following-sibling::label[text()='Enter Circuit Details']")
	public WebElementFacade lbl_CCLcontact_searchpage_bulkuploadtab_edit_step2header;
	
	
	// Step1 side
	
	@FindBy(xpath = ".//label[contains(text(),'First Name')]/following-sibling::input[@id='fName']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_firstname;
	
	@FindBy(xpath = ".//label[contains(text(),'Last Name')]/following-sibling::input[@id='lName']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_lstnme;
	
	@FindBy(xpath = ".//label[contains(text(),'Email')]/following-sibling::input[@id='emailId']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_email;
	
	@FindBy(xpath = ".//label[contains(text(),'Telephone Number')]/following-sibling::input[@ng-model='editContact.area']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_teleph1;
	
	@FindBy(xpath = ".//label[contains(text(),'Telephone Number')]/following-sibling::input[@ng-model='editContact.prefix']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_teleph2;
	
	@FindBy(xpath = ".//label[contains(text(),'Telephone Number')]/following-sibling::input[@ng-model='editContact.lineNmbr']")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_teleph3;
	
	@FindBy(xpath = "(.//label[contains(text(),'Company/Customer Name')]/following-sibling::typehead-subscriber//input[@ng-model='selectedCustomerFromSolr.ID'])[2]")
	public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step1_customername;
	
	@FindBy(xpath = "(.//label[contains(text(),'Company/Customer Name')]/following-sibling::typehead-subscriber//span[contains(@ng-click,'openSubscriberLookUp();')])[2]")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_edit_step1_customername_lookup;
	
	@FindBy(xpath = ".//button[@ng-click='resetContactDetails();']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_edit_resetcontactdetails;
	
	// Step 2 side
	
	@FindBy(xpath = ".//label[text()='Region']/following-sibling::select[@ng-model='editContact.region']")
	public WebElementFacade ddl_CCLcontact_searchpage_bulkuploadtab_edit_step2_region;
	
	@FindBy(xpath = ".//label[text()='CAC']/preceding-sibling::input[@ng-model='editContact.filterBy']")
	public WebElementFacade rbn_CCLcontact_searchpage_bulkuploadtab_edit_step2_cac;
	
	@FindBy(xpath = "(.//label[text()='Circuit']/preceding-sibling::input[@ng-model='editContact.filterBy'])[2]")
			public WebElementFacade rbn_CCLcontact_searchpage_bulkuploadtab_edit_step2_circuit;
			
	@FindBy(xpath = ".//label[text()='Circuit']/following-sibling::select[@id='shelfType']")
			public WebElementFacade ddl_CCLcontact_searchpage_bulkuploadtab_edit_step2_circuittype;
			
	@FindBy(xpath = ".//label[text()='Circuit']/following-sibling::select[@id='shelfType']/../following-sibling::div//input")
			public WebElementFacade tbx_CCLcontact_searchpage_bulkuploadtab_edit_step2_circuit;
	
	
	@FindBy(xpath = ".//*[@class='modal-content']//button[@ng-click='cancelEditAction();' and @value='Close']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_cancel;
	
	
	
	@FindBy(xpath = ".//button[@ng-click='updateCLCContact();']")
	public WebElementFacade btn_CCLcontact_searchpage_bulkuploadtab_edit_save;
	
	
	//###########################################################################################################################################################################//
	
	//###########################################################	Related tab  Actions ################################################################//
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
		public WebElementFacade btn_RT_view;
	    
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')])[1]")	
				public WebElementFacade lbl_RT_alertmsg;
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]/button)[1]")	
		public WebElementFacade btn_RT_alertmsg_clsicon;
		
		//###################################################Edit Bulk Upload Contact#######################
		
		@FindBy(xpath="//button[@ng-click='cancelEditAction();']//i")	
		public WebElementFacade btn_edit_bulk_contact_cancel;
		@FindBy(xpath="//input[@id='fName']")	
		public WebElementFacade lbl_edit_bulk_contact_fname;
		@FindBy(xpath="//input[@id='lName']")	
		public WebElementFacade lbl_edit_bulk_contact_lname;
		@FindBy(xpath="//input[@id='emailId']")	
		public WebElementFacade lbl_edit_bulk_contact_email;
		//label[contains(text(),"Enter Contact Details")]
		@FindBy(xpath="//label[contains(text(),'Enter Contact Details')]")	
		public WebElementFacade lbl_edit_bulk_contact_contactdetails;
		
		@FindBy(xpath="//label[contains(text(),'Enter Circuit Details')]")	
		public WebElementFacade lbl_edit_bulk_contact_circuitdetails;
		
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("null")
	public void verify_validation(String validation) throws AWTException{
		try {
		String Message;
		String Msg[]=null;
		List<WebElementFacade> clccontact_circuitheaders;ArrayList<String> clccontact_circuitheaders_attributelist;ArrayList<String> List2compare_clccontact_circuitheadersattributelist;
		
		switch(validation){
		case "Search CLC contact with all criteria filled":
			Thread.sleep(2000);
			waitForElement(btn_CCLcontact_searchpage_edit);		
			actvtnpage.click_actscreentab("Search");
			tbx_clccontact_firstname.type(lbl_CCLcontact_searchpage_firstname.getText().trim());
		    tbx_clccontact_lastname.type(lbl_CCLcontact_searchpage_lastname.getText().trim());
			tbx_clccontact_email.type(lbl_CCLcontact_searchpage_email.getText().trim());
			tbx_clccontact_telephone.type(lbl_CCLcontact_searchpage_telephonenumber.getText().trim());
			tbx_clccontact_customername.type(lbl_CCLcontact_searchpage_customername.getText().trim());
			jsClick(actvtnpage.tab_closeall_tab);
	        break;
	
		case "Contact details should contains two sections Step1:Enter Contact Details and Step 2:Enter Circuit Details in CLC contact page": 
			if(!lbl_edit_bulk_contact_contactdetails.isDisplayed()){
				throw new Error("Contact Details is not displayed in edit contact pop up ");
			} 
			if(!lbl_edit_bulk_contact_circuitdetails.isDisplayed()){
				throw new Error("Circuit Details is not displayed in edit contact pop up ");
			} 
			btn_edit_bulk_contact_cancel.click();
			Thread.sleep(2000);
			
			
			break;
		case "Edit-icon": jsClick(btn_CCLcontact_searchpage_bulkuploadtab_editicon);waitForElement(btn_CCLcontact_searchpage_bulkuploadtab_edit_save);
			break;
		case "Job should get created message should be displayed along with the table displayed in CLC contact page":waitForElement(lbl_CCLcontact_searchpage_bulkuploadtab_alertmsg);
																Message = lbl_CCLcontact_searchpage_bulkuploadtab_alertmsg.getText();
																
																Message = Message.trim(); 
																if(!Message.contains("Job has been created for Group Name=")){
																	throw new Error("Wrong message is displayed as "+Message);
																} jsClick(btn_CCLcontact_searchpage_bulkuploadtab_alertmsg_clsicon);
																
																clccontact_circuitheaders = lbl_allXapath_bulkuploadtable;
																clccontact_circuitheaders_attributelist=new ArrayList<String>();
																for(int j=0;j<clccontact_circuitheaders.size();j++){
																	clccontact_circuitheaders_attributelist.add(j, clccontact_circuitheaders.get(j).getText().trim());					
																	}
																List2compare_clccontact_circuitheadersattributelist=new ArrayList<String>();
																List2compare_clccontact_circuitheadersattributelist.add(0, "View");
																List2compare_clccontact_circuitheadersattributelist.add(1, "Edit");
																List2compare_clccontact_circuitheadersattributelist.add(2, "CONTACTID");
																List2compare_clccontact_circuitheadersattributelist.add(3, "Status");
																List2compare_clccontact_circuitheadersattributelist.add(4, "First Name");
																List2compare_clccontact_circuitheadersattributelist.add(5, "Last Name");
																List2compare_clccontact_circuitheadersattributelist.add(6, "Email");
																for(int i=0;i<clccontact_circuitheaders_attributelist.size();i++){
																	if(!clccontact_circuitheaders_attributelist.get(i).equals(List2compare_clccontact_circuitheadersattributelist.get(i))){
																		slf4jLogger.info("clccontact_circuitheaders_attributelist="+clccontact_circuitheaders_attributelist.get(i));
																		slf4jLogger.info("List2compare_clccontact_circuitheadersattributelist="+List2compare_clccontact_circuitheadersattributelist.get(i)+" Not matching");
																		throw new Error("Fields are not matching check");
																	}
																}
																if(!btn_CCLcontact_searchpage_bulkuploadtab_deleteselected.isCurrentlyVisible() && !btn_CCLcontact_searchpage_bulkuploadtab_deleteselected.isCurrentlyEnabled()){
																	slf4jLogger.error("Delete selected button is not displayed in CLC Bulk upload page");
																	throw new Error("Delete selected button is not displayed in CLC Bulk upload page");
																}
																
																if(!btn_CCLcontact_searchpage_bulkuploadtab_refresh.isCurrentlyVisible() && !btn_CCLcontact_searchpage_bulkuploadtab_refresh.isCurrentlyEnabled()){
																	slf4jLogger.error("Refresh button is not displayed in CLC Bulk upload page");
																	throw new Error("Refresh button is not displayed in CLC Bulk upload page");
																}
																
																if(!btn_CCLcontact_searchpage_bulkuploadtab_excelexport.isCurrentlyVisible() && !btn_CCLcontact_searchpage_bulkuploadtab_excelexport.isCurrentlyEnabled()){
																	slf4jLogger.error("Excel export button is not displayed in CLC Bulk upload page");
																	throw new Error("Excel export button is not displayed in CLC Bulk upload page");
																}
																
																if(!btn_CCLcontact_searchpage_bulkuploadtab_printdata.isCurrentlyVisible() && !btn_CCLcontact_searchpage_bulkuploadtab_printdata.isCurrentlyEnabled()){
																	slf4jLogger.error("Printer button is not displayed in CLC Bulk upload page");
																	throw new Error("Printer button is not displayed in CLC Bulk upload page");
																}
																
																
																	break;
		case "Submit":		jsClick(btn_CCLcontact_searchpage_bulkuploadtab_submit); getDriver().switchTo().alert().accept();waitForElement(lbl_CCLcontact_searchpage_bulkuploadtab_alertmsg);
																				break;
		case "upload the valid spreadsheet in the Bulk upload CLC Contact Page": 		try {		
			WebDriverWait wait = new WebDriverWait(getDriver(), 100);
			Thread.sleep(15000);
			
			tbx_CCLcontact_searchpage_bulkuploadtab_grpname.type("Automation Test");
			
			waitForElement(btn_CCLcontact_searchpage_bulkuploadtab_choosefile);
			
			if(!btn_CCLcontact_searchpage_bulkuploadtab_choosefile.isEnabled()) {
				throw new Error("Choose file button is not displayed in CLC Bulk upload page");
				
			}
			boolean f1=checkElementisClickable(btn_CCLcontact_searchpage_bulkuploadtab_choosefile);
			System.out.println(f1);
			
			//	jsClick(btn_CCLcontact_searchpage_bulkuploadtab_choosefile);
				btn_CCLcontact_searchpage_bulkuploadtab_choosefile.click();
				//jsClick(btn_CCLcontact_searchpage_bulkuploadtab_choosefile);
				//btn_CCLcontact_searchpage_bulkuploadtab_choosefile.submit();
			
			Thread.sleep(15000);		
			//Thread.sleep(2000);
			// Set the file in clipboard 
			StringSelection ss=new StringSelection(Page.envData.getFieldValue("BulkCLCContact"));
			//String s = new String(Page.envData.getFieldValue("BulkCLCContact"));


			//System.out.println(s);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			// Perform  native keystrokes for CTRL+V and Enter key
			
		
			Robot robot;
			robot = new Robot();
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			
			robot.delay(2000);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			//robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			
			//robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			Thread.sleep(15000);												
			
			tbx_CCLcontact_searchpage_bulkuploadtab_grpname.type("Automation Test");
			
			wait.until(ExpectedConditions.visibilityOf(btn_CCLcontact_searchpage_bulkuploadtab_submit));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
		
		case "CLC Contact Search Results tab is displayed along the search results": 
												if(!tab_CCLcontact_searchresult.isCurrentlyVisible()){
													throw new Error("CLC Contact result page is not displayed");
												}	break;
												
		case "CLC Contact Page displayed": if(!tab_CCLcontact_searchpage_Contactdetails.isCurrentlyVisible()){
												throw new Error("CLC Contact details tab is not displayed");
											}
											if(!tab_CCLcontact_searchpage_auditlogs.isCurrentlyVisible()){
												throw new Error("CLC Audit logs tab is not displayed");
											}
											if(!btn_CCLcontact_searchpage_edit.isCurrentlyVisible() && !btn_CCLcontact_searchpage_edit.isCurrentlyEnabled()){
												throw new Error("CLC Edit button is not displayed");
											}
											
											if(!btn_CCLcontact_searchpage_delete.isCurrentlyVisible() && !btn_CCLcontact_searchpage_delete.isCurrentlyEnabled()){
												throw new Error("CLC Delete button is not displayed");
											}
											if(!lbl_CCLcontact_searchpage_Generalattributes.isCurrentlyVisible()){
												throw new Error("CLC General Attributes is not displayed");
											}
											
											if(!getDriver().findElement(By.xpath(".//*[@id='mainTab']//li[@class='ng-isolate-scope active']//tab-heading[contains(text(),'"+lbl_CCLcontact_searchpage_firstname.getText().trim()+" "+lbl_CCLcontact_searchpage_lastname.getText().trim()+"')]")).isDisplayed()){
												throw new Error("CLC Contact Name is not matching with tag name displayed");
											}										
											break;
											
		case "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page":
			 if(!tab_CCLcontact_searchpage_relatedtab_circuitdetails.isCurrentlyVisible()){
					throw new Error("Circuit details tab is not displayed in Circuit related tab");
				}
			 if(!btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit.isCurrentlyVisible()){
					throw new Error("Add circuit button in Circuit related tab is not displayed in CLC contact page");
				}
			 if(!btn_CCLcontact_searchpage_relatedtab_circuit_deleteallcircuit.isCurrentlyVisible()){
					throw new Error("Delete all circuit button in Circuit related tab is not displayed in CLC contact page");
				} break;
				
		case "Circuit table should contain View, Circuit Name, CAC, Region & Remove Headers displayed in Circuit Related tab for CLC contact page":
			if(btn_CCLcontact_searchpage_relatedtab_circuit_view.isCurrentlyVisible()){
				if(!btn_CCLcontact_searchpage_relatedtab_circuit_print.isCurrentlyVisible() && !btn_CCLcontact_searchpage_relatedtab_circuit_print.isCurrentlyEnabled()){
					throw new Error("Print button is not displayed in Circuit related Tab");
				}
				if(!btn_CCLcontact_searchpage_relatedtab_circuit_exportexcel.isCurrentlyVisible() && !btn_CCLcontact_searchpage_relatedtab_circuit_exportexcel.isCurrentlyEnabled()){
					throw new Error("Export to Excel button is not displayed in Circuit related Tab");
				}
				
				
				
			clccontact_circuitheaders = lbl_allXapath;
			clccontact_circuitheaders_attributelist=new ArrayList<String>();
			for(int j=0;j<clccontact_circuitheaders.size();j++){
				clccontact_circuitheaders_attributelist.add(j, clccontact_circuitheaders.get(j).getText().trim());					
				}
			List2compare_clccontact_circuitheadersattributelist=new ArrayList<String>();
			List2compare_clccontact_circuitheadersattributelist.add(0, "View");
			List2compare_clccontact_circuitheadersattributelist.add(1, "Circuit Name");
			List2compare_clccontact_circuitheadersattributelist.add(2, "CAC");
			List2compare_clccontact_circuitheadersattributelist.add(3, "Region");
			List2compare_clccontact_circuitheadersattributelist.add(4, "Remove");
			for(int i=0;i<clccontact_circuitheaders_attributelist.size();i++){
				if(!clccontact_circuitheaders_attributelist.get(i).equals(List2compare_clccontact_circuitheadersattributelist.get(i))){
					slf4jLogger.info("clccontact_circuitheaders_attributelist="+clccontact_circuitheaders_attributelist.get(i));
					slf4jLogger.info("List2compare_clccontact_circuitheadersattributelist="+List2compare_clccontact_circuitheadersattributelist.get(i)+" Not matching");
					throw new Error("Fields are not matching check");
				}
			}}break;
			
		case "Delete":jsClick(tab_CCLcontact_searchpage_Contactdetails);
			jsClick(btn_CCLcontact_searchpage_delete);getDriver().switchTo().alert().accept();waitForElement(lbl_alertmsg);
						verify_validation("Contact Successfully deleted.");break;
						
		case "Edit": jsClick(btn_CCLcontact_searchpage_edit); waitForElement(btn_CCLcontact_editpage_save);break;
			 
		case "Contact Successfully deleted.": Message = lbl_alertmsg.getText();
												Message = Message.toString().substring(1);
												
												Message = Message.trim(); 
												if(!Message.contains("Contact Successfully deleted.")){
													throw new Error("Wrong message is displayed as "+Message);
												} 
												break;	
												
		case "Print button is displayed CLC Contact Search Results":if(!btn_CCLcontact_searchresult_print.isCurrentlyVisible() && !btn_CCLcontact_searchresult_print.isCurrentlyEnabled()){
																			throw new Error("Print Button is not displayed in the CLC Contact Search page");
																		}break;
																		
		case "Excel export button is displayed CLC Contact Search Results": if(!btn_CCLcontact_searchresult_excel.isCurrentlyVisible() && !btn_CCLcontact_searchresult_excel.isCurrentlyEnabled()){
																			throw new Error("Excel Export Button is not displayed in the CLC Contact Search page");
																		}break;
																		
		case "modify the all the fields CLC Contact view screen": tbx_CCLcontact_editpage_firstname.type("Modify Auto");
									tbx_CCLcontact_editpage_lastname.type("OV Modify");tbx_CCLcontact_editpage_email.type("OVModify@Centurylink.com"); tbx_CCLcontact_editpage_telephon1.type("987");tbx_CCLcontact_editpage_telephon2.type("654");tbx_CCLcontact_editpage_telephon3.type("3210");break;
		case "Save":jsClick(btn_CCLcontact_editpage_save);waitForElement(btn_CCLcontact_searchpage_edit);break;
		case "CLC contact is saved successfully. message is displayed in the CLC Contact page":Message = lbl_alertmsg.getText();
															Message = Message.toString().substring(1);
															
															Message = Message.trim(); 
															if(!Message.contains("CLC contact is saved successfully.")){
																throw new Error("Wrong message is displayed as "+Message);
															} jsClick(btn_alertmsg_closicon);break;	
															
		case "Modified values are reflecting in CLC Contact page":if(!lbl_CCLcontact_searchpage_firstname.getText().trim().equals("Modify Auto")){
																				throw new Error("First name is not matching in the CLC contact page");
																			}
																	if(!lbl_CCLcontact_searchpage_lastname.getText().trim().equals("OV Modify")){
																		throw new Error("Last name is not matching in the CLC contact page");
																	}
																	if(!lbl_CCLcontact_searchpage_email.getText().trim().equals("OVModify@Centurylink.com")){
																		throw new Error("Email ID is not matching in the CLC contact page");
																	}
																	if(!lbl_CCLcontact_searchpage_telephonenumber.getText().trim().equals("9876543210")){
																		throw new Error("Telephone number is not matching in the CLC contact page");
																	}break;
																	
		case "Audit log captured the Update log on the new changes in the CLC Contact page":
			jsClick(tab_CCLcontact_searchpage_auditlogs);waitForElement(btn_CCLcontact_searchpage_auditlogs_getlogs);
				jsClick(btn_CCLcontact_searchpage_auditlogs_getlogs);waitForElement(lbl_CCLcontact_searchpage_auditlogs_header_actiontype);
				if(!lbl_CCLcontact_searchpage_auditlogs_header_actiontype.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_header_details.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_header_username.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_header_eventdate.isCurrentlyVisible()){
					throw new Error("Audit log Headers are not matching");
				}
				if(!lbl_CCLcontact_searchpage_auditlogs_Updateaction.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_updatedetails.getText().trim().contains("CLC Contact with Contact Name - Automation OVTest is edited. The changes are:  {lastName:OVTest-->OV Modify} {emailId:OVAutomation@centurylink.com-->OVModify@Centurylink.com} {telephoneNumber:4029989052-->9876543210} {firstName:Automation-->Modify Auto}") && !lbl_CCLcontact_searchpage_auditlogs_userids.isCurrentlyVisible()){
					throw new Error("Update log has not been registered");
				}
				jsClick(tab_CCLcontact_searchpage_Contactdetails);waitForElement(btn_CCLcontact_searchpage_edit); break; 
			
		case "Audit log captured Delete action in the CLC Contact page": jsClick(tab_CCLcontact_searchpage_auditlogs);waitForElement(btn_CCLcontact_searchpage_auditlogs_getlogs);
		jsClick(btn_CCLcontact_searchpage_auditlogs_getlogs);waitForElement(lbl_CCLcontact_searchpage_auditlogs_header_actiontype);
		if(!lbl_CCLcontact_searchpage_auditlogs_header_actiontype.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_header_details.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_header_username.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_header_eventdate.isCurrentlyVisible()){
			throw new Error("Audit log Headers are not matching");
		}
		if(!lbl_CCLcontact_searchpage_auditlogs_Deleteaction.isCurrentlyVisible() && !lbl_CCLcontact_searchpage_auditlogs_deletedetails.getText().trim().contains("CLCContact with Contact Name - "+tab_CCLcontact_activepage.getText().trim()+" is Deleted") && !lbl_CCLcontact_searchpage_auditlogs_userids.isCurrentlyVisible()){
			throw new Error("Delete log has not been registered");
		}		 break;
		
		case "Multiple Subscribers displayed in the CLC Contact page":	
			
								/*List<WebElementFacade> subscriberlist = lbl_allXapath_subscriber;
								ArrayList<String> subscribervalues=new ArrayList<String>();
								for(int j=0;j<subscriberlist.size();j++){			
									subscribervalues.add(j, subscriberlist.get(j).getText());
									}	
								System.out.println(subscribervalues);
								if(!(subscribervalues.size()>1)){*/
							waitForElement(lbl_allXapath_subscriber1);
							if(!lbl_allXapath_subscriber1.isCurrentlyVisible() && !lbl_allXapath_subscriber2.isCurrentlyVisible()){
									throw new Error("Multiple Subscriber is not displayed");
								}break;
		case "Add Circuit":if(!btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit.isCurrentlyVisible()){
										throw new Error("Add circuit button in Circuit related tab is not displayed in CLC contact page");
									}
								jsClick(btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit); waitForElement(btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_lookup);
							break;				
		case "verify the Cicrcuit lookup window in CLC Contact page":
							if(!btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_lookup.isCurrentlyVisible()){
								throw new Error("Add circuit window Look up button in Circuit related tab is not displayed in CLC contact page");
							}
							if(!ddl_CCLcontact_searchpage_relatedtab_circuit_addcircuit_region.isCurrentlyVisible()){
								throw new Error("Add circuit window Region drop down in Circuit related tab is not displayed in CLC contact page");
							}
							
							if(!tbx_CCLcontact_searchpage_relatedtab_circuit_addcircuit_cac.isCurrentlyVisible()){
								throw new Error("Add circuit window CAC field in Circuit related tab is not displayed in CLC contact page");
							}			
							
							if(!rdn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_cac.isCurrentlyVisible()){
								throw new Error("Add circuit window CAC in Circuit related tab is not displayed in CLC contact page");
							}
							
							if(!rdn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_circuit.isCurrentlyVisible()){
								throw new Error("Add circuit window circuit in Circuit related tab is not displayed in CLC contact page");
							}
							
							if(!btn_CCLcontact_searchpage_relatedtab_circuit_deleteallcircuit.isCurrentlyVisible()){
								throw new Error("Add circuit window Addcircuit button in Circuit related tab is not displayed in CLC contact page");
							} break;
							
		case "Cancel circuit":jsClick(btn_CCLcontact_searchpage_relatedtab_circuit_closewindow);break;
		
		case "remove all the Subscribers associated to the contact": jsClick(btn_CCLcontact_editpage_removesubscriber);break;
		
		case "Save with no subscribers associated": jsClick(btn_CCLcontact_editpage_save);waitForElement(lbl_CCLcontact_editpage_fillmandatoryfield4Customername);break;
		
		case "Please associate atleast one customer. message should be displayed": 
											Message = lbl_CCLcontact_editpage_fillmandatoryfield4Customername.getText();
																		
											Message = Message.trim(); 
											if(!Message.contains("Please associate atleast one customer.")){
												throw new Error("Wrong message is displayed as "+Message);
											} jsClick(btn_CCLcontact_editpage_cancel); getDriver().switchTo().alert().accept();waitForElement(btn_CCLcontact_searchpage_edit);break;	
		
		case "On Associating the same subscriber an message should be displayed as -You cannot associate duplicate company/customer.": waitForElement(btn_CCLcontact_editpage_removesubscriber);
									jsClick(btn_CCLcontact_editpage_removesubscriber);tbx_CCLcontact_editpage_customername.type("A");
								waitForElement(getDriver().findElement(By.xpath(".//*[@class='input-group task-screen-dropdown']/ul/li[1]/a")));
								jsClick(getDriver().findElement(By.xpath(".//*[@class='input-group task-screen-dropdown']/ul/li[1]/a")));
								Message = lbl_CCLcontact_editpage_subscriber.getText();
								Message = Message.toString().substring(1);
								
								Message = Message.trim(); 
								tbx_CCLcontact_editpage_customername.type(Message);
								waitForElement(getDriver().findElement(By.xpath(".//*[@class='input-group task-screen-dropdown']/ul/li[1]/a")));
								jsClick(getDriver().findElement(By.xpath(".//*[@class='input-group task-screen-dropdown']/ul/li[1]/a")));
								Message = lbl_alertmsg.getText();
								Message = Message.toString().substring(1);
								
								Message = Message.trim(); 
								if(!Message.contains("You cannot associate duplicate company/customer.")){
									throw new Error("Wrong message is displayed as "+Message);
								} jsClick(btn_alertmsg_closicon);
								verify_validation("Save");jsClick(btn_alertmsg_closicon);break;	
		
		case "On Associating the same subscriber through Look up an message should be displayed as -You cannot associate duplicate company/customer.":
								if(!btn_CCLcontact_editpage_removesubscriber.isCurrentlyVisible()){
									verify_validation("Edit");
								}
								Message = lbl_CCLcontact_editpage_subscriber.getText();
								Message = Message.toString().substring(1);
								
								Message = Message.trim(); 
								jsClick(btn_CCLcontact_editpage_subcriberlookup);waitForElement(btn_CCLcontact_editpage_subcriberlookup_icon);
								tbx_CCLcontact_editpage_subcriberlookup_subscribername.type(Message);
								jsClick(btn_CCLcontact_editpage_subcriberlookup_icon);waitForElement(lbl_CCLcontact_editpage_subcriberlookup_subscribername);
								jsClick(lbl_CCLcontact_editpage_subcriberlookup_subscribername);waitForElement(lbl_CCLcontact_editpage_subcriberlookup_alertmsg);
								Message =lbl_CCLcontact_editpage_subcriberlookup_alertmsg.getText();
								Message = Message.toString().substring(1);
								
								Message = Message.trim(); 
								if(!Message.contains("You cannot associate duplicate company/customer.")){
									throw new Error("Wrong message is displayed as "+Message);
								} jsClick(btn_CCLcontact_editpage_subcriberlookup_cancel); 
								jsClick(btn_CCLcontact_editpage_cancel); 
								getDriver().switchTo().alert().accept();
								waitForElement(btn_CCLcontact_searchpage_edit);break;
								
		case "Please enter value for CAC. message is diplayed on serching CAC lookup without any value in CLC contact page": 
								jsClick(rdn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_cac);Thread.sleep(1000);
									jsClick(btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_lookup);
									waitForElement(lbl_CCLcontact_searchpage_relatedtab_circuit_alertmsg);
									Message = lbl_CCLcontact_searchpage_relatedtab_circuit_alertmsg.getText();
									Message = Message.toString().substring(1);
									
									Message = Message.trim(); 
									if(!Message.contains("Please enter value for CAC.")){
										slf4jLogger.error("Wrong message is displayed as "+Message);
										throw new Error("Wrong message is displayed as "+Message);
									}	jsClick(btn_CCLcontact_searchpage_relatedtab_circuit_alertmsg_closeicon); break; 
									
		case "Please enter value for Circuit. message is diplayed on serching Circuit lookup without any value in CLC contact page": 
							jsClick(rdn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_circuit);
									jsClick(btn_CCLcontact_searchpage_relatedtab_circuit_addcircuit_lookup);
									waitForElement(lbl_CCLcontact_searchpage_relatedtab_circuit_alertmsg);
									Message = lbl_CCLcontact_searchpage_relatedtab_circuit_alertmsg.getText();
									Message = Message.toString().substring(1);
									
									Message = Message.trim(); 
									if(!Message.contains("Please enter value for Circuit Name.")){
										throw new Error("Wrong message is displayed as "+Message);
									}	jsClick(btn_CCLcontact_searchpage_relatedtab_circuit_alertmsg_closeicon); break; 
									
		case "Advance CLC Search": waitForElement(btn_CCLcontact_searchpage_edit);
									Msg[0]=lbl_CCLcontact_searchpage_firstname.getText().trim();
									Msg[1]=lbl_CCLcontact_searchpage_lastname.getText().trim();
									Msg[2]=lbl_CCLcontact_searchpage_telephonenumber.getText().trim();
									Msg[3]=lbl_CCLcontact_searchpage_email.getText().trim();
									Msg[4]=lbl_CCLcontact_searchpage_customername.getText().trim();
									jsClick(btn_CCLcontact_activepage_clsicon); break;
									
									
		case "Bulk upload tab":Thread.sleep(5000);
							jsClick(tab_CCLcontact_searchpage_bulkupload); break;
		case "Bulk Contact Upload tab fields in CLC Contact":
									waitForElement(lbl_CCLcontact_searchpage_bulkuploadtab_tab);
									if(!lbl_CCLcontact_searchpage_bulkuploadtab_tab.isCurrentlyVisible()){
										slf4jLogger.error("Bulk Contact Upload header is missing");
										throw new Error("Bulk Contact Upload header is missing");				
									}
									if(!lnk_CCLcontact_searchpage_bulkuploadtab_downloadtemplate.isCurrentlyVisible() && !lnk_CCLcontact_searchpage_bulkuploadtab_downloadtemplate.isCurrentlyEnabled()){
										slf4jLogger.error("Download link for Bulk Contact Upload template is missing");
										throw new Error("Download link for Bulk Contact Upload template is missing");
									}
									if(!btn_CCLcontact_searchpage_bulkuploadtab_choosefile.isCurrentlyVisible() && !btn_CCLcontact_searchpage_bulkuploadtab_choosefile.isCurrentlyEnabled()){
										slf4jLogger.error("Choose file button for Bulk Contact Upload template is missing");
										throw new Error("Choose file button for Bulk Contact Upload template is missing");
									}
									if(!tbx_CCLcontact_searchpage_bulkuploadtab_grpname.isCurrentlyVisible()){
										slf4jLogger.error("Group Name field is missing in Bulk Contact Upload");
										throw new Error("Group Name field is missing in Bulk Contact Upload");				
									}			
									if(!btn_CCLcontact_searchpage_bulkuploadtab_submit.isCurrentlyVisible() && btn_CCLcontact_searchpage_bulkuploadtab_submit.isCurrentlyEnabled()){
										slf4jLogger.error("Submit button for Bulk Contact Upload template is missing");
										throw new Error("Submit button for Bulk Contact Upload template is missing");			
									}jsClick(tab_CCLcontact_searchpage_Contactdetails); waitForElement(btn_CCLcontact_searchpage_edit); 
								
								break;	
									
		case "Submit button is not enabled without uploading an template and entering a Group Name in CLC contact":
									waitForElement(lbl_CCLcontact_searchpage_bulkuploadtab_tab);
									tbx_CCLcontact_searchpage_bulkuploadtab_grpname.type("Automation Test");
									if(!btn_CCLcontact_searchpage_bulkuploadtab_submit.isCurrentlyVisible() && btn_CCLcontact_searchpage_bulkuploadtab_submit.isCurrentlyEnabled()){
										slf4jLogger.error("Submit button for Bulk Contact Upload is enabled without uploading template");
										throw new Error("Submit button for Bulk Contact Upload is enabled without uploading template");			
									}jsClick(tab_CCLcontact_searchpage_Contactdetails); waitForElement(btn_CCLcontact_searchpage_edit); break;	
									
		} 
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void enter_Search_clccontact(String Value) throws Throwable {
		tbx_clccontact_searchfield_searchBy.sendKeys(Value);
		jsClick(btn_clccontact_search);
		btn_clccontact_search.isCurrentlyVisible();
		Thread.sleep(3000);
		//List clccontact_values = new ArrayList();
		System.out.println("Group name is "+lbl_step1_clccontact_Groupname.getText());
		System.out.println("Group id is "+lbl_step1_clccontact_Groupid.getText());
		System.out.println("Total number of contactid is  "+lbl_step1_clccontact_Total.getText());
		if(lbl_step1_clccontact_CUID.getText().contains(Value)){
			System.out.println(Value+" is avaliable in the view CLC contact page");
		}
		/*for(int i=0; i<=lbl_step1_clccontact_values.size()-1; i++){		
			//clccontact_values.add(lbl_step1_clccontact_values.get(i).getText());
			if(lbl_step1_clccontact_values.get(i).getText().contains(Value)){
				System.out.println(Value+" is avaliable in the view CLC contact page");
				break;
			}*/	
	}
	public void validate_Total_contacts_in_database() throws Throwable{
		String groupid = lbl_step1_clccontact_Groupid.getText();
		String OV_Totalcount = lbl_step1_clccontact_Total.getText();
		String DB_Totalcount = OmnivueDB.Validate_Total_contact(groupid);
		if(OV_Totalcount.equals(DB_Totalcount)){
			System.out.println("OV Total count is equal to database Total count");
		}else throw new Error("OV Total count is not equal to database Total count");
	}
	public void Enter_clccontact_firstname(String firstname) throws Throwable {
		tbx_clccontact_searchfield_FirstName.sendKeys(firstname);
	
	}
	public void Search_clccontact_with_firstname(String firstname) throws Throwable {
		tbx_clccontact_searchfield_FirstName.sendKeys(firstname);
		jsClick(btn_clccontact_search);
		if(btn_clc_view_icon.isVisible()){
			btn_clc_view_icon.click();
		}else{
		waitForElement(tbx_clccontact_searchfield_FirstName_value);
		}
		Thread.sleep(3000);
		String clcfirstname = tbx_clccontact_searchfield_FirstName_value.getText().trim();
		System.out.println(clcfirstname+" = "+firstname);
		if(clcfirstname.contains(firstname)){
		 System.out.println("Enter First name is avaliable in UI");	
		} else {
			throw new Error("First name is different  = "+clcfirstname);
		}
			
	}
	public void validating_customer_columnheader() throws Throwable {
		lbl_customer_columnheader.shouldBeCurrentlyVisible();
	}
	public void validate_column_names() throws Throwable {
		lbl_CONTACTID_columnheader.shouldBeCurrentlyVisible();
		lbl_columnheader_CAC_RETURNED.shouldBeCurrentlyVisible();
		lbl_CKT_FORMAT_RETURNED_columnheader.shouldBeCurrentlyVisible();
		lbl_CKT_RETURNED_columnheader.shouldBeCurrentlyVisible();
		btn_view_1st_clccontact.shouldBeCurrentlyVisible();
		btn_view_1st_clccontact.click();
	}
	public void selectvalue() throws Throwable {
		Thread.sleep(1000);
		tbx_clccontact_CAC.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		tbx_clccontact_CAC.sendKeys(Keys.ENTER);
		btn_lookup_Circuitlookup.click();
	}
	public void add_circuit_by_CAC() throws Throwable {
		btn_clccontact_addcircuit.click();
		Thread.sleep(3000);
		rbn_clccontact_CAC.isSelected();
		tbx_clccontact_CAC.sendKeys("A");
		selectvalue();
		Thread.sleep(3000);
		if(!lbl_customername_addcircuitlookup.isPresent()){
			tbx_clccontact_CAC.clear();
		    for(int i=0;i<=10;i++){
			switch(i){
				case '0': tbx_clccontact_CAC.sendKeys("B");
				selectvalue(); break;	
				case '1': tbx_clccontact_CAC.sendKeys("B");
				selectvalue(); break;
				case '2': tbx_clccontact_CAC.sendKeys("C");
				selectvalue(); break;
				case '3': tbx_clccontact_CAC.sendKeys("D");
				selectvalue(); break;
			}
		  }	
		}
		Select s = new Select(ddl_customername_addcircuitlookup);
		String values = s.getOptions().toString();
		System.out.println(values);
		ddl_customername_addcircuitlookup.click();
		ddl_customername_addcircuitlookup.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ddl_customername_addcircuitlookup.sendKeys(Keys.ENTER);
		//ddl_customername_addcircuitlookup.selectByIndex(1);
		ckb_Circuitgird_addcircuit.click();
		Thread.sleep(1000);
		//actvtnpage.iselementcurrentlyenable(btn_clccontact_assoaciatecircuit);
		lbl_circuithyperlink.click();
		waitForElement(lbl_tirkscircuit_subtab);
		lbl_tirkscircuit_subtab.shouldBeCurrentlyVisible();
		/*jsClick(btn_clccontact_assoaciatecircuit);
		Thread.sleep(3000);
		Alert alert = loginPage.getDriver().switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		btn_refresh_circuitlist.click();
		Thread.sleep(3000);*/
        /*rbn_clccontact_Circuit.isSelected();
		tbx_clccontact_Circuitname.sendKeys("81/AF-4TDG1     /CHYNWYMABMD/77/CHYNWYMA03T");*/
		
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
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}
	
	public void verify_details() throws InterruptedException {
		ArrayList<String> clccontact_details=new ArrayList<String>();
		ArrayList<String> clccontact_details1=new ArrayList<String>();
		
		 waitForElement(btn_CCLcontact_searchpage_edit);
		 Thread.sleep(1000);
		clccontact_details.add(lbl_CCLcontact_searchpage_firstname.getText().trim());
		clccontact_details.add(lbl_CCLcontact_searchpage_lastname.getText().trim());
		clccontact_details.add(lbl_CCLcontact_searchpage_telephonenumber.getText().trim());
		clccontact_details.add(lbl_CCLcontact_searchpage_email.getText().trim());
		jsClick(btn_CCLcontact_activepage_clsicon);
		Thread.sleep(1000);
		jsClick(tab_CLCcontact_advsearch);
		Thread.sleep(1000);
		tbx_advclccontactsearch_fname.type(clccontact_details.get(0));
		tbx_advclccontactsearch_lname.type(clccontact_details.get(1));
		tbx_advclccontactsearch_email.type(clccontact_details.get(3));
		
		jsClick(btn_advclccontactsearch_search);
		Thread.sleep(2000);
        waitForElement(btn_CCLcontact_searchpage_edit);	
		
		clccontact_details1.add(lbl_CCLcontact_searchpage_firstname.getText().trim());
		clccontact_details1.add(lbl_CCLcontact_searchpage_lastname.getText().trim());
		clccontact_details1.add(lbl_CCLcontact_searchpage_telephonenumber.getText().trim());
		clccontact_details1.add(lbl_CCLcontact_searchpage_email.getText().trim());
		if(clccontact_details1.equals(clccontact_details)) {
			System.out.println("CLC Contcat details matched");
			System.out.println(clccontact_details1);
			
		}else {
			slf4jLogger.error("CLC Contcat details not matched");
			}
		
		
		
	}
	public  boolean checkElementisClickable(WebElement welement) {

		try {
		WebDriverWait wait = new WebDriverWait(getDriver(), 200);
		wait.until(ExpectedConditions.elementToBeClickable(welement)) ;
		return true;
		
			} catch (org.openqa.selenium.NoSuchElementException e) {

		return false;

			}
	}

}
