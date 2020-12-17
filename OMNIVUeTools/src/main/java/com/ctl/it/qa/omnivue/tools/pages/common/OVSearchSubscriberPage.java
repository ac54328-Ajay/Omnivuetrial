package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

public class OVSearchSubscriberPage extends OmniVuePage {
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath = "//li[@class='ng-isolate-scope active']//tab-heading/a")
	public WebElementFacade tab_activetab_clsicon;
	
	
	//********************************Search Subcriber********************************************//	
		@FindBy(xpath = ".//*[@ng-model='searchParam.subscriberFullName']")
		public WebElementFacade tbx_subscribername;
		
		@FindBy(xpath = "//*[@ng-repeat='row in viewRows']//label[contains(text(),'Subscriber Full Name')]/../../following-sibling::span//label")
		public WebElementFacade label_Subscriberfullname;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//ul[@class='nav nav-tabs']//tab-heading[contains(text(),'Subscriber Details')]")
		public WebElementFacade tab_Subscriberview_SubscriberDetails;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//ul[@class='nav nav-tabs']//tab-heading[contains(text(),'Audit Logs')]")
		public WebElementFacade tab_Subscriberview_Auditlogs;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@value='Get Logs']")
		public WebElementFacade btn_Subscriberview_Auditlogs_getlogs;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
		public WebElementFacade btn_SubscriberEdit;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Delete']")
		public WebElementFacade btn_SubscriberDelete;
		
		@FindBy(xpath="//div[@ng-show='!isEditMode']//button[@value='Swap Subscriber']")
		public WebElementFacade btn_SwapSubscriber;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Circuits']")
		public WebElementFacade tab_Circuits;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Contacts']")
		public WebElementFacade tab_Contacts;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Locations']")
		public WebElementFacade tab_Locations;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
		public WebElementFacade tab_Services;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Tasks']")
		public WebElementFacade tab_Tasks;

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Subscribers']")
		public WebElementFacade tab_Subscriber;		
		
		@FindBy(xpath="//*[@class='main-tab ng-isolate-scope']//li[2][@class='ng-isolate-scope active']")
		public WebElementFacade tab_currenttab;
		
		@FindBy(xpath="//*[@class='main-tab ng-isolate-scope']//li[1]")
		public WebElementFacade tab_currenttab2;
		
		@FindBy(xpath=".//*[@id='right-content']//ul[@role='tablist']/li")
		public List<WebElementFacade> Relatedtab_Count;
		
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Subscriber ID']/../../following-sibling::span//label")
		public WebElementFacade lbl_Subscriberview_SubscriberID;
		
		
		//####################		Edit Subscriber Screen 	#############################//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save']")
		public WebElementFacade btn_SubscriberEdit_Save;
		
		
		  @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='subscriberName']")
		public WebElementFacade tbx_SubscriberEdit_Name;
		
		  @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='subscriberSubType']")
		public WebElementFacade ddl_SubscriberEdit_subtype;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//textarea[@id='subscriberNote']")
		public WebElementFacade tbx_SubscriberEdit_Notes;
		
		
		  @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(@class,'ng-binding alert alert-success')]")
	    public WebElementFacade lbl_device_successmsg; 
		
		  @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[contains(@class,'ng-binding alert alert-success')]/button")
		    public WebElementFacade btn_successmsg_clsicon; 
		  		  
		  
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert-danger')]")
			public WebElementFacade lbl_alert_message_no_data_related_tabs;
		    
		//####################		Circuit Related Tab search validation	#############################//
		  
			@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
			public WebElementFacade btn_RT_view;
			
			@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditCircuit();']")
			public WebElementFacade btn_circuitview_edit;
			
			@FindBy(xpath = "//*[@ng-click='onClickTab(tab)' and contains(text(),'Circuit Search Results')]")
			public WebElementFacade tab_circuit_advance_search_result;
			
			@FindBy(xpath=".//*[contains(@class,'main-tab')]//li[@class='ng-isolate-scope active']/preceding-sibling::li[1]//tab-heading")
			public WebElementFacade tab_activescreen_prvioussibling;
			
			
			
			//#################################################################################################################################//	
			
			
			
			
		
		public void Enter_Subscriber_name(String name) throws Throwable{
	    	 tbx_subscribername.sendKeys(name);
	     }
		
		
		public void Sanity_SubscriberSolr_Search() throws Throwable{
	    	 waitForElement(btn_SubscriberEdit); Thread.sleep(3000);
	    	 
	    	 String tabname = tab_currenttab2.getText();
	    	 String Subscriber_fullname = label_Subscriberfullname.getText();
	    	 slf4jLogger.info("Left Side validation");
	    	 //******************************Tab and name compare***************************************
	    	 System.out.println(tabname);
	    	 System.out.println(Subscriber_fullname);
	    	 if(!tabname.contains(Subscriber_fullname)){
	    		 throw new Error("Tabname is not matching with Subscriber fullname"); 
	    	 }else
	    		 System.out.println("Tabname is matching with Subscriber fullname");
		}
	     
	     public void Sanity_SubscriberView_validations() throws Throwable{
	    	 waitForElement(btn_SubscriberEdit); Thread.sleep(3000);
	    	 
	    	 String tabname = tab_currenttab.getText();
	    	 String Subscriber_fullname = label_Subscriberfullname.getText();
	    	 slf4jLogger.info("Left Side validation");
	    	 //******************************Tab and name compare***************************************
	    	 System.out.println(tabname);
	    	 System.out.println(Subscriber_fullname);
	    	 if(!tabname.contains(Subscriber_fullname)){
	    		 throw new Error("Tabname is not matching with Subscriber fullname"); 
	    	 }else
	    		 System.out.println("Tabname is matching with Subscriber fullname");
	        //*********************************Sub tab's Validation*************************************
	       
	         if(!tab_Subscriberview_SubscriberDetails.isCurrentlyVisible() && !tab_Subscriberview_SubscriberDetails.isCurrentlyEnabled()){
					throw new Error("Subscriber Details Tab is missing in the Device view page");
			  }
		     if(!tab_Subscriberview_Auditlogs.isCurrentlyVisible() && !tab_Subscriberview_Auditlogs.isCurrentlyEnabled()){
					throw new Error("AuditLogs Tab is missing in the Device view page");
		      }
	       //*************************Buttons Validation************************************************
	         if(!btn_SubscriberEdit.isCurrentlyVisible() && !btn_SubscriberEdit.isCurrentlyEnabled()){
	 			throw new Error("Edit button is missing in the Subscriber view page");
	 		}
	 		 if(!btn_SubscriberDelete.isCurrentlyVisible() && !btn_SubscriberDelete.isCurrentlyEnabled()){
	 			throw new Error("Delete button is missing in the Subcriber view page");
	 		}
	 		if(!btn_SwapSubscriber.isCurrentlyVisible() && btn_SwapSubscriber.isCurrentlyEnabled()){
	 			throw new Error("Delete button is missing in the Subcriber view page");
	 		}
	 		//################################ Related Tabs Validations in Device view ############################################//
			  
	 		 slf4jLogger.info("Related tab validation");
	 				if(!tab_Circuits.isCurrentlyVisible() && !tab_Circuits.isCurrentlyEnabled()){
	 					throw new Error("Services Related Tab is missing in the Device view page");
	 				}
	 				
	 				if(!tab_Contacts.isCurrentlyVisible() && !tab_Contacts.isCurrentlyEnabled()){
	 					throw new Error("Activation Related Tab is missing in the Device view page");
	 				}
	 				
	 				if(!tab_Locations.isCurrentlyVisible() && !tab_Locations.isCurrentlyEnabled() ){
	 					throw new Error("Orders Related Tab is missing in the Device view page");
	 				}
	 				
	 				if(!tab_Services.isCurrentlyVisible() && !tab_Services.isCurrentlyEnabled() ){
	 					throw new Error("BAM Report Related tab is missing in the Device view page");
	 				}
	 				
	 				if(!tab_Tasks.isCurrentlyVisible() && !tab_Tasks.isCurrentlyEnabled()){
	 					throw new Error("Circuit Related Tab is missing in the Device view page");
	 				}
	 				
	 				int count = Relatedtab_Count.size();
	 			    if(!(count==5)){
	 				throw new Error("Related Tabs are not match to 5");
	 			}
	     }
	     
	     
	     public void Action_subscriberpage(String action) throws Throwable {
				switch(action){
				case "Edit button":waitForElement(btn_SubscriberEdit);jsClick(btn_SubscriberEdit); Thread.sleep(2000); waitForElement(btn_SubscriberEdit_Save); break;
				case "Audit log Tab": waitForElement(tab_Subscriberview_Auditlogs); jsClick(tab_Subscriberview_Auditlogs);waitForElement(btn_Subscriberview_Auditlogs_getlogs); break;
				case "Save button":waitForElement(btn_SubscriberEdit_Save);jsClick(btn_SubscriberEdit_Save);waitForElement(btn_SubscriberEdit);break;
				case "Delete button":waitForElement(btn_SubscriberDelete);jsClick(btn_SubscriberDelete); Thread.sleep(2000);getDriver().switchTo().alert().accept(); Thread.sleep(2000);break;
				}
				
			}
	     
	     public void verify_validation(String validation) throws Throwable {		
	    	 String Message=null; int i=0;
				switch(validation){
				case "Service data is been displayed in the Services Related Tab":Thread.sleep(5000);
																				if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																					waitForElement(btn_RT_view);
																					
																					if(!btn_RT_view.isCurrentlyVisible()){
																						slf4jLogger.debug("Service Table not displayed please check the data");
																						throw new Error("Service Table not displayed please check the data");
																					}					
																				}
																				
																				break;
				case "Contact data is been displayed in the Contacts Related Tab":Thread.sleep(5000);
																				if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																					waitForElement(btn_RT_view);
																					
																					if(!btn_RT_view.isCurrentlyVisible()){
																						slf4jLogger.debug("Contact Table not displayed please check the data");
																						throw new Error("Contact Table not displayed please check the data");
																					}
																					
																				}break;
				case "launch the subscriber by clicking on the view icon in the related tab":Thread.sleep(5000);
				
																				if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																					
																					waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail')])[1]")));
																					
																					if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail')])[1]"))){
																						slf4jLogger.debug("Subscriber data is not displayed please check the data");
																						throw new Error("Subscriber data is not displayed please check the data");
																					}
																					jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail')])[1]")));
																					Thread.sleep(2000);
																				}else {
																					slf4jLogger.debug("Subscriber data is not displayed please check the data");
																					throw new Error("Subscriber data is not displayed please check the data");
																				}
																				break;					
					
					
				case "Location data is been displayed in the Locations Related Tab":Thread.sleep(5000);
																				if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																					waitForElement(btn_RT_view);
																					
																					if(!btn_RT_view.isCurrentlyVisible()){
																						slf4jLogger.debug("Location Table not displayed please check the data");
																						throw new Error("Location Table not displayed please check the data");
																					}
																					
																				} else {
																					slf4jLogger.debug("Location Table not displayed please check the data");
																					throw new Error("Location Table not displayed please check the data");
																				}						
																					
																					
																					break;
				case "Task data is been displayed in the Task Related Tab":Thread.sleep(5000);
											if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
												
												waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail')])[1]")));
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetail')])[1]"))){
													slf4jLogger.debug("Task Table not displayed please check the data");
													throw new Error("Task Table not displayed please check the data");
												}
											}
											break;
				
				case "Circuit details should be displayed in the Subscriber Screen":
																
																Thread.sleep(3000);
																
																if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																	waitForElement(btn_RT_view);
																	i=5;
																	Message=tab_activescreen_prvioussibling.getText().trim();
																	while(i!=0){
																	if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
																		break;
																	
																	}
																	jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='previous']")));
																	
																	i--;
																	
																	
																}
																	if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
																		slf4jLogger.debug("Circuit data not displayed please check the data");
																		throw new Error("Circuit data not displayed please check the data");
																	}
																	
																}break;
					
				
				
				case "search for circuit having subscriber data": waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")));
																								i=0;
																	while(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input"))){
																		
																		jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'row"+i+"jqxGrid')]/div[1]/div/input")));
																		waitForElement(btn_circuitview_edit);
																		
																		jsClick(tab_Subscriber); Thread.sleep(8000);
																		
																		
																		if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
																			
																			if(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Subscriber'])[1]"))){
																				jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Subscriber'])[1]")));
																				waitForElement(btn_SubscriberEdit);							
																				break;
																			}
																		}
																		
																		
																		jsClick(tab_activetab_clsicon);
																		
																		
																		
																		i++;
																		
																		
																	}			
					
					
																	break;
				case "Subscriber ID is auto generated when a subscriber is created": waitForElement(btn_SubscriberEdit);
																						if(!lbl_Subscriberview_SubscriberID.isCurrentlyVisible()){
																							slf4jLogger.info("Subscriber ID is not auto generated when subscriber is created");
																							throw new Error("Subscriber ID is not auto generated when subscriber is created");
																						}
																						
																						break;
				case "Audit log is captured on Delete action in Subscriber screen": waitForElement(btn_Subscriberview_Auditlogs_getlogs);jsClick(btn_Subscriberview_Auditlogs_getlogs); Thread.sleep(2000);
																						waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
																						if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[.='Delete' and @class='jqx-grid-cell-middle-align'])[1]"))){
																							slf4jLogger.info("Delete Log is not captured for subscribers");
																							throw new Error("Delete Log is not captured for subscribers");
																						}
																						
																						if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[.='Delete' and @class='jqx-grid-cell-middle-align']/../../div[3]/div)[1]")).getText().trim().contains(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
																							slf4jLogger.info("User Delete Log is not captured for subscribers");
																							throw new Error("User Delete Log is not captured for subscribers");
																						}
																						jsClick(tab_Subscriberview_SubscriberDetails);break;
				case "Subscriber was successly deleted message should be displayed in Subscriber screen": waitForElement(lbl_device_successmsg);
																											Message = lbl_device_successmsg.getText();
																											Message = Message.toString().substring(1);
																											
																													Message = Message.trim(); 
																												if(!Message.contains("Subscriber Removed successfully.")){
																													throw new Error("Invalid message is displayed as:"+Message);
																												}jsClick(btn_successmsg_clsicon);break;
				case "Audit log is captured on Update action in Subscriber screen":waitForElement(btn_Subscriberview_Auditlogs_getlogs);jsClick(btn_Subscriberview_Auditlogs_getlogs); Thread.sleep(2000);
																			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
																			if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[.='Update'and @class='jqx-grid-cell-middle-align'])[1]"))){
																				slf4jLogger.info("Delete Log is not captured for subscribers");
																				throw new Error("Delete Log is not captured for subscribers");
																			}
																			
																			if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[.='Update'and @class='jqx-grid-cell-middle-align']/../../div[3]/div)[1]")).getText().trim().contains(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
																				slf4jLogger.info("User Delete Log is not captured for subscribers");
																				throw new Error("User Delete Log is not captured for subscribers");
																			}
																			jsClick(tab_Subscriberview_SubscriberDetails);break;
					
				case "success message should be displayed in Subscriber screen": waitForElement(lbl_device_successmsg);
																				Message = lbl_device_successmsg.getText();
																				Message = Message.toString().substring(1);
																				
																						Message = Message.trim(); 
																					if(!Message.contains("Subscriber saved successfully.")){
																						throw new Error("Invalid message is displayed as:"+Message);
																					}jsClick(btn_successmsg_clsicon);break;
																					
				case "modify the fields in Subscriber Screen": waitForElement(btn_SubscriberEdit_Save);
				
															tbx_SubscriberEdit_Name.type("Modify Subscriber Name");
															ddl_SubscriberEdit_subtype.selectByVisibleText("RETAIL");
															tbx_SubscriberEdit_Notes.type("Modify Automation Test");
															
																break;
					
				case  "Audit log is captured on Create action in Subscriber screen":waitForElement(btn_Subscriberview_Auditlogs_getlogs);jsClick(btn_Subscriberview_Auditlogs_getlogs); Thread.sleep(2000);
																					waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
																					if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[.='Create'and @class='jqx-grid-cell-middle-align']"))){
																						slf4jLogger.info("Create Log is not captured for subscribers");
																						throw new Error("Create Log is not captured for subscribers");
																					}
																					
																					if(!getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[.='Create'and @class='jqx-grid-cell-middle-align']/../../div[3]/div")).getText().trim().contains(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
																						slf4jLogger.info("User Create Log is not captured for subscribers");
																						throw new Error("User Create Log is not captured for subscribers");
																					}
																					jsClick(tab_Subscriberview_SubscriberDetails);
																					
																					
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
			    WebDriverWait wait = new WebDriverWait(getDriver(),3000);				   
			    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
				
			    return element;
			}	
}
