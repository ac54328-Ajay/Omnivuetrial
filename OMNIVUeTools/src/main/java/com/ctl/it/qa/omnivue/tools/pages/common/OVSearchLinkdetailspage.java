package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class OVSearchLinkdetailspage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	
	
	//################################################## Link Sanity Validation ########################################################//
	
	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Log')]")
	public WebElementFacade tab_searchlink_auditlogs;
	
	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Link Details')]")
	public WebElementFacade tab_searchlink_linkdetails; 
	
	//--------------------------------------------------------------		Search Link Tab & Action button  ---------------------------------------------------------------------------//

	@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab_search_result_details; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Link Details')]")
	public WebElementFacade tab_Linkview_linkdetails;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Log')]")
	public WebElementFacade tab_Linktview_auditlogs; 
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditLink();']")
	public WebElementFacade btn_linkviewpage_Edit; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='deleteLink();']")
	public WebElementFacade btn_linkviewpage_Delete;	
	
	
	
	//--------------------------------------------------------------		General Section  ---------------------------------------------------------------------------//
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Link Type']/parent::span/parent::span/following-sibling::span//label")
	public WebElementFacade lbl_linksearch_linktype;

	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Name']/parent::span/parent::span/following-sibling::span//label")
	public WebElementFacade lbl_linksearch_linkname;
	
	//-------##################################################################---------  Port Selection Validation ----------##################################################################---------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Start Device Name']/../../following-sibling::span//a")
	public WebElementFacade lbl_linksearch_startdevicename;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='End Device Name']/../../following-sibling::span//a")
	public WebElementFacade lbl_linksearch_enddevicename;
	
	
	
	//####################################################################################################################################################################################################//
	//----------------------------------------------------------------------------Related Tab Section ------------------------------------------------------------------------------------------------//
	
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
		
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
		public WebElementFacade lbl_alermsg;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]/button")
		public WebElementFacade btn_alertmsg_clsicon;
		
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		//##############		Audit Logs 	#####################
		
		@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//a[text()='OmniVue Audit Logs']")
		public WebElementFacade tab_auditlogs_omnivueauditlogs;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-click='getOVAuditLogs()']")
		public WebElementFacade btn_auditlogs_getlogs;
		
		@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[text()='Delete'])[1]")
				public WebElementFacade lbl_auditlogs_Deleteaction;				
				
		@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[text()='Delete' and @class='jqx-grid-cell-middle-align']/../../div[3]//div)[1]")
				public WebElementFacade lbl_auditlogs_Deleteaction_user;
						
		@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[text()='CREATE']/../../div[3]//div)[1]")
				public WebElementFacade lbl_auditlogs_createaction;
		
		@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[text()='CREATE'])[1]")
				public WebElementFacade lbl_auditlogs_createaction_user;
		
		@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[text()='Update' and @class='jqx-grid-cell-middle-align'])[1]")
				public WebElementFacade lbl_auditlogs_updateaction;				
				
				
				@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]//div[text()='Update' and @class='jqx-grid-cell-middle-align']/../../div[3]//div)[1]")
				public WebElementFacade lbl_auditlogs_updateaction_user;
				
//###############		Edit Link view page  #########################//
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveLink();']/i")
				public WebElementFacade btn_serachlink_editpage_save;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Provision Status')]/../../following-sibling::span//select")
		public WebElementFacade ddl_serachlink_editpage_provisionstatus;
		
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Functional Status')]/../../following-sibling::span//select")
		public WebElementFacade ddl_serachlink_editpage_funcstatus;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@id='LINK2PROVISIONSTATUS']")
		public WebElementFacade ddl_link_Edit_ProvisionStatus; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@id='AERIALORBURIED']")
		public WebElementFacade ddl_link_Edit_AerialBuried; 
		
