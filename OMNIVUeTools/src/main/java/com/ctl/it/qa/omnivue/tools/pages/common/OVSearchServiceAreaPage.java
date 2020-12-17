package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

@SuppressWarnings("deprecation")
public class OVSearchServiceAreaPage extends OmniVuePage {
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath = ".//input[@ng-model='searchParam.serviceAreaName']")
	public WebElementFacade tbx_serviceareaname;
	
	@FindBy(xpath = "//*[@ng-repeat='row in viewRows']//label[contains(text(),'Service Area Name')]/../../following-sibling::span//label")
	public WebElementFacade label_Serviceareaname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//ul[@class='nav nav-tabs']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_Serviceareaview_AuditLogs;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//ul[@class='nav nav-tabs']//tab-heading[contains(text(),'Service Area Detail')]")
	public WebElementFacade tab_Serviceareaview_ServiceAreaDetail;
	
	@FindBy(xpath="//button[@ng-click='editServiceArea(serviceAreaDetail.serviceAreaName);']")
	public WebElementFacade btn_ServiceareaEdit;
	
	@FindBy(xpath="//button[@ng-click='removeServiceArea()']")
	public WebElementFacade btn_ServicearearDelete;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Devices']")
	public WebElementFacade tab_Devices;
	

	
	@FindBy(xpath=".//*[@ng-controller='relatedServiceDeviceCtrl']/div/ul/li")
	public WebElementFacade Devices_tab_heading;
	
	
	@FindBy(xpath=".//*[@ng-click='executeDeviceSearch(entity[field.name])']")
	public WebElementFacade associated_Devices;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Locations']")
			@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//li)[4]]")
	public WebElementFacade tab_Locations;
	
	@FindBy(xpath="//*[@class='main-tab ng-isolate-scope']//li[2][@ng-repeat='tab in tabs']")
	public WebElementFacade tab_currenttab;
	
	@FindBy(xpath=".//*[@id='right-content']//ul[@role='tablist']/li")
	public List<WebElementFacade> Relatedtab_Count;
	
	//####################			Search Sevice area page 		#########################//
	
	//------- Audit logs : Search Sevice area page --------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_Servicearea_auditlogs;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_Servicearea_auditlogs_getlogs;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE'])[1]")
	public WebElementFacade lbl_Servicearea_auditlogs_createlog;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE']/../following-sibling::div)[2]/div")
	public WebElementFacade lbl_Servicearea_auditlogs_createUserlog;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]")
	public WebElementFacade lbl_Servicearea_auditlogs_editlog;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE']/../following-sibling::div)[2]/div")
	public WebElementFacade lbl_Servicearea_auditlogs_editUserlog;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='DELETE'])[1]")
	public WebElementFacade lbl_Servicearea_auditlogs_deletelog;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='DELETE']/../following-sibling::div)[2]/div")
	public WebElementFacade lbl_Servicearea_auditlogs_deleteUserlog;
	
	//-----------	Service area Details ----------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Service Area Detail')]")
	public WebElementFacade tab_Serviceareadetails;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='editServiceArea(serviceAreaDetail.serviceAreaName);']")
	public WebElementFacade btn_serchServicearea_edit;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='removeServiceArea()']")
	public WebElementFacade btn_serchServicearea_delete;
	
	
	//-----------	Service Area Details Section ----------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-hide='serviceAreaEdit']//div[text()='Service Area Details']")
	public WebElementFacade lbl_serchServicearea_detailssections;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-hide='serviceAreaEdit']//label[text()='Service Area Name']/../../following-sibling::span//label")
	public WebElementFacade lbl_serchServicearea_serviceareaname;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-hide='serviceAreaEdit']//label[text()='Device Name']/../../following-sibling::span//label/a")
	public WebElementFacade lbl_serchServicearea_devicename;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-hide='serviceAreaEdit']//label[text()='Device Location']/../../following-sibling::span//label")
	public WebElementFacade lbl_serchServicearea_devicelcn;
	
	
	//-----------	Associated Address Section ----------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-hide='serviceAreaEdit']//div[text()='Associated Address(es)']")
	public WebElementFacade lbl_serchServicearea_associatedaddrssection;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-hide='serviceAreaEdit']//div[contains(@id,'columntablejqxGrid')]//span")
	public List<WebElementFacade> lbl_serchServicearea_associatedaddrssection_header;
	
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//a[contains(@ng-click,'gridSettings.viewTaskDetail')])[1]")
			public WebElementFacade lbl_serchServicearea_associatedaddrssection_locationlink1;
			
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//a[contains(@ng-click,'gridSettings.viewTaskDetail')])[2]")
					public WebElementFacade lbl_serchServicearea_associatedaddrssection_locationlink2;
	
	//--------------		Edit Service area Section  ----------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='serviceAreaEdit']//button[@ng-click='saveData()']")
	public WebElementFacade btn_editServicearea_save;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='serviceAreaEdit']//button[@ng-click='cancelEditServiceArea()']")
	public WebElementFacade btn_editServicearea_cancel;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='serviceAreaEdit']//input[@id='ServiceAreaName']")
	public WebElementFacade tbx_editServicearea_serviceareaname;
	
	
	//		Association of locations
	
	// ###############################	Search Service Address(es) to associate	#################################################//
	
	
	
	@FindBy(xpath = ".//*[@id='row0jqxGrid1']/div[4]")
	public WebElementFacade locationname_Servicearea;
	
	@FindBy(xpath = ".//*[@id='contenttablejqxGrid8']/div/div[3]")
	public WebElementFacade locationname_relatedtab_Servicearea;
	
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[text()='Add More Addresses']")
	public WebElementFacade btn_editServicearea_addmoreaddress;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//i[@ng-click='removeAssociateAddress($index)'])[1]")
			public WebElementFacade btn_editServicearea_removeassociatelcn1;
			
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//i[@ng-click='removeAssociateAddress($index)'])[2]")
					public WebElementFacade btn_editServicearea_removeassociatelcn2;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='searchLocations()']")
	public WebElementFacade btn_editServicearea_addmreaddress_searchlcn;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='lookUp.BuildingCLLI']")
	public WebElementFacade tbx_editServicearea_addmreaddress_buildingclii;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[contains(@id,'contentlookUpArea')]//div[@role='columnheader']//input/..)[1]")
			public WebElementFacade cbx_editServicearea_addmreaddress_result;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//select[@ng-model='lookUp.STATE']")
	public WebElementFacade ddl_editServicearea_addmreaddress_state;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//label[text()='Address']/following-sibling::input")
	public WebElementFacade tbx_editServicearea_addmreaddress_addrssno;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablelookUpArea')]//span/..)[1]")
	public WebElementFacade cbx_editServicearea_addmreaddress_reslcn1;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablelookUpArea')]//span/..)[2]")
	public WebElementFacade cbx_editServicearea_addmreaddress_reslcn2;
					
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='associateAddressToServiceArea()']")
	public WebElementFacade btn_editServicearea_addmreaddress_associatelcn;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])[1]")
			public WebElementFacade tbx_editServicearea_rank1;
			
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])[2]")
					public WebElementFacade tbx_editServicearea_rank2;
					
					
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showServiceAreaAlert']")
	public WebElementFacade lbl_alertmsg;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showServiceAreaAlert']/button")
	public WebElementFacade btn_alertmsg_clsicon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
	public WebElementFacade btn_RT_view;
	
	
	
	
	public void Sanity_ServiceareaView_relatedtabvalidations() throws Throwable{
		
		waitForElement(label_Serviceareaname); Thread.sleep(3000);
		String Devicename=associated_Devices.getText();
		String DeviceTabHeading=Devices_tab_heading.getText();
		String locationname=locationname_Servicearea.getText();
		
				
		
		 slf4jLogger.info("Related tab validation");
		 System.out.println("#################Device name "+Devicename);
		 System.out.println("#################Devicetab header "+DeviceTabHeading);
		
		 
		 tab_Devices.click();
		 
		 
			if(!tab_Devices.isCurrentlyVisible() && !tab_Devices.isCurrentlyEnabled()){
				throw new Error("Services Related Tab is missing in the Device view page");
			}
			if(!DeviceTabHeading.equals(Devicename)){
				throw new Error("Associated Device is missing");
			}
			
			
			
//			tab_Locations.click();
//			//Actions actions = new Actions(this.getDriver());  
//		   // actions.click(locationname_relatedtab_Servicearea).perform();
//			Thread.sleep(30000);
//			
//			
//			System.out.println("#################Location Tab is clicked ");
//			 System.out.println("Location name "+locationname);
//			 System.out.println("location related tabe "+locationname_relatedtab_Servicearea.getText());
//			
//			if(!tab_Locations.isCurrentlyVisible() && !tab_Locations.isCurrentlyEnabled() ){
//				throw new Error("Orders Related Tab is missing in the Device view page");
//			}
//			if(locationname_relatedtab_Servicearea.getText()!=locationname){
//				throw new Error("Associated location is missing");
//			}
//			int count = Relatedtab_Count.size();
//		    if(!(count==2)){
//			throw new Error("Related Tabs are not match to 2");
//		}
		
	}
	
     public void Sanity_ServiceareaView_validations() throws Throwable{
    	 waitForElement(label_Serviceareaname); Thread.sleep(3000);
    	 String tabname = tab_currenttab.getText();
    	 String Servicearea_name= label_Serviceareaname.getText();
    	 slf4jLogger.info("Left Side validation");
    	 //******************************Tab and name compare***************************************
    	 /*System.out.println(tabname);
    	 System.out.println(Servicearea_name);*/
    	 if(!tabname.contains(Servicearea_name)){
    		 throw new Error("Tabname is not matching with Subscriber fullname"); 
    	 }else
    		 System.out.println("Tabname is matching with Subscriber fullname");
        //*********************************Sub tab's Validation*************************************
       
         if(!tab_Serviceareaview_ServiceAreaDetail.isCurrentlyVisible() && !tab_Serviceareaview_ServiceAreaDetail.isCurrentlyEnabled()){
				throw new Error("Subscriber Details Tab is missing in the Device view page");
		  }
	     if(!tab_Serviceareaview_AuditLogs.isCurrentlyVisible() && !tab_Serviceareaview_AuditLogs.isCurrentlyEnabled()){
				throw new Error("AuditLogs Tab is missing in the Device view page");
	      }
       //*************************Buttons Validation************************************************
         if(!btn_ServiceareaEdit.isCurrentlyVisible() && !btn_ServiceareaEdit.isCurrentlyEnabled()){
 			throw new Error("Edit button is missing in the Subscriber view page");
 		}
 		 if(!btn_ServicearearDelete.isCurrentlyVisible() && !btn_ServicearearDelete.isCurrentlyEnabled()){
 			throw new Error("Delete button is missing in the Subcriber view page");
 		}
 		 
 		verify_validation("Service area view screen atrributes are displayed");
 		 
 		//################################ Related Tabs Validations in Device view ############################################//
		  
 		 slf4jLogger.info("Related tab validation");
 				if(!tab_Devices.isCurrentlyVisible() && !tab_Devices.isCurrentlyEnabled()){
 					throw new Error("Services Related Tab is missing in the Device view page");
 				}
 				
 				if(!tab_Locations.isCurrentlyVisible() && !tab_Locations.isCurrentlyEnabled() ){
 					throw new Error("Orders Related Tab is missing in the Device view page");
 				}
 				int count = Relatedtab_Count.size();
 			    if(!(count==2)){
 				throw new Error("Related Tabs are not match to 2");
 			}
     }
	public void Enter_Servicearea_name(String name) throws Throwable{
	    tbx_serviceareaname.sendKeys(name);
    }
	
	public void Servicearea_Action(String action) throws Throwable {
		switch(action){
		case "Audit logs tab":jsClick(tab_Servicearea_auditlogs);waitForElement(btn_Servicearea_auditlogs_getlogs);break;
		case "Getlogs":jsClick(btn_Servicearea_auditlogs_getlogs);waitForElement(lbl_Servicearea_auditlogs_createlog);break;
		case "Delete": jsClick(btn_serchServicearea_delete); getDriver().switchTo().alert().accept(); waitForElement(lbl_alertmsg); break;
		case "Edit": jsClick(btn_serchServicearea_edit); waitForElement(btn_editServicearea_save);break;
		case "Save":jsClick(btn_editServicearea_save); waitForElement(lbl_alertmsg);break;
		case "Add-More Address":waitForElement(btn_editServicearea_addmoreaddress); browser_zoom_in(4); Thread.sleep(2000); jsClick(btn_editServicearea_addmoreaddress); Thread.sleep(2000);
								waitForElement(btn_editServicearea_addmreaddress_searchlcn);break;
		
		}
		
	}
	
	public void verify_validation(String validation) throws Throwable {		
		String Message; int i=1;
		List<WebElementFacade> Servicearea_Asscitedaddrs_attribute;
		ArrayList<String> Serviceareasearch_Fieldattributelist=new ArrayList<String>();
		ArrayList<String> List2compare_Servicearea_Fieldattributelist=new ArrayList<String>();
		switch(validation){
		case "associated addresses data is matching with Locations related in Service area":
							verify_validation("data is displayed in the locations Related Tab of Service Area Screen");			
							i=1;			
							while(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//a[contains(@ng-click,'gridSettings.viewTaskDetail(')])["+i+"]"))){
								Message=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//a[contains(@ng-click,'gridSettings.viewTaskDetail(')])["+i+"]")).getText().trim();
								if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[contains(text(),'"+Message+"')]"))){
									slf4jLogger.error("Device details are not present in Service area screen");
									throw new Error("Device details are not present in Service area screen");
								}
								i++;
							}			
							break;
		case "data is displayed in the Devices Related Tab of Service Area Screen is matcching with Device name":
							Message=lbl_serchServicearea_devicename.getText().trim();			
							if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[contains(text(),'"+Message+"')]"))){
								slf4jLogger.error("Device details are not present in Service area screen");
								throw new Error("Device details are not present in Service area screen");
							}
							break;
			
		case "data is displayed in the locations Related Tab of Service Area Screen":
						waitForElement(btn_RT_view);			
					break;
					
		case "associate more than addresses in edit Service area screen":
							waitForElement(btn_editServicearea_addmreaddress_searchlcn);
							tbx_editServicearea_addmreaddress_buildingclii.type("LSVGNV01");
							jsClick(btn_editServicearea_addmreaddress_searchlcn);Thread.sleep(2000); 
							waitForElement(cbx_editServicearea_addmreaddress_result);
							cbx_editServicearea_addmreaddress_result.click();Thread.sleep(2000); 
							jsClick(btn_editServicearea_addmreaddress_associatelcn);Thread.sleep(2000); 
							
							browser_zoom_out(4); 
							i=1;
							getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])["+i+"]")).clear();
							while(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])["+i+"]"))){
								getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])["+i+"]")).sendKeys(Integer.toString(i));
							i++;
							}
							
							break;
		case "modify the Associated Address in edit Service area screen" : waitForElement(btn_editServicearea_addmoreaddress); jsClick(btn_editServicearea_removeassociatelcn1); getDriver().switchTo().alert().accept(); Thread.sleep(1000);
																							jsClick(btn_editServicearea_removeassociatelcn2); getDriver().switchTo().alert().accept();Thread.sleep(1000);
																							jsClick(btn_editServicearea_addmoreaddress); waitForElement(btn_editServicearea_addmreaddress_searchlcn);
																							ddl_editServicearea_addmreaddress_state.selectByVisibleText("CO-Colorado");tbx_editServicearea_addmreaddress_addrssno.type("123");
																							jsClick(btn_editServicearea_addmreaddress_searchlcn); waitForElement(cbx_editServicearea_addmreaddress_reslcn1);
																							jsClick(cbx_editServicearea_addmreaddress_reslcn1); Thread.sleep(1000);
																							jsClick(cbx_editServicearea_addmreaddress_reslcn2); Thread.sleep(1000);
																							jsClick(btn_editServicearea_addmreaddress_associatelcn);Thread.sleep(2000); 
																							tbx_editServicearea_rank1.type("1");
																							tbx_editServicearea_rank2.type("2");																							
																							
																							break;
																							
		case "Assocaited locations should be displayed in Service area screen": if(!lbl_serchServicearea_associatedaddrssection_locationlink1.isCurrentlyVisible() && !lbl_serchServicearea_associatedaddrssection_locationlink1.isCurrentlyVisible()){
																					slf4jLogger.error("Associated locations are not present in Service area screen");
																					throw new Error("Associated locations are not present in Service area screen");
																				}
		
																					break;
		case "Delete logs are captured in the Service area Audit logs": if(!lbl_Servicearea_auditlogs_deletelog.isCurrentlyVisible()){
																			slf4jLogger.error("Delete log of service area is not captured");
																			throw new Error("Delete log of service area is not captured");
																		}
																		if(!lbl_Servicearea_auditlogs_deleteUserlog.isCurrentlyVisible()){
																			slf4jLogger.error("Delete log with userid of service area is not captured");
																			throw new Error("Delete log with userid of service area is not captured");
																		}	jsClick(tab_Serviceareadetails); waitForElement(btn_serchServicearea_edit);break;
		case "Update logs are captured in the Service area Audit logs": if(!lbl_Servicearea_auditlogs_editlog.isCurrentlyVisible()){
																				slf4jLogger.error("Update log of service area is not captured");
																				throw new Error("Update log of service area is not captured");
																			}
																			if(!lbl_Servicearea_auditlogs_editUserlog.isCurrentlyVisible()){
																				slf4jLogger.error("Update log with userid of service area is not captured");
																				throw new Error("Update log with userid of service area is not captured");
																			}	jsClick(tab_Serviceareadetails); waitForElement(btn_serchServicearea_edit);break;
		case "Service Area updated successfully message should be displayed in Service area screen": 
																				Message = lbl_alertmsg.getText();
																				
																				Message = Message.trim(); 
																				if(!Message.contains("Service Area updated successfully")){
																					throw new Error("Wrong message is displayed as "+Message);
																				} jsClick(btn_alertmsg_clsicon);
																				break;
		case "modify the service area name in edit Service area screen": waitForElement(btn_editServicearea_save);tbx_editServicearea_serviceareaname.type("Modify Auto");
																						break;
		case  "Service area view screen atrributes are displayed":waitForElement(btn_serchServicearea_edit);
											if(!tab_Servicearea_auditlogs.isCurrentlyVisible()){
												slf4jLogger.error("Audit Log tab in not displayed Service area view screen");
												throw new Error("Audit Log tab in not displayed Service area view screen");
											}
											
											if(!tab_Serviceareadetails.isCurrentlyVisible()){
												slf4jLogger.error("Service area Details tab in not displayed Service area view screen");
												throw new Error("Service area Details tab in not displayed Service area view screen");
											}
											if(!btn_serchServicearea_edit.isCurrentlyVisible() && !btn_serchServicearea_edit.isCurrentlyEnabled()){
												slf4jLogger.error("Edit button in not displayed Service area view screen");
												throw new Error("Edit button in not displayed Service area view screen");
											}
											
											if(!btn_serchServicearea_delete.isCurrentlyVisible() && !btn_serchServicearea_delete.isCurrentlyEnabled()){
												slf4jLogger.error("Delete button in not displayed Service area view screen");
												throw new Error("Delete button in not displayed Service area view screen");
											}
											
											if(!lbl_serchServicearea_detailssections.isCurrentlyVisible()){
												slf4jLogger.error("Service Area Details section in not displayed Service area view screen");
												throw new Error("Service Area Details section in not displayed Service area view screen");
											}
											if(!lbl_serchServicearea_serviceareaname.isCurrentlyVisible()){
												slf4jLogger.error("Service area name in Service Area Details section in not displayed Service area view screen");
												throw new Error("Service area name in Service Area Details section in not displayed Service area view screen");
											}
											if(!lbl_serchServicearea_devicename.isCurrentlyVisible()){
												slf4jLogger.error("Device name in Service Area Details section in not displayed Service area view screen");
												throw new Error("Device area name in Service Area Details section in not displayed Service area view screen");
											}
											
											if(!lbl_serchServicearea_devicelcn.isCurrentlyVisible()){
												slf4jLogger.error("Device location in Service Area Details section in not displayed Service area view screen");
												throw new Error("Device location in Service Area Details section in not displayed Service area view screen");
											}
											
											
											if(!lbl_serchServicearea_associatedaddrssection.isCurrentlyVisible()){
												slf4jLogger.error("Associated Address(es) section in not displayed Service area view screen");
												throw new Error("Associated Address(es) section in not displayed Service area view screen");
											}
											
											if(!lbl_serchServicearea_associatedaddrssection.isCurrentlyVisible()){
												slf4jLogger.error("Associated Address(es) section in not displayed Service area view screen");
												throw new Error("Associated Address(es) section in not displayed Service area view screen");
											}
											
											Servicearea_Asscitedaddrs_attribute = lbl_serchServicearea_associatedaddrssection_header;
											
											
												for(int j=0;j<Servicearea_Asscitedaddrs_attribute.size();j++){
													Serviceareasearch_Fieldattributelist.add(j, Servicearea_Asscitedaddrs_attribute.get(j).getText().trim());
														//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
													}	
											
											List2compare_Servicearea_Fieldattributelist.add(0, "Terminal Address");
											List2compare_Servicearea_Fieldattributelist.add(1, "Secondary Address");
											List2compare_Servicearea_Fieldattributelist.add(2, "Location Type");
											List2compare_Servicearea_Fieldattributelist.add(3, "Location Name");
											List2compare_Servicearea_Fieldattributelist.add(4, "Rank");
											
											for(i=0;i<Serviceareasearch_Fieldattributelist.size();i++){
												if(!Serviceareasearch_Fieldattributelist.get(i).equals(List2compare_Servicearea_Fieldattributelist.get(i))){
													slf4jLogger.info("Serviceareasearch_Fieldattributelist="+Serviceareasearch_Fieldattributelist.get(i));
													slf4jLogger.info("List2compare_Subscriber_Fieldattributelist="+List2compare_Servicearea_Fieldattributelist.get(i)+" Not matching");
													throw new Error("Fields are not matching check");
												}
											  }
											
											
											
											break;
		case "Create logs are captured in the Service area Audit logs":
											if(!lbl_Servicearea_auditlogs_createlog.isCurrentlyVisible()){
												slf4jLogger.error("Create log of service area is not captured");
												throw new Error("Create log of service area is not captured");
											}
											if(!lbl_Servicearea_auditlogs_createUserlog.isCurrentlyVisible()){
												slf4jLogger.error("Create log with userid of service area is not captured");
												throw new Error("Create log with userid of service area is not captured");
											}	jsClick(tab_Serviceareadetails); waitForElement(btn_serchServicearea_edit);break;
		
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
	
	public void browser_zoom_in(int n) throws InterruptedException {
		//slf4jLogger.info("Performing Zoom");

		Robot r;
		try {
			r = new Robot();

			for (int i = 0; i < n; i++) {
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ADD);

				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(500);
			}


			Thread.sleep(1000);

			
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}

	public void browser_zoom_out(int n) throws InterruptedException {
		//slf4jLogger.info("Performing Zoom Out");

		Robot r;
		try {
			r = new Robot();

			for (int i = 0; i < n; i++) {
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_SUBTRACT);

				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(500);
			}
		
			Thread.sleep(1000);

			
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
}
