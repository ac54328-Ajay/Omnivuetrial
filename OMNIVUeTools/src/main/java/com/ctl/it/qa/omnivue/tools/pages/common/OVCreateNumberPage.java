package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

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
import net.thucydides.core.annotations.findby.By;

@SuppressWarnings("deprecation")
public class OVCreateNumberPage extends OmniVuePage {

	

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	//############################################# ####################################### ####################################### //
	//#############################################   Number Create Sanity Validations ######################################//
	//############################################# ####################################### ####################################### //	
	
	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading[contains(text(),'Create Number')]")
	public WebElementFacade tab_createnumber ;
	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading[contains(text(),'Create Number')]/a")
	public WebElementFacade btn_tab_createnumber_clsicon ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
	public List<WebElementFacade> lbl_allXapath;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createNumber();']")
	public WebElementFacade btn_createform_Number_Create ; 
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetNumber();']")
	public WebElementFacade btn_createform_Number_Reset ; 
	
	//--------------------------------------  Number Create General section Sanity Validations ------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General Section']")
	public WebElementFacade lbl_createform_Number_Gerneralsection ; 
	
	//------------------------------------------------------------------------------------------------------------------------------------//

	//--------------------------------------  Number Create General section Sanity Validations ------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(text(),'Associated')]")
	public WebElementFacade lbl_createform_Number_Associatedinvsection ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[contains(text(),'Associated')]/following-sibling::div//label[contains(text(),'Object Type')]")
	public WebElementFacade lbl_createform_Number_Objecttype ; 
	
	
	//------------------------------------------------------------------------------------------------------------------------------------//
	
	//#############################################	Create Number Page 	#############################################################//
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_Numbercreate_name; 
	
	@FindBy(id="ALIAS1")
	public WebElementFacade tbx_Numbercreate_alias1; 
	
	@FindBy(id="ALIAS2")
	public WebElementFacade tbx_Numbercreate_alias2; 
	
	@FindBy(id="DESCRIPTION")
	public WebElementFacade tbx_Numbercreate_description; 
	
	@FindBy(xpath=".//*[starts-with(text(),'Object Type')]/following-sibling::select")
	public WebElementFacade ddl_Numbercreate_Objecttype; 
	
	@FindBy(xpath=".//*[starts-with(text(),'Relation Type')]/following-sibling::select")
	public WebElementFacade ddl_Numbercreate_relationtype; 	
	
	@FindBy(id="MEG_LEVEL")
	public WebElementFacade ddl_Numbercreate_meglevel; 
	
	@FindBy(xpath=".//*[@ng-click='openPortLookUp()']")
	public WebElementFacade btn_Numbercreate_Objectlookup; 
	
	//@FindBy(xpath=".//*[@id='serviceAssociation']//*[starts-with(text(),'Service Type')]/following-sibling::select")
	@FindBy(xpath=".//label[contains(text(),'Service Type')]/following-sibling::select[@ng-model='dslOVClookup.serviceType']")
	public WebElementFacade ddl_Numbercreate_Servicelookup_Servicetype; 
	
	
	@FindBy(xpath=".//*[@ng-click='dslOVCServiceNamelookUp()']")
	public WebElementFacade btn_Numbercreate_Servicelookup; 

