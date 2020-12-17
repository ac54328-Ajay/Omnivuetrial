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

public class OVCreateAlternateequipbuild_Networkorder extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	//############################################# ####################################### ####################################### //
	//#############################################   Alternate Equipment Build Create Sanity Validations ######################################//
	//############################################# ####################################### ####################################### //	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading[contains(text(),'Alternate Equipment Build:')]")
	public WebElementFacade tab_currentlydisplayed ;
				
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='container-fluid']//div[@class='container-fluid']//label")			
	public List<WebElementFacade> lbl_allXapath;
				
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Build ID']/following-sibling::div")
	public WebElementFacade lbl_Create_ALtNWBuild_buildid ;
				
				
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(@class,'form-horizontal')]//*[@class='row']//*[@class='glyphicon glyphicon-refresh']")
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Status')]")
	public WebElementFacade lbl_Create_ALtNWBuild_status ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Status')]//i")
	public WebElementFacade btn_Create_ALtNWBuild_status_refresh ;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='submitAtlEquipBuild();']")
	public WebElementFacade btn_Create_ALtNWBuild_submitbuild ;
	
	
	
	//--------------------------------------  Create Alternate Equipment Build General information validation ------------------------------------------//
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[text()='General Information']")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='networkCreateDeviceCtrl']//div[@class='well']//div[contains(text(),'General')]")
	public WebElementFacade lbl_Create_ALtNWBuild_Generalinfo ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']/li[1]/button/span")
	public WebElementFacade btn_device1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@role='tablist']/li[3]/button/span")
	public WebElementFacade btn_device2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Validate Device']/span")
	public WebElementFacade btn_validatedevice;
	/*
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.EXISTING' and @value='New']")
	public WebElementFacade btn_device_state_new;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.EXISTING' and @value='Existing']")
	public WebElementFacade btn_device_state_existing;*/
	
	@FindBy(xpath=".//*[@value='NID' and @label='NID']")	 
	public WebElementFacade btn_device1_equprole_NID;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='NPE' and @label='NPE']")
	public WebElementFacade btn_device1_equprole_NPE;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-show='!existingMode']/select[@id='affiliateOwner']")
	public WebElementFacade ddl_affowner;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-show='!existingMode']/select[@id='deviceType']")
	public WebElementFacade ddl_devicetype;				  
	
	@FindBy(id="deviceSubType")
	public WebElementFacade ddl_devicesubtype;	
				
	
	//------------------------------------------------------------------------------------------------------------------------------------//
	
	//--------------------------------------  Create Build Components  validation ------------------------------------------//
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Build Components')]")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='networkCreateDeviceCtrl']//div[@class='well']//div[contains(text(),'Build')]")
	public WebElementFacade lbl_Create_ALtNWBuild_Build_components ;  
	
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Build Components')]/button/span[contains(text(),'Device')]")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='networkCreateDeviceCtrl']//div[@class='well']//div[contains(text(),'Build')]/button/span[contains(text(),'Device')]")
	public WebElementFacade btn_Create_ALtNWBuild_Build_components_AddDevice ;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@id='tab:0']")
	public WebElementFacade btn_Create_ALtNWBuild_Build_components_Device1 ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@id='tab:2']")
	public WebElementFacade btn_Create_ALtNWBuild_Build_components_Device2 ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@id='tab:3']")
	public WebElementFacade btn_Create_ALtNWBuild_Build_components_Device3 ;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='networkCreateDeviceCtrl']//div[@class='well']//button[@ng-click='deleteDeviceConfirm(altDeviceAttrForm.DEVICE_GROUP_ID, altDeviceAttrForm.DEVICE_POSITION)']")
	public WebElementFacade btn_Create_ALtNWBuild_Build_deletedevice ;
				
	
	//------------------------------------------------------------------------------------------------------------------------------------//
	
	
	
	
	public void Alternateequipbuild_Networkorder_create_Sanity_validation() throws Throwable{
		waitForElement(btn_Create_ALtNWBuild_submitbuild);Thread.sleep(3000);
		
			slf4jLogger.info("Alternate Equipment Build Create form Sanity Check");
		
		if(!tab_currentlydisplayed.isCurrentlyVisible() && !tab_currentlydisplayed.getText().contains("Alternate Equipment Build")){
			throw new Error("Alternate Equipment Build Create form is not displayed");
		}		
		
		String buildlist = tab_currentlydisplayed.getText().replaceAll("[^\\d]", "").replaceAll("\\s","");
		
		System.out.println("Build ID:"+buildlist);
		
		if(!lbl_Create_ALtNWBuild_buildid.getText().replaceAll("\\s","").equals(buildlist)){
			throw new Error("Alternate Equipment Build ID is not matching with the Tab:"+lbl_Create_ALtNWBuild_buildid.getText().replaceAll("\\s",""));
		}
		

		if(!btn_Create_ALtNWBuild_status_refresh.isCurrentlyVisible() && !btn_Create_ALtNWBuild_status_refresh.isCurrentlyEnabled()){
			throw new Error("Status Refresh button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
		if(!btn_Create_ALtNWBuild_submitbuild.isCurrentlyVisible() && btn_Create_ALtNWBuild_submitbuild.isCurrentlyEnabled()){
			throw new Error("Submit Build button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
		if(!lbl_Create_ALtNWBuild_Generalinfo.isCurrentlyVisible()){
			throw new Error("General Information section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}	
		
		if(!lbl_Create_ALtNWBuild_Build_components.isCurrentlyVisible()){
			throw new Error("Build Components section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
		if(!btn_Create_ALtNWBuild_Build_components_AddDevice.isCurrentlyVisible() && !btn_Create_ALtNWBuild_Build_components_AddDevice.isCurrentlyEnabled()){
			throw new Error("Add Device button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
	/*	if(!btn_Create_ALtNWBuild_Build_components_Device1.isCurrentlyVisible() && !btn_Create_ALtNWBuild_Build_components_Device1.isCurrentlyEnabled()){
			throw new Error("Device1 button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
		if(!btn_Create_ALtNWBuild_Build_components_Device2.isCurrentlyVisible() && !btn_Create_ALtNWBuild_Build_components_Device2.isCurrentlyEnabled()){
			throw new Error("Device2 button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}*/
		
		 
		
		Thread.sleep(3000);
		List<WebElementFacade> networkorder_create_attribute = lbl_allXapath;
		
		ArrayList<String> networkordercreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<networkorder_create_attribute.size();j++){
				networkordercreate_Fieldattributelist.add(j, networkorder_create_attribute.get(j).getText().trim());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> networkorder2compare_link_Fieldattributelist=new ArrayList<String>();
		
		networkorder2compare_link_Fieldattributelist.add(0, "Build ID");
		networkorder2compare_link_Fieldattributelist.add(1, "Build Type");
		networkorder2compare_link_Fieldattributelist.add(2, "Initiated By");
		networkorder2compare_link_Fieldattributelist.add(3, "Last Updated By");
		networkorder2compare_link_Fieldattributelist.add(4, "Status");
		networkorder2compare_link_Fieldattributelist.add(5, "Order/CSOF Id");
		networkorder2compare_link_Fieldattributelist.add(6, "");
		networkorder2compare_link_Fieldattributelist.add(7, "Initiated Date");
		networkorder2compare_link_Fieldattributelist.add(8, "Last Updated Date");
		networkorder2compare_link_Fieldattributelist.add(9, "Engineering Due Date");
		networkorder2compare_link_Fieldattributelist.add(10, "*");
		networkorder2compare_link_Fieldattributelist.add(11, "Project ID");
		networkorder2compare_link_Fieldattributelist.add(12, "BVAPP#");
		networkorder2compare_link_Fieldattributelist.add(13, "PON");
		networkorder2compare_link_Fieldattributelist.add(14, "ICSC Code");
		networkorder2compare_link_Fieldattributelist.add(15, "FOC JEOP Process Note");
		
		
		for(int i=0;i<networkordercreate_Fieldattributelist.size();i++){
			if(!networkordercreate_Fieldattributelist.get(i).replaceAll("\\s+$", "").equals(networkorder2compare_link_Fieldattributelist.get(i))){
				slf4jLogger.info("networkordercreate_Fieldattributelist="+networkordercreate_Fieldattributelist.get(i));
				slf4jLogger.info("networkorder2compare_link_Fieldattributelist="+networkorder2compare_link_Fieldattributelist.get(i)+" Not matching");
				slf4jLogger.info("networkordercreate_Fieldattributelist Complete="+networkordercreate_Fieldattributelist);
				throw new Error("Fields are not matching check:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
		}
		slf4jLogger.info("Alternate Equipment Build Create field attributes are expected for: "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		
		
	}
	
	public void verify_validation(String validation) throws Throwable {		
		switch(validation){
		case "functionality of Add Device button of Alt Equipment Build":
								waitForElement(btn_Create_ALtNWBuild_Build_components_AddDevice); Thread.sleep(3000);
								jsClick(btn_Create_ALtNWBuild_Build_components_AddDevice);Thread.sleep(3000); 
								waitForElement(btn_Create_ALtNWBuild_Build_components_Device3);
											
											break;
		case "functionality of Delete Device button of Alt Equipment Build":
							waitForElement(btn_Create_ALtNWBuild_Build_components_AddDevice); Thread.sleep(3000);
							
							while(btn_Create_ALtNWBuild_Build_components_Device1.isCurrentlyVisible()){
							jsClick(btn_Create_ALtNWBuild_Build_components_Device1); Thread.sleep(2000);
							
							
							waitForElement(btn_Create_ALtNWBuild_Build_deletedevice);
							
							jsClick(btn_Create_ALtNWBuild_Build_deletedevice);Thread.sleep(2000);
							getDriver().switchTo().alert().accept();Thread.sleep(2000);
							}
							
							break;
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
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),3000);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	
}
