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
public class OVSearchQOSTemplate extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//************************************************************************************************************************************************************//
	
	//###############################################################		Search QOS View Sanity Validation  #######################################################//
		
	//--------------------------------------------------------------		Search QOS Tab ---------------------------------------------------------------------------//
		
	@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']")
	public WebElementFacade tab_search_result_details; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[contains(@id,'view')]//th[contains(text(),'QOS Template Name')]/../../following-sibling::tbody//td[1]")
	public WebElementFacade lbl_searchview_QOSTemplate_templatename; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='View Qos Template']")
	public WebElementFacade tab_searchview_QOSTemplate_ViewQOSTemplate;	
		
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Audit Logs']")
	public WebElementFacade tab_searchview_QOSTemplate_auditlogs; 
		
	//************************************************************************************************************************************************************//
	
	//--------------------------------------------------------------	QOS Template Action button ---------------------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='editQOSDetails(QOSParam.Name)']")
	public WebElementFacade btn_searchview_QOSTemplate_Edit; 
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='removeFromInventory(QOSParam.Name)']")
	public WebElementFacade lbl_searchview_QOSTemplate_Delete; 
	
	
	//QOS Template validation screen 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//th[text()='QOS Template Name']")
	public WebElementFacade lbl_QOS_table;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='ng-scope']//button[@ng-click='saveQOS();']")
	public WebElementFacade btn_searchview_QOSTemplate_save;
	

	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/input")
	public WebElementFacade btn_addSubscriber;
	
	//New updates on QOS--9/23
	
	@FindBy(xpath="(//div[label[contains(text(),'QOS Template Name')]]/following-sibling::div/label[1])[1]")
	public WebElementFacade lbl_templateName;
	
	//End of QOS Template 
	
	//************************************************************************************************************************************************************//
	
	//***************************************** Fields  ********************************************************//
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='qos']")
	public WebElementFacade tbx_searchpage_QOSTemplate_templatename; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p2']")
	public WebElementFacade tbx_searchpage_QOSTemplate_p2; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p3']")
	public WebElementFacade tbx_searchpage_QOSTemplate_p3; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p4']")
	public WebElementFacade tbx_searchpage_QOSTemplate_p4; 
	
	
	//***************************************** Messages on actions ********************************************************//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_createpage_QOSTemplate_msg; 
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']/button")
	public WebElementFacade btn_createpage_QOSTemplate_msgclsicon; 
	
	
	//************************************************************************************************************************************************************//
	
	//***************************************** Audit logs field validation ********************************************************//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_searchpage_QOSTemplate_auditlogs_getlogs;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//span[text()='Action Type']")
	public WebElementFacade lbl_searchpage_QOSTemplate_auditlogs_actiontype;
	
	
	
	//************************************************************************************************************************************************************//
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),500);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	
	public void QOSTemplate_tab_namevalidation() throws Throwable {
		waitForElement(lbl_searchview_QOSTemplate_templatename);
		
		 
		 String QOSTemplatename=tab_search_result_details.getText().replaceAll("\\s+$", "").trim();
		 slf4jLogger.info("QOSTemplate Tab Name :"+QOSTemplatename);
		 
		 slf4jLogger.info("QOSTemplatename Text field:"+lbl_searchview_QOSTemplate_templatename.getText().replaceAll("\\s+$", "").trim());
			
			if(lbl_searchview_QOSTemplate_templatename.getText().replaceAll("\\s+$", "").trim().equals(QOSTemplatename)){
				slf4jLogger.info("QOSTemplate Tab Name is matching with the QOSTemplatename Text field");
			} else throw new Error("QOSTemplatename is not matching with Tab name");
	}
	
	public void QOSTemplate_search_Sanity_Validation() throws Throwable {
		
		waitForElement(btn_searchview_QOSTemplate_Edit); Thread.sleep(3000);
		
		 QOSTemplate_tab_namevalidation();
		 
		 if(!tab_searchview_QOSTemplate_ViewQOSTemplate.isCurrentlyVisible()){
				throw new Error("View QOS Template tab is not displayed in QOS Template View page");
			}
		 
		 if(!tab_searchview_QOSTemplate_auditlogs.isCurrentlyVisible()){
				throw new Error("Audit logs tab is not displayed in QOS Template View page");
			}
		 

			if(!btn_searchview_QOSTemplate_Edit.isCurrentlyVisible() && !btn_searchview_QOSTemplate_Edit.isCurrentlyEnabled()){
				throw new Error("QOS Edit button in QOS Template View page");
			}
			

			if(!lbl_searchview_QOSTemplate_Delete.isCurrentlyVisible() && !lbl_searchview_QOSTemplate_Delete.isCurrentlyEnabled()){
				throw new Error("QOS Delete button in QOS Template View page");
			}
		 
		
	}
	
	public void verify_validation(String validation)throws Throwable {	
		String Message;
		switch(validation){
		case "a message should be displayed on entering invalid value in QOS Template as - Incorrect partition value":
											tbx_searchpage_QOSTemplate_p2.type("75");
											tbx_searchpage_QOSTemplate_p3.type("15");
											tbx_searchpage_QOSTemplate_p4.type("20");
											Qos_button_action("Save");
													waitForElement(lbl_createpage_QOSTemplate_msg);
													Message=lbl_createpage_QOSTemplate_msg.getText().trim();
													Message = Message.toString().substring(1);		
													
													if(!Message.contains("Incorrect partition value")){
														throw new Error("Invalid message on create is displayed."+Message);
													}jsClick(btn_createpage_QOSTemplate_msgclsicon); break;
													
		case  "entered valid value in QOS Template table": waitForElement(tbx_searchpage_QOSTemplate_templatename);
										tbx_searchpage_QOSTemplate_templatename.type("Modify-QOS Name");
										tbx_searchpage_QOSTemplate_p2.type("25");
										tbx_searchpage_QOSTemplate_p3.type("10");
										tbx_searchpage_QOSTemplate_p4.type("65");break;
		case "success message should be displayed as - QOS Template has been updated in QOS Template":
									waitForElement(lbl_createpage_QOSTemplate_msg);
									Message=lbl_createpage_QOSTemplate_msg.getText().trim();
									Message = Message.toString().substring(1);		
									
									if(!Message.contains("QOS Template has been updated with the name Modify-QOS Name")){
										throw new Error("Invalid message on create is displayed."+Message);
									}jsClick(btn_createpage_QOSTemplate_msgclsicon); break;
									
		case "Audit logs shoulld have the logs for Edit & create for QOS Template":
			jsClick(tab_searchview_QOSTemplate_auditlogs);waitForElement(btn_searchpage_QOSTemplate_auditlogs_getlogs);jsClick(btn_searchpage_QOSTemplate_auditlogs_getlogs);
											waitForElement(lbl_searchpage_QOSTemplate_auditlogs_actiontype);
											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
												slf4jLogger.error("Edit log is not captured");
												throw new Error("Edit log is not captured");
											}
											if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[contains(text(),'Save QOS with qostemplate name')])[1]"))){
												slf4jLogger.error("Edit log is not captured");
												throw new Error("Edit log is not captured");
											}jsClick(tab_searchview_QOSTemplate_ViewQOSTemplate);break;
											
		case "QoS Template list view is displayed when search is performed":
										if(!isElementVisible(By.xpath(".//*[@class='row order-detail-group table_row treeClass']"))){
											slf4jLogger.error("QoS Template list view is not displayed");
											throw new Error("QoS Template list view is not displayed");
										}
										if(!isElementVisible(By.xpath(".//*[@class='row order-detail-group table_row treeClass']//th[text()='QOS Template Name']"))){
											slf4jLogger.error("QoS Template Name header is not displayed");
											throw new Error("QoS Template Name header is not displayed");
										}
										if(!isElementVisible(By.xpath(".//*[@class='row order-detail-group table_row treeClass']//th[text()='P2']"))){
											slf4jLogger.error("P2 Name header is not displayed");
											throw new Error("P2 header is not displayed");
										}
										if(!isElementVisible(By.xpath(".//*[@class='row order-detail-group table_row treeClass']//th[text()='P3']"))){
											slf4jLogger.error("P3 Name header is not displayed");
											throw new Error("P3 header is not displayed");
										}
										if(!isElementVisible(By.xpath(".//*[@class='row order-detail-group table_row treeClass']//th[text()='P4']"))){
											slf4jLogger.error("P4 Name header is not displayed");
											throw new Error("P4 header is not displayed");
										}break;
		}
		
	}
	

	
	public void Qos_button_action(String actionkey) throws Throwable{
		switch(actionkey){
		case "Edit":jsClick(btn_searchview_QOSTemplate_Edit);	waitForElement(btn_searchview_QOSTemplate_save); break;
		case "Save":jsClick(btn_searchview_QOSTemplate_save);waitForElement(lbl_createpage_QOSTemplate_msg); break;
		case "Add Subscribers":jsClick(btn_addSubscriber);break;
		case "Delete":jsClick(lbl_searchview_QOSTemplate_Delete);getDriver().switchTo().alert().accept();Thread.sleep(2000);getDriver().switchTo().alert().accept();break;
		}
		
	}
	
	public void Qos_template_validation(){
		if(lbl_QOS_table.isCurrentlyVisible()){
			slf4jLogger.info("Qos Table is Visible");
		}
		else throw new Error("Qos Table is not Present");
		
	}
	
	public void validateViewList(String template){
		//try {
			String sTemplateName = lbl_templateName.getText();
			slf4jLogger.info("sTemplateName ="+sTemplateName);
			//UserSteps enduser = new UserSteps();
			
	/*		IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template);
			String fieldValue = datacontainer.getFieldValue("tbx_Template_name");
			String FielsString[] = fieldValue.split(":");
			String actualFieldvalue = FielsString[1];
			slf4jLogger.info(actualFieldvalue);
		if(sTemplateName.contains(actualFieldvalue)){
			Thread.sleep(3000);
			slf4jLogger.info("List view displayed when search is performed.");

		}
		else
		{
			slf4jLogger.info("List view not displayed when search is performed.");
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	

	
	public void success_message_validation(String msg){
		
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
