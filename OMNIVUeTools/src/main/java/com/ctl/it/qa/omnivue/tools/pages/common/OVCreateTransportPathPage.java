package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import org.junit.Assert;
import org.openqa.selenium.Alert;
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
 

public class OVCreateTransportPathPage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	@FindBy(xpath="(//label[@class='col-lg-4 col-md-4 col-sm-6 col-xs-12 ng-binding'])[1]")
	public WebElementFacade lbl_startDeviceName;
	
	@FindBy(xpath=".//*[@id='parentSelectId_0']")
	public WebElementFacade ddl_circuit;
	
	@FindBy(xpath="(//label[@class='col-lg-4 col-md-4 col-sm-6 col-xs-12 marLP15'])[1]")
	public WebElementFacade lbl_endDeviceName;
	
	@FindBy(xpath="//input[@value='Submit']")
	public WebElementFacade btn_submit;
	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Transport Path Result')]")
	public WebElementFacade tab_Transportpath_search_result_page;
	
	
	
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	
		//******* New Updates on GFast transport path - 16/2/17 ***************************
		
	//--------------------------	Pop Up message window --------------------------------------------------//
		
		@FindBy(xpath="//h4[text()='Confirmation']")
		public WebElementFacade lbl_TP_confirmation;
		
		@FindBy(xpath=".//*[@id='circuitType2']")
		public WebElementFacade rbn_Opticalbearer;
		
		@FindBy(xpath=".//*[@id='circuitType1']")
		public WebElementFacade rbn_Ethernetbearer;
		
		@FindBy(xpath=".//*[@ng-click='doLaunch();']")
		public WebElementFacade btn_launchtransport;
		
		//------------------------------------------------------------------------------------------------------//
		
		//--------------------------	Transport Path Create form --------------------------------------------------//
		
		@FindBy(xpath=".//tab-heading[contains(text(),'Create Transport Path')]")
		public WebElementFacade tab_createTransportpath;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[text()='Transport Path ']")
		public WebElementFacade lbl_Transportpathheader;
		
		//.//div[@class='tab-pane ng-scope active']//select[@ng-model='circuitName']
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//select[@onchange='getParentId(this.id);']")
		public WebElementFacade ddl_Transportpath_circuitselect;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//label[contains(text(),'Device Role :')]")
		public WebElementFacade lbl_Transportpath_devicerole;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='saveTransportPath();']")
		public WebElementFacade btn_Transportpath_save;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='submitTransportPath();']")
		public WebElementFacade btn_Transportpath_submit;
		
		@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='resetTransportPath();']")
		public WebElementFacade btn_Transportpath_reset;
		
		
		
		
		//************************ End of Change *******************************************
		OVLoginPage loginPage;
		OVActivationPage actvtnpage;
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_submit;
	}

	public void TransportPath_actions(String statusvalidation) throws Throwable {
		switch(statusvalidation){
		case "OK Button by selecting Ethernet Bearer radio button":
							if(!tab_createTransportpath.isCurrentlyVisible()){
								waitForElement(rbn_Ethernetbearer); jsClick(rbn_Ethernetbearer); Thread.sleep(1000); 
								jsClick(btn_launchtransport);Thread.sleep(3000);checkAlert();	
								}break;
		case "OK Button by selecting Optical Bearer radio button":
							if(!tab_createTransportpath.isCurrentlyVisible()){
							waitForElement(rbn_Opticalbearer); jsClick(rbn_Opticalbearer); Thread.sleep(1000); 
							jsClick(btn_launchtransport);Thread.sleep(3000);checkAlert();	
							}break;
			
		case "OK Button":if(!tab_createTransportpath.isCurrentlyVisible()){
								jsClick(btn_launchtransport);Thread.sleep(3000);checkAlert();	
							}break;
		case "Save button":
						waitForElement(btn_Transportpath_save);
						jsClick(btn_Transportpath_save);
					waitForElement(tab_Transportpath_search_result_page);
					
					break;
		}
		
		
	}
	public void verify_validation(String validation) throws Throwable {		
		switch(validation){
		case "select circuit from the drop down in Transport path create screen":

			ddl_Transportpath_circuitselect.selectByIndex(1); Thread.sleep(2000);			
			break;
			
		case "Transport path create screen should be displayed":Thread.sleep(5000);
							/*if(!tab_createTransportpath.isCurrentlyVisible()){
							getDriver().switchTo().alert().accept(); Thread.sleep(2000);
							}*/
							if(!lbl_Transportpathheader.isCurrentlyVisible()){
								slf4jLogger.debug("Transport Path header is not displayed");
								throw new Error("Transport Path header is not displayed");				
							}
							if(!ddl_Transportpath_circuitselect.isCurrentlyVisible()){
								slf4jLogger.debug("Circuit select drop down in Create Transport Path tab is not displayed");
								throw new Error("Circuit select drop down in Create Transport Path tab is not displayed");				
							}
							
							if(!lbl_Transportpath_devicerole.isCurrentlyVisible()){
								slf4jLogger.debug("Device role in Create Transport Path tab is not displayed");
								throw new Error("Device role in Create Transport Path tab is not displayed");				
							}
							
							if(!btn_Transportpath_save.isCurrentlyVisible()){
								slf4jLogger.debug("Save button in Create Transport Path tab is not displayed");
								throw new Error("Save button in Create Transport Path tab is not displayed");				
							}
							
							if(!btn_Transportpath_submit.isCurrentlyVisible()){
								slf4jLogger.debug("Submit button in Create Transport Path tab is not displayed");
								throw new Error("Submit button in Create Transport Path tab is not displayed");				
							}
							
							if(!btn_Transportpath_reset.isCurrentlyVisible()){
								slf4jLogger.debug("Reset button in Create Transport Path tab is not displayed");
								throw new Error("Reset button in Create Transport Path tab is not displayed");				
							}
							
							
				
							
									break;
		case "Transport path confirmation window should be displayed to select Ethernet Bearer & Optical Bearer":
								waitForElement(lbl_TP_confirmation);
								if(!rbn_Opticalbearer.isCurrentlyVisible()){
									slf4jLogger.debug("Optical Bearer radio button is not displayed in the Transport path confirmation window");
									throw new Error("Optical Bearer radio button is not displayed in the Transport path confirmation window");
								}
								if(!rbn_Ethernetbearer.isCurrentlyVisible()){
									slf4jLogger.debug("Ethernet Bearer radio button is not displayed in the Transport path confirmation window");
									throw new Error("Ethernet Bearer radio button is not displayed in the Transport path confirmation window");
								}
								if(!btn_launchtransport.isCurrentlyVisible()){
									slf4jLogger.debug("Launch button is not displayed in the Transport path confirmation window");
									throw new Error("Launch button is not displayed in the Transport path confirmation window");
								}
								
								break;
		
		
		
		}
		
		
	}
	public void validate_TransportDeviceName(String devName) throws InterruptedException {
		slf4jLogger.info("expectedstartDeviceName ="+devName);
		Thread.sleep(5000);
		String startDeviceName = lbl_startDeviceName.getText();
		slf4jLogger.info("startDeviceName "+startDeviceName);
		
		String FielsString[] = startDeviceName.split(":");
		String actualstartDeviceName = FielsString[1].trim();
		slf4jLogger.info("actualstartDeviceName= "+actualstartDeviceName);
		Assert.assertEquals("Start Device Name is not same", devName, actualstartDeviceName);
		
	}
	
	public void validate_endDeviceName(String devName) throws InterruptedException {
		slf4jLogger.info("expectedsCircuitName ="+devName);
		Thread.sleep(5000);
		String endDeviceName = lbl_endDeviceName.getText();
		slf4jLogger.info("endDeviceName "+endDeviceName);
		
		String FielsString[] = devName.split("/");
		String actualCircuitName = FielsString[2];
		slf4jLogger.info("actualCircuitName= "+actualCircuitName);
//		Assert.assertEquals("Start Device Name is not same", devName, actualstartDeviceName);
		
		Boolean flag1 = endDeviceName.contains(actualCircuitName);
		Assert.assertTrue("End device name is not same", flag1);
//		Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
		slf4jLogger.info("End device name is same");
		
	}
	
	public void verifySubmitButtonAndClick() throws InterruptedException{
		Boolean flag = btn_submit.isEnabled();
		slf4jLogger.info("verifying Submit Button");
		if(flag){
			slf4jLogger.info("Submit Button is Enabled");
			jsClick(btn_submit);
			Thread.sleep(5000);
		}
		else
		{
			slf4jLogger.info("Submit Button is not Enabled");
		}
	}
	
	//********************GFast related 16/2/2017 ********************************
	
		public void gfasttransport_circuittype(String circuittype) throws Throwable {
			if(circuittype.equals("Optical Bearer")){
				jsClick(rbn_Opticalbearer);
			} else {
				jsClick(rbn_Ethernetbearer);
			}
			jsClick(btn_launchtransport);
			Thread.sleep(3000);
		}
		
		public void gfasttransport_popupmsg() throws AWTException{
			 try {
			        WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 20);
			        wait.until(ExpectedConditions.alertIsPresent());
			        /*Alert alert = loginPage.getDriver().switchTo().alert();
			        slf4jLogger.info(loginPage.getDriver().switchTo().alert().getText());

			        alert.accept();
			        wait.until(ExpectedConditions.elementToBeClickable(actvtnpage.tab_closeall_tab));*/
				 Robot robot = new Robot();
				 robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
					robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
					
					Thread.sleep(15000);
					
					wait.until(ExpectedConditions.visibilityOf(actvtnpage.tab_closeall_tab));
			    } catch (InterruptedException e) {
			        //exception handling
			    	e.printStackTrace();
			    }
		}
		
		public void transportpath_createform(String transportpath){
			slf4jLogger.info(actvtnpage.tab_active_tab.getText()+"Tab name");
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
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),3000);				   
		    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
			
		    return element;
		}
		
		public void checkAlert() {
		    try {
		        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alert = getDriver().switchTo().alert();
		        alert.accept();
		    } catch (Exception e) {
		        //exception handling
		    }
		}
}
