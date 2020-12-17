package com.ctl.it.qa.omnivue.tools.pages.common;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
 
import net.thucydides.core.annotations.findby.By;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
 

@SuppressWarnings("deprecation")
public class OVSearchTopologyPage extends OmniVuePage {
	
	
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
		
	@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab_search_result_details;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Name']/parent::span/parent::span/following-sibling::span//label")
	public WebElementFacade lbl_topologyview_generalattributes_topologyname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_TopologyPage_Edit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Delete']")
	public WebElementFacade btn_TopologyPage_delete;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save']")
	public WebElementFacade btn_TopologyPage_save;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[text()='Topology Role']/parent::span/parent::span/following-sibling::span//label")
	public WebElementFacade lbl_topologyview_topologyrole; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[text()='Topology Technology Type']/parent::span/parent::span/following-sibling::span//label")
	public WebElementFacade lbl_topologyview_techtype;

	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showDevContained']//tbody//td[6]/span")
	public WebElementFacade lbl_topologypage_equiprole;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='main-tab ng-isolate-scope']//label[text()='Topology Type']/parent::span/parent::span/following-sibling::span//label")
	public WebElementFacade lbl_topologyview_generalattributes_topologytype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Audit Log')]")
	public WebElementFacade tab_topology_viewpage_Audit_Log;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Virtual Ports']")
	public WebElementFacade tab_Virtual_Ports;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Circuits']")
	public WebElementFacade tab_Circuits;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Topology View']")
	public WebElementFacade tab_topology;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Circuits']")
	public WebElementFacade tab_circuit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Devices']")
	public WebElementFacade tab_devices;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Locations']")
	public WebElementFacade tab_locations;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='SVLAN']")
	public WebElementFacade tab_SVLAN;

	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Devices']")
	public WebElementFacade tab_Devices;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//i[@ng-click='refreshDevices()']")
	public WebElementFacade btn_DevicesRT_refreshicon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_DevicesRT_edit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Locations']")
	public WebElementFacade tab_Locations;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='SVLAN']")
	public WebElementFacade tab_svlan;
	
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
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Tasks']")
	public WebElementFacade tab_Tasks;

	
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
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
	public WebElementFacade tab_services;
	
	//##########################	Tab Validations ###########################################//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[starts-with(text(),'Topology Details')]")
	public WebElementFacade tab_topologyview_Topologydetails;
	
	//###############################################################################################//
	
	//##########################	Advance Topology Search #########################################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='topologyType']")
	public WebElementFacade ddl_advtopologysearch_topologytype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='topologyRole']")
	public WebElementFacade ddl_advtopologysearch_topologyrole;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='technologyType']")
	public WebElementFacade ddl_advtopologysearch_technologytype;
	
	@FindBy(xpath=".//tab-heading[starts-with(text(),'Topology Search Results')]")
	public WebElementFacade tab_topology_searchresult;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='next']/div")
	public WebElementFacade btn_topology_searchresult_next;
	
	//###############################		Topology-view  ##########################################//
	
	@FindBy(xpath="//div[@ng-show='showDevContained']//tbody/tr")
	public List<WebElementFacade> lbl_Devicecontainer_count;
	
	@FindBy(xpath="//div[@ng-show='showCirContained']//tbody/tr")
	public List<WebElementFacade> lbl_Circuitcontainer_count; 
	
	@FindBy(xpath="//div[starts-with(@id,'contenttablejqxGrid')]//input[@type='image']")
	public List<WebElementFacade> btn_count; 
	
	
	

	//###############################		Topology - view Related Tab  ##########################################//
	
	@FindBy(xpath=".//*[@id='right-content']//*[@class='ng-isolate-scope active']//*[text()='Topology Diagram']")
	public WebElementFacade tab_topology_RTTopologyview_topologydiag;
	
	@FindBy(xpath=".//*[@id='right-content']//*[@class='tab-pane ng-scope active']//h2[contains(text(),'Google Maps')]/../preceding-sibling::div")
	public WebElementFacade lbl_topology_RTTopologyview_topologydiag_headertxt;
	
	@FindBy(xpath=".//*[@id='right-content']//*[@class='tab-pane ng-scope active']//h2[contains(text(),'Google Maps')]")
	public WebElementFacade lbl_topology_RTTopologyview_topologydiag_googlemaps;
	
	@FindBy(xpath=".//*[@id='right-content']//*[@class='tab-pane ng-scope active']//h2[contains(text(),'Google Maps')]/span")
	public WebElementFacade btn_topology_RTTopologyview_topologydiag_googlemaps;
	
	@FindBy(xpath="(.//*[@id='right-content']//*[@class='tab-pane ng-scope active']//*[@ng-change='onAttributesSelect()'])[1]")
	public WebElementFacade chk_topology_RTTopologyview_topologydiag_devicename;
			
	@FindBy(xpath="(.//*[@id='right-content']//*[@class='tab-pane ng-scope active']//*[@ng-change='onAttributesSelect()'])[2]")
		public WebElementFacade chk_topology_RTTopologyview_topologydiag_bearerckt;
					
	@FindBy(xpath="(.//*[@id='right-content']//*[@class='tab-pane ng-scope active']//*[@ng-change='onAttributesSelect()'])[3]")
		public WebElementFacade chk_topology_RTTopologyview_topologydiag_deviceprt;
							
	@FindBy(xpath=".//*[@id='right-content']//*[@class='tab-pane ng-scope active']//canvas")
		public WebElementFacade lbl_topology_RTTopologyview_topologydiag_map;
							
	@FindBy(xpath=".//*[@id='right-content']//*[@class='tab-pane ng-scope active']//canvas/following-sibling::div")
		public WebElementFacade lbl_topology_RTTopologyview_topologydiag_map_ckt;
							
	@FindBy(xpath=".//*[@id='right-content']//*[@class='tab-pane ng-scope active']//canvas/following-sibling::div")
		public WebElementFacade lbl_topology_RTTopologyview_topologydiag_map_allslt_ckt;
	
	//###############		Topology Edit page 	#########################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='addDevice();']")
	public WebElementFacade btn_Searchtopology_edit_adddevice;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='searchDeviceDtl();']")
	public WebElementFacade btn_Searchtopology_edit_searchdevice;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-click='addDeviToAsso(devL)'])[1]")
			public WebElementFacade cbx_Searchtopology_edit_searchdeviceresult_device1;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='associateDevice()']")
	public WebElementFacade btn_Searchtopology_edit_searchdevice_associate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='NETWORK_ROLE']")
	public WebElementFacade ddl_TopologyPage_edit_NETWORK_ROLE;
	
	@FindBy(xpath="//select[@ng-model='topoDetail.DEVTYPE']")
	public WebElementFacade ddl_TopologyPage_edit_DevType;
	
	//#################		Topology View Related Tab Validation ########################//
	
	@FindBy(xpath= " //input[@ng-model='selectedAttributes[attribute.attributeName]'and @ng-true-value='1']")
	public WebElementFacade cbk_Bearer_circuit;
	
	@FindBy(xpath= " //input[@ng-model='selectedAttributes[attribute.attributeName]'and @ng-true-value='2']")
	public WebElementFacade cbk_Device_ports;
	
	@FindBy(xpath= " //input[@ng-model='selectedAttributes[attribute.attributeName]'and @ng-true-value='3']")
	public WebElementFacade cbk_Device_name;
	
	@FindBy(xpath="//a[@ng-click='selectPage(page.number)' and contains(text(),'2')]")
	public WebElementFacade lbl_Topologyview_2ndpage;
	
	@FindBy(xpath="//span[@ng-change='selectTopologyMap()']")
	public WebElementFacade btn_Topologyview_googlemaps;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='alert alert-danger']")
	public WebElementFacade lbl_relatedtab_alertmsg;
	
	//#################################################		Audit Logs Tab Validation  ##########################################################//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[text()='OmniVue Audit Logs']")
	public WebElementFacade tab_circuitview_auditlogs_OMNIVUE_auditlogs;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_circuitview_Auditlogs_omnivueauditlog_getlog; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")
	public WebElementFacade lbl_circuitview_Auditlogs_omnivueauditlog_actiontypeheader; 
					
	//#################################################		Message validations  ##########################################################//
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@class='ng-binding alert alert-success']")
	public WebElementFacade lbl_successmsg;

	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void click_tab_topology() throws Throwable{
		Thread.sleep(2000);
		jsClick(tab_topology);
		
	}
	
	public void click_tab_circuit() throws Throwable{
		Thread.sleep(2000);
		jsClick(tab_circuit);
		
	}
	public void click_tab_devices() throws Throwable{
		Thread.sleep(2000);
		jsClick(tab_devices);
		
	}
	public void click_tab_locations() throws Throwable{
		Thread.sleep(2000);
		jsClick(tab_locations);
		
	}
	public void click_tab_SVLAN() throws Throwable{
		Thread.sleep(2000);
		jsClick(tab_SVLAN);
		
	}
	
	public void validate_tab_topology() throws Throwable{
		Thread.sleep(2000);
		//jsClick(chk_topology_RTTopologyview_topologydiag_devicename);
		chk_topology_RTTopologyview_topologydiag_devicename.click();
		Thread.sleep(5000);
		//jsClick(chk_topology_RTTopologyview_topologydiag_bearerckt);
		chk_topology_RTTopologyview_topologydiag_bearerckt.click();
		Thread.sleep(5000);
		//jsClick(chk_topology_RTTopologyview_topologydiag_deviceprt);
		chk_topology_RTTopologyview_topologydiag_deviceprt.click();
		Thread.sleep(5000);
		
	}

	public void Topologyttab_namevalidation(){

	waitForElementclickable(btn_TopologyPage_Edit);
	
	 
	 String TopologyName = tab_search_result_details.getText().trim();
		
	 if(lbl_topologyview_generalattributes_topologyname.isCurrentlyVisible()){
		if(lbl_topologyview_generalattributes_topologyname.getText().trim().equals(TopologyName)){
				slf4jLogger.info("Topology Tab Name is matching with the Topology Text field");
		} else throw new Error("Topology name is not matching with the Tab name");
	 }
	
}
	public void Validate_DeviceType(String DevType) throws Throwable{
		Thread.sleep(3000);
		String ActualDevType = ddl_TopologyPage_edit_DevType.getSelectedValue();
		if(ActualDevType.equals(DevType)){
			System.out.println("Actual deviceType is equal to Expected deviceType");
		} else throw new Error("Actual deviceType is Not equal to Expected deviceType");
	}
	public void	Topology_search_Sanity_Validation() throws Throwable{	
		
		slf4jLogger.info("Search Topology Validations");
		
		Thread.sleep(3000);
		
		 Topologyttab_namevalidation();
		 
		if(!btn_TopologyPage_Edit.isCurrentlyVisible() && !btn_TopologyPage_Edit.isCurrentlyEnabled()){
			throw new Error("Topology Edit button is not displayed for " + lbl_topologyview_generalattributes_topologytype.getText());
		}					
		
		
		if(!tab_topology_viewpage_Audit_Log.isCurrentlyVisible()){
			throw new Error("Audit log tab is not displayed for " + lbl_topologyview_generalattributes_topologytype.getText());
		}		
		
		if(lbl_topologyview_generalattributes_topologytype.isCurrentlyVisible()){
			//################################ Related Tabs Validations in Circuit view ############################################//	
			
			if(!tab_Circuits.isCurrentlyVisible()){
				throw new Error("Circuits Related Tab is missing in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}	
			
			if(!tab_Devices.isCurrentlyVisible()){
				throw new Error("Devices Related Tab is missing in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			if(!tab_Locations.isCurrentlyVisible()){
				throw new Error("Locations Related Tab is missing in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			if(!tab_svlan.isCurrentlyVisible()){
				throw new Error("SVLAN Related Tab is missing in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
					
			//################################ Related Tabs should not be displayed Circuit view ############################################//
			
			if(tab_bamreport.isCurrentlyVisible() ){
				throw new Error("BAM Report Related tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_services.isCurrentlyVisible()){
				throw new Error("Services Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}	
			
			if(tab_Tasks.isCurrentlyVisible()){
				throw new Error("Task Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_TIRKS.isCurrentlyVisible() ){
				throw new Error("TIRKS Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_Activations.isCurrentlyVisible() ){
				throw new Error("Activation Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_Armor.isCurrentlyVisible() ){
				throw new Error("ARMOR Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_circuitdetails.isCurrentlyVisible() ){
				throw new Error("Circuit Details Related tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_orders.isCurrentlyVisible()){
				throw new Error("Orders Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_Service_Areas.isCurrentlyVisible()){
				throw new Error("Service Area Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_Subscriber.isCurrentlyVisible()){
				throw new Error("Subscriber Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
					
					if(tab_ctag.isCurrentlyVisible()){
						throw new Error("CTAG Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
					}		
					
					if(tab_contact.isCurrentlyVisible()){
						throw new Error("Contact Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
					}
					
					if(tab_Device_ports.isCurrentlyVisible()){
						throw new Error("Audit Logs Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
					}				
					
					
					if(tab_Performance.isCurrentlyVisible()){
						throw new Error("Performance Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
					}
			

			if(tab_facilities.isCurrentlyVisible()  ){
				throw new Error("Facilities Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
			
			if(tab_Virtual_Ports.isCurrentlyVisible()){
				throw new Error("Virtual Ports Related Tab is Displayed in the Topology view page in " + lbl_topologyview_generalattributes_topologytype.getText());
			}
		}
		
		jsClick(btn_TopologyPage_Edit);
		waitFor(ddl_TopologyPage_edit_NETWORK_ROLE); Thread.sleep(2000);
		if (ddl_TopologyPage_edit_NETWORK_ROLE.isCurrentlyEnabled()) {
			ddl_TopologyPage_edit_NETWORK_ROLE.selectByIndex(2);
		}
		
		
	}
	
	public void i_select_topology_type_and_topology_role_Advancetopologysearch(String topologytype, String topologyrole) throws Throwable {	
		ddl_advtopologysearch_topologytype.selectByVisibleText(topologytype)	;
		Thread.sleep(1000);
		ddl_advtopologysearch_topologyrole.selectByVisibleText(topologyrole);
		Thread.sleep(2000);
	 }
	
	public void  validate_topologytechtype_advancesearch() throws Throwable {	
		String[] expectedvalues = {"--Select--", "G.8032", "Calix ERP", "MPLS", "LACP", "Spanning Tree", "IP", "BGP-LU"};		
		
		Select Select_Topology_techtype =	new Select(ddl_advtopologysearch_technologytype);
		
		List<WebElement>  allvalues_topology=Select_Topology_techtype.getOptions();
		
		for(String str:expectedvalues) 
		{
			boolean found=false;
			for(WebElement ele1:allvalues_topology)
			{
				
				if(str.equals(ele1.getText()))
				{
					found=true;
					slf4jLogger.info(str+" Topology Technology Type exists in Advance Search");
					break;
				}
			}
			if(!found)
			{
				throw new Error("Topolgy Technology Type does not exist in Advance Search");
			}
		}
	}
	
	public void validate_topologytechtype_for_hostClient_advancesearch(){
		String[] expectedvalues = {"--Select--", "ALU-Nokia 7750 Series", "Cisco ASR 9000 Series"};		
		Select select_topology_tech_type=new Select(ddl_advtopologysearch_technologytype);
		 
		List<WebElement>  allvalues_topology_tech_type=select_topology_tech_type.getOptions();
		for(String str:expectedvalues) 
		{
			boolean found=false;
			for(WebElement ele1: allvalues_topology_tech_type)
			{
				
				if(str.equals(ele1.getText()))
				{
					found=true;
					slf4jLogger.info(str+" Topology Technology Type exists in Advance Search");
					break;
				}
			}
			if(!found)
			{
				throw new Error("Topolgy Technology Type does not exist in Advance Search");
			}
		}
		
	} 
	 public void topology_Action(String Devicerole) throws Throwable{
			switch(Devicerole){
			case "Delete":Thread.sleep(2000); waitForElement(btn_TopologyPage_Edit); jsClick(btn_TopologyPage_delete); 
							getDriver().switchTo().alert().accept();break;
			case "Edit":waitForElement(btn_TopologyPage_Edit);jsClick(btn_TopologyPage_Edit);waitForElement(btn_TopologyPage_save);break;
			case "AddDevice":waitForElement(btn_TopologyPage_save);
								jsClick(btn_Searchtopology_edit_adddevice);waitForElement(btn_Searchtopology_edit_searchdevice);break;
			}
					
		 }		
	
	@SuppressWarnings("unused")
	public void validation_verify(String validation) throws Throwable {	
		String status=null;
		String path=null;
		String role_complete=null;
		String[] role=null;
		int i;
		switch(validation){	
	
		case "validate the check boxes in next page with google maps is enabled in the Topology view related tab":
										jsClick(btn_Topologyview_googlemaps);
										Thread.sleep(1000);
										jsClick(cbk_Device_name);
										Thread.sleep(1000);
										if(lbl_Topologyview_2ndpage.isCurrentlyVisible()){
											jsClick(lbl_Topologyview_2ndpage);
											Thread.sleep(3000);
										}
										
										if(!cbk_Device_name.isSelected()){
											System.out.println("device name check box is not selected");
										} else throw new Error("device name check box is selected");
										cbk_Device_name.click();
										Thread.sleep(1000);
										jsClick(btn_Topologyview_googlemaps);
										Thread.sleep(2000);
										
										break;
										
		case "validate the check boxes in next page is displayed in the Topology view related tab":
									jsClick(cbk_Device_name);
									Thread.sleep(1000);
									if(lbl_Topologyview_2ndpage.isCurrentlyVisible()){
									jsClick(lbl_Topologyview_2ndpage);
									Thread.sleep(3000);
									}
									if(!cbk_Device_name.isSelected()){
										System.out.println("device name check box is not selected");
									} else throw new Error("device name check box is selected");
									cbk_Device_name.click();
									
									break;
			
		case "Device Name, Bearer Circuits and Device ports check box is displayed in the Topology view related tab":
									cbk_Device_name.isSelected();
									cbk_Bearer_circuit.isSelected();
									cbk_Device_ports.isSelected();
									
									
									break;
		case "associate client role device in Topolopgy screen":waitForElement(btn_Searchtopology_edit_searchdevice); jsClick(btn_Searchtopology_edit_searchdevice);
																waitForElement(cbx_Searchtopology_edit_searchdeviceresult_device1);jsClick(cbx_Searchtopology_edit_searchdeviceresult_device1);Thread.sleep(1000);waitForElement(btn_Searchtopology_edit_searchdevice_associate);
																jsClick(btn_Searchtopology_edit_searchdevice_associate);
																	break;
		case "Topology is getting created with HOST & CLIENT Device": waitForElementclickable(btn_TopologyPage_Edit);
									 role_complete=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showDevContained']//tbody//td[6]/span)[1]")).getText().replaceAll("\\[", "").replaceAll("\\]", "");
									 role=role_complete.split(",");
									slf4jLogger.info("Device role displayed: "+role);
									for(i=0;i<role.length;i++){
										if(role[i].trim().equals("HOST")){
											status="Passed";
											break;
											}			
										}
									
									role_complete=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showDevContained']//tbody//td[6]/span)[2]")).getText().replaceAll("\\[", "").replaceAll("\\]", "");
									role=role_complete.split(",");
									slf4jLogger.info("Device role displayed: "+role);
									for(i=0;i<role.length;i++){
										if(role[i].trim().equals("CLIENT")){
											status="Passed";
											break;
											}			
										}
							
										if(status.equals("Passed")){
											slf4jLogger.info("Host & CLIENT device has been associated successfully"); 
											Delete_topolgy_reuse();break;
										}else throw new Error("Host & CLIENT device was not associated");
										
			
			case "Topology is getting created with only HOST Device": waitForElementclickable(btn_TopologyPage_Edit);
																		 role_complete=getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showDevContained']//tbody//td[6]/span")).getText().replaceAll("\\[", "").replaceAll("\\]", "");
																		 role=role_complete.split(",");
																		slf4jLogger.info("Device role displayed: "+role);
																		for(i=0;i<role.length;i++){
																			if(role[i].trim().equals("HOST")){
																				status="Passed";
																				break;
																				}			
																			}
		
																			if(status.equals("Passed")){
																				slf4jLogger.info("Host device has been associated successfully"); 
																				Delete_topolgy_reuse();break;
																			}else throw new Error("Host device was not associated");
																			
																			
			case "ALU-Nokia 7750 series": jsClick(tab_topology_searchresult);
											path=".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div[1]/div[4]";
													i=1;
													while(i!=0){
													if(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div["+i+"]/div[4]")).getText().trim().equals(validation)){
														jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div["+i+"]/div[1]")));
														break;
													}
													i++;
													
													if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div["+i+"]/div[4]"))){
														jsClick(btn_topology_searchresult_next); Thread.sleep(2000); i=1;
														}
													}
													
													waitForElement(btn_TopologyPage_Edit);break;
													
			case "Technology Type as ALU-Nokia 7750 series with Role as Host Client or Satellite":
															if(!lbl_topologyview_topologyrole.getText().trim().equals("Host Client or Satellite") &&  !lbl_topologyview_techtype.getText().trim().equals("ALU-Nokia 7750 series")){
																throw new Error("Technology Type as ALU-Nokia 7750 series with Role as Host Client or Satellite is not matching");
															} break;
				
			case "Juniper MX series": jsClick(tab_topology_searchresult);
										path=".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div[1]/div[4]";
										i=1;
										while(i!=0){
										if(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div["+i+"]/div[4]")).getText().trim().equals(validation)){
											jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div["+i+"]/div[1]")));
											break;
										}
										i++;
										
										if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[starts-with(@ id,'contenttablejqxGrid')]/div["+i+"]/div[4]"))){
											jsClick(btn_topology_searchresult_next); Thread.sleep(2000); i=1;
											}
										}
										
										waitForElement(btn_TopologyPage_Edit);break;
										
			case "Technology Type as Juniper MX series with Role as Host Client or Satellite":
											if(!lbl_topologyview_topologyrole.getText().trim().equals("Host Client or Satellite") &&  !lbl_topologyview_techtype.getText().trim().equals("Juniper MX series")){
												throw new Error("Technology Type as Juniper MX series with Role as Host Client or Satellite is not matching");
											} break;
											
			case "should be able to see Device Name, Bearer Circuits, Device ports check boxes on the right top corner in Topology View Related tab":
				waitForElement(tab_topology_RTTopologyview_topologydiag);
				
				if(!tab_topology_RTTopologyview_topologydiag.isCurrentlyVisible()){
					slf4jLogger.error("Topology Diagram header is not displayed in topology View related Tab");
					throw new Error("Topology Diagram header is not displayed in topology View related Tab");
				}
				
				waitForElement(chk_topology_RTTopologyview_topologydiag_devicename);
				
				if(!chk_topology_RTTopologyview_topologydiag_devicename.isCurrentlyVisible()){
					slf4jLogger.error("Device name check box is not displayed in topology View related Tab");
					throw new Error("Device name check box is not displayed in topology View related Tab");
				}
				
				if(!chk_topology_RTTopologyview_topologydiag_bearerckt.isCurrentlyVisible()){
					slf4jLogger.error("Bearer Circuit check box is not displayed in topology View related Tab");
					throw new Error("Bearer Circuit check box is not displayed in topology View related Tab");
				}
				
				if(!chk_topology_RTTopologyview_topologydiag_deviceprt.isCurrentlyVisible()){
					slf4jLogger.error("Device Port check box is not displayed in topology View related Tab");
					throw new Error("Device Port check box is not displayed in topology View related Tab");
				}break;
				
	
		
		}
	}

	public void Delete_topolgy_reuse() throws Throwable {	
		jsClick(btn_TopologyPage_delete);
		
		
		Alert alert = getDriver().switchTo().alert();
       	String msg=alert.getText();       	
       	alert.accept();
       	slf4jLogger.info("Accepted popup");
		slf4jLogger.info(msg);
		waitForElement(lbl_successmsg);
		
		String Message = lbl_successmsg.getText();
			Message = Message.toString().substring(1);
			
			Message = Message.trim(); 
		
		if(Message.equals("Topology is deleted successfully.")){
			slf4jLogger.info("Topology is deleted successfully.");
		}
	}
	
	public void relatedtab_Topology() throws InterruptedException {
        int Devicecount = lbl_Devicecontainer_count.size();
        System.out.println("Left side device count = "+Devicecount);
        jsClick(tab_Devices);
        jsClick(btn_DevicesRT_refreshicon);
       // waitForElement(btn_DevicesRT_edit);
        Thread.sleep(7000);
       /* System.out.println("No of Devices = "+btn_count.size());
        for(int i=1;i<=Devicecount;i++){
           String device= ".//div[@ng-show='showDevContained']//tbody/tr["+i+"]//a";
           String device_name = getDriver().findElement(By.xpath(device)).getText();
           String Rightside_device =".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@ng-controller='deviceSearchController']//div[text()='"+device_name+"']";
               if(getDriver().findElement(By.xpath(Rightside_device)).isDisplayed())
           {
                  System.out.println(device_name+" device is avaliable in related tab");
           }else{
                  System.out.println(device_name+" device is not avaliable in related tab");
           }
        }
        int circuitcount = lbl_Circuitcontainer_count.size();*/
        jsClick(tab_Circuits);
        
          Thread.sleep(3000);
          
          int circuitcount = lbl_Circuitcontainer_count.size();
           System.out.println("No of circuits = "+btn_count.size());         
        for(int j=1; j<=circuitcount; j++){
           String Circuit = "//div[@ng-show='showCirContained']//tbody/tr["+j+"]/td[1]//a";
           String Circuit_name = getDriver().findElement(By.xpath(Circuit)).getText();
           String Rightside_Circuit =".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@ng-controller='circuitSearchController']//div[text()='"+Circuit_name+"']";
               if(getDriver().findElement(By.xpath(Rightside_Circuit)).isDisplayed())
           {
                  System.out.println(Circuit_name+" circuit is avaliable in related tab");
           }else{
                  System.out.println(Circuit_name+" circuit is not avaliable in related tab");
           }
        } 
        //*[@class="tab-pane ng-scope active"]//*[@src="rightContentUrl"]//*[@ng-controller="deviceSearchController"]//*[contains(@id,'columntablejqxGrid')]/div[6]//span                             
           Thread.sleep(8000);
           jsClick(tab_Locations);
           Thread.sleep(3000);
           System.out.println("No of Locations = "+btn_count.size());
          // waitForElement(lbl_relatedtab_alertmsg); 
		    
		}
	
	public void Validated_Auditlogs_of_Topology() throws InterruptedException{
		
		jsClick(tab_topology_viewpage_Audit_Log);
		 waitForElement(tab_circuitview_auditlogs_OMNIVUE_auditlogs); 
			jsClick(tab_circuitview_auditlogs_OMNIVUE_auditlogs);	Thread.sleep(3000);
			/*String str = createTopologyPage.count_Auditlogs.getText();
			int count = Integer.valueOf(str);
			String Audit1 = ".//*[contains(@id,'contenttablejqxGrid')]/div[";
			String Audit2 = "]/div[";
			String Audit3 = "]/div";
		for(int i=1; i<=count; i++){
			String ActionType = loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+1+Audit3)).getText();
			if(ActionType.contains("CREATE")){
				System.out.println("Action Type: "+ActionType+", Audit log Details= "+loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+2+Audit3)).getText()
						+", User Name= "+loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+3+Audit3)).getText()
						+", Event Date: "+loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+4+Audit3)).getText());
			}else if(ActionType.contains("UPDATE")){
				System.out.println("Action Type: "+ActionType+", Audit log Details= "+loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+2+Audit3)).getText()
						+", User Name= "+loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+3+Audit3)).getText()
						+", Event Date: "+loginPage.getDriver().findElement(By.xpath(Audit1+i+Audit2+4+Audit3)).getText());
		    }
		}*/
			
			waitForElement(btn_circuitview_Auditlogs_omnivueauditlog_getlog); jsClick(btn_circuitview_Auditlogs_omnivueauditlog_getlog); Thread.sleep(2000);
			
			waitForElement(lbl_circuitview_Auditlogs_omnivueauditlog_actiontypeheader);
			
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
			
			
			if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE']"))){
				slf4jLogger.info("CREATE logs is  captured under the Audit logs section in Device page");
				//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			} else if (isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']"))){
				slf4jLogger.info("CREATE logs is  captured under the Audit logs section in Device page");
				
			}else {
				slf4jLogger.info("CREATE logs is not captured under the Audit logs section in Device page");
				throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			}
//			
//			if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE'])[1]"))){
//				slf4jLogger.error("CREATE logs is not captured under the Audit logs section in Topology page");
//				throw new Error("CREATE logs is not captured under the Audit logs section in Topology page");
//			}
//			if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE']/../..//div[3])[1]"))){
//				slf4jLogger.error("CREATE logs is not captured under the Audit logs section in Topology page");
//				throw new Error("CREATE logs is not captured under the Audit logs section in Topology page");
//			}
//			if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
//				slf4jLogger.error("CREATE logs is not captured under the Audit logs section in Topology page");
//				throw new Error("CREATE logs is not captured under the Audit logs section in Topology page");
//			}
			
			
 		jsClick(tab_topologyview_Topologydetails);
		Thread.sleep(2000);
	}
	
	public String Delete_Topology() throws InterruptedException {
	waitForElement(btn_TopologyPage_delete);
		String Topologyname = lbl_topologyview_generalattributes_topologyname.getText();
		System.out.println(Topologyname);
		jsClick(btn_TopologyPage_delete);
		Alert DeleteTopologyalert = getDriver().switchTo().alert();
		DeleteTopologyalert.accept();
		Thread.sleep(5000);
		/*String message = createTopologyPage.lbl_deleteAlertmessage.getText();
		String Delectmessage = message.substring(1, message.length());
		System.out.println("Alert Message is :"+Delectmessage);*/
		
		String message1 = lbl_successmsg.getText();
		//String Delectmessage1 = message1.substring(1, message1.length());
		System.out.println("Alert Message is :"+message1);	
		
		return Topologyname;
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),500);				   
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
}
