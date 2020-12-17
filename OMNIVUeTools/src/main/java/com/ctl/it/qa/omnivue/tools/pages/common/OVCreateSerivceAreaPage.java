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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

@SuppressWarnings("deprecation")
public class OVCreateSerivceAreaPage extends OmniVuePage {
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
	public List<WebElementFacade> lbl_allXapath;
	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
	public WebElementFacade tab_currentlydisplayed;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@value='Create']")
	public WebElementFacade btn_ServiceareaCreate;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='addMoreAdress()']")
	public WebElementFacade btn_ServiceareaCreateform_addmoreaddrss;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@value='Reset']")
	public WebElementFacade btn_ServiceareaReset;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='editServiceArea(serviceAreaDetail.serviceAreaName);']")
	public WebElementFacade btn_serchServicearea_edit;
	
	
	//################		Create Form Page ########################//
	
	@FindBy(xpath = ".//*[@ng-controller='locationLookUpCtrl']//span/i")
	public WebElementFacade btn_SAcreateform_devicelcn;			
	
	@FindBy(xpath = ".//*[@ng-model='locationlkp.BuildingCLLI']")
	public WebElementFacade tbx_SAcreateform_lcnlckup_buildindclli; 			
	
	@FindBy(xpath = ".//*[@ng-click='searchLocation()']")
	public WebElementFacade btn_SAcreateform_lckupicon;			
	
	@FindBy(xpath = "(.//*[contains(@ng-click,'lookupGridSettings.selLukupValue(')])[1]")
	public WebElementFacade lbl_SAcreateform_locnresult;  
	
	@FindBy(id = "ServiceAreaName")
	public WebElementFacade tbx_createform_Servicearea;	
	
	@FindBy(id = "deviceLockUp")
	public WebElementFacade btn_createform_devicename;		
	
	@FindBy(xpath = ".//*[@ng-model='deviceLookUp.deviceRole']")
	public WebElementFacade ddl_SAcreateform_devicerole;  	
	
	@FindBy(xpath = ".//*[@ng-click='searchDevice()']")
	public WebElementFacade btn_SAcreateform_devicenamellokupicon; 
	
	
	@FindBy(xpath = "(.//*[@ng-click='setSelectedvalue(device)'])[1]")
	public WebElementFacade lbl_SAcreateform_devicename_result;		
			
	
	//----------------------  Add More address  ---------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='searchLocations()']")
	public WebElementFacade btn_SAcreateform_AddSearchlcn_searchlcn;		
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='lookUp.BuildingCLLI']")
	public WebElementFacade tbx_SAcreateform_AddSearchlcn_buildingclli;		
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//label[text()='Address']/following-sibling::input")
	public WebElementFacade tbx_SAcreateform_AddSearchlcn_addressno;		
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//select[@ng-model='lookUp.STATE']")
	public WebElementFacade ddl_SAcreateform_AddSearchlcn_state;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[contains(@id,'contentlookUpArea')]//div[@role='columnheader']//input/..)[1]")
	public WebElementFacade cbx_SAcreateform_AddSearchlcn_results;

	@FindBy(xpath = "(//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablelookUpArea')]//div[@role='gridcell']//div[contains(@class,'jqx-checkbox-default')])[1]")
			public WebElementFacade cbx_SAcreateform_AddSearchlcn_result1;
			
	@FindBy(xpath = "(//*[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablelookUpArea')]//div[@role='gridcell']//div[contains(@class,'jqx-checkbox-default')])[2]")
					public WebElementFacade cbx_SAcreateform_AddSearchlcn_result2;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='associateAddressToServiceArea()']")
	public WebElementFacade btn_SAcreateform_AddSearchlcn_associatelcn;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])[1]")
			public WebElementFacade tbx_SAcreateform_AddSearchlcn_associatelcn_rank1;
			
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])[2]")
					public WebElementFacade tbx_SAcreateform_AddSearchlcn_associatelcn_rank2;
	
	public void Sanity_ServiceareaCreate_validations() throws Throwable{
		waitForElement(btn_ServiceareaCreate); Thread.sleep(5000);
		slf4jLogger.info("Create Sericearea Validations");
		
		if(!tab_currentlydisplayed.isCurrentlyVisible()){
			throw new Error("Create form is not displayed");
		}
		if(!btn_ServiceareaCreate.isCurrentlyVisible()){
			throw new Error("Create button is not displayed");
		}
		if(!btn_ServiceareaReset.isCurrentlyVisible()){
			throw new Error("Reset button is not displayed");
		}
		List<WebElementFacade> Servicearea_create_attribute = lbl_allXapath;
		
		ArrayList<String> Serviceareacreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<Servicearea_create_attribute.size();j++){
				Serviceareacreate_Fieldattributelist.add(j, Servicearea_create_attribute.get(j).getText().trim());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> List2compare_Servicearea_Fieldattributelist=new ArrayList<String>();
		
		slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
		
		List2compare_Servicearea_Fieldattributelist.add(0, "Device Location *");
		List2compare_Servicearea_Fieldattributelist.add(1, "Service Area Name");
		List2compare_Servicearea_Fieldattributelist.add(2, "Device Name");
		
	for(int i=0;i<Serviceareacreate_Fieldattributelist.size();i++){
		if(!Servicearea_create_attribute.get(i).containsText(List2compare_Servicearea_Fieldattributelist.get(i))){
			slf4jLogger.info("Subscriber_create_attribute="+Serviceareacreate_Fieldattributelist.get(i));
			slf4jLogger.info("List2compare_Subscriber_Fieldattributelist="+List2compare_Servicearea_Fieldattributelist.get(i)+" Not matching");
			throw new Error("Fields are not matching check");
		}
	  }
	}
	
	
	public void Servicearea_Action(String action) throws Throwable {
		switch(action){
		case "Create": jsClick(btn_ServiceareaCreate); waitForElement(btn_serchServicearea_edit);break;
		case "Add More Addresses": 	browser_zoom_in(4); jsClick(btn_ServiceareaCreateform_addmoreaddrss);waitForElement(btn_SAcreateform_AddSearchlcn_searchlcn);break;
		}
		
	}
	
	public void verify_validation(String validation) throws Throwable{
		int i=1;
		switch(validation){
		case "associate multiple location in Service Area create screen":
									waitForElement(tbx_SAcreateform_AddSearchlcn_buildingclli);
									tbx_SAcreateform_AddSearchlcn_buildingclli.type("LSVGNV01");
									
									jsClick(btn_SAcreateform_AddSearchlcn_searchlcn); Thread.sleep(2000);
									
									waitForElement(cbx_SAcreateform_AddSearchlcn_results);Thread.sleep(1000);
									cbx_SAcreateform_AddSearchlcn_results.click(); Thread.sleep(2000);
									jsClick(btn_SAcreateform_AddSearchlcn_associatelcn);
									browser_zoom_out(4); 
									
									while(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])["+i+"]"))){				
										getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@ng-model='address.locationRank'])["+i+"]")).sendKeys(Integer.toString(i));
										i++;
									}			
									break;
		case "associate more addresses in service area create form": waitForElement(btn_SAcreateform_AddSearchlcn_searchlcn);
																		//tbx_SAcreateform_AddSearchlcn_buildingclli.type(")
																		ddl_SAcreateform_AddSearchlcn_state.selectByVisibleText("FL-Florida");
																		tbx_SAcreateform_AddSearchlcn_addressno.type("123");
																		jsClick(btn_SAcreateform_AddSearchlcn_searchlcn); waitForElement(cbx_SAcreateform_AddSearchlcn_result1); Thread.sleep(5000);
																		
																																			
																		jsClick(cbx_SAcreateform_AddSearchlcn_result1); Thread.sleep(1000);
																		//jsClick(cbx_SAcreateform_AddSearchlcn_result1); Thread.sleep(1000);
																		jsClick(cbx_SAcreateform_AddSearchlcn_result2); Thread.sleep(1000);
																		//jsClick(cbx_SAcreateform_AddSearchlcn_result2); Thread.sleep(1000);
																		
																	
																		cbx_SAcreateform_AddSearchlcn_result1.click();
																		
																		jsClick(btn_SAcreateform_AddSearchlcn_associatelcn);
																		waitForElement(tbx_SAcreateform_AddSearchlcn_associatelcn_rank1);
																		tbx_SAcreateform_AddSearchlcn_associatelcn_rank1.type("2");
																		tbx_SAcreateform_AddSearchlcn_associatelcn_rank2.type("1");
																		
																		break;
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

