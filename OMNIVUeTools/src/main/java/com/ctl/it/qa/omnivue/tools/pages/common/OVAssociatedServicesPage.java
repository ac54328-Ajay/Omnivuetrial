package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
//import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.annotations.Steps;

public class OVAssociatedServicesPage extends OmniVuePage {
	//private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	
	@FindBy(xpath="//div[text()='77/L1XX/785391//CTQF']/parent::div/preceding-sibling::div//input")
	public WebElementFacade lnk_deviceLookup;
	
	@FindBy(xpath=".//*[@class='refreshicon glyphicon glyphicon-refresh' and @ng-click='refreshDetails();']")
	public WebElementFacade btn_refresh;
	
	@FindBy(xpath="//div[text()='77/L1XX/785391//CTQF']")
	public WebElementFacade before_servicename;
	
	@FindBy(xpath="//div[text()='77/L1XX/785391//ABCD']")
	public WebElementFacade after_servicename;

	@FindBy(xpath="//div[text()='77/L1XX/785391//ABCD']/parent::div/preceding-sibling::div//input")
	public WebElementFacade lnk_newDeviceLookup ;
	
	@FindBy(xpath=".//input[@value='Edit']")
	public WebElementFacade btn_newServiceEdit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='addCTagPoolRange()']")
	public WebElementFacade btn_ctagadd;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//i[@ng-click='savePoolRange()']")
	public WebElementFacade btn_ctagsave;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Cancel']")
	public WebElementFacade btn_ctagcancel;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxt_field1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxt_field2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@id='start_0']")
	public WebElementFacade tbx_editctag_fld1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@id='end_0']")
	public WebElementFacade tbx_editctag_fld2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@ng-show='showCEVLANAlert']")
	public WebElementFacade lbl_alertmsgctag;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@ng-show='showCEVLANAlert']")
	public WebElementFacade lbl_succmsgctag;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@ng-show='showCEVLANAlert']/button")
	public WebElementFacade btn_alertmsgctag_clsicon;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@ng-show='showCEVLANAlert']/button")
	public WebElementFacade btn_succmsgctag;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@id='right-content']/div/div[2]/div/div/div[2]/div/div/div/div[@class='ng-scope']/div[2]/label")
	public WebElementFacade Ctag_index;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//*[@id='end_0']/parent::label/following-sibling::label//button[@ng-click='deletePoolRange(ind)']")
	public WebElementFacade btn_ctag_delete;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='cancelCEVLANFlag()']")
	public WebElementFacade btn_ctag_cancel;
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return lnk_deviceLookup;
	}
	
	public void click_devicelookup() throws Exception {
		jsClick(lnk_deviceLookup);
		Thread.sleep(15000);		
	}
	
	public void click_Newdevicelookup() throws Exception {
		jsClick(lnk_newDeviceLookup);
		Thread.sleep(15000);		
	}
	
	public void click_refreshbtn() throws Exception {
		jsClick(btn_refresh);
		Thread.sleep(30000);
	}
	
	public String verify_after_servicename() {
		String servicenameval = after_servicename.getText();
		return servicenameval;
	}
	
	public String verify_before_servicename() throws Exception {
		Thread.sleep(10000);
		String servicenameval = before_servicename.getText();
		return servicenameval;
	}
	
	public void Revertbck_name() throws Exception{
		//Newservicelookup_link);
		Thread.sleep(20000);
		jsClick(btn_newServiceEdit);
		Thread.sleep(5000);
	}
	
	/*
	public void ctag_write(String ctag_range)throws Exception{
		btn_ctagadd);
		Thread.sleep(20000);
		/*enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
		enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
		Thread.sleep(1000);
		btn_ctagsave);
		String Alertmsg=Alerttxt_txtbx.getText();
		if(Alertmsg=="Start and End values should be in range from 1 to 4095.")
		{
			slf4jLogger.info("Enter valid text between range 1 to 4095");
			btn_ctagcancel);
		}else if(Alertmsg=="Please enter a numeric value.") {
			slf4jLogger.info("Enter valid text between range 1 to 4095");
			btn_ctagcancel);
		}
		
		switch(ctag_range){
		
		case "Less than 1": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							//enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							//slf4jLogger.info(enduser.get_data_for_page(actvtnpage).getContainer(ctag_range));
			
			//ctagtxt_field1.sendKeys("0");
							//ctagtxt_field2.sendKeys("1");
							Thread.sleep(10000);
							btn_ctagsave);
							if(Alerttxt_txtbx.getText()=="Start and End values should be in range from 1 to 4095.")
							{
								slf4jLogger.info("Enter valid text between range 1 to 4095");
							}
							btn_ctagcancel);
							Thread.sleep(10000);
							break;
							
		case "Alphanumeric values": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									btn_ctagsave);
									 Thread.sleep(1000);
									 if(Alerttxt_txtbx.getText()=="Please enter a numeric value.")
										{
											slf4jLogger.info("Enter valid text between range 1 to 4095");
										}
									 btn_ctagcancel);
									 Thread.sleep(5000);
										break;
										
		case "Greater than 4095": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									btn_ctagsave);
									 if(Alerttxt_txtbx.getText()=="Start and End values should be in range from 1 to 4095.")
										{
											slf4jLogger.info("Enter valid text between range 1 to 4095");
										}
									 btn_ctagcancel);
									 Thread.sleep(5000);
										break;
							
		case "Single Range 1-4095": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							btn_ctagsave);
							Thread.sleep(10000);
							enduser.Revertback_name_Ctag();
							break;	
							
		case "Multiple Range between 1-4095": 	enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(10000);
							btn_ctagsave);
							searchdevicepage.tab_orders);
							Thread.sleep(3000);
							searchdevicepage.tab_ctag);
							Thread.sleep(3000);
							btn_ctagadd);
							Thread.sleep(10000);
							ctagtxt_field1.sendKeys("101");	// Work on it
							ctagtxt_field2.sendKeys("2045");// Work on it
							Thread.sleep(1000);
							btn_ctagsave);
							Thread.sleep(10000);
							break;
		
		case "Single Number Range": enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
									enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
									Thread.sleep(1000);
									btn_ctagsave);
									Thread.sleep(10000);
									enduser.Revertback_name_Ctag();
									break;
							
		case "Modify the Ctag Range":ctag_write("Multiple Range between 1-4095");
							editctag_fld1.clear();
							editctag_fld2.clear();
							Thread.sleep(1000);
							enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							btn_ctagsave);
							Thread.sleep(10000);
							enduser.Revertback_name_Ctag();
							break;
							
		case "Overlapping the CTag range": ctag_write("Multiple Range between 1-4095");
							btn_ctagadd);
							Thread.sleep(5000);
							enduser.fill_fields_from("OVActivationPage","US31642-TC20884",ctag_range);
							enduser.get_container_from_xml("OVActivationPage","US31642-TC20884",ctag_range);
							Thread.sleep(1000);
							btn_ctagsave);
							if(Alerttxt_txtbx.getText()=="Start value or End value is overlapping with an existing pool range.")
							{
								slf4jLogger.info("Overlapping CTag Range");
							}
						 btn_ctagcancel);
						 Thread.sleep(5000);
							break;
		} 	
	}*/

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