//----------------  Circuits related tab -------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@ng-show='errorMessageForCircuit']")
		public WebElementFacade lbl_serachlink_relatedtab_alertmsg;
		
		
		
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_linkviewpage_Edit;
	}
	
	public void clickonEdit()

	{
		jsClick(btn_linkviewpage_Edit);
	}
	
	@FindBy(xpath="//select[@id='LINK2PROVISIONSTATUS']")
	public WebElementFacade ddl_provisonstatus;
	
	@FindBy(xpath="//select[@id='LINK2FUNCTIONALSTATUS']")
	public WebElementFacade ddl_functionalstatus;
	
	@FindBy(id="ALIAS1")
	public WebElementFacade tbx_Alias1;
	@FindBy(id="AERIALORBURIED")
	public WebElementFacade ddl_aeriallorburied;
	
	@FindBy(xpath="(//input[@class='cmdButton'])[1]")
	public WebElementFacade btn_save;
	public void clicksave()
	{
		jsClick(btn_save);
	}
	@FindBy(xpath="//label[contains(text(),'Pending Disconnect')]")
	public WebElementFacade field_pendingdisconnect;
	
	@FindBy(xpath="//label[contains(text(),'Defective')]")
	public WebElementFacade field_defective;
	
	@FindBy(xpath="//label[contains(text(),'alias14')]")
	public WebElementFacade field_alias14;
	
	@FindBy(xpath="(//label[contains(text(),'Aerial')])[2]")
	public WebElementFacade field_aerial;
		
	public void validate()
	{
		Assert.assertEquals(field_pendingdisconnect.getText(), "Pending Disconnect");
		Assert.assertEquals(field_defective.getText(), "Defective");
		Assert.assertEquals(field_alias14.getText(), "alias14");
		Assert.assertEquals(field_aerial.getText(), "Aerial");
	}
	
	
	public void verify_validation(String validation) throws Throwable {		
		String Message;
	
	switch(validation){
	case "click on the Device hyperlink displayed in the Link View Screen":	
		
		waitForElement(lbl_linksearch_startdevicename);
		jsClick(lbl_linksearch_startdevicename);
		break;
	case  "any data is displayed in the Circuits related Tab" : jsClick(tab_Circuits); if(lbl_serachlink_relatedtab_alertmsg.isCurrentlyVisible()){
																slf4jLogger.info("No data is displayed getting message as:"+lbl_serachlink_relatedtab_alertmsg.getText());
																					}break;
	case "in audit logs Update logs are captured for the Link":  jsClick(tab_searchlink_auditlogs);
																waitForElement(tab_auditlogs_omnivueauditlogs);
																jsClick(tab_auditlogs_omnivueauditlogs);
																waitForElement(btn_auditlogs_getlogs);
																jsClick(btn_auditlogs_getlogs);
																Thread.sleep(2000);
																waitForElement(lbl_auditlogs_updateaction);
																if(!lbl_auditlogs_updateaction.isCurrentlyVisible() && !lbl_auditlogs_updateaction_user.isCurrentlyVisible()){
																	slf4jLogger.error("Delete Logs is not registered in audit logs");
																	throw new Error("Delete Logs is not registered in audit logs");
																}jsClick(tab_searchlink_linkdetails);break;
	case "Link Detail Edited successfully. messgae should be displayed": waitForElement(lbl_alermsg);
																	Message=lbl_alermsg.getText().trim();
																	
																	if(!Message.contains("Link Detail Edited successfully.")){
																		slf4jLogger.error("Wrong message is displayed as "+Message);
																		throw new Error("Wrong message is displayed as "+Message);
																	} jsClick(btn_alertmsg_clsicon); break;
	case "change the provision status & functional status in Link view page": waitForElement(ddl_serachlink_editpage_provisionstatus); 
																			ddl_serachlink_editpage_provisionstatus.selectByVisibleText("Planned");Thread.sleep(1000);
																			ddl_serachlink_editpage_funcstatus.selectByVisibleText("Faulty");break;
		
		
	case "Link Deleted successfully. messgae should be displayed": waitForElement(lbl_alermsg);
																	Message=lbl_alermsg.getText().trim();
																
																	if(!Message.contains("Link Deleted successfully.")){
																		slf4jLogger.error("Wrong message is displayed as "+Message);
																		throw new Error("Wrong message is displayed as "+Message);
																	} jsClick(btn_alertmsg_clsicon); break;
	case "in audit logs Delete logs are captured for the Link": jsClick(tab_searchlink_auditlogs);
																waitForElement(tab_auditlogs_omnivueauditlogs);
																jsClick(tab_auditlogs_omnivueauditlogs);
																waitForElement(btn_auditlogs_getlogs);
																jsClick(btn_auditlogs_getlogs);
																Thread.sleep(2000);
																waitForElement(lbl_auditlogs_Deleteaction);
																if(!lbl_auditlogs_Deleteaction.isCurrentlyVisible() && !lbl_auditlogs_Deleteaction_user.isCurrentlyVisible()){
																	slf4jLogger.error("Delete Logs is not registered in audit logs");
																	throw new Error("Delete Logs is not registered in audit logs");
																}jsClick(tab_searchlink_linkdetails);break;
	}
	}

		
	
	public void Linktab_namevalidation() throws Throwable {
		waitForElement(lbl_linksearch_linkname);
		
		 
		 String linkname=tab_search_result_details.getText().replaceAll("\\s","");
			
			if(lbl_linksearch_linkname.getText().replaceAll("\\s+$", "").equals(linkname)){
				slf4jLogger.info("Link Tab Name is matching with the Service Text field");
			} else throw new Error("Link name is not matching with Tab name");
	}
	
	public void	Link_search_Sanity_validation() throws Throwable{		
		
		waitForElement(btn_linkviewpage_Edit);
		
		 Linktab_namevalidation();		  
		
		if(!tab_Linkview_linkdetails.isCurrentlyVisible()){
			throw new Error("Link details tab is not displayed in "+lbl_linksearch_linktype.getText());
		}
		 
		if(!tab_Linktview_auditlogs.isCurrentlyVisible()){
			throw new Error("Link Audit log tab is not displayed in "+lbl_linksearch_linktype.getText());
		}
		 
		 if(!btn_linkviewpage_Edit.isCurrentlyVisible() && !btn_linkviewpage_Edit.isCurrentlyEnabled()){
				throw new Error("Edit button in Link is not displayed in "+lbl_linksearch_linktype.getText());
			}
			
		 
		 if(!btn_linkviewpage_Delete.isCurrentlyVisible() && !btn_linkviewpage_Delete.isCurrentlyEnabled()){
				throw new Error("Delete button in Link is not displayed in "+lbl_linksearch_linktype.getText());
			} 
		 
		 
		 
		 
		 
		 switch(lbl_linksearch_linktype.getText().replaceAll("\\s+$", "")){
		 
		 case "Backplane Link": slf4jLogger.info("Backplane Link Sanity validation is done"); break;
		 case "Fiber": slf4jLogger.info("Fiber Link Sanity validation is done"); break;
		 case "StackRing Link": slf4jLogger.info("StackRing Link Sanity validation is done"); break;
		 case "Unshielded Twisted Pair (UTP)":slf4jLogger.info("Unshielded Twisted Pair (UTP) Link Sanity validation is done"); break;		 
			 
		 }
		
		 
		//#################################		Related Tab validations  ###############################################//
			
			//################################ Related Tabs Validations in Link view ############################################//
			  
		 if(!tab_Circuits.isCurrentlyVisible()){
				throw new Error("Circuit Related Tab is missing in the Link view page in "+lbl_linksearch_linktype.getText());
			}
		 
		 
		//################################ Related Tabs should not be displayed Circuit view ############################################//
			
			if(tab_Activations.isCurrentlyVisible() ){
				throw new Error("Activation Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_Armor.isCurrentlyVisible() ){
				throw new Error("ARMOR Related Tab is Displayed in the Circuit Link page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_bamreport.isCurrentlyVisible() ){
				throw new Error("BAM Report Related tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_circuitdetails.isCurrentlyVisible() ){
				throw new Error("Circuit Details Related tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}			
			
			if(tab_Devices.isCurrentlyVisible()  ){
				throw new Error("Devices Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_facilities.isCurrentlyVisible()  ){
				throw new Error("Facilities Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_Locations.isCurrentlyVisible()){
				throw new Error("Location Related tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_orders.isCurrentlyVisible()){
				throw new Error("Orders Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_Service_Areas.isCurrentlyVisible()){
				throw new Error("Service Area Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_services.isCurrentlyVisible()){
				throw new Error("Services Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}		
			
			if(tab_Subscriber.isCurrentlyVisible()){
				throw new Error("Subscriber Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
					
			if(tab_Tasks.isCurrentlyVisible()){
				throw new Error("Task Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
			
			if(tab_TIRKS.isCurrentlyVisible() ){
				throw new Error("TIRKS Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}						
					
					
			if(tab_ctag.isCurrentlyVisible()){
						throw new Error("CTAG Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}		
					
			if(tab_contact.isCurrentlyVisible()){
						throw new Error("Contact Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
			}
					
			if(tab_Device_ports.isCurrentlyVisible()){
					throw new Error("Audit Logs Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
				}				
					
			if(tab_Performance.isCurrentlyVisible()){
						throw new Error("Performance Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
				}
					
			if(tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is Displayed in the Link view page in "+lbl_linksearch_linktype.getText());
				}
			
			
			 jsClick(btn_linkviewpage_Edit);
				waitFor(ddl_link_Edit_ProvisionStatus);
			if (ddl_link_Edit_ProvisionStatus.isCurrentlyEnabled()) {
				ddl_link_Edit_ProvisionStatus.selectByIndex(1);
			}
			else throw new Error("btn_link_Edit_ProvisionStatus drop down is not displayed in link");
			if (ddl_link_Edit_AerialBuried.isCurrentlyEnabled()) {
				ddl_link_Edit_AerialBuried.selectByIndex(1);
			}
			
			else throw new Error("btn_link_Edit_ProvisionStatus drop down is not displayed in link");
		
		
	}
	
	public void Link_Action(String action) throws Throwable {
		switch(action){
		case "Delete":waitForElement(btn_linkviewpage_Delete);Thread.sleep(2000);jsClick(btn_linkviewpage_Delete);getDriver().switchTo().alert().accept();		
											Thread.sleep(4000);	waitForElement(lbl_alermsg);
													break;
													
		case "Edit":waitForElement(btn_linkviewpage_Edit);Thread.sleep(2000);jsClick(btn_linkviewpage_Edit); waitForElement(btn_serachlink_editpage_save);break;
		case "Save": jsClick(btn_serachlink_editpage_save);waitForElement(btn_linkviewpage_Edit);waitForElement(lbl_alermsg);break;
		}
		
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),500);				   
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
}