	@FindBy(xpath=".//label[contains(text(),'Service Name %')]/following-sibling::input")
	public WebElementFacade tbx_Numbercreate_Servicelookup_servicename; 
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='openDeviceLookUp(assoPnlList)']")
	public WebElementFacade btn_Numbercreate_Devicelookup; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='lookUpDeviceDetails()']")
	public WebElementFacade btn_Numbercreate_Devicelookup_lookupicon; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invServiceDevLookUp.deviceClli']")
	public WebElementFacade tbx_Numbercreate_Devicelookup_deviceclli; 
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='openPortLookUp()']")
	public WebElementFacade btn_Numbercreate_Portlookup; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='servicePortlookUp(field.name)']")
	public WebElementFacade btn_Numbercreate_Portlookup_lookuoicon; 
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-show='showTableServicePortLookUp' and @class='']//a[@ng-click='closePortDataLookUp(port)'])[1]")
			public WebElementFacade lbl_Numbercreate_Portlookup_lookuoicon_result; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@ng-model='invServicePortLookUp.portType']")
	public WebElementFacade ddl_Numbercreate_Portlookup_porttype; 
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createNumberCtrl']//button[@ng-click='numberNamelookUp()']")
	public WebElementFacade btn_Numbercreate_Numberlookupicon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createNumberCtrl']//input[@ng-model='numberLookup.numberName']")
	public WebElementFacade tbx_Numbercreate_Numberlookup_numbername;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createNumberCtrl']//select[@ng-model='numberLookup.numberType']")
	public WebElementFacade ddl_Numbercreate_Numberlookup_numbertype;
	
	
	
	
	@FindBy(xpath="(.//*[@ng-click='servicecloseModalClick(service)'])[1]")
	public WebElementFacade lbl_Numbercreate_Servicelookup_firstvalue; 
	
	
	@FindBy(xpath=".//*[@ng-click='createNumber();']")
	public WebElementFacade btn_Numbercreate; 
	
	
	//------------------------------------------------------------------------------------------------------------------------------------//
	
	//#############################################	Search Number Page 	#############################################################//
	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditNumber();']")
	public WebElementFacade btn_SearchNumber_edit; 	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------//
	public void Number_create_Sanity_Validation() throws Throwable{
		waitForElement(tab_createnumber);
		Thread.sleep(3000);
		if(!tab_createnumber.isCurrentlyVisible()){
			throw new Error("Create number tab is not correct");
		}
		
		if(!btn_createform_Number_Create.isCurrentlyVisible() && !btn_createform_Number_Create.isCurrentlyEnabled()){
			throw new Error("Create button is not Visible & enable:"+tab_createnumber.getText().replaceAll("\\s+$", ""));
		}
		
		if(!btn_createform_Number_Reset.isCurrentlyVisible() && !btn_createform_Number_Reset.isCurrentlyEnabled()){
			throw new Error("Reset button is not Visible & enable:"+tab_createnumber.getText().replaceAll("\\s+$", ""));
		}
		
		List<WebElementFacade> Number_create_attribute = lbl_allXapath;
		
		ArrayList<String> Numbercreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<Number_create_attribute.size();j++){
				Numbercreate_Fieldattributelist.add(j, Number_create_attribute.get(j).getText());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> List2compare_Number_Fieldattributelist=new ArrayList<String>();
		
		List2compare_Number_Fieldattributelist.add(0, "Technology Type *");
		List2compare_Number_Fieldattributelist.add(1, "Number Type *");
		List2compare_Number_Fieldattributelist.add(2, "Name *");
		List2compare_Number_Fieldattributelist.add(3, "Alias1");
		List2compare_Number_Fieldattributelist.add(4, "Alias2");
		List2compare_Number_Fieldattributelist.add(5, "Provisioning Status *");
		List2compare_Number_Fieldattributelist.add(6, "Note");
		
		if(!lbl_createform_Number_Associatedinvsection.isCurrentlyVisible()){
			throw new Error("Associated Inventory Section is not displayed in "+tab_createnumber.getText().replaceAll("\\s+$", ""));
		}
		
		
		if(!lbl_createform_Number_Objecttype.isCurrentlyVisible()){
			throw new Error("Object Type in Associated Inventory Section is not displayed in "+tab_createnumber.getText().replaceAll("\\s+$", ""));
		}
		
		
		for(int i=0;i<Numbercreate_Fieldattributelist.size();i++){
			if(!Numbercreate_Fieldattributelist.get(i).equals(List2compare_Number_Fieldattributelist.get(i))){
				slf4jLogger.info("Numbercreate_Fieldattributelist="+Numbercreate_Fieldattributelist.get(i));
				slf4jLogger.info("List2compare_Number_Fieldattributelist="+List2compare_Number_Fieldattributelist.get(i)+" Not matching");
				throw new Error("Fields are not matching check:"+tab_createnumber.getText().replaceAll("\\s+$", ""));
			}
		}
		slf4jLogger.info("Number Create field attributes are expected as per "+tab_createnumber.getText().replaceAll("\\s+$", "")+" Number type");
		
		waitFor(ddl_Numbercreate_Objecttype);
		ddl_Numbercreate_Objecttype.click();
		ddl_Numbercreate_Objecttype.selectByIndex(2);
		waitFor(ddl_Numbercreate_relationtype);
		ddl_Numbercreate_relationtype.selectByIndex(0);
	}
	
	
	public void verify_validation(String validation){
		switch(validation){
		case "Service Select in lookup": waitForElement(btn_Numbercreate_Objectlookup);
											jsClick(btn_Numbercreate_Objectlookup);
											waitForElement(btn_Numbercreate_Servicelookup);
											ddl_Numbercreate_Servicelookup_Servicetype.selectByVisibleText("DSL OVC");
											jsClick(btn_Numbercreate_Servicelookup);
											waitForElement(lbl_Numbercreate_Servicelookup_firstvalue);
											jsClick(lbl_Numbercreate_Servicelookup_firstvalue);
												try {
													Thread.sleep(2000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}break;
		}
	}
	
	
	public void fill_createfilds(String container1,String container2,String container3){
		try {
		waitForElement(ddl_Numbercreate_Objecttype);
		
		tbx_Numbercreate_name.type("246");
		tbx_Numbercreate_alias1.type("Automation Test");
		tbx_Numbercreate_alias2.type("Automation Test");
		tbx_Numbercreate_description.type("Automation Test");
		
		switch(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//select[@id='DIMNUMBER2DIMNUMBERTYPE']/option[@selected='selected']")).getText().trim()){
		case "MEP-ID":	ddl_Numbercreate_Objecttype.selectByVisibleText("Port");
						ddl_Numbercreate_relationtype.selectByVisibleText("MEP -> EVC Member");
						ddl_Numbercreate_meglevel.selectByVisibleText("2");
						break;
						
		case "SAP":	ddl_Numbercreate_Objecttype.selectByVisibleText("Port");
						ddl_Numbercreate_relationtype.selectByVisibleText("SAP -> VLAN Interface");
						
						break;
			
		case "CE-VLAN":ddl_Numbercreate_Objecttype.selectByVisibleText("Service");
						waitForElement(ddl_Numbercreate_relationtype);
						
						ddl_Numbercreate_relationtype.selectByVisibleText("CE-VLAN -> DSL OVC");
						
						if(btn_Numbercreate_Objectlookup.isCurrentlyVisible()){
							verify_validation("Service Select in lookup");
						}break;
						
		case "SDP":	ddl_Numbercreate_Objecttype.selectByVisibleText("Number");
						Thread.sleep(1000);
		
					ddl_Numbercreate_relationtype.selectByVisibleText("SDP -> SAP");Thread.sleep(1000);
					jsClick(btn_Numbercreate_Objectlookup);
					waitForElement(btn_Numbercreate_Numberlookupicon);
					tbx_Numbercreate_Numberlookup_numbername.type("246");
					
					ddl_Numbercreate_Numberlookup_numbertype.selectByVisibleText("SAP");
					jsClick(btn_Numbercreate_Numberlookupicon);
					waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createNumberCtrl']//a[text()='246']")));
					jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createNumberCtrl']//a[text()='246']")));Thread.sleep(1000);
					break;	
					
		case "PW-ID": ddl_Numbercreate_Objecttype.selectByVisibleText("Port");
					Thread.sleep(1000);
					ddl_Numbercreate_relationtype.selectByVisibleText("PW-ID -> LPort");
				
					break;
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void Number_screenActions(String action) throws Throwable {		
		switch(action){
		
		case "Create":jsClick(btn_Numbercreate); waitForElement(btn_SearchNumber_edit); break;		
		
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
