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

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateQOSTemplate extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//###############################################################		Create QOS Template Sanity Validation  #######################################################//
	
	//--------------------------------------------------------------		Create QOS Template Tab ---------------------------------------------------------------------------//
			
//	@FindBy(xpath = ".//*[@class='nav nav-tabs']//*[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//*[@ng-click='onClickTab(tab)' and contains(text(),'Create QOS Template')]")
	@FindBy(xpath = "//tab-heading[@ng-click='onClickTab(tab)' and contains(text(),'Create QOS Template')]")
	public WebElementFacade tab_create_QOSTemplate; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createQOSCtrl']//label[contains(@class,'control-label')]")			
	public List<WebElementFacade> lbl_allXapath;
	

	//************************************************************************************************************************************************************//
	
	//--------------------------------------------------------------		Create Form   ---------------------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='qos']")
	public WebElementFacade tbx_createpage_QOSTemplate_templatename;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p2']")
	public WebElementFacade tbx_createpage_QOSTemplate_p2;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p3']")
	public WebElementFacade tbx_createpage_QOSTemplate_p3;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p4']")
	public WebElementFacade tbx_createpage_QOSTemplate_p4;
	
	//************************************************************************************************************************************************************//
	//--------------------------------------------------------------	QOS Template Action button ---------------------------------------------------------------------------//
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='createQOS();']")
	public WebElementFacade btn_createpage_QOSTemplate_Create; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetQOS();']")
	public WebElementFacade btn_createpage_QOSTemplate_Reset; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_createpage_QOSTemplate_msg; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']/button")
	public WebElementFacade btn_createpage_QOSTemplate_msgclsicon; 
	
	//************************************************************************************************************************************************************//
	
	
		
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),500);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	

	
	public void QOSTemplate_create_Sanity_Validation() throws Throwable {
		
		 waitForElement(btn_createpage_QOSTemplate_Create); Thread.sleep(3000);
		 
		 if(!tab_create_QOSTemplate.isCurrentlyVisible()){
				throw new Error("Create QOS Template tab is not displayed in Create page");
			}
		 

			if(!btn_createpage_QOSTemplate_Create.isCurrentlyVisible() && !btn_createpage_QOSTemplate_Create.isCurrentlyEnabled()){
				throw new Error("Create button is not visible or enabled in QOS Create page");
			}
			

			if(!btn_createpage_QOSTemplate_Reset.isCurrentlyVisible() && !btn_createpage_QOSTemplate_Reset.isCurrentlyEnabled()){
				throw new Error("Reset button is not visible or enabled in QOS Create page");
			}
		
		
			List<WebElementFacade> QOSTemplate_create_attribute = lbl_allXapath;
			
			ArrayList<String> QOSTemplatecreate_Fieldattributelist=new ArrayList<String>();
				for(int j=0;j<QOSTemplate_create_attribute.size();j++){
					QOSTemplatecreate_Fieldattributelist.add(j, QOSTemplate_create_attribute.get(j).getText());
						//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
					}
			ArrayList<String> List2compare_QOSTemplate_Fieldattributelist=new ArrayList<String>();
			
		
			List2compare_QOSTemplate_Fieldattributelist.add(0, "QOS Template Name*");
			List2compare_QOSTemplate_Fieldattributelist.add(1, "P2*");
			List2compare_QOSTemplate_Fieldattributelist.add(2, "P3*");
			List2compare_QOSTemplate_Fieldattributelist.add(3, "P4*");
			
			for(int i=0;i<QOSTemplatecreate_Fieldattributelist.size();i++){
				if(!QOSTemplatecreate_Fieldattributelist.get(i).equals(List2compare_QOSTemplate_Fieldattributelist.get(i))){
					slf4jLogger.info("QOSTemplatecreate_Fieldattributelist="+QOSTemplatecreate_Fieldattributelist.get(i));
					slf4jLogger.info("List2compare_QOSTemplate_Fieldattributelist="+List2compare_QOSTemplate_Fieldattributelist.get(i)+" Not matching");
					throw new Error("Fields are not matching check for QOS Create Template screen");
				}
			}
			slf4jLogger.info("QOS Tempalte Create field attributes are as expected");		
	}
	
	public void verify_validation(String validation) throws Throwable {	
		String Message;
		switch(validation){
		case "Success messsage should be displayed as - QOS template created Successfully in QOS Template page": 
										waitForElement(lbl_createpage_QOSTemplate_msg);
										Message=lbl_createpage_QOSTemplate_msg.getText().trim();
										Message = Message.toString().substring(1);		
										
										if(!Message.contains("QOS template created Successfully")){
											slf4jLogger.info("Invalid message on create is displayed."+Message);
											throw new Error("Invalid message on create is displayed."+Message);
										}jsClick(btn_createpage_QOSTemplate_msgclsicon); break;
										
		case "alert message should be displayed as -Please fill in the mandatory fields when create QOS is initiated":jsClick(btn_createpage_QOSTemplate_Create);
										waitForElement(lbl_createpage_QOSTemplate_msg);Message=lbl_createpage_QOSTemplate_msg.getText().trim();
										Message = Message.toString().substring(1);		
										
										if(!Message.contains("Please fill in the mandatory fields")){
											slf4jLogger.info("Invalid message on create is displayed."+Message);
											throw new Error("Invalid message on create is displayed."+Message);
										}jsClick(btn_createpage_QOSTemplate_msgclsicon); 
										
										if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='You left the field blank...'])[1]"))){
											slf4jLogger.info("QOS Template warning message is not displayed");
											throw new Error("QOS Template warning message is not displayed");
										}
										
										if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='You left the field blank...'])[2]"))){
											slf4jLogger.info("P2 field warning message is not displayed");
											throw new Error("P2 field warning message is not displayed");
										}
										
										if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='You left the field blank...'])[3]"))){
											slf4jLogger.info("P3 field warning message is not displayed");
											throw new Error("P3 field warning message is not displayed");
										}
										
										if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='You left the field blank...'])[4]"))){
											slf4jLogger.info("P4 field warning message is not displayed");
											throw new Error("P4 field warning message is not displayed");
										}
										break;
										
		case "alert message should be displayed on entering alpha-numeric character in QOS Template":
	
																	tbx_createpage_QOSTemplate_p2.type("@546dsf");
																	tbx_createpage_QOSTemplate_p3.type("@546dsf");
																	tbx_createpage_QOSTemplate_p4.type("@546dsf");
																	
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='enter only numeric charecters'])[1]"))){
																		slf4jLogger.info("P2 field warning message is not displayed");
																		throw new Error("P2 field warning message is not displayed");
																	}
																	
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='enter only numeric charecters'])[2]"))){
																		slf4jLogger.info("P3 field warning message is not displayed");
																		throw new Error("P3 field warning message is not displayed");
																	}
																	
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//span[text()='enter only numeric charecters'])[3]"))){
																		slf4jLogger.info("P4 field warning message is not displayed");
																		throw new Error("P4 field warning message is not displayed");
																	}
																	tbx_createpage_QOSTemplate_p2.clear();tbx_createpage_QOSTemplate_p3.clear();tbx_createpage_QOSTemplate_p4.clear();
																	
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

}
