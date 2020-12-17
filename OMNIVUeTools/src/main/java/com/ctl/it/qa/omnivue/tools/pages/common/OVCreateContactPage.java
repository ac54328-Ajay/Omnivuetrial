package com.ctl.it.qa.omnivue.tools.pages.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateContactPage extends OmniVuePage{

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(OVCreateContactPage.class);
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Create Contact')]")
	public WebElementFacade tab_createcontact;
	
	//---------------------  Label Headers  ----------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General Section']")
	public WebElementFacade lbl_createcontact_gnrlsec;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Contact Type & Role/Level']")
	public WebElementFacade lbl_createcontact_cnttypesec;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Contact Information']")
	public WebElementFacade lbl_createcontact_cntinfosec;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Hours of Availability']")
	public WebElementFacade lbl_createcontact_hrssec;
	
	
	
	@FindBy(id="firstName")
	public WebElementFacade tbx_firstname;
	
	@FindBy(id="lastName")
	public WebElementFacade tbx_lastname;
	
	
	@FindBy(id="contactCategory")
	public WebElementFacade ddl_contactcategory;	
	
	@FindBy(id="timeZone")
	public WebElementFacade ddl_timezone;
	
	@FindBy(id="contactType")
	public WebElementFacade ddl_contacttype;
	
	//@FindBy(xpath=".//*[@id='ContactRole' and @name='ContactRole']/.*[contains(text(),'ACCOUNT')]/input")
	@FindBy(xpath="(.//input[@id='ContactRole'])[1]")
	public WebElementFacade cbx_account;
	
	@FindBy(id="idddCode")
	public WebElementFacade tbx_iddcode;
	
	
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Home')]/../../following-sibling::span//input)[1]")
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_home_filed1;
			
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Home')]/../../following-sibling::span//input)[2]")
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_home_filed2;
					
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Home')]/../../following-sibling::span//input)[3]")
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_home_filed3;
	
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Cell')]/../../following-sibling::span//input)[1]")
	@FindBy(xpath="(.//*[contains(text(),'Cell')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_Cell_filed1;
			
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Cell')]/../../following-sibling::span//input)[2]")
	@FindBy(xpath="(.//*[contains(text(),'Cell')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_Cell_filed2;
					
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Cell')]/../../following-sibling::span//input)[3]")
	@FindBy(xpath="(.//*[contains(text(),'Cell')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_Cell_filed3;
	
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Office')]/../../following-sibling::span//input)[1]")
	@FindBy(xpath="(.//*[contains(text(),'Office')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_Office_filed1;
			
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Office')]/../../following-sibling::span//input)[2]")
	@FindBy(xpath="(.//*[contains(text(),'Office')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_Office_filed2;
					
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[contains(text(),'Office')]/../../following-sibling::span//input)[3]")
	@FindBy(xpath="(.//*[contains(text(),'Office')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_Office_filed3;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Extension')]/../../following-sibling::span//input")
	@FindBy(xpath=".//*[contains(text(),'Extension')]/../../following-sibling::span//input")
	public WebElementFacade tbx_extensions;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Email')]/../../following-sibling::span//input")
	@FindBy(xpath=".//*[contains(text(),'Email')]/../../following-sibling::span//input")
	public WebElementFacade tbx_email;
	
	@FindBy(xpath="(.//*[@id='allDay']/..)[contains(text(),'Email')]/input")
	public WebElementFacade cbx_email;
			
	@FindBy(xpath="(.//*[@id='allDay']/..)[contains(text(),'Office')]/input")
	public WebElementFacade cbx_office;	
			
	@FindBy(xpath="(.//*[@id='allDay']/..)[contains(text(),'Cell')]/input")
	public WebElementFacade cbx_cell;
	
	@FindBy(xpath="(.//*[@id='allDay']/..)[contains(text(),'Home')]/input")
	public WebElementFacade cbx_home;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'24X7')]/../../following-sibling::span//input[@checked='checked']")
	public WebElementFacade cbx_uncheck24x7;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createContact();']")
	public WebElementFacade btn_contact_create;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetContact();']")
	public WebElementFacade btn_contact_reset;
	
	//@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Edit']")
	@FindBy(xpath=".//*[@value='Edit']")
	public WebElementFacade btn_contactview_edit;

	//@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Save']")
	@FindBy(xpath=".//*[@value='Save']")
	public WebElementFacade btn_contactview_save;	
	
	//@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Delete']")
	@FindBy(xpath=".//*[@value='Delete']")
	public WebElementFacade btn_contactview_delete;	
	
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-show='showAlert']")
	@FindBy(xpath=".//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
	public WebElementFacade lbl_alertmsg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
	public List<WebElementFacade> lbl_allXapath;
	
	
	
	public void verify_validation(String validation){
		String Message;
		try {
		switch(validation){
		case "Please enter the Cell Number details in number only.": Message = lbl_alertmsg.getText();					
						Message = Message.trim(); 
						System.out.println("....."+Message);
						if(!Message.equals("Please enter the Cell Number details in number only.")){
							slf4jLogger.error("Invalid message on Delete is displayed."+Message);
							throw new Error("Invalid message on Delete is displayed."+Message);
						} break;		
						
		case "Contact Create screen attributes":	
			waitForElement(lbl_createcontact_cnttypesec); 
				Thread.sleep(3000);
			
			if(!btn_contact_create.isCurrentlyVisible() && !btn_contact_create.isCurrentlyEnabled()){
				slf4jLogger.error("Create button is not displayed in Contact Create page.");
				throw new Error("Create button is not displayed in Contact Create page.");
			}
			if(!btn_contact_reset.isCurrentlyVisible() && !btn_contact_reset.isCurrentlyEnabled()){
				slf4jLogger.error("Reset button is not displayed in Contact Create page.");
				throw new Error("Reset button is not displayed in Contact Create page.");
			}
			
			if(!tab_createcontact.isCurrentlyVisible()){
				slf4jLogger.error("Craete Contact Tab is not displayed in Contact Create page.");
				throw new Error("Craete Contact Tab is not displayed in Contact Create page.");
			}
			
			if(!lbl_createcontact_gnrlsec.isCurrentlyVisible()){
				slf4jLogger.error("General Section header is not displayed in Contact Create page.");
				throw new Error("General Section header is not displayed in Contact Create page.");
			}
			
			if(!lbl_createcontact_cnttypesec.isCurrentlyVisible()){
				slf4jLogger.error("Contact Type & Role/Level header is not displayed in Contact Create page.");
				throw new Error("Contact Type & Role/Level header is not displayed in Contact Create page.");
			}
			
			if(!lbl_createcontact_cntinfosec.isCurrentlyVisible()){
				slf4jLogger.error("Contact Information header is not displayed in Contact Create page.");
				throw new Error("Contact Information header is not displayed in Contact Create page.");
			}
			
			if(!lbl_createcontact_hrssec.isCurrentlyVisible()){
				slf4jLogger.error("Hours of Availability header is not displayed in Contact Create page.");
				throw new Error("Hours of Availability header is not displayed in Contact Create page.");
			}
			
			
			List<WebElementFacade> contact_create_attribute = lbl_allXapath;
			
			ArrayList<String> Contactcreate_Fieldattributelist=new ArrayList<String>();
				for(int j=0;j<contact_create_attribute.size();j++){
					Contactcreate_Fieldattributelist.add(j, contact_create_attribute.get(j).getText());
						//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
					}
			ArrayList<String> List2compare_Contact_Fieldattributelist=new ArrayList<String>();
			
			slf4jLogger.info("tab_currentlydisplayed="+tab_createcontact.getText());
			
			slf4jLogger.info("Fields present:"+Contactcreate_Fieldattributelist);
			List2compare_Contact_Fieldattributelist.add(0, "First Name *");
			List2compare_Contact_Fieldattributelist.add(1, "Last Name *");
			List2compare_Contact_Fieldattributelist.add(2, "Category *");
			List2compare_Contact_Fieldattributelist.add(3, "Time Zone");
			List2compare_Contact_Fieldattributelist.add(4, "Contact Type *");
			List2compare_Contact_Fieldattributelist.add(5, "Preference");
			List2compare_Contact_Fieldattributelist.add(6, "Contact Role/Level *");
			List2compare_Contact_Fieldattributelist.add(7, "IDDD Code");
			List2compare_Contact_Fieldattributelist.add(8, "Home");
			List2compare_Contact_Fieldattributelist.add(9, "Cell");
			List2compare_Contact_Fieldattributelist.add(10, "Office");
			List2compare_Contact_Fieldattributelist.add(11, "Extension");
			List2compare_Contact_Fieldattributelist.add(12, "Pager");
			List2compare_Contact_Fieldattributelist.add(13, "Fax"); 
			List2compare_Contact_Fieldattributelist.add(14, "Smartphone Device");
			List2compare_Contact_Fieldattributelist.add(15, "Email");
			List2compare_Contact_Fieldattributelist.add(16, "Note: Atleast 1 preferred Contact must be selected.");
			List2compare_Contact_Fieldattributelist.add(17, "24X7");
			List2compare_Contact_Fieldattributelist.add(18, "Business Hours");
			List2compare_Contact_Fieldattributelist.add(19, "After Business Hours (Incl. Weekend)"); 
			
			for(int i=0;i<Contactcreate_Fieldattributelist.size();i++){
				if(!Contactcreate_Fieldattributelist.get(i).equals(List2compare_Contact_Fieldattributelist.get(i))){
					slf4jLogger.info("Contactcreate_Fieldattributelist="+Contactcreate_Fieldattributelist.get(i));
					slf4jLogger.info("List2compare_Contact_Fieldattributelist="+List2compare_Contact_Fieldattributelist.get(i)+" Not matching");
					throw new Error("Fields are not matching check:"+tab_createcontact.getText());
				}
			}
			
			waitFor(ddl_contactcategory);
			ddl_contactcategory.selectByIndex(2);
			waitFor(ddl_timezone);
			ddl_timezone.selectByIndex(2);
			waitFor(ddl_contacttype);
			ddl_contacttype.selectByIndex(5);
			
			break;
			
		case "Select checkboxes": jsClick(cbx_account);jsClick(cbx_email);jsClick(cbx_office);jsClick(cbx_cell);jsClick(cbx_home); 
		String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		tbx_lastname.type(date);
							break;
							
		case "Create":jsClick(btn_contact_create);
				Thread.sleep(3000);
			break;
	
															
		case "Uncheck the preferred contact in Contact page": try { 
																jsClick(cbx_account);jsClick(cbx_email);jsClick(cbx_office);jsClick(cbx_cell);jsClick(cbx_home); 
																		Thread.sleep(1000);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}break;
																	
		case "Select at-least one Preferred method of contact. message should be displayed in contact page":Message = lbl_alertmsg.getText();
																						Message = Message.toString().substring(1);		
																						Message = Message.trim(); 
																						if(!Message.equals("Select at-least one Preferred method of contact.")){
																							slf4jLogger.error("Invalid message on Delete is displayed."+Message);
																							throw new Error("Invalid message on Delete is displayed."+Message);
																						}break;
														
														
		}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
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
