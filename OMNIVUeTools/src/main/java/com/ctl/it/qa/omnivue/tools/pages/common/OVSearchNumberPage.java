package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

@SuppressWarnings("deprecation")
public class OVSearchNumberPage extends OmniVuePage {

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	
	//#############################################	Search Number Page 	#############################################################//
	
	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Number')]")
	public WebElementFacade tab_searchcontact_Number;
	
	
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditNumber();']")
		public WebElementFacade btn_SearchNumber_edit; 
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='openDeleteNumber();']")
		public WebElementFacade btn_SearchNumber_delete; 
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveNumber();']")
		public WebElementFacade btn_SearchNumber_Edit_Save; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='NAME']")
		public WebElementFacade tbx_SearchNumber_Edit_Name; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS1']")
		public WebElementFacade tbx_SearchNumber_Edit_alias1; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS2']")
		public WebElementFacade tbx_SearchNumber_Edit_alias2; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='DIMNUMBER2PROVISIONSTATUS']")
		public WebElementFacade ddl_SearchNumber_Edit_Provisionstatus; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//textarea[@id='DESCRIPTION']")
		public WebElementFacade tbx_SearchNumber_Edit_Note; 
		
		@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Object']/following-sibling::span//a")
		public WebElementFacade lbl_SearchNumber_object; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@ng-show='showAlert']")
		public WebElementFacade lbl_alertmsg;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@ng-show='showAlert']/button")
		public WebElementFacade btn_alertmsg_closeicon;
		
		
		//------------------------------------------------------------------------------------------------------------------------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Audit Log')]")
		public WebElementFacade tab_serach_device_Audit_logs; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getOVAuditLogs()']")
		public WebElementFacade btn_serach_device_Omnivue_Audit_log_tab_getlog; 
		
		
		public void Number_screenActions(String action) throws Throwable {		
			switch(action){				
			case "Edit":waitForElement(btn_SearchNumber_edit);jsClick(btn_SearchNumber_edit); waitForElement(btn_SearchNumber_Edit_Save); break;
			case "Name, Alias, Provision Status and Note field values": tbx_SearchNumber_Edit_Name.type("987");tbx_SearchNumber_Edit_alias1.type("Update Test Automation");tbx_SearchNumber_Edit_alias2.type("Update Test Automation");
			ddl_SearchNumber_Edit_Provisionstatus.selectByVisibleText("Available");tbx_SearchNumber_Edit_Note.type("Update Test Automation");break;
			
			case "Save":waitForElement(btn_SearchNumber_Edit_Save);jsClick(btn_SearchNumber_Edit_Save); waitForElement(lbl_alertmsg); break;
			case "Delete": waitForElement(btn_SearchNumber_delete);jsClick(btn_SearchNumber_delete); getDriver().switchTo().alert().accept();
															waitForElement(lbl_alertmsg); try {
																Thread.sleep(3000);
															} catch (InterruptedException e) {
																// TODO Auto-generated catch block
																e.printStackTrace();
															} break;
															
			case "Audit Tab": waitForElement(tab_serach_device_Audit_logs);jsClick(tab_serach_device_Audit_logs);
										waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog);break;
										
			case "Delete-Number":Number_screenActions("Delete");
												while(isElementVisible(By.xpath(".//li[@class='ng-isolate-scope active']/preceding-sibling::li[1]//tab-heading/a"))){
													jsClick(getDriver().findElement(By.xpath(".//li[@class='ng-isolate-scope active']/preceding-sibling::li[1]//tab-heading")));
													Thread.sleep(1000);
													if(btn_SearchNumber_delete.isCurrentlyVisible()){
														Number_screenActions("Delete");
													}
													jsClick(getDriver().findElement(By.xpath(".//li[@class='ng-isolate-scope active']//tab-heading/a")));	Thread.sleep(1000);
												}break;
				}
		}
		
		public void verify_validation(String validation) throws Throwable {		
			String Message;
			switch(validation){
			case "Delete log is registered in Audit log for Number":waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog); jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);Thread.sleep(2000);
			
														waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
														
														if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete'])[1]"))){
															slf4jLogger.error("DELETE logs is not captured under the Audit logs section in Device page");
															throw new Error("DELETE logs is not captured under the Audit logs section in Device page");
														}
														if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete']/../..//div[3])[1]"))){
															slf4jLogger.error("DELETE logs is not captured under the Audit logs section in Device page");
															throw new Error("DELETE logs is not captured under the Audit logs section in Device page");
														}
														if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Delete']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
															slf4jLogger.error("DELETE logs is not captured under the Audit logs section in Device page");
															throw new Error("DELETE logs is not captured under the Audit logs section in Device page");
														}jsClick(tab_searchcontact_Number);
														break;
			
			case "Update log is registered in Audit log for Number":waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog); jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);Thread.sleep(2000);
			
																	waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
																	
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update'])[1]"))){
																		slf4jLogger.error("Update logs is not captured under the Audit logs section in Device page");
																		throw new Error("Update logs is not captured under the Audit logs section in Device page");
																	}
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update']/../..//div[3])[1]"))){
																		slf4jLogger.error("Update logs is not captured under the Audit logs section in Device page");
																		throw new Error("Update logs is not captured under the Audit logs section in Device page");
																	}
																	if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Update']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
																		slf4jLogger.error("Update logs is not captured under the Audit logs section in Device page");
																		throw new Error("Update logs is not captured under the Audit logs section in Device page");
																	}jsClick(tab_searchcontact_Number);
																	break;
			case "Create log is registered in Audit log for Number":waitForElement(btn_serach_device_Omnivue_Audit_log_tab_getlog); jsClick(btn_serach_device_Omnivue_Audit_log_tab_getlog);Thread.sleep(2000);
			
							waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[text()='Action Type']")));
							
							if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create'])[1]"))){
								slf4jLogger.error("CREATE logs is not captured under the Audit logs section in Device page");
								throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
							}
							if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']/../..//div[3])[1]"))){
								slf4jLogger.error("CREATE logs is not captured under the Audit logs section in Device page");
								throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
							}
							if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Create']/../..//div[3])[1]")).getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
								slf4jLogger.error("CREATE logs is not captured under the Audit logs section in Device page");
								throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
							}jsClick(tab_searchcontact_Number);
							break;
			
			case "Number updated successfully message is displayed on clicking on Save button in Number page": Message = lbl_alertmsg.getText();
																											Message = Message.toString().substring(1);		
																											Message = Message.trim(); 
																											if(!Message.equals("Number updated successfully")){
																												throw new Error("Invalid message on Save is displayed."+Message);
																											}jsClick(btn_alertmsg_closeicon); break;
																											
			case "Number deleted successfully message is displayed on clicking on Delete button in Number page": Message = lbl_alertmsg.getText();
																												Message = Message.toString().substring(1);		
																												Message = Message.trim(); 
																												if(!Message.equals("Number deleted successfully")){
																													throw new Error("Invalid message on Delete is displayed."+Message);
																												}jsClick(btn_alertmsg_closeicon); break;
																												
			case "DSL OVC in Related Tab is matching with Associated Inventory section in Number page": 
				if(lbl_SearchNumber_object.isCurrentlyVisible()){
					if(!getDriver().findElement(By.xpath(".//*[@id='right-content']//div[@class='tab-pane ng-scope active']//*[starts-with(@id,'contenttablejqxGrid')]//*[text()='"+lbl_SearchNumber_object.getText().trim()+"']")).isDisplayed()){
						throw new Error("Service is not matching with assoicated inventory section");
				}break;
				
				
			}
																												
				
			}
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
