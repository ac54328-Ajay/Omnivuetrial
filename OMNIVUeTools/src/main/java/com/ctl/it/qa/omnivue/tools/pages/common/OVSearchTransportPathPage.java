package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchTransportPathPage extends OmniVuePage {
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@value='Delete']")
	public WebElementFacade btn_searchTP_delete;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'getTransData')]")
	public WebElementFacade btn_searchTP_expand;
	
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'getTransData')])[1]/label")
	public WebElementFacade lbl_route_name;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//*[@id=\"left-content-tab\"]//label/a)[1]")
	public WebElementFacade lbl_startdeviceTP;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'getTransData')]/label[contains(text(),'Incomplete')]")
	public WebElementFacade btn_searchTP_Incomplete_expand;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='editRouteComplete()']")
	public WebElementFacade btn_searchTP_expand_edit;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='editRouteIncomplete()']")
	public WebElementFacade btn_searchTP_expand_Incomplete_edit;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='saveRoute(alldataComplete,accord1.title,accord2.name,accord1.searchDeviceName)']")
	public WebElementFacade btn_searchTP_expand_editscreen_Save;	

	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[contains(@ng-click,'Incomplete') and contains(@value,'Save')]")
	public WebElementFacade btn_searchTP_expand_editscreen_Incomplete_Save;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='submitRoute(alldataComplete,accord1.title,accord2.name,accord1.searchDeviceName)']")
	public WebElementFacade btn_searchTP_expand_editscreen_Submit;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[contains(@ng-click,'Incomplete') and contains(@value,'Submit')]")
	public WebElementFacade btn_searchTP_expand_editscreen_Incomplete_Submit;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='cancel(accord2,accord1.title)']")
	public WebElementFacade btn_searchTP_expand_editscreen_Cancel;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'inCompleteRouteDetail')]//button[@value='Delete']")
	public WebElementFacade btn_searchTP_expand_incomplete_delete;
	
	//#####################################################################		Alert message   ###########################################################//
	
	
			
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@ng-controller='searchNetworkTransPathResultCntrl']//div[contains(@class,'alert alert')])[1]")
    public WebElementFacade lbl_alertmsg; 
    
    @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@ng-controller='searchNetworkTransPathResultCntrl']//div[contains(@class,'alert alert')]/button)[1]")
    public WebElementFacade btn_alertmsg_closeicon; 
    
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[contains(@class,'ng-binding alert alert')]/button/..")
	public WebElementFacade lbl_errormsg;
	
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[contains(@class,'ng-binding alert alert')]/button")
	public WebElementFacade btn_errormsg_clsicon;
    
  //################################################################################################################################################//	    		
	
	

	
	public void verify_validation(String validation) throws Throwable {		
		String Message=null;
		switch(validation){
		case "Success message should be displayed on the Save action along with new Transportpath gets added":
													 waitForElement(lbl_alertmsg);
													 Message = lbl_alertmsg.getText();
														Message = Message.toString().substring(1);		
														Message = Message.trim(); 
														if(!Message.contains("Route is save successfully with Route name as")){
															throw new Error("Invalid message is displayed:"+Message);
														}jsClick(btn_alertmsg_closeicon);		
														jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[contains(@ng-repeat,'inCompleteRouteDetail')]//button[@value='Delete'])[2]")));
														Thread.sleep(2000);
														getDriver().switchTo().alert().accept();
														 waitForElement(lbl_alertmsg);
														jsClick(btn_alertmsg_closeicon);
														break;
			
			
			
		case "Success message is displayed on Delete action in Transport Path screen":
											 waitForElement(lbl_alertmsg);
											 Message = lbl_alertmsg.getText();
												Message = Message.toString().substring(1);		
												Message = Message.trim(); 
												if(!Message.contains("Route is deleted successfully")){
													throw new Error("Invalid message is displayed:"+Message);
												}jsClick(btn_alertmsg_closeicon);							
												break;
		case "Success message should be displayed on the action":
												Thread.sleep(3000);
												waitForElement(btn_errormsg_clsicon);jsClick(btn_errormsg_clsicon);
												TransportPath_actions("Cancel-action");
															
															
															
															break;
		
		case "Success message is displayed on Save action in Transport Path screen":
							Message = lbl_alertmsg.getText();
							Message = Message.toString().substring(1);		
							Message = Message.trim(); 
							if(!Message.contains(" is created successfully")){
								throw new Error("Invalid message on Save is displayed:"+Message);
							}jsClick(btn_alertmsg_closeicon);							
							break;
							
		case "Success message is displayed on Submit action in Transport Path screen":
						 Message = lbl_alertmsg.getText();
							Message = Message.toString().substring(1);		
							Message = Message.trim(); 
							if(!Message.contains(" is created successfully")){
								throw new Error("Invalid message on Save is displayed:"+Message);
							}jsClick(btn_alertmsg_closeicon);					
						break;
		
		
		case "Transport Path Update screen":
							if(btn_searchTP_expand_edit.isCurrentlyVisible()){
								slf4jLogger.debug("Edit button is displayed in Transport path update screen");
								throw new Error("Edit button is displayed in Transport path update screen");
							}
							if(!btn_searchTP_expand_editscreen_Save.isCurrentlyVisible()){
								slf4jLogger.debug("Save button is not displayed in Transport path update screen");
								throw new Error("Save button is not displayed in Transport path update screen");
							}
							if(!btn_searchTP_expand_editscreen_Submit.isCurrentlyVisible()){
								slf4jLogger.debug("Submit button is not displayed in Transport path update screen");
								throw new Error("Submit button is not displayed in Transport path update screen");
							}
							if(!btn_searchTP_expand_editscreen_Cancel.isCurrentlyVisible()){
								slf4jLogger.debug("Cancel button is not displayed in Transport path update screen");
								throw new Error("Cancel button is not displayed in Transport path update screen");
							}
							break;
			
		case  "Transport Path result screen": waitForElement(btn_searchTP_delete); jsClick(btn_searchTP_expand);Thread.sleep(3000);break;
		
		case "Transport Path result screen for the incomplete": waitForElement(btn_searchTP_delete); jsClick(btn_searchTP_Incomplete_expand);Thread.sleep(3000);break;
		
		}
	
	
	}
	
	public void TransportPath_actions(String statusvalidation) throws Throwable {
		switch(statusvalidation){
		
		case "Delete button on Incomplete task": jsClick(btn_searchTP_expand_incomplete_delete); Thread.sleep(2000); getDriver().switchTo().alert().accept(); waitForElement(lbl_alertmsg);break;
			
			
		case "Cancel action on Incomplete task":jsClick(btn_searchTP_expand_editscreen_Cancel);waitForElement(btn_searchTP_expand_Incomplete_edit); Thread.sleep(2000); break;
		case "Edit button":waitForElement(btn_searchTP_expand_edit); jsClick(btn_searchTP_expand_edit); Thread.sleep(2000); waitForElement(btn_searchTP_expand_editscreen_Save);		
							break;
							
		case "Save button":waitForElement(btn_searchTP_expand_editscreen_Save); jsClick(btn_searchTP_expand_editscreen_Save); Thread.sleep(2000); waitForElement(btn_searchTP_expand_edit);break;		
		
		case "Submit button": waitForElement(btn_searchTP_expand_editscreen_Submit); jsClick(btn_searchTP_expand_editscreen_Submit); Thread.sleep(2000); waitForElement(lbl_alertmsg);break;
		case "Edit Incomplete button":waitForElement(btn_searchTP_expand_Incomplete_edit); jsClick(btn_searchTP_expand_Incomplete_edit); Thread.sleep(2000); waitForElement(btn_searchTP_expand_editscreen_Incomplete_Save);		
												break;
												
		case "Submit button on Incomplete":waitForElement(btn_searchTP_expand_editscreen_Incomplete_Submit); jsClick(btn_searchTP_expand_editscreen_Incomplete_Submit);
																break;
		case "Save button on Incomplete":waitForElement(btn_searchTP_expand_editscreen_Incomplete_Save);jsClick(btn_searchTP_expand_editscreen_Incomplete_Save); Thread.sleep(2000); break;
		}
	}

	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),3000);				   
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
