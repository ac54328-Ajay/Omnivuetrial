package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
//import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateLogicalPortPage extends OmniVuePage {
	
	//private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
//	.//*[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']/i
	
//	.//*[@ng-model='invServiceDevLookUp.deviceClli']
	
	//#########################  Logical port Ethernet Bearer create form  fields  ##############################//
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='createLogicalPort();']")
	public WebElementFacade btn_logicalportcreate_create;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='logicalPortName']")
	public WebElementFacade tbx_logicalportcreate_name;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='alias1']")
	public WebElementFacade tbx_logicalportcreate_alias1;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='alias2']")
	public WebElementFacade tbx_logicalportcreate_alias2;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
	public WebElementFacade btn_logicalportcreate_devicelookup;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@ng-model='invServiceDevLookUp.deviceClli']")
	public WebElementFacade tbx_logicalportcreate_devicelookup_deviceclli;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='lookUpDeviceDetails()']")
	public WebElementFacade btn_logicalportcreate_devicelookup_lookupicon;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@title='previous']/div")
	public WebElementFacade btn_logicalportcreate_devicelookup_previous;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//a[contains(@ng-click,'lookupGridSettings.selLukupValue(')])[1]")
			public WebElementFacade lbl_logicalportcreate_devicelookup_result;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openPhysicalPortLookUp(field.name)']")
			public WebElementFacade btn_logicalportcreate_deviceport;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='servicePhysicalPortlookUp()']")
			public WebElementFacade btn_logicalportcreate_deviceport_lookupicon;
			
			@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//a[@ng-click='closePhysicalPortDataLookUp(port)'])[1]")
					public WebElementFacade lbl_logicalportcreate_deviceport_result;
			
	//#########################  Logical port LAG create form  fields  ##############################//
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		Pending Need to think 	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@// 	
			
			
			@FindBy(id="logicalPortName")
		    public WebElementFacade tbx_EBCreate_logportname;			
			
			@FindBy(id="alias1")
		    public WebElementFacade tbx_EBCreate_alias1;
			
			@FindBy(id="alias2")
		    public WebElementFacade tbx_EBCreate_alias2;
			
			@FindBy(xpath=".//*[contains(@ng-click,'openCircuitRelatedDeviceLookUp(field.name)')]/i")
	        public WebElementFacade btn_devicelookup_glass;
			
			@FindBy(xpath=".//*[contains(text(),'Device CLLI %')]/following-sibling::input")
	        public WebElementFacade tbx_EBCreate_devicelookup_deviceclli;
			
			@FindBy(xpath=".//*[@ng-click='lookUpDeviceDetails()']")
	        public WebElementFacade btn_EBCreate_devicelookup_lookup;
			
			
			@FindBy(xpath="(.//*[@id='contenttablecreateDevLookUpId']//a)[1]")
			public WebElementFacade lbl_EBCreate_devicelookup_result;
			
		    
			@FindBy(xpath=".//*[@ng-click='openPhysicalPortLookUp(field.name)']/i")
			public WebElementFacade btn_EBCreate_deviceportlookup;
			
			@FindBy(xpath=".//*[@ng-click='servicePhysicalPortlookUp()']/i")
			public WebElementFacade btn_EBCreate_deviceportlookup_lookup;
			
			@FindBy(xpath="(.//*[@id='servicePort_look_up']//a)[1]")
			public WebElementFacade lbl_EBCreate_deviceportlookup_result;			
			
			@FindBy(xpath=".//*[@ng-click='createLogicalPort();']")
			public WebElementFacade btn_Create;
			
		    @FindBy(xpath="//div[@class='ng-binding alert alert-success']")
		    public WebElementFacade lbl_success_alert_msg;          
            @FindBy(xpath="(.//div[@ng-init='ind=$index']/div/div/span/i)[1]")
            public WebElementFacade btn_device_lookup_LAG_Logicalport;
            
            @FindBy(xpath="(.//div[@ng-init='ind=$index']/div/div/span/i)[2]")
            public WebElementFacade btn_port_lookup_LAG_Logicalport;  
            
            
            @FindBy(xpath=".//tab-heading[contains(text(),'Create LAG Logical Port')]")
            public WebElementFacade lbl_tab_heading_LAG_Logicalport;  
            
            @FindBy(xpath=".//tab-heading[contains(text(),'Create Ethernet Logical Port')]")
            public WebElementFacade lbl_tab_heading_Ethernet_Logicalport;
              

            @FindBy(xpath=".//tab-heading[contains(text(),'Create VLAN Logical Port')]")
            public WebElementFacade lbl_tab_heading_VLAN_Logicalport;
            
            @FindBy(xpath="(.//div/label[contains(text(),'Slot')]/following-sibling::select[@ng-model='invServicePortLookUp.slot'])[2]")
            public WebElementFacade ddl_Slot_LAG_Logical_port;  
            
            @FindBy(xpath=".//div/label[contains(text(),'Port Type')]/following-sibling::select[@ng-model='invServicePortLookUp.portType']")
            public WebElementFacade ddl_port_type_LAG_Logical_port;  
            
            @FindBy(xpath="(.//div/button[@value='Lookup'])[2]")
            public WebElementFacade btn_LAG_Logicalport_Port_Lookup;  
            
            @FindBy(xpath="(.//table[@id='servicePort_look_up']/tbody/tr/td/a[@ng-click='closePortDataLookUp(port)'])[1]")
            public WebElementFacade lbl_LAG_Logicalport_Portresult; 
            
            @FindBy(xpath=".//span[@ng-switch-when='circuitBuildingClliLookup']/div/span/i")
            public WebElementFacade btn_VLAN_logical_port_devicelookup_icon; 
            
            
            @FindBy(xpath=".//span[@ng-switch-when='servicePortLookup']/div/span/i")
            public WebElementFacade btn_VLAN_logical_port_portlookup_icon;


		    public void verifyvalidation(String action) throws Throwable {    
                String Message;
                      switch(action){
                      case "Create button in Ethernet Bearer":jsClick(btn_Create);
                                                                                           jsClick(btn_Create);
                                                                                           waitForElement(lbl_success_alert_msg);break;
                                                                                           
                      case "Logical Port is created successfully with Port Id message is getting displayed":
                                                                                    Message = lbl_success_alert_msg.getText();
                                                                                    Message = Message.toString().substring(1);
                                                                                    
                                                                                    Message = Message.trim(); 
                                                                                    if(!Message.contains("Logical Port is created successfully with Port Id")){
                                                                                           throw new Error("Wrong message is displayed as "+Message);
                                                                                    } break;
                      case "Create button in LAG Logical":jsClick(btn_Create);
                             jsClick(btn_Create);
                             waitForElement(lbl_success_alert_msg);break;
                      case "Create button in VLAN Logical":jsClick(btn_Create);
                             jsClick(btn_Create);
                             waitForElement(lbl_success_alert_msg);break;  
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
}
