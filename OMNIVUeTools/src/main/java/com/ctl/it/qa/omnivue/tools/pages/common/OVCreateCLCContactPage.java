package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateCLCContactPage extends OmniVuePage{
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//################	Create CLC Contact Page validations  ############################//
	
	@FindBy(xpath=".//*[@id='mainTab']//tab-heading[contains(text(),'Create CLC Contact')]")
	public WebElementFacade tab_CLCContactCreate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[text()='General Section']")
	public WebElementFacade lbl_Generalsection;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")
	public List<WebElementFacade> lbl_allXapath;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createCLCContact();']")
	public WebElementFacade btn_clccontactcreate_create;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetCLCContact();']/i")
	public WebElementFacade btn_clccontactcreate_reset;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='createCLCContactCtrl']//div[@ng-show='showAlert']")
	public WebElementFacade lbl_alertmsg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'First Name')]/../../..//p[text()='You left a required field blank.']")
	public WebElementFacade lbl_alertmsg_firstname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Last Name')]/../../..//p[text()='You left a required field blank.']")
	public WebElementFacade lbl_alertmsg_lstname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Email')]/../../..//p[text()='You left a required field blank.']")
	public WebElementFacade lbl_alertmsg_email;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Email')]/../../..//p[text()='Please enter a valid Email ID.']")
	public WebElementFacade lbl_alertmsg_invalidemail;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Telephone Number')]/../../..//p[text()='You left a required field blank.']")
	public WebElementFacade lbl_alertmsg_telephone;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Telephone Number')]/../../..//p[text()='Please enter a valid telephone number.']")
	public WebElementFacade lbl_alertmsg_invalidtelephone;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//p[text()='Please associate atleast one customer.']")
	public WebElementFacade lbl_alertmsg_associatedcustomer;
	
	@FindBy(xpath="(.//*[@value='LookUp'])[4]")
	public WebElementFacade btn_clccontactcreate_custnamelookup_subscriberlookup1;
	
	@FindBy(xpath="(.//*[@id='mainTab']//li[@class='ng-isolate-scope active']/following-sibling::li//tab-heading)[1]")
	public WebElementFacade tab_inactivetab;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']/button")
	public WebElementFacade btn_alertmsg_closeicon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='firstName']")
	public WebElementFacade tbx_clccontactcreate_firstname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='lastName']")
	public WebElementFacade tbx_clccontactcreate_lastname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='EMAIL']")
	public WebElementFacade tbx_clccontactcreate_email;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area']")
	public WebElementFacade tbx_clccontactcreate_telephone1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='contactData.prefix']")
	public WebElementFacade tbx_clccontactcreate_telephone2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='contactData.lineNmbr']")
	public WebElementFacade tbx_clccontactcreate_telephone3;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'openSubscriberLookUp();')]/i")
	public WebElementFacade btn_clccontactcreate_custnamelookup;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invSubscriber.subscriberName']")
	public WebElementFacade tbx_clccontactcreate_custnamelookup_subscribername;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@value='LookUp']")
	public WebElementFacade btn_clccontactcreate_custnamelookup_subscriberlookup;
	
	@FindBy(xpath="(.//*[@ng-click='lookupData(subscriberLookupData);']/span)[1]")
	public WebElementFacade lbl_clccontactcreate_custnamelookup_subscriber;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-repeat='customer in editContactParam.customerDetailList']//button")
	public WebElementFacade lbl_clccontactcreate_custnameadded;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-repeat='customer in editContactParam.customerDetailList']//button)[2]")
			public WebElementFacade lbl_clccontactcreate_custnameadded2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-repeat='customer in editContactParam.customerDetailList']//button")
	public WebElementFacade btn_clccontactcreate_custnameadded_remove;
	
	//**************	Negative Scenario ******************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-message='validation']/p")
	public WebElementFacade lbl_clccontactcreate_invalidmsg;
	
