package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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

public class OVSearchContactsPage extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	OVSearchCircuitpage searchcircuit;

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@FindBy(id = "contactCategory")
	public WebElementFacade ddl_advancesearch_contact_categorytype;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Contacts')]")
	public WebElementFacade tab_searchcontact_contact;
	
	
	@FindBy(xpath="//*[@id=\"left-content-tab\"]//label[contains(text(),'Contact Information')]")
	public WebElementFacade contact_label;

	// @FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope
	// active']//*[@value='Edit']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@value='Edit']")
	public WebElementFacade btn_contactview_edit;

	// @FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope
	// active']//*[@value='Save']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@value='Save']")
	public WebElementFacade btn_contactview_save;

	// @FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope
	// active']//*[@value='Delete']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@value='Delete']")
	public WebElementFacade btn_contactview_delete;

	// @FindBy(xpath=".//*[@class='tab-pane ng-scope
	// active']//*[@ng-show='showAlert']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_alertmsg;

	// ************************************* Contact General Sections
	// *********************************************//

	// @FindBy(xpath = ".//*[@class='tab-pane ng-scope
	// active']//*[@id='left-content-tab']//*[@ng-controller='invContactDetailCtrl']//*[@ng-if='!isEditMode']/div[2]/div[1]/div[1]/div[1]//span[2]//label")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='First Name']/../../following-sibling::span//label")
	public WebElementFacade tbx_contact_firstname;

	// @FindBy(xpath = ".//*[@class='tab-pane ng-scope
	// active']//*[@id='left-content-tab']//*[@ng-controller='invContactDetailCtrl']//*[@ng-if='!isEditMode']/div[2]/div[1]/div[1]/div[2]//span[2]//label")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Last Name']/../../following-sibling::span//label")
	public WebElementFacade tbx_contact_lastname;

	// ************************************* Contact Audit Log Tab Sections
	// *********************************************//

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_searchcontact_auditlog;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-click='getOVAuditLogs()']")
	public WebElementFacade btn_searchcontact_auditlog_getlogs;

	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]")
	public WebElementFacade lbl_searchcontact_auditlog_updatelog;

	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='CREATE'])[1]")
	public WebElementFacade lbl_searchcontact_auditlog_createlog;

	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='DELETE'])[1]")
	public WebElementFacade lbl_searchcontact_auditlog_deletelog;

	// *************************************************************************************************************//

	// ************************************* Edit Contact General Sections
	// *********************************************//

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='firstName']")
	public WebElementFacade tbx_contact_edit_firstname;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='lastName']")
	public WebElementFacade tbx_contact_edit_lastname;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='contactCategory']")
	public WebElementFacade ddl_contact_edit_category;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='contactType']")
	public WebElementFacade ddl_contact_edit_contacttype;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@class='phone-Number-Text phone-Number-Txt2 ng-valid ng-valid-maxlength ng-dirty ng-valid-parse ng-touched']")
	public WebElementFacade tbx_Cell_filed2;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@class='phone-Number-Text phone-Number-Txt1 ng-valid ng-valid-maxlength ng-dirty ng-valid-parse ng-touched']")
	public WebElementFacade tbx_Cell_filed1;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@class='phone-Number-Text phone-Number-Txt3 ng-valid ng-valid-maxlength ng-dirty ng-valid-parse ng-touched']")
	public WebElementFacade tbx_Cell_filed3;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area'])[1]")
	public WebElementFacade tbx_EDITCONTACT_homefield1;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.prefix'])[1]")
	public WebElementFacade tbx_EDITCONTACT_homefield2;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.lineNmbr'])[1]")
	public WebElementFacade tbx_EDITCONTACT_homefield3;
			
			
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area'])[2]")
	public WebElementFacade tbx_EDITCONTACT_cellfield1;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area'])[3]")
	public WebElementFacade tbx_EDITCONTACT_officefield1;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area'])[4]")
	public WebElementFacade tbx_EDITCONTACT_pagerfield1;
	
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area'])[5]")
	public WebElementFacade tbx_EDITCONTACT_faxfield1;
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='omnivue.BANDWIDTH.$dirty']/div[text()='You left the field blank...']")
	public WebElementFacade lbl_EDITCONTACT_bandwidth_errormessage;
	
	
	

	// ************************************* Related Tab Contact General
	// Sections *********************************************//
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Subscribers']")
	public WebElementFacade tab_Subscriber;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Locations']")
	public WebElementFacade tab_Locations;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
	public WebElementFacade tab_services;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Tasks']")
	public WebElementFacade tab_Tasks;

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Subscriber
	// Relate tab %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//button[@ng-click='openContactSubscriberModal()']")
	public WebElementFacade btn_searchcontact_subsRT_addsubscriber;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//button[@ng-click='searchContactSubscriberLooupData()']")
	public WebElementFacade btn_searchcontact_subsRT_addsubscriber_lookupicon;

	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//input[@ng-model='contactSubscriberLookup.subscriberName']")
	public WebElementFacade tbx_searchcontact_subsRT_addsubscriber_subscriber;

	// @FindBy(xpath = "(.//*[@class='tab-pane ng-scope
	// active']//div[@id='right-content']//div[@id='contenttablesubscriberGrid']//span/..)[1]")
	@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@id='contenttablesubscriberGrid']//div[text()='TEST - JANET']/../preceding-sibling::div//div)[3]")
	public WebElementFacade cbx_searchcontact_subsRT_addsubscriber_result;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//button[@ng-click='addLookUpSubscribers()']")
	public WebElementFacade btn_searchcontact_subsRT_addsubscriber_assciate;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@class='tab-pane ng-scope active']//input[@title='View Subscriber']")
	public WebElementFacade lbl_searchcontact_subsRT_addsubscriber_assciate_viewicon;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@class='tab-pane ng-scope active']//input[@title='View Subscriber']/../../preceding-sibling::div//span/..")
	public WebElementFacade cbx_searchcontact_subsRT_checkbox;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@class='tab-pane ng-scope active']//button[@ng-click='deleteAssociatedSubscriber()']")
	public WebElementFacade btn_searchcontact_subsRT_delete;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@ng-click='refreshDetails()']")
	public WebElementFacade btn_searchcontact_subsRT_refreshicon;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@id='refreshLocationButton']")
	public WebElementFacade btn_searchcontact_lcnRT_refreshicon;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@ng-click='refreshServices()']")
	public WebElementFacade btn_searchcontact_serviceRT_refreshicon;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//li[@ng-click='refreshTaskResults()']")
	public WebElementFacade btn_searchcontact_taskRT_refreshicon;

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Location Relate tab
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

	@FindBy(xpath = "(.//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[text()='Add Locations'])[2]")
	public WebElementFacade btn_searchcontact_locnRT_addlocn;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@title='Look Up']")
	public WebElementFacade btn_searchcontact_locnRT_addlocn_lookup;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[text()='Address#']/following-sibling::input")
	public WebElementFacade tbx_searchcontact_locnRT_addlocn_address;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[text()='State']/following-sibling::select")
	public WebElementFacade ddl_searchcontact_locnRT_addlocn_state;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//span[text()='Address']/parent::div/parent::div/parent::div/parent::div/div[1]//span")
	public WebElementFacade cbx_searchcontact_locnRT_addlocn_selectall;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='addLookUpLocations()']")
	public WebElementFacade btn_searchcontact_locnRT_addlocn_associatelocn;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@ng-click='gridSettings.viewLocationDetail(0)']")
	public WebElementFacade btn_searchcontact_locnRT_addlocn_view;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@id='columntablelocationGrid']/div[1]//span")
	public WebElementFacade cbx_searchcontact_locnRT_addlocn_associated_selectall;

	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='deleteAssociatedLocation()']")
	public WebElementFacade btn_searchcontact_locnRT_addlocn_deletelocn;

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

	// %%%%%%%%%%%%%%% Advance Contact Search Validation %%%%%%%%%%%%%%%%//

	@FindBy(xpath = ".//input[@ng-model='contactRequest.contactFirstName']")
	public WebElementFacade tbx_contact_advancesearch_firstname;

	@FindBy(xpath = ".//select[@ng-model='contactRequest.contactRole']")
	public WebElementFacade ddl_contact_advancesearch_role;

	@FindBy(xpath = ".//select[@ng-model='contactRequest.contactType']")
	public WebElementFacade ddl_contact_advancesearch_contacttype;

	@FindBy(xpath = ".//button[@ng-click='contactSearch();']")
	public WebElementFacade btn_contact_advancesearch_search;

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

	// %%%%%%%%%%%%%%% Service Relate tab %%%%%%%%%%%%%%%%//

	@FindBy(xpath = ".//button[@ng-click='openContactServiceModal();']")
	public WebElementFacade btn_contact_relatedtab_services_addservices;

	@FindBy(xpath = "//button[@ng-click='deleteAssociatedService();']")
	public WebElementFacade btn_contact_relatedtab_services_delete;

	@FindBy(xpath = ".//input[@ng-click='changePlaceholder();' and @value='Subscriber']")
	public WebElementFacade rbn_contact_addservices_Services_related_to_Subscriber;

	@FindBy(xpath = ".//input[@placeholder='Enter Customer Name(%)']")
	public WebElementFacade tbx_addservicecontact;

	@FindBy(xpath = ".//div[@ng-if=\"lookupFor=='Subscriber'\"]//tbody/tr[1]//a")
	public WebElementFacade lbl_1st_subscriber;

	@FindBy(xpath = ".//span[contains(text(),'Customer Name')]")
	public WebElementFacade lbl_coloum_customername;

	@FindBy(xpath = ".//div[@role='checkbox']/div/div")
	public WebElementFacade cbk_selectall_customername;

	@FindBy(xpath = ".//button[@ng-click='searchServiceContactlookUp(searchData,lookupFor);']")
	public WebElementFacade btn_search_addservice_lookup;

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]")
	public WebElementFacade lbl_RT_alertmsg;
	
	
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//
	public void advance_contact_search(String subtype) throws Throwable {
		if (subtype.equals("Category-Help Desk")) {
			ddl_advancesearch_contact_categorytype.selectByValue("HELP DESK");
		}

	}

	public ArrayList<String> contact_advancesearch_searchslider(String subtype) throws Throwable {
		ArrayList<String> name = new ArrayList<String>();
		// String[] name = null;
		slf4jLogger.info("First Name:" + tbx_contact_firstname.getText());
		slf4jLogger.info("Last Name:" + tbx_contact_lastname.getText());

		if (!tbx_contact_firstname.getText().isEmpty() && !tbx_contact_lastname.getText().isEmpty()) {
			name.add(0, tbx_contact_firstname.getText().replaceAll("\\s", ""));
			name.add(1, tbx_contact_lastname.getText().replaceAll("\\s", ""));
			// name[1]=tbx_contact_lastname.getText().replaceAll("\\s","");
		} else {
			throw new Error("Invalid Contact details");
		}

		return name;

	}

	public void tabname_validations() throws Throwable {
		String contactname = searchcircuit.tab_search_result_details.getText().replaceAll("\\s", "");

		if (contactname.equals(tbx_contact_firstname.getText().replaceAll("\\s", "")
				+ tbx_contact_lastname.getText().replaceAll("\\s", ""))) {
			slf4jLogger.info("Contact Name Matches as expected");
		} else {
			throw new Error("Contact Details are not matching");
		}
	}

	public String window_switch() {
		// String Parent_Window = driver.getWindowHandle();
		String Parent_Window = getDriver().getWindowHandle();
		// btn_locationLookup);
		try {
			// Thread.sleep(5000);
			slf4jLogger.info("cliked on location lookup");
			Thread.sleep(3000);
			//Set<String> allWindowHandles = getDriver().getWindowHandles();
			for (String allWindowHandles1 : getDriver().getWindowHandles()) {

				slf4jLogger.info(allWindowHandles1);

				getDriver().switchTo().window(allWindowHandles1);
				slf4jLogger.info("switched..............");
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Parent_Window;

	}

	public void verify_validation(String validation) {
		try {
			String Message = null;
			switch (validation) {
			case "Contact Search screen":
							Thread.sleep(2000);
							waitForElement(btn_contactview_edit);				
							break;
							
			case "search the contact with first name as Auto":
								waitForElement(tbx_contact_advancesearch_firstname); Thread.sleep(2000);
								tbx_contact_advancesearch_firstname.type("Auto");								
								break;
			case "Error message should be displayed as fields are left blank in the circuit page":
				Thread.sleep(2000);
				System.out.println("Reached the validation for the error message");
				if(!lbl_EDITCONTACT_bandwidth_errormessage.isCurrentlyVisible()){
					slf4jLogger.error("Invalid message on entering invalid cell number is displayed.");
					slf4jLogger.error("Invalid message on entering invalid cell number is displayed.");
				}
				
				System.out.println("Completed the validation for the error message");
				break;
			case "Please enter the Cell Number details in number only. message is displayed in the contact screen":waitForElement(lbl_alertmsg);
							Message = lbl_alertmsg.getText();
							Message = Message.toString().substring(1);
							Message = Message.trim();
							if (!Message.equals("Please enter the Home Number details in number only.")) {
								slf4jLogger.error("Invalid message on entering invalid cell number is displayed." + Message);
								throw new Error("Invalid message on entering invalid cell number is displayed." + Message);
							}				
							break;
				
			case "Invalid cell number":
							waitFor(tbx_EDITCONTACT_homefield1);
							//jsClick(tbx_Cell_filed1);
						
							tbx_EDITCONTACT_homefield1.type("35K");
							//jsClick(tbx_Cell_filed2);
							//tbx_Cell_filed2.clear();
							tbx_EDITCONTACT_homefield2.type("37L");
							//jsClick(tbx_Cell_filed3);
							//tbx_Cell_filed3.clear();
							tbx_EDITCONTACT_homefield3.type("377P");
							break;			
			case "Contact Detail updated successfully. message should be displayed in contact screen":
						verify_validation("Contact Detail updated successfully message is displayed");				
						break;
						
			case "modify the firstname, lastname, category & type in edit contact screen":
								waitForElement(btn_contactview_save);
								tbx_contact_edit_firstname.type("Modify_Auromation");
								tbx_contact_edit_lastname.type("Modify");
								
								ddl_contact_edit_category.selectByVisibleText("OPERATIONS CENTER");
								ddl_contact_edit_contacttype.selectByVisibleText("LCON");				
							break;
			
			case "Add service should be displayed for the PNCO contact type in Services related Tab": waitForElement(btn_contact_relatedtab_services_addservices);
									jsClick(btn_contact_relatedtab_services_addservices);
									jsClick(rbn_contact_addservices_Services_related_to_Subscriber);Thread.sleep(1000);
									tbx_addservicecontact.sendKeys("Test");
									jsClick(btn_search_addservice_lookup);
									Thread.sleep(4000);
									jsClick(lbl_1st_subscriber);
									
									Thread.sleep(4000);
									waitForElement(lbl_coloum_customername);
									waitForElement(lbl_RT_alertmsg);
									Message = lbl_RT_alertmsg.getText();
									Message = Message.toString().substring(1);
									Message = Message.trim();
									if (!Message.contains("Selected service(s) associated successfully .")) {
										slf4jLogger.debug("Invalid message on Save is displayed." + Message);
										throw new Error("Invalid message on Save is displayed." + Message);
									}
									browser_zoom_in(4);
									lbl_coloum_customername.isPresent();
									Thread.sleep(4000);
									// jsClick(cbk_selectall_customername);
									cbk_selectall_customername.click();Thread.sleep(2000);
									jsClick(btn_contact_relatedtab_services_delete);
									Thread.sleep(4000);
					
									break;
									
			case "search with Contact Type as PNCO first name as AUTO and role as circuit":
							tbx_contact_advancesearch_firstname.sendKeys("AUTOMATION");
							ddl_contact_advancesearch_role.selectByVisibleText("Circuit");
							ddl_contact_advancesearch_contacttype.selectByVisibleText("Proactive Notification Contact");
							jsClick(btn_contact_advancesearch_search);
							Thread.sleep(2000);
							break;
			case "Add Locations":
				waitForElement(btn_searchcontact_locnRT_addlocn);
				jsClick(btn_searchcontact_locnRT_addlocn);
				waitForElement(btn_searchcontact_locnRT_addlocn_lookup);
				break;

			case "Add Locations functionality in Contact screen":
				waitForElement(btn_searchcontact_locnRT_addlocn);
				jsClick(btn_searchcontact_locnRT_addlocn);
				waitForElement(btn_searchcontact_locnRT_addlocn_lookup);
				Message = window_switch();
				tbx_searchcontact_locnRT_addlocn_address.type("123");

				ddl_searchcontact_locnRT_addlocn_state.selectByVisibleText("FL-Florida");
				Thread.sleep(2000);

				getDriver().switchTo().window(Message);
				Thread.sleep(5000);
				jsClick(btn_searchcontact_locnRT_addlocn_lookup);

				waitForElement(btn_searchcontact_locnRT_addlocn_associatelocn);

				jsClick(cbx_searchcontact_locnRT_addlocn_selectall);
				Thread.sleep(3000);

				jsClick(btn_searchcontact_locnRT_addlocn_associatelocn);

				waitForElement(btn_searchcontact_locnRT_addlocn_view);
				Thread.sleep(3000);

				jsClick(cbx_searchcontact_locnRT_addlocn_associated_selectall);
				Thread.sleep(2000);

				jsClick(btn_searchcontact_locnRT_addlocn_deletelocn);
				Thread.sleep(2000);
				waitForElement(btn_searchcontact_locnRT_addlocn);

				break;

			case "Category as NETWORK MANAGEMENT SERVICES":
				waitForElement(ddl_contact_edit_category);
				ddl_contact_edit_category.selectByVisibleText("NETWORK MANAGEMENT SERVICES");
				break;
			case "click on Audit Tab in Contact Screen to verify the log is been registered for Update action":
				jsClick(tab_searchcontact_auditlog);
				waitForElement(btn_searchcontact_auditlog_getlogs);
				jsClick(btn_searchcontact_auditlog_getlogs);
				waitForElement(lbl_searchcontact_auditlog_updatelog);
				if (!lbl_searchcontact_auditlog_updatelog.isCurrentlyVisible()) {
					slf4jLogger.error("Update Log is not present in audit log");
					throw new Error("Update Log is not present in audit log");
				}
				jsClick(tab_searchcontact_contact);
				break;

			case "click on Audit Tab in Contact Screen to verify the log is been registered for Create action":
				jsClick(tab_searchcontact_auditlog);
				waitForElement(btn_searchcontact_auditlog_getlogs);
				jsClick(btn_searchcontact_auditlog_getlogs);
				waitForElement(lbl_searchcontact_auditlog_createlog);
				if (!lbl_searchcontact_auditlog_createlog.isCurrentlyVisible()) {
					slf4jLogger.error("Create Log is not present in audit log");
					throw new Error("Create Log is not present in audit log");
				}
				jsClick(tab_searchcontact_contact);
				break;

			case "click on Audit Tab in Contact Screen to verify the log is been registered for Delete action":
				jsClick(tab_searchcontact_auditlog);
				waitForElement(btn_searchcontact_auditlog_getlogs);
				jsClick(btn_searchcontact_auditlog_getlogs);
				waitForElement(lbl_searchcontact_auditlog_deletelog);
				if (!lbl_searchcontact_auditlog_deletelog.isCurrentlyVisible()) {
					slf4jLogger.error("Delete Log is not present in audit log");
					throw new Error("Delete Log is not present in audit log");
				}
				jsClick(tab_searchcontact_contact);
				break;
			case "Edit":
				waitForElement(btn_contactview_edit);
				jsClick(btn_contactview_edit);
				waitForElement(btn_contactview_save);
				break;
			case "Save":
				jsClick(btn_contactview_save); Thread.sleep(3000);
				if(btn_contactview_edit.isCurrentlyVisible()){
					verify_validation("Contact Detail updated successfully message is displayed");
				}
				
				break;
			case "Contact Detail updated successfully message is displayed":
				Message = lbl_alertmsg.getText();
				Message = Message.toString().substring(1);
				Message = Message.trim();
				if (!Message.equals("Contact Detail updated successfully.")) {
					throw new Error("Invalid message on Save is displayed." + Message);
				}
				break;

			case "Delete":
				waitForElement(btn_contactview_edit);
				jsClick(btn_contactview_delete);
				getDriver().switchTo().alert().accept();
				waitForElement(lbl_alertmsg);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				verify_validation("Contact Successfully deleted message is displayed");
				break;

			case "Contact Successfully deleted message is displayed":
				Message = lbl_alertmsg.getText();
				Message = Message.toString().substring(1);
				Message = Message.trim();
				if (!Message.equals("Contact Successfully deleted")) {
					slf4jLogger.error("Invalid message on Delete is displayed." + Message);
					throw new Error("Invalid message on Delete is displayed." + Message);
				}
				break;

			case "Add Subscribers":
				waitForElement(btn_searchcontact_subsRT_addsubscriber);
				browser_zoom_in(4);
				jsClick(btn_searchcontact_subsRT_addsubscriber);
				waitForElement(btn_searchcontact_subsRT_addsubscriber_lookupicon);
				break;
			case "Add subscriber functionality in Contact screen":
				try {
					waitForElement(btn_searchcontact_subsRT_addsubscriber_lookupicon);
					tbx_searchcontact_subsRT_addsubscriber_subscriber.type("TEST - JANET");
					jsClick(btn_searchcontact_subsRT_addsubscriber_lookupicon);
					waitFor(cbx_searchcontact_subsRT_addsubscriber_result);
					Thread.sleep(2000);

					// jscheckbox(cbx_searchcontact_subsRT_addsubscriber_result);
					// Thread.sleep(2000);
					cbx_searchcontact_subsRT_addsubscriber_result.click();
					Thread.sleep(2000);
					jsClick(btn_searchcontact_subsRT_addsubscriber_assciate);
					Thread.sleep(2000);
					waitForElement(btn_searchcontact_subsRT_delete);
					Thread.sleep(2000);

					if (!lbl_searchcontact_subsRT_addsubscriber_assciate_viewicon.isCurrentlyVisible()) {
						slf4jLogger.error("Subscriber didn't get associate");
						throw new Error("Subscriber didn't get associate");
					}

					cbx_searchcontact_subsRT_checkbox.click();
					Thread.sleep(2000);
					jsClick(btn_searchcontact_subsRT_delete);
					getDriver().switchTo().alert().accept();
					Thread.sleep(2000);
					jsClick(btn_searchcontact_subsRT_refreshicon);
					Thread.sleep(2000);
					if (lbl_searchcontact_subsRT_addsubscriber_assciate_viewicon.isCurrentlyVisible()) {
						slf4jLogger.error("Subscriber didn't get Removed");
						throw new Error("Subscriber didn't get Removed");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				browser_zoom_out(4);
				break;

			case "Manual Refresh icon should is displayed for each tab in Contact screen":
				try {
					jsClick(tab_Subscriber);
					Thread.sleep(2000);
					if (!btn_searchcontact_subsRT_refreshicon.isCurrentlyVisible()
							&& !btn_searchcontact_subsRT_refreshicon.isCurrentlyEnabled()) {
						slf4jLogger.error("Refresh Icon is missing in Subscriber Related Tab in Contact page");
						throw new Error("Refresh Icon is missing in Subscriber Related Tab in Contact page");
					}
					jsClick(tab_Locations);
					Thread.sleep(2000);
					if (!btn_searchcontact_lcnRT_refreshicon.isCurrentlyVisible()
							&& !btn_searchcontact_lcnRT_refreshicon.isCurrentlyEnabled()) {
						slf4jLogger.error("Refresh Icon is missing in Location Related Tab in Contact page");
						throw new Error("Refresh Icon is missing in Location Related Tab in Contact page");
					}
					jsClick(tab_services);
					Thread.sleep(2000);
					if (!btn_searchcontact_serviceRT_refreshicon.isCurrentlyVisible()
							&& !btn_searchcontact_serviceRT_refreshicon.isCurrentlyEnabled()) {
						slf4jLogger.error("Refresh Icon is missing in Service Related Tab in Contact page");
						throw new Error("Refresh Icon is missing in Service Related Tab in Contact page");
					}
					jsClick(tab_Tasks);
					Thread.sleep(2000);
					if (!btn_searchcontact_taskRT_refreshicon.isCurrentlyVisible()
							&& !btn_searchcontact_taskRT_refreshicon.isCurrentlyEnabled()) {
						slf4jLogger.error("Refresh Icon is missing in Task Related Tab in Contact page");
						throw new Error("Refresh Icon is missing in Task Related Tab in Contact page");
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case "Contact Search screen attributes":
				waitForElement(btn_contactview_edit);
				Thread.sleep(2000);
				if (!tab_searchcontact_contact.isCurrentlyVisible()) {
					slf4jLogger.error("Contacts Tab is not displayed in Contact page");
					throw new Error("Contacts Tab is not displayed in Contact page");
				}
				if (!tab_searchcontact_auditlog.isCurrentlyVisible()) {
					slf4jLogger.error("Audit log Tab is not displayed in Contact page");
					throw new Error("Audit log Tab is not displayed in Contact page");
				}

				if (!btn_contactview_edit.isCurrentlyVisible() && !btn_contactview_edit.isCurrentlyEnabled()) {
					slf4jLogger.error("Edit button is not displayed in Contact page");
					throw new Error("Edit button is not displayed in Contact page");
				}

				if (!btn_contactview_delete.isCurrentlyVisible() && !btn_contactview_delete.isCurrentlyEnabled()) {
					slf4jLogger.error("Delete button is not displayed in Contact page");
					throw new Error("Delete button is not displayed in Contact page");
				}
				if (!tab_Subscriber.isCurrentlyVisible()) {
					slf4jLogger.error("Subscriber Related Tab is not displayed in Contact page");
					throw new Error("Subscriber Related Tab is not displayed in Contact page");
				}
				if (!tab_Locations.isCurrentlyVisible()) {
					slf4jLogger.error("Location Related Tab is not displayed in Contact page");
					throw new Error("Location Related Tab is not displayed in Contact page");
				}
				if (!tab_Tasks.isCurrentlyVisible()) {
					slf4jLogger.error("Task Related Tab is not displayed in Contact page");
					throw new Error("Task Related Tab is not displayed in Contact page");
				}
				if (!tab_services.isCurrentlyVisible()) {
					slf4jLogger.error("Service Related Tab is not displayed in Contact page");
					throw new Error("Service Related Tab is not displayed in Contact page");
				}
				

				 waitForElement(btn_contactview_edit); 
	              jsClick(btn_contactview_edit);
	              waitForElement(ddl_contact_edit_category);
	              ddl_contact_edit_category.selectByIndex(1);
	              ddl_contact_edit_contacttype.selectByIndex(1);
				break;

			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public WebElement waitForElement(WebElement elementToBeLoaded) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 300);

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

	public void jscheckbox(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			if (!element.isSelected()) {
				element.click();
				Thread.sleep(3000);
				System.out.println("Got clicked on the normal click");
				Thread.sleep(3000);
				if (!element.isSelected()) {
					// browser_zoom_in(4);
					if (!element.isSelected()) {
						element.click();
						Thread.sleep(3000);

					}
					if (!element.isSelected()) {
						JavascriptExecutor executor = (JavascriptExecutor) getDriver();
						executor.executeScript("arguments[0].click();", element);
						Thread.sleep(3000);
						System.out.println("Got clicked on the JavascriptExecutor click");
					}

					// browser_zoom_out(4);
				}

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void browser_zoom_in(int n) throws InterruptedException {
		slf4jLogger.info("Performing Zoom");

		Robot r;
		try {
			r = new Robot();

			for (int i = 0; i < n; i++) {
				// loginPage.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,
				// Keys.SUBTRACT));
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ADD);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_ADD);
				
				
			}
			r.keyRelease(KeyEvent.VK_CONTROL);
			// r.keyRelease(KeyEvent.VK_SUBTRACT);
			// r.keyRelease(KeyEvent.VK_CONTROL);
			// getDriver().navigate().refresh();

			Thread.sleep(1000);

			// slf4jLogger.info("Done with screen sizing");
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void browser_zoom_out(int n) throws InterruptedException {
		slf4jLogger.info("Performing Zoom Out");

		Robot r;
		try {
			r = new Robot();

			for (int i = 0; i < n; i++) {
				// loginPage.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,
				// Keys.SUBTRACT));
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_SUBTRACT);
				Thread.sleep(500);
				r.keyRelease(KeyEvent.VK_SUBTRACT);
		
				
			}
			r.keyRelease(KeyEvent.VK_CONTROL);
			// r.keyRelease(KeyEvent.VK_SUBTRACT);
			// r.keyRelease(KeyEvent.VK_CONTROL);
			// getDriver().navigate().refresh();

			Thread.sleep(1000);

			// slf4jLogger.info("Done with screen sizing");
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
