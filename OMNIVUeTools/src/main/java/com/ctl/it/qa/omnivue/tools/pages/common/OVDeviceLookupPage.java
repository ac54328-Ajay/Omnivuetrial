package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
//import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVDeviceLookupPage extends OmniVuePage {
	
	//private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	OVLoginPage loginPage;
	OVSearchDevicePage searchdevicepage;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[15]/div[1]/div/span/input[@value='Edit']")
	public WebElementFacade btn_editInDeviceLookup;
	
	
	
	

	
	
	//23/9/2016
	@FindBy(xpath="//input[@value='Edit Device Details']")
	public WebElementFacade btn_EditDeviceDetailbtn;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_mainTab;
	
	//@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Edit']")
	@FindBy(xpath=".//*[@value='Edit']")
	public WebElementFacade btn_Editbtn;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[3]/ng-include/div[1]/div/div[2]/input[1]")
	public WebElementFacade btn_save;
	
	//@FindBy(xpath=".//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Save'][@value='Save']")
	@FindBy(xpath=".//*[@value='Save'][@value='Save']")
	public WebElementFacade btn_device_edit_save;
	
	//MOHIT
	@FindBy(xpath="//input[@class='cmdButton' and @value='Save']")
	public WebElementFacade btn_TDSave;
	//End of 9/23
	
	//*********************************************************************   Network Tab Validation **************************************************************//
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Networking Details')]")
	public WebElementFacade tab_serach_device_Networking_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit Device Details']")
	public WebElementFacade btn_serach_device_network_details_tab_edit_device_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[contains(@ng-click,'showErrorForSNMPFields')]")
	public WebElementFacade btn_device_Networkstab_save;
	
	
	
	//*****************************************************************************************************************************************************************//
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_editInDeviceLookup;
		//return null;
	}
	
	public void click_devicelookupeditbtn() throws Exception {
		
		jsClick(btn_editInDeviceLookup);
		
		Thread.sleep(5000);
		
	}
	
	
	
	public void click_EditbtnForTopology(String button) throws InterruptedException {
		jsClick(tab_mainTab);
		Thread.sleep(3000);
		if(button.equals("Edit")){
			jsClick(btn_Editbtn);
		}
		else if(button.equals("Save")){
			jsClick(btn_TDSave);
			}
		Thread.sleep(5000);
	}
	
	
		
		public void click_Editbtn(String button) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),100);				   
		  
			//tab_mainTab);
			Thread.sleep(3000);
			switch(button){
			case "Edit": jsClick(btn_Editbtn);
						 wait.until(ExpectedConditions.visibilityOf(btn_device_edit_save)); break;
			case "Save": jsClick(btn_device_edit_save);
						 wait.until(ExpectedConditions.visibilityOf(btn_Editbtn)); break;
			case "Delete": jsClick(searchdevicepage.btn_deletebutton);
			 			   wait.until(ExpectedConditions.visibilityOf(searchdevicepage.btn_Device_delete_Yes)); break;
			case "Network Tab-Edit":
							if(!btn_serach_device_network_details_tab_edit_device_details.isCurrentlyVisible()){
								jsClick(tab_serach_device_Networking_details);
							}
							waitForElement(btn_serach_device_network_details_tab_edit_device_details);
							jsClick(btn_serach_device_network_details_tab_edit_device_details);
							waitForElement(btn_device_Networkstab_save);break;
							
			case "Network Tab-Save": jsClick(btn_device_Networkstab_save);waitForElement(btn_serach_device_network_details_tab_edit_device_details);break;
			case  "Edit-Network details":waitForElement(btn_serach_device_network_details_tab_edit_device_details);
											jsClick(btn_serach_device_network_details_tab_edit_device_details);
											waitForElement(btn_device_Networkstab_save);break;
											
			case "Reserve Port":
			}				
			 
		}
		
		
		public WebElement waitForElement(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),3000);	
		  return wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
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