//#######################		Search CLC contact page ##########################//
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_CCLcontact_searchpage_edit;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='First Name']/following-sibling::label")
	public WebElementFacade tbx_CCLcontact_searchpage_firstname;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[contains(text(),'Last Name')]/following-sibling::label")
	public WebElementFacade tbx_CCLcontact_searchpage_lastname;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='Email']/following-sibling::label")
	public WebElementFacade tbx_CCLcontact_searchpage_email;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='Telephone Number']/following-sibling::label")
	public WebElementFacade tbx_CCLcontact_searchpage_telephonenumber;
	
	@FindBy(xpath = ".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='detail-section-border']//label[text()='Customer Name']/following-sibling::label")
	public WebElementFacade tbx_CCLcontact_searchpage_customername;
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	
	public void verify_validation(String validation){
		String Message;
		switch(validation){
		case "CLC Contact Create screen attributes":
										waitForElement(btn_clccontactcreate_create);
										if(!lbl_Generalsection.isCurrentlyVisible()){
																						throw new Error("General Section label is not displayed");
																					}
									List<WebElementFacade> clccontactcreate_attribute = lbl_allXapath;
									ArrayList<String> clccontactcreate_Fieldattributelist=new ArrayList<String>();
									for(int j=0;j<clccontactcreate_attribute.size();j++){
										clccontactcreate_Fieldattributelist.add(j, clccontactcreate_attribute.get(j).getText().trim());
											//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
										}
									//System.out.println(clccontactcreate_Fieldattributelist);
										ArrayList<String> List2compare_clccontact_Fieldattributelist=new ArrayList<String>();
										List2compare_clccontact_Fieldattributelist.add(0, "First Name *");
										List2compare_clccontact_Fieldattributelist.add(1, "Last Name *");
										List2compare_clccontact_Fieldattributelist.add(2, "Email *");
										List2compare_clccontact_Fieldattributelist.add(3, "Telephone Number *");
										List2compare_clccontact_Fieldattributelist.add(4, "Company/Customer Name *");
										
										for(int i=0;i<clccontactcreate_Fieldattributelist.size();i++){
											if(!clccontactcreate_Fieldattributelist.get(i).equals(List2compare_clccontact_Fieldattributelist.get(i))){
												slf4jLogger.info("clccontactcreate_Fieldattributelist="+clccontactcreate_Fieldattributelist.get(i));
												slf4jLogger.info("List2compare_clccontact_Fieldattributelist="+List2compare_clccontact_Fieldattributelist.get(i)+" Not matching");
												throw new Error("Fields are not matching check");
											}
										} break;
										
		case "Warning message displayed on all the mandatory fields when create button is clicked if no data is entered in CLC Contact create page":
										waitForElement(btn_clccontactcreate_create);
										jsClick(btn_clccontactcreate_create);
										verify_validation("Mandatory attribute missing.");
										 break;
			
		case "POP-Up messsage is displayed on clicking on Reset button in CLC Contact create page":
										waitForElement(btn_clccontactcreate_reset);
										jsClick(btn_clccontactcreate_reset);
										slf4jLogger.info("Alert message displayed as:"+getDriver().switchTo().alert().getText());
										getDriver().switchTo().alert().accept();break;
			
		
		case "Mandatory attribute missing.": if(!lbl_alertmsg_firstname.isCurrentlyVisible()){
											throw new Error("Wrong message is displayed as "+lbl_alertmsg_firstname.getText());
											}
											 if(!lbl_alertmsg_lstname.isCurrentlyVisible()){
													throw new Error("Wrong message is displayed as "+lbl_alertmsg_lstname.getText());
													}
											 if(!lbl_alertmsg_email.isCurrentlyVisible()){
													throw new Error("Wrong message is displayed as "+lbl_alertmsg_email.getText());
													}
											 if(!lbl_alertmsg_telephone.isCurrentlyVisible()){
													throw new Error("Wrong message is displayed as "+lbl_alertmsg_telephone.getText());
													}
											 if(!lbl_alertmsg_associatedcustomer.isCurrentlyVisible()){
													throw new Error("Wrong message is displayed as "+lbl_alertmsg_associatedcustomer.getText());
													}
									 break;
			
		case "Create":
						try {
							jsClick(btn_clccontactcreate_create);
							//waitForElement(lbl_alertmsg);			
							
								Thread.sleep(3000);
							
						} catch (NoSuchElementException|InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							};break;
		
		case "Customer Name is added in the CLC Contact page": 	if(!lbl_clccontactcreate_custnameadded.isCurrentlyVisible() && !btn_clccontactcreate_custnameadded_remove.isCurrentlyVisible()){
																	throw new Error("Customer name is not added re-verify in CLC contact page");
																} break;
																
		case "Contact created successfully. message is displayed in the CLC Contact create page": 
										waitForElement(btn_CCLcontact_searchpage_edit);
										jsClick(tab_CLCContactCreate);
										waitForElement(lbl_alertmsg);
										verify_validation("Contact created successfully.");
										jsClick(tab_inactivetab);
										waitForElement(btn_CCLcontact_searchpage_edit);break;
										
		case "Contact created successfully.": Message = lbl_alertmsg.getText();
											Message = Message.toString().substring(1);
											
											Message = Message.trim(); 
											if(!Message.contains("Contact created successfully.")){
												throw new Error("Wrong message is displayed as "+Message);
											} break;
		
		case "Contact already present in the database. message is displayed in the CLC Contact create page": Message = lbl_alertmsg.getText();
											Message = Message.toString().substring(1);
											
											Message = Message.trim(); 
											if(!Message.contains("Contact already present in the database")){
												throw new Error("Wrong message is displayed as "+Message);
											} break;
											
		case "provide the Invalid Email id in CLC contact create page":
								tbx_clccontactcreate_email.type("1234$Test");break;
								
		case "Please enter valid Email ID message is displayed in the CLC Contact create page": waitForElement(lbl_alertmsg_invalidemail);
											/*Message = lbl_alertmsg.getText();
											Message = Message.toString().substring(1);
											
											Message = Message.trim(); 
											if(!Message.contains("Please enter valid Email ID")){
												throw new Error("Wrong message is displayed as "+Message);
											} */  /*if(!lbl_clccontactcreate_invalidmsg.getText().trim().equals("Please enter a valid Email ID.")){*/
									if(!lbl_alertmsg_invalidemail.isCurrentlyVisible()){
										throw new Error("Wrong message is displayed as "+lbl_alertmsg_email.getText());
										}break;
											
		case "provide the Invalid Phone number in CLC contact create page":
			tbx_clccontactcreate_telephone2.type("#%$");break;
			
		case "Please enter a valid telephone number. message is displayed in the CLC Contact create page":waitForElement(lbl_alertmsg_invalidtelephone);
			/*Message = lbl_alertmsg.getText();
			Message = Message.toString().substring(1);
			
			Message = Message.trim(); 
			if(!Message.contains("Please enter valid 10 digit number.")){
				throw new Error("Wrong message is displayed as "+Message);
			} */
			
		/*	if(!lbl_clccontactcreate_invalidmsg.getText().trim().equals("Please enter a valid telephone number.")){*/
			if(!lbl_alertmsg_invalidtelephone.isCurrentlyVisible()){
				throw new Error("Wrong message is displayed as "+lbl_alertmsg_telephone.getText().trim());
			}break;
			
		case "Multiple Subscriber can be linked in Customer name field":fill_fields("Adding another subscriber","Test");break;
		
		
			
		}
	}
	
	public void fill_fields(String container2, String container3){
		switch(container2){
		case "TC243501":waitForElement(btn_clccontactcreate_custnamelookup);
							//System.out.println("Reached here");
							tbx_clccontactcreate_firstname.type("Automation");
							tbx_clccontactcreate_lastname.type("OVTest");
							tbx_clccontactcreate_email.type("OVAutomation@centurylink.com");
							tbx_clccontactcreate_telephone1.type("402");
							tbx_clccontactcreate_telephone2.type("998");
							tbx_clccontactcreate_telephone3.type("9052");
							jsClick(btn_clccontactcreate_custnamelookup);
							waitForElement(btn_clccontactcreate_custnamelookup_subscriberlookup);
							tbx_clccontactcreate_custnamelookup_subscribername.type("TEST - JANET");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							jsClick(btn_clccontactcreate_custnamelookup_subscriberlookup);
							waitForElement(lbl_clccontactcreate_custnamelookup_subscriber);
							jsClick(lbl_clccontactcreate_custnamelookup_subscriber);
							waitForElement(lbl_clccontactcreate_custnameadded);
							break;
							
		case "Existing": waitForElement(btn_CCLcontact_searchpage_edit) ;
						String fn=tbx_CCLcontact_searchpage_firstname.getText();
						String ln=tbx_CCLcontact_searchpage_lastname.getText();
						String email=tbx_CCLcontact_searchpage_email.getText();
						String telephone=tbx_CCLcontact_searchpage_telephonenumber.getText();
						String[] ary=telephone.split("");
					
						jsClick(tab_CLCContactCreate);
						tbx_clccontactcreate_firstname.type(fn);
						tbx_clccontactcreate_lastname.type(ln);
						tbx_clccontactcreate_email.type(email);
					
						slf4jLogger.info("telephone:"+telephone);
						slf4jLogger.info("ary:"+ary);
						tbx_clccontactcreate_telephone1.type(ary[0]+ary[1]+ary[2]);
						tbx_clccontactcreate_telephone2.type(ary[3]+ary[4]+ary[5]);
						tbx_clccontactcreate_telephone3.type(ary[6]+ary[7]+ary[8]+ary[9]);
						jsClick(btn_clccontactcreate_custnamelookup);
						waitForElement(btn_clccontactcreate_custnamelookup_subscriberlookup);
						tbx_clccontactcreate_custnamelookup_subscribername.type("TEST - JANET");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						jsClick(btn_clccontactcreate_custnamelookup_subscriberlookup);
						waitForElement(lbl_clccontactcreate_custnamelookup_subscriber);
						jsClick(lbl_clccontactcreate_custnamelookup_subscriber);
						waitForElement(lbl_clccontactcreate_custnameadded);
						break;
						
		case "Adding another subscriber":jsClick(btn_clccontactcreate_custnamelookup);
								waitForElement(btn_clccontactcreate_custnamelookup_subscriberlookup);
								tbx_clccontactcreate_custnamelookup_subscribername.type("TEST%");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								jsClick(btn_clccontactcreate_custnamelookup_subscriberlookup);
								waitForElement(lbl_clccontactcreate_custnamelookup_subscriber);
								jsClick(lbl_clccontactcreate_custnamelookup_subscriber);
								waitForElement(lbl_clccontactcreate_custnameadded2);
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
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}
	
}
