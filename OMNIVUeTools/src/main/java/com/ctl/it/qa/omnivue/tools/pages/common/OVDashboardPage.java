package com.ctl.it.qa.omnivue.tools.pages.common;

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


public class OVDashboardPage  extends OmniVuePage{
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//###############	My Dashboard page ###################//
	
	@FindBy(xpath=".//tab-heading[starts-with(text(),'My DashBoard')]")
	public WebElementFacade tab_Mydashboard;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[contains(text(),'Add Widget')]")
	public WebElementFacade lbl_Mydashboard_AddWidget;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[text()='Inventory']")
	public WebElementFacade lbl_Mydashboard_AddWidget_inventory;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[text()='Network Build']")
	public WebElementFacade lbl_Mydashboard_AddWidget_NB;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[text()='Orders']")
	public WebElementFacade lbl_Mydashboard_AddWidget_order;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[text()='Reports']")
	public WebElementFacade lbl_Mydashboard_AddWidget_reportd;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[text()='Tasks']")
	public WebElementFacade lbl_Mydashboard_AddWidget_tasks;
	
	@FindBy(xpath=".//*[@id='dashboardNavbar']//a[text()='IFrame Widgets']")
	public WebElementFacade lbl_Mydashboard_AddWidget_iframewidgets;
		
	//---------------	Inventory Widget --------------------------//
	
	@FindBy(xpath=".//*[@class='widget-Border ng-scope gridster-item']//span[text()='Inventory']")
	public WebElementFacade lbl_Mydashboard_AddWidget_inventorywidget;
	
	@FindBy(xpath=".//*[@class='widget-Border ng-scope gridster-item']//span[text()='Network']")
	public WebElementFacade lbl_Mydashboard_AddWidget_NBwidget;
	
	@FindBy(xpath=".//*[@class='widget-Border ng-scope gridster-item']//span[text()='Order']")
	public WebElementFacade lbl_Mydashboard_AddWidget_orderwidget;
	
	@FindBy(xpath=".//*[@class='widget-Border ng-scope gridster-item']//span[text()='Reports']")
	public WebElementFacade lbl_Mydashboard_AddWidget_reportwidget;
	
	@FindBy(xpath=".//*[@class='widget-Border ng-scope gridster-item']//span[text()='Task']")
	public WebElementFacade lbl_Mydashboard_AddWidget_taskwidget;
	
	@FindBy(xpath=".//*[@class='widget-Border ng-scope gridster-item']//span[text()='Iframe']")
	public WebElementFacade lbl_Mydashboard_AddWidget_iframewidget;
	
	
	
	@FindBy(xpath=".//input[@ng-model='searchParam.name']")
	public WebElementFacade lbl_link_name;
	@FindBy(xpath="(.//*[@class='widget-Border ng-scope gridster-item']//span[contains(text(),'Resize Widget')]/preceding-sibling::i)[1]")
	public WebElementFacade btn_Mydashboard_AddWidget_resize;
	
	@FindBy(xpath="(.//*[@class='widget-Border ng-scope gridster-item']//span[contains(text(),'Edit Widget')]/preceding-sibling::i)[1]")
	public WebElementFacade btn_Mydashboard_AddWidget_edit;
	
	@FindBy(xpath="(.//*[@class='widget-Border ng-scope gridster-item']//span[contains(text(),'Remove Widget')]/preceding-sibling::i)[1]")
	public WebElementFacade btn_Mydashboard_AddWidget_remove;
	
	@FindBy(xpath="(//*[@class='tab-pane ng-scope active']//*[@ng-controller='punFormResultsCtrl']//div[@id='contenttablepunFormGrid']//a)[1]")
	public WebElementFacade lbl_Mydashboard_inventory_pun_link;
	
