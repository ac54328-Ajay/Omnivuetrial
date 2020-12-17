package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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

public class OVCreateLinkPage extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//############################################# ####################################### ####################################### //
	//#############################################   Circuit Link Sanity Validations ######################################//
	//############################################# ####################################### ####################################### //	
	
	//--------------------------------------  Create Link Action button & Tab validation ------------------------------------------//
	
	
				@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
				public WebElementFacade tab_currentlydisplayed ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createLink();']")
				public WebElementFacade btn_linkcreate_create ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetLink();']")
				public WebElementFacade btn_linkcreate_reset ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
				public List<WebElementFacade> lbl_allXapath;
				
				//--------------------------------------  Circuit Create General section Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='AERIALORBURIED']")
				public WebElementFacade ddl_Fiber_Link_createform_Aerial_or_Buried ;		
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='IS_OPTBEARER_REQUIRED']")
				public WebElementFacade ddl_Fiber_Link_createform_Create_Optical_Fiber;  
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General']")
				public WebElementFacade lbl_link_createform_Gerneralsection ; 
				

				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Name')]/../../following-sibling::span//input[@id='NAME']")
				public WebElementFacade tbx_link_createform_Gerneralsection_name ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Provision Status')]/../../following-sibling::span//select")
				public WebElementFacade ddl_link_createform_Gerneralsection_prvisstatus ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Functional Status')]/../../following-sibling::span//select")
				public WebElementFacade ddl_link_createform_Gerneralsection_funcstatus ; 			
				
				@FindBy(id="CABLEID")
				public WebElementFacade tbx_link_createform_parentcableid; 			
				
				@FindBy(id="STRANDID")
				public WebElementFacade tbx_link_createform_strandid ; 			
				
				@FindBy(id="AERIALORBURIED")
				public WebElementFacade ddl_link_createform_aerialrburied ; 			
				
				
				@FindBy(id="WIRECENTERCLLI")
				public WebElementFacade tbx_link_createform_wireclli ; 			
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				//--------------------------------------  Link Create Port Selection section Sanity Validations ------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']")
				public WebElementFacade lbl_Link_createform_Portsection ;		
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Port Selection']/parent::div//label[contains(text(),'Start Device Name')]/parent::span/parent::span/following-sibling::span//span[@ng-click='opendeviceLookUp(field.name)']/i")
				public WebElementFacade btn_link_createform_startdevicelookup ;			
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div//label[contains(text(),'End Device Name')]/parent::span/parent::span/following-sibling::span//span[@ng-click='opendeviceLookUp(field.name)']/i")
				public WebElementFacade btn_link_createform_enddevicelookup ;
				
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='lookUpDeviceDetails()']")
				public WebElementFacade btn_link_createform_devicenamelookup_lckicon ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invServiceDevLookUp.buildingClli']")
				public WebElementFacade tbx_link_createform_devicenamelookup_buildinclli ; 
				
				@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-show='showTableServiceDeviceLookUp']//div[@id='contenttablecreateDevLookUpId']//a[contains(@ng-click,'lookupGridSettings.selLukupValue')])[1]")
						public WebElementFacade lbl_link_createform_devicenamelookup_deviceresult1 ; 
				
				@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-show='showTableServiceDeviceLookUp']//div[@id='contenttablecreateDevLookUpId']//a[contains(@ng-click,'lookupGridSettings.selLukupValue')])[2]")
				public WebElementFacade lbl_link_createform_devicenamelookup_deviceresult2 ; 
							
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTPORT']/following-sibling::span/i")
				public WebElementFacade btn_link_createform_devicenamelookup_device_startportlookup ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDPORT']/following-sibling::span/i")
				public WebElementFacade btn_link_createform_devicenamelookup_device_endportlookup ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='servicePortlookUp()']")
				public WebElementFacade btn_link_createform_devicenamelookup_device_Deviceportlckupicon ; 
				
				@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-show='showTableServicePortLookUp']//div[@id='wrappercreateSerPortId']//a[contains(@ng-click,'lookupGridSettings.selLukupValue(')])[1]")
						public WebElementFacade lbl_link_createform_devicenamelookup_device_Deviceportresult ; 
				
				
				@FindBy(id="CIRCUIT2STARTLOCATION")
				public WebElementFacade tbx_link_createform_startdevice; 
				
				@FindBy(id="CIRCUIT2ENDLOCATION")
				public WebElementFacade tbx_link_createform_enddevice; 
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				//--------------------------------------  Link Create Fiber section Sanity Validations ------------------------------------------//
				
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Fiber']")
				public WebElementFacade lbl_Link_createform_Fiber ; 
		
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Wire Center Code')]/../../following-sibling::span//span/i")
				public WebElementFacade btn_link_createform_Fiber_wirecentercllilookup ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='lookUpCall()']")
				public WebElementFacade btn_link_createform_Fiber_wirecenterclli_lckicon ;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='buildingCLLI']")
				public WebElementFacade tbx_link_createform_Fiber_wirecenterclli_buildindclli ;
				
				
				@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//a[contains(@ng-click,'lookupGridSettingsWire.selectLookkUpValue')])[1]")
						public WebElementFacade lbl_link_createform_Fiber_wirecenterclli_buildindclliresult1 ;
				
				//------------------------------------------------------------------------------------------------------------------------------------//
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']")
				public WebElementFacade lbl_alertmsg ; 
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert']/button")
				public WebElementFacade btn_alertmsg_clsicon ; 
				
	
				public void Link_Action(String action) throws Throwable {
					switch(action){
					case "Create":jsClick(btn_linkcreate_create); waitForElement(lbl_alertmsg); break;
					}
					
				}
				
				public void verify_validation(String validation) throws Throwable {		
					String Message=null;
					switch(validation){
					case "Link was created successfully messgae should be displayed": waitForElement(lbl_alertmsg);
															Message=lbl_alertmsg.getText();
															Message = Message.toString().substring(1);		
															Message = Message.trim(); 
															if(!Message.contains("created successfully.")){
																slf4jLogger.error("Invalid message is displayed."+Message);
																throw new Error("Invalid message is displayed."+Message);
															}break;
															
					case "create a Link using SPLITTER and FDP devices":waitForElement(btn_linkcreate_create);
					
														tbx_link_createform_startdevice.type("SPLITTER-");
														waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
														jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
														
															Thread.sleep(1000);
															
														waitForElement(btn_link_createform_devicenamelookup_device_startportlookup);
														jsClick(btn_link_createform_devicenamelookup_device_startportlookup);
															waitForElement(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
															jsClick(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
															waitForElement(lbl_link_createform_devicenamelookup_device_Deviceportresult);
															jsClick(lbl_link_createform_devicenamelookup_device_Deviceportresult);
															
															tbx_link_createform_enddevice.type("FDP-");
															waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
															jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
															
																Thread.sleep(1000);
															waitForElement(btn_link_createform_devicenamelookup_device_endportlookup);
															jsClick(btn_link_createform_devicenamelookup_device_endportlookup);
																waitForElement(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
																jsClick(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
																waitForElement(lbl_link_createform_devicenamelookup_device_Deviceportresult);
																jsClick(lbl_link_createform_devicenamelookup_device_Deviceportresult);
																tbx_link_createform_parentcableid.type("2145");
																tbx_link_createform_strandid.type("78945");
																ddl_link_createform_aerialrburied.selectByVisibleText("Aerial");
																tbx_link_createform_wireclli.type("HNSONVFS");
																jsClick(btn_linkcreate_create);
															break;
						
					case "create a Link using FDP and SPLITTER devices": waitForElement(btn_linkcreate_create);
															tbx_link_createform_startdevice.type("FDP-");
															waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
															jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2STARTLOCATION']/following-sibling::ul//a)[1]")));
															
																Thread.sleep(1000);
																
															waitForElement(btn_link_createform_devicenamelookup_device_startportlookup);
															jsClick(btn_link_createform_devicenamelookup_device_startportlookup);
																waitForElement(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
																jsClick(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
																waitForElement(lbl_link_createform_devicenamelookup_device_Deviceportresult);
																jsClick(lbl_link_createform_devicenamelookup_device_Deviceportresult);
																
																tbx_link_createform_enddevice.type("SPLITTER-");
																waitForElement(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
																jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//input[@id='CIRCUIT2ENDLOCATION']/following-sibling::ul//a)[1]")));
																
																	Thread.sleep(1000);
																waitForElement(btn_link_createform_devicenamelookup_device_endportlookup);
																jsClick(btn_link_createform_devicenamelookup_device_endportlookup);
																	waitForElement(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
																	jsClick(btn_link_createform_devicenamelookup_device_Deviceportlckupicon);
																	waitForElement(lbl_link_createform_devicenamelookup_device_Deviceportresult);
																	jsClick(lbl_link_createform_devicenamelookup_device_Deviceportresult);
																	tbx_link_createform_parentcableid.type("2145");
																	tbx_link_createform_strandid.type("78945");
																	ddl_link_createform_aerialrburied.selectByVisibleText("Aerial");
																	tbx_link_createform_wireclli.type("HNSONVFS");
																	jsClick(btn_linkcreate_create);
																break;
					
					}
				}
	
	
	public void Link_create_Sanity_validation() throws Throwable{
		waitForElement(btn_linkcreate_create); Thread.sleep(3000);
		slf4jLogger.info("Create Link Sanity Check");
		
		if(!tab_currentlydisplayed.isCurrentlyVisible()){
			throw new Error("Create Link form is not displayed");
		}		
		  
		if(!btn_linkcreate_create.isCurrentlyVisible() && !btn_linkcreate_create.isCurrentlyEnabled()){
			throw new Error("Create button is not Visible & enable:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
		if(!btn_linkcreate_reset.isCurrentlyVisible() && !btn_linkcreate_reset.isCurrentlyEnabled()){
			throw new Error("Reset button is not Visible & enable:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
		
		if(!lbl_link_createform_Gerneralsection.isCurrentlyVisible()){
			throw new Error("General Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
		}
	
		List<WebElementFacade> link_create_attribute = lbl_allXapath;
		
		ArrayList<String> linkcreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<link_create_attribute.size();j++){
				linkcreate_Fieldattributelist.add(j, link_create_attribute.get(j).getText());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> List2compare_link_Fieldattributelist=new ArrayList<String>();
		
		slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
		
		switch(tab_currentlydisplayed.getText().replaceAll("\\s+$", "")){
		
		case "Create BackPlane Link":	List2compare_link_Fieldattributelist.add(0, "Link Type *");
										List2compare_link_Fieldattributelist.add(1, "Name *");
										List2compare_link_Fieldattributelist.add(2, "Provision Status");
										List2compare_link_Fieldattributelist.add(3, "Functional Status");
										List2compare_link_Fieldattributelist.add(4, "Start Device Name *");
										List2compare_link_Fieldattributelist.add(5, "End Device Name *");										
										 
										if(!lbl_Link_createform_Portsection.isCurrentlyVisible()){
											throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}												
										
										if(!btn_link_createform_startdevicelookup.isCurrentlyVisible() && !btn_link_createform_startdevicelookup.isCurrentlyEnabled()){
											throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_link_createform_enddevicelookup.isCurrentlyVisible() && !btn_link_createform_enddevicelookup.isCurrentlyEnabled()){
											throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}		
										
							
										break;	
										
										
		case "Create Fiber Link": 	List2compare_link_Fieldattributelist.add(0, "Link Type *");
									List2compare_link_Fieldattributelist.add(1, "Name *");
									List2compare_link_Fieldattributelist.add(2, "Provision Status");
									List2compare_link_Fieldattributelist.add(3, "Functional Status");
									List2compare_link_Fieldattributelist.add(4, "Start Device Name *");
									List2compare_link_Fieldattributelist.add(5, "End Device Name *");	
									List2compare_link_Fieldattributelist.add(6, "Parent Cable ID *");
									List2compare_link_Fieldattributelist.add(7, "Strand ID *");
									List2compare_link_Fieldattributelist.add(8, "Alias 1");
									List2compare_link_Fieldattributelist.add(9, "Aerial or Buried *");
									List2compare_link_Fieldattributelist.add(10, "Wire Center Code *");
									List2compare_link_Fieldattributelist.add(11, "Create Optical Fiber *");
									List2compare_link_Fieldattributelist.add(12, "Restricted Status");
									List2compare_link_Fieldattributelist.add(13, "Restricted Status Notes");								
									
									if(!lbl_Link_createform_Portsection.isCurrentlyVisible()){
										throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
									}												
									
									if(!btn_link_createform_startdevicelookup.isCurrentlyVisible() && !btn_link_createform_startdevicelookup.isCurrentlyEnabled()){
										throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
									}
									
									if(!btn_link_createform_enddevicelookup.isCurrentlyVisible() && !btn_link_createform_enddevicelookup.isCurrentlyEnabled()){
										throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
									}
									
									if(!lbl_Link_createform_Fiber.isCurrentlyVisible()){
										throw new Error("Fiber section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
									}	
									
									if(!btn_link_createform_Fiber_wirecentercllilookup.isCurrentlyVisible() && !btn_link_createform_Fiber_wirecentercllilookup.isCurrentlyEnabled()){
										throw new Error("Wire Center Code lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
									}
									
									
									
									waitFor(ddl_Fiber_Link_createform_Aerial_or_Buried);
									ddl_Fiber_Link_createform_Aerial_or_Buried.selectByIndex(2);
									waitFor(ddl_Fiber_Link_createform_Create_Optical_Fiber);
									ddl_Fiber_Link_createform_Create_Optical_Fiber.selectByIndex(1);
									
									break;
									
									
		case "Create StackRing Link": 	List2compare_link_Fieldattributelist.add(0, "Link Type *");
										List2compare_link_Fieldattributelist.add(1, "Name *");
										List2compare_link_Fieldattributelist.add(2, "Provision Status");
										List2compare_link_Fieldattributelist.add(3, "Functional Status");
										List2compare_link_Fieldattributelist.add(4, "Start Device Name *");
										List2compare_link_Fieldattributelist.add(5, "End Device Name *");										
										 
										if(!lbl_Link_createform_Portsection.isCurrentlyVisible()){
											throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}												
										
										if(!btn_link_createform_startdevicelookup.isCurrentlyVisible() && !btn_link_createform_startdevicelookup.isCurrentlyEnabled()){
											throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_link_createform_enddevicelookup.isCurrentlyVisible() && !btn_link_createform_enddevicelookup.isCurrentlyEnabled()){
											throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}		
										
								
										break;	
										
		case "Create Unshielded Twisted Par(UTP) Link": List2compare_link_Fieldattributelist.add(0, "Link Type *");
														List2compare_link_Fieldattributelist.add(1, "Name *");
														List2compare_link_Fieldattributelist.add(2, "Provision Status");
														List2compare_link_Fieldattributelist.add(3, "Functional Status");
														List2compare_link_Fieldattributelist.add(4, "Start Device Name *");
														List2compare_link_Fieldattributelist.add(5, "End Device Name *");										
														 
														if(!lbl_Link_createform_Portsection.isCurrentlyVisible()){
															throw new Error("Port Selection section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														}												
														
														if(!btn_link_createform_startdevicelookup.isCurrentlyVisible() && !btn_link_createform_startdevicelookup.isCurrentlyEnabled()){
															throw new Error("Start Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														}
														
														if(!btn_link_createform_enddevicelookup.isCurrentlyVisible() && !btn_link_createform_enddevicelookup.isCurrentlyEnabled()){
															throw new Error("End Device lookup button is not enabled:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
														}		break;					
									
								
		}
		
		for(int i=0;i<linkcreate_Fieldattributelist.size();i++){
			if(!linkcreate_Fieldattributelist.get(i).equals(List2compare_link_Fieldattributelist.get(i))){
				slf4jLogger.info("Linkcreate_Fieldattributelist="+linkcreate_Fieldattributelist.get(i));
				slf4jLogger.info("List2compare_Link_Fieldattributelist="+List2compare_link_Fieldattributelist.get(i)+" Not matching");
				throw new Error("Fields are not matching check:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
			}
		}
		waitFor(ddl_link_createform_Gerneralsection_prvisstatus);
		ddl_link_createform_Gerneralsection_prvisstatus.selectByIndex(2);
		waitFor(ddl_link_createform_Gerneralsection_funcstatus);
		ddl_link_createform_Gerneralsection_funcstatus.selectByIndex(2);
		
		slf4jLogger.info("Link Create field attributes are expected as per "+tab_currentlydisplayed.getText().replaceAll("\\s+$", "")+" Link type");
		
		
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
