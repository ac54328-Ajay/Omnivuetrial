package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
 

public class OVSearchAlternateequipbuild_Networkorder extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//************************************************************************************************************************************************************//
	
	//###############################################################		Search Network Order View Sanity Validation  #######################################################//
		
	//--------------------------------------------------------------		Network Order Result page ---------------------------------------------------------------------------//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Alternate Equipment Result')]")
	//@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
	public WebElementFacade tab_alternateequpbuild_result ;
	
	@FindBy(xpath=".//*[@id='contentgponNetworkGrid']//*[@id='row0gponNetworkGrid']/div[1]/div/a")
	public WebElementFacade btn_networkbuildid_searchresultpage;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@title='previous']/div")
	public WebElementFacade btn_networkbuildid_searchresultpage_previous;	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Alternate Equipment Build:')]")	
	public WebElementFacade tab_alternateequpbuildView ;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Alternate Equipment Build:')]/a")	
	public WebElementFacade btn_alternateequpbuildView_clsicon ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@title='previous']/div")	
	public WebElementFacade btn_alternateequpbuild_result_previous ;
	
	
	//************************************************************************************************************************************************************//
	
	//--------------------------------------------------------------Create alt build Network Order Tab ---------------------------------------------------------------------------//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='submitAtlEquipBuild();']")
	public WebElementFacade btn_Create_ALtNWBuild_submitbuild ;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='Order/CSOF Id']/following-sibling::div//a")
	public WebElementFacade lbl_Create_ALtNWBuild_orderid ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Build Components')]/button/span[contains(text(),'Device')]")
	public WebElementFacade btn_Create_ALtNWBuild_Build_components_AddDevice ;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Status')]/following-sibling::div")
	public WebElementFacade lbl_Create_ALtNWBuild_status ;
	
	//************************************************************************************************************************************************************//
	
	//--------------------------------------------------------------Network Order Tab ---------------------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@class='nav nav-tabs']//*[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//*[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab_search_result_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//h4[contains(text(),'Details')]")
	public WebElementFacade lbl_search_networkorder_Details_order;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Order Number:']/following-sibling::label[1]")
	public WebElementFacade lbl_search_networkorder_generalsection_ordernumber ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order Details')]")
	public WebElementFacade tab_search_networkorder_OrderDetails;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'OrderNotes')]")
	public WebElementFacade tab_search_networkorder_OrderNotes;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_search_networkorder_Auditlogs;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order XML View')]")
	public WebElementFacade tab_search_networkorder_Orderxmlview; 	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Order History')]")
	public WebElementFacade tab_search_networkorder_OrderHistory;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-click='cancelDeviceOrder();']")
	public WebElementFacade btn_search_networkorder_cancel;
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	//---------------------------------------------------- Network Order validations	-----------------------------------------------------------------------------------------------------------------------//
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='DEVICE NAME:']/following-sibling::label/a)[1]")
			public WebElementFacade lbl_networkorderview_startdevice;
			
			
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='DEVICE NAME:']/following-sibling::label/a)[2]")
					public WebElementFacade lbl_networkorderview_enddevice;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@class='tab-pane ng-scope active']//th[text()='Device Name']/../../following-sibling::tbody//a)[1]")
					public WebElementFacade lbl_DevicesRT_devicenamelink;
	
	//----------------------------------------------------Related Tab validations	------------------------------------------------------------------------------------------------------------------------//
	
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
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']//a[text()='Device Ports']")
		public WebElementFacade tab_Device_ports;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']//a[text()='Service Areas']")
		public WebElementFacade tab_Service_Areas;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']//a[text()='TIRKS']")
		public WebElementFacade tab_TIRKS;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']//a[text()='Performance Monitoring']")
		public WebElementFacade tab_Performance;	
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']//a[text()='VLAN / Virtual Ports']")
		public WebElementFacade tab_Virtual_Ports;
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	public void Sanity_Networkorderpage_validations() throws Throwable {		
			
		slf4jLogger.info("Waiting for the Order to load");
		waitForElement(btn_Create_ALtNWBuild_Build_components_AddDevice);
		
		slf4jLogger.info("Checking if the order no is displayed");
		slf4jLogger.info("lbl_Create_ALtNWBuild_status:"+lbl_Create_ALtNWBuild_status.getText().replaceAll("\\s",""));
		if(!lbl_Create_ALtNWBuild_status.getText().replaceAll("\\s","").equals("SUCCESS")){
			slf4jLogger.info("About to click Result page");
			jsClick(tab_alternateequpbuild_result);
			Thread.sleep(2000);
			jsClick(btn_networkbuildid_searchresultpage_previous);
			Thread.sleep(2000);
			slf4jLogger.info("Network order not displayed search next order");
			jsClick(btn_networkbuildid_searchresultpage);
			waitForElement(btn_Create_ALtNWBuild_Build_components_AddDevice);
			
		int i=1;
			while(!lbl_Create_ALtNWBuild_status.getText().replaceAll("\\s","").equals("SUCCESS")){
			
				jsClick(tab_alternateequpbuild_result);
				waitForElement(btn_networkbuildid_searchresultpage);
				if(!isElementVisible(By.xpath(".//*[@id='contentgponNetworkGrid']//*[@id='row"+i+"gponNetworkGrid']/div[1]/div/a"))){
					jsClick(btn_networkbuildid_searchresultpage_previous);
					Thread.sleep(2000);
					i=1;
					slf4jLogger.info("Previous page");
				}
				jsClick(getDriver().findElement(By.xpath(".//*[@id='contentgponNetworkGrid']//*[@id='row"+i+"gponNetworkGrid']/div[1]/div/a")));
					waitForElement(btn_Create_ALtNWBuild_Build_components_AddDevice);
					i++;
					slf4jLogger.info("Network order not displayed search next order");
				
			}
		}
		
		jsClick(lbl_Create_ALtNWBuild_orderid);
	
		
		waitForElement(lbl_search_networkorder_generalsection_ordernumber);
		
		neworkordertab_namevalidation();
				
		if(!tab_search_networkorder_OrderDetails.isCurrentlyVisible()){
			throw new Error("Order Details tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_OrderNotes.isCurrentlyVisible()){
			throw new Error("Order Notes tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_Auditlogs.isCurrentlyVisible()){
			throw new Error("Network Order Audit logs tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_Orderxmlview.isCurrentlyVisible()){
			throw new Error("Order XML View tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_OrderHistory.isCurrentlyVisible()){
			throw new Error("Order History tab is not displayed in Network Order view page");
		}
		

		if(!btn_search_networkorder_cancel.isCurrentlyVisible() && !btn_search_networkorder_cancel.isCurrentlyEnabled()){
			throw new Error("Cancel button in circuit is not displayed in Network page");
		}
		
		
		//#################################		Related Tab validations  ###############################################//
		
				//################################ Related Tabs Validations in Network Order view ############################################//				
				
				
				if(!tab_bamreport.isCurrentlyVisible() ){
					throw new Error("BAM Report Related tab is missing in Network Order view page");
				}				
				
				if(!tab_Devices.isCurrentlyVisible()  ){
					throw new Error("Devices Related Tab is missing in Network Order view page");
				}								
				
				if(!tab_services.isCurrentlyVisible()){
					throw new Error("Services Related Tab is missing in Network Order view page");
				}	
				
					
				if(!tab_Tasks.isCurrentlyVisible()){
					throw new Error("Task Related Tab is missing in Network Order view page");
				}
				
				if(!tab_TIRKS.isCurrentlyVisible() ){
					throw new Error("TIRKS Related Tab is missing in Network Order view page");
				}						
								
				//################################ Related Tabs should not be displayed Network Order view ############################################//
					
				if(tab_Activations.isCurrentlyVisible() ){
					throw new Error("Activation Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_circuitdetails.isCurrentlyVisible() ){
					throw new Error("Circuit Details Related tab is Displayed in Network Order view page");
				}
				
				if(tab_Circuits.isCurrentlyVisible()){
					throw new Error("Circuit Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_facilities.isCurrentlyVisible()  ){
					throw new Error("Facilities Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_Locations.isCurrentlyVisible()){
					throw new Error("Location Related tab is Displayed in Network Order view page");
				}
				
				if(tab_Subscriber.isCurrentlyVisible()){
					throw new Error("Subscriber Related Tab is Displayed in Network Order view page");
				}
					
				
				if(tab_orders.isCurrentlyVisible()){
					throw new Error("Orders Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_Service_Areas.isCurrentlyVisible()){
					throw new Error("Service Area Related Tab is Displayed in Network Order view page");
				}
				
				
				if(tab_Armor.isCurrentlyVisible() ){
					throw new Error("ARMOR Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_ctag.isCurrentlyVisible()){
					throw new Error("CTAG Related Tab is Displayed in Network Order view page");
				}		
						
				if(tab_contact.isCurrentlyVisible()){
					throw new Error("Contact Related Tab is Displayed in Network Order view page");
				}
						
				if(tab_Device_ports.isCurrentlyVisible()){
					throw new Error("Audit Logs Tab is Displayed in Network Order view page");
				}				
						
				if(tab_Performance.isCurrentlyVisible()){
					throw new Error("Performance Related Tab is Displayed in Network Order view page");
				}
						
				if(tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is Displayed in Network Order view page");
				}	
		
	}
	
	public void Networkorder_sanityview_validation() throws Throwable {		

		
		waitForElement(lbl_search_networkorder_generalsection_ordernumber);
		
		neworkordertab_namevalidation();
				
		if(!tab_search_networkorder_OrderDetails.isCurrentlyVisible()){
			throw new Error("Order Details tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_OrderNotes.isCurrentlyVisible()){
			throw new Error("Order Notes tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_Auditlogs.isCurrentlyVisible()){
			throw new Error("Network Order Audit logs tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_Orderxmlview.isCurrentlyVisible()){
			throw new Error("Order XML View tab is not displayed in Network Order view page");
		}
		
		if(!tab_search_networkorder_OrderHistory.isCurrentlyVisible()){
			throw new Error("Order History tab is not displayed in Network Order view page");
		}
		

		if(!btn_search_networkorder_cancel.isCurrentlyVisible() && !btn_search_networkorder_cancel.isCurrentlyEnabled()){
			throw new Error("Cancel button in circuit is not displayed in Network page");
		}
		
		
		//#################################		Related Tab validations  ###############################################//
		
				//################################ Related Tabs Validations in Network Order view ############################################//				
				
				
				if(!tab_bamreport.isCurrentlyVisible() ){
					throw new Error("BAM Report Related tab is missing in Network Order view page");
				}				
				
				if(!tab_Devices.isCurrentlyVisible()  ){
					throw new Error("Devices Related Tab is missing in Network Order view page");
				}								
				
				if(!tab_services.isCurrentlyVisible()){
					throw new Error("Services Related Tab is missing in Network Order view page");
				}	
				
					
				if(!tab_Tasks.isCurrentlyVisible()){
					throw new Error("Task Related Tab is missing in Network Order view page");
				}
				
				if(!tab_TIRKS.isCurrentlyVisible() ){
					throw new Error("TIRKS Related Tab is missing in Network Order view page");
				}						
								
				//################################ Related Tabs should not be displayed Network Order view ############################################//
					
				if(tab_Activations.isCurrentlyVisible() ){
					throw new Error("Activation Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_circuitdetails.isCurrentlyVisible() ){
					throw new Error("Circuit Details Related tab is Displayed in Network Order view page");
				}
				
				if(tab_Circuits.isCurrentlyVisible()){
					throw new Error("Circuit Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_facilities.isCurrentlyVisible()  ){
					throw new Error("Facilities Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_Locations.isCurrentlyVisible()){
					throw new Error("Location Related tab is Displayed in Network Order view page");
				}
				
				if(tab_Subscriber.isCurrentlyVisible()){
					throw new Error("Subscriber Related Tab is Displayed in Network Order view page");
				}
					
				
				if(tab_orders.isCurrentlyVisible()){
					throw new Error("Orders Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_Service_Areas.isCurrentlyVisible()){
					throw new Error("Service Area Related Tab is Displayed in Network Order view page");
				}
				
				
				if(tab_Armor.isCurrentlyVisible() ){
					throw new Error("ARMOR Related Tab is Displayed in Network Order view page");
				}
				
				if(tab_ctag.isCurrentlyVisible()){
					throw new Error("CTAG Related Tab is Displayed in Network Order view page");
				}		
						
				if(tab_contact.isCurrentlyVisible()){
					throw new Error("Contact Related Tab is Displayed in Network Order view page");
				}
						
				if(tab_Device_ports.isCurrentlyVisible()){
					throw new Error("Audit Logs Tab is Displayed in Network Order view page");
				}				
						
				if(tab_Performance.isCurrentlyVisible()){
					throw new Error("Performance Related Tab is Displayed in Network Order view page");
				}
						
				if(tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is Displayed in Network Order view page");
				}	
	}

	public void verify_validation(String validation) throws Throwable {		
		int i=0;
		switch(validation){
		case "Device information is displayed in Related tab Devices in Order 360 view for Customer Order":		Thread.sleep(2000);		
			waitForElement(lbl_DevicesRT_devicenamelink);			
			Thread.sleep(5000);				
			break;
		case "Device information is displayed in Related tab Devices in Order 360 view for Network Order":

			waitForElement(lbl_networkorderview_startdevice);			
			Thread.sleep(5000);			
			waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[contains(text(),'"+lbl_networkorderview_startdevice.getText().trim()+"')])[1]")));			
			break;
			
		case "Alt Eqpt Build order number search is retrieving all the details":verify_validation("Cancel Order Button is displayed in Network Order Detail page"); Networkorder_sanityview_validation();break;
		case "Cancel Order Button is displayed in Network Order Detail page":
														waitForElement(lbl_Create_ALtNWBuild_orderid);
														if(lbl_Create_ALtNWBuild_orderid.getText().length()<2){i=1;
															jsClick(btn_alternateequpbuildView_clsicon); Thread.sleep(2000);	
															jsClick(btn_alternateequpbuild_result_previous); Thread.sleep(2000);
															jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//a[contains(@ng-click,'searchGponNetworkGridSettings.openCreateAltBuild')])["+i+"]")));waitForElement(lbl_Create_ALtNWBuild_orderid);
														}
														i=2;
														while(lbl_Create_ALtNWBuild_orderid.getText().length()<2){
															jsClick(btn_alternateequpbuildView_clsicon); Thread.sleep(2000);
															
															if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//a[contains(@ng-click,'searchGponNetworkGridSettings.openCreateAltBuild')])["+i+"]"))){
																jsClick(btn_alternateequpbuild_result_previous); Thread.sleep(2000);
																i=1;
															}
															jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//a[contains(@ng-click,'searchGponNetworkGridSettings.openCreateAltBuild')])["+i+"]")));
															Thread.sleep(2000);
															i++;
															waitForElement(lbl_Create_ALtNWBuild_orderid);
														}
														
														jsClick(lbl_Create_ALtNWBuild_orderid); Thread.sleep(2000); waitForElement(btn_search_networkorder_cancel);
														
														if(!btn_search_networkorder_cancel.isCurrentlyEnabled()){
															slf4jLogger.debug("Cancel Button is not displayed");
															throw new Error("Cancel Button is not displayed");
														}
														
														break;
		
		}
		
	}
	
	public void neworkordertab_namevalidation() throws Throwable {
		waitForElement(lbl_search_networkorder_generalsection_ordernumber);
		
		 
		 String Networkorderno=tab_search_result_details.getText().replaceAll("[^\\d]", "").replaceAll("\\s","");
			
			if(lbl_search_networkorder_Details_order.getText().replaceAll("[^\\d]", "").replaceAll("\\s","").equals(Networkorderno)){
				slf4jLogger.info("Network order number Tab Name is matching with the Order Number Text field");
			} else throw new Error("Order Number Text field is not matching with Network order number Tab Name");
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
	
}