	//#######################################################		Inventory Widget Fields  #####################################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//h3[@class='modal-title ng-binding']")
	public WebElementFacade lbl_Mydashboard_windowheader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@placeholder='Name of Widget']")
	public WebElementFacade tbx_Mydashboard_window_widgetname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//h3[@class='modal-title ng-binding']/preceding-sibling::button")
	public WebElementFacade btn_Mydashboard_window_widgetclsicon;
	
	//######################################################################################################################################//
	//###################################################		Inventory Widget Fields  #####################################//
	
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@ng-controller='invSearchCtrl']//*[@ng-show='isForWidgetCreate'])[1]")
			public WebElementFacade btn_Mydashboard_inventory_save;
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[text()='Inventory Type']/following-sibling::select)[1]")
			public WebElementFacade ddl_Mydashboard_inventory_invtype1;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[text()='Inventory Type']/following-sibling::select)[2]")
	public WebElementFacade ddl_Mydashboard_inventory_invtype;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@for='devicename%']/following-sibling::input")
	public WebElementFacade tbx_Mydashboard_inventory_devicename;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='circuitToCircuitType']")
	public WebElementFacade ddl_Mydashboard_inventory_circuittype;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='contactType'])[1]")
			public WebElementFacade ddl_Mydashboard_inventory_contacttype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='linktype']")
	public WebElementFacade ddl_Mydashboard_inventory_linktype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@for='streetName%']/following-sibling::input")
	public WebElementFacade tbx_Mydashboard_inventory_locn;
	
	
	@FindBy(xpath=".//input[@ng-model='searchParam.locationFullName']")
	public WebElementFacade tbx_Mydashboard_inventory_locn_fullname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//li[@class='ng-scope active' and @ng-click='selectMatch($index)']")
	public WebElementFacade lbl_Mydashboard_inventory_locnresult;	
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//*[@ng-controller='invGridListViewCtrl']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")	
	public WebElementFacade btn_Mydashboard_inventory_view;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='numberType'])[1]")
	public WebElementFacade ddl_Mydashboard_inventory_numbertype;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='numberName'])[1]")
			public WebElementFacade tbx_Mydashboard_inventory_number;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='servicetype']")
	public WebElementFacade ddl_Mydashboard_inventory_servicetype;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@for='initiatedBy']/following-sibling::input)[1]")
			public WebElementFacade tbx_Mydashboard_inventory_punlocn_createdby;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='reservationType']")
	public WebElementFacade ddl_Mydashboard_inventory_reservationtype;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@id='topologyType'])[1]")
	public WebElementFacade ddl_Mydashboard_inventory_topologytype;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-controller='newDashBoardCtrl']//*[@for='subscriberFullName%']/following-sibling::input")
	public WebElementFacade tbx_Mydashboard_inventory_subscribername;
	
	//######################################################################################################################################//
		public void Sanity_validations(String validation) throws Throwable{
			
			switch(validation){

			case "Pun Widget window should display the results":if(!lbl_Mydashboard_inventory_pun_link.isCurrentlyVisible()){
				slf4jLogger.error("Result is not displayed");
				throw new Error("Result is not displayed");
			}break;
			case "My Dashboard tab": if(!tab_Mydashboard.isCurrentlyVisible()){
										throw new Error("My Dashboard tab is not displayed");
									}break;
									
			case "Add Widget drop down field should be displayed containing Inventory, Network Build, Order, Reports, Tasks & IFrame Widgets values":
										if(!lbl_Mydashboard_AddWidget.isCurrentlyVisible()){
											throw new Error("Add Widget drop down is not displayed");
										}jsClick(lbl_Mydashboard_AddWidget);
										if(!lbl_Mydashboard_AddWidget_inventory.isCurrentlyVisible()){
											throw new Error("Inventory under Add Widget drop down is not displayed");
										}
										if(!lbl_Mydashboard_AddWidget_NB.isCurrentlyVisible()){
											throw new Error("Network Build under Add Widget drop down is not displayed");
										}
										if(!lbl_Mydashboard_AddWidget_order.isCurrentlyVisible()){
											throw new Error("Orders under Add Widget drop down is not displayed");
										}
										/*if(!lbl_Mydashboard_AddWidget_reportd.isCurrentlyVisible()){
											throw new Error("Reports under Add Widget drop down is not displayed");
										}*/
										if(!lbl_Mydashboard_AddWidget_tasks.isCurrentlyVisible()){
											throw new Error("Tasks under Add Widget drop down is not displayed");
										}
										if(!lbl_Mydashboard_AddWidget_iframewidgets.isCurrentlyVisible()){
											throw new Error("Iframe Widget under Add Widget drop down is not displayed");
										}break;
										
			case "Inventory under Add Widget from My Dashboard":waitForElement(lbl_Mydashboard_AddWidget);
										jsClick(lbl_Mydashboard_AddWidget);
										jsClick(lbl_Mydashboard_AddWidget_inventory);
										waitForElement(lbl_Mydashboard_AddWidget_inventorywidget); break;
				
				
			case "Resize, Edit & Remove icons should be displayed under My Dashboard":if(!btn_Mydashboard_AddWidget_resize.isCurrentlyVisible() && !btn_Mydashboard_AddWidget_resize.isCurrentlyEnabled()){
												throw new Error("Resize Widget drop down is not displayed");
											}
											if(!btn_Mydashboard_AddWidget_edit.isCurrentlyVisible() && !btn_Mydashboard_AddWidget_edit.isCurrentlyEnabled()){
												throw new Error("Edit Widget drop down is not displayed");
											}
											if(!btn_Mydashboard_AddWidget_remove.isCurrentlyVisible() && !btn_Mydashboard_AddWidget_remove.isCurrentlyEnabled()){
												throw new Error("Remove Widget drop down is not displayed");
											}break;
											
			case "Remove icon under My Dashboard to Remove the Widget": jsClick(btn_Mydashboard_AddWidget_remove);getDriver().switchTo().alert().accept(); Thread.sleep(2000);
																			break;
				
			case "Resize icon under My Dashboard to Resize the Widget": jsClick(btn_Mydashboard_AddWidget_resize);Thread.sleep(4000);
			break;																
			case "Network Build under Add Widget from My Dashboard" : 	jsClick(lbl_Mydashboard_AddWidget);
			jsClick(lbl_Mydashboard_AddWidget_NB);waitForElement(lbl_Mydashboard_AddWidget_NBwidget); break;
																		
			case "Order under Add Widget from My Dashboard": jsClick(lbl_Mydashboard_AddWidget);
			jsClick(lbl_Mydashboard_AddWidget_order);waitForElement(lbl_Mydashboard_AddWidget_orderwidget); break;
															
			case "Reports under Add Widget from My Dashboard":jsClick(lbl_Mydashboard_AddWidget);
			jsClick(lbl_Mydashboard_AddWidget_reportd);waitForElement(lbl_Mydashboard_AddWidget_reportwidget); break;
			case "Tasks under Add Widget from My Dashboard" :jsClick(lbl_Mydashboard_AddWidget);
			jsClick(lbl_Mydashboard_AddWidget_tasks);waitForElement(lbl_Mydashboard_AddWidget_taskwidget); break;
			case "Iframe Widgets under Add Widget from My Dashboard":jsClick(lbl_Mydashboard_AddWidget);
			jsClick(lbl_Mydashboard_AddWidget_iframewidgets);waitForElement(lbl_Mydashboard_AddWidget_iframewidget); break;
				
			case "Inventory widget under My Dashboard is displayed": if(!lbl_Mydashboard_AddWidget_inventorywidget.isCurrentlyVisible()){
																			throw new Error("Inventory Widget is not displayed");
																		}break;
																		
			case "edit inventory widget under My Dashboard":jsClick(btn_Mydashboard_AddWidget_edit);waitForElement(btn_Mydashboard_inventory_save);
														if(!lbl_Mydashboard_windowheader.getText().trim().equals("Inventory - Widget")){
															slf4jLogger.error("Wrong widget is displayed");
															throw new Error("Wrong widget is displayed");
														}
														tbx_Mydashboard_window_widgetname.type("Inventory-Automation");
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("CLC Contact");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Circuit");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Contact");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Device");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Link");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Location");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Number");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("PUN Location");Thread.sleep(1000);
														
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("QOS Template");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Reservation");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Service");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Service Area");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Subscriber");Thread.sleep(1000);
														//ddl_Mydashboard_inventory_invtype.selectByVisibleText("Tirks Circuit ID");Thread.sleep(1000);
														ddl_Mydashboard_inventory_invtype.selectByVisibleText("Topology");Thread.sleep(1000);
														jsClick(btn_Mydashboard_window_widgetclsicon);Thread.sleep(1000);break;
														
			case "search with device name in Widget window": 
						waitForElement(tbx_Mydashboard_inventory_devicename);
						tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Device");
						tbx_Mydashboard_inventory_devicename.type("lsvgnv");
						Thread.sleep(1000);
						break;
			
			case "Widget window should display the results":if(!btn_Mydashboard_inventory_view.isCurrentlyVisible()){
																slf4jLogger.error("Result is not displayed");
																throw new Error("Result is not displayed");
															}break;
															
			case "search with Circuit type in Widget window":waitForElement(ddl_Mydashboard_inventory_circuittype);	tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Circuit");
																ddl_Mydashboard_inventory_circuittype.selectByVisibleText("Ethernet Bearer");
																break;
																
			case "search with Contact type in Widget window":waitForElement(ddl_Mydashboard_inventory_contacttype); tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Contact");
															ddl_Mydashboard_inventory_contacttype.selectByVisibleText("ICOCON");
															break;
															
			case "search with Link type in Widget window":waitForElement(ddl_Mydashboard_inventory_linktype);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Link");
															ddl_Mydashboard_inventory_linktype.selectByVisibleText("Fiber");
															lbl_link_name.type("Fiber");
															break;
															
			case "search with Location name in Widget window":waitForElement(tbx_Mydashboard_inventory_locn_fullname);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Location");
			tbx_Mydashboard_inventory_locn_fullname.type("123");
											//waitForElement(lbl_Mydashboard_inventory_locnresult);jsClick(lbl_Mydashboard_inventory_locnresult);
											break;
											
			case "search with Number type in Widget window":waitForElement(ddl_Mydashboard_inventory_numbertype);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Number");
														tbx_Mydashboard_inventory_number.type("3");
													ddl_Mydashboard_inventory_numbertype.selectByVisibleText("S-VLAN");
													break;
													
			case "search with Service type in Widget window":waitForElement(ddl_Mydashboard_inventory_servicetype);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Service");
															ddl_Mydashboard_inventory_servicetype.selectByVisibleText("HSI");
															break;
															
			case "search with PUN Location created by in Widget window":waitForElement(tbx_Mydashboard_inventory_punlocn_createdby);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-PUN Location");
													tbx_Mydashboard_inventory_punlocn_createdby.type("AB52523");
													break;
													
			case "search with Reservation type in Widget window":waitForElement(ddl_Mydashboard_inventory_reservationtype);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Reservation");
																ddl_Mydashboard_inventory_reservationtype.selectByVisibleText("Hard");
																	break;
			case "search with Topology type in Widget window":waitForElement(ddl_Mydashboard_inventory_topologytype);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Topology");
																ddl_Mydashboard_inventory_topologytype.selectByVisibleText("Generic Network");
																break;
																
			case "search with TEST - JANET Subscriber in Widget window":waitForElement(tbx_Mydashboard_inventory_subscribername);tbx_Mydashboard_window_widgetname.type("Inventory-Automation-Subscriber");
																		tbx_Mydashboard_inventory_subscribername.type("TEST - JANET");																	
																		break;
			}
			}
		
		public void Widgetactionbuttons(String Acttab) throws Throwable {
			switch(Acttab){
			case "Edit widget":jsClick(btn_Mydashboard_AddWidget_edit);waitForElement(btn_Mydashboard_inventory_save); break;
			case "Save widget":jsClick(btn_Mydashboard_inventory_save);
			
			Thread.sleep(5000);
			waitForElement(btn_Mydashboard_inventory_view); break;
			case "Save pun widget":jsClick(btn_Mydashboard_inventory_save);
			Thread.sleep(5000);
			waitForElement(lbl_Mydashboard_inventory_pun_link); break; 
			}
			}
		
		
		public void Widgettypeselect(String subtype,String type) throws Throwable {
		switch(type){
		case "Inventory":ddl_Mydashboard_inventory_invtype.selectByVisibleText(subtype);Thread.sleep(1000);break;
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
