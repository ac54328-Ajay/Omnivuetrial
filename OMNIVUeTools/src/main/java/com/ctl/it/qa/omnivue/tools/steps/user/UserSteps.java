package com.ctl.it.qa.omnivue.tools.steps.user;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

///
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//
// 
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.InputStreamEntity;
//import org.apache.http.impl.client.HttpClientBuilder;
///


//import org.openqa.selenium.Alert;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OVfillmandatoryfields;
import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedModServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVBandwidthUpgradeChecker;
import com.ctl.it.qa.omnivue.tools.pages.common.OVContactSearchDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateAlternateequipbuild_Networkorder;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateCLCContactPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateCircuitPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateContactPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateGDBPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateLinkPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateLocationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateLogicalPortPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateNetworkbuild;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateNumberPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateQOSTemplate;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateSerivceAreaPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateSubscriberPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateTopologyPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateTransportPathPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDashboardPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVGeariconPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLocationDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVManageGetNextPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModServiceDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVOrderPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVQPartnerPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchAlternateequipbuild_Networkorder;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchArchivePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchCLCContactPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchCircuitpage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchContactsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchFiberBuildPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchLinkdetailspage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchLocationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchNumberPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchOrderPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchQOSTemplate;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServiceAreaPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchSubscriberPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchTopologyPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchTransportPathPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVServiceSearchPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVTaskrenderingpage;
import com.ctl.it.qa.omnivue.tools.steps.OmniVueSteps;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.staf.Page;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


@SuppressWarnings("serial")
public class UserSteps extends OmniVueSteps  {
	
	public String container=null;
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	OVLoginPage loginPage;
	OVHomepage ovhomepage;
	OVActivationPage actvtnpage;
	OVAssociatedServicesPage assocservicespage;
	OVDeviceLookupPage devicelookuppage;
	OVSearchDevicePage searchdevicepage;
	OVSearchServicePage searchservicepage;
	OVModServiceDetailsPage modservicedetailspage;
	OVModDeviceLookupPage moddevicelookuppage;
	OVAssociatedModServicesPage modassocservicespage;
	OVCreateDevicePage devcreatepage;
	OVOrderPage orderpage;
	OVCreateServicePage servicecreatepage ;
	OVCreateLocationPage createlocationpage;
	OVCreateCircuitPage createcircuitpage ;
	OVTaskrenderingpage taskpage;
	OVCreateGDBPage gdbcreatepage;
	OVSearchCircuitpage searchcircuit;
	OVSearchContactsPage searchcontact;
	OVSearchLocationPage searchlocation;
	OVServiceSearchPage servicedetailpage;
	
	OVSearchSubscriberPage searchsubscriberpage;
	
	OVSearchServiceAreaPage searchserviceareapage;
	OVSearchQOSTemplate ovsearchqostemplate;
	OVCreateQOSTemplate ovcreateqostemplate;
	OVCreateNumberPage ovcreatenumberpage;
	OVSearchNumberPage ovsearchnumberpage;
	OVCreateContactPage ovcreatecontactpage;
	OVSearchFiberBuildPage ovsearchfiberbuild;
	
	UserSteps enduser;
 ////////SerT//////
	RequestSpecification request;
	Response response; 
	File f; 
//////////
	FileIOTest fileiotest;
	//OVCreateLocationPage locpage;
	
	OVLocationDetailsPage locationsearchpage; 
	OVSearchLinkdetailspage ovsearchlinkpage; 
	OVCreateLinkPage ovcreatelinkpage;
	 OVContactSearchDetailsPage ovcsdp;
	 
	 OVCreateAlternateequipbuild_Networkorder ovcreateAlternateequipbuild_Networkorder;
		 
	 OVCreateTransportPathPage transportPathPage;
	 OVCreateTopologyPage createTopologyPage;
	 OVCreateNetworkbuild createnetwrkbuild;
	 OVSearchTopologyPage searchTopologyPage;
	 OVCreateTopologyPage createtopologyPage;
	 OVCreateSubscriberPage createsubscriberpage; 
	 OVCreateSerivceAreaPage createserviceareapage;
	 OVSearchAlternateequipbuild_Networkorder ovserachnetworkorderpage;
	 OVSearchArchivePage ovsearchArchivepage;
	 OVSearchTransportPathPage searchtransportpath;
	 OVGeariconPage gearicon;
	 OVCreateCLCContactPage createclccontactpage;
	 OVSearchCLCContactPage searchclccontactpage;
	 OVCreateLogicalPortPage ovcreatelogicalport;
	 OVSearchOrderPage searchorderpage;
	 OVDashboardPage dashboardpage;
	 OVQPartnerPage qpartnerpage;
	 OVManageGetNextPage managegetnext;
	 
	 OVBandwidthUpgradeChecker ovBandwidthUpgradeChecker;
	 ARMDB armdb;
	 OmnivueDB ovdb;
	 OVGeariconPage ovgeariconpage; 
	 
	 OVfillmandatoryfields fillfieldscls;
	 Excel_Read excel_access = new Excel_Read();
	  

	@Step
	public void logs_in_as_a(String userType) throws Exception {
		shouldExist(loginPage);
		loginPage.EnterDetails(userType);
		loginPage.clickLogin();
		/*WaitForPageToLoad(50);
		waitForElement(actvtnpage.tab_search);*/	
		waitForElement(actvtnpage.tab_search);
		slf4jLogger.info("Login was Successful");
		browser_zoom_out(4);
	}
	
	@Step
	public void logsinov(String userType) throws Exception {
		shouldExist(loginPage);
		loginPage.EnterDetails(userType);
		loginPage.clickLogin();
		/*WaitForPageToLoad(50);
		waitForElement(actvtnpage.tab_search);*/
		
		
		
		waitForElement(actvtnpage.tab_search);
		slf4jLogger.info("Login was Successful");
	}
	
	public void browser_zoom_out(int n) throws InterruptedException{
		slf4jLogger.info("Performing Zoom");
		
		Robot r;
		try {
			r = new Robot();		
	
			for(int i=0;i<n;i++){
			
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_SUBTRACT);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_SUBTRACT);
				
				}	
			
			r.keyRelease(KeyEvent.VK_CONTROL);	
		Thread.sleep(1000);
		
		waitForElement(actvtnpage.tab_search);
		
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
	
	public void browser_zoom_in() throws InterruptedException{
		
		/*WebElement html = loginPage.getDriver().findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD)); 
		html.sendKeys(Keys.chord(Keys.CONTROL, "0"));*/
		
		slf4jLogger.info("Performing in");
		
		Robot r;
		try {
			r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_0);
				Thread.sleep(1000);
				r.keyRelease(KeyEvent.VK_CONTROL);	
				r.keyRelease(KeyEvent.VK_0);
		
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}

	public void is_in_omnivue_login_page(String url) {
		loginPage.maximize();
		
		loginPage.openAt(url);
		
		
		
	}
		
	@Step
	public void should_be_on_homepage() {
		shouldExist(ovhomepage);
	}
	
	@Step
	public void should_be_on_loginpage() {
		shouldExist(loginPage);
	}
	
	@Step
	public void launchingthepage(){
		
		
	}
	
	
	
	@Step	
	public void click_activationTab() throws Exception {
		ovhomepage.click_activation_tab();
		shouldExist(actvtnpage);
	}
	
	@Step
	public void Activation_click_Tab(String Acttab) throws Throwable {
	/*	if(actvtnpage.tab_closeall_tab.isCurrentlyVisible()){
					// Takes 28 Sec due to If else validation
			if(actvtnpage.tab_Mydashboard.isCurrentlyVisible() && !Acttab.equals("My Dashboard")){
				actvtnpage.tab_closeall_tab);
			}
			
			slf4jLogger.info("Going to click Search close tab is not available");
		} else {
			actvtnpage.tab_closeall_tab);
		}*/
		
	//	if(!Acttab.equals("My Dashboard")){
		if(actvtnpage.tab_closeall_tab.isCurrentlyVisible()){
			jsClick(actvtnpage.tab_closeall_tab);
		}
			
		//}
		
		actvtnpage.click_actscreentab(Acttab);
	}

	
	//
	@Step
	public void click_gearIcon() throws Throwable {
		jsClick(actvtnpage.gearIcon1);
	}
	
	//i_check_FAQ()
	@Step
	public void i_check_FAQ() throws Throwable {
		actvtnpage.i_check_FAQ();
	}
	
	@Step
	public void click_Tab(String Acttab) throws Throwable {
		//waitForElement(actvtnpage.tab_create);
	//	slf4jLogger.info("Clicked on "+Acttab+" Tab");
		
		
		
		if(!actvtnpage.tab_closeall_tab.isCurrentlyVisible()){
			actvtnpage.click_actscreentab(Acttab);		// Takes 28 Sec due to If else validation
			
			
			slf4jLogger.info("Going to click Search close tab is not available");
		} else if(orderpage.btn_order_search_results_tab.isCurrentlyVisible() && orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
			slf4jLogger.info("Order Search Page is visible");
			
		} else  if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				slf4jLogger.info("Order View Page is visible");
		}
			
			
			
		} 	else if(!gdbcreatepage.tab_GDB.isCurrentlyVisible()){    
				
				//(!orderpage.btn_order_tab_search_view_page.getText().replaceAll("\\s","").equals(orderpage.gfast_get_excel_data_from("GFast-Sheet","OV_Base_Sanity", 2).replaceAll("\\s","")) || !orderpage.btn_order_search_results_tab.isCurrentlyVisible())
				
				jsClick(actvtnpage.tab_closeall_tab);
				waitForElement(actvtnpage.tab_create);
				
				slf4jLogger.info("Going to click Search GDB is not available");
				actvtnpage.click_actscreentab(Acttab);
			
		} 
		
		/*if(actvtnpage.tab_closeall_tab.isCurrentlyVisible()){
			slf4jLogger.info("Close all is present");
			
			if(!gdbcreatepage.tab_GDB.isCurrentlyVisible()){
				actvtnpage.tab_closeall_tab);
				//loginPage.getDriver().navigate().refresh();
				waitForElement(actvtnpage.tab_create);
				actvtnpage.click_actscreentab(Acttab);
			} 
		} */
		
		
		/*if(gdbcreatepage.tab_GDB.isPresent()){
			slf4jLogger.info("GDB is present");
		} else {
			slf4jLogger.info("GDB Not present Click Tab"+Acttab);
			if(actvtnpage.tab_closeall_tab.isPresent()){
				slf4jLogger.info("Close Tab is Present");
				actvtnpage.tab_closeall_tab);
			//loginPage.getDriver().navigate().refresh();
			waitForElement(actvtnpage.tab_create);
			}
			slf4jLogger.info("No Tab present gonna click"+Acttab);
		actvtnpage.click_actscreentab(Acttab);		
		}*/
	}
	
	@Step
	public void fill_fields(String field) throws Throwable {  
		if(orderpage.tab_order_advance_search_result.isCurrentlyVisible()){
			orderpage.getfieldvaluetosearch(field);
			
		} else if(devcreatepage.success_alert.isCurrentlyVisible()){
			String mltoorder=devcreatepage.success_alert.getText().replaceAll("\\D+","");
			jsClick(actvtnpage.tab_search);
			fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer("GPON Order-Sanity search"));
			actvtnpage.tbx_orderId.type(mltoorder);
		} else
		if(field.equals("Equipment order from Excel & Validate")){
			orderpage.validating_orders();
		} else {
			fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(field));
			Thread.sleep(500);
				}
	
		}
	
	@Step
	public void fill_order_fields(String field) throws Throwable {
		
		//String parentwin=devcreatepage.window_switch();	
		
		Thread.sleep(5000);
		jsClick(orderpage.btn_serviceaddress);
		Thread.sleep(5000);
		
		//String parentwin=devcreatepage.window_switch();
		//fillMandatoryFields(orderpage,get_data_for_page(orderpage).getContainer("MLTOlocationaddress"));		
		fill_fields_from("OVOrderPage","MLTO Create form","MLTO location address");		
		jsClick(orderpage.btn_mltolocnlookUp);//Rework
		Thread.sleep(5000);
		//devcreatepage.switch_win(parentwin); 
		
	/*	orderpage.btn_serviceaddress);
		Thread.sleep(5000);
		fillMandatoryFields(orderpage,get_data_for_page(orderpage).getContainer("MLTO location address"));
		orderpage.btn_lookup);
		Thread.sleep(5000);*/
		//waitForElement(orderpage.lnk_addlcn);
		jsClick(orderpage.lnk_addlcn);
		Thread.sleep(5000);
		if(orderpage.lnk_addlcn.isCurrentlyVisible()){
			/*String link=orderpage.lnk_addlcn.getText();
			List<WebElement> elements = loginPage.getDriver().findElement(By.linkText(link));
			orderpage.lnk_addlcn);*/
			slf4jLogger.info("Clicked again");
			WebElement target = loginPage.getDriver().findElement(By.linkText(orderpage.lnk_addlcn.getText()));
			((JavascriptExecutor) loginPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
			Thread.sleep(500); //not sure why the sleep was needed, but it was needed or it wouldnt work :(
			target.click();
		}
		
		/*List<WebElement> elements = loginPage.getDriver().findElement(By.linkText(orderpage.lnk_addlcn.getText()));
				elements.get(0));*/
		Thread.sleep(5000);
		//orderpage.lnk_addlcn);
		//devcreatepage.switch_win(parentwin);
		//Thread.sleep(5000);
		
		//fillMandatoryFields(orderpage,get_data_for_page(orderpage).getContainer(field));
		//System.out.println(get_container_from_xml("OVOrderPage","MLTO Create form",field).getFieldValue("tbx_orderno").toString());
		//fill_fields_from("OVOrderPage","MLTO Create form",field);
		fillMandatoryFields(fillfieldscls,get_container_from_xml("OVOrderPage","MLTO Create form",field));
		orderpage.dispatchdetails();
			String text2shuffle=field.replace("-", "").replace(" ","").replace("+","");
			//orderpage.tbx_customerlastname.clear();
			orderpage.tbx_customerlastname.type(orderpage.shuffle_words(text2shuffle));
		}
	
	
	
	@Step
	public void Createbutton_functionality(String action) throws Throwable{
		try {
			
			switch(action){
			case "Refresh":orderpage.Network_order_status(); break;	
			case "Create":	jsClick(orderpage.btn_OrderCreateform_create);	
							waitForElement(devcreatepage.success_alert);
							Created_MLTO_Order(orderpage.create_order_successfull_msg());
							slf4jLogger.info("*******************"+orderpage.create_order_successfull_msg()); break;
							
			case "Submit Build": //orderpage.validatedevicestatus();
								Thread.sleep(2000);
								jsClick(orderpage.btn_altequip_submitbuild);
								//waitForAlert(loginPage.getDriver()); 
								Thread.sleep(3000);getDriver().switchTo().alert().accept();Thread.sleep(2000);break;
								
			case "Cancel Order": waitForAlert(getDriver());	waitForElement(orderpage.lbl_alertmsg);break;
			case "Audit Log":	orderpage.action_button_MLTO_Search(action);break;
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Step
	public void waitForAlert(WebDriver driver) throws InterruptedException
	{
	   int i=0;
	   while(i++<5)
	   {
	        try
	        {
	            Alert alert = loginPage.getDriver().switchTo().alert();
	           	String msg=alert.getText();
	           	Thread.sleep(8000);
	           	alert.accept();
	           	slf4jLogger.info("Accepted popup");
				slf4jLogger.info(msg);
	            break;
	        }
	        catch(NoAlertPresentException e)
	        {
	          try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	          continue;
	        }
	   }
	}
	
	/*@Step
	public void fttsheetupdate(String ordertype) throws InvalidFormatException, Throwable{
		orderpage.fttsheetupdate(ordertype);
	}*/
	
	@Step//reading the successful msg after one device created
	public void Created_MLTO_Order(String deviceName) throws InterruptedException{
		 
		 Thread.sleep(1000);		
	}
	
	@Step
	public void Createform_attribute_validation(String str1,String str2) throws InterruptedException{
		try {
		switch(str2){
		case "MLTO": 				waitForElement(devcreatepage.btn_Create);
									List<WebElementFacade> Ordercreatelist = devcreatepage.lbl_allXapath;
									ArrayList<String> OrderatributesOfPage=new ArrayList<String>();
									for(int j=0;j<Ordercreatelist.size();j++){										
										OrderatributesOfPage.add(j, Ordercreatelist.get(j).getText());												
									}
									
									switch(str1){
									case "V and H coordinates":for(int i=0;i<OrderatributesOfPage.size();i++){										
																	if(OrderatributesOfPage.get(i).equals(str1)){														
																		throw new Error(str1+" is present");
																	} 
																} break;
									case "HSI+PRISM HD Streams & Feature code": orderpage.ddl_serviceType.selectByVisibleText("HSI+PRISM");
																				List<WebElementFacade> mltoHDStreamlist = orderpage.ddl_hdStreams1;
																				ArrayList<String> mltoHDStreamvalues=new ArrayList<String>();
																				
																				for(int j=0;j<mltoHDStreamlist.size();j++){															
																					mltoHDStreamvalues.add(j, mltoHDStreamlist.get(j).getText());			
																					}												
																				
																				for(int k=0;k<mltoHDStreamvalues.size();k++){															
																									
																					 if(mltoHDStreamvalues.get(k).contains("4HD0SD")){
																						slf4jLogger.info("HD Stream code 4HD0SD is present");				 
																					 if(mltoHDStreamvalues.get(k).contains("3HD1SD"))
																						slf4jLogger.info("HD Stream code 3HD1SD is present");				
																					 if(mltoHDStreamvalues.get(k).contains("0HD4SD"))
																						slf4jLogger.info("HD Stream code 0HD4SD is present");
																					} else throw new Error("HD Stream codes are not present"+mltoHDStreamvalues.get(k));
																					
																				}
																				
																				
																				slf4jLogger.info("HD Stream code is as expected");
																				
																				orderpage.ddl_hdStreams.selectByVisibleText("4HD0SD");
																				Thread.sleep(1000);
																				
																				
																				//Feature code validation for HSI+PRISM
																				
																				List<WebElementFacade> mltoPRISMfeaturecodelist = orderpage.lbl_featureCodeCollection;
																				ArrayList<String> mltoPRISMfeaturecodevalues=new ArrayList<String>();
																		
																				
																				for(int j=0;j<mltoPRISMfeaturecodelist.size();j++){														
																					mltoPRISMfeaturecodevalues.add(j, mltoPRISMfeaturecodelist.get(j).getText());			
																					}
																		
																				
																				for(int k=0;k<mltoPRISMfeaturecodevalues.size();k++){															
																					
																					if(mltoPRISMfeaturecodevalues.get(k).contains("1RTBXN")){
																						slf4jLogger.info("HSI+PRISM Feature codes 1RTBXN is present");
																					
																					 if(mltoPRISMfeaturecodevalues.get(k).contains("7325"))
																						slf4jLogger.info("HSI+PRISM Feature codes 7325 is present");
																					
																					 if(mltoPRISMfeaturecodevalues.get(k).contains("VAP"))
																						slf4jLogger.info("HSI+PRISM Feature codes VAP is present");
																					
																					 if(mltoPRISMfeaturecodevalues.get(k).contains("7410N"))
																						slf4jLogger.info("HSI+PRISM Feature codes 7410N is present");
																				
																					 if(mltoPRISMfeaturecodevalues.get(k).contains("1239i"))
																						slf4jLogger.info("HSI+PRISM Feature codes 1239i is present");
																					} else throw new Error("HSI Feature codes are not present"+mltoPRISMfeaturecodevalues.get(k));
																					
																				}
																				
																				slf4jLogger.info("HSI+PRISM Feature code validation complete"); break;
																				
									case "HSI Feature code": 	orderpage.ddl_serviceType.selectByVisibleText("HSI");
																Thread.sleep(1000);
																
																List<WebElementFacade> mltoHSIfeaturecodelist = orderpage.lbl_featureCodeCollection;
																ArrayList<String> mltoHSIfeaturecodevalues=new ArrayList<String>();
																for(int j=0;j<mltoHSIfeaturecodelist.size();j++){
																	
																	mltoHSIfeaturecodevalues.add(j, mltoHSIfeaturecodelist.get(j).getText());			
																	}
																System.out.println(mltoHSIfeaturecodevalues);
																
																for(int k=0;k<mltoHSIfeaturecodevalues.size();k++){																
																	
																	if(mltoHSIfeaturecodevalues.get(k).contains("7325")){
																		slf4jLogger.info("HSI Feature codes are all present");
																	 if(mltoHSIfeaturecodevalues.get(k).contains("1239i")){
																		slf4jLogger.info("HSI Feature codes are all present");
																	}} else throw new Error("HSI Feature codes are not present"+mltoHSIfeaturecodevalues.get(k));
																	
																}
																
																slf4jLogger.info("HSI Feature code validation complete"); break;
									
									}break;
									
									
								
		case "Alternate Equipment Build": createnetwrkbuild.validatealtequitbuildcreateformvalidation(); break;
		
		case "GPON Device Build":	
			switch(str1){
			case "Fiber link":gdbcreatepage.gdbfiberlink(); break;
			default: gdbcreatepage.top_section_GDBvalidation(str1);
									
									Thread.sleep(5000);	
																
									
									gdbcreatepage.down_section_GDBvalidation(str1);
									
									if(str1.equals("OLT")){			
									List<WebElementFacade> gdbbottomcreatelist = gdbcreatepage.lbl_gdb_olt;
									ArrayList<String> gdbbottomatributesOfPage=new ArrayList<String>();
									//slf4jLogger.info("Step one done");
								
									for(int j=0;j<gdbbottomcreatelist.size();j++){
									
										gdbbottomatributesOfPage.add(j, gdbbottomcreatelist.get(j).getText());
									
									//slf4jLogger.info("Step Two done");
									//slf4jLogger.info(atributesOfPage.get(j));
										}
								
									System.out.println(gdbbottomatributesOfPage);
												
									
										ArrayList<String> testAttributes = new ArrayList<String>();
					
										testAttributes.add(0, "* Device type");
										testAttributes.add(1, "* Device SubTypes");
										testAttributes.add(2, "* Provisioning Status");
										testAttributes.add(3, "* Shared Flag");
										testAttributes.add(4, "Stack Ring Sequence");
										testAttributes.add(5, "Stack Ring Shelf Indicator");					
										testAttributes.add(6, "Build Template");
										testAttributes.add(7, "* Is Diverse");
										testAttributes.add(8, "* Relay Rack Shelf");
										testAttributes.add(9, "Device Template");
										testAttributes.add(10, "Management VLAN");
										testAttributes.add(11, "* 1 Gbps Indicator");
										testAttributes.add(12, "* NOSA Certification");
										testAttributes.add(13, "Network Node#");
										
										if(gdbcreatepage.lbl_gdb_location.getText().contains("Location Address") && gdbcreatepage.lbl_gdb_clli.getText().contains("CLLI")){
											
										int j=0;
					
										for (String attributeb : testAttributes) {
											slf4jLogger.info(attributeb);
											if(attributeb.contains(gdbbottomatributesOfPage.get(j))){
												slf4jLogger.info("As expected"+attributeb+"="+gdbbottomatributesOfPage.get(j));
											} else slf4jLogger.info("issue"+attributeb+"="+gdbbottomatributesOfPage.get(j));
											j=j+1;
										}
					
									/*	if (testAttributes.contains(gdbbottomatributesOfPage)) {
											
											slf4jLogger.info("pass");
										} else throw new Error("Attributes are missing in bottom row");*/
									
										} //else throw new Error("Attributes are missing in bottom row");
										
									}
									
									gdbcreatepage.cascadebuttonvalidation(str1);
									break;
									}
								break;	
													
			
		}
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	
	@Step
	public void action_button_MLTO_Search(String action) throws InterruptedException{
		orderpage.action_button_MLTO_Search(action);
	}
	
	@Step
	public void mltoactionavailable(String action){
		waitForElement(orderpage.actionperformed(action));
	}
	
	@Step
	public void alertmessageonmltoaction(String msg) throws InterruptedException{
		orderpage.alertmessageonmltoaction(msg);
	}
	
	
	
	@Step
	public void Searchform_attribute_validation(String str1,String str2) throws Throwable{
		
		switch(str2){
		case "MLTO": orderpage.Order_pagevalidation(str1); break;
		case "Device": String Field=null;
						switch(str1){
						case "Delete button": searchdevicepage.delebuttonvalidation(str2); break;
						case "Is-Diverse": if(searchdevicepage.lbl_devicerole.getText().contains("OLT")){
													Field="TC174920-OLT";		
												}else  if(searchdevicepage.lbl_devicerole.getText().contains("MST")){
													Field="TC174930-MST";	
												} else if(searchdevicepage.lbl_devicerole.getText().contains("FDP")){
													Field="TC174929-FDP";	
												} else if(searchdevicepage.lbl_devicerole.getText().contains("SPLITTER")){
													Field="TC174922-SPLITTER";	
												}  
												else if(searchdevicepage.lbl_devicerole.getText().contains("ONT")){
													Field="TC174922-ONT";	
												}  
						
							String[] valuevalidations = get_container_from_xml("OVCreateDevicePage",Field,"Devicedata").getFieldValue("ddl_IsDiversed").toString().split(":");				
							searchdevicepage.fieldvalidations(valuevalidations[1].trim()); break;
						
											} break;
		case "Functional status is not mandatory":searchdevicepage.verify_validation(str1);break;
		}
		
	}
	
	
	@Step
	public void Editform_attribute_validation(String str1,String str2){
		
		switch(str2){
		
		case "OLT Device": 	searchdevicepage.device_edit_field_modification(str1); break;
		case "MLTO": orderpage.Editform_attribute_validation();break;
		
		}	
		
	}
	
	@Step
	public void Orderbutton_validation(String btn,String state){
		orderpage.buttonvisibilitycheck(btn,state);
		
	}
	
	@Step
	public void search_order_producttype(String type) throws InterruptedException{
		actvtnpage.ddl_productType.selectByValue(type);
		Thread.sleep(2000);
	}
	
	
	
	@Step
	public void Serach_button_actions(String btn){
		try {
			devicelookuppage.click_devicelookupeditbtn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Step
	public void adddevicecardtodevice(String device) throws Throwable{
		
		switch(device){
		case "GDB-OLT": jsClick(gdbcreatepage.btn_gpon_OLT_box);
						Thread.sleep(5000);
						String GDBOLT=gdbcreatepage.lbl_oltdeviceGDB.getText();
						Thread.sleep(1000);
						actvtnpage.click_actscreentab("Search");
						Thread.sleep(5000);
						fill_fields("GDB_OLTSearch");
						Thread.sleep(5000);
			    actvtnpage.tbx_deviceName.sendKeys(GDBOLT);
			    actvtnpage.click_searchbtn("Device");
			   
			   // waitForElement(actvtnpage.btn_view);
			    //Thread.sleep(10000);
			    //select_viewBtn();
			    waitForElement(searchdevicepage.lbl_devicerole);
			    waitForElement(searchdevicepage.btn_shelfexpand);
			    //Thread.sleep(5000);
			    jsClick(searchdevicepage.btn_expandleftscreen);
			   
			    //Thread.sleep(5000);
			    jsClick(searchdevicepage.btn_shelfexpand);
			    waitForElement(searchdevicepage.btn_deviceaddcard);
			    //Thread.sleep(10000);
			    jsClick(searchdevicepage.btn_deviceaddcard);
			    //Thread.sleep(5000);		
			    waitForElement(searchdevicepage.btn_deviceportRT_shelfexpand_Addcard_addcarddetails);
			    searchdevicepage.ddl_deviceportRT_shelfexpand_Addcard_deviceaddcardtype.selectByVisibleText("E7-20 GE-24x");
			    
			    searchdevicepage.tbx_deviceportRT_shelfexpand_Addcard_deviceaddcardcount.sendKeys("1");
			    Thread.sleep(2000);
			    jsClick(searchdevicepage.btn_deviceportRT_shelfexpand_Addcard_addcarddetails);
			    waitForElement(searchdevicepage.btn_deviceportRT_shelfexpand_Addcard_addcardsavecarddetails);
			    //Thread.sleep(8000);
			    searchdevicepage.ddl_deviceportRT_shelfexpand_Addcard_slotno.selectByIndex(1);
			    jsClick(searchdevicepage.btn_deviceportRT_shelfexpand_Addcard_addcardsavecarddetails);
			    //Thread.sleep(10000);
			    waitForElement(devcreatepage.success_alert);
			    jsClick(searchdevicepage.lbl_GDBcreatetab);
			    //Thread.sleep(5000);
			    waitForElement(gdbcreatepage.btn_gpon_OLT_box);
			
	}
	}
	
	@Step
	public void Usability_validation(String serviceType,String serviceCapabilityType) throws InterruptedException {
		actvtnpage.Validation_Usability(serviceType,serviceCapabilityType);		
	}
	
	@Step
	public void Usability_validation(String serviceType,String serviceCapabilityType1,String serviceCapabilityType2) throws InterruptedException {
		searchservicepage.Validation_Usabilites(serviceType,serviceCapabilityType1,serviceCapabilityType2);		
	}
	
	@Step
	public void validate_service_tab(){
		searchservicepage.validate_servicetab();
	}
	@Step
	public void select_row_option(String rows) throws Throwable{
		searchdevicepage.select_row_option(rows);
	}
	@Step
	public void i_clicked_on_task_search_button() throws Throwable{
		taskpage.click_task_searchbtn();
	}
	@Step
	public void i_clicked_on_task_advancesearch_page() throws Throwable{
		taskpage.click_task_searchbtn_advancesearch_page();
	}
	@Step
	public void click_searchBtn(String button) throws FileNotFoundException, IOException, Throwable {  
		if(actvtnpage.ddl_searchType.isCurrentlyVisible()){
		actvtnpage.click_searchbtn(button);
		
		/* loginPage.waitFor(actvtnpage.btn_view);
		 loginPage.waitForTextToAppear(actvtnpage.btn_view, 100)*/
		 //slf4jLogger.info("Second stage");
		//Thread.sleep(10000);
		
		Thread.sleep(3000);
		if(actvtnpage.lbl_error_msg_invalid_criteria_search_sliber.isCurrentlyVisible()){
			if(fileiotest.readFile("Tag_name").contains("GFast")){
				
			/*orderpage.gfast_write_data_inexcel("GFast-Sheet", fileiotest.readFile("Sheet_name"), orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name"),"Automation Result"), "Fail");
			orderpage.gfast_write_data_inexcel("GFast-Sheet", fileiotest.readFile("Sheet_name"), orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name"),"TimeStamp"), loginPage.getDate("MM-dd-yyyy HH:mm:ss"));
			
			orderpage.gfast_write_data_inexcel("GFast-Sheet", fileiotest.readFile("Sheet_name"), orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name"),"TimeStamp")+1, "Invalid Data:"+actvtnpage.lbl_error_msg_invalid_criteria_search_sliber.getText());*/
			orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Invalid Data:"+actvtnpage.lbl_error_msg_invalid_criteria_search_sliber.getText());
			}
			throw new Error(actvtnpage.lbl_error_msg_invalid_criteria_search_sliber.getText()+":Message is displayed in Search Slider may be use to Invalid Data/conditions");
		
		}
		
		
		waitForElement(actvtnpage.tab_closeall_tab);
		
		slf4jLogger.info("Done with searching");
		
		
		/*if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
			if(orderpage.btn_order_ACTIVE_tab_search_view_page.isCurrentlyVisible()){
				waitForElement(orderpage.btn_dispatch);
			}
			}*/ /*else if(orderpage.tab_search_result_page.isCurrentlyVisible()){
				//waitForElement(actvtnpage.lbl_Searchresultpage);
				 WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 10);
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//label[text()='Search Type']/following-sibling::select")));
			}*/
	} else {
		slf4jLogger.info("Already data is been displayed");
	}
		
	}
	
	
	
	@Step
	public void select_viewBtn() {		
		actvtnpage.click_viewbtn();
	}
	//select_viewBtn_InserviceDevice()
	@Step
	public void select_viewBtn_InserviceDevice() throws InterruptedException {		
		int row;
		for(row=0;row<=12;row++){
			String r= String.valueOf(row);
			//WebElement e=actvtnpage.getDriver().findElement(By.xpath("(.//select[@id='deviceType'])"+x+""))
			WebElement e= actvtnpage.getDriver().findElement(By.xpath("(//div[starts-with(@id,'row"+r+"jqxGrid')]/div)[12]"));
			WebElement b= actvtnpage.getDriver().findElement(By.xpath("(//div[starts-with(@id,'row"+r+"jqxGrid')]/div)[1]/div"));
			System.out.println(e.getText());
			if(e.getText().equals("Planned")){
				
				Thread.sleep(6000);
				System.out.println("<--<--Clicking on the 360-->-->");
				System.out.println(r);
			 
				b.click();
				//jsClick(b);
				Thread.sleep(10000);
				row=11;
			}
			
		}
		
	}
	
	@Step
	public void click_rma() throws InterruptedException{
		Thread.sleep(20000);
		actvtnpage.click_rma();
	}
	
	@Step
	public void check_rma() throws InterruptedException{
		Thread.sleep(20000);
		actvtnpage.check_rma();
	}
	
	@Step
	public void select_topologyview_relatedtab() throws Throwable {		
		searchTopologyPage.click_tab_topology();
	}
	
	@Step
	public void validate_topologyview_relatedtab() throws Throwable {		
		searchTopologyPage.click_tab_topology();
	}
	
	@Step
	public void validate_circuitview_relatedtab() throws Throwable {		
		searchTopologyPage.click_tab_circuit();
	}
	@Step
	public void validate_devicesview_relatedtab() throws Throwable {		
		searchTopologyPage.click_tab_devices();
	}
	@Step
	public void validate_locationsview_relatedtab() throws Throwable {		
		searchTopologyPage.click_tab_locations();
	}
	@Step
	public void validate_SVLANview_relatedtab() throws Throwable {		
		searchTopologyPage.click_tab_SVLAN();
	}
	
	@Step
	public void verify_disconnect_search_options() throws Throwable {		
		
		taskpage.verify_disconnect_task_search_options();
	}
	
	@Step
	public void click_createbutton(){
		//devcreatepage.tbx_locationClli.clear();
		devcreatepage.clickcreate();
	}
	
	
	@Step
	public void click_createlaunchformbutton(){
		try {
			actvtnpage.clickcreatelaunchform();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Step
	public void verify_deviceSearchPage() {
		shouldExist(searchdevicepage);
	}
	
	@Step
	public void click_servicesTab(String tab) throws Throwable { 
		//slf4jLogger.info("entered the Second stage"+tab);
		searchdevicepage.click_servicetab(tab);
	}
	@Step
	public void click_DevicesTab(String tab) throws Throwable { 
		//slf4jLogger.info("entered the Second stage"+tab);
		searchdevicepage.click_Device_related_tab(tab);
	}
	@Step
	public void update_serviceName() throws Exception {
		String val = assocservicespage.verify_before_servicename();
		slf4jLogger.info("value is:=" + val);
		assocservicespage.click_devicelookup();
		Thread.sleep(10000);
		devicelookuppage.click_devicelookupeditbtn();
		fillMandatoryFields(searchservicepage);
		searchservicepage.click_savebtn();	
	}
	
	@Step
	public void back_to_servicesTab() throws Exception {
		searchservicepage.click_closetab();
		Thread.sleep(5000);
		searchservicepage.click_devicetab();
	}
	
	@Step
	public void click_onRefresh() throws Exception {
		assocservicespage.click_refreshbtn();		
	}
	
	@Step
	public void fill_fields_from(String container1, String container2,String container3)
	{
		//slf4jLogger.info(get_container_from_xml("OVActivationPage","US31642-TC20884","Less than 1").getFieldValue("tbx_ctagtxtfield1").toString());
		//String container= get_data_for_page(actvtnpage).getContainer("US31642-TC20884").getFieldValue("tbx_ctagtxtfield1").toString();
		//if(container!=null){
		//	slf4jLogger.info("not null");
	//	}else{
	//		slf4jLogger.info("null");
	//	}
		
		//fillMandatoryFields(actvtnpage,get_container_from_xml(container1, container2,container3));
		
		fillMandatoryFields(fillfieldscls,get_container_from_xml(container1, container2,container3));
	}
	
	@Step
	 public void createtab_inventory_selectTopologytype(String Topologytype) throws Throwable{
		 actvtnpage.ddl_createtab_topologytype.selectByVisibleText(Topologytype).click();
	 }
	
	@Step
	public void Fill_fields_for_PW_circuit()
	{
	waitForElement(fillfieldscls.tbx_alias1);	
	fillfieldscls.ddl_CreateService_usagetype.selectByIndex(1);
	long time = System.currentTimeMillis()/100;
	fillfieldscls.tbx_alias1.type(time+"");
	//fillfieldscls.tbx_alias1.type("PW Unrouted-Auto"+time);
	//fillfieldscls.ddl_circuitcreatepage_usagetype.selectByIndex(2);
	if(createcircuitpage.btn_Circuit_createform_topologyvc_startdevicelookup.isCurrentlyVisible()){
		createcircuitpage.verifyvalidation("Start-Device association-Pseudo Wire");
	}
	if(createcircuitpage.btn_Circuit_createform_Lagmembersection_circuitlookup.isCurrentlyVisible()){
		createcircuitpage.verifyvalidation("Circuit association");
	}
	
	if(createcircuitpage.btn_Circuit_createform_opticalbearer_linklookup.isCurrentlyVisible()){
		createcircuitpage.verifyvalidation("Link association for Optical Bearer");
	}
	}
	
	@Step
	public void fill_fields_basedon_type(String container1, String container2,String container3)
	{
		try {
		switch(container1){		
		
		case "OVCreateTopologyPage":fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateTopologyPage",container2));
			
			
								break;
		
		case "OVCreateLinkPage": waitForElement(ovcreatelinkpage.btn_linkcreate_create);
										
										fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateLinkPage",container2,"General Section"));
										
										if(ovcreatelinkpage.btn_link_createform_startdevicelookup.isCurrentlyVisible()){
											jsClick(ovcreatelinkpage.btn_link_createform_startdevicelookup);
											waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_lckicon);
											ovcreatelinkpage.tbx_link_createform_devicenamelookup_buildinclli.type("GLRDFLXA");
											jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_lckicon);		
											
												Thread.sleep(3000);
											
											waitForElement(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult1);
											ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult1.click();
											jsClick(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult1);
											waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_startportlookup);
											jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_startportlookup);
											
											waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
											jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
											Thread.sleep(3000);
											waitForElement(ovcreatelinkpage.lbl_link_createform_devicenamelookup_device_Deviceportresult);
											ovcreatelinkpage.lbl_link_createform_devicenamelookup_device_Deviceportresult.click();											
											jsClick(ovcreatelinkpage.lbl_link_createform_devicenamelookup_device_Deviceportresult);
											
												Thread.sleep(1000);
											
										}
										if(ovcreatelinkpage.btn_link_createform_enddevicelookup.isCurrentlyVisible()){
											jsClick(ovcreatelinkpage.btn_link_createform_enddevicelookup);
											waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_lckicon);
											ovcreatelinkpage.tbx_link_createform_devicenamelookup_buildinclli.type("WNGRFLXA");
											jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_lckicon);
											
												Thread.sleep(3000);
										
											waitForElement(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult1);
											//ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult2.click();
											jsClick(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult1);
											Thread.sleep(3000);
											while(!ovcreatelinkpage.btn_link_createform_devicenamelookup_device_endportlookup.isCurrentlyVisible()){
												jsClick(ovcreatelinkpage.btn_link_createform_startdevicelookup);
												waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_lckicon);
												ovcreatelinkpage.tbx_link_createform_devicenamelookup_buildinclli.type("WNGRFLXA");
												jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_lckicon);
												
													Thread.sleep(3000);
													WebElement target = loginPage.getDriver().findElement(By.linkText(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult1.getText()));
													((JavascriptExecutor) loginPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", target);
													Thread.sleep(500); 
													target.click();								
											
									
												Thread.sleep(2000);
												if(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult2.isCurrentlyVisible()){
													jsClick(ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult2);
												}
												
											}
											waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_endportlookup);
											
											jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_endportlookup);
											waitForElement(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
											jsClick(ovcreatelinkpage.btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
											Thread.sleep(3000);											
											waitForElement(ovcreatelinkpage.lbl_link_createform_devicenamelookup_device_Deviceportresult);
											ovcreatelinkpage.lbl_link_createform_devicenamelookup_device_Deviceportresult.click();
											jsClick(ovcreatelinkpage.lbl_link_createform_devicenamelookup_device_Deviceportresult);
											
										}
										
										if(ovcreatelinkpage.btn_link_createform_Fiber_wirecentercllilookup.isCurrentlyVisible()){
											
											jsClick(ovcreatelinkpage.btn_link_createform_Fiber_wirecentercllilookup);
											
											waitForElement(ovcreatelinkpage.btn_link_createform_Fiber_wirecenterclli_lckicon);
											
											ovcreatelinkpage.tbx_link_createform_Fiber_wirecenterclli_buildindclli.type("GLRDFLXA");
											jsClick(ovcreatelinkpage.btn_link_createform_Fiber_wirecenterclli_lckicon);
											
												Thread.sleep(3000);
										
											waitForElement(ovcreatelinkpage.lbl_link_createform_Fiber_wirecenterclli_buildindclliresult1);
											//ovcreatelinkpage.lbl_link_createform_devicenamelookup_deviceresult2.click();
											jsClick(ovcreatelinkpage.lbl_link_createform_Fiber_wirecenterclli_buildindclliresult1);
															
										}
										
										
											break;
		case "OVCreateSubscriberPage":waitForElement(createsubscriberpage.btn_SubscriberCreate);
									slf4jLogger.info("Container value:"+get_container_from_xml("OVCreateSubscriberPage","TC39187").getFieldValue("tbx_Subscriber_Create_subscribername").toString());
									fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateSubscriberPage","TC39187"));break;		
			
		case "OVCreateQOSTemplate":waitForElement(ovcreateqostemplate.btn_createpage_QOSTemplate_Create);
		//	slf4jLogger.info("Container value:"+get_container_from_xml("OVCreateQOSTemplate","TC39193").getFieldValue("tbx_createpage_QOSTemplate_templatename").toString());
			fillMandatoryFields(fillfieldscls,get_container_from_xml(container1,container2));break;
			
		case "OVCreateCircuitPage": waitForElement(fillfieldscls.tbx_alias1);		
			fillMandatoryFields(fillfieldscls,get_container_from_xml(container1, container2));
			createcircuitpage.verifyvalidation("Subscriber fill");
			if(createcircuitpage.btn_Circuit_createform_topologyvc_startdevicelookup.isCurrentlyVisible()){
				createcircuitpage.verifyvalidation("Start-Device association");
			}
			if(createcircuitpage.btn_Circuit_createform_Lagmembersection_circuitlookup.isCurrentlyVisible()){
				createcircuitpage.verifyvalidation("Circuit association");
			}
			
			if(createcircuitpage.btn_Circuit_createform_opticalbearer_linklookup.isCurrentlyVisible()){
				createcircuitpage.verifyvalidation("Link association for Optical Bearer");
			}
			
		case "OVCreatePWDCircuitPage": waitForElement(fillfieldscls.tbx_alias1);	
		System.out.println();
		fillMandatoryFields(fillfieldscls,get_container_from_xml(container1));
		//createcircuitpage.verifyvalidation("Subscriber fill");
		if(createcircuitpage.btn_Circuit_createform_topologyvc_startdevicelookup.isCurrentlyVisible()){
			createcircuitpage.verifyvalidation("Start-Device association");
		}
		if(createcircuitpage.btn_Circuit_createform_Lagmembersection_circuitlookup.isCurrentlyVisible()){
			createcircuitpage.verifyvalidation("Circuit association");
		}
		
		if(createcircuitpage.btn_Circuit_createform_opticalbearer_linklookup.isCurrentlyVisible()){
			createcircuitpage.verifyvalidation("Link association for Optical Bearer");
		}
		
										break;
		case "OVCreateContactPage": 	fillMandatoryFields(fillfieldscls,get_container_from_xml(container1,container2,container3));
									//fillMandatoryFields(ovcreatecontactpage,get_container_from_xml(container1,container2,container3));
									if(ovcreatecontactpage.tbx_email.isCurrentlyVisible()){
										ovcreatecontactpage.verify_validation("Select checkboxes");
									}break;
									
		case "OVCreateNumberPage": ovcreatenumberpage.fill_createfilds(container1, container2,container3);
								/*slf4jLogger.info(get_container_from_xml("OVCreateNumberPage","TC209525").getFieldValue("tbx_Numbercreate_name").toString());
									fillMandatoryFields(ovcreatenumberpage,get_container_from_xml(container1,container2,container3));
									if(ovcreatenumberpage.btn_Numbercreate_Objectlookup.isCurrentlyVisible()){
										ovcreatenumberpage.verify_validation("Service Select in lookup");
									}*/break;
									
		case "OVCreateCLCContactPage":
			if(container2.equals("Existing")){
				actvtnpage.click_actscreentab("Search");
				 
				actvtnpage.ddl_searchType.selectByVisibleText("Inventory").click();
				try {
					Thread.sleep(1000);
				
				actvtnpage.ddl_invntryType.selectByVisibleText("CLC Contact").click();
				
				i_update_something("Search CLC contact with Abinash");
				actvtnpage.click_searchbtn("CLC Contact");
				waitForElement(actvtnpage.btn_view);
				jsClick(actvtnpage.btn_view);	
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			fillMandatoryFields(fillfieldscls,get_container_from_xml(container1,container2,container3));
			jsClick(createclccontactpage.btn_clccontactcreate_custnamelookup);
			waitForElement(createclccontactpage.btn_clccontactcreate_custnamelookup_subscriberlookup);
			fillMandatoryFields(fillfieldscls,get_container_from_xml(container1,container2,"Subscriber"));
			jsClick(createclccontactpage.btn_clccontactcreate_custnamelookup_subscriberlookup);
			waitForElement(createclccontactpage.lbl_clccontactcreate_custnamelookup_subscriber);
			jsClick(createclccontactpage.lbl_clccontactcreate_custnamelookup_subscriber);
			waitForElement(createclccontactpage.lbl_clccontactcreate_custnameadded);
		case "OVCreateLogicalPortPage":fillMandatoryFields(fillfieldscls,get_container_from_xml(container1,container2,container3)); 
										if(ovcreatelogicalport.btn_devicelookup_glass.isCurrentlyVisible()){
											jsClick(ovcreatelogicalport.btn_devicelookup_glass);
											waitForElement(ovcreatelogicalport.btn_EBCreate_devicelookup_lookup);
											fillMandatoryFields(ovcreatelogicalport,get_container_from_xml(container1,container2,"Devicelookup"));
											jsClick(ovcreatelogicalport.btn_EBCreate_devicelookup_lookup);
											waitForElement(ovcreatelogicalport.lbl_EBCreate_devicelookup_result);
											jsClick(ovcreatelogicalport.lbl_EBCreate_devicelookup_result);
											waitForElement(ovcreatelogicalport.btn_EBCreate_deviceportlookup);
											jsClick(ovcreatelogicalport.btn_EBCreate_deviceportlookup);
											waitForElement(ovcreatelogicalport.btn_EBCreate_deviceportlookup_lookup);
											jsClick(ovcreatelogicalport.btn_EBCreate_deviceportlookup_lookup);
											waitForElement(ovcreatelogicalport.lbl_EBCreate_deviceportlookup_result);
											jsClick(ovcreatelogicalport.lbl_EBCreate_deviceportlookup_result);
											
										}break;
										
		case "OVCreateServicePage": 
			
			//slf4jLogger.info(get_container_from_xml("OVCreateServicePage","TC55691","Createform").getFieldValue("tbx_Service_Name").toString());
			//fillMandatoryFields(servicecreatepage,get_container_from_xml(container1,container2,container3));
			servicecreatepage.fill_fields(container2,container3);
			break; 
			
			
		case "OVCreateSerivceAreaPage": waitForElement(createserviceareapage.btn_ServiceareaCreate);waitForElement(createserviceareapage.btn_SAcreateform_devicelcn);
		
							if(createserviceareapage.btn_SAcreateform_devicelcn.isCurrentlyVisible()){
								jsClick(createserviceareapage.btn_SAcreateform_devicelcn);
								waitForElement(createserviceareapage.btn_SAcreateform_lckupicon);
								//slf4jLogger.info("tbx_SAcreateform_lcnlckup_buildindclli:"+get_container_from_xml("OVCreateSerivceAreaPage","ISA12346","Devicelcn").getFieldValue("tbx_SAcreateform_lcnlckup_buildindclli").toString());
								fillMandatoryFields(fillfieldscls,get_container_from_xml(container1, container2,"Devicelcn"));
								//fillMandatoryFields(createserviceareapage,get_container_from_xml(container1,container2,"Devicelcn"));
								jsClick(createserviceareapage.btn_SAcreateform_lckupicon);
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								waitForElement(createserviceareapage.lbl_SAcreateform_locnresult);
								jsClick(createserviceareapage.lbl_SAcreateform_locnresult);
							}
							
							//fillMandatoryFields(createserviceareapage,get_container_from_xml(container1,container2,container3));
							fillMandatoryFields(fillfieldscls,get_container_from_xml(container1, container2,container3));
							
							if(createserviceareapage.btn_createform_devicename.isCurrentlyVisible()){
								jsClick(createserviceareapage.btn_createform_devicename);
								waitForElement(createserviceareapage.btn_SAcreateform_devicenamellokupicon);
								fillMandatoryFields(fillfieldscls,get_container_from_xml(container1, container2,"Devicerole"));
								//fillMandatoryFields(createserviceareapage,get_container_from_xml(container1,container2,"Devicerole"));
								jsClick(createserviceareapage.btn_SAcreateform_devicenamellokupicon);
								waitForElement(createserviceareapage.lbl_SAcreateform_devicename_result);
								jsClick(createserviceareapage.lbl_SAcreateform_devicename_result);
							} break;
		
									
		}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	@Step
	public void fill_fields_lookup(String container1, String container2,String container3)
	{
		devcreatepage.tbx_addNo.sendKeys((get_container_from_xml(container1, container2,container3).getFieldValue("tbx_addNo").toString()));
		slf4jLogger.info(get_container_from_xml("OVCreateDevicePage","US43123-TC24409","Locationdata").getFieldValue("tbx_streetName").toString());
		//IntDataContainer container= get_data_for_page(actvtnpage).getContainer("US31642-TC20884").getContainer("Less than 1");
		//if(container!=null){
		//	slf4jLogger.info("not null");
	//	}else{
	//		slf4jLogger.info("null");
	//	}
		fillMandatoryFields(devcreatepage,get_container_from_xml(container1, container2,container3));
	}
	
	@Step
	public void is_having_updatedassociatedservicename() throws Exception {
		String updatedsrvcname = assocservicespage.verify_after_servicename();
		
		if(updatedsrvcname.equals("77/L1XX/785391//ADCD")) 
		{
			slf4jLogger.info("Service name didn't change;Before Updating servicing name is 77/L1XX/785391//CTKF " + ";After updating service name is "  + updatedsrvcname);
		}else 
		{
			slf4jLogger.info("Service name didn't change successfully");
		}
		
	}
	@Step
	public void	Revertback_name() {
		try {
			//String val = assocservicespage.verify_before_servicename();
			//slf4jLogger.info("value is:=" + val);
			modassocservicespage.click_devicelookup();
			Thread.sleep(10000);
			devicelookuppage.click_devicelookupeditbtn();
			fillMandatoryFields(modservicedetailspage);
			modservicedetailspage.click_savebtn();	
		
			/* checking
			assocservicespage.Revertbck_name();
			//devicelookuppage.click_devicelookupeditbtn();
			servicedetailspage.Revertname();
			servicedetailspage.click_savebtn();	 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step
	public void	Revertback_name_Ctag(){
		try {
			Thread.sleep(5000);
			//slf4jLogger.info(servicedetailspage.btn_Ctagdelete.getText());
			while(searchservicepage.btn_Ctagdelete.isVisible()){
				searchservicepage.click_Ctagdelete();
				//switchToChildWindow();
				Robot rb =new Robot();
				//Alert alert = driver.switchTo().alert();
				 //alert.accept();
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);		
				 Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Step
	public void logoutfrom_application() throws Exception {
		searchservicepage.click_logoutinsettings();
	}

	@Step
	public void ctag_update(String ctag_range) throws Exception {
		jsClick(assocservicespage.btn_ctagadd);
		//String Alertmsg=assocservicespage.Alerttxt_txtbx.getText();
		waitForElement(actvtnpage.tbx_ctagtxtfield1);
		switch(ctag_range){
		case "Delete the added CTag range":  int i=1;
											while(i!=0){
												if(assocservicespage.btn_ctag_cancel.isCurrentlyVisible()){
													jsClick(assocservicespage.btn_ctag_cancel);
												}
												if(!assocservicespage.btn_ctag_delete.isCurrentlyVisible()){
													break;
												}
												jsClick(assocservicespage.btn_ctag_delete);
												waitForAlert(getDriver());
												Thread.sleep(2000);
												
											}
											break;
			
		case "Less than 1": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(2000);
							jsClick(assocservicespage.btn_ctagsave);/// *****************  Change this condition to some place else***************
							if(assocservicespage.lbl_alertmsgctag.getText().contains("Start and End values should be in range from 1 to 4095."))
							{
								slf4jLogger.info("Enter valid text between range 1 to 4095");
								jsClick(assocservicespage.btn_alertmsgctag_clsicon);
							}
							//assocservicespage.btn_ctagcancel);
							Thread.sleep(10000); break;
							
		case "Alphanumeric values": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									jsClick(assocservicespage.btn_ctagsave);
									 Thread.sleep(1000);/// *****************  Change this condition to some place else***************
									 if(assocservicespage.lbl_alertmsgctag.getText().contains("Please enter a numeric value."))
										{
											slf4jLogger.info("Enter valid text between range 1 to 4095");
											Thread.sleep(10000);
											jsClick(assocservicespage.btn_alertmsgctag_clsicon);
										}
										//assocservicespage.btn_ctagcancel);
										Thread.sleep(10000); break;
										
		case "Greater than 4095": fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									jsClick(assocservicespage.btn_ctagsave);/// *****************  Change this condition to some place else***************
									if(assocservicespage.lbl_alertmsgctag.getText().contains("Start and End values should be in range from 1 to 4095."))
									{
										slf4jLogger.info("Enter valid text between range 1 to 4095");
										Thread.sleep(10000);
										jsClick(assocservicespage.btn_alertmsgctag_clsicon);
									}
									//assocservicespage.btn_ctagcancel);
									Thread.sleep(10000); break;
									
									
		case "Single Range 1-4095":	fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
										Thread.sleep(1000);
										jsClick(assocservicespage.btn_ctagsave);
											Thread.sleep(10000); break;
											
		case "Multiple Range between 1-4095":	fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
												//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
												Thread.sleep(10000);
												jsClick(assocservicespage.btn_ctagsave);
												Thread.sleep(5000);
												/*searchdevicepage.tab_orders);
												Thread.sleep(3000);
												searchdevicepage.tab_ctag);
												Thread.sleep(3000);*/
												jsClick(assocservicespage.btn_ctagadd);
												Thread.sleep(10000);
												fill_fields_from("OVActivationPage","US31642-TC20884","Multiple Range between 1-4095 secound range");
												Thread.sleep(10000);
												jsClick(assocservicespage.btn_ctagsave);
												Thread.sleep(5000);
												/*searchdevicepage.tab_orders);
												Thread.sleep(3000);
												searchdevicepage.tab_ctag);
												Thread.sleep(3000);*/
												jsClick(assocservicespage.btn_ctagadd);
												Thread.sleep(10000);
												fill_fields_from("OVActivationPage","US31642-TC20884","Multiple Range between 1-4095 third range");
												Thread.sleep(1000);
												jsClick(assocservicespage.btn_ctagsave);
												Thread.sleep(10000); break;
												
		case "Single Number Range":		fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
										//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
										Thread.sleep(1000);
										jsClick(assocservicespage.btn_ctagsave);
										Thread.sleep(10000); break;
										
		case "Modify the Ctag Range": ctag_update("Multiple Range between 1-4095");
												assocservicespage.tbx_editctag_fld1.clear();
										assocservicespage.tbx_editctag_fld2.clear();
										Thread.sleep(1000);
										fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
										//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
										Thread.sleep(1000);
										jsClick(assocservicespage.btn_ctagsave);
										Thread.sleep(10000);
										if(assocservicespage.lbl_succmsgctag.getText().contains("Pool range(s) created/updated successfully.")){
											slf4jLogger.info("Successfully validated modified Ctag");
											Thread.sleep(10000);
											jsClick(assocservicespage.btn_succmsgctag);
										}			break;			
			
		case "Overlapping the CTag range": 	jsClick(assocservicespage.btn_ctagadd);
											Thread.sleep(5000);
											fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
											//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
											Thread.sleep(1000);
											jsClick(assocservicespage.btn_ctagsave);
								/*							if(assocservicespage.Alerttxt_txtbx.getText()=="Start value or End value is overlapping with an existing pool range.")
											{
												slf4jLogger.info("Overlapping CTag Range");
											}
											assocservicespage.btn_ctagcancel);*/
											if(assocservicespage.lbl_alertmsgctag.getText().contains(""))
											{
												slf4jLogger.info("Enter valid text between range 1 to 4095");
												Thread.sleep(10000);
												jsClick(assocservicespage.btn_alertmsgctag_clsicon);
											}
											//assocservicespage.btn_ctagcancel);
											Thread.sleep(10000); break;	
		}
	
		/*if(ctag_range.equals("Less than 1")){
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			//enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			//slf4jLogger.info(enduser.get_data_for_page(actvtnpage).getContainer(ctag_range));

			//ctagtxt_field1.sendKeys("0");
			//ctagtxt_field2.sendKeys("1");
			Thread.sleep(2000);
			assocservicespage.btn_ctagsave);/// *****************  Change this condition to some place else***************
			if(assocservicespage.lbl_alertmsgctag.getText().contains("Start and End values should be in range from 1 to 4095."))
			{
				slf4jLogger.info("Enter valid text between range 1 to 4095");
				assocservicespage.btn_alertmsgctag);
			}
			//assocservicespage.btn_ctagcancel);
			Thread.sleep(10000);
		}
		
		else if(ctag_range.equals("Alphanumeric values")){
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			Thread.sleep(1000);
			assocservicespage.btn_ctagsave);
			 Thread.sleep(1000);/// *****************  Change this condition to some place else***************
			 if(assocservicespage.lbl_alertmsgctag.getText().contains("Please enter a numeric value."))
				{
					slf4jLogger.info("Enter valid text between range 1 to 4095");
					Thread.sleep(10000);
					assocservicespage.btn_alertmsgctag);
				}
				//assocservicespage.btn_ctagcancel);
				Thread.sleep(10000);
		}
							
		else if(ctag_range.equals("Greater than 4095")){
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			Thread.sleep(1000);
			assocservicespage.btn_ctagsave);/// *****************  Change this condition to some place else***************
			if(assocservicespage.lbl_alertmsgctag.getText().contains("Start and End values should be in range from 1 to 4095."))
			{
				slf4jLogger.info("Enter valid text between range 1 to 4095");
				Thread.sleep(10000);
				assocservicespage.btn_alertmsgctag);
			}
			//assocservicespage.btn_ctagcancel);
			Thread.sleep(10000);
		}
		
		else if(ctag_range.equals("Single Range 1-4095")){
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
				Thread.sleep(1000);
					assocservicespage.btn_ctagsave);
					Thread.sleep(10000);
		}
		
		else if(ctag_range.equals("Multiple Range between 1-4095")){
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			Thread.sleep(10000);
			assocservicespage.btn_ctagsave);
			Thread.sleep(5000);
			searchdevicepage.tab_orders);
			Thread.sleep(3000);
			searchdevicepage.tab_ctag);
			Thread.sleep(3000);
			assocservicespage.btn_ctagadd);
			Thread.sleep(10000);
			fill_fields_from("OVActivationPage","US31642-TC20884","Multiple Range between 1-4095 secound range");
			Thread.sleep(10000);
			assocservicespage.btn_ctagsave);
			Thread.sleep(5000);
			searchdevicepage.tab_orders);
			Thread.sleep(3000);
			searchdevicepage.tab_ctag);
			Thread.sleep(3000);
			assocservicespage.btn_ctagadd);
			Thread.sleep(10000);
			fill_fields_from("OVActivationPage","US31642-TC20884","Multiple Range between 1-4095 third range");
			Thread.sleep(1000);
			assocservicespage.btn_ctagsave);
			Thread.sleep(10000);
		}
		
		else if(ctag_range.equals("Single Number Range")){
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			Thread.sleep(1000);
			assocservicespage.btn_ctagsave);
			Thread.sleep(10000);
		}
		
		else if(ctag_range.equals("Modify the Ctag Range")){
			ctag_update("Multiple Range between 1-4095");
			assocservicespage.tbx_editctag_fld1.clear();
			assocservicespage.tbx_editctag_fld2.clear();
			Thread.sleep(1000);
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			Thread.sleep(1000);
			assocservicespage.btn_ctagsave);
			Thread.sleep(10000);
			if(assocservicespage.lbl_succmsgctag.getText().contains("Pool range(s) created/updated successfully.")){
				slf4jLogger.info("Successfully validated modified Ctag");
				Thread.sleep(10000);
				assocservicespage.btn_succmsgctag);
			}						
		}
		
		else if(ctag_range.equals("Overlapping the CTag range")){
			assocservicespage.btn_ctagadd);
			Thread.sleep(5000);
			fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
			//get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
			Thread.sleep(1000);
			assocservicespage.btn_ctagsave);
							if(assocservicespage.Alerttxt_txtbx.getText()=="Start value or End value is overlapping with an existing pool range.")
			{
				slf4jLogger.info("Overlapping CTag Range");
			}
			assocservicespage.btn_ctagcancel);
			if(assocservicespage.lbl_alertmsgctag.getText().contains(""))
			{
				slf4jLogger.info("Enter valid text between range 1 to 4095");
				Thread.sleep(10000);
				assocservicespage.btn_alertmsgctag);
			}
			//assocservicespage.btn_ctagcancel);
			Thread.sleep(10000);
		}	*/
		
				
	}

	@Step
	public void selectType(String type,String subtype){
		//fillMandatoryFields(actvtnpage,get_container_from_xml(actvtnpage).getContainer(type));
		//actvtnpage.selectCreateType(type,subtype);
		//fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(subtype));
		fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(type));
		fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer(subtype));
	}
	
	@Step
	public void attri_field() {
		try {
			searchdevicepage.attribute_field();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step
	public void locn_field(){
		slf4jLogger.info(get_container_from_xml("OVCreateDevicePage","US43123-TC24409","Locationdata").getFieldValue("tbx_streetName").toString());
		fill_fields_from("OVCreateDevicePage","US43123-TC24409","Locationdata");
		//fillMandatoryFields(devcreatepage);
		//fill_fields_from("OVCreateDevicePage","US43123-TC24409","Locationdata");
	}
	
	@Step
	public void action_createscreen(String action) throws Throwable{
		devcreatepage.action_createscreen(action);		
	}
	
	@Step
	public void fillmandatoryfield_device(String testdata) throws Throwable{
		
		if(!createcircuitpage.tab_currentlydisplayed.getText().trim().startsWith("Create Contact")){
		
		//######################  location Look up Fill #########################################//
		
		if(devcreatepage.btn_locationLookup_newdevicecreateform.isCurrentlyVisible()){
			jsClick(devcreatepage.btn_locationLookup_newdevicecreateform);
			waitForElement(devcreatepage.btn_lookUp);
			//fill_fields_from("OVCreateDevicePage",testdata,"Locationdata");
			//devcreatepage.tbx_buildingclli.sendKeys(get_container_from_xml("OVCreateDevicePage",testdata,"Locationdata").getFieldValue("tbx_buildingclli").toString());
			devcreatepage.tbx_buildingclli.sendKeys("LSVGNV01");
			jsClick(devcreatepage.btn_lookUp);//Rework67
			//String parentwin=devcreatepage.window_switch();
			Thread.sleep(5000);
			waitForElement(devcreatepage.lnk_addlcn);
			jsClick(devcreatepage.lnk_addlcn);
		}
		
		//######################  Subscriber Look up Fill #########################################//
		
		if(servicecreatepage.btn_subscriberlookupicon.isCurrentlyVisible()){
			jsClick(servicecreatepage.btn_subscriberlookupicon);
			//servicecreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
			fill_fields_from("OVCreateDevicePage",testdata,"Subscribers");
			jsClick(devcreatepage.btn_lookup_window);										
			waitForElement(servicecreatepage.lnk_subcribername);										
			jsClick(servicecreatepage.lnk_subcribername);
		}
		
		//######################  Wire clli Look up Fill #########################################//
		
		if(devcreatepage.btn_wireclli.isCurrentlyVisible()){
			jsClick(devcreatepage.btn_wireclli);
			waitForElement(devcreatepage.btn_wiredlookUp);		
			//fill_fields_from("OVCreateDevicePage",testdata,"Wireddata");
			servicecreatepage.tbx_subcriber_name_window.type("TEST - JANET");
			jsClick(devcreatepage.btn_wiredlookUp);//Rework
			waitForElement(devcreatepage.lnk_addlcn);
			jsClick(devcreatepage.lnk_addlcn);//Rework
			Thread.sleep(2000);
		}
		
		//######################  Topology Look up Fill #########################################//
		
		if(devcreatepage.btn_Topologysearch.isCurrentlyVisible()){
			/*jsClick(devcreatepage.btn_Topologysearch);
			fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
			devcreatepage.topology_fill();*/
			devcreatepage.tbx_createdevice_Topologyfield.type(get_container_from_xml("OVCreateDevicePage",testdata,"Topologydata").getFieldValue("tbx_Topologyname").toString());
		}
		
		//######################  Topology Look up Fill #########################################//
		if(devcreatepage.rdbtn_Shared.isCurrentlyVisible()){
			jsClick(devcreatepage.rdbtn_Shared);
			Thread.sleep(1000);	
		}
		
		//######################  SNMP Version is available #########################################//
		
		if(devcreatepage.ddl_devicecreate_snmpversion.isCurrentlyVisible()){
			devcreatepage.ddl_devicecreate_snmpversion.selectByIndex(0);/*selectByValue("--Select--")*/;
		}
		
		//######################  Other Filed Fill #########################################//
		fill_fields_from("OVCreateDevicePage",testdata,"Devicedata");	
		
	//##################################################################################################//
	//#############################		Contact Create page ########################################################//
		} else {
			
			fillMandatoryFields(ovcreatecontactpage,get_data_for_page(ovcreatecontactpage).getContainer(testdata));
			
			
		}
	}
	
	@Step
	public void fillmandatoryfield(String testdata){
		try
		{	
			Thread.sleep(5000);
			List<WebElementFacade> acutalList = devcreatepage.lbl_allXapath;
			ArrayList<String> atributesOfPage=new ArrayList<String>();
			//slf4jLogger.info("Step one done");
			
			for(int j=0;j<acutalList.size();j++){
				
				atributesOfPage.add(j, acutalList.get(j).getText());
				
				//slf4jLogger.info("Step Two done");
				//slf4jLogger.info(atributesOfPage.get(j));
			}
			
			System.out.println(atributesOfPage);
			//for(int i=0;i<acutalList.size();i++){
			for(int i=0;i<atributesOfPage.size();i++){
				//slf4jLogger.info(atributesOfPage.get(i));
				
			
				
				switch(atributesOfPage.get(i)){
				
				case "Location Address*": //devcreatepage.btn_locationLookup);
					jsClick(devcreatepage.btn_locationLookup_newdevicecreateform);
											waitForElement(devcreatepage.btn_lookUp);
											//fill_fields_from("OVCreateDevicePage",testdata,"Locationdata");
											//devcreatepage.tbx_buildingclli.sendKeys(get_container_from_xml("OVCreateDevicePage",testdata,"Locationdata").getFieldValue("tbx_buildingclli").toString());
											devcreatepage.tbx_buildingclli.sendKeys("LSVGNV01");
											jsClick(devcreatepage.btn_lookUp);//Rework67
											//String parentwin=devcreatepage.window_switch();
											
											Thread.sleep(5000);
											waitForElement(devcreatepage.lnk_addlcn);
											jsClick(devcreatepage.lnk_addlcn);
											//devcreatepage.switch_win(parentwin); 
											break;
											
				case "Subscriber Name*":jsClick(servicecreatepage.btn_subscriberlookupicon);
										//servicecreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
										fill_fields_from("OVCreateDevicePage",testdata,"Subscribers");
										jsClick(devcreatepage.btn_lookup_window);										
										waitForElement(servicecreatepage.lnk_subcribername);										
										jsClick(servicecreatepage.lnk_subcribername);break;
										
				case "Wire Center CLLI*": jsClick(devcreatepage.btn_wireclli);
										waitForElement(devcreatepage.btn_wiredlookUp);		
										fill_fields_from("OVCreateDevicePage",testdata,"Wireddata");
										jsClick(devcreatepage.btn_wiredlookUp);//Rework
										waitForElement(devcreatepage.lnk_addlcn);
										jsClick(devcreatepage.lnk_addlcn);//Rework
										Thread.sleep(2000); break;
										
				case "Topology*":	jsClick(devcreatepage.btn_Topologysearch);  // Need to identify the which one to be present
									fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
									devcreatepage.topology_fill(); break;
									
				case "Topology *":	jsClick(devcreatepage.btn_Topologysearch);
										fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
										devcreatepage.topology_fill(); break;	
										
				case "Shared Flag*":jsClick(devcreatepage.rdbtn_Shared);  // Need to identify the which one to be present
									Thread.sleep(3000);	break;
				
					case "Shared Flag *":jsClick(devcreatepage.rdbtn_Shared);
									Thread.sleep(3000);	break;
									
									
				case "Connector Type*": devcreatepage.ddl_connectortype.selectByVisibleText("GPON");
										Thread.sleep(3000);	break;
										
				case "Splitter Number*": fill_fields_from("OVCreateDevicePage",testdata,"splitter");  // Need to identify the which one to be present
											Thread.sleep(3000);	break;
											
				case "Splitter Number *": fill_fields_from("OVCreateDevicePage",testdata,"splitter");
										Thread.sleep(3000);	break;
											
				case "Device Name*": 	jsClick(devcreatepage.btn_devicelookup);
										Thread.sleep(2000);	
										fill_fields_from("OVCreateDevicePage",testdata,"Deviceclli");
										//actvtnpage.tbx_devicelookup.sendKeys("TESTYYYYT01");
										Thread.sleep(3000);
										jsClick(devcreatepage.btn_lookuplogicalfrm);
										Thread.sleep(10000);
										jsClick(devcreatepage.btn_lookuplogicalport);
										Thread.sleep(2000);
										jsClick(devcreatepage.btn_lookuplogicalport_lookup);
										Thread.sleep(2000);
										jsClick(devcreatepage.lbl_selctlogicalport_lookup);	
										Thread.sleep(2000); break;
										
				case "Device Name *": jsClick(devcreatepage.btn_devicelookup);
									Thread.sleep(2000);	
									fill_fields_from("OVCreateDevicePage",testdata,"Deviceclli");
									//actvtnpage.tbx_devicelookup.sendKeys("TESTYYYYT01");
									Thread.sleep(3000);
									jsClick(devcreatepage.btn_lookuplogicalfrm);
									Thread.sleep(10000);
									jsClick(devcreatepage.btn_lookuplogicalport);
									Thread.sleep(2000);
									jsClick(devcreatepage.btn_lookuplogicalport_lookup);
									Thread.sleep(2000);
									jsClick(devcreatepage.lbl_selctlogicalport_lookup);	
									Thread.sleep(2000); break;
										
				case "Location Role*": if(devcreatepage.rdbtn_addRange.isVisible()){
					jsClick(devcreatepage.rdbtn_addRange);
										Thread.sleep(3000);
										}
									for(int j=1;j<=3;j++){
										devcreatepage.ddl_locationRole.selectByIndex(j);
										Thread.sleep(3000);
										}
									slf4jLogger.info("Done with filling location role");
										break;
										
				case "New Construction Ind*":	devcreatepage.ddl_NewConstructionIndicator.selectByVisibleText("Yes");
												break;
				
				
				}
				/*
				if(atributesOfPage.get(i).equals("Location Address*")){
					devcreatepage.btn_locationLookup);
					String parentwin=devcreatepage.window_switch();
					fill_fields_from("OVCreateDevicePage",testdata,"Locationdata");
					devcreatepage.btn_lookUp);//Rework
					Thread.sleep(5000);
					devcreatepage.switch_win(parentwin);
				}
				
				else if(atributesOfPage.get(i).equals("Subscriber Name*")){
					servicecreatepage.btn_subscriberlookupicon);
					servicecreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
					devcreatepage.btn_lookup_window);
					
					Thread.sleep(5000);
					
					servicecreatepage.lnk_subcribername);
				}
				
				else if(atributesOfPage.get(i).equals("Wire Center CLLI*")){
					devcreatepage.btn_wireclli);
					Thread.sleep(5000);			
					fill_fields_from("OVCreateDevicePage",testdata,"Wireddata");
					devcreatepage.btn_wiredlookUp);//Rework
					Thread.sleep(5000);
					devcreatepage.lnk_addlcn);//Rework
					Thread.sleep(2000);
				}
			
				else if(atributesOfPage.get(i).equals("Topology*")){
					devcreatepage.btn_Topologysearch);
					fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
					devcreatepage.topology_fill();
				}
			
				else if(atributesOfPage.get(i).equals("Shared Flag*")){
					devcreatepage.rdbtn_Shared);
					Thread.sleep(3000);
				}
				
				else if(atributesOfPage.get(i).equals("Connector Type*")){
					devcreatepage.ddl_connectortype.selectByVisibleText("GPON");
					Thread.sleep(3000);	
				}
				
				else if(atributesOfPage.get(i).equals("Splitter Number*")){
					fill_fields_from("OVCreateDevicePage",testdata,"splitter");
					Thread.sleep(3000);	
				}
		
				else if(atributesOfPage.get(i).equals("Device Name*")){
					devcreatepage.btn_devicelookup);
					Thread.sleep(2000);	
					fill_fields_from("OVCreateDevicePage",testdata,"Deviceclli");
					//actvtnpage.tbx_devicelookup.sendKeys("TESTYYYYT01");
					Thread.sleep(3000);
					devcreatepage.btn_lookuplogicalfrm);
					Thread.sleep(10000);
					devcreatepage.btn_lookuplogicalport);
					Thread.sleep(2000);
					devcreatepage.btn_lookuplogicalport_lookup);
					Thread.sleep(2000);
					devcreatepage.lbl_selctlogicalport_lookup);	
					Thread.sleep(2000);
				}
			
				else if(atributesOfPage.get(i).equals("Location Role*")){
					if(devcreatepage.rdbtn_addRange.isVisible()){
						devcreatepage.rdbtn_addRange);
						Thread.sleep(3000);
						}
					for(int j=1;j<=3;j++){
						devcreatepage.ddl_locationRole.selectByIndex(j);
						Thread.sleep(3000);
						}
					slf4jLogger.info("Done with filling location role");
						break;
				}					
		
				else if(atributesOfPage.get(i).equals("New Construction Ind*")){
					devcreatepage.ddl_NewConstructionIndicator.selectByVisibleText("Yes");
					break;
				}	
			
			}*/
			}
			fill_fields_from("OVCreateDevicePage",testdata,"Devicedata");	
			if(devcreatepage.btn_FindAddressRange.isVisible()){
				jsClick(devcreatepage.btn_FindAddressRange);
				Thread.sleep(5000);
				devcreatepage.ddl_addrangeVal.selectByValue("1");
			}
		devcreatepage.form_field();
		Thread.sleep(5000);
		jsClick(devcreatepage.tab); //// Combine my scripts with Luna code-----------2
		//Thread.sleep(5000);
		//WebElement ele = devcreatepage.ddl_Equipment_role.selectByValue("0");	//Divya OSIP Reg this is not needed TC39192
		//String role =ele.getText();		//Divya OSIP Reg this is not needed TC39192
		//created_device_role_is(":"+role+" "+devcreatepage.create_device_successfull_msg());		//Divya OSIP Reg this is not needed TC39192
		created_device_role_is(devcreatepage.create_device_successfull_msg());
		slf4jLogger.info("*******************"+devcreatepage.create_device_successfull_msg());
		//enduser.locn_field();
		//devcreatepage.lnk_locn);	
		
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Step
	public void searched_device_is(String deviceName) throws InterruptedException
	{
		  slf4jLogger.info(searchdevicepage.lbl_deviceName.getText());
	}
	
	@Step//reading the successful msg after one device created
	public void created_device_role_is(String deviceName) throws InterruptedException
	{
		 
		 Thread.sleep(1000);
		 
		
	}
	
	@Step
	public void i_search_order_inadvancesearchOrder(String searchcriteria) throws Throwable{
		orderpage.i_search_order_inadvancesearchOrder(searchcriteria);
	}
	
	@Step
	public void order_advance_search(String searchcriteria) throws Throwable{
		
		waitForElement(orderpage.btn_adsearchcheckbtn);
		
		//jsClick(orderpage.btn_adsearchcheckbtn);
		//waitForAlert(loginPage.getDriver());
		
		//orderpage.order_advance_search(searchcriteria);
				
		orderpage.Advance_search_order();
		switch(searchcriteria){
				case "DTN": fill_fields("DTN Data");
							break;
				case "All": orderpage.servicetype_select_advancesearch("All");break;
							
				case "HSI":orderpage.servicetype_select_advancesearch("HSI");break;
				
				case "IPTV":orderpage.servicetype_select_advancesearch("IPTV");break;
				
				case "IPTV-Unicast":orderpage.servicetype_select_advancesearch("IPTV");break;	
				case "HSI Service":orderpage.servicetype_select_advancesearch("HSI");break;
					}
		
	}
	
	@Step
	public void validate_actiontype_order_Search_page() throws Throwable{
		orderpage.validate_actiontype_order_Search_page();
	}
	
	
	@Step
	public void Order_advancesearch_producttype(String product_type) throws Throwable{
		orderpage.ddl_adsearchorder_producttype.selectByVisibleText(product_type);
		Thread.sleep(1000);
	}
	
	@Step
	public void advance_devicesearch(String role) throws InterruptedException{
		searchdevicepage.advance_device_search(role);
	}
	@Step
	public void advance_devicesearch_mco(String mco_val) throws InterruptedException{
		searchdevicepage.advance_device_search_mco(mco_val);
	}
	@Step
	public void validate_mco_device_search_db(String mco_val) throws InterruptedException{
		searchdevicepage.validate_mco_device_search_db(mco_val);
	}
	
	
	
	@Step
	public void advance_devicetype_search(String type,String subtype) throws InterruptedException{
		searchdevicepage.advance_devicetype_search(type,subtype);
	}
	
	@Step
	public void advance_device_search_status(String status) throws InterruptedException{
		searchdevicepage.advance_device_search_status(status);
	}
	
	
	
	@Step
	public void order_attribute(){
		//slf4jLogger.info("order detaisl"+servicedetailspage.lbl_csof_id.getTextValue()+servicedetailspage.lbl_subscriber.getTextValue()+servicedetailspage.lbl_dtn.getTextValue()+servicedetailspage.lbl_EnsembleOrderNumber.getTextValue());
		//System.out.println(get_data_for_page(actvtnpage).getContainer("lbl_csoderid"));//Adjust the Parameter
		waitForElement(orderpage.tab_Tasks);
	}
	
	@Step
	public void validateaddcontactbutton(){
		searchservicepage.validateaddcontactbutton();
	}
	
	@Step
	public void Location_validateaddcontactbutton(){
		searchservicepage.Locationaddcontactbutton();
	}
	
	@Step
	public void fill_create_GDB(String detailsgpon) throws Throwable{
		if(gdbcreatepage.tab_GDB.isCurrentlyVisible()){
			slf4jLogger.info("GDB is present");
		} else {
			
			actvtnpage.tbx_SWCCLLI.type(getDate("MMDDYY"));
			actvtnpage.tbx_EngOrdId.type(getDate("MMDDYY"));
		actvtnpage.btn_Netwrkbuildcreate("NB");
		}
	}
	
	@Step
	public void createtab_launchform(String launchcreateform) throws Throwable{
		switch(launchcreateform){
		case "Order create form":actvtnpage.btn_Netwrkbuildcreate("Order create form");break;
		default:actvtnpage.btn_Netwrkbuildcreate("any");break;
		
		}
		
	}
	
	@Step
	public void GDB_componentselect(String GDBcomponent) throws Throwable{
		gdbcreatepage.gpon_ntwdevice_select(GDBcomponent);
	}
	
	@Step
	 public void gdb_actionmethods(String GDBcomponent) throws Throwable {
		gdbcreatepage.gdb_actionmethods(GDBcomponent);
	 }
	
	@Step
	public void GDB_devicecreate(String GDBdevicecreate) throws Throwable{
		gdbcreatepage.GDB_Device_select(GDBdevicecreate);
		GDB_Device_create(GDBdevicecreate);
	}
	
	
	
	@Step
	public void create_GDBcomponent_excelread(String GDBdevicecreate) throws Throwable{
		//gdbcreatepage.GDB_Device_select(GDBdevicecreate);
		gdbcreatepage.GDB_Device_create_excel(GDBdevicecreate);
	}
	
	@Step
	public void GDB_Createtab_excel_data(String devicesubtype) throws Throwable{
		selectFormType("Network Build",devicesubtype);
		gdbcreatepage.createtab_GDB_excel(devicesubtype);
	}
	
	@Step
	public void GDB_devicecreate_excel(String device_type) throws Throwable{
		excel_access.ExcelReader(Page.envData.getFieldValue("GDB-Sheet"));
		slf4jLogger.info(excel_access+"Excel Share path");
		int RowCount = excel_access.getColumnCellCount("Input_Sheet");
		slf4jLogger.info("The Number of Rows is = " + RowCount);
		String devicetype,device_subtype, locn_clli, device_clli,  topology_gdb;
		int rowno=0;
		
		switch(device_type){
		case "OLT": rowno=2; break;
		case "FDP-12port": rowno=3; break;
		case "SPLITTER": rowno=4; break;
		case "FDP-144port": gdbcreatepage.GDB_Device_select(device_type);rowno=5; break;
		case "MST": rowno=6; break;
		case "ONT": rowno=7; break;
		
		}
		
		if (rowno!=0){
		
			devicetype = excel_access.getCellData("Input_Sheet", rowno, 3);
			slf4jLogger.info("Check devicetype value = " + devicetype);
			device_subtype= excel_access.getCellData("Input_Sheet", rowno, 4);
			slf4jLogger.info("Check device_subtype value = " + device_subtype);
			locn_clli = excel_access.getCellData("Input_Sheet", rowno, 5);
			slf4jLogger.info("Check locn_clli value = " + locn_clli);
			device_clli = excel_access.getCellData("Input_Sheet", rowno, 6);
			slf4jLogger.info("Check device_clli value = " + device_clli);			
			topology_gdb = excel_access.getCellData("Input_Sheet", rowno, 7);
			slf4jLogger.info("Check topology_gdb value = " + topology_gdb);
			
			GDB_data_input_excelsheet("Input_Sheet", rowno);
			
		} else throw new Error("Invalid GDB device");	
		
		
		fill_fields_from("OVCreateGDBPage","GDB-Device create","GPON_excel-"+device_type);
		//fill_fields_from("OVCreateDevicePage","GDB","OLT");
		Thread.sleep(5000);
			
		jsClick(gdbcreatepage.rbt_NB_sharedFlag);	   	
		
		jsClick(gdbcreatepage.btn_NB_Createicon);
		waitForElement(gdbcreatepage.btn_gpon_expand);
		Thread.sleep(5000);
		
	    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
	    if(!gdbcreatepage.lbl_device_status.getText().equals("Success")){
			GDB_Device_create(device_type);
		}
	    slf4jLogger.info("Device Device: "+gdbcreatepage.lbl_oltdeviceGDB.getText());
	    
		slf4jLogger.info(device_type+" Created Successfully"); 
		Thread.sleep(8000);		
	    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
			slf4jLogger.info("Delete button is Enable After creation");
		}else throw new Error("Delete button is Disable After creation ");
			
	}
	
	@Step
	public void GDB_data_input_excelsheet(String sheetname, int row) throws Throwable{
		if(gdbcreatepage.btn_gpon_expand.isPresent()){
			jsClick(gdbcreatepage.btn_gpon_expand);
			
			}

		loginPage.waitFor(gdbcreatepage.rbt_NB_sharedFlag);
			Thread.sleep(3000);
			
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			
			gdbcreatepage.ddl_NB_deviceType.selectByVisibleText(excel_access.getCellData(sheetname, row, 1));
			Thread.sleep(2000);
			/*gdbcreatepage.ddl_NB_deviceSubType);
			Thread.sleep(1000);*/
			gdbcreatepage.ddl_NB_deviceSubType.selectByVisibleText(excel_access.getCellData(sheetname, row, 2));
			Thread.sleep(2000);
			
			
			
			gdbcreatepage.gdbdeviceclli(excel_access.getCellData(sheetname, row, 4));
			
			gdbcreatepage.gdblocation_fill(excel_access.getCellData(sheetname, row, 3));
			
			//gdbcreatepage.gdbtopology_fill(excel_access.getCellData(sheetname, row, 5));											Needs to be removed
			
			
			
			
	}
	
	@Step
	public void GDB_DeviceStatus(String GDBdevicestatus) throws Throwable{
		if(!gdbcreatepage.lbl_device_status.getText().equals("Success")){
			GDB_Device_create(GDBdevicestatus);
		}
	}
	
	@Step
	public void GDB_associate_SA()throws Throwable{
		
		gdbcreatepage.GDB_associate_SA();
		
		GDB_Associate_SA_address();
	}
	
	@Step
	public void GDB_SA_create_exceldata() throws Throwable{
		gdbcreatepage.GDB_associate_SA_exceldata();
	}
	
	@Step
	public void GDB_SA_associate_address_exceldata() throws Throwable{
		gdbcreatepage.GDB_Associate_SA_address_exceldata();
	}
	
	@Step
	public void GDB_Associate_SA_address() throws Throwable{
		
		jsClick(gdbcreatepage.btn_gpon_expand);
	waitForElement(gdbcreatepage.btn_NB_SA_Location_lookup);
	
	jsClick(gdbcreatepage.btn_NB_SA_Location_lookup);
	
	waitForElement(gdbcreatepage.btn_NB_SA_association_Location_search);
	
	
	//String parentwin=devcreatepage.window_switch();
	//fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
	
	gdbcreatepage.tbx_NB_SA_association_Locationclli.sendKeys("TESTYYYY");
	
	jsClick(gdbcreatepage.btn_NB_SA_association_Location_search);
	
	//waitForInvisibility(lbl_NB_SA_association_Location_loader);
	
	waitForElement(gdbcreatepage.cbx_NB_SA_association_Location_select);
	//gdbcreatepage.cbx_NB_SA_association_Location_select);
	
	Thread.sleep(2000);
	if(!gdbcreatepage.cbx_NB_SA_association_Location_select.isSelected()){
		jsClick(gdbcreatepage.cbx_NB_SA_association_Location_select);
	}
	jsClick(gdbcreatepage.btn_NB_SA_associate_address_create);
	
	Thread.sleep(2000);
	//waitForInvisibility(cbx_NB_SA_association_Location_select);
	gdbcreatepage.tbx_NB_SA_associate_address_rank.clear();
	gdbcreatepage.tbx_NB_SA_associate_address_rank.sendKeys("1");
	
	jsClick(gdbcreatepage.btn_NB_SA_Address_associate_all);
	Thread.sleep(2000);
	loginPage.getDriver().switchTo().alert().accept();
	Thread.sleep(5000);
	waitForElement(gdbcreatepage.lbl_NB_SA_Add_associate_rank);
	
	/*
		
		gdbcreatepage.btn_SA_NB_Location_view);
		String parentwin=devcreatepage.window_switch();
		fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
		devcreatepage.btn_lookUp);//Rework
		Thread.sleep(5000);
		devcreatepage.switch_win(parentwin); 
		gdbcreatepage.btn_NB_Createicon);
		gdbcreatepage.tbx_GDB_SA_Rank.clear();
		gdbcreatepage.tbx_GDB_SA_Rank.sendKeys("1");
		gdbcreatepage.btn_gpon_MST_box);
		Thread.sleep(1000);
		
		gdbcreatepage.btn_gpon_servicearea_box);
		Thread.sleep(2000);
		gdbcreatepage.btn_NB_SA_Add_associate);
		Thread.sleep(5000);*/
	//	gdbcreatepage.btn_NB_SA_Add_associate.shouldNotBeEnabled();
	}
	
	@Step   //Selecting the subtype from Creaet Tab
	public void createtab_subtype_selection(String createtype,String create_subtype) throws Throwable {
		if(createtype.equals("Inventory")){
			actvtnpage.ddl_CreateinvntryType.selectByVisibleText(create_subtype);
			
		} 
		
		if(createtype.equals("Network Build")){
	
			if(actvtnpage.ddl_CreateNetworkType.isCurrentlyVisible()){
				waitForElement(actvtnpage.ddl_CreateNetworkType);
			actvtnpage.ddl_CreateNetworkType.selectByVisibleText(create_subtype);
			fill_fields("GPON Details");	
			
			}
		}
	}
	
	public void createtab_createtypeselect(String createtype) throws Throwable{
		actvtnpage.createtab_createtypeselect(createtype);
	}
	
	
	
	@Step   //Selecting the create Type & subtype from Creaet Tab---Move to OVCreate page form
	public void selectFormType(String type,String subtype) {
		//try {
		try {
		if(actvtnpage.ddl_createType.isCurrentlyVisible()){
			slf4jLogger.info(type);
			slf4jLogger.info(subtype);
			//slf4jLogger.info(tech);
			
			/*if(!gdbcreatepage.tab_GDB.isPresent()){
				actvtnpage.ddl_createType.selectByVisibleText(type);
			}
			*/
			//Thread.sleep(1000);
			//Thread.sleep(500);
			actvtnpage.ddl_createType.selectByVisibleText(type);
			
				Thread.sleep(1000);
			
			switch(type){
			case "Inventory":	waitForElement(actvtnpage.ddl_CreateinvntryType);
								actvtnpage.ddl_CreateinvntryType.selectByVisibleText(subtype);
								break;
			
			case "Network Build":  waitForElement(actvtnpage.ddl_CreateNetworkType);
								actvtnpage.ddl_CreateNetworkType.selectByVisibleText(subtype);
								
								//waitForElement(actvtnpage.tbx_SWCCLLI);
								Thread.sleep(2000);
								break;
			}
			
			
			/*if(type.equals("Inventory")){
				actvtnpage.ddl_createType.selectByVisibleText(type);
				actvtnpage.ddl_CreateinvntryType.selectByVisibleText(subtype);
				
			}
			else if(type.equals("Network Build")){
				if(gdbcreatepage.tab_GDB.isPresent()){
					slf4jLogger.info("GDB is present");
				} else {
				actvtnpage.ddl_CreateNetworkType.selectByVisibleText(subtype);
				}
			}*/			
			//Thread.sleep(1000);
			/*	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		//}
		}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Step   
	public void create_type_select(String type){
		actvtnpage.ddl_createType.selectByVisibleText(type);
	}
	
	@Step   
	public void createtabselect(String type){
		actvtnpage.ddl_createType.selectByVisibleText(type).click();
		//actvtnpage.btn_create_subcform);
		/*if(actvtnpage.btn_create_subcform.isVisible()){
			jsClick(actvtnpage.btn_create_subcform);
			waitForElement(devcreatepage.btn_Create);
		}*/
		
	}
	
	@Step
	public void validate_technology_and_device_type(String techType) throws Throwable /// Selecting the Technology in Create FOrm
	{
		slf4jLogger.info(techType);
		actvtnpage.selecttech(techType);
		//int Validation=1;
		//actvtnpage.ddl_techType.selectByVisibleText(techType);
		if(techType.equals("PASSIVE")){
			//String[] actualDeviceType = {"","Fiber Distribution Hub","Fiber Distribution Panel","Fiber Multiport Service Terminal","Fiber Splitter"};
			WebElement dropdown = actvtnpage.ddl_Inventory_devType;
			//ArrayList<String> ExpDeviceType = null;
			 Select select = new Select(dropdown);  
	
			 List<WebElement> options = select.getOptions();  
			 System.out.println(options.size());
			 
			 for(int j=0;j<=options.size()-1;j++)  {
				 
			/*	 for (int i=0; i<actualDeviceType.length; i++){
					 
				      if (options.get(j).getText().equals(actualDeviceType[i]))
				    		  {										       
				        slf4jLogger.info(options.get(j).getText()+"==="+actualDeviceType[i]);
				    	       }
				 
			 		} */
				 if(options.get(j).getText().equals("") || options.get(j).getText().equals("Fiber Distribution Hub") || options.get(j).getText().equals("Fiber Distribution Panel") || options.get(j).getText().equals("Fiber Multiport Service Terminal") || options.get(j).getText().equals("Fiber Splitter")){
				 
								 slf4jLogger.info(options.get(j).getText()+"Is present");
							 }
				 else throw new Error(options.get(j).getText()+"Is not present");
						 }
				 }	
		 slf4jLogger.info("successfully validated"); 
		}
		

		/*
		String[] actualDeviceType = {"","Fiber Distribution Hub","Fiber Distribution Panel","Fiber Multiport Service Terminal","Fiber Splitter"};
		 WebElement dropdown = getDriver().findElement(By.xpath("//label[text()='Device Type']/following-sibling::select"));
		 ArrayList<String> ExpDeviceType = null;
		 Select select = new Select(dropdown);  

		 List<WebElement> options = select.getOptions();  
		 slf4jLogger.info(options.size());
		 
		 for(int j=0;j<=options.size()-1;j++)  
		 {  
			 //slf4jLogger.info("..............."+options.get(j).getText());
		  boolean match = false;
		  for (int i=0; i<actualDeviceType.length; i++){
			 
		      if (options.get(j).getText().equals(actualDeviceType[i]))
		    		  {
		        match = true;
		        slf4jLogger.info(options.get(j).getText()+"==="+actualDeviceType[i]);
		    	  
		      }
		    }
		   
		 // Assert.assertTrue(match);
		 }*/
		
	
	
	@Step				//Selecting Device category Type & its Sub-category for Inventory Create form
	public void device_select(String devtype,String devsubtype){
		actvtnpage.device_select_create(devtype,devsubtype);
	}
	
	@Step 			//Printing the Device name in the Output file
	public void device_create_msg(){
	try {	
			Thread.sleep(25000);
			created_device_role_is(devcreatepage.lbl_devicename.getText());
			//slf4jLogger.info("*******************"+devcreatepage.create_device_successfull_msg());
			//devcreatepage.create_msg();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@SuppressWarnings("static-access")
	@Step		//Validating the Device page attributes in Create form page
	public void validate_attribute_search_page(String attributes){
		
		try {
			Thread.sleep(5000);		
		List<WebElement> attributeList = loginPage.getDriver().findElements(By.className(searchdevicepage.allsearchXapath));
			//List<WebElement> attributeList = searchdevicepage.lbl_allsearchXapath;
		ArrayList<String> atributesOfPage=new ArrayList<String>();
		//slf4jLogger.info("Step one done"+attributeList);
		int Validation=1;
		String output=null;
		for(int j=0;j<attributeList.size();j++){
			
			atributesOfPage.add(j, attributeList.get(j).getText());
			
			slf4jLogger.info("Step Two done");
			//slf4jLogger.info(atributesOfPage.get(j));
		} 
		
		System.out.println(atributesOfPage);
		
		//slf4jLogger.info(id);
	for(int i=0;i<attributeList.size();i++){
		slf4jLogger.info(atributesOfPage.get(i));
		if(attributes.equals("Passive")){
			if(atributesOfPage.get(i).equals("Is Diverse") || atributesOfPage.get(i).equals("Affiliate Owner") || atributesOfPage.get(i).equals("Monitoring Type") || atributesOfPage.get(i).equals("Management VLAN") || atributesOfPage.get(i).equals("SNMP Port Number") || atributesOfPage.get(i).equals("SNMP Version") || atributesOfPage.get(i).equals("SNMP User") || atributesOfPage.get(i).equals("Management IP Subnet Mask") || atributesOfPage.get(i).equals("RO Community String")){
				Validation=0; output=atributesOfPage.get(i); break;
			}		
		}
		
		else if(attributes.equals("Location")){ 	// Check this line again 20/9/2016******************************************************
		if(atributesOfPage.get(i).equals("Is Diverse") || atributesOfPage.get(i).equals("Affiliate Owner") || atributesOfPage.get(i).equals("Monitoring Type") || atributesOfPage.get(i).equals("Management VLAN") || atributesOfPage.get(i).equals("SNMP Port Number") || atributesOfPage.get(i).equals("SNMP Version") || atributesOfPage.get(i).equals("") || atributesOfPage.get(i).equals("Management IP Subnet Mask") || atributesOfPage.get(i).equals("RO Community String")){
			Validation=0; output=atributesOfPage.get(i); break;
										}
		}
	}
	if(Validation==1){
		slf4jLogger.info("Above Attributes are not present");
		return;
	} else throw new Error("Above Attributes is present"+output);//If it fails need to be displayed at the output screen
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Step  //Validating the Radio button in create device form page
	public void validate_radio_button_device_create_page(String radioButton) throws Throwable {
		  
		if (devcreatepage.isRadioButtonSelected(radioButton)) 
		     {
				slf4jLogger.info("pass");
			}
		     else throw new Error("not selected");
		}
	
	@Step  //Validating Bam Logs 
	public void bam_tab_validation(String logs) throws Throwable{
		searchservicepage.bam_log_validation(logs);
	}
	
	
	@Step
	public void selectport_createtab(String Porttype){
		actvtnpage.ddl_portType.selectByVisibleText(Porttype);
	}
	
	@Step
	public void locationtype(String locationtype){		//Sairam code merge---21/7/2016
		actvtnpage.locntype(locationtype);	
	}
	
	//18/8/2016--QOS Addition
	
	@Step
	public void Qos_screen_edit_and_save(String actionkey) throws Throwable{
		switch(actionkey){
		case "Create":jsClick(ovcreateqostemplate.btn_createpage_QOSTemplate_Create);waitForElement(ovcreateqostemplate.lbl_createpage_QOSTemplate_msg); break;
			default:	ovsearchqostemplate.Qos_button_action(actionkey);break;

		}
		}
	
	@Step
	public void Qos_template_validation(){
		ovsearchqostemplate.Qos_template_validation();
	}
	
	@Step
	public void success_message_validation(String msg){
		ovsearchqostemplate.success_message_validation(msg);
	}
	
	//19/8/16---Shivaprasad Updates
	
	@Step
	public void select_expandIcon(String Tab) throws InterruptedException {
		searchservicepage.click_expandicon(Tab);
	}
	
	
	@Step
	public void Usability_validation() throws InterruptedException {
		searchservicepage.validateActivationTab();	
	}
	
	@Step
	public void select_devicesubtype(String splitter_option) {
		actvtnpage.sel_devicesubtype(splitter_option);		
	}
	
	//New Update--9/23
	
	@Step
	public void edit_Button_NetworkingDetailPage(String button) throws InterruptedException {
		searchdevicepage.click_EditDeviceDetailbtn(button);
	}
	
	@Step
	public void validate_lookupPage() {
		searchservicepage.validate_subscriberLookupPage();		
	}
	
	
	
	//End of search 
	
	//Create Part	Startes from Here
	
	@Step
	public void createroleform(String role,String devtype,String devsubtype){
		if(actvtnpage.ddl_createType.isCurrentlyVisible()){
		try {
		actvtnpage.ddl_role.selectByVisibleText(role);
		waitForElement(actvtnpage.ddl_Inventory_devType);
		actvtnpage.ddl_Inventory_devType.selectByVisibleText(devtype);
		waitForElement(actvtnpage.ddl_Inventory_devsubType);
		actvtnpage.ddl_Inventory_devsubType.selectByVisibleText(devsubtype);
		Thread.sleep(1000);
		actvtnpage.btn_Netwrkbuildcreate("Device");
		waitForElement(devcreatepage.btn_Create);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	@Step
	public void createFormpage(String techtype,String devtype,String devsubtype){
		try {
			slf4jLogger.info(techtype);
			slf4jLogger.info(devtype);
			slf4jLogger.info(devsubtype);
		actvtnpage.ddl_Inventory_techType.selectByVisibleText(techtype);
		Thread.sleep(1000);
		actvtnpage.ddl_Inventory_devType.selectByVisibleText(devtype);
		Thread.sleep(1000);
		actvtnpage.ddl_Inventory_devsubType.selectByVisibleText(devsubtype);
		actvtnpage.btn_Netwrkbuildcreate("Device");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Step
	public void validate_Location_CLLI() throws Throwable {  //Validate Location clli field
		if (!(devcreatepage.isLocationCLLIMandatory())) {
			slf4jLogger.info("location clli.........."+devcreatepage.isLocationCLLIMandatory());
			
		}
		 else {
			 slf4jLogger.info("location clli..is mandatory for Ethernet........"+devcreatepage.isLocationCLLIMandatory());
		 }
	}
	
	@Step
	public void subcriber_equipment(String testdata) throws InterruptedException{
		jsClick(devcreatepage.btn_subsciber);
		Thread.sleep(5000);
		fill_fields_from("OVCreateDevicePage",testdata,"Subscriberdata");
		jsClick(devcreatepage.btn_sublookup);
		Thread.sleep(1000);
		//String parentwin=devcreatepage.window_switch();
		Thread.sleep(1000);
		jsClick(devcreatepage.lnk_addsub);
		//devcreatepage.switch_win(parentwin);
		Thread.sleep(3000);
		devcreatepage.ddl_Equipment_role.selectByValue("0").click();
		
		
	}
	
	@Step
	public void gpon_device_select(String selectgpondevice) throws Throwable{
		gdbcreatepage.gpon_ntwdevice_select(selectgpondevice);
		slf4jLogger.info(selectgpondevice);
		Thread.sleep(5000);		
		waitForElement(gdbcreatepage.btn_gpon_Splitter);
	}
	
	@Step
	public void gpon_fiberlink_validation() throws InterruptedException{
		gdbcreatepage.gpon_fiberlink_validation();
	}
	
	@Step
	public void gpon_adddevicegdb(String addcount) throws InterruptedException{
		gdbcreatepage.add_moredevice(addcount);
		
	}
	
	@Step
	public void GDB_functionality(String action) throws InterruptedException{
		gdbcreatepage.GDB_functionality_validation(action);
	}
	
	@Step
	public void popup_msgvalidationon_selecting_Zportfirst_fiberlink(String action) throws InterruptedException{
		gdbcreatepage.popup_msgvalidationon_selecting_Zportfirst_fiberlink(action);
	}
	

	
	@Step
	public void validate_GDB_Loader()throws Throwable{
		gdbcreatepage.tbx_NB_SA_Add.sendKeys("100");
		jsClick(gdbcreatepage.btn_NB_SA_Add);
		Thread.sleep(2000);
		jsClick(gdbcreatepage.btn_gpon_Servicearea_box);
		if(gdbcreatepage.lbl_GDB_SA_Loader.isPresent()){
			slf4jLogger.info("loader message: "+gdbcreatepage.lbl_GDB_SA_Loader.getText());
		}else throw new Error("Loader is not dispalyed");	
	}
	
	@Step
	public void validate_Add_SA()throws Throwable{
		gdbcreatepage.validate_Add_SA();		
	}
	
	@Step
	public void validate_SA_RefreshAll(String action)throws Throwable{
		String Alertmsg=null;
		switch(action){
		case "Refresh all button":jsClick(gdbcreatepage.btn_gpon_Servicearea);
									Thread.sleep(2000);
									jsClick(gdbcreatepage.btn_gpon_Servicearea_box);
									gdbcreatepage.tbx_NB_SA_Add.sendKeys("100");
									jsClick(gdbcreatepage.btn_NB_SA_Add);
									Thread.sleep(2000);
									gdbcreatepage.tbx_NB_SA_device_name.selectByIndex(1);
									gdbcreatepage.ddl_NB_SA_device_Location.selectByIndex(1);
									gdbcreatepage.tbx_NB_SA_name.clear();
									Thread.sleep(3000);
									slf4jLogger.info(gdbcreatepage.tbx_NB_SA_device_name.getSelectedVisibleTextValue());
									slf4jLogger.info(gdbcreatepage.ddl_NB_SA_device_Location.getSelectedVisibleTextValue());
									Thread.sleep(3000);
									jsClick(gdbcreatepage.btn_NB_SA_Refresh);
									Thread.sleep(3000);
									slf4jLogger.info(gdbcreatepage.tbx_NB_SA_device_name.getSelectedVisibleTextValue());
									slf4jLogger.info(gdbcreatepage.ddl_NB_SA_device_Location.getSelectedVisibleTextValue());
							    	if(gdbcreatepage.tbx_NB_SA_device_name.getSelectedVisibleTextValue().isEmpty() && gdbcreatepage.ddl_NB_SA_device_Location.getSelectedVisibleTextValue().isEmpty()){
										slf4jLogger.info("GDB Service area Refreshed successfully");
									} else throw new Error("GDB Service area not Refreshed");break;

									
		case "Remove all button": 	gdbcreatepage.tbx_NB_SA_Add.sendKeys("20");
									jsClick(gdbcreatepage.btn_NB_SA_Add);
									Thread.sleep(2000);
									jsClick(gdbcreatepage.btn_NB_SA_RemoveAll);
									Thread.sleep(1000);
									Alert RemoveallAlert = getDriver().switchTo().alert();
									slf4jLogger.info(RemoveallAlert.getText());
									String actual_Alertmsg = RemoveallAlert.getText();
									RemoveallAlert.accept();
									Thread.sleep(2000);
									Alertmsg ="You are about to Remove/Delete all selected SERVICE_AREA_REMOVE's. Are you sure ?";
									if(actual_Alertmsg.contains(Alertmsg)){
								 slf4jLogger.info(gdbcreatepage.lbl_GDB_SA_Successmsg.getText());	
									} else throw new Error("Remove all is not working in Service area"); break;
									
		case "Delete all button": 	gdbcreatepage.tbx_NB_SA_Add.sendKeys("20");
		jsClick(gdbcreatepage.btn_NB_SA_Add);
		Thread.sleep(2000);
		jsClick(gdbcreatepage.btn_NB_SA_DeleteAll);
		Thread.sleep(1000);
		Alert DeleteAllAlert = getDriver().switchTo().alert();
		slf4jLogger.info(DeleteAllAlert.getText());
		String actual_Alertmsg_DeleteAllAlert = DeleteAllAlert.getText();
		DeleteAllAlert.accept();
		Thread.sleep(2000);
		Alertmsg ="Are you sure you want to continue";
		if(actual_Alertmsg_DeleteAllAlert.contains(Alertmsg)){
	 slf4jLogger.info(gdbcreatepage.lbl_GDB_SA_Successmsg.getText());	
		} else throw new Error("Remove all is not working in Service area"); break;						
									
		case "Remove icon":gdbcreatepage.tbx_NB_SA_Add.sendKeys("10");
							jsClick(gdbcreatepage.btn_NB_SA_Add);
							Thread.sleep(2000);
							jsClick(gdbcreatepage.btn_NB_SA_Removeicon);
							Thread.sleep(1000);
							Alertmsg ="You are about to remove SERVICE_AREA_REMOVE with Service Area ID";
							Alert RemoveiconAlert = getDriver().switchTo().alert();
							slf4jLogger.info(RemoveiconAlert.getText());
							  actual_Alertmsg=RemoveiconAlert.getText();
							RemoveiconAlert.accept();
							Thread.sleep(2000);
							if(actual_Alertmsg.contains(Alertmsg)){
								slf4jLogger.info(gdbcreatepage.lbl_GDB_SA_Successmsg.getText());
								} else throw new Error("Remove all is not working in Service area");
							slf4jLogger.info("Created servicearea Removed successfully");
							
							jsClick(gdbcreatepage.btn_NB_SA_Removeicon);
							Thread.sleep(1000);
							Alert RemoveiconAlert1 = getDriver().switchTo().alert();
							slf4jLogger.info(RemoveiconAlert1.getText());
							actual_Alertmsg=RemoveiconAlert1.getText();
							RemoveiconAlert1.accept();
							Thread.sleep(2000);
							 
							if(actual_Alertmsg.contains(Alertmsg)){
							slf4jLogger.info(gdbcreatepage.lbl_GDB_SA_Successmsg.getText());
							} else throw new Error("Remove all is not working in Service area");
							slf4jLogger.info("Before Created servicearea Removed successfully");break;
							
		case "Delete icon":gdbcreatepage.tbx_NB_SA_Add.sendKeys("10");
							jsClick(gdbcreatepage.btn_NB_SA_Add);
							Thread.sleep(2000);
							gdbcreatepage.btn_GDB_SA_Deleteicon.shouldBeEnabled();
							jsClick(gdbcreatepage.btn_GDB_SA_Deleteicon);
							Thread.sleep(1000);
							Alert DeleteiconAlert = getDriver().switchTo().alert();
							String AlertMsg = "You are about to delete SERVICE_AREA_DELETE with Service Area";
							if(DeleteiconAlert.getText().contains(AlertMsg)){
							slf4jLogger.info(DeleteiconAlert.getText());
							DeleteiconAlert.accept();
							}
							Thread.sleep(2000);
							slf4jLogger.info(gdbcreatepage.lbl_GDB_SA_Successmsg.getText());
							slf4jLogger.info("Created servicearea Deleted successfully");
							Thread.sleep(2000);
							//gdbcreatepage.btn_GDB_SA_Deleteicon1.shouldNotBeEnabled();
							slf4jLogger.info("Delete button is disable before creation of service area");
							Thread.sleep(1000); break;
							
	
									
		case "Associate Addresses section":gdbcreatepage.btn_SA_Associate_Add.shouldBePresent();
												gdbcreatepage.btn_SA_AssociateAll.shouldBePresent();
												gdbcreatepage.btn_SA_Associate_RemoveAll.shouldBePresent();
												System.out.println(gdbcreatepage.lbl_SA_Associate_Hearders);
												String Associateheader[]= {"Address *","City","State","Zip","Rank*","Service Area Name *","Device Name","Device Location","Associate","Remove","Notes"};
												for(int i=0; i<=Associateheader.length-1;i++){
												for(int j=0; j<=gdbcreatepage.lbl_SA_Associate_Hearders.size()-1;j++){
													gdbcreatepage.lbl_SA_Associate_Hearders.get(j).shouldBePresent();
												if(Associateheader[i].equals(gdbcreatepage.lbl_SA_Associate_Hearders.get(j).getText()))
													slf4jLogger.info(gdbcreatepage.lbl_SA_Associate_Hearders.get(j).getText());
												}}
												Thread.sleep(2000);
												slf4jLogger.info("Validated SA_Associate section in GDB");break;
												
		case "Associate icon":while(gdbcreatepage.btn_gpon_SA_expand.isCurrentlyVisible()){
									jsClick(gdbcreatepage.btn_gpon_SA_expand);Thread.sleep(2000);
								}
								waitForElement(gdbcreatepage.btn_GDB_SA_Associatelookup);
								jsClick(gdbcreatepage.btn_GDB_SA_Associatelookup);
								gdbcreatepage.ddl_GDB_SA_adress_state.selectByVisibleText("CO-Colorado");
								jsClick(gdbcreatepage.btn_GDB_SA_Locationlookup);
								Thread.sleep(2000);
								jsClick(gdbcreatepage.GDB_SA_Address);
								/*gdbcreatepage.tbx_SA_AssociateAddress_Rank.clear();
								gdbcreatepage.tbx_SA_AssociateAddress_Rank.sendKeys("1");*/
								gdbcreatepage.ddl_AssociateAddress_SAName.selectByIndex(0);
								Thread.sleep(2000);
								jsClick(gdbcreatepage.btn_SA_Associate_Refresh);
								Thread.sleep(2000);
								gdbcreatepage.tbx_SA_AssociateAddress_Rank.sendKeys("2");
								Thread.sleep(1000);
								jsClick(gdbcreatepage.btn_SA_Associateicon);
								Thread.sleep(3000);
								slf4jLogger.info("Address is associated successfully to the service area");break;
		}
		 	 
	}
	
	
	@Step
	public void validate_SA_auditLog(String action)throws Throwable{
		//String Alertmsg=null;
		String SearviceAreaName=null;
		String actualActionType=null;
		switch(action){
		
									
	  case "Delete": SearviceAreaName=gdbcreatepage.tbx_detailsTab.getText();
		  actualActionType=gdbcreatepage.tbx_actionTypeTab.getText();
		if (actualActionType.equalsIgnoreCase("Delete")) {
	   System.out.println(SearviceAreaName);
		}
							
		  break;
							
	
									
		case "Remove":   SearviceAreaName=gdbcreatepage.tbx_detailsTab.getText();
		  actualActionType=gdbcreatepage.tbx_actionTypeTab.getText();
		if (actualActionType.equalsIgnoreCase("Remove")) {
	   System.out.println(SearviceAreaName);
		}
							
											 break;
												
		 
		}
		 	 
	}
	
	
	@Step
    public void validate_Ethernet_role_devices() throws Throwable{
		gdbcreatepage.gpon_ntwdevice_select("OLT");
        Thread.sleep(3000);
        if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
                        slf4jLogger.info("Delete icon is Disabled");
        }else throw new Error("Delete icon is Enable before creation ");
        
        jsClick(gdbcreatepage.cbx_GDB_Existing_device);
        Thread.sleep(3000);
        gdbcreatepage.tbx_GDB_DeviceCLLI.sendKeys("FTMYFLPS44D");
        Thread.sleep(3000);
        jsClick(gdbcreatepage.btn_GDB_Device_lookup);
        Thread.sleep(3000);
        jsClick(gdbcreatepage.link_GDB_Devicename);
        Thread.sleep(3000);
        
        slf4jLogger.info(gdbcreatepage.GDB_Device_Status.getText());
        if(gdbcreatepage.GDB_Device_Status.getText().equals("Success") && !gdbcreatepage.btn_NB_Deleteicons.isEnabled())
        {
                        slf4jLogger.info("Ethernet Device is Successfully added and Delete icon is Disabled in GDB");
        }else throw new Error("Ethernet Device is not added (or) Delete icon is Enable in GDB");
        }
	
	@Step
	public void Validate_device_attributes(String device) throws Throwable{
		if(device.equals("GDB-ONT")){
			Thread.sleep(5000);
			String GDBONT=gdbcreatepage.lbl_deviceGDB.getText();
			click_Tab("Search");
			Thread.sleep(5000);
			fill_fields("GDB_DeviceSearch");
			Thread.sleep(5000);
			actvtnpage.tbx_deviceName.sendKeys(GDBONT);
			jsClick(actvtnpage.btn_inventorysearch);
			Thread.sleep(10000);
			select_viewBtn();
			waitForElement(searchdevicepage.lbl_devicerole);
			Thread.sleep(5000);		
			validate_attribute_search_page("GDB-ONT");			
}
}
	
	@Step
	public void IsExcelImportButtonPresent(){ 
	if (gdbcreatepage.btn_excel.isPresent() && gdbcreatepage.btn_excel.isEnabled()) 
	{
		jsClick(gdbcreatepage.btn_excel);
		slf4jLogger.info("passed.....................");
	}
	}
	
	@Step
	public void validating_audit_log_GDB(String actionType) throws InterruptedException{
		 String serviceNameValueOfCreatepage1 = gdbcreatepage.lbl_serviceareaname.getText();
			slf4jLogger.info("------------------"+serviceNameValueOfCreatepage1 +":)");
			jsClick(gdbcreatepage.btn_getAuditLogs);
		
		waitForElement(gdbcreatepage.lbl_GDBAuditlogs_Auditlog);
		
		Thread.sleep(1000);
		
		jsClick(gdbcreatepage.btn_GDBauditlogs_getlogs);
		
		jsClick(gdbcreatepage.btn_refreshIconOfAuditLogs);
		
		waitForElement(gdbcreatepage.lbl_GDBAuditlogs_Auditlog);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		jsClick(gdbcreatepage.tbx_detailsTab);
		Thread.sleep(1000);
		String SearviceAreaNameofAuditLog="";
		String SearviceAreaName=gdbcreatepage.tbx_detailsTab.getText();
		String actualActionType=gdbcreatepage.tbx_actionTypeTab.getText();
		String eventDate=gdbcreatepage.tbx_eventDateTab.getText();
		Thread.sleep(1000);
		slf4jLogger.info("========="+SearviceAreaName);
		slf4jLogger.info("========="+actionType);
		slf4jLogger.info("========="+eventDate);
		String names = SearviceAreaName;
		String[] namesList = names.split(",");
		
		for(String name : namesList){
			slf4jLogger.info(name);
			String[] seriveAreavalue=name.split(":");
			
			 for (String value : seriveAreavalue) {
				 
				slf4jLogger.info("^^^^^^^^^^^^^^^^^^^^^^^"+value);
			//	serviceNameValueOfCreatepage = gdbcreatepage.tbx_serviceAreaName.getText();
				//slf4jLogger.info("**********"+enduser.enduser.getServiceAreaName());
				 if (serviceNameValueOfCreatepage1.equalsIgnoreCase(value)) {
					  SearviceAreaNameofAuditLog=value;
					  slf4jLogger.info(SearviceAreaNameofAuditLog+"="+value);
					  slf4jLogger.info("+++++++++++++++++++++++++++++++++++++++++++++++++");
				}
				 else throw new Error("Loader is not dispalyed");
			}
		slf4jLogger.info(".......................");
	}
		if (actualActionType.equalsIgnoreCase(actionType)&& SearviceAreaNameofAuditLog.equalsIgnoreCase(serviceNameValueOfCreatepage1)) 
		{
			 slf4jLogger.info(".................passed");
		}
		
	}
	
	@Step
	public void device_search_button_validation(String buttons) throws Throwable{
		searchdevicepage.delebuttonvalidation(buttons);
	}
	
	@Step
	public void clickOnauditbuttonOfServiceArea()
	{
		jsClick(gdbcreatepage.btn_getAuditLogs);
	}
	
	@Step
	public void clickOnRefreshIconOfAuditLogOfServiceArea() throws InterruptedException
	{
		Thread.sleep(1000);
		jsClick(gdbcreatepage.btn_refreshIconOfAuditLogs);
		Thread.sleep(5000);
		
	}
	
	@Step
	public void devicedetailpage_maxsubsfill(){
		searchdevicepage.devicedetailpage_maxsubsfill();
	}
	
	@Step
	public void device_delete_msg_validation() throws Throwable{
		searchdevicepage.delete_confirmation_msg();
		//searchdevicepage.delete_device_inventory();
	}
	
	@Step
	public void device_delete_Warning_msg_validation() throws Throwable{
		searchdevicepage.delete_confirmation_msg();
	}
	
	@SuppressWarnings("unused")
	@Step
	public void validate_device_OSIP() throws Throwable{
		String device=devcreatepage.create_device_successfull_msg();
		System.out.println(device);
		actvtnpage.click_actscreentab("Search");
		Thread.sleep(1000);
		//actvtnpage.searchtab_serachtype("Inventory");
		
		fillMandatoryFields(fillfieldscls,get_container_from_xml("OVActivationPage","GDB_OLTSearch"));
		//fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer("GDB_OLTSearch"));
		 waitForElement(actvtnpage.tbx_deviceName);
		actvtnpage.tbx_deviceName.sendKeys(device);
	    actvtnpage.click_searchbtn("Device");
	    
	    //waitForElement(searchdevicepage.lbl_Device_search_deleted);
	    
	    
	    List<String> deivce_details_db_attributes = ARMDB.device_delete_validation(device.trim());
	  	      
	}
	
	
	/*@Step
	public void validate_SearviceAreaNameAndTimeInAuditLog(String actionType) throws InterruptedException
	{
		String serviceNameValueOfCreatepage=null; 
		Thread.sleep(1000);
		gdbcreatepage.tbx_detailsTab);
		Thread.sleep(1000);
		String SearviceAreaNameofAuditLog="";
		String SearviceAreaName=gdbcreatepage.tbx_detailsTab.getText();
		String actualActionType=gdbcreatepage.tbx_actionTypeTab.getText();
		String eventDate=gdbcreatepage.tbx_eventDateTab.getText();
		Thread.sleep(1000);
		slf4jLogger.info("========="+SearviceAreaName);
		slf4jLogger.info("========="+actionType);
		slf4jLogger.info("========="+eventDate);
		String names = SearviceAreaName;
		String[] namesList = names.split(",");
		
		for(String name : namesList){
			slf4jLogger.info(name);
			String[] seriveAreavalue=name.split(":");
			
			 for (String value : seriveAreavalue) {
				 
				slf4jLogger.info("^^^^^^^^^^^^^^^^^^^^^^^"+value);
				slf4jLogger.info("......................"+serviceNameValueOfCreatepage);
				 if (serviceNameValueOfCreatepage.equalsIgnoreCase(value)) {
					  SearviceAreaNameofAuditLog=value;
					  slf4jLogger.info(SearviceAreaNameofAuditLog+"="+value);
					  slf4jLogger.info("+++++++++++++++++++++++++++++++++++++++++++++++++");
				}
				 else{
					  
				 }
			}
		slf4jLogger.info(".......................");
	}
		if (actualActionType.equalsIgnoreCase(actionType)&& SearviceAreaNameofAuditLog.equalsIgnoreCase(serviceNameValueOfCreatepage)) 
		{
			 slf4jLogger.info(".................passed");
		}
	}*/
	
	@Step
	public void validate_SA_section()throws Throwable{
		gdbcreatepage.validate_SA_section();	
		}
	
	@Step
	public void gpon_device_status_validation(){
		slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		if(!gdbcreatepage.lbl_device_status.getText().equals("Success")){
			throw new Error("Device didnt get created successfully in GDB"+gdbcreatepage.lbl_device_status.getText());
		}
	}
	
	@Step
	public void validate_GDB_component() throws Throwable{		
			if(gdbcreatepage.btn_gpon_OLT_box.isPresent()){
				slf4jLogger.info("OLT Device is Present");
			}
			else {
				slf4jLogger.info("OLT Device is not present triggerring OLT first");
				gpon_ntwrk_deviceselecting("OLT");
				gpon_ntwrk_deviceselecting("FDP-12port");
				gpon_ntwrk_deviceselecting("SPLITTER");
				gpon_ntwrk_deviceselecting("FDP-144port");
				gpon_ntwrk_deviceselecting("MST");
				gpon_ntwrk_deviceselecting("ONT");
				
			}
			
			adddevicecardtodevice("GDB-OLT");
				
			}
		
		
	@Step
	public void validate_Service_area_GDBDevice(String arg1) throws Throwable{
		if(!gdbcreatepage.btn_gpon_MST_box.isPresent()){
			gdbcreatepage.gpon_ntwdevice_select(arg1);
			gdbcreatepage.GDB_Device_select(arg1);
			GDB_Device_create(arg1);
			
		} else {
			
			jsClick(gdbcreatepage.btn_gpon_MST_box);
			Thread.sleep(3000);
		slf4jLogger.info("MST Device Status"+gdbcreatepage.lbl_device_status.getText());
		if(!gdbcreatepage.lbl_device_status.getText().equals("Success")){
			GDB_Device_create(arg1);			
		}
		}
	}
	
	
	@Step
	public void gpon_ntwrk_devicecreate(String gpondevice) throws Throwable{
		if(gpondevice.equals("OLT")) {
		gpon_ntwrk_deviceselecting(gpondevice);
		} 
		
		else if(gpondevice.equals("FDP-12port") || gpondevice.equals("SPLITTER") || gpondevice.equals("FDP-144port") || gpondevice.equals("MST")) {
			if(gdbcreatepage.btn_gpon_OLT_box.isPresent())	
			{
				jsClick(gdbcreatepage.btn_gpon_OLT_box);
				Thread.sleep(5000);
				slf4jLogger.info("OLT Device Status"+gdbcreatepage.lbl_device_status.getText());
				if(!gdbcreatepage.lbl_device_status.getText().contains("Success")){
					GDB_Device_create("OLT");
					
				}
				slf4jLogger.info("OLT Device is present");
				
			gpon_ntwrk_deviceselecting(gpondevice);
			} else {
				slf4jLogger.info("OLT Device is not present triggerring OLT first");
				gpon_ntwrk_deviceselecting("OLT");
				gpon_ntwrk_deviceselecting(gpondevice);
			}
		}
		
		else if(gpondevice.equals("ONT")){
			
			if(gdbcreatepage.btn_gpon_OLT_box.isPresent())	
			{
				jsClick(gdbcreatepage.btn_gpon_OLT_box);
				Thread.sleep(5000);
				slf4jLogger.info("OLT Device Status"+gdbcreatepage.lbl_device_status.getText());
				if(!gdbcreatepage.lbl_device_status.getText().contains("Success")){
					GDB_Device_create("OLT");
					
				}
				slf4jLogger.info("OLT Device is present");
			} else if(!gdbcreatepage.btn_gpon_OLT_box.isPresent())	{
				gpon_ntwrk_deviceselecting("OLT");				
			}
			
			if(!gdbcreatepage.btn_gpon_MST_box.isPresent()){
				gpon_ntwrk_deviceselecting("MST");
			} else if(gdbcreatepage.btn_gpon_MST_box.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_MST_box);
				Thread.sleep(5000);
				slf4jLogger.info("OLT Device Status"+gdbcreatepage.lbl_device_status.getText());
				if(!gdbcreatepage.lbl_device_status.getText().contains("Success")){
					GDB_Device_create("MST");
					
				}
				slf4jLogger.info("MST Device is present");
			}
			
			gpon_ntwrk_deviceselecting(gpondevice);
		}
				
	}
	
	@Step
	public void GDB_component_Select(String gpondevice) throws Throwable{
		gdbcreatepage.gpon_ntwdevice_select(gpondevice);
	}
	
	@Step
	public void device_location_fill(String page,String container,String field) throws Throwable{
		String parentwin=devcreatepage.window_switch();
		fillMandatoryFields(fillfieldscls,get_container_from_xml(page,container,field));
		
		jsClick(gdbcreatepage.btn_GDB_SA_Locationlookup);//Rework 
		Thread.sleep(5000);
		devcreatepage.switch_win(parentwin); 
	}
	
	@Step
	public void GDB_Device_create(String gpondevice) throws Throwable{
		//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		if(!gpondevice.equals("GDB_SERVICEAREA")){
		gdbcreatepage.GDB_expand_field(gpondevice);
		
		if(gdbcreatepage.btn_NB_Deleteicons.isCurrentlyVisible()){
		if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
			slf4jLogger.info("Delete button is Disabled");
		}else throw new Error("Delete button is Enable before creation ");
		}
		}
		switch(gpondevice){
		case "OLT": fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
				//fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
		
		case "MST": //fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
			fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
					
		case "ONT": if(gdbcreatepage.btn_gpon_OLT_box.isCurrentlyVisible())	{
				//	fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
				fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
					actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); 
					} else {
						if(gdbcreatepage.btn_gpon_MST_box.isCurrentlyVisible()){
						String MSTDevice=gdbcreatepage.GDN_MST_ONT_FDN_fiberlink();
						
						
						jsClick(gdbcreatepage.btn_gpon_ONT_FDN4linkmst);
						waitForElement(gdbcreatepage.tbx_FDNdeviceloopup);
						Thread.sleep(2500);
						
						String[] mst_parts = MSTDevice.split("-");
						String mst_search_part = mst_parts[0]; 
						//String mst_parts = mst_parts[1];
						
						gdbcreatepage.tbx_FDNdeviceloopup.sendKeys(mst_search_part);
						Thread.sleep(500);
						jsClick(gdbcreatepage.btn_gpon_FDNdevicelookup);
						
						Thread.sleep(8000);
						//setChildHandle();
						
						//waitForElement(gdbcreatepage.link_GDB_Devicename);
						
						String mstdeviceclick=".//*[text()='"+MSTDevice+"']";
						//Thread.sleep(5000);
						
						if(gdbcreatepage.btn_gpon_FDNdeviceprv.isCurrentlyVisible()){
							Thread.sleep(500);
							
							actvtnpage.jsClick(gdbcreatepage.btn_gpon_FDNdeviceprv);
							
							Thread.sleep(2000);
						}
						
						if(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible()){
							//Thread.sleep(500);
							jsClick(orderpage.btn_downarrow_devicescroll);
							Thread.sleep(1000);
							jsClick(orderpage.btn_downarrow_devicescroll);
							Thread.sleep(500);
							
						}else{
							Thread.sleep(1000);
							loginPage.getDriver().findElement(By.xpath(mstdeviceclick)).click();
							Thread.sleep(5000);
						}
						
					/*	loginPage.getDriver().findElement(By.xpath(mstdeviceclick)));
						Thread.sleep(5000);
						*/
						
						
						jsClick(gdbcreatepage.ddl_gpon_ONTFDNMSTport);
						List<WebElementFacade> fdnport = gdbcreatepage.ddl_gpon_ONTFDNMSTportlist;
						ArrayList<String> fdnportlist=new ArrayList<String>();
						
						for(int j=0;j<fdnport.size();j++){
							
							fdnportlist.add(j, fdnport.get(j).getText());						
						
								}
						
						System.out.println(fdnportlist);
						for(int i=1;i<fdnportlist.size();i++){
						if(!fdnportlist.get(i).contains("OFC.1.2.")){			
						
						} else throw new Error("FDN is not starting with OFC 1.2. series");
						} 
						Thread.sleep(1000);
						
						if(gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange.isPresent()){
							jsClick(gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange);
						} else {
							jsClick(gdbcreatepage.ddl_gpon_ONTFDNMSTport);
						}
								
						if(gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange.isPresent()){
							gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange.selectByVisibleText("OFC.1.2.1");
						} else {
							gdbcreatepage.ddl_gpon_ONTFDNMSTport.selectByVisibleText("OFC.1.2.1");
						}
						
						}
						
						Thread.sleep(1000);
					DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
					Date date = new Date();
					 String date1= dateFormat.format(date);
					 slf4jLogger.info(date1);
					 
					 
					 gdbcreatepage.tbx_gdb_ont_strandid.sendKeys(date1);
						
						gdbcreatepage.tbx_gdb_ont_cableid.sendKeys(date1);
						
						if(gdbcreatepage.btn_gpon_MST_box.isCurrentlyVisible()){
							actvtnpage.ddl_NB_buildType.selectByVisibleText("Service Provisioning");
						} else {
							actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
						}
					
						
						fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
						//actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
						jsClick(gdbcreatepage.btn_NB_Location_view);
						device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); 
					}	break;					
					
		case "FDP-12port": 	//fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
							fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
							jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
							device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
			
		case "FDP-144port": //fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
						fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
							jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
							device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
							
		case "SPLITTER": //fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
						fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
						long time = System.currentTimeMillis()/2;
						gdbcreatepage.tbx_NB_SplitterNumber.sendKeys(Long.toString(time));
						gdbcreatepage.tbx_NB_Splitterport.sendKeys("25");
							gdbcreatepage.ddl_NB_deviceSubType.selectByIndex(1);
							jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
							device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
							
		case "Service Area": gdbcreatepage.gpon_ntwrk_servicearea(); break;
		
		case "FDH":fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateGDBPage","GDB-Device create",gpondevice));
					
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
					
					
		}
		
		if(gdbcreatepage.btn_NB_Deleteicons.isCurrentlyVisible()){
		// Topology fill
		/*	jsClick(gdbcreatepage.btn_NB_Topologylookup);
			loginPage.waitFor(actvtnpage.tbx_Topologyname);
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
			devcreatepage.topology_fill();	*/
			gdbcreatepage.tbx_NB_Topologyfield.type(get_container_from_xml("OVCreateGDBPage","GDB-Device create","Topologydata").getFieldValue("tbx_Topologyname").toString());
		
		// Shared Flag
		jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6	   	
		
		//Clli FIll
		fill_fields_from("OVCreateGDBPage","GDB-Device create","deviceclli");
		Thread.sleep(2000);
		if(gdbcreatepage.lbl_gdb_selectop0.isCurrentlyVisible()){
			jsClick(gdbcreatepage.lbl_gdb_selectop0);
		} else actvtnpage.tbx_NB_Location_Designator.sendKeys("55F");
			
		//Initiate Create
		jsClick(gdbcreatepage.btn_NB_Createicon);
		waitForElement(gdbcreatepage.btn_gpon_expand);
		Thread.sleep(2000);
			
		    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		    if(!gdbcreatepage.lbl_device_status.getText().equals("Success")){
				//GDB_Device_create(gpondevice);
		    	slf4jLogger.info("Failed");
			}
		    slf4jLogger.info("Device Device: "+gdbcreatepage.lbl_oltdeviceGDB.getText());
		    				
		    if(!gdbcreatepage.btn_NB_Deleteicons.isCurrentlyEnabled()){
		    	throw new Error("Delete button is Disable After creation ");
			} 
		}  
		    
		} 	   
		
	@Step
	public void fill_GDBcomponent(String gpondevice) throws Throwable{
		//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
		
		gdbcreatepage.GDB_expand_field(gpondevice);
		
		if(gdbcreatepage.btn_NB_Deleteicons.isCurrentlyVisible()){
		if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
			slf4jLogger.info("Delete button is Disabled");
		}else throw new Error("Delete button is Enable before creation ");
		}
		
		switch(gpondevice){
		case "OLT": fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
		
		case "MST": fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
					
		case "ONT": if(gdbcreatepage.btn_gpon_OLT_box.isCurrentlyVisible())	{
					fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
					actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
					jsClick(gdbcreatepage.btn_NB_Location_view);
					device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); 
					} else {
						if(gdbcreatepage.btn_gpon_MST_box.isCurrentlyVisible()){
						String MSTDevice=gdbcreatepage.GDN_MST_ONT_FDN_fiberlink();
						
						
						jsClick(gdbcreatepage.btn_gpon_ONT_FDN4linkmst);
						waitForElement(gdbcreatepage.tbx_FDNdeviceloopup);
						Thread.sleep(2500);
						
						String[] mst_parts = MSTDevice.split("-");
						String mst_search_part = mst_parts[0]; 
						//String mst_parts = mst_parts[1];
						
						gdbcreatepage.tbx_FDNdeviceloopup.sendKeys(mst_search_part);
						Thread.sleep(500);
						jsClick(gdbcreatepage.btn_gpon_FDNdevicelookup);
						
						Thread.sleep(8000);
						//setChildHandle();
						
						//waitForElement(gdbcreatepage.link_GDB_Devicename);
						
						String mstdeviceclick=".//*[text()='"+MSTDevice+"']";
						//Thread.sleep(5000);
						
						if(gdbcreatepage.btn_gpon_FDNdeviceprv.isCurrentlyVisible()){
							Thread.sleep(500);
							
							actvtnpage.jsClick(gdbcreatepage.btn_gpon_FDNdeviceprv);
							
							Thread.sleep(2000);
						}
						
						if(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible()){
							//Thread.sleep(500);
							jsClick(orderpage.btn_downarrow_devicescroll);
							Thread.sleep(1000);
							jsClick(orderpage.btn_downarrow_devicescroll);
							Thread.sleep(500);
							
						}else{
							Thread.sleep(1000);
							loginPage.getDriver().findElement(By.xpath(mstdeviceclick)).click();
							Thread.sleep(5000);
						}
						
					/*	loginPage.getDriver().findElement(By.xpath(mstdeviceclick)));
						Thread.sleep(5000);
						*/
						
						
						jsClick(gdbcreatepage.ddl_gpon_ONTFDNMSTport);
						List<WebElementFacade> fdnport = gdbcreatepage.ddl_gpon_ONTFDNMSTportlist;
						ArrayList<String> fdnportlist=new ArrayList<String>();
						
						for(int j=0;j<fdnport.size();j++){
							
							fdnportlist.add(j, fdnport.get(j).getText());						
						
								}
						
						System.out.println(fdnportlist);
						for(int i=1;i<fdnportlist.size();i++){
						if(!fdnportlist.get(i).contains("OFC.1.2.")){			
						
						} else throw new Error("FDN is not starting with OFC 1.2. series");
						} 
						Thread.sleep(1000);
						
						if(gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange.isPresent()){
							jsClick(gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange);
						} else {
							jsClick(gdbcreatepage.ddl_gpon_ONTFDNMSTport);
						}
								
						if(gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange.isPresent()){
							gdbcreatepage.ddl_gpon_ONTFDNMSTport_Newchange.selectByVisibleText("OFC.1.2.1");
						} else {
							gdbcreatepage.ddl_gpon_ONTFDNMSTport.selectByVisibleText("OFC.1.2.1");
						}
						
						}
						
						Thread.sleep(1000);
					DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
					Date date = new Date();
					 String date1= dateFormat.format(date);
					 slf4jLogger.info(date1);
					 
					 
					 gdbcreatepage.tbx_gdb_ont_strandid.sendKeys(date1);
						
						gdbcreatepage.tbx_gdb_ont_cableid.sendKeys(date1);
						
						if(gdbcreatepage.btn_gpon_MST_box.isCurrentlyVisible()){
							actvtnpage.ddl_NB_buildType.selectByVisibleText("Service Provisioning");
						} else {
							actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
						}
					
						
						fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
						//actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
						jsClick(gdbcreatepage.btn_NB_Location_view);
						device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); 
					}	break;					
					
		case "FDP-12port": 	fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
							jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
							device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
			
		case "FDP-144port": fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
								jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
							device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
							
		case "SPLITTER": fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
							gdbcreatepage.ddl_NB_deviceSubType.selectByIndex(1);
							jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
							device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); break;
							
		case "Service Area": gdbcreatepage.gpon_ntwrk_servicearea(); break;
					
		case "MDU": 	fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);	
						jsClick(gdbcreatepage.btn_NB_commonarea_Location_view);
						device_location_fill("OVCreateGDBPage","GDB-Device create","Locationdata"); 
						jsClick(gdbcreatepage.btn_gpon_mdutab_fdhlookup);
						waitForElement(gdbcreatepage.tbx_gpon_mdutab_fdhlookup_deviceclli);
						fill_fields_from("OVCreateGDBPage","GDB-Device create","FDHdeviceclli");
						jsClick(gdbcreatepage.btn_gpon_mdutab_fdhlookup_lookup);
						waitForElement(gdbcreatepage.btn_gpon_mdutab_fdhlookup_lookup_previous);
						jsClick(gdbcreatepage.btn_gpon_mdutab_fdhlookup_lookup_previous);
						waitForElement(getDriver().findElement(By.xpath(".//*[starts-with(@ng-click,'lookupGridSettings.selLukupValue')]")));
						jsClick(getDriver().findElement(By.xpath(".//*[starts-with(@ng-click,'lookupGridSettings.selLukupValue')]")));
						break;
		}
		
		if(gdbcreatepage.btn_NB_Deleteicons.isCurrentlyVisible()){
		// Topology fill
		jsClick(gdbcreatepage.btn_NB_Topologylookup);
		loginPage.waitFor(actvtnpage.tbx_Topologyname);
		fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
		devcreatepage.topology_fill();	
		
		// Shared Flag
		jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6	   	
		
		//Clli FIll
		fill_fields_from("OVCreateGDBPage","GDB-Device create","deviceclli");
		Thread.sleep(2000);
		if(gdbcreatepage.lbl_gdb_selectop0.isCurrentlyVisible()){
			jsClick(gdbcreatepage.lbl_gdb_selectop0);
		} else actvtnpage.tbx_NB_Location_Designator.sendKeys("55F");
			
	
		
		}  
		    
		} 	  
	
	
	
	// Re-think of some approach that can handle this
	@Step
	public void gpon_ntwrk_deviceselecting(String gpondevice) throws Throwable{
		
		gdbcreatepage.gpon_ntwdevice_select(gpondevice);
		
		//fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
		
		if(gpondevice.equals("ONT")){
			Thread.sleep(5000);
			if(gdbcreatepage.btn_gpon_MST_box.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_MST_box);
				Thread.sleep(5000);
				String mstdevice=gdbcreatepage.lbl_oltdeviceGDB.getText();
				slf4jLogger.info(mstdevice);
				jsClick(gdbcreatepage.btn_gpon_ONT_box);
				Thread.sleep(5000);
				
			if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
				Thread.sleep(5000);
				}
			
			jsClick(gdbcreatepage.btn_gpon_ONT_FDN4linkmst);
			//IntDataContainer datacontainer1 = enduser.get_data_for_page(gdbcreatepage).getContainer("MST");
			//String fullNamefieldValue1 = datacontainer.getFieldValue("tbx_NB_CLLI"); 
					//get_data_for_page(orderpage).getContainer("MLTO location address").getField("tbx_NB_CLLI");
			//gdbcreatepage.tbx_FDNdeviceloopup.sendKeys(datacontainer1.getFieldValue("tbx_NB_CLLI"));
			waitForElement(gdbcreatepage.tbx_FDNdeviceloopup);
			gdbcreatepage.tbx_FDNdeviceloopup.sendKeys("LKJMNOIJ77");
			jsClick(gdbcreatepage.btn_gpon_FDNdevicelookup);
			waitForElement(gdbcreatepage.btn_gpon_FDNdeviceprv);
			String mstdeviceclick=".//*[text()='"+mstdevice+"']";
			Thread.sleep(8000);
			
			jsClick(gdbcreatepage.btn_gpon_FDNdeviceprv);
				
				Thread.sleep(2000);
				
				if(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible()){
					//Thread.sleep(500);
					jsClick(orderpage.btn_downarrow_devicescroll);
					Thread.sleep(1000);
					jsClick(orderpage.btn_downarrow_devicescroll);
					Thread.sleep(500);
					jsClick(loginPage.getDriver().findElement(By.xpath(mstdeviceclick)));
					Thread.sleep(5000);
				}else{
					Thread.sleep(1000);
					jsClick(loginPage.getDriver().findElement(By.xpath(mstdeviceclick)));
					Thread.sleep(5000);
				}
			
			
			//gdbcreatepage.ddl_gpon_FDNselectdevicelist);			
			/*gdbcreatepage.ddl_gpon_ONTFDNMSTport);
			List<WebElementFacade> fdnport = gdbcreatepage.ddl_gpon_ONTFDNMSTportlist;
			ArrayList<String> fdnportlist=new ArrayList<String>();
			//slf4jLogger.info("Step one done");
		
			for(int j=0;j<fdnport.size();j++){
			
				fdnportlist.add(j, fdnport.get(j).getText());
			
			//slf4jLogger.info("Step Two done");
			//slf4jLogger.info(atributesOfPage.get(j));
		}
		
			slf4jLogger.info(fdnportlist);*/
			/*for(int i=1;i<fdnportlist.size();i++){
			if(!fdnportlist.get(i).contains("OFC.1.2.")){			
			
			} else throw new Error("FDN is not starting with OFC 1.2. series");
			}*/  // Seperate this validation
			
			
			DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
			Date date = new Date();
			 String date1= dateFormat.format(date);
			 slf4jLogger.info(date1);
			
			gdbcreatepage.tbx_gdb_ont_strandid.sendKeys(date1);
			
			gdbcreatepage.tbx_gdb_ont_cableid.sendKeys(date1);
			
			gdbcreatepage.ddl_gpon_ONTFDNMSTport.selectByVisibleText("OFC.1.2.1");
			
			actvtnpage.ddl_NB_buildType.selectByVisibleText("Service Provisioning");
			
			} else if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
				Thread.sleep(5000);
				actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
				}
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			
			
			
			//fill_fields_from("OVCreateGDBPage","GDB-Device create","OLT");
			//fill_fields_from("OVCreateGDBPage","GDB-Device create","ONT");
			jsClick(gdbcreatepage.btn_NB_Topologylookup);//3
	        fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
	        devcreatepage.topology_fill();
	        jsClick( gdbcreatepage.rbt_NB_sharedFlag);//10
	        jsClick( gdbcreatepage.btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(devcreatepage.btn_lookUp);//Rework
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); 
			fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
			Thread.sleep(5000);
			jsClick(gdbcreatepage.btn_NB_Createicon);    	
			Thread.sleep(5000);
			slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
			if(gdbcreatepage.lbl_device_status.getText().contains("Failed")){
				gdbcreatepage.gdb_device_name_change();
			}
			slf4jLogger.info("ONT Created Successfully in Buid Id: "+gdbcreatepage.NB_Build_Id.getText()); 
			Thread.sleep(8000);
		    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Enable After creation");
			}else throw new Error("Delete button is Disable After creation ");
		    
		    
		} else if(gpondevice.equals("OLT")){
			Thread.sleep(5000);
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
			//fill_fields_from("OVCreateDevicePage","GDB","OLT");
			Thread.sleep(5000);
			jsClick(gdbcreatepage.btn_NB_Topologylookup);//3
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
			devcreatepage.topology_fill();		
			jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6	   	
			jsClick(gdbcreatepage.btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(devcreatepage.btn_lookUp);//Rework
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); 
			jsClick(gdbcreatepage.btn_NB_Createicon);
			waitForElement(gdbcreatepage.btn_gpon_expand);
			Thread.sleep(5000);
		    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		    if(gdbcreatepage.lbl_device_status.getText().equals("Failed")){
				gdbcreatepage.gdb_device_name_change();
			}
		    slf4jLogger.info("Device Device: "+gdbcreatepage.lbl_oltdeviceGDB.getText());
		    
			slf4jLogger.info("OLT Created Successfully"); 
			Thread.sleep(8000);
			//Adding Addcard to OLT
		    /*Thread.sleep(5000);
		    click_Tab("Search");
		    Thread.sleep(5000);
		    fill_fields("GDB_OLTSearch");
		    Thread.sleep(5000);
		    actvtnpage.tbx_deviceName.sendKeys(gdbcreatepage.lbl_oltdeviceGDB.getText());
		    actvtnpage.btn_inventorysearch);
		    Thread.sleep(10000);
		    select_viewBtn();
		    waitForElement(searchdevicepage.lbl_devicerole);
		    Thread.sleep(5000);
		    searchdevicepage.btn_expandleftscreen);
		    Thread.sleep(5000);
		    searchdevicepage.btn_shelfexpand);
		    Thread.sleep(10000);
		    searchdevicepage.btn_deviceaddcard);
		    Thread.sleep(5000);		    
		    searchdevicepage.ddl_deviceaddcardtype.selectByIndex(1);
		    
		    searchdevicepage.tbx_deviceaddcardcount.sendKeys("1");
		    Thread.sleep(5000);
		    searchdevicepage.btn_deviceaddcardcount);
		    Thread.sleep(8000);
		    searchdevicepage.ddl_addcardslotno.selectByIndex(1);
		    searchdevicepage.btn_addcardsavecarddetails);
		    Thread.sleep(10000);
		    searchdevicepage.lbl_GDBcreatetab);
		    Thread.sleep(5000);*/
		    /*searchdevicepage.btn_closeactivetab1);
		    Thread.sleep(5000);*/
		    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Enable After creation");
			}else throw new Error("Delete button is Disable After creation ");
		    
		    
		} else if(gpondevice.equals("FDP-12port")){
			Thread.sleep(5000);
			if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
				Thread.sleep(5000);
				}
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
			//fill_fields_from("OVCreateDevicePage","GDB","FDP");
			jsClick(gdbcreatepage.btn_NB_Topologylookup);//3
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
			devcreatepage.topology_fill();
			jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6
			jsClick(gdbcreatepage.btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(devcreatepage.btn_lookUp);//Rework
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); 
			jsClick(gdbcreatepage.btn_NB_Createicon);
			waitForElement(gdbcreatepage.btn_gpon_expand);
			Thread.sleep(5000);
		    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		    if(gdbcreatepage.lbl_device_status.getText().equals("Failed")){
				gdbcreatepage.gdb_device_name_change();
			}
			slf4jLogger.info("FDP Created Successfully"); 
			Thread.sleep(8000);
		    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Enable After creation");
			}else throw new Error("Delete button is Disable After creation ");
		    
		} else if(gpondevice.equals("FDP-144port")){
			jsClick(gdbcreatepage.btn_gpon_FDH_second);
			Thread.sleep(5000);			
			if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
				Thread.sleep(5000);
				}
			if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
				Thread.sleep(5000);
				}
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
			//fill_fields_from("OVCreateDevicePage","GDB","FDP");
			jsClick(gdbcreatepage.btn_NB_Topologylookup);//3
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
			devcreatepage.topology_fill();
			jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6
			jsClick(gdbcreatepage.btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(devcreatepage.btn_lookUp);//Rework
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); 
			jsClick(gdbcreatepage.btn_NB_Createicon);
			waitForElement(gdbcreatepage.btn_gpon_expand);
			Thread.sleep(5000);
		    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		    if(gdbcreatepage.lbl_device_status.getText().equals("Failed")){
				gdbcreatepage.gdb_device_name_change();
			}
			slf4jLogger.info("FDP Created Successfully"); 
			Thread.sleep(8000);
		    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Enable After creation");
			}else throw new Error("Delete button is Disable After creation ");
		    
		} else if(gpondevice.equals("SPLITTER")){
			Thread.sleep(5000);
			if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
				Thread.sleep(5000);
				}
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			//fill_fields_from("OVCreateGDBPage","GDB-Device create","SPLITTER");
			fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
			gdbcreatepage.ddl_NB_deviceSubType.selectByIndex(1);
			Thread.sleep(5000);	
			jsClick(gdbcreatepage.btn_NB_Topologylookup);//3
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
			devcreatepage.topology_fill();	
			jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6
			jsClick(gdbcreatepage.btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(devcreatepage.btn_lookUp);//Rework
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); 
			jsClick(gdbcreatepage.btn_NB_Createicon);
			waitForElement(gdbcreatepage.btn_gpon_expand);
			Thread.sleep(5000);
		    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		    if(gdbcreatepage.lbl_device_status.getText().equals("Failed")){
				gdbcreatepage.gdb_device_name_change();
			}
			slf4jLogger.info("SPLITTER Created Successfully"); 
			Thread.sleep(8000);
		    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Enable After creation");
			}else throw new Error("Delete button is Disable After creation ");
		    
		} else if(gpondevice.equals("MST")){
			Thread.sleep(5000);
			if(gdbcreatepage.btn_gpon_expand.isPresent()){
				jsClick(gdbcreatepage.btn_gpon_expand);
			Thread.sleep(5000);
			}
			
			
			if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Disabled");
			}else throw new Error("Delete button is Enable before creation ");
			fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
			Thread.sleep(5000);
			//actvtnpage.ddl_NB_deviceSubType.selectByIndex(2);
			jsClick(gdbcreatepage.btn_NB_Topologylookup);//3
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
			devcreatepage.topology_fill();
			
			jsClick(gdbcreatepage.rbt_NB_sharedFlag);//6
		
			jsClick(gdbcreatepage.btn_NB_Location_view);
			String parentwin=devcreatepage.window_switch();
			fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
			jsClick(devcreatepage.btn_lookUp);//Rework
			Thread.sleep(5000);
			devcreatepage.switch_win(parentwin); 
			jsClick(gdbcreatepage.btn_NB_Createicon);
			waitForElement(gdbcreatepage.btn_gpon_expand);
			Thread.sleep(5000);
		    slf4jLogger.info("Device Status: "+gdbcreatepage.lbl_device_status.getText());
		    if(gdbcreatepage.lbl_device_status.getText().equals("Failed")){
				gdbcreatepage.gdb_device_name_change();
			}
			slf4jLogger.info("MST Created Successfully in Buid Id: "+gdbcreatepage.NB_Build_Id.getText()); 
			Thread.sleep(8000);
		    if(gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
				slf4jLogger.info("Delete button is Enable After creation");
			}else throw new Error("Delete button is Disable After creation ");
			
		} 
	}
	
	@Step
	public void GDB_fiberlinking() throws Throwable{
		waitForElement(gdbcreatepage.btn_gpon_OLT);
		Thread.sleep(2000);
		gdbcreatepage.gdbfiberlink();
	}
	
	@Step
	public void GDB_fiberlinking_newapproach() throws Throwable{
		waitForElement(gdbcreatepage.btn_gpon_OLT);
		Thread.sleep(2000);
		gdbcreatepage.gdbfiberlink_newapproach();
	}
	
	@Step
	public void GDB_service_area_newapproach() throws Throwable{
		gdbcreatepage.GDB_service_area_newapproach();
	}
	
	@Step
	public void gdb_build_excel_download() throws Throwable{
		gdbcreatepage.gdb_build_excel_download();
	}
	
	@Step
	public void gdb_build_excel_download_newapproach() throws Throwable{
		gdbcreatepage.gdb_build_excel_write_device();
	}
	
	@Step
	public void gdb_build_excel_new_version() throws Throwable{
		gdbcreatepage.gdb_build_excel_download_newversion();
	}
	
	@Step
	public void GDB_viewresultsearch(){
		gdbcreatepage.GDB_viewresultsearch();
	}
	
	@Step
	public void gpon_fill_field(){
		try
		{
		/*List<WebElementFacade> acutalList = devcreatepage.lbl_gpon_create_fields; */
			Thread.sleep(2000);
		 List<WebElement> acutalList = loginPage.getDriver().findElements(By.xpath(".//label"));

		//List<WebElementFacade> acutalList = loginPage.getDriver().getTitle()
		//List<WebElement> acutalList = loginPage.getDriver().findElements(By.className(devcreatepage.lbl_gpon_create_fields));
		ArrayList<String> atributesOfPage=new ArrayList<String>();
		slf4jLogger.info("Step one done");
		for(int j=0;j<acutalList.size();j++){
			
			atributesOfPage.add(j, acutalList.get(j).getText());
			
			slf4jLogger.info("Step Two done");
			//slf4jLogger.info(atributesOfPage.get(j));
		}
		System.out.println(atributesOfPage);
		
		for(int i=0;i<acutalList.size();i++){
			//slf4jLogger.info(atributesOfPage.get(i));
		//switch(atributesOfPage.get(i)) {
		/*
		case "": 
			
		case "": devcreatepage.btn_locationLookup);
								String parentwin=devcreatepage.window_switch();
								fill_fields_from("OVCreateDevicePage",testdata,"Locationdata");
								devcreatepage.btn_lookUp);//Rework
								Thread.sleep(5000);
								devcreatepage.switch_win(parentwin);
								break;
								//End of Location clli
		
		case "Wire Center CLLI": devcreatepage.btn_wireclli);
								Thread.sleep(5000);			
								fill_fields_from("OVCreateDevicePage",testdata,"Wireddata");
								devcreatepage.btn_wiredlookUp);//Rework
								Thread.sleep(5000);
								devcreatepage.lnk_addlcn);//Rework
								Thread.sleep(2000);
								break;
								//End of wire CLLI
								
		case "Topology": devcreatepage.btn_Topologysearch);
							fill_fields_from("OVCreateDevicePage",testdata,"Topologydata");	
							devcreatepage.topology_fill();
							break;
							
		case "":
			
		case "":
			
		case "":
		
		case "Shared Flag*": devcreatepage.rdbtn_Shared);
							Thread.sleep(3000);	
							break;			
		
			default:break;
		}
		}
		
		Device type
		Device SubTypes
		Infrastructure/Service
		Aerial/Buried
		Indoor or Outdoor
		
		fill_fields_from("OVCreateDevicePage",testdata,"Devicedata");		
	devcreatepage.form_field();
	Thread.sleep(5000);
	devcreatepage.tab); //// Combine my scripts with Luna code
	//Thread.sleep(5000);
	//WebElement ele = devcreatepage.ddl_Equipment_role.selectByValue("0");
	//String role =ele.getText();
	//created_device_role_is(":"+role+" "+devcreatepage.create_device_successfull_msg());
	//slf4jLogger.info("*******************"+devcreatepage.create_device_successfull_msg());
	//enduser.locn_field();
	//devcreatepage.lnk_locn);	
	*/
	//	}
	}}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
/*	@Step
	public void click_launch_create_form(String create_button) throws InterruptedException {
		actvtnpage.click_launch_create_form(create_button);		
	}
	*/
	@Step
	public void i_Select_for_the_drop_down_Service_Type_us(String service_type) throws InterruptedException {
		actvtnpage.i_Select_for_the_drop_down_Service_Type_actvtnpage(service_type);		
	}
	
	@Step
	public void fill_fields_service(String field){
		try {
			//Thread.sleep(2000);
		waitForElement(servicecreatepage.btn_create);
		
			Thread.sleep(5000);
			fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateServicePage",field));
		//fillMandatoryFields(servicecreatepage,get_data_for_page(servicecreatepage).getContainer(field));
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Step
	public void search_passive_device() throws Throwable  {
		Thread.sleep(5000);
		searchdevicepage.search_passive_device();
	}
	
	@Step
	public void edit_Button_DeviceDetailPage(String button) throws InterruptedException {
		searchdevicepage.click_Editbtn(button);
	}
	
	@Step
	public void fillenabledfield(String testdata){
		try
		{	
			Thread.sleep(5000);
			List<WebElementFacade> acutalList = devcreatepage.lbl_allXapath1;
			ArrayList<String> atributesOfPage=new ArrayList<String>();
			
			slf4jLogger.info("==========Adding the attribute to the array list==============");
			for(int j=0;j<acutalList.size();j++){
				
				atributesOfPage.add(j, acutalList.get(j).getText());
				
				//slf4jLogger.info("Step Two done");
				//slf4jLogger.info(atributesOfPage.get(j));
			}
			
			slf4jLogger.info("atributesOfPage = "+atributesOfPage);
			Thread.sleep(3000);	
			//for(int i=0;i<acutalList.size();i++){
			for(int i=0;i<atributesOfPage.size();i++){
				//slf4jLogger.info(atributesOfPage.get(i));
				if(atributesOfPage.get(i).equals("Functional Status")){
			
						devcreatepage.ddl_functionalstatus.selectByVisibleText("Faulty");
						Thread.sleep(3000);	
						
				}
			
				else if(atributesOfPage.get(i).equals("Subscriber Name*")){					
					
					jsClick(devcreatepage.btn_subscriberName);
						Thread.sleep(5000);
									//String parentwin=devcreatepage.window_switch();
						Thread.sleep(5000);
						fill_fields_from("OVActivationPage",testdata,"SubscriberName");
						jsClick(devcreatepage.btn_subscriberLookUp);//Rework
						Thread.sleep(5000);
						jsClick(devcreatepage.lnk_subscriberName);//Rework
						Thread.sleep(5000);
				}
				
				else if(atributesOfPage.get(i).equals("Subscriber Name")){							
				
					jsClick(devcreatepage.btn_searchSubscriberName);
						Thread.sleep(5000);
					// String parentwin=devcreatepage.window_switch();
						Thread.sleep(5000);
						fill_fields_from("OVActivationPage", testdata, "SubscriberName");
						jsClick(devcreatepage.btn_subscriberLookUp);// Rework
						Thread.sleep(5000);
						jsClick(devcreatepage.lnk_subscriberName);// Rework
						Thread.sleep(5000);
					// devcreatepage.switch_win(parentwin);
							
				}
				else if(atributesOfPage.get(i).equals("Device CLLI*")){							
					Thread.sleep(5000);
					fill_fields_from("OVActivationPage", testdata, "DeviceCLLI");
					Thread.sleep(5000);
				// devcreatepage.switch_win(parentwin);
						
			}
			}
			
			jsClick(devcreatepage.btn_saveDeviceDetail);//Rework
			Thread.sleep(5000);
		
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Step
	public void clickedNetworkingDetailsTab(){
		searchdevicepage.tabNetworkDetail();
	}
	
	@Step
	public void saveNetworkingDetails() throws InterruptedException{
		searchdevicepage.saveNetworkingDetails();
	}
	
	@Step
	public void fillSubscriberFields(String testdata) throws InterruptedException{
		jsClick(devcreatepage.btn_subsciber);
		Thread.sleep(5000);
		fill_fields_from("OVCreateDevicePage",testdata,"Subscriberdata");
		jsClick(devcreatepage.btn_sublookup);
		Thread.sleep(1000);
		jsClick(devcreatepage.lnk_addsub);
		Thread.sleep(3000);
		}
	
	
	//Validation sections --26/8/2016
	
	@Step	
	public void Validate_fields_in_create_device_splitter_page() throws Exception {
		devcreatepage.Validate_attributes_in_create_device_page_splitter();
	}
	
	@Step
	public void validate_apacheSolr_for_subscriber_in_create_device_service_page_enduser() throws InterruptedException {
		// TODO Auto-generated method stub
		devcreatepage.validate_apacheSolr_for_subscriber_in_create_device_service_createpage();
	}
	
	//Validation new update -- 9/23
	@Step
	public void validateDeviceDetail(String template){
		searchdevicepage.validateDeviceDetail(template);
	}
	
	@Step
	public void validateNetworkDetail(String template){
		searchdevicepage.validateNetworkDetail(template);
	}
	
	@Step
	public void validate_DeviceName() throws InterruptedException{
		searchdevicepage.validate_DeviceNameValue();
	}
	
	@Step
	public void validateViewList(String template){
		ovsearchqostemplate.validateViewList(template);
	}
	
	@Step
	public void verifyDeviceDetailsField(){
		String ExpectedfunctionalStatus = actvtnpage.tag_functionalStatus.getText();
		String ExpectednetworkElementNode = actvtnpage.tag_networkElementNode.getText();
		String Expectedalias1 = actvtnpage.tag_alias1.getText();
		String Expectedalias2 = actvtnpage.tag_alias2.getText();
		String ExpectedvendorPortNum = actvtnpage.tag_vendorPortNum.getText();
		String ExpectedpartType = actvtnpage.tag_partType.getText();
		String ExpectedManufacpartNum = actvtnpage.tag_ManufacpartNum.getText();
		String ExpectedManagementVLAN = actvtnpage.tag_ManagementVLAN.getText();
		
			
			
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC55484-CD");
			String functionalStatus = datacontainer.getFieldValue("ddl_FunctionalStatus");
			String networkElementNode = datacontainer.getFieldValue("tbx_networkElementNode");
			String alias1 = datacontainer.getFieldValue("tbx_Alias1");
			String alias2 = datacontainer.getFieldValue("tbx_Alias2");
			String vendorPortNum = datacontainer.getFieldValue("tbx_vedorPartNum");
			String partType = datacontainer.getFieldValue("tbx_partType");
			String ManufacpartNum = datacontainer.getFieldValue("tbx_manufacturerPartNum");
			String ManagementVLAN = datacontainer.getFieldValue("tbx_manufacturerVLAN");
			String functionalStatusField[] = functionalStatus.split(":");
			String actualfunctionalStatus = functionalStatusField[1];
			String networkElementNodeField[] = networkElementNode.split(":");
			String actualnetworkElementNode = networkElementNodeField[1];
			String alias1Field[] = alias1.split(":");
			String actualalias1 = alias1Field[1];
			String alias2Field[] = alias2.split(":");
			String actualalias2 = alias2Field[1];
			String vendorPortNumField[] = vendorPortNum.split(":");
			String actualvendorPortNum = vendorPortNumField[1];
			String partTypeField[] = partType.split(":");
			String actualpartType = partTypeField[1];
			String ManufacpartNumField[] = ManufacpartNum.split(":");
			String actualManufacpartNum = ManufacpartNumField[1];
			String ManagementVLANField[] = ManagementVLAN.split(":");
			String actualManagementVLAN = ManagementVLANField[1];
			
			Assert.assertEquals(ExpectedfunctionalStatus, actualfunctionalStatus);
			Assert.assertEquals(ExpectednetworkElementNode, actualnetworkElementNode);
			Assert.assertEquals(Expectedalias1, actualalias1);
			Assert.assertEquals(Expectedalias2, actualalias2);
			Assert.assertEquals(ExpectedvendorPortNum, actualvendorPortNum);
			Assert.assertEquals(ExpectedpartType, actualpartType);
			Assert.assertEquals(ExpectedManufacpartNum, actualManufacpartNum);
			Assert.assertEquals(ExpectedManagementVLAN, actualManagementVLAN);
}
	
	@Step
	public void verifyNetworkingDetailsField(){

		String ExpectedNDchasisSerialNum = actvtnpage.tag_NDchasisSerialNum.getText();
		String ExpectedNDserialNum = actvtnpage.tag_NDserialNum.getText();
		String ExpectedNDSocketNum = actvtnpage.tag_NDSocketNum.getText();
		String ExpectedNDHardwareVersion = actvtnpage.tag_NDHardwareVersion.getText();
		String ExpectedNDSoftwareVersion = actvtnpage.tag_NDSoftwareVersion.getText();
		String ExpectedNDIPSubnetMaskm = actvtnpage.tag_NDIPSubnetMask.getText();
		String ExpectedNDRevision= actvtnpage.tag_NDRevision.getText();
		String ExpectedDisContinueReason = actvtnpage.tag_DisContinueReason.getText();
		String ExpectedNDMacAddress = actvtnpage.tag_NDMacAddress.getText();
		String ExpectedNDSNMPObjectID = actvtnpage.tag_NDSNMPObjectID.getText();
		String ExpectedNDFirmWareVersion = actvtnpage.tag_NDFirmWareVersion.getText();
		String ExpectedNDNMSType = actvtnpage.tag_NDNMSType.getText();
		String ExpectedNDNMSHostName = actvtnpage.tag_NDNMSHostName.getText();
		String ExpectedNDNMSDescription = actvtnpage.tag_NDNMSDescription.getText();
		String ExpectedNDNetworkIdentifier = actvtnpage.tag_NDNetworkIdentifier.getText();
		String ExpectedNDNetworkName = actvtnpage.tag_NDNetworkName.getText();
		
			UserSteps enduser = new UserSteps();
			
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC55484-ND");
			String chasisSerialNum = datacontainer.getFieldValue("tbx_NDchasisSerialNum");
			String serialNum = datacontainer.getFieldValue("tbx_NDserialNum");
			String SocketNum = datacontainer.getFieldValue("tbx_NDSocketNum");
			String HardwareVersion = datacontainer.getFieldValue("tbx_NDHardwareVersion");
			String SoftwareVersion = datacontainer.getFieldValue("tbx_NDSoftwareVersion");
			String IPSubnetMask = datacontainer.getFieldValue("tbx_NDIPSubnetMask");
			String Revision = datacontainer.getFieldValue("tbx_NDRevision");
			String DisContinueReason = datacontainer.getFieldValue("tbx_DisContinueReason");
			String MacAddress = datacontainer.getFieldValue("tbx_NDMacAddress");
			String SNMPObjectID = datacontainer.getFieldValue("tbx_NDSNMPObjectID");
			String FirmWareVersion = datacontainer.getFieldValue("tbx_NDFirmWareVersion");			
			String NMSType = datacontainer.getFieldValue("tbx_NDNMSType");
			String NMSHostName = datacontainer.getFieldValue("tbx_NDNMSHostName");
			String NMSDescription = datacontainer.getFieldValue("tbx_NDNMSDescription");			
			String NetworkIdentifier = datacontainer.getFieldValue("tbx_NDNetworkIdentifier");
			String NetworkName = datacontainer.getFieldValue("tbx_NDNetworkName");
			
			String chasisSerialNumField[] = chasisSerialNum.split(":");
			String actualchasisSerialNum =chasisSerialNumField[1];
			String serialNumField[] = serialNum.split(":");
			String actualserialNum =serialNumField[1];
			String SocketNumField[] = SocketNum.split(":");
			String actualSocketNum =SocketNumField[1];
			String HardwareVersionField[] = HardwareVersion.split(":");
			String actualHardwareVersion =HardwareVersionField[1];
			String SoftwareVersionField[] = SoftwareVersion.split(":");
			String actualSoftwareVersion =SoftwareVersionField[1];
			String IPSubnetMaskField[] = IPSubnetMask.split(":");
			String actualIPSubnetMask =IPSubnetMaskField[1];
			String RevisionField[] = Revision.split(":");
			String actualRevision =RevisionField[1];
			String DisContinueReasonField[] = DisContinueReason.split(":");
			String actualDisContinueReason =DisContinueReasonField[1];	
			String MacAddressField[] = MacAddress.split(":");
			String actualMacAddress =MacAddressField[1];
			String SNMPObjectIDField[] = SNMPObjectID.split(":");
			String actualSNMPObjectID =SNMPObjectIDField[1];
			String FirmWareVersionField[] = FirmWareVersion.split(":");
			String actualFirmWareVersion =FirmWareVersionField[1];
			String NMSTypeField[] = NMSType.split(":");
			String actualNMSType =NMSTypeField[1];
			String NMSHostNameField[] = NMSHostName.split(":");
			String actualNMSHostName =NMSHostNameField[1];
			String NMSDescriptionField[] = NMSDescription.split(":");
			String actualNMSDescription =NMSDescriptionField[1];
			String NetworkIdentifierField[] = NetworkIdentifier.split(":");
			String actualNetworkIdentifier =NetworkIdentifierField[1];
			String NetworkNameField[] = NetworkName.split(":");
			String actualNetworkName =NetworkNameField[1];
			
			
			Boolean	flag = ExpectedNDchasisSerialNum.contains(actualchasisSerialNum);
			Assert.assertTrue(flag);
			flag =ExpectedNDserialNum.contains(actualserialNum);
			Assert.assertTrue(flag);
			flag =ExpectedNDSocketNum.contains(actualSocketNum);
			Assert.assertTrue(flag);
			flag =ExpectedNDHardwareVersion.contains(actualHardwareVersion);
			Assert.assertTrue(flag);
			flag =ExpectedNDSoftwareVersion.contains(actualSoftwareVersion);
			Assert.assertTrue(flag);
			flag =ExpectedNDIPSubnetMaskm.contains(actualIPSubnetMask);
			Assert.assertTrue(flag);
			flag =ExpectedDisContinueReason.contains(actualDisContinueReason);
			Assert.assertTrue(flag);
			flag =ExpectedNDMacAddress.contains(actualMacAddress);
			Assert.assertTrue(flag);
			flag =ExpectedNDSNMPObjectID.contains(actualSNMPObjectID);
			Assert.assertTrue(flag);
			flag =ExpectedNDRevision.contains(actualRevision);
			Assert.assertTrue(flag);
			flag =ExpectedNDFirmWareVersion.contains(actualFirmWareVersion);
			Assert.assertTrue(flag);
			flag =ExpectedNDNMSType.contains(actualNMSType);
			Assert.assertTrue(flag);
			flag =ExpectedNDNMSHostName.contains(actualNMSHostName);
			Assert.assertTrue(flag);
			flag =ExpectedNDNMSDescription.contains(actualNMSDescription);
			Assert.assertTrue(flag);
			flag =ExpectedNDNetworkIdentifier.contains(actualNetworkIdentifier);
			Assert.assertTrue(flag);
			flag =ExpectedNDNetworkName.contains(actualNetworkName);
			Assert.assertTrue(flag);			
		}
	
	@Step
	public void verifywirecenterCLLILookupFields() throws InterruptedException {
		boolean flag = actvtnpage.tbx_wireCenteraddress.isDisplayed();
		Assert.assertTrue("address field is not displayed", flag);
		flag= actvtnpage.tbx_wireCenterstreetName.isDisplayed();
		Assert.assertTrue("street name field is not displayed", flag);
		flag= devcreatepage.ddl_wireCenterstreetType.isPresent();
		Assert.assertTrue("street type field is not displayed", flag);		
		flag= devcreatepage.tbx_wireCenterCity.isDisplayed();
		Assert.assertTrue("city field is not displayed", flag);
		flag= devcreatepage.tbx_wireCenterstate.isPresent();
		Assert.assertTrue("state field is not displayed", flag);
		flag= devcreatepage.tbx_wireCenterzip.isDisplayed();
		Assert.assertTrue("zip field is not displayed", flag);
		flag= actvtnpage.tbx_wireCenterbuildingCLLI.isDisplayed();
		Assert.assertTrue("Building CLLI field is not displayed", flag);
		flag= devcreatepage.btn_wireCenterLookUp.isDisplayed();
		Assert.assertTrue("look up button is not displayed", flag);
		flag= devcreatepage.btn_wireCenterCancel.isDisplayed();
		Assert.assertTrue("Cancel button is not displayed", flag);
		commonData.getContainer(actvtnpage.getClass().getSimpleName()).setActualValuesForAllContainers();
		fillMandatoryFields(actvtnpage, commonData.getContainer(actvtnpage.getClass().getSimpleName()).getContainer("TC39242"));
		jsClick(devcreatepage.btn_wireCenterCancel);
		boolean flag1 = devcreatepage.btn_wireclli.isDisplayed();
		Assert.assertTrue("Cancel button functionality is not working",flag1);
		slf4jLogger.info("Cancel button functionality is working fine");
		jsClick(devcreatepage.btn_wireclli);
		fillMandatoryFields(actvtnpage, commonData.getContainer(actvtnpage.getClass().getSimpleName()).getContainer("TC39242"));
		jsClick(devcreatepage.btn_wireCenterLookUp);
		flag =devcreatepage.btn_wireCenterLookUp.isDisplayed();
		Assert.assertTrue("look up button functionality is not working",flag);
		slf4jLogger.info("look up button functionallity is working fine");
		jsClick(devcreatepage.lnk_addlcn);
		
	} 
	
	@Step
	public void verfiy_relatedTabPage(String tab) throws Exception {
		searchdevicepage.verfiy_relatedTabPage(tab);
	}
	
	
	//---------------------------------------MOHIT---------------------------------------------------------------
	//TC54963
	@Step
	public void verifyTopologyDetailsField(){
		String actualTDName = actvtnpage.tag_TDName.getText();
		String actualTDFullName = actvtnpage.tag_TDFullName.getText();
		String actualTDAlias1 = actvtnpage.tag_TDAlias1.getText();
		String actualTDTopologyRole = actvtnpage.tag_TDTopologyRole.getText();
		String actualTDTopologyType = actvtnpage.tag_TDTopologyTechnologyType.getText();
		String actualTDTopologyNotes = actvtnpage.tag_TDTopologyNotes.getText();

		UserSteps enduser = new UserSteps();
		
		IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC55963-TD");
		String TDName = datacontainer.getFieldValue("tbx_TDName");
		String TDFullName = datacontainer.getFieldValue("tbx_TDFullName");
		String TDAlias1 = datacontainer.getFieldValue("tbx_TDAlias1");
		String TDTopologyRole = datacontainer.getFieldValue("ddl_TDTopologyRole");
		String TDTopologyType = datacontainer.getFieldValue("ddl_TDTopologyTechnologyType");
		String TDTopologyNotes = datacontainer.getFieldValue("tbx_TDTopologyNotes");
		
		String TDNameField[] = TDName.split(":");
		String expectedTDName =TDNameField[1];
		String TDFullNameField[] = TDFullName.split(":");
		String expectedTDFullName =TDFullNameField[1];
		String TDAlias1Field[] = TDAlias1.split(":");
		String expectedTDAlias1 =TDAlias1Field[1];
		String TDTopologyRoleField[] = TDTopologyRole.split(":");
		String expectedTDTopologyRole =TDTopologyRoleField[1];
		String TDTopologyTypeField[] = TDTopologyType.split(":");
		String expectedTDTopologyType =TDTopologyTypeField[1];
		String TDTopologyNotesField[] = TDTopologyNotes.split(":");
		String expectedTDTopologyNotes =TDTopologyNotesField[1];
		
		Boolean	flag = expectedTDName.contains(actualTDName);
		Assert.assertTrue(flag);
		flag =expectedTDFullName.contains(actualTDFullName);
		Assert.assertTrue(flag);
		flag =expectedTDAlias1.contains(actualTDAlias1);
		Assert.assertTrue(flag);
		flag =expectedTDTopologyRole.contains(actualTDTopologyRole);
		Assert.assertTrue(flag);
		flag =expectedTDTopologyType.contains(actualTDTopologyType);
		Assert.assertTrue(flag);
		flag =expectedTDTopologyNotes.contains(actualTDTopologyNotes);
		Assert.assertTrue(flag);
	}
	
	@Step
	public void edit_Button_TopologyDetailPage(String button) throws InterruptedException {
		devicelookuppage.click_EditbtnForTopology(button);
	}
	
	@Step
	public void validate_message_device_Details(){
		searchdevicepage.validate_message_device_Details();
	}
	@Step
	public void validate_message_network_Details(){
		searchdevicepage.validate_message_network_Details();
	}
	
	
	
	
	//TC54965
		public void verifySearchSection(String value){
			Select select  = new Select(actvtnpage.ddl_searchType);
			String actualSearchType = select.getFirstSelectedOption().getText();
			UserSteps enduser = new UserSteps();
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC54965-Search");
			String serviceType = datacontainer.getFieldValue("ddl_searchType");
			String serviceTypeField[] = serviceType.split(":");
			String expectedserviceType =serviceTypeField[1];
			Boolean	flag = expectedserviceType.contains(actualSearchType);
			Assert.assertTrue(flag);
		}
	
		
		public void verifyInventorySection(String value){
			Select select  = new Select(actvtnpage.ddl_invntryType);
			String actualInventoryType = select.getFirstSelectedOption().getText();
			UserSteps enduser = new UserSteps();
			IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC54965-Search");
			String InventoryType = datacontainer.getFieldValue("ddl_invntryType");
			String InventoryTypeField[] = InventoryType.split(":");
			String expectedInventoryType =InventoryTypeField[1];
			Boolean	flag = expectedInventoryType.contains(actualInventoryType);
			Assert.assertTrue(flag);
		}
		
		public void verifyDeviceDetailsTab(){
			WebDriverWait wait = new WebDriverWait(getDriver(), 180);
			wait.until(ExpectedConditions.visibilityOf(searchdevicepage.tag_deviceDetails));
			String deviceCLLI = actvtnpage.tag_deviceCLLIl.getText();
			String deviceName = actvtnpage.tag_deviceName.getText();
			Boolean	flag = deviceName.contains(deviceCLLI);
			Assert.assertTrue(flag);
		}
		
		//--------------------------------------------ANKIT---------------------------------------------------
		//TC39225
		public void	verify_Addsubbtn()
		{
			shouldExist(locationsearchpage);
			locationsearchpage.Addsubbtnverify();
			
		} 
		
		//TC39223
		@Step
		public void fill_fieldsatsearchlinkdetails(String field) throws InterruptedException {
			Thread.sleep(6000);
			fillMandatoryFields(ovsearchlinkpage,get_data_for_page(ovsearchlinkpage).getContainer(field));
			} 
		
		//TC39223
		 @Step
			public void validatiethefield()
			{
			 ovsearchlinkpage.validate();
				
				
			} 
		 
		//TC39223
		 public void filldata(String arg1, String arg2)
		    {
		  //  String cls = arg1.getClass().getSimpleName();
				IntDataContainer dataContainer = commonData.getContainer(searchservicepage.getClass().getSimpleName()).getContainer(arg2);
				fillMandatoryFields(searchservicepage, dataContainer);
				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				try{
				jse.executeScript("window.scrollBy(0,250)", "");
				jsClick(ovcsdp.btn_save);
				}catch(Exception e){
				jse.executeScript("arguments[0]);",  ovcsdp.btn_save);
				}
		    } 
		
		//TC39223
		 public void validateservices() throws InterruptedException
		    {
			 Thread .sleep(5000);
			 slf4jLogger.info("value = "+searchservicepage.ver_supportedversion.getText().trim());
		    Assert.assertEquals(searchservicepage.ver_supportedversion.getText().trim(), "V6");	
		    } 
		 
		 //-------------------------dolly---------------------------
			@Step				
			public void createDeviceRole_Name(String devRole,String devName){
				actvtnpage.createDeviceRole_Name(devRole,devName);
			}
			
			@Step
			public void validate_TransportDeviceName(String devName) throws Exception {
				transportPathPage.validate_TransportDeviceName(devName);
			}
			
			@Step
			public void selectCircuit(String circuitName) throws Exception {
		/*		Select select = new Select(transportPathPage.ddl_circuit);
				select.selectByVisibleText(circuitName);*/
				transportPathPage.ddl_circuit.selectByVisibleText(circuitName);
				Thread.sleep(1000);
			}
			
			@Step
			public void validate_endDeviceName(String devName) throws Exception {
				transportPathPage.validate_endDeviceName(devName);
			}
			
			@Step
			public void verifySubmitButtonAndClick() throws Exception {
				transportPathPage.verifySubmitButtonAndClick();
			}
			
			public void verifyCreateSection(String value){
				Select select  = new Select(actvtnpage.ddl_createType);
				String actualSearchType = select.getFirstSelectedOption().getText();
//				UserSteps enduser = new UserSteps();
//				IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC54965-Search");
//				String serviceType = datacontainer.getFieldValue("ddl_searchType");
//				String serviceTypeField[] = serviceType.split(":");
//				String expectedserviceType =serviceTypeField[1];
				
				Boolean	flag = actualSearchType.contains(value);
				Assert.assertTrue(flag);
			}
			
			
			public void verifyInventoryType(String value){
				Select select  = new Select(actvtnpage.ddl_invntryType);
				String actualSearchType = select.getFirstSelectedOption().getText();
//				UserSteps enduser = new UserSteps();
//				IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer("TC54965-Search");
//				String serviceType = datacontainer.getFieldValue("ddl_searchType");
//				String serviceTypeField[] = serviceType.split(":");
//				String expectedserviceType =serviceTypeField[1];
				
				Boolean	flag = actualSearchType.contains(value);
				Assert.assertTrue(flag);
			}
			
			@Step				
			public void selectTopologyType_State(String topologyType,String state){
				actvtnpage.selectTopologyType_State(topologyType,state);
			}
			
			@Step
			public void fill_TopologyData(String field) throws InterruptedException {
					fillMandatoryFields(createTopologyPage,get_data_for_page(createTopologyPage).getContainer(field));
					Thread.sleep(5000);
				}
			
			
			@Step
			public void clickAdddevicecircuit(String button) throws InterruptedException{
				//devcreatepage.tbx_locationClli.clear();
				createTopologyPage.clickAdddevicecircuit(button);
				
			}
			
		/*	@Step
			public void clickAddDevice() throws InterruptedException{
				//devcreatepage.tbx_locationClli.clear();
				createTopologyPage.clickAddDevice();
			}*/ // 10/13/2016	Need to check if the it's impacting other region
			
			@Step
			public void verifyAttributes() throws InterruptedException{
				//devcreatepage.tbx_locationClli.clear();
				createTopologyPage.verifyAttributes();
			}
			
			@Step
			public void searchDevice(String devType ,String devSubType) throws InterruptedException{
				//devcreatepage.tbx_locationClli.clear();
				createTopologyPage.searchDevice(devType,devSubType);
			}
			
/*			@Step
			public void validateTopologyDetail(String template){
			createTopologyPage.validateTopologyDetail(template);
			
			}*/
			
				public void validateTopologyDetail(String template){
			try {
				
				
				UserSteps enduser = new UserSteps();
				
				
				String sName = createTopologyPage.lbl_Name.getText();
				String actualSerialName = sName.trim();
				slf4jLogger.info("actualSerialName= "+actualSerialName);
				
				String sFullName = createTopologyPage.lbl_FullName.getText();
				String actualFullName = sFullName.trim();
				slf4jLogger.info("actualFullName= "+actualFullName);
				
				String sTopologyRole = createTopologyPage.lbl_TopologyRole.getText();
				String actualTopologyRole = sTopologyRole.trim();
				slf4jLogger.info("actualTopologyRole= "+actualTopologyRole);
				
				
				String sTopologyTechType = createTopologyPage.lbl_TopologyTechType.getText();
				String actualTopologyTechType = sTopologyTechType.trim();
				slf4jLogger.info("actualTopologyTechType= "+actualTopologyTechType);
				
				IntDataContainer datacontainer = enduser.get_data_for_page(createTopologyPage).getContainer(template);
				
				String fullNamefieldValue1 = datacontainer.getFieldValue("tbx_fullName");
				String topologyRolefieldValue = datacontainer.getFieldValue("ddl_topologyRole");
				String topologyTypefieldValue = datacontainer.getFieldValue("ddl_topologyTechType");
				
				slf4jLogger.info("fullNamefieldValue1 ="+fullNamefieldValue1);
				slf4jLogger.info("topologyRolefieldValue ="+topologyRolefieldValue);
				slf4jLogger.info("topologyTypefieldValue ="+topologyTypefieldValue);
				
				String FielsString[] = fullNamefieldValue1.split(":");
				String expectFullName = FielsString[1];
				slf4jLogger.info("expectFullName= "+expectFullName);
				
				
				String FielsString1[] = topologyRolefieldValue.split(":");
				String expecttopologyRolefieldValue = FielsString1[1];
				slf4jLogger.info("expecttopologyRolefieldValue= "+expecttopologyRolefieldValue);
				
				String FielsString2[] = topologyTypefieldValue.split(":");
				String expecttopologyTypefieldValue = FielsString2[1];
				slf4jLogger.info("expecttopologyTypefieldValue= "+expecttopologyTypefieldValue);
				
				
				Assert.assertEquals("Topology Full Name is not same", expectFullName, actualFullName);
//				slf4jLogger.info("Serial Name is same");
				
				Assert.assertEquals("Topology Role is not same", expecttopologyRolefieldValue, actualTopologyRole);
//				slf4jLogger.info("Vendor Part Name is same");
				
				Assert.assertEquals("Topology Technology Type is not same", expecttopologyTypefieldValue, actualTopologyTechType);
//				slf4jLogger.info("Vendor Part Name is same");
				
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
				
				@SuppressWarnings("unused")
				@Step
				public void fill_GeneralAttributes_TopologyData(String field) throws InterruptedException {
					Thread.sleep(5000);
					/*String device = createTopologyPage.lal_Associate_Device1.getText();
					System.out.println("Device Name= "+device);
					String circuit = createTopologyPage.lal_Associate_Circuit1.getText();
					System.out.println("Circuit Name= "+circuit);*/
					 IntDataContainer TopologyGeneralAttributesTestData = Page.commonData.getContainer("OVCreateTopologyPage").getContainer("TopologyGeneralAttributes");
					//System.err.println("testdata::"+TopologyGeneralAttributesTestData.getFieldValue("tbx_fullName"));
					 
					  String dtf = Page.getDate("yyyy/MM/dd HH:mm:ss");
					  String now = Page.getDate("HH:mm:ss");
				      //System.out.println(dtf.format(now));
					  String time = String.format(now).replaceAll("/", "");
					  String fullName = TopologyGeneralAttributesTestData.getFieldValue("tbx_fullName")+time;
					  createTopologyPage.tbx_fullName.type(fullName);
					
						//createTopologyPage.tbx_fullName.sendKeys("Automation1");
					
						createTopologyPage.tbx_alias1.type(TopologyGeneralAttributesTestData.getFieldValue("tbx_alias1"));
						createTopologyPage.ddl_topologyRole.selectByVisibleText(TopologyGeneralAttributesTestData.getFieldValue("ddl_topologyRole"));
						createTopologyPage.ddl_topologyTechType.selectByVisibleText(TopologyGeneralAttributesTestData.getFieldValue("ddl_topologyTechType"));
						createTopologyPage.tbx_topologyNote.type(TopologyGeneralAttributesTestData.getFieldValue("tbx_topologyNote"));
						/*
						fillMandatoryFields(createTopologyPage,get_data_for_page(createTopologyPage).getContainer(field));
						Thread.sleep(5000);*/
						jsClick(createTopologyPage.btn_topology_create);
						Thread.sleep(5000);
						//System.out.println("Topology name= "+createTopologyPage.lbl_Name.getText());
					}
					
				@Step
				public void select_circuit() throws InterruptedException {
					    Thread.sleep(3000);
						createTopologyPage.ddl_circuittype.selectByIndex(2);
						 Thread.sleep(2000);
						 jsClick(createTopologyPage.btn_searchCircuit);
						Thread.sleep(8000);
						jsClick(createTopologyPage.chk_Circuit1);
						/*for(int i=1;i<=4;i++){
							String circuit = "//tbody/tr["+i+"]/td[1]/input";
							loginPage.getDriver().findElement(By.xpath(circuit)));
						    }*/
						Thread.sleep(5000);
						jsClick(createTopologyPage.btn_AssociateCircuits);	
					}
				public void select_circuit_PONCollector() throws InterruptedException{ 
					Thread.sleep(3000);
					createTopologyPage.ddl_circuittype.selectByVisibleText("Optical Bearer");
					jsClick(createTopologyPage.btn_searchCircuit);
					Thread.sleep(5000);
					for(int i=1;i<=20;i++){
					String status=loginPage.getDriver().findElement(By.xpath("//div[@ng-show='showAssociationCircuitTable']//tbody/tr["+i+"]/td[4]")).getText();
					System.out.println(status);
					if(status.contains("Planned")){
						jsClick(loginPage.getDriver().findElement(By.xpath("//div[@ng-show='showAssociationCircuitTable']//tbody/tr["+i+"]/td[1]/input")));
						jsClick(createTopologyPage.btn_AssociateCircuits);
						break;}			
					}	
				}
				@Step
				public void select_device() throws InterruptedException {
					    Thread.sleep(3000);
						createTopologyPage.ddl_devicetype.selectByVisibleText("Calix E7");
						Thread.sleep(2000);
						createTopologyPage.ddl_deviceSubType.selectByIndex(1);
						Thread.sleep(2000);
						jsClick(createTopologyPage.btn_searchdevice);
						Thread.sleep(5000);
						waitForElement(createTopologyPage.btn_AssociateDevices);
						//createTopologyPage.chk_device1);
						for(int i=1;i<=2;i++){
							//String device = "//div[@ng-show='showAssociationDeviceTable']//tbody/tr["+i+"]/td[1]/input";Thread.sleep(2000);
							String device = "(//div[@ng-if='showAssociationDeviceTable']//input)["+i+"]";Thread.sleep(2000);
							jsClick(loginPage.getDriver().findElement(By.xpath(device)));
						    }
						Thread.sleep(5000);
						jsClick(createTopologyPage.btn_AssociateDevices);
					}
				
				@Step
				public void relatedtab_Topology() throws InterruptedException {
					searchTopologyPage.relatedtab_Topology();
					    
					}
				
				@Step
				public void Delete_Topology() throws InterruptedException {
					String Topologyname=searchTopologyPage.Delete_Topology();
					
					Search_Topology(Topologyname);
					String message1 = createTopologyPage.lbl_deleteAlertmessage.getText();
					
					System.out.println("Alert Message is :"+message1);			
				}
				
				@Step
				public void Validated_Remove_device_and_circuit()throws InterruptedException {
					jsClick(createTopologyPage.btn_TopologyPage_Edit);
					Thread.sleep(2000);
					waitForElement(createTopologyPage.btn_TopologyPage_Save);
					//while(createTopologyPage.btn_circuit_remove_icon.isCurrentlyEnabled())
					if(createTopologyPage.lbl_circuit_container.isCurrentlyVisible()){
						jsClick(createTopologyPage.btn_circuit_remove_icon);
					Alert RemoveCircuit = loginPage.getDriver().switchTo().alert();
					RemoveCircuit.accept();
					System.out.println("Deleted all Circuits from the Topology");
					}
					while(!createTopologyPage.lbl_Topology_ErrorMsg.isCurrentlyVisible()){
						jsClick(createTopologyPage.btn_device_remove_icon);
					Alert Removedevice = loginPage.getDriver().switchTo().alert();
					Thread.sleep(3000);
					Removedevice.accept();
					}
					System.out.println(createTopologyPage.lbl_Topology_ErrorMsg.getText());
					//createTopologyPage.btn_Topology_ErrorMsg_cancel);
					Thread.sleep(2000);
					jsClick(createTopologyPage.btn_TopologyPage_Save);
					Thread.sleep(2000);		waitForElement(createTopologyPage.btn_TopologyPage_Edit);
				}
				public void Search_Topology(String TopologyName) throws InterruptedException{
					actvtnpage.SearchTopology(TopologyName);
				}
				public void Click_View_icon() throws InterruptedException{
					Thread.sleep(3000);
					jsClick(createTopologyPage.btn_Topology_viewicon);
					Thread.sleep(3000);
				}
				
				@Step
				public void Topologyaction(String action) throws InterruptedException {
					createTopologyPage.Topologyaction(action);
				}
				
				@Step
				public void Update_Topology(String Topology) throws InterruptedException{

					createTopologyPage.updatecommonsection();
					
					if(Topology.contains("Generic Network")||Topology.contains("PON Network")){	
						//fillMandatoryFields(ovsearchlink,get_data_for_page(createTopologyPage).getContainer("UpdateTopology"));
						jsClick(createTopologyPage.btn_Update_AddCircuit);
					if(Topology.contains("Generic Network")){
						createTopologyPage.ddl_update_CircuitType.selectByVisibleText("Unrouted Ethernet Bearer");
					}else{
						createTopologyPage.ddl_update_CircuitType.selectByVisibleText("Optical Bearer");
						}
					jsClick(createTopologyPage.btn_update_SearchCircuit);
						Thread.sleep(5000);
						jsClick(createTopologyPage.cbk_update_circuitsearch);
						jsClick(createTopologyPage.btn_update_AssociateCircuits);
						jsClick(createTopologyPage.btn_Update_AddDevice);
						createTopologyPage.ddl_update_DeviceType.selectByVisibleText("Calix E7");
						createTopologyPage.ddl_update_DevicesubType.selectByVisibleText("Calix E7-20");
						jsClick(createTopologyPage.btn_update_searchdevice);
						Thread.sleep(5000);
						jsClick(createTopologyPage.cbk_update_searchdevice2);
						jsClick(createTopologyPage.cbk_update_searchdevice3);
						jsClick(createTopologyPage.btn_update_Associatedevices);
						Thread.sleep(3000);
						jsClick(createTopologyPage.btn_Save);
						Thread.sleep(2000);
						System.out.println(createTopologyPage.lbl_Topology_SuccessMsg.getText());
						Thread.sleep(3000);  
					    String Topologyname1 = createTopologyPage.lbl_Name.getText();
					    System.out.println("After update Topologyname="+Topologyname1);
					    jsClick(createTopologyPage.btn_update_refresh);
					    Thread.sleep(3000);
					}else if(Topology.contains("MEN Topology")||Topology.contains("OLT Ring")||Topology.contains("PON Collector")){
						jsClick(createTopologyPage.btn_Update_AddDevice);
						createTopologyPage.ddl_update_DeviceType.selectByVisibleText("Calix E7");
						createTopologyPage.ddl_update_DevicesubType.selectByVisibleText("Calix E7-20");
						jsClick(createTopologyPage.btn_update_searchdevice);
						Thread.sleep(5000);
						jsClick(createTopologyPage.cbk_update_searchdevice2);
						jsClick(createTopologyPage.cbk_update_searchdevice3);
						jsClick(createTopologyPage.btn_update_Associatedevices);
						Thread.sleep(3000);
						jsClick(createTopologyPage.btn_Save);
						Thread.sleep(2000);
						System.out.println(createTopologyPage.lbl_Topology_SuccessMsg.getText());
						Thread.sleep(3000);  
					    String Topologyname1 = createTopologyPage.lbl_Name.getText();
					    System.out.println("After update Topologyname="+Topologyname1);
					    jsClick(createTopologyPage.btn_update_refresh);
						}
				}
				@Step
				public void Validated_Auditlogs_of_Topology() throws InterruptedException{
					searchTopologyPage. Validated_Auditlogs_of_Topology();					
				}
				/*@Step
				public void fill_TopologyData(String field) throws InterruptedException {
						fillMandatoryFields(createTopologyPage,get_data_for_page(createTopologyPage).getContainer(field));
						Thread.sleep(5000);
					}
				*/
				
			/*	@Step
				public void clickAddDevice() throws InterruptedException{
					//devcreatepage.tbx_locationClli.clear();
					createTopologyPage.clickAddDevice();
				}*/ // 10/13/2016	Need to check if the it's impacting other region
				
				
	/*			@Step
				public void validateTopologyDetail(String template){
				createTopologyPage.validateTopologyDetail(template);
				
				}*/
					
				
				//*****************************************************************************************************************//
				//*****************************************************************************************************************//
				//***																											***//	
				//***									MLTO Validation															***//	
				//***																											***//	
				//*****************************************************************************************************************//	
				//*****************************************************************************************************************//
				
				
				
				@Step
				public void Validate_attribute_createform(String type){
					
					if(type.equals("MLTO")){
						/*orderpage.createorderattributes();
					}*/
				try
					{	
						Thread.sleep(5000);
						ArrayList<String> orderAttributes = new ArrayList<String>();

						orderAttributes.add(0, "Order #*");
						orderAttributes.add(1, "Customer First Name*");
						orderAttributes.add(2, "Customer Last Name*");
						orderAttributes.add(3, "BAN");
						orderAttributes.add(4, "Customer type*");
						orderAttributes.add(5, "Customer Subtype*");
						orderAttributes.add(6, "Account Type*");	
						orderAttributes.add(7, "Service Address*");	
						orderAttributes.add(8, "Address Line 2");	
						orderAttributes.add(9, "Wire Center CLLI*");	
						orderAttributes.add(10, "Latitude*");	
						orderAttributes.add(11, "Longitude*");	
						orderAttributes.add(12, "Remarks");	
						orderAttributes.add(13, "DTN*");	
						orderAttributes.add(14, "Reason Code*");	
						orderAttributes.add(15, "Service Type*");	
						orderAttributes.add(16, "Down Speed*");	
						orderAttributes.add(17, "Up Speed*");	
						orderAttributes.add(18, "Action*");	
						orderAttributes.add(19, "Test Order*");	
						orderAttributes.add(20, "Feature Code Collection");	
						orderAttributes.add(21, "Feature Code Remark");	
						orderAttributes.add(22, "Appointment Start Date*");	
						orderAttributes.add(23, "Appointment Start Time*");	
						orderAttributes.add(24, "Appointment End Date*");	
						orderAttributes.add(25, "Appointment End Time*");	
						orderAttributes.add(26, "Requested Due Date*");	
						orderAttributes.add(27, "Remark");								
					
						List<WebElementFacade> Ordercreatelist = devcreatepage.lbl_allXapath;
						ArrayList<String> OrderatributesOfPage=new ArrayList<String>();
						//slf4jLogger.info("Step one done");
						
						for(int j=0;j<Ordercreatelist.size();j++){
							
							OrderatributesOfPage.add(j, Ordercreatelist.get(j).getText());
							
							//slf4jLogger.info("Step Two done");
							//slf4jLogger.info(atributesOfPage.get(j));
						}
						
						System.out.println(OrderatributesOfPage);
						
						if (OrderatributesOfPage.containsAll(orderAttributes)) {
							slf4jLogger.info("pass");
						} else throw new Error("fail");
							
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
				//*****************************************************************************************************************//
				//*****************************************************************************************************************//
				//***																											***//	
				//***									Sanity Validation Section												***//	
				//***									10/12/2016																***//	
				//*****************************************************************************************************************//	
				//*****************************************************************************************************************//
				
				@Step
				public void Homepagevalidation(){
					slf4jLogger.info("Second stage");
					ovhomepage.lbl_welcomeomnivue.isVisible();
				}
				
				@Step
				public void Userloginvalidation(){
					shouldExist(loginPage);
				}
				
				@Step
				public void OMNIVUE_Version_should_be_displayed_in_Login_Page() throws Throwable {
					
					//loginpage.lbl_OV_version.getText() ;
				
					loginPage.OMNIVUE_Version_should_be_displayed_in_Login_Page();				
			
				}
				
				@Step
				public void User_should_be_navigated_to_Page(String action) throws Throwable {
					actvtnpage.User_should_be_navigated_to_Page(action);
					
				}
				
				@Step
				public void Systemcheckonloginpage() throws Throwable{
					
					ArrayList<String> testAttributes = new ArrayList<String>();

					testAttributes.add(0, "OSR is up and running.");
					testAttributes.add(1, "DSP is up and running.");
					testAttributes.add(2, "MOB is up and running.");
					testAttributes.add(3, "ARM is up and running.");
					testAttributes.add(4, "ICL is up and running.");
					testAttributes.add(5, "CLC is up and running.");		
				
					if(loginPage.getDriver().getTitle().contains("404")){
						
						if(fileiotest.readFile("Tag_name").contains("GFast")){
							
								orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Getting HTTP: 404 error please check with Dev Team");
								
							}
						
						throw new Error("Getting HTTP: 404 error please check with Dev Team");
						}
					
					
					List<WebElementFacade> HomepageList = ovhomepage.lbl_systemstatus;
					ArrayList<String> HomepageListOfPage=new ArrayList<String>();
					
					
					for(int j=0;j<HomepageList.size();j++){
						
						HomepageListOfPage.add(j, HomepageList.get(j).getText());		
					
					}
					
					for(int i=0;i<HomepageList.size();i++){
						if(!testAttributes.get(i).equals(HomepageListOfPage.get(i))){
							throw new Error(HomepageListOfPage.get(i)+"Supporting system is Down please try after sometime");
						}
						slf4jLogger.info(HomepageListOfPage.get(i)+"Supporting Systems are Up & running");
					}
									
			/*		if(fileiotest.readFile("Tag_name").contains("GFast")){
						if(testAttributes.get(0).equals(HomepageListOfPage.get(0)) && testAttributes.get(1).equals(HomepageListOfPage.get(1)) && testAttributes.get(3).equals(HomepageListOfPage.get(3)) && testAttributes.get(4).equals(HomepageListOfPage.get(4))){
							slf4jLogger.info("Supporting Systems are Up & running");
						} else {
							orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Supporting systems for GFast are down, please re-try after sometime");
							throw new Error("Supporting systems for GFast are down, please re-try after sometime");
						}
					}*/
					
					/*if (HomepageListOfPage.containsAll(testAttributes)) {
						slf4jLogger.info("pass");
					} else throw new Error("fail");*/
						}
				
				@Step
				public void fill_fields_create_location(String field) throws Throwable{
					Thread.sleep(5000);
					
					//fillMandatoryFields(createlocationpage,get_data_for_page(createlocationpage).getContainer(field));
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateLocationPage",field));
					if(createlocationpage.btn_create_individuallcn_ICOsite_chkicon.isCurrentlyVisible()){
						createlocationpage.Location_action("ICOCheck");
						fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateLocationPage","Individual location data"));
					}
				}
				
				@Step
				public void enter_streetname()throws Throwable{
					Thread.sleep(5000);
					jsClick(createlocationpage.tab_createAddrswithinrange_prvstab);
					Thread.sleep(2000);
					String str1=searchlocation.lbl_addressrange_view_streetname.getText();
					
					jsClick(createlocationpage.tab_Location_Bulk_Update);
					Thread.sleep(2000);
					createlocationpage.tbx_StreetName_Old.sendKeys(str1);
				}
				
				@Step
				public void fill_fields_location_update_form(String field) throws Throwable{
					//Thread.sleep(5000);
					
					/*jsClick(createlocationpage.tab_createAddrswithinrange_prvstab);
					Thread.sleep(2000);
					String str1=searchlocation.lbl_addressrange_view_streetname.getText();
					
					jsClick(createlocationpage.tab_Location_Bulk_Update);
					Thread.sleep(2000);
					createlocationpage.tbx_StreetName_New.sendKeys(str1);*/
					
					//fillMandatoryFields(createlocationpage,get_data_for_page(createlocationpage).getContainer(field));
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateLocationPage",field));
					
				}
				
				@Step
				public void location_role_selection(String LRole,String LRoleType){
					createlocationpage.location_role_selection(LRole,LRoleType);
				}
				
				@Step
				public void fill_fields_locationsrch(String field) throws InterruptedException{
				
					//Thread.sleep(5000);
					//locationsearchpage.btn_Search);
					
					fillMandatoryFields(locationsearchpage,get_data_for_page(locationsearchpage).getContainer(field)) ;
					
				}
				
				
				@Step
				public void fill_fields_create_Circuit(String field){
					
					fillMandatoryFields(createcircuitpage,get_data_for_page(createcircuitpage).getContainer(field));
				}
				
				@Step
				public void fill_fields_create_Device(String field){
					
					fillMandatoryFields(devcreatepage,get_data_for_page(devcreatepage).getContainer(field));
				}
				
				@Step
				public void jsClick(WebElement element) {
					try {
						
						JavascriptExecutor executor = (JavascriptExecutor) getDriver();
						executor.executeScript("arguments[0].click();", element);
					} catch (Exception e) {
						System.out.println("unable to click by java script");
						element.click();

					}

				}
				
				@Step
				public WebElement waitForElement(WebElement elementToBeLoaded) {
				    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),3000);				   
				    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
					
				    return element;
				}	
				
				@Step
				public void validate_taskresult(String taskcheck) {
					try {
						Thread.sleep(3000);
					
					switch(taskcheck){
					
					case "DSP Task":if(taskpage.btn_DSPview_task.isCurrentlyVisible() && taskpage.btn_DSPedit_task.isCurrentlyVisible()){
											slf4jLogger.info("View & Edit Autoform Task are seen");
										} else throw new Error("fail");break;
										
					case "Fallout Task":if(taskpage.btn_view_task.isDisplayed() && taskpage.btn_edit_task.isDisplayed()){
											slf4jLogger.info("View & Edit Autoform Task are seen");
										} else throw new Error("fail");break;
					}
					/*if(taskcheck.equals("DSP Task")){
						if(taskpage.btn_DSPview_task.isCurrentlyVisible() && taskpage.btn_DSPedit_task.isCurrentlyVisible()){
							slf4jLogger.info("View & Edit Autoform Task are seen");
						} else throw new Error("fail");
						
					} else if(taskcheck.equals("Fallout Task")){
						if(taskpage.btn_view_task.isDisplayed() && taskpage.btn_edit_task.isDisplayed()){
							slf4jLogger.info("View & Edit Autoform Task are seen");
						} else throw new Error("fail");
						
					} */
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				@Step
				public void click_viewtask(String taskselect) throws Throwable{
					switch(taskselect) {
					case "View DSP Task": waitForElement(taskpage.ViewDSPtaskclick()); break;
					case "View Fallout Task": waitForElement(taskpage.fallouttaskclick()); break;
					case "Edit DSP Task": waitForElement(taskpage.EditDSPtaskclick()); break;
					case "View completed DSP Task": waitForElement(taskpage.ViewcompletedDSPtaskclick()); break;
					case "Audit Logs Tab": waitForElement(taskpage.Auditlogstabclick()); break;
					case "Get logs in Audit logs with From Archive checkbox selected": taskpage.Auditlogs_witharchive_validation();break;
					}
					/*
					if(taskselect.equals("View DSP Task")){
						waitForElement(taskpage.ViewDSPtaskclick());
					} else if(taskselect.equals("View Fallout Task")){
						waitForElement(taskpage.fallouttaskclick());
					} else if(taskselect.equals("Edit DSP Task")){
						waitForElement(taskpage.EditDSPtaskclick());
					} else if(taskselect.equals("View completed DSP Task")){
						waitForElement(taskpage.ViewcompletedDSPtaskclick());
					}*/
					
					//slf4jLogger.info("Clicked on the View Task");
					
				}
				@Step
				public void I_Identify_Task(String taskselect){
					if(taskselect.equals("View DSP Task & clicked on Arrow button")){
						taskpage.ViewDSPtask();
					}
				}
				@Step
				public void Taskviewpage(String viewtask){
					taskpage.taskviewvalidation(viewtask);
					slf4jLogger.info("Done with View Validations");
				}
				
				@Step
				public void validateapisectiontask(String viewtask) {
					
					taskpage.APIsectionvalidation(viewtask);
				}
				
				@Step
				public void select_network_tab_values(String type1,String type2){
					if(type1.equals("Alt Equipment Build Type")){
						actvtnpage.ddl_EquipmentBuildType.selectByValue(type2);
					}
				}
				
				@Step
				public void selectbuildtype(String type){
					actvtnpage.ddl_EquipmentBuildType.selectByValue(type);
					actvtnpage.btn_Netwrkbuildcreate("NB");
					waitForElement(orderpage.btn_device1);					
				}
				
				@Step
				public void Search_selectsearchtype(String type) throws InterruptedException{
					actvtnpage.ddl_searchType.selectByValue(type);
					Thread.sleep(2000);
				}
				
				@Step
				public void select_Networktype(String type) throws InterruptedException{
					actvtnpage.ddl_networkType.selectByVisibleText(type);
					Thread.sleep(2000);
				}
				
				@Step
				public void select_devicerole_fiberbuild(String role) throws InterruptedException{
					actvtnpage.select_devicerole_fiberbuild(role);
				}
				
				@Step
				public void select_create_number_technologytype(String type) throws InterruptedException{
					if(type.equals("GPON")){
						jsClick(actvtnpage.rbn_gpon_numbercreate);
					} else jsClick(actvtnpage.rbn_ethernet_numbercreate);
					
					Thread.sleep(2000);
				}
				
				@Step
				public void fillfields_altequit() throws InterruptedException{
					orderpage.altequitfill();
				}
				
				@Step
				public void add_existing_device_Alt_equit() throws InterruptedException{
					jsClick(devcreatepage.tab2);
					Thread.sleep(2000);
					String device1= searchdevicepage.lbl_deviceName.getText().trim();
					String deviceclli1= searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_clli.getText();
					Thread.sleep(1000);
					jsClick(devcreatepage.tab3);
					Thread.sleep(1000);
					String device2=searchdevicepage.lbl_deviceName.getText().trim();
					String deviceclli2= searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_clli.getText();
					Thread.sleep(1000);
					jsClick(devcreatepage.tab4);
					Thread.sleep(1000);
					slf4jLogger.info("Device1 name="+device1+"Device2 name="+device2);
					slf4jLogger.info("Device1 name="+deviceclli1+"Device2 name="+deviceclli2);

					//NID Device Add
					jsClick(orderpage.btn_device1);
					waitForElement(orderpage.btn_validatedevice);
					add_existing_device_alt_equip(device1,"KLKNMNAB",deviceclli1);
					
					//NPE Device Add
					jsClick(orderpage.btn_device2);
					waitForElement(orderpage.btn_validatedevice);
					add_existing_device_alt_equip(device2,"SHLYIDAN",deviceclli2);
				}
				
				@Step
				public void add_existing_device_alt_equip(String device1,String buildclli,String deviceclli) throws InterruptedException{
					/*orderpage.btn_device_state_existing);
					Thread.sleep(2000);
					orderpage.btn_existing_device_lookup_altequipmt);
					Thread.sleep(5000);
					orderpage.tbx_altequip_devicelookup_buildingclli.sendKeys(buildclli);
					orderpage.tbx_altequip_devicelookup_deviceclli.sendKeys(deviceclli);
					//orderpage.tbx_altequip_devicelookup_streetname.sendKeys(streetname);
					orderpage.btn_altequip_devicelookup);
					Thread.sleep(5000);
					
				orderpage.btn_altequip_devicelookup_previous);
					
					craetenetwrkbuild.btn_altequitbuild_dropdown);
					Thread.sleep(2000);
					craetenetwrkbuild.lbl_altequitbuild_dropdownvalue);
					
					Thread.sleep(3000);
					
					loginPage.getDriver().findElement(By.linkText(device1)));
					
					Thread.sleep(5000);
					
					orderpage.cbk_altequip_devicerole);*/
					
					jsClick(orderpage.btn_device_state_existing);
					Thread.sleep(2000);
					jsClick(orderpage.btn_existing_device_lookup_altequipmt);
					//Thread.sleep(3000);
					waitForElement(orderpage.btn_altequip_devicelookup);
					orderpage.tbx_altequip_devicelookup_buildingclli.sendKeys(buildclli);
					orderpage.tbx_altequip_devicelookup_deviceclli.sendKeys(deviceclli);
					//orderpage.tbx_altequip_devicelookup_streetname.sendKeys(streetname);
					jsClick(orderpage.btn_altequip_devicelookup);
					//Thread.sleep(8000);
					waitForElement(orderpage.lbl_altequip_devicesearchresult);
					
					jsClick(orderpage.btn_altequip_devicelookup_previous);
				Thread.sleep(2000);
				System.out.println(orderpage.btn_downarrow_devicescroll.isPresent());
				System.out.println(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible());
				//slf4jLogger.info(orderpage.btn_downarrow_devicescroll.isDisplayed());
			// slf4jLogger.info("................."+orderpage.btn_downarrow_devicescroll.shouldBeCurrentlyVisible());
				if(orderpage.btn_downarrow_devicescroll.isCurrentlyVisible()){
					//Thread.sleep(500);
					jsClick(orderpage.btn_downarrow_devicescroll);
					Thread.sleep(1000);
					jsClick(orderpage.btn_downarrow_devicescroll);
					Thread.sleep(500);
					jsClick(loginPage.getDriver().findElement(By.linkText(device1)));
					Thread.sleep(5000);
				}else{
					Thread.sleep(1000);
					jsClick(loginPage.getDriver().findElement(By.linkText(device1)));
					Thread.sleep(5000);
				}
				
				
					
					/*craetenetwrkbuild.btn_altequitbuild_dropdown);
					Thread.sleep(2000);
					craetenetwrkbuild.lbl_altequitbuild_dropdownvalue);*/				
				       //loginPage.waitForRenderedElementsToBePresent(By.linkText(device1));
				      // loginPage.waitFor(device1);			
					
					//Thread.sleep(3000);
					
				jsClick(orderpage.cbk_altequip_devicerole);
					Thread.sleep(2000);
				}
				
				@SuppressWarnings("unused")
				@Step
				public void add_device_Alt_equit() throws InterruptedException{
					
					//Device 1
					jsClick(orderpage.btn_device1);
					waitForElement(orderpage.btn_validatedevice);
					jsClick(orderpage.btn_device_state_new);
					jsClick(devcreatepage.rdbtn_Shared);
					
					jsClick(orderpage.btn_device1_equprole_NID);
					Thread.sleep(2000);
					System.out.println("selected NID");
					jsClick(actvtnpage.ddl_altequip_devicetype);
					Thread.sleep(1000);
					
					
					jsClick(orderpage.btn_device_Subscribersearch);					
					waitForElement(orderpage.btn_device_Subscriberlckup);
					fill_fields_from("OVOrderPage","MLTO Create form","Subscriberdata");
					jsClick(orderpage.btn_device_Subscriberlckup);
					waitForElement(orderpage.lbl_device_Subscriberid);
					jsClick(orderpage.lbl_device_Subscriberid);
					Thread.sleep(3000);
					
					jsClick(orderpage.btn_device_locn_lookup);
					
					//String parentwin=devcreatepage.window_switch();
					//Thread.sleep(2000);
					waitForElement(devcreatepage.btn_altequpbuild_locnlookUp);
					
					
					fill_fields_from("OVOrderPage","MLTO Create form","Equip order address");
					//fill_fields_from("OVOrderPage","MLTO Create form","Alt Equit address1");						
					jsClick(devcreatepage.btn_altequpbuild_locnlookUp);//Rework
					
					String parentwin=devcreatepage.window_switch();
					
					
				
					
					waitForElement(orderpage.lnk_addlcn);
					Thread.sleep(3000);
					//devcreatepage.switch_win(parentwin); 
					jsClick(orderpage.lnk_addlcn);
					
					//devcreatepage.switch_win(parentwin);
					
					//gdbcreatepage.rbt_NB_sharedFlag);
					
					fill_fields_from("OVOrderPage","MLTO Create form","NID Device Fields");
					if(orderpage.ddl_affowner.isEnabled()){
						orderpage.ddl_affowner.selectByValue("LOCAL");
					}
					//Thread.sleep(3000);
					//orderpage.btn_validatedevice);
					
					Thread.sleep(3000);
					jsClick(orderpage.btn_validatedevice);
					Thread.sleep(3000);
					//Device 2
					
					jsClick(orderpage.btn_device2);
					waitForElement(orderpage.btn_validatedevice);
					jsClick(orderpage.btn_device_state_new);
					jsClick(devcreatepage.rdbtn_Shared);
					
					jsClick(orderpage.btn_device1_equprole_NPE);
					
					jsClick(orderpage.btn_device_Subscribersearch);					
					waitForElement(orderpage.btn_device_Subscriberlckup);
					fill_fields_from("OVOrderPage","MLTO Create form","Subscriberdata");
					jsClick(orderpage.btn_device_Subscriberlckup);
					waitForElement(orderpage.lbl_device_Subscriberid);
					jsClick(orderpage.lbl_device_Subscriberid);
					Thread.sleep(3000);
					
					jsClick(orderpage.btn_device_locn_lookup);
					//String parentwin=devcreatepage.window_switch();
					//Thread.sleep(2000);
					waitForElement(devcreatepage.btn_altequpbuild_locnlookUp);
					fill_fields_from("OVOrderPage","MLTO Create form","Equip order address");
					//fill_fields_from("OVOrderPage","MLTO Create form","Alt Equit address2");						
					jsClick(devcreatepage.btn_altequpbuild_locnlookUp);//Rework
					Thread.sleep(10000);
					waitForElement(orderpage.btn_previous_locnsearch);
					//devcreatepage.switch_win(parentwin); 
					devcreatepage.window_switch();
					waitForElement(devcreatepage.lnk_addlcn);
					jsClick(orderpage.lnk_addlcn);
					
					//gdbcreatepage.rbt_NB_sharedFlag);
					jsClick(actvtnpage.ddl_altequip_devicetype);
					Thread.sleep(1000);
					
					fill_fields_from("OVOrderPage","MLTO Create form","NPE Device Fields");
					if(orderpage.ddl_affowner.isEnabled()){
						orderpage.ddl_affowner.selectByValue("LOCAL");
					}
					//Thread.sleep(3000);
					//orderpage.btn_validatedevice);
					
					Thread.sleep(3000);
					jsClick(orderpage.btn_validatedevice);
					slf4jLogger.info("Clicked on Validate Device");
					Thread.sleep(3000);
					
					//##########		Checking if the 
					jsClick(orderpage.btn_device1);
					waitForElement(orderpage.btn_validatedevice);
					Thread.sleep(3000);
					orderpage.ddl_affowner.selectByValue("LOCAL");
					jsClick(orderpage.btn_validatedevice);	slf4jLogger.info("Clicked on Validate Device");
					Thread.sleep(3000);
					
				}
				
				/*@Step
				public void subscriber_add(String subscriber, String subsctype) throws InterruptedException{
					servicecreatepage.btn_subscriberlookupicon);
					servicecreatepage.tbx_subcriber_name_window.sendKeys(subscriber);
					servicecreatepage.ddl_subcriber_type.selectByVisibleText(subsctype);
					devcreatepage.btn_lookup_window);
					Thread.sleep(3000);
					if(!servicecreatepage.lnk_subcribername.isPresent()){
						devcreatepage.btn_lookup_window);
						
					}
					waitForElement(servicecreatepage.lnk_subcribername);
					
					servicecreatepage.lnk_subcribername);
				}*/
				
				@Step
				public void location_add(String page,String container,String subcontainer) throws InterruptedException{
				
					if(devcreatepage.btn_locationLookup_newdevicecreateform.isCurrentlyVisible()){
						jsClick(devcreatepage.btn_locationLookup_newdevicecreateform);
					} else  
					
					if(devcreatepage.btn_locationLookup.isCurrentlyVisible()){
						jsClick(devcreatepage.btn_locationLookup);
					}
				
				String parentwin=devcreatepage.window_switch();
				
				fill_fields_from(page,container,subcontainer);
				
				if(devcreatepage.btn_lookUp_newdevicecreateform.isCurrentlyVisible()){
					jsClick(devcreatepage.btn_lookUp_newdevicecreateform);
				} else 
					if(devcreatepage.btn_lookUp.isCurrentlyVisible()){
						jsClick(devcreatepage.btn_lookUp);//Rework
					}
				
				Thread.sleep(3000);
				devcreatepage.switch_win(parentwin);
				
				}
				
				@Step
				public void create_NID_NPE(String device) throws InterruptedException{
					
					switch(device){
					case "NID & NPE": //NID Device
											if(!actvtnpage.ddl_role.isCurrentlyVisible()){
												actvtnpage.click_actscreentab("Create");
												 selectFormType("Inventory","Device");
												 actvtnpage.click_Technologytype("Role");
											}
											actvtnpage.ddl_role.selectByVisibleText("NID");
											Thread.sleep(2000);
											
											device_select("Alcatel-Lucent 7750 Service Router","Alcatel-Lucent 7750 SR-c12");
											waitForElement(devcreatepage.btn_Create);
											/*
											//subscriber_add("TEST - JANET", "EXTERNAL");
											Thread.sleep(2000);
											location_add("OVOrderPage","MLTO Create form","Alt Equit address1");
											//Thread.sleep(2000);
											fill_fields_from("OVOrderPage","MLTO Create form","NID Inventory Device Fields");
											devcreatepage.rdbtn_Shared);
											//Thread.sleep(3000);
											devcreatepage.form_field();
											
											waitForElement(devcreatepage.tab2);
											if(!devcreatepage.tab2.isPresent()){
												devcreatepage.form_field();
												Thread.sleep(5000);
											}*/
											
											try {
												technology_select_based_devicerole("NID");
												fillmandatoryfield_device("TC174932-NID");
												devcreatepage.action_createscreen("Create");
											} catch (Throwable e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
											waitForElement(devcreatepage.btn_Edit);
											
											Thread.sleep(6000);
											
											//NPE Device
											jsClick(devcreatepage.tab_createdevice);
											Thread.sleep(2000);
											jsClick(devcreatepage.ddl_Equipment_role.selectByVisibleText("NPE"));
										/*//devcreatepage.createtab);
											Thread.sleep(2000);
										//devcreatepage.ddl_Equipment_role.selectByVisibleText("NPE"));
											
									//		devcreatepage.ddl_device_type_createform.selectByValue(value)*/
									
											/*actvtnpage.click_actscreentab("Create");
											actvtnpage.ddl_role.selectByVisibleText("NPE");
											Thread.sleep(2000);
											device_select("Juniper MX960","Juniper MX960");*/
											//waitForElement(devcreatepage.btn_Create);
											devcreatepage.ddl_device_type_createform.selectByVisibleText("Juniper MX960");
											Thread.sleep(2000);
											devcreatepage.ddl_device_subtype_createform.selectByVisibleText("Juniper MX960");
											Thread.sleep(1000);
											
											//subscriber_add("TEST - JANET", "EXTERNAL");
											Thread.sleep(2000);
											/*location_add("OVOrderPage","MLTO Create form","Alt Equit address2");
											//Thread.sleep(2000);
											
											fill_fields_from("OVOrderPage","MLTO Create form","NPE Inventory Device Fields");
											devcreatepage.rdbtn_Shared);
											//Thread.sleep(3000);
											devcreatepage.form_field();
											
											waitForElement(devcreatepage.tab3);
											//waitForElement(devcreatepage.btn_Edit);
											if(!devcreatepage.tab3.isPresent()){
												devcreatepage.form_field();
												Thread.sleep(5000);
											}
											Thread.sleep(5000);*/
											try {
												technology_select_based_devicerole("NPE");
												fillmandatoryfield_device("TC174934-NPE");
												devcreatepage.action_createscreen("Create");
											} catch (Throwable e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
											//waitForElement(devcreatepage.btn_Edit);
											if(!createcircuitpage.tab_Circuit_createform_Ethernetbearer.isCurrentlyVisible()){
												actvtnpage.click_actscreentab("Create");
											}
											 break;
											
					
					}
					
										
				}
				
				@Step
				 public void createtab_inventory_circuittypeselect(String circuittype) throws Throwable {
						actvtnpage.createtab_createInventory_typeselect("Circuit", circuittype);		
					}
				
				@Step
				public void inventory_advancecircuittypeselect(String circuittype) throws Throwable {
					actvtnpage.inventory_advancecircuittypeselect(circuittype);			
				}

				
				@Step
				public void validatetaskactions(String viewtask){
					taskpage.taskactionbuttonvalidation(viewtask);
				}
				
				
				//**********************************************************************************************************************************//
				//														Installation Sanity Steps													//
				//**********************************************************************************************************************************//
				
				
				
				@Step
				public void search_tab_searchtype(String searchtype) throws Throwable{
				/*	if(actvtnpage.ddl_searchType.isCurrentlyVisible()){
						
						  actvtnpage.ddl_searchType.selectByVisibleText(searchtype));
						  
						if( getDriver() instanceof FirefoxDriver) {
						    System.out.println("Firefox it is!!");
						    actvtnpage.ddl_searchType.selectByVisibleText(searchtype));
						  }
						  else if( getDriver() instanceof ChromeDriver) {
						    System.out.println("Chrome it is!!");
						    setSendingAvailabilityAs(actvtnpage.ddl_searchType,searchtype);
						  }
					
					}*/
					actvtnpage.searchvalidation(searchtype);
			
					
				}
				public void search_tab_searchbutton_task(String searchtype) throws Throwable{
					
					Thread.sleep(5000);
					actvtnpage.searchvalidation(searchtype);
					Thread.sleep(10000);
			
					
				}
				
				public void i_click_Abort_or_Proceed_button_task(String buttontype) throws Throwable{
				taskpage.click_btn( buttontype);
				}
				
				public void i_verify_workgroup_is_added_to_task() throws Throwable{
					taskpage.i_verify_workgroup_is_added_to_task();
				}
				
				
				
				public void setSendingAvailabilityAs(WebElement ele, String value) {
				    Select select = new Select(ele);
				    select.selectByValue(value);
				   
				}
				
				@Step
				public void  search_tab_inventorytype(String invtype)throws Throwable{
					
					actvtnpage.searchvalidation(invtype);
					/*
					actvtnpage.ddl_invntryType.selectByVisibleText(invtype);
					Thread.sleep(1000);*/
				}
				
				@Step
				public void Geartab_validation(String geartype) throws Throwable {
					actvtnpage.searchvalidation(geartype);
				//	actvtnpage.Geartab_validation(geartype);
				}
				
				@Step
				public void search_tab_inventory_circuit(String cirtype) throws Throwable{
					actvtnpage.searchvalidation(cirtype);
					/*actvtnpage.ddl_circuittype.selectByVisibleText(cirtype);
					Thread.sleep(2000);*/
					
					
				}
				
				
				@Step
				public void search_tab_inventory_contact(String contype) throws Throwable{
					actvtnpage.searchvalidation(contype);
				
					/*actvtnpage.ddl_search_contacttype.selectByVisibleText(contype);
					Thread.sleep(2000);*/
				}
				
				
				@Step
				public void search_tab_inventory_device(String devtype) throws Throwable{
					actvtnpage.searchvalidation(devtype);
				/*
					actvtnpage.ddl_deviceType.selectByVisibleText(devtype);
					Thread.sleep(2000);
				*/}
				
				@Step
				public void search_tab_inventory_deviceselect(String devtype) throws Throwable{
					
					actvtnpage.ddl_deviceType.selectByVisibleText(devtype);
					Thread.sleep(2000);
				}
				
				@Step
				public void search_tab_inventory_Link(String Linktype) throws Throwable{
					actvtnpage.searchvalidation(Linktype);
					/*
					actvtnpage.ddl_Link_type.selectByVisibleText(Linktype);
					Thread.sleep(2000);*/
				}
				
				@Step
				public void search_tab_inventory_Number(String nmbertype) throws Throwable{
					actvtnpage.searchvalidation(nmbertype);
				
					/*actvtnpage.ddl_search_numbertype.selectByVisibleText(nmbertype);
					Thread.sleep(2000);*/
				}
				
				@Step
				public void search_tab_inventory_Reservation(String Reservationtype) throws Throwable{
					actvtnpage.searchvalidation(Reservationtype);
				/*actvtnpage.ddl_search_reservationtype.selectByVisibleText(Reservationtype);
					Thread.sleep(2000);*/
				}
				
				@Step
				public void search_tab_inventory_Service(String Servicetype) throws Throwable{
					actvtnpage.searchvalidation(Servicetype);
					/*actvtnpage.ddl_search_serviceType.selectByVisibleText(Servicetype);
					Thread.sleep(1000);*/
				}
				
				public void i_inventory_Service_searchslider(String Servicetype) throws Throwable {
					actvtnpage.ddl_search_serviceType.selectByVisibleText(Servicetype);
					Thread.sleep(1000);
			 	}
				
				@Step
				public void search_tab_inventory_Topology(String Topologytype) throws Throwable{
					actvtnpage.searchvalidation(Topologytype);
					
					/*actvtnpage.ddl_search_topologyType.selectByVisibleText(Topologytype);
					Thread.sleep(1000);*/
				}
				
				// Need to check is this needed---22/12/16
				@Step
				public void search_tab_Network_type(String Networktype) throws Throwable{
					actvtnpage.searchvalidation(Networktype);
					/*
					actvtnpage.ddl_networkType.selectByVisibleText(Networktype);
					Thread.sleep(1000);*/
				}
				
				@Step
				public void	search_tab_Network_FiberBuild(String FiberBuildtype) throws Throwable{
					actvtnpage.searchvalidation(FiberBuildtype);
					/*FDH, FDP, MDU, MST, OLT, ONT, Splitter
					actvtnpage.ddl_searchtab_networkbuild_fiberbuild_devicerole.selectByVisibleText(FiberBuildtype);
					Thread.sleep(1000);*/
				}
				
				@Step
				public void search_tab_Network_TransportPathtype(String TransportPathtype) throws Throwable{
					actvtnpage.searchvalidation(TransportPathtype);
					/*BRAS, DSLAM, NID
					actvtnpage.ddl_searchtab_networkbuild_transportpath_devicerole.selectByVisibleText(TransportPathtype);
					Thread.sleep(500);*/
				}
				
				@Step
				public void i_search_tab_ordertype_validation(String ordertype) throws Throwable {
					actvtnpage.searchvalidation(ordertype);
					
			 		
			 	}
				
				@Step
				public void search_tab_ordertype_validation(String producttype,String ordertype) throws Throwable{
					actvtnpage.ddl_searchtab_order_producttype.selectByVisibleText(producttype);
					Thread.sleep(500);
					actvtnpage.ddl_searchtab_order_ordertype.selectByVisibleText(ordertype);
					Thread.sleep(500);
				}
				
				@Step
				public void search_tab_orders_producttype_select(String producttype) throws Throwable{
					if(actvtnpage.ddl_searchtab_order_producttype.isCurrentlyVisible()){
						
					actvtnpage.ddl_searchtab_order_producttype.selectByVisibleText(producttype).click();
					Thread.sleep(1000);
					//waitForElement(actvtnpage.ddl_searchtab_order_ordertype);
					}
				}
				
				@Step
				public void search_tab_GPONorders_ordertype_select(String ordertype) throws Throwable{
					if(actvtnpage.ddl_searchtab_order_ordertype.isCurrentlyVisible()){
						actvtnpage.ddl_searchtab_order_ordertype.selectByVisibleText(ordertype);
						waitForElement(actvtnpage.tbx_ensembleOrderNumber);
					}
					
				}
				@Step
				public void search_tab_SLCtype(String SLCtype) throws Throwable{
					actvtnpage.searchvalidation(SLCtype);
					/*Bandwidth Upgrade Check, Service Level Check
					actvtnpage.ddl_searchtab_SLC_checktype.selectByVisibleText(SLCtype);
					Thread.sleep(500);*/
				}
				
				//Create Tab Installation Sanity validations
				
				public void createtab_createInventory_typ(String invtype) throws Throwable{
					actvtnpage.createtab_createInventory_typ(invtype);
				}
				@Step
				public void createtab_validation(String createtype) throws Throwable{
					actvtnpage.verify_validation(createtype);
					/*if(actvtnpage.ddl_createType.isCurrentlyVisible()){
						actvtnpage.ddl_createType.selectByVisibleText(createtype));
						Thread.sleep(1000);
					}*/
				}
				
				@Step
				public void createtab_buc_accesstype(String accesstype) throws Throwable{
					actvtnpage.ddl_createtab_BUC_accesstype.selectByVisibleText(accesstype);
					//Thread.sleep(500);
				
					
				}
				
				@Step
				public void createtab_inventorytype(String invtype) throws Throwable{
					/*if(actvtnpage.ddl_CreateinvntryType.isCurrentlyVisible()){
						actvtnpage.ddl_CreateinvntryType.selectByVisibleText(invtype);
					}*/
					actvtnpage.verify_validation(invtype);
					//Thread.sleep(500);
				}
				
				@Step
				public void createtab_inventory_circuittype(String circuittype) throws Throwable{
					/*if(actvtnpage.ddl_CreateTab_invntry_circuitType.isCurrentlyVisible()){
						actvtnpage.ddl_CreateTab_invntry_circuitType.selectByVisibleText(circuittype);
					}*/
					actvtnpage.verify_validation(circuittype);
										
				}
				
				@Step
				public void createtab_inventory_filterbytype(String filterbytype) throws Throwable{
					actvtnpage.verify_validation(filterbytype);
					//Thread.sleep(500);
				}
				
				@Step
				public void createtab_inventory_Roletype(String Roletype) throws Throwable{
				/*	if(actvtnpage.ddl_role.isCurrentlyVisible()){
						actvtnpage.ddl_role.selectByVisibleText(Roletype);
					}*/
					actvtnpage.verify_validation(Roletype);
					
									
				}
				
				@Step
				public void createtab_inventory_Technologytype(String Technologytype) throws Throwable{
					actvtnpage.verify_validation(Technologytype);
					//actvtnpage.selecttech(Technologytype);
					//Thread.sleep(500);
				}				
				
				@Step
				public void createtab_inventory_devicetype(String devicetype) throws Throwable{
					actvtnpage.verify_validation(devicetype);
					/*if(actvtnpage.ddl_Inventory_devType.isCurrentlyVisible()){
						actvtnpage.ddl_Inventory_devType.selectByVisibleText(devicetype);
					}	*/				
				}
				@Step
				public void devicetype_in_device_search_slider(String type) throws InterruptedException{
					searchdevicepage.devicetype_in_device_search_slider(type);
				}
				
				@Step
				public void i_selectlinktypeas_createslider(String arg1) throws Throwable {
					if(actvtnpage.ddl_Createtab_Inventory_LinkType.isCurrentlyVisible()){
						actvtnpage.ddl_Createtab_Inventory_LinkType.selectByVisibleText(arg1);
					}
				}
				
				@Step
				public void createtab_inventory_Linktype(String Linktype) throws Throwable{
					actvtnpage.createtab_inventory_Linktype(Linktype);
				//	actvtnpage.verify_validation(Linktype);
					/*if(actvtnpage.ddl_Createtab_Inventory_LinkType.isCurrentlyVisible()){
						actvtnpage.ddl_Createtab_Inventory_LinkType.selectByVisibleText(Linktype);
					}	*/				
				}
				
				@Step
				public void i_enterlinkname_as(String Lname) throws Throwable {
					actvtnpage.i_enterlinkname_as(Lname);
				}
				
				@Step
				public void createtab_inventory_Locationtype(String Locationtype) throws Throwable{
					actvtnpage.verify_validation(Locationtype);
					/*if(actvtnpage.ddl_Createtab_Inventory_LocationType.isCurrentlyVisible()){
						actvtnpage.ddl_Createtab_Inventory_LocationType.selectByVisibleText(Locationtype);
					}
					*/
					
				}
				
				@Step
				public void createtab_inventory_Location_Type_selectas(String Locationtype) throws Throwable {
					if(actvtnpage.ddl_Createtab_Inventory_LocationType.isCurrentlyVisible()){
						actvtnpage.ddl_Createtab_Inventory_LocationType.selectByVisibleText(Locationtype);
					}
				}
				
				@Step
				public void Advancesearch_locationtypesearch(String Ltype) throws Throwable{
				
					switch(Ltype){
					case "Address Range": jsClick(searchlocation.rbd_location_advancesearch_AddressRange); Thread.sleep(3000);
											searchlocation.ddl_advancesearch_Addressrange_state.selectByVisibleText("FL-Florida");
											
											break;
					case "Individual Location": jsClick(searchlocation.rbd_location_advancesearch_Individuallocation); Thread.sleep(3000);
												searchlocation.ddl_advancesearch_individuallocation_state.selectByVisibleText("CO-Colorado");
												
												break;
					case "Address Range-Street_name": jsClick(searchlocation.rbd_location_advancesearch_AddressRange); Thread.sleep(3000);
					//searchlocation.ddl_advancesearch_individuallocation_state.selectByVisibleText("CO-Colorado");
					 String Street_name =Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC287821 data").getFieldValue("tbx_StreetName_New") ;
					 searchlocation.ddl_advancesearch_Addressrange_street_name.sendKeys(Street_name);
					 
					
					break;
					}
					//slf4jLogger.info("Done with selecting:"+Ltype);
				}
				
				@Step
				public void createtab_inventory_Porttype(String Porttype) throws Throwable{
					actvtnpage.verify_validation(Porttype);
					/*if(actvtnpage.ddl_Createtab_Inventory_PortType.isCurrentlyVisible()){
						actvtnpage.ddl_Createtab_Inventory_PortType.selectByVisibleText(Porttype);
					}	*/				
				}
				
				@Step
				 public void createtab_inventory_Number_type(String Porttype) throws Throwable {
					actvtnpage.createtab_inventory_number_typeselect(Porttype);
				 }
				
				@Step
				public void createtab_inventory_Number_numtype(String numtype) throws Throwable{
					actvtnpage.verify_validation(numtype);
					//Thread.sleep(500);
				}
			
				@Step
				public void createtab_inventory_Number_Servicetype(String Servicetype)  throws Throwable{
					actvtnpage.verify_validation(Servicetype);
				/*	if(actvtnpage.ddl_createServicetype.isCurrentlyVisible()){
						actvtnpage.ddl_createServicetype.selectByVisibleText(Servicetype);
					}*/
					
					
				}				
				
				

				@Step
				public void createtab_inventory_Topologytype(String Topologytype) throws Throwable{
					
					//Sairam Changes 8/13/18
					actvtnpage.ddl_topologyTypeForSearch.selectByVisibleText(Topologytype);
					//actvtnpage.verify_validation(Topologytype);
					
				}
				
				@Step
				public void select_state_4_topologycreateform(String TopologyState) throws Throwable{
					actvtnpage.ddl_createState.selectByVisibleText(TopologyState);
				}
				
				@Step
				public void createtab_networktype(String networktype) throws Throwable{
					actvtnpage.verify_validation(networktype);
					/*if(actvtnpage.ddl_CreateNetworkType.isCurrentlyVisible()){
						actvtnpage.ddl_CreateNetworkType.selectByVisibleText(networktype);
					}	*/			
				}
				
				@Step
				public void createtab_network_Transport_devicerole(String devicerole) throws Throwable{
					
					actvtnpage.verify_validation(devicerole);
					/*if(actvtnpage.ddl_devRole.isCurrentlyVisible()){
						actvtnpage.ddl_devRole.selectByVisibleText(devicerole);
						
					}*/
					
				}
				

				@Step
				public void selectbuildtypecheck(String type) throws Throwable{
					actvtnpage.verify_validation(type);
					/*if(actvtnpage.ddl_EquipmentBuildType.isCurrentlyVisible()){
						actvtnpage.ddl_EquipmentBuildType.selectByValue(type);
					}*/
					
					
				}
				
				
				//************************************************** End of Installation Sanity**************************************************************//
				
				
				
				//********************************************************************************************************************************************//
				//													Search Network Tab																		  //
				//********************************************************************************************************************************************//
				
				@Step
				public void select_GDB_Build(String build) throws Throwable{
					actvtnpage.tbx_Searchtab_networkbuild_buildid.sendKeys(build);
					
				}
				
				@Step
				public void GDB_searchselect_criteria(String criteria) throws Throwable{
					gdbcreatepage.GDB_searchselect_criteria(criteria);
					
				}
				
				
				
				/*@Step
				public void select_buildid_result(String build) throws Throwable{
					actvtnpage.tbx_buildid_Searchtab.sendKeys(build);cvaz
					
				}*/
				
				
				//************************************************** End of Search Network Tab	**************************************************************//
				
				
				//********************************************************************************************************************************************//
				//													Create Bulk location -- PUN Form section												  //
				//********************************************************************************************************************************************//
				
				@Step
				public void bulkcreate_Punpath(String punform_path) throws AWTException{
					createlocationpage.punpath_selection(punform_path);
				}
				
				
				@Step
				public void bulkcreate_punactions(String pun_action) throws InterruptedException{
					createlocationpage.punctions(pun_action);
				}
				
				
				//************************************************** End of Bulk create	**************************************************************//
				
				//********************************************************************************************************************************************//
				//													GDB related declarations - 20/2/17												  //
				//********************************************************************************************************************************************//
				
				@Step
				public void GDB_component_action(String action) throws Throwable{
					gdbcreatepage.GDB_component_action(action);
				}
				
				@Step
				public void fill_GDB_mandatoryfields(String gpondevice)throws Throwable{
					WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
					
					while(gdbcreatepage.btn_gpon_expand.isPresent()){
						jsClick(gdbcreatepage.btn_gpon_expand);
						Thread.sleep(5000);
						}
					Thread.sleep(5000);
					
					if(!gdbcreatepage.btn_NB_Deleteicons.isEnabled()){
						slf4jLogger.info("Delete button is Disabled");
					}else throw new Error("Delete button is Enable before creation ");
					
					fill_fields_from("OVCreateGDBPage","GDB-Device create",gpondevice);
					
					jsClick(gdbcreatepage.rbt_NB_sharedFlag);
					
					
					/*jsClick(gdbcreatepage.btn_NB_Topologylookup);
					fill_fields_from("OVCreateGDBPage","GDB-Device create","Topologydata");
					devcreatepage.topology_fill();	*/
					
					gdbcreatepage.tbx_NB_Topologyfield.type(get_container_from_xml("OVCreateGDBPage","GDB-Device create","Topologydata").getFieldValue("tbx_Topologyname").toString());
					
					jsClick(gdbcreatepage.btn_NB_Location_view);
					String parentwin=devcreatepage.window_switch();
					fill_fields_from("OVCreateGDBPage","GDB-Device create","Locationdata");
					jsClick(gdbcreatepage.btn_GDB_SA_Locationlookup);//Rework
					Thread.sleep(5000);
					devcreatepage.switch_win(parentwin); 
					
					fill_fields_from("OVCreateGDBPage","GDB-Device create","deviceclli");
					Thread.sleep(2500);
					if(gdbcreatepage.lbl_gdb_selectop0.isCurrentlyVisible()){
						
						jsClick(gdbcreatepage.lbl_gdb_selectop0);
					} else actvtnpage.tbx_NB_Location_Designator.sendKeys("55F");
					
					switch(gpondevice){
					case "ONT": actvtnpage.ddl_NB_buildType.selectByVisibleText("Infrastructure Build");
								break;
					}	
					jsClick(gdbcreatepage.btn_gpon_shrink);
					wait.until(ExpectedConditions.elementToBeClickable(gdbcreatepage.btn_gpon_expand));
				}
				
				@Step
				public void GDB_Validation_screen(String validatinGDB) throws Throwable{
					gdbcreatepage.GDB_Validation_screen(validatinGDB);
				}
				
				@Step
				public void GDB_device_selectbox(String count)  throws Throwable{
					gdbcreatepage.GDB_device_selectbox(count);
				}
				
				@Step
				public void GDB_device_actionsmsgs() throws Throwable{
					gdbcreatepage.GDB_device_actionsmsgs();
				}
				
				@Step
				public void GDB_manually_adding_device() throws Throwable{
					gdbcreatepage.GDB_manually_adding_device();
				}
				
				
				
				@Step
				public void GDB_creating_device_through_inventory(String role) throws Throwable{
					WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
					actvtnpage.click_actscreentab("Create");
					
					selectFormType("Inventory","Device");
					
					
					actvtnpage.click_Technologytype("Role");
					
					String[] role_parts = role.split("-");
					String role_parts_technology = role_parts[0]; 
					String role_parts_devicerole = role_parts[1];
					
					switch(role_parts_devicerole){
					
					case "OLT" : createroleform("OLT","Calix C Series","Calix C7");
								 break;
					case "MST": createroleform("MST","Fiber Multiport Service Terminal","Generic MST 12:12");
					 			break;
					 			
					case "HOST": createroleform("HOST","Cisco ASR 9000 Series","Cisco ASR 9006"); 
									fillmandatoryfield_device("TC212391-HOST");
					
									break;
							}
					
					switch(role_parts_technology){
					
					case "GPON": jsClick(devcreatepage.rbn_Createdevice_Gpontechnology);
									Thread.sleep(2000);
									wait.until(ExpectedConditions.elementToBeClickable(devcreatepage.btn_Topologysearch));	
								GPON_topology_search(role_parts_technology);
									
									break;
									
					case "Ethernet" : jsClick(devcreatepage.rbn_Createdevice_Ethernettechnology);
									Thread.sleep(2000);
									Device_create_ethernet_subscriber();
									devcreatepage.ddl_Equipment_role.selectByValue("0");
									break;
									
					case "Passive" : jsClick(devcreatepage.rbn_Createdevice_passivetechnology);
									wait.until(ExpectedConditions.elementToBeClickable(devcreatepage.btn_Topologysearch));
									GPON_topology_search("GPON"); break;
					}
					
					Device_create_location_add();
					
					jsClick(devcreatepage.rdbtn_Shared);
					Thread.sleep(3000);
					
					fill_fields_from("OVCreateDevicePage",role,"Devicedata");
					
					devcreatepage.form_field();

				}
				
				
				@Step
				public void GDB_delete_icon_validation(String devicetype){
					gdbcreatepage.GDB_delete_icon_validation(devicetype);
				}
				
				
				
				//******************* Device create page Useful tools ***********************//
				
				public void GPON_topology_search(String role_parts_technology) throws Throwable {
					//WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 100);
					
					jsClick(devcreatepage.btn_Topologysearch);				
									
					fill_fields_from("OVCreateDevicePage",role_parts_technology,"Topologydata");	
					
					/*devcreatepage.btn_Createdevice_topology_lookup);
					
					waitForElement(devcreatepage.ckb_TopologylookUp);	
					
					devcreatepage.ckb_TopologylookUp);
					Thread.sleep(1000);
					devcreatepage.btn_Createdevice_topology_associate);*/
					devcreatepage.topology_fill();
							
				}
				
				public void Device_create_ethernet_subscriber() {
					jsClick(servicecreatepage.btn_subscriberlookupicon);
					loginPage.waitFor(devcreatepage.tbx_Createdevice_subscribername);
					devcreatepage.tbx_Createdevice_subscribername.sendKeys("TEST - JANET");
					jsClick(devcreatepage.btn_Createdevice_subscriber_lookup);
					loginPage.waitFor(devcreatepage.lbl_Createdevice_subscriber_associate);
					
					jsClick(devcreatepage.lbl_Createdevice_subscriber_associate);		

				}
				
				public void Device_create_location_add() throws Throwable{
					jsClick(devcreatepage.btn_locationLookup_newdevicecreateform);
					String parentwin=devcreatepage.window_switch();
					

					fill_fields_from("OVCreateDevicePage","GPON","Locationdata");
					
					jsClick(devcreatepage.btn_lookUp);//Rework
					Thread.sleep(5000);
					devcreatepage.switch_win(parentwin);	
				}
				
				//************************End of the Device create page Useful tools *******************************************//
				
				
				
				//************************************************** End of GDB related declarations**************************************************************//
				
				//********************************************************************************************************************************************//
				//													GFast related declarations - 16/2/17												  //
				//********************************************************************************************************************************************//
				
				
				@Step
				public void createtab_network_Transport_devicename(String devicename) throws Throwable{
					actvtnpage.tbx_createtab_NB_Transportpath_devicename.sendKeys(devicename);
					jsClick(actvtnpage.btn_Transportpath_create_form);
					Thread.sleep(5000);
				}
				
				@Step
				public void createtab_network_Transport_circuittype(String circuittype) throws Throwable{
					transportPathPage.gfasttransport_circuittype(circuittype);
				}
				
				@Step
				public void createtab_network_Transport_popupbox() throws Throwable{
					//waitForAlert(loginPage.getDriver());
					transportPathPage.gfasttransport_popupmsg();
					waitForElement(actvtnpage.tab_closeall_tab);
				}
				
				@Step
				public void transportpath_createform(String transportpath) throws Throwable{
					transportPathPage.transportpath_createform(transportpath);
				}
				
				
				@Step
				public void search_gfast_order_excel() throws Throwable{
					//gdbcreatepage.search_gfast_order_excel();
					loginPage.waitFor(actvtnpage.ddl_searchtab_task_csofid);
					actvtnpage.ddl_searchtab_task_csofid.sendKeys("763672");
				}
				
				@Step
				public void Validation_Gfast_order_Task() throws Throwable{
					taskpage.Validation_Gfast_order_Task();
				}
				
				/* New set for GFAST*/
				
				@Step
				public void search_tab_ordertype(String ordertype) throws Throwable{
					if(!actvtnpage.ddl_searchtab_order_producttype.isCurrentlyVisible()){
						click_Tab("Search");
						search_tab_searchtype("Orders");
						
					}
					actvtnpage.ddl_searchtab_order_producttype.selectByVisibleText(ordertype);
				}
				
				@Step
				public void order_search_results_tab_orders_validation(String columnvalidation) throws Throwable{
					orderpage.order_search_results_tab_orders_validation(columnvalidation);
				}
				
				@Step
				public void order_search_results_csof_ID_validation() throws Throwable{
					orderpage.order_search_results_csof_ID_validation();
				}
				
				@Step
				public void order_search_results_tab_search_parameters_validations(String search_parameter) throws Throwable{
					orderpage.order_search_results_tab_search_parameters_validations(search_parameter);
				}
				@Step
				public void search_GPONorders_ensemble_order(String search_order_ensemble) throws Throwable{
					
					actvtnpage.tbx_orderId.clear();
					actvtnpage.tbx_DTN.clear();
					actvtnpage.tbx_customerName.clear();
					
					actvtnpage.tbx_ensembleOrderNumber.sendKeys("1401494597");
				}
				
				@Step
				public void search_GPONorders_CSOFid_order() throws Throwable{
					if(actvtnpage.tbx_orderId.isCurrentlyVisible()){
					actvtnpage.tbx_ensembleOrderNumber.clear();	
					actvtnpage.tbx_orderId.clear();
					actvtnpage.tbx_DTN.clear();
					actvtnpage.tbx_customerName.clear();
					
					//actvtnpage.tbx_orderId.sendKeys("685482");
					actvtnpage.tbx_orderId.sendKeys(orderpage.gfast_get_excel_data_from("GFast-Sheet","GFast_BaseSanity", 2).replaceAll("\\s",""));
					} else {
						slf4jLogger.info("Order Page already displayed");
					}
				}
				
				@Step
				public void search_GPONorders_TN() throws Throwable{
					actvtnpage.tbx_ensembleOrderNumber.clear();
					actvtnpage.tbx_orderId.clear();					
					actvtnpage.tbx_customerName.clear();
					
					actvtnpage.tbx_DTN.sendKeys("1000009567");
				}
				
				@Step
				public void search_GPONorders_customer_name() throws Throwable{
					actvtnpage.tbx_ensembleOrderNumber.clear();
					actvtnpage.tbx_orderId.clear();
					actvtnpage.tbx_DTN.clear();
					
					actvtnpage.tbx_customerName.sendKeys("BEGINNINGS, NEW");
				}
				
				@Step
				public void order_searchresult_page() throws Throwable{
					  
					if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
						slf4jLogger.info("Order search page is already displayed");
					}else
					if(!actvtnpage.ddl_searchtab_order_producttype.isCurrentlyVisible()){
						if(!orderpage.tab_search_result_page.isCurrentlyVisible() || !orderpage.btn_order_search_results_tab.isCurrentlyVisible()){
						if(!actvtnpage.lbl_Searchresultpage.isCurrentlyVisible()){
							slf4jLogger.info("Need to search for the data");
						click_Tab("Search");
						search_tab_searchtype("Orders");
						actvtnpage.ddl_searchtab_order_producttype.selectByVisibleText("GPON");
						search_GPONorders_CSOFid_order();
						click_searchBtn("Orders");
						}
					}
					}  
					
				}
				
				@Step
				public void order_search_result_icon_validation(String iconvalidation) throws Throwable{
					orderpage.order_search_result_icon_validation(iconvalidation);
				}
				
				@Step
				public void order_tab_view_screnn_validation()  throws Throwable{
					if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
					orderpage.gfast_order_tab_validation();
				}
					
				}
				
				@Step
				public void order_details_page()  throws Throwable{
					if(!orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
						order_searchresult_page();
						select_viewBtn();
						order_tab_view_screnn_validation();
					}
					
				}
				
				@Step
				public void order_view_order_details_tab()  throws Throwable{
					orderpage.order_view_order_details_tab();
				}
				
				@Step
				public void order_view_page_validation(String orderpagesction) throws Throwable{
					orderpage.order_view_page_validation(orderpagesction);
				}
				
				@Step
				public void Order_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated all the Order details Sections");
					//orderpage.gfast_Automation_status_update("GFast-Sheet", "OV_Order_View");
				}
				
				@Step
				public void avail_action_section_orderpage() throws Throwable{
					orderpage.avail_action_section_orderpage();
				}
				
				@Step
				public void Avail_action_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated Available action Sections");
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_OrderView360");
				}
				
				@Step
				public void customer_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated Customer Sections");
				}
				
				@Step
				public void Contact_details_section_orderpage()throws Throwable{
					slf4jLogger.info("Validated Contact Sections");
				}
				
				@Step
				public void Location_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated Location Sections");
				}
				
				@Step
				public void ServiceID_clickable_details_section_orderpage(String servicetype) throws Throwable{
					orderpage.ServiceID_clickable_details_section_orderpage(servicetype);
				}
				
				@Step
				public void Service_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated Service details Sections");
				}
				
				@Step
				public void Dispatch_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated Dispatch Sections");
				}
				
				@Step
				public void Other_details_section_orderpage() throws Throwable{
					slf4jLogger.info("Validated Other details Sections");
					//orderpage.gfast_Automation_status_update("GFast-Sheet", "GFast_OrderView360");
				}
				
				@Step
				public void support_icons_related_tabs() throws Throwable{
					orderpage.support_icons_related_tabs();
				}
				
				@Step
				public void validate_related_tab_viewpage(String relatedtab_values) throws Throwable{
					orderpage.validate_related_tab_viewpage(relatedtab_values);
				}
				
				@Step
				public void serach_Device_related_tab_based_on_role(String ntwrole)throws Throwable{
					orderpage.serach_Device_related_tab_based_on_role(ntwrole);
				}
				
				@Step
				public void click_Device_related_tab_device_hyperlink() throws Throwable{
					orderpage.click_Device_related_tab_device_hyperlink();
				}
				
				@Step
				public void Device_role_validation() throws Throwable{
					searchdevicepage.Device_role_validation();
				}
				
				@Step
				public void dslam_device_tab() throws Throwable{
					
					if(!devcreatepage.btn_Edit.isCurrentlyVisible()){
						if(searchdevicepage.lbl_devicerole.isCurrentlyVisible()){
						slf4jLogger.info(searchdevicepage.lbl_devicerole.getText()+"Device role");
						}
					if(!searchdevicepage.lbl_devicerole.isCurrentlyVisible()){
						if(searchdevicepage.lbl_devicerole.isCurrentlyVisible()){
						if(!searchdevicepage.lbl_devicerole.getText().contains("DSLAM")){
								order_details_page();
								 click_servicesTab("Devices");
								 serach_Device_related_tab_based_on_role("DSLAM");
								click_Device_related_tab_device_hyperlink();
								}	
							}
						}
					}
				}
				
				@Step
				public void device_serach_page_tab(String device_tab) throws Throwable{
					searchdevicepage.device_serach_page_tab(device_tab);
				}
				
				@Step
				public void search_Device_section_validation(String device_section) throws Throwable{
					searchdevicepage.search_Device_section_validation(device_section);
				}
				
				@Step
				public void device_serach_page_network_tab_icon() throws Throwable{
					searchdevicepage.device_serach_page_network_tab_icon();
				}
				
				@Step
				public void search_Device_section_audit_logs_button(String Auditlog_btn) throws Throwable{
					searchdevicepage.search_Device_section_audit_logs_button(Auditlog_btn);
				}
				
				@Step
				public void device_viewpage_auditlog_armlog_getlog() throws Throwable{
					searchdevicepage.device_viewpage_auditlog_armlog_getlog();
				}
				
				@Step
				public void device_viewpage_auditlog_armlog_icons_validation() throws Throwable{
					searchdevicepage.device_viewpage_auditlog_armlog_icons_validation();
				}
				
				@Step
				public void device_viewpage_auditlog_armlog_table_displayed(String Auditlog) throws Throwable{
					searchdevicepage.device_viewpage_auditlog_armlog_table_displayed(Auditlog);
				}
				
				@Step
				public void device_viewpage_auditlog_armlog_validation() throws Throwable{
					slf4jLogger.info("Done with ARM audit log validation");
					/*int column_count=0;
					if(servicedetailspage.lbl_HSI_service_tab.isCurrentlyVisible()){
						column_count=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name"),"ARM Audit Log Validation");
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Pass");
					}*/ /*else{
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", 86, "Pass");
					}*/
				}
				
				@Step
				public void device_viewpage_auditlog_omnivuelog_icon() throws Throwable{
					searchdevicepage.device_viewpage_auditlog_omnivuelog_icon();
				}
				
				@Step
				public void device_viewpage_auditlog_omnivuelog_validation() throws Throwable{
					slf4jLogger.info("Done with Omnivue audit log validation");
					/*int column_count=0;
					if(servicedetailspage.lbl_HSI_service_tab.isCurrentlyVisible()){
						column_count=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name"),"Omnivue Audit Log Validation");
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Pass");
					}*/ /*else{
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_DeviceView360", 87, "Pass");
					}*/
					
				}
				
				@Step
				public void verify_buttons_related_tabs(String buttons) throws Throwable{
					searchdevicepage.verify_buttons_related_tabs(buttons);
				}
				
				
				@Step
				public void device_viewpage_transport_path() throws Throwable{
					searchdevicepage.validate_tp();
				}
				@Step
				public void order_search_page_service_hyperlink(String hyperlinkType) throws Throwable{
					
					switch(hyperlinkType){
					case "IPTV Unicast Link":searchservicepage.ServiceActionmethods(hyperlinkType);break;
					
					case "HSI": if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						
					
								if(!searchservicepage.lbl_HSI_service_tab.isCurrentlyVisible()){
								if(orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
									orderpage.order_search_page_service_hyperlink(hyperlinkType);
									}
									Thread.sleep(3000);
									if(orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id_invalid_msg_data_notavailable.isCurrentlyVisible()){
										
										//orderpage.gfast_sheet_update("GFast-Sheet", FileIOTest.readFile("Sheet_name"), "Fail", "Invalid Data:"+orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id_invalid_msg_data_notavailable.getText());
									}
									waitForElement(searchservicepage.lbl_HSI_service_tab); 
									}} else {
										orderpage.order_search_page_service_hyperlink(hyperlinkType);
									} break;
									
				case "HSI Service":orderpage.order_search_page_service_hyperlink("HSI");break;
				case "IPTV":orderpage.order_search_page_service_hyperlink(hyperlinkType);break;
				case "IPTV-Unicast":orderpage.order_search_page_service_hyperlink(hyperlinkType);break;
					
					}
					/*if(hyperlinkType.equals("HSI")){
					if(!servicedetailspage.lbl_HSI_service_tab.isCurrentlyVisible()){
					if(orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
					orderpage.order_search_page_service_hyperlink("HSI");
					}
					Thread.sleep(3000);
					if(orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id_invalid_msg_data_notavailable.isCurrentlyVisible()){
						orderpage.gfast_sheet_update("GFast-Sheet", FileIOTest.readFile("Sheet_name"), "Fail", "Invalid Data:"+orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id_invalid_msg_data_notavailable.getText());
					}
					waitForElement(servicedetailspage.lbl_HSI_service_tab);
				}
					
				} else if(hyperlinkType.equals("IPTV")){
					orderpage.order_search_page_service_hyperlink("IPTV");
				} else if(hyperlinkType.equals("IPTV-Unicast")){
					orderpage.order_search_page_service_hyperlink("IPTV-Unicast");
				}*/
					
				}
				
				@Step
				public void service_new_tab(String Type) throws Throwable{
					searchservicepage.service_new_tab(Type);
				}
				
				@Step
				public void services_viewpage_tab() throws Throwable{
					if(!searchservicepage.lbl_HSI_service_tab.isCurrentlyVisible()){
						order_searchresult_page();
						select_viewBtn();
						order_tab_view_screnn_validation();
						
						order_search_page_service_hyperlink("HSI");
						service_new_tab("HSI");
						
					}
				}
				
				@Step
				public void Service_tabs_section_click(String service_view_tabs) throws Throwable{
					searchservicepage.Service_tabs_section_click(service_view_tabs);
				}
				
				@Step
				public void service_section_validations(String service_section) throws Throwable{
					searchservicepage.service_section_validations(service_section);
					
				}
				
				
				
				//********************************* New Changes *****************************//
				
				@Step
				public void search_GPONorders_Based_on_excel(String service_section) throws Throwable{
					if(actvtnpage.tbx_ensembleOrderNumber.isCurrentlyVisible()){
						orderpage.search_with_excel_value(service_section);
						}
					slf4jLogger.info("Done with Entering data from Excel");
				}
				
				@Step
				public void gfast_automation_status_sheet_update()throws Throwable{
					int i;
					//orderpage.gfast_Automation_status_update("GFast-Sheet", fileiotest.readFile("Sheet_name"));
					slf4jLogger.info("Column:"+orderpage.search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column"));
					slf4jLogger.info("Column Contents:"+excel_access.getColumnContent("GFast_BaseSanity", orderpage.search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")));
					 ArrayList<String> data =excel_access.getColumnContent("GFast_BaseSanity", orderpage.search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column"));
					slf4jLogger.info("Column Size:"+excel_access.getColumnContent("GFast_BaseSanity", orderpage.search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).get(excel_access.getColumnContent("GFast_BaseSanity", orderpage.search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).size()-1));
					for(i=0;i<data.size();i++){
						 if((data.get(i).length()<1)||(data.get(i).isEmpty())){
							break;
						 }
					 }
					
					
					
					slf4jLogger.info("Order ID:"+excel_access.getColumnContent("GFast_BaseSanity", orderpage.search_hearder_excel("GFast_BaseSanity","CSOF ID from Order Result column")).get(i-1));
				}
			
				public void I_enter_csofid_in_searchslider(String order) throws Throwable{
					//String s = order;
					actvtnpage.tbx_orderId.sendKeys(order);
				}
				//************************************************** End of GFast related declarations**************************************************************//
				
				//********************************************************************************************************************************************//
				//													Pratim Team declarations declarations - 8/3/17												  //
				//********************************************************************************************************************************************//
				
				
				public void verifysubscriperdetails() throws InterruptedException {
					Thread.sleep(10000);
					locationsearchpage.btn_Edit_locationpage.isDisplayed();
					// slf4jLogger.info(ovldp.ver_subsfullname.getText());
				}
				
			
				
				//************************************************** End of Pratim related declarations**************************************************************//
				
				@SuppressWarnings("static-access")
				public void system_name(String scenario, String tag, String sheetname) throws FileNotFoundException, IOException{
					InetAddress ip;
			        String hostname;
			        
			        try {
			            ip = InetAddress.getLocalHost();
			            hostname = ip.getHostName();
			            slf4jLogger.info("Your current IP address : " + ip);
			            slf4jLogger.info("Your current Hostname : " + hostname);
			            
			           // slf4jLogger.info("Scenario's:"+fileiotest.readFile("Scenario"));
			           // slf4jLogger.info("Sheet Name:"+fileiotest.readFile("Sheet_name"));
			            
			            FileIOTest.writeFile("Sheet_name",sheetname);
			            fileiotest.writeFile("Scenario",scenario);
			            fileiotest.writeFile("Tag_name",tag);
			        } catch (UnknownHostException e) {
			 
			            e.printStackTrace();
			        }
				}
				
				public String get_data_parameter_sheet(String fieldname) throws FileNotFoundException, IOException{
					return fileiotest.readFile(fieldname);
					
				}
				
				
				//***************************************** New Updates Sprint 236 ***********************************************//

			
				
				
				@Step
				public void search_order_advancesearch_searchslider(String type) throws Throwable{
					String validationvalue=orderpage.search_order_advancesearch_searchslider(type);
					if(actvtnpage.tab_closeall_tab.isCurrentlyVisible()){
						jsClick(actvtnpage.tab_closeall_tab);
					}
					actvtnpage.click_actscreentab("Search");	
					//click_Tab("Search");
					search_tab_searchtype("Orders");
					actvtnpage.ddl_searchtab_order_producttype.selectByVisibleText("GPON");					
					orderpage.clear_all_the_values_slider();	
					if(type.equals("CSOFID")){
						actvtnpage.tbx_orderId.sendKeys(validationvalue);
					}else if(type.equals("Ensemble Order Number")){
						actvtnpage.tbx_ensembleOrderNumber.sendKeys(validationvalue);
					}
					//click_searchBtn("Orders");
					
				}
				
				@Step
				public void search_order_advancesearch_validations_order() throws Throwable{
					orderpage.search_order_advancesearch_validations_order();
					
				}
				
				
				@Step
				public void advance_circuit_search(String type,String subtype)throws Throwable{
					switch(type){
					case "Circuit":searchcircuit.advance_circuit_search(subtype); break;
					case "Contacts": searchcontact.advance_contact_search(subtype); break;
					case "Location":searchlocation.advance_contact_search(subtype); break;
					}
					
				}
				
			
				@Step
				public void Advance_Search_button_action(String button)throws Throwable{ 
					orderpage.Advance_Search_button_action(button);
					
					//waitForElement(actvtnpage.btn_view);
				}
				
				@Step
				public void circuit_advancesearch_searchslider(String searchwith, String type) throws Throwable{ 
					String searchname = null;
					ArrayList<String> name=null;
					switch(type){
					case "Circuit":searchname=searchcircuit.circuit_advancesearch_searchslider(searchwith);break;
					case "Contact":jsClick(actvtnpage.btn_view); waitForElement(devcreatepage.btn_Edit); name=searchcontact.contact_advancesearch_searchslider(searchwith);break;
					case "Device":searchname=searchdevicepage.device_advancesearch_searchslider(searchwith);break;
					case "Location":jsClick(actvtnpage.btn_view); waitForElement(devcreatepage.btn_Edit); name=searchlocation.location_advancesearch_searchslider(searchwith);break;
					}
					
					if(actvtnpage.tab_closeall_tab.isCurrentlyVisible()){
						jsClick(actvtnpage.tab_closeall_tab);
					}
					actvtnpage.click_actscreentab("Search");	
					
					switch(type){
					case "Circuit": actvtnpage.tbx_circuitname_searchslider.sendKeys(searchname);break;
					case "Contact": actvtnpage.tbx_contact_firstname_searchslider.sendKeys(name.get(0)); actvtnpage.tbx_contact_lastname_searchslider.sendKeys(name.get(1));break;
					case "Device": actvtnpage.tbx_deviceName.sendKeys(searchname);break;
					case "Location":actvtnpage.tbx_search_loaction_streetname.sendKeys(name.get(0));actvtnpage.tbx_search_loaction_city.sendKeys(name.get(1)); actvtnpage.tbx_search_loaction_zip.sendKeys(name.get(2));actvtnpage.ddl_search_loaction_State.selectByVisibleText("FL-Florida");break;
					}
					
					//click_Tab("Search");
					//search_tab_searchtype("Orders");
					
					
				}
				
				@Step
				public void tabname_validations(String type) throws Throwable {
					switch(type){
					case "Circuit":searchcircuit.tabname_validations(); break;
					case "Contact":searchcontact.tabname_validations(); break;
					case "Device":searchdevicepage.tabname_validations(); break;
					case "Location":searchlocation.tabname_validations(); break;
					}
					
				}
				
				@Step
				public void search_tab_validations_with_Advancesearch() throws Throwable {
					searchcircuit.search_tab_validations_with_Advancesearch(); 
					
				}
				
				@Step
				public void exact_advance_search_validation() throws Throwable {
					if(actvtnpage.btn_view.isCurrentlyVisible()){
						throw new Error("Exact Match is not working for this scenario");
					} else {
						slf4jLogger.info("Exact match is working");
					}
				}			
				@Step
				public void validate_changes_associationtab_serviceview(String newfieldchange) throws Throwable {
					searchservicepage.validate_associationtab_serviceview(newfieldchange);										
				}	
				@Step
				public void select_administration_gearicon() throws Throwable {
					actvtnpage.select_administration_gearicon();
				}

				@Step
				public void select_manageusers_administration_gearicon(String Managetype) throws Throwable {
					actvtnpage.select_manageusers_administration_gearicon(Managetype);
				}

				/*@Step
				public void search_user_action() throws Throwable {
					
					int i=1;
					if(!excel_access.getCellData_excel("OVUsersheet","Usersheet", i, 0).isEmpty()){						
					
					while(i!=0){
						System.out.println("Count Checked="+i);
						actvtnpage.ddl_filerby_mangeuser.selectByVisibleText("OV_USER_ID");
					actvtnpage.tbx_useridsearchfield.sendKeys(excel_access.getCellData_excel("OVUsersheet","Usersheet", i, 0));
					jsClick(actvtnpage.btn_manage_users_searchuser);
					Thread.sleep(2000);
					
					if(!actvtnpage.lbl_nodataispresent_onsearch.isCurrentlyVisible()){						
					
					 waitForElement(actvtnpage.btn_view);
					 jsClick(actvtnpage.btn_manage_users_deleteuser);

					 Alert alert = loginPage.getDriver().switchTo().alert();
			           	String msg=alert.getText();
			           	Thread.sleep(2000);
			           //	alert.dismiss();
			           	alert.accept();
			           	slf4jLogger.info("Accepted the popup");
			           	Thread.sleep(2000);
			           //	actvtnpage.tab_closeall_tab);
					}
			           	i++;
			           	
			           	String excelbook = Page.envData.getFieldValue("OVUsersheet");
		    			FileInputStream file = new FileInputStream(excelbook);
		    			Workbook workbook = new HSSFWorkbook(file);		    			
		    			Sheet sheet = workbook.getSheet("Usersheet");
		    			
		    			System.out.println("Last Row="+sheet.getLastRowNum());
			    		if(i==sheet.getLastRowNum()+1){
			    			if(excel_access.getCellData_excel("OVUsersheet","Usersheet", i, 0).isEmpty()){
					           	System.out.println("End of the sheet");
					           		break;
					           	}
			    			break;
						}
			    		
			    		jsClick(actvtnpage.tab_closeall_tab);
			    		Thread.sleep(2000);
			    			actvtnpage.click_actscreentab("Gear icon");			           	
			           
			           	select_administration_gearicon();
			           	select_manageusers_administration_gearicon("Manage Users");
				}
					} else {
						System.out.println("No data found");
					}
					
				}*/
				
				@Step
				public void success_message_validation(){
					if(devcreatepage.success_alert.isCurrentlyVisible()){
						slf4jLogger.info("Successfully created getting this message:"+devcreatepage.success_alert.getText());
					}
				}
				
				@Step
				public void Create_Tab_NB_transport_path(String Drole,String Dname) throws Throwable {
					createnetwrkbuild.ddl_Transport_path_DeviceRole.selectByVisibleText(Drole);
					
					createnetwrkbuild.tbx_Transport_path_Devicename.sendKeys(Dname);
					
					System.out.println("Device name = "+Dname);					
					
				}
				
				@Step
				public void launch_NB_Transport_path_create_form() throws Throwable {
					jsClick(actvtnpage.btn_Launch_Network_Create_form);
					Thread.sleep(5000);
				}
				
				//**********************US60475 - Changes - 7/10/2017 ***************************//
				
				@Step
				public void GDB_manually_adding_selected_device(String Devicetype) throws Throwable{
					gdbcreatepage.GDB_manually_adding_selected_device(Devicetype);
				}
				
				@Step
				public void fiber_link_select_gdb() throws Throwable{
					if(gdbcreatepage.btn_gpon_OLT_box.isPresent()){
						slf4jLogger.info("OLT Device is Present");
						adddevicecardtodevice("GDB-OLT");																	
					}
					jsClick(gdbcreatepage.lbl_GDB_first_fiberlink);
					waitForElement(gdbcreatepage.ddl_flgdbstartid);
				}
				
				@Step
				public void validating_GDB_Fiberlink_portstatus(String port,String portstatus) throws Throwable{
					gdbcreatepage.validating_GDB_Fiberlink_portstatus(port,portstatus);
				}
				
				//************************************************************************************************//
				
				
				@Step
				public void i_enter_in_Service_Association_Section(String Dtype, String Dname, String section) throws Throwable {
					
					switch(Dtype){
					
					case "NID Device":  servicecreatepage.perform_device_lookup(Dname);
											Thread.sleep(2000);
											slf4jLogger.info("Scrolling down");
											scrollingToBottomofAPage();
											jsClick(servicecreatepage.btn_serviceport);
											jsClick(servicecreatepage.btn_serviceportlookup);
										Thread.sleep(5000);
										servicecreatepage.select_port_from_port_lookup();
										jsClick(servicecreatepage.rdb_select_NMI); break;
										
					case "BRIX device": if(section.equals("Probe Uni")){
						
												servicecreatepage.perform_BRIX_device_lookup(Dname);
												servicecreatepage.tbx_BRIX_ProbeUNI.sendKeys("11/GE1/" + Dname + Dname);
					
											} else if(section.equals("PROBE UNI")){
												servicecreatepage.perform_device_lookup(Dname);
												jsClick(servicecreatepage.btn_serviceport);
												jsClick(servicecreatepage.btn_serviceportlookup);
												//servicecreatepage.perform_BRIX_device_lookup(Dname);
												Thread.sleep(3000);
												servicecreatepage.select_port_for_PROBE();
											}
					
					
						
						
					}
					
					
				}
				
				@Step
				public void scrollingToBottomofAPage() {
					((JavascriptExecutor)getDriver()).executeScript("scroll(0,400)");
				}
				
				@Step
				public void i_click_on_Create_button_of_Service_page(String Servicename)  throws Throwable {
					jsClick(servicecreatepage.btn_create);
					waitForElement(searchservicepage.btn_Servicepage_Edit);					
					
				}
				
				@Step
				public void service_should_get_created_successfully() throws Throwable {
				    
					Thread.sleep(5000);
					jsClick(servicecreatepage.tab_createserviceform);
					String tabname = servicecreatepage.tab_createserviceform.getText();
					slf4jLogger.info(tabname);
					
					//slf4jLogger.info(mefevccreatepage.tab_createserviceform.getText());
					Thread.sleep(3000);
					
					
					String txt = servicecreatepage.lbl_message.getText();
					slf4jLogger.info(txt.trim());
					Thread.sleep(3000);
					jsClick(servicecreatepage.tab_service360view);				
					waitForElement(searchservicepage.btn_Servicepage_Delete);
					
					
				}
				
				
				
				//**********************US171722 - Changes - 7/21/2017 ***************************//
				
				@Step
				public void Network_order_status(String statusvalidation) throws Throwable {
					orderpage.validation_networkorder_status(statusvalidation);					
				}
				
				@Step
				public void launching_networkorder_altequipscreen() throws Throwable {
					orderpage.launching_networkorder_altequipscreen();
				}
				
				@Step
				public void task_name_select(String taskname) throws Throwable{
					actvtnpage.task_name_select(taskname);	
				}
				@Step
				public void task_search_select_value_from_dropdown(String value,String dropdown) throws Throwable{
					browser_zoom_in();
					taskpage.task_search_select_value_from_dropdown(value,dropdown);	
				}
				@Step
				public void task_advancesearch_select_value_from_dropdown(String value,String dropdown) throws Throwable{
					browser_zoom_in();
					taskpage.task_advancesearch_select_value_from_dropdown(value,dropdown);	
				}
				@Step
				public void search_service_resultpage(String ServiceName) throws Throwable {
					waitForElement(actvtnpage.tab_closeall_tab);
					searchdevicepage.search_service_resultpage(ServiceName);
				}
				
				@Step
				public void GDB_functionalstatus(String fs) throws Throwable {
					 gdbcreatepage.GDB_functionalstatus(fs);
				 }
				
				@Step
				public void order_screenvalidation(String validation) throws Throwable{
					orderpage.order_screenvalidation(validation);		
				}

				@Step
				public void Sanity_validations(String validation) throws Throwable{
					slf4jLogger.info("About to validate="+validation);
					switch(validation){
					case "Contact Search screen":searchcontact.verify_validation(validation);break;
					case "Bulk Port update tab is displayed":searchdevicepage.verify_validation(validation);break;
					case "Services table in Device screen":searchdevicepage.verify_validation(validation);break;
					case "view icon of the ethernet bearer in the Circuit related tab":searchcircuit.verify_validation(validation);break;
					case "Order details":taskpage.verify_validation(validation);break;
					case "Arrow button in Task result":taskpage.verify_validation(validation);break;
					case "Apply default button in the configure column":orderpage.verify_validation(validation);break;
					case "Configure column button in the order result page":orderpage.verify_validation(validation);break;
					case "OV Dashboard tab":gearicon.verify_validation(validation);break;
					case "DSP Dashboard tab":gearicon.verify_validation(validation);break;
					case "Manage Workgroup attributes":gearicon.verify_validation(validation);break;
					case "My Profile attributes":gearicon.verify_validation(validation);break;
					case "Devices table in Location screen":searchlocation.verify_validation(validation);break;
					case "Service Areas table in Location screen":searchlocation.verify_validation(validation);break;
					case "Task table in Location screen":searchlocation.verify_validation(validation);break;
					case "Order table in Location screen":searchlocation.verify_validation(validation);break;
					case "Impacted Subscribers table is displayed in Device screen":  searchdevicepage.verify_validation(validation);break;
					case "Order table in Device screen":searchdevicepage.verify_validation(validation);break;
					case "Task related to Order should":searchservicepage.verify_validation(validation);break;
					case "Contact Search screen attributes":searchcontact.verify_validation(validation);break;
					case "Contact Create screen attributes":ovcreatecontactpage.verify_validation(validation);break;
					case "GDB boxes & its related icons":  gdbcreatepage.GDB_Sanity_validations();break;
					case "Device Create screen attributes": devcreatepage.Device_Sanity_validations();break;
					case "Device Search screen attributes": searchdevicepage.Device_search_Sanity_validation();break;
					case "Circuit Create screen attributes": createcircuitpage.Circuit_create_Sanity_Validation(); break;
					case "Circuit Search screen attributes": searchcircuit.Circuit_search_Sanity_Validation(); break;
					case "Circuit view page": searchcircuit.verify_validation(validation); break;
					case "Circuit Search Result": searchcircuit.verify_validation(validation);break;
					case "Service Search screen attributes":searchservicepage.Service_search_Sanity_Validation(); break;
					case "Service Create screen attributes":servicecreatepage.Service_create_Sanity_Validation(); break;
					case "Link Search screen attributes": ovsearchlinkpage.Link_search_Sanity_validation();break;
					case "Link Create screen attributes": ovcreatelinkpage.Link_create_Sanity_validation();break;
					case "Alternate Equipment Build screen": ovcreateAlternateequipbuild_Networkorder.Alternateequipbuild_Networkorder_create_Sanity_validation();break;
					case "Order Create screen attributes":orderpage.Order_create_Sanity_validation();break;
					case "Order Search screen attributes":orderpage.Order_search_Sanity_validation();break;
					case "Topology Create screen attributes":createTopologyPage.Topology_create_Sanity_Validation(); break;
					case "Topology Search screen attributes":searchTopologyPage.Topology_search_Sanity_Validation(); break;
					case "related tabs of topology":searchTopologyPage.Topology_search_Sanity_Validation(); break;
					case "Subscriber Create screen attributes": createsubscriberpage.Sanity_SubscriberCreate_validations(); break;
					case "Subscriber Search screen attributes": searchsubscriberpage.Sanity_SubscriberView_validations(); break;
					case "Subscriber details tab opened": searchsubscriberpage.Sanity_SubscriberSolr_Search(); break;
					case "Servicearea Create screen attributes": createserviceareapage.Sanity_ServiceareaCreate_validations(); break;
					case "Servicearea Search screen attributes": searchserviceareapage.Sanity_ServiceareaView_validations(); break;
					case "associated device and location for service area": searchserviceareapage.Sanity_ServiceareaView_relatedtabvalidations(); break;
					case "Task Search screen attributes":taskpage.Sanity_Task_validations(); break;
					case "Network Order screen attributes": ovserachnetworkorderpage.Sanity_Networkorderpage_validations(); break;
					case "Location Create screen attributes" :createlocationpage.Location_create_Sanity_Validation(); break;
					case "Location Search screen attributes":searchlocation.Location_search_Sanity_Validation(); break;
					case "QOS Template Search screen attributes":ovsearchqostemplate.QOSTemplate_search_Sanity_Validation(); break;
					case "QOS Template Create screen attributes":ovcreateqostemplate.QOSTemplate_create_Sanity_Validation(); break;
					case "Number Create screen attributes":ovcreatenumberpage.Number_create_Sanity_Validation(); break;
					case "Affiliate Owner field values in DSL OVC Create screen":servicecreatepage.validate_the_affiliate_owner_fields_DSLOVC();break;
					case "Affiliate Owner field values in DSL OVC View Screen": searchservicepage.validate_the_affiliate_owner_fields_DSLOVC();break;
					case "Topology Technology Type values for Ethernet Topology under Search slider":actvtnpage.validate_topologytype_searchslider(); break;
					case "Topology Technology Type values for Host Client or Satellite Topology under Search slider":actvtnpage.validate_topologytype_searchslider_forHostClient();break;
					case "Topology Technology Type values for Ethernet Topology under Advance Topology search":searchTopologyPage.validate_topologytechtype_advancesearch();break;
					case "Topology Technology Type values for Host Client or SatelliteTopology under Advance Topology search":searchTopologyPage.validate_topologytechtype_for_hostClient_advancesearch();break;
					case "Topology Technology Type values for Host Client or SatelliteTopology under create topology page":createtopologyPage.validate_topologytechtype_for_hostClient_in_createTopologyPage();break;
					case "Topology Technology Type values for Host Client or SatelliteTopology of GUI in database":createtopologyPage.validate_topologytechtype_inDB();break;
					
					case "View Entry in Audit log for DSL OVC View Action": searchservicepage.validate_the_auditlog_DSLOVC("VIEW");break;
					case "Update Entry in Audit log for DSL OVC View Action": searchservicepage.validate_the_auditlog_DSLOVC("UPDATE");break;
					case "Defect task details saved successfully message": taskpage.validate_defecttask_message("Save");break;
					case "Defect task details submitted successfully message":taskpage.validate_defecttask_message("Complete");break;
					case "Device Role is updated as HOST in Topology create form":createTopologyPage.Topology_create_Adddevcie(validation);break;
					case "Device Role is updated as Client in Topology create form": createTopologyPage.Topology_create_Adddevcie(validation);break;
					case "Host Client or Satellite drop down value present for Topology role in Topology create form" :createTopologyPage.Topology_craete_topologyrole("Host Client or Satellite"); break;
					case "Technology Type as ALU-Nokia 7750 series with Role as Host Client or Satellite":searchTopologyPage.validation_verify(validation); break;
					case "Technology Type as Juniper MX series with Role as Host Client or Satellite": searchTopologyPage.validation_verify(validation); break;
					case "The defect task is already assigned to you message":taskpage.verify_validation(validation);break;
					case "Defect task released successfully message": taskpage.verify_validation(validation);break;
					case "Defect task claimed successfully message": taskpage.verify_validation(validation);break;
					case "Apply Default in the configuration column": taskpage.verify_validation(validation);break;
					case "CLC Contact Create screen attributes":createclccontactpage.verify_validation(validation);break;
					case "Remove icon under My Dashboard to Remove the Widget":dashboardpage.Sanity_validations(validation);break;
					case "Resize icon under My Dashboard to Resize the Widget":dashboardpage.Sanity_validations(validation);break;
					case "Defect task details saved successfully":taskpage.verify_validation(validation);break;
					}
					
				}
				
				@Step
				public void technology_select_based_devicerole(String role) throws Throwable{
					devcreatepage.technology_select_based_devicerole(role);		
				}
				
				@Step
				public void I_Enter_Subscriber_Fullname_as_Test(String name) throws Throwable {
					
					searchsubscriberpage.Enter_Subscriber_name(name);
				}
				
				@Step
				public void I_Enter_Servicearea_Fullname_as_Test(String name) throws Throwable 
				{
					
					searchserviceareapage.Enter_Servicearea_name(name);
				}
				
				@Step
				public void searchtab_templatename(String name) throws Throwable 
				{
					
					actvtnpage.tbx_searchtab_Template_name.type(name);
					
				}
				
				@Step
				public void Validate_FROM_Archie_Auditlog(String place){
					switch(place){
					case "Devices": searchdevicepage.Validate_FROM_Archie_DeviceAuditlog();	break;
					case "Task": taskpage.Validate_FROM_Archie_Auditlog(place);	break;
					case "Circuit":searchcircuit.Validate_FROM_Archie_CircuitAuditlog();	break;
					case "Service":searchservicepage.Validate_FROM_Archie_ServiceAuditlog();	break;
					}
					
				}
				
				@Step
	              public void I_enter_name_field_under_search_slider(String circuitname) {
	                try {
	                                waitForElement(searchcircuit.lbl_search_circuit_name);
	                                searchcircuit.lbl_search_circuit_name.sendKeys(circuitname);
	                               Thread.sleep(1000);
	                }catch(Exception e) {
	                                e.printStackTrace();
	                }
	              }

				@Step
				public void Validate_Auditlog_witharchieve(String place){
					switch(place){
					case "Task":taskpage.Validate_Auditlog_witharchieve(); break;
					case "Device":searchdevicepage.Validate_Auditlog_witharchieve(); break;
					case "Service":searchservicepage.Validate_Auditlog_witharchieve(); break;
					}
					
				}
				@Step
				public void I_enter_service_name_field_under_search_slider(String servicename) {
	                try {
	                                waitForElement(searchservicepage.lbl_service_name_search);
	                                searchservicepage.lbl_service_name_search.sendKeys(servicename);
	                               Thread.sleep(1000);
	                }catch(Exception e) {
	                                e.printStackTrace();
	                }
	            }

				
				@Step
				public void searchtab_archieve_searchfrom() throws Throwable {
					waitForElement(actvtnpage.ddl_searchtab_archive_searchfrom);
					actvtnpage.ddl_searchtab_archive_searchfrom.selectByVisibleText("Tasks");
				}
				
				@Step
				public void searchtab_archieve_criteria(String value) throws Throwable {
					int i,j;
					switch(value){
					case "Workgroup as CDP":	waitForElement(actvtnpage.tbx_searchtab_archive_workgroup);
												if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
													jsClick(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
													}
													if(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon.isCurrentlyVisible()){
														jsClick(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon);
													}
											actvtnpage.tbx_searchtab_archive_workgroup.type("CDP");
											waitForElement(actvtnpage.lbl_searchtab_archive_workgroup_highlighted);
											jsClick(actvtnpage.lbl_searchtab_archive_workgroup_highlighted); break;
											
					case "Workgroup as ASP":	waitForElement(actvtnpage.tbx_searchtab_archive_workgroup);
												if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
													jsClick(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
													}
													if(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon.isCurrentlyVisible()){
														jsClick(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon);
													}
											actvtnpage.tbx_searchtab_archive_workgroup.type("ASP");
											waitForElement(actvtnpage.lbl_searchtab_archive_workgroup_highlighted);
											jsClick(actvtnpage.lbl_searchtab_archive_workgroup_highlighted); break;
											
					case "Task status as Open": waitForElement(actvtnpage.btn_searchtab_archive_taskstatus);
												if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
													jsClick(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
												}
												if(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon.isCurrentlyVisible()){
													jsClick(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon);
												}
												
												actvtnpage.tbx_searchtab_archive_workgroup.type("CDP");
												waitForElement(actvtnpage.lbl_searchtab_archive_workgroup_highlighted);
												jsClick(actvtnpage.lbl_searchtab_archive_workgroup_highlighted);
												
												jsClick(actvtnpage.btn_searchtab_archive_taskstatus);
												waitForElement(actvtnpage.lbl_searchtab_archive_Openstatus_highlighted);
												jsClick(actvtnpage.lbl_searchtab_archive_Openstatus_highlighted); break;
												
					case "a value in PON":/*if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
											actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
											}
											if(actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon.isCurrentlyVisible()){
												actvtnpage.lbl_searchtab_archive_Added_taskstatus_closeicon);
											}
											
											actvtnpage.tbx_searchtab_archive_workgroup.type("CDP");
											waitForElement(actvtnpage.lbl_searchtab_archive_workgroup_highlighted);
											actvtnpage.lbl_searchtab_archive_workgroup_highlighted);*/
											
											searchtab_archieve_criteria("Workgroup as CDP");
											actvtnpage.click_searchbtn("Archive");
											
											waitForElement(actvtnpage.tab_closeall_tab);
											i=2;
											
											while(i!=0){
												if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'columntabletaskGrid')]/div["+i+"]//span")).getText().equals("PON")){
													
													break;
												}
												i++;
											}
											//slf4jLogger.info("Fount the PON column in :"+i);
											
											j=1;
											while(j!=0){
												if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim().length()>0){
													break;
												}
												j++;
											}
											
											
											String pon=getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim();
											slf4jLogger.info("PON Vlaue="+pon);
											
											jsClick(actvtnpage.tab_closeall_tab);
											actvtnpage.click_actscreentab("Search");
											
											if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
												jsClick(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
												}
											
											actvtnpage.tbx_searchtab_archive_PON.type(pon); break;
											
					case "a value in Circuit ID": searchtab_archieve_criteria("Workgroup as CDP");
													actvtnpage.tbx_searchtab_archive_Csofid.clear();
													actvtnpage.click_searchbtn("Archive");
													
													waitForElement(actvtnpage.tab_closeall_tab);
													i=2;
													
													while(i!=0){
														if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'columntabletaskGrid')]/div["+i+"]//span")).getText().equals("Circuit ID")){
															
															break;
														}
														i++;
													} 
													j=1;
													while(j!=0){
														if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim().length()>0){
															break;
														}
														j++;
													}
													
													
													String circuit=getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim();
													//slf4jLogger.info("PON Vlaue="+pon);
													
													jsClick(actvtnpage.tab_closeall_tab);
													actvtnpage.click_actscreentab("Search");
													
													if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
														jsClick(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
														}
													
													actvtnpage.tbx_searchtab_archive_Circuitid.type(circuit); break;	
						
					case "a value in CSOF ID": searchtab_archieve_criteria("Workgroup as ASP");
					
												actvtnpage.tbx_searchtab_archive_PON.clear();
												actvtnpage.click_searchbtn("Archive");
												
												waitForElement(actvtnpage.tab_closeall_tab);
												i=2;
												
												while(i!=0){
													if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'columntabletaskGrid')]/div["+i+"]//span")).getText().equals("CSOF Order ID")){
														
														break;
													}
													i++;
												}
												j=1;
												while(j!=0){
													if(getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim().length()>0){
														break;
													}
													j++;
												}
												
												
												String csofid=getDriver().findElement(By.xpath(".//*[starts-with(@id,'contenttabletaskGrid')]/div["+j+"]/div["+i+"]")).getText().trim();
												//slf4jLogger.info("PON Vlaue="+pon);
												
												jsClick(actvtnpage.tab_closeall_tab);
												actvtnpage.click_actscreentab("Search");
												
												if(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon.isCurrentlyVisible()){
													jsClick(actvtnpage.lbl_searchtab_archive_Added_workgroup_closeicon);
													}
												
												actvtnpage.tbx_searchtab_archive_Csofid.type(csofid); break;
												
					
												
					}
					
				
					
				}
				
				@Step
				public void validate_archive_resulttable() throws Throwable {
					ovsearchArchivepage.validate_archive_resulttable();
				}
				
				@Step
				public void Device_validationbasedaction(String action,String page) throws Throwable{
					switch(page){
					case "Circuit":switch(action){
											case "Get logs in Audit logs with From Archive checkbox selected":searchcircuit.Validate_FROM_Archie_Auditlog();break;
											case "Get logs in Audit logs button in ARM Log page":searchcircuit.Validate_arm_Auditlog_circuit();break;
											}
					case "Device":switch(action){
									case "Get logs in Audit logs with From Archive checkbox selected":searchdevicepage.Validate_FROM_Archie_Auditlog();break;
									case "Get logs in Audit logs button in ARM Log page":searchcircuit.Validate_arm_Auditlog_circuit();break;
									}
					case "Service":switch(action){
									case "Get logs in Audit logs with From Archive checkbox selected":searchservicepage.Validate_FROM_Archie_Auditlog();break;
									case "Get logs in Audit logs button in ARM Log page":searchcircuit.Validate_arm_Auditlog_circuit();break;
									case "Edit":jsClick(searchservicepage.btn_edit_service_viewpage); waitForElement(searchservicepage.btn_DSLOVC_View_Save);break;
									case "Save":jsClick(searchservicepage.btn_DSLOVC_View_Save); waitForElement(searchservicepage.btn_edit_service_viewpage); break;
									}
					}				
					
				}
				
				@Step
				public void Circuit_viewpage_tabaction(String tabaction) throws Throwable {
					searchcircuit.Circuit_viewpage_tabaction(tabaction);					
				}
				
				@Step
				public void Service_View_Action(String action) throws Throwable {					
					searchservicepage.Service_View_Action(action);
				} 
				
				@Step
				 public void Topology_craete_topologyrole(String Topologyrole) throws Throwable{					 
					
					 createTopologyPage.Topology_craete_topologyrole(Topologyrole);
				 }
				
				@Step
				 public void Topology_create_Adddevcie(String Devicerole) throws Throwable{
					switch(Devicerole){
					case "Create":createTopologyPage.Topology_create_Adddevcie(Devicerole);		break;
					case "HOST":createTopologyPage.Topology_create_Adddevcie(Devicerole);		break;
					case "CLIENT":createTopologyPage.Topology_create_Adddevcie(Devicerole);		break;
					default: searchTopologyPage.topology_Action(Devicerole);break;
					}
							
				 }		
				
				//############################ TC223190 - 9/5/2017 #######################################//
				
				@Step
				public void device_role_change(String arg) throws Throwable{
					searchdevicepage.device_role_change(arg);
				}
				
				//########################################################################################################################//	
				
				@Step
				public void searchresult(String type) throws Throwable {
					
					//waitForElement(actvtnpage.btn_view);
					switch (type){
					case "MLTO Order":orderpage.searchmltoorder_result();break;
					}
				}
				
				@Step
				public void order_action_fuctionality(String action) throws Throwable {
					
					orderpage.order_action_fuctionality(action);
				}
				
				@Step
				public void validate_topologydropdownvalues(String slider) throws Throwable {
					actvtnpage.validate_topologydropdownvalues(slider);
				}
				
				@Step
				public void EB_transporttypevalidation() throws Throwable {
					createcircuitpage.EB_transporttypevalidation();	
				}
				
				@Step
				public void task_searchtype_tasktype(String Search_Type,String Task_Type) throws Throwable {				
					
					actvtnpage.task_searchtype_tasktype(Search_Type,Task_Type); 									    
				    
				}
				
				@Step
				public void select_search_taskworkgroup(String workgp) throws Throwable {
					actvtnpage.select_search_taskworkgroup(workgp);
				}
				
				@Step
				public void Defect_task_search() throws Throwable {
					actvtnpage.Defect_task_search();
				}
				
				@Step
				public void select_search_taskstatus(String status) throws Throwable {
					actvtnpage.select_search_taskstatus(status);
				}
				
				@Step
				public void Validate_defecttask_button() throws Throwable {
					taskpage.Validate_defecttask_button();
				}
				
				@Step
				public void click_edit_open_defectTask(String action) throws Throwable {
					taskpage.click_edit_open_defectTask(action);
				}
				
				@Step
				public void Validate_defecttask_status_assigned() throws Throwable {
					String Taskid=taskpage.Validate_defecttask_status_assigned();
					release_defecttask(Taskid);					
				}
				
				@Step
				public void release_defecttask(String Taskid) throws Throwable {
				
					jsClick(actvtnpage.tab_closeall_tab);
					actvtnpage.click_actscreentab("Search");	
					actvtnpage.tbx_Defect_Task_ID.type(Taskid);
					if(actvtnpage.btn_defectTask_status_closeicon.isCurrentlyVisible()){
						jsClick(actvtnpage.btn_defectTask_status_closeicon);
					}					
					actvtnpage.click_searchbtn("Defect Task");
					waitForElement(taskpage.btn_defecttask_edittask);
					
					jsClick(taskpage.cbk_defecttask_select);
					Thread.sleep(1000);
					
					taskpage.ddl_defecttask_action.selectByVisibleText("Release");
					jsClick(taskpage.btn_defecttask_action_go);
					
					waitForElement(devcreatepage.success_alert);
					
				}
				
				@Step
				public void i_select_topology_type_search_slider(String topologytype) throws Throwable {			
					actvtnpage.ddl_Search_topologyType.selectByVisibleText(topologytype);
					Thread.sleep(1000);	
				}
				
				@Step
				public void i_select_topology_role_search_slider(String topologyrole) throws Throwable {			
					actvtnpage.dd_topology_role.selectByVisibleText(topologyrole);
					Thread.sleep(1000);	
				}
				
				
				@Step
				public void i_select_topology_type_and_topology_role_search_slider(String topologytype, String topologyrole) throws Throwable {
					
					actvtnpage.i_select_topology_type_and_topology_role_search_slider (topologytype,topologyrole);					
					
				}
				
				@Step
				public void i_select_topologyType_topologyRole_technologyType_search_slider(String topologytype, String topologyrole, String technologyType) throws Throwable{
					actvtnpage.i_select_topologyType_topologyRole_technologyType_search_slider(topologytype,topologyrole,technologyType);
				}
				@Step
				public void i_validate_deviceType(String devType) throws Throwable{
					jsClick(createTopologyPage.btn_topology_createpage_AddDevice);
					Thread.sleep(2000);
					searchTopologyPage.Validate_DeviceType(devType);
				}
				@Step
				public void i_click_view_icon() throws Throwable {
					
					actvtnpage.i_click_view_icon();					
					
				}
				@Step
				public void i_validate_expend_minimize_arrows() throws Throwable {
					
					actvtnpage.i_validate_expend_minimize_arrows();
				}
				@Step
				public void i_clicked_on_Adcance_Search_for(String advanced_Search) throws Throwable {
				
						switch(advanced_Search){
							case "Orders": jsClick(actvtnpage.lnk_Advanced_Search_order); break;
							case "Location": jsClick(actvtnpage.lnk_Advanced_Search_location); break;
							case "Defect Task":jsClick(actvtnpage.lnk_Advanced_Search_defect_task);break;
							case "Task":jsClick(actvtnpage.lnk_Advanced_Search_task);break;
							default: jsClick(actvtnpage.lnk_Advanced_Search); break;
							
						}						
						waitForElement(actvtnpage.tab_closeall_tab);
						Thread.sleep(5000);					
					}
				
				@Step
				public void i_select_topology_type_and_topology_role_Advancetopologysearch(String topologytype, String topologyrole) throws Throwable {	
					 searchTopologyPage.i_select_topology_type_and_topology_role_Advancetopologysearch(topologytype,topologyrole);		
				 }
				
				@Step				
				public void i_select_circuit_type_createtab (String Ltype) throws Throwable {					
					actvtnpage.ddl_CircuitType_Createtab.selectByVisibleText(Ltype) ;
					}
				@Step
				public void Topologyactions_in_searchpage(String action) throws Throwable {
					searchTopologyPage.topology_Action(action);
				}
				
				@Step
				public void verify_validation(String validation) throws Throwable {		
					String Messag=null;
					switch(validation){
					case "Validate GDB Location Look Up": gdbcreatepage.verify_validation(validation);break;
					case "Exiting Check bos is disabled":gdbcreatepage.verify_validation(validation);break;
					case "all the fields are populated":gdbcreatepage.verify_validation(validation);break;
					case "Pun Widget window should display the results":dashboardpage.Sanity_validations(validation);break;
					case "User should be presented  with Task details screen":taskpage.verify_validation(validation);break;
					case"Assigned To should be updated to logged in user & Task Status should get updated to Assigned":taskpage.verify_validation(validation);break;
					case"External Vectoring  details and validate database":searchdevicepage.verify_validation(validation);break;
					case"Internal Vectoring  details and validate database":searchdevicepage.verify_validation(validation);break;
					case "Task Advance search dropdown values":taskpage.verify_validation(validation);break;
					case "Task search slider dropdown values":taskpage.verify_validation(validation);break;
					case "1st page 100 device list with 2nd page device list": searchdevicepage.verify_validation(validation);break;
					case "1st page 500 device list with 2nd page device list": searchdevicepage.verify_validation(validation);break;
					case "Updated bulk location":searchlocation.verify_validation(validation);break;
					case "Getnext button create action": managegetnext.verify_validation(validation);break;
					case "Getnext button update action": managegetnext.verify_validation(validation);break;
					case "Getnext button delete action": managegetnext.verify_validation(validation);break;
					case "Column headers in the Get Next Attribute Search Results page": managegetnext.verify_validation(validation);break;
					case "look up message":managegetnext.verify_validation(validation);break;
					
					case "look up message-Please enter the mandatory fields.":managegetnext.verify_validation(validation);break;
					case "look up message-The button administrative name already exists in the table. Please retry with another name.":managegetnext.verify_validation(validation);break;
					
					case "Deafult value for Administrative,Color,FontColor textbox":managegetnext.verify_validation(validation);break;
					case "Add Get Next Button Look Up Attributes":managegetnext.verify_validation(validation);break; 
					case "Address rage data":searchlocation.verify_validation(validation);break;  
       				case "Export to excel,print and pagination in manage get next buttons page":managegetnext.verify_validation(validation);break; 
					case "Search action in TRACK_USER table":managegetnext.verify_validation(validation);break; 
					case "Event Get Next track in TRACK_USER table":managegetnext.verify_validation(validation);break; 
					case "OMNIVue Audit logs in both OV and Database":searchdevicepage.verify_validation(validation);break;
					case "Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range":searchlocation.verify_validation(validation);break;
					case "Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range":searchlocation.verify_validation(validation);break; 
					case "updated Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range":searchlocation.verify_validation(validation);break; 
					case "updated Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range":searchlocation.verify_validation(validation);break; 
					
					case "Update Editable fields to null in OV location page and validate database": searchlocation.verify_validation(validation);break; 
					case "Newly created address rage and its values in DB": searchlocation.verify_validation(validation);break; 
					case "Configuration column, Refresh icon, Excel export & Print Icon is displayed in Task Related Tab":orderpage.verify_validation(validation);break;
					case "Refresh Icon, Excel export & Print Icon is displayed in Service Related Tab":orderpage.verify_validation(validation);break;
					case "Refresh icon, Edit button & Revert button is displayed in Device Related Tab":orderpage.verify_validation(validation);break;
					case "service name is displayed for HSI Order should be in services Related tab":orderpage.validate_services_related();break;
					case "Address Range id attributes in location page":searchlocation.verify_validation(validation);break;
					case "Device information is displayed in Related tab Devices in Order 360 view for Network Order":ovserachnetworkorderpage.verify_validation(validation);break;
					case "Device information is displayed in Related tab Devices in Order 360 view for Customer Order":ovserachnetworkorderpage.verify_validation(validation);break;
					case "Order History Tab, Order XML View Tab, OrderNotes Tab, Order Details Tab & Audit Logs Tab is displayed in the Order screen":orderpage.verify_validation(validation);break;
					case "Order history table should be displayed in Order screen":orderpage.verify_validation(validation);break;
					case "Configuration column, Refresh icon, Excel export, Print Icon, Get Logs & From Archieve checkbox is displayed":orderpage.verify_validation(validation);break;
					case "fallout tasks is getting updated in BAM Report on Orders":orderpage.verify_validation(validation);break;
					case "ISAT Create Log is captured in the Omnivue Audit log tab":orderpage.verify_validation(validation);break;
					case "DISPATCH Log is captured in the Omnivue Audit log tab":orderpage.verify_validation(validation);break;
					case "IMPROV Log is captured in the Omnivue Audit log tab":orderpage.verify_validation(validation);break;
					case "ISAT Modify Log is captured in the Omnivue Audit log tab":orderpage.verify_validation(validation);break;
					case "update log should be displayed in audit log on Order screen":orderpage.verify_validation(validation);break;
					case "Order Note History section displays the save note details":orderpage.verify_validation(validation);break;
					case "Cancel Order option on GPON Order Detail page":orderpage.verify_validation(validation);break;
					case "Cancel Order option on Ethernet order detail page":orderpage.verify_validation(validation);break;
					case "Remove icon for created Fiberlink in GDB": gdbcreatepage.verify_validation(validation);break;
					case "Update Editable fields in OV and validate database": searchlocation.verify_validation(validation);break;
					case "Update Editable fields in OV and validate database for location suffix and prefix": searchlocation.verify_validation(validation);break;
					case "GDB field drop down values is displayed in create screen":gdbcreatepage.GDB_Device_dropDow("OLT"); break;
					case "all fiber link got created in gdb screen":gdbcreatepage.verify_validation(validation);break;
					case "delete button is disabled in the GDB Screen on changing the device role to Ethernet":gdbcreatepage.verify_validation(validation);break;
					case "error while deleting FDH from GDB which contains FDP/Splitter":gdbcreatepage.verify_validation(validation);break;
					case "first fiber link is created only in gdb screen":gdbcreatepage.verify_validation(validation);break;
					case "adresses in Location look up for GDB device":gdbcreatepage.verify_validation(validation);break;
					case "search functionality of Fiber Build from Search slider":ovsearchfiberbuild.verify_validation(validation);break;
					case "Error message should be displayed as fields are left blank in the circuit page":searchcontact.verify_validation(validation);break;
					case "Please enter the Cell Number details in number only. message is displayed in the contact screen":searchcontact.verify_validation(validation);break;
					case "Audit logs for the fiber link remove functionality":gdbcreatepage.verify_validation(validation);break;
					case "Audit logs for the fiber link delete functionality":gdbcreatepage.verify_validation(validation);break; 
					case "Audit logs for the fiber link update functionality":gdbcreatepage.verify_validation(validation);break;  
					case "Audit logs for the fiber link create functionality":gdbcreatepage.verify_validation(validation);break;
					case "360 view for GPON Device Build on Quick search": 
									waitForElement(gdbcreatepage.lbl_GDB_buildid_value); 
									Thread.sleep(2000);			
									Messag=gdbcreatepage.lbl_GDB_buildid_value.getText().trim();
									jsClick(actvtnpage.tab_closeall_tab);
									actvtnpage.click_actscreentab("Search");	
									waitForElement(actvtnpage.tbx_Searchtab_networkbuild_buildid);
									actvtnpage.tbx_Searchtab_networkbuild_buildid.type(Messag);
									jsClick(actvtnpage.btn_networksearch);
									gdbcreatepage.verify_validation("search functionality of GDB from Search slider");
									break;
					case "360 view for GPON Build Template on Quick search":actvtnpage.verify_validation(validation);
													gdbcreatepage.verify_validation("search functionality of GDB from Search slider");
													break;
					case "Audit logs for the GDB Service area Creation & Association actions":gdbcreatepage.verify_validation(validation);break;
					case "Audit logs for the GDB Service area Creation":gdbcreatepage.verify_validation(validation);break;
					case "search functionality of GDB from Search slider":gdbcreatepage.verify_validation(validation);break;
					case "Device CLLI field is an additional search option for GDB":actvtnpage.verify_validation(validation);break;
					case "Installation Date and Opti Tap field on Device Details screen for ONT Devices":searchdevicepage.verify_validation(validation);break;
					case "Installation Date and Opti Tap field on Edit Device Details screen for ONT Devices":searchdevicepage.verify_validation(validation);break;
					case "Invalid cell number":searchcontact.verify_validation(validation);break;
					case "the Bandwidth and Provisioned Bandwidth on OMNIVue GUI and Database on the Circuit page":						
													searchcircuit.verify_validation(validation); 						
													break;
					case "the Bandwidth and Provisioned Bandwidth is updated as null on OMNIVue GUI and Database on the Circuit page":
													searchcircuit.verify_validation(validation); 						
													break;													
					case "Defect Task Reports all sections": taskpage.verify_validation(validation);break;
					case "All the fields in the advanced defect task search": taskpage.verify_validation(validation);break;
					case "Task Type hyperlinks in Defect Task Report":taskpage.verify_validation(validation);break; 
					case "Device Clli is not editable field in Device edit screen for Ethernet":searchdevicepage.verify_validation(validation);break;
					case "Device Clli is an editable field in Device edit screen for Passive":searchdevicepage.verify_validation(validation);break;
					case "Device Clli is an editable field in Device edit screen for GPON":searchdevicepage.verify_validation(validation);break;
					case "Platform ID field should be displayed in the device screen":searchdevicepage.verify_validation(validation);break;
					case "Device serach result should display only 20 records from ICL in OV Screen":searchdevicepage.verify_validation(validation);break;
					case "Device CLLI attribute is in Device edit screen for GPON":searchdevicepage.verify_validation(validation);break;
					case "MCO field on Edit Device Details screen for ONT Devices":searchdevicepage.verify_validation(validation);break;
					case "solar ARM indexing on location field in device edit screen":searchdevicepage.verify_validation(validation);break;
					case "Affiliate Owner field is not mandatory for GPON Device":devcreatepage.verify_validation(validation);break;
					case "Subscriber attribute is mandatory field in Device edit screen for Ethernet":searchdevicepage.verify_validation(validation);break;
					case "Subscriber attribute is not mandatory field in Device edit screen for Passive":searchdevicepage.verify_validation(validation);break;
					case "Subscriber attribute is not mandatory field in Device edit screen for GPON":searchdevicepage.verify_validation(validation);break;
					case "Power	Supply attribute is not mandatory field in Device edit screen for ONT role":searchdevicepage.verify_validation(validation);break;
					case "child card ports are getting consumed while creating circuit":
						actvtnpage.click_actscreentab("Create");
						selectFormType("Inventory","Circuit");
						i_select_circuit_type_createtab("Ethernet Bearer");
						createtab_launchform("any");
						
						
					waitForElement(fillfieldscls.tbx_alias1);		
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateCircuitPage", "TC23917"));
					createcircuitpage.verifyvalidation("Subscriber fill");					
						createcircuitpage.verifyvalidation("ethernet circuit with device created");
					
						Circuit_actions("Create");
						
						waitForElement(searchcircuit.btn_circuitview_edit); Thread.sleep(2000);
						
						jsClick(createcircuitpage.tab_createethernetbearer_previuos);
						searchdevicepage.verify_validation("child port is consumed by circuit");
						jsClick(searchdevicepage.tab_lasttab);
						Circuit_actions("Delete");Thread.sleep(5000);
						jsClick(createcircuitpage.tab_createethernetbearer_previuos);
						searchdevicepage.verify_validation("child port is freed by circuit");
						
						break;
						
					case "on bulk port update is updating the port status of the device":searchdevicepage.verify_validation(validation);break;
					case "Port Status on the New Device":searchdevicepage.verify_validation(validation);break;
					case "whether wire center CLLI is present while creating a device":devcreatepage.verify_validation(validation);break;
					case "a manual task gets added on selecting activation task in the device screen":searchdevicepage.verify_validation(validation);break;
					case "Network Identifiers field should be updated with new value in Device details screen":searchdevicepage.verify_validation(validation);break;
					case "Network Identifiers field should be displayed in Device details screen":searchdevicepage.verify_validation(validation);break;
					case "associated addresses data is matching with Locations related in Service area":searchserviceareapage.verify_validation(validation);break;
					case "on searching with device name Service Area view screen should be displayed":						
										Messag=searchserviceareapage.lbl_serchServicearea_devicename.getText().trim();
										Activation_click_Tab("Search");
										i_go_to_Search_type_and_select_inventory_type("Inventory","Service Area"); 
										waitForElement(actvtnpage.tbx_searchtab_serviceName_devicename);
										actvtnpage.tbx_searchtab_serviceName_devicename.type(Messag);
										actvtnpage.click_searchbtn("Service Area");						
										break;
										
					case "data is displayed in the Devices Related Tab of Service Area Screen is matcching with Device name":searchserviceareapage.verify_validation(validation);break;
					case "data is displayed in the locations Related Tab of Service Area Screen":searchserviceareapage.verify_validation(validation);break;
					case "Restricted Location dropdown list in location create page":createlocationpage.verify_validation(validation);break;
					case "Restricted Address Indicators is displayed Individual Location create form":createlocationpage.verify_validation(validation);break;
					case "address range Tab is combination of 'Low Street no.-High Street no. Street name'":searchlocation.verify_validation(validation);break;
					case "address attributes are appearing as separate input fields while searcching for address range":waitForElement(actvtnpage.btn_view); Thread.sleep(1000); searchlocation.verify_validation(validation);break;
					case "Location address saved successfully. message should be displayed in location screen":searchlocation.verify_validation(validation);break;
					case "Location Removed successfully. message should be displayed in location screen":searchlocation.verify_validation(validation);break;
					case "data displayed in the Subscribers Related Tab of Service Screen is matching with the circuit":searchcircuit.verify_validation(validation);break;
					case "data displayed in the Circuits Related Tab of Service Screen is matching with the Ethernet Bearer circuit":searchcircuit.verify_validation(validation);break;
					case "LAG circuit is displayed in the Circuit related tab":searchcircuit.verify_validation(validation);break;
					case "Ethernet Bearer circuit is displayed in the Circuit related tab":searchcircuit.verify_validation(validation);break;
					case "Circuit Deleted Successfully.-message should be displayed in the circuit page":searchcircuit.verify_validation(validation);break;
					case "Log is captured for the Create functionality in Circuit screen":searchcircuit.verify_validation(validation);break;
					case "Select DSP Role and click on delete button": gearicon.verify_validation(validation);break;
					case "Fill the valid data and click on create button": gearicon.verify_validation(validation);break;
					case "click on the create Role button without data and validate the error message":gearicon.verify_validation(validation);break;
					case "ASP Group Activity Report tab is displayed in workgroup activity report screen":gearicon.verify_validation(validation);break;
					case "Workgroup Activity Summary pie chart displayed":gearicon.verify_validation(validation);break;
					case "start time & end time in workgroup activity report screen":gearicon.verify_validation(validation);break;
					case "Circuit gets created successfully message is displayed":createcircuitpage.verifyvalidation(validation);break;
					case "Contact Detail updated successfully. message should be displayed in contact screen":searchcontact.verify_validation(validation);break;
					case "functionality of Add Device button of Alt Equipment Build":ovcreateAlternateequipbuild_Networkorder.verify_validation(validation);break;
					case "functionality of Delete Device button of Alt Equipment Build":ovcreateAlternateequipbuild_Networkorder.verify_validation(validation);break;
					case "Cancel button is displayed in ethernet Order Related Tab of Task details screen":taskpage.verify_validation(validation);break; 
					case "Order Cancel audit log should get displayed in Order details page" :orderpage.verify_validation(validation);break;
					case "All the action buttons displayed in the Action section of Autoform task API Screen":taskpage.verify_validation(validation);break; 
					case "Completed field is updated in Task Specific Info section on the completed autoform tasks" :taskpage.verify_validation(validation);break; 
					case "Task Specific Info section on the Autoform tasks":taskpage.verify_validation(validation);break; 
					case "API View is displayed for Autofomr Task Screen":taskpage.verify_validation(validation);break;
					case "Iframe view in displayed for the Non-Autoform task":taskpage.verify_validation(validation);break;
					case "API view in the Task result screen":taskpage.verify_validation(validation);break;
					case "Task Specific Info section on the completed autoform tasks":taskpage.verify_validation(validation);break;
					case "on the completed task edit dsp task button is disabled":actvtnpage.verify_validation(validation);break;
					case "General Task Details on the completed autoform tasks":taskpage.verify_validation(validation);break;
					case "Task Workflow on completed the autoform tasks":taskpage.verify_validation(validation);break;
					case "updated Qualification Information section in Device screen is getting reflected in the another tab":searchdevicepage.verify_validation(validation);break;
					case "Functional Status field as a asteriks sign in the device create screen":devcreatepage.verify_validation(validation);break;
					case "error message is displayed while creating device Functional Status is mandatory":devcreatepage.verify_validation(validation);break;
					case "API view needs to be displayed for the task selected":taskpage.verify_validation(validation);break;
					case "Start & End device details is displayed in Related System Devices section in the Circuit Screen":searchcircuit.verify_validation(validation);break;
					case "Ethernet Bearer Create form should be displayed if not available":createcircuitpage.verifyvalidation(validation);break;
					case "Optical Bearer Create form should be displayed if not available":createcircuitpage.verifyvalidation(validation);break;
					case "Success message should be displayed on the Save action along with new Transportpath gets added":searchtransportpath.verify_validation(validation);break;
					case "Success message is displayed on Delete action in Transport Path screen":searchtransportpath.verify_validation(validation);break;
					case "Success message should be displayed on the action":searchtransportpath.verify_validation(validation);break;
					case "on closing the device name look up new checkbox is selected":gdbcreatepage.verify_validation(validation);break;
					case "error message should be displayed to select functional status in GPON Device build":gdbcreatepage.verify_validation(validation);break;
					case "the device advanced search result by selecting Vector Enabled check box":actvtnpage.verify_validation(validation);
																					orderpage.Advance_Search_button_action("Device");					
																					waitForElement(actvtnpage.btn_view);
																					break;
					case "when the user opens up the expand area of a given activation, the system should display the logs related to the activation ID in the selected Row":searchdevicepage.verify_validation(validation);break;
					case "wire center clli field is not displayed in the device create screen":devcreatepage.verify_validation(validation);break;
					case "Start and End Device tabs are displayed in service screen":searchservicepage.verify_validation(validation); break;
					case "Alt Eqpt Build order number search is retrieving all the details":ovserachnetworkorderpage.verify_validation(validation);break;
					case "Cancel Order Button is displayed in Network Order Detail page":ovserachnetworkorderpage.verify_validation(validation);break;
					case "Bandwidth Upgrade Checker screen": ovBandwidthUpgradeChecker.OVCheckBandwidthSanity(); break;
					case "Transport path create screen should be displayed":transportPathPage.verify_validation(validation);break;
					case "Transport path confirmation window should be displayed to select Ethernet Bearer & Optical Bearer":transportPathPage.verify_validation(validation);break;
					case "Success message is displayed on Save action in Transport Path screen":searchtransportpath.verify_validation(validation);break;
					case "Success message is displayed on Submit action in Transport Path screen":searchtransportpath.verify_validation(validation);break;
					case "Transport Path Update screen":searchtransportpath.verify_validation(validation);break;
					case "Circuit edit Successfully-message should be displayed in the circuit page":searchcircuit.verify_validation(validation);break;
					case "360 view  for Transport path on Quick search":					
										i_go_to_Search_type_and_select_inventory_type("Inventory","Circuit"); 
										actvtnpage.ddl_circuittype.selectByVisibleText("Transport Path"); actvtnpage.click_searchbtn("Circuit");
										waitForElement(actvtnpage.btn_view);jsClick(actvtnpage.btn_view);waitForElement(searchcircuit.btn_circuitview_edit); Thread.sleep(2000);
										waitForElement(searchcircuit.lbl_TPView_startdevice_fullname);Thread.sleep(2000);
										container=searchcircuit.lbl_circuitsearch_circuitname.getText().trim();
										jsClick(actvtnpage.tab_closeall_tab);
										
										Activation_click_Tab("Search"); Thread.sleep(2000);
										
										actvtnpage.tbx_circuitname_searchslider.type(container);
										actvtnpage.click_searchbtn("Circuit");
										waitForElement(searchcircuit.btn_circuitview_edit); Thread.sleep(2000);
										
										break;
						
					case "Start device details is displayed in Related System Devices section":searchcircuit.verify_validation(validation);break;
					case "Verify AUTO Test Tag name is displayed in Manage Tags Search result page":gearicon.verify_validation(validation);break;
					case "Google Type search field  is enabled":actvtnpage.verify_validation(validation);break;
					case "SOLR Suggestions for google search":actvtnpage.verify_validation(validation);break;
					case "Add service should be displayed for the PNCO contact type in Services related Tab":searchcontact.verify_validation(validation);break;
					case "Device Name, Bearer Circuits and Device ports check box is displayed in the Topology view related tab":searchTopologyPage.validation_verify(validation);break;
					case "projectID value is displayed in the Task Result screen":taskpage.verify_validation(validation);break;
					case "Project ID column is displayed in Task Result screen":taskpage.verify_validation(validation);break;
					case "projectID field is displayed in the Task Advance Search screen": taskpage.verify_validation(validation);break;
					case "search result displayed in location search result": searchlocation.verify_validation(validation);break;
					case "No data found for search criteria message is displayed for invalid search": searchlocation.verify_validation(validation);break;
					case "all the available Address Range location fields should be displayed in Location advance screen":searchlocation.verify_validation(validation);break;
					case "all the available Individual location fields should be displayed in Location advance screen":searchlocation.verify_validation(validation);break;
					case "Update Log is captured in the Omnivue Audit log tab":orderpage.verify_validation(validation);break;
					case "Success message is displayed on the Order Screen":orderpage.verify_validation(validation);break;
					case "by default SNMP Port Number field should be updated with default value 161 in device view screen":searchdevicepage.verify_validation(validation);break;
					case "new labels and text boxes for Location in the search slider":actvtnpage.verify_validation(validation);break;
					case "Solr suggestions are getting displayed with a look up option for the Splitter in create page of GPON Device Page":gdbcreatepage.verify_validation(validation);break;
					case "Prism Nosa Certification is updated as No in the Device view screen":searchdevicepage.verify_validation(validation);break;
					case "Prism Nosa Certification is updated as Yes in the Device view screen":searchdevicepage.verify_validation(validation);break;
					case "PON header is displayed at the first column result page":orderpage.verify_validation(validation);break;
					case "Configure column attributes been displayed":orderpage.verify_validation(validation);break;
					case "SNMP Port Number field should be updated with 2556 in device view screen":searchdevicepage.verify_validation(validation);break;
					case "by default SNMP Port Number field should not get updated in device view screen":searchdevicepage.verify_validation(validation);break;
					case  "Transport Path result screen":        searchtransportpath.verify_validation(validation);break;
					case "Transport Path result screen for the incomplete": searchtransportpath.verify_validation(validation);break;
					case "Workgroup Activity Tab should be displayed containing DSP Workgroup, Start & End Date - Start Time & Generate report button":gearicon.verify_validation(validation);break;
					case "Ref Data Table is displayed for all the Application Type in the Configure screen":actvtnpage.verify_validation(validation);break;
					case "VPN ID, VPN-ID Range, VPN-ID SubRange Ethernet technology type is not displayed in the Create slider":actvtnpage.verify_validation(validation);break;
					case "Migrate card button is available in the device port related system tab in Device screen":searchdevicepage.verify_validation(validation);break;
					case "the Move card button is available in the device port related system tab with the child card information for a new device":searchdevicepage.verify_validation(validation);break;
					case "tool tip information hovering on the Swap card button, Move card button & Migrate card button in Device screen":searchdevicepage.verify_validation(validation);break;
					case "under Service Circuit Design tab we should be seeing the Google maps button & Member Service drop down should be displayed": searchservicepage.verify_validation(validation);break;
					case "Circuit details should be displayed in the Location Screen": searchlocation.verify_validation(validation);break;
					case "Delete log is registered in Audit log for Number":ovsearchnumberpage.verify_validation(validation);break;
					case "Update log is registered in Audit log for Number":ovsearchnumberpage.verify_validation(validation);break;
					case "Create log is registered in Audit log for Number":ovsearchnumberpage.verify_validation(validation);break;
					case "Service data is been displayed in the Services Related Tab":searchsubscriberpage.verify_validation(validation);break;
					case "Contact data is been displayed in the Contacts Related Tab":searchsubscriberpage.verify_validation(validation);break;
					case "Location data is been displayed in the Locations Related Tab":searchsubscriberpage.verify_validation(validation);break;
					case "Task data is been displayed in the Task Related Tab":searchsubscriberpage.verify_validation(validation);break;
					case "Circuit details should be displayed in the Subscriber Screen":searchsubscriberpage.verify_validation(validation);break;
					case "Subscriber ID is auto generated when a subscriber is created":  searchsubscriberpage.verify_validation(validation);break;
					case "New subscriber should get associated in Subscribers related tab":searchlocation.verify_validation(validation);break;
					case "Subscriber related tab section in the Location Screen":searchlocation.verify_validation(validation);break;
					case "Audit log is captured on Delete action in Subscriber screen": searchsubscriberpage.verify_validation(validation);break;
					case "Subscriber was successly deleted message should be displayed in Subscriber screen":searchsubscriberpage.verify_validation(validation);break;
					case "Audit log is captured on Update action in Subscriber screen":searchsubscriberpage.verify_validation(validation);break;
					case "success message should be displayed in Subscriber screen":searchsubscriberpage.verify_validation(validation);break;
					case  "Audit log is captured on Create action in Subscriber screen":searchsubscriberpage.verify_validation(validation);break;
					case "Card Details Saved Successfully. message should be displayed in Device Details page":searchdevicepage.verify_validation(validation);break;
					case "a warning message should be displayed stating device is being used in Device Screen":searchdevicepage.verify_validation(validation);break;
					case "Circuit details should be displayed in the Device Screen":searchdevicepage.verify_validation(validation);break;
					case "Contact data is displayed in the Device Screen":searchdevicepage.verify_validation(validation);break;
					case "Contact data is displayed in the Device Screen and validate the view icon":searchdevicepage.verify_validation(validation);break;
					case "Location data is displayed": searchdevicepage.verify_validation(validation);break;
					case "Update action type is registered under the Audit logs section in Device page": searchdevicepage.verify_validation(validation);break;
					case "Create action type is registered under the Audit logs section in Device page": searchdevicepage.verify_validation(validation);break;
					case "Activation log must be registered with Activation ID and circuit type in Device view related tab" :searchdevicepage.verify_validation(validation);break;
					case "Port status should change back to Planned in Device Screen": searchdevicepage.verify_validation(validation);break;
					case "Port status is updated as In-Service in Device Screen": searchdevicepage.verify_validation(validation);break;
					case "IPTV Unicast service should be displayed and disabled under IPTV Service Attributes Section in Edit Service page": searchservicepage.verify_validation(validation);break;
					case "IPTV Unicast service should be displayed under IPTV Service Attributes Section": searchservicepage.verify_validation(validation);break;
					case "Refresh icon should be displayed for BAM Reports Related tab in Services": searchservicepage.verify_validation(validation);break;

					case "Vectoring Topology field drop down value should contain the Device clli in Device Create screen": devcreatepage.verify_validation(validation);break;
					case "Vectoring field & Vectoring Topology should be displayed in Device Create screen": devcreatepage.verify_validation(validation);break;
					case "on selecting Vectoring Topology as Create Vectoring Topology value Topology Create Pop window should be displayed": devcreatepage.verify_validation(validation);break;
					case "a warning message should be displayed on selecting Vectoring field as External & not seleting Vectoring Topology in Device Create screen as Vectoring Topology is mandatory for External Vectoring Types." :devcreatepage.verify_validation(validation);break;
					case "on selecting Vectoring field as External in Device Create screen we should see warning message displayed as Please enter Device CLLI.." :devcreatepage.verify_validation(validation);break;
					case "Topology Create Pop window should display in Device details screen":searchdevicepage.verify_validation(validation);break;
					case "user should be able to select Internal & external drop down values under Vectoring field":searchdevicepage.verify_validation(validation);break;
					case "Vectoring field & Vectoring Topology should be editable in Device details screen":searchdevicepage.verify_validation(validation);break;
					case "Vectoring field & Vectoring Topology should be displayed in Device details screen": searchdevicepage.verify_validation(validation);break;
					case "for the ports having parent card, should display a new button as move card in Device port related tab" :searchdevicepage.verify_validation(validation);break;
					case "Only for MEF EVC/MEF OVC service should display a new related tab as Service Circuit Design":searchservicepage.verify_validation(validation);break;
					case "Configuration column icon should be displayed for BAM Reports Related tab in Services":searchservicepage.verify_validation(validation);break;
					case "Order details should be matching with the Order ID in Service page": searchservicepage.verify_validation(validation);break;
					case "Device Name should match when compared to The Device name displayed in the ENNI Link Details tab under Service Association Section":  searchservicepage.verify_validation(validation);break;
					case "Success message should be displayed on update in Service page":  searchservicepage.verify_validation(validation);break;
					case "Cable/Strand id are displaying in facility details tab of HSI/IPTV/IPTV Unicast Services": searchservicepage.verify_validation(validation);break;
					case "Associated Service table is it getting displayed in Services related tab":searchservicepage.verify_validation(validation);break;
					case "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services":searchservicepage.verify_validation(validation);break;
					case "Activation process initiated successfully. message should be displayed in the Service page":searchservicepage.verify_validation(validation);break;
					case "V and H coordinates fields are not displayed in MLTO Create form":orderpage.Order_pagevalidation(validation); break;
					case "Topology is getting created with only HOST Device": searchTopologyPage.validation_verify(validation);break;
					case "Topology is getting created with HOST & CLIENT Device": searchTopologyPage.validation_verify(validation);break;
					case "Topology having Role Host Client or Satellite and Technology Type as ALU-Nokia 7750 series in the Topology search result": searchTopologyPage.validation_verify("ALU-Nokia 7750 series");break;
					case "Topology having Role Host Client or Satellite and Technology Type as Juniper MX series in the Topology search result": searchTopologyPage.validation_verify("Juniper MX series");break;
					case "Installation date & Opti tap field is updated in Device screen":searchdevicepage.device_role_change(validation); break;
					case "Excel icon button on top of GDB create page":gdbcreatepage.verify_validation(validation);break;
					case "Search result contains same Task name":taskpage.verify_validation(validation);break;
					case "Task Status is updated as Assigned & Assigned to field is updated with logged in user": taskpage.verify_validation(validation);break;
					case "Task Status is updated as Open & Assigned to field is blank": taskpage.verify_validation(validation);break;
					case "MCO attribute is having New option as NOT_REQUIRED":searchdevicepage.device_role_change(validation); break;
					case "Search Tag, Add Tag and View All Tags action buttons in Manage Tag page is displayed":gearicon.verify_validation(validation); break;
					case "Task Type and Tag name fields are displayed in Manage Tags page is displayed":gearicon.verify_validation(validation); break;
					case "on clicking Search tags without giving the Tag name error message should be displayed as 'Please fill the mandatory fields.'": gearicon.verify_validation(validation); break;
					case "Tag Name, Description, Created By, Created Date and Delete Headers are displayed in Manage Tags search page": gearicon.verify_validation(validation); break;
					case "Excel & Print Icon displayed in Tag search result page": gearicon.verify_validation(validation); break;
					case "On Performing Delete operation Pop-up message should be displayed": gearicon.select_gearicon("Delete tag"); break;
					case "AUTO Test Tag name are displayed in Manage Tags Search result page":  gearicon.verify_validation(validation); break;
					case "Error Message should be displayed as Tag already exist for tag type 'Hoover Tasks'": gearicon.verify_validation(validation); break;
					case "Confiurecolumnslider and related Action buttons like Apply, Apply Default & Cancel inside configuration icon":taskpage.verify_validation(validation);break;
					case "View All Tags Button is displayed under Manage Tags": gearicon.verify_validation(validation); break;
					case "Search Tags Button is displayed under Manage Tags": gearicon.verify_validation(validation); break;
					case "Updated Tag name is displayed in Defect task": search_defecttaskby("by ID");taskpage.verify_validation(validation);break;
					case "View action type is registered under the Audit logs section in Servic page":searchservicepage.verify_validation(validation);break;
					case "Update action type is registered under the Audit logs section in Servic page":searchservicepage.verify_validation(validation);break;
					case "Category as NETWORK MANAGEMENT SERVICES":searchcontact.verify_validation(validation);break;
					case "Contact Detail updated successfully message is displayed": searchcontact.verify_validation(validation);break;
					case "Number updated successfully message is displayed on clicking on Save button in Number page": ovsearchnumberpage.verify_validation(validation);break;
					case "Number deleted successfully message is displayed on clicking on Delete button in Number page": ovsearchnumberpage.verify_validation(validation);break;
					case "DSL OVC in Related Tab is matching with Associated Inventory section in Number page": ovsearchnumberpage.verify_validation(validation);break;
					case "Default Gateway field is displayed along with value in Defect Task Details":taskpage.verify_validation(validation);break;
					case "MCO field is updated with null value & also verify in DB":searchdevicepage.device_role_change(validation);break;
					case "Affiliate Owner field is updated with null value & also verify in DB":searchdevicepage.device_role_change(validation);break;
					case "CLC Contact Search Results tab is displayed along the search results":searchclccontactpage.verify_validation(validation);
					case "CLC Contact Page displayed":searchclccontactpage.verify_validation(validation);
					case "Circuit table should contain View, Circuit Name, CAC, Region & Remove Headers displayed in Circuit Related tab for CLC contact page":searchclccontactpage.verify_validation(validation);
					case "Under Manage Workgroup we should see Add Workgroup, Edit Workgroup, Delete Workgroup & Workgroup list is been displayed":gearicon.verify_validation(validation); break;
					case "CLC_Contact_Create, CLC_Contact_Search & CLC_Contact_Update modules are displayed in Role permission":gearicon.verify_validation(validation); break;
					case "Warning message displayed on all the mandatory fields when create button is clicked if no data is entered in CLC Contact create page":createclccontactpage.verify_validation(validation); break;
					case "POP-Up messsage is displayed on clicking on Reset button in CLC Contact create page":createclccontactpage.verify_validation(validation);break;
					case "Customer Name is added in the CLC Contact page":createclccontactpage.verify_validation(validation);break;
					case "Contact created successfully. message is displayed in the CLC Contact create page":createclccontactpage.verify_validation(validation);break;
					case "Contact already present in the database. message is displayed in the CLC Contact create page":createclccontactpage.verify_validation(validation);break;
					case "Logical Port is created successfully with Port Id message is getting displayed":ovcreatelogicalport.verifyvalidation(validation);break;
					case "Please enter valid Email ID message is displayed in the CLC Contact create page":createclccontactpage.verify_validation(validation);break;
					case "Please enter a valid telephone number. message is displayed in the CLC Contact create page":createclccontactpage.verify_validation(validation);break;
					case "Print button is displayed CLC Contact Search Results":searchclccontactpage.verify_validation(validation);break;
					case "Excel export button is displayed CLC Contact Search Results":searchclccontactpage.verify_validation(validation);break;
					case "CLC contact is saved successfully. message is displayed in the CLC Contact page":searchclccontactpage.verify_validation(validation);break;
					case "Modified values are reflecting in CLC Contact page": searchclccontactpage.verify_validation(validation);break;
					case "Audit log captured the Update log on the new changes in the CLC Contact page":searchclccontactpage.verify_validation(validation);break;
					case "Audit log captured Delete action in the CLC Contact page": searchclccontactpage.verify_validation(validation);break;
					case "Add Widget drop down field should be displayed containing Inventory, Network Build, Order, Reports, Tasks & IFrame Widgets values":dashboardpage.Sanity_validations(validation);break;
					case "Apart from My Dashboard default options like Google Type search option, Gear Icon, Help Icon, Search Tab & Create Tab is not been disturbed":actvtnpage.verify_validation(validation);break;
					case "Inventory under Add Widget from My Dashboard":dashboardpage.Sanity_validations(validation);break;
					case "Resize, Edit & Remove icons should be displayed under My Dashboard":dashboardpage.Sanity_validations(validation);break;
					case "Network Build under Add Widget from My Dashboard" : dashboardpage.Sanity_validations(validation);break;
					case "Order under Add Widget from My Dashboard":dashboardpage.Sanity_validations(validation);break;
					case "Reports under Add Widget from My Dashboard":dashboardpage.Sanity_validations(validation);break;
					case "Tasks under Add Widget from My Dashboard" :dashboardpage.Sanity_validations(validation);break;
					case "Iframe Widgets under Add Widget from My Dashboard":dashboardpage.Sanity_validations(validation);break;
					case "Multiple Subscriber can be linked in Customer name field":createclccontactpage.verify_validation(validation);break;
					case "Multiple Subscribers displayed in the CLC Contact page":searchclccontactpage.verify_validation(validation);break;
					case "Please associate atleast one customer. message should be displayed":searchclccontactpage.verify_validation(validation);break;
					case "On Associating the same subscriber an message should be displayed as -You cannot associate duplicate company/customer.":searchclccontactpage.verify_validation(validation);break;
					case "On Associating the same subscriber through Look up an message should be displayed as -You cannot associate duplicate company/customer.": searchclccontactpage.verify_validation(validation);break;
					case "Please enter value for CAC. message is diplayed on serching CAC lookup without any value in CLC contact page": searchclccontactpage.verify_validation(validation);break;
					case "Please enter value for Circuit. message is diplayed on serching Circuit lookup without any value in CLC contact page": searchclccontactpage.verify_validation(validation);break;
					case "On associating the same address in GDB Service area are we seeing Duplicate address(es) present in selection, duplicate address(es) will not be added to service area. message getting displayed":gdbcreatepage.verify_validation(validation);break;
					case "Upstream and Downstream values of the HSI+IPTV Order and Service detail page are matching": searchorderpage.verify_validation(validation);break;
					case "Max Upstream & Downstream values should be displayed in the HSI service view": searchservicepage.verify_validation(validation);break;
					case "Max Upstream & Downstream fields should display in TB, GB, MB, KB sub values in edit service view": searchservicepage.verify_validation(validation);break;
					case "updated Network element role, Provision Status is also updated in the GDB page":gdbcreatepage.verify_validation(validation);break;
					case "fields displayed in edit view of fiber links": gdbcreatepage.verify_validation(validation);break;
					case "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask":devcreatepage.verify_validation(validation);break;
					case "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway":devcreatepage.verify_validation(validation);break;
					case "Management IP Subnet Mask & default gateway values are displayed in Device details page and validated in Database" :searchdevicepage.verify_validation(validation);break;
					case "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Device view":searchdevicepage.verify_validation(validation);break;
					case "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Circuit view":searchcircuit.verify_validation(validation);break;
					case "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Service view":servicedetailpage.verify_validation(validation);break;
					case "Management IP Subnet Mask & default gateway values should display blank in Device details page":searchdevicepage.verify_validation(validation);break;
					case "on entering alpha-numberic chanracter in the Management IP Subnet Mask, we are getting the message as-Please enter valid data for - Management IP Subnet Mask in Device view page":searchdevicepage.verify_validation(validation);break;
					case "on entering alpha-numberic chanracter in the Default Gateway, we are getting the message as-Please enter valid data for - Default Gateway in Device view page":searchdevicepage.verify_validation(validation);break;
					case "enter valid Management IP subnet mask & Default gateway in Device view page":
						Thread.sleep(2000);
						//fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage","TC246190"));
						//fillMandatoryFields(searchdevicepage,get_data_for_page(searchdevicepage).getContainer("TC246190"));
						//fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage","TC246190","Update_networktab"));
						searchdevicepage.verify_validation(validation);
						break;
					case "Inventory widget under My Dashboard is displayed":dashboardpage.Sanity_validations(validation);break;
					case "edit inventory widget under My Dashboard":dashboardpage.Sanity_validations(validation);break;
					case "Widget window should display the results":dashboardpage.Sanity_validations(validation);break;
					case "alert message should be displayed as -Please fill in the mandatory fields when create QOS is initiated":ovcreateqostemplate.verify_validation(validation);break;
					case "alert message should be displayed on entering alpha-numeric character in QOS Template":ovcreateqostemplate.verify_validation(validation);break;
					
					case "Success messsage should be displayed as - QOS template created Successfully in QOS Template page": ovcreateqostemplate.verify_validation(validation);break;
					case "a message should be displayed on entering invalid value in QOS Template as - Incorrect partition value":ovsearchqostemplate.verify_validation(validation);break;
					case "success message should be displayed as - QOS Template has been updated in QOS Template":ovsearchqostemplate.verify_validation(validation);break;
					case "Audit logs shoulld have the logs for Edit & create for QOS Template":ovsearchqostemplate.verify_validation(validation);break;
					case "QoS Template list view is displayed when search is performed":ovsearchqostemplate.verify_validation(validation);break;
					case "Bulk Contact Upload tab fields in CLC Contact":searchclccontactpage.verify_validation(validation);break;
					case "Submit button is not enabled without uploading an template and entering a Group Name in CLC contact": searchclccontactpage.verify_validation(validation);break;
					case "fields that are enabled by selecting different Search by conditions under CLC contact search Slider":actvtnpage.verify_validation(validation);break;
					case "Defect Task Report Tab is displayed with OV Workgroup, Start & End Date with Time and Generate-reports with reset button displayed":
									gearicon.verify_validation(validation);break;
						
					case "OV Workgroup should Single value selected drop down in Defect Task Report Tab":gearicon.verify_validation(validation);break;
					case "under Open to Completed Task Stats section we should be seeing Duration Mean, Duration Mode & Duration Median fields with values been displayed in Defect Task Report":gearicon.verify_validation(validation);break;
					case "under Tasks Interaction Stats section we should be seeing Number of User Touches, Number of Status Changes & Average Duration Open to Claim/Assign fields with values been displayed in Defect Task Report":
									gearicon.verify_validation(validation);break;
					case "under Volume Summary section we should be seeing Total Task, Tasks Completed, Tasks not completed, Number of Task types & Number of Users Touching Tasks fields with values been displayed in Defect Task Report":
									gearicon.verify_validation(validation);break;
					case "Total tasks link should launch a new tab and should display all the task details": 	gearicon.verify_validation(validation);break;
					case "Network Identifier column has to be added to defect task result list view": 
						//browser_zoom_out(2);
						taskpage.verify_validation(validation);break;
					case "Defect Task Report should be displayed under the Gear Icon":gearicon.verify_validation(validation);break;
					case "under By User ID section we should see table having CUID, First Name, Last Name, Number of Task Types, Completed, Claimed, Total Count and Claimed but Released headers displyed in Defect Task Report":
						gearicon.verify_validation(validation);break;
					case "Generate Reports button is disabled under By Task type in Defect Task Report":gearicon.verify_validation(validation);break;
					case "all the fields displayed for the Task Report: Task Names in Defect Task Report":gearicon.verify_validation(validation);break;
					case "Select at-least one Preferred method of contact. message should be displayed in contact page":ovcreatecontactpage.verify_validation(validation);break;
					case "Add subscriber functionality in Contact screen":searchcontact.verify_validation(validation);break;
					case "Manual Refresh icon should is displayed for each tab in Contact screen":searchcontact.verify_validation(validation);break;
					case "the Vector Enabled check box instead of Include vectoring check box in device search slider":actvtnpage.verify_validation(validation);break;
					case "Include Vectoring Info checkbox on search slider should be displayed":actvtnpage.verify_validation(validation);break;
					case "the device search result by selecting Vector Enabled check box in search slider":actvtnpage.verify_validation(validation);break;
					case "Vectoring Type and Vectoring Topology table header should be in device search result page": browser_zoom_in();				
																													actvtnpage.verify_validation(validation);break;
					case "Vectoring Type and Vectoring Topology table header should not be in device search result page": actvtnpage.verify_validation(validation);break;
					case "Vectoring Type dropdown should display '384 Internal' value for device having role like TD,OLT,DSLAM,MSAP,NID":devcreatepage.verify_validation(validation);break;
					case "Vectoring Type dropdown should display '192 Internal','384 Internal' and '384 External' value for device having role like TD,OLT,DSLAM,AGG": devcreatepage.verify_validation(validation);break;
					case "Vectoring Type dropdown should display '192 Internal' and '384 External' value for device having role like DSLAM,MSAP": devcreatepage.verify_validation(validation);break;
					case "Vectoring Type dropdown should display '192 Internal' and '384 External' value for device having role like TD,OLT,DSLAM,MSAP": devcreatepage.verify_validation(validation);break;
					case "Vectoring Type dropdown should display '192 Internal' value for device having role like TD,DSLAM,AGG": devcreatepage.verify_validation(validation);break;
					case "an error message should be displayed as 'There are No vectoring types for current device subtype' in device create page": devcreatepage.verify_validation(validation);break;
					case "Job should get created message should be displayed along with the table displayed in CLC contact page":searchclccontactpage.verify_validation(validation);break;
					case "Contact details should contains two sections Step1:Enter Contact Details and Step 2:Enter Circuit Details in CLC contact page": searchclccontactpage.verify_validation(validation);break;
					case "User result screen tab should be displyed with User details under Manage User screen":gearicon.verify_validation(validation);break;
					case "Create logs are captured in the Service area Audit logs":searchserviceareapage.verify_validation(validation);break;
					case  "Service area view screen atrributes are displayed":searchserviceareapage.verify_validation(validation);break;
					case "Service Area updated successfully message should be displayed in Service area screen": searchserviceareapage.verify_validation(validation);break;
					case "Update logs are captured in the Service area Audit logs": searchserviceareapage.verify_validation(validation);break;
					case "Delete logs are captured in the Service area Audit logs": searchserviceareapage.verify_validation(validation);break;
					case "Assocaited locations should be displayed in Service area screen": searchserviceareapage.verify_validation(validation);break;
					case "Link was created successfully messgae should be displayed":ovcreatelinkpage.verify_validation(validation);break;
					case "Link Deleted successfully. messgae should be displayed": ovsearchlinkpage.verify_validation(validation);break;
					case "in audit logs Delete logs are captured for the Link": ovsearchlinkpage.verify_validation(validation);break;
					case "Assigned To & Task Status should get updated to Assigned state":taskpage.verify_validation(validation);break;
					case "Assigned To & Task Status should get updated to open state":taskpage.verify_validation(validation);break;
					case "Link Detail Edited successfully. messgae should be displayed":ovsearchlinkpage.verify_validation(validation);break;
					case "in audit logs Update logs are captured for the Link": ovsearchlinkpage.verify_validation(validation);break;
					case  "any data is displayed in the Circuits related Tab" : ovsearchlinkpage.verify_validation(validation);break;
					case "alert message should be displayed as -Please fill in the mandatory fields when create Address range is initiated":createlocationpage.verify_validation(validation);break;
					case "Address Range should get created successfully message should be displayed in create address range page":createlocationpage.verify_validation(validation);break;
					case "Create Addresses Within Range create form should be displayed":createlocationpage.verify_validation(validation);break;
					case "alert message should be displayed as -Please fill in the mandatory fields when Create Addresses within range is initiated":createlocationpage.verify_validation(validation);break;
					case "warning message should be displayed as Please Re-enter Address# , It should fall between Low Street# - High Street#": createlocationpage.verify_validation(validation);break;
					case "New locations added within range should be displayed in the Address range location related tab":searchlocation.verify_validation(validation);break;
					case "no locations should be displayed in the Address range location related tab":searchlocation.verify_validation(validation);break;
					case "Location address created successfully message should be displayed in create address range page": createlocationpage.verify_validation(validation);break;
					case "Add Next Address button should be disabled for individual location":searchlocation.verify_validation(validation);break;
					case "Activation log must be registered with Activation ID and circuit type in Service view related tab":searchservicepage.verify_validation(validation);break;

					case "PM Type does not contain any value in Service page": searchservicepage.verify_validation(validation);break;
					case "BAM event logs should be displayed":searchservicepage.verify_validation(validation);break;
					case "Address id and Address range dropdown in edit Individual location page within range":searchlocation.verify_validation(validation);break;
					case "Device details and validate database": searchdevicepage.verify_validation(validation);break;
					case "Updated Device details and validate database": searchdevicepage.verify_validation(validation);break;
					case "Updated Network details and validate database": searchdevicepage.verify_validation(validation);break;
					case "Update action log is registered under the Audit logs section in Device page": searchdevicepage.verify_validation(validation);break;
					case "Updated fields in DB for circuit": searchcircuit.verify_validation(validation);break;
					
					}
				}
				
				
				
				@Step
				public void search_defecttaskby(String criteria) throws Throwable {
					switch(criteria){
					case "by Task Name": 	String taskname=taskpage.search_defecttaskby(criteria);					
					
											slf4jLogger.info("Taskname:"+taskname);
					
											jsClick(actvtnpage.tab_closeall_tab);
											actvtnpage.click_actscreentab("Search");
					
											actvtnpage.tbx_Defecttask_taskname.type(taskname); 
											waitForElement(getDriver().findElement(By.xpath(".//*[@aria-selected='true']//*[text()='"+taskname+"']")));
											jsClick(getDriver().findElement(By.xpath(".//*[@aria-selected='true']//*[text()='"+taskname+"']")));
											break;
											
					case "by ID": String taskid=taskpage.lbl_Defecttask_taskid.getText().trim();
											slf4jLogger.info("TaskID:"+taskid);
											jsClick(actvtnpage.tab_closeall_tab);
											actvtnpage.click_actscreentab("Search");
											if(actvtnpage.btn_defectTask_status_closeicon.isCurrentlyVisible()){
												jsClick(actvtnpage.btn_defectTask_status_closeicon);
											}
											
											actvtnpage.tbx_Defect_Task_ID.type(taskid);
											actvtnpage.click_searchbtn("Defect Task");waitForElement(actvtnpage.tab_closeall_tab);
											if(taskpage.btn_defecttask_viewtask.isCurrentlyVisible()){
												jsClick(taskpage.btn_defecttask_viewtask);
											}waitForElement(taskpage.btn_defecttask_Complete);break;
											
					
					}
					
				}
				@Step
				public void duplicate_value() throws Throwable{
					
					gearicon.duplicate_audit_focus();
					
				} 
				
				@Step
				public void select_gearicon(String type) {
					
					gearicon.select_gearicon(type);					
				}
				
				@Step
				public void manageuser_actions(String type) {
					
					gearicon.manageuser_actions(type);	
				}
				
				@Step
				public void mnguserfilerby(String wgrp) {
					
					gearicon.mnguserfilerby(wgrp);	
					}
				
				@Step
				public void mnguserfilertext_type(String usrname) {
					
					gearicon.mnguserfilertext_type(usrname);	
					}
				
				@Step
				public void gearicon_viewmanageusers() {
					gearicon.gearicon_viewmanageusers();
				}
				
				@Step
				public void create_tag_ManageTag(String name) {
					
					gearicon.create_tag_ManageTag(name);	
				}
				@Step
				public void create_tag_ManageTag1(String name) {
					
					gearicon.create_tag_ManageTag1(name);	
				}
				
				@Step
				public void contact_action(String action) throws Throwable {
					switch(action){
					case "Select checkboxes":ovcreatecontactpage.verify_validation(action);break;
					case "Create":ovcreatecontactpage.verify_validation(action);break;
					case "Uncheck the preferred contact in Contact page":ovcreatecontactpage.verify_validation(action);break;
					case "Select at-least one Preferred method of contact. message should be displayed in contact page":ovcreatecontactpage.verify_validation(action);break;
					case "Please enter the Cell Number details in number only.":ovcreatecontactpage.verify_validation(action);break;
					default:searchcontact.verify_validation(action);break;
					
					}
					
				}
				
				@Step
				public void Number_screenActions(String action) throws Throwable {	
					switch(action){
					case "Create": ovcreatenumberpage.Number_screenActions(action);
					default : ovsearchnumberpage.Number_screenActions(action);
					
					}
					
				}
				
				@SuppressWarnings("unused")
				@Step
				public void i_update_something(String changes) throws Throwable{
					String devicename;
					switch(changes){
					case "Validate cable id & StartStrand ID casecade functionality" : gdbcreatepage.verify_validation(changes);break;
					case "select a port from Device z and verify the warning message" : gdbcreatepage.verify_validation(changes);break;
					case "Create CLC contact": actvtnpage.click_actscreentab("Create"); selectFormType("Inventory","CLC Contact");actvtnpage.btn_Netwrkbuildcreate("any");
					fill_fields_basedon_type("OVCreateCLCContactPage", "TC243501", "Createform");
					action_clccontact("Create");
					break;
					case "enter valid Management IP subnet mask & Default gateway in Device view page":
						Thread.sleep(2000);
						//fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage","TC246190"));
						//fillMandatoryFields(searchdevicepage,get_data_for_page(searchdevicepage).getContainer("TC246190"));
						fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage","TC246190","Update_networktab"));
						//searchdevicepage.verify_validation(changes);
						break;
					case "search for the Order using DTN in advance search screen":orderpage.verify_validation(changes);
					
					break;
					case "enter a log inside the notes section in order screen":orderpage.verify_validation(changes);break;
					case "search the contact with first name as Auto":searchcontact.verify_validation(changes);break;
					case "change the location details in device edit screen":searchdevicepage.verify_validation(changes);break;
					case "add 200 more Service area component on GDB Screen":gdbcreatepage.verify_validation(changes);break;
					case "fill all the mandatory fields present for Service area in GDB screen":gdbcreatepage.verify_validation(changes);break;
					case "changed the role from GPON to Ethernet in device page":searchdevicepage.verify_validation(changes);break;
					case "search for the FDP device & associate the device to the FDH device in inventory":searchdevicepage.verify_validation(changes);break;
					case "select the first link checkbox in GDB fiber screen":gdbcreatepage.verify_validation(changes);break;
					case "select multiple ports from Device A and Device Z in GDB fiber link screen":gdbcreatepage.verify_validation(changes);break;
					case "search Fiber Build based on device name":actvtnpage.verify_validation(changes);break;
					case "modify the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen":gdbcreatepage.verify_validation(changes);break;
					case "Change the cable id, Strand ID & Arial/Buried fields in the GDB fiber link screen":gdbcreatepage.verify_validation(changes);break;
					case "select ports from Device A and Device Z in GDB fiber link screen":gdbcreatepage.verify_validation(changes);break;
					case "select ports from Device A and Device Z in 2nd GDB fiber link screen":gdbcreatepage.verify_validation(changes);break;
					case "select all ports from Device A and Device Z in GDB fiber link screen":gdbcreatepage.verify_validation(changes);break;
					case "enter Initiated by field with a value for GDB":actvtnpage.verify_validation(changes);break;
					case "enter template name as test for GPON Build Templates":actvtnpage.verify_validation(changes);break;
					case "remove the associated address in GDB Service area":gdbcreatepage.verify_validation(changes);break;
					case "enter Device Address field with a value for GDB":actvtnpage.verify_validation(changes);break;
					case "enter Device clli field with a value for GDB":actvtnpage.verify_validation(changes);break;
					case "search with User ID criteria":searchcircuit.verify_validation(changes);break;
					case "Update editable fields in the circuit edit screen":searchcircuit.verify_validation(changes);break;
						
					case "modify the Bandwidth and Provisioned Bandwidth value to null on the Circuit page":searchcircuit.verify_validation(changes);break;
					case "modify the Bandwidth and Provisioned Bandwidth on the Circuit page":searchcircuit.verify_validation(changes);break;
					case "select a MST device in the Fiber Distribution Node":devcreatepage.verify_validation(changes);break;
					case "select Create Activation Task in Device Create Screen":devcreatepage.verify_validation(changes);break;
					case "update the Network Identifiers in Device details screen":searchdevicepage.verify_validation(changes);break;
					case "associate multiple location in Service Area create screen":createserviceareapage.verify_validation(changes);break;
					case "associate more than addresses in edit Service area screen":searchserviceareapage.verify_validation(changes);break;
					case "click on audit log tab to verify a log is captured for Update action in Location screen":searchlocation.verify_validation(changes);break;
					case "change the range value & street name in address range page":searchlocation.verify_validation(changes);break;
					case "click on audit log tab to verify a log is captured for Create action in Location screen":searchlocation.verify_validation(changes);break;
					case "click on audit log tab to verify a log is captured for Delete action in Location screen":searchlocation.verify_validation(changes);break;
					case "click on Audit Tab in Circuit Screen to verify the log is been registered for Delete action":searchcircuit.verify_validation(changes);break;
					case "change the name in the circuit edit screen":searchcircuit.verify_validation(changes);break;
					case "modify the firstname, lastname, category & type in edit contact screen":searchcontact.verify_validation(changes);break;
					case "click on the view task button in the Orders details screen":orderpage.verify_validation(changes);break;
					case "select Task Status as completed under search slider":actvtnpage.verify_validation(changes);break;
					case "update the Qualification Information section in Device screen":searchdevicepage.verify_validation(changes);break;
					case "open again the same device in another tab": 
												waitForElement(searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name); Thread.sleep(4000);
												devicename=searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();
												actvtnpage.click_actscreentab("Search");
												i_go_to_Search_type_and_select_inventory_type("Inventory","Device");
												waitForElement(actvtnpage.tbx_deviceName);
												actvtnpage.tbx_deviceName.type(devicename);Thread.sleep(1000);
												actvtnpage.click_searchbtn("Device");Thread.sleep(4000);
												waitForElement(searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name);Thread.sleep(2000);												
												jsClick(searchdevicepage.tab_activescreen_prvioussibling);Thread.sleep(2000);
												break;
												
					case "select circuit from the drop down in Transport path create screen":transportPathPage.verify_validation(changes);break;
					case "search Alt Equip build based Created by criteria":actvtnpage.verify_validation(changes);break;
					case "launch the Transport path Create form":
										devicename=searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();
										Activation_click_Tab("Create");
										selectFormType("Network Build","Transport Path");Thread.sleep(2000);
										actvtnpage.ddl_searchtab_networkbuild_transportpath_devicerole.selectByVisibleText("DSLAM");
										waitForElement(actvtnpage.tbx_searchtab_networkbuild_transportpath_devicename);
										actvtnpage.tbx_searchtab_networkbuild_transportpath_devicename.type(devicename);
										actvtnpage.btn_Netwrkbuildcreate("Transport Path");Thread.sleep(2000); waitForElement(transportPathPage.lbl_TP_confirmation); 
										break;
										
					case "click on Audit Tab in Circuit Screen to verify the log is been registered for Update action":searchcircuit.verify_validation(changes);break;
					case "update the Alias fields in the circuit screen":searchcircuit.verify_validation(changes);break;
					case "click on GO button":actvtnpage.click_GO_button();break;
					case "search with Contact Type as PNCO first name as AUTO and role as circuit":searchcontact.verify_validation(changes);break;
					case "validate the Avaliable Bandwidth and Provisioned Bandwidth in Ethernet Bearer circuit View/Edit page":searchcircuit.verify_validation(changes); break;
					case "validate the check boxes in next page with google maps is enabled in the Topology view related tab":searchTopologyPage.validation_verify(changes);break;
					case "validate the check boxes in next page is displayed in the Topology view related tab":searchTopologyPage.validation_verify(changes);break;
					case "enter EVPL812 value inside project ID field in Task Advance Search screen":taskpage.verify_validation(changes);break;
					case "enter valid in address line1 and address line2 in Location Advance Search screen":searchlocation.verify_validation(changes);break;
					case "enter invalid in address line1 and address line2 in Location Advance Search screen":searchlocation.verify_validation(changes);break;
					case "enter the customer name as Infrastructure in order advance search":orderpage.verify_validation(changes);break;
					case "search for the GPON Device Build data in search slider":actvtnpage.verify_validation(changes);break;
					case "change the Prism Nosa Certification status to No in Device details page":searchdevicepage.verify_validation(changes);break;
					case "set the Prism Nosa Certification to Yes in Device Create form": devcreatepage.verify_validation(changes);break;
					case "move the PON header to the top list & click on the apply button":orderpage.verify_validation(changes);break;
					case "set a value SNMP Port number in Device create page":devcreatepage.verify_validation(changes);break;
					case "update the SNMP Port number with 2556 in the Network detail edit screen":searchdevicepage.verify_validation(changes);break;
					
					case "search for the Transport path data in search slider":   
											i_go_to_Search_type_and_select_inventory_type("Inventory","Circuit"); 
											actvtnpage.ddl_circuittype.selectByVisibleText("Transport Path"); actvtnpage.click_searchbtn("Circuit");
											waitForElement(actvtnpage.btn_view);jsClick(actvtnpage.btn_view);waitForElement(searchcircuit.btn_circuitview_edit); Thread.sleep(2000);
											waitForElement(searchcircuit.lbl_TPView_startdevice_fullname);Thread.sleep(2000);
											if(searchcircuit.lbl_TPView_startdevice_fullname.getText().trim().contains("-DSLAM")){
												devicename="DSLAM";
											} else if(searchcircuit.lbl_TPView_startdevice_fullname.getText().trim().contains("-NID")){
												devicename="NID";
											}else {
												devicename="BRAS";
											}
											//System.out.println("searchcircuit.lbl_TPView_startdevice_fullname.getText():"+searchcircuit.lbl_TPView_startdevice_fullname.getText());
											container=searchcircuit.lbl_TPView_startdevicename_hyperlink.getText();
											
											Activation_click_Tab("Search");
											Search_selectsearchtype("Network Build");
											select_Networktype("Transport Path");Thread.sleep(2000);
											actvtnpage.ddl_searchtab_networkbuild_transportpath_devicerole.selectByVisibleText(devicename);
											
											actvtnpage.tbx_searchtab_networkbuild_transportpath_devicename.type(container);
											Thread.sleep(1000);
											break;
											
					case "enter the Transport path data in Create slider":
											i_go_to_Search_type_and_select_inventory_type("Inventory","Circuit"); 
											actvtnpage.ddl_circuittype.selectByVisibleText("Transport Path"); actvtnpage.click_searchbtn("Circuit");
											waitForElement(actvtnpage.btn_view);jsClick(actvtnpage.btn_view);waitForElement(searchcircuit.btn_circuitview_edit); Thread.sleep(2000);
											waitForElement(searchcircuit.lbl_TPView_startdevice_fullname);Thread.sleep(2000);
											if(searchcircuit.lbl_TPView_startdevice_fullname.getText().trim().contains("-DSLAM")){
												devicename="DSLAM";
											} else if(searchcircuit.lbl_TPView_startdevice_fullname.getText().trim().contains("-NID")){
												devicename="NID";
											}else {
												devicename="BRAS";
											}
											//System.out.println("searchcircuit.lbl_TPView_startdevice_fullname.getText():"+searchcircuit.lbl_TPView_startdevice_fullname.getText());
											container=searchcircuit.lbl_TPView_startdevicename_hyperlink.getText();
											Activation_click_Tab("Create");
											selectFormType("Network Build","Transport Path");Thread.sleep(2000);
											actvtnpage.ddl_searchtab_networkbuild_transportpath_devicerole.selectByVisibleText(devicename);
											waitForElement(actvtnpage.tbx_searchtab_networkbuild_transportpath_devicename);
											actvtnpage.tbx_searchtab_networkbuild_transportpath_devicename.type(container);
											actvtnpage.btn_Netwrkbuildcreate("Transport Path");Thread.sleep(2000);  
											break;
											
						
					case "select device role & name in the Search slider": 
						actvtnpage.click_actscreentab("Search");
						break;
					case "launch the location displayed in the related tab screen":searchlocation.verify_validation(changes);break;
						
						
														
					case "launch the SDP Number type Create form & fill the mandatory fields": 
										if(ovcreatenumberpage.tab_createnumber.isCurrentlyVisible()){
											jsClick(ovcreatenumberpage.btn_tab_createnumber_clsicon);Thread.sleep(1000);
										}
										actvtnpage.click_actscreentab("Create");
										actvtnpage.createtab_inventory_number_typeselect("SDP");
										
										actvtnpage.btn_Netwrkbuildcreate("any");				
										ovcreatenumberpage.fill_createfilds("OVCreateNumberPage",changes,"NumberPage");
										
										break;
					case "select object type as Port & fill the details in Number page":
																actvtnpage.click_actscreentab("Search");
																i_go_to_Search_type_and_select_inventory_type("Inventory","Circuit");
																actvtnpage.ddl_circuittype.selectByVisibleText("Ethernet Bearer");
																actvtnpage.click_searchbtn("Circuit");
																waitForElement(actvtnpage.btn_view);
																devicename=getDriver().findElement(By.xpath("//div[starts-with(@id,'row0jqxGrid')]/div[5]/div")).getText().trim();
																jsClick(ovcreatenumberpage.tab_createnumber);
																
															/*	ovcreatenumberpage.ddl_Numbercreate_Objecttype.selectByVisibleText("Port");
																ovcreatenumberpage.ddl_Numbercreate_relationtype.selectByVisibleText("CE-VLAN -> VLAN Interface");*/
																
																switch(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//select[@id='DIMNUMBER2DIMNUMBERTYPE']/option[@selected='selected']")).getText().trim()){
																case "MEP-ID":	ovcreatenumberpage.ddl_Numbercreate_Objecttype.selectByVisibleText("Port");
																				ovcreatenumberpage.ddl_Numbercreate_relationtype.selectByVisibleText("MEP -> EVC Member");
																	
																				break;
																	
																case "CE-VLAN":ovcreatenumberpage.ddl_Numbercreate_Objecttype.selectByVisibleText("Service");
																				waitForElement(ovcreatenumberpage.ddl_Numbercreate_relationtype);
																				
																				ovcreatenumberpage.ddl_Numbercreate_relationtype.selectByVisibleText("CE-VLAN -> DSL OVC");
																				
																				if(ovcreatenumberpage.btn_Numbercreate_Objectlookup.isCurrentlyVisible()){
																					verify_validation("Service Select in lookup");
																				}
																		}
																waitForElement(ovcreatenumberpage.btn_Numbercreate_Devicelookup);
																jsClick(ovcreatenumberpage.btn_Numbercreate_Devicelookup);
																waitForElement(ovcreatenumberpage.btn_Numbercreate_Devicelookup_lookupicon);
																ovcreatenumberpage.tbx_Numbercreate_Devicelookup_deviceclli.type(devicename);
																jsClick(ovcreatenumberpage.btn_Numbercreate_Devicelookup_lookupicon);
																waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//a[text()='"+devicename+"']")));
																jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//a[text()='"+devicename+"']")));
																Thread.sleep(2000);
																
																jsClick(ovcreatenumberpage.btn_Numbercreate_Portlookup);
																waitForElement(ovcreatenumberpage.btn_Numbercreate_Portlookup_lookuoicon);
																ovcreatenumberpage.ddl_Numbercreate_Portlookup_porttype.selectByVisibleText("VLAN Interface (T)");
																jsClick(ovcreatenumberpage.btn_Numbercreate_Portlookup_lookuoicon); Thread.sleep(2000);
																waitForElement(ovcreatenumberpage.lbl_Numbercreate_Portlookup_lookuoicon_result);Thread.sleep(3000);
																jsClick(ovcreatenumberpage.lbl_Numbercreate_Portlookup_lookuoicon_result);
																/*
																waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@ng-show='showTableServicePortLookUp' and @class='']//a[@ng-click='closePortDataLookUp(port)'])[1]"))); Thread.sleep(10000);
																jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//a[@ng-click='closePortDataLookUp(port)'])[1]")));
																sd*/
																break;
					case "launch the subscriber by clicking on the view icon in the related tab":searchsubscriberpage.verify_validation(changes);break;
					case "search for circuit having subscriber data": searchsubscriberpage.verify_validation(changes);break;
					case "modify the fields in Subscriber Screen":searchsubscriberpage.verify_validation(changes);break;
					case "Add the card details and Click on Add Card":searchdevicepage.verify_validation(changes);break;
					case "select the card details and Click on Add Card":searchdevicepage.verify_validation(changes);break;
					case "add the child card to the added card in device port":searchdevicepage.verify_validation(changes);break;
					case "create a Link using FDP and SPLITTER devices": ovcreatelinkpage.verify_validation(changes);break;
					case "click on the Device hyperlink displayed in the Link View Screen":ovsearchlinkpage.verify_validation(changes);break;
					case "create a Link using SPLITTER and FDP devices":ovcreatelinkpage.verify_validation(changes);break;
					case "create a circuit filling all the mandatory fields using SPLITTER and FDP devices":createcircuitpage.verifyvalidation(changes);break;
					case "click on the Device hyperlink displayed in the Circuit Screen":searchcircuit.verify_validation(changes);break;
					case "create a circuit filling all the mandatory fields using FDP and SPLITTER devices":createcircuitpage.verifyvalidation(changes);break;
					case "select Devices displayed in the Orders screen":orderpage.order_view_page_validation(changes);break;
					case "search for the Device assocaited to Service":
																	waitForElement(searchdevicepage.btn_shelfexpand); 
																	
																	devicename=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+']/../../td[10])[1]")).getText().trim();
																	actvtnpage.click_actscreentab("Search");
																	i_go_to_Search_type_and_select_inventory_type ("Inventory", "Device");
																	actvtnpage.tbx_deviceName.type(devicename);actvtnpage.click_searchbtn("Device");waitForElement(searchdevicepage.btn_device_Editbtn);						
																		break;
					case "remove the reserved port in Device Detail Page": searchdevicepage.verify_validation(changes);break;
					case "fill all the mandatory fields in the Reserve port pop up window in Device Screen": searchdevicepage.verify_validation(changes);break;
					case "expand the shelf having status as Planned in Device Screen": searchdevicepage.verify_validation(changes);break;
					case "enter Location details in Device Create screen": devcreatepage.verify_validation(changes);break;
					case "should be able to select Internal & external drop down values under Vectoring field in Device Create screen": devcreatepage.verify_validation(changes);break;
					case "select Vectoring field as External & Vectoring Topology as Create Vectoring Topology in Device details screen": searchdevicepage.verify_validation(changes);break;
					case "should be seeing the Parent card action buttons Add Child Cards, Edit Card Details, Swap Card, Move Card, Delete Card in this format under Device port": searchdevicepage.verify_validation(changes);break;
					case "select MCO field with --Select-- value": searchdevicepage.device_role_change(changes);break;
					case "select Affiliate Owner field with --Select-- value": searchdevicepage.device_role_change(changes);break;
					case "Search CLC contact with Abinash":actvtnpage.tbx_clccontact_firstname.type("Abinash");break;
					case "Search CLC contact with all criteria filled":searchclccontactpage.verify_validation(changes);break;
					case "should see Add Circuit & Delete all button displayed in Circuit Related tab for CLC contact page" :searchclccontactpage.verify_validation(changes);break;
					case "Hover to Administration under Gear Icon":actvtnpage.select_administration_gearicon();break;					
					case "Select first workgroup & click on Edit Workgroup button in Manage Workgroup page":gearicon.verify_validation(changes); break;
					case "provide the Invalid Email id in CLC contact create page":createclccontactpage.verify_validation(changes);break;
					case "provide the Invalid Phone number in CLC contact create page":createclccontactpage.verify_validation(changes);break;
					//case "modify the all the fields CLC Contact view screen":searchclccontactpage.verify_validation(changes);break;
					
					case "modify the all the fields CLC Contact view screen":
						Thread.sleep(2000);
						waitForElement(searchclccontactpage.tbx_CCLcontact_editpage_firstname);
						fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchCLCContactPage", "TC243137", "updateform"));
						break;
					case "verify the Cicrcuit lookup window in CLC Contact page":searchclccontactpage.verify_validation(changes);break;
					case "remove all the Subscribers associated to the contact":searchclccontactpage.verify_validation(changes);break;
					case "Advance Search the Circuit with Device name field": devicename=searchcircuit.verify_validation(changes);jsClick(actvtnpage.tab_closeall_tab);
																		actvtnpage.click_actscreentab("Search");waitForElement(actvtnpage.lnk_Advanced_Search);jsClick(actvtnpage.lnk_Advanced_Search);waitForElement(searchcircuit.tab_circuit_advance_search);
																		searchcircuit.tbx_advancesearch_devicename.type(devicename);jsClick(searchcircuit.btn_advancesearch_Search);
																		waitForElement(actvtnpage.btn_view);jsClick(actvtnpage.btn_view);
																		break;
					case "search QOS Template with Template name as TEST":actvtnpage.verify_validation(changes);break;
					case "fetch start devices & select port in Etherent create form":createcircuitpage.verifyvalidation(changes);break;
					case "fetch end devices & select port in Etherent create form": createcircuitpage.verifyvalidation(changes);break;
					case "Associate 1 address in GDB Service area":gdbcreatepage.verify_validation(changes);break;
					case "Associate multiple address in GDB Service area":gdbcreatepage.verify_validation(changes);break;
					case "search for Order having status Pending Completeion state":searchorderpage.verify_validation(changes);break;
					case "changed the Device Type & Subtype on the ONT Device":searchdevicepage.verify_validation(changes);break;
					case "search the device in inventory":
						devicename=gdbcreatepage.lbl_deviceGDB.getText();actvtnpage.click_actscreentab("Search");
						i_go_to_Search_type_and_select_inventory_type("Inventory","Device");waitForElement(actvtnpage.tbx_deviceName);
						actvtnpage.tbx_deviceName.type(devicename);actvtnpage.click_searchbtn("Device");waitForElement(devicelookuppage.btn_Editbtn);break;
					case "updated the Network element role, Provision Status in Device Detail Page": searchdevicepage.verify_validation(changes);break;
					case "switch back to GPON Device Build page & click on Refresh button": gdbcreatepage.verify_validation(changes);break;
					case "select a port in each GDB component to initiate fiber link": gdbcreatepage.verify_validation(changes);break;
					case "enter valid Management IP subnet mask & Default gateway ranging between 0.0.0.0 - 255.255.255.255": devcreatepage.verify_validation(changes);break;
					case "change the Provision status to In-Service in Device details page":searchdevicepage.verify_validation(changes);break;
					case "search with device name in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Circuit type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Contact type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Link type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Location name in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Number type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Service type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with PUN Location created by in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Reservation type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with Topology type in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search with TEST - JANET Subscriber in Widget window":dashboardpage.Sanity_validations(changes);break;
					case "search for the QOS Created in Search Tab":devicename=get_container_from_xml("OVCreateQOSTemplate","TC39193").getFieldValue("tbx_createpage_QOSTemplate_templatename").toString();
												String[] d1=devicename.split(":");
												devicename=d1[1];					
												jsClick(actvtnpage.tab_closeall_tab);
												actvtnpage.click_actscreentab("Search");i_go_to_Search_type_and_select_inventory_type("Inventory","QOS Template");actvtnpage.tbx_searchtab_templateName.type(devicename);actvtnpage.click_searchbtn("Inventory");
												waitForElement(ovsearchqostemplate.btn_searchview_QOSTemplate_Edit);
												break;
					case  "entered valid value in QOS Template table":ovsearchqostemplate.verify_validation(changes);break;
					case "Search for the CLC contact": actvtnpage.click_actscreentab("Create"); selectFormType("Inventory","CLC Contact");actvtnpage.btn_Netwrkbuildcreate("any");
												fill_fields_basedon_type("OVCreateCLCContactPage", "TC243501", "Createform");action_clccontact("Create");break;
					case "select start & end date in Defect Task Report":gearicon.verify_validation(changes);break;
					case "click on Generate report in Defect Task Report":gearicon.verify_validation(changes);break;
					case "click on Total tasks Hyperlink in Defect Task Report":gearicon.verify_validation(changes);break;
					case "click on the Generate reports under Task type by select generate report in Defect Task Report":gearicon.verify_validation(changes);break;		
					case "should be able to see Device Name, Bearer Circuits, Device ports check boxes on the right top corner in Topology View Related tab":
						searchTopologyPage.validation_verify(changes);break;
					case "Uncheck the preferred contact in Contact page":ovcreatecontactpage.verify_validation(changes);break;
					case "click on Audit Tab in Contact Screen to verify the log is been registered for Update action": searchcontact.verify_validation(changes);break;
					case "click on Audit Tab in Contact Screen to verify the log is been registered for Create action": searchcontact.verify_validation(changes);break;
					case "click on Audit Tab in Contact Screen to verify the log is been registered for Delete action": searchcontact.verify_validation(changes);break;
					case "search with Contact first name as AUTO": actvtnpage.verify_validation(changes);break;
					case "select the Vector Enabled checkbox on search slider and click on search button":actvtnpage.verify_validation(changes);break;
					case "select the Vectoring Info checkbox on search slider and click on search button": actvtnpage.verify_validation(changes);break;
					case "don't select the Vectoring Info checkbox on search slider and click on search button": actvtnpage.verify_validation(changes);break;
					case "change the device type to Calix 800G Series ONT & subtype to Calix 801G in Device create form":devcreatepage.verify_validation(changes);break;
					case "upload the valid spreadsheet in the Bulk upload CLC Contact Page":searchclccontactpage.verify_validation(changes);break;
					case "modify the service area name in edit Service area screen":searchservicepage.verify_validation(changes);break;
					case "associate more addresses in service area create form": createserviceareapage.verify_validation(changes);break;
					case "modify the Associated Address in edit Service area screen" :searchservicepage.verify_validation(changes);break;
					case "try seraching for link created in Serach slider" : devicename=ovcreatelinkpage.lbl_alertmsg.getText();
					devicename = devicename.replace("Link#", "");	
					devicename = devicename.replace("created successfully.", "").trim();devicename = devicename.replace("x", "");
													actvtnpage.click_actscreentab("Search");
													i_go_to_Search_type_and_select_inventory_type ("Inventory", "Link");
													actvtnpage.tbx_Searchtab_Linkname.type(devicename);actvtnpage.click_searchbtn("Link");
													break;
													
					case "change the provision status & functional status in Link view page":ovsearchlinkpage.verify_validation(changes);break;
					case "change the provision status in Device details page":searchdevicepage.verify_validation(changes);break;
					case "fill all the mandatory fields and click on create in Addresses within range create form":createlocationpage.verify_validation(changes);break;
					case "check the Auto-Activate & click on Activate Button in Service screen":searchservicepage.verify_validation(changes);break;

					case "associate client role device in Topolopgy screen":searchTopologyPage.validation_verify(changes);break;
					case "create EB circuit between HOST & CLIENT role devices": 
						String hostdevicename=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-show='showDevContained']//tbody//td[1]/span)[1]")).getText().trim();
						actvtnpage.click_actscreentab("Create");
						selectFormType("Inventory","Circuit");
						actvtnpage.ddl_CircuitType_Createtab.selectByVisibleText("Ethernet Bearer");								
						actvtnpage.btn_Netwrkbuildcreate("any");
						actvtnpage.click_actscreentab("Search");
						i_go_to_Search_type_and_select_inventory_type("Inventory","Device");
						jsClick(actvtnpage.lnk_Advanced_Search); 				
						searchdevicepage.advance_device_search("CLIENT");
						orderpage.Advance_Search_button_action("Device");
						Thread.sleep(3000);
						actvtnpage.click_viewbtn();
						String clientdevicename=searchdevicepage.lbl_serach_device_device_details_tab_identifier_sec_device_name.getText().trim();
						
						jsClick(createcircuitpage.tab_Circuit_createform_Ethernetbearer);
						int i=1;
						while(loginPage.isElementVisible(By.xpath(".//*[@id='mainTab']//tab-heading[contains(text(),'Create Ethernet Bearer Circuit')]/../../following-sibling::li["+i+"]//a/img[1]"))){
							
						}				break;
						
					case "search for device having MEF EVC displayed in Services related tab":searchdevicepage.verify_validation(changes);break;
					case "search for device having DSL OVC displayed in Services related tab":searchdevicepage.verify_validation(changes);break;
					case "remove the PM type on Service edit page":searchservicepage.verify_validation(changes);break;	
					case "Update HSI/IPTV/IPTV Unicast Service page": searchservicepage.verify_validation(changes);break;
					case "Update Host Service Page": searchservicepage.verify_validation(changes);break;
					case "Update DSLOVC Service Page": searchservicepage.verify_validation(changes);break;
					case "Update MEF ENNI Service Page": searchservicepage.verify_validation(changes);break;
					case "Update MEF EVC Service Page": searchservicepage.verify_validation(changes);break;
					case "Update Probe UNI Service Page": searchservicepage.verify_validation(changes);break;

					}
				}
				
				@Step
				public void action_clccontact(String acttype) throws Throwable {		
					switch(acttype){
					case "Delete":searchclccontactpage.verify_validation(acttype);break;
					case "Create":createclccontactpage.verify_validation(acttype);break;
					case "Edit":searchclccontactpage.verify_validation(acttype);break;
					case "Save":searchclccontactpage.verify_validation(acttype);break;
					case "Add Circuit":searchclccontactpage.verify_validation(acttype);break;
					case "Cancel circuit":searchclccontactpage.verify_validation(acttype);break;
					case "Save with no subscribers associated":searchclccontactpage.verify_validation(acttype);break;
					case "Advance CLC Search":searchclccontactpage.verify_validation(acttype);break;
					case "Bulk upload tab":searchclccontactpage.verify_validation(acttype);break;
					case "Submit":searchclccontactpage.verify_validation(acttype);break;
					case "Edit-icon":searchclccontactpage.verify_validation(acttype);break;
					}
					
					}
				
				
				@Step
				public void click_on_secondTab() throws InterruptedException
				{
					//actvtnpage.tab_created_clccontact.click();
					jsClick(actvtnpage.tab_created_clccontact);
					Thread.sleep(1000);
				}
				
				@Step
				public void performactionLB(String action) throws Throwable {	
					switch(action){
					case "Create button in Ethernet Bearer":ovcreatelogicalport.verifyvalidation(action);break;
					}
						
					}
				
				@Step
				public void i_select_device_in_MEF_UNI_Service_Association_Section_Device_section_and_click_on_create(String Dname, String ServType) throws Throwable {
					servicecreatepage.i_select_device_in_MEF_UNI_Service_Association_Section_Device_section_and_click_on_create(Dname, ServType);
				}
				
				@Step
				public void mefenni_serviceaction(String action){
					switch(action){
					case "Create": servicecreatepage.verify_validation("MEF ENNI Create");break;
					}
				}
				/*public void Fill_contact_fields(String container) {
					fill_fields_basedon_type(ovcreatecontactpage, container, "Createform");
					//enduser.fillMandatoryFields(fillfieldscls,enduser.get_container_from_xml("TC209305","Createform"));
				}*/
				 
				
				@Step
				public void i_go_to_Search_type_and_select_inventory_type (String arg1, String arg2) throws Throwable {
					waitForElement(actvtnpage.ddl_searchType);
					actvtnpage.ddl_searchType.selectByVisibleText(arg1);
					waitForElement(actvtnpage.ddl_invntryType);
					actvtnpage.ddl_invntryType.selectByVisibleText(arg2);
					
				}
				@Step
				public void click_advsearchbtn(String arg) throws InterruptedException{
					waitForElement(actvtnpage.cbk_deviceadvsearch);
					actvtnpage.click_advsearchbtn(arg);
				}
				@Step
				public void select_devicerole(String Role) throws InterruptedException{
					waitForElement(actvtnpage.deviceRole_deviceadvsearch);
					actvtnpage.select_devicerole(Role);
				}
				
				@Step
				public void select_deviceType(String deviceType) throws InterruptedException{
					waitForElement(actvtnpage.deviceType_deviceadvsearch);
					actvtnpage.select_deviceType(deviceType);
				}
				
				@Step
				public void click_srchbtn_advsrch() throws InterruptedException{
					
					//
					System.out.println("Implementing varaible xpath>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>s");
					String x="[2]";
					WebElement e=actvtnpage.getDriver().findElement(By.xpath("(.//select[@id='deviceType'])"+x+""));
					Select s=new Select(e);
					s.selectByValue("Ciena 3916 Family");
					//actvtnpage.getDriver().findElement(By.xpath("(.//select[@id='deviceType'])"));
					Thread.sleep(5000);
					actvtnpage.click_srchbtn_advsearch();
					Thread.sleep(2000);
					
					
				}
				
				@Step
				public void validate_subscribertab_data() throws InterruptedException{
					if(!searchdevicepage.tab_sbcr_noData.isCurrentlyVisible()){
						System.out.println("Subscriber details is visible");
					}
					else{
						throw new Error("No subscriber Details found");
					}
						
				}
				
				@Step
				public void ServiceActionmethods(String action) throws Throwable {
				    switch(action){
				    case "Create":jsClick(servicecreatepage.btn_create);
									Thread.sleep(5000);break;
				    case "Update":jsClick(searchservicepage.btn_edit_service_viewpage);
				    
					Thread.sleep(5000);break;	
				    case "Add Member":jsClick(searchservicepage.btn_addmember);Thread.sleep(500); break;
									
				   default:searchservicepage.ServiceActionmethods(action); break;
				    }					
				}
				
				@Step
				public void Widgetactionbuttons(String Acttab) throws Throwable {
					dashboardpage.Widgetactionbuttons(Acttab);	    
					}
				
				@Step
				public void Widgettypeselect(String subtype,String type) throws Throwable {
					dashboardpage.Widgettypeselect(subtype,type);	    
					}
				
				
				@Step
				public void searchslider_clccontact(String slidr) throws Throwable {	
					actvtnpage.searchslider_clccontact(slidr);
				}
				@Step
				public void enter_Search_clccontact(String value) throws Throwable {	
					searchclccontactpage.enter_Search_clccontact(value);
				}
				@Step
				public void Enter_clccontact_firstname(String firstname) throws Throwable {	
					searchclccontactpage.Enter_clccontact_firstname(firstname);
				}
				@Step
				public void validate_column_names() throws Throwable {
					searchclccontactpage.validate_column_names();
				}
				@Step
				public void Search_clccontact_with_firstname(String firstname) throws Throwable {	
					searchclccontactpage.Search_clccontact_with_firstname(firstname);
				}
				@Step
				public void validating_customer_columnheader() throws Throwable {	
					searchclccontactpage.validating_customer_columnheader();
				}
				@Step
				public void validate_Total_contacts_in_database() throws Throwable {
					searchclccontactpage.validate_Total_contacts_in_database();
				}
				@Step
				public void validate_add_circuit() throws Throwable {
					searchclccontactpage.add_circuit_by_CAC();
				}
				@Step
				public void DefectTask_OVworkgroup(String wgrp) {
					
					gearicon.DefectTask_OVworkgroup(wgrp);	
				}
				
				@Step
				public void validate_circuit_in_database() throws Throwable {
				searchcircuit.validate_circuit_in_database();
				}

				
				@Step
				public void Circuit_actions (String action) throws Throwable {
					//WebDriverWait wait = new WebDriverWait(getDriver(), 10);
					switch(action){
					case "Create":jsClick(createcircuitpage.btn_create_circuit);waitForElement(searchcircuit.btn_circuitview_edit);break;
					
					/*case "Delete":jsClick(searchcircuit.btn_circuitview_delete);
				try{
					getDriver().switchTo().alert().accept();getDriver().switchTo().alert().accept();
				}catch (NoAlertPresentException ex) {
					   // Alert not present
					   ex.printStackTrace();
					  }
						
					
							break;*/
							default: searchcircuit.Circuit_actions(action);break;
					}				
			}
				@Step
				public void Link_Action(String action) throws Throwable {
					switch(action){
					case "Create":ovcreatelinkpage.Link_Action(action); break;
					default :ovsearchlinkpage.Link_Action(action); break;
					}
					
				}
				
				
				@Step
				public void Servicearea_Action(String action) throws Throwable {
					switch(action){
					case "Create": createserviceareapage.Servicearea_Action(action);break;
					case "Add More Addresses": createserviceareapage.Servicearea_Action(action);break;
					default :searchserviceareapage.Servicearea_Action(action);break;
					
					}
					
				}
				
				@Step
				public void Location_action(String action) throws Throwable {
					switch(action){
					case "Create button":createlocationpage.Location_action(action);break;
					case "Delete button-individual location1":
						
						jsClick(searchlocation.tab_1stLocationCreatedfromAddressRange_tab);
						Thread.sleep(5000);
						jsClick(searchlocation.btn_search_Addressrange_view_DeleteAddressrange);
					 
						getDriver().switchTo().alert().accept();Thread.sleep(5000);
						break;
                case "Delete button-individual location2":
						
						jsClick(searchlocation.tab_2ndLocationCreatedfromAddressRange_tab);
						Thread.sleep(10000);
						jsClick(searchlocation.btn_search_Addressrange_view_DeleteAddressrange);
					 
						getDriver().switchTo().alert().accept();Thread.sleep(5000);
						break;
				    case "Delete address range button":
				    	
				    jsClick(searchlocation.tab_addressRange_tab);
						Thread.sleep(5000);
						jsClick(searchlocation.btn_addressrange_locnrt_refreshicon);
				    	Thread.sleep(8000);
				    	jsClick(searchlocation.btn_addressrange_locnrt_refreshicon);
				    	Thread.sleep(10000);
				    jsClick(searchlocation.btn_search_Addressrange_view_DeleteAddressrange);
					 getDriver().switchTo().alert().accept();Thread.sleep(5000);break;
					 
				    case "Delete address range button2":

					    jsClick(searchlocation.tab_addressRange_tab2);
							Thread.sleep(5000);
							
							jsClick(searchlocation.btn_addressrange_locnrt_refreshicon);
					    	Thread.sleep(8000);
					    	jsClick(searchlocation.btn_addressrange_locnrt_refreshicon);
					    	Thread.sleep(10000);
					    jsClick(searchlocation.btn_search_Addressrange_view_DeleteAddressrange);
						 getDriver().switchTo().alert().accept();Thread.sleep(5000);break;
						
					
					default :searchlocation.Location_action(action);break;
					}
				}
				
				@Step
				public void SPEC_Code_validation_servicecreate() throws InterruptedException 
				{
					servicecreatepage.verifyfield();
			
				} 
				

				@Step
				public void i_fill_subscriber_service_form() throws Throwable {
					
					servicecreatepage.i_fill_subscriber_service_form();
						
				}
				
				@Step
				public void I_click_on_manual_activation_checkbox () throws Throwable {
					servicecreatepage.I_click_on_manual_activation_checkbox();			
				}
				
				@Step
				public void task_should_be_generated_and_displayed_in_related_tab_Tasks() throws Throwable {
				    // Write code here that turns the phrase above into concrete actions
				    //throw new PendingException();
					searchservicepage.task_should_be_generated_and_displayed_in_related_tab_Tasks();
					
					
					
				}
				
				@Step
				public void Action_subscriberpage(String action) throws Throwable {
					switch(action){
					case "Create button":jsClick(createsubscriberpage.btn_SubscriberCreate); Thread.sleep(3000);break;
					default:searchsubscriberpage.Action_subscriberpage(action);break;
					
					
					}
					
				}
				
				@Step
				public void I_am_in_qpartner_url() {
					loginPage.maximize();		
					//if(!Page.currentEnvironment.getKey().equals("ITV2")){
					loginPage.openAt(Page.envData.getFieldValue("Qpartner"));
					/*} else {
						slf4jLogger.debug("Not applicable for Test 2 environment");
						throw new Error("Not applicable for Test 2 environment");
					}*/
					
				}
				
				@Step
				public void qpartner_loginpagevalidation() {
					qpartnerpage.qpartner_loginpagevalidation();
				}
				
				@Step
				public void qpartner_Login(String user) {
					
					
					qpartnerpage.qpartner_Login(user); 
				}
				
				@Step
				public void I_verify_QPartnerwelcomepage() {
					qpartnerpage.I_verify_QPartnerwelcomepage();
					
				}
				
				@Step
				public void I_clickonQpartnertab() {
					qpartnerpage.I_clickonQpartnertab();
				}
				
				@Step
				public void I_clickonQpartnerSubtab() {
					qpartnerpage.I_clickonQpartnerSubtab();
				}
				
				@Step
				public void I_clickonOmnivuelink_Qpartner() {
					qpartnerpage.I_clickonOmnivuelink_Qpartner();
				}
				
				@Step
				public void I_servicecheck_Qpartner() {
					qpartnerpage.I_servicecheck_Qpartner();
				}
				
				@Step
				public void I_verifySLC_Qpartner() {
					qpartnerpage.I_verifySLC_Qpartner();
				}
				
				@Step
				public void OVSLCQpartnerchecks() {
					qpartnerpage.OVSLCQpartnerchecks();
				}
				
				@Step
				public void solr_search_value(String svalue) throws InterruptedException {
					actvtnpage.solr_search_value(svalue);				
					   
					}
				
				@Step
				public void searchDevice_for_Association(String devType ,String devSubType) throws InterruptedException{
					//devcreatepage.tbx_locationClli.clear();
					createTopologyPage.searchDevice_forassociation(devType,devSubType);
				}
				
				@Step
                public void searchDevice_for_Association_with_devicetype(String devType) throws InterruptedException{
                       //devcreatepage.tbx_locationClli.clear();
                       createTopologyPage.searchDevice_forassociation_with_devicetype(devType);
                }

				@Step
				public void select_circuit_Lag(String circuit) throws InterruptedException {
					createTopologyPage.select_circuit_Lag(circuit);		
					   
					}
				
				@Step
				public void TransportPath_actions(String statusvalidation) throws Throwable {
					switch(statusvalidation){
					case "OK Button by selecting Optical Bearer radio button":transportPathPage.TransportPath_actions(statusvalidation);break;
					case "OK Button by selecting Ethernet Bearer radio button":transportPathPage.TransportPath_actions(statusvalidation);break;
					case "OK Button":transportPathPage.TransportPath_actions(statusvalidation);break;
					case "Save button":transportPathPage.TransportPath_actions(statusvalidation);break;
					default:searchtransportpath.TransportPath_actions(statusvalidation);
					
					}
					
				}
				
				@Step
				public void fill_create_SCL(String SlcDetails) throws Throwable{
					if(actvtnpage.tbx_SCL_Location_Create_Slider.isPresent()){
						
						actvtnpage.tbx_SCL_Location_Create_Slider.type(getDate("MMDDYY"));
						 waitForElement(actvtnpage.lnk_SLC_Search_Tab_Location_Create_Slider);
						 jsClick(actvtnpage.lnk_SLC_Search_Tab_Location_Create_Slider);
						// actvtnpage.lnk_SLC_Search_Tab_Location_Create_Slider.click();
					}
				}
				
				@Step
				public void select_dspworkgroup_wrkgroupactivity(String grpname) {
					gearicon.select_dspworkgroup_wrkgroupactivity(grpname);	
				}
				
				@Step
				public void action_dspworkgroup_wrkgroupactivity(String action) {
					gearicon.action_dspworkgroup_wrkgroupactivity(action);	
				}
				
				
				@Step
				public void DSPAdmin_actions(String type) {
					gearicon.DSPAdmin_actions(type);
				}
				
				@Step
				public void i_select_port_type_createtab (String ptype) throws Throwable {
					actvtnpage.i_select_port_type_createtab(ptype);
				
				}
				
				@Step
				 public void GDB_SelectBox_Expand(String gpondevice) throws Throwable{
		              gdbcreatepage.GDB_Device_select(gpondevice);
		            

		              gdbcreatepage.GDB_expand_field(gpondevice);
		              //waitForElement(gdbcreatepage.ddl_NB_selfTechInstall);

		              gdbcreatepage.GDB_Device_dropDow(gpondevice);

				 }
				
				@Step
				public void i_validate_the_web_page(){
					
					ArrayList<String> tabs2 = new ArrayList<String> (loginPage.getDriver().getWindowHandles());
					
					loginPage.getDriver().switchTo().window(tabs2.get(1));
					String Help_URL=loginPage.getDriver().getCurrentUrl();	
					waitForElement(actvtnpage.help_ctli_logo);
					
					slf4jLogger.info("URL--->"+Help_URL);
					
					//if (Help_URL.equalsIgnoreCase("https://sysadminwiki.corp.intranet/w/index.php/NIC_G.FAST_Program"))
						if (Help_URL.equalsIgnoreCase("https://ohd.ad.qintra.com/Default.aspx?action=rid&id=1475"))	
						
					{
						slf4jLogger.info("URL matched ");
						
						if(actvtnpage.help_ctli_logo.isCurrentlyVisible())
						{
							slf4jLogger.info("Help page is displayed");
						}
						
					}
					else {
						slf4jLogger.info("URL not matched ");
						throw new Error("URL not matched"+Help_URL);
					}					
				
				
				}
				@Step
				public void i_validate_the_new_web_page(){
					
					ArrayList<String> tabs2 = new ArrayList<String> (loginPage.getDriver().getWindowHandles());
					
					loginPage.getDriver().switchTo().window(tabs2.get(1));
					String Help_URL=loginPage.getDriver().getCurrentUrl();	
					waitForElement(actvtnpage.img_help_ctli_logo);
					
					slf4jLogger.info("URL--->"+Help_URL);
					
					if (Help_URL.equalsIgnoreCase("https://ohd.ad.qintra.com/Default.aspx?action=rid&id=1475"))
					{
						slf4jLogger.info("URL matched ");
						
						if(actvtnpage.img_help_ctli_logo.isCurrentlyVisible())
						{
							slf4jLogger.info("Help page is displayed");
						}
					}
					
					else {
						slf4jLogger.info("URL not matched ");
					throw new Error("URL not matched"+Help_URL);				
					}
				
				 }
				
				@Step
				public void configurable_data_xref_table() throws InterruptedException{
					
					ArrayList<String> dataBasedattributevalue=new ArrayList<String>();
					List<String> actualdataBasedattributevalue=new ArrayList<String>();
					dataBasedattributevalue.add("574");
					dataBasedattributevalue.add("OV_HELP_ICON_LINK");
					dataBasedattributevalue.add("OV_HELP_ICON_LINK");
					dataBasedattributevalue.add("https://ohd.ad.qintra.com/Default.aspx?action=rid&id=1475");
					actualdataBasedattributevalue = ovdb.configurable_data_xref_table_db();
					
					System.out.println(actualdataBasedattributevalue);
					Thread.sleep(3000);
					for(int p=0; p<=dataBasedattributevalue.size()-1; p++){
						for(int q=0; q<=actualdataBasedattributevalue.size()-1; q++){
							if(actualdataBasedattributevalue.get(p).equalsIgnoreCase(actualdataBasedattributevalue.get(q))){
								System.out.println(actualdataBasedattributevalue.get(p)+" value is avaliable in Database");
							}
						}
					}
				 }
				
				@Step
				public void validate_audit_logs(String arg1) throws Throwable {
					//Thread.sleep(10000);
					//searchdevicepage.validatelogs_db(arg1);
					
					switch(arg1) {
					case "Delete Device":searchdevicepage.validatelogs_db(arg1);break;			
						
					case "Update Device":searchdevicepage.validatelogs_db(arg1);break;
					
					case"Create Device":searchdevicepage.validatelogs_db(arg1);break;
					
					}
								
				
				}
				
				@Step
				public void validate_deleted_device_inventory() throws Throwable {
					String device=devcreatepage.create_device_successfull_msg();
					System.out.println(device);
					actvtnpage.click_actscreentab("Search");
					
					
					//actvtnpage.searchtab_serachtype("Inventory");
				//	fillMandatoryFields(actvtnpage,get_data_for_page(actvtnpage).getContainer("GDB_OLTSearch"));
					 waitForElement(actvtnpage.tbx_deviceName);
					actvtnpage.tbx_deviceName.sendKeys(device);
				    actvtnpage.click_searchbtn("Device");
				    
				    waitForElement(searchdevicepage.lbl_Device_search_deleted);
				
				}
				
				
				@Step
				public void click_on_GetNextButtons_link(String linkName){
					/*if(ovgeariconpage.lbl_gearicon_GetNextButtons.isPresent())
					{
					
						//ovgeariconpage.lbl_gearicon_GetNextButtons.click();
						//jsClick(ovgeariconpage.lbl_gearicon_GetNextButtons);
						slf4jLogger.info("Clicked on lbl_gearicon_GetNextButtons successfully");
					}
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
					 
						e.printStackTrace();
					}*/
				 waitForElement(ovgeariconpage.tab_ManageGetNextButtons);
				 if (ovgeariconpage.tab_ManageGetNextButtons.getText().equalsIgnoreCase("Manage GetNext Buttons ")) {
					 slf4jLogger.info(" GetNext Buttons page opened successfully");
				}
				} 
				
				@Step
				public void Add_Contact_button_click(){

					if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
						waitForElement(searchdevicepage.btn_ContactRT_ADDContact_Withdata);
						
						if(!searchdevicepage.btn_RT_view.isCurrentlyVisible()){
							slf4jLogger.debug("Contact Table not displayed please check the data");
							throw new Error("Contact Table not displayed please check the data");
						}
						jsClick(searchdevicepage.btn_ContactRT_ADDContact_Withdata);
					} else {
						jsClick(searchdevicepage.btn_ContactRT_ADDContact_nodata);
					}
					
				} 
				
				@Step
				public void fill_fields_update_device(String field) throws Throwable{
					Thread.sleep(5000);
					
					//fillMandatoryFields(createlocationpage,get_data_for_page(createlocationpage).getContainer(field));
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage",field));
					
					
					
					//jsClick(searchdevicepage.btn_subscriberlookup_edit);
					//jsClick(servicecreatepage.btn_subscriberlookupicon);
					//servicecreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
					searchdevicepage.tbx_serach_device_device_details_tab_subscriber.clear();
					searchdevicepage.tbx_serach_device_device_details_tab_subscriber.sendKeys("TEST");
					jsClick(actvtnpage.ggl_Solr_value);
					
					/*field="Subscribers";
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage",field));
					//fill_fields_from("OVSearchDevicePage","","Subscribers");
					jsClick(devcreatepage.btn_lookup_window);										
					waitForElement(servicecreatepage.lnk_subcribername);										
					jsClick(servicecreatepage.lnk_subcribername);*/
					
					
				}


				@Step
				public void fill_fields_update_device_network_details(String field) throws Throwable{
					Thread.sleep(5000);
					
					//fillMandatoryFields(createlocationpage,get_data_for_page(createlocationpage).getContainer(field));
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage",field));
					
					
				}

				@Step
				public void transportpath_device() throws Throwable{
					Thread.sleep(5000);
					waitForElement(searchtransportpath.lbl_startdeviceTP);
					jsClick(searchtransportpath.lbl_startdeviceTP);
					//fillMandatoryFields(createlocationpage,get_data_for_page(createlocationpage).getContainer(field));
					//fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchDevicePage",field));
					
					
				}

				@Step
				public void device_vectoring_type(String field) throws Throwable{
					
					searchdevicepage.device_vectoring_type(field);
					
				}

				
				@Step
				public void manual_task_validation() throws Throwable{
					
					searchdevicepage.manual_task_validation_device();
					
				}
				
				
				@Step
				public void validate_mandatory_mesasge() {
					
					managegetnext.validate_mandatory_mesasge();
					
				}
				
				@Step
				public void i_enter_value(String name,String arg1) {
					
					managegetnext.fill_name(name,arg1);
					
				}
				
				@Step
				public void i_click_button(String arg1) throws InterruptedException {
					
					managegetnext.click_button(arg1);
					
				}
				
				@Step
				public void validate_getnext_search_result() {
					
					managegetnext.validate_getnext_search_result();
					
				}
				
				@Step
				public void i_select_attribute(String arg1) {
					
					managegetnext.i_select_attribute_value(arg1);
					
				}
				
				public void clicked_on_save_button_on_GetNextButtons_link_on_Add_Get_Next_Button_LooK_Up() throws InterruptedException
				{
				//	ovgeariconpage.btn_save_manageGetNextButtonsPage_lookUp.click();
					jsClick(managegetnext.btn_save_manageGetNextButtonsPage_lookUp);
					Thread.sleep(3000);
                   waitForElement(managegetnext.alert_msg_manageGetNextButtonsPage_lookUp);
				}
				
				public void clicked_on_clear_button_on_GetNextButtons_link_on_Add_Get_Next_Button_LooK_Up() throws InterruptedException
				{
				//	ovgeariconpage.btn_save_manageGetNextButtonsPage_lookUp.click();
					jsClick(managegetnext.btn_clear_manageGetNextButtonsPage_lookUp);
					Thread.sleep(3000);
                    if (managegetnext.tbx_workmateRuleInvoked_manageGetNextButtonsPage_lookUp.getTextValue()=="") {
						slf4jLogger.info("Entered values cleared successfully");
					}
				} 
				@Step
				public void fill_addGetNext_lookup(String container)
				{
					slf4jLogger.info("data container name " + container);
					//fillMandatoryFields(fillfieldscls,get_container_from_xml(container));
					fillMandatoryFields(fillfieldscls,get_container_from_xml("OVGeariconPage",container));
				} 
				
				@Step
			       public void Activation_click_Tab2(String Acttab) throws Throwable {
			       
			              actvtnpage.click_actscreentab(Acttab);
			       } 
				@Step
			       public void click_getnext_homepage(String Acttab) throws Throwable {
			       
					managegetnext.Getnext_button_click(Acttab);
			       } 
				
				@Step
			       public void verfiy_defecttask_details(String message) throws Throwable {
					managegetnext.verify_message(message);
					
					/*switch(message) {
					
					case "Rule Specified Was Not Found": managegetnext.verify_message(message);     break;
					case "click Get Next button again to get the latest task":  managegetnext.verify_message(message);break;
					case "No Work Found For Rule Specified": managegetnext.verify_message(message);break;
					}*/
			       
					
			       } 
				@Step
				public void validate_getnext_search_result_db(String arg1,String arg2) throws SQLException, InterruptedException {
					
					managegetnext.validate_getnext_search_result_db(arg1,arg2);
					
				}
				
				@Step
				public void validate_getnext1_search_result_db(String arg1) throws SQLException, InterruptedException {
					
					managegetnext.validate_getnext1_search_result_db(arg1);
					
				}
				
				@Step
				public void updatevalues_getnext(String arg1,String arg2) throws  InterruptedException {
					
					managegetnext.i_update_values_in_getnext(arg1,arg2);
					
				}
				
				@Step
				public void i_delete_values_in_getnext(String arg1) throws  InterruptedException {
					
					managegetnext.i_delete_record_in_getnext(arg1);
					
				}
				
				
				
				@Step
				public void i_enter_name_in_getnext(String arg1) throws SQLException {
					
					managegetnext.tbx_AdminName_manageGetNextButtonsPage_lookUp.sendKeys(arg1);
					
				}
				
				@Step
			       public void locationaddress_in_advance_devicesearch(String Location) throws Throwable{
			              searchdevicepage.locationaddress_in_advance_devicesearch(Location);
			       }
			       @Step
			       public void Enter_devicename_in_advancesearch() throws Throwable{
			              searchdevicepage.Enter_devicename_in_advancesearch();
			       }
			       
			       @Step
			       public void click_on_search_and_validate_results() throws Throwable{
			              searchdevicepage.validate_device_search_results_page();
			       }
			       @Step
					public void createtab_Device_Create_Vectoring(String VECTORING_TYPE,String Vectoring_Topology) throws Throwable{
						
						devcreatepage.createtab_Device_Create_Vectoring_device(VECTORING_TYPE,Vectoring_Topology);
					}
			       @Step
					public void detailtab_Device_edit_Vectoring(String VECTORING_TYPE,String Vectoring_Topology) throws Throwable{
						
						searchdevicepage.Detailtab_Device_Edit_Vectoring_device(VECTORING_TYPE,Vectoring_Topology);
						
						 
						
					}
			       @Step
					public void delete_Tag(String usrname) {
						
						gearicon.delete_tag(usrname);	
					}
			       @Step
					public void update_defecttask_tag_new(String action) throws Throwable {
						taskpage.update_defecttask_tag(action);
					}
			       @Step
					public void verify_update_defecttask_tag_new(String action) throws Throwable {
						taskpage.verify_update_defecttask_tag(action);
					}
			       @Step
					public void readtag_name() throws SQLException, InterruptedException {
						
						gearicon.read_tag_all();	
					}
			       @Step
			   	public void click_CircuitsTab(String tab) throws Throwable { 
			   		//slf4jLogger.info("entered the Second stage"+tab);
			    	   searchcircuit.verify_circuit_related_tab(tab);
			   	}
			       @Step
					public void Enter_circuit_name() throws Throwable{
						actvtnpage.ddl_circuitname.sendKeys(gdbcreatepage.Fiberlink());
					}
			       public void click_lagCircuits_CircuitTab() throws Throwable { 
				   		//slf4jLogger.info("entered the Second stage"+tab);
				    	   searchcircuit.verify_lagcircuit_circuitrelated_tab();
				   	}
			       public void click_vlanCircuits_CircuitTab() throws Throwable { 
				   		//slf4jLogger.info("entered the Second stage"+tab);
				    	   searchcircuit.verify_vlancircuit_circuitrelated_tab();
				   	}
			       @Step
					public void fill_fields_for_Circuit_type(String container1, String container2,String container3){
			    	   
			    	   System.out.println(".................."+ container1+ container2 +container3);
						
						fillMandatoryFields(fillfieldscls,get_container_from_xml(container1, container2));
						
					}
			       
			       @Step
					public void verify_clc_details() throws Throwable{
						//searchservicepage.service_search_and_associate(arg1,arg2);
			    	   searchclccontactpage.verify_details();
					}
			       
			       @Step
                   public void validate_GETO_Details_page(){
                      Assert.assertTrue("GETO value dropdown not displayed", ovgeariconpage.validate_GETO_value_in_GETO_Details_report());
                      Assert.assertTrue("Start Date Text field not displayed", ovgeariconpage.validate_startdate_GETO_Details_reportpage());
                      Assert.assertTrue("End Date Text field not displayed", ovgeariconpage.validate_enddate_GETO_Details_reportpage());
                      
                      Assert.assertTrue(" Generate Reports button not displayed", ovgeariconpage.validate_Generate_report_GETO_reportpage());
                  }


			       @Step
					public void service_search_page_tab(String device_tab) throws Throwable{
						searchservicepage.service_search_page_tab(device_tab);
					}
			       @Step
			       public void fill_fields_service_update(String field){
			   		try {
			   			//Thread.sleep(2000);
			   		//waitForElement(servicecreatepage.btn_create);
			   		
			   			Thread.sleep(5000);
			   			fillMandatoryFields(fillfieldscls,get_container_from_xml("OVSearchServicePage",field));
			   		//fillMandatoryFields(servicecreatepage,get_data_for_page(servicecreatepage).getContainer(field));
			   		
			   		} catch (InterruptedException e) {
			   			// TODO Auto-generated catch block
			   			e.printStackTrace();
			   		}
			   	}
			       @Step
					public void search_mef_uni(String arg1) throws Throwable{
						//searchservicepage.service_search_and_associate(arg1,arg2);
						searchservicepage.associate_uni_to_mef_ovc(arg1);
					}
			       
			       @Step
				   	public void fill_subscriber_service(String field){
				   		try {
				   			
				   			//waitForElement(servicecreatepage.btn_subscriberlookupicon); Thread.sleep(2000);
							
							jsClick(servicecreatepage.btn_subscriberlookupicon);
							waitForElement(servicecreatepage.btn_lookup);
							fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateServicePage",field));
							//servicecreatepage.tbx_subcriber_name_window.type("TEST - JANET");
							jsClick(servicecreatepage.btn_lookup);
							
							waitForElement(servicecreatepage.lnk_subcribername);
							
							jsClick(servicecreatepage.lnk_subcribername);
							Thread.sleep(2000);
				   			
				   			//Thread.sleep(2000);
				   		waitForElement(servicecreatepage.btn_create);
				   		
				   		/*	Thread.sleep(5000);
				   			fillMandatoryFields(fillfieldscls,get_container_from_xml("OVCreateServicePage",field));*/
				   		//fillMandatoryFields(servicecreatepage,get_data_for_page(servicecreatepage).getContainer(field));
				   		
				   		} catch (InterruptedException e) {
				   			// TODO Auto-generated catch block
				   			e.printStackTrace();
				   		}
				   	}
			       @Step
					public void validate_associationtab_serviceview(String newfieldchange) throws Throwable {
						
						searchservicepage.validate_Associated_service_related_tab_validations();
															
					}
			       
			       @Step
			       public void validating_GDB_progressbar() throws InterruptedException {
			    	   
			    	   gdbcreatepage.validating_GDB_progressbar();
			    	   
			       }
			       @Step
			       public void validating_GDB_device_in_db()  throws InterruptedException{
			    	   gdbcreatepage.validating_GDB_device_in_db();
			       }
			       
			       @Step
			       public void validating_GDB_device_in_sequence()  throws InterruptedException{
			    	   gdbcreatepage.verify_sequence();
			       }
			       @Step
			       public void validating_gdb_device_auditlog(String log)throws InterruptedException{
			    	   gdbcreatepage.verify_gdb_audit_log_device(log);
			       }
			       @Step
					public void GDB_device_drang_drop_actions() throws Throwable{
						gdbcreatepage.draganddrop();
					}
			       @Step
			       public void GDB_fibre_exist_error() throws InterruptedException {
			    	   gdbcreatepage.fiber_errorpopup_validation();
			       }
			       @Step
			       public void GDB_fibre_exist_cascade() throws Throwable {
			    	   gdbcreatepage.cascade_fibrelink();
			       }
			       @Step
			       public void GDB_fibre_alreadyexist_error() throws Throwable {
			    	   gdbcreatepage.fibrelink_already_exists_error();
			       }
			       @Step
			   	public void validate_Topology_attribute_value() throws Throwable{
			   		Thread.sleep(3000);
			   		/*jsClick(gdbcreatepage.btn_gpon_expand);
			   		Thread.sleep(2000);*/
			   		//String GDBDevice_Topology_attribute = gdbcreatepage.tbx_NB_Topologyfield.getText();
			   		String GDBDevice_Topology_attribute = Page.commonData.getContainer("OVCreateGDBPage").getContainer("GDB-Device create").getContainer("Topologydata").getFieldValue("tbx_Topologyname");		
			   		String GDBDevice=gdbcreatepage.lbl_deviceGDB.getText();
			   		Thread.sleep(2000);
			   		//click_Tab("Search");
			   		jsClick(actvtnpage.tab_search);
			   		waitForElement(actvtnpage.ddl_searchType);
			   		actvtnpage.ddl_searchType.selectByVisibleText("Inventory");
			   		waitForElement(actvtnpage.ddl_invntryType);
			   		actvtnpage.ddl_invntryType.selectByVisibleText("Device");
			   		//fill_fields("GDB_DeviceSearch");
			   		Thread.sleep(3000);
			   		actvtnpage.tbx_deviceName.sendKeys(GDBDevice);
			   		Thread.sleep(3000);
			   		actvtnpage.click_searchbtn("Device");
			   		//jsClick(actvtnpage.btn_inventorysearch);
			   		Thread.sleep(10000);
			   		select_viewBtn();
			   		waitForElement(searchdevicepage.lbl_devicerole);
			   		Thread.sleep(5000);	
			   		//tr[@ng-repeat='(tName,tType) in deviceDetail.TOPOLOGYMAP']/td[1]
			   		String DeviceTopology_value = searchdevicepage.lbl_serach_device_device_details_tab_Topology_sec_Topology_Name.getText();
			   		System.out.println("GDBDevice_Topology_attribute name is "+GDBDevice_Topology_attribute);
			   		System.out.println("DeviceTopology_value is "+DeviceTopology_value);
			   		if(GDBDevice_Topology_attribute.trim().equals(DeviceTopology_value.trim())){
			   			System.out.println("GDB Device and Inventory Device Topology names are Equal");
			   		}else throw new Error("GDB Device and Inventory Device Topology names are NOT Equal");
			   		//validate_attribute_search_page("GDB-ONT");
			   		jsClick(actvtnpage.tab_search);
			   		waitForElement(actvtnpage.ddl_searchType);
			   		actvtnpage.ddl_searchType.selectByVisibleText("Inventory");
			   		waitForElement(actvtnpage.ddl_invntryType);
			   		actvtnpage.ddl_invntryType.selectByVisibleText("Topology");
			   		Thread.sleep(3000);
			   		actvtnpage.tbx_topologyname.sendKeys(DeviceTopology_value);
			   		actvtnpage.click_searchbtn("Topology");
			   		Thread.sleep(2000);
			   		//jsClick(actvtnpage.btn_inventorysearch);
			   		WebElement Devicename_inTopologypage = loginPage.getDriver().findElement(By.xpath("//div[@ng-hide='deleteTopologyListEdit']//a[contains(text(),'"+GDBDevice+"')]"));
			   		System.out.println("Devicename_inTopologypage is "+Devicename_inTopologypage.getText());
			   		if(Devicename_inTopologypage.isDisplayed()){
			   			System.out.println("Device name is avaliable in Topology page");
			   		}else throw new Error("Device name is Not avaliable in Topology page");
			   	}
			   	

			       @Step
			       public void add_service_area(String cnt)throws Throwable{
			    	   gdbcreatepage.add_sa_gdb(cnt);
			    	   gdbcreatepage.gpon_ntwrk_servicearea_add_one();
			       }
			       @Step
			       public void delete_service_area()throws Throwable{
			    	   gdbcreatepage.delete_sa_gdb();
			    	  
			       }
			       
			       @Step
					public void i_validate_GETO_value_field_is_displayed() {
						// TODO Auto-generated method stub
						Assert.assertTrue("GETO value field is not displayed",OVSearchOrderPage.ddl_GETO_value.isDisplayed());
						
						
					}
				    
				    @Step
				    public void i_validate_the_values_displayed_under_the_GETO_value_field() {
				    	searchorderpage.validate_values_displayed_under_GETO_value();

			       
                    }
				    @Step
				     public void validate_the_values_displayed_for_the_address_range_created() throws InterruptedException {
				    	 createlocationpage.validate_the_values_displayed_under_Street_dir_prefix_suffix(); 
				     }

					

					public void validate_the_values_displayed_for_the_individual_addr_created() throws InterruptedException {
						// TODO Auto-generated method stub
						createlocationpage.validate_the_values_displayed_under_Street_dir_prefix_suffix_individual_addr();
					}
					
					@Step
					public void update_street_dir_prefix_suffix_streettype_in_individual_address() {
						searchlocation.updates_street_dir_prefix_suffix_streettype_in_individual_address();
					}
				    
					@Step
					public void validate_street_dir_prefix_suffix_streettype_are_not_enabled() {
						
						Boolean street_prefix=searchlocation.lbl_street_prefix_individual_addr.isCurrentlyEnabled();
						Assert.assertFalse("Street Prefix Enanbled",street_prefix );
						Boolean street_suffix=searchlocation.lbl_street_suffix_individual_addr.isCurrentlyEnabled();
						Assert.assertFalse("Street Suffix Enanbled",street_suffix );
						Boolean street_type=searchlocation.lbl_streettype_individual_addr.isCurrentlyEnabled();
						Assert.assertFalse("Street Suffix Enanbled",street_type );
						
					}
					
					
					
					@Step
					public void validate_GETO_values_under_GETOvalue_task_advanced_search()   {
                        
                        taskpage.verify_GETOvalues_in_Task_advanced_search();     
                    }
					 
					@Step
                    public void I_validate_warning_message_displayed() {
                           try {
                                  Thread.sleep(3000);
                                  String error_message=servicecreatepage.lbl_error_message_STI_create.getText();
                           if(error_message.equals("You left the field blank...")) {
                                  System.out.println("error message displayed");                                  
                                  }
                           }catch(Exception e) {
                                  e.printStackTrace();
                           }
                    }
                    //lbl_error_message_STI_create
                    @Step
                    public void I_select_value_in_Service_Type_Indicator_field(String STI) {
                           Select STI_value=new Select(servicecreatepage.ddl_servicetypeindicator);
                           STI_value.selectByVisibleText(STI);
                    }
                    
                    
                    @Step
                    public void I_select_blank_into_STI() {
                           try {
                                  Thread.sleep(3000);
                           
                           Select STI_ddl=new Select(searchservicepage.ddl_STI_Service_edit_page);
                           STI_ddl.selectByVisibleText("-Select-");
                           }catch(Exception e) {
                                  e.printStackTrace();
                           }
                    }
                    //SPRINT-6#####################################
                    @Step
					public void is_MCO_disabled() {
						
						Boolean MCO_disabled=searchcircuit.ddl_circuit_editview_mco_2.isCurrentlyEnabled();
						Assert.assertFalse("MCO Enabled",MCO_disabled );
						
						
					}
                    
                    
                    @Step
					public void is_MEFENNI_MCO_disabled() {
						
						Boolean MCO_disabled=searchservicepage.ddl_MCO_editServicepage_MEFENNI2.isCurrentlyEnabled();
						Assert.assertFalse("MCO Enabled",MCO_disabled );
							
						
						
					}
                    
                    @Step
					public void is_MEFUNI_MCO_disabled() {
							
						Boolean MCO_disabled=searchservicepage.ddl_MCO_editServicepage_MEFUNI.isCurrentlyEnabled();
						Assert.assertFalse("MCO Enabled",MCO_disabled );
						
						
						
                    }
                    
                    @Step
					public void is_MEFUNI_AutoNegotiate_enabled() {
							
						Boolean AutoNegotiate_enabled=searchservicepage.ddl_AutoNegotiate_MEFUNI.isDisplayed();
						Assert.assertTrue("AutoNegotiate Enabled",AutoNegotiate_enabled );
						
						
						
                    }
                    
                    
                    @Step
					public void is_MEFOVC_MCO_disabled() {
							
						Boolean MCO_disabled=searchservicepage.ddl_MCO_editServicepage_MEFUNI.isCurrentlyEnabled();
						Assert.assertFalse("MCO Enabled",MCO_disabled );	
						
						
                    }
                    
                    @Step
					public void is_MEFEVC_MCO_disabled() {
							
                    	String classes = searchservicepage.ddl_MCO_editServicepage_MEFUNI.getAttribute("disabled");
                    	boolean isDisabled = classes.contains("disabled");
                    	Assert.assertTrue("MCO Enabled",isDisabled );
						
						//Boolean MCO_disabled=searchservicepage.ddl_MCO_editServicepage_MEFUNI.isCurrentlyEnabled();
						//Assert.assertFalse("MCO Enabled",MCO_disabled );
						
						
						
                    }
                    
                    
                    //###########################################################
                    @Step
                    public void I_validate_warning_message_displayed_in_details_tab() {
                           try {
                                  Thread.sleep(3000);
                           String error_message=searchservicepage.lbl_error_message_service_details_page.getText();
                           
                                  System.out.println(error_message);                                 
                                  Thread.sleep(2000);
                           String error=searchservicepage.lbl_fill_mandatory_field_STI.getText();
                           if(error.equals("You left the field blank..."))
                             System.out.println("Error message displayed indicating to fill all the mandatory fields");
                           }catch(Exception e) {
                                  e.printStackTrace();
                           }
                    }
                    @Step
                    public void I_select_value_in_Service_Type_Indicator_field_details_tab(String STI) {
                           try {
                                  Thread.sleep(3000);
                           
                           Select STI_value=new Select(searchservicepage.ddl_STI_Service_edit_page);
                           STI_value.selectByVisibleText(STI);           
                           }catch(Exception e)
                           {
                                  e.printStackTrace();
                           }
                           }
                    
                    @Step
                    public void I_change_the_Management_VLAN_field_to_valid_value(){
                           try {
                                  Thread.sleep(2000);
                                  searchdevicepage.tbx_management_VLAN_edit_page.sendKeys("161");
                                  
                           }catch(Exception e) {
                                  e.printStackTrace();
                           }
                           
                    }
                    
                    @Step
                    public void I_validate_the_value_updated_in_the_Device_details_page() {
                           try {
                           Thread.sleep(2000);
                           String Management_VLAN=searchdevicepage.lbl_serach_device_device_details_tab_ip_information_sec_Management_VLAN.getText();
                           if(Management_VLAN.isEmpty()) {
                                  System.out.println("Blank value updated");
                           }
                           else {
                           System.out.println(Management_VLAN);
                           }
                           }catch(Exception e) {
                                  e.printStackTrace();
                           }
                    }
                    
                    @Step
    
                   public void I_change_the_Management_VLAN_field_to_blank_value() {
                    				try {
                    								Thread.sleep(2000);
                    								searchdevicepage.tbx_management_VLAN_edit_page.clear();
                    								
                    							}catch(Exception e) {
                    								e.printStackTrace();
                    							}
                    						} 
                    	 

              @Step
       public void I_validate_the_value_displayed_under_Network_Identifier_field(){
                                 
            	  
            	  try {
                             String network_identifier=searchdevicepage.lbl_serach_device_netwrok_tab_networkidentifier.getText();
                            System.out.println("Network Identifier value of the created Device  "+network_identifier);
                                 
            	  }catch(Exception e) {
                                         e.printStackTrace();
                                  }
                           }
////////////////////////////////////////////////////////////////////////////////////////////////////
              @Step
              public void  I_click_on_child_accordian_tab() {
                            try {
                                   Thread.sleep(500);
                                   /*WebElement btn_shelf=getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//input[@value='+'])[1]"));
                                   waitForElement(btn_shelf);
                                   jsClick(btn_shelf);*/
                                   waitForElement(searchdevicepage.tab_accordian_child_card_edit);
                                   jsClick(searchdevicepage.tab_accordian_child_card_edit);
                                   Thread.sleep(4000);
                                   jsClick(searchdevicepage.btn_edit_card_device_details_page);
                            } catch (InterruptedException e) {
                                   // TODO Auto-generated catch block
                                   e.printStackTrace();
                            }
                     
                     
                     //
                     }
              
              @Step
                     public void I_update_the_fields_in_Child_card_accordian_tab() {
                            try {  
                            
                            Select slot_no=new Select(searchdevicepage.ddl_slot_number_child_card_edit);
                            slot_no.selectByIndex(0);
                            searchdevicepage.tbx_Hardware_version_child_card_edit.sendKeys("2.0");
                            Thread.sleep(2000);
                            waitForElement(searchdevicepage.btn_save_details_child_card_edit);             
                            jsClick(searchdevicepage.btn_save_details_child_card_edit);
                            Thread.sleep(2000);                                   
                            }
                            catch(Exception e) {
                                   e.printStackTrace();
                            }
                     }
              @Step
              public void I_delete_the_parent_card() {
                     try {
                            Thread.sleep(1000);
                            //searchdevicepage.btn_delete_card_device_details_page.click(); 
                            jsClick(searchdevicepage.btn_delete_card_device_details_page);
                            Thread.sleep(2000);
                      String alertMessage= getDriver().switchTo().alert().getText();              
                      getDriver().switchTo().alert().accept();     
                      // Displaying alert message           
                      System.out.println(alertMessage);     
                      
                     }catch(Exception E) {
                            E.printStackTrace();
                     }
              }
              
              @Step
              public void I_click_refresh_button_in_device_details_page() {
                     try {
                            Thread.sleep(1000);;
                            jsClick(searchdevicepage.btn_refresh_device_details_page);
                     }catch(Exception e) {
                            e.printStackTrace();
                     }
              }

              @Step
              public void i_click_on_topology_related_tab() {
              try {
                  Thread.sleep(1000);
                  jsClick(createTopologyPage.tab_Topology_view);                       
                      
               }catch(Exception e) {
                      e.printStackTrace();
              }
              }
              
              
              @Step
              public void select_circuit_Select() throws InterruptedException{ 
					Thread.sleep(9000);
					createTopologyPage.ddl_circuittype.selectByVisibleText("Unrouted Ethernet Bearer");
					jsClick(createTopologyPage.btn_searchCircuit);
					Thread.sleep(10000);
					for(int i=1;i<=20;i++){
					String status=loginPage.getDriver().findElement(By.xpath("//div[@ng-show='shotSearCirc']//tbody/tr["+i+"]/td[4]")).getText();
					System.out.println(status);
					if(status.contains("In Service")){
						jsClick(loginPage.getDriver().findElement(By.xpath("//div[@ng-show='shotSearCirc']//tbody//tr//td["+i+"]//input")));
						Thread.sleep(1000);
						System.out.println("**********************");
						jsClick(createTopologyPage.btn_AssociateCircuits);
						break;}			
					}	
				}
   ////////////ServiceTest///////////////           
              @Step
          	public void execute_service(String url) {
          		RestAssured.baseURI = url;
          		RestAssured.useRelaxedHTTPSValidation();  // ssl bypass
          		request = RestAssured.given();
          		request.header("Content-Type","application/json");
          		slf4jLogger.info("Connection Established");
          	}
              
              @Step
          	public void input_paramaters_from_file(String fileLocation) throws Exception {
          	f = new File(fileLocation);
          		slf4jLogger.info("File Request Executed "+fileLocation);
          	} 
              
              
              @Step
          	public void POST_request() {
          		
          		request.body(f);
          		
          		//request.body(s);
          		response = request.post();
          		//request.body(f).
          		//System.out.println(f.);
          		slf4jLogger.info("POST Request Executed");
          		slf4jLogger.info("POST Response Body "+response.prettyPrint());
          		
          	} 
              
              @Step
          	public void status_code(int passedstatuscode) {
          		int statusCode = response.getStatusCode();
          		String[] lines= response.asString().split("\\r?\\n");
          		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$"+response.getBody().asString());
          		String correlationID= response.getBody().asString().trim().toString().substring(53,56);
          		System.out.println("--------------->"+correlationID);
          		Serenity.setSessionVariable("CID").to(correlationID);
        		String value=null;
        		String attribute="dspCorrelationId" ;
        		for(int j=0;j<lines.length;j++)
        		{
        		if(lines[j].endsWith(attribute))
        		{
        			//System.out.println("test "+lines[j]);
        			String[] m= lines[j].split(":");
                    value=m[1].replaceAll("\"","").replaceAll(",","").trim();
        		}
        		}
        		System.out.println("     value is : "+value);
        		slf4jLogger.info("Status Code Returned  "+statusCode);
          		Assert.assertEquals(passedstatuscode, statusCode);
          		
          		
          	}
//              @Step
//              public void i_run_soap(String url, String location, String responseLocation)throws ClientProtocolException, IOException{
//            	  String endpoint = url;
//            	  File cd= new File(".");
//            	  String h= cd.getAbsolutePath();
//            	  System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+h);
//            	  File requestFile = new File(System.getProperty("user.dir")+location);
//                  HttpClient cilent = HttpClientBuilder.create().build();
//                  HttpPost post = new HttpPost(endpoint);
//                  post.setEntity(new InputStreamEntity(new FileInputStream(requestFile)));
//                  //post.setEntity(new InputStreamReader(new FileInputStream(requestFile)));
//                  post.setHeader("Content-type","text/xml");
//                  HttpResponse response = cilent.execute(post);
//                 System.out.println(response.getStatusLine().getStatusCode());
//                  BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//                  String line = "";
//                  StringBuffer sb = new StringBuffer();
//                  while((line=br.readLine())!=null)
//                  {
//                                sb.append(line);
//                  }
//                  PrintWriter pw = new PrintWriter(System.getProperty("user.dir")+responseLocation);
//                  pw.write(sb.toString());
//                  pw.close();
//                  pw.flush();
//
//              }
              
              @Step
              public void enter_deviceName_topology(String deviceName) throws InterruptedException{
            	  createTopologyPage.tbx_deviceName.sendKeys(deviceName); 
            	  Thread.sleep(5000);
            	  jsClick(createTopologyPage.btn_searchDevice);
            	  Thread.sleep(5000);
            	  jsClick(createTopologyPage.chk_deviceName);
            	  Thread.sleep(5000);
      			jsClick(createTopologyPage.btn_AssociateDevices);
      			Thread.sleep(5000);
            	  //tbx_deviceName;
              }
              
              // 
              @Step
            	public void i_enter_CID() {
            	  String CIDvalue=Serenity.sessionVariableCalled("CID");
            	  taskpage.ddl_discnttask_cid.sendKeys(CIDvalue);
            		
            		
            		
            	} 
//////////////////////////////////////////////////////////////////////////////////////////

}


